package io.intercom.android.sdk.survey.block;

import android.content.Context;
import android.text.Spanned;
import androidx.collection.C0893v;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0949i;
import androidx.compose.foundation.layout.W;
import androidx.compose.foundation.text.C0995d;
import androidx.compose.foundation.text.C0996e;
import androidx.compose.foundation.text.selection.SelectionContainerKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.O0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.X;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.layout.E;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.AbstractC1266g;
import androidx.compose.ui.text.B;
import androidx.compose.ui.text.C1260a;
import androidx.compose.ui.text.C1264e;
import androidx.compose.ui.text.C1268i;
import androidx.compose.ui.text.D;
import androidx.compose.ui.text.F;
import androidx.compose.ui.text.G;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.unit.LayoutDirection;
import com.braze.support.BrazeLogger;
import io.intercom.android.sdk.blocks.lib.BlockAlignment;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.components.A0;
import io.intercom.android.sdk.m5.components.C2269a0;
import io.intercom.android.sdk.m5.components.C2271b0;
import io.intercom.android.sdk.m5.components.E0;
import io.intercom.android.sdk.m5.components.U;
import io.intercom.android.sdk.m5.components.z0;
import io.intercom.android.sdk.m5.conversation.ui.components.O;
import io.intercom.android.sdk.models.InlineSource;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.text.Regex;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: TextBlock.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TextBlockKt {
    private static final String formattedText = "Hello <b>World</b>. This <i><strike>text</strike>sentence</i> is form<b>att<u>ed</u></b> in simple html. <a href=\"https://github.com/ch4rl3x/HtmlText\">HtmlText</a>";
    private static final List<String> items = kotlin.collections.l.s("First item", "Second item with very long text. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", formattedText);
    private static final String textWithSources = "Hello World! This is <a href=\"https://github.com/ch4rl3x/HtmlText\">simple link</a>. And this is source link <a class=\"inline-citation\" data-entity-id=\"111\" data-entity-type=\"article\" data-source-index=\"1\" href=\"https://github.com/ch4rl3x/HtmlText\" title=\"Leaving Elephant Energy\">link here</a> <a class=\"inline-citation\" data-entity-id=\"222\" data-entity-type=\"article\" data-source-index=\"2\" href=\"https://github.com/ch4rl3x/HtmlText\" title=\"Article 2\">link here</a>";

    /* JADX INFO: renamed from: io.intercom.android.sdk.survey.block.TextBlockKt$TextBlock$3, reason: invalid class name */
    /* JADX INFO: compiled from: TextBlock.kt */
    public static final class AnonymousClass3 implements Ia.p<InterfaceC1084f, Integer, p293xa.r> {
        final /* synthetic */ Block $block;
        final /* synthetic */ BlockRenderData $blockRenderData;
        final /* synthetic */ BlockRenderTextStyle $blockRenderTextStyle;
        final /* synthetic */ C1260a $finalTextToRender;
        final /* synthetic */ Set<InlineSource> $inlineSources;
        final /* synthetic */ X<B> $layoutResult;
        final /* synthetic */ androidx.compose.ui.h $modifier;
        final /* synthetic */ Ia.l<B, p293xa.r> $onLayoutResult;
        final /* synthetic */ SuffixText $suffixText;
        final /* synthetic */ C1260a $textToRender;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(BlockRenderTextStyle blockRenderTextStyle, BlockRenderData blockRenderData, Block block, androidx.compose.ui.h hVar, C1260a c1260a, SuffixText suffixText, Set<InlineSource> set, C1260a c1260a2, Ia.l<? super B, p293xa.r> lVar, X<B> x10) {
            this.$blockRenderTextStyle = blockRenderTextStyle;
            this.$blockRenderData = blockRenderData;
            this.$block = block;
            this.$modifier = hVar;
            this.$textToRender = c1260a;
            this.$suffixText = suffixText;
            this.$inlineSources = set;
            this.$finalTextToRender = c1260a2;
            this.$onLayoutResult = lVar;
            this.$layoutResult = x10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$1$lambda$0(C1260a textToRender, SuffixText suffixText, androidx.compose.ui.semantics.w semantics) {
            kotlin.jvm.internal.i.e(textToRender, "$textToRender");
            kotlin.jvm.internal.i.e(semantics, "$this$semantics");
            androidx.compose.ui.semantics.t.g(((Object) textToRender) + suffixText.getTtsText(), semantics);
            return p293xa.r.f47939a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$4$lambda$3(X layoutResult, Ia.l lVar, B it) {
            kotlin.jvm.internal.i.e(layoutResult, "$layoutResult");
            kotlin.jvm.internal.i.e(it, "it");
            layoutResult.setValue(it);
            lVar.invoke(it);
            return p293xa.r.f47939a;
        }

        @Override // Ia.p
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            int textAlign;
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
                return;
            }
            long jM374getFontSizeXSAIIZE = this.$blockRenderTextStyle.m374getFontSizeXSAIIZE();
            H hM378getTextColorQN2ZGVo = this.$blockRenderTextStyle.m378getTextColorQN2ZGVo();
            if (hM378getTextColorQN2ZGVo == null) {
                hM378getTextColorQN2ZGVo = this.$blockRenderData.m366getTextColorQN2ZGVo();
            }
            interfaceC1084f.L(231563533);
            long jM645getPrimaryText0d7_KjU = hM378getTextColorQN2ZGVo == null ? IntercomTheme.INSTANCE.getColors(interfaceC1084f, IntercomTheme.$stable).m645getPrimaryText0d7_KjU() : hM378getTextColorQN2ZGVo.f13506a;
            interfaceC1084f.D();
            androidx.compose.ui.text.style.g gVarM377getTextAlignbuA522U = this.$blockRenderTextStyle.m377getTextAlignbuA522U();
            if (gVarM377getTextAlignbuA522U != null) {
                textAlign = gVarM377getTextAlignbuA522U.f15669a;
            } else {
                BlockAlignment align = this.$block.getAlign();
                kotlin.jvm.internal.i.d(align, "getAlign(...)");
                textAlign = BlockExtensionsKt.getTextAlign(align);
            }
            long jM375getLineHeightXSAIIZE = this.$blockRenderTextStyle.m375getLineHeightXSAIIZE();
            androidx.compose.ui.text.font.l fontWeight = this.$blockRenderTextStyle.getFontWeight();
            androidx.compose.ui.h hVar = this.$modifier;
            interfaceC1084f.L(231575459);
            boolean zK = interfaceC1084f.K(this.$textToRender) | interfaceC1084f.K(this.$suffixText);
            final C1260a c1260a = this.$textToRender;
            final SuffixText suffixText = this.$suffixText;
            Object objF = interfaceC1084f.f();
            InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
            if (zK || objF == c0153a) {
                objF = new Ia.l() { // from class: io.intercom.android.sdk.survey.block.y
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        return TextBlockKt.AnonymousClass3.invoke$lambda$1$lambda$0(c1260a, suffixText, (androidx.compose.ui.semantics.w) obj);
                    }
                };
                interfaceC1084f.E(objF);
            }
            interfaceC1084f.D();
            androidx.compose.ui.h hVarB = androidx.compose.ui.semantics.p.b(hVar, false, (Ia.l) objF);
            interfaceC1084f.L(231583295);
            Set<InlineSource> set = this.$inlineSources;
            ArrayList arrayList = new ArrayList(kotlin.collections.m.y(set, 10));
            Iterator it = set.iterator();
            while (it.hasNext()) {
                final InlineSource inlineSource = (InlineSource) it.next();
                arrayList.add(new Pair(inlineSource.getDataEntityId(), new C0995d(new androidx.compose.ui.text.p(G0.a.i((float) 1.5d, 8589934592L), G0.a.i((float) 1.1d, 8589934592L)), androidx.compose.runtime.internal.a.b(-559544290, new Ia.q<String, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt$TextBlock$3$2$1
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ p293xa.r invoke(String str, InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(str, interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(String it2, InterfaceC1084f interfaceC1084f2, int i11) {
                        kotlin.jvm.internal.i.e(it2, "it");
                        if ((i11 & 81) == 16 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                        } else {
                            TextBlockKt.m398InlineSourceBadgeFNF3uiM(inlineSource.getDataSourceIndex(), null, 0L, interfaceC1084f2, 0, 6);
                        }
                    }
                }, interfaceC1084f))));
                fontWeight = fontWeight;
                it = it;
                jM374getFontSizeXSAIIZE = jM374getFontSizeXSAIIZE;
                jM645getPrimaryText0d7_KjU = jM645getPrimaryText0d7_KjU;
            }
            long j = jM645getPrimaryText0d7_KjU;
            long j10 = jM374getFontSizeXSAIIZE;
            androidx.compose.ui.text.font.l lVar = fontWeight;
            interfaceC1084f.D();
            Map mapW = kotlin.collections.y.w(arrayList);
            C1260a c1260a2 = this.$finalTextToRender;
            androidx.compose.ui.text.style.g gVar = new androidx.compose.ui.text.style.g(textAlign);
            interfaceC1084f.L(231578616);
            boolean zK2 = interfaceC1084f.K(this.$onLayoutResult);
            final X<B> x10 = this.$layoutResult;
            final Ia.l<B, p293xa.r> lVar2 = this.$onLayoutResult;
            Object objF2 = interfaceC1084f.f();
            if (zK2 || objF2 == c0153a) {
                objF2 = new Ia.l() { // from class: io.intercom.android.sdk.survey.block.z
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        return TextBlockKt.AnonymousClass3.invoke$lambda$4$lambda$3(x10, lVar2, (B) obj);
                    }
                };
                interfaceC1084f.E(objF2);
            }
            interfaceC1084f.D();
            TextKt.c(c1260a2, hVarB, j, j10, null, lVar, null, 0L, null, gVar, jM375getLineHeightXSAIIZE, 0, false, 0, 0, mapW, (Ia.l) objF2, null, interfaceC1084f, 0, 262144, 162256);
        }
    }

    /* JADX INFO: compiled from: TextBlock.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BlockType.values().length];
            try {
                iArr[BlockType.UNORDEREDLIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BlockType.ORDEREDLIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @IntercomPreviews
    public static final void HeadingTextBlockPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1066073995);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            final Block blockBuild = new Block.Builder().withType(BlockType.HEADING.getSerializedName()).withText("Heading").build();
            IntercomThemeKt.IntercomTheme(null, null, null, androidx.compose.runtime.internal.a.b(1821427103, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt.HeadingTextBlockPreview.1
                @Override // Ia.p
                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC1084f2, num.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(InterfaceC1084f interfaceC1084f2, int i11) {
                    if ((i11 & 11) == 2 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                    } else {
                        final Block block = blockBuild;
                        SurfaceKt.a(null, null, 0L, 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(1844474362, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt.HeadingTextBlockPreview.1.1
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                                invoke(interfaceC1084f3, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f3, int i12) {
                                if ((i12 & 11) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                    return;
                                }
                                Block block2 = block;
                                kotlin.jvm.internal.i.b(block2);
                                TextBlockKt.TextBlock(null, new BlockRenderData(block2, null, null, null, null, 30, null), null, null, false, null, interfaceC1084f3, 64, 61);
                            }
                        }, interfaceC1084f2), interfaceC1084f2, 12582912, 127);
                    }
                }
            }, c1086gP), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new io.intercom.android.sdk.helpcenter.articles.x(i10, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r HeadingTextBlockPreview$lambda$27(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        HeadingTextBlockPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:49:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:64:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:70:0x0103  */
    /* JADX WARN: Code duplicated, block: B:73:0x0116  */
    /* JADX WARN: Code duplicated, block: B:75:0x0124  */
    /* JADX WARN: Code duplicated, block: B:79:0x0183  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: InlineSourceBadge-FNF3uiM, reason: not valid java name */
    public static final void m398InlineSourceBadgeFNF3uiM(final String str, androidx.compose.ui.h hVar, long j, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.h hVar2;
        long jM648getSourceBackground0d7_KjU;
        int i13;
        androidx.compose.ui.h.a aVar;
        final long j10;
        boolean z10;
        Object objF;
        int i14;
        Ia.a<ComposeUiNode> aVar2;
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar;
        final androidx.compose.ui.h hVar3;
        final long j11;
        C1105p0 c1105p0V;
        int i15;
        C1086g c1086gP = interfaceC1084f.p(234500363);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c1086gP.K(str) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 2;
        if (i16 == 0) {
            if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                hVar2 = hVar;
                i12 |= c1086gP.K(hVar2) ? 32 : 16;
            }
            if ((i10 & 896) == 0) {
                jM648getSourceBackground0d7_KjU = j;
                if ((i11 & 4) == 0 || !c1086gP.i(jM648getSourceBackground0d7_KjU)) {
                    i15 = 128;
                } else {
                    i15 = 256;
                }
                i12 |= i15;
            } else {
                jM648getSourceBackground0d7_KjU = j;
            }
            if ((i12 & 731) == 146 || !c1086gP.s()) {
                c1086gP.r0();
                i13 = i10 & 1;
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i13 != 0 || c1086gP.a0()) {
                    if (i16 != 0) {
                        hVar2 = aVar;
                    }
                    if ((i11 & 4) != 0) {
                        jM648getSourceBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m648getSourceBackground0d7_KjU();
                        i12 &= -897;
                    }
                } else {
                    c1086gP.w();
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                    }
                }
                int i17 = i12;
                j10 = jM648getSourceBackground0d7_KjU;
                c1086gP.U();
                androidx.compose.ui.h hVarI = hVar2.i(W.f10226c);
                c1086gP.L(-1159000328);
                z10 = (((i17 & 896) ^ 384) <= 256 && c1086gP.i(j10)) || (i17 & 384) == 256;
                objF = c1086gP.f();
                if (z10 || objF == InterfaceC1084f.a.f12980a) {
                    objF = new Ia.l() { // from class: io.intercom.android.sdk.survey.block.v
                        @Override // Ia.l
                        public final Object invoke(Object obj) {
                            return TextBlockKt.InlineSourceBadge_FNF3uiM$lambda$7$lambda$6(j10, (J.e) obj);
                        }
                    };
                    c1086gP.E(objF);
                }
                c1086gP.T(false);
                androidx.compose.ui.h hVarA = androidx.compose.ui.draw.f.a(hVarI, (Ia.l) objF);
                E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i14 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
                androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarA);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i14))) {
                    J4.i.d(i14, c1086gP, i14, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
                androidx.compose.ui.h hVarF = C0949i.f10304a.f(aVar, androidx.compose.ui.d.a.f13339e);
                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                int i18 = IntercomTheme.$stable;
                TextKt.b(str, hVarF, intercomTheme.getColors(c1086gP, i18).m645getPrimaryText0d7_KjU(), 0L, null, androidx.compose.ui.text.font.l.f15443h, null, 0L, null, null, 0L, 0, false, 1, 0, null, intercomTheme.getTypography(c1086gP, i18).getType05(), c1086gP, (i17 & 14) | 196608, 3072, 57304);
                c1086gP.T(true);
                hVar3 = hVar2;
                j11 = j10;
            } else {
                c1086gP.w();
                hVar3 = hVar2;
                j11 = jM648getSourceBackground0d7_KjU;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.survey.block.w
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TextBlockKt.InlineSourceBadge_FNF3uiM$lambda$9(str, hVar3, j11, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 48;
        hVar2 = hVar;
        if ((i10 & 896) == 0) {
            jM648getSourceBackground0d7_KjU = j;
            if ((i11 & 4) == 0) {
                i15 = 128;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        } else {
            jM648getSourceBackground0d7_KjU = j;
        }
        if ((i12 & 731) == 146) {
            c1086gP.r0();
            i13 = i10 & 1;
            aVar = androidx.compose.ui.h.a.f13984b;
            if (i13 != 0) {
                if (i16 != 0) {
                    hVar2 = aVar;
                }
                if ((i11 & 4) != 0) {
                    jM648getSourceBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m648getSourceBackground0d7_KjU();
                    i12 &= -897;
                }
            } else {
                if (i16 != 0) {
                    hVar2 = aVar;
                }
                if ((i11 & 4) != 0) {
                    jM648getSourceBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m648getSourceBackground0d7_KjU();
                    i12 &= -897;
                }
            }
            int i19 = i12;
            j10 = jM648getSourceBackground0d7_KjU;
            c1086gP.U();
            androidx.compose.ui.h hVarI2 = hVar2.i(W.f10226c);
            c1086gP.L(-1159000328);
            if (((i19 & 896) ^ 384) <= 256) {
            }
            objF = c1086gP.f();
            if (z10) {
                objF = new Ia.l() { // from class: io.intercom.android.sdk.survey.block.v
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        return TextBlockKt.InlineSourceBadge_FNF3uiM$lambda$7$lambda$6(j10, (J.e) obj);
                    }
                };
                c1086gP.E(objF);
            } else {
                objF = new Ia.l() { // from class: io.intercom.android.sdk.survey.block.v
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        return TextBlockKt.InlineSourceBadge_FNF3uiM$lambda$7$lambda$6(j10, (J.e) obj);
                    }
                };
                c1086gP.E(objF);
            }
            c1086gP.T(false);
            androidx.compose.ui.h hVarA2 = androidx.compose.ui.draw.f.a(hVarI2, (Ia.l) objF);
            E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
            i14 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
            androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVarA2);
            ComposeUiNode.f14331c0.getClass();
            aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD2);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P2);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i14, c1086gP, i14, pVar);
            } else {
                J4.i.d(i14, c1086gP, i14, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC2);
            androidx.compose.ui.h hVarF2 = C0949i.f10304a.f(aVar, androidx.compose.ui.d.a.f13339e);
            IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
            int i110 = IntercomTheme.$stable;
            TextKt.b(str, hVarF2, intercomTheme2.getColors(c1086gP, i110).m645getPrimaryText0d7_KjU(), 0L, null, androidx.compose.ui.text.font.l.f15443h, null, 0L, null, null, 0L, 0, false, 1, 0, null, intercomTheme2.getTypography(c1086gP, i110).getType05(), c1086gP, (i19 & 14) | 196608, 3072, 57304);
            c1086gP.T(true);
            hVar3 = hVar2;
            j11 = j10;
        } else {
            c1086gP.r0();
            i13 = i10 & 1;
            aVar = androidx.compose.ui.h.a.f13984b;
            if (i13 != 0) {
                if (i16 != 0) {
                    hVar2 = aVar;
                }
                if ((i11 & 4) != 0) {
                    jM648getSourceBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m648getSourceBackground0d7_KjU();
                    i12 &= -897;
                }
            } else {
                if (i16 != 0) {
                    hVar2 = aVar;
                }
                if ((i11 & 4) != 0) {
                    jM648getSourceBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m648getSourceBackground0d7_KjU();
                    i12 &= -897;
                }
            }
            int i111 = i12;
            j10 = jM648getSourceBackground0d7_KjU;
            c1086gP.U();
            androidx.compose.ui.h hVarI3 = hVar2.i(W.f10226c);
            c1086gP.L(-1159000328);
            if (((i111 & 896) ^ 384) <= 256) {
            }
            objF = c1086gP.f();
            if (z10) {
                objF = new Ia.l() { // from class: io.intercom.android.sdk.survey.block.v
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        return TextBlockKt.InlineSourceBadge_FNF3uiM$lambda$7$lambda$6(j10, (J.e) obj);
                    }
                };
                c1086gP.E(objF);
            } else {
                objF = new Ia.l() { // from class: io.intercom.android.sdk.survey.block.v
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        return TextBlockKt.InlineSourceBadge_FNF3uiM$lambda$7$lambda$6(j10, (J.e) obj);
                    }
                };
                c1086gP.E(objF);
            }
            c1086gP.T(false);
            androidx.compose.ui.h hVarA3 = androidx.compose.ui.draw.f.a(hVarI3, (Ia.l) objF);
            E eD3 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
            i14 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
            androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, hVarA3);
            ComposeUiNode.f14331c0.getClass();
            aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD3);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P3);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i14, c1086gP, i14, pVar);
            } else {
                J4.i.d(i14, c1086gP, i14, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC3);
            androidx.compose.ui.h hVarF3 = C0949i.f10304a.f(aVar, androidx.compose.ui.d.a.f13339e);
            IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
            int i112 = IntercomTheme.$stable;
            TextKt.b(str, hVarF3, intercomTheme3.getColors(c1086gP, i112).m645getPrimaryText0d7_KjU(), 0L, null, androidx.compose.ui.text.font.l.f15443h, null, 0L, null, null, 0L, 0, false, 1, 0, null, intercomTheme3.getTypography(c1086gP, i112).getType05(), c1086gP, (i111 & 14) | 196608, 3072, 57304);
            c1086gP.T(true);
            hVar3 = hVar2;
            j11 = j10;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.survey.block.w
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TextBlockKt.InlineSourceBadge_FNF3uiM$lambda$9(str, hVar3, j11, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r InlineSourceBadge_FNF3uiM$lambda$7$lambda$6(long j, J.e drawBehind) {
        kotlin.jvm.internal.i.e(drawBehind, "$this$drawBehind");
        drawBehind.S(j, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 2) != 0 ? I.h.c(drawBehind.j()) / 2.0f : 0.0f, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 4) != 0 ? drawBehind.j1() : 0L, 1.0f, J.h.f3954a, null, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 64) != 0 ? 3 : 0);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r InlineSourceBadge_FNF3uiM$lambda$9(String index, androidx.compose.ui.h hVar, long j, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(index, "$index");
        m398InlineSourceBadgeFNF3uiM(index, hVar, j, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void InlineSourcesTextBlockPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1209811272);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            final Block blockBuild = new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withText(textWithSources).build();
            IntercomThemeKt.IntercomTheme(null, null, null, androidx.compose.runtime.internal.a.b(2099084386, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt.InlineSourcesTextBlockPreview.1
                @Override // Ia.p
                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC1084f2, num.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(InterfaceC1084f interfaceC1084f2, int i11) {
                    if ((i11 & 11) == 2 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                    } else {
                        final Block block = blockBuild;
                        SurfaceKt.a(null, null, 0L, 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(954415229, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt.InlineSourcesTextBlockPreview.1.1
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                                invoke(interfaceC1084f3, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f3, int i12) {
                                if ((i12 & 11) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                    return;
                                }
                                Block block2 = block;
                                kotlin.jvm.internal.i.b(block2);
                                TextBlockKt.TextBlock(null, new BlockRenderData(block2, null, null, null, null, 30, null), null, null, true, null, interfaceC1084f3, 24640, 45);
                            }
                        }, interfaceC1084f2), interfaceC1084f2, 12582912, 127);
                    }
                }
            }, c1086gP), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new O(i10, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r InlineSourcesTextBlockPreview$lambda$32(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        InlineSourcesTextBlockPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void OrderedListTextBlockPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(627599340);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            final Block blockBuild = new Block.Builder().withType(BlockType.ORDEREDLIST.getSerializedName()).withItems(items).build();
            IntercomThemeKt.IntercomTheme(null, null, null, androidx.compose.runtime.internal.a.b(644450326, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt.OrderedListTextBlockPreview.1
                @Override // Ia.p
                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC1084f2, num.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(InterfaceC1084f interfaceC1084f2, int i11) {
                    if ((i11 & 11) == 2 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                    } else {
                        final Block block = blockBuild;
                        SurfaceKt.a(null, null, 0L, 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-585789711, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt.OrderedListTextBlockPreview.1.1
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                                invoke(interfaceC1084f3, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f3, int i12) {
                                if ((i12 & 11) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                    return;
                                }
                                Block block2 = block;
                                kotlin.jvm.internal.i.b(block2);
                                TextBlockKt.TextBlock(null, new BlockRenderData(block2, null, null, null, null, 30, null), null, null, false, null, interfaceC1084f3, 64, 61);
                            }
                        }, interfaceC1084f2), interfaceC1084f2, 12582912, 127);
                    }
                }
            }, c1086gP), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new U(i10, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r OrderedListTextBlockPreview$lambda$30(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        OrderedListTextBlockPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void SubheadingTextBlockPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1598324377);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            final Block blockBuild = new Block.Builder().withType(BlockType.SUBHEADING.getSerializedName()).withText("Subheading").build();
            IntercomThemeKt.IntercomTheme(null, null, null, androidx.compose.runtime.internal.a.b(-756436689, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt.SubheadingTextBlockPreview.1
                @Override // Ia.p
                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC1084f2, num.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(InterfaceC1084f interfaceC1084f2, int i11) {
                    if ((i11 & 11) == 2 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                    } else {
                        final Block block = blockBuild;
                        SurfaceKt.a(null, null, 0L, 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1350311180, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt.SubheadingTextBlockPreview.1.1
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                                invoke(interfaceC1084f3, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f3, int i12) {
                                if ((i12 & 11) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                    return;
                                }
                                Block block2 = block;
                                kotlin.jvm.internal.i.b(block2);
                                TextBlockKt.TextBlock(null, new BlockRenderData(block2, null, null, null, null, 30, null), null, null, false, null, interfaceC1084f3, 64, 61);
                            }
                        }, interfaceC1084f2), interfaceC1084f2, 12582912, 127);
                    }
                }
            }, c1086gP), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new z0(i10, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r SubheadingTextBlockPreview$lambda$28(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        SubheadingTextBlockPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    public static final void TextBlock(androidx.compose.ui.h hVar, final BlockRenderData blockRenderData, SuffixText suffixText, Ia.l<? super B, p293xa.r> lVar, boolean z10, Ia.l<? super List<InlineSource>, p293xa.r> lVar2, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        C1260a c1260aI;
        int i12 = 8;
        kotlin.jvm.internal.i.e(blockRenderData, "blockRenderData");
        C1086g c1086gP = interfaceC1084f.p(-295791429);
        androidx.compose.ui.h hVar2 = (i11 & 1) != 0 ? androidx.compose.ui.h.a.f13984b : hVar;
        SuffixText no_suffix = (i11 & 4) != 0 ? SuffixText.Companion.getNO_SUFFIX() : suffixText;
        Ia.l<? super B, p293xa.r> kVar = (i11 & 8) != 0 ? new p011ab.k(7) : lVar;
        boolean z11 = (i11 & 16) != 0 ? false : z10;
        Ia.l<? super List<InlineSource>, p293xa.r> yVar = (i11 & 32) != 0 ? new androidx.navigation.compose.y(i12) : lVar2;
        Block block = blockRenderData.getBlock();
        BlockRenderTextStyle textStyle = blockRenderData.getTextStyle();
        int i13 = i10 >> 6;
        Pair<C1260a, Set<InlineSource>> pairTextToRender = textToRender(block, textStyle, z11, yVar, c1086gP, 8 | (i13 & 896) | (i13 & 7168));
        C1260a c1260aA = pairTextToRender.a();
        Set<InlineSource> setB = pairTextToRender.b();
        if (kotlin.jvm.internal.i.a(no_suffix, SuffixText.Companion.getNO_SUFFIX())) {
            c1260aI = c1260aA;
        } else {
            C1260a.b bVar = new C1260a.b();
            bVar.b(c1260aA);
            int iH = bVar.h(new androidx.compose.ui.text.v(no_suffix.m397getColor0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
            try {
                bVar.c(no_suffix.getText());
                p293xa.r rVar = p293xa.r.f47939a;
                bVar.e(iH);
                c1260aI = bVar.i();
            } catch (Throwable th) {
                bVar.e(iH);
                throw th;
            }
        }
        c1086gP.L(1265159187);
        Object objF = c1086gP.f();
        if (objF == InterfaceC1084f.a.f12980a) {
            objF = J0.f(null);
            c1086gP.E(objF);
        }
        c1086gP.T(false);
        final SuffixText suffixText2 = no_suffix;
        SelectionContainerKt.a(androidx.compose.runtime.internal.a.b(-1368971764, new AnonymousClass3(textStyle, blockRenderData, block, hVar2, c1260aA, no_suffix, setB, c1260aI, kVar, (X) objF), c1086gP), c1086gP, 6);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final androidx.compose.ui.h hVar3 = hVar2;
            final Ia.l<? super B, p293xa.r> lVar3 = kVar;
            final boolean z12 = z11;
            final Ia.l<? super List<InlineSource>, p293xa.r> lVar4 = yVar;
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.survey.block.x
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TextBlockKt.TextBlock$lambda$5(hVar3, blockRenderData, suffixText2, lVar3, z12, lVar4, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TextBlock$lambda$0(B it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TextBlock$lambda$1(List it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TextBlock$lambda$5(androidx.compose.ui.h hVar, BlockRenderData blockRenderData, SuffixText suffixText, Ia.l lVar, boolean z10, Ia.l lVar2, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(blockRenderData, "$blockRenderData");
        TextBlock(hVar, blockRenderData, suffixText, lVar, z10, lVar2, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void TextBlockAlignmentPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1235422502);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextBlockKt.INSTANCE.m388getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2269a0(i10, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TextBlockAlignmentPreview$lambda$26(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        TextBlockAlignmentPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void TextBlockPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(443046075);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            final Block blockBuild = new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withText(formattedText).build();
            IntercomThemeKt.IntercomTheme(null, null, null, androidx.compose.runtime.internal.a.b(-140923183, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt.TextBlockPreview.1
                @Override // Ia.p
                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC1084f2, num.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(InterfaceC1084f interfaceC1084f2, int i11) {
                    if ((i11 & 11) == 2 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                    } else {
                        final Block block = blockBuild;
                        SurfaceKt.a(null, null, 0L, 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(30237398, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt.TextBlockPreview.1.1
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                                invoke(interfaceC1084f3, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f3, int i12) {
                                if ((i12 & 11) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                    return;
                                }
                                Block block2 = block;
                                kotlin.jvm.internal.i.b(block2);
                                BlockRenderTextStyle paragraphDefault = BlockRenderTextStyle.Companion.getParagraphDefault();
                                int i13 = H.f13505m;
                                TextBlockKt.TextBlock(null, new BlockRenderData(block2, null, null, null, paragraphDefault.m373copyZsBm6Y((47 & 1) != 0 ? paragraphDefault.fontSize : 0L, (47 & 2) != 0 ? paragraphDefault.fontWeight : null, (47 & 4) != 0 ? paragraphDefault.lineHeight : 0L, (47 & 8) != 0 ? paragraphDefault.textColor : null, (47 & 16) != 0 ? paragraphDefault.linkTextColor : new H(H.f13502i), (47 & 32) != 0 ? paragraphDefault.textAlign : null), 14, null), null, null, false, null, interfaceC1084f3, 64, 61);
                            }
                        }, interfaceC1084f2), interfaceC1084f2, 12582912, 127);
                    }
                }
            }, c1086gP), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new A0(i10, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TextBlockPreview$lambda$25(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        TextBlockPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void TextBlockWithSuffixPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-979323118);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            final Block blockBuild = new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withText("Paragraph with suffix").build();
            IntercomThemeKt.IntercomTheme(null, null, null, androidx.compose.runtime.internal.a.b(960883112, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt.TextBlockWithSuffixPreview.1
                @Override // Ia.p
                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC1084f2, num.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(InterfaceC1084f interfaceC1084f2, int i11) {
                    if ((i11 & 11) == 2 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                    } else {
                        final Block block = blockBuild;
                        SurfaceKt.a(null, null, 0L, 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(367008621, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt.TextBlockWithSuffixPreview.1.1
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                                invoke(interfaceC1084f3, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f3, int i12) {
                                if ((i12 & 11) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                    return;
                                }
                                Block block2 = block;
                                kotlin.jvm.internal.i.b(block2);
                                BlockRenderData blockRenderData = new BlockRenderData(block2, null, null, null, null, 30, null);
                                int i13 = H.f13505m;
                                TextBlockKt.TextBlock(null, blockRenderData, new SuffixText("*", "", H.f13500g, null), null, false, null, interfaceC1084f3, 64, 57);
                            }
                        }, interfaceC1084f2), interfaceC1084f2, 12582912, 127);
                    }
                }
            }, c1086gP), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new E0(i10, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TextBlockWithSuffixPreview$lambda$29(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        TextBlockWithSuffixPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void UnorderedListTextBlockPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-321451131);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            final Block blockBuild = new Block.Builder().withType(BlockType.UNORDEREDLIST.getSerializedName()).withItems(items).build();
            IntercomThemeKt.IntercomTheme(null, null, null, androidx.compose.runtime.internal.a.b(-1307522769, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt.UnorderedListTextBlockPreview.1
                @Override // Ia.p
                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC1084f2, num.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(InterfaceC1084f interfaceC1084f2, int i11) {
                    if ((i11 & 11) == 2 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                    } else {
                        final Block block = blockBuild;
                        SurfaceKt.a(null, null, 0L, 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(1842775370, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.survey.block.TextBlockKt.UnorderedListTextBlockPreview.1.1
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                                invoke(interfaceC1084f3, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f3, int i12) {
                                if ((i12 & 11) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                    return;
                                }
                                Block block2 = block;
                                kotlin.jvm.internal.i.b(block2);
                                TextBlockKt.TextBlock(null, new BlockRenderData(block2, null, null, null, null, 30, null), null, null, false, null, interfaceC1084f3, 64, 61);
                            }
                        }, interfaceC1084f2), interfaceC1084f2, 12582912, 127);
                    }
                }
            }, c1086gP), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2271b0(i10, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r UnorderedListTextBlockPreview$lambda$31(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        UnorderedListTextBlockPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void appendInlineSources(C1260a.b bVar, C1260a c1260a, Set<InlineSource> set, Ia.l<? super List<InlineSource>, p293xa.r> lVar) {
        int iF = bVar.f(new AbstractC1266g.a("inline_source", null, new D7.m(lVar, set)));
        try {
            bVar.b(c1260a);
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                C0996e.a(bVar, ((InlineSource) it.next()).getDataEntityId());
            }
            p293xa.r rVar = p293xa.r.f47939a;
        } finally {
            bVar.e(iF);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void appendInlineSources$lambda$11(Ia.l onInlineSourcesClick, Set sources, AbstractC1266g it) {
        kotlin.jvm.internal.i.e(onInlineSourcesClick, "$onInlineSourcesClick");
        kotlin.jvm.internal.i.e(sources, "$sources");
        kotlin.jvm.internal.i.e(it, "it");
        onInlineSourcesClick.invoke(kotlin.collections.q.o0(sources));
    }

    private static final Pair<Set<InlineSource>, String> extractInlineSources(String str) {
        List<String> listH = new Regex("((?=<a)|(?<=</a>))").h(str, 0);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listH) {
            String str2 = (String) obj;
            if (kotlin.text.n.J(str2, "<a", false) && kotlin.text.n.J(str2, "</a>", false) && kotlin.text.n.J(str2, "inline-citation", false)) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List<String> list = (List) pair.a();
        List list2 = (List) pair.b();
        ArrayList arrayList3 = new ArrayList();
        for (String str3 : list) {
            String strFindAttribute = findAttribute(str3, "href");
            String strFindAttribute2 = findAttribute(str3, "data-entity-id");
            String strFindAttribute3 = findAttribute(str3, "data-source-index");
            InlineSource inlineSource = (strFindAttribute == null || strFindAttribute.length() == 0 || strFindAttribute2 == null || strFindAttribute2.length() == 0 || strFindAttribute3 == null || strFindAttribute3.length() == 0) ? null : new InlineSource(strFindAttribute2, findAttribute(str3, "data-entity-type"), strFindAttribute3, strFindAttribute, findAttribute(str3, "title"));
            if (inlineSource != null) {
                arrayList3.add(inlineSource);
            }
        }
        return new Pair<>(kotlin.collections.q.s0(arrayList3), kotlin.collections.q.U(list2, "", null, null, null, 62));
    }

    private static final String findAttribute(String str, String str2) {
        Pattern patternCompile = Pattern.compile(str2 + "=\".*?\"", 0);
        kotlin.jvm.internal.i.d(patternCompile, "compile(...)");
        Matcher matcher = patternCompile.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        String strGroup = matcher.group();
        kotlin.jvm.internal.i.d(strGroup, "group(...)");
        return kotlin.text.n.n0(kotlin.text.n.k0(strGroup, "\""), "\"");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0103  */
    /* JADX WARN: Code duplicated, block: B:29:0x012b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0146  */
    /* JADX WARN: Code duplicated, block: B:32:0x014b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0151  */
    /* JADX WARN: Code duplicated, block: B:38:0x0199  */
    /* JADX WARN: Code duplicated, block: B:40:0x019d  */
    /* JADX WARN: Code duplicated, block: B:41:0x01a6  */
    public static final Pair<C1260a, Set<InlineSource>> textListToRender(List<String> items2, boolean z10, BlockRenderTextStyle blockRenderTextStyle, Ia.l<? super List<InlineSource>, p293xa.r> lVar, InterfaceC1084f interfaceC1084f, int i10) {
        androidx.compose.ui.text.A a10;
        B b10;
        MultiParagraphIntrinsics multiParagraphIntrinsics;
        int iJ;
        int iD;
        B b11;
        C0893v<C1264e, B> c0893v;
        B bC;
        kotlin.jvm.internal.i.e(items2, "items");
        kotlin.jvm.internal.i.e(blockRenderTextStyle, "blockRenderTextStyle");
        interfaceC1084f.L(239669781);
        F textStyle$intercom_sdk_base_release = blockRenderTextStyle.toTextStyle$intercom_sdk_base_release();
        androidx.compose.ui.text.font.d.a aVar = (androidx.compose.ui.text.font.d.a) interfaceC1084f.x(CompositionLocalsKt.f14849k);
        O0 o10 = CompositionLocalsKt.f14847h;
        p013b0.c cVar = (p013b0.c) interfaceC1084f.x(o10);
        LayoutDirection layoutDirection = (LayoutDirection) interfaceC1084f.x(CompositionLocalsKt.f14852n);
        boolean zK = interfaceC1084f.K(aVar) | interfaceC1084f.K(cVar) | interfaceC1084f.K(layoutDirection) | interfaceC1084f.h(8);
        Object objF = interfaceC1084f.f();
        Object obj = InterfaceC1084f.a.f12980a;
        if (zK || objF == obj) {
            objF = new D(aVar, cVar, layoutDirection, 8);
            interfaceC1084f.E(objF);
        }
        D d10 = (D) objF;
        interfaceC1084f.L(1608522809);
        boolean zK2 = interfaceC1084f.K(textStyle$intercom_sdk_base_release) | interfaceC1084f.K(d10);
        Object objF2 = interfaceC1084f.f();
        if (zK2 || objF2 == obj) {
            String strTextListToRender$bullet = textListToRender$bullet(z10, items2.size());
            long jB = p013b0.b.b(0, 0, 15);
            LayoutDirection layoutDirection2 = d10.f15312c;
            C1260a c1260a = new C1260a(strTextListToRender$bullet);
            EmptyList emptyList = EmptyList.f42983b;
            p013b0.c cVar2 = d10.f15311b;
            androidx.compose.ui.text.font.d.a aVar2 = d10.f15310a;
            androidx.compose.ui.text.A a11 = new androidx.compose.ui.text.A(c1260a, textStyle$intercom_sdk_base_release, emptyList, BrazeLogger.SUPPRESS, true, 1, cVar2, layoutDirection2, aVar2, jB);
            androidx.compose.ui.text.z zVar = d10.f15313d;
            if (zVar != null) {
                a10 = a11;
                C1264e c1264e = new C1264e(a10);
                C0893v<C1264e, B> c0893v2 = zVar.f15712a;
                if (c0893v2 != null) {
                    bC = c0893v2.c(c1264e);
                } else {
                    if (kotlin.jvm.internal.i.a(zVar.f15713b, c1264e)) {
                        bC = zVar.f15714c;
                    }
                    if (b10 != null) {
                        C1268i c1268i = b10.f15301b;
                        b11 = new B(a10, c1268i, p013b0.b.d(jB, (((long) ((int) Math.ceil(c1268i.f15474e))) & 4294967295L) | (((long) ((int) Math.ceil(c1268i.f15473d))) << 32)));
                    } else {
                        multiParagraphIntrinsics = new MultiParagraphIntrinsics(c1260a, G.b(textStyle$intercom_sdk_base_release, layoutDirection2), emptyList, cVar2, aVar2);
                        iJ = p013b0.a.j(jB);
                        if (p013b0.a.d(jB)) {
                            iD = p013b0.a.h(jB);
                        } else {
                            iD = BrazeLogger.SUPPRESS;
                        }
                        if (iJ != iD) {
                            iD = Na.l.D((int) Math.ceil(multiParagraphIntrinsics.c()), iJ, iD);
                        }
                        C1268i c1268i2 = new C1268i(multiParagraphIntrinsics, p013b0.a.C0206a.b(0, iD, 0, p013b0.a.g(jB)), BrazeLogger.SUPPRESS, 1);
                        b11 = new B(a10, c1268i2, p013b0.b.d(jB, (((long) ((int) Math.ceil(c1268i2.f15474e))) & 4294967295L) | (((long) ((int) Math.ceil(c1268i2.f15473d))) << 32)));
                        if (zVar != null) {
                            c0893v = zVar.f15712a;
                            if (c0893v != null) {
                                c0893v.d(new C1264e(a10), b11);
                            } else {
                                zVar.f15713b = new C1264e(a10);
                                zVar.f15714c = b11;
                            }
                        }
                    }
                    objF2 = new p013b0.l(b11.f15302c);
                    interfaceC1084f.E(objF2);
                }
                b10 = bC;
                if (b10 == null || b10.f15301b.f15470a.a()) {
                }
                if (b10 != null) {
                    C1268i c1268i3 = b10.f15301b;
                    b11 = new B(a10, c1268i3, p013b0.b.d(jB, (((long) ((int) Math.ceil(c1268i3.f15474e))) & 4294967295L) | (((long) ((int) Math.ceil(c1268i3.f15473d))) << 32)));
                } else {
                    multiParagraphIntrinsics = new MultiParagraphIntrinsics(c1260a, G.b(textStyle$intercom_sdk_base_release, layoutDirection2), emptyList, cVar2, aVar2);
                    iJ = p013b0.a.j(jB);
                    if (p013b0.a.d(jB)) {
                        iD = p013b0.a.h(jB);
                    } else {
                        iD = BrazeLogger.SUPPRESS;
                    }
                    if (iJ != iD) {
                        iD = Na.l.D((int) Math.ceil(multiParagraphIntrinsics.c()), iJ, iD);
                    }
                    C1268i c1268i4 = new C1268i(multiParagraphIntrinsics, p013b0.a.C0206a.b(0, iD, 0, p013b0.a.g(jB)), BrazeLogger.SUPPRESS, 1);
                    b11 = new B(a10, c1268i4, p013b0.b.d(jB, (((long) ((int) Math.ceil(c1268i4.f15474e))) & 4294967295L) | (((long) ((int) Math.ceil(c1268i4.f15473d))) << 32)));
                    if (zVar != null) {
                        c0893v = zVar.f15712a;
                        if (c0893v != null) {
                            c0893v.d(new C1264e(a10), b11);
                        } else {
                            zVar.f15713b = new C1264e(a10);
                            zVar.f15714c = b11;
                        }
                    }
                }
                objF2 = new p013b0.l(b11.f15302c);
                interfaceC1084f.E(objF2);
            } else {
                a10 = a11;
            }
            b10 = null;
            if (b10 != null) {
                C1268i c1268i5 = b10.f15301b;
                b11 = new B(a10, c1268i5, p013b0.b.d(jB, (((long) ((int) Math.ceil(c1268i5.f15474e))) & 4294967295L) | (((long) ((int) Math.ceil(c1268i5.f15473d))) << 32)));
            } else {
                multiParagraphIntrinsics = new MultiParagraphIntrinsics(c1260a, G.b(textStyle$intercom_sdk_base_release, layoutDirection2), emptyList, cVar2, aVar2);
                iJ = p013b0.a.j(jB);
                if (p013b0.a.d(jB)) {
                    iD = p013b0.a.h(jB);
                } else {
                    iD = BrazeLogger.SUPPRESS;
                }
                if (iJ != iD) {
                    iD = Na.l.D((int) Math.ceil(multiParagraphIntrinsics.c()), iJ, iD);
                }
                C1268i c1268i6 = new C1268i(multiParagraphIntrinsics, p013b0.a.C0206a.b(0, iD, 0, p013b0.a.g(jB)), BrazeLogger.SUPPRESS, 1);
                b11 = new B(a10, c1268i6, p013b0.b.d(jB, (((long) ((int) Math.ceil(c1268i6.f15474e))) & 4294967295L) | (((long) ((int) Math.ceil(c1268i6.f15473d))) << 32)));
                if (zVar != null) {
                    c0893v = zVar.f15712a;
                    if (c0893v != null) {
                        c0893v.d(new C1264e(a10), b11);
                    } else {
                        zVar.f15713b = new C1264e(a10);
                        zVar.f15714c = b11;
                    }
                }
            }
            objF2 = new p013b0.l(b11.f15302c);
            interfaceC1084f.E(objF2);
        }
        long j = ((p013b0.l) objF2).f20490a;
        interfaceC1084f.D();
        androidx.compose.ui.text.n nVar = new androidx.compose.ui.text.n(((p013b0.c) interfaceC1084f.x(o10)).w0((int) (j & 4294967295L)), new androidx.compose.ui.text.style.k(1, ((p013b0.c) interfaceC1084f.x(o10)).w0((int) (j >> 32))), 499);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C1260a.b bVar = new C1260a.b();
        List<String> list = items2;
        ArrayList arrayList = new ArrayList(kotlin.collections.m.y(list, 10));
        for (String str : list) {
            Pair<Set<InlineSource>, String> pairExtractInlineSources = lVar != null ? extractInlineSources(str) : new Pair<>(EmptySet.f42985b, str);
            Set<InlineSource> setA = pairExtractInlineSources.a();
            String strB = pairExtractInlineSources.b();
            linkedHashSet.addAll(setA);
            Spanned spannedA = p307z0.b.a(strB, 0);
            kotlin.jvm.internal.i.d(spannedA, "fromHtml(...)");
            Context context = (Context) interfaceC1084f.x(AndroidCompositionLocals_androidKt.f14793b);
            androidx.compose.ui.text.style.h hVar = androidx.compose.ui.text.style.h.f15671c;
            H hM376getLinkTextColorQN2ZGVo = blockRenderTextStyle.m376getLinkTextColorQN2ZGVo();
            arrayList.add(new Pair(BlockExtensionsKt.toAnnotatedString(spannedA, context, new androidx.compose.ui.text.v(hM376getLinkTextColorQN2ZGVo != null ? hM376getLinkTextColorQN2ZGVo.f13506a : H.f13504l, 0L, null, null, null, null, null, 0L, null, null, null, 0L, hVar, null, 61438)), setA));
        }
        int i11 = 0;
        for (Object obj2 : arrayList) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                kotlin.collections.l.x();
                throw null;
            }
            Pair pair = (Pair) obj2;
            C1260a c1260a2 = (C1260a) pair.a();
            Set set = (Set) pair.b();
            int iG = bVar.g(nVar);
            try {
                bVar.c(textListToRender$bullet(z10, i12));
                int length = String.valueOf(items2.size()).length();
                if (length > 1) {
                    Na.h it = Na.l.J(0, length - String.valueOf(i12).length()).iterator();
                    while (it.f4692d) {
                        it.a();
                        bVar.c("\t");
                    }
                }
                if (lVar == null || set.isEmpty()) {
                    bVar.b(c1260a2);
                } else {
                    appendInlineSources(bVar, c1260a2, set, lVar);
                }
                p293xa.r rVar = p293xa.r.f47939a;
                bVar.e(iG);
                if (i11 < kotlin.collections.l.r(items2)) {
                    int iG2 = bVar.g(new androidx.compose.ui.text.n(G0.a.g(0), null, 507));
                    try {
                        bVar.append('\n');
                        bVar.e(iG2);
                    } catch (Throwable th) {
                        bVar.e(iG2);
                        throw th;
                    }
                }
                i11 = i12;
            } catch (Throwable th2) {
                bVar.e(iG);
                throw th2;
            }
        }
        Pair<C1260a, Set<InlineSource>> pair2 = new Pair<>(bVar.i(), linkedHashSet);
        interfaceC1084f.D();
        return pair2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String textListToRender$bullet(boolean z10, int i10) {
        if (!z10) {
            return "•\t\t";
        }
        return i10 + ".\t\t";
    }

    private static final Pair<C1260a, Set<InlineSource>> textToRender(Block block, BlockRenderTextStyle blockRenderTextStyle, boolean z10, Ia.l<? super List<InlineSource>, p293xa.r> lVar, InterfaceC1084f interfaceC1084f, int i10) {
        Pair<C1260a, Set<InlineSource>> pairTextListToRender;
        Pair<Set<InlineSource>, String> pair;
        interfaceC1084f.L(1340770584);
        BlockType type = block.getType();
        int i11 = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i11 == 1) {
            interfaceC1084f.L(-1598782922);
            List<String> items2 = block.getItems();
            kotlin.jvm.internal.i.d(items2, "getItems(...)");
            pairTextListToRender = textListToRender(items2, false, blockRenderTextStyle, lVar, interfaceC1084f, ((i10 << 3) & 896) | 56 | (i10 & 7168));
            interfaceC1084f.D();
        } else if (i11 != 2) {
            interfaceC1084f.L(1977764865);
            if (z10) {
                String text = block.getText();
                kotlin.jvm.internal.i.d(text, "getText(...)");
                pair = extractInlineSources(text);
            } else {
                pair = new Pair<>(EmptySet.f42985b, block.getText());
            }
            Set<InlineSource> setA = pair.a();
            String strB = pair.b();
            C1260a.b bVar = new C1260a.b();
            Spanned spannedA = p307z0.b.a(strB, 0);
            kotlin.jvm.internal.i.d(spannedA, "fromHtml(...)");
            Context context = (Context) interfaceC1084f.x(AndroidCompositionLocals_androidKt.f14793b);
            androidx.compose.ui.text.style.h hVar = androidx.compose.ui.text.style.h.f15671c;
            H hM376getLinkTextColorQN2ZGVo = blockRenderTextStyle.m376getLinkTextColorQN2ZGVo();
            C1260a annotatedString = BlockExtensionsKt.toAnnotatedString(spannedA, context, new androidx.compose.ui.text.v(hM376getLinkTextColorQN2ZGVo != null ? hM376getLinkTextColorQN2ZGVo.f13506a : H.f13504l, 0L, null, null, null, null, null, 0L, null, null, null, 0L, hVar, null, 61438));
            if (!z10 || setA.isEmpty()) {
                bVar.b(annotatedString);
            } else {
                appendInlineSources(bVar, annotatedString, setA, lVar);
            }
            pairTextListToRender = new Pair<>(bVar.i(), setA);
            interfaceC1084f.D();
        } else {
            interfaceC1084f.L(-1598776075);
            List<String> items3 = block.getItems();
            kotlin.jvm.internal.i.d(items3, "getItems(...)");
            pairTextListToRender = textListToRender(items3, true, blockRenderTextStyle, lVar, interfaceC1084f, ((i10 << 3) & 896) | 56 | (i10 & 7168));
            interfaceC1084f.D();
        }
        interfaceC1084f.D();
        return pairTextListToRender;
    }
}
