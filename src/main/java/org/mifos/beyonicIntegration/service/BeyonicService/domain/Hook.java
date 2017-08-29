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
import org.joda.time.DateTime;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Hook {

    private Long id;

    private DateTime created;

    private DateTime updated;

    private String event;

    private String target;

    private Long user;
}

