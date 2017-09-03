/**
 * IncomingPaymentController.java
 * ===========================================
 * This controller receives outgoing transactions from the payment gateway
 * and then calls the beyonic service to send a payment request to the beyonic
 * api.
 * @author Vladimir Fomene
 */

package org.mifos.beyonicIntegration.controller;


import org.mifos.beyonicIntegration.service.BeyonicService.domain.Metadata;
import org.mifos.beyonicIntegration.util.OutboundRequest;
import org.mifos.beyonicIntegration.service.BeyonicService.domain.PaymentRequest;
import org.mifos.beyonicIntegration.service.BeyonicService.domain.PaymentResponse;
import org.mifos.beyonicIntegration.service.BeyonicService.PaymentService;
import org.mifos.beyonicIntegration.service.MifosGatewayService.domain.Status;
import org.mifos.beyonicIntegration.util.StatusCategory;
import org.mifos.beyonicIntegration.util.TransactionStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;

@RestController
public class IncomingPaymentController {

    private PaymentRequest paymentRequest;

    private PaymentResponse paymentResponse;

    @Autowired
    private PaymentService paymentService;

    @RequestMapping(value = "outbound/payments", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Status> makePayment(@RequestBody OutboundRequest req){
        System.out.println(req.toString());

        Status paymentStatus = null;

        //Initialize metadata for the beyonic's payment object
        Metadata metadata = new Metadata();
        metadata.setRequestId(req.getId());

        //Build beyonic Payment request object
        paymentRequest = new PaymentRequest();
        paymentRequest.setPhonenumber(req.getDestinationRef());
        paymentRequest.setCurrency(null);
        paymentRequest.setPayment_type("money");
        paymentRequest.setAmount(req.getAmount());
        paymentRequest.setAccount(null);
        paymentRequest.setDescription("Testing payment with beyonic api");
        paymentRequest.setCallback_url("https://39b38b43.ngrok.io/outbound/payments/callback");
        paymentRequest.setCurrency("BXC");
        paymentRequest.setMetadata(metadata);

        System.out.println(paymentRequest.toString());

        //Send request to beyonic's api
        try {
            paymentResponse = paymentService.sendPayment(paymentRequest);
            System.out.println(paymentResponse.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

        //notify the client with the reception status of the request.
        if(paymentResponse != null){
            paymentStatus = new Status();
            paymentStatus.setCode(String.valueOf(TransactionStatus.REQUEST_RECEPTION_SUCCESS_CODE));
            paymentStatus.setDescription(TransactionStatus.REQUEST_RECEPTION_SUCCESS);
            paymentStatus.setStatusCategory(StatusCategory.MMP_CATEGORY);
        }


        return new ResponseEntity<>(paymentStatus, HttpStatus.OK);

    }

    @RequestMapping(value = "inbound/payments/status", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Status> receiveCallbackStatus(@RequestBody Status inboundStatus){
        Status callbackStatus = null;
        System.out.println(inboundStatus.toString());
        if(inboundStatus != null){
            callbackStatus = new Status();
            callbackStatus.setCode(String.valueOf(TransactionStatus.INBOUND_STATUS_RECEIVED_CODE));
            callbackStatus.setDescription(TransactionStatus.INBOUND_STATUS_RECEIVED);
            callbackStatus.setStatusCategory(StatusCategory.MMP_CATEGORY);
        }
        return new ResponseEntity<>(callbackStatus, HttpStatus.OK);
    }
}
