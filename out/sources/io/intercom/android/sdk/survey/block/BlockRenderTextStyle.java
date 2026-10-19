package io.intercom.android.sdk.survey.block;

import androidx.compose.ui.graphics.H;
import androidx.compose.ui.text.F;

/* JADX INFO: compiled from: BlockRenderData.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class BlockRenderTextStyle {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final BlockRenderTextStyle paragraphDefault;
    private final long fontSize;
    private final androidx.compose.ui.text.font.l fontWeight;
    private final long lineHeight;
    private final H linkTextColor;
    private final androidx.compose.ui.text.style.g textAlign;
    private final H textColor;

    /* JADX INFO: compiled from: BlockRenderData.kt */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final BlockRenderTextStyle getParagraphDefault() {
            return BlockRenderTextStyle.paragraphDefault;
        }

        private Companion() {
        }
    }

    static {
        long jG = G0.a.g(16);
        androidx.compose.ui.text.font.l lVar = androidx.compose.ui.text.font.l.f15438c;
        paragraphDefault = new BlockRenderTextStyle(jG, androidx.compose.ui.text.font.l.f15442g, 0L, null, null, null, 60, null);
    }

    public /* synthetic */ BlockRenderTextStyle(long j, androidx.compose.ui.text.font.l lVar, long j10, H h8, H h10, androidx.compose.ui.text.style.g gVar, kotlin.jvm.internal.e eVar) {
        this(j, lVar, j10, h8, h10, gVar);
    }

    /* JADX INFO: renamed from: component1-XSAIIZE, reason: not valid java name */
    public final long m368component1XSAIIZE() {
        return this.fontSize;
    }

    public final androidx.compose.ui.text.font.l component2() {
        return this.fontWeight;
    }

    /* JADX INFO: renamed from: component3-XSAIIZE, reason: not valid java name */
    public final long m369component3XSAIIZE() {
        return this.lineHeight;
    }

    /* JADX INFO: renamed from: component4-QN2ZGVo, reason: not valid java name */
    public final H m370component4QN2ZGVo() {
        return this.textColor;
    }

    /* JADX INFO: renamed from: component5-QN2ZGVo, reason: not valid java name */
    public final H m371component5QN2ZGVo() {
        return this.linkTextColor;
    }

    /* JADX INFO: renamed from: component6-buA522U, reason: not valid java name */
    public final androidx.compose.ui.text.style.g m372component6buA522U() {
        return this.textAlign;
    }

    /* JADX INFO: renamed from: copy--ZsBm6Y, reason: not valid java name */
    public final BlockRenderTextStyle m373copyZsBm6Y(long j, androidx.compose.ui.text.font.l fontWeight, long j10, H h8, H h10, androidx.compose.ui.text.style.g gVar) {
        kotlin.jvm.internal.i.e(fontWeight, "fontWeight");
        return new BlockRenderTextStyle(j, fontWeight, j10, h8, h10, gVar, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlockRenderTextStyle)) {
            return false;
        }
        BlockRenderTextStyle blockRenderTextStyle = (BlockRenderTextStyle) obj;
        return p013b0.n.a(this.fontSize, blockRenderTextStyle.fontSize) && kotlin.jvm.internal.i.a(this.fontWeight, blockRenderTextStyle.fontWeight) && p013b0.n.a(this.lineHeight, blockRenderTextStyle.lineHeight) && kotlin.jvm.internal.i.a(this.textColor, blockRenderTextStyle.textColor) && kotlin.jvm.internal.i.a(this.linkTextColor, blockRenderTextStyle.linkTextColor) && kotlin.jvm.internal.i.a(this.textAlign, blockRenderTextStyle.textAlign);
    }

    /* JADX INFO: renamed from: getFontSize-XSAIIZE, reason: not valid java name */
    public final long m374getFontSizeXSAIIZE() {
        return this.fontSize;
    }

    public final androidx.compose.ui.text.font.l getFontWeight() {
        return this.fontWeight;
    }

    /* JADX INFO: renamed from: getLineHeight-XSAIIZE, reason: not valid java name */
    public final long m375getLineHeightXSAIIZE() {
        return this.lineHeight;
    }

    /* JADX INFO: renamed from: getLinkTextColor-QN2ZGVo, reason: not valid java name */
    public final H m376getLinkTextColorQN2ZGVo() {
        return this.linkTextColor;
    }

    /* JADX INFO: renamed from: getTextAlign-buA522U, reason: not valid java name */
    public final androidx.compose.ui.text.style.g m377getTextAlignbuA522U() {
        return this.textAlign;
    }

    /* JADX INFO: renamed from: getTextColor-QN2ZGVo, reason: not valid java name */
    public final H m378getTextColorQN2ZGVo() {
        return this.textColor;
    }

    public int hashCode() {
        long j = this.fontSize;
        p013b0.o[] oVarArr = p013b0.n.f20492b;
        int iC = C4.b.c(this.lineHeight, ((Long.hashCode(j) * 31) + this.fontWeight.f15447b) * 31, 31);
        H h8 = this.textColor;
        int iHashCode = (iC + (h8 == null ? 0 : Long.hashCode(h8.f13506a))) * 31;
        H h10 = this.linkTextColor;
        int iHashCode2 = (iHashCode + (h10 == null ? 0 : Long.hashCode(h10.f13506a))) * 31;
        androidx.compose.ui.text.style.g gVar = this.textAlign;
        return iHashCode2 + (gVar != null ? Integer.hashCode(gVar.f15669a) : 0);
    }

    public String toString() {
        return "BlockRenderTextStyle(fontSize=" + ((Object) p013b0.n.d(this.fontSize)) + ", fontWeight=" + this.fontWeight + ", lineHeight=" + ((Object) p013b0.n.d(this.lineHeight)) + ", textColor=" + this.textColor + ", linkTextColor=" + this.linkTextColor + ", textAlign=" + this.textAlign + ')';
    }

    public final F toTextStyle$intercom_sdk_base_release() {
        H h8 = this.textColor;
        long j = h8 != null ? h8.f13506a : H.f13504l;
        long j10 = this.fontSize;
        androidx.compose.ui.text.font.l lVar = this.fontWeight;
        long j11 = this.lineHeight;
        androidx.compose.ui.text.style.g gVar = this.textAlign;
        return new F(j, j10, lVar, 0L, gVar != null ? gVar.f15669a : 5, j11, 16613368);
    }

    private BlockRenderTextStyle(long j, androidx.compose.ui.text.font.l fontWeight, long j10, H h8, H h10, androidx.compose.ui.text.style.g gVar) {
        kotlin.jvm.internal.i.e(fontWeight, "fontWeight");
        this.fontSize = j;
        this.fontWeight = fontWeight;
        this.lineHeight = j10;
        this.textColor = h8;
        this.linkTextColor = h10;
        this.textAlign = gVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BlockRenderTextStyle(long j, androidx.compose.ui.text.font.l lVar, long j10, H h8, H h10, androidx.compose.ui.text.style.g gVar, int i10, kotlin.jvm.internal.e eVar) {
        long j11;
        if ((i10 & 4) != 0) {
            p013b0.o[] oVarArr = p013b0.n.f20492b;
            j11 = p013b0.n.f20493c;
        } else {
            j11 = j10;
        }
        H h11 = (i10 & 8) != 0 ? null : h8;
        this(j, lVar, j11, h11, (i10 & 16) != 0 ? h11 : h10, (i10 & 32) != 0 ? null : gVar, null);
    }
}
