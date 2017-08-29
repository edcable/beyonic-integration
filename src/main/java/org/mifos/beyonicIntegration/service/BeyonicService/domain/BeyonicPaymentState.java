/**
 * BeyonicPaymentState.java
 * ====================================
 * A representation of all beyonic's payment states.
 * @author vladimirfomene
 */

package org.mifos.beyonicIntegration.service.BeyonicService.domain;

public class BeyonicPaymentState {

    public static String PROCESSED = "processed";

    public static String NEW = "new";

    public static String APPROVAL_NEEDED = "approval_needed";

    public static String APPROVAL_REQUESTED = "approval_requested";

    public static String APPROVED = "approved";

    public static String REJECTED = "rejected";

    public static String SCHEDULED = "scheduled";

    public static String PROCESSED_WITH_ERRORS = "processed_with_errors";

    public static String CANCELLED = "cancelled";
}
