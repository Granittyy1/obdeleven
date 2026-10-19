package T1;

import A1.F;
import A1.G;
import p114j1.A;

/* JADX INFO: compiled from: XingSeeker.java */
/* JADX INFO: loaded from: classes.dex */
public final class g implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f5793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5794d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f5795e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f5796f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long[] f5797g;

    public g(long j, int i10, long j10, int i11, long j11, long[] jArr) {
        this.f5791a = j;
        this.f5792b = i10;
        this.f5793c = j10;
        this.f5794d = i11;
        this.f5795e = j11;
        this.f5797g = jArr;
        this.f5796f = j11 != -1 ? j + j11 : -1L;
    }

    @Override // T1.e
    public final long c() {
        return this.f5796f;
    }

    @Override // A1.F
    public final boolean d() {
        return this.f5797g != null;
    }

    @Override // T1.e
    public final long e(long j) {
        long j10 = j - this.f5791a;
        if (!d() || j10 <= this.f5792b) {
            return 0L;
        }
        long[] jArr = this.f5797g;
        p241t7.b.l(jArr);
        double d10 = (j10 * 256.0d) / this.f5795e;
        int iD = A.d(jArr, (long) d10, true);
        long j11 = this.f5793c;
        long j12 = (((long) iD) * j11) / 100;
        long j13 = jArr[iD];
        int i10 = iD + 1;
        long j14 = (j11 * ((long) i10)) / 100;
        long j15 = iD == 99 ? 256L : jArr[i10];
        return Math.round((j13 == j15 ? 0.0d : (d10 - j13) / (j15 - j13)) * (j14 - j12)) + j12;
    }

    @Override // A1.F
    public final F.a i(long j) {
        double d10;
        boolean zD = d();
        int i10 = this.f5792b;
        long j10 = this.f5791a;
        if (!zD) {
            G g10 = new G(0L, j10 + ((long) i10));
            return new F.a(g10, g10);
        }
        long jH = A.h(j, 0L, this.f5793c);
        double d11 = (jH * 100.0d) / this.f5793c;
        double d12 = 0.0d;
        if (d11 <= 0.0d) {
            d10 = 256.0d;
        } else if (d11 >= 100.0d) {
            d10 = 256.0d;
            d12 = 256.0d;
        } else {
            int i11 = (int) d11;
            long[] jArr = this.f5797g;
            p241t7.b.l(jArr);
            double d13 = jArr[i11];
            d12 = (((i11 == 99 ? 256.0d : jArr[i11 + 1]) - d13) * (d11 - ((double) i11))) + d13;
            d10 = 256.0d;
        }
        double d14 = d12 / d10;
        long j11 = this.f5795e;
        G g11 = new G(jH, j10 + A.h(Math.round(d14 * j11), i10, j11 - 1));
        return new F.a(g11, g11);
    }

    @Override // T1.e
    public final int j() {
        return this.f5794d;
    }

    @Override // A1.F
    public final long k() {
        return this.f5793c;
    }
}
