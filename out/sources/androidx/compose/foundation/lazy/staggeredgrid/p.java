package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.z;
import androidx.compose.ui.layout.Y;
import java.util.List;

/* JADX INFO: compiled from: LazyStaggeredGridMeasure.kt */
/* JADX INFO: loaded from: classes.dex */
public final class p implements e, z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<Y> f10870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f10871d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10872e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f10873f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f10874g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f10875h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f10876i;
    public final LazyLayoutItemAnimator<p> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f10877k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f10878l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f10879m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f10880n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f10881o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f10882p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f10883q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f10884r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f10885s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f10886t;

    public p() {
        throw null;
    }

    public p(int i10, Object obj, List list, boolean z10, int i11, int i12, int i13, int i14, int i15, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j) {
        int i16;
        long j10;
        long j11;
        this.f10868a = i10;
        this.f10869b = obj;
        this.f10870c = list;
        this.f10871d = z10;
        this.f10872e = i12;
        this.f10873f = i13;
        this.f10874g = i14;
        this.f10875h = i15;
        this.f10876i = obj2;
        this.j = lazyLayoutItemAnimator;
        this.f10877k = j;
        int i17 = 1;
        this.f10878l = true;
        int i18 = 0;
        if (!list.isEmpty()) {
            Y y10 = (Y) list.get(0);
            i16 = z10 ? y10.f14221c : y10.f14220b;
            int iR = kotlin.collections.l.r(list);
            if (1 <= iR) {
                int i19 = 1;
                while (true) {
                    Y y11 = (Y) list.get(i19);
                    int i20 = this.f10871d ? y11.f14221c : y11.f14220b;
                    i16 = i20 > i16 ? i20 : i16;
                    if (i19 == iR) {
                        break;
                    } else {
                        i19++;
                    }
                }
            }
        } else {
            i16 = 0;
        }
        this.f10879m = i16;
        int i21 = i16 + i11;
        this.f10880n = i21 < 0 ? 0 : i21;
        List<Y> list2 = this.f10870c;
        if (!list2.isEmpty()) {
            Y y12 = list2.get(0);
            int i22 = this.f10871d ? y12.f14220b : y12.f14221c;
            int iR2 = kotlin.collections.l.r(list2);
            if (1 <= iR2) {
                while (true) {
                    Y y13 = list2.get(i17);
                    int i23 = this.f10871d ? y13.f14220b : y13.f14221c;
                    i22 = i23 > i22 ? i23 : i22;
                    if (i17 == iR2) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
            i18 = i22;
        }
        this.f10881o = -1;
        if (this.f10871d) {
            j10 = ((long) i18) << 32;
            j11 = this.f10879m;
        } else {
            j10 = ((long) this.f10879m) << 32;
            j11 = i18;
        }
        this.f10885s = (j11 & 4294967295L) | j10;
        this.f10886t = 0L;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.e
    public final long a() {
        return this.f10885s;
    }

    @Override // androidx.compose.foundation.lazy.layout.z
    public final int b() {
        return this.f10870c.size();
    }

    @Override // androidx.compose.foundation.lazy.layout.z
    public final long c() {
        return this.f10877k;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.e, androidx.compose.foundation.lazy.layout.z
    public final int d() {
        return this.f10872e;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.e
    public final long e() {
        return this.f10886t;
    }

    @Override // androidx.compose.foundation.lazy.layout.z
    public final void f(int i10, int i11, int i12, int i13) {
        if (this.f10871d) {
            i12 = i13;
        }
        p(i10, i11, i12);
    }

    @Override // androidx.compose.foundation.lazy.layout.z
    public final int g() {
        return this.f10880n;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.e, androidx.compose.foundation.lazy.layout.z
    public final int getIndex() {
        return this.f10868a;
    }

    @Override // androidx.compose.foundation.lazy.layout.z
    public final Object getKey() {
        return this.f10869b;
    }

    @Override // androidx.compose.foundation.lazy.layout.z
    public final boolean h() {
        return this.f10884r;
    }

    @Override // androidx.compose.foundation.lazy.layout.z
    public final int i() {
        return this.f10873f;
    }

    @Override // androidx.compose.foundation.lazy.layout.z
    public final Object j(int i10) {
        return this.f10870c.get(i10).q();
    }

    public final int k(long j) {
        return (int) (this.f10871d ? j & 4294967295L : j >> 32);
    }

    @Override // androidx.compose.foundation.lazy.layout.z
    public final boolean l() {
        return this.f10871d;
    }

    @Override // androidx.compose.foundation.lazy.layout.z
    public final void m() {
        this.f10884r = true;
    }

    @Override // androidx.compose.foundation.lazy.layout.z
    public final long n(int i10) {
        return this.f10886t;
    }

    public final int o() {
        return (int) (!this.f10871d ? this.f10886t >> 32 : this.f10886t & 4294967295L);
    }

    public final void p(int i10, int i11, int i12) {
        long j;
        this.f10881o = i12;
        this.f10882p = -this.f10874g;
        this.f10883q = i12 + this.f10875h;
        if (this.f10871d) {
            j = (((long) i11) << 32) | (4294967295L & ((long) i10));
        } else {
            j = (((long) i11) & 4294967295L) | (((long) i10) << 32);
        }
        this.f10886t = j;
    }
}
