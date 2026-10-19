package Pa;

import Na.k;
import Na.l;
import com.braze.Constants;
import com.google.android.gms.internal.measurement.C1787c0;
import kotlin.jvm.internal.i;
import kotlin.text.n;
import kotlin.time.DurationUnit;

/* JADX INFO: compiled from: Duration.kt */
/* JADX INFO: loaded from: classes2.dex */
@Ha.a
public final class b implements Comparable<b> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f4971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f4972d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f4973e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f4974b;

    static {
        int i10 = c.f4975a;
        f4971c = C1787c0.g(4611686018427387903L);
        f4972d = C1787c0.g(-4611686018427387903L);
    }

    public /* synthetic */ b(long j) {
        this.f4974b = j;
    }

    public static final long a(long j, long j10) {
        long j11 = 1000000;
        long j12 = j10 / j11;
        long j13 = j + j12;
        if (-4611686018426L > j13 || j13 >= 4611686018427L) {
            return C1787c0.g(l.E(j13, -4611686018427387903L, 4611686018427387903L));
        }
        return C1787c0.i((j13 * j11) + (j10 - (j12 * j11)));
    }

    public static final void b(StringBuilder sb2, int i10, int i11, int i12, String str, boolean z10) {
        sb2.append(i10);
        if (i11 != 0) {
            sb2.append('.');
            String strW = n.W(i12, String.valueOf(i11));
            int i13 = -1;
            int length = strW.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i14 = length - 1;
                    if (strW.charAt(length) != '0') {
                        i13 = length;
                        break;
                    } else if (i14 < 0) {
                        break;
                    } else {
                        length = i14;
                    }
                }
            }
            int i15 = i13 + 1;
            if (z10 || i15 >= 3) {
                sb2.append((CharSequence) strW, 0, ((i13 + 3) / 3) * 3);
            } else {
                sb2.append((CharSequence) strW, 0, i15);
            }
        }
        sb2.append(str);
    }

    public static int c(long j, long j10) {
        long j11 = j ^ j10;
        if (j11 < 0 || (((int) j11) & 1) == 0) {
            return i.h(j, j10);
        }
        int i10 = (((int) j) & 1) - (((int) j10) & 1);
        return f(j) ? -i10 : i10;
    }

    public static final int d(long j) {
        if (e(j)) {
            return 0;
        }
        return (int) ((((int) j) & 1) == 1 ? ((j >> 1) % ((long) Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS)) * ((long) 1000000) : (j >> 1) % ((long) 1000000000));
    }

    public static final boolean e(long j) {
        return j == f4971c || j == f4972d;
    }

    public static final boolean f(long j) {
        return j < 0;
    }

    public static final long g(long j, long j10) {
        if (e(j)) {
            if (!e(j10) || (j10 ^ j) >= 0) {
                return j;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (e(j10)) {
            return j10;
        }
        int i10 = ((int) j) & 1;
        if (i10 != (((int) j10) & 1)) {
            return i10 == 1 ? a(j >> 1, j10 >> 1) : a(j10 >> 1, j >> 1);
        }
        long j11 = (j >> 1) + (j10 >> 1);
        if (i10 == 0) {
            return (-4611686018426999999L > j11 || j11 >= 4611686018427000000L) ? C1787c0.g(j11 / ((long) 1000000)) : C1787c0.i(j11);
        }
        return C1787c0.h(j11);
    }

    public static final long h(int i10, long j) {
        if (e(j)) {
            if (i10 != 0) {
                return i10 > 0 ? j : k(j);
            }
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        }
        if (i10 == 0) {
            return 0L;
        }
        long j10 = j >> 1;
        long j11 = i10;
        long j12 = j10 * j11;
        boolean z10 = (((int) j) & 1) == 0;
        long j13 = f4972d;
        long j14 = f4971c;
        if (z10) {
            if (-2147483647L <= j10 && j10 < 2147483648L) {
                return C1787c0.i(j12);
            }
            if (j12 / j11 == j10) {
                return (-4611686018426999999L > j12 || j12 >= 4611686018427000000L) ? C1787c0.g(j12 / ((long) 1000000)) : C1787c0.i(j12);
            }
            long j15 = 1000000;
            long j16 = j10 / j15;
            long j17 = j16 * j11;
            long j18 = (((j10 - (j16 * j15)) * j11) / j15) + j17;
            if (j17 / j11 == j16 && (j18 ^ j17) >= 0) {
                return C1787c0.g(l.F(j18, new k(-4611686018427387903L, 4611686018427387903L)));
            }
            if (Integer.signum(i10) * Long.signum(j10) <= 0) {
                return j13;
            }
        } else {
            if (j12 / j11 == j10) {
                return C1787c0.g(l.F(j12, new k(-4611686018427387903L, 4611686018427387903L)));
            }
            if (Integer.signum(i10) * Long.signum(j10) <= 0) {
                return j13;
            }
        }
        return j14;
    }

    public static final long i(long j, DurationUnit unit) {
        i.e(unit, "unit");
        if (j == f4971c) {
            return Long.MAX_VALUE;
        }
        if (j == f4972d) {
            return Long.MIN_VALUE;
        }
        return Lb.a.d(j >> 1, (((int) j) & 1) == 0 ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS, unit);
    }

    public static String j(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == f4971c) {
            return "Infinity";
        }
        if (j == f4972d) {
            return "-Infinity";
        }
        boolean zF = f(j);
        StringBuilder sb2 = new StringBuilder();
        if (zF) {
            sb2.append('-');
        }
        if (f(j)) {
            j = k(j);
        }
        long jI = i(j, DurationUnit.DAYS);
        int i10 = 0;
        int i11 = e(j) ? 0 : (int) (i(j, DurationUnit.HOURS) % ((long) 24));
        int i12 = e(j) ? 0 : (int) (i(j, DurationUnit.MINUTES) % ((long) 60));
        int i13 = e(j) ? 0 : (int) (i(j, DurationUnit.SECONDS) % ((long) 60));
        int iD = d(j);
        boolean z10 = jI != 0;
        boolean z11 = i11 != 0;
        boolean z12 = i12 != 0;
        boolean z13 = (i13 == 0 && iD == 0) ? false : true;
        if (z10) {
            sb2.append(jI);
            sb2.append('d');
            i10 = 1;
        }
        if (z11 || (z10 && (z12 || z13))) {
            int i14 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(i11);
            sb2.append('h');
            i10 = i14;
        }
        if (z12 || (z13 && (z11 || z10))) {
            int i15 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(i12);
            sb2.append('m');
            i10 = i15;
        }
        if (z13) {
            int i16 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            if (i13 != 0 || z10 || z11 || z12) {
                b(sb2, i13, iD, 9, Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY, false);
            } else if (iD >= 1000000) {
                b(sb2, iD / 1000000, iD % 1000000, 6, "ms", false);
            } else if (iD >= 1000) {
                b(sb2, iD / Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS, iD % Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS, 3, "us", false);
            } else {
                sb2.append(iD);
                sb2.append("ns");
            }
            i10 = i16;
        }
        if (zF && i10 > 1) {
            sb2.insert(1, '(').append(')');
        }
        String string = sb2.toString();
        i.d(string, "toString(...)");
        return string;
    }

    public static final long k(long j) {
        long j10 = ((-(j >> 1)) << 1) + ((long) (((int) j) & 1));
        int i10 = c.f4975a;
        return j10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(b bVar) {
        return c(this.f4974b, bVar.f4974b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f4974b == ((b) obj).f4974b;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4974b);
    }

    public final String toString() {
        return j(this.f4974b);
    }
}
