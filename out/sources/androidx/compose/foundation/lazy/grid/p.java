package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.ui.layout.AbstractC1155a;
import androidx.compose.ui.layout.F;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.A;

/* JADX INFO: compiled from: LazyGridMeasureResult.kt */
/* JADX INFO: loaded from: classes.dex */
public final class p implements o, F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f10471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f10474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final F f10475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f10476f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f10477g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final A f10478h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p013b0.c f10479i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Lambda f10480k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f10481l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f10482m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f10483n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f10484o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f10485p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Orientation f10486q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f10487r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f10488s;

    /* JADX WARN: Multi-variable type inference failed */
    public p(s sVar, int i10, boolean z10, float f10, F f11, float f12, boolean z11, A a10, p013b0.c cVar, int i11, Ia.l<? super Integer, ? extends List<Pair<Integer, p013b0.a>>> lVar, List<q> list, int i12, int i13, int i14, boolean z12, Orientation orientation, int i15, int i16) {
        this.f10471a = sVar;
        this.f10472b = i10;
        this.f10473c = z10;
        this.f10474d = f10;
        this.f10475e = f11;
        this.f10476f = f12;
        this.f10477g = z11;
        this.f10478h = a10;
        this.f10479i = cVar;
        this.j = i11;
        this.f10480k = (Lambda) lVar;
        this.f10481l = list;
        this.f10482m = i12;
        this.f10483n = i13;
        this.f10484o = i14;
        this.f10485p = z12;
        this.f10486q = orientation;
        this.f10487r = i15;
        this.f10488s = i16;
    }

    @Override // androidx.compose.foundation.lazy.grid.o
    public final long a() {
        F f10 = this.f10475e;
        return (((long) f10.getWidth()) << 32) | (((long) f10.getHeight()) & 4294967295L);
    }

    @Override // androidx.compose.foundation.lazy.grid.o
    public final int b() {
        return this.f10487r;
    }

    @Override // androidx.compose.foundation.lazy.grid.o
    public final int c() {
        return -this.f10482m;
    }

    @Override // androidx.compose.foundation.lazy.grid.o
    public final int d() {
        return this.f10484o;
    }

    @Override // androidx.compose.foundation.lazy.grid.o
    public final int e() {
        return this.f10488s;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List<androidx.compose.foundation.lazy.grid.q>] */
    @Override // androidx.compose.foundation.lazy.grid.o
    public final List<q> f() {
        return this.f10481l;
    }

    @Override // androidx.compose.foundation.lazy.grid.o
    public final int g() {
        return this.f10483n;
    }

    @Override // androidx.compose.ui.layout.F
    public final int getHeight() {
        return this.f10475e.getHeight();
    }

    @Override // androidx.compose.foundation.lazy.grid.o
    public final Orientation getOrientation() {
        return this.f10486q;
    }

    @Override // androidx.compose.ui.layout.F
    public final int getWidth() {
        return this.f10475e.getWidth();
    }

    @Override // androidx.compose.foundation.lazy.grid.o
    public final int h() {
        return this.f10482m;
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [Ia.l, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public final p i(int i10, boolean z10) {
        s sVar;
        int i11;
        int i12;
        long j;
        int i13;
        if (this.f10477g) {
            return null;
        }
        ?? r10 = this.f10481l;
        if (r10.isEmpty() || (sVar = this.f10471a) == null || (i11 = this.f10472b - i10) < 0 || i11 >= sVar.f10523h) {
            return null;
        }
        q qVar = (q) kotlin.collections.q.O(r10);
        q qVar2 = (q) kotlin.collections.q.V(r10);
        if (qVar.f10512y || qVar2.f10512y) {
            return null;
        }
        Orientation orientation = this.f10486q;
        int i14 = this.f10483n;
        int i15 = this.f10482m;
        if (i10 < 0) {
            if (Math.min((androidx.compose.foundation.gestures.snapping.e.a(qVar, orientation) + qVar.f10504q) - i15, (androidx.compose.foundation.gestures.snapping.e.a(qVar2, orientation) + qVar2.f10504q) - i14) <= (-i10)) {
                return null;
            }
        } else if (Math.min(i15 - androidx.compose.foundation.gestures.snapping.e.a(qVar, orientation), i14 - androidx.compose.foundation.gestures.snapping.e.a(qVar2, orientation)) <= i10) {
            return null;
        }
        int size = ((Collection) r10).size();
        int i16 = 0;
        while (i16 < size) {
            q qVar3 = (q) r10.get(i16);
            if (qVar3.f10512y) {
                i12 = i16;
            } else {
                long j10 = qVar3.f10509v;
                boolean z11 = qVar3.f10491c;
                long j11 = 4294967295L;
                i12 = i16;
                qVar3.f10509v = (((long) (z11 ? (int) (j10 >> 32) : ((int) (j10 >> 32)) + i10)) << 32) | (((long) (z11 ? ((int) (j10 & 4294967295L)) + i10 : (int) (j10 & 4294967295L))) & 4294967295L);
                if (z10) {
                    int size2 = qVar3.f10497i.size();
                    int i17 = 0;
                    while (i17 < size2) {
                        LazyLayoutItemAnimation lazyLayoutItemAnimationA = qVar3.f10499l.a(i17, qVar3.f10490b);
                        if (lazyLayoutItemAnimationA != null) {
                            long j12 = lazyLayoutItemAnimationA.f10619k;
                            int i18 = z11 ? (int) (j12 >> 32) : ((int) (j12 >> 32)) + i10;
                            if (z11) {
                                j = 4294967295L;
                                i13 = ((int) (j12 & 4294967295L)) + i10;
                            } else {
                                j = 4294967295L;
                                i13 = (int) (j12 & 4294967295L);
                            }
                            lazyLayoutItemAnimationA.f10619k = (((long) i13) & j) | (((long) i18) << 32);
                        } else {
                            j = j11;
                        }
                        i17++;
                        z11 = z11;
                        j11 = j;
                    }
                }
            }
            i16 = i12 + 1;
        }
        return new p(this.f10471a, i11, this.f10473c || i10 > 0, i10, this.f10475e, this.f10476f, this.f10477g, this.f10478h, this.f10479i, this.j, this.f10480k, r10, this.f10482m, this.f10483n, this.f10484o, this.f10485p, orientation, this.f10487r, this.f10488s);
    }

    @Override // androidx.compose.ui.layout.F
    public final Map<AbstractC1155a, Integer> o() {
        return this.f10475e.o();
    }

    @Override // androidx.compose.ui.layout.F
    public final void p() {
        this.f10475e.p();
    }

    @Override // androidx.compose.ui.layout.F
    public final Ia.l<Object, p293xa.r> q() {
        return this.f10475e.q();
    }
}
