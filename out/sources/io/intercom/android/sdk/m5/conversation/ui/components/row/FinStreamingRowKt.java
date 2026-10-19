package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.X;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.C1268i;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.components.Y;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.GroupingPosition;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Metadata;
import io.intercom.android.sdk.models.StreamingPart;
import io.intercom.android.sdk.survey.block.BlockRenderData;
import io.intercom.android.sdk.survey.block.BlockRenderTextStyle;
import io.intercom.android.sdk.survey.block.BlockViewKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: compiled from: FinStreamingRow.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class FinStreamingRowKt {
    public static final void FinStreamingBlock(final BlockRenderData blockRenderData, androidx.compose.ui.h hVar, boolean z10, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        kotlin.jvm.internal.i.e(blockRenderData, "blockRenderData");
        C1086g c1086gP = interfaceC1084f.p(1420678116);
        androidx.compose.ui.h hVar2 = (i11 & 2) != 0 ? androidx.compose.ui.h.a.f13984b : hVar;
        final boolean z11 = (i11 & 4) != 0 ? false : z10;
        c1086gP.L(-382486785);
        Object objF = c1086gP.f();
        InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
        if (objF == c0153a) {
            objF = J0.f(null);
            c1086gP.E(objF);
        }
        final X x10 = (X) objF;
        c1086gP.T(false);
        p013b0.c cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
        Pair pair = new Pair(Float.valueOf(cVar.P0() * cVar.T0(3)), Float.valueOf(cVar.P0() * cVar.T0(12)));
        final float fFloatValue = ((Number) pair.a()).floatValue();
        final float fFloatValue2 = ((Number) pair.b()).floatValue();
        c1086gP.L(-382476587);
        boolean zG = ((((i10 & 896) ^ 384) > 256 && c1086gP.c(z11)) || (i10 & 384) == 256) | c1086gP.g(fFloatValue2) | c1086gP.g(fFloatValue);
        Object objF2 = c1086gP.f();
        if (zG || objF2 == c0153a) {
            objF2 = new Ia.l() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.s
                @Override // Ia.l
                public final Object invoke(Object obj) {
                    return FinStreamingRowKt.FinStreamingBlock$lambda$6$lambda$5(z11, x10, fFloatValue2, fFloatValue, (J.c) obj);
                }
            };
            c1086gP.E(objF2);
        }
        c1086gP.T(false);
        androidx.compose.ui.h hVarC = androidx.compose.ui.draw.f.c(hVar2, (Ia.l) objF2);
        c1086gP.L(-382442246);
        Object objF3 = c1086gP.f();
        if (objF3 == c0153a) {
            objF3 = new K(1, x10);
            c1086gP.E(objF3);
        }
        c1086gP.T(false);
        final boolean z12 = z11;
        final androidx.compose.ui.h hVar3 = hVar2;
        BlockViewKt.BlockView(hVarC, blockRenderData, false, null, false, null, null, null, null, false, null, (Ia.l) objF3, c1086gP, 64, 48, 2044);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.t
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    androidx.compose.ui.h hVar4 = hVar3;
                    int i12 = i10;
                    int i13 = i11;
                    return FinStreamingRowKt.FinStreamingBlock$lambda$9(blockRenderData, hVar4, z12, i12, i13, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final p293xa.r FinStreamingBlock$lambda$6$lambda$5(boolean z10, X layoutResult, float f10, float f11, J.c drawWithContent) {
        androidx.compose.ui.text.B b10;
        kotlin.jvm.internal.i.e(layoutResult, "$layoutResult");
        kotlin.jvm.internal.i.e(drawWithContent, "$this$drawWithContent");
        drawWithContent.A1();
        if (z10 && (b10 = (androidx.compose.ui.text.B) layoutResult.getValue()) != null) {
            C1268i c1268i = b10.f15301b;
            int i10 = c1268i.f15475f - 1;
            float fB = c1268i.b(i10) - c1268i.f(i10);
            float f12 = b10.f(i10) + 12.0f;
            float f13 = c1268i.f(i10);
            float f14 = 2;
            drawWithContent.R(androidx.compose.ui.graphics.H.f13495b, (240 & 2) != 0 ? 0L : (((long) Float.floatToRawIntBits(f12)) << 32) | (((long) Float.floatToRawIntBits(((fB / f14) - (f10 / f14)) + f13)) & 4294967295L), (((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L), (((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L), (240 & 16) != 0 ? J.h.f3954a : null, 1.0f, null, 3);
        }
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r FinStreamingBlock$lambda$8$lambda$7(X layoutResult, androidx.compose.ui.text.B it) {
        kotlin.jvm.internal.i.e(layoutResult, "$layoutResult");
        kotlin.jvm.internal.i.e(it, "it");
        layoutResult.setValue(it);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r FinStreamingBlock$lambda$9(BlockRenderData blockRenderData, androidx.compose.ui.h hVar, boolean z10, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(blockRenderData, "$blockRenderData");
        FinStreamingBlock(blockRenderData, hVar, z10, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    public static final void FinStreamingRow(final List<? extends Block> blocks, final StreamingPart streamingPart, androidx.compose.ui.h hVar, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        kotlin.jvm.internal.i.e(blocks, "blocks");
        kotlin.jvm.internal.i.e(streamingPart, "streamingPart");
        C1086g c1086gP = interfaceC1084f.p(-918532595);
        androidx.compose.ui.h hVar2 = (i11 & 4) != 0 ? androidx.compose.ui.h.a.f13984b : hVar;
        final FinRowStyle finRowStyle = FinAnswerRowKt.getFinRowStyle(GroupingPosition.STANDALONE, c1086gP, 6);
        androidx.compose.ui.h hVarE = PaddingKt.e(hVar2, finRowStyle.getRowPadding());
        androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
        int i12 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
        androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarE);
        ComposeUiNode.f14331c0.getClass();
        Ia.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f14333b;
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar);
        } else {
            c1086gP.A();
        }
        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD);
        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
        if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i12))) {
            J4.i.d(i12, c1086gP, i12, pVar);
        }
        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
        androidx.compose.ui.h hVar3 = hVar2;
        SurfaceKt.a(null, finRowStyle.getBubbleStyle().getShape(), finRowStyle.getBubbleStyle().m251getColor0d7_KjU(), 0L, 0.0f, 0.0f, finRowStyle.getBubbleStyle().getBorderStroke(), androidx.compose.runtime.internal.a.b(610304332, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.FinStreamingRowKt$FinStreamingRow$1$1
            @Override // Ia.p
            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                invoke(interfaceC1084f2, num.intValue());
                return p293xa.r.f47939a;
            }

            public final void invoke(InterfaceC1084f interfaceC1084f2, int i13) {
                if ((i13 & 11) == 2 && interfaceC1084f2.s()) {
                    interfaceC1084f2.w();
                    return;
                }
                androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                androidx.compose.ui.h hVarE2 = PaddingKt.e(aVar2, finRowStyle.getBubbleStyle().getPadding());
                C0945e.i iVarG = C0945e.g(16);
                StreamingPart streamingPart2 = streamingPart;
                List<Block> list = blocks;
                FinRowStyle finRowStyle2 = finRowStyle;
                C0953m c0953mA = C0952l.a(iVarG, androidx.compose.ui.d.a.f13346m, interfaceC1084f2, 6);
                int iF = interfaceC1084f2.F();
                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f2.z();
                androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(interfaceC1084f2, hVarE2);
                ComposeUiNode.f14331c0.getClass();
                Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                if (interfaceC1084f2.u() == null) {
                    I.b.k();
                    throw null;
                }
                interfaceC1084f2.r();
                if (interfaceC1084f2.m()) {
                    interfaceC1084f2.v(aVar3);
                } else {
                    interfaceC1084f2.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f2, c0953mA);
                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f2, interfaceC1089h0Z);
                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar2 = ComposeUiNode.Companion.f14338g;
                if (interfaceC1084f2.m() || !kotlin.jvm.internal.i.a(interfaceC1084f2.f(), Integer.valueOf(iF))) {
                    androidx.compose.animation.k.b(iF, interfaceC1084f2, iF, pVar2);
                }
                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f2, hVarC2);
                Metadata metadata = streamingPart2.getMetadata();
                interfaceC1084f2.L(-989627254);
                if (metadata != null) {
                    List<Avatar> avatars = metadata.getAvatars();
                    ArrayList arrayList = new ArrayList(kotlin.collections.m.y(avatars, 10));
                    Iterator<T> it = avatars.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new AvatarWrapper((Avatar) it.next(), false, 2, null));
                    }
                    FinAnswerRowKt.FinAnswerMetadata(arrayList, metadata.getTitle(), null, metadata.getSuffix(), metadata.getTimestamp(), null, interfaceC1084f2, 196616, 4);
                }
                interfaceC1084f2.D();
                interfaceC1084f2.L(-989612763);
                int i14 = 0;
                for (Object obj : list) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        kotlin.collections.l.x();
                        throw null;
                    }
                    Block block = (Block) obj;
                    boolean z10 = i14 == kotlin.collections.l.r(list);
                    androidx.compose.ui.h hVarR = A8.p.r(aVar2, finRowStyle2.getContentShape());
                    androidx.compose.ui.graphics.H h8 = new androidx.compose.ui.graphics.H(ColorSchemeKt.b(finRowStyle2.getBubbleStyle().m251getColor0d7_KjU(), interfaceC1084f2));
                    BlockRenderTextStyle paragraphDefault = BlockRenderTextStyle.Companion.getParagraphDefault();
                    FinStreamingRowKt.FinStreamingBlock(new BlockRenderData(block, h8, null, null, paragraphDefault.m373copyZsBm6Y((47 & 1) != 0 ? paragraphDefault.fontSize : 0L, (47 & 2) != 0 ? paragraphDefault.fontWeight : null, (47 & 4) != 0 ? paragraphDefault.lineHeight : 0L, (47 & 8) != 0 ? paragraphDefault.textColor : null, (47 & 16) != 0 ? paragraphDefault.linkTextColor : new androidx.compose.ui.graphics.H(IntercomTheme.INSTANCE.getColors(interfaceC1084f2, IntercomTheme.$stable).m616getActionContrastWhite0d7_KjU()), (47 & 32) != 0 ? paragraphDefault.textAlign : null), 12, null), hVarR, z10, interfaceC1084f2, 8, 0);
                    i14 = i15;
                }
                interfaceC1084f2.D();
                interfaceC1084f2.J();
            }
        }, c1086gP), c1086gP, 12582912, 57);
        c1086gP.T(true);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new u(blocks, streamingPart, hVar3, i10, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r FinStreamingRow$lambda$1(List blocks, StreamingPart streamingPart, androidx.compose.ui.h hVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(blocks, "$blocks");
        kotlin.jvm.internal.i.e(streamingPart, "$streamingPart");
        FinStreamingRow(blocks, streamingPart, hVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void FinStreamingRowPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1248993407);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$FinStreamingRowKt.INSTANCE.m229getLambda1$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Y(i10, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r FinStreamingRowPreview$lambda$10(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        FinStreamingRowPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
