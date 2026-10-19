package androidx.media3.exoplayer;

import android.os.SystemClock;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* JADX INFO: compiled from: PlaybackInfo.java */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final androidx.media3.exoplayer.source.h.b f18410u = new androidx.media3.exoplayer.source.h.b(new Object());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p078g1.x f18411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.media3.exoplayer.source.h.b f18412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f18414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f18415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ExoPlaybackException f18416f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f18417g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p235t1.w f18418h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p259v1.y f18419i;
    public final List<p078g1.s> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final androidx.media3.exoplayer.source.h.b f18420k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f18421l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f18422m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f18423n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p078g1.u f18424o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f18425p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile long f18426q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile long f18427r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile long f18428s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile long f18429t;

    public h0(p078g1.x xVar, androidx.media3.exoplayer.source.h.b bVar, long j, long j10, int i10, ExoPlaybackException exoPlaybackException, boolean z10, p235t1.w wVar, p259v1.y yVar, List<p078g1.s> list, androidx.media3.exoplayer.source.h.b bVar2, boolean z11, int i11, int i12, p078g1.u uVar, long j11, long j12, long j13, long j14, boolean z12) {
        this.f18411a = xVar;
        this.f18412b = bVar;
        this.f18413c = j;
        this.f18414d = j10;
        this.f18415e = i10;
        this.f18416f = exoPlaybackException;
        this.f18417g = z10;
        this.f18418h = wVar;
        this.f18419i = yVar;
        this.j = list;
        this.f18420k = bVar2;
        this.f18421l = z11;
        this.f18422m = i11;
        this.f18423n = i12;
        this.f18424o = uVar;
        this.f18426q = j11;
        this.f18427r = j12;
        this.f18428s = j13;
        this.f18429t = j14;
        this.f18425p = z12;
    }

    public static h0 j(p259v1.y yVar) {
        g1.x.a aVar = p078g1.x.f35467a;
        androidx.media3.exoplayer.source.h.b bVar = f18410u;
        return new h0(aVar, bVar, -9223372036854775807L, 0L, 1, null, false, p235t1.w.f47101d, yVar, ImmutableList.K(), bVar, false, 1, 0, p078g1.u.f35451d, 0L, 0L, 0L, 0L, false);
    }

    public final h0 a() {
        return new h0(this.f18411a, this.f18412b, this.f18413c, this.f18414d, this.f18415e, this.f18416f, this.f18417g, this.f18418h, this.f18419i, this.j, this.f18420k, this.f18421l, this.f18422m, this.f18423n, this.f18424o, this.f18426q, this.f18427r, k(), SystemClock.elapsedRealtime(), this.f18425p);
    }

    public final h0 b(boolean z10) {
        return new h0(this.f18411a, this.f18412b, this.f18413c, this.f18414d, this.f18415e, this.f18416f, z10, this.f18418h, this.f18419i, this.j, this.f18420k, this.f18421l, this.f18422m, this.f18423n, this.f18424o, this.f18426q, this.f18427r, this.f18428s, this.f18429t, this.f18425p);
    }

    public final h0 c(androidx.media3.exoplayer.source.h.b bVar) {
        return new h0(this.f18411a, this.f18412b, this.f18413c, this.f18414d, this.f18415e, this.f18416f, this.f18417g, this.f18418h, this.f18419i, this.j, bVar, this.f18421l, this.f18422m, this.f18423n, this.f18424o, this.f18426q, this.f18427r, this.f18428s, this.f18429t, this.f18425p);
    }

    public final h0 d(androidx.media3.exoplayer.source.h.b bVar, long j, long j10, long j11, long j12, p235t1.w wVar, p259v1.y yVar, List<p078g1.s> list) {
        return new h0(this.f18411a, bVar, j10, j11, this.f18415e, this.f18416f, this.f18417g, wVar, yVar, list, this.f18420k, this.f18421l, this.f18422m, this.f18423n, this.f18424o, this.f18426q, j12, j, SystemClock.elapsedRealtime(), this.f18425p);
    }

    public final h0 e(int i10, int i11, boolean z10) {
        return new h0(this.f18411a, this.f18412b, this.f18413c, this.f18414d, this.f18415e, this.f18416f, this.f18417g, this.f18418h, this.f18419i, this.j, this.f18420k, z10, i10, i11, this.f18424o, this.f18426q, this.f18427r, this.f18428s, this.f18429t, this.f18425p);
    }

    public final h0 f(ExoPlaybackException exoPlaybackException) {
        return new h0(this.f18411a, this.f18412b, this.f18413c, this.f18414d, this.f18415e, exoPlaybackException, this.f18417g, this.f18418h, this.f18419i, this.j, this.f18420k, this.f18421l, this.f18422m, this.f18423n, this.f18424o, this.f18426q, this.f18427r, this.f18428s, this.f18429t, this.f18425p);
    }

    public final h0 g(p078g1.u uVar) {
        return new h0(this.f18411a, this.f18412b, this.f18413c, this.f18414d, this.f18415e, this.f18416f, this.f18417g, this.f18418h, this.f18419i, this.j, this.f18420k, this.f18421l, this.f18422m, this.f18423n, uVar, this.f18426q, this.f18427r, this.f18428s, this.f18429t, this.f18425p);
    }

    public final h0 h(int i10) {
        return new h0(this.f18411a, this.f18412b, this.f18413c, this.f18414d, i10, this.f18416f, this.f18417g, this.f18418h, this.f18419i, this.j, this.f18420k, this.f18421l, this.f18422m, this.f18423n, this.f18424o, this.f18426q, this.f18427r, this.f18428s, this.f18429t, this.f18425p);
    }

    public final h0 i(p078g1.x xVar) {
        return new h0(xVar, this.f18412b, this.f18413c, this.f18414d, this.f18415e, this.f18416f, this.f18417g, this.f18418h, this.f18419i, this.j, this.f18420k, this.f18421l, this.f18422m, this.f18423n, this.f18424o, this.f18426q, this.f18427r, this.f18428s, this.f18429t, this.f18425p);
    }

    public final long k() {
        long j;
        long j10;
        if (!l()) {
            return this.f18428s;
        }
        do {
            j = this.f18429t;
            j10 = this.f18428s;
        } while (j != this.f18429t);
        return p114j1.A.F(p114j1.A.Q(j10) + ((long) ((SystemClock.elapsedRealtime() - j) * this.f18424o.f35452a)));
    }

    public final boolean l() {
        return this.f18415e == 3 && this.f18421l && this.f18423n == 0;
    }
}
