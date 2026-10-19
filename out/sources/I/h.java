package I;

/* JADX INFO: compiled from: Size.kt */
/* JADX INFO: loaded from: classes.dex */
@Ha.a
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3769a;

    public /* synthetic */ h(long j) {
        this.f3769a = j;
    }

    public static final boolean a(long j, long j10) {
        return j == j10;
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float c(long j) {
        return Math.min(Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j & 2147483647L)));
    }

    public static final float d(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final boolean e(long j) {
        long j10 = (~((((-9223372034707292160L) & j) >>> 31) * ((long) (-1)))) & j;
        return (((j10 & 4294967295L) & (j10 >>> 32)) == 0) | (j == 9205357640488583168L);
    }

    public static String f(long j) {
        if (j == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + b.p(Float.intBitsToFloat((int) (j >> 32))) + ", " + b.p(Float.intBitsToFloat((int) (j & 4294967295L))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f3769a == ((h) obj).f3769a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f3769a);
    }

    public final String toString() {
        return f(this.f3769a);
    }
}
