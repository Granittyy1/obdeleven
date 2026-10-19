package io.ktor.utils.io.core;

import kotlin.jvm.internal.i;
import p005a4.q;

/* JADX INFO: compiled from: Buffer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class InsufficientSpaceException extends Exception {
    public InsufficientSpaceException() {
        this("Not enough free space");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsufficientSpaceException(String message) {
        super(message);
        i.e(message, "message");
    }

    public InsufficientSpaceException(String str, int i10, int i11) {
        StringBuilder sb2 = new StringBuilder("Not enough free space to write ");
        sb2.append(str);
        sb2.append(" of ");
        sb2.append(i10);
        sb2.append(" bytes, available ");
        this(q.c(sb2, i11, " bytes."));
    }
}
