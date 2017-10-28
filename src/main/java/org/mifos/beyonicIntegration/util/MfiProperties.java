/**
 * MfiProperties.java
 * ========================================
 * This class has properties for a particular tenant
 * @author vladimirfomene
 */

package org.mifos.beyonicIntegration.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MfiProperties {

    @Value("${mfi.phoneNumber}")
    private String phoneNumber;

    @Value("${mfi.name}")
    private String mfiName;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMfiName() {
        return mfiName;
    }

    public void setMfiName(String mfiName) {
        this.mfiName = mfiName;
    }
}
