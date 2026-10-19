package io.ktor.client.call;

/* JADX INFO: compiled from: HttpClientCall.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ReceivePipelineException extends IllegalStateException {
    private final Throwable cause;
    private final p023ba.a info;
    private final a request;

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
    }
}
