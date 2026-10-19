package p095h6;

import J4.n;
import O3.d;
import com.braze.Constants;
import java.math.RoundingMode;
import p005a4.o;

/* JADX INFO: compiled from: LongMath.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: compiled from: LongMath.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36177a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f36177a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36177a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36177a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36177a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f36177a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f36177a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f36177a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f36177a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static long a(long j, long j10) {
        long j11 = j + j10;
        if (((j ^ j10) < 0) || ((j ^ j11) >= 0)) {
            return j11;
        }
        throw new ArithmeticException(o.d(j10, ")", n.f("overflow: checkedAdd(", ", ", j)));
    }

    public static long b(long j, long j10, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j11 = j / j10;
        long j12 = j - (j10 * j11);
        if (j12 == 0) {
            return j11;
        }
        int i10 = ((int) ((j ^ j10) >> 63)) | 1;
        switch (a.f36177a[roundingMode.ordinal()]) {
            case 1:
                d.n(j12 == 0);
                return j11;
            case 2:
                return j11;
            case 3:
                if (i10 >= 0) {
                    return j11;
                }
                break;
            case 4:
                break;
            case 5:
                if (i10 <= 0) {
                    return j11;
                }
                break;
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j12);
                long jAbs2 = jAbs - (Math.abs(j10) - jAbs);
                if (jAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j11) == 0)) {
                        return j11;
                    }
                } else if (jAbs2 <= 0) {
                    return j11;
                }
            default:
                throw new AssertionError();
        }
        return j11 + ((long) i10);
    }

    public static long c(long j, long j10) {
        d.m(j, Constants.BRAZE_PUSH_CONTENT_KEY);
        d.m(j10, "b");
        if (j == 0) {
            return j10;
        }
        if (j10 == 0) {
            return j;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j);
        long jNumberOfTrailingZeros = j >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j10);
        long j11 = j10 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j11) {
            long j12 = jNumberOfTrailingZeros - j11;
            long j13 = (j12 >> 63) & j12;
            long j14 = (j12 - j13) - j13;
            j11 += j13;
            jNumberOfTrailingZeros = j14 >> Long.numberOfTrailingZeros(j14);
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static long d(long j, long j10) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j10) + Long.numberOfLeadingZeros(j10) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros > 65) {
            return j * j10;
        }
        long j11 = ((j ^ j10) >>> 63) + Long.MAX_VALUE;
        if ((iNumberOfLeadingZeros < 64) || ((j10 == Long.MIN_VALUE) & (j < 0))) {
            return j11;
        }
        long j12 = j * j10;
        return (j == 0 || j12 / j == j10) ? j12 : j11;
    }
}
