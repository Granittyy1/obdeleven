package io.intercom.android.sdk.tickets;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.InterfaceC0928f;
import androidx.compose.animation.core.C0907g;
import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.h0;
import androidx.compose.ui.layout.E;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.F;
import com.braze.Constants;
import io.intercom.android.sdk.m5.components.C2270b;
import io.intercom.android.sdk.m5.components.C2297o0;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: TicketProgressBanner.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketProgressBannerKt {
    /* JADX WARN: Code duplicated, block: B:50:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0093  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:56:0x00db  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    public static final void TicketProgressBanner(final String name, final Ia.a<p293xa.r> onClick, final boolean z10, androidx.compose.ui.h hVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.h hVar2;
        androidx.compose.ui.h hVar3;
        final androidx.compose.ui.h hVar4;
        C1105p0 c1105p0V;
        kotlin.jvm.internal.i.e(name, "name");
        kotlin.jvm.internal.i.e(onClick, "onClick");
        C1086g c1086gP = interfaceC1084f.p(-108721483);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c1086gP.K(name) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i12 |= c1086gP.k(onClick) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            i12 |= c1086gP.c(z10) ? 256 : 128;
        }
        int i13 = i11 & 8;
        if (i13 == 0) {
            if ((i10 & 7168) == 0) {
                hVar2 = hVar;
                i12 |= c1086gP.K(hVar2) ? 2048 : 1024;
            }
            if ((i12 & 5851) == 1170 || !c1086gP.s()) {
                if (i13 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                int i14 = i12 >> 6;
                AnimatedVisibilityKt.e(z10, hVar3, EnterExitTransitionKt.e(C0907g.d(Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS, Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS, null, 4), 0.0f, 2), EnterExitTransitionKt.f(C0907g.d(Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS, 0, null, 6), 2), null, androidx.compose.runtime.internal.a.b(417589981, new Ia.q<InterfaceC0928f, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.tickets.TicketProgressBannerKt.TicketProgressBanner.1
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0928f interfaceC0928f, InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC0928f, interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC0928f AnimatedVisibility, InterfaceC1084f interfaceC1084f2, int i15) {
                        kotlin.jvm.internal.i.e(AnimatedVisibility, "$this$AnimatedVisibility");
                        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
                        androidx.compose.ui.h hVarS = W.s(W.d(aVar, 1.0f));
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        int i16 = IntercomTheme.$stable;
                        androidx.compose.ui.h hVarB = C0932d.b(hVarS, intercomTheme.getColors(interfaceC1084f2, i16).m621getBackground0d7_KjU(), h0.f13629a);
                        interfaceC1084f2.L(669306758);
                        Object objF = interfaceC1084f2.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = new androidx.compose.foundation.interaction.l();
                            interfaceC1084f2.E(objF);
                        }
                        interfaceC1084f2.D();
                        androidx.compose.ui.h hVarB2 = ClickableKt.b(hVarB, (androidx.compose.foundation.interaction.k) objF, null, false, null, onClick, 28);
                        String str = name;
                        C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f2, 0);
                        int iF = interfaceC1084f2.F();
                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f2.z();
                        androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f2, hVarB2);
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
                        Ia.p<ComposeUiNode, E, p293xa.r> pVar = ComposeUiNode.Companion.f14337f;
                        R0.a(pVar, interfaceC1084f2, c0953mA);
                        Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar2 = ComposeUiNode.Companion.f14336e;
                        R0.a(pVar2, interfaceC1084f2, interfaceC1089h0Z);
                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                        if (interfaceC1084f2.m() || !kotlin.jvm.internal.i.a(interfaceC1084f2.f(), Integer.valueOf(iF))) {
                            androidx.compose.animation.k.b(iF, interfaceC1084f2, iF, pVar3);
                        }
                        Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar4 = ComposeUiNode.Companion.f14335d;
                        R0.a(pVar4, interfaceC1084f2, hVarC);
                        float f10 = 12;
                        Lb.a.a(interfaceC1084f2, W.e(aVar, f10));
                        androidx.compose.ui.h hVarH = PaddingKt.h(W.s(W.d(aVar, 1.0f)), 16, 0.0f, 2);
                        T tA = S.a(C0945e.f10288e, androidx.compose.ui.d.a.f13344k, interfaceC1084f2, 54);
                        int iF2 = interfaceC1084f2.F();
                        InterfaceC1089h0 interfaceC1089h0Z2 = interfaceC1084f2.z();
                        androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(interfaceC1084f2, hVarH);
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
                        R0.a(pVar, interfaceC1084f2, tA);
                        R0.a(pVar2, interfaceC1084f2, interfaceC1089h0Z2);
                        if (interfaceC1084f2.m() || !kotlin.jvm.internal.i.a(interfaceC1084f2.f(), Integer.valueOf(iF2))) {
                            androidx.compose.animation.k.b(iF2, interfaceC1084f2, iF2, pVar3);
                        }
                        R0.a(pVar4, interfaceC1084f2, hVarC2);
                        IconKt.a(U.c.a(io.intercom.android.sdk.R.drawable.intercom_ticket_detail_icon, interfaceC1084f2, 0), null, null, intercomTheme.getColors(interfaceC1084f2, i16).m616getActionContrastWhite0d7_KjU(), interfaceC1084f2, 56, 4);
                        Lb.a.a(interfaceC1084f2, W.q(aVar, 8));
                        TextKt.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(intercomTheme.getTypography(interfaceC1084f2, i16).getType04Point5(), intercomTheme.getColors(interfaceC1084f2, i16).m616getActionContrastWhite0d7_KjU(), 0L, androidx.compose.ui.text.font.l.f15444i, null, 0L, null, 0, 0L, null, null, 16777210), interfaceC1084f2, 0, 3120, 55294);
                        interfaceC1084f2.J();
                        Lb.a.a(interfaceC1084f2, W.e(aVar, f10));
                        IntercomDividerKt.IntercomDivider(null, interfaceC1084f2, 0, 1);
                        interfaceC1084f2.J();
                    }
                }, c1086gP), c1086gP, (i14 & 14) | 200064 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 16);
                hVar4 = hVar3;
            } else {
                c1086gP.w();
                hVar4 = hVar2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.tickets.p
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TicketProgressBannerKt.TicketProgressBanner$lambda$0(name, onClick, z10, hVar4, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 3072;
        hVar2 = hVar;
        if ((i12 & 5851) == 1170) {
            if (i13 != 0) {
                hVar3 = androidx.compose.ui.h.a.f13984b;
            } else {
                hVar3 = hVar2;
            }
            int i15 = i12 >> 6;
            AnimatedVisibilityKt.e(z10, hVar3, EnterExitTransitionKt.e(C0907g.d(Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS, Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS, null, 4), 0.0f, 2), EnterExitTransitionKt.f(C0907g.d(Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS, 0, null, 6), 2), null, androidx.compose.runtime.internal.a.b(417589981, new Ia.q<InterfaceC0928f, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.tickets.TicketProgressBannerKt.TicketProgressBanner.1
                @Override // Ia.q
                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0928f interfaceC0928f, InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC0928f, interfaceC1084f2, num.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(InterfaceC0928f AnimatedVisibility, InterfaceC1084f interfaceC1084f2, int i16) {
                    kotlin.jvm.internal.i.e(AnimatedVisibility, "$this$AnimatedVisibility");
                    androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
                    androidx.compose.ui.h hVarS = W.s(W.d(aVar, 1.0f));
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    int i17 = IntercomTheme.$stable;
                    androidx.compose.ui.h hVarB = C0932d.b(hVarS, intercomTheme.getColors(interfaceC1084f2, i17).m621getBackground0d7_KjU(), h0.f13629a);
                    interfaceC1084f2.L(669306758);
                    Object objF = interfaceC1084f2.f();
                    if (objF == InterfaceC1084f.a.f12980a) {
                        objF = new androidx.compose.foundation.interaction.l();
                        interfaceC1084f2.E(objF);
                    }
                    interfaceC1084f2.D();
                    androidx.compose.ui.h hVarB2 = ClickableKt.b(hVarB, (androidx.compose.foundation.interaction.k) objF, null, false, null, onClick, 28);
                    String str = name;
                    C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f2, 0);
                    int iF = interfaceC1084f2.F();
                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f2.z();
                    androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f2, hVarB2);
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
                    Ia.p<ComposeUiNode, E, p293xa.r> pVar = ComposeUiNode.Companion.f14337f;
                    R0.a(pVar, interfaceC1084f2, c0953mA);
                    Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar2 = ComposeUiNode.Companion.f14336e;
                    R0.a(pVar2, interfaceC1084f2, interfaceC1089h0Z);
                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                    if (interfaceC1084f2.m() || !kotlin.jvm.internal.i.a(interfaceC1084f2.f(), Integer.valueOf(iF))) {
                        androidx.compose.animation.k.b(iF, interfaceC1084f2, iF, pVar3);
                    }
                    Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar4 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar4, interfaceC1084f2, hVarC);
                    float f10 = 12;
                    Lb.a.a(interfaceC1084f2, W.e(aVar, f10));
                    androidx.compose.ui.h hVarH = PaddingKt.h(W.s(W.d(aVar, 1.0f)), 16, 0.0f, 2);
                    T tA = S.a(C0945e.f10288e, androidx.compose.ui.d.a.f13344k, interfaceC1084f2, 54);
                    int iF2 = interfaceC1084f2.F();
                    InterfaceC1089h0 interfaceC1089h0Z2 = interfaceC1084f2.z();
                    androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(interfaceC1084f2, hVarH);
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
                    R0.a(pVar, interfaceC1084f2, tA);
                    R0.a(pVar2, interfaceC1084f2, interfaceC1089h0Z2);
                    if (interfaceC1084f2.m() || !kotlin.jvm.internal.i.a(interfaceC1084f2.f(), Integer.valueOf(iF2))) {
                        androidx.compose.animation.k.b(iF2, interfaceC1084f2, iF2, pVar3);
                    }
                    R0.a(pVar4, interfaceC1084f2, hVarC2);
                    IconKt.a(U.c.a(io.intercom.android.sdk.R.drawable.intercom_ticket_detail_icon, interfaceC1084f2, 0), null, null, intercomTheme.getColors(interfaceC1084f2, i17).m616getActionContrastWhite0d7_KjU(), interfaceC1084f2, 56, 4);
                    Lb.a.a(interfaceC1084f2, W.q(aVar, 8));
                    TextKt.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(intercomTheme.getTypography(interfaceC1084f2, i17).getType04Point5(), intercomTheme.getColors(interfaceC1084f2, i17).m616getActionContrastWhite0d7_KjU(), 0L, androidx.compose.ui.text.font.l.f15444i, null, 0L, null, 0, 0L, null, null, 16777210), interfaceC1084f2, 0, 3120, 55294);
                    interfaceC1084f2.J();
                    Lb.a.a(interfaceC1084f2, W.e(aVar, f10));
                    IntercomDividerKt.IntercomDivider(null, interfaceC1084f2, 0, 1);
                    interfaceC1084f2.J();
                }
            }, c1086gP), c1086gP, (i15 & 14) | 200064 | (i15 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 16);
            hVar4 = hVar3;
        } else {
            if (i13 != 0) {
                hVar3 = androidx.compose.ui.h.a.f13984b;
            } else {
                hVar3 = hVar2;
            }
            int i16 = i12 >> 6;
            AnimatedVisibilityKt.e(z10, hVar3, EnterExitTransitionKt.e(C0907g.d(Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS, Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS, null, 4), 0.0f, 2), EnterExitTransitionKt.f(C0907g.d(Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS, 0, null, 6), 2), null, androidx.compose.runtime.internal.a.b(417589981, new Ia.q<InterfaceC0928f, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.tickets.TicketProgressBannerKt.TicketProgressBanner.1
                @Override // Ia.q
                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0928f interfaceC0928f, InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC0928f, interfaceC1084f2, num.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(InterfaceC0928f AnimatedVisibility, InterfaceC1084f interfaceC1084f2, int i17) {
                    kotlin.jvm.internal.i.e(AnimatedVisibility, "$this$AnimatedVisibility");
                    androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
                    androidx.compose.ui.h hVarS = W.s(W.d(aVar, 1.0f));
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    int i18 = IntercomTheme.$stable;
                    androidx.compose.ui.h hVarB = C0932d.b(hVarS, intercomTheme.getColors(interfaceC1084f2, i18).m621getBackground0d7_KjU(), h0.f13629a);
                    interfaceC1084f2.L(669306758);
                    Object objF = interfaceC1084f2.f();
                    if (objF == InterfaceC1084f.a.f12980a) {
                        objF = new androidx.compose.foundation.interaction.l();
                        interfaceC1084f2.E(objF);
                    }
                    interfaceC1084f2.D();
                    androidx.compose.ui.h hVarB2 = ClickableKt.b(hVarB, (androidx.compose.foundation.interaction.k) objF, null, false, null, onClick, 28);
                    String str = name;
                    C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f2, 0);
                    int iF = interfaceC1084f2.F();
                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f2.z();
                    androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f2, hVarB2);
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
                    Ia.p<ComposeUiNode, E, p293xa.r> pVar = ComposeUiNode.Companion.f14337f;
                    R0.a(pVar, interfaceC1084f2, c0953mA);
                    Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar2 = ComposeUiNode.Companion.f14336e;
                    R0.a(pVar2, interfaceC1084f2, interfaceC1089h0Z);
                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                    if (interfaceC1084f2.m() || !kotlin.jvm.internal.i.a(interfaceC1084f2.f(), Integer.valueOf(iF))) {
                        androidx.compose.animation.k.b(iF, interfaceC1084f2, iF, pVar3);
                    }
                    Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar4 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar4, interfaceC1084f2, hVarC);
                    float f10 = 12;
                    Lb.a.a(interfaceC1084f2, W.e(aVar, f10));
                    androidx.compose.ui.h hVarH = PaddingKt.h(W.s(W.d(aVar, 1.0f)), 16, 0.0f, 2);
                    T tA = S.a(C0945e.f10288e, androidx.compose.ui.d.a.f13344k, interfaceC1084f2, 54);
                    int iF2 = interfaceC1084f2.F();
                    InterfaceC1089h0 interfaceC1089h0Z2 = interfaceC1084f2.z();
                    androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(interfaceC1084f2, hVarH);
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
                    R0.a(pVar, interfaceC1084f2, tA);
                    R0.a(pVar2, interfaceC1084f2, interfaceC1089h0Z2);
                    if (interfaceC1084f2.m() || !kotlin.jvm.internal.i.a(interfaceC1084f2.f(), Integer.valueOf(iF2))) {
                        androidx.compose.animation.k.b(iF2, interfaceC1084f2, iF2, pVar3);
                    }
                    R0.a(pVar4, interfaceC1084f2, hVarC2);
                    IconKt.a(U.c.a(io.intercom.android.sdk.R.drawable.intercom_ticket_detail_icon, interfaceC1084f2, 0), null, null, intercomTheme.getColors(interfaceC1084f2, i18).m616getActionContrastWhite0d7_KjU(), interfaceC1084f2, 56, 4);
                    Lb.a.a(interfaceC1084f2, W.q(aVar, 8));
                    TextKt.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, F.a(intercomTheme.getTypography(interfaceC1084f2, i18).getType04Point5(), intercomTheme.getColors(interfaceC1084f2, i18).m616getActionContrastWhite0d7_KjU(), 0L, androidx.compose.ui.text.font.l.f15444i, null, 0L, null, 0, 0L, null, null, 16777210), interfaceC1084f2, 0, 3120, 55294);
                    interfaceC1084f2.J();
                    Lb.a.a(interfaceC1084f2, W.e(aVar, f10));
                    IntercomDividerKt.IntercomDivider(null, interfaceC1084f2, 0, 1);
                    interfaceC1084f2.J();
                }
            }, c1086gP), c1086gP, (i16 & 14) | 200064 | (i16 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 16);
            hVar4 = hVar3;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.tickets.p
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TicketProgressBannerKt.TicketProgressBanner$lambda$0(name, onClick, z10, hVar4, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TicketProgressBanner$lambda$0(String name, Ia.a onClick, boolean z10, androidx.compose.ui.h hVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(name, "$name");
        kotlin.jvm.internal.i.e(onClick, "$onClick");
        TicketProgressBanner(name, onClick, z10, hVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    public static final void TicketProgressRowLongTextPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-384429412);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketProgressBannerKt.INSTANCE.m469getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2270b(i10, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TicketProgressRowLongTextPreview$lambda$2(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        TicketProgressRowLongTextPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void TicketProgressRowPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-433396877);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketProgressBannerKt.INSTANCE.m468getLambda1$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2297o0(i10, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TicketProgressRowPreview$lambda$1(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        TicketProgressRowPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
