package com.voltasit.obdeleven.domain.exceptions;

import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: NotFoundException.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class NotFoundException extends Throwable {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotFoundException(String what) {
        super(what.concat(" was not found"));
        i.e(what, "what");
    }
}
