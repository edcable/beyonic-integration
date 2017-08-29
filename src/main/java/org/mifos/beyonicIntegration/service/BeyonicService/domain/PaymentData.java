/**
 * PaymentData.java
 * ===================================
 * This is a representation of the data object
 * sends in the payment notification object.
 */

package org.mifos.beyonicIntegration.service.BeyonicService.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.sql.Timestamp;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentData {

    private Long id;

    private Long organization;

    private Double amount;

    private String currency;

    private String payment_type;

    private Metadata metadata;

    private String description;

    private String[] phone_nos;

    private String state;

    private String last_error;

    private String rejected_reason;

    private Long rejected_by;

    private Timestamp rejected_time;

    private String cancelled_reason;

    private Long cancelled_by;

    private Timestamp cancelled_time;

    private Timestamp created;

    private Long author;

    private Timestamp modified;

    private String updated_by;

    private Timestamp start_date;
}

