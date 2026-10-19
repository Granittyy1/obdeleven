package kotlin.random;

import Ca.b;
import La.a;
import com.google.android.gms.internal.measurement.C1787c0;
import java.io.Serializable;

/* JADX INFO: compiled from: Random.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class Random {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Default f43064b = new Default(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f43065c;

    /* JADX INFO: compiled from: Random.kt */
    public static final class Default extends Random implements Serializable {

        /* JADX INFO: compiled from: Random.kt */
        public static final class Serialized implements Serializable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final Serialized f43066b = new Serialized();
            private static final long serialVersionUID = 0;

            private Serialized() {
            }

            private final Object readResolve() {
                return Random.f43064b;
            }
        }

        public /* synthetic */ Default(int i10) {
            this();
        }

        private final Object writeReplace() {
            return Serialized.f43066b;
        }

        @Override // kotlin.random.Random
        public final int a(int i10) {
            return Random.f43065c.a(i10);
        }

        @Override // kotlin.random.Random
        public final int b() {
            return Random.f43065c.b();
        }

        @Override // kotlin.random.Random
        public final int c(int i10) {
            return Random.f43065c.c(i10);
        }

        @Override // kotlin.random.Random
        public final int d(int i10, int i11) {
            return Random.f43065c.d(i10, i11);
        }

        @Override // kotlin.random.Random
        public final long e() {
            return Random.f43065c.e();
        }

        @Override // kotlin.random.Random
        public final long f(long j) {
            throw null;
        }

        @Override // kotlin.random.Random
        public final long g(long j, long j10) {
            return Random.f43065c.g(0L, j10);
        }

        private Default() {
        }
    }

    static {
        b.f2468a.getClass();
        Integer num = Ea.a.C0032a.f3171a;
        f43065c = (num == null || num.intValue() >= 34) ? new Ma.a() : new La.b();
    }

    public abstract int a(int i10);

    public abstract int b();

    public int c(int i10) {
        return d(0, i10);
    }

    public int d(int i10, int i11) {
        int iB;
        int i12;
        int iA;
        if (i11 <= i10) {
            throw new IllegalArgumentException(C1787c0.d(Integer.valueOf(i10), Integer.valueOf(i11)).toString());
        }
        int i13 = i11 - i10;
        if (i13 > 0 || i13 == Integer.MIN_VALUE) {
            if (((-i13) & i13) == i13) {
                iA = a(31 - Integer.numberOfLeadingZeros(i13));
            } else {
                do {
                    iB = b() >>> 1;
                    i12 = iB % i13;
                } while ((i13 - 1) + (iB - i12) < 0);
                iA = i12;
            }
            return i10 + iA;
        }
        while (true) {
            int iB2 = b();
            if (i10 <= iB2 && iB2 < i11) {
                return iB2;
            }
        }
    }

    public long e() {
        return (((long) b()) << 32) + ((long) b());
    }

    public long f(long j) {
        return g(0L, j);
    }

    public long g(long j, long j10) {
        long jE;
        long j11;
        long jA;
        int iB;
        if (j10 <= j) {
            throw new IllegalArgumentException(C1787c0.d(Long.valueOf(j), Long.valueOf(j10)).toString());
        }
        long j12 = j10 - j;
        if (j12 > 0) {
            if (((-j12) & j12) == j12) {
                int i10 = (int) j12;
                int i11 = (int) (j12 >>> 32);
                if (i10 != 0) {
                    iB = a(31 - Integer.numberOfLeadingZeros(i10));
                } else if (i11 == 1) {
                    iB = b();
                } else {
                    jA = (((long) a(31 - Integer.numberOfLeadingZeros(i11))) << 32) + (((long) b()) & 4294967295L);
                }
                jA = ((long) iB) & 4294967295L;
            } else {
                do {
                    jE = e() >>> 1;
                    j11 = jE % j12;
                } while ((j12 - 1) + (jE - j11) < 0);
                jA = j11;
            }
            return j + jA;
        }
        while (true) {
            long jE2 = e();
            if (j <= jE2 && jE2 < j10) {
                return jE2;
            }
        }
    }
}
