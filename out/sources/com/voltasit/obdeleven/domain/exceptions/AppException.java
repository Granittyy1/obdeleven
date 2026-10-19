package com.voltasit.obdeleven.domain.exceptions;

import J4.i;

/* JADX INFO: compiled from: AppException.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class AppException extends Exception {
    private final int code;

    public AppException(int i10) {
        super(i.b(i10, "OCA exception: "));
        this.code = i10;
    }

    public final int a() {
        return this.code;
    }
}
