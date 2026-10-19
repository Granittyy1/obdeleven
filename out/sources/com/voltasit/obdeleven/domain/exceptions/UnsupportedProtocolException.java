package com.voltasit.obdeleven.domain.exceptions;

import B7.b;
import com.voltasit.obdeleven.domain.models.ProtocolType;

/* JADX INFO: compiled from: UnsupportedProtocolException.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class UnsupportedProtocolException extends Throwable {
    public UnsupportedProtocolException() {
        super(b.c("Unsupported function for ", ProtocolType.TP16_KWP1281.a()));
    }
}
