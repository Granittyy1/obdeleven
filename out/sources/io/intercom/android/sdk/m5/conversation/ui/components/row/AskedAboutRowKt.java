package io.intercom.android.sdk.m5.conversation.ui.components.row;

import android.content.Context;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.InterfaceC0954n;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;

/* JADX INFO: compiled from: AskedAboutRow.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class AskedAboutRowKt {
    public static final void AskedAboutRow(androidx.compose.ui.h hVar, Part part, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        kotlin.jvm.internal.i.e(part, "part");
        C1086g c1086gP = interfaceC1084f.p(1277406973);
        int i12 = i11 & 1;
        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
        androidx.compose.ui.h hVar2 = i12 != 0 ? aVar : hVar;
        Context context = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
        androidx.compose.ui.h hVarH = PaddingKt.h(hVar2, 16, 0.0f, 2);
        C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
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
        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA);
        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
        if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i13))) {
            J4.i.d(i13, c1086gP, i13, pVar);
        }
        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
        String strP = S4.o.p(c1086gP, R.string.intercom_asked_about);
        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
        int i14 = IntercomTheme.$stable;
        androidx.compose.ui.h hVar3 = hVar2;
        TextKt.b(strP, PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13347n), 0.0f, 0.0f, 0.0f, 8, 7), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, androidx.compose.ui.text.F.a(intercomTheme.getTypography(c1086gP, i14).getType04Point5(), intercomTheme.getColors(c1086gP, i14).m630getDescriptionText0d7_KjU(), 0L, null, null, 0L, null, 3, 0L, null, null, 16744446), c1086gP, 0, 0, 65532);
        List<Block> blocks = part.getBlocks();
        kotlin.jvm.internal.i.d(blocks, "getBlocks(...)");
        final Block block = (Block) kotlin.collections.q.P(blocks);
        c1086gP.L(-1827597217);
        if (block != null) {
            IntercomCardKt.IntercomCard(new coil.decode.t(context, 2, block), W.d(aVar, 1.0f), false, IntercomCardStyle.INSTANCE.m530conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, c1086gP, IntercomCardStyle.$stable << 15, 31), null, androidx.compose.runtime.internal.a.b(-1866574392, new Ia.q<InterfaceC0954n, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.AskedAboutRowKt$AskedAboutRow$1$1$2
                @Override // Ia.q
                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0954n interfaceC0954n, InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC0954n, interfaceC1084f2, num.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(InterfaceC0954n IntercomCard, InterfaceC1084f interfaceC1084f2, int i15) {
                    kotlin.jvm.internal.i.e(IntercomCard, "$this$IntercomCard");
                    if ((i15 & 81) == 16 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                        return;
                    }
                    androidx.compose.ui.h.a aVar3 = androidx.compose.ui.h.a.f13984b;
                    androidx.compose.ui.h hVarF = PaddingKt.f(aVar3, 16);
                    Block block2 = block;
                    C0953m c0953mA2 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f2, 0);
                    int iF = interfaceC1084f2.F();
                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f2.z();
                    androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(interfaceC1084f2, hVarF);
                    ComposeUiNode.f14331c0.getClass();
                    Ia.a<ComposeUiNode> aVar4 = ComposeUiNode.Companion.f14333b;
                    if (interfaceC1084f2.u() == null) {
                        I.b.k();
                        throw null;
                    }
                    interfaceC1084f2.r();
                    if (interfaceC1084f2.m()) {
                        interfaceC1084f2.v(aVar4);
                    } else {
                        interfaceC1084f2.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f2, c0953mA2);
                    R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f2, interfaceC1089h0Z);
                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar2 = ComposeUiNode.Companion.f14338g;
                    if (interfaceC1084f2.m() || !kotlin.jvm.internal.i.a(interfaceC1084f2.f(), Integer.valueOf(iF))) {
                        androidx.compose.animation.k.b(iF, interfaceC1084f2, iF, pVar2);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f2, hVarC2);
                    String title = block2.getTitle();
                    kotlin.jvm.internal.i.d(title, "getTitle(...)");
                    TextKt.b(title, PaddingKt.f(aVar3, 8), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(interfaceC1084f2, IntercomTheme.$stable).getType04SemiBold(), interfaceC1084f2, 48, 0, 65532);
                    interfaceC1084f2.J();
                }
            }, c1086gP), c1086gP, (IntercomCardStyle.Style.$stable << 9) | 196656, 20);
        }
        C1105p0 c1105p0A = C4.a.a(c1086gP, false, true);
        if (c1105p0A != null) {
            c1105p0A.f13109d = new C2369a(hVar3, part, i10, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r AskedAboutRow$lambda$2$lambda$1$lambda$0(Context context, Block it) {
        kotlin.jvm.internal.i.e(context, "$context");
        kotlin.jvm.internal.i.e(it, "$it");
        IntercomArticleActivity.Companion companion = IntercomArticleActivity.Companion;
        String articleId = it.getArticleId();
        kotlin.jvm.internal.i.d(articleId, "getArticleId(...)");
        context.startActivity(companion.buildIntent(context, new IntercomArticleActivity.ArticleActivityArguments(articleId, "conversation", false, true)));
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r AskedAboutRow$lambda$3(androidx.compose.ui.h hVar, Part part, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(part, "$part");
        AskedAboutRow(hVar, part, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void AskedAboutRowPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(97963709);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AskedAboutRowKt.INSTANCE.m213getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new io.intercom.android.sdk.helpcenter.articles.u(i10, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r AskedAboutRowPreview$lambda$4(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        AskedAboutRowPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
