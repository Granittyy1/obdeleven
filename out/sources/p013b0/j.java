package p013b0;

import A1.C0575j;
import Ha.a;

/* JADX INFO: compiled from: IntOffset.kt */
/* JADX INFO: loaded from: classes.dex */
@a
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20484a;

    public /* synthetic */ j(long j) {
        this.f20484a = j;
    }

    public static long a(int i10, int i11, int i12, long j) {
        if ((i12 & 1) != 0) {
            i10 = (int) (j >> 32);
        }
        if ((i12 & 2) != 0) {
            i11 = (int) (j & 4294967295L);
        }
        return (((long) i11) & 4294967295L) | (((long) i10) << 32);
    }

    public static final boolean b(long j, long j10) {
        return j == j10;
    }

    public static final long c(long j, long j10) {
        return (((long) (((int) (j >> 32)) - ((int) (j10 >> 32)))) << 32) | (((long) (((int) (j & 4294967295L)) - ((int) (j10 & 4294967295L)))) & 4294967295L);
    }

    public static final long d(long j, long j10) {
        return (((long) (((int) (j >> 32)) + ((int) (j10 >> 32)))) << 32) | (((long) (((int) (j & 4294967295L)) + ((int) (j10 & 4294967295L)))) & 4294967295L);
    }

    public static String e(long j) {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append((int) (j >> 32));
        sb2.append(", ");
        return C0575j.b(sb2, (int) (j & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f20484a == ((j) obj).f20484a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f20484a);
    }

    public final String toString() {
        return e(this.f20484a);
    }
}
