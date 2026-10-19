package androidx.compose.ui.text.font;

/* JADX INFO: compiled from: FontStyle.kt */
/* JADX INFO: loaded from: classes.dex */
@Ha.a
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15436a;

    public static final boolean a(int i10, int i11) {
        return i10 == i11;
    }

    public static String b(int i10) {
        if (a(i10, 0)) {
            return "Normal";
        }
        return a(i10, 1) ? "Italic" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f15436a == ((j) obj).f15436a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15436a);
    }

    public final String toString() {
        return b(this.f15436a);
    }
}
