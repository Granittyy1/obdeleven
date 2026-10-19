package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.InterfaceC0976k;

/* JADX INFO: compiled from: PagerBeyondBoundsModifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f implements InterfaceC0976k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PagerState f10972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10973b;

    public f(PagerState pagerState, int i10) {
        this.f10972a = pagerState;
        this.f10973b = i10;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0976k
    public final int b() {
        return this.f10972a.m();
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0976k
    public final int c() {
        PagerState pagerState = this.f10972a;
        return Math.min(pagerState.m() - 1, ((d) kotlin.collections.q.V(pagerState.l().e())).getIndex() + this.f10973b);
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0976k
    public final int d() {
        int i10;
        PagerState pagerState = this.f10972a;
        if (pagerState.l().e().size() == 0) {
            return 0;
        }
        i iVarL = pagerState.l();
        int iA = (int) (iVarL.getOrientation() == Orientation.f9957b ? iVarL.a() & 4294967295L : iVarL.a() >> 32);
        int iG = pagerState.l().g() + pagerState.l().f();
        if (iG != 0 && (i10 = iA / iG) >= 1) {
            return i10;
        }
        return 1;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0976k
    public final boolean e() {
        return !this.f10972a.l().e().isEmpty();
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0976k
    public final int f() {
        return Math.max(0, this.f10972a.f10933e - this.f10973b);
    }
}
