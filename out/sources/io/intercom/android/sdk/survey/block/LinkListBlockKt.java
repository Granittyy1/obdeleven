package io.intercom.android.sdk.survey.block;

import androidx.compose.foundation.layout.InterfaceC0954n;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;

/* JADX INFO: compiled from: LinkListBlock.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class LinkListBlockKt {
    /* JADX INFO: renamed from: LinkListBlock-cf5BqRc, reason: not valid java name */
    public static final void m390LinkListBlockcf5BqRc(androidx.compose.ui.h hVar, final Block block, final long j, final String conversationId, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        kotlin.jvm.internal.i.e(block, "block");
        kotlin.jvm.internal.i.e(conversationId, "conversationId");
        C1086g c1086gP = interfaceC1084f.p(-1519911583);
        final androidx.compose.ui.h hVar2 = (i11 & 1) != 0 ? androidx.compose.ui.h.a.f13984b : hVar;
        IntercomCardKt.IntercomCard(hVar2, IntercomCardStyle.INSTANCE.m530conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, c1086gP, IntercomCardStyle.$stable << 15, 31), androidx.compose.runtime.internal.a.b(-46303019, new Ia.q<InterfaceC0954n, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.survey.block.LinkListBlockKt$LinkListBlock$1
            @Override // Ia.q
            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0954n interfaceC0954n, InterfaceC1084f interfaceC1084f2, Integer num) {
                invoke(interfaceC0954n, interfaceC1084f2, num.intValue());
                return p293xa.r.f47939a;
            }

            public final void invoke(InterfaceC0954n IntercomCard, InterfaceC1084f interfaceC1084f2, int i12) {
                kotlin.jvm.internal.i.e(IntercomCard, "$this$IntercomCard");
                if ((i12 & 81) == 16 && interfaceC1084f2.s()) {
                    interfaceC1084f2.w();
                } else {
                    BlockViewKt.m379RenderLegacyBlockssW7UJKQ(block, j, null, conversationId, interfaceC1084f2, 8, 4);
                }
            }
        }, c1086gP), c1086gP, (i10 & 14) | 384 | (IntercomCardStyle.Style.$stable << 3), 0);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.survey.block.q
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return LinkListBlockKt.LinkListBlock_cf5BqRc$lambda$0(hVar2, block, j, conversationId, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r LinkListBlock_cf5BqRc$lambda$0(androidx.compose.ui.h hVar, Block block, long j, String conversationId, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(block, "$block");
        kotlin.jvm.internal.i.e(conversationId, "$conversationId");
        m390LinkListBlockcf5BqRc(hVar, block, j, conversationId, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }
}
