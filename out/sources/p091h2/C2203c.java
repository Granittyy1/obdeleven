package p091h2;

import A1.C0574i;
import A1.E;
import A1.F;
import A1.p;
import A1.q;
import androidx.media3.exoplayer.source.k;
import java.io.IOException;
import p114j1.r;

/* JADX INFO: renamed from: h2.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Ac4Extractor.java */
/* JADX INFO: loaded from: classes.dex */
public final class C2203c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2204d f35829a = new C2204d(null, 0, "audio/ac4");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f35830b = new r(16384);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f35831c;

    @Override // A1.p
    public final void f(long j, long j10) {
        this.f35831c = false;
        this.f35829a.c();
    }

    @Override // A1.p
    public final int h(q qVar, E e10) throws IOException {
        r rVar = this.f35830b;
        int i10 = ((C0574i) qVar).read(rVar.f41062a, 0, 16384);
        if (i10 == -1) {
            return -1;
        }
        rVar.G(0);
        rVar.F(i10);
        boolean z10 = this.f35831c;
        C2204d c2204d = this.f35829a;
        if (!z10) {
            c2204d.f35844n = 0L;
            this.f35831c = true;
        }
        c2204d.a(rVar);
        return 0;
    }

    @Override // A1.p
    public final boolean l(q qVar) throws IOException {
        C0574i c0574i;
        int i10;
        r rVar = new r(10);
        int i11 = 0;
        while (true) {
            c0574i = (C0574i) qVar;
            c0574i.c(rVar.f41062a, 0, 10, false);
            rVar.G(0);
            if (rVar.x() != 4801587) {
                break;
            }
            rVar.H(3);
            int iT = rVar.t();
            i11 += iT + 10;
            c0574i.k(iT, false);
        }
        c0574i.f525f = 0;
        c0574i.k(i11, false);
        int i12 = 0;
        int i13 = i11;
        while (true) {
            int i14 = 7;
            c0574i.c(rVar.f41062a, 0, 7, false);
            rVar.G(0);
            int iA = rVar.A();
            if (iA == 44096 || iA == 44097) {
                i12++;
                if (i12 >= 4) {
                    return true;
                }
                byte[] bArr = rVar.f41062a;
                if (bArr.length < 7) {
                    i10 = -1;
                } else {
                    int i15 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i15 == 65535) {
                        i15 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i14 = 4;
                    }
                    if (iA == 44097) {
                        i14 += 2;
                    }
                    i10 = i15 + i14;
                }
                if (i10 == -1) {
                    return false;
                }
                c0574i.k(i10 - 7, false);
            } else {
                c0574i.f525f = 0;
                i13++;
                if (i13 - i11 >= 8192) {
                    return false;
                }
                c0574i.k(i13, false);
                i12 = 0;
            }
        }
    }

    @Override // A1.p
    public final void m(A1.r rVar) {
        this.f35829a.d(rVar, new F.c(0, 1));
        k kVar = (k) rVar;
        kVar.j();
        kVar.g(new F.b(-9223372036854775807L));
    }

    @Override // A1.p
    public final void a() {
    }
}
