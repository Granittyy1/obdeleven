package io.intercom.android.sdk.survey.block;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.B;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.navigation.compose.F;
import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.blocks.CarouselImageClickListener;
import io.intercom.android.sdk.blocks.LinkOpeningButtonClickListener;
import io.intercom.android.sdk.blocks.UploadingImageCache;
import io.intercom.android.sdk.blocks.ViewHolderGenerator;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.Blocks;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.FeatureFlag;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.home.ui.components.LegacyMessengerAppCardKt;
import io.intercom.android.sdk.models.InlineSource;
import io.intercom.android.sdk.tickets.create.ui.CreateTicketCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import java.util.List;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: BlockView.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class BlockViewKt {

    /* JADX INFO: compiled from: BlockView.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BlockType.values().length];
            try {
                iArr[BlockType.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BlockType.PARAGRAPH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BlockType.HEADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BlockType.SUBHEADING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BlockType.ORDEREDLIST.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BlockType.UNORDEREDLIST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BlockType.CREATETICKETCARD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BlockType.MESSENGERCARD.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BlockType.CODE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[BlockType.ATTACHMENTLIST.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[BlockType.LOCAL_ATTACHMENT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[BlockType.CONVERSATIONRATING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[BlockType.LINKLIST.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[BlockType.VIDEOFILE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:97:0x0315  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    public static final void BlockView(androidx.compose.ui.h hVar, final BlockRenderData blockRenderData, boolean z10, SuffixText suffixText, boolean z11, String str, ImageRenderType imageRenderType, Ia.a<p293xa.r> aVar, Ia.l<? super TicketType, p293xa.r> lVar, boolean z12, Ia.l<? super List<InlineSource>, p293xa.r> lVar2, Ia.l<? super B, p293xa.r> lVar3, InterfaceC1084f interfaceC1084f, final int i10, final int i11, final int i12) {
        ImageRenderType imageRenderType2;
        boolean z13;
        boolean z14;
        C1105p0 c1105p0V;
        kotlin.jvm.internal.i.e(blockRenderData, "blockRenderData");
        C1086g c1086gP = interfaceC1084f.p(-373546060);
        int i13 = i12 & 1;
        androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
        final androidx.compose.ui.h hVar2 = i13 != 0 ? aVar2 : hVar;
        boolean z15 = (i12 & 4) != 0 ? false : z10;
        SuffixText no_suffix = (i12 & 8) != 0 ? SuffixText.Companion.getNO_SUFFIX() : suffixText;
        boolean z16 = (i12 & 16) != 0 ? true : z11;
        String str2 = (i12 & 32) != 0 ? "" : str;
        ImageRenderType imageRenderType3 = (i12 & 64) != 0 ? ImageRenderType.CROPPED : imageRenderType;
        final Ia.a<p293xa.r> aVar3 = (i12 & 128) != 0 ? null : aVar;
        final Ia.l<? super TicketType, p293xa.r> lVar4 = (i12 & 256) != 0 ? null : lVar;
        boolean z17 = (i12 & 512) != 0 ? false : z12;
        Ia.l<? super List<InlineSource>, p293xa.r> eVar = (i12 & 1024) != 0 ? new e(0) : lVar2;
        Ia.l<? super B, p293xa.r> f10 = (i12 & 2048) != 0 ? new F(2) : lVar3;
        H hM366getTextColorQN2ZGVo = blockRenderData.m366getTextColorQN2ZGVo();
        long j = hM366getTextColorQN2ZGVo != null ? hM366getTextColorQN2ZGVo.f13506a : H.f13495b;
        final Block block = blockRenderData.getBlock();
        if (!Injector.isNotInitialised()) {
            imageRenderType2 = imageRenderType3;
            if (((AppConfig) Z3.o.b()).hasFeature(FeatureFlag.BLOCK_RENDERING_FALLBACK)) {
                c1086gP.L(1198822707);
                m379RenderLegacyBlockssW7UJKQ(block, j, hVar2, null, c1086gP, ((i10 << 6) & 896) | 8, 8);
                c1086gP.T(false);
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final boolean z18 = z15;
                final SuffixText suffixText2 = no_suffix;
                final boolean z19 = z16;
                final String str3 = str2;
                final ImageRenderType imageRenderType4 = imageRenderType2;
                final Ia.a<p293xa.r> aVar4 = aVar3;
                final Ia.l<? super TicketType, p293xa.r> lVar5 = lVar4;
                final boolean z20 = z17;
                final Ia.l<? super List<InlineSource>, p293xa.r> lVar6 = eVar;
                final Ia.l<? super B, p293xa.r> lVar7 = f10;
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.survey.block.g
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return BlockViewKt.BlockView$lambda$5(hVar2, blockRenderData, z18, suffixText2, z19, str3, imageRenderType4, aVar4, lVar5, z20, lVar6, lVar7, i10, i11, i12, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        imageRenderType2 = imageRenderType3;
        c1086gP.L(1198993083);
        final SuffixText suffixText3 = no_suffix;
        final Ia.l<? super B, p293xa.r> lVar8 = f10;
        final boolean z21 = z17;
        final Ia.l<? super List<InlineSource>, p293xa.r> lVar9 = eVar;
        ComposableLambdaImpl composableLambdaImplB = androidx.compose.runtime.internal.a.b(-1514621528, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.survey.block.BlockViewKt$BlockView$textBlock$1
            @Override // Ia.p
            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                invoke(interfaceC1084f2, num.intValue());
                return p293xa.r.f47939a;
            }

            public final void invoke(InterfaceC1084f interfaceC1084f2, int i14) {
                if ((i14 & 11) == 2 && interfaceC1084f2.s()) {
                    interfaceC1084f2.w();
                } else {
                    TextBlockKt.TextBlock(androidx.compose.ui.h.a.f13984b, blockRenderData, suffixText3, lVar8, z21, lVar9, interfaceC1084f2, 70, 0);
                }
            }
        }, c1086gP);
        BlockType type = block.getType();
        switch (type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                c1086gP.L(-1208237443);
                ImageBlockKt.ImageBlock(block, hVar2, null, false, imageRenderType2, c1086gP, ((i10 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8 | ((i10 >> 6) & 57344), 12);
                z13 = false;
                c1086gP.T(false);
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                c1086gP.L(-1208229124);
                composableLambdaImplB.invoke(c1086gP, 6);
                c1086gP.T(false);
                z13 = false;
                break;
            case 7:
                c1086gP.L(1199675021);
                final boolean z22 = z16 && !block.getTicketType().getArchived();
                CreateTicketCardKt.CreateTicketCard(aVar2, blockRenderData, z22, new Ia.a() { // from class: io.intercom.android.sdk.survey.block.f
                    @Override // Ia.a
                    public final Object invoke() {
                        return BlockViewKt.BlockView$lambda$2(z22, lVar4, block, aVar3);
                    }
                }, c1086gP, 70, 0);
                z13 = false;
                c1086gP.T(false);
                break;
            case 8:
                c1086gP.L(1200284853);
                String fallbackUrl = block.getFallbackUrl();
                kotlin.jvm.internal.i.d(fallbackUrl, "getFallbackUrl(...)");
                if (fallbackUrl.length() > 0) {
                    c1086gP.L(1200334546);
                    String fallbackUrl2 = block.getFallbackUrl();
                    kotlin.jvm.internal.i.d(fallbackUrl2, "getFallbackUrl(...)");
                    z14 = false;
                    LegacyMessengerAppCardKt.LegacyMessengerAppCard(fallbackUrl2, IntercomCardStyle.INSTANCE.m530conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, c1086gP, IntercomCardStyle.$stable << 15, 31), false, c1086gP, (IntercomCardStyle.Style.$stable << 3) | 384);
                    c1086gP.T(false);
                } else {
                    z14 = false;
                    c1086gP.L(1200587134);
                    composableLambdaImplB.invoke(c1086gP, 6);
                    c1086gP.T(false);
                }
                c1086gP.T(z14);
                z13 = false;
                break;
            case 9:
                c1086gP.L(-1208194301);
                CodeBlockKt.CodeBlock(block, hVar2, f10, c1086gP, ((i10 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8 | ((i11 << 3) & 896), 0);
                c1086gP.T(false);
                z13 = false;
                break;
            case 10:
                c1086gP.L(-1208191374);
                AttachmentBlockKt.AttachmentBlock(hVar2, blockRenderData, z15, c1086gP, (i10 & 14) | 64 | (i10 & 896), 0);
                c1086gP.T(false);
                z13 = false;
                break;
            case 11:
                c1086gP.L(-1208187918);
                AttachmentBlockKt.AttachmentBlock(hVar2, blockRenderData, z15, c1086gP, (i10 & 14) | 64 | (i10 & 896), 0);
                c1086gP.T(false);
                z13 = false;
                break;
            case 12:
                c1086gP.L(-1208184286);
                ConversationRatingBlockKt.m389ConversationRatingBlockcf5BqRc(null, blockRenderData, j, str2, c1086gP, ((i10 >> 6) & 7168) | 64, 1);
                c1086gP.T(false);
                z13 = false;
                break;
            case 13:
                c1086gP.L(-1208177500);
                LinkListBlockKt.m390LinkListBlockcf5BqRc(null, block, j, str2, c1086gP, ((i10 >> 6) & 7168) | 64, 1);
                c1086gP.T(false);
                z13 = false;
                break;
            case 14:
                c1086gP.L(-1208171550);
                String url = block.getUrl();
                if (url.length() == 0) {
                    url = block.getLocalUri().toString();
                }
                kotlin.jvm.internal.i.d(url, "ifEmpty(...)");
                String thumbnailUrl = block.getThumbnailUrl();
                kotlin.jvm.internal.i.b(thumbnailUrl);
                if (thumbnailUrl.length() <= 0) {
                    thumbnailUrl = null;
                }
                VideoFileBlockKt.VideoFileBlock(hVar2, url, thumbnailUrl, c1086gP, i10 & 14, 0);
                c1086gP.T(false);
                z13 = false;
                break;
            default:
                c1086gP.L(1202013971);
                if (!Injector.isNotInitialised()) {
                    m379RenderLegacyBlockssW7UJKQ(block, j, hVar2, null, c1086gP, ((i10 << 6) & 896) | 8, 8);
                }
                c1086gP.T(false);
                z13 = false;
                break;
        }
        c1086gP.T(z13);
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final boolean z110 = z15;
            final SuffixText suffixText4 = no_suffix;
            final boolean z111 = z16;
            final String str4 = str2;
            final ImageRenderType imageRenderType5 = imageRenderType2;
            final Ia.a aVar5 = aVar3;
            final Ia.l lVar10 = lVar4;
            final boolean z23 = z17;
            final Ia.l lVar11 = eVar;
            final Ia.l lVar12 = f10;
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.survey.block.g
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return BlockViewKt.BlockView$lambda$5(hVar2, blockRenderData, z110, suffixText4, z111, str4, imageRenderType5, aVar5, lVar10, z23, lVar11, lVar12, i10, i11, i12, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r BlockView$lambda$0(List it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r BlockView$lambda$1(B it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r BlockView$lambda$2(boolean z10, Ia.l lVar, Block block, Ia.a aVar) {
        kotlin.jvm.internal.i.e(block, "$block");
        if (z10) {
            if (lVar != null) {
                TicketType ticketType = block.getTicketType();
                kotlin.jvm.internal.i.d(ticketType, "getTicketType(...)");
                lVar.invoke(ticketType);
            }
        } else if (aVar != null) {
            aVar.invoke();
        }
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r BlockView$lambda$5(androidx.compose.ui.h hVar, BlockRenderData blockRenderData, boolean z10, SuffixText suffixText, boolean z11, String str, ImageRenderType imageRenderType, Ia.a aVar, Ia.l lVar, boolean z12, Ia.l lVar2, Ia.l lVar3, int i10, int i11, int i12, InterfaceC1084f interfaceC1084f, int i13) {
        kotlin.jvm.internal.i.e(blockRenderData, "$blockRenderData");
        BlockView(hVar, blockRenderData, z10, suffixText, z11, str, imageRenderType, aVar, lVar, z12, lVar2, lVar3, interfaceC1084f, L4.b.l(i10 | 1), L4.b.l(i11), i12);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: renamed from: RenderLegacyBlocks-sW7UJKQ, reason: not valid java name */
    public static final void m379RenderLegacyBlockssW7UJKQ(final Block block, final long j, androidx.compose.ui.h hVar, String str, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        kotlin.jvm.internal.i.e(block, "block");
        C1086g c1086gP = interfaceC1084f.p(-119170784);
        androidx.compose.ui.h hVar2 = (i11 & 4) != 0 ? androidx.compose.ui.h.a.f13984b : hVar;
        String str2 = (i11 & 8) != 0 ? "" : str;
        final Blocks blocks = new Blocks((Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b), LumberMill.getBlocksTwig());
        UploadingImageCache uploadingImageCache = new UploadingImageCache();
        Api api = Injector.get().getApi();
        Provider<AppConfig> appConfigProvider = Injector.get().getAppConfigProvider();
        Api api2 = Injector.get().getApi();
        kotlin.jvm.internal.i.d(api2, "getApi(...)");
        final ViewHolderGenerator viewHolderGenerator = new ViewHolderGenerator(uploadingImageCache, api, appConfigProvider, str2, new CarouselImageClickListener(api2), new LinkOpeningButtonClickListener(Injector.get().getApi()), Injector.get().getGson(), Injector.get().getMetricTracker());
        AndroidView_androidKt.b(new Ia.l() { // from class: io.intercom.android.sdk.survey.block.h
            @Override // Ia.l
            public final Object invoke(Object obj) {
                Blocks blocks2 = blocks;
                ViewHolderGenerator viewHolderGenerator2 = viewHolderGenerator;
                return BlockViewKt.RenderLegacyBlocks_sW7UJKQ$lambda$7(blocks2, block, viewHolderGenerator2, j, (Context) obj);
            }
        }, hVar2, null, c1086gP, (i10 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 4);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final androidx.compose.ui.h hVar3 = hVar2;
            final String str3 = str2;
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.survey.block.i
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return BlockViewKt.RenderLegacyBlocks_sW7UJKQ$lambda$8(block, j, hVar3, str3, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout RenderLegacyBlocks_sW7UJKQ$lambda$7(Blocks blocks, Block block, ViewHolderGenerator generator, long j, Context it) {
        kotlin.jvm.internal.i.e(blocks, "$blocks");
        kotlin.jvm.internal.i.e(block, "$block");
        kotlin.jvm.internal.i.e(generator, "$generator");
        kotlin.jvm.internal.i.e(it, "it");
        LinearLayout linearLayoutCreateBlocks = blocks.createBlocks(M1.k(block), generator.getPostHolder());
        kotlin.jvm.internal.i.b(linearLayoutCreateBlocks);
        int childCount = linearLayoutCreateBlocks.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = linearLayoutCreateBlocks.getChildAt(i10);
            if ((childAt instanceof TextView) && !(childAt instanceof Button)) {
                ((TextView) childAt).setTextColor(Color.rgb((Q3.d.K(j) >> 16) & 255, (Q3.d.K(j) >> 8) & 255, Q3.d.K(j) & 255));
            }
        }
        linearLayoutCreateBlocks.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        return linearLayoutCreateBlocks;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r RenderLegacyBlocks_sW7UJKQ$lambda$8(Block block, long j, androidx.compose.ui.h hVar, String str, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(block, "$block");
        m379RenderLegacyBlockssW7UJKQ(block, j, hVar, str, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }
}
