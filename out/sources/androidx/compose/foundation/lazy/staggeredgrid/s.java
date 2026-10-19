package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.M;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: compiled from: LazyStaggeredGridSemantics.kt */
/* JADX INFO: loaded from: classes.dex */
public final class s implements M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LazyStaggeredGridState f10895a;

    public s(LazyStaggeredGridState lazyStaggeredGridState) {
        this.f10895a = lazyStaggeredGridState;
    }

    @Override // androidx.compose.foundation.lazy.layout.M
    public final int a() {
        LazyStaggeredGridState lazyStaggeredGridState = this.f10895a;
        return (int) (lazyStaggeredGridState.g().getOrientation() == Orientation.f9957b ? lazyStaggeredGridState.g().a() & 4294967295L : lazyStaggeredGridState.g().a() >> 32);
    }

    @Override // androidx.compose.foundation.lazy.layout.M
    public final float b() {
        LazyStaggeredGridState lazyStaggeredGridState = this.f10895a;
        return (lazyStaggeredGridState.f10791c.f10889c.o() * 500) + lazyStaggeredGridState.f10791c.f10891e.o();
    }

    @Override // androidx.compose.foundation.lazy.layout.M
    public final int c() {
        LazyStaggeredGridState lazyStaggeredGridState = this.f10895a;
        return lazyStaggeredGridState.g().b() + lazyStaggeredGridState.g().c();
    }

    @Override // androidx.compose.foundation.lazy.layout.M
    public final float d() {
        LazyStaggeredGridState lazyStaggeredGridState = this.f10895a;
        int iO = lazyStaggeredGridState.f10791c.f10889c.o();
        int iO2 = lazyStaggeredGridState.f10791c.f10891e.o();
        return lazyStaggeredGridState.d() ? (iO * 500) + iO2 + 100 : (iO * 500) + iO2;
    }

    @Override // androidx.compose.foundation.lazy.layout.M
    public final Object e(int i10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        W.f fVar = LazyStaggeredGridState.f10788x;
        LazyStaggeredGridState lazyStaggeredGridState = this.f10895a;
        lazyStaggeredGridState.getClass();
        Object objB = lazyStaggeredGridState.b(MutatePriority.f9810b, new LazyStaggeredGridState$scrollToItem$2(lazyStaggeredGridState, i10, 0, null), cVar);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (objB != coroutineSingletons) {
            objB = p293xa.r.f47939a;
        }
        return objB == coroutineSingletons ? objB : p293xa.r.f47939a;
    }

    @Override // androidx.compose.foundation.lazy.layout.M
    public final androidx.compose.ui.semantics.b f() {
        return new androidx.compose.ui.semantics.b(-1, -1);
    }
}
