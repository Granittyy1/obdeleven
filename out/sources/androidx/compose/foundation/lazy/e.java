package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.InterfaceC0976k;

/* JADX INFO: compiled from: LazyListBeyondBoundsModifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e implements InterfaceC0976k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LazyListState f10390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10391b;

    public e(LazyListState lazyListState, int i10) {
        this.f10390a = lazyListState;
        this.f10391b = i10;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0976k
    public final int b() {
        return this.f10390a.j().d();
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0976k
    public final int c() {
        return Math.min(b() - 1, ((g) kotlin.collections.q.V(this.f10390a.j().f())).getIndex() + this.f10391b);
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0976k
    public final int d() {
        int i10;
        LazyListState lazyListState = this.f10390a;
        if (lazyListState.j().f().isEmpty()) {
            return 0;
        }
        k kVarJ = lazyListState.j();
        int iA = (int) (kVarJ.getOrientation() == Orientation.f9957b ? kVarJ.a() & 4294967295L : kVarJ.a() >> 32);
        int iM = H3.c.m(lazyListState.j());
        if (iM != 0 && (i10 = iA / iM) >= 1) {
            return i10;
        }
        return 1;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0976k
    public final boolean e() {
        return !this.f10390a.j().f().isEmpty();
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0976k
    public final int f() {
        return Math.max(0, this.f10390a.h() - this.f10391b);
    }
}
