package p013b0;

import Ha.a;

/* JADX INFO: compiled from: Dp.kt */
/* JADX INFO: loaded from: classes.dex */
@a
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20482a;

    public static String a(long j) {
        if (j == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) f.b(Float.intBitsToFloat((int) (j >> 32)))) + ", " + ((Object) f.b(Float.intBitsToFloat((int) (j & 4294967295L)))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f20482a == ((g) obj).f20482a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f20482a);
    }

    public final String toString() {
        return a(this.f20482a);
    }
}
