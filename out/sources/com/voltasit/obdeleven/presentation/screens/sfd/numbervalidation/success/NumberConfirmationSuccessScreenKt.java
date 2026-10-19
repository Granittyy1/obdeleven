package com.voltasit.obdeleven.presentation.screens.sfd.numbervalidation.success;

import Ia.a;
import Ia.p;
import J4.n;
import S4.o;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.C0955o;
import androidx.compose.foundation.layout.InterfaceC0954n;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.W;
import androidx.compose.material.C1034j;
import androidx.compose.material.ColorsKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.O0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.d;
import androidx.compose.ui.f;
import androidx.compose.ui.h;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.style.g;
import com.voltasit.obdeleven.presentation.components.b;
import com.voltasit.obdeleven.presentation.e;
import kotlin.jvm.internal.i;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: NumberConfirmationSuccessScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class NumberConfirmationSuccessScreenKt {
    public static final void a(final InterfaceC0954n interfaceC0954n, final String str, final a<r> aVar, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086g;
        C1086g c1086gP = interfaceC1084f.p(-1183371771);
        if ((i10 & 14) == 0) {
            i11 = (c1086gP.K(interfaceC0954n) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i11 |= c1086gP.K(str) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= c1086gP.k(aVar) ? 256 : 128;
        }
        if ((i11 & 731) == 146 && c1086gP.s()) {
            c1086gP.w();
            c1086g = c1086gP;
        } else {
            h.a aVar2 = h.a.f13984b;
            Lb.a.a(c1086gP, W.e(aVar2, 14));
            d.b bVar = d.a.f13347n;
            com.voltasit.obdeleven.presentation.components.a.a(interfaceC0954n.b(aVar2, bVar), com.voltasit.obdeleven.R.drawable.phone_number_confirmed, 48, c1086gP, 0);
            float f10 = 28;
            String strC = n.c(aVar2, f10, c1086gP, com.voltasit.obdeleven.R.string.view_number_confirmation_mobile_confirmed, c1086gP);
            long jG = G0.a.g(20);
            l lVar = l.f15442g;
            O0 o10 = ColorsKt.f11693a;
            TextKt.b(strC, null, ((C1034j) c1086gP.x(o10)).d(), jG, null, lVar, null, 0L, null, new g(3), 0L, 0, false, 0, 0, null, null, c1086gP, 199680, 0, 130514);
            TextKt.b(n.c(aVar2, f10, c1086gP, com.voltasit.obdeleven.R.string.view_number_confirmation_mobile_set_to, c1086gP), null, ((C1034j) c1086gP.x(o10)).d(), G0.a.g(16), null, l.f15443h, null, 0L, null, new g(3), 0L, 0, false, 0, 0, null, null, c1086gP, 199680, 0, 130514);
            TextKt.b(str, null, e.a.f32291o, G0.a.g(16), null, null, null, 0L, null, new g(3), 0L, 0, false, 0, 0, null, null, c1086gP, (14 & (i11 >> 3)) | 3456, 0, 130546);
            c1086g = c1086gP;
            Lb.a.a(c1086g, interfaceC0954n.a(true));
            b.a((57344 & (i11 << 6)) | 384, 40, e.a.j, aVar, c1086g, W.d(interfaceC0954n.b(aVar2, bVar), 1.0f), o.p(c1086g, com.voltasit.obdeleven.R.string.common_done), false, false);
            Lb.a.a(c1086g, W.e(aVar2, 16));
        }
        C1105p0 c1105p0V = c1086g.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.numbervalidation.success.NumberConfirmationSuccessScreenKt$Content$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    NumberConfirmationSuccessScreenKt.a(interfaceC0954n, str, aVar, interfaceC1084f2, L4.b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }

    public static final void b(final String mobile, final a<r> onDoneClick, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        i.e(mobile, "mobile");
        i.e(onDoneClick, "onDoneClick");
        C1086g c1086gP = interfaceC1084f.p(2116014653);
        if ((i10 & 14) == 0) {
            i11 = (c1086gP.K(mobile) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i11 |= c1086gP.k(onDoneClick) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && c1086gP.s()) {
            c1086gP.w();
        } else {
            f.a aVar = d.a.f13347n;
            h hVarB = ScrollKt.b(PaddingKt.h(h.a.f13984b, 16, 0.0f, 2).i(W.f10226c), ScrollKt.a(0, c1086gP, 0, 1), false, 14);
            C0953m c0953mA = C0952l.a(C0945e.f10286c, aVar, c1086gP, 48);
            int i12 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            h hVarC = ComposedModifierKt.c(c1086gP, hVarB);
            ComposeUiNode.f14331c0.getClass();
            a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
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
            int i13 = i11 << 3;
            a(C0955o.f10310a, mobile, onDoneClick, c1086gP, (i13 & 896) | (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6);
            c1086gP.T(true);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.numbervalidation.success.NumberConfirmationSuccessScreenKt$NumberConfirmationSuccessScreen$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    NumberConfirmationSuccessScreenKt.b(mobile, onDoneClick, interfaceC1084f2, L4.b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }
}
