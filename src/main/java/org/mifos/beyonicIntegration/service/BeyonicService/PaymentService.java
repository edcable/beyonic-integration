/**
 * PaymentService.java
 * ============================================
 * This class send the incoming transactions to beyonic's
 * payment api.
 * @author Vladimirfomene
 */

package org.mifos.beyonicIntegration.service.BeyonicService;

import org.mifos.beyonicIntegration.service.BeyonicService.domain.PaymentRequest;
import org.mifos.beyonicIntegration.service.BeyonicService.domain.PaymentResponse;
import org.mifos.beyonicIntegration.service.BeyonicService.domain.PaymentStateNotification;
import org.mifos.beyonicIntegration.service.BeyonicService.api.PaymentInterface;
import org.mifos.beyonicIntegration.service.MifosGatewayService.GatewayService;
import org.mifos.beyonicIntegration.service.MifosGatewayService.domain.Status;
import org.mifos.beyonicIntegration.util.StatusCategory;
import org.mifos.beyonicIntegration.util.TransactionStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;
import java.io.IOException;

@RestController
@Service
public class PaymentService {

    private PaymentInterface paymentInterface;

    @Autowired
    private GatewayService gatewayService;

    private Status paymentStatus = new Status();

    /**
     * Create payment interface class from PaymentInterface
     * interface using retrofit
     * @return PaymentInterface
     */
    private PaymentInterface createPaymentService(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BeyonicProperties.API_ENDPOINT)
                .addConverterFactory(JacksonConverterFactory.create())
                .build();

        return retrofit.create(PaymentInterface.class);
    }

    /**
     * Send a payment request to beyonic's payment api using
     * retrofit
     * @param request payment request object that will be sent to beyonic api in the request body.
     * @return payment response from beyonic.
     * @throws IOException
     */
    public PaymentResponse sendPayment(PaymentRequest request) throws IOException{

        PaymentResponse beyonicResp = null;

        paymentInterface = createPaymentService();

        Call<PaymentResponse> paymentResponseCall = paymentInterface.sendPayment(request);

        Response<PaymentResponse> response = paymentResponseCall.execute();

        if(response.isSuccessful()){
            beyonicResp = response.body();
        }

        //System.out.println(response.errorBody().string());

        return beyonicResp;
    }


    /**
     * This callback receives payment status notification from beyonic and
     * sends them to the payment gateway for processing.
     * @param notif beyonicPayment Notification object.
     * @return returns a json response to the notification sender to acknowledge receipt.
     */
    @RequestMapping(value = "outbound/payments/callback", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> receivePaymentNotification(@RequestBody PaymentStateNotification notif){

        System.out.println(notif.getData().toString());
        if(notif.getData().getState().equalsIgnoreCase("processed")){
            //Create success status
            paymentStatus.setCode(String.valueOf(TransactionStatus.MMP_TRANSACTION_SUCCESS_CODE));
            paymentStatus.setDescription(TransactionStatus.MMP_TRANSACTION_SUCCESS);
            paymentStatus.setStatusCategory(StatusCategory.MMP_CATEGORY);
        }else{
            //create failure status
            paymentStatus.setCode(String.valueOf(TransactionStatus.MMP_TRANSACTION_FAILURE_CODE));
            paymentStatus.setDescription(TransactionStatus.MMP_TRANSACTION_FAILURE);
            paymentStatus.setStatusCategory(StatusCategory.MMP_CATEGORY);
        }

        //Print out status.
        System.out.println(paymentStatus.toString());

        //Send the payment status to the payment gateway.
        try {
            gatewayService.sendOutboundTransactionStatus(paymentStatus, notif.getData().getMetadata().getRequestId());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new ResponseEntity<String>("Payment Notification Received", HttpStatus.OK);
    }
}
