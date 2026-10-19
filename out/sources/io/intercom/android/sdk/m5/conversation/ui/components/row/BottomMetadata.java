package io.intercom.android.sdk.m5.conversation.ui.components.row;

/* JADX INFO: compiled from: ClickableMessageRow.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class BottomMetadata {
    public static final int $stable = 0;
    private final boolean alwaysShow;
    private final float padding;
    private final String text;

    public /* synthetic */ BottomMetadata(String str, float f10, boolean z10, kotlin.jvm.internal.e eVar) {
        this(str, f10, z10);
    }

    /* JADX INFO: renamed from: copy-lG28NQ4$default, reason: not valid java name */
    public static /* synthetic */ BottomMetadata m207copylG28NQ4$default(BottomMetadata bottomMetadata, String str, float f10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bottomMetadata.text;
        }
        if ((i10 & 2) != 0) {
            f10 = bottomMetadata.padding;
        }
        if ((i10 & 4) != 0) {
            z10 = bottomMetadata.alwaysShow;
        }
        return bottomMetadata.m209copylG28NQ4(str, f10, z10);
    }

    public final String component1() {
        return this.text;
    }

    /* JADX INFO: renamed from: component2-D9Ej5fM, reason: not valid java name */
    public final float m208component2D9Ej5fM() {
        return this.padding;
    }

    public final boolean component3() {
        return this.alwaysShow;
    }

    /* JADX INFO: renamed from: copy-lG28NQ4, reason: not valid java name */
    public final BottomMetadata m209copylG28NQ4(String text, float f10, boolean z10) {
        kotlin.jvm.internal.i.e(text, "text");
        return new BottomMetadata(text, f10, z10, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomMetadata)) {
            return false;
        }
        BottomMetadata bottomMetadata = (BottomMetadata) obj;
        return kotlin.jvm.internal.i.a(this.text, bottomMetadata.text) && p013b0.f.a(this.padding, bottomMetadata.padding) && this.alwaysShow == bottomMetadata.alwaysShow;
    }

    public final boolean getAlwaysShow() {
        return this.alwaysShow;
    }

    /* JADX INFO: renamed from: getPadding-D9Ej5fM, reason: not valid java name */
    public final float m210getPaddingD9Ej5fM() {
        return this.padding;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return Boolean.hashCode(this.alwaysShow) + O.a.d(this.padding, this.text.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BottomMetadata(text=");
        sb2.append(this.text);
        sb2.append(", padding=");
        sb2.append((Object) p013b0.f.b(this.padding));
        sb2.append(", alwaysShow=");
        return Z3.o.d(sb2, this.alwaysShow, ')');
    }

    private BottomMetadata(String text, float f10, boolean z10) {
        kotlin.jvm.internal.i.e(text, "text");
        this.text = text;
        this.padding = f10;
        this.alwaysShow = z10;
    }

    public BottomMetadata(String str, float f10, boolean z10, int i10, kotlin.jvm.internal.e eVar) {
        this(str, (i10 & 2) != 0 ? 4 : f10, (i10 & 4) != 0 ? false : z10, null);
    }
}
