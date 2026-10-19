package p091h2;

import A1.C0566a;
import A1.C0576k;
import A1.C0578m;
import A1.K;
import androidx.media3.common.ParserException;
import java.util.Arrays;
import java.util.Collections;
import me.zhanghai.android.materialprogressbar.R;
import p078g1.n;
import p078g1.t;
import p114j1.A;
import p114j1.k;
import p114j1.q;
import p114j1.r;
import p241t7.b;

/* JADX INFO: renamed from: h2.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AdtsReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class C2206f implements j {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final byte[] f35856x = {73, 68, 51};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f35857a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f35860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f35861e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f35862f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f35863g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public K f35864h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public K f35865i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f35868m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f35869n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f35872q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f35873r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f35875t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public K f35877v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f35878w;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f35858b = new q(7, new byte[7]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f35859c = new r(Arrays.copyOf(f35856x, 10));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f35870o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f35871p = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f35874s = -9223372036854775807L;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f35876u = -9223372036854775807L;
    public int j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f35866k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f35867l = 256;

    public C2206f(String str, String str2, int i10, boolean z10) {
        this.f35857a = z10;
        this.f35860d = str;
        this.f35861e = i10;
        this.f35862f = str2;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:115:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:118:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:119:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:121:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:124:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:126:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:128:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:130:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:132:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:133:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:135:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:136:0x0304  */
    /* JADX WARN: Code duplicated, block: B:137:0x030e  */
    /* JADX WARN: Code duplicated, block: B:171:0x02ea A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v0, types: [j1.r] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
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
        ?? r10;
        int i10;
        byte[] bArr;
        int i11;
        int i12;
        int i13;
        char c10;
        char c11;
        boolean z10;
        boolean z11;
        int i14;
        int i15;
        int i16;
        ?? r11 = 0;
        int i17 = 7;
        int i18 = 2;
        this.f35864h.getClass();
        int i19 = A.f40996a;
        while (rVar.a() > 0) {
            int i20 = this.j;
            q qVar = this.f35858b;
            int i21 = 4;
            r rVar2 = this.f35859c;
            if (i20 == 0) {
                byte[] bArr2 = rVar.f41062a;
                int i22 = rVar.f41063b;
                int i23 = rVar.f41064c;
                ?? r12 = r11;
                while (true) {
                    if (i22 < i23) {
                        int i24 = i22 + 1;
                        byte b10 = bArr2[i22];
                        int i25 = b10 & 255;
                        if (this.f35867l == 512 && ((65280 | (((byte) i25) & 255)) & 65526) == 65520) {
                            if (!this.f35869n) {
                                int i26 = i22 - 1;
                                rVar.G(i22);
                                byte[] bArr3 = qVar.f41055a;
                                if (rVar.a() < 1) {
                                    bArr = bArr2;
                                } else {
                                    rVar.f(bArr3, r12, 1);
                                    qVar.m(i21);
                                    int iG = qVar.g(1);
                                    int i27 = this.f35870o;
                                    if (i27 == -1 || iG == i27) {
                                        if (this.f35871p != -1) {
                                            byte[] bArr4 = qVar.f41055a;
                                            if (rVar.a() >= 1) {
                                                rVar.f(bArr4, r12, 1);
                                                qVar.m(i18);
                                                i14 = 4;
                                                if (qVar.g(4) != this.f35871p) {
                                                    bArr = bArr2;
                                                } else {
                                                    rVar.G(i24);
                                                }
                                            }
                                        } else {
                                            i14 = 4;
                                        }
                                        byte[] bArr5 = qVar.f41055a;
                                        if (rVar.a() >= i14) {
                                            rVar.f(bArr5, r12, i14);
                                            qVar.m(14);
                                            int iG2 = qVar.g(13);
                                            if (iG2 < 7) {
                                                bArr = bArr2;
                                            } else {
                                                byte[] bArr6 = rVar.f41062a;
                                                int i28 = rVar.f41064c;
                                                int i29 = i26 + iG2;
                                                if (i29 < i28) {
                                                    byte b11 = bArr6[i29];
                                                    bArr = bArr2;
                                                    if (b11 == -1) {
                                                        int i30 = i29 + 1;
                                                        if (i30 != i28) {
                                                            byte b12 = bArr6[i30];
                                                            if (((65280 | (b12 & 255)) & 65526) != 65520 || ((b12 & 8) >> 3) != iG) {
                                                            }
                                                        }
                                                    } else if (b11 == 73 && ((i15 = i29 + 1) == i28 || (bArr6[i15] == 68 && ((i16 = i29 + 2) == i28 || bArr6[i16] == 51)))) {
                                                    }
                                                }
                                                this.f35872q = (b10 & 8) >> 3;
                                                if ((b10 & 1) == 0) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                this.f35868m = z11;
                                                if (this.f35869n) {
                                                    this.j = 3;
                                                    this.f35866k = 0;
                                                } else {
                                                    this.j = 1;
                                                    this.f35866k = 0;
                                                }
                                                rVar.G(i24);
                                                i10 = 2;
                                                r10 = 0;
                                            }
                                        }
                                    } else {
                                        bArr = bArr2;
                                    }
                                }
                                i11 = this.f35867l;
                                i12 = i11 | i25;
                                if (i12 != 329) {
                                    i13 = 2;
                                    c10 = 256;
                                    c11 = 3;
                                    z10 = false;
                                    this.f35867l = 768;
                                } else if (i12 != 511) {
                                    i13 = 2;
                                    c10 = 256;
                                    c11 = 3;
                                    z10 = false;
                                    this.f35867l = 512;
                                } else if (i12 != 836) {
                                    i13 = 2;
                                    c10 = 256;
                                    c11 = 3;
                                    z10 = false;
                                    this.f35867l = 1024;
                                } else if (i12 != 1075) {
                                    c10 = 256;
                                    if (i11 != 256) {
                                        this.f35867l = 256;
                                        i13 = 2;
                                        c11 = 3;
                                        z10 = false;
                                    } else {
                                        i13 = 2;
                                        c11 = 3;
                                        z10 = false;
                                    }
                                    bArr2 = bArr;
                                    i21 = 4;
                                    i18 = i13;
                                    r12 = z10;
                                } else {
                                    i10 = 2;
                                    this.j = 2;
                                    this.f35866k = 3;
                                    r10 = 0;
                                    this.f35875t = 0;
                                    rVar2.G(0);
                                    rVar.G(i24);
                                }
                                i22 = i24;
                                bArr2 = bArr;
                                i21 = 4;
                                i18 = i13;
                                r12 = z10;
                            }
                            this.f35872q = (b10 & 8) >> 3;
                            if ((b10 & 1) == 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            this.f35868m = z11;
                            if (this.f35869n) {
                                this.j = 1;
                                this.f35866k = 0;
                            } else {
                                this.j = 3;
                                this.f35866k = 0;
                            }
                            rVar.G(i24);
                            i10 = 2;
                            r10 = 0;
                        } else {
                            bArr = bArr2;
                            i11 = this.f35867l;
                            i12 = i11 | i25;
                            if (i12 != 329) {
                                i13 = 2;
                                c10 = 256;
                                c11 = 3;
                                z10 = false;
                                this.f35867l = 768;
                            } else if (i12 != 511) {
                                i13 = 2;
                                c10 = 256;
                                c11 = 3;
                                z10 = false;
                                this.f35867l = 512;
                            } else if (i12 != 836) {
                                i13 = 2;
                                c10 = 256;
                                c11 = 3;
                                z10 = false;
                                this.f35867l = 1024;
                            } else if (i12 != 1075) {
                                c10 = 256;
                                if (i11 != 256) {
                                    this.f35867l = 256;
                                    i13 = 2;
                                    c11 = 3;
                                    z10 = false;
                                } else {
                                    i13 = 2;
                                    c11 = 3;
                                    z10 = false;
                                }
                                bArr2 = bArr;
                                i21 = 4;
                                i18 = i13;
                                r12 = z10;
                            } else {
                                i10 = 2;
                                this.j = 2;
                                this.f35866k = 3;
                                r10 = 0;
                                this.f35875t = 0;
                                rVar2.G(0);
                                rVar.G(i24);
                            }
                            i22 = i24;
                            bArr2 = bArr;
                            i21 = 4;
                            i18 = i13;
                            r12 = z10;
                        }
                    } else {
                        r10 = r12;
                        i10 = i18;
                        rVar.G(i22);
                    }
                    i18 = i10;
                    r11 = r10;
                    i17 = 7;
                }
            } else if (i20 != 1) {
                if (i20 == i18) {
                    byte[] bArr7 = rVar2.f41062a;
                    int iMin = Math.min(rVar.a(), 10 - this.f35866k);
                    rVar.f(bArr7, this.f35866k, iMin);
                    int i31 = this.f35866k + iMin;
                    this.f35866k = i31;
                    if (i31 == 10) {
                        this.f35865i.a(10, rVar2);
                        rVar2.G(6);
                        K k10 = this.f35865i;
                        int iT = rVar2.t() + 10;
                        this.j = 4;
                        this.f35866k = 10;
                        this.f35877v = k10;
                        this.f35878w = 0L;
                        this.f35875t = iT;
                    }
                } else if (i20 == 3) {
                    int i32 = this.f35868m ? i17 : 5;
                    byte[] bArr8 = qVar.f41055a;
                    int iMin2 = Math.min(rVar.a(), i32 - this.f35866k);
                    rVar.f(bArr8, this.f35866k, iMin2);
                    int i33 = this.f35866k + iMin2;
                    this.f35866k = i33;
                    if (i33 == i32) {
                        qVar.m(r11 == true ? 1 : 0);
                        if (this.f35873r) {
                            qVar.o(10);
                        } else {
                            int iG3 = qVar.g(i18) + 1;
                            if (iG3 != i18) {
                                k.f("Detected audio object type: " + iG3 + ", but assuming AAC LC.");
                                iG3 = i18;
                            }
                            qVar.o(5);
                            int iG4 = qVar.g(3);
                            int i34 = this.f35871p;
                            byte b13 = (byte) (((iG3 << 3) & 248) | ((i34 >> 1) & i17));
                            byte b14 = (byte) (((iG4 << 3) & R.styleable.AppCompatTheme_windowFixedHeightMajor) | ((i34 << i17) & 128));
                            byte[] bArr9 = new byte[i18];
                            bArr9[r11 == true ? 1 : 0] = b13;
                            bArr9[1] = b14;
                            C0566a.C0000a c0000aB = C0566a.b(new q(i18, bArr9), r11);
                            n.a aVar = new n.a();
                            aVar.f35327a = this.f35863g;
                            aVar.f35337l = t.m(this.f35862f);
                            aVar.f35338m = t.m("audio/mp4a-latm");
                            aVar.j = c0000aB.f457c;
                            aVar.f35317C = c0000aB.f456b;
                            aVar.f35318D = c0000aB.f455a;
                            aVar.f35341p = Collections.singletonList(bArr9);
                            aVar.f35330d = this.f35860d;
                            aVar.f35332f = this.f35861e;
                            n nVar = new n(aVar);
                            this.f35874s = 1024000000 / ((long) nVar.f35280E);
                            this.f35864h.d(nVar);
                            this.f35873r = true;
                        }
                        qVar.o(4);
                        int iG5 = qVar.g(13);
                        int i35 = iG5 - 7;
                        if (this.f35868m) {
                            i35 = iG5 - 9;
                        }
                        K k11 = this.f35864h;
                        long j = this.f35874s;
                        this.j = 4;
                        this.f35866k = r11 == true ? 1 : 0;
                        this.f35877v = k11;
                        this.f35878w = j;
                        this.f35875t = i35;
                    }
                } else {
                    if (i20 != 4) {
                        throw new IllegalStateException();
                    }
                    int iMin3 = Math.min(rVar.a(), this.f35875t - this.f35866k);
                    this.f35877v.a(iMin3, rVar);
                    int i36 = this.f35866k + iMin3;
                    this.f35866k = i36;
                    if (i36 == this.f35875t) {
                        b.k(this.f35876u != -9223372036854775807L ? true : r11 == true ? 1 : 0);
                        this.f35877v.b(this.f35876u, 1, this.f35875t, 0, null);
                        this.f35876u += this.f35878w;
                        this.j = r11 == true ? 1 : 0;
                        this.f35866k = r11 == true ? 1 : 0;
                        this.f35867l = 256;
                    }
                }
            } else if (rVar.a() != 0) {
                qVar.f41055a[r11 == true ? 1 : 0] = rVar.f41062a[rVar.f41063b];
                qVar.m(i18);
                int iG6 = qVar.g(4);
                int i37 = this.f35871p;
                if (i37 == -1 || iG6 == i37) {
                    if (!this.f35869n) {
                        this.f35869n = true;
                        this.f35870o = this.f35872q;
                        this.f35871p = iG6;
                    }
                    this.j = 3;
                    this.f35866k = r11 == true ? 1 : 0;
                } else {
                    this.f35869n = r11;
                    this.j = r11 == true ? 1 : 0;
                    this.f35866k = r11 == true ? 1 : 0;
                    this.f35867l = 256;
                }
            }
        }
    }

    @Override // p091h2.j
    public final void c() {
        this.f35876u = -9223372036854775807L;
        this.f35869n = false;
        this.j = 0;
        this.f35866k = 0;
        this.f35867l = 256;
    }

    @Override // p091h2.j
    public final void d(A1.r rVar, F.c cVar) {
        cVar.a();
        cVar.b();
        this.f35863g = cVar.f35810e;
        cVar.b();
        K kP = rVar.p(cVar.f35809d, 1);
        this.f35864h = kP;
        this.f35877v = kP;
        if (!this.f35857a) {
            this.f35865i = new C0578m();
            return;
        }
        cVar.a();
        cVar.b();
        K kP2 = rVar.p(cVar.f35809d, 5);
        this.f35865i = kP2;
        n.a aVar = new n.a();
        cVar.b();
        aVar.f35327a = cVar.f35810e;
        aVar.f35337l = t.m(this.f35862f);
        aVar.f35338m = t.m("application/id3");
        C0576k.b(aVar, kP2);
    }

    @Override // p091h2.j
    public final void f(int i10, long j) {
        this.f35876u = j;
    }

    @Override // p091h2.j
    public final void e(boolean z10) {
    }
}
