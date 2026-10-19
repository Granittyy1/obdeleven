package io.ktor.client.call;

import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: HttpClientCall.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DoubleReceiveException extends IllegalStateException {
    private final String message;

    public DoubleReceiveException(a call) {
        i.e(call, "call");
        this.message = "Response already received: " + call;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }
}
