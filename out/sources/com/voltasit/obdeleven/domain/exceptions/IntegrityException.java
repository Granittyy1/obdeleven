package com.voltasit.obdeleven.domain.exceptions;

import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: IntegrityException.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class IntegrityException extends Exception {

    /* JADX INFO: compiled from: IntegrityException.kt */
    public static final class InvalidChallenge extends IntegrityException {
    }

    /* JADX INFO: compiled from: IntegrityException.kt */
    public static final class NotAvailable extends IntegrityException {
    }

    /* JADX INFO: compiled from: IntegrityException.kt */
    public static final class PlatformError extends IntegrityException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PlatformError(String message) {
            super(message, null);
            i.e(message, "message");
        }
    }
}
