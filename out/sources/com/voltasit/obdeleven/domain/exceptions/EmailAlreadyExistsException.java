package com.voltasit.obdeleven.domain.exceptions;

import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: EmailAlreadyExistsException.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class EmailAlreadyExistsException extends Throwable {
    private final String email;

    public EmailAlreadyExistsException(String email) {
        i.e(email, "email");
        this.email = email;
    }

    public final String a() {
        return this.email;
    }
}
