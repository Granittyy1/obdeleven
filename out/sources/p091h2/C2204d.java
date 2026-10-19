package p091h2;

import A1.C0568c;
import A1.K;
import p078g1.n;
import p078g1.t;
import p114j1.q;
import p114j1.r;
import p241t7.b;

/* JADX INFO: renamed from: h2.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Ac4Reader.java */
/* JADX INFO: loaded from: classes.dex */
public final class C2204d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f35832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f35833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f35834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f35835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f35836e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f35837f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public K f35838g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f35839h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f35840i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f35841k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public n f35842l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f35843m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f35844n;

    public C2204d(String str, int i10, String str2) {
        q qVar = new q(16, new byte[16]);
        this.f35832a = qVar;
        this.f35833b = new r(qVar.f41055a);
        this.f35839h = 0;
        this.f35840i = 0;
        this.j = false;
        this.f35844n = -9223372036854775807L;
        this.f35834c = str;
        this.f35835d = i10;
        this.f35836e = str2;
    }

    @Override // p091h2.j
    public final void a(r rVar) {
        b.l(this.f35838g);
        while (rVar.a() > 0) {
            int i10 = this.f35839h;
            r rVar2 = this.f35833b;
            if (i10 == 0) {
                while (rVar.a() > 0) {
                    if (this.j) {
                        int iU = rVar.u();
                        this.j = iU == 172;
                        if (iU == 64 || iU == 65) {
                            boolean z10 = iU == 65;
                            this.f35839h = 1;
                            byte[] bArr = rVar2.f41062a;
                            bArr[0] = -84;
                            bArr[1] = (byte) (z10 ? 65 : 64);
                            this.f35840i = 2;
                            break;
                        }
                    } else {
                        this.j = rVar.u() == 172;
                    }
                }
            } else if (i10 == 1) {
                byte[] bArr2 = rVar2.f41062a;
                int iMin = Math.min(rVar.a(), 16 - this.f35840i);
                rVar.f(bArr2, this.f35840i, iMin);
                int i11 = this.f35840i + iMin;
                this.f35840i = i11;
                if (i11 == 16) {
                    q qVar = this.f35832a;
                    qVar.m(0);
                    C0568c.b bVarB = C0568c.b(qVar);
                    n nVar = this.f35842l;
                    int i12 = bVarB.f471a;
                    if (nVar == null || 2 != nVar.f35279D || i12 != nVar.f35280E || !"audio/ac4".equals(nVar.f35302n)) {
                        n.a aVar = new n.a();
                        aVar.f35327a = this.f35837f;
                        aVar.f35337l = t.m(this.f35836e);
                        aVar.f35338m = t.m("audio/ac4");
                        aVar.f35317C = 2;
                        aVar.f35318D = i12;
                        aVar.f35330d = this.f35834c;
                        aVar.f35332f = this.f35835d;
                        n nVar2 = new n(aVar);
                        this.f35842l = nVar2;
                        this.f35838g.d(nVar2);
                    }
                    this.f35843m = bVarB.f472b;
                    this.f35841k = (((long) bVarB.f473c) * 1000000) / ((long) this.f35842l.f35280E);
                    rVar2.G(0);
                    this.f35838g.a(16, rVar2);
                    this.f35839h = 2;
                }
            } else if (i10 == 2) {
                int iMin2 = Math.min(rVar.a(), this.f35843m - this.f35840i);
                this.f35838g.a(iMin2, rVar);
                int i13 = this.f35840i + iMin2;
                this.f35840i = i13;
                if (i13 == this.f35843m) {
                    b.k(this.f35844n != -9223372036854775807L);
                    this.f35838g.b(this.f35844n, 1, this.f35843m, 0, null);
                    this.f35844n += this.f35841k;
                    this.f35839h = 0;
                }
            }
        }
    }

    @Override // p091h2.j
    public final void c() {
        this.f35839h = 0;
        this.f35840i = 0;
        this.j = false;
        this.f35844n = -9223372036854775807L;
    }

    @Override // p091h2.j
    public final void d(A1.r rVar, F.c cVar) {
        cVar.a();
        cVar.b();
        this.f35837f = cVar.f35810e;
        cVar.b();
        this.f35838g = rVar.p(cVar.f35809d, 1);
    }

    @Override // p091h2.j
    public final void f(int i10, long j) {
        this.f35844n = j;
    }

    @Override // p091h2.j
    public final void e(boolean z10) {
    }
}
