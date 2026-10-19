package com.voltasit.obdeleven.presentation.screens.sfd;

import Ia.p;
import J4.n;
import S4.o;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.C0955o;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.W;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.d;
import androidx.compose.ui.f;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.h;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.style.g;
import com.voltasit.obdeleven.presentation.components.b;
import com.voltasit.obdeleven.presentation.components.c;
import com.voltasit.obdeleven.presentation.e;
import kotlin.jvm.internal.i;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: SfdPersonalInfoExplanation.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SfdPersonalInfoExplanationKt {
    public static final void a(final Ia.a<r> onClickNext, final Ia.a<r> onLearnMoreClicked, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086g;
        i.e(onClickNext, "onClickNext");
        i.e(onLearnMoreClicked, "onLearnMoreClicked");
        C1086g c1086gP = interfaceC1084f.p(259284761);
        if ((i10 & 14) == 0) {
            i11 = (c1086gP.k(onClickNext) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i11 |= c1086gP.k(onLearnMoreClicked) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && c1086gP.s()) {
            c1086gP.w();
            c1086g = c1086gP;
        } else {
            h.a aVar = h.a.f13984b;
            float f10 = 32;
            h hVarH = PaddingKt.h(aVar, f10, 0.0f, 2);
            float f11 = 16;
            h hVarB = ScrollKt.b(W.c(PaddingKt.j(aVar, 0.0f, 0.0f, 0.0f, f11, 7), 1.0f), ScrollKt.a(0, c1086gP, 0, 1), false, 14);
            C0953m c0953mA = C0952l.a(C0945e.f10286c, d.a.f13346m, c1086gP, 0);
            int i12 = c1086gP.f12996P;
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
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
            p<ComposeUiNode, Integer, r> pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i12))) {
                J4.i.d(i12, c1086gP, i12, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
            C0955o c0955o = C0955o.f10310a;
            Lb.a.a(c1086gP, W.e(aVar, 14));
            f.a aVar3 = d.a.f13347n;
            com.voltasit.obdeleven.presentation.components.a.a(c0955o.b(hVarH, aVar3), com.voltasit.obdeleven.R.drawable.ic_sfd_profile, 48, c1086gP, 0);
            float f12 = 28;
            String strC = n.c(aVar, f12, c1086gP, com.voltasit.obdeleven.R.string.view_sfd_personal_info_explanation_title, c1086gP);
            long jG = G0.a.g(20);
            l lVar = l.f15442g;
            TextKt.b(strC, hVarH, H.f13499f, jG, null, lVar, null, 0L, null, new g(3), 0L, 0, false, 0, 0, null, null, c1086gP, 200112, 0, 130512);
            c.a(hVarH, n.c(aVar, f12, c1086gP, com.voltasit.obdeleven.R.string.view_sfd_personal_info_explanation_content, c1086gP), c1086gP, 48, 0);
            Lb.a.a(c1086gP, c0955o.a(true));
            TextKt.b(o.p(c1086gP, com.voltasit.obdeleven.R.string.common_learn_more), ClickableKt.c(c0955o.b(aVar, aVar3), false, null, onLearnMoreClicked, 7), e.a.f32284g, G0.a.g(12), null, lVar, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 200064, 0, 131024);
            c1086g = c1086gP;
            b.a((i11 << 12) & 57344, 44, 0L, onClickNext, c1086gP, W.d(PaddingKt.h(c0955o.b(aVar, aVar3), f11, 0.0f, 2), 1.0f), n.c(aVar, f10, c1086gP, com.voltasit.obdeleven.R.string.common_next, c1086gP), false, false);
            c1086g.T(true);
        }
        C1105p0 c1105p0V = c1086g.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoExplanationKt$SfdPersonalInfoExplanationScreen$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    SfdPersonalInfoExplanationKt.a(onClickNext, onLearnMoreClicked, interfaceC1084f2, L4.b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }
}
