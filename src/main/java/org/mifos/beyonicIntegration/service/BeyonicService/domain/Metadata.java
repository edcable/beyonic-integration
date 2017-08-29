/**
 * Metadata.java
 * ================================
 * This is a representation on beyonic's metadata object
 * used as part of the payment request object.
 * @author Vladimirfomene
 */


package org.mifos.beyonicIntegration.service.BeyonicService.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Metadata {
    private Long requestId;
}

