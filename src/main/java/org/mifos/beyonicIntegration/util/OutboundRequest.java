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

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
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

    public Integer getOutboundStatusId() {
        return outboundStatusId;
    }

    public void setOutboundStatusId(Integer outboundStatusId) {
        this.outboundStatusId = outboundStatusId;
    }

    public Timestamp getOutboundStatusDtm() {
        return outboundStatusDtm;
    }

    public void setOutboundStatusDtm(Timestamp outboundStatusDtm) {
        this.outboundStatusDtm = outboundStatusDtm;
    }

    public Integer getReverseStatusId() {
        return reverseStatusId;
    }

    public void setReverseStatusId(Integer reverseStatusId) {
        this.reverseStatusId = reverseStatusId;
    }

    public Timestamp getReverseStatusIdDtm() {
        return reverseStatusIdDtm;
    }

    public void setReverseStatusIdDtm(Timestamp reverseStatusIdDtm) {
        this.reverseStatusIdDtm = reverseStatusIdDtm;
    }
}
