package io.intercom.android.sdk.m5.conversation.ui.components.row;

import android.content.Context;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.InterfaceC0928f;
import androidx.compose.animation.core.C0907g;
import androidx.compose.animation.core.c0;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.InterfaceC0954n;
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
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.braze.Constants;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.TextWithSeparatorKt;
import io.intercom.android.sdk.m5.conversation.ui.C2397l;
import io.intercom.android.sdk.tickets.TicketDetailState;
import io.intercom.android.sdk.tickets.TicketProgressIndicatorKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.TimeFormatterExtKt;

/* JADX INFO: compiled from: BigTicketCard.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class BigTicketCardKt {
    public static final void BigTicketCard(final TicketDetailState.TicketDetailContentState ticketDetailState, final Ia.a<p293xa.r> onClick, final boolean z10, androidx.compose.ui.h hVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        kotlin.jvm.internal.i.e(ticketDetailState, "ticketDetailState");
        kotlin.jvm.internal.i.e(onClick, "onClick");
        C1086g c1086gP = interfaceC1084f.p(1861461937);
        androidx.compose.ui.h hVar2 = (i11 & 8) != 0 ? androidx.compose.ui.h.a.f13984b : hVar;
        final Context context = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
        c0 c0VarD = C0907g.d(Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS, 0, null, 6);
        androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13336b;
        androidx.compose.animation.n nVarB = EnterExitTransitionKt.c(c0VarD, fVar, 12).b(EnterExitTransitionKt.m(new C2370b(0), C0907g.d(Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS, 500, null, 4))).b(EnterExitTransitionKt.e(C0907g.d(Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS, 500, null, 4), 0.0f, 2));
        androidx.compose.animation.p pVarB = EnterExitTransitionKt.p(new C2397l(1), C0907g.d(Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS, 0, null, 6)).b(EnterExitTransitionKt.f(C0907g.d(Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS, 0, null, 6), 2)).b(EnterExitTransitionKt.j(C0907g.d(Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS, 500, null, 4), fVar, 12));
        ComposableLambdaImpl composableLambdaImplB = androidx.compose.runtime.internal.a.b(-915811879, new Ia.q<InterfaceC0928f, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.BigTicketCardKt.BigTicketCard.3
            @Override // Ia.q
            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0928f interfaceC0928f, InterfaceC1084f interfaceC1084f2, Integer num) {
                invoke(interfaceC0928f, interfaceC1084f2, num.intValue());
                return p293xa.r.f47939a;
            }

            public final void invoke(InterfaceC0928f AnimatedVisibility, InterfaceC1084f interfaceC1084f2, int i12) {
                kotlin.jvm.internal.i.e(AnimatedVisibility, "$this$AnimatedVisibility");
                androidx.compose.ui.f.a aVar = androidx.compose.ui.d.a.f13347n;
                Ia.a<p293xa.r> aVar2 = onClick;
                final TicketDetailState.TicketDetailContentState ticketDetailContentState = ticketDetailState;
                final Context context2 = context;
                androidx.compose.ui.h.a aVar3 = androidx.compose.ui.h.a.f13984b;
                C0953m c0953mA = C0952l.a(C0945e.f10286c, aVar, interfaceC1084f2, 48);
                int iF = interfaceC1084f2.F();
                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f2.z();
                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f2, aVar3);
                ComposeUiNode.f14331c0.getClass();
                Ia.a<ComposeUiNode> aVar4 = ComposeUiNode.Companion.f14333b;
                if (interfaceC1084f2.u() == null) {
                    I.b.k();
                    throw null;
                }
                interfaceC1084f2.r();
                if (interfaceC1084f2.m()) {
                    interfaceC1084f2.v(aVar4);
                } else {
                    interfaceC1084f2.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f2, c0953mA);
                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f2, interfaceC1089h0Z);
                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                if (interfaceC1084f2.m() || !kotlin.jvm.internal.i.a(interfaceC1084f2.f(), Integer.valueOf(iF))) {
                    androidx.compose.animation.k.b(iF, interfaceC1084f2, iF, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f2, hVarC);
                TextKt.b(S4.o.p(interfaceC1084f2, R.string.intercom_your_ticket), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(interfaceC1084f2, IntercomTheme.$stable).getType04(), interfaceC1084f2, 0, 0, 65534);
                IntercomCardKt.IntercomCard(aVar2, PaddingKt.g(14, 12, aVar3), false, IntercomCardStyle.INSTANCE.m530conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, interfaceC1084f2, IntercomCardStyle.$stable << 15, 31), null, androidx.compose.runtime.internal.a.b(-1554241908, new Ia.q<InterfaceC0954n, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.BigTicketCardKt$BigTicketCard$3$1$1
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0954n interfaceC0954n, InterfaceC1084f interfaceC1084f3, Integer num) {
                        invoke(interfaceC0954n, interfaceC1084f3, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC0954n IntercomCard, InterfaceC1084f interfaceC1084f3, int i13) {
                        String str;
                        kotlin.jvm.internal.i.e(IntercomCard, "$this$IntercomCard");
                        if ((i13 & 81) == 16 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                            return;
                        }
                        TicketDetailState.TicketDetailContentState ticketDetailContentState2 = ticketDetailContentState;
                        Context context3 = context2;
                        androidx.compose.ui.h.a aVar5 = androidx.compose.ui.h.a.f13984b;
                        C0945e.k kVar = C0945e.f10286c;
                        C0953m c0953mA2 = C0952l.a(kVar, androidx.compose.ui.d.a.f13346m, interfaceC1084f3, 0);
                        int iF2 = interfaceC1084f3.F();
                        InterfaceC1089h0 interfaceC1089h0Z2 = interfaceC1084f3.z();
                        androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(interfaceC1084f3, aVar5);
                        ComposeUiNode.f14331c0.getClass();
                        Ia.a<ComposeUiNode> aVar6 = ComposeUiNode.Companion.f14333b;
                        if (interfaceC1084f3.u() == null) {
                            I.b.k();
                            throw null;
                        }
                        interfaceC1084f3.r();
                        if (interfaceC1084f3.m()) {
                            interfaceC1084f3.v(aVar6);
                        } else {
                            interfaceC1084f3.A();
                        }
                        Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar2 = ComposeUiNode.Companion.f14337f;
                        R0.a(pVar2, interfaceC1084f3, c0953mA2);
                        Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar3 = ComposeUiNode.Companion.f14336e;
                        R0.a(pVar3, interfaceC1084f3, interfaceC1089h0Z2);
                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar4 = ComposeUiNode.Companion.f14338g;
                        if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF2))) {
                            androidx.compose.animation.k.b(iF2, interfaceC1084f3, iF2, pVar4);
                        }
                        Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar5 = ComposeUiNode.Companion.f14335d;
                        R0.a(pVar5, interfaceC1084f3, hVarC2);
                        float f10 = 12;
                        androidx.compose.ui.h hVarF = PaddingKt.f(aVar5, f10);
                        androidx.compose.ui.f.a aVar7 = androidx.compose.ui.d.a.f13347n;
                        C0953m c0953mA3 = C0952l.a(kVar, aVar7, interfaceC1084f3, 48);
                        int iF3 = interfaceC1084f3.F();
                        InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f3.z();
                        androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f3, hVarF);
                        if (interfaceC1084f3.u() == null) {
                            I.b.k();
                            throw null;
                        }
                        interfaceC1084f3.r();
                        if (interfaceC1084f3.m()) {
                            interfaceC1084f3.v(aVar6);
                        } else {
                            interfaceC1084f3.A();
                        }
                        R0.a(pVar2, interfaceC1084f3, c0953mA3);
                        R0.a(pVar3, interfaceC1084f3, interfaceC1089h0Z3);
                        if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF3))) {
                            androidx.compose.animation.k.b(iF3, interfaceC1084f3, iF3, pVar4);
                        }
                        R0.a(pVar5, interfaceC1084f3, hVarC3);
                        Lb.a.a(interfaceC1084f3, W.e(aVar5, 4));
                        String ticketName = ticketDetailContentState2.getTicketName();
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        int i14 = IntercomTheme.$stable;
                        TextKt.b(ticketName, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(interfaceC1084f3, i14).getType04SemiBold(), interfaceC1084f3, 0, 0, 65534);
                        ticketDetailContentState2.getTicketTimelineCardState().getStatusLabel();
                        p293xa.r rVar = p293xa.r.f47939a;
                        float f11 = 8;
                        Lb.a.a(interfaceC1084f3, W.e(aVar5, f11));
                        String statusLabel = ticketDetailContentState2.getTicketTimelineCardState().getStatusLabel();
                        Long timestamp = ticketDetailContentState2.getTicketTimelineCardState().getTimestamp();
                        if (timestamp == null || (str = TimeFormatterExtKt.formattedDateFromLong(timestamp.longValue(), context3)) == null) {
                            str = "";
                        }
                        TextWithSeparatorKt.m129TextWithSeparatorwV1YYcM(statusLabel, str, null, null, intercomTheme.getTypography(interfaceC1084f3, i14).getType04SemiBold(), ticketDetailContentState2.getTicketTimelineCardState().m481getProgressColor0d7_KjU(), 0, 0, new androidx.compose.ui.text.style.g(3), interfaceC1084f3, 0, 204);
                        Lb.a.a(interfaceC1084f3, W.e(aVar5, f11));
                        TextKt.b(ticketDetailContentState2.getTicketTimelineCardState().getStatusTitle(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(interfaceC1084f3, i14).getType04(), interfaceC1084f3, 0, 0, 65534);
                        Lb.a.a(interfaceC1084f3, W.e(aVar5, 16));
                        TicketProgressIndicatorKt.m476TicketProgressIndicator3IgeMak(ticketDetailContentState2.getTicketTimelineCardState().getProgressSections(), ticketDetailContentState2.getTicketTimelineCardState().m481getProgressColor0d7_KjU(), null, interfaceC1084f3, 8, 4);
                        Lb.a.a(interfaceC1084f3, W.e(aVar5, f11));
                        interfaceC1084f3.J();
                        IntercomDividerKt.IntercomDivider(PaddingKt.h(aVar5, f10, 0.0f, 2), interfaceC1084f3, 6, 0);
                        androidx.compose.ui.h hVarH = PaddingKt.h(new HorizontalAlignElement(aVar7), 0.0f, 14, 1);
                        T tA = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, interfaceC1084f3, 48);
                        int iF4 = interfaceC1084f3.F();
                        InterfaceC1089h0 interfaceC1089h0Z4 = interfaceC1084f3.z();
                        androidx.compose.ui.h hVarC4 = ComposedModifierKt.c(interfaceC1084f3, hVarH);
                        if (interfaceC1084f3.u() == null) {
                            I.b.k();
                            throw null;
                        }
                        interfaceC1084f3.r();
                        if (interfaceC1084f3.m()) {
                            interfaceC1084f3.v(aVar6);
                        } else {
                            interfaceC1084f3.A();
                        }
                        R0.a(pVar2, interfaceC1084f3, tA);
                        R0.a(pVar3, interfaceC1084f3, interfaceC1089h0Z4);
                        if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF4))) {
                            androidx.compose.animation.k.b(iF4, interfaceC1084f3, iF4, pVar4);
                        }
                        R0.a(pVar5, interfaceC1084f3, hVarC4);
                        IconKt.a(U.c.a(R.drawable.intercom_ticket_detail_icon, interfaceC1084f3, 0), null, PaddingKt.j(aVar5, 0.0f, 0.0f, f11, 0.0f, 11), ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(intercomTheme.getColors(interfaceC1084f3, i14).m615getAction0d7_KjU()), interfaceC1084f3, 440, 0);
                        TextKt.b(S4.o.p(interfaceC1084f3, R.string.intercom_tickets_view_ticket), null, ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(intercomTheme.getColors(interfaceC1084f3, i14).m615getAction0d7_KjU()), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(interfaceC1084f3, i14).getType04SemiBold(), interfaceC1084f3, 0, 0, 65530);
                        interfaceC1084f3.J();
                        interfaceC1084f3.J();
                    }
                }, interfaceC1084f2), interfaceC1084f2, (IntercomCardStyle.Style.$stable << 9) | 196656, 20);
                interfaceC1084f2.J();
            }
        }, c1086gP);
        int i12 = i10 >> 6;
        AnimatedVisibilityKt.e(z10, hVar2, nVarB, pVarB, null, composableLambdaImplB, c1086gP, (i12 & 14) | 196992 | (i12 & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 16);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final androidx.compose.ui.h hVar3 = hVar2;
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.c
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return BigTicketCardKt.BigTicketCard$lambda$2(ticketDetailState, onClick, z10, hVar3, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int BigTicketCard$lambda$0(int i10) {
        return -i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int BigTicketCard$lambda$1(int i10) {
        return -i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r BigTicketCard$lambda$2(TicketDetailState.TicketDetailContentState ticketDetailState, Ia.a onClick, boolean z10, androidx.compose.ui.h hVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(ticketDetailState, "$ticketDetailState");
        kotlin.jvm.internal.i.e(onClick, "$onClick");
        BigTicketCard(ticketDetailState, onClick, z10, hVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void BigTicketCardPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1841168271);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$BigTicketCardKt.INSTANCE.m214getLambda1$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new io.intercom.android.sdk.m5.components.T(i10, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r BigTicketCardPreview$lambda$3(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        BigTicketCardPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void BigTicketCardWaitingPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1532589538);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$BigTicketCardKt.INSTANCE.m215getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new io.intercom.android.sdk.helpcenter.articles.x(i10, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r BigTicketCardWaitingPreview$lambda$4(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        BigTicketCardWaitingPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
