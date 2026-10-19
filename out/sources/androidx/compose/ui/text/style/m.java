package androidx.compose.ui.text.style;

/* JADX INFO: compiled from: TextOverflow.kt */
/* JADX INFO: loaded from: classes.dex */
@Ha.a
public final class m {
    public static final boolean a(int i10, int i11) {
        return i10 == i11;
    }

    public static String b(int i10) {
        if (a(i10, 1)) {
            return "Clip";
        }
        if (a(i10, 2)) {
            return "Ellipsis";
        }
        if (a(i10, 5)) {
            return "MiddleEllipsis";
        }
        if (a(i10, 3)) {
            return "Visible";
        }
        return a(i10, 4) ? "StartEllipsis" : "Invalid";
    }
}
