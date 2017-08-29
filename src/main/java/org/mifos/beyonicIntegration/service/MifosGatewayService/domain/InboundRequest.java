package org.mifos.beyonicIntegration.service.MifosGatewayService.domain;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class InboundRequest {

    //Creation of TransactionType type
    public enum TransactionType{
        VOLUNTARY_SAVINGS, LOAN_REPAYMENT, FIXED_DEPOSIT
    }


    private Long id;

    private TransactionType transactType;

    private Long mmpId;

    private Long mfiId;

    private String sourceRef;

    private String destinationRef;

    private String fineractAccNo;

    private Long fineractClientId;

    private Double amount;

    private String transactionReason;

    private String externalSystId;

    private String comments;

    private Timestamp requestedDtm;

    private String requestIpAddress;

    private Integer inboundStatusId;

    private Timestamp inboundStatusDtm;

    private String paymentMethod;

    private String paymentMethodType;

}
