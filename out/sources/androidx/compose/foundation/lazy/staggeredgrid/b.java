package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.InterfaceC0976k;
import java.util.List;

/* JADX INFO: compiled from: LazyStaggeredGridBeyondBoundsModifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b implements InterfaceC0976k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LazyStaggeredGridState f10813a;

    public b(LazyStaggeredGridState lazyStaggeredGridState) {
        this.f10813a = lazyStaggeredGridState;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0976k
    public final int b() {
        return this.f10813a.g().d();
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0976k
    public final int c() {
        return ((e) kotlin.collections.q.V(this.f10813a.g().f())).getIndex();
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0976k
    public final int d() {
        int i10;
        LazyStaggeredGridState lazyStaggeredGridState = this.f10813a;
        int iE = 0;
        if (lazyStaggeredGridState.g().f().isEmpty()) {
            return 0;
        }
        j jVarG = lazyStaggeredGridState.g();
        n nVar = o.f10866a;
        int iA = (int) (jVarG.getOrientation() == Orientation.f9957b ? jVarG.a() & 4294967295L : jVarG.a() >> 32);
        j jVarG2 = lazyStaggeredGridState.g();
        List<e> listF = jVarG2.f();
        if (!listF.isEmpty()) {
            int size = listF.size();
            int iA2 = 0;
            while (iE < size) {
                e eVar = listF.get(iE);
                iA2 += (int) (jVarG2.getOrientation() == Orientation.f9957b ? eVar.a() & 4294967295L : eVar.a() >> 32);
                iE++;
            }
            iE = jVarG2.e() + (iA2 / listF.size());
        }
        if (iE != 0 && (i10 = iA / iE) >= 1) {
            return i10;
        }
        return 1;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0976k
    public final boolean e() {
        return !this.f10813a.g().f().isEmpty();
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0976k
    public final int f() {
        return this.f10813a.f10791c.f10889c.o();
    }
}
