package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.l0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1984l0 {
    public static int a(byte[] bArr, int i10, C1981k0 c1981k0) throws zzfq {
        int iH = h(bArr, i10, c1981k0);
        int i11 = c1981k0.f26203a;
        if (i11 < 0) {
            throw new zzfq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 > bArr.length - iH) {
            throw new zzfq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i11 == 0) {
            c1981k0.f26205c = zzei.f26345b;
            return iH;
        }
        c1981k0.f26205c = zzei.B(bArr, iH, i11);
        return iH + i11;
    }

    public static int b(int i10, byte[] bArr) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    public static int c(InterfaceC1994o1 interfaceC1994o1, byte[] bArr, int i10, int i11, int i12, C1981k0 c1981k0) throws IOException {
        I0 i0Z = interfaceC1994o1.z();
        int iL = l(i0Z, interfaceC1994o1, bArr, i10, i11, i12, c1981k0);
        interfaceC1994o1.b(i0Z);
        c1981k0.f26205c = i0Z;
        return iL;
    }

    public static int d(InterfaceC1994o1 interfaceC1994o1, int i10, byte[] bArr, int i11, int i12, N0 n10, C1981k0 c1981k0) throws IOException {
        I0 i0Z = interfaceC1994o1.z();
        int iM = m(i0Z, interfaceC1994o1, bArr, i11, i12, c1981k0);
        interfaceC1994o1.b(i0Z);
        c1981k0.f26205c = i0Z;
        n10.add(i0Z);
        while (iM < i12) {
            int iH = h(bArr, iM, c1981k0);
            if (i10 != c1981k0.f26203a) {
                break;
            }
            I0 i0Z2 = interfaceC1994o1.z();
            int iM2 = m(i0Z2, interfaceC1994o1, bArr, iH, i12, c1981k0);
            interfaceC1994o1.b(i0Z2);
            c1981k0.f26205c = i0Z2;
            n10.add(i0Z2);
            iM = iM2;
        }
        return iM;
    }

    public static int e(byte[] bArr, int i10, N0 n10, C1981k0 c1981k0) throws IOException {
        J0 j10 = (J0) n10;
        int iH = h(bArr, i10, c1981k0);
        int i11 = c1981k0.f26203a + iH;
        while (iH < i11) {
            iH = h(bArr, iH, c1981k0);
            j10.g(c1981k0.f26203a);
        }
        if (iH == i11) {
            return iH;
        }
        throw new zzfq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a3 A[PHI: r5
      0x00a3: PHI (r5v6 byte) = (r5v5 byte), (r5v9 byte) binds: [B:45:0x009e, B:47:0x00a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:89:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00bb A[SYNTHETIC] */
    public static int f(byte[] bArr, int i10, C1981k0 c1981k0) throws zzfq {
        int iH = h(bArr, i10, c1981k0);
        int i11 = c1981k0.f26203a;
        if (i11 < 0) {
            throw new zzfq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 == 0) {
            c1981k0.f26205c = "";
            return iH;
        }
        int i12 = E1.f26125a;
        int length = bArr.length;
        if ((((length - iH) - i11) | iH | i11) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iH), Integer.valueOf(i11)));
        }
        int i13 = iH + i11;
        char[] cArr = new char[i11];
        int i14 = 0;
        while (iH < i13) {
            byte b10 = bArr[iH];
            if (b10 < 0) {
                break;
            }
            iH++;
            cArr[i14] = (char) b10;
            i14++;
        }
        while (iH < i13) {
            int i15 = iH + 1;
            byte b11 = bArr[iH];
            if (b11 >= 0) {
                cArr[i14] = (char) b11;
                i14++;
                iH = i15;
                while (iH < i13) {
                    byte b12 = bArr[iH];
                    if (b12 < 0) {
                        break;
                    }
                    iH++;
                    cArr[i14] = (char) b12;
                    i14++;
                }
            } else {
                if (b11 >= -32) {
                    if (b11 >= -16) {
                        if (i15 >= i13 - 2) {
                            throw new zzfq("Protocol message had invalid UTF-8.");
                        }
                        byte b13 = bArr[i15];
                        int i16 = iH + 3;
                        byte b14 = bArr[iH + 2];
                        iH += 4;
                        byte b15 = bArr[i16];
                        if (!p241t7.b.x(b13)) {
                            if ((((b13 + 112) + (b11 << 28)) >> 30) == 0 && !p241t7.b.x(b14) && !p241t7.b.x(b15)) {
                                int i17 = ((b13 & 63) << 12) | ((b11 & 7) << 18) | ((b14 & 63) << 6) | (b15 & 63);
                                cArr[i14] = (char) ((i17 >>> 10) + 55232);
                                cArr[i14 + 1] = (char) ((i17 & 1023) + 56320);
                                i14 += 2;
                            }
                        }
                        throw new zzfq("Protocol message had invalid UTF-8.");
                    }
                    if (i15 >= i13 - 1) {
                        throw new zzfq("Protocol message had invalid UTF-8.");
                    }
                    int i18 = i14 + 1;
                    int i19 = iH + 2;
                    byte b16 = bArr[i15];
                    iH += 3;
                    byte b17 = bArr[i19];
                    if (!p241t7.b.x(b16)) {
                        if (b11 != -32) {
                            if (b11 != -19) {
                                if (!p241t7.b.x(b17)) {
                                    cArr[i14] = (char) (((b16 & 63) << 6) | ((b11 & 15) << 12) | (b17 & 63));
                                    i14 = i18;
                                }
                            } else if (b16 < -96) {
                                b11 = -19;
                                if (!p241t7.b.x(b17)) {
                                    cArr[i14] = (char) (((b16 & 63) << 6) | ((b11 & 15) << 12) | (b17 & 63));
                                    i14 = i18;
                                }
                            }
                        } else if (b16 >= -96) {
                            b11 = -32;
                            if (b11 != -19) {
                                if (!p241t7.b.x(b17)) {
                                    cArr[i14] = (char) (((b16 & 63) << 6) | ((b11 & 15) << 12) | (b17 & 63));
                                    i14 = i18;
                                }
                            } else if (b16 < -96) {
                                b11 = -19;
                                if (!p241t7.b.x(b17)) {
                                    cArr[i14] = (char) (((b16 & 63) << 6) | ((b11 & 15) << 12) | (b17 & 63));
                                    i14 = i18;
                                }
                            }
                        }
                    }
                    throw new zzfq("Protocol message had invalid UTF-8.");
                }
                if (i15 >= i13) {
                    throw new zzfq("Protocol message had invalid UTF-8.");
                }
                int i20 = i14 + 1;
                iH += 2;
                byte b18 = bArr[i15];
                if (b11 < -62 || p241t7.b.x(b18)) {
                    throw new zzfq("Protocol message had invalid UTF-8.");
                }
                cArr[i14] = (char) ((b18 & 63) | ((b11 & 31) << 6));
                i14 = i20;
            }
        }
        c1981k0.f26205c = new String(cArr, 0, i14);
        return i13;
    }

    public static int g(int i10, byte[] bArr, int i11, int i12, C2020x1 c2020x1, C1981k0 c1981k0) throws zzfq {
        if ((i10 >>> 3) == 0) {
            throw new zzfq("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iK = k(bArr, i11, c1981k0);
            c2020x1.c(i10, Long.valueOf(c1981k0.f26204b));
            return iK;
        }
        if (i13 == 1) {
            c2020x1.c(i10, Long.valueOf(n(i11, bArr)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iH = h(bArr, i11, c1981k0);
            int i14 = c1981k0.f26203a;
            if (i14 < 0) {
                throw new zzfq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i14 > bArr.length - iH) {
                throw new zzfq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i14 == 0) {
                c2020x1.c(i10, zzei.f26345b);
            } else {
                c2020x1.c(i10, zzei.B(bArr, iH, i14));
            }
            return iH + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw new zzfq("Protocol message contained an invalid tag (zero).");
            }
            c2020x1.c(i10, Integer.valueOf(b(i11, bArr)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        C2020x1 c2020x1B = C2020x1.b();
        int i16 = c1981k0.f26207e + 1;
        c1981k0.f26207e = i16;
        if (i16 >= 100) {
            throw new zzfq("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i17 = 0;
        while (i11 < i12) {
            int iH2 = h(bArr, i11, c1981k0);
            i17 = c1981k0.f26203a;
            if (i17 == i15) {
                i11 = iH2;
                break;
            }
            i11 = g(i17, bArr, iH2, i12, c2020x1B, c1981k0);
        }
        c1981k0.f26207e--;
        if (i11 > i12 || i17 != i15) {
            throw new zzfq("Failed to parse the message.");
        }
        c2020x1.c(i10, c2020x1B);
        return i11;
    }

    public static int h(byte[] bArr, int i10, C1981k0 c1981k0) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return i(b10, bArr, i11, c1981k0);
        }
        c1981k0.f26203a = b10;
        return i11;
    }

    public static int i(int i10, byte[] bArr, int i11, C1981k0 c1981k0) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b10 >= 0) {
            c1981k0.f26203a = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & 127) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            c1981k0.f26203a = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & 127) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            c1981k0.f26203a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & 127) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            c1981k0.f26203a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                c1981k0.f26203a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static int j(int i10, byte[] bArr, int i11, int i12, N0 n10, C1981k0 c1981k0) {
        J0 j10 = (J0) n10;
        int iH = h(bArr, i11, c1981k0);
        j10.g(c1981k0.f26203a);
        while (iH < i12) {
            int iH2 = h(bArr, iH, c1981k0);
            if (i10 != c1981k0.f26203a) {
                break;
            }
            iH = h(bArr, iH2, c1981k0);
            j10.g(c1981k0.f26203a);
        }
        return iH;
    }

    public static int k(byte[] bArr, int i10, C1981k0 c1981k0) {
        long j = bArr[i10];
        int i11 = i10 + 1;
        if (j >= 0) {
            c1981k0.f26204b = j;
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
        c1981k0.f26204b = j10;
        return i12;
    }

    public static int l(Object obj, InterfaceC1994o1 interfaceC1994o1, byte[] bArr, int i10, int i11, int i12, C1981k0 c1981k0) throws IOException {
        C1976i1 c1976i1 = (C1976i1) interfaceC1994o1;
        int i13 = c1981k0.f26207e + 1;
        c1981k0.f26207e = i13;
        if (i13 >= 100) {
            throw new zzfq("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iS = c1976i1.s(obj, bArr, i10, i11, i12, c1981k0);
        c1981k0.f26207e--;
        c1981k0.f26205c = obj;
        return iS;
    }

    public static int m(Object obj, InterfaceC1994o1 interfaceC1994o1, byte[] bArr, int i10, int i11, C1981k0 c1981k0) throws IOException {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = i(i13, bArr, i12, c1981k0);
            i13 = c1981k0.f26203a;
        }
        int i14 = i12;
        if (i13 < 0 || i13 > i11 - i14) {
            throw new zzfq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i15 = c1981k0.f26207e + 1;
        c1981k0.f26207e = i15;
        if (i15 >= 100) {
            throw new zzfq("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i16 = i13 + i14;
        interfaceC1994o1.h(obj, bArr, i14, i16, c1981k0);
        c1981k0.f26207e--;
        c1981k0.f26205c = obj;
        return i16;
    }

    public static long n(int i10, byte[] bArr) {
        return (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }
}
