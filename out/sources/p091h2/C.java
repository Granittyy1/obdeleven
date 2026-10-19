package p091h2;

import A1.AbstractC0570e;
import A1.C0574i;
import com.google.android.gms.internal.measurement.Y;
import java.io.IOException;
import p114j1.A;
import p114j1.r;
import p114j1.w;

/* JADX INFO: compiled from: TsBinarySearchSeeker.java */
/* JADX INFO: loaded from: classes.dex */
public final class C extends AbstractC0570e {

    /* JADX INFO: compiled from: TsBinarySearchSeeker.java */
    public static final class a implements AbstractC0570e.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w f35764a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r f35765b = new r();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f35766c;

        public a(int i10, w wVar) {
            this.f35766c = i10;
            this.f35764a = wVar;
        }

        @Override // A1.AbstractC0570e.f
        public final AbstractC0570e.C0001e a(C0574i c0574i, long j) throws IOException {
            long j10 = c0574i.f523d;
            int iMin = (int) Math.min(112800, c0574i.f522c - j10);
            r rVar = this.f35765b;
            rVar.D(iMin);
            c0574i.c(rVar.f41062a, 0, iMin, false);
            int i10 = rVar.f41064c;
            long j11 = -1;
            long j12 = -1;
            long j13 = -9223372036854775807L;
            while (rVar.a() >= 188) {
                byte[] bArr = rVar.f41062a;
                int i11 = rVar.f41063b;
                while (i11 < i10 && bArr[i11] != 71) {
                    i11++;
                }
                int i12 = i11 + 188;
                if (i12 > i10) {
                    break;
                }
                long j14 = Y.j(rVar, i11, this.f35766c);
                if (j14 != -9223372036854775807L) {
                    long jB = this.f35764a.b(j14);
                    if (jB > j) {
                        return j13 == -9223372036854775807L ? new AbstractC0570e.C0001e(-1, jB, j10) : new AbstractC0570e.C0001e(0, -9223372036854775807L, j10 + j12);
                    }
                    if (100000 + jB > j) {
                        return new AbstractC0570e.C0001e(0, -9223372036854775807L, j10 + ((long) i11));
                    }
                    j12 = i11;
                    j13 = jB;
                }
                rVar.G(i12);
                j11 = i12;
            }
            return j13 != -9223372036854775807L ? new AbstractC0570e.C0001e(-2, j13, j10 + j11) : AbstractC0570e.C0001e.f503d;
        }

        @Override // A1.AbstractC0570e.f
        public final void b() {
            byte[] bArr = A.f40998c;
            r rVar = this.f35765b;
            rVar.getClass();
            rVar.E(bArr.length, bArr);
        }
    }
}
