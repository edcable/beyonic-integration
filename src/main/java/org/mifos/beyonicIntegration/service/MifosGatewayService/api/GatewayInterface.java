package org.mifos.beyonicIntegration.service.MifosGatewayService.api;


import org.mifos.beyonicIntegration.service.MifosGatewayService.domain.InboundRequest;
import org.mifos.beyonicIntegration.service.MifosGatewayService.domain.Status;
import retrofit2.Call;
import retrofit2.http.*;

public interface GatewayInterface {

    @POST("inbound/requests")
    Call<Status> sendInboundRequest(@Body InboundRequest request, @Query("tenant") String mfiName);

    @POST("outbound/payments/status")
    Call<String> sendOutboundTransactionStatus(@Body Status transactStatus, @Query("requestId")Long requestID);
}
