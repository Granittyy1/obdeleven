package androidx.media3.exoplayer;

import android.os.Looper;

/* JADX INFO: compiled from: PlayerMessage.java */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f18454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f18455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f18457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Looper f18458e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f18459f;

    /* JADX INFO: compiled from: PlayerMessage.java */
    public interface a {
    }

    /* JADX INFO: compiled from: PlayerMessage.java */
    public interface b {
        void x(int i10, Object obj) throws ExoPlaybackException;
    }

    public j0(a aVar, b bVar, p078g1.x xVar, int i10, p114j1.t tVar, Looper looper) {
        this.f18455b = aVar;
        this.f18454a = bVar;
        this.f18458e = looper;
    }

    public final synchronized void a(boolean z10) {
        notifyAll();
    }

    public final void b() {
        p241t7.b.k(!this.f18459f);
        this.f18459f = true;
        P p10 = (P) this.f18455b;
        synchronized (p10) {
            if (!p10.f18069F && p10.f18098k.getThread().isAlive()) {
                p10.f18097i.k(14, this).b();
                return;
            }
            p114j1.k.f("Ignoring messages sent after release.");
            a(false);
        }
    }
}
