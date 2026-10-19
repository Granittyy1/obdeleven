package io.intercom.android.sdk.tickets;

import android.content.Context;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.T;
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
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.sdk.m5.components.AvatarGroupKt;
import io.intercom.android.sdk.m5.components.C2282h;
import io.intercom.android.sdk.m5.components.P;
import io.intercom.android.sdk.m5.components.Q;
import io.intercom.android.sdk.m5.components.TextWithSeparatorKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.ui.components.O;
import io.intercom.android.sdk.m5.conversation.ui.components.row.C2369a;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.TimeFormatterExtKt;

/* JADX INFO: compiled from: TicketTimelineCard.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketTimelineCardKt {
    private static final TicketTimelineCardState sampleTicketTimelineCardState;

    static {
        Avatar avatarCreate = Avatar.create("https://static.intercomassets.com/avatars/5355644/square_128/002Bizimply-Headshots-1641919551.jpeg", "");
        kotlin.jvm.internal.i.d(avatarCreate, "create(...)");
        String str = "Hannah will pick this up soon 🙌";
        String str2 = "🕑  Estimated to be resolved today at 4pm";
        String str3 = "Submitted";
        sampleTicketTimelineCardState = new TicketTimelineCardState(M1.k(new AvatarWrapper(avatarCreate, false, 2, null)), str, str2, TicketStatus.Submitted.m477getColor0d7_KjU(), kotlin.collections.l.s(new TicketTimelineCardState.ProgressSection(true, true), new TicketTimelineCardState.ProgressSection(false, false), new TicketTimelineCardState.ProgressSection(false, false)), str3, 1634889351L, null);
    }

    public static final void InProgressTicketTimelineWithLabelPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-255211063);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketTimelineCardKt.INSTANCE.m474getLambda4$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new O(i10, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r InProgressTicketTimelineWithLabelPreview$lambda$6(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        InProgressTicketTimelineWithLabelPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    public static final void ResolvedTicketTimelineWithLabelPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(2040249091);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketTimelineCardKt.INSTANCE.m473getLambda3$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new P(i10, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ResolvedTicketTimelineWithLabelPreview$lambda$5(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        ResolvedTicketTimelineWithLabelPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    public static final void SubmittedTicketTimelineWithLabelPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1972637636);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketTimelineCardKt.INSTANCE.m472getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2282h(i10, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r SubmittedTicketTimelineWithLabelPreview$lambda$4(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        SubmittedTicketTimelineWithLabelPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    public static final void TicketTimelineCard(TicketTimelineCardState ticketTimelineCardState, androidx.compose.ui.h hVar, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        String str;
        kotlin.jvm.internal.i.e(ticketTimelineCardState, "ticketTimelineCardState");
        C1086g c1086gP = interfaceC1084f.p(926572596);
        int i12 = i11 & 2;
        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
        androidx.compose.ui.h hVar2 = i12 != 0 ? aVar : hVar;
        Context context = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
        androidx.compose.ui.h hVarF = PaddingKt.f(hVar2, 24);
        C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13347n, c1086gP, 48);
        int i13 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
        androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarF);
        ComposeUiNode.f14331c0.getClass();
        Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar2);
        } else {
            c1086gP.A();
        }
        Ia.p<ComposeUiNode, E, p293xa.r> pVar = ComposeUiNode.Companion.f14337f;
        R0.a(pVar, c1086gP, c0953mA);
        Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar2 = ComposeUiNode.Companion.f14336e;
        R0.a(pVar2, c1086gP, interfaceC1089h0P);
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
        if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i13))) {
            J4.i.d(i13, c1086gP, i13, pVar3);
        }
        Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar4 = ComposeUiNode.Companion.f14335d;
        R0.a(pVar4, c1086gP, hVarC);
        androidx.compose.ui.h hVarU = W.u(aVar);
        T tA = S.a(C0945e.f10284a, androidx.compose.ui.d.a.j, c1086gP, 0);
        int i14 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
        androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVarU);
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar2);
        } else {
            c1086gP.A();
        }
        R0.a(pVar, c1086gP, tA);
        R0.a(pVar2, c1086gP, interfaceC1089h0P2);
        if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i14))) {
            J4.i.d(i14, c1086gP, i14, pVar3);
        }
        R0.a(pVar4, c1086gP, hVarC2);
        AvatarGroupKt.m59AvatarGroupJ8mCjc(ticketTimelineCardState.getAdminAvatars(), null, 64, G0.a.g(24), c1086gP, 3464, 2);
        c1086gP.T(true);
        Lb.a.a(c1086gP, W.e(aVar, 12));
        String statusLabel = ticketTimelineCardState.getStatusLabel();
        Long timestamp = ticketTimelineCardState.getTimestamp();
        if (timestamp == null || (str = TimeFormatterExtKt.formattedDateFromLong(timestamp.longValue(), context)) == null) {
            str = "";
        }
        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
        int i15 = IntercomTheme.$stable;
        androidx.compose.ui.h hVar3 = hVar2;
        TextWithSeparatorKt.m129TextWithSeparatorwV1YYcM(statusLabel, str, null, null, intercomTheme.getTypography(c1086gP, i15).getType04SemiBold(), ticketTimelineCardState.m481getProgressColor0d7_KjU(), 0, 0, new androidx.compose.ui.text.style.g(3), c1086gP, 0, 204);
        float f10 = 8;
        Lb.a.a(c1086gP, W.e(aVar, f10));
        TextKt.b(ticketTimelineCardState.getStatusTitle(), null, intercomTheme.getColors(c1086gP, i15).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i15).getType04(), c1086gP, 0, 0, 65530);
        c1086gP.L(2095162818);
        if (ticketTimelineCardState.getStatusSubtitle().length() > 0) {
            Lb.a.a(c1086gP, W.e(aVar, f10));
            TextKt.b(ticketTimelineCardState.getStatusSubtitle(), null, intercomTheme.getColors(c1086gP, i15).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i15).getType04(), c1086gP, 0, 0, 65530);
        }
        c1086gP.T(false);
        Lb.a.a(c1086gP, W.e(aVar, 16));
        TicketProgressIndicatorKt.m476TicketProgressIndicator3IgeMak(ticketTimelineCardState.getProgressSections(), ticketTimelineCardState.m481getProgressColor0d7_KjU(), null, c1086gP, 8, 4);
        c1086gP.T(true);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2369a(ticketTimelineCardState, hVar3, i10, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TicketTimelineCard$lambda$2(TicketTimelineCardState ticketTimelineCardState, androidx.compose.ui.h hVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(ticketTimelineCardState, "$ticketTimelineCardState");
        TicketTimelineCard(ticketTimelineCardState, hVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    public static final void WaitingOnCustomerTicketTimelinePreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-670677167);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketTimelineCardKt.INSTANCE.m471getLambda1$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Q(i10, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r WaitingOnCustomerTicketTimelinePreview$lambda$3(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        WaitingOnCustomerTicketTimelinePreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    public static final TicketTimelineCardState getSampleTicketTimelineCardState() {
        return sampleTicketTimelineCardState;
    }
}
