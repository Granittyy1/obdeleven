package p091h2;

import A1.K;
import androidx.media3.common.ParserException;
import com.google.common.collect.ImmutableList;
import p078g1.n;
import p078g1.t;
import p095h6.c;
import p114j1.A;
import p114j1.q;
import p241t7.b;

/* JADX INFO: compiled from: MpeghReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class r implements j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f36065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public K f36066f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f36069i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f36070k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f36071l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f36073n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f36074o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f36078s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f36080u;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f36064d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p114j1.r f36061a = new p114j1.r(2, new byte[15]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f36062b = new q();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p114j1.r f36063c = new p114j1.r();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s.a f36075p = new s.a();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f36076q = -2147483647;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f36077r = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f36079t = -1;
    public boolean j = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f36072m = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f36067g = -9.223372036854776E18d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public double f36068h = -9.223372036854776E18d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:153:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:155:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:157:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:160:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:187:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:194:0x03d6  */
    /* JADX WARN: Instruction removed from duplicated block: B:153:0x02b0, please report this as an issue */
    @Override // p091h2.j
    public final void a(p114j1.r rVar) throws ParserException {
        int i10;
        int iG;
        int iG2;
        int i11;
        char c10;
        byte[] bArr;
        long j;
        long j10;
        ImmutableList immutableListN;
        int iG3;
        long jI;
        boolean z10;
        b.l(this.f36066f);
        while (rVar.a() > 0) {
            int i12 = this.f36064d;
            int i13 = 8;
            int i14 = 1;
            if (i12 == 0) {
                int i15 = this.f36070k;
                if ((i15 & 2) != 0) {
                    if ((i15 & 4) == 0) {
                        while (rVar.a() > 0) {
                            int i16 = this.f36071l << 8;
                            this.f36071l = i16;
                            int iU = i16 | rVar.u();
                            this.f36071l = iU;
                            if ((iU & 16777215) == 12583333) {
                                rVar.G(rVar.f41063b - 3);
                                this.f36071l = 0;
                            }
                        }
                    }
                    this.f36064d = 1;
                    break;
                }
                rVar.G(rVar.f41064c);
            } else {
                s.a aVar = this.f36075p;
                p114j1.r rVar2 = this.f36063c;
                if (i12 == 1) {
                    int iA = rVar.a();
                    p114j1.r rVar3 = this.f36061a;
                    int iMin = Math.min(iA, rVar3.a());
                    rVar.f(rVar3.f41062a, rVar3.f41063b, iMin);
                    rVar3.H(iMin);
                    if (rVar3.a() == 0) {
                        int i17 = rVar3.f41064c;
                        byte[] bArr2 = rVar3.f41062a;
                        q qVar = this.f36062b;
                        qVar.k(i17, bArr2);
                        qVar.d();
                        int iA2 = s.a(qVar, 3, 8, 8);
                        aVar.f36081a = iA2;
                        if (iA2 != -1) {
                            b.e(Math.max(Math.max(2, 8), 32) <= 63);
                            c.a(c.a(3L, 255L), 4294967296L);
                            if (qVar.b() < 2) {
                                jI = -1;
                            } else {
                                jI = qVar.i(2);
                                if (jI == 3) {
                                    if (qVar.b() < 8) {
                                        jI = -1;
                                    } else {
                                        long jI2 = qVar.i(8);
                                        jI += jI2;
                                        if (jI2 == 255) {
                                            if (qVar.b() < 32) {
                                                jI = -1;
                                            } else {
                                                jI += qVar.i(32);
                                            }
                                        }
                                    }
                                }
                            }
                            aVar.f36082b = jI;
                            if (jI == -1) {
                                z10 = false;
                            } else {
                                if (jI > 16) {
                                    throw ParserException.b("Contains sub-stream with an invalid packet label " + aVar.f36082b);
                                }
                                if (jI == 0) {
                                    int i18 = aVar.f36081a;
                                    if (i18 == 1) {
                                        throw ParserException.a(null, "Mpegh3daConfig packet with invalid packet label 0");
                                    }
                                    if (i18 == 2) {
                                        throw ParserException.a(null, "Mpegh3daFrame packet with invalid packet label 0");
                                    }
                                    if (i18 == 17) {
                                        throw ParserException.a(null, "AudioTruncation packet with invalid packet label 0");
                                    }
                                }
                                int iA3 = s.a(qVar, 11, 24, 24);
                                aVar.f36083c = iA3;
                                if (iA3 != -1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                            }
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            this.f36073n = 0;
                            this.f36074o = aVar.f36083c + i17 + this.f36074o;
                        }
                        if (z10) {
                            rVar3.G(0);
                            this.f36066f.a(rVar3.f41064c, rVar3);
                            rVar3.D(2);
                            rVar2.D(aVar.f36083c);
                            this.f36072m = true;
                            this.f36064d = 2;
                        } else {
                            int i19 = rVar3.f41064c;
                            if (i19 < 15) {
                                rVar3.F(i19 + 1);
                                this.f36072m = false;
                            }
                        }
                    } else {
                        this.f36072m = false;
                    }
                } else {
                    if (i12 != 2) {
                        throw new IllegalStateException();
                    }
                    int i20 = aVar.f36081a;
                    if (i20 == 1 || i20 == 17) {
                        int i21 = rVar.f41063b;
                        int iMin2 = Math.min(rVar.a(), rVar2.a());
                        rVar.f(rVar2.f41062a, rVar2.f41063b, iMin2);
                        rVar2.H(iMin2);
                        rVar.G(i21);
                    }
                    int iMin3 = Math.min(rVar.a(), aVar.f36083c - this.f36073n);
                    this.f36066f.a(iMin3, rVar);
                    int i22 = this.f36073n + iMin3;
                    this.f36073n = i22;
                    if (i22 != aVar.f36083c) {
                        continue;
                    } else {
                        int i23 = aVar.f36081a;
                        if (i23 == 1) {
                            byte[] bArr3 = rVar2.f41062a;
                            q qVar2 = new q(bArr3.length, bArr3);
                            int iG4 = qVar2.g(8);
                            int iG5 = qVar2.g(5);
                            if (iG5 != 31) {
                                switch (iG5) {
                                    case 0:
                                        iG2 = 96000;
                                        break;
                                    case 1:
                                        iG2 = 88200;
                                        break;
                                    case 2:
                                        iG2 = 64000;
                                        break;
                                    case 3:
                                        iG2 = 48000;
                                        break;
                                    case 4:
                                        iG2 = 44100;
                                        break;
                                    case 5:
                                        iG2 = 32000;
                                        break;
                                    case 6:
                                        iG2 = 24000;
                                        break;
                                    case 7:
                                        iG2 = 22050;
                                        break;
                                    case 8:
                                        iG2 = 16000;
                                        break;
                                    case 9:
                                        iG2 = 12000;
                                        break;
                                    case 10:
                                        iG2 = 11025;
                                        break;
                                    case 11:
                                        iG2 = 8000;
                                        break;
                                    case 12:
                                        iG2 = 7350;
                                        break;
                                    case 13:
                                    case 14:
                                    default:
                                        throw ParserException.b("Unsupported sampling rate index " + iG5);
                                    case 15:
                                        iG2 = 57600;
                                        break;
                                    case 16:
                                        iG2 = 51200;
                                        break;
                                    case 17:
                                        iG2 = 40000;
                                        break;
                                    case 18:
                                        iG2 = 38400;
                                        break;
                                    case 19:
                                        iG2 = 34150;
                                        break;
                                    case 20:
                                        iG2 = 28800;
                                        break;
                                    case 21:
                                        iG2 = 25600;
                                        break;
                                    case 22:
                                        iG2 = 20000;
                                        break;
                                    case 23:
                                        iG2 = 19200;
                                        break;
                                    case 24:
                                        iG2 = 17075;
                                        break;
                                    case 25:
                                        iG2 = 14400;
                                        break;
                                    case 26:
                                        iG2 = 12800;
                                        break;
                                    case 27:
                                        iG2 = 9600;
                                        break;
                                }
                            } else {
                                iG2 = qVar2.g(24);
                            }
                            int iG6 = qVar2.g(3);
                            if (iG6 == 0) {
                                i11 = 768;
                            } else if (iG6 == 1) {
                                i11 = 1024;
                            } else if (iG6 == 2 || iG6 == 3) {
                                i11 = 2048;
                            } else {
                                if (iG6 != 4) {
                                    throw ParserException.b("Unsupported coreSbrFrameLengthIndex " + iG6);
                                }
                                i11 = 4096;
                            }
                            int i24 = i11;
                            if (iG6 == 0 || iG6 == 1) {
                                c10 = 0;
                            } else if (iG6 == 2) {
                                c10 = 2;
                            } else if (iG6 == 3) {
                                c10 = 3;
                            } else {
                                if (iG6 != 4) {
                                    throw ParserException.b("Unsupported coreSbrFrameLengthIndex " + iG6);
                                }
                                c10 = 1;
                            }
                            qVar2.o(2);
                            s.c(qVar2);
                            int iG7 = qVar2.g(5);
                            int i25 = 0;
                            int iA4 = 0;
                            while (true) {
                                int i26 = 16;
                                if (i25 < iG7 + 1) {
                                    int iG8 = qVar2.g(3);
                                    iA4 = s.a(qVar2, 5, 8, 16) + 1 + iA4;
                                    if ((iG8 == 0 || iG8 == 2) && qVar2.f()) {
                                        s.c(qVar2);
                                    }
                                    i25++;
                                } else {
                                    int iA5 = s.a(qVar2, 4, 8, 16) + 1;
                                    qVar2.n();
                                    int i27 = 0;
                                    while (true) {
                                        double d10 = 2.0d;
                                        if (i27 < iA5) {
                                            int iG9 = qVar2.g(2);
                                            if (iG9 == 0) {
                                                qVar2.o(3);
                                                if (qVar2.f()) {
                                                    qVar2.o(13);
                                                }
                                                if (c10 > 0) {
                                                    s.b(qVar2);
                                                }
                                            } else if (iG9 == i14) {
                                                qVar2.o(3);
                                                boolean zF = qVar2.f();
                                                if (zF) {
                                                    qVar2.o(13);
                                                }
                                                if (zF) {
                                                    qVar2.n();
                                                }
                                                if (c10 > 0) {
                                                    s.b(qVar2);
                                                    iG3 = qVar2.g(2);
                                                } else {
                                                    iG3 = 0;
                                                }
                                                if (iG3 > 0) {
                                                    qVar2.o(6);
                                                    int iG10 = qVar2.g(2);
                                                    qVar2.o(4);
                                                    if (qVar2.f()) {
                                                        qVar2.o(5);
                                                    }
                                                    if (iG3 == 2 || iG3 == 3) {
                                                        qVar2.o(6);
                                                    }
                                                    if (iG10 == 2) {
                                                        qVar2.n();
                                                    }
                                                }
                                                int iFloor = ((int) Math.floor(Math.log(iA4 - 1) / Math.log(2.0d))) + 1;
                                                int iG11 = qVar2.g(2);
                                                if (iG11 > 0 && qVar2.f()) {
                                                    qVar2.o(iFloor);
                                                }
                                                if (qVar2.f()) {
                                                    qVar2.o(iFloor);
                                                }
                                                if (c10 == 0 && iG11 == 0) {
                                                    qVar2.n();
                                                }
                                            } else if (iG9 == 3) {
                                                s.a(qVar2, 4, i13, i26);
                                                int iA6 = s.a(qVar2, 4, i13, i26);
                                                if (qVar2.f()) {
                                                    s.a(qVar2, i13, i26, 0);
                                                }
                                                qVar2.n();
                                                if (iA6 > 0) {
                                                    qVar2.o(iA6 * 8);
                                                }
                                            }
                                            i27++;
                                            i13 = 8;
                                            i14 = 1;
                                            i26 = 16;
                                        } else {
                                            if (qVar2.f()) {
                                                int i28 = 8;
                                                int i29 = 1;
                                                int iA7 = s.a(qVar2, 2, 4, 8) + 1;
                                                int i30 = 0;
                                                bArr = null;
                                                while (i30 < iA7) {
                                                    int iA8 = s.a(qVar2, 4, i28, 16);
                                                    int iA9 = s.a(qVar2, 4, i28, 16);
                                                    if (iA8 == 7) {
                                                        int iG12 = qVar2.g(4) + i29;
                                                        qVar2.o(4);
                                                        byte[] bArr4 = new byte[iG12];
                                                        for (int i31 = 0; i31 < iG12; i31++) {
                                                            bArr4[i31] = (byte) qVar2.g(i28);
                                                        }
                                                        bArr = bArr4;
                                                    } else {
                                                        qVar2.o(iA9 * i28);
                                                    }
                                                    i30++;
                                                    i28 = 8;
                                                    i29 = 1;
                                                }
                                            } else {
                                                bArr = null;
                                            }
                                            switch (iG2) {
                                                case 14700:
                                                case 16000:
                                                    d10 = 3.0d;
                                                    this.f36076q = (int) (((double) iG2) * d10);
                                                    this.f36077r = (int) (((double) i24) * d10);
                                                    j = this.f36079t;
                                                    j10 = aVar.f36082b;
                                                    if (j != j10) {
                                                        this.f36079t = j10;
                                                        String strConcat = iG4 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(iG4))) : "mhm1";
                                                        if (bArr != null || bArr.length <= 0) {
                                                            immutableListN = null;
                                                        } else {
                                                            immutableListN = ImmutableList.N(A.f40998c, bArr);
                                                        }
                                                        n.a aVar2 = new n.a();
                                                        aVar2.f35327a = this.f36065e;
                                                        aVar2.f35337l = t.m("video/mp2t");
                                                        aVar2.f35338m = t.m("audio/mhm1");
                                                        aVar2.f35318D = this.f36076q;
                                                        aVar2.j = strConcat;
                                                        aVar2.f35341p = immutableListN;
                                                        this.f36066f.d(new n(aVar2));
                                                    }
                                                    this.f36080u = true;
                                                    break;
                                                case 22050:
                                                case 24000:
                                                    this.f36076q = (int) (((double) iG2) * d10);
                                                    this.f36077r = (int) (((double) i24) * d10);
                                                    j = this.f36079t;
                                                    j10 = aVar.f36082b;
                                                    if (j != j10) {
                                                        this.f36079t = j10;
                                                        if (iG4 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            immutableListN = null;
                                                        } else {
                                                            immutableListN = null;
                                                        }
                                                        n.a aVar3 = new n.a();
                                                        aVar3.f35327a = this.f36065e;
                                                        aVar3.f35337l = t.m("video/mp2t");
                                                        aVar3.f35338m = t.m("audio/mhm1");
                                                        aVar3.f35318D = this.f36076q;
                                                        aVar3.j = strConcat;
                                                        aVar3.f35341p = immutableListN;
                                                        this.f36066f.d(new n(aVar3));
                                                    }
                                                    this.f36080u = true;
                                                    break;
                                                case 29400:
                                                case 32000:
                                                case 58800:
                                                case 64000:
                                                    d10 = 1.5d;
                                                    this.f36076q = (int) (((double) iG2) * d10);
                                                    this.f36077r = (int) (((double) i24) * d10);
                                                    j = this.f36079t;
                                                    j10 = aVar.f36082b;
                                                    if (j != j10) {
                                                        this.f36079t = j10;
                                                        if (iG4 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            immutableListN = null;
                                                        } else {
                                                            immutableListN = null;
                                                        }
                                                        n.a aVar4 = new n.a();
                                                        aVar4.f35327a = this.f36065e;
                                                        aVar4.f35337l = t.m("video/mp2t");
                                                        aVar4.f35338m = t.m("audio/mhm1");
                                                        aVar4.f35318D = this.f36076q;
                                                        aVar4.j = strConcat;
                                                        aVar4.f35341p = immutableListN;
                                                        this.f36066f.d(new n(aVar4));
                                                    }
                                                    this.f36080u = true;
                                                    break;
                                                case 44100:
                                                case 48000:
                                                case 88200:
                                                case 96000:
                                                    d10 = 1.0d;
                                                    this.f36076q = (int) (((double) iG2) * d10);
                                                    this.f36077r = (int) (((double) i24) * d10);
                                                    j = this.f36079t;
                                                    j10 = aVar.f36082b;
                                                    if (j != j10) {
                                                        this.f36079t = j10;
                                                        if (iG4 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            immutableListN = null;
                                                        } else {
                                                            immutableListN = null;
                                                        }
                                                        n.a aVar5 = new n.a();
                                                        aVar5.f35327a = this.f36065e;
                                                        aVar5.f35337l = t.m("video/mp2t");
                                                        aVar5.f35338m = t.m("audio/mhm1");
                                                        aVar5.f35318D = this.f36076q;
                                                        aVar5.j = strConcat;
                                                        aVar5.f35341p = immutableListN;
                                                        this.f36066f.d(new n(aVar5));
                                                    }
                                                    this.f36080u = true;
                                                    break;
                                                default:
                                                    throw ParserException.b("Unsupported sampling rate " + iG2);
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (i23 == 17) {
                            byte[] bArr5 = rVar2.f41062a;
                            q qVar3 = new q(bArr5.length, bArr5);
                            if (qVar3.f()) {
                                qVar3.o(2);
                                iG = qVar3.g(13);
                            } else {
                                iG = 0;
                            }
                            this.f36078s = iG;
                        } else if (i23 == 2) {
                            if (this.f36080u) {
                                this.j = false;
                                i10 = 1;
                            } else {
                                i10 = 0;
                            }
                            double d11 = (((double) (this.f36077r - this.f36078s)) * 1000000.0d) / ((double) this.f36076q);
                            long jRound = Math.round(this.f36067g);
                            if (this.f36069i) {
                                this.f36069i = false;
                                this.f36067g = this.f36068h;
                            } else {
                                this.f36067g += d11;
                            }
                            this.f36066f.b(jRound, i10, this.f36074o, 0, null);
                            this.f36080u = false;
                            this.f36078s = 0;
                            this.f36074o = 0;
                        }
                        this.f36064d = 1;
                    }
                }
            }
        }
    }

    @Override // p091h2.j
    public final void c() {
        this.f36064d = 0;
        this.f36071l = 0;
        this.f36061a.D(2);
        this.f36073n = 0;
        this.f36074o = 0;
        this.f36076q = -2147483647;
        this.f36077r = -1;
        this.f36078s = 0;
        this.f36079t = -1L;
        this.f36080u = false;
        this.f36069i = false;
        this.f36072m = true;
        this.j = true;
        this.f36067g = -9.223372036854776E18d;
        this.f36068h = -9.223372036854776E18d;
    }

    @Override // p091h2.j
    public final void d(A1.r rVar, F.c cVar) {
        cVar.a();
        cVar.b();
        this.f36065e = cVar.f35810e;
        cVar.b();
        this.f36066f = rVar.p(cVar.f35809d, 1);
    }

    @Override // p091h2.j
    public final void f(int i10, long j) {
        this.f36070k = i10;
        if (!this.j && (this.f36074o != 0 || !this.f36072m)) {
            this.f36069i = true;
        }
        if (j != -9223372036854775807L) {
            if (this.f36069i) {
                this.f36068h = j;
            } else {
                this.f36067g = j;
            }
        }
    }

    @Override // p091h2.j
    public final void e(boolean z10) {
    }
}
