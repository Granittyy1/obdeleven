package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.D;
import androidx.compose.runtime.C1081d0;

/* JADX INFO: compiled from: LazyStaggeredGridScrollPosition.kt */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ia.p<Integer, Integer, int[]> f10887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f10888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1081d0 f10889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f10890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1081d0 f10891e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f10892f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f10893g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final D f10894h;

    /* JADX WARN: Multi-variable type inference failed */
    public r(int[] iArr, int[] iArr2, Ia.p<? super Integer, ? super Integer, int[]> pVar) {
        this.f10887a = pVar;
        this.f10888b = iArr;
        this.f10889c = new C1081d0(a(iArr));
        this.f10890d = iArr2;
        this.f10891e = new C1081d0(b(iArr, iArr2));
        Integer numX = kotlin.collections.k.X(iArr);
        this.f10894h = new D(numX != null ? numX.intValue() : 0, 90, androidx.recyclerview.widget.t.d.DEFAULT_DRAG_ANIMATION_DURATION);
    }

    public static int a(int[] iArr) {
        int i10 = Integer.MAX_VALUE;
        for (int i11 : iArr) {
            if (i11 <= 0) {
                return 0;
            }
            if (i10 > i11) {
                i10 = i11;
            }
        }
        if (i10 == Integer.MAX_VALUE) {
            return 0;
        }
        return i10;
    }

    public static int b(int[] iArr, int[] iArr2) {
        int iA = a(iArr);
        int length = iArr2.length;
        int iMin = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < length; i10++) {
            if (iArr[i10] == iA) {
                iMin = Math.min(iMin, iArr2[i10]);
            }
        }
        if (iMin == Integer.MAX_VALUE) {
            return 0;
        }
        return iMin;
    }
}
