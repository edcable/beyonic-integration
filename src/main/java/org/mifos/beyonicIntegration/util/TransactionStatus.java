/**
 * TransactionStatus.java
 * ======================================
 * This class represents transaction status used both by the
 * paymentGateway and our integration.
 */

package org.mifos.beyonicIntegration.util;

public class TransactionStatus {

    public static final String REQUEST_RECEPTION_SUCCESS = "Request was received";

    public static final Integer REQUEST_RECEPTION_SUCCESS_CODE = 2100;

    public static final String MMP_TRANSACTION_SUCCESS = "Funds is at destination";

    public static final Integer MMP_TRANSACTION_SUCCESS_CODE = 2200;

    public static final String MMP_TRANSACTION_FAILURE = "Funds did not get to client";

    public static final Integer MMP_TRANSACTION_FAILURE_CODE = 4100;

    public static final String INBOUND_STATUS_RECEIVED = "Inbound status received.";

    public static final Integer INBOUND_STATUS_RECEIVED_CODE = 2700;

}
