package p013b0;

import Ha.a;

/* JADX INFO: compiled from: IntSize.kt */
/* JADX INFO: loaded from: classes.dex */
@a
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20490a;

    public static boolean a(Object obj, long j) {
        return (obj instanceof l) && j == ((l) obj).f20490a;
    }

    public static final boolean b(long j, long j10) {
        return j == j10;
    }

    public static String c(long j) {
        return ((int) (j >> 32)) + " x " + ((int) (j & 4294967295L));
    }

    public final boolean equals(Object obj) {
        return a(obj, this.f20490a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f20490a);
    }

    public final String toString() {
        return c(this.f20490a);
    }
}
