package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.foundation.layout.InterfaceC0954n;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.W;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.components.C2281g0;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import java.util.List;

/* JADX INFO: compiled from: NoteCardRow.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class NoteCardRowKt {
    public static final void NoteCardRow(androidx.compose.ui.h hVar, final Part part, final String companyName, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        kotlin.jvm.internal.i.e(part, "part");
        kotlin.jvm.internal.i.e(companyName, "companyName");
        C1086g c1086gP = interfaceC1084f.p(-746207954);
        androidx.compose.ui.h hVar2 = (i11 & 1) != 0 ? androidx.compose.ui.h.a.f13984b : hVar;
        IntercomCardKt.IntercomCard(PaddingKt.g(14, 12, hVar2), IntercomCardStyle.INSTANCE.m530conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, c1086gP, IntercomCardStyle.$stable << 15, 31), androidx.compose.runtime.internal.a.b(2124316578, new Ia.q<InterfaceC0954n, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.NoteCardRowKt.NoteCardRow.1
            @Override // Ia.q
            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0954n interfaceC0954n, InterfaceC1084f interfaceC1084f2, Integer num) {
                invoke(interfaceC0954n, interfaceC1084f2, num.intValue());
                return p293xa.r.f47939a;
            }

            public final void invoke(InterfaceC0954n IntercomCard, InterfaceC1084f interfaceC1084f2, int i12) {
                kotlin.jvm.internal.i.e(IntercomCard, "$this$IntercomCard");
                if ((i12 & 81) == 16 && interfaceC1084f2.s()) {
                    interfaceC1084f2.w();
                    return;
                }
                List<Block> blocks = part.getBlocks();
                kotlin.jvm.internal.i.d(blocks, "getBlocks(...)");
                String forename = part.getParticipant().getForename();
                kotlin.jvm.internal.i.d(forename, "getForename(...)");
                String str = companyName;
                Avatar avatar = part.getParticipant().getAvatar();
                kotlin.jvm.internal.i.d(avatar, "getAvatar(...)");
                Boolean boolIsBot = part.getParticipant().isBot();
                kotlin.jvm.internal.i.d(boolIsBot, "isBot(...)");
                PostCardRowKt.m256PostContentFHprtrg(blocks, forename, str, new AvatarWrapper(avatar, boolIsBot.booleanValue()), ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(IntercomTheme.INSTANCE.getColors(interfaceC1084f2, IntercomTheme.$stable).m615getAction0d7_KjU()), PaddingKt.f(W.d(androidx.compose.ui.h.a.f13984b, 1.0f), 16), interfaceC1084f2, 200712, 0);
            }
        }, c1086gP), c1086gP, (IntercomCardStyle.Style.$stable << 3) | 384, 0);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new x(hVar2, part, companyName, i10, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r NoteCardRow$lambda$0(androidx.compose.ui.h hVar, Part part, String companyName, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(part, "$part");
        kotlin.jvm.internal.i.e(companyName, "$companyName");
        NoteCardRow(hVar, part, companyName, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void NoteCardRowPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1220886807);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$NoteCardRowKt.INSTANCE.m232getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2281g0(i10, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r NoteCardRowPreview$lambda$1(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        NoteCardRowPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
