package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.K;

/* JADX INFO: compiled from: PagerScrollScope.kt */
/* JADX INFO: loaded from: classes.dex */
public final class q implements K, androidx.compose.foundation.gestures.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.gestures.s f11010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PagerState f11011b;

    public q(androidx.compose.foundation.gestures.s sVar, PagerState pagerState) {
        this.f11011b = pagerState;
        this.f11010a = sVar;
    }

    @Override // androidx.compose.foundation.lazy.layout.K
    public final int a() {
        return ((d) kotlin.collections.q.V(this.f11011b.l().e())).getIndex();
    }

    @Override // androidx.compose.foundation.lazy.layout.K
    public final int b() {
        return this.f11011b.m();
    }

    @Override // androidx.compose.foundation.lazy.layout.K
    public final int c(int i10, int i11) {
        PagerState pagerState = this.f11011b;
        return (int) (Na.l.E(H3.c.e(pagerState) + ((long) Ka.a.b(((pagerState.o() * (i10 - pagerState.j())) - (pagerState.k() * pagerState.o())) + i11)), pagerState.f10936h, pagerState.f10935g) - H3.c.e(pagerState));
    }

    @Override // androidx.compose.foundation.lazy.layout.K
    public final void d(int i10, int i11) {
        PagerState pagerState = this.f11011b;
        pagerState.u(i11 / pagerState.o(), i10, true);
    }

    @Override // androidx.compose.foundation.lazy.layout.K
    public final int e() {
        return this.f11011b.f10934f;
    }

    @Override // androidx.compose.foundation.gestures.s
    public final float f(float f10) {
        return this.f11010a.f(f10);
    }

    @Override // androidx.compose.foundation.lazy.layout.K
    public final int g() {
        return this.f11011b.f10933e;
    }
}
