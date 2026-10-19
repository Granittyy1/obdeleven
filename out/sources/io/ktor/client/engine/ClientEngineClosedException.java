package io.ktor.client.engine;

/* JADX INFO: compiled from: HttpClientEngineBase.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ClientEngineClosedException extends IllegalStateException {
    private final Throwable cause;

    public ClientEngineClosedException() {
        this(0);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
    }

    public ClientEngineClosedException(int i10) {
        super("Client already closed");
        this.cause = null;
    }
}
