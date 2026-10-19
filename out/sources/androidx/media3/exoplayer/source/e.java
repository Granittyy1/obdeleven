package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.T;
import androidx.media3.exoplayer.r0;
import java.io.IOException;
import p114j1.A;
import p235t1.r;
import p235t1.w;
import p259v1.t;

/* JADX INFO: compiled from: MaskingMediaPeriod.java */
/* JADX INFO: loaded from: classes.dex */
public final class e implements g, g.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h.b f18678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p272w1.d f18680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h f18681e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g f18682f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g.a f18683g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f18684h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f18685i = -9223372036854775807L;

    public e(h.b bVar, p272w1.d dVar, long j) {
        this.f18678b = bVar;
        this.f18680d = dVar;
        this.f18679c = j;
    }

    @Override // androidx.media3.exoplayer.source.m
    public final boolean a(T t8) {
        g gVar = this.f18682f;
        return gVar != null && gVar.a(t8);
    }

    @Override // androidx.media3.exoplayer.source.g.a
    public final void b(g gVar) {
        g.a aVar = this.f18683g;
        int i10 = A.f40996a;
        aVar.b(this);
    }

    @Override // androidx.media3.exoplayer.source.m
    public final long c() {
        g gVar = this.f18682f;
        int i10 = A.f40996a;
        return gVar.c();
    }

    @Override // androidx.media3.exoplayer.source.g
    public final void d() throws IOException {
        try {
            g gVar = this.f18682f;
            if (gVar != null) {
                gVar.d();
                return;
            }
            h hVar = this.f18681e;
            if (hVar != null) {
                hVar.i();
            }
        } catch (IOException e10) {
            throw e10;
        }
    }

    @Override // androidx.media3.exoplayer.source.g
    public final long e(long j, r0 r0Var) {
        g gVar = this.f18682f;
        int i10 = A.f40996a;
        return gVar.e(j, r0Var);
    }

    @Override // androidx.media3.exoplayer.source.g
    public final long f(long j) {
        g gVar = this.f18682f;
        int i10 = A.f40996a;
        return gVar.f(j);
    }

    @Override // androidx.media3.exoplayer.source.m.a
    public final void g(m mVar) {
        g.a aVar = this.f18683g;
        int i10 = A.f40996a;
        aVar.g(this);
    }

    public final void h(h.b bVar) {
        long j = this.f18685i;
        if (j == -9223372036854775807L) {
            j = this.f18679c;
        }
        h hVar = this.f18681e;
        hVar.getClass();
        g gVarG = hVar.g(bVar, this.f18680d, j);
        this.f18682f = gVarG;
        if (this.f18683g != null) {
            gVarG.m(this, j);
        }
    }

    @Override // androidx.media3.exoplayer.source.m
    public final boolean i() {
        g gVar = this.f18682f;
        return gVar != null && gVar.i();
    }

    @Override // androidx.media3.exoplayer.source.g
    public final long k() {
        g gVar = this.f18682f;
        int i10 = A.f40996a;
        return gVar.k();
    }

    @Override // androidx.media3.exoplayer.source.g
    public final long l(t[] tVarArr, boolean[] zArr, r[] rVarArr, boolean[] zArr2, long j) {
        long j10 = this.f18685i;
        long j11 = (j10 == -9223372036854775807L || j != this.f18679c) ? j : j10;
        this.f18685i = -9223372036854775807L;
        g gVar = this.f18682f;
        int i10 = A.f40996a;
        return gVar.l(tVarArr, zArr, rVarArr, zArr2, j11);
    }

    @Override // androidx.media3.exoplayer.source.g
    public final void m(g.a aVar, long j) {
        this.f18683g = aVar;
        g gVar = this.f18682f;
        if (gVar != null) {
            long j10 = this.f18685i;
            if (j10 == -9223372036854775807L) {
                j10 = this.f18679c;
            }
            gVar.m(this, j10);
        }
    }

    @Override // androidx.media3.exoplayer.source.g
    public final w n() {
        g gVar = this.f18682f;
        int i10 = A.f40996a;
        return gVar.n();
    }

    @Override // androidx.media3.exoplayer.source.m
    public final long q() {
        g gVar = this.f18682f;
        int i10 = A.f40996a;
        return gVar.q();
    }

    @Override // androidx.media3.exoplayer.source.g
    public final void r(long j, boolean z10) {
        g gVar = this.f18682f;
        int i10 = A.f40996a;
        gVar.r(j, z10);
    }

    @Override // androidx.media3.exoplayer.source.m
    public final void s(long j) {
        g gVar = this.f18682f;
        int i10 = A.f40996a;
        gVar.s(j);
    }
}
