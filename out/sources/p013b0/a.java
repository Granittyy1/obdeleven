package p013b0;

import B7.b;
import com.braze.support.BrazeLogger;
import kotlin.KotlinNothingValueException;

/* JADX INFO: compiled from: Constraints.kt */
/* JADX INFO: loaded from: classes.dex */
@Ha.a
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20475a;

    /* JADX INFO: renamed from: b0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Constraints.kt */
    public static final class C0206a {
        public static long a(int i10, int i11, int i12, int i13) {
            int i14 = 262142;
            int iMin = Math.min(i12, 262142);
            int iMin2 = BrazeLogger.SUPPRESS;
            int iMin3 = i13 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i13, 262142);
            int i15 = iMin3 == Integer.MAX_VALUE ? iMin : iMin3;
            if (i15 >= 8191) {
                if (i15 < 32767) {
                    i14 = 65534;
                } else if (i15 < 65535) {
                    i14 = 32766;
                } else {
                    if (i15 >= 262143) {
                        b.l(i15);
                        throw new KotlinNothingValueException();
                    }
                    i14 = 8190;
                }
            }
            if (i11 != Integer.MAX_VALUE) {
                iMin2 = Math.min(i14, i11);
            }
            return b.a(Math.min(i14, i10), iMin2, iMin, iMin3);
        }

        public static long b(int i10, int i11, int i12, int i13) {
            int i14 = 262142;
            int iMin = Math.min(i10, 262142);
            int iMin2 = BrazeLogger.SUPPRESS;
            int iMin3 = i11 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i11, 262142);
            int i15 = iMin3 == Integer.MAX_VALUE ? iMin : iMin3;
            if (i15 >= 8191) {
                if (i15 < 32767) {
                    i14 = 65534;
                } else if (i15 < 65535) {
                    i14 = 32766;
                } else {
                    if (i15 >= 262143) {
                        b.l(i15);
                        throw new KotlinNothingValueException();
                    }
                    i14 = 8190;
                }
            }
            if (i13 != Integer.MAX_VALUE) {
                iMin2 = Math.min(i14, i13);
            }
            return b.a(iMin, iMin3, Math.min(i14, i12), iMin2);
        }
    }

    public /* synthetic */ a(long j) {
        this.f20475a = j;
    }

    public static long a(long j, int i10, int i11, int i12, int i13, int i14) {
        if ((i14 & 1) != 0) {
            i10 = j(j);
        }
        if ((i14 & 2) != 0) {
            i11 = h(j);
        }
        if ((i14 & 4) != 0) {
            i12 = i(j);
        }
        if ((i14 & 8) != 0) {
            i13 = g(j);
        }
        if (i11 < i10 || i13 < i12 || i10 < 0 || i12 < 0) {
            i.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return b.h(i10, i11, i12, i13);
    }

    public static final boolean b(long j, long j10) {
        return j == j10;
    }

    public static final boolean c(long j) {
        int i10 = (int) (3 & j);
        int i11 = (((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1);
        return (((int) (j >> (i11 + 46))) & ((1 << (18 - i11)) - 1)) != 0;
    }

    public static final boolean d(long j) {
        int i10 = (int) (3 & j);
        return (((int) (j >> 33)) & ((1 << (((((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1)) + 13)) - 1)) != 0;
    }

    public static final boolean e(long j) {
        int i10 = (int) (3 & j);
        int i11 = (((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1);
        int i12 = (1 << (18 - i11)) - 1;
        int i13 = ((int) (j >> (i11 + 15))) & i12;
        int i14 = ((int) (j >> (i11 + 46))) & i12;
        return i13 == (i14 == 0 ? BrazeLogger.SUPPRESS : i14 - 1);
    }

    public static final boolean f(long j) {
        int i10 = (int) (3 & j);
        int i11 = (1 << (((((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1)) + 13)) - 1;
        int i12 = ((int) (j >> 2)) & i11;
        int i13 = ((int) (j >> 33)) & i11;
        return i12 == (i13 == 0 ? BrazeLogger.SUPPRESS : i13 - 1);
    }

    public static final int g(long j) {
        int i10 = (int) (3 & j);
        int i11 = (((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1);
        int i12 = ((int) (j >> (i11 + 46))) & ((1 << (18 - i11)) - 1);
        return i12 == 0 ? BrazeLogger.SUPPRESS : i12 - 1;
    }

    public static final int h(long j) {
        int i10 = (int) (3 & j);
        int i11 = ((int) (j >> 33)) & ((1 << (((((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1)) + 13)) - 1);
        return i11 == 0 ? BrazeLogger.SUPPRESS : i11 - 1;
    }

    public static final int i(long j) {
        int i10 = (int) (3 & j);
        int i11 = (((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1);
        return ((int) (j >> (i11 + 15))) & ((1 << (18 - i11)) - 1);
    }

    public static final int j(long j) {
        int i10 = (int) (3 & j);
        return ((int) (j >> 2)) & ((1 << (((((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1)) + 13)) - 1);
    }

    public static final boolean k(long j) {
        int i10 = (int) (3 & j);
        int i11 = (((i10 & 2) >> 1) * 3) + ((i10 & 1) << 1);
        return ((((int) (j >> 33)) & ((1 << (i11 + 13)) - 1)) - 1 == 0) | ((((int) (j >> (i11 + 46))) & ((1 << (18 - i11)) - 1)) - 1 == 0);
    }

    public static String l(long j) {
        int iH = h(j);
        String strValueOf = iH == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iH);
        int iG = g(j);
        String strValueOf2 = iG != Integer.MAX_VALUE ? String.valueOf(iG) : "Infinity";
        StringBuilder sb2 = new StringBuilder("Constraints(minWidth = ");
        sb2.append(j(j));
        sb2.append(", maxWidth = ");
        sb2.append(strValueOf);
        sb2.append(", minHeight = ");
        sb2.append(i(j));
        sb2.append(", maxHeight = ");
        return b.g(sb2, strValueOf2, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f20475a == ((a) obj).f20475a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f20475a);
    }

    public final String toString() {
        return l(this.f20475a);
    }
}
