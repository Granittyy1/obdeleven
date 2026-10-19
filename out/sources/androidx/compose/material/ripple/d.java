package androidx.compose.material.ripple;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.X;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: compiled from: Ripple.android.kt */
/* JADX INFO: loaded from: classes.dex */
@p293xa.d
public final class d extends e {
    public d() {
        throw null;
    }

    @Override // androidx.compose.material.ripple.e
    public final a c(androidx.compose.foundation.interaction.j jVar, boolean z10, float f10, X x10, X x11, InterfaceC1084f interfaceC1084f, int i10) {
        interfaceC1084f.L(331259447);
        ViewGroup viewGroupD = C.e.d((View) interfaceC1084f.x(AndroidCompositionLocals_androidKt.f14797f));
        boolean zK = ((((i10 & 14) ^ 6) > 4 && interfaceC1084f.K(jVar)) || (i10 & 6) == 4) | ((((458752 & i10) ^ 196608) > 131072 && interfaceC1084f.K(this)) || (i10 & 196608) == 131072) | interfaceC1084f.K(viewGroupD);
        Object objF = interfaceC1084f.f();
        if (zK || objF == InterfaceC1084f.a.f12980a) {
            objF = new a(z10, f10, x10, x11, viewGroupD);
            interfaceC1084f.E(objF);
        }
        a aVar = (a) objF;
        interfaceC1084f.D();
        return aVar;
    }
}
