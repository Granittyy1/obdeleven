package androidx.media3.exoplayer;

import androidx.media3.decoder.DecoderInputBuffer;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: renamed from: androidx.media3.exoplayer.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: BaseRenderer.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1389g implements m0, n0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18363c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o0 f18365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18366f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p162n1.u f18367g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p114j1.t f18368h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18369i;
    public p235t1.r j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p078g1.n[] f18370k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f18371l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f18372m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f18374o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f18375p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public n0.a f18377r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f18362b = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Q f18364d = new Q();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f18373n = Long.MIN_VALUE;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public p078g1.x f18376q = p078g1.x.f35467a;

    public AbstractC1389g(int i10) {
        this.f18363c = i10;
    }

    @Override // androidx.media3.exoplayer.m0
    public final long A() {
        return this.f18373n;
    }

    @Override // androidx.media3.exoplayer.m0
    public final void B(long j) throws ExoPlaybackException {
        this.f18374o = false;
        this.f18372m = j;
        this.f18373n = j;
        J(j, false);
    }

    @Override // androidx.media3.exoplayer.m0
    public final boolean C() {
        return this.f18374o;
    }

    @Override // androidx.media3.exoplayer.m0
    public U D() {
        return null;
    }

    @Override // androidx.media3.exoplayer.m0
    public final int E() {
        return this.f18363c;
    }

    @Override // androidx.media3.exoplayer.m0
    public final void F(p078g1.x xVar) {
        if (Objects.equals(this.f18376q, xVar)) {
            return;
        }
        this.f18376q = xVar;
    }

    public final ExoPlaybackException G(Exception exc, p078g1.n nVar, boolean z10, int i10) {
        int iC;
        if (nVar == null || this.f18375p) {
            iC = 4;
        } else {
            this.f18375p = true;
            try {
                iC = c(nVar) & 7;
                this.f18375p = false;
            } catch (ExoPlaybackException unused) {
                this.f18375p = false;
                iC = 4;
            } catch (Throwable th) {
                this.f18375p = false;
                throw th;
            }
        }
        return new ExoPlaybackException(1, exc, i10, getName(), this.f18366f, nVar, nVar == null ? 4 : iC, z10);
    }

    public abstract void H();

    public abstract void J(long j, boolean z10) throws ExoPlaybackException;

    public final int P(Q q10, DecoderInputBuffer decoderInputBuffer, int i10) {
        p235t1.r rVar = this.j;
        rVar.getClass();
        int iD = rVar.d(q10, decoderInputBuffer, i10);
        if (iD == -4) {
            if (decoderInputBuffer.g(4)) {
                this.f18373n = Long.MIN_VALUE;
                return this.f18374o ? -4 : -3;
            }
            long j = decoderInputBuffer.f17943g + this.f18371l;
            decoderInputBuffer.f17943g = j;
            this.f18373n = Math.max(this.f18373n, j);
        } else if (iD == -5) {
            p078g1.n nVar = (p078g1.n) q10.f18136b;
            nVar.getClass();
            long j10 = nVar.f35307s;
            if (j10 != Long.MAX_VALUE) {
                g1.n.a aVarA = nVar.a();
                aVarA.f35343r = j10 + this.f18371l;
                q10.f18136b = new p078g1.n(aVarA);
            }
        }
        return iD;
    }

    @Override // androidx.media3.exoplayer.m0
    public final void a() {
        p241t7.b.k(this.f18369i == 0);
        K();
    }

    @Override // androidx.media3.exoplayer.m0
    public boolean d() {
        return h();
    }

    @Override // androidx.media3.exoplayer.m0
    public final void f() {
        p241t7.b.k(this.f18369i == 1);
        this.f18364d.a();
        this.f18369i = 0;
        this.j = null;
        this.f18370k = null;
        this.f18374o = false;
        H();
    }

    @Override // androidx.media3.exoplayer.m0
    public final int getState() {
        return this.f18369i;
    }

    @Override // androidx.media3.exoplayer.m0
    public final boolean h() {
        return this.f18373n == Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.m0
    public final void l() {
        this.f18374o = true;
    }

    @Override // androidx.media3.exoplayer.m0
    public final void o(int i10, p162n1.u uVar, p114j1.t tVar) {
        this.f18366f = i10;
        this.f18367g = uVar;
        this.f18368h = tVar;
    }

    @Override // androidx.media3.exoplayer.m0
    public final void p(p078g1.n[] nVarArr, p235t1.r rVar, long j, long j10, androidx.media3.exoplayer.source.h.b bVar) throws ExoPlaybackException {
        p241t7.b.k(!this.f18374o);
        this.j = rVar;
        if (this.f18373n == Long.MIN_VALUE) {
            this.f18373n = j;
        }
        this.f18370k = nVarArr;
        this.f18371l = j10;
        O(nVarArr, j, j10, bVar);
    }

    @Override // androidx.media3.exoplayer.m0
    public final void reset() {
        p241t7.b.k(this.f18369i == 0);
        this.f18364d.a();
        L();
    }

    @Override // androidx.media3.exoplayer.m0
    public final void start() throws ExoPlaybackException {
        p241t7.b.k(this.f18369i == 1);
        this.f18369i = 2;
        M();
    }

    @Override // androidx.media3.exoplayer.m0
    public final void stop() {
        p241t7.b.k(this.f18369i == 2);
        this.f18369i = 1;
        N();
    }

    @Override // androidx.media3.exoplayer.n0
    public int u() throws ExoPlaybackException {
        return 0;
    }

    @Override // androidx.media3.exoplayer.m0
    public final void w(o0 o0Var, p078g1.n[] nVarArr, p235t1.r rVar, boolean z10, boolean z11, long j, long j10, androidx.media3.exoplayer.source.h.b bVar) throws ExoPlaybackException {
        p241t7.b.k(this.f18369i == 0);
        this.f18365e = o0Var;
        this.f18369i = 1;
        I(z10, z11);
        p(nVarArr, rVar, j, j10, bVar);
        this.f18374o = false;
        this.f18372m = j;
        this.f18373n = j;
        J(j, z10);
    }

    @Override // androidx.media3.exoplayer.m0
    public final p235t1.r y() {
        return this.j;
    }

    @Override // androidx.media3.exoplayer.m0
    public final void z() throws IOException {
        p235t1.r rVar = this.j;
        rVar.getClass();
        rVar.a();
    }

    public void K() {
    }

    public void L() {
    }

    public void M() throws ExoPlaybackException {
    }

    public void N() {
    }

    @Override // androidx.media3.exoplayer.m0
    public final AbstractC1389g q() {
        return this;
    }

    public void I(boolean z10, boolean z11) throws ExoPlaybackException {
    }

    @Override // androidx.media3.exoplayer.j0.b
    public void x(int i10, Object obj) throws ExoPlaybackException {
    }

    public void O(p078g1.n[] nVarArr, long j, long j10, androidx.media3.exoplayer.source.h.b bVar) throws ExoPlaybackException {
    }
}
