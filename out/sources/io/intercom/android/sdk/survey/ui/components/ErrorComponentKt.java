package io.intercom.android.sdk.survey.ui.components;

import Ia.p;
import S4.o;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0949i;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.layout.E;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.l;
import io.intercom.android.sdk.m5.components.C2274d;
import io.intercom.android.sdk.m5.components.J;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.C2331b;
import io.intercom.android.sdk.survey.SurveyState;
import io.intercom.android.sdk.survey.TopBarState;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: ErrorComponent.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ErrorComponentKt {
    public static final void ErrorStateWithCTA(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1921062712);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            int i11 = 0;
            int i12 = 1;
            SurveyError(new SurveyState.Error.WithCTA(i11, C4.a.g(null, null, 3, null), new TopBarState.NoTopBarState(true, C4.a.g(null, null, 3, null), null, 4, null), new C2331b(1), i12, null), null, c1086gP, 0, 2);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2274d(i10, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r ErrorStateWithCTA$lambda$3(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        ErrorStateWithCTA(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    public static final void ErrorStateWithoutCTA(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1056362620);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            int i11 = 0;
            int i12 = 1;
            SurveyError(new SurveyState.Error.WithoutCTA(i11, C4.a.g(null, null, 3, null), new TopBarState.NoTopBarState(true, C4.a.g(null, null, 3, null), null, 4, null), i12, null), null, c1086gP, 0, 2);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new J(i10, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r ErrorStateWithoutCTA$lambda$4(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        ErrorStateWithoutCTA(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0085  */
    /* JADX WARN: Code duplicated, block: B:37:0x0089  */
    /* JADX WARN: Code duplicated, block: B:40:0x009c  */
    /* JADX WARN: Code duplicated, block: B:42:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:45:0x0117  */
    /* JADX WARN: Code duplicated, block: B:49:0x0152  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    public static final void SurveyError(SurveyState.Error state, androidx.compose.ui.h hVar, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        int i12;
        androidx.compose.ui.h hVar2;
        androidx.compose.ui.h.a aVar;
        androidx.compose.ui.h hVar3;
        int i13;
        Ia.a<ComposeUiNode> aVar2;
        p<ComposeUiNode, Integer, r> pVar;
        C0949i c0949i;
        androidx.compose.ui.h hVar4;
        C1105p0 c1105p0V;
        kotlin.jvm.internal.i.e(state, "state");
        C1086g c1086gP = interfaceC1084f.p(805293226);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = i10 | (c1086gP.K(state) ? 4 : 2);
        } else {
            i12 = i10;
        }
        int i14 = i11 & 2;
        if (i14 == 0) {
            if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                hVar2 = hVar;
                i12 |= c1086gP.K(hVar2) ? 32 : 16;
            }
            if ((i12 & 91) == 18 || !c1086gP.s()) {
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i14 != 0) {
                    hVar3 = aVar;
                } else {
                    hVar3 = hVar2;
                }
                androidx.compose.ui.h hVarI = hVar3.i(W.f10226c);
                E eD = BoxKt.d(androidx.compose.ui.d.a.f13339e, false);
                i13 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
                androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarI);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i13))) {
                    J4.i.d(i13, c1086gP, i13, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
                c0949i = C0949i.f10304a;
                float f10 = 32;
                androidx.compose.ui.h hVar5 = hVar3;
                TextKt.b(o.p(c1086gP, state.getMessageResId()), c0949i.f(PaddingKt.g(f10, f10, aVar), androidx.compose.ui.d.a.f13336b), state.getSurveyUiColors().m360getOnBackground0d7_KjU(), G0.a.g(36), null, l.j, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, null, c1086gP, 199680, 0, 130512);
                c1086gP.L(-803498879);
                if (state instanceof SurveyState.Error.WithCTA) {
                    SurveyState.Error.WithCTA withCTA = (SurveyState.Error.WithCTA) state;
                    SurveyCtaButtonComponentKt.SurveyCtaButtonComponent(c0949i.f(PaddingKt.f(aVar, 16), androidx.compose.ui.d.a.f13342h), o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_retry), null, withCTA.getOnClick(), null, withCTA.getSurveyUiColors(), c1086gP, 0, 20);
                }
                c1086gP.T(false);
                c1086gP.T(true);
                hVar4 = hVar5;
            } else {
                c1086gP.w();
                hVar4 = hVar2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new io.intercom.android.sdk.m5.conversation.ui.components.row.p(state, hVar4, i10, i11, 1);
            }
        }
        i12 |= 48;
        hVar2 = hVar;
        if ((i12 & 91) == 18) {
            aVar = androidx.compose.ui.h.a.f13984b;
            if (i14 != 0) {
                hVar3 = aVar;
            } else {
                hVar3 = hVar2;
            }
            androidx.compose.ui.h hVarI2 = hVar3.i(W.f10226c);
            E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13339e, false);
            i13 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
            androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVarI2);
            ComposeUiNode.f14331c0.getClass();
            aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD2);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P2);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i13, c1086gP, i13, pVar);
            } else {
                J4.i.d(i13, c1086gP, i13, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC2);
            c0949i = C0949i.f10304a;
            float f11 = 32;
            androidx.compose.ui.h hVar6 = hVar3;
            TextKt.b(o.p(c1086gP, state.getMessageResId()), c0949i.f(PaddingKt.g(f11, f11, aVar), androidx.compose.ui.d.a.f13336b), state.getSurveyUiColors().m360getOnBackground0d7_KjU(), G0.a.g(36), null, l.j, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, null, c1086gP, 199680, 0, 130512);
            c1086gP.L(-803498879);
            if (state instanceof SurveyState.Error.WithCTA) {
                SurveyState.Error.WithCTA withCTA2 = (SurveyState.Error.WithCTA) state;
                SurveyCtaButtonComponentKt.SurveyCtaButtonComponent(c0949i.f(PaddingKt.f(aVar, 16), androidx.compose.ui.d.a.f13342h), o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_retry), null, withCTA2.getOnClick(), null, withCTA2.getSurveyUiColors(), c1086gP, 0, 20);
            }
            c1086gP.T(false);
            c1086gP.T(true);
            hVar4 = hVar6;
        } else {
            aVar = androidx.compose.ui.h.a.f13984b;
            if (i14 != 0) {
                hVar3 = aVar;
            } else {
                hVar3 = hVar2;
            }
            androidx.compose.ui.h hVarI3 = hVar3.i(W.f10226c);
            E eD3 = BoxKt.d(androidx.compose.ui.d.a.f13339e, false);
            i13 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
            androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, hVarI3);
            ComposeUiNode.f14331c0.getClass();
            aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD3);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P3);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i13, c1086gP, i13, pVar);
            } else {
                J4.i.d(i13, c1086gP, i13, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC3);
            c0949i = C0949i.f10304a;
            float f12 = 32;
            androidx.compose.ui.h hVar7 = hVar3;
            TextKt.b(o.p(c1086gP, state.getMessageResId()), c0949i.f(PaddingKt.g(f12, f12, aVar), androidx.compose.ui.d.a.f13336b), state.getSurveyUiColors().m360getOnBackground0d7_KjU(), G0.a.g(36), null, l.j, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, null, c1086gP, 199680, 0, 130512);
            c1086gP.L(-803498879);
            if (state instanceof SurveyState.Error.WithCTA) {
                SurveyState.Error.WithCTA withCTA3 = (SurveyState.Error.WithCTA) state;
                SurveyCtaButtonComponentKt.SurveyCtaButtonComponent(c0949i.f(PaddingKt.f(aVar, 16), androidx.compose.ui.d.a.f13342h), o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_retry), null, withCTA3.getOnClick(), null, withCTA3.getSurveyUiColors(), c1086gP, 0, 20);
            }
            c1086gP.T(false);
            c1086gP.T(true);
            hVar4 = hVar7;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new io.intercom.android.sdk.m5.conversation.ui.components.row.p(state, hVar4, i10, i11, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r SurveyError$lambda$1(SurveyState.Error state, androidx.compose.ui.h hVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(state, "$state");
        SurveyError(state, hVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return r.f47939a;
    }
}
