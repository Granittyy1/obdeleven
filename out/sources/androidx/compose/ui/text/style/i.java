package androidx.compose.ui.text.style;

/* JADX INFO: compiled from: TextDirection.kt */
/* JADX INFO: loaded from: classes.dex */
@Ha.a
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15674a;

    public static final boolean a(int i10, int i11) {
        return i10 == i11;
    }

    public static String b(int i10) {
        if (a(i10, 1)) {
            return "Ltr";
        }
        if (a(i10, 2)) {
            return "Rtl";
        }
        if (a(i10, 3)) {
            return "Content";
        }
        if (a(i10, 4)) {
            return "ContentOrLtr";
        }
        if (a(i10, 5)) {
            return "ContentOrRtl";
        }
        return a(i10, Integer.MIN_VALUE) ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f15674a == ((i) obj).f15674a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15674a);
    }

    public final String toString() {
        return b(this.f15674a);
    }
}
