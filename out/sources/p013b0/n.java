package p013b0;

import Ha.a;

/* JADX INFO: compiled from: TextUnit.kt */
/* JADX INFO: loaded from: classes.dex */
@a
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o[] f20492b = {new o(0), new o(4294967296L), new o(8589934592L)};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f20493c = G0.a.i(Float.NaN, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20494a;

    public static final boolean a(long j, long j10) {
        return j == j10;
    }

    public static final long b(long j) {
        return f20492b[(int) ((j & 1095216660480L) >>> 32)].f20495a;
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String d(long j) {
        long jB = b(j);
        if (o.a(jB, 0L)) {
            return "Unspecified";
        }
        if (o.a(jB, 4294967296L)) {
            return c(j) + ".sp";
        }
        if (!o.a(jB, 8589934592L)) {
            return "Invalid";
        }
        return c(j) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return this.f20494a == ((n) obj).f20494a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f20494a);
    }

    public final String toString() {
        return d(this.f20494a);
    }
}
