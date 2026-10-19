package bo.app;

/* JADX INFO: renamed from: bo.app.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1465f implements r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d2 f20943b;

    public C1465f(String str, d2 originalRequest) {
        kotlin.jvm.internal.i.e(originalRequest, "originalRequest");
        this.f20942a = str;
        this.f20943b = originalRequest;
    }

    @Override // bo.app.r2
    public d2 a() {
        return this.f20943b;
    }

    @Override // bo.app.r2
    public String c() {
        return this.f20942a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1465f)) {
            return false;
        }
        C1465f c1465f = (C1465f) obj;
        return kotlin.jvm.internal.i.a(c(), c1465f.c()) && kotlin.jvm.internal.i.a(a(), c1465f.a());
    }

    public int hashCode() {
        return a().hashCode() + ((c() == null ? 0 : c().hashCode()) * 31);
    }

    public String toString() {
        return "BasicResponseError(errorMessage=" + c() + ", originalRequest=" + a() + ')';
    }
}
