package androidx.compose.ui.text.input;

/* JADX INFO: compiled from: ImeAction.kt */
/* JADX INFO: loaded from: classes.dex */
@Ha.a
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15548a;

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
            return "Default";
        }
        if (a(i10, 2)) {
            return "Go";
        }
        if (a(i10, 3)) {
            return "Search";
        }
        if (a(i10, 4)) {
            return "Send";
        }
        if (a(i10, 5)) {
            return "Previous";
        }
        if (a(i10, 6)) {
            return "Next";
        }
        return a(i10, 7) ? "Done" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f15548a == ((k) obj).f15548a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15548a);
    }

    public final String toString() {
        return b(this.f15548a);
    }
}
