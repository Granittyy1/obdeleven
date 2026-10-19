package androidx.media3.exoplayer;

import android.os.SystemClock;

/* JADX INFO: compiled from: StandaloneMediaClock.java */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p114j1.t f18604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f18606d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f18607e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p078g1.u f18608f = p078g1.u.f35451d;

    public s0(p114j1.t tVar) {
        this.f18604b = tVar;
    }

    public final void a(long j) {
        this.f18606d = j;
        if (this.f18605c) {
            this.f18604b.getClass();
            this.f18607e = SystemClock.elapsedRealtime();
        }
    }

    @Override // androidx.media3.exoplayer.U
    public final void e(p078g1.u uVar) {
        if (this.f18605c) {
            a(r());
        }
        this.f18608f = uVar;
    }

    @Override // androidx.media3.exoplayer.U
    public final p078g1.u g() {
        return this.f18608f;
    }

    @Override // androidx.media3.exoplayer.U
    public final long r() {
        long j = this.f18606d;
        if (!this.f18605c) {
            return j;
        }
        this.f18604b.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f18607e;
        p078g1.u uVar = this.f18608f;
        return j + (uVar.f35452a == 1.0f ? p114j1.A.F(jElapsedRealtime) : jElapsedRealtime * ((long) uVar.f35454c));
    }
}
