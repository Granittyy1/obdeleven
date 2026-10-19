package io.intercom.android.sdk.m5.components;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: IntercomErrorScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomErrorScreenKt {
    @IntercomPreviews
    public static final void ErrorScreenWithCTAPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-2005095861);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$IntercomErrorScreenKt.INSTANCE.m101getLambda1$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new P(i10, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ErrorScreenWithCTAPreview$lambda$1(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        ErrorScreenWithCTAPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void ErrorScreenWithoutCTAPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(753957761);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$IntercomErrorScreenKt.INSTANCE.m102getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2280g(i10, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ErrorScreenWithoutCTAPreview$lambda$2(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        ErrorScreenWithoutCTAPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x008e  */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    public static final void IntercomErrorScreen(final ErrorState state, androidx.compose.ui.h hVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        final androidx.compose.ui.h hVar2;
        androidx.compose.ui.h hVar3;
        C1105p0 c1105p0V;
        kotlin.jvm.internal.i.e(state, "state");
        C1086g c1086gP = interfaceC1084f.p(-45428996);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c1086gP.K(state) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 == 0) {
            if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                hVar2 = hVar;
                i12 |= c1086gP.K(hVar2) ? 32 : 16;
            }
            if ((i12 & 91) == 18 || !c1086gP.s()) {
                if (i13 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                SurfaceKt.a(hVar3.i(androidx.compose.foundation.layout.W.f10226c), null, 0L, 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(847888321, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.components.IntercomErrorScreenKt.IntercomErrorScreen.1
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i14) {
                        if ((i14 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13339e;
                        ErrorState errorState = state;
                        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
                        androidx.compose.ui.layout.E eD = BoxKt.d(fVar, false);
                        int iF = interfaceC1084f2.F();
                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f2.z();
                        androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f2, aVar);
                        ComposeUiNode.f14331c0.getClass();
                        Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                        if (interfaceC1084f2.u() == null) {
                            I.b.k();
                            throw null;
                        }
                        interfaceC1084f2.r();
                        if (interfaceC1084f2.m()) {
                            interfaceC1084f2.v(aVar2);
                        } else {
                            interfaceC1084f2.A();
                        }
                        Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar = ComposeUiNode.Companion.f14337f;
                        R0.a(pVar, interfaceC1084f2, eD);
                        Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar2 = ComposeUiNode.Companion.f14336e;
                        R0.a(pVar2, interfaceC1084f2, interfaceC1089h0Z);
                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                        if (interfaceC1084f2.m() || !kotlin.jvm.internal.i.a(interfaceC1084f2.f(), Integer.valueOf(iF))) {
                            androidx.compose.animation.k.b(iF, interfaceC1084f2, iF, pVar3);
                        }
                        Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar4 = ComposeUiNode.Companion.f14335d;
                        R0.a(pVar4, interfaceC1084f2, hVarC);
                        C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13347n, interfaceC1084f2, 48);
                        int iF2 = interfaceC1084f2.F();
                        InterfaceC1089h0 interfaceC1089h0Z2 = interfaceC1084f2.z();
                        androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(interfaceC1084f2, aVar);
                        if (interfaceC1084f2.u() == null) {
                            I.b.k();
                            throw null;
                        }
                        interfaceC1084f2.r();
                        if (interfaceC1084f2.m()) {
                            interfaceC1084f2.v(aVar2);
                        } else {
                            interfaceC1084f2.A();
                        }
                        R0.a(pVar, interfaceC1084f2, c0953mA);
                        R0.a(pVar2, interfaceC1084f2, interfaceC1089h0Z2);
                        if (interfaceC1084f2.m() || !kotlin.jvm.internal.i.a(interfaceC1084f2.f(), Integer.valueOf(iF2))) {
                            androidx.compose.animation.k.b(iF2, interfaceC1084f2, iF2, pVar3);
                        }
                        R0.a(pVar4, interfaceC1084f2, hVarC2);
                        IconKt.a(U.c.a(errorState.getIconId(), interfaceC1084f2, 0), null, androidx.compose.foundation.layout.W.m(aVar, 32), 0L, interfaceC1084f2, 440, 8);
                        float f10 = 16;
                        Lb.a.a(interfaceC1084f2, androidx.compose.foundation.layout.W.e(aVar, f10));
                        String strP = S4.o.p(interfaceC1084f2, errorState.getMessageResId());
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        int i15 = IntercomTheme.$stable;
                        TextKt.b(strP, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(interfaceC1084f2, i15).getType03(), interfaceC1084f2, 0, 0, 65534);
                        Lb.a.a(interfaceC1084f2, androidx.compose.foundation.layout.W.e(aVar, 8));
                        Integer additionalMessageResId = errorState.getAdditionalMessageResId();
                        interfaceC1084f2.L(1192536998);
                        if (additionalMessageResId != null) {
                            TextKt.b(S4.o.p(interfaceC1084f2, additionalMessageResId.intValue()), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(interfaceC1084f2, i15).getType04(), interfaceC1084f2, 0, 0, 65534);
                        }
                        interfaceC1084f2.D();
                        Lb.a.a(interfaceC1084f2, androidx.compose.foundation.layout.W.e(aVar, f10));
                        interfaceC1084f2.L(1192545587);
                        if (errorState instanceof ErrorState.WithCTA) {
                            ErrorState.WithCTA withCTA = (ErrorState.WithCTA) errorState;
                            IntercomPrimaryButtonKt.IntercomPrimaryButton(S4.o.p(interfaceC1084f2, withCTA.getCtaResId()), null, null, withCTA.getOnCtaClick(), interfaceC1084f2, 0, 6);
                        }
                        interfaceC1084f2.D();
                        interfaceC1084f2.J();
                        interfaceC1084f2.J();
                    }
                }, c1086gP), c1086gP, 12582912, R.styleable.AppCompatTheme_windowNoTitle);
                hVar2 = hVar3;
            } else {
                c1086gP.w();
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.components.u0
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return IntercomErrorScreenKt.IntercomErrorScreen$lambda$0(state, hVar2, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 48;
        hVar2 = hVar;
        if ((i12 & 91) == 18) {
            if (i13 != 0) {
                hVar3 = androidx.compose.ui.h.a.f13984b;
            } else {
                hVar3 = hVar2;
            }
            SurfaceKt.a(hVar3.i(androidx.compose.foundation.layout.W.f10226c), null, 0L, 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(847888321, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.components.IntercomErrorScreenKt.IntercomErrorScreen.1
                @Override // Ia.p
                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC1084f2, num.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(InterfaceC1084f interfaceC1084f2, int i14) {
                    if ((i14 & 11) == 2 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                        return;
                    }
                    androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13339e;
                    ErrorState errorState = state;
                    androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
                    androidx.compose.ui.layout.E eD = BoxKt.d(fVar, false);
                    int iF = interfaceC1084f2.F();
                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f2.z();
                    androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f2, aVar);
                    ComposeUiNode.f14331c0.getClass();
                    Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                    if (interfaceC1084f2.u() == null) {
                        I.b.k();
                        throw null;
                    }
                    interfaceC1084f2.r();
                    if (interfaceC1084f2.m()) {
                        interfaceC1084f2.v(aVar2);
                    } else {
                        interfaceC1084f2.A();
                    }
                    Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar = ComposeUiNode.Companion.f14337f;
                    R0.a(pVar, interfaceC1084f2, eD);
                    Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar2 = ComposeUiNode.Companion.f14336e;
                    R0.a(pVar2, interfaceC1084f2, interfaceC1089h0Z);
                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                    if (interfaceC1084f2.m() || !kotlin.jvm.internal.i.a(interfaceC1084f2.f(), Integer.valueOf(iF))) {
                        androidx.compose.animation.k.b(iF, interfaceC1084f2, iF, pVar3);
                    }
                    Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar4 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar4, interfaceC1084f2, hVarC);
                    C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13347n, interfaceC1084f2, 48);
                    int iF2 = interfaceC1084f2.F();
                    InterfaceC1089h0 interfaceC1089h0Z2 = interfaceC1084f2.z();
                    androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(interfaceC1084f2, aVar);
                    if (interfaceC1084f2.u() == null) {
                        I.b.k();
                        throw null;
                    }
                    interfaceC1084f2.r();
                    if (interfaceC1084f2.m()) {
                        interfaceC1084f2.v(aVar2);
                    } else {
                        interfaceC1084f2.A();
                    }
                    R0.a(pVar, interfaceC1084f2, c0953mA);
                    R0.a(pVar2, interfaceC1084f2, interfaceC1089h0Z2);
                    if (interfaceC1084f2.m() || !kotlin.jvm.internal.i.a(interfaceC1084f2.f(), Integer.valueOf(iF2))) {
                        androidx.compose.animation.k.b(iF2, interfaceC1084f2, iF2, pVar3);
                    }
                    R0.a(pVar4, interfaceC1084f2, hVarC2);
                    IconKt.a(U.c.a(errorState.getIconId(), interfaceC1084f2, 0), null, androidx.compose.foundation.layout.W.m(aVar, 32), 0L, interfaceC1084f2, 440, 8);
                    float f10 = 16;
                    Lb.a.a(interfaceC1084f2, androidx.compose.foundation.layout.W.e(aVar, f10));
                    String strP = S4.o.p(interfaceC1084f2, errorState.getMessageResId());
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    int i15 = IntercomTheme.$stable;
                    TextKt.b(strP, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(interfaceC1084f2, i15).getType03(), interfaceC1084f2, 0, 0, 65534);
                    Lb.a.a(interfaceC1084f2, androidx.compose.foundation.layout.W.e(aVar, 8));
                    Integer additionalMessageResId = errorState.getAdditionalMessageResId();
                    interfaceC1084f2.L(1192536998);
                    if (additionalMessageResId != null) {
                        TextKt.b(S4.o.p(interfaceC1084f2, additionalMessageResId.intValue()), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(interfaceC1084f2, i15).getType04(), interfaceC1084f2, 0, 0, 65534);
                    }
                    interfaceC1084f2.D();
                    Lb.a.a(interfaceC1084f2, androidx.compose.foundation.layout.W.e(aVar, f10));
                    interfaceC1084f2.L(1192545587);
                    if (errorState instanceof ErrorState.WithCTA) {
                        ErrorState.WithCTA withCTA = (ErrorState.WithCTA) errorState;
                        IntercomPrimaryButtonKt.IntercomPrimaryButton(S4.o.p(interfaceC1084f2, withCTA.getCtaResId()), null, null, withCTA.getOnCtaClick(), interfaceC1084f2, 0, 6);
                    }
                    interfaceC1084f2.D();
                    interfaceC1084f2.J();
                    interfaceC1084f2.J();
                }
            }, c1086gP), c1086gP, 12582912, R.styleable.AppCompatTheme_windowNoTitle);
            hVar2 = hVar3;
        } else {
            if (i13 != 0) {
                hVar3 = androidx.compose.ui.h.a.f13984b;
            } else {
                hVar3 = hVar2;
            }
            SurfaceKt.a(hVar3.i(androidx.compose.foundation.layout.W.f10226c), null, 0L, 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(847888321, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.components.IntercomErrorScreenKt.IntercomErrorScreen.1
                @Override // Ia.p
                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC1084f2, num.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(InterfaceC1084f interfaceC1084f2, int i14) {
                    if ((i14 & 11) == 2 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                        return;
                    }
                    androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13339e;
                    ErrorState errorState = state;
                    androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
                    androidx.compose.ui.layout.E eD = BoxKt.d(fVar, false);
                    int iF = interfaceC1084f2.F();
                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f2.z();
                    androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f2, aVar);
                    ComposeUiNode.f14331c0.getClass();
                    Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                    if (interfaceC1084f2.u() == null) {
                        I.b.k();
                        throw null;
                    }
                    interfaceC1084f2.r();
                    if (interfaceC1084f2.m()) {
                        interfaceC1084f2.v(aVar2);
                    } else {
                        interfaceC1084f2.A();
                    }
                    Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar = ComposeUiNode.Companion.f14337f;
                    R0.a(pVar, interfaceC1084f2, eD);
                    Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar2 = ComposeUiNode.Companion.f14336e;
                    R0.a(pVar2, interfaceC1084f2, interfaceC1089h0Z);
                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                    if (interfaceC1084f2.m() || !kotlin.jvm.internal.i.a(interfaceC1084f2.f(), Integer.valueOf(iF))) {
                        androidx.compose.animation.k.b(iF, interfaceC1084f2, iF, pVar3);
                    }
                    Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar4 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar4, interfaceC1084f2, hVarC);
                    C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13347n, interfaceC1084f2, 48);
                    int iF2 = interfaceC1084f2.F();
                    InterfaceC1089h0 interfaceC1089h0Z2 = interfaceC1084f2.z();
                    androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(interfaceC1084f2, aVar);
                    if (interfaceC1084f2.u() == null) {
                        I.b.k();
                        throw null;
                    }
                    interfaceC1084f2.r();
                    if (interfaceC1084f2.m()) {
                        interfaceC1084f2.v(aVar2);
                    } else {
                        interfaceC1084f2.A();
                    }
                    R0.a(pVar, interfaceC1084f2, c0953mA);
                    R0.a(pVar2, interfaceC1084f2, interfaceC1089h0Z2);
                    if (interfaceC1084f2.m() || !kotlin.jvm.internal.i.a(interfaceC1084f2.f(), Integer.valueOf(iF2))) {
                        androidx.compose.animation.k.b(iF2, interfaceC1084f2, iF2, pVar3);
                    }
                    R0.a(pVar4, interfaceC1084f2, hVarC2);
                    IconKt.a(U.c.a(errorState.getIconId(), interfaceC1084f2, 0), null, androidx.compose.foundation.layout.W.m(aVar, 32), 0L, interfaceC1084f2, 440, 8);
                    float f10 = 16;
                    Lb.a.a(interfaceC1084f2, androidx.compose.foundation.layout.W.e(aVar, f10));
                    String strP = S4.o.p(interfaceC1084f2, errorState.getMessageResId());
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    int i15 = IntercomTheme.$stable;
                    TextKt.b(strP, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(interfaceC1084f2, i15).getType03(), interfaceC1084f2, 0, 0, 65534);
                    Lb.a.a(interfaceC1084f2, androidx.compose.foundation.layout.W.e(aVar, 8));
                    Integer additionalMessageResId = errorState.getAdditionalMessageResId();
                    interfaceC1084f2.L(1192536998);
                    if (additionalMessageResId != null) {
                        TextKt.b(S4.o.p(interfaceC1084f2, additionalMessageResId.intValue()), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(interfaceC1084f2, i15).getType04(), interfaceC1084f2, 0, 0, 65534);
                    }
                    interfaceC1084f2.D();
                    Lb.a.a(interfaceC1084f2, androidx.compose.foundation.layout.W.e(aVar, f10));
                    interfaceC1084f2.L(1192545587);
                    if (errorState instanceof ErrorState.WithCTA) {
                        ErrorState.WithCTA withCTA = (ErrorState.WithCTA) errorState;
                        IntercomPrimaryButtonKt.IntercomPrimaryButton(S4.o.p(interfaceC1084f2, withCTA.getCtaResId()), null, null, withCTA.getOnCtaClick(), interfaceC1084f2, 0, 6);
                    }
                    interfaceC1084f2.D();
                    interfaceC1084f2.J();
                    interfaceC1084f2.J();
                }
            }, c1086gP), c1086gP, 12582912, R.styleable.AppCompatTheme_windowNoTitle);
            hVar2 = hVar3;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.components.u0
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return IntercomErrorScreenKt.IntercomErrorScreen$lambda$0(state, hVar2, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r IntercomErrorScreen$lambda$0(ErrorState state, androidx.compose.ui.h hVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(state, "$state");
        IntercomErrorScreen(state, hVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }
}
