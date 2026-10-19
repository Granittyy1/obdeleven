package androidx.compose.foundation.gestures;

import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.X;

/* JADX INFO: compiled from: ScrollableState.kt */
/* JADX INFO: loaded from: classes.dex */
public final class v {
    public static final u a(Ia.l lVar, InterfaceC1084f interfaceC1084f) {
        final X xI = J0.i(lVar, interfaceC1084f);
        Object objF = interfaceC1084f.f();
        if (objF == InterfaceC1084f.a.f12980a) {
            DefaultScrollableState defaultScrollableState = new DefaultScrollableState(new Ia.l<Float, Float>() { // from class: androidx.compose.foundation.gestures.ScrollableStateKt$rememberScrollableState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // Ia.l
                public final Float invoke(Float f10) {
                    return xI.getValue().invoke(Float.valueOf(f10.floatValue()));
                }
            });
            interfaceC1084f.E(defaultScrollableState);
            objF = defaultScrollableState;
        }
        return (u) objF;
    }
}
