package com.voltasit.obdeleven.domain.exceptions;

import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: LoginExceptions.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class AccountLockedDueToMultipleAttemptsException extends Throwable {
    private final String time;

    public AccountLockedDueToMultipleAttemptsException(String time) {
        i.e(time, "time");
        this.time = time;
    }

    public final String a() {
        return this.time;
    }
}
