package io.intercom.android.sdk.ui.component;

import androidx.compose.foundation.layout.C0945e;
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
import androidx.compose.ui.node.ComposeUiNode;
import io.intercom.android.sdk.m5.conversation.ui.components.row.G;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.List;

/* JADX INFO: compiled from: ErrorMessageLayout.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ErrorMessageLayoutKt {
    public static final void ErrorMessageLayout(androidx.compose.ui.h hVar, List<? extends StringProvider> errorMessages, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        kotlin.jvm.internal.i.e(errorMessages, "errorMessages");
        C1086g c1086gP = interfaceC1084f.p(-1308212592);
        int i12 = i11 & 1;
        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
        androidx.compose.ui.h hVar2 = i12 != 0 ? aVar : hVar;
        float f10 = 4;
        androidx.compose.ui.h hVarJ = PaddingKt.j(W.d(hVar2, 1.0f), 0.0f, f10, 0.0f, f10, 5);
        T tA = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
        int i13 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
        androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarJ);
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
        IconKt.a(U.c.a(R.drawable.intercom_ic_error, c1086gP, 0), null, W.q(aVar, 16), IntercomTheme.INSTANCE.getColors(c1086gP, 6).m633getError0d7_KjU(), c1086gP, 440, 0);
        StringBuilder sb2 = new StringBuilder();
        c1086gP.L(-1467578667);
        int i14 = 0;
        for (Object obj : errorMessages) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                kotlin.collections.l.x();
                throw null;
            }
            sb2.append(((StringProvider) obj).getText(c1086gP, 0));
            if (i14 != errorMessages.size() - 1) {
                sb2.append(". ");
            }
            i14 = i15;
        }
        c1086gP.T(false);
        String string = sb2.toString();
        kotlin.jvm.internal.i.d(string, "toString(...)");
        androidx.compose.ui.h hVarJ2 = PaddingKt.j(W.d(aVar, 1.0f), f10, 0.0f, 0.0f, 0.0f, 14);
        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
        androidx.compose.ui.h hVar3 = hVar2;
        TextKt.b(string, hVarJ2, intercomTheme.getColors(c1086gP, 6).m633getError0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, intercomTheme.getTypography(c1086gP, 6).getType04(), c1086gP, 48, 3120, 55288);
        c1086gP.T(true);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new G(hVar3, errorMessages, i10, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ErrorMessageLayout$lambda$2(androidx.compose.ui.h hVar, List errorMessages, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(errorMessages, "$errorMessages");
        ErrorMessageLayout(hVar, errorMessages, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }
}
