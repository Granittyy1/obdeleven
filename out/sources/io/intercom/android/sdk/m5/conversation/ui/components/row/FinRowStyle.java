package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.foundation.C0937i;
import androidx.compose.ui.graphics.l0;

/* JADX INFO: compiled from: FinAnswerRow.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class FinRowStyle {
    public static final int $stable = 0;
    private final BubbleStyle bubbleStyle;
    private final l0 contentShape;
    private final androidx.compose.ui.d.b rowAlignment;
    private final androidx.compose.foundation.layout.L rowPadding;

    /* JADX INFO: compiled from: FinAnswerRow.kt */
    public static final class BubbleStyle {
        public static final int $stable = 0;
        private final C0937i borderStroke;
        private final long color;
        private final androidx.compose.foundation.layout.L padding;
        private final l0 shape;

        public /* synthetic */ BubbleStyle(long j, androidx.compose.foundation.layout.L l10, l0 l0Var, C0937i c0937i, kotlin.jvm.internal.e eVar) {
            this(j, l10, l0Var, c0937i);
        }

        /* JADX INFO: renamed from: copy-Iv8Zu3U$default, reason: not valid java name */
        public static /* synthetic */ BubbleStyle m248copyIv8Zu3U$default(BubbleStyle bubbleStyle, long j, androidx.compose.foundation.layout.L l10, l0 l0Var, C0937i c0937i, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j = bubbleStyle.color;
            }
            long j10 = j;
            if ((i10 & 2) != 0) {
                l10 = bubbleStyle.padding;
            }
            androidx.compose.foundation.layout.L l11 = l10;
            if ((i10 & 4) != 0) {
                l0Var = bubbleStyle.shape;
            }
            l0 l0Var2 = l0Var;
            if ((i10 & 8) != 0) {
                c0937i = bubbleStyle.borderStroke;
            }
            return bubbleStyle.m250copyIv8Zu3U(j10, l11, l0Var2, c0937i);
        }

        /* JADX INFO: renamed from: component1-0d7_KjU, reason: not valid java name */
        public final long m249component10d7_KjU() {
            return this.color;
        }

        public final androidx.compose.foundation.layout.L component2() {
            return this.padding;
        }

        public final l0 component3() {
            return this.shape;
        }

        public final C0937i component4() {
            return this.borderStroke;
        }

        /* JADX INFO: renamed from: copy-Iv8Zu3U, reason: not valid java name */
        public final BubbleStyle m250copyIv8Zu3U(long j, androidx.compose.foundation.layout.L padding, l0 shape, C0937i borderStroke) {
            kotlin.jvm.internal.i.e(padding, "padding");
            kotlin.jvm.internal.i.e(shape, "shape");
            kotlin.jvm.internal.i.e(borderStroke, "borderStroke");
            return new BubbleStyle(j, padding, shape, borderStroke, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BubbleStyle)) {
                return false;
            }
            BubbleStyle bubbleStyle = (BubbleStyle) obj;
            return androidx.compose.ui.graphics.H.c(this.color, bubbleStyle.color) && kotlin.jvm.internal.i.a(this.padding, bubbleStyle.padding) && kotlin.jvm.internal.i.a(this.shape, bubbleStyle.shape) && kotlin.jvm.internal.i.a(this.borderStroke, bubbleStyle.borderStroke);
        }

        public final C0937i getBorderStroke() {
            return this.borderStroke;
        }

        /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name */
        public final long m251getColor0d7_KjU() {
            return this.color;
        }

        public final androidx.compose.foundation.layout.L getPadding() {
            return this.padding;
        }

        public final l0 getShape() {
            return this.shape;
        }

        public int hashCode() {
            long j = this.color;
            int i10 = androidx.compose.ui.graphics.H.f13505m;
            return this.borderStroke.hashCode() + ((this.shape.hashCode() + ((this.padding.hashCode() + (Long.hashCode(j) * 31)) * 31)) * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("BubbleStyle(color=");
            C4.v.h(this.color, ", padding=", sb2);
            sb2.append(this.padding);
            sb2.append(", shape=");
            sb2.append(this.shape);
            sb2.append(", borderStroke=");
            sb2.append(this.borderStroke);
            sb2.append(')');
            return sb2.toString();
        }

        private BubbleStyle(long j, androidx.compose.foundation.layout.L padding, l0 shape, C0937i borderStroke) {
            kotlin.jvm.internal.i.e(padding, "padding");
            kotlin.jvm.internal.i.e(shape, "shape");
            kotlin.jvm.internal.i.e(borderStroke, "borderStroke");
            this.color = j;
            this.padding = padding;
            this.shape = shape;
            this.borderStroke = borderStroke;
        }
    }

    public FinRowStyle(BubbleStyle bubbleStyle, androidx.compose.ui.d.b rowAlignment, androidx.compose.foundation.layout.L rowPadding, l0 contentShape) {
        kotlin.jvm.internal.i.e(bubbleStyle, "bubbleStyle");
        kotlin.jvm.internal.i.e(rowAlignment, "rowAlignment");
        kotlin.jvm.internal.i.e(rowPadding, "rowPadding");
        kotlin.jvm.internal.i.e(contentShape, "contentShape");
        this.bubbleStyle = bubbleStyle;
        this.rowAlignment = rowAlignment;
        this.rowPadding = rowPadding;
        this.contentShape = contentShape;
    }

    public static /* synthetic */ FinRowStyle copy$default(FinRowStyle finRowStyle, BubbleStyle bubbleStyle, androidx.compose.ui.d.b bVar, androidx.compose.foundation.layout.L l10, l0 l0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bubbleStyle = finRowStyle.bubbleStyle;
        }
        if ((i10 & 2) != 0) {
            bVar = finRowStyle.rowAlignment;
        }
        if ((i10 & 4) != 0) {
            l10 = finRowStyle.rowPadding;
        }
        if ((i10 & 8) != 0) {
            l0Var = finRowStyle.contentShape;
        }
        return finRowStyle.copy(bubbleStyle, bVar, l10, l0Var);
    }

    public final BubbleStyle component1() {
        return this.bubbleStyle;
    }

    public final androidx.compose.ui.d.b component2() {
        return this.rowAlignment;
    }

    public final androidx.compose.foundation.layout.L component3() {
        return this.rowPadding;
    }

    public final l0 component4() {
        return this.contentShape;
    }

    public final FinRowStyle copy(BubbleStyle bubbleStyle, androidx.compose.ui.d.b rowAlignment, androidx.compose.foundation.layout.L rowPadding, l0 contentShape) {
        kotlin.jvm.internal.i.e(bubbleStyle, "bubbleStyle");
        kotlin.jvm.internal.i.e(rowAlignment, "rowAlignment");
        kotlin.jvm.internal.i.e(rowPadding, "rowPadding");
        kotlin.jvm.internal.i.e(contentShape, "contentShape");
        return new FinRowStyle(bubbleStyle, rowAlignment, rowPadding, contentShape);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FinRowStyle)) {
            return false;
        }
        FinRowStyle finRowStyle = (FinRowStyle) obj;
        return kotlin.jvm.internal.i.a(this.bubbleStyle, finRowStyle.bubbleStyle) && kotlin.jvm.internal.i.a(this.rowAlignment, finRowStyle.rowAlignment) && kotlin.jvm.internal.i.a(this.rowPadding, finRowStyle.rowPadding) && kotlin.jvm.internal.i.a(this.contentShape, finRowStyle.contentShape);
    }

    public final BubbleStyle getBubbleStyle() {
        return this.bubbleStyle;
    }

    public final l0 getContentShape() {
        return this.contentShape;
    }

    public final androidx.compose.ui.d.b getRowAlignment() {
        return this.rowAlignment;
    }

    public final androidx.compose.foundation.layout.L getRowPadding() {
        return this.rowPadding;
    }

    public int hashCode() {
        return this.contentShape.hashCode() + ((this.rowPadding.hashCode() + ((this.rowAlignment.hashCode() + (this.bubbleStyle.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        return "FinRowStyle(bubbleStyle=" + this.bubbleStyle + ", rowAlignment=" + this.rowAlignment + ", rowPadding=" + this.rowPadding + ", contentShape=" + this.contentShape + ')';
    }
}
