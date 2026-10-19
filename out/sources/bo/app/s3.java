package bo.app;

/* JADX INFO: loaded from: classes.dex */
public final class s3 implements r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d2 f21914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l2.a f21916c;

    public s3(d2 originalRequest, String str, l2.a connectionResult) {
        kotlin.jvm.internal.i.e(originalRequest, "originalRequest");
        kotlin.jvm.internal.i.e(connectionResult, "connectionResult");
        this.f21914a = originalRequest;
        this.f21915b = str;
        this.f21916c = connectionResult;
    }

    @Override // bo.app.r2
    public d2 a() {
        return this.f21914a;
    }

    @Override // bo.app.r2
    public String c() {
        return this.f21915b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s3)) {
            return false;
        }
        s3 s3Var = (s3) obj;
        return kotlin.jvm.internal.i.a(a(), s3Var.a()) && kotlin.jvm.internal.i.a(c(), s3Var.c()) && kotlin.jvm.internal.i.a(this.f21916c, s3Var.f21916c);
    }

    public int hashCode() {
        return this.f21916c.hashCode() + (((a().hashCode() * 31) + (c() == null ? 0 : c().hashCode())) * 31);
    }

    public String toString() {
        return "NetworkCommunicationFailureResponseError(originalRequest=" + a() + ", errorMessage=" + c() + ", connectionResult=" + this.f21916c + ')';
    }
}
