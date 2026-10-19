package bo.app;

/* JADX INFO: loaded from: classes.dex */
public final class k3 implements r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f21417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d2 f21418b;

    public k3(String str, d2 originalRequest) {
        kotlin.jvm.internal.i.e(originalRequest, "originalRequest");
        this.f21417a = str;
        this.f21418b = originalRequest;
    }

    @Override // bo.app.r2
    public d2 a() {
        return this.f21418b;
    }

    @Override // bo.app.r2
    public String c() {
        return this.f21417a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k3)) {
            return false;
        }
        k3 k3Var = (k3) obj;
        return kotlin.jvm.internal.i.a(c(), k3Var.c()) && kotlin.jvm.internal.i.a(a(), k3Var.a());
    }

    public int hashCode() {
        return a().hashCode() + ((c() == null ? 0 : c().hashCode()) * 31);
    }

    public String toString() {
        return "InvalidApiKeyError(errorMessage=" + c() + ", originalRequest=" + a() + ')';
    }
}
