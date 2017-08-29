/**
 * OutboundRequest.java
 * ===========================================
 * This class has represents the outboundRequest object which is
 * received from the payment gateway.
 * @author vladimirfomene
 */
package org.mifos.beyonicIntegration.util;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import java.sql.Timestamp;

@Data
@JsonIgnoreProperties(ignoreUnknown=true)
public class OutboundRequest {

    public enum TransactionType{
        DISBURSEMENT, WITHDRAWAL, REVERSAL
    }

    private Long id;

    private TransactionType transactType;


    private String paymentMethod;


    private String paymentMethodType;

    private Long mmpId;

    private Long mfiId;

    private String sourceRef;

    private String destinationRef;

    private String fineractAccNo;

    private Long fineractClientId;

    private double amount;

    private String transactionReason;

    private String externalSystId;

    private String comments;

    private Timestamp requestedDtm;

    private String requestIpAddress;

    private Integer outboundStatusId;

    private Timestamp outboundStatusDtm;

    private Integer reverseStatusId;

    private Timestamp reverseStatusIdDtm;


}
