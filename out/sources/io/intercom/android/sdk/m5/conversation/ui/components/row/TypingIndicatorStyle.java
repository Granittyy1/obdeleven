package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.foundation.C0937i;
import androidx.compose.ui.graphics.l0;

/* JADX INFO: compiled from: TypingIndicator.kt */
/* JADX INFO: loaded from: classes3.dex */
final class TypingIndicatorStyle {
    private final C0937i borderStroke;
    private final long color;
    private final l0 shape;

    public /* synthetic */ TypingIndicatorStyle(l0 l0Var, C0937i c0937i, long j, kotlin.jvm.internal.e eVar) {
        this(l0Var, c0937i, j);
    }

    /* JADX INFO: renamed from: copy-mxwnekA$default, reason: not valid java name */
    public static /* synthetic */ TypingIndicatorStyle m258copymxwnekA$default(TypingIndicatorStyle typingIndicatorStyle, l0 l0Var, C0937i c0937i, long j, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l0Var = typingIndicatorStyle.shape;
        }
        if ((i10 & 2) != 0) {
            c0937i = typingIndicatorStyle.borderStroke;
        }
        if ((i10 & 4) != 0) {
            j = typingIndicatorStyle.color;
        }
        return typingIndicatorStyle.m260copymxwnekA(l0Var, c0937i, j);
    }

    public final l0 component1() {
        return this.shape;
    }

    public final C0937i component2() {
        return this.borderStroke;
    }

    /* JADX INFO: renamed from: component3-0d7_KjU, reason: not valid java name */
    public final long m259component30d7_KjU() {
        return this.color;
    }

    /* JADX INFO: renamed from: copy-mxwnekA, reason: not valid java name */
    public final TypingIndicatorStyle m260copymxwnekA(l0 shape, C0937i c0937i, long j) {
        kotlin.jvm.internal.i.e(shape, "shape");
        return new TypingIndicatorStyle(shape, c0937i, j, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypingIndicatorStyle)) {
            return false;
        }
        TypingIndicatorStyle typingIndicatorStyle = (TypingIndicatorStyle) obj;
        return kotlin.jvm.internal.i.a(this.shape, typingIndicatorStyle.shape) && kotlin.jvm.internal.i.a(this.borderStroke, typingIndicatorStyle.borderStroke) && androidx.compose.ui.graphics.H.c(this.color, typingIndicatorStyle.color);
    }

    public final C0937i getBorderStroke() {
        return this.borderStroke;
    }

    /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m261getColor0d7_KjU() {
        return this.color;
    }

    public final l0 getShape() {
        return this.shape;
    }

    public int hashCode() {
        int iHashCode = this.shape.hashCode() * 31;
        C0937i c0937i = this.borderStroke;
        int iHashCode2 = (iHashCode + (c0937i == null ? 0 : c0937i.hashCode())) * 31;
        long j = this.color;
        int i10 = androidx.compose.ui.graphics.H.f13505m;
        return Long.hashCode(j) + iHashCode2;
    }

    public String toString() {
        return "TypingIndicatorStyle(shape=" + this.shape + ", borderStroke=" + this.borderStroke + ", color=" + ((Object) androidx.compose.ui.graphics.H.i(this.color)) + ')';
    }

    private TypingIndicatorStyle(l0 shape, C0937i c0937i, long j) {
        kotlin.jvm.internal.i.e(shape, "shape");
        this.shape = shape;
        this.borderStroke = c0937i;
        this.color = j;
    }
}
