package com.voltasit.obdeleven.presentation.components;

import Ia.p;
import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0949i;
import androidx.compose.foundation.layout.W;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.h;
import androidx.compose.ui.layout.E;
import androidx.compose.ui.node.ComposeUiNode;
import com.voltasit.obdeleven.presentation.e;
import kotlin.jvm.internal.i;
import me.zhanghai.android.materialprogressbar.R;
import p270w.g;
import p293xa.r;

/* JADX INFO: compiled from: CircleHeader.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static final void a(final h hVar, final int i10, final int i11, InterfaceC1084f interfaceC1084f, final int i12) {
        int i13;
        C1086g c1086gP = interfaceC1084f.p(-1424781485);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (c1086gP.K(hVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i13 |= c1086gP.h(i10) ? 32 : 16;
        }
        if ((i13 & 91) == 18 && c1086gP.s()) {
            c1086gP.w();
        } else {
            h.a aVar = h.a.f13984b;
            if (i14 != 0) {
                hVar = aVar;
            }
            float f10 = R.styleable.AppCompatTheme_windowFixedHeightMajor;
            h hVarB = C0932d.b(W.q(W.e(hVar, f10), f10), e.a.f32282e, g.f47680a);
            E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
            int i15 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            h hVarC = ComposedModifierKt.c(c1086gP, hVarB);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
            p<ComposeUiNode, Integer, r> pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i15))) {
                J4.i.d(i15, c1086gP, i15, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
            ImageKt.a(U.c.a(i10, c1086gP, (i13 >> 3) & 14), null, C0949i.f10304a.f(aVar, androidx.compose.ui.d.a.f13339e), null, null, 0.0f, null, c1086gP, 56, R.styleable.AppCompatTheme_windowFixedHeightMajor);
            c1086gP.T(true);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.components.CircleHeaderKt$CircleHeader$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    a.a(hVar, i10, L4.b.l(i11 | 1), interfaceC1084f2, i12);
                    return r.f47939a;
                }
            };
        }
    }
}
