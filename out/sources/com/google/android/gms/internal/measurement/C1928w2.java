package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.w2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1928w2 {
    public static double a(int i10, byte[] bArr) {
        return Double.longBitsToDouble(q(i10, bArr));
    }

    public static int b(int i10, byte[] bArr, int i11, int i12, C1921v2 c1921v2) throws zzkb {
        if ((i10 >>> 3) == 0) {
            throw new zzkb("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            return p(bArr, i11, c1921v2);
        }
        if (i13 == 1) {
            return i11 + 8;
        }
        if (i13 == 2) {
            return o(bArr, i11, c1921v2) + c1921v2.f25890a;
        }
        if (i13 != 3) {
            if (i13 == 5) {
                return i11 + 4;
            }
            throw new zzkb("Protocol message contained an invalid tag (zero).");
        }
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (i11 < i12) {
            i11 = o(bArr, i11, c1921v2);
            i15 = c1921v2.f25890a;
            if (i15 == i14) {
                break;
            }
            i11 = b(i15, bArr, i11, i12, c1921v2);
        }
        if (i11 > i12 || i15 != i14) {
            throw zzkb.c();
        }
        return i11;
    }

    public static int c(int i10, byte[] bArr, int i11, int i12, V2<?> v10, C1921v2 c1921v2) {
        O2 o10 = (O2) v10;
        int iO = o(bArr, i11, c1921v2);
        o10.e(c1921v2.f25890a);
        while (iO < i12) {
            int iO2 = o(bArr, iO, c1921v2);
            if (i10 != c1921v2.f25890a) {
                break;
            }
            iO = o(bArr, iO2, c1921v2);
            o10.e(c1921v2.f25890a);
        }
        return iO;
    }

    public static int d(int i10, byte[] bArr, int i11, int i12, S3 s10, C1921v2 c1921v2) throws zzkb {
        if ((i10 >>> 3) == 0) {
            throw new zzkb("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iP = p(bArr, i11, c1921v2);
            s10.c(i10, Long.valueOf(c1921v2.f25891b));
            return iP;
        }
        if (i13 == 1) {
            s10.c(i10, Long.valueOf(q(i11, bArr)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iO = o(bArr, i11, c1921v2);
            int i14 = c1921v2.f25890a;
            if (i14 < 0) {
                throw zzkb.b();
            }
            if (i14 > bArr.length - iO) {
                throw zzkb.d();
            }
            if (i14 == 0) {
                s10.c(i10, zzij.f26049b);
            } else {
                s10.c(i10, zzij.q(bArr, iO, i14));
            }
            return iO + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw new zzkb("Protocol message contained an invalid tag (zero).");
            }
            s10.c(i10, Integer.valueOf(n(i11, bArr)));
            return i11 + 4;
        }
        S3 s11 = new S3();
        int i15 = (i10 & (-8)) | 4;
        int i16 = 0;
        while (i11 < i12) {
            int iO2 = o(bArr, i11, c1921v2);
            int i17 = c1921v2.f25890a;
            i16 = i17;
            if (i17 == i15) {
                i11 = iO2;
                break;
            }
            int iD = d(i16, bArr, iO2, i12, s11, c1921v2);
            i16 = i17;
            i11 = iD;
        }
        if (i11 > i12 || i16 != i15) {
            throw zzkb.c();
        }
        s10.c(i10, s11);
        return i11;
    }

    public static int e(int i10, byte[] bArr, int i11, C1921v2 c1921v2) {
        int i12 = i10 & 127;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            c1921v2.f25890a = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & 127) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            c1921v2.f25890a = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & 127) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            c1921v2.f25890a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & 127) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            c1921v2.f25890a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                c1921v2.f25890a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static int f(E3<?> e10, int i10, byte[] bArr, int i11, int i12, V2<?> v10, C1921v2 c1921v2) throws IOException {
        Object objH = e10.h();
        int i13 = i(objH, e10, bArr, i11, i12, c1921v2);
        e10.d(objH);
        c1921v2.f25892c = objH;
        v10.add(objH);
        while (i13 < i12) {
            int iO = o(bArr, i13, c1921v2);
            if (i10 != c1921v2.f25890a) {
                break;
            }
            Object objH2 = e10.h();
            int i14 = i(objH2, e10, bArr, iO, i12, c1921v2);
            e10.d(objH2);
            c1921v2.f25892c = objH2;
            v10.add(objH2);
            i13 = i14;
        }
        return i13;
    }

    public static int g(E3 e10, byte[] bArr, int i10, int i11, int i12, C1921v2 c1921v2) throws IOException {
        Object objH = e10.h();
        int iH = h(objH, e10, bArr, i10, i11, i12, c1921v2);
        e10.d(objH);
        c1921v2.f25892c = objH;
        return iH;
    }

    public static int h(Object obj, E3 e10, byte[] bArr, int i10, int i11, int i12, C1921v2 c1921v2) throws IOException {
        int iK = ((C1915u3) e10).k(obj, bArr, i10, i11, i12, c1921v2);
        c1921v2.f25892c = obj;
        return iK;
    }

    public static int i(Object obj, E3 e10, byte[] bArr, int i10, int i11, C1921v2 c1921v2) throws IOException {
        int iE = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iE = e(i12, bArr, iE, c1921v2);
            i12 = c1921v2.f25890a;
        }
        int i13 = iE;
        if (i12 < 0 || i12 > i11 - i13) {
            throw zzkb.d();
        }
        int i14 = i12 + i13;
        e10.b(obj, bArr, i13, i14, c1921v2);
        c1921v2.f25892c = obj;
        return i14;
    }

    public static int j(byte[] bArr, int i10, C1921v2 c1921v2) throws zzkb {
        int iO = o(bArr, i10, c1921v2);
        int i11 = c1921v2.f25890a;
        if (i11 < 0) {
            throw zzkb.b();
        }
        if (i11 > bArr.length - iO) {
            throw zzkb.d();
        }
        if (i11 == 0) {
            c1921v2.f25892c = zzij.f26049b;
            return iO;
        }
        c1921v2.f25892c = zzij.q(bArr, iO, i11);
        return iO + i11;
    }

    public static int k(byte[] bArr, int i10, V2<?> v10, C1921v2 c1921v2) throws IOException {
        O2 o10 = (O2) v10;
        int iO = o(bArr, i10, c1921v2);
        int i11 = c1921v2.f25890a + iO;
        while (iO < i11) {
            iO = o(bArr, iO, c1921v2);
            o10.e(c1921v2.f25890a);
        }
        if (iO == i11) {
            return iO;
        }
        throw zzkb.d();
    }

    public static float l(int i10, byte[] bArr) {
        return Float.intBitsToFloat(n(i10, bArr));
    }

    public static int m(byte[] bArr, int i10, C1921v2 c1921v2) throws zzkb {
        int iO = o(bArr, i10, c1921v2);
        int i11 = c1921v2.f25890a;
        if (i11 < 0) {
            throw zzkb.b();
        }
        if (i11 == 0) {
            c1921v2.f25892c = "";
            return iO;
        }
        Z3.f25650a.getClass();
        if ((iO | i11 | ((bArr.length - iO) - i11)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(iO), Integer.valueOf(i11)));
        }
        int i12 = iO + i11;
        char[] cArr = new char[i11];
        int i13 = 0;
        while (iO < i12) {
            byte b10 = bArr[iO];
            if (b10 < 0) {
                break;
            }
            iO++;
            cArr[i13] = (char) b10;
            i13++;
        }
        while (iO < i12) {
            int i14 = iO + 1;
            byte b11 = bArr[iO];
            if (b11 >= 0) {
                int i15 = i13 + 1;
                cArr[i13] = (char) b11;
                while (i14 < i12) {
                    byte b12 = bArr[i14];
                    if (b12 < 0) {
                        break;
                    }
                    i14++;
                    cArr[i15] = (char) b12;
                    i15++;
                }
                i13 = i15;
                iO = i14;
            } else if (b11 < -32) {
                if (i14 >= i12) {
                    throw zzkb.a();
                }
                iO += 2;
                byte b13 = bArr[i14];
                int i16 = i13 + 1;
                if (b11 < -62 || H3.c.n(b13)) {
                    throw zzkb.a();
                }
                cArr[i13] = (char) ((b13 & 63) | ((b11 & 31) << 6));
                i13 = i16;
            } else {
                if (b11 >= -16) {
                    if (i14 >= i12 - 2) {
                        throw zzkb.a();
                    }
                    byte b14 = bArr[i14];
                    int i17 = iO + 3;
                    byte b15 = bArr[iO + 2];
                    iO += 4;
                    byte b16 = bArr[i17];
                    int i18 = i13 + 1;
                    if (!H3.c.n(b14)) {
                        if ((((b14 + 112) + (b11 << 28)) >> 30) == 0 && !H3.c.n(b15) && !H3.c.n(b16)) {
                            int i19 = ((b14 & 63) << 12) | ((b11 & 7) << 18) | ((b15 & 63) << 6) | (b16 & 63);
                            cArr[i13] = (char) ((i19 >>> 10) + 55232);
                            cArr[i18] = (char) ((i19 & 1023) + 56320);
                            i13 += 2;
                        }
                    }
                    throw zzkb.a();
                }
                if (i14 >= i12 - 1) {
                    throw zzkb.a();
                }
                int i20 = iO + 2;
                byte b17 = bArr[i14];
                iO += 3;
                byte b18 = bArr[i20];
                int i21 = i13 + 1;
                if (H3.c.n(b17) || ((b11 == -32 && b17 < -96) || ((b11 == -19 && b17 >= -96) || H3.c.n(b18)))) {
                    throw zzkb.a();
                }
                cArr[i13] = (char) (((b17 & 63) << 6) | ((b11 & 15) << 12) | (b18 & 63));
                i13 = i21;
            }
        }
        c1921v2.f25892c = new String(cArr, 0, i13);
        return i12;
    }

    public static int n(int i10, byte[] bArr) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static int o(byte[] bArr, int i10, C1921v2 c1921v2) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return e(b10, bArr, i11, c1921v2);
        }
        c1921v2.f25890a = b10;
        return i11;
    }

    public static int p(byte[] bArr, int i10, C1921v2 c1921v2) {
        int i11 = i10 + 1;
        long j = bArr[i10];
        if (j >= 0) {
            c1921v2.f25891b = j;
            return i11;
        }
        int i12 = i10 + 2;
        byte b10 = bArr[i11];
        long j10 = (j & 127) | (((long) (b10 & 127)) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            i13 += 7;
            j10 |= ((long) (b11 & 127)) << i13;
            b10 = b11;
            i12 = i14;
        }
        c1921v2.f25891b = j10;
        return i12;
    }

    public static long q(int i10, byte[] bArr) {
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }
}
