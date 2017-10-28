package org.mifos.beyonicIntegration.service.BeyonicService.domain;


public class PaymentRequest {

    private String phonenumber;

    private String currency;

    private String payment_type;

    private Double amount;

    private String account;

    private String description;

    private String callback_url;

    private Metadata metadata;

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getPayment_type() {
        return payment_type;
    }

    public void setPayment_type(String payment_type) {
        this.payment_type = payment_type;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCallback_url() {
        return callback_url;
    }

    public void setCallback_url(String callback_url) {
        this.callback_url = callback_url;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

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
