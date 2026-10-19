package androidx.media3.exoplayer;

import com.braze.Constants;

/* JADX INFO: renamed from: androidx.media3.exoplayer.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DefaultMediaClock.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1394l implements U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s0 f18472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final P f18473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m0 f18474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public U f18475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f18476f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f18477g;

    public C1394l(P p10, p114j1.t tVar) {
        this.f18473c = p10;
        this.f18472b = new s0(tVar);
    }

    public final void a(m0 m0Var) throws ExoPlaybackException {
        U u10;
        U uD = m0Var.D();
        if (uD == null || uD == (u10 = this.f18475e)) {
            return;
        }
        if (u10 != null) {
            throw new ExoPlaybackException(2, new IllegalStateException("Multiple renderer media clocks enabled."), Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS);
        }
        this.f18475e = uD;
        this.f18474d = m0Var;
        ((androidx.media3.exoplayer.audio.c) uD).e(this.f18472b.f18608f);
    }

    @Override // androidx.media3.exoplayer.U
    public final void e(p078g1.u uVar) {
        U u10 = this.f18475e;
        if (u10 != null) {
            u10.e(uVar);
            uVar = this.f18475e.g();
        }
        this.f18472b.e(uVar);
    }

    @Override // androidx.media3.exoplayer.U
    public final p078g1.u g() {
        U u10 = this.f18475e;
        return u10 != null ? u10.g() : this.f18472b.f18608f;
    }

    @Override // androidx.media3.exoplayer.U
    public final long r() {
        if (this.f18476f) {
            return this.f18472b.r();
        }
        U u10 = this.f18475e;
        u10.getClass();
        return u10.r();
    }

    @Override // androidx.media3.exoplayer.U
    public final boolean t() {
        if (this.f18476f) {
            this.f18472b.getClass();
            return false;
        }
        U u10 = this.f18475e;
        u10.getClass();
        return u10.t();
    }
}
