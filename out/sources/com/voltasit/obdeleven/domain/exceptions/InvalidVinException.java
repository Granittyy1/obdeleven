package com.voltasit.obdeleven.domain.exceptions;

import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: InvalidVinException.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class InvalidVinException extends Throwable {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidVinException(String vin) {
        super("Invalid vin: ".concat(vin));
        i.e(vin, "vin");
    }
}
