package C1;

import A1.F;
import A1.G;
import A1.K;
import java.math.RoundingMode;
import p114j1.A;

/* JADX INFO: compiled from: ChunkReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f2310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K f2311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f2314e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2315f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2316g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2317h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2318i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2319k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f2320l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long[] f2321m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int[] f2322n;

    public e(int i10, d dVar, K k10) {
        this.f2310a = dVar;
        int iA = dVar.a();
        boolean z10 = true;
        if (iA != 1 && iA != 2) {
            z10 = false;
        }
        p241t7.b.e(z10);
        int i11 = (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48);
        this.f2312c = (iA == 2 ? 1667497984 : 1651965952) | i11;
        int i12 = dVar.f2307d;
        long j = ((long) dVar.f2305b) * 1000000;
        long j10 = dVar.f2306c;
        int i13 = A.f40996a;
        this.f2314e = A.L(i12, j, j10, RoundingMode.DOWN);
        this.f2311b = k10;
        this.f2313d = iA == 2 ? i11 | 1650720768 : -1;
        this.f2320l = -1L;
        this.f2321m = new long[512];
        this.f2322n = new int[512];
        this.f2315f = i12;
    }

    public final G a(int i10) {
        return new G(((this.f2314e * ((long) 1)) / ((long) this.f2315f)) * ((long) this.f2322n[i10]), this.f2321m[i10]);
    }

    public final F.a b(long j) {
        if (this.f2319k == 0) {
            G g10 = new G(0L, this.f2320l);
            return new F.a(g10, g10);
        }
        int i10 = (int) (j / ((this.f2314e * ((long) 1)) / ((long) this.f2315f)));
        int iC = A.c(this.f2322n, i10, true, true);
        if (this.f2322n[iC] == i10) {
            G gA = a(iC);
            return new F.a(gA, gA);
        }
        G gA2 = a(iC);
        int i11 = iC + 1;
        return i11 < this.f2321m.length ? new F.a(gA2, a(i11)) : new F.a(gA2, gA2);
    }
}
