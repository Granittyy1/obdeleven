package p091h2;

import A1.D;
import A1.K;
import p078g1.n;
import p078g1.t;
import p114j1.r;
import p241t7.b;

/* JADX INFO: compiled from: MpegAudioReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class q implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f36048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D.a f36049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f36050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f36051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f36052e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public K f36053f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f36054g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f36055h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f36056i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f36057k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f36058l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f36059m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f36060n;

    public q(String str, int i10, String str2) {
        r rVar = new r(4);
        this.f36048a = rVar;
        rVar.f41062a[0] = -1;
        this.f36049b = new D.a();
        this.f36060n = -9223372036854775807L;
        this.f36050c = str;
        this.f36051d = i10;
        this.f36052e = str2;
    }

    @Override // p091h2.j
    public final void a(r rVar) {
        b.l(this.f36053f);
        while (rVar.a() > 0) {
            int i10 = this.f36055h;
            r rVar2 = this.f36048a;
            if (i10 == 0) {
                byte[] bArr = rVar.f41062a;
                int i11 = rVar.f41063b;
                int i12 = rVar.f41064c;
                while (true) {
                    if (i11 >= i12) {
                        rVar.G(i12);
                        break;
                    }
                    byte b10 = bArr[i11];
                    boolean z10 = (b10 & 255) == 255;
                    boolean z11 = this.f36057k && (b10 & 224) == 224;
                    this.f36057k = z10;
                    if (z11) {
                        rVar.G(i11 + 1);
                        this.f36057k = false;
                        rVar2.f41062a[1] = bArr[i11];
                        this.f36056i = 2;
                        this.f36055h = 1;
                        break;
                    }
                    i11++;
                }
            } else if (i10 == 1) {
                int iMin = Math.min(rVar.a(), 4 - this.f36056i);
                rVar.f(rVar2.f41062a, this.f36056i, iMin);
                int i13 = this.f36056i + iMin;
                this.f36056i = i13;
                if (i13 >= 4) {
                    rVar2.G(0);
                    int iH = rVar2.h();
                    D.a aVar = this.f36049b;
                    if (aVar.a(iH)) {
                        this.f36059m = aVar.f409c;
                        if (!this.j) {
                            this.f36058l = (((long) aVar.f413g) * 1000000) / ((long) aVar.f410d);
                            n.a aVar2 = new n.a();
                            aVar2.f35327a = this.f36054g;
                            aVar2.f35337l = t.m(this.f36052e);
                            aVar2.f35338m = t.m(aVar.f408b);
                            aVar2.f35339n = 4096;
                            aVar2.f35317C = aVar.f411e;
                            aVar2.f35318D = aVar.f410d;
                            aVar2.f35330d = this.f36050c;
                            aVar2.f35332f = this.f36051d;
                            this.f36053f.d(new n(aVar2));
                            this.j = true;
                        }
                        rVar2.G(0);
                        this.f36053f.a(4, rVar2);
                        this.f36055h = 2;
                    } else {
                        this.f36056i = 0;
                        this.f36055h = 1;
                    }
                }
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                int iMin2 = Math.min(rVar.a(), this.f36059m - this.f36056i);
                this.f36053f.a(iMin2, rVar);
                int i14 = this.f36056i + iMin2;
                this.f36056i = i14;
                if (i14 >= this.f36059m) {
                    b.k(this.f36060n != -9223372036854775807L);
                    this.f36053f.b(this.f36060n, 1, this.f36059m, 0, null);
                    this.f36060n += this.f36058l;
                    this.f36056i = 0;
                    this.f36055h = 0;
                }
            }
        }
    }

    @Override // p091h2.j
    public final void c() {
        this.f36055h = 0;
        this.f36056i = 0;
        this.f36057k = false;
        this.f36060n = -9223372036854775807L;
    }

    @Override // p091h2.j
    public final void d(A1.r rVar, F.c cVar) {
        cVar.a();
        cVar.b();
        this.f36054g = cVar.f35810e;
        cVar.b();
        this.f36053f = rVar.p(cVar.f35809d, 1);
    }

    @Override // p091h2.j
    public final void f(int i10, long j) {
        this.f36060n = j;
    }

    @Override // p091h2.j
    public final void e(boolean z10) {
    }
}
