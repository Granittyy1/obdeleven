package U1;

import A1.J;
import A1.q;
import A8.p;
import com.google.common.primitives.ImmutableIntArray;
import com.voltasit.obdeleven.domain.usecases.device.u;
import java.io.IOException;
import java.util.Arrays;
import p114j1.r;

/* JADX INFO: compiled from: Sniffer.java */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f6256a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean a(int i10, boolean z10) {
        if ((i10 >>> 8) == 3368816) {
            return true;
        }
        if (i10 == 1751476579 && z10) {
            return true;
        }
        int[] iArr = f6256a;
        for (int i11 = 0; i11 < 29; i11++) {
            if (iArr[i11] == i10) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:83:0x0133  */
    /* JADX WARN: Code duplicated, block: B:85:0x0136  */
    /* JADX WARN: Code duplicated, block: B:87:0x013a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x013c  */
    /* JADX WARN: Code duplicated, block: B:89:0x013f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0142 A[RETURN] */
    public static J b(q qVar, boolean z10, boolean z11) throws IOException {
        int i10;
        long jO;
        int i11;
        int i12;
        boolean z12;
        int[] iArr;
        long j;
        boolean z13 = true;
        long length = qVar.getLength();
        long j10 = -1;
        long j11 = 4096;
        if (length != -1 && length <= 4096) {
            j11 = length;
        }
        int i13 = (int) j11;
        r rVar = new r(64);
        int i14 = 0;
        int i15 = 0;
        boolean z14 = false;
        while (true) {
            if (i15 < i13) {
                rVar.D(8);
                if (qVar.c(rVar.f41062a, i14, 8, z13)) {
                    long jW = rVar.w();
                    int iH = rVar.h();
                    if (jW == 1) {
                        qVar.j(rVar.f41062a, 8, 8);
                        i11 = 16;
                        rVar.F(16);
                        jO = rVar.o();
                    } else {
                        if (jW == 0) {
                            long length2 = qVar.getLength();
                            if (length2 != j10) {
                                jW = (length2 - qVar.d()) + ((long) 8);
                            }
                        }
                        jO = jW;
                        i11 = 8;
                    }
                    long j12 = i11;
                    if (jO < j12) {
                        return new u();
                    }
                    i15 += i11;
                    if (iH == 1836019574) {
                        i13 += (int) jO;
                        if (length == -1 || i13 <= length) {
                            j = length;
                        } else {
                            j = length;
                            i13 = (int) j;
                        }
                        length = j;
                        z13 = true;
                    } else if (iH == 1836019558 || iH == 1836475768) {
                        i10 = 1;
                    } else {
                        if (iH == 1835295092) {
                            z14 = true;
                        }
                        if ((((long) i15) + jO) - j12 >= i13) {
                            i10 = 0;
                        } else {
                            int i16 = (int) (jO - j12);
                            i15 += i16;
                            if (iH != 1718909296) {
                                i12 = 0;
                                z12 = true;
                                if (i16 != 0) {
                                    qVar.e(i16);
                                }
                            } else {
                                if (i16 < 8) {
                                    return new u();
                                }
                                rVar.D(i16);
                                i12 = 0;
                                qVar.j(rVar.f41062a, 0, i16);
                                if (a(rVar.h(), z11)) {
                                    z14 = true;
                                }
                                rVar.H(4);
                                int iA = rVar.a() / 4;
                                if (!z14 && iA > 0) {
                                    iArr = new int[iA];
                                    int i17 = 0;
                                    while (true) {
                                        if (i17 >= iA) {
                                            z12 = true;
                                            break;
                                        }
                                        int iH2 = rVar.h();
                                        iArr[i17] = iH2;
                                        if (a(iH2, z11)) {
                                            z12 = true;
                                            z14 = true;
                                            break;
                                        }
                                        i17++;
                                    }
                                } else {
                                    z12 = true;
                                    iArr = null;
                                }
                                if (!z14) {
                                    p pVar = new p();
                                    if (iArr != null) {
                                        ImmutableIntArray immutableIntArray = ImmutableIntArray.f28011b;
                                        if (iArr.length != 0) {
                                            new ImmutableIntArray(Arrays.copyOf(iArr, iArr.length));
                                        }
                                    } else {
                                        ImmutableIntArray immutableIntArray2 = ImmutableIntArray.f28011b;
                                    }
                                    return pVar;
                                }
                            }
                            i14 = i12;
                            z13 = z12;
                            length = length;
                        }
                    }
                    j10 = -1;
                }
                if (!z14) {
                    return h.f6247a;
                }
                if (z10 != i10) {
                    return i10 != 0 ? d.f6209a : d.f6210b;
                }
                return null;
            }
            i10 = i14;
            if (!z14) {
                return h.f6247a;
            }
            if (z10 != i10) {
                if (i10 != 0) {
                }
            }
            return null;
        }
    }
}
