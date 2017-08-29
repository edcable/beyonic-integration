package org.mifos.beyonicIntegration.service.BeyonicService.domain;


import lombok.Data;

@Data
public class PaymentRequest {

    private String phonenumber;

    private String currency;

    private String payment_type;

    private Double amount;

    private String account;

    private String description;

    private String callback_url;

    private Metadata metadata;

    @Override
    public String toString() {
        return "PaymentRequest{" +
                "phonenumber='" + phonenumber + '\'' +
                ", currency='" + currency + '\'' +
                ", payment_type='" + payment_type + '\'' +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                ", callback_url='" + callback_url + '\'' +
                '}';
    }
}
