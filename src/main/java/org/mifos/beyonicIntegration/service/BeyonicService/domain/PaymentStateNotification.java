/**
 * PaymentStateNotification.java
 * ===================================================
 * This class represents the payment notification sent by beyonic
 * @author vladimirfomene
 */

package org.mifos.beyonicIntegration.service.BeyonicService.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentStateNotification {

    @JsonProperty("hook")
    private Hook hook;

    @JsonProperty("data")
    private PaymentData data;

    public Hook getHook() {
        return hook;
    }

    public void setHook(Hook hook) {
        this.hook = hook;
    }

    public PaymentData getData() {
        return data;
    }

    public void setData(PaymentData data) {
        this.data = data;
    }
}

