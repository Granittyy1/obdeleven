package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0949i;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.InterfaceC0954n;
import androidx.compose.foundation.layout.N;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.C1051f;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.C1260a;
import com.google.android.gms.internal.measurement.C1787c0;
import com.google.android.gms.internal.measurement.M1;
import com.voltasit.obdeleven.ui.dialogs.C2182z;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.blocks.lib.models.BlockAttachment;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.components.C2269a0;
import io.intercom.android.sdk.m5.components.X;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.m5.conversation.states.GroupingPosition;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.ui.components.C2358g;
import io.intercom.android.sdk.m5.conversation.ui.components.MessageMetadataKt;
import io.intercom.android.sdk.models.Attachments;
import io.intercom.android.sdk.models.Attribute;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Metadata;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.survey.block.BlockRenderData;
import io.intercom.android.sdk.survey.block.BlockRenderTextStyle;
import io.intercom.android.sdk.survey.block.BlockViewKt;
import io.intercom.android.sdk.survey.block.ImageRenderType;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.views.compose.AttributeCollectorCardKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: BubbleMessageRow.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class BubbleMessageRowKt {
    private static final Block.Builder answerBlock;
    private static final Block.Builder articleBlock;
    private static final Block.Builder createTicketBlock;
    private static final Metadata humanMetadata;
    private static final List<BlockType> imageBlockTypes;
    private static final Block.Builder longParagraphBlock;
    private static final Block.Builder paragraphBlock;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.row.BubbleMessageRowKt$BubbleMessageRow$6, reason: invalid class name */
    /* JADX INFO: compiled from: BubbleMessageRow.kt */
    public static final class AnonymousClass6 implements Ia.s<InterfaceC0954n, Part, Ia.a<? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r> {
        final /* synthetic */ Part $conversationPart;
        final /* synthetic */ List<String> $failedAttributeIdentifiers;
        final /* synthetic */ PendingMessage.FailedImageUploadData $failedImageUploadData;
        final /* synthetic */ FailedMessage $failedMessage;
        final /* synthetic */ boolean $isAdminOrAltParticipant;
        final /* synthetic */ List<String> $loadingAttributeIdentifiers;
        final /* synthetic */ MessageStyle $messageStyle;
        final /* synthetic */ Ia.l<TicketType, p293xa.r> $onCreateTicket;
        final /* synthetic */ Ia.l<PendingMessage.FailedImageUploadData, p293xa.r> $onRetryImageClicked;
        final /* synthetic */ Ia.l<AttributeData, p293xa.r> $onSubmitAttribute;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass6(FailedMessage failedMessage, MessageStyle messageStyle, Part part, List<String> list, List<String> list2, Ia.l<? super AttributeData, p293xa.r> lVar, Ia.l<? super TicketType, p293xa.r> lVar2, boolean z10, PendingMessage.FailedImageUploadData failedImageUploadData, Ia.l<? super PendingMessage.FailedImageUploadData, p293xa.r> lVar3) {
            this.$failedMessage = failedMessage;
            this.$messageStyle = messageStyle;
            this.$conversationPart = part;
            this.$failedAttributeIdentifiers = list;
            this.$loadingAttributeIdentifiers = list2;
            this.$onSubmitAttribute = lVar;
            this.$onCreateTicket = lVar2;
            this.$isAdminOrAltParticipant = z10;
            this.$failedImageUploadData = failedImageUploadData;
            this.$onRetryImageClicked = lVar3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$5$Content(Part part, Part part2, List<String> list, List<String> list2, Ia.l<? super AttributeData, p293xa.r> lVar, MessageStyle messageStyle, Ia.a<p293xa.r> aVar, Ia.l<? super TicketType, p293xa.r> lVar2, boolean z10, PendingMessage.FailedImageUploadData failedImageUploadData, Ia.l<? super PendingMessage.FailedImageUploadData, p293xa.r> lVar3, long j, androidx.compose.ui.h hVar, InterfaceC1084f interfaceC1084f, int i10, int i11) {
            boolean z11;
            interfaceC1084f.L(1340766378);
            long jM645getPrimaryText0d7_KjU = (i11 & 1) != 0 ? IntercomTheme.INSTANCE.getColors(interfaceC1084f, IntercomTheme.$stable).m645getPrimaryText0d7_KjU() : j;
            int i12 = 2;
            androidx.compose.ui.h hVar2 = (i11 & 2) != 0 ? androidx.compose.ui.h.a.f13984b : hVar;
            C0953m c0953mA = C0952l.a(C0945e.g(8), androidx.compose.ui.d.a.f13346m, interfaceC1084f, 6);
            int iF = interfaceC1084f.F();
            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f.z();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f, hVar2);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
            kotlin.jvm.internal.e eVar = null;
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
            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f, c0953mA);
            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f, interfaceC1089h0Z);
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
            if (interfaceC1084f.m() || !kotlin.jvm.internal.i.a(interfaceC1084f.f(), Integer.valueOf(iF))) {
                androidx.compose.animation.k.b(iF, interfaceC1084f, iF, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f, hVarC);
            Metadata metadata = part.getMetadata();
            interfaceC1084f.L(301232084);
            boolean z12 = false;
            if (metadata != null) {
                List<Avatar> avatars = metadata.getAvatars();
                ArrayList arrayList = new ArrayList(kotlin.collections.m.y(avatars, 10));
                Iterator<T> it = avatars.iterator();
                while (it.hasNext()) {
                    arrayList.add(new AvatarWrapper((Avatar) it.next(), z12, i12, eVar));
                }
                MessageMetadataKt.MessageMetadata(arrayList, metadata.getTitle(), null, metadata.getSuffix(), metadata.getTimestamp(), interfaceC1084f, 8, 4);
            }
            interfaceC1084f.D();
            List<Block> blocks = part.getBlocks();
            kotlin.jvm.internal.i.d(blocks, "getBlocks(...)");
            List<Block> list3 = blocks;
            if ((list3 instanceof Collection) && list3.isEmpty()) {
                z11 = true;
            } else {
                Iterator<T> it2 = list3.iterator();
                while (it2.hasNext()) {
                    if (((Block) it2.next()).getType() == BlockType.CREATETICKETCARD) {
                        if (part.getParentConversation().getTicket() == null) {
                            break;
                        } else {
                            z11 = false;
                        }
                    }
                }
                z11 = true;
            }
            BubbleMessageRowKt.m211MessageContent993knro(part2, list, list2, lVar, jM645getPrimaryText0d7_KjU, z11, messageStyle.getContentShape(), aVar, lVar2, z10, failedImageUploadData, lVar3, 12, interfaceC1084f, ((i10 << 12) & 57344) | 584, 384, 0);
            interfaceC1084f.J();
            interfaceC1084f.D();
        }

        @Override // Ia.s
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0954n interfaceC0954n, Part part, Ia.a<? extends p293xa.r> aVar, InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC0954n, part, (Ia.a<p293xa.r>) aVar, interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC0954n ClickableMessageRow, final Part part, final Ia.a<p293xa.r> onClick, InterfaceC1084f interfaceC1084f, int i10) {
            kotlin.jvm.internal.i.e(ClickableMessageRow, "$this$ClickableMessageRow");
            kotlin.jvm.internal.i.e(part, "part");
            kotlin.jvm.internal.i.e(onClick, "onClick");
            C0945e.i iVarG = C0945e.g(8);
            androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
            FailedMessage failedMessage = this.$failedMessage;
            final MessageStyle messageStyle = this.$messageStyle;
            final Part part2 = this.$conversationPart;
            final List<String> list = this.$failedAttributeIdentifiers;
            final List<String> list2 = this.$loadingAttributeIdentifiers;
            final Ia.l<AttributeData, p293xa.r> lVar = this.$onSubmitAttribute;
            final Ia.l<TicketType, p293xa.r> lVar2 = this.$onCreateTicket;
            final boolean z10 = this.$isAdminOrAltParticipant;
            final PendingMessage.FailedImageUploadData failedImageUploadData = this.$failedImageUploadData;
            final Ia.l<PendingMessage.FailedImageUploadData, p293xa.r> lVar3 = this.$onRetryImageClicked;
            androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
            T tA = S.a(iVarG, bVar, interfaceC1084f, 54);
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
            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f, tA);
            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f, interfaceC1089h0Z);
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
            if (interfaceC1084f.m() || !kotlin.jvm.internal.i.a(interfaceC1084f.f(), Integer.valueOf(iF))) {
                androidx.compose.animation.k.b(iF, interfaceC1084f, iF, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f, hVarC);
            interfaceC1084f.L(-737212874);
            if (failedMessage != null) {
                BubbleMessageRowKt.FailedMessageIcon(null, interfaceC1084f, 0, 1);
            }
            interfaceC1084f.D();
            interfaceC1084f.L(-737209582);
            final MessageStyle.BubbleStyle bubbleStyle = messageStyle.getBubbleStyle();
            SurfaceKt.a(null, bubbleStyle.getShape(), bubbleStyle.m255getColor0d7_KjU(), 0L, 0.0f, 0.0f, bubbleStyle.getBorderStroke(), androidx.compose.runtime.internal.a.b(722028815, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.BubbleMessageRowKt$BubbleMessageRow$6$1$1$1
                @Override // Ia.p
                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC1084f2, num.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(InterfaceC1084f interfaceC1084f2, int i11) {
                    if ((i11 & 11) == 2 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                    } else {
                        BubbleMessageRowKt.AnonymousClass6.invoke$lambda$5$Content(part2, part, list, list2, lVar, messageStyle, onClick, lVar2, z10, failedImageUploadData, lVar3, ColorSchemeKt.b(bubbleStyle.m255getColor0d7_KjU(), interfaceC1084f2), PaddingKt.e(androidx.compose.ui.h.a.f13984b, bubbleStyle.getPadding()), interfaceC1084f2, 0, 0);
                    }
                }
            }, interfaceC1084f), interfaceC1084f, 12582912, 57);
            interfaceC1084f.D();
            interfaceC1084f.J();
        }
    }

    /* JADX INFO: compiled from: BubbleMessageRow.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BlockType.values().length];
            try {
                iArr[BlockType.SUBHEADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BlockType.HEADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BlockType.CODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BlockType.PARAGRAPH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BlockType.LINK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BlockType.UNORDEREDLIST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BlockType.ORDEREDLIST.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Block.Builder builderWithText = new Block.Builder().withText("Hey");
        BlockType blockType = BlockType.PARAGRAPH;
        paragraphBlock = builderWithText.withType(blockType.getSerializedName());
        longParagraphBlock = new Block.Builder().withText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.").withType(blockType.getSerializedName());
        createTicketBlock = new Block.Builder().withTitle("Create ticket").withTicketType(new TicketType(-1, "Bug", "", EmptyList.f42983b, false)).withType(BlockType.CREATETICKETCARD.getSerializedName());
        answerBlock = new Block.Builder().withText("Yes, you can change the date of your stay for up to seven days before it is due to begin. To do this, first go to your stays and click the relevant one. Then, go to change details and enter a new date. <a class=\"inline-citation\" data-entity-id=\"1\" data-entity-type=\"other\" data-source-index=\"1\" href=\"http://external.source.com\" title=\"Changing the date of your stay using our mobile app\"></a> <a class=\"inline-citation\" data-entity-id=\"2\" data-entity-type=\"article\" data-source-index=\"2\" href=\"http://intercom.com\" title=\"Cancel your booking\"></a>").withType(blockType.getSerializedName());
        articleBlock = new Block.Builder().withText("I can’t find exactly what you need, but here is an article that could help:<br><br><a href=\"http://www.intercom.com\"> Making a group reservation</a><br>Explains how to make a group reservation with multiple guests.").withType(blockType.getSerializedName());
        humanMetadata = new Metadata("Lisa", null, null, M1.k(new Avatar.Builder().withInitials("L")), 6, null);
        imageBlockTypes = kotlin.collections.l.s(BlockType.IMAGE, BlockType.LOCALIMAGE);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:54:0x0123  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    public static final void BubbleMessageRow(final Part conversationPart, final GroupingPosition groupingPosition, final boolean z10, androidx.compose.ui.h hVar, String str, Ia.l<? super AttributeData, p293xa.r> lVar, List<String> list, List<String> list2, Ia.l<? super PendingMessage.FailedImageUploadData, p293xa.r> lVar2, PendingMessage.FailedImageUploadData failedImageUploadData, FailedMessage failedMessage, Ia.l<? super TicketType, p293xa.r> lVar3, InterfaceC1084f interfaceC1084f, final int i10, final int i11, final int i12) {
        BottomMetadata bottomMetadata;
        BottomMetadata bottomMetadata2;
        Ia.a<p293xa.r> onRetryMessageClicked;
        C1105p0 c1105p0V;
        kotlin.jvm.internal.i.e(conversationPart, "conversationPart");
        kotlin.jvm.internal.i.e(groupingPosition, "groupingPosition");
        C1086g c1086gP = interfaceC1084f.p(1247044792);
        androidx.compose.ui.h hVar2 = (i12 & 8) != 0 ? androidx.compose.ui.h.a.f13984b : hVar;
        String str2 = (i12 & 16) != 0 ? null : str;
        Ia.l<? super AttributeData, p293xa.r> c2373e = (i12 & 32) != 0 ? new C2373e(0) : lVar;
        List<String> list3 = (i12 & 64) != 0 ? EmptyList.f42983b : list;
        List<String> list4 = (i12 & 128) != 0 ? EmptyList.f42983b : list2;
        Ia.l<? super PendingMessage.FailedImageUploadData, p293xa.r> c2358g = (i12 & 256) != 0 ? new C2358g(2) : lVar2;
        PendingMessage.FailedImageUploadData failedImageUploadData2 = (i12 & 512) != 0 ? null : failedImageUploadData;
        FailedMessage failedMessage2 = (i12 & 1024) != 0 ? null : failedMessage;
        Ia.l<? super TicketType, p293xa.r> d10 = (i12 & 2048) != 0 ? new androidx.navigation.compose.D(4) : lVar3;
        int i13 = i10 >> 6;
        MessageStyle messageStyle = getMessageStyle(z10, groupingPosition, failedMessage2 != null, c1086gP, (i13 & 14) | (i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
        if (failedMessage2 == null) {
            if (str2 != null) {
                bottomMetadata2 = new BottomMetadata(str2, 0.0f, false, 6, null);
            } else {
                bottomMetadata = null;
            }
            androidx.compose.ui.d.b rowAlignment = messageStyle.getRowAlignment();
            androidx.compose.foundation.layout.L rowPadding = messageStyle.getRowPadding();
            if (failedMessage2 != null) {
                onRetryMessageClicked = failedMessage2.getOnRetryMessageClicked();
            } else {
                onRetryMessageClicked = null;
            }
            ClickableMessageRowKt.ClickableMessageRow(conversationPart, hVar2, bottomMetadata, rowAlignment, rowPadding, onRetryMessageClicked, androidx.compose.runtime.internal.a.b(873055205, new AnonymousClass6(failedMessage2, messageStyle, conversationPart, list3, list4, c2373e, d10, z10, failedImageUploadData2, c2358g), c1086gP), c1086gP, 1572872 | (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0);
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final androidx.compose.ui.h hVar3 = hVar2;
                final String str3 = str2;
                final Ia.l<? super AttributeData, p293xa.r> lVar4 = c2373e;
                final List<String> list5 = list3;
                final List<String> list6 = list4;
                final Ia.l<? super PendingMessage.FailedImageUploadData, p293xa.r> lVar5 = c2358g;
                final PendingMessage.FailedImageUploadData failedImageUploadData3 = failedImageUploadData2;
                final FailedMessage failedMessage3 = failedMessage2;
                final Ia.l<? super TicketType, p293xa.r> lVar6 = d10;
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.f
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return BubbleMessageRowKt.BubbleMessageRow$lambda$5(conversationPart, groupingPosition, z10, hVar3, str3, lVar4, list5, list6, lVar5, failedImageUploadData3, failedMessage3, lVar6, i10, i11, i12, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        bottomMetadata2 = new BottomMetadata(failedMessage2.getMessage(), 0.0f, true, 2, null);
        bottomMetadata = bottomMetadata2;
        androidx.compose.ui.d.b rowAlignment2 = messageStyle.getRowAlignment();
        androidx.compose.foundation.layout.L rowPadding2 = messageStyle.getRowPadding();
        if (failedMessage2 != null) {
            onRetryMessageClicked = failedMessage2.getOnRetryMessageClicked();
        } else {
            onRetryMessageClicked = null;
        }
        ClickableMessageRowKt.ClickableMessageRow(conversationPart, hVar2, bottomMetadata, rowAlignment2, rowPadding2, onRetryMessageClicked, androidx.compose.runtime.internal.a.b(873055205, new AnonymousClass6(failedMessage2, messageStyle, conversationPart, list3, list4, c2373e, d10, z10, failedImageUploadData2, c2358g), c1086gP), c1086gP, 1572872 | (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0);
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final androidx.compose.ui.h hVar4 = hVar2;
            final String str4 = str2;
            final Ia.l lVar7 = c2373e;
            final List list7 = list3;
            final List list8 = list4;
            final Ia.l lVar8 = c2358g;
            final PendingMessage.FailedImageUploadData failedImageUploadData4 = failedImageUploadData2;
            final FailedMessage failedMessage4 = failedMessage2;
            final Ia.l lVar9 = d10;
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.f
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return BubbleMessageRowKt.BubbleMessageRow$lambda$5(conversationPart, groupingPosition, z10, hVar4, str4, lVar7, list7, list8, lVar8, failedImageUploadData4, failedMessage4, lVar9, i10, i11, i12, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r BubbleMessageRow$lambda$0(AttributeData it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r BubbleMessageRow$lambda$1(PendingMessage.FailedImageUploadData it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r BubbleMessageRow$lambda$2(TicketType it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r BubbleMessageRow$lambda$5(Part conversationPart, GroupingPosition groupingPosition, boolean z10, androidx.compose.ui.h hVar, String str, Ia.l lVar, List list, List list2, Ia.l lVar2, PendingMessage.FailedImageUploadData failedImageUploadData, FailedMessage failedMessage, Ia.l lVar3, int i10, int i11, int i12, InterfaceC1084f interfaceC1084f, int i13) {
        kotlin.jvm.internal.i.e(conversationPart, "$conversationPart");
        kotlin.jvm.internal.i.e(groupingPosition, "$groupingPosition");
        BubbleMessageRow(conversationPart, groupingPosition, z10, hVar, str, lVar, list, list2, lVar2, failedImageUploadData, failedMessage, lVar3, interfaceC1084f, L4.b.l(i10 | 1), L4.b.l(i11), i12);
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void BubbleMessageRowPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(481690275);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$BubbleMessageRowKt.INSTANCE.m217getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2269a0(i10, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r BubbleMessageRowPreview$lambda$13(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        BubbleMessageRowPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FailedMessageIcon(androidx.compose.ui.h hVar, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        int i12;
        C1086g c1086gP = interfaceC1084f.p(-1829301504);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c1086gP.K(hVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i12 & 11) == 2 && c1086gP.s()) {
            c1086gP.w();
        } else {
            if (i13 != 0) {
                hVar = androidx.compose.ui.h.a.f13984b;
            }
            IconKt.a(U.c.a(io.intercom.android.sdk.R.drawable.intercom_message_error, c1086gP, 0), null, W.m(hVar, 16), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m633getError0d7_KjU(), c1086gP, 56, 0);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new X(hVar, i10, i11, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r FailedMessageIcon$lambda$6(androidx.compose.ui.h hVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        FailedMessageIcon(hVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: renamed from: MessageContent-993knro, reason: not valid java name */
    public static final void m211MessageContent993knro(final Part conversationPart, final List<String> failedAttributeIdentifiers, final List<String> loadingAttributeIdentifiers, final Ia.l<? super AttributeData, p293xa.r> onSubmitAttribute, final long j, final boolean z10, final l0 l0Var, final Ia.a<p293xa.r> onClick, final Ia.l<? super TicketType, p293xa.r> onCreateTicket, final boolean z11, final PendingMessage.FailedImageUploadData failedImageUploadData, final Ia.l<? super PendingMessage.FailedImageUploadData, p293xa.r> onRetryImageClicked, float f10, InterfaceC1084f interfaceC1084f, final int i10, final int i11, final int i12) {
        Iterable iterableK;
        l0 contentShape = l0Var;
        kotlin.jvm.internal.i.e(conversationPart, "conversationPart");
        kotlin.jvm.internal.i.e(failedAttributeIdentifiers, "failedAttributeIdentifiers");
        kotlin.jvm.internal.i.e(loadingAttributeIdentifiers, "loadingAttributeIdentifiers");
        kotlin.jvm.internal.i.e(onSubmitAttribute, "onSubmitAttribute");
        kotlin.jvm.internal.i.e(contentShape, "contentShape");
        kotlin.jvm.internal.i.e(onClick, "onClick");
        kotlin.jvm.internal.i.e(onCreateTicket, "onCreateTicket");
        kotlin.jvm.internal.i.e(onRetryImageClicked, "onRetryImageClicked");
        C1086g c1086gP = interfaceC1084f.p(-1984008321);
        float f11 = (i12 & 4096) != 0 ? 0 : f10;
        C0945e.i iVarG = C0945e.g(f11);
        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
        C0953m c0953mA = C0952l.a(iVarG, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
        int i13 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
        androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, aVar);
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
        c1086gP.L(1162898485);
        if (conversationPart.getMessageStyle() == io.intercom.android.sdk.models.MessageStyle.ATTRIBUTE_COLLECTOR) {
            androidx.compose.ui.h hVarD = W.d(aVar, 1.0f);
            List<Attribute> attributes = conversationPart.getForm().getAttributes();
            String id = conversationPart.getId();
            kotlin.jvm.internal.i.d(id, "getId(...)");
            AttributeCollectorCardKt.AttributeCollectorCard(hVarD, attributes, failedAttributeIdentifiers, loadingAttributeIdentifiers, id, conversationPart.getForm().getDisabled(), onSubmitAttribute, c1086gP, ((i10 << 9) & 3670016) | 4678, 0);
        }
        c1086gP.T(false);
        c1086gP.L(1162960640);
        List<Block> blocks = conversationPart.getBlocks();
        kotlin.jvm.internal.i.d(blocks, "getBlocks(...)");
        List<Block> list = blocks;
        List<Attachments> attachments = conversationPart.getAttachments();
        kotlin.jvm.internal.i.d(attachments, "getAttachments(...)");
        if (attachments.isEmpty()) {
            iterableK = EmptyList.f42983b;
        } else {
            Block.Builder builderWithType = new Block.Builder().withType("ATTACHMENTLIST");
            List<Attachments> attachments2 = conversationPart.getAttachments();
            kotlin.jvm.internal.i.d(attachments2, "getAttachments(...)");
            List<Attachments> list2 = attachments2;
            ArrayList arrayList = new ArrayList(kotlin.collections.m.y(list2, 10));
            for (Attachments attachments3 : list2) {
                arrayList.add(new BlockAttachment.Builder().withName(attachments3.getName()).withUrl(attachments3.getUrl()).withContentType(attachments3.getContentType()).withHumanFileSize(attachments3.getHumanFileSize()).build());
            }
            iterableK = M1.k(builderWithType.withAttachments(kotlin.collections.q.o0(arrayList)).build());
        }
        Iterator it = kotlin.collections.q.c0(list, iterableK).iterator();
        while (it.hasNext()) {
            Block block = (Block) it.next();
            androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
            int i14 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
            androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, aVar);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            Iterator it2 = it;
            if (c1086gP.f12995O) {
                c1086gP.v(aVar3);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P2);
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar2 = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i14))) {
                J4.i.d(i14, c1086gP, i14, pVar2);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC2);
            C0949i c0949i = C0949i.f10304a;
            androidx.compose.ui.h hVarR = A8.p.r(aVar, contentShape);
            kotlin.jvm.internal.i.b(block);
            androidx.compose.ui.graphics.H h8 = new androidx.compose.ui.graphics.H(j);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i15 = IntercomTheme.$stable;
            long j10 = intercomTheme.getTypography(c1086gP, i15).getType04().f15318a.f15691b;
            androidx.compose.ui.text.font.l lVar = intercomTheme.getTypography(c1086gP, i15).getType04().f15318a.f15692c;
            if (lVar == null) {
                lVar = androidx.compose.ui.text.font.l.f15442g;
            }
            BlockViewKt.BlockView(hVarR, new BlockRenderData(block, h8, null, null, new BlockRenderTextStyle(j10, lVar, intercomTheme.getTypography(c1086gP, i15).getType04().f15319b.f15594c, null, null, null, 56, null), 12, null), z11, null, z10, conversationPart.getParentConversation().getId(), ImageRenderType.WITH_MAX_SIZE, onClick, onCreateTicket, false, null, null, c1086gP, ((i10 >> 21) & 896) | 1572928 | ((i10 >> 3) & 57344) | (i10 & 29360128) | (i10 & 234881024), 0, 3592);
            c1086gP.L(1737872381);
            if (failedImageUploadData != null) {
                C2182z c2182z = new C2182z(onRetryImageClicked, 1, failedImageUploadData);
                androidx.compose.ui.h hVarF = c0949i.f(aVar, androidx.compose.ui.d.a.f13339e);
                N n10 = C1051f.f12444a;
                ButtonKt.a(c2182z, hVarF, false, null, C1051f.a(intercomTheme.getColors(c1086gP, i15).m615getAction0d7_KjU(), ColorSchemeKt.b(intercomTheme.getColors(c1086gP, i15).m615getAction0d7_KjU(), c1086gP), 0L, 0L, c1086gP, 12), null, null, null, null, ComposableSingletons$BubbleMessageRowKt.INSTANCE.m216getLambda1$intercom_sdk_base_release(), c1086gP, 805306368, 492);
            }
            c1086gP.T(false);
            c1086gP.T(true);
            contentShape = l0Var;
            it = it2;
        }
        C1105p0 c1105p0A = C4.a.a(c1086gP, false, true);
        if (c1105p0A != null) {
            final float f12 = f11;
            c1105p0A.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.d
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return BubbleMessageRowKt.MessageContent_993knro$lambda$12(conversationPart, failedAttributeIdentifiers, loadingAttributeIdentifiers, onSubmitAttribute, j, z10, l0Var, onClick, onCreateTicket, z11, failedImageUploadData, onRetryImageClicked, f12, i10, i11, i12, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r MessageContent_993knro$lambda$11$lambda$10$lambda$9$lambda$8(Ia.l onRetryImageClicked, PendingMessage.FailedImageUploadData failedImageUploadData) {
        kotlin.jvm.internal.i.e(onRetryImageClicked, "$onRetryImageClicked");
        onRetryImageClicked.invoke(failedImageUploadData);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r MessageContent_993knro$lambda$12(Part conversationPart, List failedAttributeIdentifiers, List loadingAttributeIdentifiers, Ia.l onSubmitAttribute, long j, boolean z10, l0 contentShape, Ia.a onClick, Ia.l onCreateTicket, boolean z11, PendingMessage.FailedImageUploadData failedImageUploadData, Ia.l onRetryImageClicked, float f10, int i10, int i11, int i12, InterfaceC1084f interfaceC1084f, int i13) {
        kotlin.jvm.internal.i.e(conversationPart, "$conversationPart");
        kotlin.jvm.internal.i.e(failedAttributeIdentifiers, "$failedAttributeIdentifiers");
        kotlin.jvm.internal.i.e(loadingAttributeIdentifiers, "$loadingAttributeIdentifiers");
        kotlin.jvm.internal.i.e(onSubmitAttribute, "$onSubmitAttribute");
        kotlin.jvm.internal.i.e(contentShape, "$contentShape");
        kotlin.jvm.internal.i.e(onClick, "$onClick");
        kotlin.jvm.internal.i.e(onCreateTicket, "$onCreateTicket");
        kotlin.jvm.internal.i.e(onRetryImageClicked, "$onRetryImageClicked");
        m211MessageContent993knro(conversationPart, failedAttributeIdentifiers, loadingAttributeIdentifiers, onSubmitAttribute, j, z10, contentShape, onClick, onCreateTicket, z11, failedImageUploadData, onRetryImageClicked, f10, interfaceC1084f, L4.b.l(i10 | 1), L4.b.l(i11), i12);
        return p293xa.r.f47939a;
    }

    public static final void MessageMeta(androidx.compose.ui.h hVar, final String metaString, final String attributeString, final boolean z10, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        androidx.compose.ui.h hVar2;
        int i12;
        C1086g c1086g;
        int i13;
        C1086g c1086g2;
        boolean z11;
        final androidx.compose.ui.h hVar3;
        kotlin.jvm.internal.i.e(metaString, "metaString");
        kotlin.jvm.internal.i.e(attributeString, "attributeString");
        C1086g c1086gP = interfaceC1084f.p(302477331);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
            hVar2 = hVar;
        } else if ((i10 & 14) == 0) {
            hVar2 = hVar;
            i12 = (c1086gP.K(hVar2) ? 4 : 2) | i10;
        } else {
            hVar2 = hVar;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i12 |= c1086gP.K(metaString) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            i12 |= c1086gP.K(attributeString) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            i12 |= c1086gP.c(z10) ? 2048 : 1024;
        }
        int i15 = i12;
        if ((i15 & 5851) == 1170 && c1086gP.s()) {
            c1086gP.w();
            hVar3 = hVar2;
            c1086g2 = c1086gP;
        } else {
            androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
            androidx.compose.ui.h hVar4 = i14 != 0 ? aVar : hVar2;
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i16 = IntercomTheme.$stable;
            long jM630getDescriptionText0d7_KjU = intercomTheme.getColors(c1086gP, i16).m630getDescriptionText0d7_KjU();
            T tA = S.a(C0945e.f10290g, androidx.compose.ui.d.a.j, c1086gP, 6);
            int i17 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVar4);
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
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i17))) {
                J4.i.d(i17, c1086gP, i17, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
            c1086gP.L(-1112135187);
            if (z10) {
                c1086g = c1086gP;
                i13 = i16;
            } else {
                i13 = i16;
                c1086g = c1086gP;
                TextKt.b(attributeString, PaddingKt.j(aVar, 0.0f, 0.0f, 8, 0.0f, 11), jM630getDescriptionText0d7_KjU, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i16).getType05(), c1086g, ((i15 >> 6) & 14) | 48, 0, 65528);
            }
            C1086g c1086g3 = c1086g;
            c1086g3.T(false);
            int i18 = i13;
            TextKt.b(metaString, null, jM630getDescriptionText0d7_KjU, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086g3, i13).getType05(), c1086g3, (i15 >> 3) & 14, 0, 65530);
            c1086g3.L(-1112121618);
            if (z10) {
                TextKt.b(attributeString, PaddingKt.j(aVar, 8, 0.0f, 0.0f, 0.0f, 14), jM630getDescriptionText0d7_KjU, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086g3, i18).getType05(), c1086g3, ((i15 >> 6) & 14) | 48, 0, 65528);
                z11 = false;
                c1086g2 = c1086g3;
            } else {
                c1086g2 = c1086g3;
                z11 = false;
            }
            c1086g2.T(z11);
            c1086g2.T(true);
            hVar3 = hVar4;
        }
        C1105p0 c1105p0V = c1086g2.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.g
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return BubbleMessageRowKt.MessageMeta$lambda$15(hVar3, metaString, attributeString, z10, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r MessageMeta$lambda$15(androidx.compose.ui.h hVar, String metaString, String attributeString, boolean z10, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(metaString, "$metaString");
        kotlin.jvm.internal.i.e(attributeString, "$attributeString");
        MessageMeta(hVar, metaString, attributeString, z10, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    public static final float contentAlpha(boolean z10, InterfaceC1084f interfaceC1084f, int i10) {
        interfaceC1084f.L(1168284893);
        float f10 = z10 ? 1.0f : 0.38f;
        interfaceC1084f.D();
        return f10;
    }

    public static final Block.Builder getAnswerBlock() {
        return answerBlock;
    }

    public static final Block.Builder getArticleBlock() {
        return articleBlock;
    }

    public static final C1260a getCopyText(Part part) {
        kotlin.jvm.internal.i.e(part, "<this>");
        StringBuilder sb2 = new StringBuilder(16);
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        Iterator<Block> it = part.getBlocks().iterator();
        while (true) {
            if (!it.hasNext()) {
                String string = sb2.toString();
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList2.add(((C1260a.b.C0161a) arrayList.get(i10)).a(sb2.length()));
                }
                C1260a c1260a = new C1260a(string, arrayList2);
                if (string.length() != 0) {
                    return c1260a;
                }
                String summary = part.getSummary();
                kotlin.jvm.internal.i.d(summary, "getSummary(...)");
                return new C1260a(summary);
            }
            Block next = it.next();
            BlockType type = next.getType();
            switch (type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    sb2.append(p307z0.b.a(next.getText(), 0).toString());
                    break;
                case 5:
                    String url = next.getUrl();
                    kotlin.jvm.internal.i.d(url, "getUrl(...)");
                    sb2.append(url);
                    break;
                case 6:
                case 7:
                    for (String str : next.getItems()) {
                        kotlin.jvm.internal.i.b(str);
                        sb2.append(str);
                    }
                    break;
            }
        }
    }

    public static final Block.Builder getCreateTicketBlock() {
        return createTicketBlock;
    }

    public static final Metadata getHumanMetadata() {
        return humanMetadata;
    }

    public static final Block.Builder getLongParagraphBlock() {
        return longParagraphBlock;
    }

    private static final MessageStyle getMessageStyle(boolean z10, GroupingPosition groupingPosition, boolean z11, InterfaceC1084f interfaceC1084f, int i10) {
        MessageStyle messageStyle;
        interfaceC1084f.L(1733827858);
        if (z10) {
            interfaceC1084f.L(-1196940615);
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
            messageStyle = new MessageStyle(new MessageStyle.BubbleStyle(jM618getAdminBackground0d7_KjU, n10, p270w.g.c(f14, f10, f10, f11), C1787c0.a(1, intercomTheme.getColors(interfaceC1084f, i11).m619getAdminBorder0d7_KjU()), null), androidx.compose.ui.d.a.f13346m, PaddingKt.b(f12, 0.0f, 60, 0.0f, 10), p270w.g.b(f10));
            interfaceC1084f.D();
        } else {
            interfaceC1084f.L(-1195737257);
            float f15 = 20;
            float f16 = 4;
            long jM615getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(interfaceC1084f, IntercomTheme.$stable).m615getAction0d7_KjU();
            float f17 = 16;
            float f18 = 12;
            N n11 = new N(f17, f18, f17, f18);
            float f19 = (groupingPosition == GroupingPosition.BOTTOM || groupingPosition == GroupingPosition.MIDDLE) ? f16 : f15;
            if (groupingPosition != GroupingPosition.TOP && groupingPosition != GroupingPosition.MIDDLE) {
                f16 = f15;
            }
            messageStyle = new MessageStyle(new MessageStyle.BubbleStyle(jM615getAction0d7_KjU, n11, p270w.g.c(f15, f19, f16, f15), null, null), androidx.compose.ui.d.a.f13348o, z11 ? PaddingKt.b(36, 0.0f, f17, 0.0f, 10) : PaddingKt.b(60, 0.0f, f17, 0.0f, 10), p270w.g.b(f15));
            interfaceC1084f.D();
        }
        interfaceC1084f.D();
        return messageStyle;
    }

    public static final Block.Builder getParagraphBlock() {
        return paragraphBlock;
    }

    public static final boolean shouldShowAttribution(Part part) {
        kotlin.jvm.internal.i.e(part, "<this>");
        if (part.getBlocks().size() == 1) {
            List<BlockType> list = imageBlockTypes;
            List<Block> blocks = part.getBlocks();
            kotlin.jvm.internal.i.d(blocks, "getBlocks(...)");
            if (list.contains(((Block) kotlin.collections.q.O(blocks)).getType())) {
                List<Block> blocks2 = part.getBlocks();
                kotlin.jvm.internal.i.d(blocks2, "getBlocks(...)");
                String attribution = ((Block) kotlin.collections.q.O(blocks2)).getAttribution();
                kotlin.jvm.internal.i.d(attribution, "getAttribution(...)");
                if (attribution.length() > 0 && part.getMessageState() == Part.MessageState.NORMAL) {
                    return true;
                }
            }
        }
        return false;
    }
}
