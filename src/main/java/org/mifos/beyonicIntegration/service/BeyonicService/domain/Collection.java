/**
 * Collection.java
 * ================================
 * This class represents the beyonic's collection object.
 * @author vladimirfomene
 */

package org.mifos.beyonicIntegration.service.BeyonicService.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Collection {
    private Long id;

    private Long remote_transaction_id;

    private Long organization;

    private Double amount;

    private String currency;

    private String phonenumber;

    private String payment_date;

    private String reference;

    private BeyonicPaymentState status;

    private String created;

    private String author;

    private String modified;

    private String updated_by;

    private String collection_request;
}
