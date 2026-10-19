package io.intercom.android.sdk.m5.conversation.ui.components.row;

import android.content.Context;
import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.InterfaceC0954n;
import androidx.compose.foundation.layout.LayoutWeightElement;
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
import androidx.compose.ui.graphics.Z;
import androidx.compose.ui.graphics.h0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import io.intercom.android.sdk.activities.IntercomPostActivity;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.survey.block.BlockRenderData;
import io.intercom.android.sdk.survey.block.BlockRenderTextStyle;
import io.intercom.android.sdk.survey.block.BlockViewKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.Phrase;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: PostCardRow.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class PostCardRowKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.row.PostCardRowKt$PostCardRow$1, reason: invalid class name */
    /* JADX INFO: compiled from: PostCardRow.kt */
    public static final class AnonymousClass1 implements Ia.q<InterfaceC0954n, InterfaceC1084f, Integer, p293xa.r> {
        final /* synthetic */ long $actionColor;
        final /* synthetic */ String $companyName;
        final /* synthetic */ Context $context;
        final /* synthetic */ Pair<Float, androidx.compose.ui.graphics.H>[] $gradientColors;
        final /* synthetic */ Part $part;

        public AnonymousClass1(Part part, String str, long j, Pair<Float, androidx.compose.ui.graphics.H>[] pairArr, Context context) {
            this.$part = part;
            this.$companyName = str;
            this.$actionColor = j;
            this.$gradientColors = pairArr;
            this.$context = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$3$lambda$0(Pair[] gradientColors, J.c drawWithContent) {
            kotlin.jvm.internal.i.e(gradientColors, "$gradientColors");
            kotlin.jvm.internal.i.e(drawWithContent, "$this$drawWithContent");
            drawWithContent.A1();
            Z zB = androidx.compose.ui.graphics.C.a.b((Pair[]) Arrays.copyOf(gradientColors, gradientColors.length));
            long j = drawWithContent.j();
            float f10 = R.styleable.AppCompatTheme_windowFixedHeightMajor;
            J.e.m0(drawWithContent, zB, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawWithContent.j() & 4294967295L)) - f10)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32), (((long) Float.floatToRawIntBits(f10)) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) << 32), 0.0f, null, R.styleable.AppCompatTheme_windowFixedHeightMajor);
            return p293xa.r.f47939a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$3$lambda$1(Context context, Part part) {
            kotlin.jvm.internal.i.e(context, "$context");
            kotlin.jvm.internal.i.e(part, "$part");
            context.startActivity(IntercomPostActivity.buildPostIntent(context, part, part.getParentConversation().getId(), part.getParentConversation().lastParticipatingAdmin(), part.getParentConversation().getComposerState().isVisible(), false));
            return p293xa.r.f47939a;
        }

        @Override // Ia.q
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0954n interfaceC0954n, InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC0954n, interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC0954n IntercomCard, InterfaceC1084f interfaceC1084f, int i10) {
            kotlin.jvm.internal.i.e(IntercomCard, "$this$IntercomCard");
            if ((i10 & 81) == 16 && interfaceC1084f.s()) {
                interfaceC1084f.w();
                return;
            }
            final Part part = this.$part;
            String str = this.$companyName;
            long j = this.$actionColor;
            Pair<Float, androidx.compose.ui.graphics.H>[] pairArr = this.$gradientColors;
            final Context context = this.$context;
            androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
            C0945e.k kVar = C0945e.f10286c;
            C0953m c0953mA = C0952l.a(kVar, androidx.compose.ui.d.a.f13346m, interfaceC1084f, 0);
            int iF = interfaceC1084f.F();
            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f.z();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f, aVar);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
            if (interfaceC1084f.u() == null) {
                I.b.k();
                throw null;
            }
            interfaceC1084f.r();
            if (interfaceC1084f.m()) {
                interfaceC1084f.v(aVar2);
            } else {
                interfaceC1084f.A();
            }
            Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar = ComposeUiNode.Companion.f14337f;
            R0.a(pVar, interfaceC1084f, c0953mA);
            Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar2 = ComposeUiNode.Companion.f14336e;
            R0.a(pVar2, interfaceC1084f, interfaceC1089h0Z);
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
            if (interfaceC1084f.m() || !kotlin.jvm.internal.i.a(interfaceC1084f.f(), Integer.valueOf(iF))) {
                androidx.compose.animation.k.b(iF, interfaceC1084f, iF, pVar3);
            }
            Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar4 = ComposeUiNode.Companion.f14335d;
            R0.a(pVar4, interfaceC1084f, hVarC);
            List<Block> blocks = part.getBlocks();
            kotlin.jvm.internal.i.d(blocks, "getBlocks(...)");
            String forename = part.getParticipant().getForename();
            kotlin.jvm.internal.i.d(forename, "getForename(...)");
            Avatar avatar = part.getParticipant().getAvatar();
            kotlin.jvm.internal.i.d(avatar, "getAvatar(...)");
            AvatarWrapper avatarWrapper = new AvatarWrapper(avatar, false);
            if (1.0f <= 0.0d) {
                p258v.a.a("invalid weight; must be greater than zero");
            }
            PostCardRowKt.m256PostContentFHprtrg(blocks, forename, str, avatarWrapper, j, PaddingKt.f(androidx.compose.ui.draw.f.c(new LayoutWeightElement(true, Na.l.z(1.0f, Float.MAX_VALUE)), new C2378j(1, pairArr)), 12), interfaceC1084f, 4104, 0);
            androidx.compose.ui.h hVarD = W.d(aVar, 1.0f);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i11 = IntercomTheme.$stable;
            androidx.compose.ui.h hVarC2 = ClickableKt.c(C0932d.b(hVarD, intercomTheme.getColors(interfaceC1084f, i11).m621getBackground0d7_KjU(), h0.f13629a), false, null, new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.B
                @Override // Ia.a
                public final Object invoke() {
                    return PostCardRowKt.AnonymousClass1.invoke$lambda$3$lambda$1(context, part);
                }
            }, 7);
            androidx.compose.ui.f.a aVar3 = androidx.compose.ui.d.a.f13347n;
            C0953m c0953mA2 = C0952l.a(kVar, aVar3, interfaceC1084f, 48);
            int iF2 = interfaceC1084f.F();
            InterfaceC1089h0 interfaceC1089h0Z2 = interfaceC1084f.z();
            androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f, hVarC2);
            if (interfaceC1084f.u() == null) {
                I.b.k();
                throw null;
            }
            interfaceC1084f.r();
            if (interfaceC1084f.m()) {
                interfaceC1084f.v(aVar2);
            } else {
                interfaceC1084f.A();
            }
            R0.a(pVar, interfaceC1084f, c0953mA2);
            R0.a(pVar2, interfaceC1084f, interfaceC1089h0Z2);
            if (interfaceC1084f.m() || !kotlin.jvm.internal.i.a(interfaceC1084f.f(), Integer.valueOf(iF2))) {
                androidx.compose.animation.k.b(iF2, interfaceC1084f, iF2, pVar3);
            }
            R0.a(pVar4, interfaceC1084f, hVarC3);
            IntercomDividerKt.IntercomDivider(W.d(aVar, 0.9f).i(new HorizontalAlignElement(aVar3)), interfaceC1084f, 0, 0);
            float f10 = 14;
            Lb.a.a(interfaceC1084f, W.e(aVar, f10));
            TextKt.b(S4.o.p(interfaceC1084f, io.intercom.android.sdk.R.string.intercom_view_post), null, j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(interfaceC1084f, i11).getType04SemiBold(), interfaceC1084f, 0, 0, 65530);
            Lb.a.a(interfaceC1084f, W.e(aVar, f10));
            interfaceC1084f.J();
            interfaceC1084f.J();
        }
    }

    /* JADX INFO: compiled from: PostCardRow.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BlockType.values().length];
            try {
                iArr[BlockType.HEADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BlockType.SUBHEADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @IntercomPreviews
    private static final void PostCardPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(620144177);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$PostCardRowKt.INSTANCE.m233getLambda1$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new z(i10, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r PostCardPreview$lambda$5(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        PostCardPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    public static final void PostCardRow(androidx.compose.ui.h hVar, final Part part, final String companyName, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        kotlin.jvm.internal.i.e(part, "part");
        kotlin.jvm.internal.i.e(companyName, "companyName");
        C1086g c1086gP = interfaceC1084f.p(-1691901714);
        androidx.compose.ui.h hVar2 = (i11 & 1) != 0 ? androidx.compose.ui.h.a.f13984b : hVar;
        Context context = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
        int i12 = IntercomTheme.$stable;
        final androidx.compose.ui.h hVar3 = hVar2;
        IntercomCardKt.IntercomCard(W.e(PaddingKt.g(14, 12, hVar2), androidx.recyclerview.widget.t.d.DEFAULT_DRAG_ANIMATION_DURATION), IntercomCardStyle.INSTANCE.m530conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, c1086gP, IntercomCardStyle.$stable << 15, 31), androidx.compose.runtime.internal.a.b(1178622818, new AnonymousClass1(part, companyName, ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(intercomTheme.getColors(c1086gP, i12).m615getAction0d7_KjU()), new Pair[]{new Pair(Float.valueOf(0.0f), new androidx.compose.ui.graphics.H(androidx.compose.ui.graphics.H.f13503k)), new Pair(Float.valueOf(0.9f), new androidx.compose.ui.graphics.H(intercomTheme.getColors(c1086gP, i12).m621getBackground0d7_KjU()))}, context), c1086gP), c1086gP, (IntercomCardStyle.Style.$stable << 3) | 384, 0);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.A
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    androidx.compose.ui.h hVar4 = hVar3;
                    int i13 = i10;
                    int i14 = i11;
                    return PostCardRowKt.PostCardRow$lambda$0(hVar4, part, companyName, i13, i14, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r PostCardRow$lambda$0(androidx.compose.ui.h hVar, Part part, String companyName, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(part, "$part");
        kotlin.jvm.internal.i.e(companyName, "$companyName");
        PostCardRow(hVar, part, companyName, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:20:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:25:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:29:0x016a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0172  */
    /* JADX WARN: Code duplicated, block: B:33:0x0204  */
    /* JADX WARN: Code duplicated, block: B:34:0x0206  */
    /* JADX WARN: Code duplicated, block: B:36:0x0210  */
    /* JADX WARN: Code duplicated, block: B:38:0x0213  */
    /* JADX WARN: Code duplicated, block: B:40:0x0217  */
    /* JADX WARN: Code duplicated, block: B:41:0x021a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0229  */
    /* JADX WARN: Code duplicated, block: B:50:0x0248  */
    /* JADX WARN: Code duplicated, block: B:53:0x023c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0230 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: PostContent-FHprtrg, reason: not valid java name */
    public static final void m256PostContentFHprtrg(final List<? extends Block> blocks, final String participantName, final String participantCompanyName, final AvatarWrapper participantAvatarWrapper, final long j, androidx.compose.ui.h hVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        Context context;
        int i12;
        final androidx.compose.ui.h hVar2;
        int i13;
        float f10;
        int i14;
        C1105p0 c1105p0A;
        int i15;
        int i16;
        float f11;
        BlockType type;
        int i17;
        int i18;
        float f12;
        kotlin.jvm.internal.i.e(blocks, "blocks");
        kotlin.jvm.internal.i.e(participantName, "participantName");
        kotlin.jvm.internal.i.e(participantCompanyName, "participantCompanyName");
        kotlin.jvm.internal.i.e(participantAvatarWrapper, "participantAvatarWrapper");
        C1086g c1086gP = interfaceC1084f.p(-1350453300);
        int i19 = i11 & 32;
        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
        androidx.compose.ui.h hVar3 = i19 != 0 ? aVar : hVar;
        Context context2 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
        C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
        int i20 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
        androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVar3);
        ComposeUiNode.f14331c0.getClass();
        Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar2);
        } else {
            c1086gP.A();
        }
        Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar = ComposeUiNode.Companion.f14337f;
        R0.a(pVar, c1086gP, c0953mA);
        Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar2 = ComposeUiNode.Companion.f14336e;
        R0.a(pVar2, c1086gP, interfaceC1089h0P);
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
        if (!c1086gP.f12995O) {
            context = context2;
            if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i20))) {
            }
            Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar4 = ComposeUiNode.Companion.f14335d;
            R0.a(pVar4, c1086gP, hVarC);
            T tA = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
            i12 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
            hVar2 = hVar3;
            androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, aVar);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(pVar, c1086gP, tA);
            R0.a(pVar2, c1086gP, interfaceC1089h0P2);
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i12))) {
                J4.i.d(i12, c1086gP, i12, pVar3);
            }
            R0.a(pVar4, c1086gP, hVarC2);
            AvatarIconKt.m131AvatarIconRd90Nhg(W.m(aVar, 24), participantAvatarWrapper, null, false, 0L, null, c1086gP, 70, 60);
            Lb.a.a(c1086gP, W.q(aVar, 12));
            TextKt.b(Phrase.from(context, io.intercom.android.sdk.R.string.intercom_teammate_from_company).put("name", participantName).put("company", participantCompanyName).format().toString(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04(), c1086gP, 0, 0, 65534);
            c1086gP.T(true);
            i13 = 16;
            f10 = 16;
            Lb.a.a(c1086gP, W.e(aVar, f10));
            c1086gP.L(-83078379);
            i14 = 0;
            for (Object obj : blocks) {
                i15 = i14 + 1;
                if (i14 >= 0) {
                    kotlin.collections.l.x();
                    throw null;
                }
                Block block = (Block) obj;
                androidx.compose.ui.h hVarD = W.d(aVar, 1.0f);
                BlockRenderData blockRenderData = new BlockRenderData(block, null, new BlockRenderTextStyle(G0.a.g(20), androidx.compose.ui.text.font.l.f15443h, 0L, new androidx.compose.ui.graphics.H(j), null, null, 52, null), new BlockRenderTextStyle(G0.a.g(i13), androidx.compose.ui.text.font.l.f15442g, 0L, new androidx.compose.ui.graphics.H(j), null, null, 52, null), null, 18, null);
                i16 = i14;
                f11 = f10;
                BlockViewKt.BlockView(hVarD, blockRenderData, false, null, false, null, null, null, null, false, null, null, c1086gP, 70, 0, 4092);
                type = block.getType();
                if (type == null) {
                    i17 = -1;
                } else {
                    i17 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
                }
                if (i17 != 1) {
                    if (i17 != 2) {
                        i18 = 8;
                    } else {
                        f12 = f11;
                    }
                    c1086gP.L(-83051140);
                    if (i16 != kotlin.collections.l.r(blocks)) {
                        Lb.a.a(c1086gP, W.e(aVar, f12));
                    }
                    c1086gP.T(false);
                    i14 = i15;
                    f10 = f11;
                    i13 = 16;
                } else {
                    i18 = 32;
                }
                f12 = i18;
                c1086gP.L(-83051140);
                if (i16 != kotlin.collections.l.r(blocks)) {
                    Lb.a.a(c1086gP, W.e(aVar, f12));
                }
                c1086gP.T(false);
                i14 = i15;
                f10 = f11;
                i13 = 16;
            }
            c1105p0A = C4.a.a(c1086gP, false, true);
            if (c1105p0A != null) {
                c1105p0A.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.y
                    @Override // Ia.p
                    public final Object invoke(Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        androidx.compose.ui.h hVar4 = hVar2;
                        int i21 = i10;
                        int i22 = i11;
                        return PostCardRowKt.PostContent_FHprtrg$lambda$4(blocks, participantName, participantCompanyName, participantAvatarWrapper, j, hVar4, i21, i22, (InterfaceC1084f) obj2, iIntValue);
                    }
                };
            }
        }
        context = context2;
        J4.i.d(i20, c1086gP, i20, pVar3);
        Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar5 = ComposeUiNode.Companion.f14335d;
        R0.a(pVar5, c1086gP, hVarC);
        T tA2 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
        i12 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
        hVar2 = hVar3;
        androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, aVar);
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar2);
        } else {
            c1086gP.A();
        }
        R0.a(pVar, c1086gP, tA2);
        R0.a(pVar2, c1086gP, interfaceC1089h0P3);
        if (c1086gP.f12995O) {
            J4.i.d(i12, c1086gP, i12, pVar3);
        } else {
            J4.i.d(i12, c1086gP, i12, pVar3);
        }
        R0.a(pVar5, c1086gP, hVarC3);
        AvatarIconKt.m131AvatarIconRd90Nhg(W.m(aVar, 24), participantAvatarWrapper, null, false, 0L, null, c1086gP, 70, 60);
        Lb.a.a(c1086gP, W.q(aVar, 12));
        TextKt.b(Phrase.from(context, io.intercom.android.sdk.R.string.intercom_teammate_from_company).put("name", participantName).put("company", participantCompanyName).format().toString(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04(), c1086gP, 0, 0, 65534);
        c1086gP.T(true);
        i13 = 16;
        f10 = 16;
        Lb.a.a(c1086gP, W.e(aVar, f10));
        c1086gP.L(-83078379);
        i14 = 0;
        while (r23.hasNext()) {
            i15 = i14 + 1;
            if (i14 >= 0) {
                kotlin.collections.l.x();
                throw null;
            }
            Block block2 = (Block) obj;
            androidx.compose.ui.h hVarD2 = W.d(aVar, 1.0f);
            BlockRenderData blockRenderData2 = new BlockRenderData(block2, null, new BlockRenderTextStyle(G0.a.g(20), androidx.compose.ui.text.font.l.f15443h, 0L, new androidx.compose.ui.graphics.H(j), null, null, 52, null), new BlockRenderTextStyle(G0.a.g(i13), androidx.compose.ui.text.font.l.f15442g, 0L, new androidx.compose.ui.graphics.H(j), null, null, 52, null), null, 18, null);
            i16 = i14;
            f11 = f10;
            BlockViewKt.BlockView(hVarD2, blockRenderData2, false, null, false, null, null, null, null, false, null, null, c1086gP, 70, 0, 4092);
            type = block2.getType();
            if (type == null) {
                i17 = -1;
            } else {
                i17 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
            }
            if (i17 != 1) {
                if (i17 != 2) {
                    i18 = 8;
                } else {
                    f12 = f11;
                }
                c1086gP.L(-83051140);
                if (i16 != kotlin.collections.l.r(blocks)) {
                    Lb.a.a(c1086gP, W.e(aVar, f12));
                }
                c1086gP.T(false);
                i14 = i15;
                f10 = f11;
                i13 = 16;
            } else {
                i18 = 32;
            }
            f12 = i18;
            c1086gP.L(-83051140);
            if (i16 != kotlin.collections.l.r(blocks)) {
                Lb.a.a(c1086gP, W.e(aVar, f12));
            }
            c1086gP.T(false);
            i14 = i15;
            f10 = f11;
            i13 = 16;
        }
        c1105p0A = C4.a.a(c1086gP, false, true);
        if (c1105p0A != null) {
            c1105p0A.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.y
                @Override // Ia.p
                public final Object invoke(Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    androidx.compose.ui.h hVar4 = hVar2;
                    int i21 = i10;
                    int i22 = i11;
                    return PostCardRowKt.PostContent_FHprtrg$lambda$4(blocks, participantName, participantCompanyName, participantAvatarWrapper, j, hVar4, i21, i22, (InterfaceC1084f) obj2, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r PostContent_FHprtrg$lambda$4(List blocks, String participantName, String participantCompanyName, AvatarWrapper participantAvatarWrapper, long j, androidx.compose.ui.h hVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(blocks, "$blocks");
        kotlin.jvm.internal.i.e(participantName, "$participantName");
        kotlin.jvm.internal.i.e(participantCompanyName, "$participantCompanyName");
        kotlin.jvm.internal.i.e(participantAvatarWrapper, "$participantAvatarWrapper");
        m256PostContentFHprtrg(blocks, participantName, participantCompanyName, participantAvatarWrapper, j, hVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }
}
