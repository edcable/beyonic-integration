/**
 * MfiProperties.java
 * ========================================
 * This class has properties for a particular tenant
 * @author vladimirfomene
 */

package org.mifos.beyonicIntegration.util;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class MfiProperties {

    @Value("${mfi.phoneNumber}")
    private String phoneNumber;

    @Value("${mfi.name}")
    private String mfiName;
}
