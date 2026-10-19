package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class Utf8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f17175a;

    public static class UnpairedSurrogateException extends IllegalArgumentException {
        public UnpairedSurrogateException(int i10, int i11) {
            super(A8.f.d(i10, i11, "Unpaired surrogate at index ", " of "));
        }
    }

    public static class a {
        public static void a(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) throws InvalidProtocolBufferException {
            if (!e(b11)) {
                if ((((b11 + 112) + (b10 << 28)) >> 30) == 0 && !e(b12) && !e(b13)) {
                    int i11 = ((b10 & 7) << 18) | ((b11 & 63) << 12) | ((b12 & 63) << 6) | (b13 & 63);
                    cArr[i10] = (char) ((i11 >>> 10) + 55232);
                    cArr[i10 + 1] = (char) ((i11 & 1023) + 56320);
                    return;
                }
            }
            throw InvalidProtocolBufferException.a();
        }

        public static boolean b(byte b10) {
            return b10 >= 0;
        }

        public static void c(byte b10, byte b11, char[] cArr, int i10) throws InvalidProtocolBufferException {
            if (b10 < -62 || e(b11)) {
                throw InvalidProtocolBufferException.a();
            }
            cArr[i10] = (char) (((b10 & 31) << 6) | (b11 & 63));
        }

        public static void d(byte b10, byte b11, byte b12, char[] cArr, int i10) throws InvalidProtocolBufferException {
            if (e(b11) || ((b10 == -32 && b11 < -96) || ((b10 == -19 && b11 >= -96) || e(b12)))) {
                throw InvalidProtocolBufferException.a();
            }
            cArr[i10] = (char) (((b10 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63));
        }

        public static boolean e(byte b10) {
            return b10 > -65;
        }
    }

    public static abstract class b {
        public abstract String a(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException;

        public abstract int b(String str, byte[] bArr, int i10, int i11);

        public abstract int c(byte[] bArr, int i10, int i11);
    }

    public static final class c extends b {
        @Override // androidx.datastore.preferences.protobuf.Utf8.b
        public final String a(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
            if ((i10 | i11 | ((bArr.length - i10) - i11)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            int i12 = i10 + i11;
            char[] cArr = new char[i11];
            int i13 = 0;
            while (i10 < i12) {
                byte b10 = bArr[i10];
                if (!a.b(b10)) {
                    break;
                }
                i10++;
                cArr[i13] = (char) b10;
                i13++;
            }
            int i14 = i13;
            while (i10 < i12) {
                int i15 = i10 + 1;
                byte b11 = bArr[i10];
                if (a.b(b11)) {
                    int i16 = i14 + 1;
                    cArr[i14] = (char) b11;
                    while (i15 < i12) {
                        byte b12 = bArr[i15];
                        if (!a.b(b12)) {
                            break;
                        }
                        i15++;
                        cArr[i16] = (char) b12;
                        i16++;
                    }
                    i14 = i16;
                    i10 = i15;
                } else if (b11 < -32) {
                    if (i15 >= i12) {
                        throw InvalidProtocolBufferException.a();
                    }
                    i10 += 2;
                    a.c(b11, bArr[i15], cArr, i14);
                    i14++;
                } else if (b11 < -16) {
                    if (i15 >= i12 - 1) {
                        throw InvalidProtocolBufferException.a();
                    }
                    int i17 = i10 + 2;
                    i10 += 3;
                    a.d(b11, bArr[i15], bArr[i17], cArr, i14);
                    i14++;
                } else {
                    if (i15 >= i12 - 2) {
                        throw InvalidProtocolBufferException.a();
                    }
                    byte b13 = bArr[i15];
                    int i18 = i10 + 3;
                    byte b14 = bArr[i10 + 2];
                    i10 += 4;
                    a.a(b11, b13, b14, bArr[i18], cArr, i14);
                    i14 += 2;
                }
            }
            return new String(cArr, 0, i14);
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.b
        public final int b(String str, byte[] bArr, int i10, int i11) {
            int i12;
            int i13;
            char cCharAt;
            int length = str.length();
            int i14 = i11 + i10;
            int i15 = 0;
            while (i15 < length && (i13 = i15 + i10) < i14 && (cCharAt = str.charAt(i15)) < 128) {
                bArr[i13] = (byte) cCharAt;
                i15++;
            }
            if (i15 == length) {
                return i10 + length;
            }
            int i16 = i10 + i15;
            while (i15 < length) {
                char cCharAt2 = str.charAt(i15);
                if (cCharAt2 < 128 && i16 < i14) {
                    bArr[i16] = (byte) cCharAt2;
                    i16++;
                } else if (cCharAt2 < 2048 && i16 <= i14 - 2) {
                    int i17 = i16 + 1;
                    bArr[i16] = (byte) ((cCharAt2 >>> 6) | 960);
                    i16 += 2;
                    bArr[i17] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i16 > i14 - 3) {
                        if (i16 > i14 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i12 = i15 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i12)))) {
                                throw new UnpairedSurrogateException(i15, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i16);
                        }
                        int i18 = i15 + 1;
                        if (i18 != str.length()) {
                            char cCharAt3 = str.charAt(i18);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i16] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i16 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i19 = i16 + 3;
                                bArr[i16 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i16 += 4;
                                bArr[i19] = (byte) ((codePoint & 63) | 128);
                                i15 = i18;
                            } else {
                                i15 = i18;
                            }
                        }
                        throw new UnpairedSurrogateException(i15 - 1, length);
                    }
                    bArr[i16] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int i20 = i16 + 2;
                    bArr[i16 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    i16 += 3;
                    bArr[i20] = (byte) ((cCharAt2 & '?') | 128);
                }
                i15++;
            }
            return i16;
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.b
        public final int c(byte[] bArr, int i10, int i11) {
            while (i10 < i11 && bArr[i10] >= 0) {
                i10++;
            }
            if (i10 >= i11) {
                return 0;
            }
            while (i10 < i11) {
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 < 0) {
                    if (b10 < -32) {
                        if (i12 >= i11) {
                            return b10;
                        }
                        if (b10 >= -62) {
                            i10 += 2;
                            if (bArr[i12] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b10 < -16) {
                        if (i12 >= i11 - 1) {
                            return Utf8.a(bArr, i12, i11);
                        }
                        int i13 = i10 + 2;
                        byte b11 = bArr[i12];
                        if (b11 <= -65 && ((b10 != -32 || b11 >= -96) && (b10 != -19 || b11 < -96))) {
                            i10 += 3;
                            if (bArr[i13] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (i12 >= i11 - 2) {
                        return Utf8.a(bArr, i12, i11);
                    }
                    int i14 = i10 + 2;
                    byte b12 = bArr[i12];
                    if (b12 <= -65) {
                        if ((((b12 + 112) + (b10 << 28)) >> 30) == 0) {
                            int i15 = i10 + 3;
                            if (bArr[i14] <= -65) {
                                i10 += 4;
                                if (bArr[i15] > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
                i10 = i12;
            }
            return 0;
        }
    }

    public static final class d extends b {
        public static int d(long j, byte[] bArr, int i10, int i11) {
            if (i11 == 0) {
                b bVar = Utf8.f17175a;
                if (i10 > -12) {
                    return -1;
                }
                return i10;
            }
            if (i11 == 1) {
                return Utf8.c(i10, g0.f(bArr, j));
            }
            if (i11 == 2) {
                return Utf8.d(i10, g0.f(bArr, j), g0.f(bArr, j + 1));
            }
            throw new AssertionError();
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.b
        public final String a(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
            if ((i10 | i11 | ((bArr.length - i10) - i11)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            int i12 = i10 + i11;
            char[] cArr = new char[i11];
            int i13 = 0;
            while (i10 < i12) {
                byte bF = g0.f(bArr, i10);
                if (!a.b(bF)) {
                    break;
                }
                i10++;
                cArr[i13] = (char) bF;
                i13++;
            }
            int i14 = i13;
            while (i10 < i12) {
                int i15 = i10 + 1;
                byte bF2 = g0.f(bArr, i10);
                if (a.b(bF2)) {
                    int i16 = i14 + 1;
                    cArr[i14] = (char) bF2;
                    while (i15 < i12) {
                        byte bF3 = g0.f(bArr, i15);
                        if (!a.b(bF3)) {
                            break;
                        }
                        i15++;
                        cArr[i16] = (char) bF3;
                        i16++;
                    }
                    i14 = i16;
                    i10 = i15;
                } else if (bF2 < -32) {
                    if (i15 >= i12) {
                        throw InvalidProtocolBufferException.a();
                    }
                    i10 += 2;
                    a.c(bF2, g0.f(bArr, i15), cArr, i14);
                    i14++;
                } else if (bF2 < -16) {
                    if (i15 >= i12 - 1) {
                        throw InvalidProtocolBufferException.a();
                    }
                    int i17 = i10 + 2;
                    i10 += 3;
                    a.d(bF2, g0.f(bArr, i15), g0.f(bArr, i17), cArr, i14);
                    i14++;
                } else {
                    if (i15 >= i12 - 2) {
                        throw InvalidProtocolBufferException.a();
                    }
                    byte bF4 = g0.f(bArr, i15);
                    int i18 = i10 + 3;
                    byte bF5 = g0.f(bArr, i10 + 2);
                    i10 += 4;
                    a.a(bF2, bF4, bF5, g0.f(bArr, i18), cArr, i14);
                    i14 += 2;
                }
            }
            return new String(cArr, 0, i14);
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.b
        public final int b(String str, byte[] bArr, int i10, int i11) {
            long j;
            String str2;
            String str3;
            int i12;
            long j10;
            char cCharAt;
            long j11 = i10;
            long j12 = ((long) i11) + j11;
            int length = str.length();
            String str4 = " at index ";
            String str5 = "Failed writing ";
            if (length > i11 || bArr.length - i11 < i10) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length - 1) + " at index " + (i10 + i11));
            }
            int i13 = 0;
            while (true) {
                j = 1;
                if (i13 >= length || (cCharAt = str.charAt(i13)) >= 128) {
                    break;
                }
                g0.m(bArr, j11, (byte) cCharAt);
                i13++;
                j11 = 1 + j11;
            }
            if (i13 == length) {
                return (int) j11;
            }
            while (i13 < length) {
                char cCharAt2 = str.charAt(i13);
                if (cCharAt2 >= 128 || j11 >= j12) {
                    if (cCharAt2 >= 2048 || j11 > j12 - 2) {
                        str2 = str4;
                        str3 = str5;
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j11 > j12 - 3) {
                            if (j11 > j12 - 4) {
                                if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i12 = i13 + 1) == length || !Character.isSurrogatePair(cCharAt2, str.charAt(i12)))) {
                                    throw new UnpairedSurrogateException(i13, length);
                                }
                                throw new ArrayIndexOutOfBoundsException(str3 + cCharAt2 + str2 + j11);
                            }
                            int i14 = i13 + 1;
                            if (i14 != length) {
                                char cCharAt3 = str.charAt(i14);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    j10 = 1;
                                    g0.m(bArr, j11, (byte) ((codePoint >>> 18) | 240));
                                    g0.m(bArr, j11 + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j13 = j11 + 3;
                                    g0.m(bArr, j11 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    j11 += 4;
                                    g0.m(bArr, j13, (byte) ((codePoint & 63) | 128));
                                    i13 = i14;
                                } else {
                                    i13 = i14;
                                }
                            }
                            throw new UnpairedSurrogateException(i13 - 1, length);
                        }
                        g0.m(bArr, j11, (byte) ((cCharAt2 >>> '\f') | 480));
                        long j14 = j11 + 2;
                        g0.m(bArr, j11 + 1, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                        j11 += 3;
                        g0.m(bArr, j14, (byte) ((cCharAt2 & '?') | 128));
                    } else {
                        str2 = str4;
                        str3 = str5;
                        long j15 = j11 + j;
                        g0.m(bArr, j11, (byte) ((cCharAt2 >>> 6) | 960));
                        j11 += 2;
                        g0.m(bArr, j15, (byte) ((cCharAt2 & '?') | 128));
                    }
                    j10 = 1;
                } else {
                    g0.m(bArr, j11, (byte) cCharAt2);
                    str3 = str5;
                    j10 = j;
                    j11 += j;
                    str2 = str4;
                }
                i13++;
                str4 = str2;
                str5 = str3;
                j = j10;
                j12 = j12;
            }
            return (int) j11;
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.b
        public final int c(byte[] bArr, int i10, int i11) {
            int i12;
            if ((i10 | i11 | (bArr.length - i11)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            long j = i10;
            int i13 = (int) (((long) i11) - j);
            if (i13 >= 16) {
                long j10 = j;
                i12 = 0;
                while (true) {
                    if (i12 >= i13) {
                        i12 = i13;
                        break;
                    }
                    long j11 = j10 + 1;
                    if (g0.f(bArr, j10) < 0) {
                        break;
                    }
                    i12++;
                    j10 = j11;
                }
            } else {
                i12 = 0;
            }
            int i14 = i13 - i12;
            long j12 = j + ((long) i12);
            while (true) {
                byte bF = 0;
                while (i14 > 0) {
                    long j13 = j12 + 1;
                    bF = g0.f(bArr, j12);
                    if (bF < 0) {
                        j12 = j13;
                        break;
                    }
                    i14--;
                    j12 = j13;
                }
                if (i14 == 0) {
                    return 0;
                }
                int i15 = i14 - 1;
                if (bF < -32) {
                    if (i15 == 0) {
                        return bF;
                    }
                    i14 -= 2;
                    if (bF >= -62) {
                        long j14 = j12 + 1;
                        if (g0.f(bArr, j12) <= -65) {
                            j12 = j14;
                        }
                    }
                    return -1;
                }
                if (bF < -16) {
                    if (i15 < 2) {
                        return d(j12, bArr, bF, i15);
                    }
                    i14 -= 3;
                    long j15 = j12 + 1;
                    byte bF2 = g0.f(bArr, j12);
                    if (bF2 <= -65 && ((bF != -32 || bF2 >= -96) && (bF != -19 || bF2 < -96))) {
                        j12 += 2;
                        if (g0.f(bArr, j15) > -65) {
                        }
                    }
                    return -1;
                }
                if (i15 < 3) {
                    return d(j12, bArr, bF, i15);
                }
                i14 -= 4;
                long j16 = j12 + 1;
                byte bF3 = g0.f(bArr, j12);
                if (bF3 <= -65) {
                    if ((((bF3 + 112) + (bF << 28)) >> 30) == 0) {
                        long j17 = 2 + j12;
                        if (g0.f(bArr, j16) <= -65) {
                            j12 += 3;
                            if (g0.f(bArr, j17) > -65) {
                            }
                        }
                    }
                }
                return -1;
            }
        }
    }

    static {
        f17175a = (g0.f17235e && g0.f17234d && !C1314d.a()) ? new d() : new c();
    }

    public static int a(byte[] bArr, int i10, int i11) {
        byte b10 = bArr[i10 - 1];
        int i12 = i11 - i10;
        if (i12 == 0) {
            if (b10 > -12) {
                b10 = -1;
            }
            return b10;
        }
        if (i12 == 1) {
            return c(b10, bArr[i10]);
        }
        if (i12 == 2) {
            return d(b10, bArr[i10], bArr[i10 + 1]);
        }
        throw new AssertionError();
    }

    public static int b(String str) {
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && str.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (i11 < length) {
            char cCharAt = str.charAt(i11);
            if (cCharAt >= 2048) {
                int length2 = str.length();
                while (i11 < length2) {
                    char cCharAt2 = str.charAt(i11);
                    if (cCharAt2 < 2048) {
                        i10 += (127 - cCharAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i11) < 65536) {
                                throw new UnpairedSurrogateException(i11, length2);
                            }
                            i11++;
                        }
                    }
                    i11++;
                }
                i12 += i10;
                break;
            }
            i12 += (127 - cCharAt) >>> 31;
            i11++;
        }
        if (i12 >= length) {
            return i12;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i12) + 4294967296L));
    }

    public static int c(int i10, int i11) {
        if (i10 > -12 || i11 > -65) {
            return -1;
        }
        return i10 ^ (i11 << 8);
    }

    public static int d(int i10, int i11, int i12) {
        if (i10 > -12 || i11 > -65 || i12 > -65) {
            return -1;
        }
        return (i10 ^ (i11 << 8)) ^ (i12 << 16);
    }
}
