/**
 * Hook.java
 * ====================================
 * This is the representation of a beyonic's web hook
 * object.
 * @author vladimirfomene
 */
package org.mifos.beyonicIntegration.service.BeyonicService.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Hook {

    private Long id;

    private String created;

    private String updated;

    private String event;

    private String target;

    private Long user;
}

