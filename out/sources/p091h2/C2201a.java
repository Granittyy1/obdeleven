package p091h2;

import A1.C0567b;
import A1.C0574i;
import A1.E;
import A1.F;
import A1.p;
import A1.q;
import androidx.media3.exoplayer.source.k;
import java.io.IOException;
import p114j1.r;

/* JADX INFO: renamed from: h2.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Ac3Extractor.java */
/* JADX INFO: loaded from: classes.dex */
public final class C2201a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2202b f35813a = new C2202b("audio/ac3");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f35814b = new r(2786);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f35815c;

    @Override // A1.p
    public final void f(long j, long j10) {
        this.f35815c = false;
        this.f35813a.c();
    }

    @Override // A1.p
    public final int h(q qVar, E e10) throws IOException {
        r rVar = this.f35814b;
        int i10 = ((C0574i) qVar).read(rVar.f41062a, 0, 2786);
        if (i10 == -1) {
            return -1;
        }
        rVar.G(0);
        rVar.F(i10);
        boolean z10 = this.f35815c;
        C2202b c2202b = this.f35813a;
        if (!z10) {
            c2202b.f35828n = 0L;
            this.f35815c = true;
        }
        c2202b.a(rVar);
        return 0;
    }

    @Override // A1.p
    public final boolean l(q qVar) throws IOException {
        C0574i c0574i;
        int iA;
        r rVar = new r(10);
        int i10 = 0;
        while (true) {
            c0574i = (C0574i) qVar;
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
        int i11 = 0;
        int i12 = i10;
        while (true) {
            c0574i.c(rVar.f41062a, 0, 6, false);
            rVar.G(0);
            if (rVar.A() != 2935) {
                c0574i.f525f = 0;
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                c0574i.k(i12, false);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                byte[] bArr = rVar.f41062a;
                if (bArr.length < 6) {
                    iA = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    iA = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b10 = bArr[4];
                    iA = C0567b.a((b10 & 192) >> 6, b10 & 63);
                }
                if (iA == -1) {
                    return false;
                }
                c0574i.k(iA - 6, false);
            }
        }
    }

    @Override // A1.p
    public final void m(A1.r rVar) {
        this.f35813a.d(rVar, new F.c(0, 1));
        k kVar = (k) rVar;
        kVar.j();
        kVar.g(new F.b(-9223372036854775807L));
    }

    @Override // A1.p
    public final void a() {
    }
}
