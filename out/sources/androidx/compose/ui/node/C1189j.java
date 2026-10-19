package androidx.compose.ui.node;

/* JADX INFO: renamed from: androidx.compose.ui.node.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: HitTestResult.kt */
/* JADX INFO: loaded from: classes.dex */
@Ha.a
public final class C1189j {
    public static final int a(long j, long j10) {
        boolean zD = d(j);
        if (zD != d(j10)) {
            return zD ? -1 : 1;
        }
        int iSignum = (int) Math.signum(b(j) - b(j10));
        if (Math.min(b(j), b(j10)) >= 0.0f && c(j) != c(j10)) {
            return c(j) ? -1 : 1;
        }
        return iSignum;
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final boolean c(long j) {
        return (j & 2) != 0;
    }

    public static final boolean d(long j) {
        return (j & 1) != 0;
    }
}
