package A1;

/* JADX INFO: compiled from: FlacSeekTableSeekMap.java */
/* JADX INFO: loaded from: classes.dex */
public final class w implements F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f555b;

    public w(x xVar, long j) {
        this.f554a = xVar;
        this.f555b = j;
    }

    @Override // A1.F
    public final boolean d() {
        return true;
    }

    @Override // A1.F
    public final F.a i(long j) {
        x xVar = this.f554a;
        p241t7.b.l(xVar.f565k);
        x.a aVar = xVar.f565k;
        long[] jArr = aVar.f567a;
        int iD = p114j1.A.d(jArr, p114j1.A.h((((long) xVar.f560e) * j) / 1000000, 0L, xVar.j - 1), false);
        long j10 = iD == -1 ? 0L : jArr[iD];
        long[] jArr2 = aVar.f568b;
        long j11 = iD != -1 ? jArr2[iD] : 0L;
        int i10 = xVar.f560e;
        long j12 = (j10 * 1000000) / ((long) i10);
        long j13 = this.f555b;
        G g10 = new G(j12, j11 + j13);
        if (j12 == j || iD == jArr.length - 1) {
            return new F.a(g10, g10);
        }
        int i11 = iD + 1;
        return new F.a(g10, new G((jArr[i11] * 1000000) / ((long) i10), j13 + jArr2[i11]));
    }

    @Override // A1.F
    public final long k() {
        return this.f554a.b();
    }
}
