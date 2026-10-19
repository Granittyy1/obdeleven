package p114j1;

import java.math.RoundingMode;

/* JADX INFO: compiled from: TimestampAdjuster.java */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f41075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f41076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f41077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ThreadLocal<Long> f41078d = new ThreadLocal<>();

    public w(long j) {
        e(j);
    }

    public final synchronized long a(long j) {
        long j10;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            synchronized (this) {
                if (!(this.f41076b != -9223372036854775807L)) {
                    long jLongValue = this.f41075a;
                    if (jLongValue == 9223372036854775806L) {
                        Long l10 = this.f41078d.get();
                        l10.getClass();
                        jLongValue = l10.longValue();
                    }
                    this.f41076b = jLongValue - j;
                    notifyAll();
                }
                this.f41077c = j;
                j10 = j + this.f41076b;
            }
            return j10;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j10 = this.f41077c;
            if (j10 != -9223372036854775807L) {
                int i10 = A.f40996a;
                long jL = A.L(j10, 90000L, 1000000L, RoundingMode.DOWN);
                long j11 = (4294967296L + jL) / 8589934592L;
                long j12 = ((j11 - 1) * 8589934592L) + j;
                long j13 = (j11 * 8589934592L) + j;
                j = Math.abs(j12 - jL) < Math.abs(j13 - jL) ? j12 : j13;
            }
            long j14 = j;
            int i11 = A.f40996a;
            return a(A.L(j14, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long c(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j10 = this.f41077c;
            if (j10 != -9223372036854775807L) {
                int i10 = A.f40996a;
                long jL = A.L(j10, 90000L, 1000000L, RoundingMode.DOWN);
                long j11 = jL / 8589934592L;
                long j12 = (j11 * 8589934592L) + j;
                j = j12 >= jL ? j12 : ((j11 + 1) * 8589934592L) + j;
            }
            long j13 = j;
            int i11 = A.f40996a;
            return a(A.L(j13, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long d() {
        long j;
        j = this.f41075a;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            j = -9223372036854775807L;
        }
        return j;
    }

    public final synchronized void e(long j) {
        this.f41075a = j;
        this.f41076b = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f41077c = -9223372036854775807L;
    }
}
