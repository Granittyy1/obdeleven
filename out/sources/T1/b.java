package T1;

import A1.C;
import A1.F;
import T4.o0;
import java.math.RoundingMode;
import p114j1.A;

/* JADX INFO: compiled from: IndexSeeker.java */
/* JADX INFO: loaded from: classes.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C f5761c;

    public b(long j, long j10, long j11) {
        this.f5761c = new C(j, new long[]{j10}, new long[]{0});
        this.f5759a = j11;
        int i10 = -2147483647;
        if (j == -9223372036854775807L) {
            this.f5760b = -2147483647;
            return;
        }
        long jL = A.L(j10 - j11, 8L, j, RoundingMode.HALF_UP);
        if (jL > 0 && jL <= 2147483647L) {
            i10 = (int) jL;
        }
        this.f5760b = i10;
    }

    @Override // T1.e
    public final long c() {
        return this.f5759a;
    }

    @Override // A1.F
    public final boolean d() {
        return this.f5761c.d();
    }

    @Override // T1.e
    public final long e(long j) {
        C c10 = this.f5761c;
        o0 o0Var = c10.f398b;
        if (o0Var.f5989a == 0) {
            return -9223372036854775807L;
        }
        return o0Var.c(A.b(c10.f397a, j));
    }

    @Override // A1.F
    public final F.a i(long j) {
        return this.f5761c.i(j);
    }

    @Override // T1.e
    public final int j() {
        return this.f5760b;
    }

    @Override // A1.F
    public final long k() {
        return this.f5761c.f399c;
    }
}
