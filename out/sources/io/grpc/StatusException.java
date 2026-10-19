package io.grpc;

/* JADX INFO: loaded from: classes3.dex */
public class StatusException extends Exception {
    private static final long serialVersionUID = -660954903976144640L;
    private final boolean fillInStackTrace;
    private final Status status;
    private final m trailers;

    public StatusException(Status status) {
        super(Status.c(status), status.f36910c);
        this.status = status;
        this.trailers = null;
        this.fillInStackTrace = true;
        fillInStackTrace();
    }

    public final Status a() {
        return this.status;
    }

    public final m b() {
        return this.trailers;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this.fillInStackTrace ? super.fillInStackTrace() : this;
    }
}
