package p013b0;

import Ha.a;

/* JADX INFO: compiled from: Dp.kt */
/* JADX INFO: loaded from: classes.dex */
@a
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20483a;

    public static final float a(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f20483a == ((h) obj).f20483a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f20483a);
    }

    public final String toString() {
        long j = this.f20483a;
        if (j == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return ((Object) f.b(b(j))) + " x " + ((Object) f.b(a(j)));
    }
}
