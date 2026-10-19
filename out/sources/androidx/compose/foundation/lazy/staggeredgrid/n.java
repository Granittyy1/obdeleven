package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.ui.layout.AbstractC1155a;
import androidx.compose.ui.layout.F;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.A;

/* JADX INFO: compiled from: LazyStaggeredGridMeasureResult.kt */
/* JADX INFO: loaded from: classes.dex */
public final class n implements j, F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f10846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f10847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final F f10849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f10850e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f10851f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f10852g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f10853h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u f10854i;
    public final W4.b j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p013b0.c f10855k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f10856l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f10857m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f10858n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f10859o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f10860p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f10861q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f10862r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f10863s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final A f10864t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Orientation f10865u;

    public n() {
        throw null;
    }

    public n(int[] iArr, int[] iArr2, float f10, F f11, float f12, boolean z10, boolean z11, boolean z12, u uVar, W4.b bVar, p013b0.c cVar, int i10, List list, long j, int i11, int i12, int i13, int i14, int i15, A a10) {
        this.f10846a = iArr;
        this.f10847b = iArr2;
        this.f10848c = f10;
        this.f10849d = f11;
        this.f10850e = f12;
        this.f10851f = z10;
        this.f10852g = z11;
        this.f10853h = z12;
        this.f10854i = uVar;
        this.j = bVar;
        this.f10855k = cVar;
        this.f10856l = i10;
        this.f10857m = list;
        this.f10858n = j;
        this.f10859o = i11;
        this.f10860p = i12;
        this.f10861q = i13;
        this.f10862r = i14;
        this.f10863s = i15;
        this.f10864t = a10;
        this.f10865u = z11 ? Orientation.f9957b : Orientation.f9958c;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.j
    public final long a() {
        return this.f10858n;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.j
    public final int b() {
        return this.f10862r;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.j
    public final int c() {
        return this.f10861q;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.j
    public final int d() {
        return this.f10856l;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.j
    public final int e() {
        return this.f10863s;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List<androidx.compose.foundation.lazy.staggeredgrid.p>] */
    @Override // androidx.compose.foundation.lazy.staggeredgrid.j
    public final List<p> f() {
        return this.f10857m;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public final n g(int i10, boolean z10) {
        if (!this.f10853h) {
            ?? r10 = this.f10857m;
            if (!r10.isEmpty() && this.f10846a.length != 0) {
                int[] iArr = this.f10847b;
                if (iArr.length != 0) {
                    int i11 = this.f10862r;
                    int i12 = this.f10860p;
                    int i13 = i12 - i11;
                    Collection collection = (Collection) r10;
                    int size = collection.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        p pVar = (p) r10.get(i14);
                        if (!pVar.f10884r) {
                            if ((pVar.o() <= 0) == (pVar.o() + i10 <= 0)) {
                                int iO = pVar.o();
                                int i15 = this.f10859o;
                                int i16 = pVar.f10880n;
                                if (iO <= i15) {
                                    if (i10 < 0) {
                                        if ((pVar.o() + i16) - i15 <= (-i10)) {
                                            return null;
                                        }
                                    } else if (i15 - pVar.o() <= i10) {
                                        return null;
                                    }
                                }
                                if (pVar.o() + i16 >= i13) {
                                    if (i10 < 0) {
                                        if ((pVar.o() + i16) - i12 <= (-i10)) {
                                            return null;
                                        }
                                    } else if (i12 - pVar.o() <= i10) {
                                        return null;
                                    }
                                }
                            }
                        }
                        return null;
                    }
                    int size2 = collection.size();
                    for (int i17 = 0; i17 < size2; i17++) {
                        p pVar2 = (p) r10.get(i17);
                        if (!pVar2.f10884r) {
                            long j = pVar2.f10886t;
                            boolean z11 = pVar2.f10871d;
                            pVar2.f10886t = (((long) (z11 ? (int) (j >> 32) : ((int) (j >> 32)) + i10)) << 32) | (((long) (z11 ? ((int) (j & 4294967295L)) + i10 : (int) (j & 4294967295L))) & 4294967295L);
                            if (z10) {
                                int size3 = pVar2.f10870c.size();
                                int i18 = 0;
                                while (i18 < size3) {
                                    LazyLayoutItemAnimation lazyLayoutItemAnimationA = pVar2.j.a(i18, pVar2.f10869b);
                                    if (lazyLayoutItemAnimationA != null) {
                                        long j10 = lazyLayoutItemAnimationA.f10619k;
                                        lazyLayoutItemAnimationA.f10619k = (((long) (z11 ? ((int) (j10 & 4294967295L)) + i10 : (int) (j10 & 4294967295L))) & 4294967295L) | (((long) (z11 ? (int) (j10 >> 32) : ((int) (j10 >> 32)) + i10)) << 32);
                                    } else {
                                        i18 = i18;
                                    }
                                    i18++;
                                }
                            }
                        }
                    }
                    int length = iArr.length;
                    int[] iArr2 = new int[length];
                    for (int i19 = 0; i19 < length; i19++) {
                        iArr2[i19] = iArr[i19] - i10;
                    }
                    return new n(this.f10846a, iArr2, i10, this.f10849d, this.f10850e, this.f10851f || i10 > 0, this.f10852g, this.f10853h, this.f10854i, this.j, this.f10855k, this.f10856l, r10, this.f10858n, this.f10859o, this.f10860p, this.f10861q, this.f10862r, this.f10863s, this.f10864t);
                }
            }
        }
        return null;
    }

    @Override // androidx.compose.ui.layout.F
    public final int getHeight() {
        return this.f10849d.getHeight();
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.j
    public final Orientation getOrientation() {
        return this.f10865u;
    }

    @Override // androidx.compose.ui.layout.F
    public final int getWidth() {
        return this.f10849d.getWidth();
    }

    @Override // androidx.compose.ui.layout.F
    public final Map<AbstractC1155a, Integer> o() {
        return this.f10849d.o();
    }

    @Override // androidx.compose.ui.layout.F
    public final void p() {
        this.f10849d.p();
    }

    @Override // androidx.compose.ui.layout.F
    public final Ia.l<Object, p293xa.r> q() {
        return this.f10849d.q();
    }
}
