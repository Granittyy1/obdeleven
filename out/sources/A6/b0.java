package A6;

/* JADX INFO: compiled from: AutoValue_StaticSessionData.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b0 extends g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0 f831c;

    public b0(c0 c0Var, e0 e0Var, d0 d0Var) {
        this.f829a = c0Var;
        this.f830b = e0Var;
        this.f831c = d0Var;
    }

    @Override // A6.g0
    public final g0.a a() {
        return this.f829a;
    }

    @Override // A6.g0
    public final g0.b b() {
        return this.f831c;
    }

    @Override // A6.g0
    public final g0.c c() {
        return this.f830b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f829a.equals(g0Var.a()) && this.f830b.equals(g0Var.c()) && this.f831c.equals(g0Var.b());
    }

    public final int hashCode() {
        return ((((this.f829a.hashCode() ^ 1000003) * 1000003) ^ this.f830b.hashCode()) * 1000003) ^ this.f831c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f829a + ", osData=" + this.f830b + ", deviceData=" + this.f831c + "}";
    }
}
