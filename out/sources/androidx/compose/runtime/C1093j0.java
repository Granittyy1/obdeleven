package androidx.compose.runtime;

/* JADX INFO: renamed from: androidx.compose.runtime.j0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
@Ha.a
public final class C1093j0 {
    public static final void a(androidx.collection.A a10, int i10) {
        if (a10.f9184b == 0 || !(a10.a(0) == i10 || a10.a(a10.f9184b - 1) == i10)) {
            int i11 = a10.f9184b;
            a10.c(i10);
            while (i11 > 0) {
                int i12 = ((i11 + 1) >>> 1) - 1;
                int iA = a10.a(i12);
                if (i10 <= iA) {
                    break;
                }
                a10.f(i11, iA);
                i11 = i12;
            }
            a10.f(i11, i10);
        }
    }

    public static final int b(androidx.collection.A a10) {
        int iA;
        int i10 = a10.f9184b;
        int iA2 = a10.a(0);
        while (a10.f9184b != 0 && a10.a(0) == iA2) {
            a10.f(0, a10.b());
            a10.e(a10.f9184b - 1);
            int i11 = a10.f9184b;
            int i12 = i11 >>> 1;
            int i13 = 0;
            while (i13 < i12) {
                int iA3 = a10.a(i13);
                int i14 = (i13 + 1) * 2;
                int i15 = i14 - 1;
                int iA4 = a10.a(i15);
                if (i14 < i11 && (iA = a10.a(i14)) > iA4) {
                    if (iA <= iA3) {
                        break;
                    }
                    a10.f(i13, iA);
                    a10.f(i14, iA3);
                    i13 = i14;
                } else {
                    if (iA4 <= iA3) {
                        break;
                    }
                    a10.f(i13, iA4);
                    a10.f(i15, iA3);
                    i13 = i15;
                }
            }
        }
        return iA2;
    }
}
