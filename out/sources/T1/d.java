package T1;

import A1.B;
import A1.C;
import A1.C0573h;
import A1.C0574i;
import A1.C0576k;
import A1.C0578m;
import A1.D;
import A1.E;
import A1.F;
import A1.K;
import A1.p;
import A1.q;
import A1.z;
import J4.n;
import O1.m;
import T4.o0;
import androidx.media3.exoplayer.source.k;
import com.google.common.primitives.Ints;
import java.io.EOFException;
import java.io.IOException;
import java.math.RoundingMode;
import p078g1.s;
import p078g1.t;
import p114j1.A;
import p114j1.r;

/* JADX INFO: compiled from: Mp3Extractor.java */
/* JADX INFO: loaded from: classes.dex */
public final class d implements p {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C4.b f5765v = new C4.b(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f5768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final D.a f5769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z f5770e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final B f5771f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0578m f5772g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public k f5773h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public K f5774i;
    public K j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f5775k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public s f5776l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f5777m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f5778n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f5779o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f5780p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f5781q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public e f5782r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f5783s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f5784t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f5785u;

    public d() {
        this(0);
    }

    public static long c(s sVar) {
        if (sVar == null) {
            return -9223372036854775807L;
        }
        int length = sVar.f35445a.length;
        for (int i10 = 0; i10 < length; i10++) {
            s.a aVar = sVar.f35445a[i10];
            if (aVar instanceof m) {
                m mVar = (m) aVar;
                if (mVar.f4755a.equals("TLEN")) {
                    return A.F(Long.parseLong(mVar.f4768c.get(0)));
                }
            }
        }
        return -9223372036854775807L;
    }

    public final void d() {
        F f10 = this.f5782r;
        if ((f10 instanceof a) && ((C0573h) f10).d()) {
            long j = this.f5780p;
            if (j == -1 || j == this.f5782r.c()) {
                return;
            }
            a aVar = (a) this.f5782r;
            long j10 = this.f5780p;
            int i10 = aVar.j;
            this.f5782r = new a(j10, aVar.f5755h, aVar.f5756i, i10, aVar.f5757k);
            k kVar = this.f5773h;
            kVar.getClass();
            kVar.g(this.f5782r);
            this.f5774i.getClass();
            this.f5782r.k();
        }
    }

    public final boolean e(C0574i c0574i) throws IOException {
        e eVar = this.f5782r;
        if (eVar != null) {
            long jC = eVar.c();
            if (jC != -1 && c0574i.d() > jC - 4) {
                return true;
            }
        }
        try {
            return !c0574i.c(this.f5768c.f41062a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    @Override // A1.p
    public final void f(long j, long j10) {
        this.f5775k = 0;
        this.f5777m = -9223372036854775807L;
        this.f5778n = 0L;
        this.f5781q = 0;
        this.f5785u = j10;
        e eVar = this.f5782r;
        if (eVar instanceof b) {
            o0 o0Var = ((b) eVar).f5761c.f398b;
            int i10 = o0Var.f5989a;
            if (i10 != 0 && j10 - o0Var.c(i10 - 1) < 100000) {
                return;
            }
            this.f5784t = true;
            this.j = this.f5772g;
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0235  */
    /* JADX WARN: Code duplicated, block: B:109:0x0241  */
    /* JADX WARN: Code duplicated, block: B:115:0x025c  */
    /* JADX WARN: Code duplicated, block: B:118:0x026a  */
    /* JADX WARN: Code duplicated, block: B:119:0x026c  */
    /* JADX WARN: Code duplicated, block: B:124:0x0283  */
    /* JADX WARN: Code duplicated, block: B:126:0x0298  */
    /* JADX WARN: Code duplicated, block: B:132:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:136:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:138:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:140:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:142:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:14:0x0045  */
    /* JADX WARN: Code duplicated, block: B:202:0x047a  */
    /* JADX WARN: Code duplicated, block: B:204:0x0489  */
    /* JADX WARN: Code duplicated, block: B:205:0x048c  */
    /* JADX WARN: Code duplicated, block: B:232:0x053b  */
    /* JADX WARN: Code duplicated, block: B:234:0x0542  */
    /* JADX WARN: Code duplicated, block: B:238:0x0551  */
    /* JADX WARN: Code duplicated, block: B:241:0x0559  */
    /* JADX WARN: Code duplicated, block: B:244:0x0580  */
    /* JADX WARN: Code duplicated, block: B:246:0x0586  */
    /* JADX WARN: Code duplicated, block: B:248:0x059b  */
    /* JADX WARN: Code duplicated, block: B:25:0x006a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:29:0x0079  */
    /* JADX WARN: Code duplicated, block: B:30:0x007b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0097  */
    /* JADX WARN: Code duplicated, block: B:69:0x018f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0195  */
    /* JADX WARN: Code duplicated, block: B:74:0x019b  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:79:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:81:0x01b1 A[LOOP:3: B:80:0x01af->B:81:0x01b1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:83:0x01be  */
    /* JADX WARN: Code duplicated, block: B:86:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:89:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:90:0x01e2  */
    @Override // A1.p
    public final int h(q qVar, E e10) throws IOException {
        d dVar;
        D.a aVar;
        int i10;
        int i11;
        e eVar;
        long j;
        q qVar2;
        int iF;
        int i12;
        int i13;
        C0574i c0574i;
        int iH;
        int i14;
        int iH2;
        D.a aVar2;
        int iH3;
        int iY;
        long jW;
        long[] jArr;
        int i15;
        int i16;
        long j10;
        int i17;
        int i18;
        z zVar;
        q qVar3;
        long j11;
        long j12;
        long j13;
        long J10;
        long j14;
        e aVar3;
        long j15;
        long J11;
        long[] jArr2;
        int i19;
        D.a aVar4;
        c cVar;
        e aVar5;
        long jC;
        z zVar2;
        f fVar;
        int iU;
        p241t7.b.l(this.f5774i);
        int i20 = A.f40996a;
        int i21 = this.f5775k;
        D.a aVar6 = this.f5769d;
        if (i21 == 0) {
            try {
                i((C0574i) qVar, false);
            } catch (EOFException unused) {
                dVar = this;
                aVar = aVar6;
                i10 = -1;
                i11 = -1;
            }
        }
        e eVar2 = this.f5782r;
        r rVar = this.f5768c;
        if (eVar2 != null) {
            dVar = this;
            aVar = aVar6;
            rVar = rVar;
            long j16 = dVar.f5779o;
            if (j16 != 0) {
                qVar2 = qVar;
                long j17 = ((C0574i) qVar2).f523d;
                if (j17 < j16) {
                    ((C0574i) qVar2).i((int) (j16 - j17));
                }
            }
            if (dVar.f5781q == 0) {
                ((C0574i) qVar2).f525f = 0;
                c0574i = (C0574i) qVar2;
                if (dVar.e(c0574i)) {
                    i13 = -1;
                } else {
                    rVar.G(0);
                    iH = rVar.h();
                    if (((-128000) & iH) == (((long) dVar.f5775k) & (-128000)) || D.a(iH) == -1) {
                        c0574i.i(1);
                        dVar.f5775k = 0;
                    } else {
                        aVar.a(iH);
                        if (dVar.f5777m == -9223372036854775807L) {
                            dVar.f5777m = dVar.f5782r.e(c0574i.f523d);
                            long j18 = dVar.f5767b;
                            if (j18 != -9223372036854775807L) {
                                dVar.f5777m = (j18 - dVar.f5782r.e(0L)) + dVar.f5777m;
                            }
                        }
                        int i22 = aVar.f409c;
                        dVar.f5781q = i22;
                        long j19 = c0574i.f523d + ((long) i22);
                        dVar.f5780p = j19;
                        e eVar3 = dVar.f5782r;
                        if (eVar3 instanceof b) {
                            b bVar = (b) eVar3;
                            long j20 = (((dVar.f5778n + ((long) aVar.f413g)) * 1000000) / ((long) aVar.f410d)) + dVar.f5777m;
                            o0 o0Var = bVar.f5761c.f398b;
                            int i23 = o0Var.f5989a;
                            C c10 = bVar.f5761c;
                            if (i23 == 0 || j20 - o0Var.c(i23 - 1) >= 100000) {
                                c10.a(j20, j19);
                            }
                            if (dVar.f5784t) {
                                long j21 = dVar.f5785u;
                                o0 o0Var2 = c10.f398b;
                                int i24 = o0Var2.f5989a;
                                if (i24 != 0 && j21 - o0Var2.c(i24 - 1) < 100000) {
                                    dVar.f5784t = false;
                                    dVar.j = dVar.f5774i;
                                }
                            }
                        }
                        iF = dVar.j.f(qVar2, dVar.f5781q, true);
                        if (iF == -1) {
                            i13 = -1;
                        } else {
                            i12 = dVar.f5781q - iF;
                            dVar.f5781q = i12;
                            if (i12 <= 0) {
                                dVar.j.b(dVar.f5777m + ((dVar.f5778n * 1000000) / ((long) aVar.f410d)), 1, aVar.f409c, 0, null);
                                dVar.f5778n += (long) aVar.f413g;
                                dVar.f5781q = 0;
                                i13 = 0;
                            }
                        }
                    }
                    i13 = 0;
                }
            } else {
                iF = dVar.j.f(qVar2, dVar.f5781q, true);
                if (iF == -1) {
                    i13 = -1;
                } else {
                    i12 = dVar.f5781q - iF;
                    dVar.f5781q = i12;
                    if (i12 <= 0) {
                        i13 = 0;
                    } else {
                        dVar.j.b(dVar.f5777m + ((dVar.f5778n * 1000000) / ((long) aVar.f410d)), 1, aVar.f409c, 0, null);
                        dVar.f5778n += (long) aVar.f413g;
                        dVar.f5781q = 0;
                        i13 = 0;
                    }
                }
            }
            i11 = i13;
            i10 = -1;
            if (i11 == i10) {
                eVar = dVar.f5782r;
                if (eVar instanceof b) {
                    j = ((dVar.f5778n * 1000000) / ((long) aVar.f410d)) + dVar.f5777m;
                    if (eVar.k() != j) {
                        e eVar4 = dVar.f5782r;
                        ((b) eVar4).f5761c.f399c = j;
                        dVar.f5773h.g(eVar4);
                        K k10 = dVar.f5774i;
                        dVar.f5782r.k();
                        k10.getClass();
                    }
                }
            }
            return i11;
        }
        r rVar2 = new r(aVar6.f409c);
        ((C0574i) qVar).c(rVar2.f41062a, 0, aVar6.f409c, false);
        if ((aVar6.f407a & 1) != 0) {
            if (aVar6.f411e != 1) {
                i14 = 36;
            } else {
                i14 = 21;
            }
        } else if (aVar6.f411e != 1) {
            i14 = 21;
        } else {
            i14 = 13;
        }
        if (rVar2.f41064c >= i14 + 4) {
            rVar2.G(i14);
            iH2 = rVar2.h();
            if (iH2 != 1483304551 && iH2 != 1231971951) {
                if (rVar2.f41064c >= 40) {
                    rVar2.G(36);
                    if (rVar2.h() == 1447187017) {
                        iH2 = 1447187017;
                    } else {
                        iH2 = 0;
                    }
                } else {
                    iH2 = 0;
                }
            }
        } else if (rVar2.f41064c >= 40) {
            rVar2.G(36);
            if (rVar2.h() == 1447187017) {
                iH2 = 1447187017;
            } else {
                iH2 = 0;
            }
        } else {
            iH2 = 0;
        }
        z zVar3 = this.f5770e;
        long jC2 = -1;
        if (iH2 == 1231971951) {
            aVar2 = aVar6;
            iH3 = rVar2.h();
            if ((iH3 & 1) != 0) {
                iY = rVar2.y();
            } else {
                iY = -1;
            }
            if ((iH3 & 2) != 0) {
                jW = rVar2.w();
            } else {
                jW = -1;
            }
            if ((iH3 & 4) == 4) {
                jArr2 = new long[100];
                for (i19 = 0; i19 < 100; i19++) {
                    jArr2[i19] = rVar2.u();
                }
                jArr = jArr2;
            } else {
                jArr = null;
            }
            if ((iH3 & 8) != 0) {
                rVar2.H(4);
            }
            if (rVar2.a() >= 24) {
                rVar2.H(21);
                int iX = rVar2.x();
                i16 = (16773120 & iX) >> 12;
                i15 = iX & 4095;
            } else {
                i15 = -1;
                i16 = -1;
            }
            j10 = iY;
            i17 = aVar2.f409c;
            int i25 = aVar2.f410d;
            i18 = aVar2.f412f;
            int i26 = aVar2.f413g;
            zVar = zVar3;
            if ((zVar.f571a != -1 || zVar.f572b == -1) && i16 != -1 && i15 != -1) {
                zVar.f571a = i16;
                zVar.f572b = i15;
            }
            qVar3 = qVar;
            C0574i c0574i2 = (C0574i) qVar3;
            j11 = c0574i2.f523d;
            j12 = c0574i2.f522c;
            if (j12 == -1 && jW != -1) {
                long j22 = j11 + jW;
                if (j12 != j22) {
                    StringBuilder sbF = n.f("Data size mismatch between stream (", ") and Xing frame (", j12);
                    sbF.append(j22);
                    sbF.append("), using Xing value.");
                    p114j1.k.e(sbF.toString());
                }
            }
            c0574i2.i(aVar2.f409c);
            if (iH2 == 1483304551) {
                if (j10 != -1 || j10 == 0) {
                    j15 = -9223372036854775807L;
                    J11 = -9223372036854775807L;
                } else {
                    J11 = A.J(i25, (j10 * ((long) i26)) - 1);
                    j15 = -9223372036854775807L;
                }
                if (J11 == j15) {
                    aVar3 = null;
                } else if (jW != -1 || jArr == null) {
                    aVar3 = new g(j11, i17, J11, i18, -1L, null);
                } else {
                    aVar3 = new g(j11, i17, J11, i18, jW, jArr);
                }
            } else {
                if (j10 != -1 || j10 == 0) {
                    j13 = -9223372036854775807L;
                    J10 = -9223372036854775807L;
                } else {
                    J10 = A.J(i25, (((long) i26) * j10) - 1);
                    j13 = -9223372036854775807L;
                }
                if (J10 != j13) {
                    if (jW != -1) {
                        j12 = j11 + jW;
                        j14 = jW - ((long) i17);
                    } else if (j12 != -1) {
                        j14 = (j12 - j11) - ((long) i17);
                    } else {
                        aVar3 = null;
                    }
                    long j23 = j12;
                    long j24 = j14;
                    RoundingMode roundingMode = RoundingMode.HALF_UP;
                    aVar3 = new a(j23, j11 + ((long) i17), Ints.j0(A.L(j24, 8000000L, J10, roundingMode)), Ints.j0(p095h6.c.b(j24, j10, roundingMode)), false);
                } else {
                    aVar3 = null;
                }
            }
            dVar = this;
        } else if (iH2 == 1447187017) {
            C0574i c0574i3 = (C0574i) qVar;
            long j25 = c0574i3.f523d;
            rVar2.H(6);
            long jH = ((long) aVar6.f409c) + j25 + ((long) rVar2.h());
            int iH4 = rVar2.h();
            if (iH4 <= 0) {
                zVar2 = zVar3;
                aVar2 = aVar6;
            } else {
                long J12 = A.J(aVar6.f410d, (((long) iH4) * ((long) aVar6.f413g)) - 1);
                int iA = rVar2.A();
                int iA2 = rVar2.A();
                int iA3 = rVar2.A();
                rVar2.H(2);
                long j26 = j25 + ((long) aVar6.f409c);
                long[] jArr3 = new long[iA];
                long[] jArr4 = new long[iA];
                int i27 = 0;
                while (true) {
                    if (i27 >= iA) {
                        zVar2 = zVar3;
                        D.a aVar7 = aVar6;
                        long j27 = c0574i3.f522c;
                        if (j27 != -1 && j27 != jH) {
                            StringBuilder sbF2 = n.f("VBRI data size mismatch: ", ", ", j27);
                            sbF2.append(jH);
                            p114j1.k.f(sbF2.toString());
                        }
                        if (jH != j26) {
                            StringBuilder sbF3 = n.f("VBRI bytes and ToC mismatch (using max): ", ", ", jH);
                            sbF3.append(j26);
                            sbF3.append("\nSeeking will be inaccurate.");
                            p114j1.k.f(sbF3.toString());
                            jH = Math.max(jH, j26);
                        }
                        aVar2 = aVar7;
                        fVar = new f(jArr3, jArr4, J12, jH, aVar2.f412f);
                        break;
                    }
                    zVar2 = zVar3;
                    D.a aVar8 = aVar6;
                    jArr3[i27] = (((long) i27) * J12) / ((long) iA);
                    jArr4[i27] = j26;
                    if (iA3 == 1) {
                        iU = rVar2.u();
                    } else if (iA3 == 2) {
                        iU = rVar2.A();
                    } else if (iA3 == 3) {
                        iU = rVar2.x();
                    } else if (iA3 != 4) {
                        aVar2 = aVar8;
                    } else {
                        iU = rVar2.y();
                    }
                    j26 += ((long) iU) * ((long) iA2);
                    i27++;
                    aVar6 = aVar8;
                    zVar3 = zVar2;
                }
                c0574i3.i(aVar2.f409c);
                dVar = this;
                aVar3 = fVar;
                zVar = zVar2;
                qVar3 = qVar;
            }
            fVar = null;
            c0574i3.i(aVar2.f409c);
            dVar = this;
            aVar3 = fVar;
            zVar = zVar2;
            qVar3 = qVar;
        } else if (iH2 != 1483304551) {
            ((C0574i) qVar).f525f = 0;
            dVar = this;
            qVar3 = qVar;
            zVar = zVar3;
            aVar2 = aVar6;
            aVar3 = null;
        } else {
            aVar2 = aVar6;
            iH3 = rVar2.h();
            if ((iH3 & 1) != 0) {
                iY = rVar2.y();
            } else {
                iY = -1;
            }
            if ((iH3 & 2) != 0) {
                jW = rVar2.w();
            } else {
                jW = -1;
            }
            if ((iH3 & 4) == 4) {
                jArr2 = new long[100];
                while (i19 < 100) {
                    jArr2[i19] = rVar2.u();
                }
                jArr = jArr2;
            } else {
                jArr = null;
            }
            if ((iH3 & 8) != 0) {
                rVar2.H(4);
            }
            if (rVar2.a() >= 24) {
                rVar2.H(21);
                int iX2 = rVar2.x();
                i16 = (16773120 & iX2) >> 12;
                i15 = iX2 & 4095;
            } else {
                i15 = -1;
                i16 = -1;
            }
            j10 = iY;
            i17 = aVar2.f409c;
            int i28 = aVar2.f410d;
            i18 = aVar2.f412f;
            int i29 = aVar2.f413g;
            zVar = zVar3;
            if (zVar.f571a != -1) {
                zVar.f571a = i16;
                zVar.f572b = i15;
            } else {
                zVar.f571a = i16;
                zVar.f572b = i15;
            }
            qVar3 = qVar;
            C0574i c0574i4 = (C0574i) qVar3;
            j11 = c0574i4.f523d;
            j12 = c0574i4.f522c;
            if (j12 == -1) {
            }
            c0574i4.i(aVar2.f409c);
            if (iH2 == 1483304551) {
                if (j10 != -1) {
                    j15 = -9223372036854775807L;
                    J11 = -9223372036854775807L;
                } else {
                    j15 = -9223372036854775807L;
                    J11 = -9223372036854775807L;
                }
                if (J11 == j15) {
                    aVar3 = null;
                } else if (jW != -1) {
                    aVar3 = new g(j11, i17, J11, i18, -1L, null);
                } else {
                    aVar3 = new g(j11, i17, J11, i18, -1L, null);
                }
            } else {
                if (j10 != -1) {
                    j13 = -9223372036854775807L;
                    J10 = -9223372036854775807L;
                } else {
                    j13 = -9223372036854775807L;
                    J10 = -9223372036854775807L;
                }
                if (J10 != j13) {
                    if (jW != -1) {
                        j12 = j11 + jW;
                        j14 = jW - ((long) i17);
                    } else if (j12 != -1) {
                        j14 = (j12 - j11) - ((long) i17);
                    } else {
                        aVar3 = null;
                    }
                    long j28 = j12;
                    long j29 = j14;
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    aVar3 = new a(j28, j11 + ((long) i17), Ints.j0(A.L(j29, 8000000L, J10, roundingMode2)), Ints.j0(p095h6.c.b(j29, j10, roundingMode2)), false);
                } else {
                    aVar3 = null;
                }
            }
            dVar = this;
        }
        s sVar = dVar.f5776l;
        C0574i c0574i5 = (C0574i) qVar3;
        long j30 = c0574i5.f523d;
        if (sVar == null) {
            aVar4 = aVar2;
            cVar = null;
            break;
        }
        s.a[] aVarArr = sVar.f35445a;
        int length = aVarArr.length;
        int i30 = 0;
        while (true) {
            if (i30 >= length) {
                aVar4 = aVar2;
                cVar = null;
                break;
            }
            s.a aVar9 = aVarArr[i30];
            if (aVar9 instanceof O1.k) {
                O1.k kVar = (O1.k) aVar9;
                long jC3 = c(sVar);
                int length2 = kVar.f4763e.length;
                boolean z10 = true;
                int i31 = length2 + 1;
                long[] jArr5 = new long[i31];
                long[] jArr6 = new long[i31];
                jArr5[0] = j30;
                jArr6[0] = 0;
                int i32 = 1;
                long j31 = 0;
                while (i32 <= length2) {
                    int i33 = i32 - 1;
                    j30 += (long) (kVar.f4761c + kVar.f4763e[i33]);
                    j31 += (long) (kVar.f4762d + kVar.f4764f[i33]);
                    jArr5[i32] = j30;
                    jArr6[i32] = j31;
                    i32++;
                    z10 = true;
                    length2 = length2;
                    aVar2 = aVar2;
                }
                aVar4 = aVar2;
                cVar = new c(jC3, jArr5, jArr6);
                break;
            }
            i30++;
        }
        boolean z11 = dVar.f5783s;
        int i34 = dVar.f5766a;
        if (z11) {
            aVar5 = new e.a(-9223372036854775807L);
            rVar = rVar;
            aVar = aVar4;
        } else {
            if ((i34 & 4) != 0) {
                if (cVar != null) {
                    jC = cVar.f5764c;
                } else if (aVar3 != null) {
                    jC = aVar3.k();
                    jC2 = aVar3.c();
                } else {
                    jC = c(dVar.f5776l);
                }
                aVar3 = new b(jC, c0574i5.f523d, jC2);
            } else if (cVar != null) {
                aVar3 = cVar;
            } else if (aVar3 == null) {
                aVar3 = null;
            }
            if (aVar3 == null || !(aVar3.d() || (i34 & 1) == 0)) {
                boolean z12 = (2 & i34) != 0;
                c0574i5.c(rVar.f41062a, 0, 4, false);
                rVar.G(0);
                aVar = aVar4;
                aVar.a(rVar.h());
                aVar5 = new a(c0574i5.f522c, c0574i5.f523d, aVar.f412f, aVar.f409c, z12);
            } else {
                aVar5 = aVar3;
                rVar = rVar;
                aVar = aVar4;
            }
            K k11 = dVar.f5774i;
            aVar5.k();
            k11.getClass();
        }
        dVar.f5782r = aVar5;
        dVar.f5773h.g(aVar5);
        g1.n.a aVar10 = new g1.n.a();
        aVar10.f35337l = t.m("audio/mpeg");
        aVar10.f35338m = t.m(aVar.f408b);
        aVar10.f35339n = 4096;
        aVar10.f35317C = aVar.f411e;
        aVar10.f35318D = aVar.f410d;
        z zVar4 = zVar;
        aVar10.f35320F = zVar4.f571a;
        aVar10.f35321G = zVar4.f572b;
        aVar10.f35336k = (i34 & 8) != 0 ? null : dVar.f5776l;
        if (dVar.f5782r.j() != -2147483647) {
            aVar10.f35334h = dVar.f5782r.j();
        }
        C0576k.b(aVar10, dVar.j);
        dVar.f5779o = c0574i5.f523d;
        qVar2 = qVar;
        if (dVar.f5781q == 0) {
            ((C0574i) qVar2).f525f = 0;
            c0574i = (C0574i) qVar2;
            if (dVar.e(c0574i)) {
                i13 = -1;
            } else {
                rVar.G(0);
                iH = rVar.h();
                if (((-128000) & iH) == (((long) dVar.f5775k) & (-128000))) {
                }
                c0574i.i(1);
                dVar.f5775k = 0;
                i13 = 0;
            }
        } else {
            iF = dVar.j.f(qVar2, dVar.f5781q, true);
            if (iF == -1) {
                i13 = -1;
            } else {
                i12 = dVar.f5781q - iF;
                dVar.f5781q = i12;
                if (i12 <= 0) {
                    i13 = 0;
                } else {
                    dVar.j.b(dVar.f5777m + ((dVar.f5778n * 1000000) / ((long) aVar.f410d)), 1, aVar.f409c, 0, null);
                    dVar.f5778n += (long) aVar.f413g;
                    dVar.f5781q = 0;
                    i13 = 0;
                }
            }
        }
        i11 = i13;
        i10 = -1;
        if (i11 == i10) {
            eVar = dVar.f5782r;
            if (eVar instanceof b) {
                j = ((dVar.f5778n * 1000000) / ((long) aVar.f410d)) + dVar.f5777m;
                if (eVar.k() != j) {
                    e eVar5 = dVar.f5782r;
                    ((b) eVar5).f5761c.f399c = j;
                    dVar.f5773h.g(eVar5);
                    K k12 = dVar.f5774i;
                    dVar.f5782r.k();
                    k12.getClass();
                }
            }
        }
        return i11;
    }

    public final boolean i(C0574i c0574i, boolean z10) throws IOException {
        int iD;
        int i10;
        int iA;
        int i11 = z10 ? 32768 : 131072;
        c0574i.f525f = 0;
        if (c0574i.f523d == 0) {
            s sVarA = this.f5771f.a(c0574i, (this.f5766a & 8) == 0 ? null : f5765v);
            this.f5776l = sVarA;
            if (sVarA != null) {
                this.f5770e.b(sVarA);
            }
            iD = (int) c0574i.d();
            if (!z10) {
                c0574i.i(iD);
            }
            i10 = 0;
        } else {
            iD = 0;
            i10 = 0;
        }
        int i12 = i10;
        int i13 = i12;
        while (true) {
            if (e(c0574i)) {
                if (i12 > 0) {
                    break;
                }
                d();
                throw new EOFException();
            }
            r rVar = this.f5768c;
            rVar.G(0);
            int iH = rVar.h();
            if ((i10 == 0 || ((-128000) & iH) == (((long) i10) & (-128000))) && (iA = D.a(iH)) != -1) {
                i12++;
                if (i12 != 1) {
                    if (i12 == 4) {
                        break;
                    }
                } else {
                    this.f5769d.a(iH);
                    i10 = iH;
                }
                c0574i.k(iA - 4, false);
            } else {
                int i14 = i13 + 1;
                if (i13 == i11) {
                    if (z10) {
                        return false;
                    }
                    d();
                    throw new EOFException();
                }
                if (z10) {
                    c0574i.f525f = 0;
                    c0574i.k(iD + i14, false);
                } else {
                    c0574i.i(1);
                }
                i12 = 0;
                i13 = i14;
                i10 = 0;
            }
        }
        if (z10) {
            c0574i.i(iD + i13);
        } else {
            c0574i.f525f = 0;
        }
        this.f5775k = i10;
        return true;
    }

    @Override // A1.p
    public final boolean l(q qVar) throws IOException {
        return i((C0574i) qVar, true);
    }

    @Override // A1.p
    public final void m(A1.r rVar) {
        k kVar = (k) rVar;
        this.f5773h = kVar;
        K kP = kVar.p(0, 1);
        this.f5774i = kP;
        this.j = kP;
        this.f5773h.j();
    }

    public d(int i10) {
        this.f5766a = 0;
        this.f5767b = -9223372036854775807L;
        this.f5768c = new r(10);
        this.f5769d = new D.a();
        this.f5770e = new z();
        this.f5777m = -9223372036854775807L;
        this.f5771f = new B();
        C0578m c0578m = new C0578m();
        this.f5772g = c0578m;
        this.j = c0578m;
        this.f5780p = -1L;
    }

    @Override // A1.p
    public final void a() {
    }
}
