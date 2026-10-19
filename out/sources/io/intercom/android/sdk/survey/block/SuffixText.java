package io.intercom.android.sdk.survey.block;

import androidx.compose.ui.graphics.H;

/* JADX INFO: compiled from: TextBlock.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SuffixText {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final SuffixText NO_SUFFIX;
    private final long color;
    private final String text;
    private final String ttsText;

    /* JADX INFO: compiled from: TextBlock.kt */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final SuffixText getNO_SUFFIX() {
            return SuffixText.NO_SUFFIX;
        }

        private Companion() {
        }
    }

    static {
        int i10 = H.f13505m;
        NO_SUFFIX = new SuffixText("", "", H.f13495b, null);
    }

    public /* synthetic */ SuffixText(String str, String str2, long j, kotlin.jvm.internal.e eVar) {
        this(str, str2, j);
    }

    /* JADX INFO: renamed from: copy-mxwnekA$default, reason: not valid java name */
    public static /* synthetic */ SuffixText m394copymxwnekA$default(SuffixText suffixText, String str, String str2, long j, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = suffixText.text;
        }
        if ((i10 & 2) != 0) {
            str2 = suffixText.ttsText;
        }
        if ((i10 & 4) != 0) {
            j = suffixText.color;
        }
        return suffixText.m396copymxwnekA(str, str2, j);
    }

    public final String component1() {
        return this.text;
    }

    public final String component2() {
        return this.ttsText;
    }

    /* JADX INFO: renamed from: component3-0d7_KjU, reason: not valid java name */
    public final long m395component30d7_KjU() {
        return this.color;
    }

    /* JADX INFO: renamed from: copy-mxwnekA, reason: not valid java name */
    public final SuffixText m396copymxwnekA(String text, String ttsText, long j) {
        kotlin.jvm.internal.i.e(text, "text");
        kotlin.jvm.internal.i.e(ttsText, "ttsText");
        return new SuffixText(text, ttsText, j, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuffixText)) {
            return false;
        }
        SuffixText suffixText = (SuffixText) obj;
        return kotlin.jvm.internal.i.a(this.text, suffixText.text) && kotlin.jvm.internal.i.a(this.ttsText, suffixText.ttsText) && H.c(this.color, suffixText.color);
    }

    /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m397getColor0d7_KjU() {
        return this.color;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTtsText() {
        return this.ttsText;
    }

    public int hashCode() {
        int iB = B1.a.b(this.ttsText, this.text.hashCode() * 31, 31);
        long j = this.color;
        int i10 = H.f13505m;
        return Long.hashCode(j) + iB;
    }

    public String toString() {
        return "SuffixText(text=" + this.text + ", ttsText=" + this.ttsText + ", color=" + ((Object) H.i(this.color)) + ')';
    }

    private SuffixText(String text, String ttsText, long j) {
        kotlin.jvm.internal.i.e(text, "text");
        kotlin.jvm.internal.i.e(ttsText, "ttsText");
        this.text = text;
        this.ttsText = ttsText;
        this.color = j;
    }
}
