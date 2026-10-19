package androidx.compose.ui.text.input;

/* JADX INFO: compiled from: KeyboardType.kt */
/* JADX INFO: loaded from: classes.dex */
@Ha.a
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15557a;

    public static final boolean a(int i10, int i11) {
        return i10 == i11;
    }

    public static String b(int i10) {
        if (a(i10, 0)) {
            return "Unspecified";
        }
        if (a(i10, 1)) {
            return "Text";
        }
        if (a(i10, 2)) {
            return "Ascii";
        }
        if (a(i10, 3)) {
            return "Number";
        }
        if (a(i10, 4)) {
            return "Phone";
        }
        if (a(i10, 5)) {
            return "Uri";
        }
        if (a(i10, 6)) {
            return "Email";
        }
        if (a(i10, 7)) {
            return "Password";
        }
        if (a(i10, 8)) {
            return "NumberPassword";
        }
        return a(i10, 9) ? "Decimal" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return this.f15557a == ((n) obj).f15557a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15557a);
    }

    public final String toString() {
        return b(this.f15557a);
    }
}
