package V1;

import A1.C0574i;
import A1.F;
import A1.G;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;
import p114j1.A;

/* JADX INFO: compiled from: DefaultOggSeeker.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f6664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f6667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6668e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f6669f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f6670g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f6671h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f6672i;
    public long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f6673k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f6674l;

    /* JADX INFO: renamed from: V1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DefaultOggSeeker.java */
    public final class C0094a implements F {
        public C0094a() {
        }

        @Override // A1.F
        public final boolean d() {
            return true;
        }

        @Override // A1.F
        public final F.a i(long j) {
            a aVar = a.this;
            BigInteger bigIntegerValueOf = BigInteger.valueOf((((long) aVar.f6667d.f6708i) * j) / 1000000);
            long j10 = aVar.f6666c;
            long j11 = aVar.f6665b;
            G g10 = new G(j, A.h((bigIntegerValueOf.multiply(BigInteger.valueOf(j10 - j11)).divide(BigInteger.valueOf(aVar.f6669f)).longValue() + j11) - 30000, aVar.f6665b, j10 - 1));
            return new F.a(g10, g10);
        }

        @Override // A1.F
        public final long k() {
            a aVar = a.this;
            return (aVar.f6669f * 1000000) / ((long) aVar.f6667d.f6708i);
        }
    }

    public a(h hVar, long j, long j10, long j11, long j12, boolean z10) {
        p241t7.b.e(j >= 0 && j10 > j);
        this.f6667d = hVar;
        this.f6665b = j;
        this.f6666c = j10;
        if (j11 == j10 - j || z10) {
            this.f6669f = j12;
            this.f6668e = 4;
        } else {
            this.f6668e = 0;
        }
        this.f6664a = new e();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0031  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // V1.f
    public final long a(C0574i c0574i) throws IOException {
        ?? r10;
        long jH;
        long j;
        int i10 = this.f6668e;
        long j10 = this.f6666c;
        e eVar = this.f6664a;
        if (i10 == 0) {
            long j11 = c0574i.f523d;
            this.f6670g = j11;
            this.f6668e = 1;
            long j12 = j10 - 65307;
            if (j12 > j11) {
                return j12;
            }
            r10 = 0;
        } else if (i10 != 1) {
            if (i10 == 2) {
                long j13 = this.f6672i;
                long j14 = this.j;
                if (j13 == j14) {
                    eVar = eVar;
                    j = -1;
                    jH = -1;
                } else {
                    long j15 = c0574i.f523d;
                    if (eVar.b(c0574i, j14)) {
                        eVar.a(c0574i, false);
                        c0574i.f525f = 0;
                        long j16 = this.f6671h;
                        long j17 = eVar.f6691b;
                        long j18 = j16 - j17;
                        int i11 = eVar.f6693d + eVar.f6694e;
                        if (0 > j18 || j18 >= 72000) {
                            if (j18 < 0) {
                                this.j = j15;
                                this.f6674l = j17;
                            } else {
                                this.f6672i = c0574i.f523d + ((long) i11);
                                this.f6673k = j17;
                            }
                            long j19 = this.j;
                            long j20 = this.f6672i;
                            if (j19 - j20 < 100000) {
                                this.j = j20;
                                jH = j20;
                            } else {
                                jH = A.h((((j19 - j20) * j18) / (this.f6674l - this.f6673k)) + (c0574i.f523d - (((long) i11) * (j18 <= 0 ? 2L : 1L))), j20, j19 - 1);
                            }
                            j = -1;
                        } else {
                            eVar = eVar;
                            j = -1;
                            jH = -1;
                        }
                    } else {
                        long j21 = this.f6672i;
                        if (j21 == j15) {
                            throw new IOException("No ogg page can be found.");
                        }
                        jH = j21;
                    }
                    j = -1;
                }
                if (jH != j) {
                    return jH;
                }
                this.f6668e = 3;
            } else {
                if (i10 != 3) {
                    if (i10 == 4) {
                        return -1L;
                    }
                    throw new IllegalStateException();
                }
                j = -1;
                eVar = eVar;
            }
            e eVar2 = eVar;
            while (true) {
                eVar2.b(c0574i, j);
                eVar2.a(c0574i, false);
                if (eVar2.f6691b > this.f6671h) {
                    c0574i.f525f = 0;
                    this.f6668e = 4;
                    return -(this.f6673k + 2);
                }
                c0574i.i(eVar2.f6693d + eVar2.f6694e);
                this.f6672i = c0574i.f523d;
                this.f6673k = eVar2.f6691b;
                j = -1;
            }
        } else {
            r10 = 0;
        }
        eVar.f6690a = r10;
        eVar.f6691b = 0L;
        eVar.f6692c = r10;
        eVar.f6693d = r10;
        eVar.f6694e = r10;
        if (!eVar.b(c0574i, -1L)) {
            throw new EOFException();
        }
        eVar.a(c0574i, r10);
        c0574i.i(eVar.f6693d + eVar.f6694e);
        long j22 = eVar.f6691b;
        while ((eVar.f6690a & 4) != 4 && eVar.b(c0574i, -1L) && c0574i.f523d < j10 && eVar.a(c0574i, true)) {
            try {
                c0574i.i(eVar.f6693d + eVar.f6694e);
                j22 = eVar.f6691b;
            } catch (EOFException unused) {
            }
        }
        this.f6669f = j22;
        this.f6668e = 4;
        return this.f6670g;
    }

    @Override // V1.f
    public final F b() {
        if (this.f6669f != 0) {
            return new C0094a();
        }
        return null;
    }

    @Override // V1.f
    public final void c(long j) {
        this.f6671h = A.h(j, 0L, this.f6669f - 1);
        this.f6668e = 2;
        this.f6672i = this.f6665b;
        this.j = this.f6666c;
        this.f6673k = 0L;
        this.f6674l = this.f6669f;
    }
}
