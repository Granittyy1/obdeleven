package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.M;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: compiled from: LazyLayoutSemanticState.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b implements M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PagerState f10956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f10957b;

    public b(PagerState pagerState, boolean z10) {
        this.f10956a = pagerState;
        this.f10957b = z10;
    }

    @Override // androidx.compose.foundation.lazy.layout.M
    public final int a() {
        PagerState pagerState = this.f10956a;
        return (int) (pagerState.l().getOrientation() == Orientation.f9957b ? pagerState.l().a() & 4294967295L : pagerState.l().a() >> 32);
    }

    @Override // androidx.compose.foundation.lazy.layout.M
    public final float b() {
        return H3.c.e(this.f10956a);
    }

    @Override // androidx.compose.foundation.lazy.layout.M
    public final int c() {
        PagerState pagerState = this.f10956a;
        return pagerState.l().b() + pagerState.l().c();
    }

    @Override // androidx.compose.foundation.lazy.layout.M
    public final float d() {
        PagerState pagerState = this.f10956a;
        return s.a(pagerState.l(), pagerState.m());
    }

    @Override // androidx.compose.foundation.lazy.layout.M
    public final Object e(int i10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        Object objT = PagerState.t(this.f10956a, i10, cVar);
        return objT == CoroutineSingletons.f43038b ? objT : p293xa.r.f47939a;
    }

    @Override // androidx.compose.foundation.lazy.layout.M
    public final androidx.compose.ui.semantics.b f() {
        boolean z10 = this.f10957b;
        PagerState pagerState = this.f10956a;
        return z10 ? new androidx.compose.ui.semantics.b(pagerState.m(), 1) : new androidx.compose.ui.semantics.b(1, pagerState.m());
    }
}
