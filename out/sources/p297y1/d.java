package p297y1;

import android.view.Surface;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import p078g1.n;
import p114j1.s;
import p114j1.t;

/* JADX INFO: compiled from: DefaultVideoSink.java */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f48026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f48027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f48028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque f48029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Surface f48030e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f48031f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f48032g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public y f48033h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Executor f48034i;
    public n j;

    /* JADX INFO: compiled from: DefaultVideoSink.java */
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public n f48035a;

        public a() {
        }
    }

    public d(o oVar, t tVar) {
        this.f48026a = oVar;
        oVar.f48170l = tVar;
        this.f48027b = tVar;
        this.f48028c = new r(new a(), oVar);
        this.f48029d = new ArrayDeque();
        this.f48031f = new n(new n.a());
        this.f48032g = -9223372036854775807L;
        this.f48033h = y.f48226a;
        this.f48034i = new b();
        this.j = new c();
    }

    public final void a(Surface surface, s sVar) {
        this.f48030e = surface;
        this.f48026a.g(surface);
    }

    public final void b(long j, long j10) {
        if (j != this.f48032g) {
            r rVar = this.f48028c;
            long j11 = rVar.f48204g;
            rVar.f48202e.a(Long.valueOf(j), j11 == -9223372036854775807L ? 0L : j11 + 1);
            this.f48032g = j;
        }
    }
}
