package F1;

import A1.AbstractC0570e;
import A1.C0574i;
import A1.u;
import A1.x;
import java.io.IOException;
import p114j1.r;

/* JADX INFO: compiled from: FlacBinarySearchSeeker.java */
/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC0570e {

    /* JADX INFO: compiled from: FlacBinarySearchSeeker.java */
    public static final class a implements AbstractC0570e.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x f3187a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f3188b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final u.a f3189c = new u.a();

        public a(x xVar, int i10) {
            this.f3187a = xVar;
            this.f3188b = i10;
        }

        @Override // A1.AbstractC0570e.f
        public final AbstractC0570e.C0001e a(C0574i c0574i, long j) throws IOException {
            long j10 = c0574i.f523d;
            long jC = c(c0574i);
            long jD = c0574i.d();
            c0574i.k(Math.max(6, this.f3187a.f558c), false);
            long jC2 = c(c0574i);
            long jD2 = c0574i.d();
            if (jC > j || jC2 <= j) {
                return jC2 <= j ? new AbstractC0570e.C0001e(-2, jC2, jD2) : new AbstractC0570e.C0001e(-1, jC, j10);
            }
            return new AbstractC0570e.C0001e(0, -9223372036854775807L, jD);
        }

        public final long c(C0574i c0574i) throws IOException {
            long j;
            u.a aVar;
            x xVar;
            boolean zA;
            int iM;
            while (true) {
                long jD = c0574i.d();
                j = c0574i.f522c;
                long j10 = j - 6;
                aVar = this.f3189c;
                xVar = this.f3187a;
                if (jD >= j10) {
                    break;
                }
                long jD2 = c0574i.d();
                byte[] bArr = new byte[2];
                c0574i.c(bArr, 0, 2, false);
                int i10 = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
                int i11 = this.f3188b;
                if (i10 != i11) {
                    c0574i.f525f = 0;
                    c0574i.k((int) (jD2 - c0574i.f523d), false);
                    zA = false;
                } else {
                    r rVar = new r(16);
                    System.arraycopy(bArr, 0, rVar.f41062a, 0, 2);
                    byte[] bArr2 = rVar.f41062a;
                    int i12 = 0;
                    for (int i13 = 2; i12 < 14 && (iM = c0574i.m(bArr2, i13 + i12, 14 - i12)) != -1; i13 = 2) {
                        i12 += iM;
                    }
                    rVar.F(i12);
                    c0574i.f525f = 0;
                    c0574i.k((int) (jD2 - c0574i.f523d), false);
                    zA = u.a(rVar, xVar, i11, aVar);
                }
                if (zA) {
                    break;
                }
                c0574i.k(1, false);
            }
            if (c0574i.d() < j - 6) {
                return aVar.f553a;
            }
            c0574i.k((int) (j - c0574i.d()), false);
            return xVar.j;
        }
    }
}
