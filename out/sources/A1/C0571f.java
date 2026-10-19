package A1;

/* JADX INFO: renamed from: A1.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CeaUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0571f {
    public static void a(long j, p114j1.r rVar, K[] kArr) {
        int i10;
        int iU;
        while (true) {
            if (rVar.a() <= 1) {
                return;
            }
            int i11 = 0;
            while (true) {
                if (rVar.a() == 0) {
                    i10 = -1;
                    break;
                }
                int iU2 = rVar.u();
                i11 += iU2;
                if (iU2 != 255) {
                    i10 = i11;
                    break;
                }
            }
            int i12 = 0;
            do {
                if (rVar.a() == 0) {
                    i12 = -1;
                    break;
                } else {
                    iU = rVar.u();
                    i12 += iU;
                }
            } while (iU == 255);
            int i13 = rVar.f41063b + i12;
            if (i12 == -1 || i12 > rVar.a()) {
                p114j1.k.f("Skipping remainder of malformed SEI NAL unit.");
                i13 = rVar.f41064c;
            } else if (i10 == 4 && i12 >= 8) {
                int iU3 = rVar.u();
                int iA = rVar.A();
                int iH = iA == 49 ? rVar.h() : 0;
                int iU4 = rVar.u();
                if (iA == 47) {
                    rVar.H(1);
                }
                boolean z10 = iU3 == 181 && (iA == 49 || iA == 47) && iU4 == 3;
                if (iA == 49) {
                    z10 &= iH == 1195456820;
                }
                if (z10) {
                    b(j, rVar, kArr);
                }
            }
            rVar.G(i13);
        }
    }

    public static void b(long j, p114j1.r rVar, K[] kArr) {
        int iU = rVar.u();
        if ((iU & 64) != 0) {
            rVar.H(1);
            int i10 = (iU & 31) * 3;
            int i11 = rVar.f41063b;
            for (K k10 : kArr) {
                rVar.G(i11);
                k10.a(i10, rVar);
                p241t7.b.k(j != -9223372036854775807L);
                k10.b(j, 1, i10, 0, null);
            }
        }
    }
}
