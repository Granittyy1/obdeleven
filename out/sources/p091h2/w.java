package p091h2;

import A1.AbstractC0570e;
import A1.C0574i;
import java.io.IOException;
import p114j1.A;
import p114j1.r;

/* JADX INFO: compiled from: PsBinarySearchSeeker.java */
/* JADX INFO: loaded from: classes.dex */
public final class w extends AbstractC0570e {

    /* JADX INFO: compiled from: PsBinarySearchSeeker.java */
    public static final class a implements AbstractC0570e.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p114j1.w f36103a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r f36104b = new r();

        public a(p114j1.w wVar) {
            this.f36103a = wVar;
        }

        /* JADX WARN: Code duplicated, block: B:38:0x00e5  */
        @Override // A1.AbstractC0570e.f
        public final AbstractC0570e.C0001e a(C0574i c0574i, long j) throws IOException {
            int iD;
            AbstractC0570e.C0001e c0001e;
            long j10 = c0574i.f523d;
            int iMin = (int) Math.min(20000L, c0574i.f522c - j10);
            r rVar = this.f36104b;
            rVar.D(iMin);
            c0574i.c(rVar.f41062a, 0, iMin, false);
            int i10 = -1;
            int i11 = -1;
            long j11 = -9223372036854775807L;
            while (rVar.a() >= 4) {
                if (w.d(rVar.f41063b, rVar.f41062a) != 442) {
                    rVar.H(1);
                } else {
                    rVar.H(4);
                    long jC = x.c(rVar);
                    if (jC != -9223372036854775807L) {
                        long jB = this.f36103a.b(jC);
                        if (jB > j) {
                            if (j11 == -9223372036854775807L) {
                                return new AbstractC0570e.C0001e(-1, jB, j10);
                            }
                            c0001e = new AbstractC0570e.C0001e(0, -9223372036854775807L, j10 + ((long) i11));
                        } else if (100000 + jB > j) {
                            c0001e = new AbstractC0570e.C0001e(0, -9223372036854775807L, j10 + ((long) rVar.f41063b));
                        } else {
                            i11 = rVar.f41063b;
                            j11 = jB;
                        }
                        return c0001e;
                    }
                    int i12 = rVar.f41064c;
                    if (rVar.a() >= 10) {
                        rVar.H(9);
                        int iU = rVar.u() & 7;
                        if (rVar.a() >= iU) {
                            rVar.H(iU);
                            if (rVar.a() >= 4) {
                                if (w.d(rVar.f41063b, rVar.f41062a) != 443) {
                                    while (rVar.a() >= 4) {
                                        iD = w.d(rVar.f41063b, rVar.f41062a);
                                        if (iD == 442) {
                                            break;
                                        }
                                        break;
                                    }
                                }
                                rVar.H(4);
                                int iA = rVar.A();
                                if (rVar.a() < iA) {
                                    rVar.G(i12);
                                } else {
                                    rVar.H(iA);
                                    while (rVar.a() >= 4) {
                                        iD = w.d(rVar.f41063b, rVar.f41062a);
                                        if (iD == 442 || iD == 441 || (iD >>> 8) != 1) {
                                            break;
                                        }
                                        rVar.H(4);
                                        if (rVar.a() < 2) {
                                            rVar.G(i12);
                                            break;
                                        }
                                        rVar.G(Math.min(rVar.f41064c, rVar.f41063b + rVar.A()));
                                    }
                                }
                            } else {
                                rVar.G(i12);
                            }
                        } else {
                            rVar.G(i12);
                        }
                    } else {
                        rVar.G(i12);
                    }
                    i10 = rVar.f41063b;
                }
            }
            return j11 != -9223372036854775807L ? new AbstractC0570e.C0001e(-2, j11, j10 + ((long) i10)) : AbstractC0570e.C0001e.f503d;
        }

        @Override // A1.AbstractC0570e.f
        public final void b() {
            byte[] bArr = A.f40998c;
            r rVar = this.f36104b;
            rVar.getClass();
            rVar.E(bArr.length, bArr);
        }
    }

    public static int d(int i10, byte[] bArr) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }
}
