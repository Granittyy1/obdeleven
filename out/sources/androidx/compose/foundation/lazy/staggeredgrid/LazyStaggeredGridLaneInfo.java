package androidx.compose.foundation.lazy.staggeredgrid;

import java.util.Arrays;

/* JADX INFO: compiled from: LazyStaggeredGridLaneInfo.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LazyStaggeredGridLaneInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f10783b = new int[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kotlin.collections.i<a> f10784c = new kotlin.collections.i<>();

    /* JADX INFO: compiled from: LazyStaggeredGridLaneInfo.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int[] f10786b;

        public a(int[] iArr, int i10) {
            this.f10785a = i10;
            this.f10786b = iArr;
        }
    }

    public final boolean a(int i10, int i11) {
        int iF = f(i10);
        return iF == i11 || iF == -1 || iF == -2;
    }

    public final void b(int i10, int i11) {
        if (i10 > 131072) {
            p245u.c.a("Requested item capacity " + i10 + " is larger than max supported: 131072!");
        }
        int[] iArr = this.f10783b;
        if (iArr.length < i10) {
            int length = iArr.length;
            while (length < i10) {
                length *= 2;
            }
            int[] iArr2 = new int[length];
            Q3.d.q(i11, 0, 12, this.f10783b, iArr2);
            this.f10783b = iArr2;
        }
    }

    public final void c(int i10) {
        kotlin.collections.i<a> iVar;
        int i11 = this.f10782a;
        int i12 = i10 - i11;
        if (i12 < 0 || i12 >= 131072) {
            int iMax = Math.max(i10 - (this.f10783b.length / 2), 0);
            this.f10782a = iMax;
            int i13 = iMax - i11;
            if (i13 >= 0) {
                int[] iArr = this.f10783b;
                if (i13 < iArr.length) {
                    Q3.d.m(0, i13, iArr.length, iArr, iArr);
                }
                int[] iArr2 = this.f10783b;
                Arrays.fill(iArr2, Math.max(0, iArr2.length - i13), this.f10783b.length, 0);
            } else {
                int i14 = -i13;
                int[] iArr3 = this.f10783b;
                if (iArr3.length + i14 < 131072) {
                    b(iArr3.length + i14 + 1, i14);
                } else {
                    if (i14 < iArr3.length) {
                        Q3.d.m(i14, 0, iArr3.length - i14, iArr3, iArr3);
                    }
                    int[] iArr4 = this.f10783b;
                    Arrays.fill(iArr4, 0, Math.min(iArr4.length, i14), 0);
                }
            }
        } else {
            b(i12 + 1, 0);
        }
        while (true) {
            iVar = this.f10784c;
            if (iVar.isEmpty() || iVar.first().f10785a >= this.f10782a) {
                break;
            } else {
                iVar.removeFirst();
            }
        }
        while (!iVar.isEmpty() && iVar.last().f10785a > this.f10782a + this.f10783b.length) {
            iVar.removeLast();
        }
    }

    public final int d(int i10, int i11) {
        do {
            i10--;
            if (-1 >= i10) {
                return -1;
            }
        } while (!a(i10, i11));
        return i10;
    }

    public final int[] e(int i10) {
        final Integer numValueOf = Integer.valueOf(i10);
        kotlin.collections.i<a> iVar = this.f10784c;
        a aVar = (a) kotlin.collections.q.Q(kotlin.collections.l.o(0, iVar.e(), new Ia.l<a, Integer>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo$getGaps$$inlined$binarySearchBy$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final Integer invoke(LazyStaggeredGridLaneInfo.a aVar2) {
                return Integer.valueOf(Cb.a.e(Integer.valueOf(aVar2.f10785a), numValueOf));
            }
        }, iVar), iVar);
        if (aVar != null) {
            return aVar.f10786b;
        }
        return null;
    }

    public final int f(int i10) {
        int i11 = this.f10782a;
        if (i10 < i11) {
            return -1;
        }
        int[] iArr = this.f10783b;
        if (i10 >= iArr.length + i11) {
            return -1;
        }
        return iArr[i10 - i11] - 1;
    }

    public final void g() {
        Q3.d.x(0, 0, 6, this.f10783b);
        this.f10784c.clear();
    }

    public final void h(int i10, int i11) {
        if (!(i10 >= 0)) {
            p245u.c.a("Negative lanes are not supported");
        }
        c(i10);
        this.f10783b[i10 - this.f10782a] = i11 + 1;
    }
}
