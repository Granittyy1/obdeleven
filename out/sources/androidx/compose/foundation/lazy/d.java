package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.M;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: LazyLayoutSemanticState.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d implements M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LazyListState f10388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f10389b;

    public d(LazyListState lazyListState, boolean z10) {
        this.f10388a = lazyListState;
        this.f10389b = z10;
    }

    @Override // androidx.compose.foundation.lazy.layout.M
    public final int a() {
        LazyListState lazyListState = this.f10388a;
        return (int) (lazyListState.j().getOrientation() == Orientation.f9957b ? lazyListState.j().a() & 4294967295L : lazyListState.j().a() >> 32);
    }

    @Override // androidx.compose.foundation.lazy.layout.M
    public final float b() {
        LazyListState lazyListState = this.f10388a;
        return (lazyListState.h() * 500) + lazyListState.i();
    }

    @Override // androidx.compose.foundation.lazy.layout.M
    public final int c() {
        LazyListState lazyListState = this.f10388a;
        return lazyListState.j().b() + lazyListState.j().c();
    }

    @Override // androidx.compose.foundation.lazy.layout.M
    public final float d() {
        LazyListState lazyListState = this.f10388a;
        int iH = lazyListState.h();
        int i10 = lazyListState.i();
        return lazyListState.d() ? (iH * 500) + i10 + 100 : (iH * 500) + i10;
    }

    @Override // androidx.compose.foundation.lazy.layout.M
    public final Object e(int i10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        Object objK = LazyListState.k(this.f10388a, i10, (SuspendLambda) cVar);
        return objK == CoroutineSingletons.f43038b ? objK : p293xa.r.f47939a;
    }

    @Override // androidx.compose.foundation.lazy.layout.M
    public final androidx.compose.ui.semantics.b f() {
        return this.f10389b ? new androidx.compose.ui.semantics.b(-1, 1) : new androidx.compose.ui.semantics.b(1, -1);
    }
}
