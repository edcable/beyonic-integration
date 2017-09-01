/**
 * GatewayProperties.java
 * ===================================
 * This class represents the properties of payment
 * gateway.
 * @author vladimirfomene
 */
package org.mifos.beyonicIntegration.service.MifosGatewayService;


import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class GatewayProperties {

    @Value("${gateway.baseUrl}")
    private String baseUrl;

}
