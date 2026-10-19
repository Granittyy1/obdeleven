package androidx.media3.exoplayer.source;

import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.Q;
import androidx.media3.exoplayer.T;
import androidx.media3.exoplayer.r0;
import java.io.IOException;
import p235t1.r;
import p235t1.w;
import p259v1.t;

/* JADX INFO: compiled from: TimeOffsetMediaPeriod.java */
/* JADX INFO: loaded from: classes.dex */
public final class n implements g, g.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f18798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g.a f18800d;

    /* JADX INFO: compiled from: TimeOffsetMediaPeriod.java */
    public static final class a implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r f18801a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f18802b;

        public a(r rVar, long j) {
            this.f18801a = rVar;
            this.f18802b = j;
        }

        @Override // p235t1.r
        public final void a() throws IOException {
            this.f18801a.a();
        }

        @Override // p235t1.r
        public final boolean b() {
            return this.f18801a.b();
        }

        @Override // p235t1.r
        public final int c(long j) {
            return this.f18801a.c(j - this.f18802b);
        }

        @Override // p235t1.r
        public final int d(Q q10, DecoderInputBuffer decoderInputBuffer, int i10) {
            int iD = this.f18801a.d(q10, decoderInputBuffer, i10);
            if (iD == -4) {
                decoderInputBuffer.f17943g += this.f18802b;
            }
            return iD;
        }
    }

    public n(g gVar, long j) {
        this.f18798b = gVar;
        this.f18799c = j;
    }

    @Override // androidx.media3.exoplayer.source.m
    public final boolean a(T t8) {
        T.a aVar = new T.a();
        aVar.f18146b = t8.f18143b;
        aVar.f18147c = t8.f18144c;
        aVar.f18145a = t8.f18142a - this.f18799c;
        return this.f18798b.a(new T(aVar));
    }

    @Override // androidx.media3.exoplayer.source.g.a
    public final void b(g gVar) {
        g.a aVar = this.f18800d;
        aVar.getClass();
        aVar.b(this);
    }

    @Override // androidx.media3.exoplayer.source.m
    public final long c() {
        long jC = this.f18798b.c();
        if (jC == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.f18799c + jC;
    }

    @Override // androidx.media3.exoplayer.source.g
    public final void d() throws IOException {
        this.f18798b.d();
    }

    @Override // androidx.media3.exoplayer.source.g
    public final long e(long j, r0 r0Var) {
        long j10 = this.f18799c;
        return this.f18798b.e(j - j10, r0Var) + j10;
    }

    @Override // androidx.media3.exoplayer.source.g
    public final long f(long j) {
        long j10 = this.f18799c;
        return this.f18798b.f(j - j10) + j10;
    }

    @Override // androidx.media3.exoplayer.source.m.a
    public final void g(m mVar) {
        g.a aVar = this.f18800d;
        aVar.getClass();
        aVar.g(this);
    }

    @Override // androidx.media3.exoplayer.source.m
    public final boolean i() {
        return this.f18798b.i();
    }

    @Override // androidx.media3.exoplayer.source.g
    public final long k() {
        long jK = this.f18798b.k();
        if (jK == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f18799c + jK;
    }

    @Override // androidx.media3.exoplayer.source.g
    public final long l(t[] tVarArr, boolean[] zArr, r[] rVarArr, boolean[] zArr2, long j) {
        r[] rVarArr2 = new r[rVarArr.length];
        int i10 = 0;
        while (true) {
            r rVar = null;
            if (i10 >= rVarArr.length) {
                break;
            }
            a aVar = (a) rVarArr[i10];
            if (aVar != null) {
                rVar = aVar.f18801a;
            }
            rVarArr2[i10] = rVar;
            i10++;
        }
        long j10 = this.f18799c;
        long jL = this.f18798b.l(tVarArr, zArr, rVarArr2, zArr2, j - j10);
        for (int i11 = 0; i11 < rVarArr.length; i11++) {
            r rVar2 = rVarArr2[i11];
            if (rVar2 == null) {
                rVarArr[i11] = null;
            } else {
                r rVar3 = rVarArr[i11];
                if (rVar3 == null || ((a) rVar3).f18801a != rVar2) {
                    rVarArr[i11] = new a(rVar2, j10);
                }
            }
        }
        return jL + j10;
    }

    @Override // androidx.media3.exoplayer.source.g
    public final void m(g.a aVar, long j) {
        this.f18800d = aVar;
        this.f18798b.m(this, j - this.f18799c);
    }

    @Override // androidx.media3.exoplayer.source.g
    public final w n() {
        return this.f18798b.n();
    }

    @Override // androidx.media3.exoplayer.source.m
    public final long q() {
        long jQ = this.f18798b.q();
        if (jQ == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.f18799c + jQ;
    }

    @Override // androidx.media3.exoplayer.source.g
    public final void r(long j, boolean z10) {
        this.f18798b.r(j - this.f18799c, z10);
    }

    @Override // androidx.media3.exoplayer.source.m
    public final void s(long j) {
        this.f18798b.s(j - this.f18799c);
    }
}
