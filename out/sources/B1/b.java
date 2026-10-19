package B1;

import A1.C;
import A1.C0573h;
import A1.C0574i;
import A1.C0576k;
import A1.C0578m;
import A1.E;
import A1.F;
import A1.K;
import A1.p;
import A1.q;
import A1.r;
import T4.o0;
import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.source.k;
import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import p078g1.n;
import p078g1.t;
import p114j1.A;

/* JADX INFO: compiled from: AmrExtractor.java */
/* JADX INFO: loaded from: classes.dex */
public final class b implements p {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int[] f1437s = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int[] f1438t = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final byte[] f1439u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final byte[] f1440v;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0578m f1443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f1445e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1446f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1447g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f1448h;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f1450k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public k f1451l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public K f1452m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public K f1453n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public F f1454o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f1455p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f1456q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f1457r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1442b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f1441a = new byte[1];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1449i = -1;

    static {
        int i10 = A.f40996a;
        Charset charset = StandardCharsets.UTF_8;
        f1439u = "#!AMR\n".getBytes(charset);
        f1440v = "#!AMR-WB\n".getBytes(charset);
    }

    public b() {
        C0578m c0578m = new C0578m();
        this.f1443c = c0578m;
        this.f1453n = c0578m;
    }

    public final int c(C0574i c0574i) throws IOException {
        boolean z10;
        c0574i.f525f = 0;
        byte[] bArr = this.f1441a;
        c0574i.c(bArr, 0, 1, false);
        byte b10 = bArr[0];
        if ((b10 & 131) > 0) {
            throw ParserException.a(null, "Invalid padding bits for frame header " + ((int) b10));
        }
        int i10 = (b10 >> 3) & 15;
        if (i10 >= 0 && i10 <= 15 && (((z10 = this.f1444d) && (i10 < 10 || i10 > 13)) || (!z10 && (i10 < 12 || i10 > 14)))) {
            return z10 ? f1438t[i10] : f1437s[i10];
        }
        StringBuilder sb2 = new StringBuilder("Illegal AMR ");
        sb2.append(this.f1444d ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i10);
        throw ParserException.a(null, sb2.toString());
    }

