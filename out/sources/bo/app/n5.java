package bo.app;

/* JADX INFO: loaded from: classes.dex */
public final class n5 implements t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d2 f21665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f21666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f21667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f21668d;

    public n5(d2 originalRequest, int i10, String str) {
        kotlin.jvm.internal.i.e(originalRequest, "originalRequest");
        this.f21665a = originalRequest;
        this.f21666b = i10;
        this.f21667c = str;
    }

    @Override // bo.app.r2
    public d2 a() {
        return this.f21665a;
    }

    @Override // bo.app.t2
    public String b() {
        return this.f21667c;
    }

    @Override // bo.app.r2
    public String c() {
        return this.f21668d;
    }

    @Override // bo.app.t2
    public int d() {
        return this.f21666b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5)) {
            return false;
        }
        n5 n5Var = (n5) obj;
        return kotlin.jvm.internal.i.a(a(), n5Var.a()) && d() == n5Var.d() && kotlin.jvm.internal.i.a(b(), n5Var.b());
    }

    public int hashCode() {
        return ((Integer.hashCode(d()) + (a().hashCode() * 31)) * 31) + (b() == null ? 0 : b().hashCode());
    }

    public String toString() {
        return "{code = " + d() + ", reason = " + b() + '}';
    }
}
