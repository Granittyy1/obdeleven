package io.intercom.android.sdk.m5.conversation.ui.components.row;

import android.content.Context;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.C0955o;
import androidx.compose.foundation.layout.InterfaceC0954n;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.W;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.X;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InterfaceC1209a0;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.conversation.ui.components.C2361j;
import io.intercom.android.sdk.m5.conversation.ui.components.C2362k;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.utilities.Phrase;
import java.util.List;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: ClickableMessageRow.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ClickableMessageRowKt {
    public static final void ClickableMessageRow(final Part conversationPart, androidx.compose.ui.h hVar, final BottomMetadata bottomMetadata, androidx.compose.ui.d.b bVar, androidx.compose.foundation.layout.L l10, Ia.a<p293xa.r> aVar, final Ia.s<? super InterfaceC0954n, ? super Part, ? super Ia.a<p293xa.r>, ? super InterfaceC1084f, ? super Integer, p293xa.r> content, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        Ia.a<p293xa.r> aVar2;
        String string;
        String attribution;
        kotlin.jvm.internal.i.e(conversationPart, "conversationPart");
        kotlin.jvm.internal.i.e(content, "content");
        C1086g c1086gP = interfaceC1084f.p(-932954058);
        int i12 = i11 & 2;
        androidx.compose.ui.h.a aVar3 = androidx.compose.ui.h.a.f13984b;
        final androidx.compose.ui.h hVar2 = i12 != 0 ? aVar3 : hVar;
        androidx.compose.ui.d.b bVar2 = (i11 & 8) != 0 ? androidx.compose.ui.d.a.f13346m : bVar;
        final androidx.compose.foundation.layout.L lA = (i11 & 16) != 0 ? PaddingKt.a() : l10;
        Ia.a<p293xa.r> aVar4 = (i11 & 32) != 0 ? null : aVar;
        c1086gP.L(1099059020);
        Object objF = c1086gP.f();
        InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
        if (objF == c0153a) {
            objF = J0.f(Boolean.FALSE);
            c1086gP.E(objF);
        }
        X x10 = (X) objF;
        c1086gP.T(false);
        C2361j c2361j = new C2361j((InterfaceC1209a0) c1086gP.x(CompositionLocalsKt.f14844e), 1, conversationPart);
        c1086gP.L(1099065861);
        if (aVar4 == null) {
            c1086gP.L(1099066636);
            Object objF2 = c1086gP.f();
            if (objF2 == c0153a) {
                objF2 = new C2362k(x10, 1);
                c1086gP.E(objF2);
            }
            c1086gP.T(false);
            aVar2 = (Ia.a) objF2;
        } else {
            aVar2 = aVar4;
        }
        c1086gP.T(false);
        androidx.compose.ui.h hVarD = W.d(hVar2, 1.0f);
        p293xa.r rVar = p293xa.r.f47939a;
        c1086gP.L(1099071132);
        boolean zK = c1086gP.K(c2361j) | c1086gP.K(aVar2);
        Object objF3 = c1086gP.f();
        if (zK || objF3 == c0153a) {
            objF3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(c2361j, aVar2);
            c1086gP.E(objF3);
        }
        c1086gP.T(false);
        androidx.compose.ui.h hVarE = PaddingKt.e(androidx.compose.ui.input.pointer.B.b(hVarD, rVar, (PointerInputEventHandler) objF3), lA);
        C0953m c0953mA = C0952l.a(C0945e.f10286c, bVar2, c1086gP, (((i10 >> 3) & 896) >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
        int i13 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
        androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarE);
        ComposeUiNode.f14331c0.getClass();
        Ia.a<ComposeUiNode> aVar5 = ComposeUiNode.Companion.f14333b;
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar5);
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
        content.invoke(C0955o.f10310a, conversationPart, aVar2, c1086gP, Integer.valueOf(((i10 >> 9) & 7168) | 70));
        c1086gP.L(-1990945499);
        if ((bottomMetadata != null && ClickableMessageRow$lambda$1(x10)) || (bottomMetadata != null && bottomMetadata.getAlwaysShow())) {
            Lb.a.a(c1086gP, W.e(aVar3, bottomMetadata.m210getPaddingD9Ej5fM()));
            String text = bottomMetadata.getText();
            c1086gP.L(-1990935821);
            String str = "";
            if (BubbleMessageRowKt.shouldShowAttribution(conversationPart)) {
                Phrase phraseFrom = Phrase.from((Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_gif_attribution);
                List<Block> blocks = conversationPart.getBlocks();
                kotlin.jvm.internal.i.d(blocks, "getBlocks(...)");
                Block block = (Block) kotlin.collections.q.P(blocks);
                if (block != null && (attribution = block.getAttribution()) != null) {
                    str = attribution;
                }
                string = phraseFrom.put("providername", str).format().toString();
            } else {
                string = "";
            }
            c1086gP.T(false);
            BubbleMessageRowKt.MessageMeta(null, text, string, true, c1086gP, 3072, 1);
        }
        C1105p0 c1105p0A = C4.a.a(c1086gP, false, true);
        if (c1105p0A != null) {
            final androidx.compose.ui.d.b bVar3 = bVar2;
            final Ia.a<p293xa.r> aVar6 = aVar4;
            c1105p0A.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.h
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return ClickableMessageRowKt.ClickableMessageRow$lambda$8(conversationPart, hVar2, bottomMetadata, bVar3, lA, aVar6, content, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    private static final boolean ClickableMessageRow$lambda$1(X<Boolean> x10) {
        return x10.getValue().booleanValue();
    }

    private static final void ClickableMessageRow$lambda$2(X<Boolean> x10, boolean z10) {
        x10.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ClickableMessageRow$lambda$3(InterfaceC1209a0 clipboardManager, Part conversationPart) {
        kotlin.jvm.internal.i.e(clipboardManager, "$clipboardManager");
        kotlin.jvm.internal.i.e(conversationPart, "$conversationPart");
        clipboardManager.a(BubbleMessageRowKt.getCopyText(conversationPart));
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ClickableMessageRow$lambda$5$lambda$4(X showTimestamp$delegate) {
        kotlin.jvm.internal.i.e(showTimestamp$delegate, "$showTimestamp$delegate");
        ClickableMessageRow$lambda$2(showTimestamp$delegate, !ClickableMessageRow$lambda$1(showTimestamp$delegate));
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ClickableMessageRow$lambda$8(Part conversationPart, androidx.compose.ui.h hVar, BottomMetadata bottomMetadata, androidx.compose.ui.d.b bVar, androidx.compose.foundation.layout.L l10, Ia.a aVar, Ia.s content, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(conversationPart, "$conversationPart");
        kotlin.jvm.internal.i.e(content, "$content");
        ClickableMessageRow(conversationPart, hVar, bottomMetadata, bVar, l10, aVar, content, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }
}
