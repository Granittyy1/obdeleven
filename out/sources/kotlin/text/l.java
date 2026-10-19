package kotlin.text;

/* JADX INFO: compiled from: StringNumberConversions.kt */
/* JADX INFO: loaded from: classes2.dex */
public class l extends k {
    public static Integer A(String str) {
        kotlin.jvm.internal.i.e(str, "<this>");
        return z(10, str);
    }

    public static Long B(String str) {
        boolean z10;
        kotlin.jvm.internal.i.e(str, "<this>");
        O.h.c(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i10 = 0;
        char cCharAt = str.charAt(0);
        long j = -9223372036854775807L;
        if (kotlin.jvm.internal.i.g(cCharAt, 48) < 0) {
            z10 = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z10 = false;
                i10 = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j = Long.MIN_VALUE;
                i10 = 1;
            }
        } else {
            z10 = false;
        }
        long j10 = -256204778801521550L;
        long j11 = 0;
        long j12 = -256204778801521550L;
        while (i10 < length) {
            int iDigit = Character.digit((int) str.charAt(i10), 10);
            if (iDigit < 0) {
                return null;
            }
            if (j11 < j12) {
                if (j12 != j10) {
                    return null;
                }
                j12 = j / ((long) 10);
                if (j11 < j12) {
                    return null;
                }
            }
            long j13 = j11 * ((long) 10);
            long j14 = iDigit;
            if (j13 < j + j14) {
                return null;
            }
            j11 = j13 - j14;
            i10++;
            j10 = -256204778801521550L;
        }
        return z10 ? Long.valueOf(j11) : Long.valueOf(-j11);
    }

    public static final void x(String input) {
        kotlin.jvm.internal.i.e(input, "input");
        throw new NumberFormatException(p005a4.o.c('\'', "Invalid number format: '", input));
    }

    public static Double y(String str) {
        kotlin.jvm.internal.i.e(str, "<this>");
        try {
            if (h.f43154a.e(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Integer z(int i10, String str) {
        boolean z10;
        int i11;
        int i12;
        kotlin.jvm.internal.i.e(str, "<this>");
        O.h.c(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i13 = 0;
        char cCharAt = str.charAt(0);
        int i14 = -2147483647;
        if (kotlin.jvm.internal.i.g(cCharAt, 48) < 0) {
            i11 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z10 = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i14 = Integer.MIN_VALUE;
                z10 = true;
            }
        } else {
            z10 = false;
            i11 = 0;
        }
        int i15 = -59652323;
        while (i11 < length) {
            int iDigit = Character.digit((int) str.charAt(i11), i10);
            if (iDigit < 0) {
                return null;
            }
            if ((i13 < i15 && (i15 != -59652323 || i13 < (i15 = i14 / i10))) || (i12 = i13 * i10) < i14 + iDigit) {
                return null;
            }
            i13 = i12 - iDigit;
            i11++;
        }
        return z10 ? Integer.valueOf(i13) : Integer.valueOf(-i13);
    }
}
