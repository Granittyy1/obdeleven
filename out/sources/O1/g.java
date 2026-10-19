package O1;

import C4.v;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import p078g1.s;
import p078g1.t;
import p114j1.A;
import p114j1.q;
import p114j1.r;

/* JADX INFO: compiled from: Id3Decoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class g extends C.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v f4750d = new v(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f4751c;

    /* JADX INFO: compiled from: Id3Decoder.java */
    public interface a {
        boolean a(int i10, int i11, int i12, int i13, int i14);
    }

    /* JADX INFO: compiled from: Id3Decoder.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f4752a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f4753b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f4754c;

        public b(int i10, int i11, boolean z10) {
            this.f4752a = i10;
            this.f4753b = z10;
            this.f4754c = i11;
        }
    }

    public g(a aVar) {
        this.f4751c = aVar;
    }

    public static int A0(byte[] bArr, int i10, int i11) {
        int iB0 = B0(i10, bArr);
        if (i11 == 0 || i11 == 3) {
            return iB0;
        }
        while (iB0 < bArr.length - 1) {
            if ((iB0 - i10) % 2 == 0 && bArr[iB0 + 1] == 0) {
                return iB0;
            }
            iB0 = B0(iB0 + 1, bArr);
        }
        return bArr.length;
    }

    public static int B0(int i10, byte[] bArr) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    public static int C0(int i10, r rVar) {
        byte[] bArr = rVar.f41062a;
        int i11 = rVar.f41063b;
        int i12 = i11;
        while (true) {
            int i13 = i12 + 1;
            if (i13 >= i11 + i10) {
                return i10;
            }
            if ((bArr[i12] & 255) == 255 && bArr[i13] == 0) {
                System.arraycopy(bArr, i12 + 2, bArr, i13, (i10 - (i12 - i11)) - 2);
                i10--;
            }
            i12 = i13;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007a A[PHI: r3
      0x007a: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0087, B:33:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    public static boolean D0(r rVar, int i10, int i11, boolean z10) {
        int iX;
        long jX;
        int iA;
        int i12;
        int i13 = rVar.f41063b;
        while (true) {
            try {
                boolean z11 = true;
                if (rVar.a() < i11) {
                    rVar.G(i13);
                    return true;
                }
                if (i10 >= 3) {
                    iX = rVar.h();
                    jX = rVar.w();
                    iA = rVar.A();
                } else {
                    iX = rVar.x();
                    jX = rVar.x();
                    iA = 0;
                }
                if (iX == 0 && jX == 0 && iA == 0) {
                    rVar.G(i13);
                    return true;
                }
                if (i10 == 4 && !z10) {
                    if ((8421504 & jX) != 0) {
                        rVar.G(i13);
                        return false;
                    }
                    jX = (((jX >> 24) & 255) << 21) | (jX & 255) | (((jX >> 8) & 255) << 7) | (((jX >> 16) & 255) << 14);
                }
                if (i10 == 4) {
                    i12 = (iA & 64) != 0 ? 1 : 0;
                    if ((iA & 1) == 0) {
                        z11 = false;
                    }
                } else if (i10 == 3) {
                    i12 = (iA & 32) != 0 ? 1 : 0;
                    if ((iA & 128) == 0) {
                        z11 = false;
                    }
                } else {
                    i12 = 0;
                    z11 = false;
                }
                if (z11) {
                    i12 += 4;
                }
                if (jX < i12) {
                    rVar.G(i13);
                    return false;
                }
                if (rVar.a() < jX) {
                    rVar.G(i13);
                    return false;
                }
                rVar.H((int) jX);
            } catch (Throwable th) {
                rVar.G(i13);
                throw th;
            }
        }
    }

    public static O1.a j0(r rVar, int i10, int i11) {
        int iB0;
        String strConcat;
        int iU = rVar.u();
        Charset charsetY0 = y0(iU);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        rVar.f(bArr, 0, i12);
        if (i11 == 2) {
            strConcat = "image/" + I.e.l(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(strConcat)) {
                strConcat = "image/jpeg";
            }
            iB0 = 2;
        } else {
            iB0 = B0(0, bArr);
            String strL = I.e.l(new String(bArr, 0, iB0, StandardCharsets.ISO_8859_1));
            strConcat = strL.indexOf(47) == -1 ? "image/".concat(strL) : strL;
        }
        int i13 = bArr[iB0 + 1] & 255;
        int i14 = iB0 + 2;
        int iA0 = A0(bArr, i14, iU);
        String str = new String(bArr, i14, iA0 - i14, charsetY0);
        int iX0 = x0(iU) + iA0;
        return new O1.a(strConcat, str, i13, i12 <= iX0 ? A.f40998c : Arrays.copyOfRange(bArr, iX0, i12));
    }

    public static c k0(r rVar, int i10, int i11, boolean z10, int i12, a aVar) {
        int i13 = rVar.f41063b;
        int iB0 = B0(i13, rVar.f41062a);
        String str = new String(rVar.f41062a, i13, iB0 - i13, StandardCharsets.ISO_8859_1);
        rVar.G(iB0 + 1);
        int iH = rVar.h();
        int iH2 = rVar.h();
        long jW = rVar.w();
        long j = jW == 4294967295L ? -1L : jW;
        long jW2 = rVar.w();
        long j10 = jW2 == 4294967295L ? -1L : jW2;
        ArrayList arrayList = new ArrayList();
        int i14 = i13 + i10;
        while (rVar.f41063b < i14) {
            h hVarN0 = n0(i11, rVar, z10, i12, aVar);
            if (hVarN0 != null) {
                arrayList.add(hVarN0);
            }
        }
        return new c(str, iH, iH2, j, j10, (h[]) arrayList.toArray(new h[0]));
    }

    public static d l0(r rVar, int i10, int i11, boolean z10, int i12, a aVar) {
        int i13 = rVar.f41063b;
        int iB0 = B0(i13, rVar.f41062a);
        String str = new String(rVar.f41062a, i13, iB0 - i13, StandardCharsets.ISO_8859_1);
        rVar.G(iB0 + 1);
        int iU = rVar.u();
        boolean z11 = (iU & 2) != 0;
        boolean z12 = (iU & 1) != 0;
        int iU2 = rVar.u();
        String[] strArr = new String[iU2];
        for (int i14 = 0; i14 < iU2; i14++) {
            int i15 = rVar.f41063b;
            int iB1 = B0(i15, rVar.f41062a);
            strArr[i14] = new String(rVar.f41062a, i15, iB1 - i15, StandardCharsets.ISO_8859_1);
            rVar.G(iB1 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i16 = i13 + i10;
        while (rVar.f41063b < i16) {
            h hVarN0 = n0(i11, rVar, z10, i12, aVar);
            if (hVarN0 != null) {
                arrayList.add(hVarN0);
            }
        }
        return new d(str, z11, z12, strArr, (h[]) arrayList.toArray(new h[0]));
    }

    public static e m0(int i10, r rVar) {
        if (i10 < 4) {
            return null;
        }
        int iU = rVar.u();
        Charset charsetY0 = y0(iU);
        byte[] bArr = new byte[3];
        rVar.f(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        rVar.f(bArr2, 0, i11);
        int iA0 = A0(bArr2, 0, iU);
        String str2 = new String(bArr2, 0, iA0, charsetY0);
        int iX0 = x0(iU) + iA0;
        return new e(str, str2, r0(bArr2, iX0, A0(bArr2, iX0, iU), charsetY0));
    }

    /* JADX WARN: Code duplicated, block: B:137:0x0189  */
    /* JADX WARN: Code duplicated, block: B:144:0x019a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:145:0x019c  */
    /* JADX WARN: Code duplicated, block: B:150:0x01b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:151:0x01b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:155:0x01cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:156:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:161:0x01db A[Catch: all -> 0x010d, Exception -> 0x0110, OutOfMemoryError -> 0x0113, TRY_LEAVE, TryCatch #2 {Exception -> 0x0110, OutOfMemoryError -> 0x0113, all -> 0x010d, blocks: (B:91:0x0107, B:99:0x0118, B:106:0x012e, B:108:0x0136, B:116:0x0150, B:125:0x0168, B:136:0x0183, B:143:0x0195, B:149:0x01a4, B:154:0x01bc, B:160:0x01d6, B:161:0x01db), top: B:172:0x00fd }] */
    public static h n0(int i10, r rVar, boolean z10, int i11, a aVar) {
        int iY;
        int i12;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        h bVar;
        int iU = rVar.u();
        int iU2 = rVar.u();
        int iU3 = rVar.u();
        int iU4 = i10 >= 3 ? rVar.u() : 0;
        if (i10 == 4) {
            iY = rVar.y();
            if (!z10) {
                iY = (((iY >> 24) & 255) << 21) | (iY & 255) | (((iY >> 8) & 255) << 7) | (((iY >> 16) & 255) << 14);
            }
        } else {
            iY = i10 == 3 ? rVar.y() : rVar.x();
        }
        int iC0 = iY;
        int iA = i10 >= 3 ? rVar.A() : 0;
        h hVar = null;
        if (iU == 0 && iU2 == 0 && iU3 == 0 && iU4 == 0 && iC0 == 0 && iA == 0) {
            rVar.G(rVar.f41064c);
            return null;
        }
        int i13 = rVar.f41063b + iC0;
        if (i13 > rVar.f41064c) {
            p114j1.k.f("Frame size exceeds remaining tag data");
            rVar.G(rVar.f41064c);
            return null;
        }
        if (aVar != null) {
            i12 = i13;
            if (!aVar.a(i10, iU, iU2, iU3, iU4)) {
                rVar.G(i12);
                return null;
            }
        } else {
            i12 = i13;
        }
        if (i10 == 3) {
            z12 = (iA & 128) != 0;
            boolean z16 = (iA & 64) != 0;
            z11 = (iA & 32) != 0;
            z14 = z16;
            z15 = false;
            z13 = z12;
        } else if (i10 == 4) {
            boolean z17 = (iA & 64) != 0;
            boolean z18 = (iA & 8) != 0;
            z14 = (iA & 4) != 0;
            z15 = (iA & 2) != 0;
            boolean z19 = z18;
            z13 = (iA & 1) != 0;
            z11 = z17;
            z12 = z19;
        } else {
            z11 = false;
            z12 = false;
            z13 = false;
            z14 = false;
            z15 = false;
        }
        if (z12 || z14) {
            p114j1.k.f("Skipping unsupported compressed or encrypted frame");
            rVar.G(i12);
            return null;
        }
        if (z11) {
            iC0--;
            rVar.H(1);
        }
        if (z13) {
            iC0 -= 4;
            rVar.H(4);
        }
        if (z15) {
            iC0 = C0(iC0, rVar);
        }
        try {
            if (iU == 84 && iU2 == 88 && iU3 == 88 && (i10 == 2 || iU4 == 88)) {
                bVar = u0(iC0, rVar);
            } else if (iU == 84) {
                bVar = s0(iC0, rVar, z0(i10, iU, iU2, iU3, iU4));
            } else if (iU == 87 && iU2 == 88 && iU3 == 88 && (i10 == 2 || iU4 == 88)) {
                bVar = w0(iC0, rVar);
            } else if (iU == 87) {
                bVar = v0(iC0, rVar, z0(i10, iU, iU2, iU3, iU4));
            } else if (iU == 80 && iU2 == 82 && iU3 == 73 && iU4 == 86) {
                bVar = q0(iC0, rVar);
            } else if (iU == 71 && iU2 == 69 && iU3 == 79 && (iU4 == 66 || i10 == 2)) {
                bVar = o0(iC0, rVar);
            } else if (i10 == 2) {
                if (iU == 80 && iU2 == 73 && iU3 == 67) {
                    bVar = j0(rVar, iC0, i10);
                } else if (iU != 67 && iU2 == 79 && iU3 == 77 && (iU4 == 77 || i10 == 2)) {
                    bVar = m0(iC0, rVar);
                } else if (iU != 67 && iU2 == 72 && iU3 == 65 && iU4 == 80) {
                    bVar = k0(rVar, iC0, i10, z10, i11, aVar);
                } else if (iU != 67 && iU2 == 84 && iU3 == 79 && iU4 == 67) {
                    bVar = l0(rVar, iC0, i10, z10, i11, aVar);
                } else if (iU != 77 && iU2 == 76 && iU3 == 76 && iU4 == 84) {
                    bVar = p0(iC0, rVar);
                } else {
                    String strZ0 = z0(i10, iU, iU2, iU3, iU4);
                    byte[] bArr = new byte[iC0];
                    rVar.f(bArr, 0, iC0);
                    bVar = new O1.b(strZ0, bArr);
                }
            } else if (iU == 65 && iU2 == 80 && iU3 == 73 && iU4 == 67) {
                bVar = j0(rVar, iC0, i10);
            } else if (iU != 67) {
                if (iU != 67) {
                    if (iU != 67) {
                        if (iU != 77) {
                            String strZ1 = z0(i10, iU, iU2, iU3, iU4);
                            byte[] bArr2 = new byte[iC0];
                            rVar.f(bArr2, 0, iC0);
                            bVar = new O1.b(strZ1, bArr2);
                        } else {
                            String strZ2 = z0(i10, iU, iU2, iU3, iU4);
                            byte[] bArr3 = new byte[iC0];
                            rVar.f(bArr3, 0, iC0);
                            bVar = new O1.b(strZ2, bArr3);
                        }
                    } else if (iU != 77) {
                        String strZ3 = z0(i10, iU, iU2, iU3, iU4);
                        byte[] bArr4 = new byte[iC0];
                        rVar.f(bArr4, 0, iC0);
                        bVar = new O1.b(strZ3, bArr4);
                    } else {
                        String strZ4 = z0(i10, iU, iU2, iU3, iU4);
                        byte[] bArr5 = new byte[iC0];
                        rVar.f(bArr5, 0, iC0);
                        bVar = new O1.b(strZ4, bArr5);
                    }
                } else if (iU != 67) {
                    if (iU != 77) {
                        String strZ5 = z0(i10, iU, iU2, iU3, iU4);
                        byte[] bArr6 = new byte[iC0];
                        rVar.f(bArr6, 0, iC0);
                        bVar = new O1.b(strZ5, bArr6);
                    } else {
                        String strZ6 = z0(i10, iU, iU2, iU3, iU4);
                        byte[] bArr7 = new byte[iC0];
                        rVar.f(bArr7, 0, iC0);
                        bVar = new O1.b(strZ6, bArr7);
                    }
                } else if (iU != 77) {
                    String strZ7 = z0(i10, iU, iU2, iU3, iU4);
                    byte[] bArr8 = new byte[iC0];
                    rVar.f(bArr8, 0, iC0);
                    bVar = new O1.b(strZ7, bArr8);
                } else {
                    String strZ8 = z0(i10, iU, iU2, iU3, iU4);
                    byte[] bArr9 = new byte[iC0];
                    rVar.f(bArr9, 0, iC0);
                    bVar = new O1.b(strZ8, bArr9);
                }
            } else if (iU != 67) {
                if (iU != 67) {
                    if (iU != 77) {
                        String strZ9 = z0(i10, iU, iU2, iU3, iU4);
                        byte[] bArr10 = new byte[iC0];
                        rVar.f(bArr10, 0, iC0);
                        bVar = new O1.b(strZ9, bArr10);
                    } else {
                        String strZ10 = z0(i10, iU, iU2, iU3, iU4);
                        byte[] bArr11 = new byte[iC0];
                        rVar.f(bArr11, 0, iC0);
                        bVar = new O1.b(strZ10, bArr11);
                    }
                } else if (iU != 77) {
                    String strZ11 = z0(i10, iU, iU2, iU3, iU4);
                    byte[] bArr12 = new byte[iC0];
                    rVar.f(bArr12, 0, iC0);
                    bVar = new O1.b(strZ11, bArr12);
                } else {
                    String strZ12 = z0(i10, iU, iU2, iU3, iU4);
                    byte[] bArr13 = new byte[iC0];
                    rVar.f(bArr13, 0, iC0);
                    bVar = new O1.b(strZ12, bArr13);
                }
            } else if (iU != 67) {
                if (iU != 77) {
                    String strZ13 = z0(i10, iU, iU2, iU3, iU4);
                    byte[] bArr14 = new byte[iC0];
                    rVar.f(bArr14, 0, iC0);
                    bVar = new O1.b(strZ13, bArr14);
                } else {
                    String strZ14 = z0(i10, iU, iU2, iU3, iU4);
                    byte[] bArr15 = new byte[iC0];
                    rVar.f(bArr15, 0, iC0);
                    bVar = new O1.b(strZ14, bArr15);
                }
            } else if (iU != 77) {
                String strZ15 = z0(i10, iU, iU2, iU3, iU4);
                byte[] bArr16 = new byte[iC0];
                rVar.f(bArr16, 0, iC0);
                bVar = new O1.b(strZ15, bArr16);
            } else {
                String strZ16 = z0(i10, iU, iU2, iU3, iU4);
                byte[] bArr17 = new byte[iC0];
                rVar.f(bArr17, 0, iC0);
                bVar = new O1.b(strZ16, bArr17);
            }
            rVar.G(i12);
            hVar = bVar;
            e = null;
        } catch (Exception e10) {
            e = e10;
        } catch (OutOfMemoryError e11) {
            e = e11;
        } finally {
            rVar.G(i12);
        }
        if (hVar == null) {
            p114j1.k.g("Failed to decode frame: id=" + z0(i10, iU, iU2, iU3, iU4) + ", frameSize=" + iC0, e);
        }
        return hVar;
    }

    public static f o0(int i10, r rVar) {
        int iU = rVar.u();
        Charset charsetY0 = y0(iU);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        rVar.f(bArr, 0, i11);
        int iB0 = B0(0, bArr);
        String strM = t.m(new String(bArr, 0, iB0, StandardCharsets.ISO_8859_1));
        int i12 = iB0 + 1;
        int iA0 = A0(bArr, i12, iU);
        String strR0 = r0(bArr, i12, iA0, charsetY0);
        int iX0 = x0(iU) + iA0;
        int iA1 = A0(bArr, iX0, iU);
        String strR1 = r0(bArr, iX0, iA1, charsetY0);
        int iX1 = x0(iU) + iA1;
        return new f(strM, strR0, strR1, i11 <= iX1 ? A.f40998c : Arrays.copyOfRange(bArr, iX1, i11));
    }

    public static k p0(int i10, r rVar) {
        int iA = rVar.A();
        int iX = rVar.x();
        int iX2 = rVar.x();
        int iU = rVar.u();
        int iU2 = rVar.u();
        q qVar = new q();
        qVar.l(rVar);
        int i11 = ((i10 - 10) * 8) / (iU + iU2);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int iG = qVar.g(iU);
            int iG2 = qVar.g(iU2);
            iArr[i12] = iG;
            iArr2[i12] = iG2;
        }
        return new k(iA, iX, iX2, iArr, iArr2);
    }

    public static l q0(int i10, r rVar) {
        byte[] bArr = new byte[i10];
        rVar.f(bArr, 0, i10);
        int iB0 = B0(0, bArr);
        String str = new String(bArr, 0, iB0, StandardCharsets.ISO_8859_1);
        int i11 = iB0 + 1;
        return new l(str, i10 <= i11 ? A.f40998c : Arrays.copyOfRange(bArr, i11, i10));
    }

    public static String r0(byte[] bArr, int i10, int i11, Charset charset) {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, charset);
    }

    public static m s0(int i10, r rVar, String str) {
        if (i10 < 1) {
            return null;
        }
        int iU = rVar.u();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        rVar.f(bArr, 0, i11);
        return new m(str, null, t0(bArr, iU, 0));
    }

    public static ImmutableList<String> t0(byte[] bArr, int i10, int i11) {
        if (i11 >= bArr.length) {
            return ImmutableList.M("");
        }
        ImmutableList.b bVar = ImmutableList.f27874c;
        ImmutableList.a aVar = new ImmutableList.a();
        int iA0 = A0(bArr, i11, i10);
        while (i11 < iA0) {
            aVar.c(new String(bArr, i11, iA0 - i11, y0(i10)));
            i11 = x0(i10) + iA0;
            iA0 = A0(bArr, i11, i10);
        }
        ImmutableList<String> immutableListH = aVar.h();
        return immutableListH.isEmpty() ? ImmutableList.M("") : immutableListH;
    }

    public static m u0(int i10, r rVar) {
        if (i10 < 1) {
            return null;
        }
        int iU = rVar.u();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        rVar.f(bArr, 0, i11);
        int iA0 = A0(bArr, 0, iU);
        return new m("TXXX", new String(bArr, 0, iA0, y0(iU)), t0(bArr, iU, x0(iU) + iA0));
    }

    public static n v0(int i10, r rVar, String str) {
        byte[] bArr = new byte[i10];
        rVar.f(bArr, 0, i10);
        return new n(str, null, new String(bArr, 0, B0(0, bArr), StandardCharsets.ISO_8859_1));
    }

    public static n w0(int i10, r rVar) {
        if (i10 < 1) {
            return null;
        }
        int iU = rVar.u();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        rVar.f(bArr, 0, i11);
        int iA0 = A0(bArr, 0, iU);
        String str = new String(bArr, 0, iA0, y0(iU));
        int iX0 = x0(iU) + iA0;
        return new n("WXXX", str, r0(bArr, iX0, B0(iX0, bArr), StandardCharsets.ISO_8859_1));
    }

    public static int x0(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    public static Charset y0(int i10) {
        if (i10 == 1) {
            return StandardCharsets.UTF_16;
        }
        if (i10 != 2) {
            return i10 != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8;
        }
        return StandardCharsets.UTF_16BE;
    }

    public static String z0(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    @Override // C.g
    public final s K(J1.a aVar, ByteBuffer byteBuffer) {
        return i0(byteBuffer.limit(), byteBuffer.array());
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0099 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x009a  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00c5 A[SYNTHETIC] */
    public final s i0(int i10, byte[] bArr) {
        boolean z10;
        b bVar;
        int i11;
        int i12;
        boolean z11;
        int iC0;
        h hVarN0;
        ArrayList arrayList = new ArrayList();
        r rVar = new r(i10, bArr);
        boolean z12 = false;
        if (rVar.a() < 10) {
            p114j1.k.f("Data too short to be an ID3 tag");
        } else {
            int iX = rVar.x();
            if (iX == 4801587) {
                int iU = rVar.u();
                rVar.H(1);
                int iU2 = rVar.u();
                int iT = rVar.t();
                if (iU != 2) {
                    if (iU == 3) {
                        if ((iU2 & 64) != 0) {
                            int iH = rVar.h();
                            rVar.H(iH);
                            iT -= iH + 4;
                        }
                    } else if (iU == 4) {
                        if ((iU2 & 64) != 0) {
                            int iT2 = rVar.t();
                            rVar.H(iT2 - 4);
                            iT -= iT2;
                        }
                        if ((iU2 & 16) != 0) {
                            iT -= 10;
                        }
                    } else {
                        com.google.gson.internal.b.e(iU, "Skipped ID3 tag with unsupported majorVersion=");
                    }
                    if (iU < 4) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    bVar = new b(iU, iT, z10);
                } else if ((iU2 & 64) != 0) {
                    p114j1.k.f("Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                } else {
                    if (iU < 4 || (iU2 & 128) == 0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    bVar = new b(iU, iT, z10);
                }
                if (bVar == null) {
                    return null;
                }
                int i13 = rVar.f41063b;
                i11 = bVar.f4752a;
                i12 = i11 == 2 ? 6 : 10;
                z11 = bVar.f4753b;
                iC0 = bVar.f4754c;
                if (z11) {
                    iC0 = C0(iC0, rVar);
                }
                rVar.F(i13 + iC0);
                if (!D0(rVar, i11, i12, false)) {
                    if (i11 == 4 || !D0(rVar, 4, i12, true)) {
                        com.google.gson.internal.b.e(i11, "Failed to validate ID3 tag with majorVersion=");
                        return null;
                    }
                    z12 = true;
                }
                while (rVar.a() >= i12) {
                    hVarN0 = n0(i11, rVar, z12, i12, this.f4751c);
                    if (hVarN0 != null) {
                        arrayList.add(hVarN0);
                    }
                }
                return new s(arrayList);
            }
            p114j1.k.f("Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(iX))));
        }
        bVar = null;
        if (bVar == null) {
            return null;
        }
        int i14 = rVar.f41063b;
        i11 = bVar.f4752a;
        if (i11 == 2) {
        }
        z11 = bVar.f4753b;
        iC0 = bVar.f4754c;
        if (z11) {
            iC0 = C0(iC0, rVar);
        }
        rVar.F(i14 + iC0);
        if (!D0(rVar, i11, i12, false)) {
            if (i11 == 4) {
            }
            com.google.gson.internal.b.e(i11, "Failed to validate ID3 tag with majorVersion=");
            return null;
        }
        while (rVar.a() >= i12) {
            hVarN0 = n0(i11, rVar, z12, i12, this.f4751c);
            if (hVarN0 != null) {
                arrayList.add(hVarN0);
            }
        }
        return new s(arrayList);
    }
}
