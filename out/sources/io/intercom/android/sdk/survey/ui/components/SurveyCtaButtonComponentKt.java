package io.intercom.android.sdk.survey.ui.components;

import Ia.l;
import Ia.p;
import androidx.compose.animation.k;
import androidx.compose.foundation.C0937i;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.N;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.U;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.C1050e;
import androidx.compose.material3.C1051f;
import androidx.compose.material3.C1052g;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.layout.E;
import androidx.compose.ui.node.ComposeUiNode;
import com.google.android.gms.internal.measurement.C1787c0;
import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.sdk.m5.components.C2287j0;
import io.intercom.android.sdk.m5.conversation.ui.components.row.z;
import io.intercom.android.sdk.m5.home.ui.components.q;
import io.intercom.android.sdk.m5.navigation.X;
import io.intercom.android.sdk.survey.SurveyState;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.ui.components.icons.LaunchKt;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: SurveyCtaButtonComponent.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SurveyCtaButtonComponentKt {
    public static final void DarkButtonPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-41399177);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
            E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
            int i11 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, aVar);
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
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i11))) {
                J4.i.d(i11, c1086gP, i11, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
            SurveyCtaButtonComponent(null, "Submit", null, null, null, C4.a.g(null, "#222222", 1, null), c1086gP, 48, 29);
            c1086gP.T(true);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new q(i10, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r DarkButtonPreview$lambda$10(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        DarkButtonPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    public static final void LightButtonPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1401512691);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
            E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
            int i11 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, aVar);
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
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i11))) {
                J4.i.d(i11, c1086gP, i11, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
            SurveyCtaButtonComponent(null, "Submit", null, null, null, C4.a.g(null, null, 3, null), c1086gP, 48, 29);
            c1086gP.T(true);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2287j0(i10, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r LightButtonPreview$lambda$8(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        LightButtonPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    public static final void SecondaryCtaPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1826494403);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
            E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
            int i11 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, aVar);
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
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i11))) {
                J4.i.d(i11, c1086gP, i11, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
            SurveyCtaButtonComponent(null, "Submit", M1.k(new SurveyState.Content.SecondaryCta("Open website", "https://www.google.com", true)), null, null, C4.a.g(null, null, 3, null), c1086gP, 48, 25);
            c1086gP.T(true);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new z(i10, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r SecondaryCtaPreview$lambda$12(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        SecondaryCtaPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0211  */
    /* JADX WARN: Code duplicated, block: B:103:0x0229  */
    /* JADX WARN: Code duplicated, block: B:107:0x0256  */
    /* JADX WARN: Code duplicated, block: B:110:0x0264  */
    /* JADX WARN: Code duplicated, block: B:111:0x027a  */
    /* JADX WARN: Code duplicated, block: B:115:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x007e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0083  */
    /* JADX WARN: Code duplicated, block: B:42:0x0089  */
    /* JADX WARN: Code duplicated, block: B:44:0x008f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0092  */
    /* JADX WARN: Code duplicated, block: B:49:0x009a  */
    /* JADX WARN: Code duplicated, block: B:52:0x009f  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00db  */
    /* JADX WARN: Code duplicated, block: B:73:0x00df  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:80:0x0130  */
    /* JADX WARN: Code duplicated, block: B:81:0x0134  */
    /* JADX WARN: Code duplicated, block: B:84:0x0147  */
    /* JADX WARN: Code duplicated, block: B:86:0x0155  */
    /* JADX WARN: Code duplicated, block: B:90:0x0171  */
    /* JADX WARN: Code duplicated, block: B:92:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:96:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:98:0x01bd  */
    public static final void SurveyCtaButtonComponent(androidx.compose.ui.h hVar, final String primaryCtaText, List<SurveyState.Content.SecondaryCta> list, Ia.a<r> aVar, l<? super SurveyState.Content.SecondaryCta, r> lVar, final SurveyUiColors surveyUiColors, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        androidx.compose.ui.h hVar2;
        int i12;
        int i13;
        l<? super SurveyState.Content.SecondaryCta, r> lVar2;
        int i14;
        int i15;
        int i16;
        androidx.compose.ui.h.a aVar2;
        androidx.compose.ui.h hVar3;
        List<SurveyState.Content.SecondaryCta> list2;
        Ia.a<r> aVar3;
        l<? super SurveyState.Content.SecondaryCta, r> x10;
        C0937i c0937iA;
        float f10;
        p270w.f fVarB;
        androidx.compose.ui.h hVarE;
        int i17;
        Ia.a<ComposeUiNode> aVar4;
        p<ComposeUiNode, Integer, r> pVar;
        float f11;
        Pair pair;
        C1052g c1052gB;
        final l<? super SurveyState.Content.SecondaryCta, r> lVar3;
        final List<SurveyState.Content.SecondaryCta> list3;
        final androidx.compose.ui.h hVar4;
        boolean z10;
        boolean zK;
        Object objF;
        C1105p0 c1105p0V;
        kotlin.jvm.internal.i.e(primaryCtaText, "primaryCtaText");
        kotlin.jvm.internal.i.e(surveyUiColors, "surveyUiColors");
        C1086g c1086gP = interfaceC1084f.p(-1455595547);
        int i18 = i11 & 1;
        int i19 = 2;
        int i20 = 4;
        if (i18 != 0) {
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
            i12 |= c1086gP.K(primaryCtaText) ? 32 : 16;
        }
        int i21 = i11 & 4;
        if (i21 != 0) {
            i12 |= 128;
        }
        int i22 = i11 & 8;
        if (i22 == 0) {
            if ((i10 & 7168) == 0) {
                i12 |= c1086gP.k(aVar) ? 2048 : 1024;
            }
            i13 = i11 & 16;
            if (i13 != 0) {
                i12 |= 24576;
                lVar2 = lVar;
            } else {
                lVar2 = lVar;
                if ((i10 & 57344) == 0) {
                    if (c1086gP.k(lVar2)) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                    i12 |= i14;
                }
            }
            if ((i11 & 32) != 0) {
                if ((458752 & i10) == 0) {
                    if (c1086gP.K(surveyUiColors)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                }
                i16 = i12;
                if (i21 != 4 && (374491 & i16) == 74898 && c1086gP.s()) {
                    c1086gP.w();
                    list3 = list;
                    aVar3 = aVar;
                    hVar4 = hVar2;
                    lVar3 = lVar2;
                } else {
                    aVar2 = androidx.compose.ui.h.a.f13984b;
                    if (i18 != 0) {
                        hVar3 = aVar2;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i21 != 0) {
                        list2 = EmptyList.f42983b;
                    } else {
                        list2 = list;
                    }
                    if (i22 != 0) {
                        aVar3 = new O9.a(i20);
                    } else {
                        aVar3 = aVar;
                    }
                    if (i13 != 0) {
                        x10 = new X(i19);
                    } else {
                        x10 = lVar2;
                    }
                    c0937iA = C1787c0.a(1, surveyUiColors.m358getButtonBorder0d7_KjU());
                    f10 = 8;
                    fVarB = p270w.g.b(f10);
                    hVarE = W.e(W.d(aVar2, 1.0f), 56);
                    C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                    i17 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
                    androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVar3);
                    ComposeUiNode.f14331c0.getClass();
                    aVar4 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar4);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i17))) {
                        J4.i.d(i17, c1086gP, i17, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
                    c1086gP.L(1171126262);
                    for (final SurveyState.Content.SecondaryCta secondaryCta : list2) {
                        N n10 = C1051f.f12444a;
                        androidx.compose.ui.h hVar5 = hVar3;
                        float f12 = f10;
                        C1050e c1050eA = C1051f.a(surveyUiColors.m357getButton0d7_KjU(), 0L, 0L, 0L, c1086gP, 14);
                        c1086gP.L(1934483982);
                        if ((i16 & 57344) == 16384) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        zK = c1086gP.K(r35) | z10;
                        objF = c1086gP.f();
                        if (zK || objF == InterfaceC1084f.a.f12980a) {
                            objF = new io.intercom.android.sdk.g(x10, 1, r35);
                            c1086gP.E(objF);
                        }
                        c1086gP.T(false);
                        ButtonKt.a((Ia.a) objF, hVarE, false, fVarB, c1050eA, null, c0937iA, null, null, androidx.compose.runtime.internal.a.b(468620518, new Ia.q<U, InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$1$2
                            @Override // Ia.q
                            public /* bridge */ /* synthetic */ r invoke(U u10, InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(u10, interfaceC1084f2, num.intValue());
                                return r.f47939a;
                            }

                            public final void invoke(U Button, InterfaceC1084f interfaceC1084f2, int i23) {
                                kotlin.jvm.internal.i.e(Button, "$this$Button");
                                if ((i23 & 81) == 16 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                    return;
                                }
                                androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                                SurveyState.Content.SecondaryCta secondaryCta2 = secondaryCta;
                                SurveyUiColors surveyUiColors2 = surveyUiColors;
                                androidx.compose.ui.h.a aVar5 = androidx.compose.ui.h.a.f13984b;
                                T tA = S.a(C0945e.f10284a, bVar, interfaceC1084f2, 48);
                                int iF = interfaceC1084f2.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f2.z();
                                androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(interfaceC1084f2, aVar5);
                                ComposeUiNode.f14331c0.getClass();
                                Ia.a<ComposeUiNode> aVar6 = ComposeUiNode.Companion.f14333b;
                                if (interfaceC1084f2.u() == null) {
                                    I.b.k();
                                    throw null;
                                }
                                interfaceC1084f2.r();
                                if (interfaceC1084f2.m()) {
                                    interfaceC1084f2.v(aVar6);
                                } else {
                                    interfaceC1084f2.A();
                                }
                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f2, tA);
                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f2, interfaceC1089h0Z);
                                p<ComposeUiNode, Integer, r> pVar2 = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f2.m() || !kotlin.jvm.internal.i.a(interfaceC1084f2.f(), Integer.valueOf(iF))) {
                                    k.b(iF, interfaceC1084f2, iF, pVar2);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f2, hVarC2);
                                interfaceC1084f2.L(410192915);
                                if (secondaryCta2.isExternalUrl()) {
                                    IconKt.b(LaunchKt.getLaunch(p282x.a.f47838a), null, PaddingKt.h(aVar5, 4, 0.0f, 2), surveyUiColors2.m361getOnButton0d7_KjU(), interfaceC1084f2, 432, 0);
                                }
                                interfaceC1084f2.D();
                                TextKt.b(secondaryCta2.getButtonText(), null, surveyUiColors2.m361getOnButton0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131066);
                                interfaceC1084f2.J();
                            }
                        }, c1086gP), c1086gP, 805306416, 420);
                        Lb.a.a(c1086gP, W.e(aVar2, f12));
                        f10 = f12;
                        hVar3 = hVar5;
                    }
                    androidx.compose.ui.h hVar6 = hVar3;
                    f11 = f10;
                    c1086gP.T(false);
                    if (list2.isEmpty()) {
                        pair = new Pair(new H(surveyUiColors.m357getButton0d7_KjU()), new H(surveyUiColors.m361getOnButton0d7_KjU()));
                    } else {
                        pair = new Pair(new H(H.f13503k), new H(surveyUiColors.m360getOnBackground0d7_KjU()));
                    }
                    long j = ((H) pair.a()).f13506a;
                    final long j10 = ((H) pair.b()).f13506a;
                    if (!list2.isEmpty()) {
                        c0937iA = null;
                    }
                    c1086gP.L(1171170596);
                    if (list2.isEmpty()) {
                        float f13 = 4;
                        c1052gB = C1051f.b(2, f11, f13, f13, 0, 0);
                    } else {
                        c1052gB = null;
                    }
                    c1086gP.T(false);
                    ButtonKt.a(aVar3, hVarE, false, fVarB, C1051f.a(j, 0L, 0L, 0L, c1086gP, 14), c1052gB, c0937iA, null, null, androidx.compose.runtime.internal.a.b(767351755, new Ia.q<U, InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$2
                        @Override // Ia.q
                        public /* bridge */ /* synthetic */ r invoke(U u10, InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(u10, interfaceC1084f2, num.intValue());
                            return r.f47939a;
                        }

                        public final void invoke(U Button, InterfaceC1084f interfaceC1084f2, int i23) {
                            kotlin.jvm.internal.i.e(Button, "$this$Button");
                            if ((i23 & 81) == 16 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                            } else {
                                TextKt.b(primaryCtaText, null, j10, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131066);
                            }
                        }
                    }, c1086gP), c1086gP, ((i16 >> 9) & 14) | 805306416, 388);
                    c1086gP.T(true);
                    lVar3 = x10;
                    list3 = list2;
                    hVar4 = hVar6;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final Ia.a<r> aVar5 = aVar3;
                    c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.components.i
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$6(hVar4, primaryCtaText, list3, aVar5, lVar3, surveyUiColors, i10, i11, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i15 = 196608;
            i12 |= i15;
            i16 = i12;
            if (i21 != 4) {
                aVar2 = androidx.compose.ui.h.a.f13984b;
                if (i18 != 0) {
                    hVar3 = aVar2;
                } else {
                    hVar3 = hVar2;
                }
                if (i21 != 0) {
                    list2 = EmptyList.f42983b;
                } else {
                    list2 = list;
                }
                if (i22 != 0) {
                    aVar3 = new O9.a(i20);
                } else {
                    aVar3 = aVar;
                }
                if (i13 != 0) {
                    x10 = new X(i19);
                } else {
                    x10 = lVar2;
                }
                c0937iA = C1787c0.a(1, surveyUiColors.m358getButtonBorder0d7_KjU());
                f10 = 8;
                fVarB = p270w.g.b(f10);
                hVarE = W.e(W.d(aVar2, 1.0f), 56);
                C0953m c0953mA2 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                i17 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
                androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVar3);
                ComposeUiNode.f14331c0.getClass();
                aVar4 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar4);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA2);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P2);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i17, c1086gP, i17, pVar);
                } else {
                    J4.i.d(i17, c1086gP, i17, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC2);
                c1086gP.L(1171126262);
                while (r25.hasNext()) {
                    N n11 = C1051f.f12444a;
                    androidx.compose.ui.h hVar7 = hVar3;
                    float f14 = f10;
                    C1050e c1050eA2 = C1051f.a(surveyUiColors.m357getButton0d7_KjU(), 0L, 0L, 0L, c1086gP, 14);
                    c1086gP.L(1934483982);
                    if ((i16 & 57344) == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zK = c1086gP.K(r35) | z10;
                    objF = c1086gP.f();
                    if (zK) {
                        objF = new io.intercom.android.sdk.g(x10, 1, r35);
                        c1086gP.E(objF);
                    } else {
                        objF = new io.intercom.android.sdk.g(x10, 1, r35);
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    ButtonKt.a((Ia.a) objF, hVarE, false, fVarB, c1050eA2, null, c0937iA, null, null, androidx.compose.runtime.internal.a.b(468620518, new Ia.q<U, InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$1$2
                        @Override // Ia.q
                        public /* bridge */ /* synthetic */ r invoke(U u10, InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(u10, interfaceC1084f2, num.intValue());
                            return r.f47939a;
                        }

                        public final void invoke(U Button, InterfaceC1084f interfaceC1084f2, int i23) {
                            kotlin.jvm.internal.i.e(Button, "$this$Button");
                            if ((i23 & 81) == 16 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                            SurveyState.Content.SecondaryCta secondaryCta2 = secondaryCta;
                            SurveyUiColors surveyUiColors2 = surveyUiColors;
                            androidx.compose.ui.h.a aVar6 = androidx.compose.ui.h.a.f13984b;
                            T tA = S.a(C0945e.f10284a, bVar, interfaceC1084f2, 48);
                            int iF = interfaceC1084f2.F();
                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f2.z();
                            androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f2, aVar6);
                            ComposeUiNode.f14331c0.getClass();
                            Ia.a<ComposeUiNode> aVar7 = ComposeUiNode.Companion.f14333b;
                            if (interfaceC1084f2.u() == null) {
                                I.b.k();
                                throw null;
                            }
                            interfaceC1084f2.r();
                            if (interfaceC1084f2.m()) {
                                interfaceC1084f2.v(aVar7);
                            } else {
                                interfaceC1084f2.A();
                            }
                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f2, tA);
                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f2, interfaceC1089h0Z);
                            p<ComposeUiNode, Integer, r> pVar2 = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f2.m() || !kotlin.jvm.internal.i.a(interfaceC1084f2.f(), Integer.valueOf(iF))) {
                                k.b(iF, interfaceC1084f2, iF, pVar2);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f2, hVarC3);
                            interfaceC1084f2.L(410192915);
                            if (secondaryCta2.isExternalUrl()) {
                                IconKt.b(LaunchKt.getLaunch(p282x.a.f47838a), null, PaddingKt.h(aVar6, 4, 0.0f, 2), surveyUiColors2.m361getOnButton0d7_KjU(), interfaceC1084f2, 432, 0);
                            }
                            interfaceC1084f2.D();
                            TextKt.b(secondaryCta2.getButtonText(), null, surveyUiColors2.m361getOnButton0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131066);
                            interfaceC1084f2.J();
                        }
                    }, c1086gP), c1086gP, 805306416, 420);
                    Lb.a.a(c1086gP, W.e(aVar2, f14));
                    f10 = f14;
                    hVar3 = hVar7;
                }
                androidx.compose.ui.h hVar8 = hVar3;
                f11 = f10;
                c1086gP.T(false);
                if (list2.isEmpty()) {
                    pair = new Pair(new H(surveyUiColors.m357getButton0d7_KjU()), new H(surveyUiColors.m361getOnButton0d7_KjU()));
                } else {
                    pair = new Pair(new H(H.f13503k), new H(surveyUiColors.m360getOnBackground0d7_KjU()));
                }
                long j11 = ((H) pair.a()).f13506a;
                final long j12 = ((H) pair.b()).f13506a;
                if (!list2.isEmpty()) {
                    c0937iA = null;
                }
                c1086gP.L(1171170596);
                if (list2.isEmpty()) {
                    float f15 = 4;
                    c1052gB = C1051f.b(2, f11, f15, f15, 0, 0);
                } else {
                    c1052gB = null;
                }
                c1086gP.T(false);
                ButtonKt.a(aVar3, hVarE, false, fVarB, C1051f.a(j11, 0L, 0L, 0L, c1086gP, 14), c1052gB, c0937iA, null, null, androidx.compose.runtime.internal.a.b(767351755, new Ia.q<U, InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$2
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ r invoke(U u10, InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(u10, interfaceC1084f2, num.intValue());
                        return r.f47939a;
                    }

                    public final void invoke(U Button, InterfaceC1084f interfaceC1084f2, int i23) {
                        kotlin.jvm.internal.i.e(Button, "$this$Button");
                        if ((i23 & 81) == 16 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                        } else {
                            TextKt.b(primaryCtaText, null, j12, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131066);
                        }
                    }
                }, c1086gP), c1086gP, ((i16 >> 9) & 14) | 805306416, 388);
                c1086gP.T(true);
                lVar3 = x10;
                list3 = list2;
                hVar4 = hVar8;
            } else {
                aVar2 = androidx.compose.ui.h.a.f13984b;
                if (i18 != 0) {
                    hVar3 = aVar2;
                } else {
                    hVar3 = hVar2;
                }
                if (i21 != 0) {
                    list2 = EmptyList.f42983b;
                } else {
                    list2 = list;
                }
                if (i22 != 0) {
                    aVar3 = new O9.a(i20);
                } else {
                    aVar3 = aVar;
                }
                if (i13 != 0) {
                    x10 = new X(i19);
                } else {
                    x10 = lVar2;
                }
                c0937iA = C1787c0.a(1, surveyUiColors.m358getButtonBorder0d7_KjU());
                f10 = 8;
                fVarB = p270w.g.b(f10);
                hVarE = W.e(W.d(aVar2, 1.0f), 56);
                C0953m c0953mA3 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                i17 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
                androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, hVar3);
                ComposeUiNode.f14331c0.getClass();
                aVar4 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar4);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA3);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P3);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i17, c1086gP, i17, pVar);
                } else {
                    J4.i.d(i17, c1086gP, i17, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC3);
                c1086gP.L(1171126262);
                while (r25.hasNext()) {
                    N n12 = C1051f.f12444a;
                    androidx.compose.ui.h hVar9 = hVar3;
                    float f16 = f10;
                    C1050e c1050eA3 = C1051f.a(surveyUiColors.m357getButton0d7_KjU(), 0L, 0L, 0L, c1086gP, 14);
                    c1086gP.L(1934483982);
                    if ((i16 & 57344) == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zK = c1086gP.K(r35) | z10;
                    objF = c1086gP.f();
                    if (zK) {
                        objF = new io.intercom.android.sdk.g(x10, 1, r35);
                        c1086gP.E(objF);
                    } else {
                        objF = new io.intercom.android.sdk.g(x10, 1, r35);
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    ButtonKt.a((Ia.a) objF, hVarE, false, fVarB, c1050eA3, null, c0937iA, null, null, androidx.compose.runtime.internal.a.b(468620518, new Ia.q<U, InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$1$2
                        @Override // Ia.q
                        public /* bridge */ /* synthetic */ r invoke(U u10, InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(u10, interfaceC1084f2, num.intValue());
                            return r.f47939a;
                        }

                        public final void invoke(U Button, InterfaceC1084f interfaceC1084f2, int i23) {
                            kotlin.jvm.internal.i.e(Button, "$this$Button");
                            if ((i23 & 81) == 16 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                            SurveyState.Content.SecondaryCta secondaryCta2 = secondaryCta;
                            SurveyUiColors surveyUiColors2 = surveyUiColors;
                            androidx.compose.ui.h.a aVar6 = androidx.compose.ui.h.a.f13984b;
                            T tA = S.a(C0945e.f10284a, bVar, interfaceC1084f2, 48);
                            int iF = interfaceC1084f2.F();
                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f2.z();
                            androidx.compose.ui.h hVarC4 = ComposedModifierKt.c(interfaceC1084f2, aVar6);
                            ComposeUiNode.f14331c0.getClass();
                            Ia.a<ComposeUiNode> aVar7 = ComposeUiNode.Companion.f14333b;
                            if (interfaceC1084f2.u() == null) {
                                I.b.k();
                                throw null;
                            }
                            interfaceC1084f2.r();
                            if (interfaceC1084f2.m()) {
                                interfaceC1084f2.v(aVar7);
                            } else {
                                interfaceC1084f2.A();
                            }
                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f2, tA);
                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f2, interfaceC1089h0Z);
                            p<ComposeUiNode, Integer, r> pVar2 = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f2.m() || !kotlin.jvm.internal.i.a(interfaceC1084f2.f(), Integer.valueOf(iF))) {
                                k.b(iF, interfaceC1084f2, iF, pVar2);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f2, hVarC4);
                            interfaceC1084f2.L(410192915);
                            if (secondaryCta2.isExternalUrl()) {
                                IconKt.b(LaunchKt.getLaunch(p282x.a.f47838a), null, PaddingKt.h(aVar6, 4, 0.0f, 2), surveyUiColors2.m361getOnButton0d7_KjU(), interfaceC1084f2, 432, 0);
                            }
                            interfaceC1084f2.D();
                            TextKt.b(secondaryCta2.getButtonText(), null, surveyUiColors2.m361getOnButton0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131066);
                            interfaceC1084f2.J();
                        }
                    }, c1086gP), c1086gP, 805306416, 420);
                    Lb.a.a(c1086gP, W.e(aVar2, f16));
                    f10 = f16;
                    hVar3 = hVar9;
                }
                androidx.compose.ui.h hVar10 = hVar3;
                f11 = f10;
                c1086gP.T(false);
                if (list2.isEmpty()) {
                    pair = new Pair(new H(surveyUiColors.m357getButton0d7_KjU()), new H(surveyUiColors.m361getOnButton0d7_KjU()));
                } else {
                    pair = new Pair(new H(H.f13503k), new H(surveyUiColors.m360getOnBackground0d7_KjU()));
                }
                long j13 = ((H) pair.a()).f13506a;
                final long j14 = ((H) pair.b()).f13506a;
                if (!list2.isEmpty()) {
                    c0937iA = null;
                }
                c1086gP.L(1171170596);
                if (list2.isEmpty()) {
                    float f17 = 4;
                    c1052gB = C1051f.b(2, f11, f17, f17, 0, 0);
                } else {
                    c1052gB = null;
                }
                c1086gP.T(false);
                ButtonKt.a(aVar3, hVarE, false, fVarB, C1051f.a(j13, 0L, 0L, 0L, c1086gP, 14), c1052gB, c0937iA, null, null, androidx.compose.runtime.internal.a.b(767351755, new Ia.q<U, InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$2
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ r invoke(U u10, InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(u10, interfaceC1084f2, num.intValue());
                        return r.f47939a;
                    }

                    public final void invoke(U Button, InterfaceC1084f interfaceC1084f2, int i23) {
                        kotlin.jvm.internal.i.e(Button, "$this$Button");
                        if ((i23 & 81) == 16 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                        } else {
                            TextKt.b(primaryCtaText, null, j14, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131066);
                        }
                    }
                }, c1086gP), c1086gP, ((i16 >> 9) & 14) | 805306416, 388);
                c1086gP.T(true);
                lVar3 = x10;
                list3 = list2;
                hVar4 = hVar10;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final Ia.a aVar6 = aVar3;
                c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.components.i
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$6(hVar4, primaryCtaText, list3, aVar6, lVar3, surveyUiColors, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 3072;
        i13 = i11 & 16;
        if (i13 != 0) {
            i12 |= 24576;
            lVar2 = lVar;
        } else {
            lVar2 = lVar;
            if ((i10 & 57344) == 0) {
                if (c1086gP.k(lVar2)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i12 |= i14;
            }
        }
        if ((i11 & 32) != 0) {
            if ((458752 & i10) == 0) {
                if (c1086gP.K(surveyUiColors)) {
                    i15 = 131072;
                } else {
                    i15 = 65536;
                }
            }
            i16 = i12;
            if (i21 != 4) {
                aVar2 = androidx.compose.ui.h.a.f13984b;
                if (i18 != 0) {
                    hVar3 = aVar2;
                } else {
                    hVar3 = hVar2;
                }
                if (i21 != 0) {
                    list2 = EmptyList.f42983b;
                } else {
                    list2 = list;
                }
                if (i22 != 0) {
                    aVar3 = new O9.a(i20);
                } else {
                    aVar3 = aVar;
                }
                if (i13 != 0) {
                    x10 = new X(i19);
                } else {
                    x10 = lVar2;
                }
                c0937iA = C1787c0.a(1, surveyUiColors.m358getButtonBorder0d7_KjU());
                f10 = 8;
                fVarB = p270w.g.b(f10);
                hVarE = W.e(W.d(aVar2, 1.0f), 56);
                C0953m c0953mA4 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                i17 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P4 = c1086gP.P();
                androidx.compose.ui.h hVarC4 = ComposedModifierKt.c(c1086gP, hVar3);
                ComposeUiNode.f14331c0.getClass();
                aVar4 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar4);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA4);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P4);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i17, c1086gP, i17, pVar);
                } else {
                    J4.i.d(i17, c1086gP, i17, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC4);
                c1086gP.L(1171126262);
                while (r25.hasNext()) {
                    N n13 = C1051f.f12444a;
                    androidx.compose.ui.h hVar11 = hVar3;
                    float f18 = f10;
                    C1050e c1050eA4 = C1051f.a(surveyUiColors.m357getButton0d7_KjU(), 0L, 0L, 0L, c1086gP, 14);
                    c1086gP.L(1934483982);
                    if ((i16 & 57344) == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zK = c1086gP.K(r35) | z10;
                    objF = c1086gP.f();
                    if (zK) {
                        objF = new io.intercom.android.sdk.g(x10, 1, r35);
                        c1086gP.E(objF);
                    } else {
                        objF = new io.intercom.android.sdk.g(x10, 1, r35);
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    ButtonKt.a((Ia.a) objF, hVarE, false, fVarB, c1050eA4, null, c0937iA, null, null, androidx.compose.runtime.internal.a.b(468620518, new Ia.q<U, InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$1$2
                        @Override // Ia.q
                        public /* bridge */ /* synthetic */ r invoke(U u10, InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(u10, interfaceC1084f2, num.intValue());
                            return r.f47939a;
                        }

                        public final void invoke(U Button, InterfaceC1084f interfaceC1084f2, int i23) {
                            kotlin.jvm.internal.i.e(Button, "$this$Button");
                            if ((i23 & 81) == 16 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                            SurveyState.Content.SecondaryCta secondaryCta2 = secondaryCta;
                            SurveyUiColors surveyUiColors2 = surveyUiColors;
                            androidx.compose.ui.h.a aVar7 = androidx.compose.ui.h.a.f13984b;
                            T tA = S.a(C0945e.f10284a, bVar, interfaceC1084f2, 48);
                            int iF = interfaceC1084f2.F();
                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f2.z();
                            androidx.compose.ui.h hVarC5 = ComposedModifierKt.c(interfaceC1084f2, aVar7);
                            ComposeUiNode.f14331c0.getClass();
                            Ia.a<ComposeUiNode> aVar8 = ComposeUiNode.Companion.f14333b;
                            if (interfaceC1084f2.u() == null) {
                                I.b.k();
                                throw null;
                            }
                            interfaceC1084f2.r();
                            if (interfaceC1084f2.m()) {
                                interfaceC1084f2.v(aVar8);
                            } else {
                                interfaceC1084f2.A();
                            }
                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f2, tA);
                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f2, interfaceC1089h0Z);
                            p<ComposeUiNode, Integer, r> pVar2 = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f2.m() || !kotlin.jvm.internal.i.a(interfaceC1084f2.f(), Integer.valueOf(iF))) {
                                k.b(iF, interfaceC1084f2, iF, pVar2);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f2, hVarC5);
                            interfaceC1084f2.L(410192915);
                            if (secondaryCta2.isExternalUrl()) {
                                IconKt.b(LaunchKt.getLaunch(p282x.a.f47838a), null, PaddingKt.h(aVar7, 4, 0.0f, 2), surveyUiColors2.m361getOnButton0d7_KjU(), interfaceC1084f2, 432, 0);
                            }
                            interfaceC1084f2.D();
                            TextKt.b(secondaryCta2.getButtonText(), null, surveyUiColors2.m361getOnButton0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131066);
                            interfaceC1084f2.J();
                        }
                    }, c1086gP), c1086gP, 805306416, 420);
                    Lb.a.a(c1086gP, W.e(aVar2, f18));
                    f10 = f18;
                    hVar3 = hVar11;
                }
                androidx.compose.ui.h hVar12 = hVar3;
                f11 = f10;
                c1086gP.T(false);
                if (list2.isEmpty()) {
                    pair = new Pair(new H(surveyUiColors.m357getButton0d7_KjU()), new H(surveyUiColors.m361getOnButton0d7_KjU()));
                } else {
                    pair = new Pair(new H(H.f13503k), new H(surveyUiColors.m360getOnBackground0d7_KjU()));
                }
                long j15 = ((H) pair.a()).f13506a;
                final long j16 = ((H) pair.b()).f13506a;
                if (!list2.isEmpty()) {
                    c0937iA = null;
                }
                c1086gP.L(1171170596);
                if (list2.isEmpty()) {
                    float f19 = 4;
                    c1052gB = C1051f.b(2, f11, f19, f19, 0, 0);
                } else {
                    c1052gB = null;
                }
                c1086gP.T(false);
                ButtonKt.a(aVar3, hVarE, false, fVarB, C1051f.a(j15, 0L, 0L, 0L, c1086gP, 14), c1052gB, c0937iA, null, null, androidx.compose.runtime.internal.a.b(767351755, new Ia.q<U, InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$2
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ r invoke(U u10, InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(u10, interfaceC1084f2, num.intValue());
                        return r.f47939a;
                    }

                    public final void invoke(U Button, InterfaceC1084f interfaceC1084f2, int i23) {
                        kotlin.jvm.internal.i.e(Button, "$this$Button");
                        if ((i23 & 81) == 16 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                        } else {
                            TextKt.b(primaryCtaText, null, j16, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131066);
                        }
                    }
                }, c1086gP), c1086gP, ((i16 >> 9) & 14) | 805306416, 388);
                c1086gP.T(true);
                lVar3 = x10;
                list3 = list2;
                hVar4 = hVar12;
            } else {
                aVar2 = androidx.compose.ui.h.a.f13984b;
                if (i18 != 0) {
                    hVar3 = aVar2;
                } else {
                    hVar3 = hVar2;
                }
                if (i21 != 0) {
                    list2 = EmptyList.f42983b;
                } else {
                    list2 = list;
                }
                if (i22 != 0) {
                    aVar3 = new O9.a(i20);
                } else {
                    aVar3 = aVar;
                }
                if (i13 != 0) {
                    x10 = new X(i19);
                } else {
                    x10 = lVar2;
                }
                c0937iA = C1787c0.a(1, surveyUiColors.m358getButtonBorder0d7_KjU());
                f10 = 8;
                fVarB = p270w.g.b(f10);
                hVarE = W.e(W.d(aVar2, 1.0f), 56);
                C0953m c0953mA5 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                i17 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P5 = c1086gP.P();
                androidx.compose.ui.h hVarC5 = ComposedModifierKt.c(c1086gP, hVar3);
                ComposeUiNode.f14331c0.getClass();
                aVar4 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar4);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA5);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P5);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i17, c1086gP, i17, pVar);
                } else {
                    J4.i.d(i17, c1086gP, i17, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC5);
                c1086gP.L(1171126262);
                while (r25.hasNext()) {
                    N n14 = C1051f.f12444a;
                    androidx.compose.ui.h hVar13 = hVar3;
                    float f110 = f10;
                    C1050e c1050eA5 = C1051f.a(surveyUiColors.m357getButton0d7_KjU(), 0L, 0L, 0L, c1086gP, 14);
                    c1086gP.L(1934483982);
                    if ((i16 & 57344) == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zK = c1086gP.K(r35) | z10;
                    objF = c1086gP.f();
                    if (zK) {
                        objF = new io.intercom.android.sdk.g(x10, 1, r35);
                        c1086gP.E(objF);
                    } else {
                        objF = new io.intercom.android.sdk.g(x10, 1, r35);
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    ButtonKt.a((Ia.a) objF, hVarE, false, fVarB, c1050eA5, null, c0937iA, null, null, androidx.compose.runtime.internal.a.b(468620518, new Ia.q<U, InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$1$2
                        @Override // Ia.q
                        public /* bridge */ /* synthetic */ r invoke(U u10, InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(u10, interfaceC1084f2, num.intValue());
                            return r.f47939a;
                        }

                        public final void invoke(U Button, InterfaceC1084f interfaceC1084f2, int i23) {
                            kotlin.jvm.internal.i.e(Button, "$this$Button");
                            if ((i23 & 81) == 16 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                            SurveyState.Content.SecondaryCta secondaryCta2 = secondaryCta;
                            SurveyUiColors surveyUiColors2 = surveyUiColors;
                            androidx.compose.ui.h.a aVar7 = androidx.compose.ui.h.a.f13984b;
                            T tA = S.a(C0945e.f10284a, bVar, interfaceC1084f2, 48);
                            int iF = interfaceC1084f2.F();
                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f2.z();
                            androidx.compose.ui.h hVarC6 = ComposedModifierKt.c(interfaceC1084f2, aVar7);
                            ComposeUiNode.f14331c0.getClass();
                            Ia.a<ComposeUiNode> aVar8 = ComposeUiNode.Companion.f14333b;
                            if (interfaceC1084f2.u() == null) {
                                I.b.k();
                                throw null;
                            }
                            interfaceC1084f2.r();
                            if (interfaceC1084f2.m()) {
                                interfaceC1084f2.v(aVar8);
                            } else {
                                interfaceC1084f2.A();
                            }
                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f2, tA);
                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f2, interfaceC1089h0Z);
                            p<ComposeUiNode, Integer, r> pVar2 = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f2.m() || !kotlin.jvm.internal.i.a(interfaceC1084f2.f(), Integer.valueOf(iF))) {
                                k.b(iF, interfaceC1084f2, iF, pVar2);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f2, hVarC6);
                            interfaceC1084f2.L(410192915);
                            if (secondaryCta2.isExternalUrl()) {
                                IconKt.b(LaunchKt.getLaunch(p282x.a.f47838a), null, PaddingKt.h(aVar7, 4, 0.0f, 2), surveyUiColors2.m361getOnButton0d7_KjU(), interfaceC1084f2, 432, 0);
                            }
                            interfaceC1084f2.D();
                            TextKt.b(secondaryCta2.getButtonText(), null, surveyUiColors2.m361getOnButton0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131066);
                            interfaceC1084f2.J();
                        }
                    }, c1086gP), c1086gP, 805306416, 420);
                    Lb.a.a(c1086gP, W.e(aVar2, f110));
                    f10 = f110;
                    hVar3 = hVar13;
                }
                androidx.compose.ui.h hVar14 = hVar3;
                f11 = f10;
                c1086gP.T(false);
                if (list2.isEmpty()) {
                    pair = new Pair(new H(surveyUiColors.m357getButton0d7_KjU()), new H(surveyUiColors.m361getOnButton0d7_KjU()));
                } else {
                    pair = new Pair(new H(H.f13503k), new H(surveyUiColors.m360getOnBackground0d7_KjU()));
                }
                long j17 = ((H) pair.a()).f13506a;
                final long j18 = ((H) pair.b()).f13506a;
                if (!list2.isEmpty()) {
                    c0937iA = null;
                }
                c1086gP.L(1171170596);
                if (list2.isEmpty()) {
                    float f111 = 4;
                    c1052gB = C1051f.b(2, f11, f111, f111, 0, 0);
                } else {
                    c1052gB = null;
                }
                c1086gP.T(false);
                ButtonKt.a(aVar3, hVarE, false, fVarB, C1051f.a(j17, 0L, 0L, 0L, c1086gP, 14), c1052gB, c0937iA, null, null, androidx.compose.runtime.internal.a.b(767351755, new Ia.q<U, InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$2
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ r invoke(U u10, InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(u10, interfaceC1084f2, num.intValue());
                        return r.f47939a;
                    }

                    public final void invoke(U Button, InterfaceC1084f interfaceC1084f2, int i23) {
                        kotlin.jvm.internal.i.e(Button, "$this$Button");
                        if ((i23 & 81) == 16 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                        } else {
                            TextKt.b(primaryCtaText, null, j18, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131066);
                        }
                    }
                }, c1086gP), c1086gP, ((i16 >> 9) & 14) | 805306416, 388);
                c1086gP.T(true);
                lVar3 = x10;
                list3 = list2;
                hVar4 = hVar14;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final Ia.a aVar7 = aVar3;
                c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.components.i
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$6(hVar4, primaryCtaText, list3, aVar7, lVar3, surveyUiColors, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i15 = 196608;
        i12 |= i15;
        i16 = i12;
        if (i21 != 4) {
            aVar2 = androidx.compose.ui.h.a.f13984b;
            if (i18 != 0) {
                hVar3 = aVar2;
            } else {
                hVar3 = hVar2;
            }
            if (i21 != 0) {
                list2 = EmptyList.f42983b;
            } else {
                list2 = list;
            }
            if (i22 != 0) {
                aVar3 = new O9.a(i20);
            } else {
                aVar3 = aVar;
            }
            if (i13 != 0) {
                x10 = new X(i19);
            } else {
                x10 = lVar2;
            }
            c0937iA = C1787c0.a(1, surveyUiColors.m358getButtonBorder0d7_KjU());
            f10 = 8;
            fVarB = p270w.g.b(f10);
            hVarE = W.e(W.d(aVar2, 1.0f), 56);
            C0953m c0953mA6 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
            i17 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P6 = c1086gP.P();
            androidx.compose.ui.h hVarC6 = ComposedModifierKt.c(c1086gP, hVar3);
            ComposeUiNode.f14331c0.getClass();
            aVar4 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar4);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA6);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P6);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i17, c1086gP, i17, pVar);
            } else {
                J4.i.d(i17, c1086gP, i17, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC6);
            c1086gP.L(1171126262);
            while (r25.hasNext()) {
                N n15 = C1051f.f12444a;
                androidx.compose.ui.h hVar15 = hVar3;
                float f112 = f10;
                C1050e c1050eA6 = C1051f.a(surveyUiColors.m357getButton0d7_KjU(), 0L, 0L, 0L, c1086gP, 14);
                c1086gP.L(1934483982);
                if ((i16 & 57344) == 16384) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zK = c1086gP.K(r35) | z10;
                objF = c1086gP.f();
                if (zK) {
                    objF = new io.intercom.android.sdk.g(x10, 1, r35);
                    c1086gP.E(objF);
                } else {
                    objF = new io.intercom.android.sdk.g(x10, 1, r35);
                    c1086gP.E(objF);
                }
                c1086gP.T(false);
                ButtonKt.a((Ia.a) objF, hVarE, false, fVarB, c1050eA6, null, c0937iA, null, null, androidx.compose.runtime.internal.a.b(468620518, new Ia.q<U, InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$1$2
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ r invoke(U u10, InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(u10, interfaceC1084f2, num.intValue());
                        return r.f47939a;
                    }

                    public final void invoke(U Button, InterfaceC1084f interfaceC1084f2, int i23) {
                        kotlin.jvm.internal.i.e(Button, "$this$Button");
                        if ((i23 & 81) == 16 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                        SurveyState.Content.SecondaryCta secondaryCta2 = secondaryCta;
                        SurveyUiColors surveyUiColors2 = surveyUiColors;
                        androidx.compose.ui.h.a aVar8 = androidx.compose.ui.h.a.f13984b;
                        T tA = S.a(C0945e.f10284a, bVar, interfaceC1084f2, 48);
                        int iF = interfaceC1084f2.F();
                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f2.z();
                        androidx.compose.ui.h hVarC7 = ComposedModifierKt.c(interfaceC1084f2, aVar8);
                        ComposeUiNode.f14331c0.getClass();
                        Ia.a<ComposeUiNode> aVar9 = ComposeUiNode.Companion.f14333b;
                        if (interfaceC1084f2.u() == null) {
                            I.b.k();
                            throw null;
                        }
                        interfaceC1084f2.r();
                        if (interfaceC1084f2.m()) {
                            interfaceC1084f2.v(aVar9);
                        } else {
                            interfaceC1084f2.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f2, tA);
                        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f2, interfaceC1089h0Z);
                        p<ComposeUiNode, Integer, r> pVar2 = ComposeUiNode.Companion.f14338g;
                        if (interfaceC1084f2.m() || !kotlin.jvm.internal.i.a(interfaceC1084f2.f(), Integer.valueOf(iF))) {
                            k.b(iF, interfaceC1084f2, iF, pVar2);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f2, hVarC7);
                        interfaceC1084f2.L(410192915);
                        if (secondaryCta2.isExternalUrl()) {
                            IconKt.b(LaunchKt.getLaunch(p282x.a.f47838a), null, PaddingKt.h(aVar8, 4, 0.0f, 2), surveyUiColors2.m361getOnButton0d7_KjU(), interfaceC1084f2, 432, 0);
                        }
                        interfaceC1084f2.D();
                        TextKt.b(secondaryCta2.getButtonText(), null, surveyUiColors2.m361getOnButton0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131066);
                        interfaceC1084f2.J();
                    }
                }, c1086gP), c1086gP, 805306416, 420);
                Lb.a.a(c1086gP, W.e(aVar2, f112));
                f10 = f112;
                hVar3 = hVar15;
            }
            androidx.compose.ui.h hVar16 = hVar3;
            f11 = f10;
            c1086gP.T(false);
            if (list2.isEmpty()) {
                pair = new Pair(new H(surveyUiColors.m357getButton0d7_KjU()), new H(surveyUiColors.m361getOnButton0d7_KjU()));
            } else {
                pair = new Pair(new H(H.f13503k), new H(surveyUiColors.m360getOnBackground0d7_KjU()));
            }
            long j19 = ((H) pair.a()).f13506a;
            final long j110 = ((H) pair.b()).f13506a;
            if (!list2.isEmpty()) {
                c0937iA = null;
            }
            c1086gP.L(1171170596);
            if (list2.isEmpty()) {
                float f113 = 4;
                c1052gB = C1051f.b(2, f11, f113, f113, 0, 0);
            } else {
                c1052gB = null;
            }
            c1086gP.T(false);
            ButtonKt.a(aVar3, hVarE, false, fVarB, C1051f.a(j19, 0L, 0L, 0L, c1086gP, 14), c1052gB, c0937iA, null, null, androidx.compose.runtime.internal.a.b(767351755, new Ia.q<U, InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$2
                @Override // Ia.q
                public /* bridge */ /* synthetic */ r invoke(U u10, InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(u10, interfaceC1084f2, num.intValue());
                    return r.f47939a;
                }

                public final void invoke(U Button, InterfaceC1084f interfaceC1084f2, int i23) {
                    kotlin.jvm.internal.i.e(Button, "$this$Button");
                    if ((i23 & 81) == 16 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                    } else {
                        TextKt.b(primaryCtaText, null, j110, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131066);
                    }
                }
            }, c1086gP), c1086gP, ((i16 >> 9) & 14) | 805306416, 388);
            c1086gP.T(true);
            lVar3 = x10;
            list3 = list2;
            hVar4 = hVar16;
        } else {
            aVar2 = androidx.compose.ui.h.a.f13984b;
            if (i18 != 0) {
                hVar3 = aVar2;
            } else {
                hVar3 = hVar2;
            }
            if (i21 != 0) {
                list2 = EmptyList.f42983b;
            } else {
                list2 = list;
            }
            if (i22 != 0) {
                aVar3 = new O9.a(i20);
            } else {
                aVar3 = aVar;
            }
            if (i13 != 0) {
                x10 = new X(i19);
            } else {
                x10 = lVar2;
            }
            c0937iA = C1787c0.a(1, surveyUiColors.m358getButtonBorder0d7_KjU());
            f10 = 8;
            fVarB = p270w.g.b(f10);
            hVarE = W.e(W.d(aVar2, 1.0f), 56);
            C0953m c0953mA7 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
            i17 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P7 = c1086gP.P();
            androidx.compose.ui.h hVarC7 = ComposedModifierKt.c(c1086gP, hVar3);
            ComposeUiNode.f14331c0.getClass();
            aVar4 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar4);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA7);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P7);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i17, c1086gP, i17, pVar);
            } else {
                J4.i.d(i17, c1086gP, i17, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC7);
            c1086gP.L(1171126262);
            while (r25.hasNext()) {
                N n16 = C1051f.f12444a;
                androidx.compose.ui.h hVar17 = hVar3;
                float f114 = f10;
                C1050e c1050eA7 = C1051f.a(surveyUiColors.m357getButton0d7_KjU(), 0L, 0L, 0L, c1086gP, 14);
                c1086gP.L(1934483982);
                if ((i16 & 57344) == 16384) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zK = c1086gP.K(r35) | z10;
                objF = c1086gP.f();
                if (zK) {
                    objF = new io.intercom.android.sdk.g(x10, 1, r35);
                    c1086gP.E(objF);
                } else {
                    objF = new io.intercom.android.sdk.g(x10, 1, r35);
                    c1086gP.E(objF);
                }
                c1086gP.T(false);
                ButtonKt.a((Ia.a) objF, hVarE, false, fVarB, c1050eA7, null, c0937iA, null, null, androidx.compose.runtime.internal.a.b(468620518, new Ia.q<U, InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$1$2
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ r invoke(U u10, InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(u10, interfaceC1084f2, num.intValue());
                        return r.f47939a;
                    }

                    public final void invoke(U Button, InterfaceC1084f interfaceC1084f2, int i23) {
                        kotlin.jvm.internal.i.e(Button, "$this$Button");
                        if ((i23 & 81) == 16 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                        SurveyState.Content.SecondaryCta secondaryCta2 = secondaryCta;
                        SurveyUiColors surveyUiColors2 = surveyUiColors;
                        androidx.compose.ui.h.a aVar8 = androidx.compose.ui.h.a.f13984b;
                        T tA = S.a(C0945e.f10284a, bVar, interfaceC1084f2, 48);
                        int iF = interfaceC1084f2.F();
                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f2.z();
                        androidx.compose.ui.h hVarC8 = ComposedModifierKt.c(interfaceC1084f2, aVar8);
                        ComposeUiNode.f14331c0.getClass();
                        Ia.a<ComposeUiNode> aVar9 = ComposeUiNode.Companion.f14333b;
                        if (interfaceC1084f2.u() == null) {
                            I.b.k();
                            throw null;
                        }
                        interfaceC1084f2.r();
                        if (interfaceC1084f2.m()) {
                            interfaceC1084f2.v(aVar9);
                        } else {
                            interfaceC1084f2.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f2, tA);
                        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f2, interfaceC1089h0Z);
                        p<ComposeUiNode, Integer, r> pVar2 = ComposeUiNode.Companion.f14338g;
                        if (interfaceC1084f2.m() || !kotlin.jvm.internal.i.a(interfaceC1084f2.f(), Integer.valueOf(iF))) {
                            k.b(iF, interfaceC1084f2, iF, pVar2);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f2, hVarC8);
                        interfaceC1084f2.L(410192915);
                        if (secondaryCta2.isExternalUrl()) {
                            IconKt.b(LaunchKt.getLaunch(p282x.a.f47838a), null, PaddingKt.h(aVar8, 4, 0.0f, 2), surveyUiColors2.m361getOnButton0d7_KjU(), interfaceC1084f2, 432, 0);
                        }
                        interfaceC1084f2.D();
                        TextKt.b(secondaryCta2.getButtonText(), null, surveyUiColors2.m361getOnButton0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131066);
                        interfaceC1084f2.J();
                    }
                }, c1086gP), c1086gP, 805306416, 420);
                Lb.a.a(c1086gP, W.e(aVar2, f114));
                f10 = f114;
                hVar3 = hVar17;
            }
            androidx.compose.ui.h hVar18 = hVar3;
            f11 = f10;
            c1086gP.T(false);
            if (list2.isEmpty()) {
                pair = new Pair(new H(surveyUiColors.m357getButton0d7_KjU()), new H(surveyUiColors.m361getOnButton0d7_KjU()));
            } else {
                pair = new Pair(new H(H.f13503k), new H(surveyUiColors.m360getOnBackground0d7_KjU()));
            }
            long j111 = ((H) pair.a()).f13506a;
            final long j112 = ((H) pair.b()).f13506a;
            if (!list2.isEmpty()) {
                c0937iA = null;
            }
            c1086gP.L(1171170596);
            if (list2.isEmpty()) {
                float f115 = 4;
                c1052gB = C1051f.b(2, f11, f115, f115, 0, 0);
            } else {
                c1052gB = null;
            }
            c1086gP.T(false);
            ButtonKt.a(aVar3, hVarE, false, fVarB, C1051f.a(j111, 0L, 0L, 0L, c1086gP, 14), c1052gB, c0937iA, null, null, androidx.compose.runtime.internal.a.b(767351755, new Ia.q<U, InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$2
                @Override // Ia.q
                public /* bridge */ /* synthetic */ r invoke(U u10, InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(u10, interfaceC1084f2, num.intValue());
                    return r.f47939a;
                }

                public final void invoke(U Button, InterfaceC1084f interfaceC1084f2, int i23) {
                    kotlin.jvm.internal.i.e(Button, "$this$Button");
                    if ((i23 & 81) == 16 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                    } else {
                        TextKt.b(primaryCtaText, null, j112, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131066);
                    }
                }
            }, c1086gP), c1086gP, ((i16 >> 9) & 14) | 805306416, 388);
            c1086gP.T(true);
            lVar3 = x10;
            list3 = list2;
            hVar4 = hVar18;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final Ia.a aVar8 = aVar3;
            c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.components.i
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$6(hVar4, primaryCtaText, list3, aVar8, lVar3, surveyUiColors, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r SurveyCtaButtonComponent$lambda$1(SurveyState.Content.SecondaryCta it) {
        kotlin.jvm.internal.i.e(it, "it");
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r SurveyCtaButtonComponent$lambda$5$lambda$4$lambda$3$lambda$2(l lVar, SurveyState.Content.SecondaryCta it) {
        kotlin.jvm.internal.i.e(it, "$it");
        lVar.invoke(it);
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r SurveyCtaButtonComponent$lambda$6(androidx.compose.ui.h hVar, String primaryCtaText, List list, Ia.a aVar, l lVar, SurveyUiColors surveyUiColors, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(primaryCtaText, "$primaryCtaText");
        kotlin.jvm.internal.i.e(surveyUiColors, "$surveyUiColors");
        SurveyCtaButtonComponent(hVar, primaryCtaText, list, aVar, lVar, surveyUiColors, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return r.f47939a;
    }
}
