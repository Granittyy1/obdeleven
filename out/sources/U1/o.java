package U1;

import p114j1.A;

/* JADX INFO: compiled from: TrackSampleTable.java */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f6289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f6291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f6292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6293e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f6294f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f6295g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f6296h;

    public o(l lVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j) {
        p241t7.b.e(iArr.length == jArr2.length);
        p241t7.b.e(jArr.length == jArr2.length);
        p241t7.b.e(iArr2.length == jArr2.length);
        this.f6289a = lVar;
        this.f6291c = jArr;
        this.f6292d = iArr;
        this.f6293e = i10;
        this.f6294f = jArr2;
        this.f6295g = iArr2;
        this.f6296h = j;
        this.f6290b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j) {
        long[] jArr = this.f6294f;
        for (int iA = A.a(jArr, j, true); iA < jArr.length; iA++) {
            if ((this.f6295g[iA] & 1) != 0) {
                return iA;
            }
        }
        return -1;
    }
}
