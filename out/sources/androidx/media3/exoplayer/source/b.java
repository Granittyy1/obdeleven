package androidx.media3.exoplayer.source;

import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.Q;
import androidx.media3.exoplayer.T;
import androidx.media3.exoplayer.r0;
import java.io.IOException;
import p114j1.A;
import p235t1.r;
import p235t1.w;
import p259v1.t;

/* JADX INFO: compiled from: ClippingMediaPeriod.java */
/* JADX INFO: loaded from: classes.dex */
public final class b implements g, g.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f18644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g.a f18645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a[] f18646d = new a[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f18647e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f18648f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f18649g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ClippingMediaSource.IllegalClippingException f18650h;

    /* JADX INFO: compiled from: ClippingMediaPeriod.java */
    public final class a implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r f18651a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f18652b;

        public a(r rVar) {
            this.f18651a = rVar;
        }

        @Override // p235t1.r
        public final void a() throws IOException {
            this.f18651a.a();
        }

        @Override // p235t1.r
        public final boolean b() {
            return !b.this.h() && this.f18651a.b();
        }

        @Override // p235t1.r
        public final int c(long j) {
            if (b.this.h()) {
                return -3;
            }
            return this.f18651a.c(j);
        }

        @Override // p235t1.r
        public final int d(Q q10, DecoderInputBuffer decoderInputBuffer, int i10) {
            b bVar = b.this;
            if (bVar.h()) {
                return -3;
            }
            if (this.f18652b) {
                decoderInputBuffer.f6597b = 4;
                return -4;
            }
            long jQ = bVar.q();
            int iD = this.f18651a.d(q10, decoderInputBuffer, i10);
            if (iD != -5) {
                long j = bVar.f18649g;
                if (j == Long.MIN_VALUE || ((iD != -4 || decoderInputBuffer.f17943g < j) && !(iD == -3 && jQ == Long.MIN_VALUE && !decoderInputBuffer.f17942f))) {
                    return iD;
                }
                decoderInputBuffer.k();
                decoderInputBuffer.f6597b = 4;
                this.f18652b = true;
                return -4;
            }
            p078g1.n nVar = (p078g1.n) q10.f18136b;
            nVar.getClass();
            int i11 = nVar.f35283H;
            int i12 = nVar.f35282G;
            if (i12 != 0 || i11 != 0) {
                if (bVar.f18648f != 0) {
                    i12 = 0;
                }
                if (bVar.f18649g != Long.MIN_VALUE) {
                    i11 = 0;
                }
                g1.n.a aVarA = nVar.a();
                aVarA.f35320F = i12;
                aVarA.f35321G = i11;
                q10.f18136b = new p078g1.n(aVarA);
            }
            return -5;
        }
    }

    public b(g gVar, boolean z10, long j, long j10) {
        this.f18644b = gVar;
        this.f18647e = z10 ? j : -9223372036854775807L;
        this.f18648f = j;
        this.f18649g = j10;
    }

    @Override // androidx.media3.exoplayer.source.m
    public final boolean a(T t8) {
        return this.f18644b.a(t8);
    }

    @Override // androidx.media3.exoplayer.source.g.a
    public final void b(g gVar) {
        if (this.f18650h != null) {
            return;
        }
        g.a aVar = this.f18645c;
        aVar.getClass();
        aVar.b(this);
    }

    @Override // androidx.media3.exoplayer.source.m
    public final long c() {
        long jC = this.f18644b.c();
        if (jC != Long.MIN_VALUE) {
            long j = this.f18649g;
            if (j == Long.MIN_VALUE || jC < j) {
                return jC;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.source.g
    public final void d() throws IOException {
        ClippingMediaSource.IllegalClippingException illegalClippingException = this.f18650h;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        this.f18644b.d();
    }

    @Override // androidx.media3.exoplayer.source.g
    public final long e(long j, r0 r0Var) {
        long j10 = this.f18648f;
        if (j == j10) {
            return j10;
        }
        long jH = A.h(r0Var.f18601a, 0L, j - j10);
        long j11 = this.f18649g;
        long jH2 = A.h(r0Var.f18602b, 0L, j11 == Long.MIN_VALUE ? Long.MAX_VALUE : j11 - j);
        if (jH != r0Var.f18601a || jH2 != r0Var.f18602b) {
            r0Var = new r0(jH, jH2);
        }
        return this.f18644b.e(j, r0Var);
    }

    @Override // androidx.media3.exoplayer.source.g
    public final long f(long j) {
        this.f18647e = -9223372036854775807L;
        for (a aVar : this.f18646d) {
            if (aVar != null) {
                aVar.f18652b = false;
            }
        }
        long jF = this.f18644b.f(j);
        long j10 = this.f18648f;
        long j11 = this.f18649g;
        long jMax = Math.max(jF, j10);
        return j11 != Long.MIN_VALUE ? Math.min(jMax, j11) : jMax;
    }

    @Override // androidx.media3.exoplayer.source.m.a
    public final void g(m mVar) {
        g.a aVar = this.f18645c;
        aVar.getClass();
        aVar.g(this);
    }

    public final boolean h() {
        return this.f18647e != -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.m
    public final boolean i() {
        return this.f18644b.i();
    }

    @Override // androidx.media3.exoplayer.source.g
    public final long k() {
        if (h()) {
            long j = this.f18647e;
            this.f18647e = -9223372036854775807L;
            long jK = k();
            return jK != -9223372036854775807L ? jK : j;
        }
        long jK2 = this.f18644b.k();
        if (jK2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j10 = this.f18648f;
        long j11 = this.f18649g;
        long jMax = Math.max(jK2, j10);
        return j11 != Long.MIN_VALUE ? Math.min(jMax, j11) : jMax;
    }

    @Override // androidx.media3.exoplayer.source.g
    public final long l(t[] tVarArr, boolean[] zArr, r[] rVarArr, boolean[] zArr2, long j) {
        long j10;
        this.f18646d = new a[rVarArr.length];
        r[] rVarArr2 = new r[rVarArr.length];
        int i10 = 0;
        while (true) {
            r rVar = null;
            if (i10 >= rVarArr.length) {
                break;
            }
            a[] aVarArr = this.f18646d;
            a aVar = (a) rVarArr[i10];
            aVarArr[i10] = aVar;
            if (aVar != null) {
                rVar = aVar.f18651a;
            }
            rVarArr2[i10] = rVar;
            i10++;
        }
        long jL = this.f18644b.l(tVarArr, zArr, rVarArr2, zArr2, j);
        long j11 = this.f18649g;
        long jMax = Math.max(jL, j);
        if (j11 != Long.MIN_VALUE) {
            jMax = Math.min(jMax, j11);
        }
        if (h()) {
            if (jL >= j) {
                if (jL != 0) {
                    int length = tVarArr.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 < length) {
                            t tVar = tVarArr[i11];
                            if (tVar != null) {
                                p078g1.n nVarH = tVar.h();
                                if (!p078g1.t.a(nVarH.f35302n, nVarH.f35299k)) {
                                }
                            }
                            i11++;
                        }
                    }
                }
                j10 = -9223372036854775807L;
            }
            j10 = jMax;
        } else {
            j10 = -9223372036854775807L;
        }
        this.f18647e = j10;
        for (int i12 = 0; i12 < rVarArr.length; i12++) {
            r rVar2 = rVarArr2[i12];
            if (rVar2 == null) {
                this.f18646d[i12] = null;
            } else {
                a[] aVarArr2 = this.f18646d;
                a aVar2 = aVarArr2[i12];
                if (aVar2 == null || aVar2.f18651a != rVar2) {
                    aVarArr2[i12] = new a(rVar2);
                }
            }
            rVarArr[i12] = this.f18646d[i12];
        }
        return jMax;
    }

    @Override // androidx.media3.exoplayer.source.g
    public final void m(g.a aVar, long j) {
        this.f18645c = aVar;
        this.f18644b.m(this, j);
    }

    @Override // androidx.media3.exoplayer.source.g
    public final w n() {
        return this.f18644b.n();
    }

    @Override // androidx.media3.exoplayer.source.m
    public final long q() {
        long jQ = this.f18644b.q();
        if (jQ != Long.MIN_VALUE) {
            long j = this.f18649g;
            if (j == Long.MIN_VALUE || jQ < j) {
                return jQ;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.source.g
    public final void r(long j, boolean z10) {
        this.f18644b.r(j, z10);
    }

    @Override // androidx.media3.exoplayer.source.m
    public final void s(long j) {
        this.f18644b.s(j);
    }
}
