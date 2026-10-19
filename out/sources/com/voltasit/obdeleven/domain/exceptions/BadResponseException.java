package com.voltasit.obdeleven.domain.exceptions;

import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: BadResponseException.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class BadResponseException extends Throwable {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadResponseException(String response) {
        super("Bad response: ".concat(response));
        i.e(response, "response");
    }
}
