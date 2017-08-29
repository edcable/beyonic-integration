
package org.mifos.beyonicIntegration.service.BeyonicService.api;


import org.mifos.beyonicIntegration.service.BeyonicService.domain.PaymentRequest;
import org.mifos.beyonicIntegration.service.BeyonicService.domain.PaymentResponse;
import retrofit2.Call;
import retrofit2.http.*;

public interface PaymentInterface {

    @Headers("Authorization: Token 71650dd01ae0fd4e3efdfc9764f9d12308b7244f")
    @POST("payments")
    Call<PaymentResponse> sendPayment(@Body PaymentRequest request);
}

