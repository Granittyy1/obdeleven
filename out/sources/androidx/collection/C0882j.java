package androidx.collection;

/* JADX INFO: renamed from: androidx.collection.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: IntList.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0882j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A f9185a = new A(0);

    public static final A a(int... iArr) {
        A a10 = new A(iArr.length);
        int i10 = a10.f9184b;
        if (i10 < 0) {
            D9.o.r("");
            throw null;
        }
        if (iArr.length != 0) {
            a10.d(iArr.length + i10);
            int[] iArr2 = a10.f9183a;
            int i11 = a10.f9184b;
            if (i10 != i11) {
                Q3.d.m(iArr.length + i10, i10, i11, iArr2, iArr2);
            }
            Q3.d.q(i10, 0, 12, iArr, iArr2);
            a10.f9184b += iArr.length;
        }
        return a10;
    }
}
