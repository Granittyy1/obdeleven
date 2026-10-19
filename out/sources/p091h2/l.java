package p091h2;

import A1.C0576k;
import A1.K;
import java.util.Arrays;
import java.util.Collections;
import p078g1.n;
import p078g1.t;
import p114j1.A;
import p114j1.k;
import p114j1.q;
import p114j1.r;
import p127k1.e;

/* JADX INFO: compiled from: H263Reader.java */
/* JADX INFO: loaded from: classes.dex */
public final class l implements j {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float[] f35924l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G f35925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f35926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean[] f35927c = new boolean[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f35928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f35929e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f35930f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f35931g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f35932h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public K f35933i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f35934k;

    /* JADX INFO: compiled from: H263Reader.java */
    public static final class a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final byte[] f35935f = {0, 0, 1};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f35936a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f35937b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f35938c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f35939d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f35940e;

        public final void a(byte[] bArr, int i10, int i11) {
            if (this.f35936a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f35940e;
                int length = bArr2.length;
                int i13 = this.f35938c + i12;
                if (length < i13) {
                    this.f35940e = Arrays.copyOf(bArr2, i13 * 2);
                }
                System.arraycopy(bArr, i10, this.f35940e, this.f35938c, i12);
                this.f35938c += i12;
            }
        }
    }

