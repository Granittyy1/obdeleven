package androidx.media3.exoplayer.source;

import p078g1.p;
import p078g1.x;
import p114j1.A;

/* JADX INFO: compiled from: WrappingMediaSource.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class o extends c<Void> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final h f18803k;

    public o(h hVar) {
        this.f18803k = hVar;
    }

    public abstract void A(x xVar);

    public final void B() {
        y(null, this.f18803k);
    }

    public void C() {
        B();
    }

    @Override // androidx.media3.exoplayer.source.h
    public final p h() {
        return this.f18803k.h();
    }

    @Override // androidx.media3.exoplayer.source.h
    public final boolean j() {
        return this.f18803k.j();
    }

    @Override // androidx.media3.exoplayer.source.h
    public final x k() {
        return this.f18803k.k();
    }

    @Override // androidx.media3.exoplayer.source.h
    public void l(p pVar) {
        this.f18803k.l(pVar);
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void r(p140l1.l lVar) {
        this.j = lVar;
        this.f18655i = A.k(null);
        C();
    }

    @Override // androidx.media3.exoplayer.source.c
    public final h.b u(Void r10, h.b bVar) {
        return z(bVar);
    }

    @Override // androidx.media3.exoplayer.source.c
    public final long v(Object obj, long j) {
        return j;
    }

    @Override // androidx.media3.exoplayer.source.c
    public final int w(int i10, Object obj) {
        return i10;
    }

    @Override // androidx.media3.exoplayer.source.c
    public final void x(Object obj, a aVar, x xVar) {
        A(xVar);
    }

    public h.b z(h.b bVar) {
        return bVar;
    }
}
