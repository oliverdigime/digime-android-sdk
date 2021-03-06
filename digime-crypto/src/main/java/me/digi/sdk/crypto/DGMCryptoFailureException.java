/*
 * Copyright (c) 2017 digi.me. All rights reserved.
 */

package me.digi.sdk.crypto;

/**
 * Checked exception thrown when something wrong happens during working with vault key
 */
public class DGMCryptoFailureException extends Exception {
    private static final long serialVersionUID = 384562580764146474L;

    private final FailureCause failureCause;

    DGMCryptoFailureException(FailureCause failureCause, Throwable e) {
        super(failureCause.message(), e);
        this.failureCause = failureCause;
    }

    public DGMCryptoFailureException(FailureCause failureCause) {
        super(failureCause.message());
        this.failureCause = failureCause;
    }

    public FailureCause cause() {
        return failureCause;
    }
}
