package androidx.collection;

/* JADX INFO: renamed from: androidx.collection.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: FloatSet.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0877e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[] f9173a;

    static {
        long[] jArr;
        C0896y c0896y = new C0896y();
        int iE = U.e(0);
        int iMax = iE > 0 ? Math.max(7, U.d(iE)) : 0;
        c0896y.f9172c = iMax;
        if (iMax == 0) {
            jArr = U.f9132a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            Q3.d.y(jArr, -9187201950435737472L);
        }
        c0896y.f9170a = jArr;
        int i10 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j)) | j;
        c0896y.f9171b = new float[iMax];
        f9173a = new float[0];
    }
}
