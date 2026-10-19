package com.voltasit.obdeleven.domain.exceptions;

/* JADX INFO: compiled from: LoginExceptions.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TooManySessionsException extends Exception {
    private final int sessionCount;

    public TooManySessionsException(int i10) {
        this.sessionCount = i10;
    }

    public final int a() {
        return this.sessionCount;
    }
}
