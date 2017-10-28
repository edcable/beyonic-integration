/**
 * GatewayProperties.java
 * ===================================
 * This class represents the properties of payment
 * gateway.
 * @author vladimirfomene
 */
package org.mifos.beyonicIntegration.service.MifosGatewayService;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GatewayProperties {

    @Value("${gateway.baseUrl}")
    private String baseUrl;

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }
}
