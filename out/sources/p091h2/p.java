package p091h2;

import A1.C0566a;
import A1.K;
import androidx.media3.common.ParserException;
import java.util.Collections;
import p078g1.n;
import p078g1.t;
import p114j1.q;
import p114j1.r;
import p241t7.b;

/* JADX INFO: compiled from: LatmReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class p implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f36028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f36029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f36030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public K f36031e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f36032f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public n f36033g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f36034h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f36035i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f36036k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f36037l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f36038m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f36039n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f36040o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f36041p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f36042q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f36043r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f36044s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f36045t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f36046u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f36047v;

    public p(String str, int i10) {
        this.f36027a = str;
        this.f36028b = i10;
        r rVar = new r(1024);
        this.f36029c = rVar;
        byte[] bArr = rVar.f41062a;
        this.f36030d = new q(bArr.length, bArr);
        this.f36037l = -9223372036854775807L;
    }

    @Override // p091h2.j
    public final void a(r rVar) throws ParserException {
        int iG;
        boolean zF;
        b.l(this.f36031e);
        while (rVar.a() > 0) {
            int i10 = this.f36034h;
            if (i10 != 0) {
                if (i10 != 1) {
                    r rVar2 = this.f36029c;
                    q qVar = this.f36030d;
                    if (i10 == 2) {
                        int iU = ((this.f36036k & (-225)) << 8) | rVar.u();
                        this.j = iU;
                        if (iU > rVar2.f41062a.length) {
                            rVar2.D(iU);
                            byte[] bArr = rVar2.f41062a;
                            qVar.getClass();
                            qVar.k(bArr.length, bArr);
                        }
                        this.f36035i = 0;
                        this.f36034h = 3;
                    } else {
                        if (i10 != 3) {
                            throw new IllegalStateException();
                        }
                        int iMin = Math.min(rVar.a(), this.j - this.f36035i);
                        rVar.f(qVar.f41055a, this.f36035i, iMin);
                        int i11 = this.f36035i + iMin;
                        this.f36035i = i11;
                        if (i11 == this.j) {
                            qVar.m(0);
                            if (qVar.f()) {
                                if (this.f36038m) {
                                }
                                this.f36034h = 0;
                            } else {
                                this.f36038m = true;
                                int iG2 = qVar.g(1);
                                int iG3 = iG2 == 1 ? qVar.g(1) : 0;
                                this.f36039n = iG3;
                                if (iG3 != 0) {
                                    throw ParserException.a(null, null);
                                }
                                if (iG2 == 1) {
                                    qVar.g((qVar.g(2) + 1) * 8);
                                }
                                if (!qVar.f()) {
                                    throw ParserException.a(null, null);
                                }
                                this.f36040o = qVar.g(6);
                                int iG4 = qVar.g(4);
                                int iG5 = qVar.g(3);
                                if (iG4 != 0 || iG5 != 0) {
                                    throw ParserException.a(null, null);
                                }
                                if (iG2 == 0) {
                                    int iE = qVar.e();
                                    int iB = qVar.b();
                                    C0566a.C0000a c0000aB = C0566a.b(qVar, true);
                                    this.f36047v = c0000aB.f457c;
                                    this.f36044s = c0000aB.f455a;
                                    this.f36046u = c0000aB.f456b;
                                    int iB2 = iB - qVar.b();
                                    qVar.m(iE);
                                    byte[] bArr2 = new byte[(iB2 + 7) / 8];
                                    qVar.h(iB2, bArr2);
                                    n.a aVar = new n.a();
                                    aVar.f35327a = this.f36032f;
                                    aVar.f35337l = t.m("video/mp2t");
                                    aVar.f35338m = t.m("audio/mp4a-latm");
                                    aVar.j = this.f36047v;
                                    aVar.f35317C = this.f36046u;
                                    aVar.f35318D = this.f36044s;
                                    aVar.f35341p = Collections.singletonList(bArr2);
                                    aVar.f35330d = this.f36027a;
                                    aVar.f35332f = this.f36028b;
                                    n nVar = new n(aVar);
                                    if (!nVar.equals(this.f36033g)) {
                                        this.f36033g = nVar;
                                        this.f36045t = 1024000000 / ((long) nVar.f35280E);
                                        this.f36031e.d(nVar);
                                    }
                                } else {
                                    int iG6 = qVar.g((qVar.g(2) + 1) * 8);
                                    int iB3 = qVar.b();
                                    C0566a.C0000a c0000aB2 = C0566a.b(qVar, true);
                                    this.f36047v = c0000aB2.f457c;
                                    this.f36044s = c0000aB2.f455a;
                                    this.f36046u = c0000aB2.f456b;
                                    qVar.o(iG6 - (iB3 - qVar.b()));
                                }
                                int iG7 = qVar.g(3);
                                this.f36041p = iG7;
                                if (iG7 == 0) {
                                    qVar.o(8);
                                } else if (iG7 == 1) {
                                    qVar.o(9);
                                } else if (iG7 == 3 || iG7 == 4 || iG7 == 5) {
                                    qVar.o(6);
                                } else {
                                    if (iG7 != 6 && iG7 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    qVar.o(1);
                                }
                                boolean zF2 = qVar.f();
                                this.f36042q = zF2;
                                this.f36043r = 0L;
                                if (zF2) {
                                    if (iG2 == 1) {
                                        this.f36043r = qVar.g((qVar.g(2) + 1) * 8);
                                    } else {
                                        do {
                                            zF = qVar.f();
                                            this.f36043r = (this.f36043r << 8) + ((long) qVar.g(8));
                                        } while (zF);
                                    }
                                }
                                if (qVar.f()) {
                                    qVar.o(8);
                                }
                            }
                            if (this.f36039n != 0) {
                                throw ParserException.a(null, null);
                            }
                            if (this.f36040o != 0) {
                                throw ParserException.a(null, null);
                            }
                            if (this.f36041p != 0) {
                                throw ParserException.a(null, null);
                            }
                            int i12 = 0;
                            do {
                                iG = qVar.g(8);
                                i12 += iG;
                            } while (iG == 255);
                            int iE2 = qVar.e();
                            if ((iE2 & 7) == 0) {
                                rVar2.G(iE2 >> 3);
                            } else {
                                qVar.h(i12 * 8, rVar2.f41062a);
                                rVar2.G(0);
                            }
                            this.f36031e.a(i12, rVar2);
                            b.k(this.f36037l != -9223372036854775807L);
                            this.f36031e.b(this.f36037l, 1, i12, 0, null);
                            this.f36037l += this.f36045t;
                            if (this.f36042q) {
                                qVar.o((int) this.f36043r);
                            }
                            this.f36034h = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int iU2 = rVar.u();
                    if ((iU2 & 224) == 224) {
                        this.f36036k = iU2;
                        this.f36034h = 2;
                    } else if (iU2 != 86) {
                        this.f36034h = 0;
                    }
                }
            } else if (rVar.u() == 86) {
                this.f36034h = 1;
            }
        }
    }

    @Override // p091h2.j
    public final void c() {
        this.f36034h = 0;
        this.f36037l = -9223372036854775807L;
        this.f36038m = false;
    }

    @Override // p091h2.j
    public final void d(A1.r rVar, F.c cVar) {
        cVar.a();
        cVar.b();
        this.f36031e = rVar.p(cVar.f35809d, 1);
        cVar.b();
        this.f36032f = cVar.f35810e;
    }

    @Override // p091h2.j
    public final void f(int i10, long j) {
        this.f36037l = j;
    }

    @Override // p091h2.j
    public final void e(boolean z10) {
    }
}
