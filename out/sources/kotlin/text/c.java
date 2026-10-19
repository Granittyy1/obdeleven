package kotlin.text;

import com.braze.support.BrazeLogger;
import java.util.Arrays;
import kotlin.collections.AbstractC2670b;

/* JADX INFO: compiled from: HexExtensions.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f43135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f43136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f43137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long[] f43138d;

    static {
        int[] iArr = new int[256];
        int i10 = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            iArr[i11] = "0123456789abcdef".charAt(i11 & 15) | ("0123456789abcdef".charAt(i11 >> 4) << '\b');
        }
        f43135a = iArr;
        int[] iArr2 = new int[256];
        for (int i12 = 0; i12 < 256; i12++) {
            iArr2[i12] = "0123456789ABCDEF".charAt(i12 & 15) | ("0123456789ABCDEF".charAt(i12 >> 4) << '\b');
        }
        f43136b = iArr2;
        int[] iArr3 = new int[256];
        for (int i13 = 0; i13 < 256; i13++) {
            iArr3[i13] = -1;
        }
        int i14 = 0;
        int i15 = 0;
        while (i14 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i14)] = i15;
            i14++;
            i15++;
        }
        int i16 = 0;
        int i17 = 0;
        while (i16 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i16)] = i17;
            i16++;
            i17++;
        }
        f43137c = iArr3;
        long[] jArr = new long[256];
        for (int i18 = 0; i18 < 256; i18++) {
            jArr[i18] = -1;
        }
        int i19 = 0;
        int i20 = 0;
        while (i19 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i19)] = i20;
            i19++;
            i20++;
        }
        int i21 = 0;
        while (i10 < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i10)] = i21;
            i10++;
            i21++;
        }
        f43138d = jArr;
    }

    public static final int a(long j) {
        if (0 <= j && j <= 2147483647L) {
            return (int) j;
        }
        throw new IllegalArgumentException("The resulting string length is too big: " + ((Object) C6.b.e(10, j)));
    }

    public static final void b(String str, int i10, int i11) {
        int i12 = i11 - i10;
        if (i12 < 1) {
            i(str, i10, i11, "at least", 1);
            throw null;
        }
        if (i12 > 16) {
            int i13 = (i12 + i10) - 16;
            while (i10 < i13) {
                if (str.charAt(i10) != '0') {
                    StringBuilder sbE = A8.f.e(i10, "Expected the hexadecimal digit '0' at index ", ", but was '");
                    sbE.append(str.charAt(i10));
                    sbE.append("'.\nThe result won't fit the type being parsed.");
                    throw new NumberFormatException(sbE.toString());
                }
                i10++;
            }
        }
    }

    public static final int c(byte[] bArr, int i10, int[] iArr, char[] cArr, int i11) {
        int i12 = iArr[bArr[i10] & 255];
        cArr[i11] = (char) (i12 >> 8);
        cArr[i11 + 1] = (char) (i12 & 255);
        return i11 + 2;
    }

    public static byte[] d(String str) {
        byte[] bArr;
        byte[] bArr2;
        d format = d.f43139d;
        kotlin.jvm.internal.i.e(format, "format");
        int length = str.length();
        AbstractC2670b.a.a(0, length, str.length());
        if (length == 0) {
            return new byte[0];
        }
        d.a aVar = format.f43141b;
        if (aVar.f43144a) {
            if (aVar.f43145b) {
                if ((length & 1) != 0) {
                    bArr2 = null;
                } else {
                    int i10 = length >> 1;
                    bArr2 = new byte[i10];
                    int i11 = 0;
                    for (int i12 = 0; i12 < i10; i12++) {
                        bArr2[i12] = f(i11, str);
                        i11 += 2;
                    }
                }
                bArr = bArr2;
            } else {
                long j = 0;
                long j10 = j + 2 + j + j;
                long j11 = length;
                int i13 = (int) ((j11 + j) / j10);
                if ((((long) i13) * j10) - j != j11) {
                    bArr = null;
                } else {
                    bArr = new byte[i13];
                    int i14 = i13 - 1;
                    int i15 = 0;
                    for (int i16 = 0; i16 < i14; i16++) {
                        bArr[i16] = f(i15, str);
                        i15 += 2;
                    }
                    bArr[i14] = f(i15, str);
                }
            }
            if (bArr != null) {
                return bArr;
            }
        }
        if (length <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        long j12 = 0;
        long j13 = 2 + j12 + j12;
        long j14 = BrazeLogger.SUPPRESS;
        long j15 = ((j14 - 1) * j12) + (j13 * j14);
        long j16 = length;
        long jK = k(1, j16, j15);
        long j17 = j16 - ((1 + j15) * jK);
        long jK2 = k(2, j17, j15);
        long j18 = j17 - ((j15 + ((long) 2)) * jK2);
        int i17 = 0;
        long jK3 = k(0, j18, j13);
        int i18 = (int) (((long) (j18 - ((j13 + j12) * jK3) > 0 ? 1 : 0)) + (jK2 * j14) + (jK * j14) + jK3);
        byte[] bArr3 = new byte[i18];
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        while (i19 < length) {
            if (i21 == Integer.MAX_VALUE) {
                if (str.charAt(i19) == '\r') {
                    int i23 = i19 + 1;
                    i19 = (i23 >= length || str.charAt(i23) != '\n') ? i23 : i19 + 2;
                } else {
                    if (str.charAt(i19) != '\n') {
                        StringBuilder sbE = A8.f.e(i19, "Expected a new line at index ", ", but was ");
                        sbE.append(str.charAt(i19));
                        throw new NumberFormatException(sbE.toString());
                    }
                    i19++;
                }
                i21 = i17;
                i22 = i21;
            } else if (i22 == Integer.MAX_VALUE) {
                for (int i24 = i17; i24 < 2; i24++) {
                    if (!O.h.g("  ".charAt(i24), str.charAt(i19 + i24), aVar.f43146c)) {
                        int i25 = 2 + i19;
                        if (i25 <= length) {
                            length = i25;
                        }
                        String strSubstring = str.substring(i19, length);
                        kotlin.jvm.internal.i.d(strSubstring, "substring(...)");
                        throw new NumberFormatException("Expected group separator \"  \" at index " + i19 + ", but was " + strSubstring);
                    }
                }
                i19 += 2;
                i22 = 0;
            }
            i21++;
            i22++;
            if (length - 2 < i19) {
                i(str, i19, length, "exactly", 2);
                throw null;
            }
            bArr3[i20] = f(i19, str);
            i19 += 2;
            i20++;
            i17 = 0;
        }
        if (i20 == i18) {
            return bArr3;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr3, i20);
        kotlin.jvm.internal.i.d(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    public static long e(String str, int i10, int i11) {
        d format = d.f43139d;
        kotlin.jvm.internal.i.e(format, "format");
        AbstractC2670b.a.a(i10, i11, str.length());
        if (format.f43142c.f43148a) {
            b(str, i10, i11);
            return g(str, i10, i11);
        }
        if (i11 - i10 > 0) {
            b(str, i10, i11);
            return g(str, i10, i11);
        }
        String strSubstring = str.substring(i10, i11);
        kotlin.jvm.internal.i.d(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected a hexadecimal number with prefix \"\" and suffix \"\", but was ".concat(strSubstring));
    }

    public static final byte f(int i10, String str) {
        int[] iArr;
        int i11;
        int i12;
        char cCharAt = str.charAt(i10);
        if ((cCharAt >>> '\b') != 0 || (i11 = (iArr = f43137c)[cCharAt]) < 0) {
            h(i10, str);
            throw null;
        }
        int i13 = i10 + 1;
        char cCharAt2 = str.charAt(i13);
        if ((cCharAt2 >>> '\b') == 0 && (i12 = iArr[cCharAt2]) >= 0) {
            return (byte) ((i11 << 4) | i12);
        }
        h(i13, str);
        throw null;
    }

    public static final long g(String str, int i10, int i11) {
        long j = 0;
        while (i10 < i11) {
            long j10 = j << 4;
            char cCharAt = str.charAt(i10);
            if ((cCharAt >>> '\b') == 0) {
                long j11 = f43138d[cCharAt];
                if (j11 >= 0) {
                    j = j10 | j11;
                    i10++;
                }
            }
            h(i10, str);
            throw null;
        }
        return j;
    }

    public static final void h(int i10, String str) {
        StringBuilder sbE = A8.f.e(i10, "Expected a hexadecimal digit at index ", ", but was ");
        sbE.append(str.charAt(i10));
        throw new NumberFormatException(sbE.toString());
    }

    public static final void i(String str, int i10, int i11, String str2, int i12) {
        String strSubstring = str.substring(i10, i11);
        kotlin.jvm.internal.i.d(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected " + str2 + ' ' + i12 + " hexadecimal digits at index " + i10 + ", but was \"" + strSubstring + "\" of length " + (i11 - i10));
    }

    public static final int j(String str, char[] cArr, int i10) {
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                str.getChars(0, str.length(), cArr, i10);
            } else {
                cArr[i10] = str.charAt(0);
            }
        }
        return str.length() + i10;
    }

    public static final long k(int i10, long j, long j10) {
        if (j <= 0 || j10 <= 0) {
            return 0L;
        }
        long j11 = i10;
        return (j + j11) / (j10 + j11);
    }
}
