package androidx.collection;

/* JADX INFO: compiled from: SparseArrayCompat.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f9144a = new Object();

    public static final void a(Y y10) {
        int i10 = y10.f9143e;
        int[] iArr = y10.f9141c;
        Object[] objArr = y10.f9142d;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f9144a) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        y10.f9140b = false;
        y10.f9143e = i11;
    }
}
