package p091h2;

import A1.K;
import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;
import me.zhanghai.android.materialprogressbar.R;
import p078g1.n;
import p078g1.t;
import p114j1.A;
import p114j1.r;
import p127k1.e;
import p241t7.b;

/* JADX INFO: compiled from: H262Reader.java */
/* JADX INFO: loaded from: classes.dex */
public final class k implements j {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final double[] f35902r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f35903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public K f35904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final G f35905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f35906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r f35907e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f35908f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean[] f35909g = new boolean[4];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f35910h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f35911i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f35912k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f35913l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f35914m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f35915n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f35916o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f35917p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f35918q;

    /* JADX INFO: compiled from: H262Reader.java */
    public static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final byte[] f35919e = {0, 0, 1};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f35920a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f35921b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f35922c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f35923d;

        public final void a(byte[] bArr, int i10, int i11) {
            if (this.f35920a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f35923d;
                int length = bArr2.length;
                int i13 = this.f35921b + i12;
                if (length < i13) {
                    this.f35923d = Arrays.copyOf(bArr2, i13 * 2);
                }
                System.arraycopy(bArr, i10, this.f35923d, this.f35921b, i12);
                this.f35921b += i12;
            }
        }
    }

    public k(G g10, String str) {
        this.f35905c = g10;
        this.f35906d = str;
        a aVar = new a();
        aVar.f35923d = new byte[128];
        this.f35910h = aVar;
        if (g10 != null) {
            this.f35908f = new t(178);
            this.f35907e = new r();
        } else {
            this.f35908f = null;
            this.f35907e = null;
        }
        this.f35914m = -9223372036854775807L;
        this.f35916o = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x019a  */
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
    public final void a(r rVar) {
        a aVar;
        t tVar;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        int i12;
        float f10;
        long j;
        float f11;
        int i13;
        char c10 = 4;
        char c11 = 3;
        b.l(this.f35904b);
        int i14 = rVar.f41063b;
        int i15 = rVar.f41064c;
        byte[] bArr = rVar.f41062a;
        this.f35911i += (long) rVar.a();
        this.f35904b.a(rVar.a(), rVar);
        while (true) {
            int iB = e.b(bArr, i14, i15, this.f35909g);
            aVar = this.f35910h;
            tVar = this.f35908f;
            if (iB == i15) {
                break;
            }
            int i16 = iB + 3;
            int i17 = rVar.f41062a[i16] & 255;
            int i18 = iB - i14;
            if (this.f35912k) {
                i10 = i15;
                i11 = i16;
                i14 = i14;
            } else {
                if (i18 > 0) {
                    aVar.a(bArr, i14, iB);
                }
                int i19 = i18 < 0 ? -i18 : 0;
                if (aVar.f35920a) {
                    int i20 = aVar.f35921b - i19;
                    aVar.f35921b = i20;
                    if (aVar.f35922c == 0 && i17 == 181) {
                        aVar.f35922c = i20;
                        i10 = i15;
                        i11 = i16;
                        i14 = i14;
                    } else {
                        aVar.f35920a = false;
                        String str = this.f35903a;
                        str.getClass();
                        byte[] bArrCopyOf = Arrays.copyOf(aVar.f35923d, aVar.f35921b);
                        int i21 = bArrCopyOf[c10] & 255;
                        byte b10 = bArrCopyOf[5];
                        i11 = i16;
                        i10 = i15;
                        int i22 = ((b10 & 255) >> 4) | (i21 << 4);
                        int i23 = ((b10 & 15) << 8) | (bArrCopyOf[6] & 255);
                        int i24 = (bArrCopyOf[7] & 240) >> 4;
                        if (i24 != 2) {
                            if (i24 == 3) {
                                f11 = i23 * 16;
                                i13 = i22 * 9;
                            } else if (i24 != 4) {
                                f10 = 1.0f;
                            } else {
                                f11 = i23 * R.styleable.AppCompatTheme_windowFixedHeightMinor;
                                i13 = i22 * 100;
                            }
                            f10 = f11 / i13;
                        } else {
                            f10 = (i23 * 4) / (i22 * 3);
                        }
                        n.a aVar2 = new n.a();
                        aVar2.f35327a = str;
                        aVar2.f35337l = t.m(this.f35906d);
                        aVar2.f35338m = t.m("video/mpeg2");
                        aVar2.f35345t = i22;
                        aVar2.f35346u = i23;
                        aVar2.f35349x = f10;
                        aVar2.f35341p = Collections.singletonList(bArrCopyOf);
                        n nVar = new n(aVar2);
                        int i25 = (bArrCopyOf[7] & 15) - 1;
                        if (i25 < 0 || i25 >= 8) {
                            i14 = i14;
                            j = 0;
                        } else {
                            double d10 = f35902r[i25];
                            byte b11 = bArrCopyOf[aVar.f35922c + 9];
                            int i26 = (b11 & 96) >> 5;
                            int i27 = b11 & 31;
                            if (i26 != i27) {
                                d10 *= (((double) i26) + 1.0d) / ((double) (i27 + 1));
                            }
                            j = (long) (1000000.0d / d10);
                        }
                        Pair pairCreate = Pair.create(nVar, Long.valueOf(j));
                        this.f35904b.d((n) pairCreate.first);
                        this.f35913l = ((Long) pairCreate.second).longValue();
                        this.f35912k = true;
                    }
                } else {
                    i10 = i15;
                    i11 = i16;
                    i14 = i14;
                    if (i17 == 179) {
                        aVar.f35920a = true;
                    }
                }
                aVar.a(a.f35919e, 0, 3);
            }
            if (tVar == null) {
                z10 = true;
            } else {
                if (i18 > 0) {
                    tVar.a(bArr, i14, iB);
                    i12 = 0;
                } else {
                    i12 = -i18;
                }
                if (tVar.b(i12)) {
                    int iL = e.l(tVar.f36088e, tVar.f36087d);
                    int i28 = A.f40996a;
                    byte[] bArr2 = tVar.f36087d;
                    r rVar2 = this.f35907e;
                    rVar2.E(iL, bArr2);
                    this.f35905c.a(this.f35916o, rVar2);
                }
                if (i17 == 178) {
                    z10 = true;
                    if (rVar.f41062a[iB + 2] == 1) {
                        tVar.d(i17);
                    }
                } else {
                    z10 = true;
                }
            }
            if (i17 == 0 || i17 == 179) {
                int i29 = i10 - iB;
                if (this.f35918q && this.f35912k) {
                    long j10 = this.f35916o;
                    if (j10 != -9223372036854775807L) {
                        this.f35904b.b(j10, this.f35917p ? 1 : 0, ((int) (this.f35911i - this.f35915n)) - i29, i29, null);
                    }
                }
                if (!this.j || this.f35918q) {
                    this.f35915n = this.f35911i - ((long) i29);
                    long j11 = this.f35914m;
                    if (j11 == -9223372036854775807L) {
                        long j12 = this.f35916o;
                        j11 = j12 != -9223372036854775807L ? j12 + this.f35913l : -9223372036854775807L;
                    }
                    this.f35916o = j11;
                    z11 = false;
                    this.f35917p = false;
                    this.f35914m = -9223372036854775807L;
                    z12 = true;
                    this.j = true;
                } else {
                    z11 = false;
                    z12 = true;
                }
                this.f35918q = i17 == 0 ? z12 : z11;
            } else if (i17 == 184) {
                this.f35917p = z10;
            }
            i15 = i10;
            i14 = i11;
            c10 = 4;
            c11 = 3;
        }
        if (!this.f35912k) {
            aVar.a(bArr, i14, i15);
        }
        if (tVar != null) {
            tVar.a(bArr, i14, i15);
        }
    }

    @Override // p091h2.j
    public final void c() {
        e.a(this.f35909g);
        a aVar = this.f35910h;
        aVar.f35920a = false;
        aVar.f35921b = 0;
        aVar.f35922c = 0;
        t tVar = this.f35908f;
        if (tVar != null) {
            tVar.c();
        }
        this.f35911i = 0L;
        this.j = false;
        this.f35914m = -9223372036854775807L;
        this.f35916o = -9223372036854775807L;
    }

    @Override // p091h2.j
    public final void d(A1.r rVar, F.c cVar) {
        cVar.a();
        cVar.b();
        this.f35903a = cVar.f35810e;
        cVar.b();
        this.f35904b = rVar.p(cVar.f35809d, 2);
        G g10 = this.f35905c;
        if (g10 != null) {
            g10.b(rVar, cVar);
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
    @Override // p091h2.j
    public final void e(boolean z10) {
        b.l(this.f35904b);
        if (z10) {
            boolean z11 = this.f35917p;
            this.f35904b.b(this.f35916o, z11 ? 1 : 0, (int) (this.f35911i - this.f35915n), 0, null);
        }
    }

    @Override // p091h2.j
    public final void f(int i10, long j) {
        this.f35914m = j;
    }
}
