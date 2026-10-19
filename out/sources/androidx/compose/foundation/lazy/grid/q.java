package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.ui.layout.Y;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;

/* JADX INFO: compiled from: LazyGridMeasuredItem.kt */
/* JADX INFO: loaded from: classes.dex */
public final class q implements g, androidx.compose.foundation.lazy.layout.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f10493e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LayoutDirection f10494f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f10495g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f10496h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<Y> f10497i;
    public final long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f10498k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LazyLayoutItemAnimator<q> f10499l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f10500m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f10501n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f10502o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f10503p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f10504q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f10505r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f10506s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f10507t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f10508u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f10509v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f10510w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f10511x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f10512y;

    public q() {
        throw null;
    }

    public q(int i10, Object obj, boolean z10, int i11, int i12, boolean z11, LayoutDirection layoutDirection, int i13, int i14, List list, long j, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j10, int i15, int i16) {
        this.f10489a = i10;
        this.f10490b = obj;
        this.f10491c = z10;
        this.f10492d = i11;
        this.f10493e = z11;
        this.f10494f = layoutDirection;
        this.f10495g = i13;
        this.f10496h = i14;
        this.f10497i = list;
        this.j = j;
        this.f10498k = obj2;
        this.f10499l = lazyLayoutItemAnimator;
        this.f10500m = j10;
        this.f10501n = i15;
        this.f10502o = i16;
        this.f10505r = Integer.MIN_VALUE;
        int size = list.size();
        int iMax = 0;
        for (int i17 = 0; i17 < size; i17++) {
            Y y10 = (Y) list.get(i17);
            iMax = Math.max(iMax, this.f10491c ? y10.f14221c : y10.f14220b);
        }
        this.f10503p = iMax;
        int i18 = iMax + i12;
        this.f10504q = i18 >= 0 ? i18 : 0;
        this.f10508u = this.f10491c ? (((long) iMax) & 4294967295L) | (((long) this.f10492d) << 32) : (((long) this.f10492d) & 4294967295L) | (((long) iMax) << 32);
        this.f10509v = 0L;
        this.f10510w = -1;
        this.f10511x = -1;
    }

    @Override // androidx.compose.foundation.lazy.grid.g
    public final long a() {
        return this.f10508u;
    }

    @Override // androidx.compose.foundation.lazy.layout.z
    public final int b() {
        return this.f10497i.size();
    }

    @Override // androidx.compose.foundation.lazy.layout.z
    public final long c() {
        return this.f10500m;
    }

    @Override // androidx.compose.foundation.lazy.layout.z
    public final int d() {
        return this.f10501n;
    }

    @Override // androidx.compose.foundation.lazy.grid.g
    public final long e() {
        return this.f10509v;
    }

    @Override // androidx.compose.foundation.lazy.layout.z
    public final void f(int i10, int i11, int i12, int i13) {
        r(i10, i11, i12, i13, -1, -1);
    }

    @Override // androidx.compose.foundation.lazy.layout.z
    public final int g() {
        return this.f10504q;
    }

    @Override // androidx.compose.foundation.lazy.grid.g, androidx.compose.foundation.lazy.layout.z
    public final int getIndex() {
        return this.f10489a;
    }

    @Override // androidx.compose.foundation.lazy.layout.z
    public final Object getKey() {
        return this.f10490b;
    }

    @Override // androidx.compose.foundation.lazy.layout.z
    public final boolean h() {
        return this.f10512y;
    }

    @Override // androidx.compose.foundation.lazy.layout.z
    public final int i() {
        return this.f10502o;
    }

    @Override // androidx.compose.foundation.lazy.layout.z
    public final Object j(int i10) {
        return this.f10497i.get(i10).q();
    }

    @Override // androidx.compose.foundation.lazy.grid.g
    public final int k() {
        return this.f10510w;
    }

    @Override // androidx.compose.foundation.lazy.layout.z
    public final boolean l() {
        return this.f10491c;
    }

    @Override // androidx.compose.foundation.lazy.layout.z
    public final void m() {
        this.f10512y = true;
    }

    @Override // androidx.compose.foundation.lazy.layout.z
    public final long n(int i10) {
        return this.f10509v;
    }

    @Override // androidx.compose.foundation.lazy.grid.g
    public final int o() {
        return this.f10511x;
    }

    public final int p(long j) {
        return (int) (this.f10491c ? j & 4294967295L : j >> 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q(Y.a aVar, boolean z10) {
        androidx.compose.ui.graphics.layer.b bVar;
        if (this.f10505r == Integer.MIN_VALUE) {
            p245u.c.a("position() should be called first");
        }
        List<Y> list = this.f10497i;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Y y10 = list.get(i10);
            int i11 = this.f10506s;
            boolean z11 = this.f10491c;
            int i12 = i11 - (z11 ? y10.f14221c : y10.f14220b);
            int i13 = this.f10507t;
            long j = this.f10509v;
            LazyLayoutItemAnimation lazyLayoutItemAnimationA = this.f10499l.a(i10, this.f10490b);
            if (lazyLayoutItemAnimationA != null) {
                if (z10) {
                    lazyLayoutItemAnimationA.f10625q = j;
                } else {
                    long jD = p013b0.j.d(!p013b0.j.b(lazyLayoutItemAnimationA.f10625q, LazyLayoutItemAnimation.f10608r) ? lazyLayoutItemAnimationA.f10625q : j, ((p013b0.j) lazyLayoutItemAnimationA.f10624p.getValue()).f20484a);
                    if ((p(j) <= i12 && p(jD) <= i12) || (p(j) >= i13 && p(jD) >= i13)) {
                        lazyLayoutItemAnimationA.b();
                    }
                    j = jD;
                }
                bVar = lazyLayoutItemAnimationA.f10621m;
            } else {
                bVar = null;
            }
            if (this.f10493e) {
                j = (((long) (z11 ? (int) (j >> 32) : (this.f10505r - ((int) (j >> 32))) - (z11 ? y10.f14221c : y10.f14220b))) << 32) | (((long) (z11 ? (this.f10505r - ((int) (j & 4294967295L))) - (z11 ? y10.f14221c : y10.f14220b) : (int) (j & 4294967295L))) & 4294967295L);
            }
            long jD2 = p013b0.j.d(j, this.j);
            if (!z10 && lazyLayoutItemAnimationA != null) {
                lazyLayoutItemAnimationA.f10620l = jD2;
            }
            if (z11) {
                if (bVar != null) {
                    aVar.getClass();
                    Y.a.a(aVar, y10);
                    y10.r0(p013b0.j.d(jD2, y10.f14224f), 0.0f, bVar);
                } else {
                    Y.a.l(aVar, y10, jD2);
                }
            } else if (bVar != null) {
                Y.a.j(aVar, y10, jD2, bVar);
            } else {
                Y.a.i(aVar, y10, jD2);
            }
        }
    }

    public final void r(int i10, int i11, int i12, int i13, int i14, int i15) {
        long j;
        long j10;
        boolean z10 = this.f10491c;
        int i16 = z10 ? i13 : i12;
        this.f10505r = i16;
        if (!z10) {
            i12 = i13;
        }
        if (z10) {
            if (this.f10494f == LayoutDirection.f15718c) {
                i11 = (i12 - i11) - this.f10492d;
            }
        }
        if (z10) {
            j = ((long) i11) << 32;
            j10 = i10;
        } else {
            j = ((long) i10) << 32;
            j10 = i11;
        }
        this.f10509v = (j10 & 4294967295L) | j;
        this.f10510w = i14;
        this.f10511x = i15;
        this.f10506s = -this.f10495g;
        this.f10507t = i16 + this.f10496h;
    }
}
