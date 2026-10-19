package io.intercom.android.sdk.survey.block;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.InterfaceC0954n;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.W;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.layout.E;
import androidx.compose.ui.node.ComposeUiNode;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;

/* JADX INFO: compiled from: ConversationRatingBlock.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationRatingBlockKt {
    /* JADX INFO: renamed from: ConversationRatingBlock-cf5BqRc, reason: not valid java name */
    public static final void m389ConversationRatingBlockcf5BqRc(androidx.compose.ui.h hVar, final BlockRenderData blockRenderData, final long j, final String conversationId, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        kotlin.jvm.internal.i.e(blockRenderData, "blockRenderData");
        kotlin.jvm.internal.i.e(conversationId, "conversationId");
        C1086g c1086gP = interfaceC1084f.p(1714913761);
        final androidx.compose.ui.h hVar2 = (i11 & 1) != 0 ? androidx.compose.ui.h.a.f13984b : hVar;
        IntercomCardKt.IntercomCard(W.d(hVar2, 1.0f), IntercomCardStyle.INSTANCE.m530conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, c1086gP, IntercomCardStyle.$stable << 15, 31), androidx.compose.runtime.internal.a.b(1828616789, new Ia.q<InterfaceC0954n, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.survey.block.ConversationRatingBlockKt$ConversationRatingBlock$1
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
                androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
                androidx.compose.ui.h hVarD = W.d(aVar, 1.0f);
                androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13339e;
                BlockRenderData blockRenderData2 = blockRenderData;
                long j10 = j;
                String str = conversationId;
                E eD = BoxKt.d(fVar, false);
                int iF = interfaceC1084f2.F();
                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f2.z();
                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f2, hVarD);
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
                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f2, eD);
                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f2, interfaceC1089h0Z);
                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                if (interfaceC1084f2.m() || !kotlin.jvm.internal.i.a(interfaceC1084f2.f(), Integer.valueOf(iF))) {
                    androidx.compose.animation.k.b(iF, interfaceC1084f2, iF, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f2, hVarC);
                BlockViewKt.m379RenderLegacyBlockssW7UJKQ(blockRenderData2.getBlock(), j10, PaddingKt.f(aVar, 16), str, interfaceC1084f2, 392, 0);
                interfaceC1084f2.J();
            }
        }, c1086gP), c1086gP, (IntercomCardStyle.Style.$stable << 3) | 384, 0);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.survey.block.k
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return ConversationRatingBlockKt.ConversationRatingBlock_cf5BqRc$lambda$0(hVar2, blockRenderData, j, conversationId, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ConversationRatingBlock_cf5BqRc$lambda$0(androidx.compose.ui.h hVar, BlockRenderData blockRenderData, long j, String conversationId, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(blockRenderData, "$blockRenderData");
        kotlin.jvm.internal.i.e(conversationId, "$conversationId");
        m389ConversationRatingBlockcf5BqRc(hVar, blockRenderData, j, conversationId, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }
}
