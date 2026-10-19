package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.M;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: LazySemantics.kt */
/* JADX INFO: loaded from: classes.dex */
public final class z implements M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LazyGridState f10537a;

    public z(LazyGridState lazyGridState) {
        this.f10537a = lazyGridState;
    }

    @Override // androidx.compose.foundation.lazy.layout.M
    public final int a() {
        LazyGridState lazyGridState = this.f10537a;
        return (int) (lazyGridState.h().getOrientation() == Orientation.f9957b ? lazyGridState.h().a() & 4294967295L : lazyGridState.h().a() >> 32);
    }

    @Override // androidx.compose.foundation.lazy.layout.M
    public final float b() {
        LazyGridState lazyGridState = this.f10537a;
        return (lazyGridState.g() * 500) + lazyGridState.f10420d.f10531b.o();
    }

    @Override // androidx.compose.foundation.lazy.layout.M
    public final int c() {
        LazyGridState lazyGridState = this.f10537a;
        return lazyGridState.h().b() + lazyGridState.h().c();
    }

    @Override // androidx.compose.foundation.lazy.layout.M
    public final float d() {
        LazyGridState lazyGridState = this.f10537a;
        int iG = lazyGridState.g();
        int iO = lazyGridState.f10420d.f10531b.o();
        return lazyGridState.d() ? (iG * 500) + iO + 100 : (iG * 500) + iO;
    }

    @Override // androidx.compose.foundation.lazy.layout.M
    public final Object e(int i10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        Object objI = LazyGridState.i(this.f10537a, i10, (SuspendLambda) cVar);
        return objI == CoroutineSingletons.f43038b ? objI : p293xa.r.f47939a;
    }

    @Override // androidx.compose.foundation.lazy.layout.M
    public final androidx.compose.ui.semantics.b f() {
        return new androidx.compose.ui.semantics.b(-1, -1);
    }
}
