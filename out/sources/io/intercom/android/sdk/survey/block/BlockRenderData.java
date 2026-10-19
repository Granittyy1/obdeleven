package io.intercom.android.sdk.survey.block;

import androidx.compose.ui.graphics.H;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;

/* JADX INFO: compiled from: BlockRenderData.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class BlockRenderData {
    public static final int $stable = 8;
    private final Block block;
    private final BlockRenderTextStyle headingTextStyle;
    private final BlockRenderTextStyle paragraphTextStyle;
    private final BlockRenderTextStyle subHeadingTextStyle;
    private final H textColor;

    /* JADX INFO: compiled from: BlockRenderData.kt */
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
            try {
                iArr[BlockType.PARAGRAPH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ BlockRenderData(Block block, H h8, BlockRenderTextStyle blockRenderTextStyle, BlockRenderTextStyle blockRenderTextStyle2, BlockRenderTextStyle blockRenderTextStyle3, kotlin.jvm.internal.e eVar) {
        this(block, h8, blockRenderTextStyle, blockRenderTextStyle2, blockRenderTextStyle3);
    }

    /* JADX INFO: renamed from: copy-ZLcQsz0$default, reason: not valid java name */
    public static /* synthetic */ BlockRenderData m363copyZLcQsz0$default(BlockRenderData blockRenderData, Block block, H h8, BlockRenderTextStyle blockRenderTextStyle, BlockRenderTextStyle blockRenderTextStyle2, BlockRenderTextStyle blockRenderTextStyle3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            block = blockRenderData.block;
        }
        if ((i10 & 2) != 0) {
            h8 = blockRenderData.textColor;
        }
        H h10 = h8;
        if ((i10 & 4) != 0) {
            blockRenderTextStyle = blockRenderData.headingTextStyle;
        }
        BlockRenderTextStyle blockRenderTextStyle4 = blockRenderTextStyle;
        if ((i10 & 8) != 0) {
            blockRenderTextStyle2 = blockRenderData.subHeadingTextStyle;
        }
        BlockRenderTextStyle blockRenderTextStyle5 = blockRenderTextStyle2;
        if ((i10 & 16) != 0) {
            blockRenderTextStyle3 = blockRenderData.paragraphTextStyle;
        }
        return blockRenderData.m365copyZLcQsz0(block, h10, blockRenderTextStyle4, blockRenderTextStyle5, blockRenderTextStyle3);
    }

    public final Block component1() {
        return this.block;
    }

    /* JADX INFO: renamed from: component2-QN2ZGVo, reason: not valid java name */
    public final H m364component2QN2ZGVo() {
        return this.textColor;
    }

    public final BlockRenderTextStyle component3() {
        return this.headingTextStyle;
    }

    public final BlockRenderTextStyle component4() {
        return this.subHeadingTextStyle;
    }

    public final BlockRenderTextStyle component5() {
        return this.paragraphTextStyle;
    }

    /* JADX INFO: renamed from: copy-ZLcQsz0, reason: not valid java name */
    public final BlockRenderData m365copyZLcQsz0(Block block, H h8, BlockRenderTextStyle headingTextStyle, BlockRenderTextStyle subHeadingTextStyle, BlockRenderTextStyle paragraphTextStyle) {
        kotlin.jvm.internal.i.e(block, "block");
        kotlin.jvm.internal.i.e(headingTextStyle, "headingTextStyle");
        kotlin.jvm.internal.i.e(subHeadingTextStyle, "subHeadingTextStyle");
        kotlin.jvm.internal.i.e(paragraphTextStyle, "paragraphTextStyle");
        return new BlockRenderData(block, h8, headingTextStyle, subHeadingTextStyle, paragraphTextStyle, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlockRenderData)) {
            return false;
        }
        BlockRenderData blockRenderData = (BlockRenderData) obj;
        return kotlin.jvm.internal.i.a(this.block, blockRenderData.block) && kotlin.jvm.internal.i.a(this.textColor, blockRenderData.textColor) && kotlin.jvm.internal.i.a(this.headingTextStyle, blockRenderData.headingTextStyle) && kotlin.jvm.internal.i.a(this.subHeadingTextStyle, blockRenderData.subHeadingTextStyle) && kotlin.jvm.internal.i.a(this.paragraphTextStyle, blockRenderData.paragraphTextStyle);
    }

    public final Block getBlock() {
        return this.block;
    }

    public final BlockRenderTextStyle getHeadingTextStyle() {
        return this.headingTextStyle;
    }

    public final BlockRenderTextStyle getParagraphTextStyle() {
        return this.paragraphTextStyle;
    }

    public final BlockRenderTextStyle getSubHeadingTextStyle() {
        return this.subHeadingTextStyle;
    }

    /* JADX INFO: renamed from: getTextColor-QN2ZGVo, reason: not valid java name */
    public final H m366getTextColorQN2ZGVo() {
        return this.textColor;
    }

    public final BlockRenderTextStyle getTextStyle() {
        BlockType type = this.block.getType();
        int i10 = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i10 == 1) {
            return this.headingTextStyle;
        }
        if (i10 != 2) {
            return i10 != 3 ? BlockRenderTextStyle.Companion.getParagraphDefault() : this.paragraphTextStyle;
        }
        return this.subHeadingTextStyle;
    }

    public int hashCode() {
        int iHashCode = this.block.hashCode() * 31;
        H h8 = this.textColor;
        return this.paragraphTextStyle.hashCode() + ((this.subHeadingTextStyle.hashCode() + ((this.headingTextStyle.hashCode() + ((iHashCode + (h8 == null ? 0 : Long.hashCode(h8.f13506a))) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "BlockRenderData(block=" + this.block + ", textColor=" + this.textColor + ", headingTextStyle=" + this.headingTextStyle + ", subHeadingTextStyle=" + this.subHeadingTextStyle + ", paragraphTextStyle=" + this.paragraphTextStyle + ')';
    }

    private BlockRenderData(Block block, H h8, BlockRenderTextStyle headingTextStyle, BlockRenderTextStyle subHeadingTextStyle, BlockRenderTextStyle paragraphTextStyle) {
        kotlin.jvm.internal.i.e(block, "block");
        kotlin.jvm.internal.i.e(headingTextStyle, "headingTextStyle");
        kotlin.jvm.internal.i.e(subHeadingTextStyle, "subHeadingTextStyle");
        kotlin.jvm.internal.i.e(paragraphTextStyle, "paragraphTextStyle");
        this.block = block;
        this.textColor = h8;
        this.headingTextStyle = headingTextStyle;
        this.subHeadingTextStyle = subHeadingTextStyle;
        this.paragraphTextStyle = paragraphTextStyle;
    }

    public BlockRenderData(Block block, H h8, BlockRenderTextStyle blockRenderTextStyle, BlockRenderTextStyle blockRenderTextStyle2, BlockRenderTextStyle blockRenderTextStyle3, int i10, kotlin.jvm.internal.e eVar) {
        BlockRenderTextStyle blockRenderTextStyle4;
        BlockRenderTextStyle blockRenderTextStyle5;
        H h10 = (i10 & 2) != 0 ? null : h8;
        if ((i10 & 4) != 0) {
            long jG = G0.a.g(48);
            androidx.compose.ui.text.font.l lVar = androidx.compose.ui.text.font.l.f15438c;
            blockRenderTextStyle4 = new BlockRenderTextStyle(jG, androidx.compose.ui.text.font.l.j, G0.a.g(56), null, null, null, 56, null);
        } else {
            blockRenderTextStyle4 = blockRenderTextStyle;
        }
        if ((i10 & 8) != 0) {
            long jG2 = G0.a.g(36);
            androidx.compose.ui.text.font.l lVar2 = androidx.compose.ui.text.font.l.f15438c;
            blockRenderTextStyle5 = new BlockRenderTextStyle(jG2, androidx.compose.ui.text.font.l.f15444i, G0.a.g(44), null, null, null, 56, null);
        } else {
            blockRenderTextStyle5 = blockRenderTextStyle2;
        }
        this(block, h10, blockRenderTextStyle4, blockRenderTextStyle5, (i10 & 16) != 0 ? BlockRenderTextStyle.Companion.getParagraphDefault() : blockRenderTextStyle3, null);
    }
}
