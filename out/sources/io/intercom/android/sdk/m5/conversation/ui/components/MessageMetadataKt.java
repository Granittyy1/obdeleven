package io.intercom.android.sdk.m5.conversation.ui.components;

import android.content.Context;
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
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import io.intercom.android.sdk.m5.components.AvatarGroupKt;
import io.intercom.android.sdk.m5.components.C2271b0;
import io.intercom.android.sdk.m5.components.C2279f0;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.TimeFormatterExtKt;
import java.util.List;

/* JADX INFO: compiled from: MessageMetadata.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class MessageMetadataKt {
    public static final void MessageMetadata(final List<AvatarWrapper> avatars, final String title, androidx.compose.ui.h hVar, String str, Long l10, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        kotlin.jvm.internal.i.e(avatars, "avatars");
        kotlin.jvm.internal.i.e(title, "title");
        C1086g c1086gP = interfaceC1084f.p(1631390024);
        int i12 = i11 & 4;
        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
        androidx.compose.ui.h hVar2 = i12 != 0 ? aVar : hVar;
        String str2 = (i11 & 8) != 0 ? null : str;
        Long l11 = (i11 & 16) != 0 ? null : l10;
        androidx.compose.ui.text.F fA = androidx.compose.ui.text.F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04Point5(), 0L, 0L, androidx.compose.ui.text.font.l.f15444i, null, 0L, null, 0, 0L, null, null, 16777211);
        float f10 = 4;
        androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(C0945e.g(f10), androidx.compose.ui.d.a.f13344k, c1086gP, 54);
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
        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA);
        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
        if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i13))) {
            J4.i.d(i13, c1086gP, i13, pVar);
        }
        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
        c1086gP.L(1642417258);
        if (!avatars.isEmpty()) {
            AvatarGroupKt.m59AvatarGroupJ8mCjc(avatars, PaddingKt.j(aVar, 0.0f, 0.0f, f10, 0.0f, 11), 24, 0L, c1086gP, 440, 8);
        }
        c1086gP.T(false);
        if (!(((double) 1.0f) > 0.0d)) {
            p258v.a.a("invalid weight; must be greater than zero");
        }
        final androidx.compose.ui.h hVar3 = hVar2;
        TextKt.b(title, new LayoutWeightElement(false, Na.l.z(1.0f, Float.MAX_VALUE)), 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, fA, c1086gP, (i10 >> 3) & 14, 3120, 55292);
        c1086gP.L(1642431398);
        if (str2 != null) {
            c1086gP.L(1642431772);
            if (!kotlin.text.n.S(title)) {
                TextKt.b("•", androidx.compose.ui.semantics.p.b(aVar, false, new C2358g(1)), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fA, c1086gP, 6, 0, 65532);
            }
            c1086gP.T(false);
            TextKt.b(str2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, fA, c1086gP, 0, 3120, 55294);
        }
        c1086gP.T(false);
        c1086gP.L(1642448818);
        if (l11 != null) {
            long jLongValue = l11.longValue();
            c1086gP.L(1642449084);
            if (!kotlin.text.n.S(title) || (str2 != null && (!kotlin.text.n.S(str2)))) {
                TextKt.b("•", androidx.compose.ui.semantics.p.b(aVar, false, new androidx.navigation.compose.D(3)), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fA, c1086gP, 6, 0, 65532);
            }
            c1086gP.T(false);
            if (0.5f <= 0.0d) {
                p258v.a.a("invalid weight; must be greater than zero");
            }
            TextKt.b(TimeFormatterExtKt.formattedDateFromLong(jLongValue, (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b)), new LayoutWeightElement(false, Na.l.z(0.5f, Float.MAX_VALUE)), 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, fA, c1086gP, 0, 3120, 55292);
        }
        C1105p0 c1105p0A = C4.a.a(c1086gP, false, true);
        if (c1105p0A != null) {
            final String str3 = str2;
            final Long l12 = l11;
            c1105p0A.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.V
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    androidx.compose.ui.h hVar4 = hVar3;
                    int i14 = i10;
                    int i15 = i11;
                    return MessageMetadataKt.MessageMetadata$lambda$5(avatars, title, hVar4, str3, l12, i14, i15, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r MessageMetadata$lambda$4$lambda$1$lambda$0(androidx.compose.ui.semantics.w semantics) {
        kotlin.jvm.internal.i.e(semantics, "$this$semantics");
        androidx.compose.ui.semantics.t.g("", semantics);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r MessageMetadata$lambda$4$lambda$3$lambda$2(androidx.compose.ui.semantics.w semantics) {
        kotlin.jvm.internal.i.e(semantics, "$this$semantics");
        androidx.compose.ui.semantics.t.g("", semantics);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r MessageMetadata$lambda$5(List avatars, String title, androidx.compose.ui.h hVar, String str, Long l10, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(avatars, "$avatars");
        kotlin.jvm.internal.i.e(title, "$title");
        MessageMetadata(avatars, title, hVar, str, l10, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void MessageMetadataLongTextPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-764241754);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$MessageMetadataKt.INSTANCE.m176getLambda4$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2279f0(i10, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r MessageMetadataLongTextPreview$lambda$7(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        MessageMetadataLongTextPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void MessageMetadataPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1316869201);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$MessageMetadataKt.INSTANCE.m174getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2271b0(i10, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r MessageMetadataPreview$lambda$6(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        MessageMetadataPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
