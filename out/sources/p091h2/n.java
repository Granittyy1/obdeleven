package p091h2;

import A1.K;
import A8.p;
import java.util.Collections;
import p078g1.h;
import p078g1.t;
import p114j1.A;
import p114j1.d;
import p114j1.r;
import p127k1.e;
import p127k1.g;
import p241t7.b;

/* JADX INFO: compiled from: H265Reader.java */
/* JADX INFO: loaded from: classes.dex */
public final class n implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B f35996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f35997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public K f35998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f35999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f36000e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f36006l;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean[] f36001f = new boolean[3];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f36002g = new t(32);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f36003h = new t(33);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f36004i = new t(34);
    public final t j = new t(39);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t f36005k = new t(40);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f36007m = -9223372036854775807L;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final r f36008n = new r();

    /* JADX INFO: compiled from: H265Reader.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f36009a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f36010b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f36011c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f36012d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f36013e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f36014f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f36015g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f36016h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f36017i;
        public boolean j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f36018k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f36019l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f36020m;

        public a(K k10) {
            this.f36009a = k10;
        }

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
        public final void a(int i10) {
            long j = this.f36019l;
            if (j != -9223372036854775807L) {
                long j10 = this.f36010b;
                long j11 = this.f36018k;
                if (j10 == j11) {
                    return;
                }
                boolean z10 = this.f36020m;
                this.f36009a.b(j, z10 ? 1 : 0, (int) (j10 - j11), i10, null);
            }
        }
    }

    public n(B b10) {
        this.f35996a = b10;
    }

    @Override // p091h2.j
    public final void a(r rVar) {
        int i10;
        int i11;
        b.l(this.f35998c);
        int i12 = A.f40996a;
        while (rVar.a() > 0) {
            int i13 = rVar.f41063b;
            int i14 = rVar.f41064c;
            byte[] bArr = rVar.f41062a;
            this.f36006l += (long) rVar.a();
            this.f35998c.a(rVar.a(), rVar);
            while (i13 < i14) {
                int iB = e.b(bArr, i13, i14, this.f36001f);
                if (iB == i14) {
                    g(bArr, i13, i14);
                    return;
                }
                int i15 = (bArr[iB + 3] & 126) >> 1;
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
                long j = this.f36006l - ((long) i17);
                b(i17, i16 < 0 ? -i16 : 0, j, this.f36007m);
                h(i17, i15, j, this.f36007m);
                i13 = i10 + i11;
            }
        }
    }

    public final void b(int i10, int i11, long j, long j10) {
        a aVar = this.f35999d;
        boolean z10 = this.f36000e;
        if (aVar.j && aVar.f36015g) {
            aVar.f36020m = aVar.f36011c;
            aVar.j = false;
        } else if (aVar.f36016h || aVar.f36015g) {
            if (z10 && aVar.f36017i) {
                aVar.a(i10 + ((int) (j - aVar.f36010b)));
            }
            aVar.f36018k = aVar.f36010b;
            aVar.f36019l = aVar.f36013e;
            aVar.f36020m = aVar.f36011c;
            aVar.f36017i = true;
        }
        boolean z11 = this.f36000e;
        g gVar = this.f35996a.f35763c;
        if (!z11) {
            t tVar = this.f36002g;
            tVar.b(i11);
            t tVar2 = this.f36003h;
            tVar2.b(i11);
            t tVar3 = this.f36004i;
            tVar3.b(i11);
            if (tVar.f36086c && tVar2.f36086c && tVar3.f36086c) {
                String str = this.f35997b;
                int i12 = tVar.f36088e;
                byte[] bArr = new byte[tVar2.f36088e + i12 + tVar3.f36088e];
                System.arraycopy(tVar.f36087d, 0, bArr, 0, i12);
                System.arraycopy(tVar2.f36087d, 0, bArr, tVar.f36088e, tVar2.f36088e);
                System.arraycopy(tVar3.f36087d, 0, bArr, tVar.f36088e + tVar2.f36088e, tVar3.f36088e);
                String strA = null;
                e.h hVarH = e.h(tVar2.f36087d, 3, tVar2.f36088e, null);
                e.c cVar = hVarH.f41425b;
                if (cVar != null) {
                    strA = d.a(cVar.f41408a, cVar.f41409b, cVar.f41410c, cVar.f41411d, cVar.f41412e, cVar.f41413f);
                }
                g1.n.a aVar2 = new g1.n.a();
                aVar2.f35327a = str;
                aVar2.f35337l = t.m("video/mp2t");
                aVar2.f35338m = t.m("video/hevc");
                aVar2.j = strA;
                aVar2.f35345t = hVarH.f41428e;
                aVar2.f35346u = hVarH.f41429f;
                aVar2.f35315A = new h(hVarH.f41432i, hVarH.j, hVarH.f41433k, hVarH.f41426c + 8, hVarH.f41427d + 8, null);
                aVar2.f35349x = hVarH.f41430g;
                aVar2.f35340o = hVarH.f41431h;
                aVar2.f35316B = hVarH.f41424a + 1;
                aVar2.f35341p = Collections.singletonList(bArr);
                p078g1.n nVar = new p078g1.n(aVar2);
                this.f35998c.d(nVar);
                int i13 = nVar.f35304p;
                p.q(i13 != -1);
                gVar.getClass();
                b.k(i13 >= 0);
                gVar.f41471e = i13;
                gVar.b(i13);
                this.f36000e = true;
            }
        }
        t tVar4 = this.j;
        boolean zB = tVar4.b(i11);
        r rVar = this.f36008n;
        if (zB) {
            rVar.E(e.l(tVar4.f36088e, tVar4.f36087d), tVar4.f36087d);
            rVar.H(5);
            gVar.a(j10, rVar);
        }
        t tVar5 = this.f36005k;
        if (tVar5.b(i11)) {
            rVar.E(e.l(tVar5.f36088e, tVar5.f36087d), tVar5.f36087d);
            rVar.H(5);
            gVar.a(j10, rVar);
        }
    }

    @Override // p091h2.j
    public final void c() {
        this.f36006l = 0L;
        this.f36007m = -9223372036854775807L;
        e.a(this.f36001f);
        this.f36002g.c();
        this.f36003h.c();
        this.f36004i.c();
        this.j.c();
        this.f36005k.c();
        this.f35996a.f35763c.b(0);
        a aVar = this.f35999d;
        if (aVar != null) {
            aVar.f36014f = false;
            aVar.f36015g = false;
            aVar.f36016h = false;
            aVar.f36017i = false;
            aVar.j = false;
        }
    }

    @Override // p091h2.j
    public final void d(A1.r rVar, F.c cVar) {
        cVar.a();
        cVar.b();
        this.f35997b = cVar.f35810e;
        cVar.b();
        K kP = rVar.p(cVar.f35809d, 2);
        this.f35998c = kP;
        this.f35999d = new a(kP);
        this.f35996a.a(rVar, cVar);
    }

    @Override // p091h2.j
    public final void e(boolean z10) {
        b.l(this.f35998c);
        int i10 = A.f40996a;
        if (z10) {
            this.f35996a.f35763c.b(0);
            b(0, 0, this.f36006l, this.f36007m);
            h(0, 48, this.f36006l, this.f36007m);
        }
    }

    @Override // p091h2.j
    public final void f(int i10, long j) {
        this.f36007m = j;
    }

    public final void g(byte[] bArr, int i10, int i11) {
        a aVar = this.f35999d;
        if (aVar.f36014f) {
            int i12 = aVar.f36012d;
            int i13 = (i10 + 2) - i12;
            if (i13 < i11) {
                aVar.f36015g = (bArr[i13] & 128) != 0;
                aVar.f36014f = false;
            } else {
                aVar.f36012d = (i11 - i10) + i12;
            }
        }
        if (!this.f36000e) {
            this.f36002g.a(bArr, i10, i11);
            this.f36003h.a(bArr, i10, i11);
            this.f36004i.a(bArr, i10, i11);
        }
        this.j.a(bArr, i10, i11);
        this.f36005k.a(bArr, i10, i11);
    }

    public final void h(int i10, int i11, long j, long j10) {
        a aVar = this.f35999d;
        boolean z10 = this.f36000e;
        aVar.f36015g = false;
        aVar.f36016h = false;
        aVar.f36013e = j10;
        aVar.f36012d = 0;
        aVar.f36010b = j;
        if (i11 >= 32 && i11 != 40) {
            if (aVar.f36017i && !aVar.j) {
                if (z10) {
                    aVar.a(i10);
                }
                aVar.f36017i = false;
            }
            if ((32 <= i11 && i11 <= 35) || i11 == 39) {
                aVar.f36016h = !aVar.j;
                aVar.j = true;
            }
        }
        boolean z11 = i11 >= 16 && i11 <= 21;
        aVar.f36011c = z11;
        aVar.f36014f = z11 || i11 <= 9;
        if (!this.f36000e) {
            this.f36002g.d(i11);
            this.f36003h.d(i11);
            this.f36004i.d(i11);
        }
        this.j.d(i11);
        this.f36005k.d(i11);
    }
}
