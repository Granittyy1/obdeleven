package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.foundation.C0937i;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.InterfaceC0954n;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.N;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.X;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.node.ComposeUiNode;
import com.google.android.gms.internal.measurement.C1787c0;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.components.U;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.GroupingPosition;
import io.intercom.android.sdk.m5.conversation.ui.components.AnswerInfoDialogKt;
import io.intercom.android.sdk.m5.conversation.ui.components.MessageMetadataKt;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.C2338i;
import io.intercom.android.sdk.models.AiAnswerInfo;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.InlineSource;
import io.intercom.android.sdk.models.Metadata;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.survey.block.BlockRenderData;
import io.intercom.android.sdk.survey.block.BlockRenderTextStyle;
import io.intercom.android.sdk.survey.block.BlockViewKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: FinAnswerRow.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class FinAnswerRowKt {
    public static final void FinAnswerMetadata(List<AvatarWrapper> avatars, String title, androidx.compose.ui.h hVar, String str, Long l10, AiAnswerInfo aiAnswerInfo, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        kotlin.jvm.internal.i.e(avatars, "avatars");
        kotlin.jvm.internal.i.e(title, "title");
        C1086g c1086gP = interfaceC1084f.p(916495479);
        int i12 = i11 & 4;
        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
        androidx.compose.ui.h hVar2 = i12 != 0 ? aVar : hVar;
        String str2 = (i11 & 8) != 0 ? null : str;
        Long l11 = (i11 & 16) != 0 ? null : l10;
        AiAnswerInfo aiAnswerInfo2 = (i11 & 32) == 0 ? aiAnswerInfo : null;
        androidx.compose.ui.h hVarD = W.d(hVar2, 1.0f);
        T tA = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
        int i13 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
        androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarD);
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
        if (1.0f <= 0.0d) {
            p258v.a.a("invalid weight; must be greater than zero");
        }
        MessageMetadataKt.MessageMetadata(avatars, title, new LayoutWeightElement(true, Na.l.z(1.0f, Float.MAX_VALUE)), str2, l11, c1086gP, (i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8 | (i10 & 7168) | (57344 & i10), 0);
        c1086gP.L(1671208705);
        if (aiAnswerInfo2 != null) {
            c1086gP.L(1468227757);
            Object objF = c1086gP.f();
            InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
            if (objF == c0153a) {
                objF = J0.f(Boolean.FALSE);
                c1086gP.E(objF);
            }
            X x10 = (X) objF;
            c1086gP.T(false);
            c1086gP.L(1671210774);
            if (FinAnswerMetadata$lambda$10$lambda$9$lambda$3(x10)) {
                c1086gP.L(1468232929);
                Object objF2 = c1086gP.f();
                if (objF2 == c0153a) {
                    objF2 = new R9.b(1, x10);
                    c1086gP.E(objF2);
                }
                c1086gP.T(false);
                AnswerInfoDialogKt.AnswerInfoDialog(aiAnswerInfo2, (Ia.a) objF2, c1086gP, 48, 0);
            }
            c1086gP.T(false);
            androidx.compose.ui.h hVarM = W.m(aVar, 24);
            c1086gP.L(1468237888);
            Object objF3 = c1086gP.f();
            if (objF3 == c0153a) {
                objF3 = new P9.a(1, x10);
                c1086gP.E(objF3);
            }
            c1086gP.T(false);
            IconButtonKt.b((Ia.a) objF3, hVarM, false, null, null, ComposableSingletons$FinAnswerRowKt.INSTANCE.m227getLambda1$intercom_sdk_base_release(), c1086gP, 196662, 28);
        }
        C1105p0 c1105p0A = C4.a.a(c1086gP, false, true);
        if (c1105p0A != null) {
            c1105p0A.f13109d = new C2338i(avatars, title, hVar2, str2, l11, aiAnswerInfo2, i10, i11);
        }
    }

    private static final boolean FinAnswerMetadata$lambda$10$lambda$9$lambda$3(X<Boolean> x10) {
        return x10.getValue().booleanValue();
    }

    private static final void FinAnswerMetadata$lambda$10$lambda$9$lambda$4(X<Boolean> x10, boolean z10) {
        x10.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r FinAnswerMetadata$lambda$10$lambda$9$lambda$6$lambda$5(X showDialog$delegate) {
        kotlin.jvm.internal.i.e(showDialog$delegate, "$showDialog$delegate");
        FinAnswerMetadata$lambda$10$lambda$9$lambda$4(showDialog$delegate, false);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r FinAnswerMetadata$lambda$10$lambda$9$lambda$8$lambda$7(X showDialog$delegate) {
        kotlin.jvm.internal.i.e(showDialog$delegate, "$showDialog$delegate");
        FinAnswerMetadata$lambda$10$lambda$9$lambda$4(showDialog$delegate, true);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r FinAnswerMetadata$lambda$11(List avatars, String title, androidx.compose.ui.h hVar, String str, Long l10, AiAnswerInfo aiAnswerInfo, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(avatars, "$avatars");
        kotlin.jvm.internal.i.e(title, "$title");
        FinAnswerMetadata(avatars, title, hVar, str, l10, aiAnswerInfo, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    public static final void FinAnswerRow(final Part conversationPart, final GroupingPosition groupingPosition, androidx.compose.ui.h hVar, String str, final Ia.l<? super List<InlineSource>, p293xa.r> onInlineSourcesClick, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        kotlin.jvm.internal.i.e(conversationPart, "conversationPart");
        kotlin.jvm.internal.i.e(groupingPosition, "groupingPosition");
        kotlin.jvm.internal.i.e(onInlineSourcesClick, "onInlineSourcesClick");
        C1086g c1086gP = interfaceC1084f.p(-571285817);
        final androidx.compose.ui.h hVar2 = (i11 & 4) != 0 ? androidx.compose.ui.h.a.f13984b : hVar;
        final String str2 = (i11 & 8) != 0 ? null : str;
        int i12 = i10 >> 3;
        final FinRowStyle finRowStyle = getFinRowStyle(groupingPosition, c1086gP, i12 & 14);
        ClickableMessageRowKt.ClickableMessageRow(conversationPart, hVar2, str2 != null ? new BottomMetadata(str2, 0.0f, false, 6, null) : null, finRowStyle.getRowAlignment(), finRowStyle.getRowPadding(), null, androidx.compose.runtime.internal.a.b(-137984204, new Ia.s<InterfaceC0954n, Part, Ia.a<? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.FinAnswerRowKt.FinAnswerRow.2
            @Override // Ia.s
            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0954n interfaceC0954n, Part part, Ia.a<? extends p293xa.r> aVar, InterfaceC1084f interfaceC1084f2, Integer num) {
                invoke(interfaceC0954n, part, (Ia.a<p293xa.r>) aVar, interfaceC1084f2, num.intValue());
                return p293xa.r.f47939a;
            }

            public final void invoke(InterfaceC0954n ClickableMessageRow, final Part part, final Ia.a<p293xa.r> onClick, InterfaceC1084f interfaceC1084f2, int i13) {
                kotlin.jvm.internal.i.e(ClickableMessageRow, "$this$ClickableMessageRow");
                kotlin.jvm.internal.i.e(part, "part");
                kotlin.jvm.internal.i.e(onClick, "onClick");
                l0 shape = finRowStyle.getBubbleStyle().getShape();
                long jM251getColor0d7_KjU = finRowStyle.getBubbleStyle().m251getColor0d7_KjU();
                C0937i borderStroke = finRowStyle.getBubbleStyle().getBorderStroke();
                final FinRowStyle finRowStyle2 = finRowStyle;
                final Ia.l<List<InlineSource>, p293xa.r> lVar = onInlineSourcesClick;
                SurfaceKt.a(null, shape, jM251getColor0d7_KjU, 0L, 0.0f, 0.0f, borderStroke, androidx.compose.runtime.internal.a.b(-1833560817, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.FinAnswerRowKt.FinAnswerRow.2.1
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                        invoke(interfaceC1084f3, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f3, int i14) {
                        InterfaceC1084f interfaceC1084f4 = interfaceC1084f3;
                        int i15 = 2;
                        if ((i14 & 11) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                            return;
                        }
                        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
                        androidx.compose.ui.h hVarE = PaddingKt.e(aVar, finRowStyle2.getBubbleStyle().getPadding());
                        C0945e.i iVarG = C0945e.g(16);
                        Part part2 = part;
                        FinRowStyle finRowStyle3 = finRowStyle2;
                        Ia.a<p293xa.r> aVar2 = onClick;
                        Ia.l<List<InlineSource>, p293xa.r> lVar2 = lVar;
                        C0953m c0953mA = C0952l.a(iVarG, androidx.compose.ui.d.a.f13346m, interfaceC1084f4, 6);
                        int iF = interfaceC1084f3.F();
                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                        androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f4, hVarE);
                        ComposeUiNode.f14331c0.getClass();
                        Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                        kotlin.jvm.internal.e eVar = null;
                        if (interfaceC1084f3.u() == null) {
                            I.b.k();
                            throw null;
                        }
                        interfaceC1084f3.r();
                        if (interfaceC1084f3.m()) {
                            interfaceC1084f4.v(aVar3);
                        } else {
                            interfaceC1084f3.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f4, c0953mA);
                        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f4, interfaceC1089h0Z);
                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                        if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                            androidx.compose.animation.k.b(iF, interfaceC1084f4, iF, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f4, hVarC);
                        Metadata metadata = part2.getMetadata();
                        interfaceC1084f4.L(-179728229);
                        if (metadata != null) {
                            List<Avatar> avatars = metadata.getAvatars();
                            ArrayList arrayList = new ArrayList(kotlin.collections.m.y(avatars, 10));
                            Iterator<T> it = avatars.iterator();
                            while (it.hasNext()) {
                                arrayList.add(new AvatarWrapper((Avatar) it.next(), false, i15, eVar));
                            }
                            FinAnswerRowKt.FinAnswerMetadata(arrayList, metadata.getTitle(), null, metadata.getSuffix(), metadata.getTimestamp(), part2.getAiAnswerInfo(), interfaceC1084f3, 8, 4);
                        }
                        interfaceC1084f3.D();
                        interfaceC1084f4.L(-179713160);
                        List<Block> blocks = part2.getBlocks();
                        kotlin.jvm.internal.i.d(blocks, "getBlocks(...)");
                        for (Block block : blocks) {
                            androidx.compose.ui.h hVarR = A8.p.r(aVar, finRowStyle3.getContentShape());
                            kotlin.jvm.internal.i.b(block);
                            androidx.compose.ui.graphics.H h8 = new androidx.compose.ui.graphics.H(ColorSchemeKt.b(finRowStyle3.getBubbleStyle().m251getColor0d7_KjU(), interfaceC1084f4));
                            BlockRenderTextStyle paragraphDefault = BlockRenderTextStyle.Companion.getParagraphDefault();
                            BlockViewKt.BlockView(hVarR, new BlockRenderData(block, h8, null, null, paragraphDefault.m373copyZsBm6Y((47 & 1) != 0 ? paragraphDefault.fontSize : 0L, (47 & 2) != 0 ? paragraphDefault.fontWeight : null, (47 & 4) != 0 ? paragraphDefault.lineHeight : 0L, (47 & 8) != 0 ? paragraphDefault.textColor : null, (47 & 16) != 0 ? paragraphDefault.linkTextColor : new androidx.compose.ui.graphics.H(IntercomTheme.INSTANCE.getColors(interfaceC1084f4, IntercomTheme.$stable).m616getActionContrastWhite0d7_KjU()), (47 & 32) != 0 ? paragraphDefault.textAlign : null), 12, null), false, null, false, null, null, aVar2, null, true, lVar2, null, interfaceC1084f3, 805306432, 0, 2428);
                            interfaceC1084f4 = interfaceC1084f3;
                            aVar2 = aVar2;
                            finRowStyle3 = finRowStyle3;
                            aVar = aVar;
                        }
                        interfaceC1084f3.D();
                        interfaceC1084f3.J();
                    }
                }, interfaceC1084f2), interfaceC1084f2, 12582912, 57);
            }
        }, c1086gP), c1086gP, (i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 1572872, 32);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.r
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return FinAnswerRowKt.FinAnswerRow$lambda$1(conversationPart, groupingPosition, hVar2, str2, onInlineSourcesClick, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r FinAnswerRow$lambda$1(Part conversationPart, GroupingPosition groupingPosition, androidx.compose.ui.h hVar, String str, Ia.l onInlineSourcesClick, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(conversationPart, "$conversationPart");
        kotlin.jvm.internal.i.e(groupingPosition, "$groupingPosition");
        kotlin.jvm.internal.i.e(onInlineSourcesClick, "$onInlineSourcesClick");
        FinAnswerRow(conversationPart, groupingPosition, hVar, str, onInlineSourcesClick, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void FinAnswerRowPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1987882525);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$FinAnswerRowKt.INSTANCE.m228getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new U(i10, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r FinAnswerRowPreview$lambda$12(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        FinAnswerRowPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    public static final FinRowStyle getFinRowStyle(GroupingPosition groupingPosition, InterfaceC1084f interfaceC1084f, int i10) {
        kotlin.jvm.internal.i.e(groupingPosition, "groupingPosition");
        interfaceC1084f.L(1658672574);
        float f10 = 20;
        float f11 = 4;
        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
        int i11 = IntercomTheme.$stable;
        long jM618getAdminBackground0d7_KjU = intercomTheme.getColors(interfaceC1084f, i11).m618getAdminBackground0d7_KjU();
        float f12 = 16;
        float f13 = 12;
        N n10 = new N(f12, f13, f12, f13);
        float f14 = (groupingPosition == GroupingPosition.BOTTOM || groupingPosition == GroupingPosition.MIDDLE) ? f11 : f10;
        if (groupingPosition != GroupingPosition.TOP && groupingPosition != GroupingPosition.MIDDLE) {
            f11 = f10;
        }
        FinRowStyle finRowStyle = new FinRowStyle(new FinRowStyle.BubbleStyle(jM618getAdminBackground0d7_KjU, n10, p270w.g.c(f14, f10, f10, f11), C1787c0.a(1, intercomTheme.getColors(interfaceC1084f, i11).m619getAdminBorder0d7_KjU()), null), androidx.compose.ui.d.a.f13346m, PaddingKt.b(f12, 0.0f, f12, 0.0f, 10), p270w.g.b(8));
        interfaceC1084f.D();
        return finRowStyle;
    }
}
