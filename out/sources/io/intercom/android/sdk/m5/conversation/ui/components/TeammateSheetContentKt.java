package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import io.intercom.android.sdk.m5.components.C2281g0;
import io.intercom.android.sdk.m5.conversation.states.ExpandedTeamPresenceState;
import io.intercom.android.sdk.m5.conversation.ui.components.row.ExpandedTeamPresenceLayoutKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.SpecialNoticeKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;

/* JADX INFO: compiled from: TeammateSheetContent.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TeammateSheetContentKt {
    public static final void TeammateSheetContent(androidx.compose.ui.h hVar, String str, ExpandedTeamPresenceState teamPresenceState, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        kotlin.jvm.internal.i.e(teamPresenceState, "teamPresenceState");
        C1086g c1086gP = interfaceC1084f.p(755089345);
        int i12 = i11 & 1;
        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
        androidx.compose.ui.h hVar2 = i12 != 0 ? aVar : hVar;
        String str2 = (i11 & 2) != 0 ? null : str;
        C0953m c0953mA = C0952l.a(C0945e.g(16), androidx.compose.ui.d.a.f13346m, c1086gP, 6);
        int i13 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
        androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVar2);
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
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
        if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i13))) {
            J4.i.d(i13, c1086gP, i13, pVar);
        }
        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
        ExpandedTeamPresenceLayoutKt.ExpandedTeamPresenceLayout(teamPresenceState, androidx.compose.foundation.layout.W.d(aVar, 1.0f), c1086gP, 56, 0);
        c1086gP.L(-1851009825);
        if (str2 != null && str2.length() != 0) {
            SpecialNoticeKt.SpecialNotice(str2, null, c1086gP, (i10 >> 3) & 14, 2);
        }
        C1105p0 c1105p0A = C4.a.a(c1086gP, false, true);
        if (c1105p0A != null) {
            c1105p0A.f13109d = new W(hVar2, str2, teamPresenceState, i10, i11, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TeammateSheetContent$lambda$1(androidx.compose.ui.h hVar, String str, ExpandedTeamPresenceState teamPresenceState, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(teamPresenceState, "$teamPresenceState");
        TeammateSheetContent(hVar, str, teamPresenceState, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void TeammateSheetContentPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(223292015);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TeammateSheetContentKt.INSTANCE.m178getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2281g0(i10, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TeammateSheetContentPreview$lambda$2(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        TeammateSheetContentPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
