package bo.app;

/* JADX INFO: loaded from: classes.dex */
public final class j5 implements t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d2 f21388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f21389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f21390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f21391d;

    public j5(d2 originalRequest, int i10, String str, String str2) {
        kotlin.jvm.internal.i.e(originalRequest, "originalRequest");
        this.f21388a = originalRequest;
        this.f21389b = i10;
        this.f21390c = str;
        this.f21391d = str2;
    }

    @Override // bo.app.r2
    public d2 a() {
        return this.f21388a;
    }

    @Override // bo.app.t2
    public String b() {
        return this.f21390c;
    }

    @Override // bo.app.r2
    public String c() {
        return this.f21391d;
    }

    @Override // bo.app.t2
    public int d() {
        return this.f21389b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j5)) {
            return false;
        }
        j5 j5Var = (j5) obj;
        return kotlin.jvm.internal.i.a(a(), j5Var.a()) && d() == j5Var.d() && kotlin.jvm.internal.i.a(b(), j5Var.b()) && kotlin.jvm.internal.i.a(c(), j5Var.c());
    }

    public int hashCode() {
        return ((((Integer.hashCode(d()) + (a().hashCode() * 31)) * 31) + (b() == null ? 0 : b().hashCode())) * 31) + (c() != null ? c().hashCode() : 0);
    }

    public String toString() {
        return "{code = " + d() + ", reason = " + b() + ", message = " + c() + '}';
    }

    public /* synthetic */ j5(d2 d2Var, int i10, String str, String str2, int i11, kotlin.jvm.internal.e eVar) {
        this(d2Var, i10, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : str2);
    }
}
