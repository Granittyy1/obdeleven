package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.foundation.layout.C0945e;
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
import androidx.compose.ui.node.ComposeUiNode;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;

/* JADX INFO: compiled from: EventRow.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class EventRowKt {
    public static final void EventRow(androidx.compose.ui.h hVar, String label, AvatarWrapper avatar, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        kotlin.jvm.internal.i.e(label, "label");
        kotlin.jvm.internal.i.e(avatar, "avatar");
        C1086g c1086gP = interfaceC1084f.p(2120787343);
        int i12 = i11 & 1;
        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
        androidx.compose.ui.h hVar2 = i12 != 0 ? aVar : hVar;
        androidx.compose.ui.h hVarH = PaddingKt.h(hVar2, 16, 0.0f, 2);
        T tA = S.a(C0945e.f10288e, androidx.compose.ui.d.a.f13344k, c1086gP, 54);
        int i13 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
        androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarH);
        ComposeUiNode.f14331c0.getClass();
        Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar2);
        } else {
            c1086gP.A();
        }
        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA);
        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
        if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i13))) {
            J4.i.d(i13, c1086gP, i13, pVar);
        }
        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
        AvatarIconKt.m131AvatarIconRd90Nhg(W.m(aVar, 36), avatar, null, false, 0L, new androidx.compose.ui.graphics.H(Q3.d.e(4294046193L)), c1086gP, 196678, 28);
        Lb.a.a(c1086gP, W.q(aVar, 8));
        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
        int i14 = IntercomTheme.$stable;
        androidx.compose.ui.h hVar3 = hVar2;
        TextKt.b(label, null, intercomTheme.getColors(c1086gP, i14).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(5), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i14).getType04Point5(), c1086gP, (i10 >> 3) & 14, 0, 65018);
        c1086gP.T(true);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new io.intercom.android.sdk.m5.components.K(hVar3, label, avatar, i10, i11, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r EventRow$lambda$1(androidx.compose.ui.h hVar, String label, AvatarWrapper avatar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(label, "$label");
        kotlin.jvm.internal.i.e(avatar, "$avatar");
        EventRow(hVar, label, avatar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void ParticipantAddedRowPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(524974868);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$EventRowKt.INSTANCE.m220getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new io.intercom.android.sdk.m5.components.L(i10, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ParticipantAddedRowPreview$lambda$2(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        ParticipantAddedRowPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
