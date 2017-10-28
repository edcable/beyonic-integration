package org.mifos.beyonicIntegration.service.MifosGatewayService.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.sql.Timestamp;

@JsonIgnoreProperties(ignoreUnknown=true)
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TransactionType getTransactType() {
        return transactType;
    }

    public void setTransactType(TransactionType transactType) {
        this.transactType = transactType;
    }

    public Long getMmpId() {
        return mmpId;
    }

    public void setMmpId(Long mmpId) {
        this.mmpId = mmpId;
    }

    public Long getMfiId() {
        return mfiId;
    }

    public void setMfiId(Long mfiId) {
        this.mfiId = mfiId;
    }

    public String getSourceRef() {
        return sourceRef;
    }

    public void setSourceRef(String sourceRef) {
        this.sourceRef = sourceRef;
    }

    public String getDestinationRef() {
        return destinationRef;
    }

    public void setDestinationRef(String destinationRef) {
        this.destinationRef = destinationRef;
    }

    public String getFineractAccNo() {
        return fineractAccNo;
    }

    public void setFineractAccNo(String fineractAccNo) {
        this.fineractAccNo = fineractAccNo;
    }

    public Long getFineractClientId() {
        return fineractClientId;
    }

    public void setFineractClientId(Long fineractClientId) {
        this.fineractClientId = fineractClientId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getTransactionReason() {
        return transactionReason;
    }

    public void setTransactionReason(String transactionReason) {
        this.transactionReason = transactionReason;
    }

    public String getExternalSystId() {
        return externalSystId;
    }

    public void setExternalSystId(String externalSystId) {
        this.externalSystId = externalSystId;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Timestamp getRequestedDtm() {
        return requestedDtm;
    }

    public void setRequestedDtm(Timestamp requestedDtm) {
        this.requestedDtm = requestedDtm;
    }

    public String getRequestIpAddress() {
        return requestIpAddress;
    }

    public void setRequestIpAddress(String requestIpAddress) {
        this.requestIpAddress = requestIpAddress;
    }

    public Integer getInboundStatusId() {
        return inboundStatusId;
    }

    public void setInboundStatusId(Integer inboundStatusId) {
        this.inboundStatusId = inboundStatusId;
    }

    public Timestamp getInboundStatusDtm() {
        return inboundStatusDtm;
    }

    public void setInboundStatusDtm(Timestamp inboundStatusDtm) {
        this.inboundStatusDtm = inboundStatusDtm;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentMethodType() {
        return paymentMethodType;
    }

    public void setPaymentMethodType(String paymentMethodType) {
        this.paymentMethodType = paymentMethodType;
    }
}
