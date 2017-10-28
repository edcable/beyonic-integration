/**
 * PaymentData.java
 * ===================================
 * This is a representation of the data object
 * sends in the payment notification object.
 */

package org.mifos.beyonicIntegration.service.BeyonicService.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.sql.Timestamp;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrganization() {
        return organization;
    }

    public void setOrganization(Long organization) {
        this.organization = organization;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getPayment_type() {
        return payment_type;
    }

    public void setPayment_type(String payment_type) {
        this.payment_type = payment_type;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getPhone_nos() {
        return phone_nos;
    }

    public void setPhone_nos(String[] phone_nos) {
        this.phone_nos = phone_nos;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLast_error() {
        return last_error;
    }

    public void setLast_error(String last_error) {
        this.last_error = last_error;
    }

    public String getRejected_reason() {
        return rejected_reason;
    }

    public void setRejected_reason(String rejected_reason) {
        this.rejected_reason = rejected_reason;
    }

    public Long getRejected_by() {
        return rejected_by;
    }

    public void setRejected_by(Long rejected_by) {
        this.rejected_by = rejected_by;
    }

    public Timestamp getRejected_time() {
        return rejected_time;
    }

    public void setRejected_time(Timestamp rejected_time) {
        this.rejected_time = rejected_time;
    }

    public String getCancelled_reason() {
        return cancelled_reason;
    }

    public void setCancelled_reason(String cancelled_reason) {
        this.cancelled_reason = cancelled_reason;
    }

    public Long getCancelled_by() {
        return cancelled_by;
    }

    public void setCancelled_by(Long cancelled_by) {
        this.cancelled_by = cancelled_by;
    }

    public Timestamp getCancelled_time() {
        return cancelled_time;
    }

    public void setCancelled_time(Timestamp cancelled_time) {
        this.cancelled_time = cancelled_time;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public Long getAuthor() {
        return author;
    }

    public void setAuthor(Long author) {
        this.author = author;
    }

    public Timestamp getModified() {
        return modified;
    }

    public void setModified(Timestamp modified) {
        this.modified = modified;
    }

    public String getUpdated_by() {
        return updated_by;
    }

    public void setUpdated_by(String updated_by) {
        this.updated_by = updated_by;
    }

    public Timestamp getStart_date() {
        return start_date;
    }

    public void setStart_date(Timestamp start_date) {
        this.start_date = start_date;
    }
}

