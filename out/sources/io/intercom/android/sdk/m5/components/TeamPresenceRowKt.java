package io.intercom.android.sdk.m5.components;

import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import java.util.List;

/* JADX INFO: compiled from: TeamPresenceRow.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TeamPresenceRowKt {
    public static final void TeamPresenceRow(androidx.compose.ui.h hVar, final List<AvatarWrapper> avatars, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        kotlin.jvm.internal.i.e(avatars, "avatars");
        C1086g c1086gP = interfaceC1084f.p(1370953565);
        androidx.compose.ui.h hVar2 = (i11 & 1) != 0 ? androidx.compose.ui.h.a.f13984b : hVar;
        androidx.compose.ui.h hVarA = androidx.compose.ui.platform.N0.a(PaddingKt.g(16, 12, hVar2), "team_presence_row");
        androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
        int i12 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
        androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarA);
        ComposeUiNode.f14331c0.getClass();
        Ia.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f14333b;
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar);
        } else {
            c1086gP.A();
        }
        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA);
        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
        if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i12))) {
            J4.i.d(i12, c1086gP, i12, pVar);
        }
        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
        if (1.0f <= 0.0d) {
            p258v.a.a("invalid weight; must be greater than zero");
        }
        final androidx.compose.ui.h hVar3 = hVar2;
        TextKt.b(S4.o.p(c1086gP, R.string.intercom_the_team_can_help_if_needed), new LayoutWeightElement(true, Na.l.z(1.0f, Float.MAX_VALUE)), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, androidx.compose.ui.text.F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04Point5(), ColorExtensionsKt.toComposeColor$default("#757575", 0.0f, 1, null), 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, 0, 0, 65532);
        AvatarGroupKt.m59AvatarGroupJ8mCjc(kotlin.collections.q.i0(avatars, 3), null, 24, 0L, c1086gP, 392, 10);
        c1086gP.T(true);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.components.I0
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    androidx.compose.ui.h hVar4 = hVar3;
                    int i13 = i10;
                    int i14 = i11;
                    return TeamPresenceRowKt.TeamPresenceRow$lambda$1(hVar4, avatars, i13, i14, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TeamPresenceRow$lambda$1(androidx.compose.ui.h hVar, List avatars, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(avatars, "$avatars");
        TeamPresenceRow(hVar, avatars, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void TeamPresenceRowPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1211328616);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TeamPresenceRowKt.INSTANCE.m115getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2287j0(i10, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TeamPresenceRowPreview$lambda$2(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        TeamPresenceRowPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
