package p091h2;

import A1.K;
import A1.o;
import androidx.media3.common.ParserException;
import com.braze.Constants;
import com.google.common.primitives.Ints;
import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;
import p078g1.n;
import p078g1.t;
import p114j1.A;
import p114j1.q;
import p114j1.r;
import p241t7.b;

/* JADX INFO: compiled from: DtsReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f35880a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f35882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f35883d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f35885f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public K f35886g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f35888i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f35889k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public n f35890l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f35891m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f35892n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f35887h = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f35895q = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f35881b = new AtomicInteger();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f35893o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f35894p = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f35884e = "video/mp2t";

    public h(String str, int i10, int i11) {
        this.f35880a = new r(new byte[i11]);
        this.f35882c = str;
        this.f35883d = i10;
    }

    /* JADX WARN: Code duplicated, block: B:181:0x0475  */
    /* JADX WARN: Code duplicated, block: B:184:0x047e  */
    /* JADX WARN: Code duplicated, block: B:186:0x0481 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:187:0x0483  */
    /* JADX WARN: Code duplicated, block: B:189:0x0493  */
    /* JADX WARN: Code duplicated, block: B:191:0x049f  */
    /* JADX WARN: Code duplicated, block: B:192:0x04a8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r15v0, types: [A1.K] */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2, types: [int] */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p091h2.j
    public final void a(r rVar) throws ParserException {
        byte b10;
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        int i13;
        int i14;
        int i15;
        byte b11;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int iG;
        int iG2;
        int i23;
        int iG3;
        int i24;
        long jL;
        int i25;
        long jL2;
        int iG4;
        int i26;
        int i27;
        int i28;
        byte b12 = -1;
        boolean z12 = true;
        b.l(this.f35886g);
        while (rVar.a() > 0) {
            int i29 = this.f35887h;
            r rVar2 = this.f35880a;
            switch (i29) {
                case 0:
                    b10 = b12;
                    while (true) {
                        if (rVar.a() > 0) {
                            int i30 = this.j << 8;
                            this.j = i30;
                            int iU = i30 | rVar.u();
                            this.j = iU;
                            if (iU == 2147385345 || iU == -25230976 || iU == 536864768 || iU == -14745368) {
                                i10 = 1;
                            } else if (iU == 1683496997 || iU == 622876772) {
                                i10 = 2;
                            } else if (iU == 1078008818 || iU == -233094848) {
                                i10 = 3;
                            } else {
                                i10 = (iU == 1908687592 || iU == -398277519) ? 4 : 0;
                            }
                            this.f35892n = i10;
                            if (i10 != 0) {
                                byte[] bArr = rVar2.f41062a;
                                bArr[0] = (byte) ((iU >> 24) & 255);
                                bArr[1] = (byte) ((iU >> 16) & 255);
                                bArr[2] = (byte) ((iU >> 8) & 255);
                                bArr[3] = (byte) (iU & 255);
                                this.f35888i = 4;
                                this.j = 0;
                                if (i10 == 3 || i10 == 4) {
                                    z10 = true;
                                    this.f35887h = 4;
                                } else {
                                    z10 = true;
                                    if (i10 == 1) {
                                        this.f35887h = 1;
                                    } else {
                                        this.f35887h = 2;
                                    }
                                }
                                z12 = z10;
                                b12 = b10;
                            }
                        } else {
                            b12 = b10;
                            z12 = true;
                        }
                        break;
                    }
                    break;
                case 1:
                    if (b(rVar, rVar2.f41062a, 18)) {
                        byte[] bArr2 = rVar2.f41062a;
                        if (this.f35890l == null) {
                            String str = this.f35885f;
                            q qVarA = o.a(bArr2);
                            qVarA.o(60);
                            int i31 = o.f540a[qVarA.g(6)];
                            int i32 = o.f541b[qVarA.g(4)];
                            int iG5 = qVarA.g(5);
                            if (iG5 >= 29) {
                                i20 = -1;
                                i19 = 2;
                            } else {
                                int i33 = o.f542c[iG5] * Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS;
                                i19 = 2;
                                i20 = i33 / 2;
                            }
                            qVarA.o(10);
                            int i34 = i31 + (qVarA.g(i19) > 0 ? 1 : 0);
                            n.a aVar = new n.a();
                            aVar.f35327a = str;
                            aVar.f35337l = t.m(this.f35884e);
                            aVar.f35338m = t.m("audio/vnd.dts");
                            aVar.f35334h = i20;
                            aVar.f35317C = i34;
                            aVar.f35318D = i32;
                            aVar.f35342q = null;
                            aVar.f35330d = this.f35882c;
                            aVar.f35332f = this.f35883d;
                            n nVar = new n(aVar);
                            this.f35890l = nVar;
                            this.f35886g.d(nVar);
                        }
                        byte b13 = bArr2[0];
                        if (b13 != -2) {
                            if (b13 == -1) {
                                i17 = ((bArr2[7] & 3) << 12) | ((bArr2[6] & 255) << 4);
                                i18 = (bArr2[9] & 60) >> 2;
                            } else if (b13 != 31) {
                                i11 = (((3 & bArr2[5]) << 12) | ((bArr2[6] & 255) << 4) | ((bArr2[7] & 240) >> 4)) + 1;
                            } else {
                                i17 = ((bArr2[6] & 3) << 12) | ((bArr2[7] & 255) << 4);
                                i18 = (bArr2[8] & 60) >> 2;
                            }
                            i11 = (i17 | i18) + 1;
                            z11 = true;
                            if (z11) {
                                i11 = (i11 * 16) / 14;
                            }
                            this.f35891m = i11;
                            if (b13 != -2) {
                                b10 = -1;
                                if (b13 != -1) {
                                    if (b13 != 31) {
                                        i15 = (bArr2[4] & 1) << 6;
                                        i16 = bArr2[5] & 252;
                                        i14 = 2;
                                    } else {
                                        i14 = 2;
                                        i15 = (bArr2[5] & 7) << 4;
                                        b11 = bArr2[6];
                                    }
                                    i13 = (i16 >> i14) | i15;
                                    i12 = 1;
                                } else {
                                    i14 = 2;
                                    i15 = (bArr2[4] & 7) << 4;
                                    b11 = bArr2[7];
                                }
                                i16 = b11 & 60;
                                i13 = (i16 >> i14) | i15;
                                i12 = 1;
                            } else {
                                b10 = -1;
                                i12 = 1;
                                i13 = ((bArr2[4] & 252) >> 2) | ((bArr2[5] & 1) << 6);
                            }
                            this.f35889k = Ints.j0(A.J(this.f35890l.f35280E, (i13 + i12) * 32));
                            rVar2.G(0);
                            this.f35886g.a(18, rVar2);
                            this.f35887h = 6;
                            b12 = b10;
                        } else {
                            i11 = (((bArr2[4] & 3) << 12) | ((bArr2[7] & 255) << 4) | ((bArr2[6] & 240) >> 4)) + 1;
                        }
                        z11 = false;
                        if (z11) {
                            i11 = (i11 * 16) / 14;
                        }
                        this.f35891m = i11;
                        if (b13 != -2) {
                            b10 = -1;
                            if (b13 != -1) {
                                if (b13 != 31) {
                                    i15 = (bArr2[4] & 1) << 6;
                                    i16 = bArr2[5] & 252;
                                    i14 = 2;
                                } else {
                                    i14 = 2;
                                    i15 = (bArr2[5] & 7) << 4;
                                    b11 = bArr2[6];
                                }
                                i13 = (i16 >> i14) | i15;
                                i12 = 1;
                            } else {
                                i14 = 2;
                                i15 = (bArr2[4] & 7) << 4;
                                b11 = bArr2[7];
                            }
                            i16 = b11 & 60;
                            i13 = (i16 >> i14) | i15;
                            i12 = 1;
                        } else {
                            b10 = -1;
                            i12 = 1;
                            i13 = ((bArr2[4] & 252) >> 2) | ((bArr2[5] & 1) << 6);
                        }
                        this.f35889k = Ints.j0(A.J(this.f35890l.f35280E, (i13 + i12) * 32));
                        rVar2.G(0);
                        this.f35886g.a(18, rVar2);
                        this.f35887h = 6;
                        b12 = b10;
                    } else {
                        b12 = -1;
                    }
                    z12 = true;
                    break;
                case 2:
                    if (b(rVar, rVar2.f41062a, 7)) {
                        q qVarA2 = o.a(rVar2.f41062a);
                        qVarA2.o(42);
                        this.f35893o = qVarA2.g(qVarA2.f() ? 12 : 8) + 1;
                        this.f35887h = 3;
                    }
                    b12 = -1;
                    z12 = true;
                    break;
                case 3:
                    if (b(rVar, rVar2.f41062a, this.f35893o)) {
                        q qVarA3 = o.a(rVar2.f41062a);
                        qVarA3.o(40);
                        int iG6 = qVarA3.g(2);
                        if (qVarA3.f()) {
                            i21 = 20;
                            i22 = 12;
                        } else {
                            i21 = 16;
                            i22 = 8;
                        }
                        qVarA3.o(i22);
                        int iG7 = qVarA3.g(i21) + 1;
                        boolean zF = qVarA3.f();
                        if (zF) {
                            iG = qVarA3.g(2);
                            iG2 = (qVarA3.g(3) + 1) * 512;
                            if (qVarA3.f()) {
                                qVarA3.o(36);
                            }
                            int iG8 = qVarA3.g(3) + 1;
                            int iG9 = qVarA3.g(3) + 1;
                            if (iG8 != 1 || iG9 != 1) {
                                throw ParserException.b("Multiple audio presentations or assets not supported");
                            }
                            int i35 = iG6 + 1;
                            int iG10 = qVarA3.g(i35);
                            for (int i36 = 0; i36 < i35; i36++) {
                                if (((iG10 >> i36) & 1) == 1) {
                                    qVarA3.o(8);
                                }
                            }
                            if (qVarA3.f()) {
                                qVarA3.o(2);
                                int iG11 = (qVarA3.g(2) + 1) << 2;
                                int iG12 = qVarA3.g(2) + 1;
                                for (int i37 = 0; i37 < iG12; i37++) {
                                    qVarA3.o(iG11);
                                }
                            }
                        } else {
                            iG = -1;
                            iG2 = 0;
                        }
                        qVarA3.o(i21);
                        qVarA3.o(12);
                        if (zF) {
                            if (qVarA3.f()) {
                                qVarA3.o(4);
                            }
                            if (qVarA3.f()) {
                                qVarA3.o(24);
                            }
                            if (qVarA3.f()) {
                                i23 = 1;
                                qVarA3.p(qVarA3.g(10) + 1);
                            } else {
                                i23 = 1;
                            }
                            qVarA3.o(5);
                            int i38 = o.f543d[qVarA3.g(4)];
                            iG3 = qVarA3.g(8) + i23;
                            i24 = i38;
                        } else {
                            i23 = 1;
                            iG3 = -1;
                            i24 = -2147483647;
                        }
                        if (zF) {
                            if (iG == 0) {
                                i25 = 32000;
                            } else if (iG == i23) {
                                i25 = 44100;
                            } else {
                                if (iG != 2) {
                                    throw ParserException.a(null, "Unsupported reference clock code in DTS HD header: " + iG);
                                }
                                i25 = 48000;
                            }
                            long j = i25;
                            int i39 = A.f40996a;
                            jL = A.L(iG2, 1000000L, j, RoundingMode.DOWN);
                        } else {
                            jL = -9223372036854775807L;
                        }
                        g(new o.a("audio/vnd.dts.hd;profile=lbr", iG3, i24, iG7, jL));
                        this.f35891m = iG7;
                        this.f35889k = jL == -9223372036854775807L ? 0L : jL;
                        rVar2.G(0);
                        this.f35886g.a(this.f35893o, rVar2);
                        this.f35887h = 6;
                    }
                    b12 = -1;
                    z12 = true;
                    break;
                case 4:
                    if (b(rVar, rVar2.f41062a, 6)) {
                        q qVarA4 = o.a(rVar2.f41062a);
                        qVarA4.o(32);
                        int iB = o.b(qVarA4, o.f548i) + 1;
                        this.f35894p = iB;
                        int i40 = this.f35888i;
                        if (i40 > iB) {
                            int i41 = i40 - iB;
                            this.f35888i = i40 - i41;
                            rVar.G(rVar.f41063b - i41);
                        }
                        this.f35887h = 5;
                    }
                    b12 = -1;
                    z12 = true;
                    break;
                case 5:
                    if (b(rVar, rVar2.f41062a, this.f35894p)) {
                        byte[] bArr3 = rVar2.f41062a;
                        AtomicInteger atomicInteger = this.f35881b;
                        q qVarA5 = o.a(bArr3);
                        ?? r10 = qVarA5.g(32) == 1078008818 ? z12 : 0;
                        int iB2 = o.b(qVarA5, o.f544e);
                        int i42 = iB2 + 1;
                        if (r10 == 0) {
                            jL2 = -9223372036854775807L;
                            iG4 = -2147483647;
                        } else {
                            if (!qVarA5.f()) {
                                throw ParserException.b("Only supports full channel mask-based audio presentation");
                            }
                            int i43 = iB2 - 1;
                            int i44 = ((bArr3[i43] << 8) & 65535) | (bArr3[iB2] & 255);
                            int i45 = A.f40996a;
                            int i46 = 65535;
                            int i47 = 0;
                            while (i47 < i43) {
                                byte b14 = bArr3[i47];
                                int[] iArr = A.f41004i;
                                int i48 = (iArr[(((b14 & 255) >> 4) ^ ((i46 >> 12) & 255)) & 255] ^ ((i46 << 4) & 65535)) & 65535;
                                i46 = (((i48 << 4) & 65535) ^ iArr[((b14 & 15) ^ ((i48 >> 12) & 255)) & 255]) & 65535;
                                i47++;
                                z12 = true;
                            }
                            boolean z13 = z12;
                            if (i44 != i46) {
                                throw ParserException.a(null, "CRC check failed");
                            }
                            int iG13 = qVarA5.g(2);
                            if (iG13 != 0) {
                                if (iG13 == z13) {
                                    i27 = 480;
                                } else {
                                    if (iG13 != 2) {
                                        throw ParserException.a(null, "Unsupported base duration index in DTS UHD header: " + iG13);
                                    }
                                    i27 = 384;
                                }
                                i26 = 3;
                            } else {
                                i26 = 3;
                                i27 = 512;
                            }
                            int iG14 = (qVarA5.g(i26) + 1) * i27;
                            int iG15 = qVarA5.g(2);
                            if (iG15 == 0) {
                                i28 = 32000;
                            } else if (iG15 == 1) {
                                i28 = 44100;
                            } else {
                                if (iG15 != 2) {
                                    throw ParserException.a(null, "Unsupported clock rate index in DTS UHD header: " + iG15);
                                }
                                i28 = 48000;
                            }
                            if (qVarA5.f()) {
                                qVarA5.o(36);
                            }
                            iG4 = (1 << qVarA5.g(2)) * i28;
                            jL2 = A.L(iG14, 1000000L, i28, RoundingMode.DOWN);
                        }
                        int iB3 = 0;
                        for (int i49 = 0; i49 < r10; i49++) {
                            iB3 += o.b(qVarA5, o.f545f);
                        }
                        if (r10 != 0) {
                            atomicInteger.set(o.b(qVarA5, o.f546g));
                        }
                        int iB4 = iB3 + (atomicInteger.get() != 0 ? o.b(qVarA5, o.f547h) : 0) + i42;
                        o.a aVar2 = new o.a("audio/vnd.dts.uhd;profile=p2", 2, iG4, iB4, jL2);
                        if (this.f35892n == 3) {
                            g(aVar2);
                        }
                        this.f35891m = iB4;
                        this.f35889k = jL2 == -9223372036854775807L ? 0L : jL2;
                        rVar2.G(0);
                        this.f35886g.a(this.f35894p, rVar2);
                        this.f35887h = 6;
                        b12 = -1;
                        z12 = true;
                    } else {
                        continue;
                    }
                    break;
                case 6:
                    int iMin = Math.min(rVar.a(), this.f35891m - this.f35888i);
                    this.f35886g.a(iMin, rVar);
                    int i50 = this.f35888i + iMin;
                    this.f35888i = i50;
                    if (i50 == this.f35891m) {
                        b.k(this.f35895q != -9223372036854775807L ? z12 : false);
                        this.f35886g.b(this.f35895q, this.f35892n == 4 ? 0 : z12, this.f35891m, 0, null);
                        this.f35895q += this.f35889k;
                        this.f35887h = 0;
                    }
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    public final boolean b(r rVar, byte[] bArr, int i10) {
        int iMin = Math.min(rVar.a(), i10 - this.f35888i);
        rVar.f(bArr, this.f35888i, iMin);
        int i11 = this.f35888i + iMin;
        this.f35888i = i11;
        return i11 == i10;
    }

    @Override // p091h2.j
    public final void c() {
        this.f35887h = 0;
        this.f35888i = 0;
        this.j = 0;
        this.f35895q = -9223372036854775807L;
        this.f35881b.set(0);
    }

    @Override // p091h2.j
    public final void d(A1.r rVar, F.c cVar) {
        cVar.a();
        cVar.b();
        this.f35885f = cVar.f35810e;
        cVar.b();
        this.f35886g = rVar.p(cVar.f35809d, 1);
    }

    @Override // p091h2.j
    public final void f(int i10, long j) {
        this.f35895q = j;
    }

    public final void g(o.a aVar) {
        int i10;
        int i11 = aVar.f550b;
        if (i11 == -2147483647 || (i10 = aVar.f551c) == -1) {
            return;
        }
        n nVar = this.f35890l;
        String str = aVar.f549a;
        if (nVar != null && i10 == nVar.f35279D && i11 == nVar.f35280E && str.equals(nVar.f35302n)) {
            return;
        }
        n nVar2 = this.f35890l;
        n.a aVar2 = nVar2 == null ? new n.a() : nVar2.a();
        aVar2.f35327a = this.f35885f;
        aVar2.f35337l = t.m(this.f35884e);
        aVar2.f35338m = t.m(str);
        aVar2.f35317C = i10;
        aVar2.f35318D = i11;
        aVar2.f35330d = this.f35882c;
        aVar2.f35332f = this.f35883d;
        n nVar3 = new n(aVar2);
        this.f35890l = nVar3;
        this.f35886g.d(nVar3);
    }

    @Override // p091h2.j
    public final void e(boolean z10) {
    }
}
