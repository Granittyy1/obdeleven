package T1;

import A1.F;
import A1.G;
import p114j1.A;

/* JADX INFO: compiled from: VbriSeeker.java */
/* JADX INFO: loaded from: classes.dex */
public final class f implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f5786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f5787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f5788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f5789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5790e;

    public f(long[] jArr, long[] jArr2, long j, long j10, int i10) {
        this.f5786a = jArr;
        this.f5787b = jArr2;
        this.f5788c = j;
        this.f5789d = j10;
        this.f5790e = i10;
    }

    @Override // T1.e
    public final long c() {
        return this.f5789d;
    }

    @Override // A1.F
    public final boolean d() {
        return true;
    }

    @Override // T1.e
    public final long e(long j) {
        return this.f5786a[A.d(this.f5787b, j, true)];
    }

    @Override // A1.F
    public final F.a i(long j) {
        long[] jArr = this.f5786a;
        int iD = A.d(jArr, j, true);
        long j10 = jArr[iD];
        long[] jArr2 = this.f5787b;
        G g10 = new G(j10, jArr2[iD]);
        if (j10 >= j || iD == jArr.length - 1) {
            return new F.a(g10, g10);
        }
        int i10 = iD + 1;
        return new F.a(g10, new G(jArr[i10], jArr2[i10]));
    }

    @Override // T1.e
    public final int j() {
        return this.f5790e;
    }

    @Override // A1.F
    public final long k() {
        return this.f5788c;
    }
}
