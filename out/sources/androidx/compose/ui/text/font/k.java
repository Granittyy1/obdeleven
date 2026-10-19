package androidx.compose.ui.text.font;

/* JADX INFO: compiled from: FontSynthesis.kt */
/* JADX INFO: loaded from: classes.dex */
@Ha.a
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15437a;

    public static final boolean a(int i10, int i11) {
        return i10 == i11;
    }

    public static String b(int i10) {
        if (a(i10, 0)) {
            return "None";
        }
        if (a(i10, 1)) {
            return "Weight";
        }
        if (a(i10, 2)) {
            return "Style";
        }
        return a(i10, 65535) ? "All" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f15437a == ((k) obj).f15437a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15437a);
    }

    public final String toString() {
        return b(this.f15437a);
    }
}
