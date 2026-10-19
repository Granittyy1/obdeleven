package p091h2;

import p114j1.r;
import p114j1.w;

/* JADX INFO: compiled from: SectionReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class A implements F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f35755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f35756b = new r(32);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f35757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f35758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f35759e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f35760f;

    public A(z zVar) {
        this.f35755a = zVar;
    }

    @Override // p091h2.F
    public final void a(int i10, r rVar) {
        int iU;
        boolean z10 = (i10 & 1) != 0;
        if (z10) {
            iU = rVar.f41063b + rVar.u();
        } else {
            iU = -1;
        }
        if (this.f35760f) {
            if (!z10) {
                return;
            }
            this.f35760f = false;
            rVar.G(iU);
            this.f35758d = 0;
        }
        while (rVar.a() > 0) {
            int i11 = this.f35758d;
            r rVar2 = this.f35756b;
            if (i11 < 3) {
                if (i11 == 0) {
                    int iU2 = rVar.u();
                    rVar.G(rVar.f41063b - 1);
                    if (iU2 == 255) {
                        this.f35760f = true;
                        return;
                    }
                }
                int iMin = Math.min(rVar.a(), 3 - this.f35758d);
                rVar.f(rVar2.f41062a, this.f35758d, iMin);
                int i12 = this.f35758d + iMin;
                this.f35758d = i12;
                if (i12 == 3) {
                    rVar2.G(0);
                    rVar2.F(3);
                    rVar2.H(1);
                    int iU3 = rVar2.u();
                    int iU4 = rVar2.u();
                    this.f35759e = (iU3 & 128) != 0;
                    int i13 = (((iU3 & 15) << 8) | iU4) + 3;
                    this.f35757c = i13;
                    byte[] bArr = rVar2.f41062a;
                    if (bArr.length < i13) {
                        rVar2.b(Math.min(4098, Math.max(i13, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(rVar.a(), this.f35757c - this.f35758d);
                rVar.f(rVar2.f41062a, this.f35758d, iMin2);
                int i14 = this.f35758d + iMin2;
                this.f35758d = i14;
                int i15 = this.f35757c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (!this.f35759e) {
                        rVar2.F(i15);
                    } else {
                        if (p114j1.A.j(0, i15, -1, rVar2.f41062a) != 0) {
                            this.f35760f = true;
                            return;
                        }
                        rVar2.F(this.f35757c - 4);
                    }
                    rVar2.G(0);
                    this.f35755a.a(rVar2);
                    this.f35758d = 0;
                }
            }
        }
    }

    @Override // p091h2.F
    public final void b(w wVar, A1.r rVar, F.c cVar) {
        this.f35755a.b(wVar, rVar, cVar);
        this.f35760f = true;
    }

    @Override // p091h2.F
    public final void c() {
        this.f35760f = true;
    }
}
