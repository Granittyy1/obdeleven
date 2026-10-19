package io.ktor.client.network.sockets;

import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: TimeoutExceptions.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SocketTimeoutException extends java.net.SocketTimeoutException {
    private final Throwable cause;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SocketTimeoutException(String message, Throwable th) {
        super(message);
        i.e(message, "message");
        this.cause = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
    }
}
