package V1;

import A1.C0574i;
import A1.E;
import A1.F;
import A1.K;
import A1.N;
import A1.p;
import A1.q;
import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.source.k;
import java.io.IOException;
import java.util.Arrays;
import p078g1.n;
import p114j1.A;
import p114j1.r;

/* JADX INFO: compiled from: OggExtractor.java */
/* JADX INFO: loaded from: classes.dex */
public final class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f6682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f6683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6684c;

    public final boolean c(C0574i c0574i) throws IOException {
        boolean zD;
        e eVar = new e();
        if (eVar.a(c0574i, true) && (eVar.f6690a & 2) == 2) {
            int iMin = Math.min(eVar.f6694e, 8);
            r rVar = new r(iMin);
            c0574i.c(rVar.f41062a, 0, iMin, false);
            rVar.G(0);
            if (rVar.a() >= 5 && rVar.u() == 127 && rVar.w() == 1179402563) {
                this.f6683b = new b();
            } else {
                rVar.G(0);
                try {
                    zD = N.d(1, rVar, true);
                } catch (ParserException unused) {
                    zD = false;
                }
                if (zD) {
                    this.f6683b = new i();
                } else {
                    rVar.G(0);
                    if (g.e(rVar, g.f6697o)) {
                        this.f6683b = new g();
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // A1.p
    public final void f(long j, long j10) {
        h hVar = this.f6683b;
        if (hVar != null) {
            d dVar = hVar.f6700a;
            e eVar = dVar.f6685a;
            eVar.f6690a = 0;
            eVar.f6691b = 0L;
            eVar.f6692c = 0;
            eVar.f6693d = 0;
            eVar.f6694e = 0;
            dVar.f6686b.D(0);
            dVar.f6687c = -1;
            dVar.f6689e = false;
            if (j == 0) {
                hVar.d(!hVar.f6710l);
                return;
            }
            if (hVar.f6707h != 0) {
                long j11 = (((long) hVar.f6708i) * j10) / 1000000;
                hVar.f6704e = j11;
                f fVar = hVar.f6703d;
                int i10 = A.f40996a;
                fVar.c(j11);
                hVar.f6707h = 2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0184  */
    @Override // A1.p
    public final int h(q qVar, E e10) throws IOException {
        byte[] bArr;
        p241t7.b.l(this.f6682a);
        if (this.f6683b == null) {
            C0574i c0574i = (C0574i) qVar;
            if (!c(c0574i)) {
                throw ParserException.a(null, "Failed to determine bitstream type");
            }
            c0574i.f525f = 0;
        }
        if (!this.f6684c) {
            K kP = this.f6682a.p(0, 1);
            this.f6682a.j();
            h hVar = this.f6683b;
            hVar.f6702c = this.f6682a;
            hVar.f6701b = kP;
            hVar.d(true);
            this.f6684c = true;
        }
        h hVar2 = this.f6683b;
        p241t7.b.l(hVar2.f6701b);
        int i10 = A.f40996a;
        int i11 = hVar2.f6707h;
        d dVar = hVar2.f6700a;
        if (i11 == 0) {
            while (true) {
                C0574i c0574i2 = (C0574i) qVar;
                if (!dVar.b(c0574i2)) {
                    hVar2.f6707h = 3;
                    break;
                }
                long j = c0574i2.f523d;
                long j10 = hVar2.f6705f;
                hVar2.f6709k = j - j10;
                h.a aVar = hVar2.j;
                r rVar = dVar.f6686b;
                if (!hVar2.c(rVar, j10, aVar)) {
                    n nVar = hVar2.j.f6712a;
                    hVar2.f6708i = nVar.f35280E;
                    if (!hVar2.f6711m) {
                        hVar2.f6701b.d(nVar);
                        hVar2.f6711m = true;
                    }
                    b.a aVar2 = hVar2.j.f6713b;
                    if (aVar2 == null) {
                        long j11 = ((C0574i) qVar).f522c;
                        if (j11 == -1) {
                            hVar2.f6703d = new h.b();
                        } else {
                            e eVar = dVar.f6685a;
                            hVar2.f6703d = new a(hVar2, hVar2.f6705f, j11, eVar.f6693d + eVar.f6694e, eVar.f6691b, (eVar.f6690a & 4) != 0);
                        }
                        hVar2.f6707h = 2;
                        bArr = rVar.f41062a;
                        if (bArr.length != 65025) {
                            rVar.E(rVar.f41064c, Arrays.copyOf(bArr, Math.max(65025, rVar.f41064c)));
                        }
                        return 0;
                    }
                    hVar2.f6703d = aVar2;
                    hVar2.f6707h = 2;
                    bArr = rVar.f41062a;
                    if (bArr.length != 65025) {
                        rVar.E(rVar.f41064c, Arrays.copyOf(bArr, Math.max(65025, rVar.f41064c)));
                    }
                    return 0;
                }
                hVar2.f6705f = ((C0574i) qVar).f523d;
            }
        } else {
            if (i11 == 1) {
                ((C0574i) qVar).i((int) hVar2.f6705f);
                hVar2.f6707h = 2;
                return 0;
            }
            if (i11 == 2) {
                C0574i c0574i3 = (C0574i) qVar;
                long jA = hVar2.f6703d.a(c0574i3);
                if (jA >= 0) {
                    e10.f414a = jA;
                    return 1;
                }
                if (jA < -1) {
                    hVar2.a(-(jA + 2));
                }
                if (!hVar2.f6710l) {
                    F fB = hVar2.f6703d.b();
                    p241t7.b.l(fB);
                    hVar2.f6702c.g(fB);
                    K k10 = hVar2.f6701b;
                    fB.k();
                    k10.getClass();
                    hVar2.f6710l = true;
                }
                if (hVar2.f6709k > 0 || dVar.b(c0574i3)) {
                    hVar2.f6709k = 0L;
                    r rVar2 = dVar.f6686b;
                    long jB = hVar2.b(rVar2);
                    if (jB >= 0) {
                        long j12 = hVar2.f6706g;
                        if (j12 + jB >= hVar2.f6704e) {
                            long j13 = (j12 * 1000000) / ((long) hVar2.f6708i);
                            hVar2.f6701b.a(rVar2.f41064c, rVar2);
                            hVar2.f6701b.b(j13, 1, rVar2.f41064c, 0, null);
                            hVar2.f6704e = -1L;
                        }
                    }
                    hVar2.f6706g += jB;
                    return 0;
                }
                hVar2.f6707h = 3;
            } else if (i11 != 3) {
                throw new IllegalStateException();
            }
        }
        return -1;
    }

    @Override // A1.p
    public final boolean l(q qVar) throws IOException {
        try {
            return c((C0574i) qVar);
        } catch (ParserException unused) {
            return false;
        }
    }

    @Override // A1.p
    public final void m(A1.r rVar) {
        this.f6682a = (k) rVar;
    }

    @Override // A1.p
    public final void a() {
    }
}
