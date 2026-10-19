package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.ui.layout.AbstractC1155a;
import androidx.compose.ui.layout.F;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.A;

/* JADX INFO: compiled from: LazyListMeasureResult.kt */
/* JADX INFO: loaded from: classes.dex */
public final class l implements k, F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f10552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f10555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final F f10556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f10557f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f10558g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final A f10559h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p013b0.c f10560i;
    public final long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f10561k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f10562l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f10563m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f10564n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f10565o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Orientation f10566p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f10567q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f10568r;

    public l() {
        throw null;
    }

    public l(m mVar, int i10, boolean z10, float f10, F f11, float f12, boolean z11, A a10, p013b0.c cVar, long j, List list, int i11, int i12, int i13, boolean z12, Orientation orientation, int i14, int i15) {
        this.f10552a = mVar;
        this.f10553b = i10;
        this.f10554c = z10;
        this.f10555d = f10;
        this.f10556e = f11;
        this.f10557f = f12;
        this.f10558g = z11;
        this.f10559h = a10;
        this.f10560i = cVar;
        this.j = j;
        this.f10561k = list;
        this.f10562l = i11;
        this.f10563m = i12;
        this.f10564n = i13;
        this.f10565o = z12;
        this.f10566p = orientation;
        this.f10567q = i14;
        this.f10568r = i15;
    }

    @Override // androidx.compose.foundation.lazy.k
    public final long a() {
        F f10 = this.f10556e;
        return (((long) f10.getWidth()) << 32) | (((long) f10.getHeight()) & 4294967295L);
    }

    @Override // androidx.compose.foundation.lazy.k
    public final int b() {
        return this.f10567q;
    }

    @Override // androidx.compose.foundation.lazy.k
    public final int c() {
        return -this.f10562l;
    }

    @Override // androidx.compose.foundation.lazy.k
    public final int d() {
        return this.f10564n;
    }

    @Override // androidx.compose.foundation.lazy.k
    public final int e() {
        return this.f10568r;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List<androidx.compose.foundation.lazy.m>] */
    @Override // androidx.compose.foundation.lazy.k
    public final List<m> f() {
        return this.f10561k;
    }

    @Override // androidx.compose.foundation.lazy.k
    public final int g() {
        return this.f10563m;
    }

    @Override // androidx.compose.ui.layout.F
    public final int getHeight() {
        return this.f10556e.getHeight();
    }

    @Override // androidx.compose.foundation.lazy.k
    public final Orientation getOrientation() {
        return this.f10566p;
    }

    @Override // androidx.compose.ui.layout.F
    public final int getWidth() {
        return this.f10556e.getWidth();
    }

    @Override // androidx.compose.foundation.lazy.k
    public final int h() {
        return this.f10562l;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public final l i(int i10, boolean z10) {
        m mVar;
        int i11;
        boolean z11;
        int i12;
        int i13;
        l lVar = null;
        if (!this.f10558g) {
            ?? r10 = this.f10561k;
            if (!r10.isEmpty() && (mVar = this.f10552a) != null && (i11 = this.f10553b - i10) >= 0 && i11 < mVar.f10763s) {
                m mVar2 = (m) kotlin.collections.q.O(r10);
                m mVar3 = (m) kotlin.collections.q.V(r10);
                if (!mVar2.f10765u && !mVar3.f10765u) {
                    int i14 = this.f10563m;
                    int i15 = this.f10562l;
                    if (i10 >= 0 ? Math.min(i15 - mVar2.f10760p, i14 - mVar3.f10760p) > i10 : Math.min((mVar2.f10760p + mVar2.f10763s) - i15, (mVar3.f10760p + mVar3.f10763s) - i14) > (-i10)) {
                        int size = ((Collection) r10).size();
                        int i16 = 0;
                        while (i16 < size) {
                            m mVar4 = (m) r10.get(i16);
                            if (!mVar4.f10765u) {
                                mVar4.f10760p += i10;
                                int[] iArr = mVar4.f10769y;
                                int length = iArr.length;
                                int i17 = 0;
                                while (true) {
                                    z11 = mVar4.f10748c;
                                    if (i17 >= length) {
                                        break;
                                    }
                                    int i18 = i17 & 1;
                                    if ((z11 && i18 != 0) || (!z11 && i18 == 0)) {
                                        iArr[i17] = iArr[i17] + i10;
                                    }
                                    i17++;
                                }
                                if (z10) {
                                    int size2 = mVar4.f10747b.size();
                                    int i19 = 0;
                                    while (i19 < size2) {
                                        LazyLayoutItemAnimation lazyLayoutItemAnimationA = mVar4.f10758n.a(i19, mVar4.f10756l);
                                        if (lazyLayoutItemAnimationA != null) {
                                            long j = lazyLayoutItemAnimationA.f10619k;
                                            if (z11) {
                                                i12 = (int) (j >> 32);
                                                i13 = ((int) (j & 4294967295L)) + i10;
                                            } else {
                                                i12 = ((int) (j >> 32)) + i10;
                                                i13 = (int) (j & 4294967295L);
                                            }
                                            lazyLayoutItemAnimationA.f10619k = (((long) i13) & 4294967295L) | (((long) i12) << 32);
                                        } else {
                                            i16 = i16;
                                        }
                                        i19++;
                                        i16 = i16;
                                    }
                                }
                            }
                            i16++;
                        }
                        lVar = new l(this.f10552a, i11, this.f10554c || i10 > 0, i10, this.f10556e, this.f10557f, this.f10558g, this.f10559h, this.f10560i, this.j, r10, this.f10562l, this.f10563m, this.f10564n, this.f10565o, this.f10566p, this.f10567q, this.f10568r);
                    }
                }
            }
        }
        return lVar;
    }

    @Override // androidx.compose.ui.layout.F
    public final Map<AbstractC1155a, Integer> o() {
        return this.f10556e.o();
    }

    @Override // androidx.compose.ui.layout.F
    public final void p() {
        this.f10556e.p();
    }

    @Override // androidx.compose.ui.layout.F
    public final Ia.l<Object, p293xa.r> q() {
        return this.f10556e.q();
    }
}
