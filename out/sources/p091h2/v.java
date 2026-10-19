package p091h2;

import androidx.media3.common.ParserException;
import p114j1.k;
import p114j1.q;
import p114j1.r;
import p114j1.w;
import p241t7.b;

/* JADX INFO: compiled from: PesReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class v implements F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f36092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f36093b = new q(10, new byte[10]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f36094c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f36095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w f36096e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f36097f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f36098g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f36099h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f36100i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f36101k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f36102l;

    public v(j jVar) {
        this.f36092a = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [j1.q] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v4, types: [int] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r3v0, types: [h2.j] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r9v5, types: [int] */
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
    @Override // p091h2.F
    public final void a(int i10, r rVar) throws ParserException {
        ?? r10;
        int i11;
        ?? r11;
        b.l(this.f36096e);
        int i12 = i10 & 1;
        ?? r12 = this.f36092a;
        int i13 = -1;
        int i14 = 2;
        ?? r13 = 0;
        if (i12 != 0) {
            int i15 = this.f36094c;
            if (i15 != 0 && i15 != 1) {
                if (i15 == 2) {
                    k.f("Unexpected start indicator reading extended header");
                } else {
                    if (i15 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.j != -1) {
                        k.f("Unexpected start indicator: expected " + this.j + " more bytes");
                    }
                    r12.e(rVar.f41064c == 0);
                }
            }
            this.f36094c = 1;
            this.f36095d = 0;
        }
        int i16 = i10;
        while (rVar.a() > 0) {
            int i17 = this.f36094c;
            if (i17 != 0) {
                ?? r14 = this.f36093b;
                if (i17 != 1) {
                    if (i17 == i14) {
                        if (d(rVar, r14.f41055a, Math.min(10, this.f36100i)) && d(rVar, null, this.f36100i)) {
                            r14.m(r13);
                            this.f36102l = -9223372036854775807L;
                            if (this.f36097f) {
                                r14.o(4);
                                long jG = ((long) r14.g(3)) << 30;
                                r14.o(1);
                                long jG2 = ((long) (r14.g(15) << 15)) | jG;
                                r14.o(1);
                                long jG3 = jG2 | ((long) r14.g(15));
                                r14.o(1);
                                if (!this.f36099h && this.f36098g) {
                                    r14.o(4);
                                    long jG4 = ((long) r14.g(3)) << 30;
                                    r14.o(1);
                                    long jG5 = ((long) (r14.g(15) << 15)) | jG4;
                                    r14.o(1);
                                    long jG6 = jG5 | ((long) r14.g(15));
                                    r14.o(1);
                                    this.f36096e.b(jG6);
                                    this.f36099h = true;
                                }
                                this.f36102l = this.f36096e.b(jG3);
                            }
                            i16 |= this.f36101k ? 4 : 0;
                            r12.f(i16, this.f36102l);
                            this.f36094c = 3;
                            this.f36095d = 0;
                            i13 = -1;
                            i14 = 2;
                            r13 = 0;
                        }
                    } else {
                        if (i17 != 3) {
                            throw new IllegalStateException();
                        }
                        int iA = rVar.a();
                        int i18 = this.j;
                        if (i18 == i13) {
                            r11 = r13;
                        } else {
                            i11 = iA - i18;
                        }
                        if (r11 > 0) {
                            r11 = i11;
                            iA -= r11;
                            rVar.F(rVar.f41063b + iA);
                        }
                        r11 = i11;
                        r12.a(rVar);
                        int i19 = this.j;
                        if (i19 != i13) {
                            int i20 = i19 - iA;
                            this.j = i20;
                            if (i20 == 0) {
                                r12.e(r13);
                                this.f36094c = 1;
                                this.f36095d = r13;
                            }
                        }
                    }
                    r10 = r13;
                } else if (d(rVar, r14.f41055a, 9)) {
                    q qVar = this.f36093b;
                    boolean z10 = false;
                    qVar.m(0);
                    int iG = qVar.g(24);
                    if (iG != 1) {
                        com.google.gson.internal.b.e(iG, "Unexpected start code prefix: ");
                        this.j = -1;
                    } else {
                        qVar.o(8);
                        int iG2 = qVar.g(16);
                        qVar.o(5);
                        this.f36101k = qVar.f();
                        qVar.o(2);
                        this.f36097f = qVar.f();
                        this.f36098g = qVar.f();
                        qVar.o(6);
                        int iG3 = qVar.g(8);
                        this.f36100i = iG3;
                        if (iG2 == 0) {
                            this.j = -1;
                        } else {
                            int i21 = (iG2 - 3) - iG3;
                            this.j = i21;
                            if (i21 < 0) {
                                k.f("Found negative packet payload size: " + this.j);
                                this.j = -1;
                            }
                        }
                        z10 = true;
                    }
                    this.f36094c = z10 ? 2 : 0;
                    r10 = 0;
                    this.f36095d = 0;
                } else {
                    r10 = 0;
                }
            } else {
                r10 = r13;
                rVar.H(rVar.a());
            }
            r13 = r10;
            i13 = -1;
            i14 = 2;
        }
    }

    @Override // p091h2.F
    public final void b(w wVar, A1.r rVar, F.c cVar) {
        this.f36096e = wVar;
        this.f36092a.d(rVar, cVar);
    }

    @Override // p091h2.F
    public final void c() {
        this.f36094c = 0;
        this.f36095d = 0;
        this.f36099h = false;
        this.f36092a.c();
    }

    public final boolean d(r rVar, byte[] bArr, int i10) {
        int iMin = Math.min(rVar.a(), i10 - this.f36095d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            rVar.H(iMin);
        } else {
            rVar.f(bArr, this.f36095d, iMin);
        }
        int i11 = this.f36095d + iMin;
        this.f36095d = i11;
        return i11 == i10;
    }
}
