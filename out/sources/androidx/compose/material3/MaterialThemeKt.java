package androidx.compose.material3;

import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material.ripple.RippleThemeKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1101n0;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.InterfaceC1084f;

/* JADX INFO: compiled from: MaterialTheme.kt */
/* JADX INFO: loaded from: classes.dex */
public final class MaterialThemeKt {
    static {
        CompositionLocalKt.d(new Ia.a<Boolean>() { // from class: androidx.compose.material3.MaterialThemeKt$LocalUsingExpressiveTheme$1
            @Override // Ia.a
            public final /* bridge */ /* synthetic */ Boolean invoke() {
                return Boolean.FALSE;
            }
        });
    }

    public static final void a(C1061m c1061m, c0 c0Var, q0 q0Var, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        final C1061m c1061m2;
        int i12;
        c0 c0Var2;
        final q0 q0Var2;
        final c0 c0Var3;
        C1086g c1086gP = interfaceC1084f.p(-2127166334);
        if ((i10 & 6) == 0) {
            if ((i11 & 1) == 0) {
                c1061m2 = c1061m;
                int i13 = c1086gP.K(c1061m2) ? 4 : 2;
                i12 = i13 | i10;
            } else {
                c1061m2 = c1061m;
            }
            i12 = i13 | i10;
        } else {
            c1061m2 = c1061m;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i11 & 2) == 0) {
                c0Var2 = c0Var;
                int i14 = c1086gP.K(c0Var2) ? 32 : 16;
                i12 |= i14;
            } else {
                c0Var2 = c0Var;
            }
            i12 |= i14;
        } else {
            c0Var2 = c0Var;
        }
        if ((i10 & 384) == 0) {
            if ((i11 & 4) == 0) {
                q0Var2 = q0Var;
                int i15 = c1086gP.K(q0Var2) ? 256 : 128;
                i12 |= i15;
            } else {
                q0Var2 = q0Var;
            }
            i12 |= i15;
        } else {
            q0Var2 = q0Var;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= c1086gP.k(pVar) ? 2048 : 1024;
        }
        if ((i12 & 1171) == 1170 && c1086gP.s()) {
            c1086gP.w();
            c0Var3 = c0Var2;
        } else {
            c1086gP.r0();
            if ((i10 & 1) == 0 || c1086gP.a0()) {
                if ((i11 & 1) != 0) {
                    c1061m2 = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                }
                c0Var3 = (i11 & 2) != 0 ? (c0) c1086gP.x(ShapesKt.f12298a) : c0Var2;
                if ((i11 & 4) != 0) {
                    q0Var2 = (q0) c1086gP.x(TypographyKt.f12404a);
                }
            } else {
                c1086gP.w();
                c0Var3 = c0Var2;
            }
            c1086gP.U();
            androidx.compose.foundation.v vVarC = RippleKt.c(false, 0.0f, c1086gP, 0, 7);
            long j = c1061m2.f12620a;
            boolean zI = c1086gP.i(j);
            Object objF = c1086gP.f();
            if (zI || objF == InterfaceC1084f.a.f12980a) {
                objF = new androidx.compose.foundation.text.selection.y(j, androidx.compose.ui.graphics.H.b(0.4f, j));
                c1086gP.E(objF);
            }
            CompositionLocalKt.b(new C1101n0[]{ColorSchemeKt.f12087a.b(c1061m2), IndicationKt.f9774a.b(vVarC), RippleThemeKt.f11968a.b(C1062n.f12650a), ShapesKt.f12298a.b(c0Var3), TextSelectionColorsKt.f11582a.b((androidx.compose.foundation.text.selection.y) objF), TypographyKt.f12404a.b(q0Var2)}, androidx.compose.runtime.internal.a.b(-1066563262, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.MaterialThemeKt$MaterialTheme$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                        interfaceC1084f3.w();
                    } else {
                        TextKt.a(q0Var2.j, pVar, interfaceC1084f3, 0);
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP), c1086gP, 56);
        }
        final q0 q0Var3 = q0Var2;
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.MaterialThemeKt$MaterialTheme$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    MaterialThemeKt.a(c1061m2, c0Var3, q0Var3, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }
}
