package A1;

import com.braze.Constants;

/* JADX INFO: compiled from: FlacFrameReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: compiled from: FlacFrameReader.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f553a;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b5 A[LOOP:0: B:53:0x00b3->B:54:0x00b5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    public static boolean a(p114j1.r rVar, x xVar, int i10, a aVar) {
        int iU;
        byte[] bArr;
        int i11;
        int i12;
        long jW = rVar.w();
        long j = jW >>> 16;
        if (j != i10) {
            return false;
        }
        boolean z10 = (j & 1) == 1;
        int i13 = (int) ((jW >> 12) & 15);
        int i14 = (int) ((jW >> 8) & 15);
        int i15 = (int) ((jW >> 4) & 15);
        int i16 = (int) ((jW >> 1) & 7);
        boolean z11 = (jW & 1) == 1;
        if (i15 > 7 ? !(i15 > 10 || xVar.f562g != 2) : i15 == xVar.f562g - 1) {
            if ((i16 == 0 || i16 == xVar.f564i) && !z11) {
                try {
                    long jB = rVar.B();
                    if (!z10) {
                        jB *= (long) xVar.f557b;
                    }
                    aVar.f553a = jB;
                    int iB = b(i13, rVar);
                    if (iB != -1 && iB <= xVar.f557b) {
                        if (i14 == 0) {
                            iU = rVar.u();
                            int i17 = rVar.f41063b;
                            bArr = rVar.f41062a;
                            i11 = i17 - 1;
                            int i18 = p114j1.A.f40996a;
                            i12 = 0;
                            for (int i19 = rVar.f41063b; i19 < i11; i19++) {
                                i12 = p114j1.A.j[i12 ^ (bArr[i19] & 255)];
                            }
                            if (iU == i12) {
                                return true;
                            }
                        } else if (i14 > 11) {
                            int i20 = xVar.f560e;
                            if (i14 == 12) {
                                if (rVar.u() * Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS == i20) {
                                    iU = rVar.u();
                                    int i110 = rVar.f41063b;
                                    bArr = rVar.f41062a;
                                    i11 = i110 - 1;
                                    int i111 = p114j1.A.f40996a;
                                    i12 = 0;
                                    while (i19 < i11) {
                                        i12 = p114j1.A.j[i12 ^ (bArr[i19] & 255)];
                                    }
                                    if (iU == i12) {
                                        return true;
                                    }
                                }
                            } else if (i14 <= 14) {
                                int iA = rVar.A();
                                if (i14 == 14) {
                                    iA *= 10;
                                }
                                if (iA == i20) {
                                    iU = rVar.u();
                                    int i112 = rVar.f41063b;
                                    bArr = rVar.f41062a;
                                    i11 = i112 - 1;
                                    int i113 = p114j1.A.f40996a;
                                    i12 = 0;
                                    while (i19 < i11) {
                                        i12 = p114j1.A.j[i12 ^ (bArr[i19] & 255)];
                                    }
                                    if (iU == i12) {
                                        return true;
                                    }
                                }
                            }
                        } else if (i14 == xVar.f561f) {
                            iU = rVar.u();
                            int i114 = rVar.f41063b;
                            bArr = rVar.f41062a;
                            i11 = i114 - 1;
                            int i115 = p114j1.A.f40996a;
                            i12 = 0;
                            while (i19 < i11) {
                                i12 = p114j1.A.j[i12 ^ (bArr[i19] & 255)];
                            }
                            if (iU == i12) {
                                return true;
                            }
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return false;
    }

    public static int b(int i10, p114j1.r rVar) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return rVar.u() + 1;
            case 7:
                return rVar.A() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i10 - 8);
            default:
                return -1;
        }
    }
}
