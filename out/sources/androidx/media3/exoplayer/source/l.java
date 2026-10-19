package androidx.media3.exoplayer.source;

import A1.C0577l;
import A1.F;
import A1.t;
import android.os.Looper;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.upstream.Loader;
import p078g1.p;
import p078g1.x;
import p114j1.A;
import p235t1.q;

/* JADX INFO: compiled from: ProgressiveMediaSource.java */
/* JADX INFO: loaded from: classes.dex */
public final class l extends androidx.media3.exoplayer.source.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l1.f.a f18782h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Y1.d f18783i;
    public final androidx.media3.exoplayer.drm.b j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final androidx.media3.exoplayer.upstream.b f18784k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f18785l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p078g1.n f18786m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f18787n = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f18788o = -9223372036854775807L;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f18789p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f18790q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public p140l1.l f18791r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public p f18792s;

    /* JADX INFO: compiled from: ProgressiveMediaSource.java */
    public class a extends p235t1.h {
        @Override // p235t1.h, p078g1.x
        public final x.b f(int i10, x.b bVar, boolean z10) {
            super.f(i10, bVar, z10);
            bVar.f35473f = true;
            return bVar;
        }

        @Override // p235t1.h, p078g1.x
        public final x.c m(int i10, x.c cVar, long j) {
            super.m(i10, cVar, j);
            cVar.j = true;
            return cVar;
        }
    }

    /* JADX INFO: compiled from: ProgressiveMediaSource.java */
    public static final class b implements h.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l1.f.a f18793a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Y1.d f18794b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final p187p1.a f18795c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final androidx.media3.exoplayer.upstream.a f18796d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f18797e;

        public b(l1.f.a aVar, C0577l c0577l) {
            Y1.d dVar = new Y1.d(10, c0577l);
            p187p1.a aVar2 = new p187p1.a();
            androidx.media3.exoplayer.upstream.a aVar3 = new androidx.media3.exoplayer.upstream.a();
            this.f18793a = aVar;
            this.f18794b = dVar;
            this.f18795c = aVar2;
            this.f18796d = aVar3;
            this.f18797e = 1048576;
        }

        @Override // androidx.media3.exoplayer.source.h.a
        public final h d(p pVar) {
            pVar.f35356b.getClass();
            this.f18795c.getClass();
            pVar.f35356b.getClass();
            pVar.f35356b.getClass();
            androidx.media3.exoplayer.drm.b.a aVar = androidx.media3.exoplayer.drm.b.f18339a;
            androidx.media3.exoplayer.upstream.a aVar2 = this.f18796d;
            return new l(pVar, this.f18793a, this.f18794b, aVar, aVar2, this.f18797e, null);
        }
    }

    public l(p pVar, l1.f.a aVar, Y1.d dVar, androidx.media3.exoplayer.drm.b bVar, androidx.media3.exoplayer.upstream.b bVar2, int i10, p078g1.n nVar) {
        this.f18792s = pVar;
        this.f18782h = aVar;
        this.f18783i = dVar;
        this.j = bVar;
        this.f18784k = bVar2;
        this.f18785l = i10;
        this.f18786m = nVar;
    }

    @Override // androidx.media3.exoplayer.source.h
    public final g g(h.b bVar, p272w1.d dVar, long j) {
        l1.f.a aVar = this.f18782h;
        l1.g.a aVar2 = aVar.f44186b;
        p140l1.f fVar = new p140l1.f(aVar.f44185a, new p140l1.g(aVar2.f44198b, aVar2.f44199c, aVar2.f44197a));
        p140l1.l lVar = this.f18791r;
        if (lVar != null) {
            fVar.b(lVar);
        }
        p.f fVar2 = h().f35356b;
        fVar2.getClass();
        p241t7.b.l(this.f18643g);
        p235t1.a aVar3 = new p235t1.a((t) this.f18783i.f7563c);
        androidx.media3.exoplayer.drm.a.C0185a c0185a = new androidx.media3.exoplayer.drm.a.C0185a(this.f18640d.f18337c, 0, bVar);
        i.a aVar4 = new i.a(this.f18639c.f18705c, 0, bVar);
        long jF = A.F(fVar2.f35389f);
        return new k(fVar2.f35384a, fVar, aVar3, this.j, c0185a, this.f18784k, aVar4, this, dVar, this.f18785l, this.f18786m, jF, null);
    }

    @Override // androidx.media3.exoplayer.source.h
    public final synchronized p h() {
        return this.f18792s;
    }

    @Override // androidx.media3.exoplayer.source.h
    public final synchronized void l(p pVar) {
        this.f18792s = pVar;
    }

    @Override // androidx.media3.exoplayer.source.h
    public final void o(g gVar) {
        k kVar = (k) gVar;
        if (kVar.f18757x) {
            for (q qVar : kVar.f18754u) {
                qVar.h();
                DrmSession drmSession = qVar.f47063h;
                if (drmSession != null) {
                    androidx.media3.exoplayer.drm.a.C0185a c0185a = qVar.f47060e;
                    drmSession.getClass();
                    qVar.f47063h = null;
                    qVar.f47062g = null;
                }
            }
        }
        Loader loader = kVar.f18746m;
        Loader.c<? extends Loader.d> cVar = loader.f18811b;
        if (cVar != null) {
            cVar.a(true);
        }
        Loader.e eVar = new Loader.e(kVar);
        p284x1.a aVar = loader.f18810a;
        aVar.execute(eVar);
        aVar.f47882b.shutdown();
        kVar.f18751r.removeCallbacksAndMessages(null);
        kVar.f18752s = null;
        kVar.f18735P = true;
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void r(p140l1.l lVar) {
        this.f18791r = lVar;
        Looper.myLooper().getClass();
        p241t7.b.l(this.f18643g);
        androidx.media3.exoplayer.drm.b bVar = this.j;
        bVar.getClass();
        bVar.getClass();
        u();
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void t() {
        this.j.getClass();
    }

    public final void u() {
        x tVar = new p235t1.t(this.f18788o, this.f18789p, this.f18790q, h());
        if (this.f18787n) {
            tVar = new a(tVar);
        }
        s(tVar);
    }

    public final void v(long j, F f10, boolean z10) {
        if (j == -9223372036854775807L) {
            j = this.f18788o;
        }
        boolean zD = f10.d();
        if (!this.f18787n && this.f18788o == j && this.f18789p == zD && this.f18790q == z10) {
            return;
        }
        this.f18788o = j;
        this.f18789p = zD;
        this.f18790q = z10;
        this.f18787n = false;
        u();
    }

    @Override // androidx.media3.exoplayer.source.h
    public final void i() {
    }
}
