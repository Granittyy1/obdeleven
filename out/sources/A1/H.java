package A1;

import java.io.IOException;

/* JADX INFO: compiled from: SingleSampleExtractor.java */
/* JADX INFO: loaded from: classes.dex */
public final class H implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f425d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f426e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public androidx.media3.exoplayer.source.k f427f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public K f428g;

    public H(String str, int i10, int i11) {
        this.f422a = i10;
        this.f423b = i11;
        this.f424c = str;
    }

    @Override // A1.p
    public final void f(long j, long j10) {
        if (j == 0 || this.f426e == 1) {
            this.f426e = 1;
            this.f425d = 0;
        }
    }

    @Override // A1.p
    public final int h(q qVar, E e10) throws IOException {
        int i10 = this.f426e;
        if (i10 != 1) {
            if (i10 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        K k10 = this.f428g;
        k10.getClass();
        int iF = k10.f(qVar, 1024, true);
        if (iF == -1) {
            this.f426e = 2;
            this.f428g.b(0L, 1, this.f425d, 0, null);
            this.f425d = 0;
        } else {
            this.f425d += iF;
        }
        return 0;
    }

    @Override // A1.p
    public final boolean l(q qVar) throws IOException {
        int i10 = this.f423b;
        int i11 = this.f422a;
        p241t7.b.k((i11 == -1 || i10 == -1) ? false : true);
        p114j1.r rVar = new p114j1.r(i10);
        ((C0574i) qVar).c(rVar.f41062a, 0, i10, false);
        return rVar.A() == i11;
    }

    @Override // A1.p
    public final void m(r rVar) {
        androidx.media3.exoplayer.source.k kVar = (androidx.media3.exoplayer.source.k) rVar;
        this.f427f = kVar;
        K kP = kVar.p(1024, 4);
        this.f428g = kP;
        g1.n.a aVar = new g1.n.a();
        String str = this.f424c;
        aVar.f35337l = p078g1.t.m(str);
        aVar.f35338m = p078g1.t.m(str);
        C0576k.b(aVar, kP);
        this.f427f.j();
        this.f427f.g(new I());
        this.f426e = 1;
    }

    @Override // A1.p
    public final void a() {
    }
}
