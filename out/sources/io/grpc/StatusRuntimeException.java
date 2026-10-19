package io.grpc;

/* JADX INFO: loaded from: classes3.dex */
public class StatusRuntimeException extends RuntimeException {
    private static final long serialVersionUID = 1950934672280720624L;
    private final boolean fillInStackTrace;
    private final Status status;
    private final m trailers;

    public StatusRuntimeException(Status status, m mVar) {
        super(Status.c(status), status.f36910c);
        this.status = status;
        this.trailers = mVar;
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
