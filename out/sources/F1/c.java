package F1;

import A1.B;
import A1.C0574i;
import A1.C0576k;
import A1.E;
import A1.F;
import A1.K;
import A1.N;
import A1.p;
import A1.q;
import A1.u;
import A1.v;
import A1.w;
import A1.x;
import O1.g;
import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.source.k;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.Arrays;
import p078g1.n;
import p078g1.s;
import p078g1.t;
import p114j1.A;
import p114j1.r;

/* JADX INFO: compiled from: FlacExtractor.java */
/* JADX INFO: loaded from: classes.dex */
public final class c implements p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k f3194e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public K f3195f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public s f3197h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public x f3198i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3199k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b f3200l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f3201m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f3202n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f3190a = new byte[42];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f3191b = new r(0, new byte[32768]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3192c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u.a f3193d = new u.a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3196g = 0;

    @Override // A1.p
    public final void f(long j, long j10) {
        if (j == 0) {
            this.f3196g = 0;
        } else {
            b bVar = this.f3200l;
            if (bVar != null) {
                bVar.c(j10);
            }
        }
        this.f3202n = j10 != 0 ? -1L : 0L;
        this.f3201m = 0;
        this.f3191b.D(0);
    }

    @Override // A1.p
    public final int h(q qVar, E e10) throws IOException {
        x xVar;
        F bVar;
        long j;
        boolean z10;
        long j10;
        boolean zA;
        int i10 = 0;
        boolean z11 = true;
        int i11 = this.f3196g;
        s sVar = null;
        if (i11 == 0) {
            ((C0574i) qVar).f525f = 0;
            C0574i c0574i = (C0574i) qVar;
            long jD = c0574i.d();
            s sVarA = new B().a(c0574i, !this.f3192c ? null : g.f4750d);
            if (sVarA != null && sVarA.f35445a.length != 0) {
                sVar = sVarA;
            }
            c0574i.i((int) (c0574i.d() - jD));
            this.f3197h = sVar;
            this.f3196g = 1;
            return 0;
        }
        byte[] bArr = this.f3190a;
        if (i11 == 1) {
            ((C0574i) qVar).c(bArr, 0, bArr.length, false);
            ((C0574i) qVar).f525f = 0;
            this.f3196g = 2;
            return 0;
        }
        int i12 = 3;
        if (i11 == 2) {
            r rVar = new r(4);
            ((C0574i) qVar).a(rVar.f41062a, 0, 4, false);
            if (rVar.w() != 1716281667) {
                throw ParserException.a(null, "Failed to read FLAC stream marker.");
            }
            this.f3196g = 3;
            return 0;
        }
        int i13 = 7;
        if (i11 == 3) {
            x xVar2 = this.f3198i;
            boolean z12 = false;
            while (!z12) {
                ((C0574i) qVar).f525f = 0;
                byte[] bArr2 = new byte[4];
                p114j1.q qVar2 = new p114j1.q(4, bArr2);
                C0574i c0574i2 = (C0574i) qVar;
                c0574i2.c(bArr2, 0, 4, false);
                boolean zF = qVar2.f();
                int iG = qVar2.g(i13);
                int iG2 = qVar2.g(24) + 4;
                if (iG == 0) {
                    byte[] bArr3 = new byte[38];
                    c0574i2.a(bArr3, 0, 38, false);
                    xVar2 = new x(4, bArr3);
                } else {
                    if (xVar2 == null) {
                        throw new IllegalArgumentException();
                    }
                    if (iG == i12) {
                        r rVar2 = new r(iG2);
                        c0574i2.a(rVar2.f41062a, 0, iG2, false);
                        xVar = new x(xVar2.f556a, xVar2.f557b, xVar2.f558c, xVar2.f559d, xVar2.f560e, xVar2.f562g, xVar2.f563h, xVar2.j, v.a(rVar2), xVar2.f566l);
                    } else {
                        s sVar2 = xVar2.f566l;
                        if (iG == 4) {
                            r rVar3 = new r(iG2);
                            c0574i2.a(rVar3.f41062a, 0, iG2, false);
                            rVar3.H(4);
                            s sVarB = N.b(Arrays.asList(N.c(rVar3, false, false).f444a));
                            if (sVar2 != null) {
                                sVarB = sVar2.b(sVarB);
                            }
                            xVar = new x(xVar2.f556a, xVar2.f557b, xVar2.f558c, xVar2.f559d, xVar2.f560e, xVar2.f562g, xVar2.f563h, xVar2.j, xVar2.f565k, sVarB);
                        } else if (iG == 6) {
                            r rVar4 = new r(iG2);
                            c0574i2.a(rVar4.f41062a, 0, iG2, false);
                            rVar4.H(4);
                            s sVar3 = new s(ImmutableList.M(M1.a.d(rVar4)));
                            if (sVar2 != null) {
                                sVar3 = sVar2.b(sVar3);
                            }
                            xVar = new x(xVar2.f556a, xVar2.f557b, xVar2.f558c, xVar2.f559d, xVar2.f560e, xVar2.f562g, xVar2.f563h, xVar2.j, xVar2.f565k, sVar3);
                        } else {
                            c0574i2.i(iG2);
                        }
                    }
                    xVar2 = xVar;
                }
                int i14 = A.f40996a;
                this.f3198i = xVar2;
                z12 = zF;
                i12 = 3;
                i13 = 7;
            }
            this.f3198i.getClass();
            this.j = Math.max(this.f3198i.f558c, 6);
            n nVarC = this.f3198i.c(bArr, this.f3197h);
            K k10 = this.f3195f;
            n.a aVarA = nVarC.a();
            aVarA.f35337l = t.m("audio/flac");
            C0576k.b(aVarA, k10);
            K k11 = this.f3195f;
            this.f3198i.b();
            k11.getClass();
            this.f3196g = 4;
            return 0;
        }
        long j11 = 0;
        if (i11 == 4) {
            ((C0574i) qVar).f525f = 0;
            r rVar5 = new r(2);
            C0574i c0574i3 = (C0574i) qVar;
            c0574i3.c(rVar5.f41062a, 0, 2, false);
            int iA = rVar5.A();
            if ((iA >> 2) != 16382) {
                c0574i3.f525f = 0;
                throw ParserException.a(null, "First frame does not start with sync code.");
            }
            c0574i3.f525f = 0;
            this.f3199k = iA;
            k kVar = this.f3194e;
            int i15 = A.f40996a;
            long j12 = c0574i3.f523d;
            this.f3198i.getClass();
            x xVar3 = this.f3198i;
            if (xVar3.f565k != null) {
                bVar = new w(xVar3, j12);
            } else {
                long j13 = c0574i3.f522c;
                if (j13 == -1 || xVar3.j <= 0) {
                    bVar = new F.b(xVar3.b());
                } else {
                    int i16 = this.f3199k;
                    a aVar = new a(i10, xVar3);
                    b.a aVar2 = new b.a(xVar3, i16);
                    long jB = xVar3.b();
                    int i17 = xVar3.f558c;
                    int i18 = xVar3.f559d;
                    if (i18 > 0) {
                        j = ((((long) i18) + ((long) i17)) / 2) + 1;
                    } else {
                        int i19 = xVar3.f557b;
                        int i20 = xVar3.f556a;
                        j = (((((i20 != i19 || i20 <= 0) ? 4096L : i20) * ((long) xVar3.f562g)) * ((long) xVar3.f563h)) / 8) + 64;
                    }
                    b bVar2 = new b(aVar, aVar2, jB, xVar3.j, j12, j13, j, Math.max(6, i17));
                    this.f3200l = bVar2;
                    bVar = bVar2.f485a;
                }
            }
            kVar.g(bVar);
            this.f3196g = 5;
            return 0;
        }
        if (i11 != 5) {
            throw new IllegalStateException();
        }
        this.f3195f.getClass();
        this.f3198i.getClass();
        b bVar3 = this.f3200l;
        if (bVar3 != null && bVar3.f487c != null) {
            return bVar3.a((C0574i) qVar, e10);
        }
        if (this.f3202n == -1) {
            x xVar4 = this.f3198i;
            ((C0574i) qVar).f525f = 0;
            C0574i c0574i4 = (C0574i) qVar;
            c0574i4.k(1, false);
            byte[] bArr4 = new byte[1];
            c0574i4.c(bArr4, 0, 1, false);
            boolean z13 = (bArr4[0] & 1) == 1;
            c0574i4.k(2, false);
            i13 = z13 ? 7 : 6;
            r rVar6 = new r(i13);
            byte[] bArr5 = rVar6.f41062a;
            int i21 = 0;
            while (i21 < i13) {
                int iM = c0574i4.m(bArr5, i21, i13 - i21);
                if (iM == -1) {
                    break;
                }
                i21 += iM;
            }
            rVar6.F(i21);
            c0574i4.f525f = 0;
            try {
                long jB2 = rVar6.B();
                if (!z13) {
                    jB2 *= (long) xVar4.f557b;
                }
                j11 = jB2;
            } catch (NumberFormatException unused) {
                z11 = false;
            }
            if (!z11) {
                throw ParserException.a(null, null);
            }
            this.f3202n = j11;
            return 0;
        }
        r rVar7 = this.f3191b;
        int i22 = rVar7.f41064c;
        if (i22 < 32768) {
            int i23 = ((C0574i) qVar).read(rVar7.f41062a, i22, 32768 - i22);
            z10 = i23 == -1;
            if (!z10) {
                rVar7.F(i22 + i23);
            } else if (rVar7.a() == 0) {
                long j14 = this.f3202n * 1000000;
                x xVar5 = this.f3198i;
                int i24 = A.f40996a;
                this.f3195f.b(j14 / ((long) xVar5.f560e), 1, this.f3201m, 0, null);
                return -1;
            }
        } else {
            z10 = false;
        }
        int i25 = rVar7.f41063b;
        int i26 = this.f3201m;
        int i27 = this.j;
        if (i26 < i27) {
            rVar7.H(Math.min(i27 - i26, rVar7.a()));
        }
        this.f3198i.getClass();
        int i28 = rVar7.f41063b;
        while (true) {
            int i29 = rVar7.f41064c - 16;
            u.a aVar3 = this.f3193d;
            if (i28 > i29) {
                if (z10) {
                    while (true) {
                        int i30 = rVar7.f41064c;
                        if (i28 <= i30 - this.j) {
                            rVar7.G(i28);
                            try {
                                zA = u.a(rVar7, this.f3198i, this.f3199k, aVar3);
                            } catch (IndexOutOfBoundsException unused2) {
                                zA = false;
                            }
                            if (rVar7.f41063b > rVar7.f41064c) {
                                zA = false;
                            }
                            if (zA) {
                                rVar7.G(i28);
                                j10 = aVar3.f553a;
                                break;
                            }
                            i28++;
                        } else {
                            rVar7.G(i30);
                        }
                    }
                } else {
                    rVar7.G(i28);
                }
                j10 = -1;
                break;
            }
            rVar7.G(i28);
            if (u.a(rVar7, this.f3198i, this.f3199k, aVar3)) {
                rVar7.G(i28);
                j10 = aVar3.f553a;
                break;
            }
            i28++;
        }
        int i31 = rVar7.f41063b - i25;
        rVar7.G(i25);
        this.f3195f.a(i31, rVar7);
        int i32 = i31 + this.f3201m;
        this.f3201m = i32;
        if (j10 != -1) {
            long j15 = this.f3202n * 1000000;
            x xVar6 = this.f3198i;
            int i33 = A.f40996a;
            this.f3195f.b(j15 / ((long) xVar6.f560e), 1, i32, 0, null);
            this.f3201m = 0;
            this.f3202n = j10;
        }
        if (rVar7.a() >= 16) {
            return 0;
        }
        int iA2 = rVar7.a();
        byte[] bArr6 = rVar7.f41062a;
        System.arraycopy(bArr6, rVar7.f41063b, bArr6, 0, iA2);
        rVar7.G(0);
        rVar7.F(iA2);
        return 0;
    }

    @Override // A1.p
    public final boolean l(q qVar) throws IOException {
        C0574i c0574i = (C0574i) qVar;
        s sVarA = new B().a(c0574i, g.f4750d);
        if (sVarA != null) {
            int length = sVarA.f35445a.length;
        }
        r rVar = new r(4);
        c0574i.c(rVar.f41062a, 0, 4, false);
        return rVar.w() == 1716281667;
    }

    @Override // A1.p
    public final void m(A1.r rVar) {
        k kVar = (k) rVar;
        this.f3194e = kVar;
        this.f3195f = kVar.p(0, 1);
        kVar.j();
    }

    @Override // A1.p
    public final void a() {
    }
}
