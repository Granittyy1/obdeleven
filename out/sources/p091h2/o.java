package p091h2;

import A1.C0576k;
import A1.K;
import p078g1.n;
import p078g1.t;
import p114j1.k;
import p114j1.r;
import p241t7.b;

/* JADX INFO: compiled from: Id3Reader.java */
/* JADX INFO: loaded from: classes.dex */
public final class o implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public K f36022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f36023c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f36025e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f36026f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f36021a = new r(10);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f36024d = -9223372036854775807L;

    @Override // p091h2.j
    public final void a(r rVar) {
        b.l(this.f36022b);
        if (this.f36023c) {
            int iA = rVar.a();
            int i10 = this.f36026f;
            if (i10 < 10) {
                int iMin = Math.min(iA, 10 - i10);
                byte[] bArr = rVar.f41062a;
                int i11 = rVar.f41063b;
                r rVar2 = this.f36021a;
                System.arraycopy(bArr, i11, rVar2.f41062a, this.f36026f, iMin);
                if (this.f36026f + iMin == 10) {
                    rVar2.G(0);
                    if (73 != rVar2.u() || 68 != rVar2.u() || 51 != rVar2.u()) {
                        k.f("Discarding invalid ID3 tag");
                        this.f36023c = false;
                        return;
                    } else {
                        rVar2.H(3);
                        this.f36025e = rVar2.t() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iA, this.f36025e - this.f36026f);
            this.f36022b.a(iMin2, rVar);
            this.f36026f += iMin2;
        }
    }

    @Override // p091h2.j
    public final void c() {
        this.f36023c = false;
        this.f36024d = -9223372036854775807L;
    }

    @Override // p091h2.j
    public final void d(A1.r rVar, F.c cVar) {
        cVar.a();
        cVar.b();
        K kP = rVar.p(cVar.f35809d, 5);
        this.f36022b = kP;
        n.a aVar = new n.a();
        cVar.b();
        aVar.f35327a = cVar.f35810e;
        aVar.f35337l = t.m("video/mp2t");
        aVar.f35338m = t.m("application/id3");
        C0576k.b(aVar, kP);
    }

    @Override // p091h2.j
    public final void e(boolean z10) {
        int i10;
        b.l(this.f36022b);
        if (this.f36023c && (i10 = this.f36025e) != 0 && this.f36026f == i10) {
            b.k(this.f36024d != -9223372036854775807L);
            this.f36022b.b(this.f36024d, 1, this.f36025e, 0, null);
            this.f36023c = false;
        }
    }

    @Override // p091h2.j
    public final void f(int i10, long j) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f36023c = true;
        this.f36024d = j;
        this.f36025e = 0;
        this.f36026f = 0;
    }
}
