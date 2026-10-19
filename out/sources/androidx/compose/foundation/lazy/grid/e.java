package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.InterfaceC0976k;
import java.util.List;

/* JADX INFO: compiled from: LazyGridBeyondBoundsModifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e implements InterfaceC0976k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LazyGridState f10454a;

    public e(LazyGridState lazyGridState) {
        this.f10454a = lazyGridState;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0976k
    public final int b() {
        return this.f10454a.h().d();
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0976k
    public final int c() {
        return ((g) kotlin.collections.q.V(this.f10454a.h().f())).getIndex();
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0976k
    public final int d() {
        int i10;
        LazyGridState lazyGridState = this.f10454a;
        int i11 = 0;
        if (lazyGridState.h().f().isEmpty()) {
            return 0;
        }
        o oVarH = lazyGridState.h();
        Orientation orientation = oVarH.getOrientation();
        Orientation orientation2 = Orientation.f9957b;
        int iA = (int) (orientation == orientation2 ? oVarH.a() & 4294967295L : oVarH.a() >> 32);
        o oVarH2 = lazyGridState.h();
        boolean z10 = oVarH2.getOrientation() == orientation2;
        List<g> listF = oVarH2.f();
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < listF.size()) {
            g gVar = oVarH2.f().get(i12);
            int iK = z10 ? gVar.k() : gVar.o();
            if (iK == -1) {
                i12++;
            } else {
                int iMax = i11;
                while (i12 < listF.size()) {
                    g gVar2 = oVarH2.f().get(i12);
                    if ((z10 ? gVar2.k() : gVar2.o()) != iK) {
                        break;
                    }
                    iMax = Math.max(iMax, (int) (z10 ? listF.get(i12).a() & 4294967295L : listF.get(i12).a() >> 32));
                    i12++;
                    z10 = z10;
                }
                i13 += iMax;
                i14++;
                z10 = z10;
                i11 = 0;
            }
        }
        int iE = oVarH2.e() + (i13 / i14);
        if (iE != 0 && (i10 = iA / iE) >= 1) {
            return i10;
        }
        return 1;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0976k
    public final boolean e() {
        return !this.f10454a.h().f().isEmpty();
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0976k
    public final int f() {
        return this.f10454a.g();
    }
}
