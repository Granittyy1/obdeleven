package androidx.compose.foundation;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.InterfaceC1084f;

/* JADX INFO: compiled from: Scroll.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ScrollKt {
    public static final ScrollState a(final int i10, InterfaceC1084f interfaceC1084f, int i11, int i12) {
        boolean z10 = true;
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        Object[] objArr = new Object[0];
        W.f fVar = ScrollState.f9823i;
        if ((((i11 & 14) ^ 6) <= 4 || !interfaceC1084f.h(i10)) && (i11 & 6) != 4) {
            z10 = false;
        }
        Object objF = interfaceC1084f.f();
        if (z10 || objF == InterfaceC1084f.a.f12980a) {
            objF = new Ia.a<ScrollState>() { // from class: androidx.compose.foundation.ScrollKt$rememberScrollState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final ScrollState invoke() {
                    return new ScrollState(i10);
                }
            };
            interfaceC1084f.E(objF);
        }
        return (ScrollState) androidx.compose.runtime.saveable.b.c(objArr, fVar, null, (Ia.a) objF, interfaceC1084f, 0, 4);
    }

    public static androidx.compose.ui.h b(androidx.compose.ui.h hVar, ScrollState scrollState, boolean z10, int i10) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return K.a(hVar, scrollState, Orientation.f9957b, z10, false, null, scrollState.f9826c, true, null, null).i(new ScrollingLayoutElement(scrollState, false));
    }
}
