package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.layout.AbstractC1155a;
import androidx.compose.ui.layout.F;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.A;

/* JADX INFO: compiled from: PagerMeasureResult.kt */
/* JADX INFO: loaded from: classes.dex */
public final class m implements i, F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Orientation f10988e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f10989f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f10990g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f10991h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f10992i;
    public final c j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c f10993k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f10994l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f10995m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f10996n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final androidx.compose.foundation.gestures.snapping.k f10997o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final F f10998p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f10999q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List<c> f11000r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List<c> f11001s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final A f11002t;

    public m(List<c> list, int i10, int i11, int i12, Orientation orientation, int i13, int i14, boolean z10, int i15, c cVar, c cVar2, float f10, int i16, boolean z11, androidx.compose.foundation.gestures.snapping.k kVar, F f11, boolean z12, List<c> list2, List<c> list3, A a10) {
        this.f10984a = list;
        this.f10985b = i10;
        this.f10986c = i11;
        this.f10987d = i12;
        this.f10988e = orientation;
        this.f10989f = i13;
        this.f10990g = i14;
        this.f10991h = z10;
        this.f10992i = i15;
        this.j = cVar;
        this.f10993k = cVar2;
        this.f10994l = f10;
        this.f10995m = i16;
        this.f10996n = z11;
        this.f10997o = kVar;
        this.f10998p = f11;
        this.f10999q = z12;
        this.f11000r = list2;
        this.f11001s = list3;
        this.f11002t = a10;
    }

    @Override // androidx.compose.foundation.pager.i
    public final long a() {
        F f10 = this.f10998p;
        return (((long) f10.getWidth()) << 32) | (((long) f10.getHeight()) & 4294967295L);
    }

    @Override // androidx.compose.foundation.pager.i
    public final int b() {
        return this.f10987d;
    }

    @Override // androidx.compose.foundation.pager.i
    public final int c() {
        return -this.f10989f;
    }

    @Override // androidx.compose.foundation.pager.i
    public final boolean d() {
        return this.f10991h;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List<androidx.compose.foundation.pager.c>] */
    @Override // androidx.compose.foundation.pager.i
    public final List<c> e() {
        return this.f10984a;
    }

    @Override // androidx.compose.foundation.pager.i
    public final int f() {
        return this.f10985b;
    }

    @Override // androidx.compose.foundation.pager.i
    public final int g() {
        return this.f10986c;
    }

    @Override // androidx.compose.ui.layout.F
    public final int getHeight() {
        return this.f10998p.getHeight();
    }

    @Override // androidx.compose.foundation.pager.i
    public final Orientation getOrientation() {
        return this.f10988e;
    }

    @Override // androidx.compose.ui.layout.F
    public final int getWidth() {
        return this.f10998p.getWidth();
    }

    @Override // androidx.compose.foundation.pager.i
    public final androidx.compose.foundation.gestures.snapping.k h() {
        return this.f10997o;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.List] */
    public final m i(int i10) {
        int i11;
        int i12 = this.f10985b + this.f10986c;
        if (this.f10999q) {
            return null;
        }
        ?? r10 = this.f10984a;
        if (r10.isEmpty() || this.j == null || (i11 = this.f10995m - i10) < 0 || i11 >= i12) {
            return null;
        }
        float f10 = this.f10994l - (i12 != 0 ? i10 / i12 : 0.0f);
        if (this.f10993k == null || f10 >= 0.5f || f10 <= -0.5f) {
            return null;
        }
        c cVar = (c) kotlin.collections.q.O(r10);
        c cVar2 = (c) kotlin.collections.q.V(r10);
        int i13 = this.f10990g;
        int i14 = this.f10989f;
        if (i10 < 0) {
            if (Math.min((cVar.f10969m + i12) - i14, (cVar2.f10969m + i12) - i13) <= (-i10)) {
                return null;
            }
        } else if (Math.min(i14 - cVar.f10969m, i13 - cVar2.f10969m) <= i10) {
            return null;
        }
        int size = ((Collection) r10).size();
        for (int i15 = 0; i15 < size; i15++) {
            ((c) r10.get(i15)).a(i10);
        }
        List<c> list = this.f11000r;
        int size2 = list.size();
        for (int i16 = 0; i16 < size2; i16++) {
            list.get(i16).a(i10);
        }
        List<c> list2 = this.f11001s;
        int size3 = list2.size();
        for (int i17 = 0; i17 < size3; i17++) {
            list2.get(i17).a(i10);
        }
        return new m(r10, this.f10985b, this.f10986c, this.f10987d, this.f10988e, this.f10989f, this.f10990g, this.f10991h, this.f10992i, this.j, this.f10993k, f10, i11, this.f10996n || i10 > 0, this.f10997o, this.f10998p, this.f10999q, this.f11000r, this.f11001s, this.f11002t);
    }

    @Override // androidx.compose.ui.layout.F
    public final Map<AbstractC1155a, Integer> o() {
        return this.f10998p.o();
    }

    @Override // androidx.compose.ui.layout.F
    public final void p() {
        this.f10998p.p();
    }

    @Override // androidx.compose.ui.layout.F
    public final Ia.l<Object, p293xa.r> q() {
        return this.f10998p.q();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public m(EmptyList emptyList, int i10, int i11, int i12, Orientation orientation, int i13, int i14, int i15, androidx.compose.foundation.gestures.snapping.k kVar, F f10, A a10) {
        EmptyList emptyList2 = EmptyList.f42983b;
        this(emptyList, i10, i11, i12, orientation, i13, i14, false, i15, null, null, 0.0f, 0, false, kVar, f10, false, emptyList2, emptyList2, a10);
    }
}
