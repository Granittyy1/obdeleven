package com.voltasit.obdeleven.network;

import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: NetworkException.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class NetworkException extends Exception {
    private final int code;
    private final String description;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkException(int i10, String description) {
        super("Network exception. Code: " + i10 + ". Description: " + description);
        i.e(description, "description");
        this.code = i10;
        this.description = description;
    }

    public final int a() {
        return this.code;
    }
}
