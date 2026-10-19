package com.voltasit.obdeleven.domain.exceptions;

import J4.i;

/* JADX INFO: compiled from: NegativeResponseCodeException.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class NegativeResponseCodeException extends Exception {
    private final int code;

    public NegativeResponseCodeException(int i10) {
        super(i.b(i10, "Received NRC: "));
        this.code = i10;
    }

    public final int a() {
        return this.code;
    }
}
