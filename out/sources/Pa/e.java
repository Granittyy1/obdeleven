package Pa;

import kotlin.jvm.internal.i;
import kotlin.time.DurationUnit;

/* JADX INFO: compiled from: TimeSource.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface e {

    /* JADX INFO: compiled from: TimeSource.kt */
    public static final class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f4978a = new a();

        /* JADX INFO: renamed from: Pa.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: TimeSource.kt */
        @Ha.a
        public static final class C0073a implements Pa.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f4979b;

            public /* synthetic */ C0073a(long j) {
                this.f4979b = j;
            }

            public static final long a(long j, long j10) {
                int i10 = d.f4977b;
                DurationUnit unit = DurationUnit.NANOSECONDS;
                i.e(unit, "unit");
                if (((j10 - 1) | 1) != Long.MAX_VALUE) {
                    return (1 | (j - 1)) == Long.MAX_VALUE ? O.e.t(j) : O.e.z(j, j10, unit);
                }
                if (j != j10) {
                    return b.k(O.e.t(j10));
                }
                int i11 = b.f4973e;
                return 0L;
            }

            @Override // Pa.a
            public final boolean B() {
                long jB = d.b();
                DurationUnit unit = DurationUnit.NANOSECONDS;
                i.e(unit, "unit");
                long j = this.f4979b;
                return !b.f((1 | (j - 1)) == Long.MAX_VALUE ? b.k(O.e.t(j)) : O.e.z(jB, j, unit));
            }

            @Override // java.lang.Comparable
            public final int compareTo(Pa.a aVar) {
                Pa.a other = aVar;
                i.e(other, "other");
                i.e(other, "other");
                boolean z10 = other instanceof C0073a;
                long j = this.f4979b;
                if (z10) {
                    return b.c(a(j, ((C0073a) other).f4979b), 0L);
                }
                throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) ("ValueTimeMark(reading=" + j + ')')) + " and " + other);
            }

            public final boolean equals(Object obj) {
                if (obj instanceof C0073a) {
                    return this.f4979b == ((C0073a) obj).f4979b;
                }
                return false;
            }

            public final int hashCode() {
                return Long.hashCode(this.f4979b);
            }

            public final String toString() {
                return "ValueTimeMark(reading=" + this.f4979b + ')';
            }
        }

        @Override // Pa.e
        public final C0073a a() {
            return new C0073a(d.b());
        }

        public final String toString() {
            int i10 = d.f4977b;
            return "TimeSource(System.nanoTime())";
        }
    }

    a.C0073a a();
}
