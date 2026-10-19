package androidx.compose.ui.text.input;

/* JADX INFO: compiled from: KeyboardCapitalization.kt */
/* JADX INFO: loaded from: classes.dex */
@Ha.a
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15556a;

    public static final boolean a(int i10, int i11) {
        return i10 == i11;
    }

    public static String b(int i10) {
        if (a(i10, -1)) {
            return "Unspecified";
        }
        if (a(i10, 0)) {
            return "None";
        }
        if (a(i10, 1)) {
            return "Characters";
        }
        if (a(i10, 2)) {
            return "Words";
        }
        return a(i10, 3) ? "Sentences" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return this.f15556a == ((m) obj).f15556a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15556a);
    }

    public final String toString() {
        return b(this.f15556a);
    }
}
