package androidx.compose.ui.graphics;

/* JADX INFO: compiled from: TileMode.kt */
/* JADX INFO: loaded from: classes.dex */
@Ha.a
public final class p0 {
    public static final boolean a(int i10, int i11) {
        return i10 == i11;
    }

    public static String b(int i10) {
        if (a(i10, 0)) {
            return "Clamp";
        }
        if (a(i10, 1)) {
            return "Repeated";
        }
        if (a(i10, 2)) {
            return "Mirror";
        }
        return a(i10, 3) ? "Decal" : "Unknown";
    }
}
