package p091h2;

import A1.C0567b;
import A1.K;
import com.braze.Constants;
import java.util.Objects;
import p078g1.n;
import p078g1.t;
import p114j1.q;
import p114j1.r;
import p241t7.b;

/* JADX INFO: renamed from: h2.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Ac3Reader.java */
/* JADX INFO: loaded from: classes.dex */
public final class C2202b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f35816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f35817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f35818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f35819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f35820e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f35821f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public K f35822g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f35823h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f35824i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f35825k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public n f35826l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f35827m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f35828n;

    public C2202b(String str) {
        this(null, 0, str);
    }

    /* JADX WARN: Code duplicated, block: B:127:0x0212  */
    /* JADX WARN: Code duplicated, block: B:148:0x0255  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p091h2.j
    public final void a(r rVar) {
        int i10;
        int iA;
        int i11;
        int i12;
        int i13;
        String str;
        int i14;
        byte b10;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        b.l(this.f35822g);
        while (rVar.a() > 0) {
            int i26 = this.f35823h;
            r rVar2 = this.f35817b;
            if (i26 == 0) {
                while (rVar.a() > 0) {
                    if (this.j) {
                        int iU = rVar.u();
                        if (iU == 119) {
                            this.j = false;
                            this.f35823h = 1;
                            byte[] bArr = rVar2.f41062a;
                            bArr[0] = 11;
                            bArr[1] = 119;
                            this.f35824i = 2;
                            break;
                        }
                        this.j = iU == 11;
                    } else {
                        this.j = rVar.u() == 11;
                    }
                }
            } else if (i26 == 1) {
                byte[] bArr2 = rVar2.f41062a;
                int iMin = Math.min(rVar.a(), 128 - this.f35824i);
                rVar.f(bArr2, this.f35824i, iMin);
                int i27 = this.f35824i + iMin;
                this.f35824i = i27;
                if (i27 == 128) {
                    q qVar = this.f35816a;
                    qVar.m(0);
                    int iE = qVar.e();
                    qVar.o(40);
                    Object[] objArr = qVar.g(5) > 10;
                    qVar.m(iE);
                    int[] iArr = C0567b.f461d;
                    int[] iArr2 = C0567b.f459b;
                    if (objArr == true) {
                        qVar.o(16);
                        int iG = qVar.g(2);
                        if (iG == 0) {
                            b10 = 0;
                        } else if (iG != 1) {
                            b10 = iG != 2 ? (byte) -1 : (byte) 2;
                        } else {
                            b10 = 1;
                        }
                        qVar.o(3);
                        iA = (qVar.g(11) + 1) * 2;
                        int iG2 = qVar.g(2);
                        if (iG2 == 3) {
                            i14 = C0567b.f460c[qVar.g(2)];
                            i15 = 3;
                            i16 = 6;
                        } else {
                            int iG3 = qVar.g(2);
                            int i28 = C0567b.f458a[iG3];
                            i14 = iArr2[iG2];
                            i15 = iG3;
                            i16 = i28;
                        }
                        i13 = i16 * 256;
                        int i29 = (iA * i14) / (i16 * 32);
                        int iG4 = qVar.g(3);
                        boolean zF = qVar.f();
                        i12 = iArr[iG4] + (zF ? 1 : 0);
                        qVar.o(10);
                        if (qVar.f()) {
                            qVar.o(8);
                        }
                        if (iG4 == 0) {
                            qVar.o(5);
                            if (qVar.f()) {
                                qVar.o(8);
                            }
                        }
                        if (b10 == 1 && qVar.f()) {
                            qVar.o(16);
                        }
                        if (qVar.f()) {
                            if (iG4 > 2) {
                                qVar.o(2);
                            }
                            if ((iG4 & 1) == 0 || iG4 <= 2) {
                                i21 = 6;
                            } else {
                                i21 = 6;
                                qVar.o(6);
                            }
                            if ((iG4 & 4) != 0) {
                                qVar.o(i21);
                            }
                            if (zF && qVar.f()) {
                                qVar.o(5);
                            }
                            if (b10 != 0) {
                                i17 = i15;
                            } else {
                                if (qVar.f()) {
                                    i22 = 6;
                                    qVar.o(6);
                                } else {
                                    i22 = 6;
                                }
                                if (iG4 == 0 && qVar.f()) {
                                    qVar.o(i22);
                                }
                                if (qVar.f()) {
                                    qVar.o(i22);
                                }
                                int iG5 = qVar.g(2);
                                if (iG5 == 1) {
                                    qVar.o(5);
                                    i24 = 2;
                                } else {
                                    if (iG5 == 2) {
                                        qVar.o(12);
                                    } else if (iG5 == 3) {
                                        int iG6 = qVar.g(5);
                                        if (qVar.f()) {
                                            qVar.o(5);
                                            if (qVar.f()) {
                                                i25 = 4;
                                                qVar.o(4);
                                            } else {
                                                i25 = 4;
                                            }
                                            if (qVar.f()) {
                                                qVar.o(i25);
                                            }
                                            if (qVar.f()) {
                                                qVar.o(i25);
                                            }
                                            if (qVar.f()) {
                                                qVar.o(i25);
                                            }
                                            if (qVar.f()) {
                                                qVar.o(i25);
                                            }
                                            if (qVar.f()) {
                                                qVar.o(i25);
                                            }
                                            if (qVar.f()) {
                                                qVar.o(i25);
                                            }
                                            if (qVar.f()) {
                                                if (qVar.f()) {
                                                    qVar.o(i25);
                                                }
                                                if (qVar.f()) {
                                                    qVar.o(i25);
                                                }
                                            }
                                        }
                                        if (qVar.f()) {
                                            qVar.o(5);
                                            if (qVar.f()) {
                                                qVar.o(7);
                                                if (qVar.f()) {
                                                    i23 = 8;
                                                    qVar.o(8);
                                                } else {
                                                    i23 = 8;
                                                }
                                            } else {
                                                i23 = 8;
                                            }
                                        } else {
                                            i23 = 8;
                                        }
                                        i24 = 2;
                                        qVar.o((iG6 + 2) * i23);
                                        qVar.c();
                                    }
                                    i24 = 2;
                                }
                                if (iG4 < i24) {
                                    if (qVar.f()) {
                                        qVar.o(14);
                                    }
                                    if (iG4 == 0 && qVar.f()) {
                                        qVar.o(14);
                                    }
                                }
                                if (qVar.f()) {
                                    i17 = i15;
                                    if (i17 == 0) {
                                        qVar.o(5);
                                    } else {
                                        int i30 = 5;
                                        int i31 = 0;
                                        while (i31 < i16) {
                                            if (qVar.f()) {
                                                qVar.o(i30);
                                            }
                                            i31++;
                                            i30 = 5;
                                        }
                                    }
                                } else {
                                    i17 = i15;
                                }
                            }
                        } else {
                            i17 = i15;
                        }
                        if (qVar.f()) {
                            qVar.o(5);
                            if (iG4 == 2) {
                                qVar.o(4);
                            }
                            if (iG4 >= 6) {
                                qVar.o(2);
                            }
                            if (qVar.f()) {
                                i20 = 8;
                                qVar.o(8);
                            } else {
                                i20 = 8;
                            }
                            if (iG4 == 0 && qVar.f()) {
                                qVar.o(i20);
                            }
                            i18 = 3;
                            if (iG2 < 3) {
                                qVar.n();
                            }
                        } else {
                            i18 = 3;
                        }
                        if (b10 == 0 && i17 != i18) {
                            qVar.n();
                        }
                        if (b10 == 2 && (i17 == i18 || qVar.f())) {
                            i19 = 6;
                            qVar.o(6);
                        } else {
                            i19 = 6;
                        }
                        str = (qVar.f() && qVar.g(i19) == 1 && qVar.g(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
                        i10 = i29;
                    } else {
                        qVar.o(32);
                        int iG7 = qVar.g(2);
                        String str2 = iG7 == 3 ? null : "audio/ac3";
                        int iG8 = qVar.g(6);
                        i10 = C0567b.f462e[iG8 / 2] * Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS;
                        iA = C0567b.a(iG7, iG8);
                        qVar.o(8);
                        int iG9 = qVar.g(3);
                        if ((iG9 & 1) == 0 || iG9 == 1) {
                            i11 = 2;
                        } else {
                            i11 = 2;
                            qVar.o(2);
                        }
                        if ((iG9 & 4) != 0) {
                            qVar.o(i11);
                        }
                        if (iG9 == i11) {
                            qVar.o(i11);
                        }
                        int i32 = iG7 < 3 ? iArr2[iG7] : -1;
                        i12 = iArr[iG9] + (qVar.f() ? 1 : 0);
                        i13 = 1536;
                        str = str2;
                        i14 = i32;
                    }
                    n nVar = this.f35826l;
                    if (nVar == null || i12 != nVar.f35279D || i14 != nVar.f35280E || !Objects.equals(str, nVar.f35302n)) {
                        n.a aVar = new n.a();
                        aVar.f35327a = this.f35821f;
                        aVar.f35337l = t.m(this.f35820e);
                        aVar.f35338m = t.m(str);
                        aVar.f35317C = i12;
                        aVar.f35318D = i14;
                        aVar.f35330d = this.f35818c;
                        aVar.f35332f = this.f35819d;
                        aVar.f35335i = i10;
                        if ("audio/ac3".equals(str)) {
                            aVar.f35334h = i10;
                        }
                        n nVar2 = new n(aVar);
                        this.f35826l = nVar2;
                        this.f35822g.d(nVar2);
                    }
                    this.f35827m = iA;
                    this.f35825k = (((long) i13) * 1000000) / ((long) this.f35826l.f35280E);
                    rVar2.G(0);
                    this.f35822g.a(128, rVar2);
                    this.f35823h = 2;
                }
            } else if (i26 == 2) {
                int iMin2 = Math.min(rVar.a(), this.f35827m - this.f35824i);
                this.f35822g.a(iMin2, rVar);
                int i33 = this.f35824i + iMin2;
                this.f35824i = i33;
                if (i33 == this.f35827m) {
                    b.k(this.f35828n != -9223372036854775807L);
                    this.f35822g.b(this.f35828n, 1, this.f35827m, 0, null);
                    this.f35828n += this.f35825k;
                    this.f35823h = 0;
                }
            }
        }
    }

    @Override // p091h2.j
    public final void c() {
        this.f35823h = 0;
        this.f35824i = 0;
        this.j = false;
        this.f35828n = -9223372036854775807L;
    }

    @Override // p091h2.j
    public final void d(A1.r rVar, F.c cVar) {
        cVar.a();
        cVar.b();
        this.f35821f = cVar.f35810e;
        cVar.b();
        this.f35822g = rVar.p(cVar.f35809d, 1);
    }

    @Override // p091h2.j
    public final void f(int i10, long j) {
        this.f35828n = j;
    }

    public C2202b(String str, int i10, String str2) {
        q qVar = new q(128, new byte[128]);
        this.f35816a = qVar;
        this.f35817b = new r(qVar.f41055a);
        this.f35823h = 0;
        this.f35828n = -9223372036854775807L;
        this.f35818c = str;
        this.f35819d = i10;
        this.f35820e = str2;
    }

    @Override // p091h2.j
    public final void e(boolean z10) {
    }
}
