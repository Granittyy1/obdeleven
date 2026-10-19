package androidx.compose.foundation;

import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;

/* JADX INFO: compiled from: Canvas.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CanvasKt {
    public static final void a(final androidx.compose.ui.h hVar, final Ia.l<? super J.e, p293xa.r> lVar, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(-932836462);
        if ((i10 & 6) == 0) {
            i11 = (c1086gP.K(hVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c1086gP.k(lVar) ? 32 : 16;
        }
        if (c1086gP.C(i11 & 1, (i11 & 19) != 18)) {
            Lb.a.a(c1086gP, androidx.compose.ui.draw.f.a(hVar, lVar));
        } else {
            c1086gP.w();
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.CanvasKt$Canvas$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    CanvasKt.a(hVar, lVar, interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }
}
