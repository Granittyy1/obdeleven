package p095h6;

import A8.p;
import O3.d;
import com.google.android.gms.internal.measurement.M1;
import java.math.RoundingMode;

/* JADX INFO: compiled from: DoubleMath.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f36174a = 0;

    /* JADX INFO: renamed from: h6.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DoubleMath.java */
    public static /* synthetic */ class C0376a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36175a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f36175a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36175a[RoundingMode.FLOOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36175a[RoundingMode.CEILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36175a[RoundingMode.DOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f36175a[RoundingMode.UP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f36175a[RoundingMode.HALF_EVEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f36175a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f36175a[RoundingMode.HALF_DOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    static {
        Math.log(2.0d);
    }

    public static boolean a(double d10) {
        return M1.i(d10) && (d10 == 0.0d || 52 - Long.numberOfTrailingZeros(M1.g(d10)) <= Math.getExponent(d10));
    }

    public static boolean b(double d10) {
        if (d10 <= 0.0d || !M1.i(d10)) {
            return false;
        }
        long jG = M1.g(d10);
        return (jG & (jG - 1)) == 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x006f  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    public static int c(double d10, RoundingMode roundingMode) {
        boolean zB;
        boolean z10 = false;
        p.f("x must be positive and finite", d10 > 0.0d && M1.i(d10));
        int exponent = Math.getExponent(d10);
        if (Math.getExponent(d10) < -1022) {
            return c(d10 * 4.503599627370496E15d, roundingMode) - 52;
        }
        switch (C0376a.f36175a[roundingMode.ordinal()]) {
            case 1:
                d.n(b(d10));
                if (z10) {
                    return exponent + 1;
                }
                return exponent;
            case 2:
                if (z10) {
                    return exponent + 1;
                }
                return exponent;
            case 3:
                z10 = !b(d10);
                if (z10) {
                    return exponent + 1;
                }
                return exponent;
            case 4:
                z10 = exponent < 0;
                zB = b(d10);
                z10 &= !zB;
                if (z10) {
                    return exponent + 1;
                }
                return exponent;
            case 5:
                z10 = exponent >= 0;
                zB = b(d10);
                z10 &= !zB;
                if (z10) {
                    return exponent + 1;
                }
                return exponent;
            case 6:
            case 7:
            case 8:
                double dLongBitsToDouble = Double.longBitsToDouble((Double.doubleToRawLongBits(d10) & 4503599627370495L) | 4607182418800017408L);
                if (dLongBitsToDouble * dLongBitsToDouble > 2.0d) {
                    z10 = true;
                }
                if (z10) {
                    return exponent + 1;
                }
                return exponent;
            default:
                throw new AssertionError();
        }
    }
}
