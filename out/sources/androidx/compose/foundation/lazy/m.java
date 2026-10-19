package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.z;
import androidx.compose.ui.layout.Y;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* JADX INFO: compiled from: LazyListMeasuredItem.kt */
/* JADX INFO: loaded from: classes.dex */
public final class m implements g, z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<Y> f10747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.compose.ui.d.b f10749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.compose.ui.d.c f10750e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LayoutDirection f10751f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f10752g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f10753h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f10754i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f10755k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f10756l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f10757m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final LazyLayoutItemAnimator<m> f10758n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f10759o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f10760p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f10761q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f10762r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f10763s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f10764t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f10765u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f10766v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f10767w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f10768x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int[] f10769y;

    public m() {
        throw null;
    }

    public m(int i10, List list, boolean z10, androidx.compose.ui.d.b bVar, androidx.compose.ui.d.c cVar, LayoutDirection layoutDirection, boolean z11, int i11, int i12, int i13, long j, Object obj, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j10) {
        this.f10746a = i10;
        this.f10747b = list;
        this.f10748c = z10;
        this.f10749d = bVar;
        this.f10750e = cVar;
        this.f10751f = layoutDirection;
        this.f10752g = z11;
        this.f10753h = i11;
        this.f10754i = i12;
        this.j = i13;
        this.f10755k = j;
        this.f10756l = obj;
        this.f10757m = obj2;
        this.f10758n = lazyLayoutItemAnimator;
        this.f10759o = j10;
        this.f10762r = 1;
        this.f10766v = Integer.MIN_VALUE;
        int size = list.size();
        int i14 = 0;
        int iMax = 0;
        for (int i15 = 0; i15 < size; i15++) {
            Y y10 = (Y) list.get(i15);
            boolean z12 = this.f10748c;
            i14 += z12 ? y10.f14221c : y10.f14220b;
            iMax = Math.max(iMax, !z12 ? y10.f14221c : y10.f14220b);
        }
        this.f10761q = i14;
        int i16 = i14 + this.j;
        this.f10763s = i16 >= 0 ? i16 : 0;
        this.f10764t = iMax;
        this.f10769y = new int[this.f10747b.size() * 2];
    }

    public final int a(long j) {
        return (int) (this.f10748c ? j & 4294967295L : j >> 32);
    }

    @Override // androidx.compose.foundation.lazy.layout.z
    public final int b() {
        return this.f10747b.size();
    }

    @Override // androidx.compose.foundation.lazy.layout.z
    public final long c() {
        return this.f10759o;
    }

    @Override // androidx.compose.foundation.lazy.layout.z
    public final int d() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(Y.a aVar, boolean z10) {
        androidx.compose.ui.graphics.layer.b bVar;
        if (this.f10766v == Integer.MIN_VALUE) {
            p245u.c.a("position() should be called first");
        }
        List<Y> list = this.f10747b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Y y10 = list.get(i10);
            int i11 = this.f10767w;
            boolean z11 = this.f10748c;
            int i12 = i11 - (z11 ? y10.f14221c : y10.f14220b);
            int i13 = this.f10768x;
            long jN = n(i10);
            LazyLayoutItemAnimation lazyLayoutItemAnimationA = this.f10758n.a(i10, this.f10756l);
            if (lazyLayoutItemAnimationA != null) {
                if (z10) {
                    lazyLayoutItemAnimationA.f10625q = jN;
                } else {
                    if (!p013b0.j.b(lazyLayoutItemAnimationA.f10625q, LazyLayoutItemAnimation.f10608r)) {
                        jN = lazyLayoutItemAnimationA.f10625q;
                    }
                    long jD = p013b0.j.d(jN, ((p013b0.j) lazyLayoutItemAnimationA.f10624p.getValue()).f20484a);
                    if ((a(jN) <= i12 && a(jD) <= i12) || (a(jN) >= i13 && a(jD) >= i13)) {
                        lazyLayoutItemAnimationA.b();
                    }
                    jN = jD;
                }
                bVar = lazyLayoutItemAnimationA.f10621m;
            } else {
                bVar = null;
            }
            if (this.f10752g) {
                jN = z11 ? (((long) ((int) (jN >> 32))) << 32) | (4294967295L & ((long) ((this.f10766v - ((int) (jN & 4294967295L))) - (z11 ? y10.f14221c : y10.f14220b)))) : (((long) ((int) (jN & 4294967295L))) & 4294967295L) | (((long) ((this.f10766v - ((int) (jN >> 32))) - (z11 ? y10.f14221c : y10.f14220b))) << 32);
            }
            long jD2 = p013b0.j.d(jN, this.f10755k);
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

    @Override // androidx.compose.foundation.lazy.layout.z
    public final void f(int i10, int i11, int i12, int i13) {
        k(i10, i12, i13);
    }

    @Override // androidx.compose.foundation.lazy.layout.z
    public final int g() {
        return this.f10763s;
    }

    @Override // androidx.compose.foundation.lazy.g, androidx.compose.foundation.lazy.layout.z
    public final int getIndex() {
        return this.f10746a;
    }

    @Override // androidx.compose.foundation.lazy.g, androidx.compose.foundation.lazy.layout.z
    public final Object getKey() {
        return this.f10756l;
    }

    @Override // androidx.compose.foundation.lazy.g
    public final int getOffset() {
        return this.f10760p;
    }

    @Override // androidx.compose.foundation.lazy.g
    public final int getSize() {
        return this.f10761q;
    }

    @Override // androidx.compose.foundation.lazy.layout.z
    public final boolean h() {
        return this.f10765u;
    }

    @Override // androidx.compose.foundation.lazy.layout.z
    public final int i() {
        return this.f10762r;
    }

    @Override // androidx.compose.foundation.lazy.layout.z
    public final Object j(int i10) {
        return this.f10747b.get(i10).q();
    }

    public final void k(int i10, int i11, int i12) {
        int i13;
        this.f10760p = i10;
        boolean z10 = this.f10748c;
        this.f10766v = z10 ? i12 : i11;
        List<Y> list = this.f10747b;
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            Y y10 = list.get(i14);
            int i15 = i14 * 2;
            int[] iArr = this.f10769y;
            if (z10) {
                androidx.compose.ui.d.b bVar = this.f10749d;
                if (bVar == null) {
                    p245u.c.b("null horizontalAlignment when isVertical == true");
                    throw new KotlinNothingValueException();
                }
                iArr[i15] = bVar.a(y10.f14220b, i11, this.f10751f);
                iArr[i15 + 1] = i10;
                i13 = y10.f14221c;
            } else {
                iArr[i15] = i10;
                int i16 = i15 + 1;
                androidx.compose.ui.d.c cVar = this.f10750e;
                if (cVar == null) {
                    p245u.c.b("null verticalAlignment when isVertical == false");
                    throw new KotlinNothingValueException();
                }
                iArr[i16] = cVar.a(y10.f14221c, i12);
                i13 = y10.f14220b;
            }
            i10 += i13;
        }
        this.f10767w = -this.f10753h;
        this.f10768x = this.f10766v + this.f10754i;
    }

    @Override // androidx.compose.foundation.lazy.layout.z
    public final boolean l() {
        return this.f10748c;
    }

    @Override // androidx.compose.foundation.lazy.layout.z
    public final void m() {
        this.f10765u = true;
    }

    @Override // androidx.compose.foundation.lazy.layout.z
    public final long n(int i10) {
        int i11 = i10 * 2;
        int[] iArr = this.f10769y;
        return (((long) iArr[i11]) << 32) | (((long) iArr[i11 + 1]) & 4294967295L);
    }
}
