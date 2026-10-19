package p091h2;

import A1.C0573h;
import A1.C0574i;
import A1.E;
import A1.F;
import A1.p;
import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.source.k;
import java.io.EOFException;
import java.io.IOException;
import p114j1.q;
import p114j1.r;
import p241t7.b;

/* JADX INFO: renamed from: h2.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AdtsExtractor.java */
/* JADX INFO: loaded from: classes.dex */
public final class C2205e implements p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f35848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q f35849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public k f35850f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f35851g;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f35854k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f35855l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35845a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2206f f35846b = new C2206f(null, "audio/mp4a-latm", 0, true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f35847c = new r(2048);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f35853i = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f35852h = -1;

    public C2205e() {
        r rVar = new r(10);
        this.f35848d = rVar;
        byte[] bArr = rVar.f41062a;
        this.f35849e = new q(bArr.length, bArr);
    }

    public final int c(C0574i c0574i) throws IOException {
        int i10 = 0;
        while (true) {
            r rVar = this.f35848d;
            c0574i.c(rVar.f41062a, 0, 10, false);
            rVar.G(0);
            if (rVar.x() != 4801587) {
                break;
            }
            rVar.H(3);
            int iT = rVar.t();
            i10 += iT + 10;
            c0574i.k(iT, false);
        }
        c0574i.f525f = 0;
        c0574i.k(i10, false);
        if (this.f35852h == -1) {
            this.f35852h = i10;
        }
        return i10;
    }

    @Override // A1.p
    public final void f(long j, long j10) {
        this.f35854k = false;
        this.f35846b.c();
        this.f35851g = j10;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0111  */
    /* JADX WARN: Code duplicated, block: B:9:0x0021  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // A1.p
    public final int h(A1.q qVar, E e10) throws IOException {
        int i10;
        b.l(this.f35850f);
        long j = ((C0574i) qVar).f522c;
        int i11 = this.f35845a;
        int i12 = i11 & 2;
        int i13 = 0;
        boolean z10 = true;
        if (i12 == 0 && ((i11 & 1) == 0 || j == -1)) {
            i10 = -1;
        } else {
            q qVar2 = this.f35849e;
            r rVar = this.f35848d;
            if (this.j) {
                i10 = -1;
            } else {
                this.f35853i = -1;
                C0574i c0574i = (C0574i) qVar;
                c0574i.f525f = 0;
                long j10 = 0;
                if (c0574i.f523d == 0) {
                    c(c0574i);
                }
                int i14 = 0;
                while (true) {
                    try {
                        C0574i c0574i2 = (C0574i) qVar;
                        if (!c0574i2.c(rVar.f41062a, i13, 2, z10)) {
                            break;
                        }
                        rVar.G(i13);
                        if (((rVar.A() & 65526) == 65520 ? z10 : i13) == 0) {
                            i14 = i13;
                            break;
                        }
                        if (!c0574i2.c(rVar.f41062a, i13, 4, z10)) {
                            break;
                        }
                        qVar2.m(14);
                        int iG = qVar2.g(13);
                        if (iG <= 6) {
                            this.j = z10;
                            throw ParserException.a(null, "Malformed ADTS stream");
                        }
                        j10 += (long) iG;
                        i14++;
                        if (i14 == 1000 || !c0574i2.k(iG - 6, true)) {
                            break;
                            break;
                        }
                        z10 = true;
                        i13 = 0;
                    } catch (EOFException unused) {
                    }
                }
                c0574i.f525f = 0;
                if (i14 > 0) {
                    this.f35853i = (int) (j10 / ((long) i14));
                    i10 = -1;
                } else {
                    i10 = -1;
                    this.f35853i = -1;
                }
                this.j = true;
            }
        }
        r rVar2 = this.f35847c;
        int i15 = ((C0574i) qVar).read(rVar2.f41062a, 0, 2048);
        boolean z11 = i15 == i10;
        boolean z12 = this.f35855l;
        C2206f c2206f = this.f35846b;
        if (!z12) {
            boolean z13 = (i11 & 1) != 0 && this.f35853i > 0;
            if (!z13 || c2206f.f35874s != -9223372036854775807L || z11) {
                if (z13) {
                    long j11 = c2206f.f35874s;
                    if (j11 != -9223372036854775807L) {
                        k kVar = this.f35850f;
                        boolean z14 = i12 != 0;
                        int i16 = this.f35853i;
                        kVar.g(new C0573h(j, this.f35852h, (int) ((((long) i16) * 8000000) / j11), i16, z14));
                    } else {
                        this.f35850f.g(new F.b(-9223372036854775807L));
                    }
                } else {
                    this.f35850f.g(new F.b(-9223372036854775807L));
                }
                this.f35855l = true;
            }
        }
        if (z11) {
            return -1;
        }
        rVar2.G(0);
        rVar2.F(i15);
        if (!this.f35854k) {
            c2206f.f35876u = this.f35851g;
            this.f35854k = true;
        }
        c2206f.a(rVar2);
        return 0;
    }

    @Override // A1.p
    public final boolean l(A1.q qVar) throws IOException {
        C0574i c0574i = (C0574i) qVar;
        int iC = c(c0574i);
        int i10 = iC;
        int i11 = 0;
        int i12 = 0;
        do {
            r rVar = this.f35848d;
            c0574i.c(rVar.f41062a, 0, 2, false);
            rVar.G(0);
            if ((rVar.A() & 65526) == 65520) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                c0574i.c(rVar.f41062a, 0, 4, false);
                q qVar2 = this.f35849e;
                qVar2.m(14);
                int iG = qVar2.g(13);
                if (iG <= 6) {
                    i10++;
                    c0574i.f525f = 0;
                    c0574i.k(i10, false);
                } else {
                    c0574i.k(iG - 6, false);
                    i12 += iG;
                }
            } else {
                i10++;
                c0574i.f525f = 0;
                c0574i.k(i10, false);
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - iC < 8192);
        return false;
    }

    @Override // A1.p
    public final void m(A1.r rVar) {
        this.f35850f = (k) rVar;
        this.f35846b.d(rVar, new F.c(0, 1));
        ((k) rVar).j();
    }

    @Override // A1.p
    public final void a() {
    }
}