    /* JADX INFO: compiled from: H263Reader.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f35941a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f35942b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f35943c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f35944d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f35945e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f35946f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f35947g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f35948h;

        public b(K k10) {
            this.f35941a = k10;
        }

        public final void a(byte[] bArr, int i10, int i11) {
            if (this.f35943c) {
                int i12 = this.f35946f;
                int i13 = (i10 + 1) - i12;
                if (i13 >= i11) {
                    this.f35946f = (i11 - i10) + i12;
                } else {
                    this.f35944d = ((bArr[i13] & 192) >> 6) == 0;
                    this.f35943c = false;
                }
            }
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
        public final void b(int i10, long j, boolean z10) {
            p241t7.b.k(this.f35948h != -9223372036854775807L);
            if (this.f35945e == 182 && z10 && this.f35942b) {
                this.f35941a.b(this.f35948h, this.f35944d ? 1 : 0, (int) (j - this.f35947g), i10, null);
            }
            if (this.f35945e != 179) {
                this.f35947g = j;
            }
        }
    }

    public l(G g10) {
        this.f35925a = g10;
        a aVar = new a();
        aVar.f35940e = new byte[128];
        this.f35928d = aVar;
        this.f35934k = -9223372036854775807L;
        this.f35929e = new t(178);
        this.f35926b = new r();
    }

    /* JADX WARN: Code duplicated, block: B:106:0x025e  */
    /* JADX WARN: Code duplicated, block: B:109:0x0263  */
    /* JADX WARN: Code duplicated, block: B:110:0x0265  */
    /* JADX WARN: Code duplicated, block: B:88:0x0203 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x0205  */
    /* JADX WARN: Code duplicated, block: B:90:0x020a  */
    /* JADX WARN: Code duplicated, block: B:93:0x0211  */
    /* JADX WARN: Code duplicated, block: B:96:0x022d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0237  */
    /* JADX WARN: Code duplicated, block: B:99:0x023b  */
    @Override // p091h2.j
    public final void a(r rVar) {
        char c10;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        float f10;
        boolean z13 = true;
        p241t7.b.l(this.f35930f);
        p241t7.b.l(this.f35933i);
        int i11 = rVar.f41063b;
        int i12 = rVar.f41064c;
        byte[] bArr = rVar.f41062a;
        this.f35931g += (long) rVar.a();
        this.f35933i.a(rVar.a(), rVar);
        while (true) {
            int iB = e.b(bArr, i11, i12, this.f35927c);
            a aVar = this.f35928d;
            t tVar = this.f35929e;
            if (iB == i12) {
                if (!this.j) {
                    aVar.a(bArr, i11, i12);
                }
                this.f35930f.a(bArr, i11, i12);
                if (tVar != null) {
                    tVar.a(bArr, i11, i12);
                    return;
                }
                return;
            }
            int i13 = iB + 3;
            byte b10 = rVar.f41062a[i13];
            int i14 = b10 & 255;
            int i15 = iB - i11;
            if (this.j) {
                i13 = i13;
            } else {
                if (i15 > 0) {
                    aVar.a(bArr, i11, iB);
                }
                int i16 = i15 < 0 ? -i15 : 0;
                int i17 = aVar.f35937b;
                if (i17 == 0) {
                    i13 = i13;
                    if (i14 == 176) {
                        aVar.f35937b = 1;
                        aVar.f35936a = true;
                    }
                } else if (i17 == z13) {
                    i13 = i13;
                    if (i14 != 181) {
                        k.f("Unexpected start code value");
                        aVar.f35936a = false;
                        aVar.f35938c = 0;
                        aVar.f35937b = 0;
                    } else {
                        aVar.f35937b = 2;
                    }
                } else if (i17 == 2) {
                    i13 = i13;
                    if (i14 > 31) {
                        k.f("Unexpected start code value");
                        aVar.f35936a = false;
                        aVar.f35938c = 0;
                        aVar.f35937b = 0;
                    } else {
                        aVar.f35937b = 3;
                    }
                } else if (i17 == 3) {
                    i13 = i13;
                    if ((b10 & 240) != 32) {
                        k.f("Unexpected start code value");
                        aVar.f35936a = false;
                        aVar.f35938c = 0;
                        aVar.f35937b = 0;
                    } else {
                        aVar.f35939d = aVar.f35938c;
                        aVar.f35937b = 4;
                    }
                } else {
                    if (i17 != 4) {
                        throw new IllegalStateException();
                    }
                    if (i14 == 179 || i14 == 181) {
                        aVar.f35938c -= i16;
                        aVar.f35936a = false;
                        K k10 = this.f35933i;
                        int i18 = aVar.f35939d;
                        String str = this.f35932h;
                        str.getClass();
                        byte[] bArrCopyOf = Arrays.copyOf(aVar.f35940e, aVar.f35938c);
                        q qVar = new q(bArrCopyOf.length, bArrCopyOf);
                        qVar.p(i18);
                        qVar.p(4);
                        qVar.n();
                        qVar.o(8);
                        if (qVar.f()) {
                            qVar.o(4);
                            qVar.o(3);
                        }
                        int iG = qVar.g(4);
                        if (iG == 15) {
                            int iG2 = qVar.g(8);
                            int iG3 = qVar.g(8);
                            if (iG3 == 0) {
                                k.f("Invalid aspect ratio");
                                f10 = 1.0f;
                            } else {
                                f10 = iG2 / iG3;
                            }
                        } else if (iG < 7) {
                            f10 = f35924l[iG];
                        } else {
                            k.f("Invalid aspect ratio");
                            f10 = 1.0f;
                        }
                        if (qVar.f()) {
                            qVar.o(2);
                            qVar.o(1);
                            if (qVar.f()) {
                                qVar.o(15);
                                qVar.n();
                                qVar.o(15);
                                qVar.n();
                                qVar.o(15);
                                qVar.n();
                                qVar.o(3);
                                qVar.o(11);
                                qVar.n();
                                qVar.o(15);
                                qVar.n();
                            }
                        }
                        if (qVar.g(2) != 0) {
                            k.f("Unhandled video object layer shape");
                        }
                        qVar.n();
                        int iG4 = qVar.g(16);
                        qVar.n();
                        if (qVar.f()) {
                            if (iG4 == 0) {
                                k.f("Invalid vop_increment_time_resolution");
                            } else {
                                int i19 = 0;
                                for (int i20 = iG4 - 1; i20 > 0; i20 >>= 1) {
                                    i19++;
                                }
                                qVar.o(i19);
                            }
                        }
                        qVar.n();
                        int iG5 = qVar.g(13);
                        qVar.n();
                        int iG6 = qVar.g(13);
                        qVar.n();
                        qVar.n();
                        n.a aVar2 = new n.a();
                        aVar2.f35327a = str;
                        aVar2.f35337l = t.m("video/mp2t");
                        aVar2.f35338m = t.m("video/mp4v-es");
                        aVar2.f35345t = iG5;
                        aVar2.f35346u = iG6;
                        aVar2.f35349x = f10;
                        aVar2.f35341p = Collections.singletonList(bArrCopyOf);
                        C0576k.b(aVar2, k10);
                        this.j = true;
                    } else {
                        i13 = i13;
                    }
                }
                c10 = 3;
                aVar.a(a.f35935f, 0, 3);
                this.f35930f.a(bArr, i11, iB);
                if (tVar == null) {
                    z10 = true;
                } else {
                    if (i15 > 0) {
                        tVar.a(bArr, i11, iB);
                        i10 = 0;
                    } else {
                        i10 = -i15;
                    }
                    if (tVar.b(i10)) {
                        int iL = e.l(tVar.f36088e, tVar.f36087d);
                        int i21 = A.f40996a;
                        byte[] bArr2 = tVar.f36087d;
                        r rVar2 = this.f35926b;
                        rVar2.E(iL, bArr2);
                        this.f35925a.a(this.f35934k, rVar2);
                    }
                    if (i14 == 178) {
                        z10 = true;
                        if (rVar.f41062a[iB + 2] == 1) {
                            tVar.d(i14);
                        }
                    } else {
                        z10 = true;
                    }
                }
                int i22 = i12 - iB;
                this.f35930f.b(i22, this.f35931g - ((long) i22), this.j);
                b bVar = this.f35930f;
                long j = this.f35934k;
                bVar.f35945e = i14;
                bVar.f35944d = false;
                if (i14 != 182 || i14 == 179) {
                    z11 = z10;
                } else {
                    z11 = false;
                }
                bVar.f35942b = z11;
                if (i14 == 182) {
                    z12 = z10;
                } else {
                    z12 = false;
                }
                bVar.f35943c = z12;
                bVar.f35946f = 0;
                bVar.f35948h = j;
                z13 = z10;
                i11 = i13;
            }
            c10 = 3;
            this.f35930f.a(bArr, i11, iB);
            if (tVar == null) {
                z10 = true;
            } else {
                if (i15 > 0) {
                    tVar.a(bArr, i11, iB);
                    i10 = 0;
                } else {
                    i10 = -i15;
                }
                if (tVar.b(i10)) {
                    int iL2 = e.l(tVar.f36088e, tVar.f36087d);
                    int i23 = A.f40996a;
                    byte[] bArr3 = tVar.f36087d;
                    r rVar3 = this.f35926b;
                    rVar3.E(iL2, bArr3);
                    this.f35925a.a(this.f35934k, rVar3);
                }
                if (i14 == 178) {
                    z10 = true;
                    if (rVar.f41062a[iB + 2] == 1) {
                        tVar.d(i14);
                    }
                } else {
                    z10 = true;
                }
            }
            int i24 = i12 - iB;
            this.f35930f.b(i24, this.f35931g - ((long) i24), this.j);
            b bVar2 = this.f35930f;
            long j10 = this.f35934k;
            bVar2.f35945e = i14;
            bVar2.f35944d = false;
            if (i14 != 182) {
                z11 = z10;
            } else {
                z11 = z10;
            }
            bVar2.f35942b = z11;
            if (i14 == 182) {
                z12 = z10;
            } else {
                z12 = false;
            }
            bVar2.f35943c = z12;
            bVar2.f35946f = 0;
            bVar2.f35948h = j10;
            z13 = z10;
            i11 = i13;
        }
    }

