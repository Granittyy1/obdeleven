package androidx.compose.ui.platform;

/* JADX INFO: renamed from: androidx.compose.ui.platform.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AccessibilityIterators.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1214d extends androidx.compose.animation.core.H {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static C1214d f15037d;

    @Override // androidx.compose.animation.core.H
    public final int[] a(int i10) {
        int length = c().length();
        if (length <= 0 || i10 >= length) {
            return null;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        while (i10 < length && c().charAt(i10) == '\n' && !f(i10)) {
            i10++;
        }
        if (i10 >= length) {
            return null;
        }
        int i11 = i10 + 1;
        while (i11 < length && !e(i11)) {
            i11++;
        }
        return b(i10, i11);
    }

    @Override // androidx.compose.animation.core.H
    public final int[] d(int i10) {
        int length = c().length();
        if (length <= 0 || i10 <= 0) {
            return null;
        }
        if (i10 > length) {
            i10 = length;
        }
        while (i10 > 0 && c().charAt(i10 - 1) == '\n' && !e(i10)) {
            i10--;
        }
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        while (i11 > 0 && !f(i11)) {
            i11--;
        }
        return b(i11, i10);
    }

    public final boolean e(int i10) {
        return i10 > 0 && c().charAt(i10 + (-1)) != '\n' && (i10 == c().length() || c().charAt(i10) == '\n');
    }

    public final boolean f(int i10) {
        return c().charAt(i10) != '\n' && (i10 == 0 || c().charAt(i10 - 1) == '\n');
    }
}
