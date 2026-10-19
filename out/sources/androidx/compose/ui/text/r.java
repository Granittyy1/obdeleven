package androidx.compose.ui.text;

/* JADX INFO: compiled from: AndroidTextStyle.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f15647b = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15648a;

    public r(int i10) {
        this.f15648a = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            return this.f15648a == ((r) obj).f15648a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Boolean.hashCode(this.f15648a) * 31);
    }

    public final String toString() {
        return C4.v.f(new StringBuilder("PlatformParagraphStyle(includeFontPadding="), this.f15648a, ", emojiSupportMatch=EmojiSupportMatch.Default)");
    }

    public r(boolean z10) {
        this.f15648a = z10;
    }

    public r() {
        this(false);
    }
}
