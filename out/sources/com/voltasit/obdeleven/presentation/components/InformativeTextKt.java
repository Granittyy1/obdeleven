package com.voltasit.obdeleven.presentation.components;

import Ia.p;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.W;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.A;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.h;
import androidx.compose.ui.node.ComposeUiNode;
import com.voltasit.obdeleven.presentation.e;
import kotlin.jvm.internal.i;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: InformativeText.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class InformativeTextKt {
    public static final void a(h hVar, final String informationText, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        final h hVar2;
        int i12;
        C1086g c1086g;
        i.e(informationText, "informationText");
        C1086g c1086gP = interfaceC1084f.p(-1877470857);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            hVar2 = hVar;
        } else if ((i10 & 14) == 0) {
            hVar2 = hVar;
            i12 = (c1086gP.K(hVar2) ? 4 : 2) | i10;
        } else {
            hVar2 = hVar;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i12 |= c1086gP.K(informationText) ? 32 : 16;
        }
        int i14 = i12;
        if ((i14 & 91) == 18 && c1086gP.s()) {
            c1086gP.w();
            c1086g = c1086gP;
        } else {
            h.a aVar = h.a.f13984b;
            h hVar3 = i13 != 0 ? aVar : hVar2;
            T tA = S.a(C0945e.f10284a, androidx.compose.ui.d.a.j, c1086gP, 0);
            int i15 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            h hVarC = ComposedModifierKt.c(c1086gP, hVar3);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
            p<ComposeUiNode, Integer, r> pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i15))) {
                J4.i.d(i15, c1086gP, i15, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
            Painter painterA = U.c.a(com.voltasit.obdeleven.R.drawable.ic_about, c1086gP, 6);
            h hVarM = W.m(aVar, 24);
            long j = e.a.f32283f;
            ImageKt.a(painterA, "", hVarM, null, null, 0.0f, new A(5, j), c1086gP, 1573304, 56);
            Lb.a.a(c1086gP, W.q(aVar, 16));
            h hVar4 = hVar3;
            TextKt.b(informationText, null, j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, ((i14 >> 3) & 14) | 384, 0, 131066);
            c1086g = c1086gP;
            c1086g.T(true);
            hVar2 = hVar4;
        }
        C1105p0 c1105p0V = c1086g.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.components.InformativeTextKt$InformativeText$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    InformativeTextKt.a(hVar2, informationText, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return r.f47939a;
                }
            };
        }
    }
}
