package org.mifos.beyonicIntegration.service.MifosGatewayService;



import org.mifos.beyonicIntegration.service.MifosGatewayService.api.GatewayInterface;
import org.mifos.beyonicIntegration.service.MifosGatewayService.domain.InboundRequest;
import org.mifos.beyonicIntegration.service.MifosGatewayService.domain.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;

@Service
public class GatewayService {

    private GatewayInterface gatewayInterface;

    @Autowired
    private GatewayProperties gatewayProperties;

    /**
     * Create gateway interface class from GatewayInterface
     * interface using retrofit
     * @return GatewayInterface
     */
    private GatewayInterface createGatewayService(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(gatewayProperties.getBaseUrl())
                .addConverterFactory(JacksonConverterFactory.create())
                .build();

        return retrofit.create(GatewayInterface.class);
    }


    /**
     * This methods is in charge of sending inbound request to the payment
     * gateway for processing.
     * @param request
     * @param mfiName
     * @return
     * @throws IOException
     */
    public Status sendInboundRequest(InboundRequest request, String mfiName) throws IOException {

        Status responseStatus = null;

        gatewayInterface = createGatewayService();

        Call<Status> statusCall = gatewayInterface.sendInboundRequest(request, mfiName);

        Response<Status> response = statusCall.execute();
        System.out.println(response.errorBody());

        if(response.isSuccessful()){
            responseStatus = response.body();
        }

        return responseStatus;
    }

    /**
     * This class send the status of an outbound transaction back to the payment
     * gateway.
     * @param transactStatus transactions status
     * @param reqID outboundrequestId
     * @return status reception message from the payment gateway
     * @throws IOException
     */
    public String sendOutboundTransactionStatus(Status transactStatus, Long reqID) throws IOException{

        String responseStatus = "";

        gatewayInterface = createGatewayService();

        Call<String> statusCall = gatewayInterface.sendOutboundTransactionStatus(transactStatus, reqID);

        Response<String> response = statusCall.execute();

        if(response.isSuccessful()){
            responseStatus = response.body();
        }

        return responseStatus;
    }
}
