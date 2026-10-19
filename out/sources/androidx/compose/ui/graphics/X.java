package androidx.compose.ui.graphics;

/* JADX INFO: compiled from: ImageBitmap.kt */
/* JADX INFO: loaded from: classes.dex */
@Ha.a
public final class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13532a;

    public static final boolean a(int i10, int i11) {
        return i10 == i11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof X) {
            return this.f13532a == ((X) obj).f13532a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13532a);
    }

    public final String toString() {
        int i10 = this.f13532a;
        if (a(i10, 0)) {
            return "Argb8888";
        }
        if (a(i10, 1)) {
            return "Alpha8";
        }
        if (a(i10, 2)) {
            return "Rgb565";
        }
        if (a(i10, 3)) {
            return "F16";
        }
        return a(i10, 4) ? "Gpu" : "Unknown";
    }
}