    public final boolean d(C0574i c0574i) throws IOException {
        c0574i.f525f = 0;
        byte[] bArr = f1439u;
        byte[] bArr2 = new byte[bArr.length];
        c0574i.c(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.f1444d = false;
            c0574i.i(bArr.length);
            return true;
        }
        c0574i.f525f = 0;
        byte[] bArr3 = f1440v;
        byte[] bArr4 = new byte[bArr3.length];
        c0574i.c(bArr4, 0, bArr3.length, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f1444d = true;
        c0574i.i(bArr3.length);
        return true;
    }

    @Override // A1.p
    public final void f(long j, long j10) {
        this.f1445e = 0L;
        this.f1446f = 0;
        this.f1447g = 0;
        this.f1456q = j10;
        F f10 = this.f1454o;
        if (!(f10 instanceof C)) {
            if (j == 0 || !(f10 instanceof C0573h)) {
                this.f1450k = 0L;
                return;
            } else {
                C0573h c0573h = (C0573h) f10;
                this.f1450k = (Math.max(0L, j - c0573h.f514b) * 8000000) / ((long) c0573h.f517e);
                return;
            }
        }
        C c10 = (C) f10;
        o0 o0Var = c10.f398b;
        long jC = o0Var.f5989a == 0 ? -9223372036854775807L : o0Var.c(A.b(c10.f397a, j));
        this.f1450k = jC;
        if (Math.abs(this.f1456q - jC) < 20000) {
            return;
        }
        this.f1455p = true;
        this.f1453n = this.f1443c;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f2  */
    @Override // A1.p
    public final int h(q qVar, E e10) throws IOException {
        int i10;
        int i11;
        int iF;
        int i12;
        p241t7.b.l(this.f1452m);
        int i13 = A.f40996a;
        if (((C0574i) qVar).f523d == 0 && !d((C0574i) qVar)) {
            throw ParserException.a(null, "Could not find AMR header.");
        }
        if (!this.f1457r) {
            this.f1457r = true;
            boolean z10 = this.f1444d;
            String str = z10 ? "audio/amr-wb" : "audio/amr";
            String str2 = z10 ? "audio/amr-wb" : "audio/3gpp";
            int i14 = z10 ? 16000 : 8000;
            int i15 = z10 ? f1438t[8] : f1437s[7];
            K k10 = this.f1452m;
            n.a aVar = new n.a();
            aVar.f35337l = t.m(str);
            aVar.f35338m = t.m(str2);
            aVar.f35339n = i15;
            aVar.f35317C = 1;
            aVar.f35318D = i14;
            C0576k.b(aVar, k10);
        }
        if (this.f1447g == 0) {
            try {
                int iC = c((C0574i) qVar);
                this.f1446f = iC;
                this.f1447g = iC;
                if (this.f1449i == -1) {
                    this.f1448h = ((C0574i) qVar).f523d;
                    this.f1449i = iC;
                }
                if (this.f1449i == iC) {
                    this.j++;
                }
                F f10 = this.f1454o;
                if (f10 instanceof C) {
                    C c10 = (C) f10;
                    long j = this.f1450k + this.f1445e + 20000;
                    long j10 = ((C0574i) qVar).f523d + ((long) iC);
                    o0 o0Var = c10.f398b;
                    int i16 = o0Var.f5989a;
                    if (i16 == 0 || j - o0Var.c(i16 - 1) >= 100000) {
                        c10.a(j, j10);
                    }
                    if (this.f1455p && Math.abs(this.f1456q - j) < 20000) {
                        this.f1455p = false;
                        this.f1453n = this.f1452m;
                    }
                }
                iF = this.f1453n.f(qVar, this.f1447g, true);
                if (iF == -1) {
                    i10 = -1;
                } else {
                    i12 = this.f1447g - iF;
                    this.f1447g = i12;
                    if (i12 <= 0) {
                        this.f1453n.b(this.f1450k + this.f1445e, 1, this.f1446f, 0, null);
                        this.f1445e += 20000;
                    }
                    i10 = 0;
                }
            } catch (EOFException unused) {
            }
        } else {
            iF = this.f1453n.f(qVar, this.f1447g, true);
            if (iF == -1) {
                i10 = -1;
            } else {
                i12 = this.f1447g - iF;
                this.f1447g = i12;
                if (i12 <= 0) {
                    this.f1453n.b(this.f1450k + this.f1445e, 1, this.f1446f, 0, null);
                    this.f1445e += 20000;
                }
                i10 = 0;
            }
        }
        C0574i c0574i = (C0574i) qVar;
        if (this.f1454o == null) {
            int i17 = this.f1442b;
            if ((i17 & 4) != 0) {
                this.f1454o = new C(-9223372036854775807L, new long[]{this.f1448h}, new long[]{0});
            } else if ((i17 & 1) == 0 || !((i11 = this.f1449i) == -1 || i11 == this.f1446f)) {
                this.f1454o = new F.b(-9223372036854775807L);
            } else if (this.j >= 20 || i10 == -1) {
                this.f1454o = new C0573h(c0574i.f522c, this.f1448h, (int) ((((long) i11) * 8000000) / 20000), i11, (i17 & 2) != 0);
                this.f1452m.getClass();
            }
            F f11 = this.f1454o;
            if (f11 != null) {
                this.f1451l.g(f11);
            }
        }
        if (i10 == -1) {
            F f12 = this.f1454o;
            if (f12 instanceof C) {
                ((C) f12).f399c = this.f1450k + this.f1445e;
                this.f1451l.g(f12);
                this.f1452m.getClass();
            }
        }
        return i10;
    }

    @Override // A1.p
    public final boolean l(q qVar) throws IOException {
        return d((C0574i) qVar);
    }

    @Override // A1.p
    public final void m(r rVar) {
        k kVar = (k) rVar;
        this.f1451l = kVar;
        K kP = kVar.p(0, 1);
        this.f1452m = kP;
        this.f1453n = kP;
        kVar.j();
    }

    @Override // A1.p
    public final void a() {
    }
}