    @Override // p091h2.j
    public final void c() {
        e.a(this.f35927c);
        a aVar = this.f35928d;
        aVar.f35936a = false;
        aVar.f35938c = 0;
        aVar.f35937b = 0;
        b bVar = this.f35930f;
        if (bVar != null) {
            bVar.f35942b = false;
            bVar.f35943c = false;
            bVar.f35944d = false;
            bVar.f35945e = -1;
        }
        t tVar = this.f35929e;
        if (tVar != null) {
            tVar.c();
        }
        this.f35931g = 0L;
        this.f35934k = -9223372036854775807L;
    }

    @Override // p091h2.j
    public final void d(A1.r rVar, F.c cVar) {
        cVar.a();
        cVar.b();
        this.f35932h = cVar.f35810e;
        cVar.b();
        K kP = rVar.p(cVar.f35809d, 2);
        this.f35933i = kP;
        this.f35930f = new b(kP);
        this.f35925a.b(rVar, cVar);
    }

    @Override // p091h2.j
    public final void e(boolean z10) {
        p241t7.b.l(this.f35930f);
        if (z10) {
            this.f35930f.b(0, this.f35931g, this.j);
            b bVar = this.f35930f;
            bVar.f35942b = false;
            bVar.f35943c = false;
            bVar.f35944d = false;
            bVar.f35945e = -1;
        }
    }

    @Override // p091h2.j
    public final void f(int i10, long j) {
        this.f35934k = j;
    }
}
