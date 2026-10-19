package androidx.compose.foundation.interaction;

import Ia.p;
import androidx.compose.runtime.E;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.X;

/* JADX INFO: compiled from: FocusInteraction.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static final X a(j jVar, InterfaceC1084f interfaceC1084f, int i10) {
        Object objF = interfaceC1084f.f();
        InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
        if (objF == c0153a) {
            objF = J0.f(Boolean.FALSE);
            interfaceC1084f.E(objF);
        }
        X x10 = (X) objF;
        boolean z10 = (((i10 & 14) ^ 6) > 4 && interfaceC1084f.K(jVar)) || (i10 & 6) == 4;
        Object objF2 = interfaceC1084f.f();
        if (z10 || objF2 == c0153a) {
            objF2 = new FocusInteractionKt$collectIsFocusedAsState$1$1(jVar, x10, null);
            interfaceC1084f.E(objF2);
        }
        E.d((p) objF2, interfaceC1084f, jVar);
        return x10;
    }
}
