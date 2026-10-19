package com.voltasit.obdeleven.presentation.screens.sfd;

import Ia.p;
import J4.n;
import L4.b;
import S4.o;
import U.c;
import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0946f;
import androidx.compose.foundation.layout.C0949i;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.C0955o;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.W;
import androidx.compose.material.C1034j;
import androidx.compose.material.ColorsKt;
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
import androidx.compose.ui.layout.E;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.l;
import com.voltasit.obdeleven.presentation.dialogs.LoaderDialogKt;
import com.voltasit.obdeleven.presentation.e;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import kotlin.jvm.internal.i;
import me.zhanghai.android.materialprogressbar.R;
import p270w.g;
import p293xa.r;

/* JADX INFO: compiled from: SfdWizardHome.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SfdWizardHomeKt {
    public static final void a(final String str, final String str2, final boolean z10, final h hVar, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(-1239332856);
        if ((i10 & 14) == 0) {
            i11 = (c1086gP.K(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i11 |= c1086gP.K(str2) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= c1086gP.c(z10) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= c1086gP.K(hVar) ? 2048 : 1024;
        }
        if ((i11 & 5851) == 1170 && c1086gP.s()) {
            c1086gP.w();
        } else {
            T tA = S.a(C0945e.f10284a, d.a.j, c1086gP, 0);
            int i12 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            h hVarC = ComposedModifierKt.c(c1086gP, hVar);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar);
            } else {
                c1086gP.A();
            }
            p<ComposeUiNode, E, r> pVar = ComposeUiNode.Companion.f14337f;
            R0.a(pVar, c1086gP, tA);
            p<ComposeUiNode, androidx.compose.runtime.r, r> pVar2 = ComposeUiNode.Companion.f14336e;
            R0.a(pVar2, c1086gP, interfaceC1089h0P);
            p<ComposeUiNode, Integer, r> pVar3 = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i12))) {
                J4.i.d(i12, c1086gP, i12, pVar3);
            }
            p<ComposeUiNode, h, r> pVar4 = ComposeUiNode.Companion.f14335d;
            R0.a(pVar4, c1086gP, hVarC);
            h.a aVar2 = h.a.f13984b;
            float f10 = 24;
            h hVarQ = W.q(W.e(aVar2, f10), f10);
            c1086gP.L(1824786486);
            long jG = z10 ? ((C1034j) c1086gP.x(ColorsKt.f11693a)).g() : e.a.f32278a;
            c1086gP.T(false);
            h hVarA = C0946f.a(C0932d.b(hVarQ, jG, g.f47680a));
            E eD = BoxKt.d(d.a.f13335a, false);
            int i13 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
            h hVarC2 = ComposedModifierKt.c(c1086gP, hVarA);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar);
            } else {
                c1086gP.A();
            }
            R0.a(pVar, c1086gP, eD);
            R0.a(pVar2, c1086gP, interfaceC1089h0P2);
            if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i13))) {
                J4.i.d(i13, c1086gP, i13, pVar3);
            }
            R0.a(pVar4, c1086gP, hVarC2);
            TextKt.b(str, C0949i.f10304a.f(aVar2, d.a.f13339e), z10 ? e.a.f32279b : e.a.f32280c, G0.a.g(14), null, l.f15445k, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i11 & 14) | 199680, 0, 131024);
            c1086gP.T(true);
            Lb.a.a(c1086gP, W.q(aVar2, 16));
            C0953m c0953mA = C0952l.a(C0945e.f10286c, d.a.f13346m, c1086gP, 0);
            int i14 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
            h hVarC3 = ComposedModifierKt.c(c1086gP, aVar2);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar);
            } else {
                c1086gP.A();
            }
            R0.a(pVar, c1086gP, c0953mA);
            R0.a(pVar2, c1086gP, interfaceC1089h0P3);
            if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i14))) {
                J4.i.d(i14, c1086gP, i14, pVar3);
            }
            R0.a(pVar4, c1086gP, hVarC3);
            TextKt.b(str2, null, ((C1034j) c1086gP.x(ColorsKt.f11693a)).c(), G0.a.g(16), null, l.f15443h, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, ((i11 >> 3) & 14) | 199680, 0, 131026);
            c1086gP.T(true);
            if (1.0f <= 0.0d) {
                p258v.a.a("invalid weight; must be greater than zero");
            }
            Lb.a.a(c1086gP, new LayoutWeightElement(true, Na.l.z(1.0f, Float.MAX_VALUE)));
            ImageKt.a(c.a(z10 ? com.voltasit.obdeleven.R.drawable.ic_checkbox : com.voltasit.obdeleven.R.drawable.ic_minus, c1086gP, 0), null, W.q(W.e(aVar2, f10), f10), null, null, 0.0f, null, c1086gP, 440, R.styleable.AppCompatTheme_windowFixedHeightMajor);
            c1086gP.T(true);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardHomeKt$SetupStep$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    SfdWizardHomeKt.a(str, str2, z10, hVar, interfaceC1084f2, b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }

    public static final void b(final boolean z10, final boolean z11, final boolean z12, final PreloaderState loaderState, final Ia.a<r> onClickContinue, final Ia.a<r> onLearnMoreClicked, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        int i12;
        C1086g c1086g;
        i.e(loaderState, "loaderState");
        i.e(onClickContinue, "onClickContinue");
        i.e(onLearnMoreClicked, "onLearnMoreClicked");
        C1086g c1086gP = interfaceC1084f.p(607830454);
        if ((i10 & 14) == 0) {
            i11 = (c1086gP.c(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i11 |= c1086gP.c(z11) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= c1086gP.c(z12) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= c1086gP.K(loaderState) ? 2048 : 1024;
        }
        if ((i10 & 57344) == 0) {
            i11 |= c1086gP.k(onClickContinue) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i11 |= c1086gP.k(onLearnMoreClicked) ? 131072 : 65536;
        }
        int i13 = i11;
        if ((374491 & i13) == 74898 && c1086gP.s()) {
            c1086gP.w();
            c1086g = c1086gP;
        } else {
            LoaderDialogKt.a(loaderState, c1086gP, (i13 >> 9) & 14);
            h.a aVar = h.a.f13984b;
            float f10 = 32;
            h hVarH = PaddingKt.h(aVar, f10, 0.0f, 2);
            float f11 = 16;
            h hVarB = ScrollKt.b(W.c(PaddingKt.j(aVar, 0.0f, 0.0f, 0.0f, f11, 7), 1.0f), ScrollKt.a(0, c1086gP, 0, 1), false, 14);
            C0953m c0953mA = C0952l.a(C0945e.f10286c, d.a.f13346m, c1086gP, 0);
            int i14 = c1086gP.f12996P;
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
            if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i14))) {
                J4.i.d(i14, c1086gP, i14, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
            C0955o c0955o = C0955o.f10310a;
            Lb.a.a(c1086gP, W.e(aVar, 14));
            f.a aVar3 = d.a.f13347n;
            com.voltasit.obdeleven.presentation.components.a.a(c0955o.b(hVarH, aVar3), com.voltasit.obdeleven.R.drawable.ic_sfd_vehicle, 48, c1086gP, 0);
            float f12 = 28;
            Lb.a.a(c1086gP, W.e(aVar, f12));
            String strP = o.p(c1086gP, (z11 && z12) ? com.voltasit.obdeleven.R.string.view_sfd_intro_required_by_sfd_provided : com.voltasit.obdeleven.R.string.view_sfd_intro_security_levels);
            long jG = G0.a.g(20);
            l lVar = l.f15442g;
            TextKt.b(strP, hVarH, H.f13499f, jG, null, lVar, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, null, c1086gP, 200112, 0, 130512);
            a("1", n.c(aVar, f12, c1086gP, com.voltasit.obdeleven.R.string.view_sfd_intro_confirm_email_address, c1086gP), z10, hVarH, c1086gP, ((i13 << 6) & 896) | 3078);
            a("2", n.c(aVar, f12, c1086gP, com.voltasit.obdeleven.R.string.view_sfd_intro_two_step_auth, c1086gP), z11, hVarH, c1086gP, ((i13 << 3) & 896) | 3078);
            a("3", n.c(aVar, f12, c1086gP, com.voltasit.obdeleven.R.string.view_sfd_intro_update_account_info, c1086gP), z12, hVarH, c1086gP, (i13 & 896) | 3078);
            Lb.a.a(c1086gP, c0955o.a(true));
            TextKt.b(o.p(c1086gP, com.voltasit.obdeleven.R.string.common_learn_more), ClickableKt.c(c0955o.b(aVar, aVar3), false, null, onLearnMoreClicked, 7), e.a.f32284g, G0.a.g(12), null, lVar, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 200064, 0, 131024);
            Lb.a.a(c1086gP, W.e(aVar, f10));
            if (z10 && z11 && z12) {
                i12 = com.voltasit.obdeleven.R.string.common_finish;
            } else {
                i12 = (z10 || z11 || z12) ? com.voltasit.obdeleven.R.string.common_continue : com.voltasit.obdeleven.R.string.common_start;
            }
            c1086g = c1086gP;
            com.voltasit.obdeleven.presentation.components.b.a(i13 & 57344, 44, 0L, onClickContinue, c1086g, W.d(PaddingKt.h(c0955o.b(aVar, aVar3), f11, 0.0f, 2), 1.0f), o.p(c1086gP, i12), false, false);
            c1086g.T(true);
        }
        C1105p0 c1105p0V = c1086g.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardHomeKt$SfdWizardHome$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    SfdWizardHomeKt.b(z10, z11, z12, loaderState, onClickContinue, onLearnMoreClicked, interfaceC1084f2, b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }
}
