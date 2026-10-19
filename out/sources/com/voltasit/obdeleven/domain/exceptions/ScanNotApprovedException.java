package com.voltasit.obdeleven.domain.exceptions;

/* JADX INFO: compiled from: ScanNotApprovedException.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ScanNotApprovedException extends Exception {
    static {
        new ScanNotApprovedException();
    }

    private ScanNotApprovedException() {
        super("Scan was not approved by user");
    }
}
