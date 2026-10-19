package p114j1;

import J4.i;
import com.google.common.collect.ImmutableSet;
import com.google.gson.internal.b;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: ParsableByteArray.java */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char[] f41059d = {'\r', '\n'};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final char[] f41060e = {'\n'};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ImmutableSet<Charset> f41061f = ImmutableSet.B(5, StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f41062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f41063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f41064c;

    public r() {
        this.f41062a = A.f40998c;
    }

    public final int A() {
        byte[] bArr = this.f41062a;
        int i10 = this.f41063b;
        int i11 = i10 + 1;
        this.f41063b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.f41063b = i10 + 2;
        return (bArr[i11] & 255) | i12;
    }

    public final long B() {
        int i10;
        int i11;
        long j = this.f41062a[this.f41063b];
        int i12 = 7;
        while (true) {
            if (i12 >= 0) {
                int i13 = 1 << i12;
                if ((((long) i13) & j) == 0) {
                    if (i12 < 6) {
                        j &= (long) (i13 - 1);
                        i11 = 7 - i12;
                        break;
                    }
                    if (i12 == 7) {
                        i11 = 1;
                        break;
                    }
                } else {
                    i12--;
                }
            }
            i11 = 0;
            break;
        }
        if (i11 == 0) {
            throw new NumberFormatException(b.b(j, "Invalid UTF-8 sequence first byte: "));
        }
        for (i10 = 1; i10 < i11; i10++) {
            byte b10 = this.f41062a[this.f41063b + i10];
            if ((b10 & 192) != 128) {
                throw new NumberFormatException(b.b(j, "Invalid UTF-8 sequence continuation byte: "));
            }
            j = (j << 6) | ((long) (b10 & 63));
        }
        this.f41063b += i11;
        return j;
    }

    public final Charset C() {
        if (a() >= 3) {
            byte[] bArr = this.f41062a;
            int i10 = this.f41063b;
            if (bArr[i10] == -17 && bArr[i10 + 1] == -69 && bArr[i10 + 2] == -65) {
                this.f41063b = i10 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f41062a;
        int i11 = this.f41063b;
        byte b10 = bArr2[i11];
        if (b10 == -2 && bArr2[i11 + 1] == -1) {
            this.f41063b = i11 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b10 != -1 || bArr2[i11 + 1] != -2) {
            return null;
        }
        this.f41063b = i11 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final void D(int i10) {
        byte[] bArr = this.f41062a;
        if (bArr.length < i10) {
            bArr = new byte[i10];
        }
        E(i10, bArr);
    }

    public final void E(int i10, byte[] bArr) {
        this.f41062a = bArr;
        this.f41064c = i10;
        this.f41063b = 0;
    }

    public final void F(int i10) {
        p241t7.b.e(i10 >= 0 && i10 <= this.f41062a.length);
        this.f41064c = i10;
    }

    public final void G(int i10) {
        p241t7.b.e(i10 >= 0 && i10 <= this.f41064c);
        this.f41063b = i10;
    }

    public final void H(int i10) {
        G(this.f41063b + i10);
    }

    public final int a() {
        return this.f41064c - this.f41063b;
    }

    public final void b(int i10) {
        byte[] bArr = this.f41062a;
        if (i10 > bArr.length) {
            this.f41062a = Arrays.copyOf(bArr, i10);
        }
    }

    public final int c() {
        return this.f41063b;
    }

    public final char d(Charset charset) {
        p241t7.b.d("Unsupported charset: " + charset, f41061f.contains(charset));
        return (char) (e(charset) >> 16);
    }

    public final int e(Charset charset) {
        byte b10;
        byte b11 = 0;
        int i10 = 1;
        if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && a() >= 1) {
            b10 = this.f41062a[this.f41063b];
        } else {
            if ((charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) && a() >= 2) {
                byte[] bArr = this.f41062a;
                int i11 = this.f41063b;
                b11 = bArr[i11];
                b10 = bArr[i11 + 1];
            } else {
                if (!charset.equals(StandardCharsets.UTF_16LE) || a() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.f41062a;
                int i12 = this.f41063b;
                b11 = bArr2[i12 + 1];
                b10 = bArr2[i12];
            }
            i10 = 2;
        }
        return ((b10 & 255) << 16) | (b11 << 24) | (i10 & 255);
    }

    public final void f(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f41062a, this.f41063b, bArr, i10, i11);
        this.f41063b += i11;
    }

    public final char g(Charset charset, char[] cArr) {
        int iE = e(charset);
        if (iE != 0) {
            char c10 = (char) (iE >> 16);
            for (char c11 : cArr) {
                if (c11 == c10) {
                    this.f41063b += iE & 65535;
                    return c10;
                }
            }
        }
        return (char) 0;
    }

    public final int h() {
        byte[] bArr = this.f41062a;
        int i10 = this.f41063b;
        int i11 = i10 + 1;
        this.f41063b = i11;
        int i12 = (bArr[i10] & 255) << 24;
        int i13 = i10 + 2;
        this.f41063b = i13;
        int i14 = ((bArr[i11] & 255) << 16) | i12;
        int i15 = i10 + 3;
        this.f41063b = i15;
        int i16 = i14 | ((bArr[i13] & 255) << 8);
        this.f41063b = i10 + 4;
        return (bArr[i15] & 255) | i16;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0091  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00af A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:46:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:66:0x00ce A[ADDED_TO_REGION, EDGE_INSN: B:66:0x00ce->B:56:0x00ce BREAK  A[LOOP:0: B:26:0x006a->B:54:0x00cb], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00ce A[ADDED_TO_REGION, EDGE_INSN: B:68:0x00ce->B:56:0x00ce BREAK  A[LOOP:0: B:26:0x006a->B:54:0x00cb], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00cb A[SYNTHETIC] */
    public final String i(Charset charset) {
        int i10;
        byte[] bArr;
        byte b10;
        byte[] bArr2;
        byte b11;
        p241t7.b.d("Unsupported charset: " + charset, f41061f.contains(charset));
        if (a() == 0) {
            return null;
        }
        Charset charset2 = StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            C();
        }
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(charset2)) {
            i10 = 1;
        } else {
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i10 = 2;
        }
        int i11 = this.f41063b;
        while (true) {
            int i12 = this.f41064c;
            if (i11 >= i12 - (i10 - 1)) {
                i11 = i12;
                break;
            }
            if (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) {
                byte b12 = this.f41062a[i11];
                int i13 = A.f40996a;
                if (b12 == 10 || b12 == 13) {
                    break;
                }
                if (!charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                    bArr = this.f41062a;
                    if (bArr[i11] == 0) {
                        b10 = bArr[i11 + 1];
                        int i14 = A.f40996a;
                        if (b10 != 10 || b10 == 13) {
                            break;
                        }
                        if (charset.equals(StandardCharsets.UTF_16LE)) {
                            bArr2 = this.f41062a;
                            if (bArr2[i11 + 1] == 0) {
                                b11 = bArr2[i11];
                                int i15 = A.f40996a;
                                if (b11 != 10 || b11 == 13) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                        i11 += i10;
                    } else {
                        if (charset.equals(StandardCharsets.UTF_16LE)) {
                            bArr2 = this.f41062a;
                            if (bArr2[i11 + 1] == 0) {
                                b11 = bArr2[i11];
                                int i16 = A.f40996a;
                                if (b11 != 10) {
                                    break;
                                }
                                break;
                                break;
                            }
                            continue;
                        }
                        i11 += i10;
                    }
                } else {
                    if (charset.equals(StandardCharsets.UTF_16LE)) {
                        bArr2 = this.f41062a;
                        if (bArr2[i11 + 1] == 0) {
                            b11 = bArr2[i11];
                            int i17 = A.f40996a;
                            if (b11 != 10) {
                                break;
                                break;
                            }
                            break;
                            break;
                        }
                        continue;
                    }
                    i11 += i10;
                }
            } else if (charset.equals(StandardCharsets.UTF_16)) {
                bArr = this.f41062a;
                if (bArr[i11] == 0) {
                    b10 = bArr[i11 + 1];
                    int i18 = A.f40996a;
                    if (b10 != 10) {
                        break;
                    }
                    break;
                    break;
                }
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    bArr2 = this.f41062a;
                    if (bArr2[i11 + 1] == 0) {
                        b11 = bArr2[i11];
                        int i19 = A.f40996a;
                        if (b11 != 10) {
                            break;
                            break;
                        }
                        break;
                        break;
                    }
                    continue;
                }
                i11 += i10;
            } else {
                bArr = this.f41062a;
                if (bArr[i11] == 0) {
                    b10 = bArr[i11 + 1];
                    int i110 = A.f40996a;
                    if (b10 != 10) {
                        break;
                        break;
                    }
                    break;
                    break;
                }
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    bArr2 = this.f41062a;
                    if (bArr2[i11 + 1] == 0) {
                        b11 = bArr2[i11];
                        int i111 = A.f40996a;
                        if (b11 != 10) {
                            break;
                            break;
                        }
                        break;
                        break;
                    }
                    continue;
                }
                i11 += i10;
            }
        }
        String strS = s(i11 - this.f41063b, charset);
        if (this.f41063b != this.f41064c && g(charset, f41059d) == '\r') {
            g(charset, f41060e);
        }
        return strS;
    }

    public final int j() {
        byte[] bArr = this.f41062a;
        int i10 = this.f41063b;
        int i11 = i10 + 1;
        this.f41063b = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i10 + 2;
        this.f41063b = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        int i15 = i10 + 3;
        this.f41063b = i15;
        int i16 = i14 | ((bArr[i13] & 255) << 16);
        this.f41063b = i10 + 4;
        return ((bArr[i15] & 255) << 24) | i16;
    }

    public final long k() {
        byte[] bArr = this.f41062a;
        int i10 = this.f41063b;
        int i11 = i10 + 1;
        this.f41063b = i11;
        long j = ((long) bArr[i10]) & 255;
        int i12 = i10 + 2;
        this.f41063b = i12;
        long j10 = j | ((((long) bArr[i11]) & 255) << 8);
        int i13 = i10 + 3;
        this.f41063b = i13;
        long j11 = j10 | ((((long) bArr[i12]) & 255) << 16);
        int i14 = i10 + 4;
        this.f41063b = i14;
        long j12 = j11 | ((((long) bArr[i13]) & 255) << 24);
        int i15 = i10 + 5;
        this.f41063b = i15;
        long j13 = j12 | ((((long) bArr[i14]) & 255) << 32);
        int i16 = i10 + 6;
        this.f41063b = i16;
        long j14 = j13 | ((((long) bArr[i15]) & 255) << 40);
        int i17 = i10 + 7;
        this.f41063b = i17;
        long j15 = j14 | ((((long) bArr[i16]) & 255) << 48);
        this.f41063b = i10 + 8;
        return ((((long) bArr[i17]) & 255) << 56) | j15;
    }

    public final long l() {
        byte[] bArr = this.f41062a;
        int i10 = this.f41063b;
        int i11 = i10 + 1;
        this.f41063b = i11;
        long j = ((long) bArr[i10]) & 255;
        int i12 = i10 + 2;
        this.f41063b = i12;
        long j10 = j | ((((long) bArr[i11]) & 255) << 8);
        int i13 = i10 + 3;
        this.f41063b = i13;
        long j11 = j10 | ((((long) bArr[i12]) & 255) << 16);
        this.f41063b = i10 + 4;
        return ((((long) bArr[i13]) & 255) << 24) | j11;
    }

    public final int m() {
        int iJ = j();
        if (iJ >= 0) {
            return iJ;
        }
        throw new IllegalStateException(i.b(iJ, "Top bit not zero: "));
    }

    public final int n() {
        byte[] bArr = this.f41062a;
        int i10 = this.f41063b;
        int i11 = i10 + 1;
        this.f41063b = i11;
        int i12 = bArr[i10] & 255;
        this.f41063b = i10 + 2;
        return ((bArr[i11] & 255) << 8) | i12;
    }

    public final long o() {
        byte[] bArr = this.f41062a;
        int i10 = this.f41063b;
        int i11 = i10 + 1;
        this.f41063b = i11;
        long j = (((long) bArr[i10]) & 255) << 56;
        int i12 = i10 + 2;
        this.f41063b = i12;
        long j10 = j | ((((long) bArr[i11]) & 255) << 48);
        int i13 = i10 + 3;
        this.f41063b = i13;
        long j11 = j10 | ((((long) bArr[i12]) & 255) << 40);
        int i14 = i10 + 4;
        this.f41063b = i14;
        long j12 = j11 | ((((long) bArr[i13]) & 255) << 32);
        int i15 = i10 + 5;
        this.f41063b = i15;
        long j13 = j12 | ((((long) bArr[i14]) & 255) << 24);
        int i16 = i10 + 6;
        this.f41063b = i16;
        long j14 = j13 | ((((long) bArr[i15]) & 255) << 16);
        int i17 = i10 + 7;
        this.f41063b = i17;
        long j15 = j14 | ((((long) bArr[i16]) & 255) << 8);
        this.f41063b = i10 + 8;
        return (((long) bArr[i17]) & 255) | j15;
    }

    public final String p() {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f41063b;
        while (i10 < this.f41064c && this.f41062a[i10] != 0) {
            i10++;
        }
        byte[] bArr = this.f41062a;
        int i11 = this.f41063b;
        int i12 = A.f40996a;
        String str = new String(bArr, i11, i10 - i11, StandardCharsets.UTF_8);
        this.f41063b = i10;
        if (i10 < this.f41064c) {
            this.f41063b = i10 + 1;
        }
        return str;
    }

    public final String q(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f41063b;
        int i12 = (i11 + i10) - 1;
        int i13 = (i12 >= this.f41064c || this.f41062a[i12] != 0) ? i10 : i10 - 1;
        byte[] bArr = this.f41062a;
        int i14 = A.f40996a;
        String str = new String(bArr, i11, i13, StandardCharsets.UTF_8);
        this.f41063b += i10;
        return str;
    }

    public final short r() {
        byte[] bArr = this.f41062a;
        int i10 = this.f41063b;
        int i11 = i10 + 1;
        this.f41063b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.f41063b = i10 + 2;
        return (short) ((bArr[i11] & 255) | i12);
    }

    public final String s(int i10, Charset charset) {
        String str = new String(this.f41062a, this.f41063b, i10, charset);
        this.f41063b += i10;
        return str;
    }

    public final int t() {
        return (u() << 21) | (u() << 14) | (u() << 7) | u();
    }

    public final int u() {
        byte[] bArr = this.f41062a;
        int i10 = this.f41063b;
        this.f41063b = i10 + 1;
        return bArr[i10] & 255;
    }

    public final int v() {
        byte[] bArr = this.f41062a;
        int i10 = this.f41063b;
        int i11 = i10 + 1;
        this.f41063b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.f41063b = i10 + 2;
        int i13 = (bArr[i11] & 255) | i12;
        this.f41063b = i10 + 4;
        return i13;
    }

    public final long w() {
        byte[] bArr = this.f41062a;
        int i10 = this.f41063b;
        int i11 = i10 + 1;
        this.f41063b = i11;
        long j = (((long) bArr[i10]) & 255) << 24;
        int i12 = i10 + 2;
        this.f41063b = i12;
        long j10 = j | ((((long) bArr[i11]) & 255) << 16);
        int i13 = i10 + 3;
        this.f41063b = i13;
        long j11 = j10 | ((((long) bArr[i12]) & 255) << 8);
        this.f41063b = i10 + 4;
        return (((long) bArr[i13]) & 255) | j11;
    }

    public final int x() {
        byte[] bArr = this.f41062a;
        int i10 = this.f41063b;
        int i11 = i10 + 1;
        this.f41063b = i11;
        int i12 = (bArr[i10] & 255) << 16;
        int i13 = i10 + 2;
        this.f41063b = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        this.f41063b = i10 + 3;
        return (bArr[i13] & 255) | i14;
    }

    public final int y() {
        int iH = h();
        if (iH >= 0) {
            return iH;
        }
        throw new IllegalStateException(i.b(iH, "Top bit not zero: "));
    }

    public final long z() {
        long jO = o();
        if (jO >= 0) {
            return jO;
        }
        throw new IllegalStateException(b.b(jO, "Top bit not zero: "));
    }

    public r(int i10) {
        this.f41062a = new byte[i10];
        this.f41064c = i10;
    }

    public r(byte[] bArr) {
        this.f41062a = bArr;
        this.f41064c = bArr.length;
    }

    public r(int i10, byte[] bArr) {
        this.f41062a = bArr;
        this.f41064c = i10;
    }
}
