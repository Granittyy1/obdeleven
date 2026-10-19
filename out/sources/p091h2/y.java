package p091h2;

import A1.AbstractC0570e;
import A1.C0574i;
import A1.E;
import A1.F;
import A1.p;
import android.util.SparseArray;
import androidx.media3.exoplayer.source.k;
import com.braze.Constants;
import java.io.IOException;
import p114j1.q;
import p114j1.r;
import p114j1.w;
import p241t7.b;

/* JADX INFO: compiled from: PsExtractor.java */
/* JADX INFO: loaded from: classes.dex */
public final class y implements p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f36117e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f36118f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f36119g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f36120h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public w f36121i;
    public k j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f36122k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f36113a = new w(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f36115c = new r(4096);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray<a> f36114b = new SparseArray<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x f36116d = new x();

    /* JADX INFO: compiled from: PsExtractor.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f36123a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final w f36124b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final q f36125c = new q(64, new byte[64]);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f36126d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f36127e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f36128f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f36129g;

        public a(j jVar, w wVar) {
            this.f36123a = jVar;
            this.f36124b = wVar;
        }
    }

    @Override // A1.p
    public final void f(long j, long j10) {
        long j11;
        w wVar = this.f36113a;
        synchronized (wVar) {
            j11 = wVar.f41076b;
        }
        boolean z10 = j11 == -9223372036854775807L;
        if (!z10) {
            long jD = wVar.d();
            z10 = (jD == -9223372036854775807L || jD == 0 || jD == j10) ? false : true;
        }
        if (z10) {
            wVar.e(j10);
        }
        w wVar2 = this.f36121i;
        if (wVar2 != null) {
            wVar2.c(j10);
        }
        int i10 = 0;
        while (true) {
            SparseArray<a> sparseArray = this.f36114b;
            if (i10 >= sparseArray.size()) {
                return;
            }
            a aVarValueAt = sparseArray.valueAt(i10);
            aVarValueAt.f36128f = false;
            aVarValueAt.f36123a.c();
            i10++;
        }
    }

    @Override // A1.p
    public final int h(A1.q qVar, E e10) throws IOException {
        j kVar;
        long jC;
        long jC2;
        b.l(this.j);
        long j = ((C0574i) qVar).f522c;
        int i10 = 1;
        x xVar = this.f36116d;
        if (j != -1 && !xVar.f36107c) {
            boolean z10 = xVar.f36109e;
            r rVar = xVar.f36106b;
            if (!z10) {
                C0574i c0574i = (C0574i) qVar;
                long j10 = c0574i.f522c;
                int iMin = (int) Math.min(20000L, j10);
                long j11 = j10 - ((long) iMin);
                if (c0574i.f523d != j11) {
                    e10.f414a = j11;
                } else {
                    rVar.D(iMin);
                    c0574i.f525f = 0;
                    c0574i.c(rVar.f41062a, 0, iMin, false);
                    int i11 = rVar.f41063b;
                    int i12 = rVar.f41064c - 4;
                    while (true) {
                        if (i12 < i11) {
                            jC2 = -9223372036854775807L;
                            break;
                        }
                        if (x.b(i12, rVar.f41062a) == 442) {
                            rVar.G(i12 + 4);
                            jC2 = x.c(rVar);
                            if (jC2 != -9223372036854775807L) {
                                break;
                            }
                        }
                        i12--;
                    }
                    xVar.f36111g = jC2;
                    xVar.f36109e = true;
                    i10 = 0;
                }
            } else {
                if (xVar.f36111g == -9223372036854775807L) {
                    xVar.a((C0574i) qVar);
                    return 0;
                }
                if (xVar.f36108d) {
                    long j12 = xVar.f36110f;
                    if (j12 == -9223372036854775807L) {
                        xVar.a((C0574i) qVar);
                        return 0;
                    }
                    w wVar = xVar.f36105a;
                    xVar.f36112h = wVar.c(xVar.f36111g) - wVar.b(j12);
                    xVar.a((C0574i) qVar);
                    return 0;
                }
                C0574i c0574i2 = (C0574i) qVar;
                int iMin2 = (int) Math.min(20000L, c0574i2.f522c);
                long j13 = 0;
                if (c0574i2.f523d != j13) {
                    e10.f414a = j13;
                } else {
                    rVar.D(iMin2);
                    c0574i2.f525f = 0;
                    c0574i2.c(rVar.f41062a, 0, iMin2, false);
                    int i13 = rVar.f41063b;
                    int i14 = rVar.f41064c;
                    while (true) {
                        if (i13 >= i14 - 3) {
                            jC = -9223372036854775807L;
                            break;
                        }
                        if (x.b(i13, rVar.f41062a) == 442) {
                            rVar.G(i13 + 4);
                            jC = x.c(rVar);
                            if (jC != -9223372036854775807L) {
                                break;
                            }
                        }
                        i13++;
                    }
                    xVar.f36110f = jC;
                    xVar.f36108d = true;
                    i10 = 0;
                }
            }
            return i10;
        }
        if (!this.f36122k) {
            this.f36122k = true;
            long j14 = xVar.f36112h;
            if (j14 != -9223372036854775807L) {
                w wVar2 = new w(new AbstractC0570e.b(), new w.a(xVar.f36105a), j14, j14 + 1, 0L, j, 188L, Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS);
                this.f36121i = wVar2;
                this.j.g(wVar2.f485a);
            } else {
                this.j.g(new F.b(j14));
            }
        }
        w wVar3 = this.f36121i;
        if (wVar3 != null && wVar3.f487c != null) {
            return wVar3.a((C0574i) qVar, e10);
        }
        C0574i c0574i3 = (C0574i) qVar;
        c0574i3.f525f = 0;
        long jD = j != -1 ? j - c0574i3.d() : -1L;
        if (jD != -1 && jD < 4) {
            return -1;
        }
        r rVar2 = this.f36115c;
        if (!c0574i3.c(rVar2.f41062a, 0, 4, true)) {
            return -1;
        }
        rVar2.G(0);
        int iH = rVar2.h();
        if (iH == 441) {
            return -1;
        }
        if (iH == 442) {
            c0574i3.c(rVar2.f41062a, 0, 10, false);
            rVar2.G(9);
            c0574i3.i((rVar2.u() & 7) + 14);
            return 0;
        }
        if (iH == 443) {
            c0574i3.c(rVar2.f41062a, 0, 2, false);
            rVar2.G(0);
            c0574i3.i(rVar2.A() + 6);
            return 0;
        }
        if (((iH & (-256)) >> 8) != 1) {
            c0574i3.i(1);
            return 0;
        }
        int i15 = iH & 255;
        SparseArray<a> sparseArray = this.f36114b;
        a aVar = sparseArray.get(i15);
        if (!this.f36117e) {
            if (aVar == null) {
                if (i15 == 189) {
                    kVar = new C2202b("video/mp2p");
                    this.f36118f = true;
                    this.f36120h = c0574i3.f523d;
                } else if ((iH & 224) == 192) {
                    kVar = new q(null, 0, "video/mp2p");
                    this.f36118f = true;
                    this.f36120h = c0574i3.f523d;
                } else if ((iH & 240) == 224) {
                    kVar = new k(null, "video/mp2p");
                    this.f36119g = true;
                    this.f36120h = c0574i3.f523d;
                } else {
                    kVar = null;
                }
                if (kVar != null) {
                    kVar.d(this.j, new F.c(i15, 256));
                    aVar = new a(kVar, this.f36113a);
                    sparseArray.put(i15, aVar);
                }
            }
            if (c0574i3.f523d > ((this.f36118f && this.f36119g) ? this.f36120h + 8192 : 1048576L)) {
                this.f36117e = true;
                this.j.j();
            }
        }
        c0574i3.c(rVar2.f41062a, 0, 2, false);
        rVar2.G(0);
        int iA = rVar2.A() + 6;
        if (aVar == null) {
            c0574i3.i(iA);
        } else {
            rVar2.D(iA);
            c0574i3.a(rVar2.f41062a, 0, iA, false);
            rVar2.G(6);
            q qVar2 = aVar.f36125c;
            rVar2.f(qVar2.f41055a, 0, 3);
            qVar2.m(0);
            qVar2.o(8);
            aVar.f36126d = qVar2.f();
            aVar.f36127e = qVar2.f();
            qVar2.o(6);
            rVar2.f(qVar2.f41055a, 0, qVar2.g(8));
            qVar2.m(0);
            aVar.f36129g = 0L;
            if (aVar.f36126d) {
                qVar2.o(4);
                long jG = ((long) qVar2.g(3)) << 30;
                qVar2.o(1);
                long jG2 = jG | ((long) (qVar2.g(15) << 15));
                qVar2.o(1);
                long jG3 = jG2 | ((long) qVar2.g(15));
                qVar2.o(1);
                boolean z11 = aVar.f36128f;
                w wVar4 = aVar.f36124b;
                if (!z11 && aVar.f36127e) {
                    qVar2.o(4);
                    long jG4 = ((long) qVar2.g(3)) << 30;
                    qVar2.o(1);
                    long jG5 = jG4 | ((long) (qVar2.g(15) << 15));
                    qVar2.o(1);
                    long jG6 = jG5 | ((long) qVar2.g(15));
                    qVar2.o(1);
                    wVar4.b(jG6);
                    aVar.f36128f = true;
                }
                aVar.f36129g = wVar4.b(jG3);
            }
            long j15 = aVar.f36129g;
            j jVar = aVar.f36123a;
            jVar.f(4, j15);
            jVar.a(rVar2);
            jVar.e(false);
            rVar2.F(rVar2.f41062a.length);
        }
        return 0;
    }

    @Override // A1.p
    public final boolean l(A1.q qVar) throws IOException {
        byte[] bArr = new byte[14];
        C0574i c0574i = (C0574i) qVar;
        c0574i.c(bArr, 0, 14, false);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        c0574i.k(bArr[13] & 7, false);
        c0574i.c(bArr, 0, 3, false);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    @Override // A1.p
    public final void m(A1.r rVar) {
        this.j = (k) rVar;
    }

    @Override // A1.p
    public final void a() {
    }
}
