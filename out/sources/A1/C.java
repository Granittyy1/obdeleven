package A1;

import T4.o0;

/* JADX INFO: compiled from: IndexSeekMap.java */
/* JADX INFO: loaded from: classes.dex */
public final class C implements F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o0 f398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f399c;

    public C(long j, long[] jArr, long[] jArr2) {
        p241t7.b.e(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.f397a = new o0(length);
            this.f398b = new o0(length);
        } else {
            int i10 = length + 1;
            o0 o0Var = new o0(i10);
            this.f397a = o0Var;
            o0 o0Var2 = new o0(i10);
            this.f398b = o0Var2;
            o0Var.a(0L);
            o0Var2.a(0L);
        }
        this.f397a.b(jArr);
        this.f398b.b(jArr2);
        this.f399c = j;
    }

    public final void a(long j, long j10) {
        o0 o0Var = this.f398b;
        int i10 = o0Var.f5989a;
        o0 o0Var2 = this.f397a;
        if (i10 == 0 && j > 0) {
            o0Var2.a(0L);
            o0Var.a(0L);
        }
        o0Var2.a(j10);
        o0Var.a(j);
    }

    @Override // A1.F
    public final boolean d() {
        return this.f398b.f5989a > 0;
    }

    @Override // A1.F
    public final F.a i(long j) {
        o0 o0Var = this.f398b;
        if (o0Var.f5989a == 0) {
            G g10 = G.f419c;
            return new F.a(g10, g10);
        }
        int iB = p114j1.A.b(o0Var, j);
        long jC = o0Var.c(iB);
        o0 o0Var2 = this.f397a;
        G g11 = new G(jC, o0Var2.c(iB));
        if (jC == j || iB == o0Var.f5989a - 1) {
            return new F.a(g11, g11);
        }
        int i10 = iB + 1;
        return new F.a(g11, new G(o0Var.c(i10), o0Var2.c(i10)));
    }

    @Override // A1.F
    public final long k() {
        return this.f399c;
    }
}
