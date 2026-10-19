package p091h2;

import A1.C0576k;
import A1.K;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import p078g1.h;
import p078g1.n;
import p078g1.t;
import p114j1.A;
import p114j1.d;
import p114j1.r;
import p127k1.e;
import p127k1.f;
import p127k1.g;
import p241t7.b;

/* JADX INFO: compiled from: H264Reader.java */
/* JADX INFO: loaded from: classes.dex */
public final class m implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B f35949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f35950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f35951c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f35955g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f35957i;
    public K j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a f35958k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f35959l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f35961n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean[] f35956h = new boolean[3];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f35952d = new t(7);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f35953e = new t(8);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f35954f = new t(6);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f35960m = -9223372036854775807L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final r f35962o = new r();

    /* JADX INFO: compiled from: H264Reader.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f35963a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f35964b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f35965c;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final f f35968f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public byte[] f35969g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f35970h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f35971i;
        public long j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f35973l;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public long f35977p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public long f35978q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f35979r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f35980s;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SparseArray<e.m> f35966d = new SparseArray<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final SparseArray<e.l> f35967e = new SparseArray<>();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public C0375a f35974m = new C0375a();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public C0375a f35975n = new C0375a();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f35972k = false;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f35976o = false;

        /* JADX INFO: renamed from: h2.m$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: H264Reader.java */
        public static final class C0375a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f35981a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f35982b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public e.m f35983c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f35984d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f35985e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public int f35986f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public int f35987g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public boolean f35988h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public boolean f35989i;
            public boolean j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public boolean f35990k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public int f35991l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public int f35992m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public int f35993n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public int f35994o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public int f35995p;
        }

        public a(K k10, boolean z10, boolean z11) {
            this.f35963a = k10;
            this.f35964b = z10;
            this.f35965c = z11;
            byte[] bArr = new byte[128];
            this.f35969g = bArr;
            this.f35968f = new f(bArr, 0, 0);
            C0375a c0375a = this.f35975n;
            c0375a.f35982b = false;
            c0375a.f35981a = false;
        }
    }

    public m(B b10, boolean z10, boolean z11) {
        this.f35949a = b10;
        this.f35950b = z10;
        this.f35951c = z11;
    }

    @Override // p091h2.j
    public final void a(r rVar) {
        int i10;
        int i11;
        b.l(this.j);
        int i12 = A.f40996a;
        int i13 = rVar.f41063b;
        int i14 = rVar.f41064c;
        byte[] bArr = rVar.f41062a;
        this.f35955g += (long) rVar.a();
        this.j.a(rVar.a(), rVar);
        while (true) {
            int iB = e.b(bArr, i13, i14, this.f35956h);
            if (iB == i14) {
                g(bArr, i13, i14);
                return;
            }
            int i15 = bArr[iB + 3] & 31;
            if (iB <= 0 || bArr[iB - 1] != 0) {
                i10 = iB;
                i11 = 3;
            } else {
                i10 = iB - 1;
                i11 = 4;
            }
            int i16 = i10 - i13;
            if (i16 > 0) {
                g(bArr, i13, i10);
            }
            int i17 = i14 - i10;
            long j = this.f35955g - ((long) i17);
            b(i17, i16 < 0 ? -i16 : 0, j, this.f35960m);
            h(i15, j, this.f35960m);
            i13 = i10 + i11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:74:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:75:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:79:0x0214  */
    /* JADX WARN: Code duplicated, block: B:82:0x021b  */
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
    public final void b(int i10, int i11, long j, long j10) {
        long j11;
        int i12;
        long j12;
        long j13;
        boolean z10;
        int i13;
        int i14;
        int i15;
        boolean z11;
        boolean z12 = this.f35959l;
        boolean z13 = true;
        g gVar = this.f35949a.f35763c;
        if (!z12 || this.f35958k.f35965c) {
            t tVar = this.f35952d;
            tVar.b(i11);
            t tVar2 = this.f35953e;
            tVar2.b(i11);
            if (this.f35959l) {
                if (tVar.f36086c) {
                    e.m mVarJ = e.j(tVar.f36087d, 3, tVar.f36088e);
                    gVar.getClass();
                    int i16 = mVarJ.f41462s;
                    b.k(i16 >= 0);
                    gVar.f41471e = i16;
                    gVar.b(i16);
                    this.f35958k.f35966d.append(mVarJ.f41448d, mVarJ);
                    tVar.c();
                } else if (tVar2.f36086c) {
                    f fVar = new f(tVar2.f36087d, 4, tVar2.f36088e);
                    int iG = fVar.g();
                    int iG2 = fVar.g();
                    fVar.k();
                    this.f35958k.f35967e.append(iG, new e.l(iG, iG2, fVar.e()));
                    tVar2.c();
                }
            } else if (tVar.f36086c && tVar2.f36086c) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf(tVar.f36087d, tVar.f36088e));
                arrayList.add(Arrays.copyOf(tVar2.f36087d, tVar2.f36088e));
                e.m mVarJ2 = e.j(tVar.f36087d, 3, tVar.f36088e);
                f fVar2 = new f(tVar2.f36087d, 4, tVar2.f36088e);
                int iG3 = fVar2.g();
                int iG4 = fVar2.g();
                fVar2.k();
                e.l lVar = new e.l(iG3, iG4, fVar2.e());
                byte[] bArr = d.f41012a;
                String str = String.format("avc1.%02X%02X%02X", Integer.valueOf(mVarJ2.f41445a), Integer.valueOf(mVarJ2.f41446b), Integer.valueOf(mVarJ2.f41447c));
                K k10 = this.j;
                n.a aVar = new n.a();
                aVar.f35327a = this.f35957i;
                aVar.f35337l = t.m("video/mp2t");
                aVar.f35338m = t.m("video/avc");
                aVar.j = str;
                aVar.f35345t = mVarJ2.f41449e;
                aVar.f35346u = mVarJ2.f41450f;
                aVar.f35315A = new h(mVarJ2.f41459p, mVarJ2.f41460q, mVarJ2.f41461r, mVarJ2.f41452h + 8, mVarJ2.f41453i + 8, null);
                aVar.f35349x = mVarJ2.f41451g;
                aVar.f35341p = arrayList;
                int i17 = mVarJ2.f41462s;
                aVar.f35340o = i17;
                C0576k.b(aVar, k10);
                this.f35959l = true;
                gVar.getClass();
                b.k(i17 >= 0);
                gVar.f41471e = i17;
                gVar.b(i17);
                this.f35958k.f35966d.append(mVarJ2.f41448d, mVarJ2);
                this.f35958k.f35967e.append(iG3, lVar);
                tVar.c();
                tVar2.c();
            }
        }
        t tVar3 = this.f35954f;
        if (tVar3.b(i11)) {
            int iL = e.l(tVar3.f36088e, tVar3.f36087d);
            byte[] bArr2 = tVar3.f36087d;
            r rVar = this.f35962o;
            rVar.E(iL, bArr2);
            rVar.G(4);
            gVar.a(j10, rVar);
        }
        a aVar2 = this.f35958k;
        boolean z14 = this.f35959l;
        if (aVar2.f35971i == 9) {
            if (z14 && aVar2.f35976o) {
                j11 = aVar2.j;
                i12 = i10 + ((int) (j - j11));
                j12 = aVar2.f35978q;
                if (j12 != -9223372036854775807L) {
                    j13 = aVar2.f35977p;
                    if (j11 != j13) {
                        aVar2.f35963a.b(j12, aVar2.f35979r ? 1 : 0, (int) (j11 - j13), i12, null);
                    }
                }
            }
            aVar2.f35977p = aVar2.j;
            aVar2.f35978q = aVar2.f35973l;
            aVar2.f35979r = false;
            aVar2.f35976o = true;
        } else if (aVar2.f35965c) {
            a.C0375a c0375a = aVar2.f35975n;
            a.C0375a c0375a2 = aVar2.f35974m;
            if (c0375a.f35981a) {
                if (c0375a2.f35981a) {
                    e.m mVar = c0375a.f35983c;
                    b.l(mVar);
                    e.m mVar2 = c0375a2.f35983c;
                    b.l(mVar2);
                    if (c0375a.f35986f == c0375a2.f35986f && c0375a.f35987g == c0375a2.f35987g && c0375a.f35988h == c0375a2.f35988h && ((!c0375a.f35989i || !c0375a2.f35989i || c0375a.j == c0375a2.j) && ((i14 = c0375a.f35984d) == (i15 = c0375a2.f35984d) || (i14 != 0 && i15 != 0)))) {
                        int i18 = mVar2.f41456m;
                        int i19 = mVar.f41456m;
                        if ((i19 == 0 && i18 == 0 && (c0375a.f35992m != c0375a2.f35992m || c0375a.f35993n != c0375a2.f35993n)) || ((i19 == 1 && i18 == 1 && (c0375a.f35994o != c0375a2.f35994o || c0375a.f35995p != c0375a2.f35995p)) || (z11 = c0375a.f35990k) != c0375a2.f35990k || (z11 && c0375a.f35991l != c0375a2.f35991l))) {
                            if (z14) {
                                j11 = aVar2.j;
                                i12 = i10 + ((int) (j - j11));
                                j12 = aVar2.f35978q;
                                if (j12 != -9223372036854775807L) {
                                    j13 = aVar2.f35977p;
                                    if (j11 != j13) {
                                        aVar2.f35963a.b(j12, aVar2.f35979r ? 1 : 0, (int) (j11 - j13), i12, null);
                                    }
                                }
                            }
                            aVar2.f35977p = aVar2.j;
                            aVar2.f35978q = aVar2.f35973l;
                            aVar2.f35979r = false;
                            aVar2.f35976o = true;
                        }
                    } else {
                        if (z14) {
                            j11 = aVar2.j;
                            i12 = i10 + ((int) (j - j11));
                            j12 = aVar2.f35978q;
                            if (j12 != -9223372036854775807L) {
                                j13 = aVar2.f35977p;
                                if (j11 != j13) {
                                    aVar2.f35963a.b(j12, aVar2.f35979r ? 1 : 0, (int) (j11 - j13), i12, null);
                                }
                            }
                        }
                        aVar2.f35977p = aVar2.j;
                        aVar2.f35978q = aVar2.f35973l;
                        aVar2.f35979r = false;
                        aVar2.f35976o = true;
                    }
                } else {
                    if (z14) {
                        j11 = aVar2.j;
                        i12 = i10 + ((int) (j - j11));
                        j12 = aVar2.f35978q;
                        if (j12 != -9223372036854775807L) {
                            j13 = aVar2.f35977p;
                            if (j11 != j13) {
                                aVar2.f35963a.b(j12, aVar2.f35979r ? 1 : 0, (int) (j11 - j13), i12, null);
                            }
                        }
                    }
                    aVar2.f35977p = aVar2.j;
                    aVar2.f35978q = aVar2.f35973l;
                    aVar2.f35979r = false;
                    aVar2.f35976o = true;
                }
            }
        }
        if (aVar2.f35964b) {
            a.C0375a c0375a3 = aVar2.f35975n;
            z10 = c0375a3.f35982b && ((i13 = c0375a3.f35985e) == 7 || i13 == 2);
        } else {
            z10 = aVar2.f35980s;
        }
        boolean z15 = aVar2.f35979r;
        int i20 = aVar2.f35971i;
        if (i20 != 5 && (!z10 || i20 != 1)) {
            z13 = false;
        }
        boolean z16 = z15 | z13;
        aVar2.f35979r = z16;
        aVar2.f35971i = 24;
        if (z16) {
            this.f35961n = false;
        }
    }

    @Override // p091h2.j
    public final void c() {
        this.f35955g = 0L;
        this.f35961n = false;
        this.f35960m = -9223372036854775807L;
        e.a(this.f35956h);
        this.f35952d.c();
        this.f35953e.c();
        this.f35954f.c();
        this.f35949a.f35763c.b(0);
        a aVar = this.f35958k;
        if (aVar != null) {
            aVar.f35972k = false;
            aVar.f35976o = false;
            a.C0375a c0375a = aVar.f35975n;
            c0375a.f35982b = false;
            c0375a.f35981a = false;
        }
    }

    @Override // p091h2.j
    public final void d(A1.r rVar, F.c cVar) {
        cVar.a();
        cVar.b();
        this.f35957i = cVar.f35810e;
        cVar.b();
        K kP = rVar.p(cVar.f35809d, 2);
        this.j = kP;
        this.f35958k = new a(kP, this.f35950b, this.f35951c);
        this.f35949a.a(rVar, cVar);
    }

    @Override // p091h2.j
    public final void e(boolean z10) {
        b.l(this.j);
        int i10 = A.f40996a;
        if (z10) {
            this.f35949a.f35763c.b(0);
            b(0, 0, this.f35955g, this.f35960m);
            h(9, this.f35955g, this.f35960m);
            b(0, 0, this.f35955g, this.f35960m);
        }
    }

    @Override // p091h2.j
    public final void f(int i10, long j) {
        this.f35960m = j;
        this.f35961n = ((i10 & 2) != 0) | this.f35961n;
    }

    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0100  */
    /* JADX WARN: Code duplicated, block: B:57:0x0102  */
    /* JADX WARN: Code duplicated, block: B:59:0x0105  */
    /* JADX WARN: Code duplicated, block: B:62:0x010d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0112  */
    /* JADX WARN: Code duplicated, block: B:66:0x0119  */
    /* JADX WARN: Code duplicated, block: B:69:0x0123  */
    /* JADX WARN: Code duplicated, block: B:78:0x013e  */
    public final void g(byte[] bArr, int i10, int i11) {
        boolean zE;
        boolean zE2;
        boolean z10;
        boolean z11;
        int iG;
        boolean z12;
        int i12;
        int iF;
        int i13;
        int iH;
        int iH2;
        int i14;
        if (!this.f35959l || this.f35958k.f35965c) {
            this.f35952d.a(bArr, i10, i11);
            this.f35953e.a(bArr, i10, i11);
        }
        this.f35954f.a(bArr, i10, i11);
        a aVar = this.f35958k;
        if (aVar.f35972k) {
            int i15 = i11 - i10;
            byte[] bArr2 = aVar.f35969g;
            int length = bArr2.length;
            int i16 = aVar.f35970h + i15;
            if (length < i16) {
                aVar.f35969g = Arrays.copyOf(bArr2, i16 * 2);
            }
            System.arraycopy(bArr, i10, aVar.f35969g, aVar.f35970h, i15);
            int i17 = aVar.f35970h + i15;
            aVar.f35970h = i17;
            byte[] bArr3 = aVar.f35969g;
            f fVar = aVar.f35968f;
            fVar.f41463a = bArr3;
            fVar.f41465c = 0;
            fVar.f41464b = i17;
            fVar.f41466d = 0;
            fVar.a();
            if (fVar.c(8)) {
                fVar.k();
                int iF2 = fVar.f(2);
                fVar.l(5);
                if (fVar.d()) {
                    fVar.g();
                    if (fVar.d()) {
                        int iG2 = fVar.g();
                        if (!aVar.f35965c) {
                            aVar.f35972k = false;
                            a.C0375a c0375a = aVar.f35975n;
                            c0375a.f35985e = iG2;
                            c0375a.f35982b = true;
                            return;
                        }
                        if (fVar.d()) {
                            int iG3 = fVar.g();
                            SparseArray<e.l> sparseArray = aVar.f35967e;
                            if (sparseArray.indexOfKey(iG3) < 0) {
                                aVar.f35972k = false;
                                return;
                            }
                            e.l lVar = sparseArray.get(iG3);
                            e.m mVar = aVar.f35966d.get(lVar.f41443a);
                            if (mVar.j) {
                                if (!fVar.c(2)) {
                                    return;
                                } else {
                                    fVar.l(2);
                                }
                            }
                            int i18 = mVar.f41455l;
                            if (fVar.c(i18)) {
                                int iF3 = fVar.f(i18);
                                if (!mVar.f41454k) {
                                    if (fVar.c(1)) {
                                        zE = fVar.e();
                                        if (!zE) {
                                            zE2 = false;
                                        } else {
                                            if (!fVar.c(1)) {
                                                return;
                                            }
                                            zE2 = fVar.e();
                                            z10 = true;
                                        }
                                        if (aVar.f35971i == 5) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        if (z11) {
                                            iG = 0;
                                        } else if (!fVar.d()) {
                                            return;
                                        } else {
                                            iG = fVar.g();
                                        }
                                        z12 = lVar.f41444b;
                                        i12 = mVar.f41456m;
                                        if (i12 == 0) {
                                            i14 = mVar.f41457n;
                                            if (!fVar.c(i14)) {
                                                return;
                                            }
                                            iF = fVar.f(i14);
                                            if (z12 || zE) {
                                                i13 = 0;
                                                iH = 0;
                                                iH2 = 0;
                                            } else {
                                                if (!fVar.d()) {
                                                    return;
                                                }
                                                iH2 = fVar.h();
                                                i13 = 0;
                                                iH = 0;
                                            }
                                        } else if (i12 == 1 || mVar.f41458o) {
                                            iF = 0;
                                            i13 = 0;
                                            iH = 0;
                                            iH2 = 0;
                                        } else {
                                            if (!fVar.d()) {
                                                return;
                                            }
                                            int iH3 = fVar.h();
                                            if (!z12 || zE) {
                                                i13 = iH3;
                                                iF = 0;
                                                iH = 0;
                                                iH2 = 0;
                                            } else {
                                                if (!fVar.d()) {
                                                    return;
                                                }
                                                iH = fVar.h();
                                                iH2 = 0;
                                                i13 = iH3;
                                                iF = 0;
                                            }
                                        }
                                        a.C0375a c0375a2 = aVar.f35975n;
                                        c0375a2.f35983c = mVar;
                                        c0375a2.f35984d = iF2;
                                        c0375a2.f35985e = iG2;
                                        c0375a2.f35986f = iF3;
                                        c0375a2.f35987g = iG3;
                                        c0375a2.f35988h = zE;
                                        c0375a2.f35989i = z10;
                                        c0375a2.j = zE2;
                                        c0375a2.f35990k = z11;
                                        c0375a2.f35991l = iG;
                                        c0375a2.f35992m = iF;
                                        c0375a2.f35993n = iH2;
                                        c0375a2.f35994o = i13;
                                        c0375a2.f35995p = iH;
                                        c0375a2.f35981a = true;
                                        c0375a2.f35982b = true;
                                        aVar.f35972k = false;
                                    }
                                    return;
                                }
                                zE = false;
                                zE2 = false;
                                z10 = zE2;
                                if (aVar.f35971i == 5) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    iG = 0;
                                } else if (!fVar.d()) {
                                    return;
                                } else {
                                    iG = fVar.g();
                                }
                                z12 = lVar.f41444b;
                                i12 = mVar.f41456m;
                                if (i12 == 0) {
                                    i14 = mVar.f41457n;
                                    if (!fVar.c(i14)) {
                                        return;
                                    }
                                    iF = fVar.f(i14);
                                    if (z12) {
                                    }
                                    i13 = 0;
                                    iH = 0;
                                    iH2 = 0;
                                } else {
                                    if (i12 == 1) {
                                    }
                                    iF = 0;
                                    i13 = 0;
                                    iH = 0;
                                    iH2 = 0;
                                }
                                a.C0375a c0375a3 = aVar.f35975n;
                                c0375a3.f35983c = mVar;
                                c0375a3.f35984d = iF2;
                                c0375a3.f35985e = iG2;
                                c0375a3.f35986f = iF3;
                                c0375a3.f35987g = iG3;
                                c0375a3.f35988h = zE;
                                c0375a3.f35989i = z10;
                                c0375a3.j = zE2;
                                c0375a3.f35990k = z11;
                                c0375a3.f35991l = iG;
                                c0375a3.f35992m = iF;
                                c0375a3.f35993n = iH2;
                                c0375a3.f35994o = i13;
                                c0375a3.f35995p = iH;
                                c0375a3.f35981a = true;
                                c0375a3.f35982b = true;
                                aVar.f35972k = false;
                            }
                        }
                    }
                }
            }
        }
    }

    public final void h(int i10, long j, long j10) {
        if (!this.f35959l || this.f35958k.f35965c) {
            this.f35952d.d(i10);
            this.f35953e.d(i10);
        }
        this.f35954f.d(i10);
        a aVar = this.f35958k;
        boolean z10 = this.f35961n;
        aVar.f35971i = i10;
        aVar.f35973l = j10;
        aVar.j = j;
        aVar.f35980s = z10;
        if (!aVar.f35964b || i10 != 1) {
            if (!aVar.f35965c) {
                return;
            }
            if (i10 != 5 && i10 != 1 && i10 != 2) {
                return;
            }
        }
        a.C0375a c0375a = aVar.f35974m;
        aVar.f35974m = aVar.f35975n;
        aVar.f35975n = c0375a;
        c0375a.f35982b = false;
        c0375a.f35981a = false;
        aVar.f35970h = 0;
        aVar.f35972k = true;
    }
}
