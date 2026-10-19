package androidx.media3.exoplayer;

import Z3.RunnableC0837c;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.compose.foundation.C0936h;
import androidx.media3.exoplayer.image.ImageOutput;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import p078g1.AbstractC2200f;
import p078g1.C2198d;
import p114j1.C2480b;

/* JADX INFO: compiled from: ExoPlayerImpl.java */
/* JADX INFO: loaded from: classes.dex */
public final class K extends AbstractC2200f implements ExoPlayer {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final b f17988A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C1385c f17989B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final t0 f17990C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final u0 f17991D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final long f17992E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final C2480b<Integer> f17993F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f17994G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f17995H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f17996I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f17997J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f17998K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final r0 f17999L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public p235t1.s f18000M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final ExoPlayer.c f18001N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public g1.v.a f18002O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public p078g1.r f18003P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public Object f18004Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public Surface f18005R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public SurfaceHolder f18006S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public p308z1.j f18007T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f18008U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public TextureView f18009V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final int f18010W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public p114j1.s f18011X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final C2198d f18012Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public boolean f18013Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public p102i1.b f18014a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p259v1.y f18015b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final boolean f18016b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g1.v.a f18017c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f18018c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final coil.util.t f18019d = new coil.util.t();

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final int f18020d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f18021e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public p078g1.F f18022e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p078g1.v f18023f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public p078g1.r f18024f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m0[] f18025g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public h0 f18026g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m0[] f18027h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f18028h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p259v1.x f18029i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public long f18030i0;
    public final p114j1.g j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final X8.m f18031k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final P f18032l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p114j1.j<g1.v.c> f18033m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArraySet<ExoPlayer.a> f18034n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final g1.x.b f18035o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f18036p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f18037q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final androidx.media3.exoplayer.source.h.a f18038r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p162n1.a f18039s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Looper f18040t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final p272w1.c f18041u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f18042v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f18043w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long f18044x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final p114j1.t f18045y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final a f18046z;

    /* JADX INFO: compiled from: ExoPlayerImpl.java */
    public static final class b implements p297y1.n, p308z1.a, j0.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public p297y1.n f18048b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public p308z1.a f18049c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public p297y1.n f18050d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public p308z1.a f18051e;

        @Override // p308z1.a
        public final void c(long j, float[] fArr) {
            p308z1.a aVar = this.f18051e;
            if (aVar != null) {
                aVar.c(j, fArr);
            }
            p308z1.a aVar2 = this.f18049c;
            if (aVar2 != null) {
                aVar2.c(j, fArr);
            }
        }

        @Override // p308z1.a
        public final void e() {
            p308z1.a aVar = this.f18051e;
            if (aVar != null) {
                aVar.e();
            }
            p308z1.a aVar2 = this.f18049c;
            if (aVar2 != null) {
                aVar2.e();
            }
        }

        @Override // p297y1.n
        public final void g(long j, long j10, p078g1.n nVar, MediaFormat mediaFormat) {
            p297y1.n nVar2 = this.f18050d;
            if (nVar2 != null) {
                nVar2.g(j, j10, nVar, mediaFormat);
            }
            p297y1.n nVar3 = this.f18048b;
            if (nVar3 != null) {
                nVar3.g(j, j10, nVar, mediaFormat);
            }
        }

        @Override // androidx.media3.exoplayer.j0.b
        public final void x(int i10, Object obj) {
            if (i10 == 7) {
                this.f18048b = (p297y1.n) obj;
                return;
            }
            if (i10 == 8) {
                this.f18049c = (p308z1.a) obj;
                return;
            }
            if (i10 != 10000) {
                return;
            }
            p308z1.j jVar = (p308z1.j) obj;
            if (jVar == null) {
                this.f18050d = null;
                this.f18051e = null;
            } else {
                this.f18050d = jVar.getVideoFrameMetadataListener();
                this.f18051e = jVar.getCameraMotionListener();
            }
        }
    }

    /* JADX INFO: compiled from: ExoPlayerImpl.java */
    public static final class c implements Z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f18052a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public p078g1.x f18053b;

        public c(Object obj, androidx.media3.exoplayer.source.f fVar) {
            this.f18052a = obj;
            this.f18053b = fVar.f18689o;
        }

        @Override // androidx.media3.exoplayer.Z
        public final Object a() {
            return this.f18052a;
        }

        @Override // androidx.media3.exoplayer.Z
        public final p078g1.x b() {
            return this.f18053b;
        }
    }

    static {
        p078g1.q.a("media3.exoplayer");
    }

    public K(ExoPlayer.b bVar) {
        ExoPlayer.b bVar2;
        int i10 = 1;
        try {
            p114j1.k.e("Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.6.0] [" + p114j1.A.f40997b + "]");
            Context context = bVar.f17954a;
            Looper looper = bVar.f17962i;
            this.f18021e = context.getApplicationContext();
            androidx.compose.ui.text.font.s sVar = bVar.f17961h;
            p114j1.t tVar = bVar.f17955b;
            sVar.getClass();
            this.f18039s = new p162n1.f(tVar);
            this.f18020d0 = bVar.j;
            this.f18012Y = bVar.f17963k;
            this.f18010W = bVar.f17964l;
            this.f18013Z = false;
            this.f17992E = bVar.f17972t;
            a aVar = new a();
            this.f18046z = aVar;
            this.f17988A = new b();
            Handler handler = new Handler(looper);
            q0 q0Var = (q0) bVar.f17956c.get();
            m0[] m0VarArrA = q0Var.a(handler, aVar, aVar, aVar, aVar);
            this.f18025g = m0VarArrA;
            p241t7.b.k(m0VarArrA.length > 0);
            this.f18027h = new m0[m0VarArrA.length];
            int i11 = 0;
            while (true) {
                m0[] m0VarArr = this.f18027h;
                if (i11 >= m0VarArr.length) {
                    break;
                }
                q0Var.b(this.f18025g[i11]);
                m0VarArr[i11] = null;
                i11++;
            }
            this.f18029i = (p259v1.x) bVar.f17958e.get();
            this.f18038r = (androidx.media3.exoplayer.source.h.a) bVar.f17957d.get();
            this.f18041u = (p272w1.c) bVar.f17960g.get();
            this.f18037q = bVar.f17965m;
            this.f17999L = bVar.f17966n;
            this.f18042v = bVar.f17967o;
            this.f18043w = bVar.f17968p;
            this.f18044x = bVar.f17969q;
            this.f18040t = looper;
            this.f18045y = tVar;
            this.f18023f = this;
            this.f18033m = new p114j1.j<>(looper, tVar, new C1406y(this));
            this.f18034n = new CopyOnWriteArraySet<>();
            this.f18036p = new ArrayList();
            this.f18000M = new t1.s.a();
            this.f18001N = ExoPlayer.c.f17976a;
            m0[] m0VarArr2 = this.f18025g;
            this.f18015b = new p259v1.y(new o0[m0VarArr2.length], new p259v1.t[m0VarArr2.length], p078g1.B.f35220b, null);
            this.f18035o = new g1.x.b();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            for (int i12 = 0; i12 < 20; i12++) {
                int i13 = iArr[i12];
                p241t7.b.k(!false);
                sparseBooleanArray.append(i13, true);
            }
            p259v1.x xVar = this.f18029i;
            xVar.getClass();
            if (xVar instanceof p259v1.j) {
                p241t7.b.k(!false);
                sparseBooleanArray.append(29, true);
            }
            p241t7.b.k(!false);
            p078g1.m mVar = new p078g1.m(sparseBooleanArray);
            this.f18017c = new g1.v.a(mVar);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i14 = 0; i14 < mVar.f35273a.size(); i14++) {
                int iA = mVar.a(i14);
                p241t7.b.k(!false);
                sparseBooleanArray2.append(iA, true);
            }
            p241t7.b.k(!false);
            sparseBooleanArray2.append(4, true);
            p241t7.b.k(!false);
            sparseBooleanArray2.append(10, true);
            p241t7.b.k(!false);
            this.f18002O = new g1.v.a(new p078g1.m(sparseBooleanArray2));
            this.j = this.f18045y.a(this.f18040t, null);
            X8.m mVar2 = new X8.m(i10, this);
            this.f18031k = mVar2;
            this.f18026g0 = h0.j(this.f18015b);
            this.f18039s.D(this.f18023f, this.f18040t);
            final p162n1.u uVar = new p162n1.u(bVar.f17975w);
            Context context2 = this.f18021e;
            m0[] m0VarArr3 = this.f18025g;
            m0[] m0VarArr4 = this.f18027h;
            p259v1.x xVar2 = this.f18029i;
            p259v1.y yVar = this.f18015b;
            bVar.f17959f.getClass();
            P p10 = new P(context2, m0VarArr3, m0VarArr4, xVar2, yVar, new C1393k(), this.f18041u, this.f17994G, this.f17995H, this.f18039s, this.f17999L, bVar.f17970r, bVar.f17971s, this.f18040t, this.f18045y, mVar2, uVar, this.f18001N);
            this.f18032l = p10;
            Looper looper2 = p10.f18098k;
            this.f17994G = 0;
            p078g1.r rVar = p078g1.r.f35393B;
            this.f18003P = rVar;
            this.f18024f0 = rVar;
            this.f18028h0 = -1;
            this.f18014a0 = p102i1.b.f36543b;
            this.f18016b0 = true;
            u(this.f18039s);
            this.f18041u.d(new Handler(this.f18040t), this.f18039s);
            this.f18034n.add(this.f18046z);
            if (p114j1.A.f40996a >= 31) {
                final Context context3 = this.f18021e;
                bVar2 = bVar;
                final boolean z10 = bVar2.f17973u;
                this.f18045y.a(p10.f18098k, null).e(new Runnable() { // from class: androidx.media3.exoplayer.H
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context4 = context3;
                        boolean z11 = z10;
                        K k10 = this;
                        p162n1.u uVar2 = uVar;
                        MediaMetricsManager mediaMetricsManagerA = N2.b.a(context4.getSystemService("media_metrics"));
                        p162n1.t tVar2 = mediaMetricsManagerA == null ? null : new p162n1.t(context4, mediaMetricsManagerA.createPlaybackSession());
                        if (tVar2 == null) {
                            p114j1.k.f("MediaMetricsService unavailable.");
                            return;
                        }
                        if (z11) {
                            k10.getClass();
                            k10.f18039s.I(tVar2);
                        }
                        LogSessionId sessionId = tVar2.f44720d.getSessionId();
                        synchronized (uVar2) {
                            n1.u.a aVar2 = uVar2.f44747b;
                            aVar2.getClass();
                            p241t7.b.k(aVar2.f44749a.equals(LogSessionId.LOG_SESSION_ID_NONE));
                            aVar2.f44749a = sessionId;
                        }
                    }
                });
            } else {
                bVar2 = bVar;
            }
            C2480b<Integer> c2480b = new C2480b<>(0, looper2, this.f18040t, this.f18045y, new A4.b(this));
            this.f17993F = c2480b;
            c2480b.f41006a.e(new RunnableC0837c(1, this));
            C1385c c1385c = new C1385c(bVar2.f17954a, looper2, bVar2.f17962i, this.f18046z, this.f18045y);
            this.f17989B = c1385c;
            c1385c.a();
            p114j1.t tVar2 = this.f18045y;
            t0 t0Var = new t0();
            context.getApplicationContext();
            tVar2.a(looper2, null);
            this.f17990C = t0Var;
            p114j1.t tVar3 = this.f18045y;
            u0 u0Var = new u0();
            context.getApplicationContext();
            tVar3.a(looper2, null);
            this.f17991D = u0Var;
            int i15 = p078g1.j.f35261c;
            this.f18022e0 = p078g1.F.f35228d;
            this.f18011X = p114j1.s.f41065c;
            p10.f18097i.d(this.f18012Y).b();
            u0(1, 3, this.f18012Y);
            u0(2, 4, Integer.valueOf(this.f18010W));
            u0(2, 5, 0);
            u0(1, 9, Boolean.valueOf(this.f18013Z));
            u0(2, 7, this.f17988A);
            u0(6, 8, this.f17988A);
            u0(-1, 16, Integer.valueOf(this.f18020d0));
        } finally {
            this.f18019d.d();
        }
    }

    public static long o0(h0 h0Var) {
        g1.x.c cVar = new g1.x.c();
        g1.x.b bVar = new g1.x.b();
        h0Var.f18411a.g(h0Var.f18412b.f18698a, bVar);
        long j = h0Var.f18413c;
        if (j != -9223372036854775807L) {
            return bVar.f35472e + j;
        }
        return h0Var.f18411a.m(bVar.f35470c, cVar, 0L).f35486k;
    }

    public static h0 p0(h0 h0Var, int i10) {
        h0 h0VarH = h0Var.h(i10);
        return (i10 == 1 || i10 == 4) ? h0VarH.b(false) : h0VarH;
    }

    @Override // p078g1.v
    public final long A() {
        B0();
        return l0(this.f18026g0);
    }

    public final void A0() {
        int iC = C();
        u0 u0Var = this.f17991D;
        t0 t0Var = this.f17990C;
        if (iC != 1) {
            if (iC == 2 || iC == 3) {
                B0();
                t0Var.a(j() && !this.f18026g0.f18425p);
                u0Var.a(j());
                return;
            } else if (iC != 4) {
                throw new IllegalStateException();
            }
        }
        t0Var.a(false);
        u0Var.a(false);
    }

    public final void B0() {
        this.f18019d.c();
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f18040t;
        if (threadCurrentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            int i10 = p114j1.A.f40996a;
            Locale locale = Locale.US;
            String strD = C0936h.d("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.f18016b0) {
                throw new IllegalStateException(strD);
            }
            p114j1.k.g(strD, this.f18018c0 ? null : new IllegalStateException());
            this.f18018c0 = true;
        }
    }

    @Override // p078g1.v
    public final int C() {
        B0();
        return this.f18026g0.f18415e;
    }

    @Override // p078g1.v
    public final p078g1.B D() {
        B0();
        return this.f18026g0.f18419i.f47626d;
    }

    @Override // p078g1.v
    public final p102i1.b G() {
        B0();
        return this.f18014a0;
    }

    @Override // p078g1.v
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final ExoPlaybackException d() {
        B0();
        return this.f18026g0.f18416f;
    }

    @Override // p078g1.v
    public final int J() {
        B0();
        if (f()) {
            return this.f18026g0.f18412b.f18699b;
        }
        return -1;
    }

    @Override // p078g1.v
    public final int K() {
        B0();
        int iN0 = n0(this.f18026g0);
        if (iN0 == -1) {
            return 0;
        }
        return iN0;
    }

    @Override // p078g1.v
    public final void M(final int i10) {
        B0();
        if (this.f17994G != i10) {
            this.f17994G = i10;
            this.f18032l.f18097i.c(11, i10, 0).b();
            j1.j.a<g1.v.c> aVar = new j1.j.a() { // from class: androidx.media3.exoplayer.x
                @Override // j1.j.a
                public final void invoke(Object obj) {
                    ((g1.v.c) obj).L(i10);
                }
            };
            p114j1.j<g1.v.c> jVar = this.f18033m;
            jVar.c(8, aVar);
            x0();
            jVar.b();
        }
    }

    @Override // p078g1.v
    public final void N(SurfaceView surfaceView) {
        B0();
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        B0();
        if (holder == null || holder != this.f18006S) {
            return;
        }
        j0();
    }

    @Override // p078g1.v
    public final int P() {
        B0();
        return this.f18026g0.f18423n;
    }

    @Override // p078g1.v
    public final int Q() {
        B0();
        return this.f17994G;
    }

    @Override // p078g1.v
    public final p078g1.x R() {
        B0();
        return this.f18026g0.f18411a;
    }

    @Override // p078g1.v
    public final Looper S() {
        return this.f18040t;
    }

    @Override // p078g1.v
    public final boolean T() {
        B0();
        return this.f17995H;
    }

    @Override // p078g1.v
    public final p078g1.A U() {
        B0();
        return this.f18029i.a();
    }

    @Override // p078g1.v
    public final long V() {
        B0();
        if (this.f18026g0.f18411a.p()) {
            return this.f18030i0;
        }
        h0 h0Var = this.f18026g0;
        long j = 0;
        if (h0Var.f18420k.f18701d != h0Var.f18412b.f18701d) {
            return p114j1.A.Q(h0Var.f18411a.m(K(), this.f35247a, 0L).f35487l);
        }
        long j10 = h0Var.f18426q;
        if (this.f18026g0.f18420k.b()) {
            h0 h0Var2 = this.f18026g0;
            h0Var2.f18411a.g(h0Var2.f18420k.f18698a, this.f18035o).d(this.f18026g0.f18420k.f18699b);
        } else {
            j = j10;
        }
        h0 h0Var3 = this.f18026g0;
        p078g1.x xVar = h0Var3.f18411a;
        Object obj = h0Var3.f18420k.f18698a;
        g1.x.b bVar = this.f18035o;
        xVar.g(obj, bVar);
        return p114j1.A.Q(j + bVar.f35472e);
    }

    @Override // p078g1.v
    public final void Y(TextureView textureView) {
        B0();
        if (textureView == null) {
            j0();
            return;
        }
        t0();
        this.f18009V = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            p114j1.k.f("Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f18046z);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            w0(null);
            s0(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            w0(surface);
            this.f18005R = surface;
            s0(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // p078g1.v
    public final void a() {
        String str;
        boolean z10;
        StringBuilder sb2 = new StringBuilder("Release ");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" [AndroidXMedia3/1.6.0] [");
        sb2.append(p114j1.A.f40997b);
        sb2.append("] [");
        HashSet<String> hashSet = p078g1.q.f35391a;
        synchronized (p078g1.q.class) {
            str = p078g1.q.f35392b;
        }
        sb2.append(str);
        sb2.append("]");
        p114j1.k.e(sb2.toString());
        B0();
        this.f17989B.a();
        this.f17990C.a(false);
        this.f17991D.a(false);
        final P p10 = this.f18032l;
        synchronized (p10) {
            if (p10.f18069F || !p10.f18098k.getThread().isAlive()) {
                z10 = true;
            } else {
                p10.f18097i.i(7);
                p10.w0(new com.google.common.base.j() { // from class: androidx.media3.exoplayer.L
                    @Override // com.google.common.base.j
                    public final Object get() {
                        return Boolean.valueOf(p10.f18069F);
                    }
                }, p10.f18112w);
                z10 = p10.f18069F;
            }
        }
        if (!z10) {
            this.f18033m.e(10, new C7.g());
        }
        this.f18033m.d();
        this.j.g();
        this.f18041u.a(this.f18039s);
        h0 h0Var = this.f18026g0;
        if (h0Var.f18425p) {
            this.f18026g0 = h0Var.a();
        }
        h0 h0VarP0 = p0(this.f18026g0, 1);
        this.f18026g0 = h0VarP0;
        h0 h0VarC = h0VarP0.c(h0VarP0.f18412b);
        this.f18026g0 = h0VarC;
        h0VarC.f18426q = h0VarC.f18428s;
        this.f18026g0.f18427r = 0L;
        this.f18039s.a();
        t0();
        Surface surface = this.f18005R;
        if (surface != null) {
            surface.release();
            this.f18005R = null;
        }
        this.f18014a0 = p102i1.b.f36543b;
    }

    @Override // p078g1.v
    public final p078g1.r a0() {
        B0();
        return this.f18003P;
    }

    @Override // p078g1.v
    public final void b() {
        B0();
        h0 h0Var = this.f18026g0;
        if (h0Var.f18415e != 1) {
            return;
        }
        h0 h0VarF = h0Var.f(null);
        h0 h0VarP0 = p0(h0VarF, h0VarF.f18411a.p() ? 4 : 2);
        this.f17996I++;
        this.f18032l.f18097i.f(29).b();
        z0(h0VarP0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // p078g1.v
    public final long b0() {
        B0();
        return p114j1.A.Q(m0(this.f18026g0));
    }

    @Override // p078g1.v
    public final long c0() {
        B0();
        return this.f18042v;
    }

    @Override // p078g1.v
    public final void e(p078g1.u uVar) {
        B0();
        if (this.f18026g0.f18424o.equals(uVar)) {
            return;
        }
        h0 h0VarG = this.f18026g0.g(uVar);
        this.f17996I++;
        this.f18032l.f18097i.k(4, uVar).b();
        z0(h0VarG, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // p078g1.v
    public final boolean f() {
        B0();
        return this.f18026g0.f18412b.b();
    }

    @Override // p078g1.AbstractC2200f
    public final void f0(int i10, long j, boolean z10) {
        B0();
        if (i10 == -1) {
            return;
        }
        p241t7.b.e(i10 >= 0);
        p078g1.x xVar = this.f18026g0.f18411a;
        if (xVar.p() || i10 < xVar.o()) {
            this.f18039s.t();
            this.f17996I++;
            if (f()) {
                p114j1.k.f("seekTo ignored because an ad is playing");
                P.e eVar = new P.e(this.f18026g0);
                eVar.a(1);
                K k10 = (K) this.f18031k.f7400c;
                k10.getClass();
                k10.j.e(new A(k10, 0, eVar));
                return;
            }
            h0 h0VarH = this.f18026g0;
            int i11 = h0VarH.f18415e;
            if (i11 == 3 || (i11 == 4 && !xVar.p())) {
                h0VarH = this.f18026g0.h(2);
            }
            int iK = K();
            h0 h0VarQ0 = q0(h0VarH, xVar, r0(xVar, i10, j));
            long jF = p114j1.A.F(j);
            P p10 = this.f18032l;
            p10.getClass();
            p10.f18097i.k(3, new P.g(xVar, i10, jF)).b();
            z0(h0VarQ0, 0, true, 1, m0(h0VarQ0), iK, z10);
        }
    }

    @Override // p078g1.v
    public final p078g1.u g() {
        B0();
        return this.f18026g0.f18424o;
    }

    @Override // p078g1.v
    public final long h() {
        B0();
        return p114j1.A.Q(this.f18026g0.f18427r);
    }

    public final p078g1.r i0() {
        p078g1.x xVarR = R();
        if (xVarR.p()) {
            return this.f18024f0;
        }
        p078g1.p pVar = xVarR.m(K(), this.f35247a, 0L).f35479c;
        g1.r.a aVarA = this.f18024f0.a();
        p078g1.r rVar = pVar.f35358d;
        if (rVar != null) {
            CharSequence charSequence = rVar.f35395a;
            if (charSequence != null) {
                aVarA.f35420a = charSequence;
            }
            CharSequence charSequence2 = rVar.f35396b;
            if (charSequence2 != null) {
                aVarA.f35421b = charSequence2;
            }
            CharSequence charSequence3 = rVar.f35397c;
            if (charSequence3 != null) {
                aVarA.f35422c = charSequence3;
            }
            CharSequence charSequence4 = rVar.f35398d;
            if (charSequence4 != null) {
                aVarA.f35423d = charSequence4;
            }
            CharSequence charSequence5 = rVar.f35399e;
            if (charSequence5 != null) {
                aVarA.f35424e = charSequence5;
            }
            byte[] bArr = rVar.f35400f;
            if (bArr != null) {
                aVarA.f35425f = bArr == null ? null : (byte[]) bArr.clone();
                aVarA.f35426g = rVar.f35401g;
            }
            Integer num = rVar.f35402h;
            if (num != null) {
                aVarA.f35427h = num;
            }
            Integer num2 = rVar.f35403i;
            if (num2 != null) {
                aVarA.f35428i = num2;
            }
            Integer num3 = rVar.j;
            if (num3 != null) {
                aVarA.j = num3;
            }
            Boolean bool = rVar.f35404k;
            if (bool != null) {
                aVarA.f35429k = bool;
            }
            Integer num4 = rVar.f35405l;
            if (num4 != null) {
                aVarA.f35430l = num4;
            }
            Integer num5 = rVar.f35406m;
            if (num5 != null) {
                aVarA.f35430l = num5;
            }
            Integer num6 = rVar.f35407n;
            if (num6 != null) {
                aVarA.f35431m = num6;
            }
            Integer num7 = rVar.f35408o;
            if (num7 != null) {
                aVarA.f35432n = num7;
            }
            Integer num8 = rVar.f35409p;
            if (num8 != null) {
                aVarA.f35433o = num8;
            }
            Integer num9 = rVar.f35410q;
            if (num9 != null) {
                aVarA.f35434p = num9;
            }
            Integer num10 = rVar.f35411r;
            if (num10 != null) {
                aVarA.f35435q = num10;
            }
            CharSequence charSequence6 = rVar.f35412s;
            if (charSequence6 != null) {
                aVarA.f35436r = charSequence6;
            }
            CharSequence charSequence7 = rVar.f35413t;
            if (charSequence7 != null) {
                aVarA.f35437s = charSequence7;
            }
            CharSequence charSequence8 = rVar.f35414u;
            if (charSequence8 != null) {
                aVarA.f35438t = charSequence8;
            }
            Integer num11 = rVar.f35415v;
            if (num11 != null) {
                aVarA.f35439u = num11;
            }
            Integer num12 = rVar.f35416w;
            if (num12 != null) {
                aVarA.f35440v = num12;
            }
            CharSequence charSequence9 = rVar.f35417x;
            if (charSequence9 != null) {
                aVarA.f35441w = charSequence9;
            }
            CharSequence charSequence10 = rVar.f35418y;
            if (charSequence10 != null) {
                aVarA.f35442x = charSequence10;
            }
            Integer num13 = rVar.f35419z;
            if (num13 != null) {
                aVarA.f35443y = num13;
            }
            ImmutableList<String> immutableList = rVar.f35394A;
            if (!immutableList.isEmpty()) {
                aVarA.f35444z = ImmutableList.G(immutableList);
            }
        }
        return new p078g1.r(aVarA);
    }

    @Override // p078g1.v
    public final boolean j() {
        B0();
        return this.f18026g0.f18421l;
    }

    public final void j0() {
        B0();
        t0();
        w0(null);
        s0(0, 0);
    }

    @Override // p078g1.v
    public final void k(final boolean z10) {
        B0();
        if (this.f17995H != z10) {
            this.f17995H = z10;
            this.f18032l.f18097i.c(12, z10 ? 1 : 0, 0).b();
            j1.j.a<g1.v.c> aVar = new j1.j.a() { // from class: androidx.media3.exoplayer.B
                @Override // j1.j.a
                public final void invoke(Object obj) {
                    ((g1.v.c) obj).w(z10);
                }
            };
            p114j1.j<g1.v.c> jVar = this.f18033m;
            jVar.c(9, aVar);
            x0();
            jVar.b();
        }
    }

    public final j0 k0(j0.b bVar) {
        int iN0 = n0(this.f18026g0);
        p078g1.x xVar = this.f18026g0.f18411a;
        if (iN0 == -1) {
            iN0 = 0;
        }
        P p10 = this.f18032l;
        return new j0(p10, bVar, xVar, iN0, this.f18045y, p10.f18098k);
    }

    public final long l0(h0 h0Var) {
        if (!h0Var.f18412b.b()) {
            return p114j1.A.Q(m0(h0Var));
        }
        Object obj = h0Var.f18412b.f18698a;
        p078g1.x xVar = h0Var.f18411a;
        g1.x.b bVar = this.f18035o;
        xVar.g(obj, bVar);
        long j = h0Var.f18413c;
        return j == -9223372036854775807L ? p114j1.A.Q(xVar.m(n0(h0Var), this.f35247a, 0L).f35486k) : p114j1.A.Q(bVar.f35472e) + p114j1.A.Q(j);
    }

    @Override // p078g1.v
    public final int m() {
        B0();
        if (this.f18026g0.f18411a.p()) {
            return 0;
        }
        h0 h0Var = this.f18026g0;
        return h0Var.f18411a.b(h0Var.f18412b.f18698a);
    }

    public final long m0(h0 h0Var) {
        if (h0Var.f18411a.p()) {
            return p114j1.A.F(this.f18030i0);
        }
        long jK = h0Var.f18425p ? h0Var.k() : h0Var.f18428s;
        if (h0Var.f18412b.b()) {
            return jK;
        }
        p078g1.x xVar = h0Var.f18411a;
        Object obj = h0Var.f18412b.f18698a;
        g1.x.b bVar = this.f18035o;
        xVar.g(obj, bVar);
        return jK + bVar.f35472e;
    }

    @Override // p078g1.v
    public final void n(TextureView textureView) {
        B0();
        if (textureView == null || textureView != this.f18009V) {
            return;
        }
        j0();
    }

    public final int n0(h0 h0Var) {
        if (h0Var.f18411a.p()) {
            return this.f18028h0;
        }
        return h0Var.f18411a.g(h0Var.f18412b.f18698a, this.f18035o).f35470c;
    }

    @Override // p078g1.v
    public final p078g1.F o() {
        B0();
        return this.f18022e0;
    }

    public final h0 q0(h0 h0Var, p078g1.x xVar, Pair<Object, Long> pair) {
        p241t7.b.e(xVar.p() || pair != null);
        p078g1.x xVar2 = h0Var.f18411a;
        long jL0 = l0(h0Var);
        h0 h0VarI = h0Var.i(xVar);
        if (xVar.p()) {
            androidx.media3.exoplayer.source.h.b bVar = h0.f18410u;
            long jF = p114j1.A.F(this.f18030i0);
            h0 h0VarC = h0VarI.d(bVar, jF, jF, jF, 0L, p235t1.w.f47101d, this.f18015b, ImmutableList.K()).c(bVar);
            h0VarC.f18426q = h0VarC.f18428s;
            return h0VarC;
        }
        Object obj = h0VarI.f18412b.f18698a;
        boolean zEquals = obj.equals(pair.first);
        androidx.media3.exoplayer.source.h.b bVar2 = !zEquals ? new androidx.media3.exoplayer.source.h.b(pair.first) : h0VarI.f18412b;
        long jLongValue = ((Long) pair.second).longValue();
        long jF2 = p114j1.A.F(jL0);
        if (!xVar2.p()) {
            jF2 -= xVar2.g(obj, this.f18035o).f35472e;
        }
        if (!zEquals || jLongValue < jF2) {
            p241t7.b.k(!bVar2.b());
            h0 h0VarC2 = h0VarI.d(bVar2, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? p235t1.w.f47101d : h0VarI.f18418h, !zEquals ? this.f18015b : h0VarI.f18419i, !zEquals ? ImmutableList.K() : h0VarI.j).c(bVar2);
            h0VarC2.f18426q = jLongValue;
            return h0VarC2;
        }
        if (jLongValue != jF2) {
            p241t7.b.k(!bVar2.b());
            long jMax = Math.max(0L, h0VarI.f18427r - (jLongValue - jF2));
            long j = h0VarI.f18426q;
            if (h0VarI.f18420k.equals(h0VarI.f18412b)) {
                j = jLongValue + jMax;
            }
            h0 h0VarD = h0VarI.d(bVar2, jLongValue, jLongValue, jLongValue, jMax, h0VarI.f18418h, h0VarI.f18419i, h0VarI.j);
            h0VarD.f18426q = j;
            return h0VarD;
        }
        int iB = xVar.b(h0VarI.f18420k.f18698a);
        if (iB != -1 && xVar.f(iB, this.f18035o, false).f35470c == xVar.g(bVar2.f18698a, this.f18035o).f35470c) {
            return h0VarI;
        }
        xVar.g(bVar2.f18698a, this.f18035o);
        long jA = bVar2.b() ? this.f18035o.a(bVar2.f18699b, bVar2.f18700c) : this.f18035o.f35471d;
        h0 h0VarC3 = h0VarI.d(bVar2, h0VarI.f18428s, h0VarI.f18428s, h0VarI.f18414d, jA - h0VarI.f18428s, h0VarI.f18418h, h0VarI.f18419i, h0VarI.j).c(bVar2);
        h0VarC3.f18426q = jA;
        return h0VarC3;
    }

    @Override // p078g1.v
    public final int r() {
        B0();
        if (f()) {
            return this.f18026g0.f18412b.f18700c;
        }
        return -1;
    }

    public final Pair<Object, Long> r0(p078g1.x xVar, int i10, long j) {
        if (xVar.p()) {
            this.f18028h0 = i10;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.f18030i0 = j;
            return null;
        }
        if (i10 == -1 || i10 >= xVar.o()) {
            i10 = xVar.a(this.f17995H);
            j = p114j1.A.Q(xVar.m(i10, this.f35247a, 0L).f35486k);
        }
        return xVar.i(this.f35247a, this.f18035o, i10, p114j1.A.F(j));
    }

    @Override // p078g1.v
    public final void s(SurfaceView surfaceView) {
        B0();
        if (surfaceView instanceof p297y1.m) {
            t0();
            w0(surfaceView);
            v0(surfaceView.getHolder());
            return;
        }
        boolean z10 = surfaceView instanceof p308z1.j;
        a aVar = this.f18046z;
        if (z10) {
            t0();
            this.f18007T = (p308z1.j) surfaceView;
            j0 j0VarK0 = k0(this.f17988A);
            p241t7.b.k(!j0VarK0.f18459f);
            j0VarK0.f18456c = 10000;
            p308z1.j jVar = this.f18007T;
            p241t7.b.k(true ^ j0VarK0.f18459f);
            j0VarK0.f18457d = jVar;
            j0VarK0.b();
            this.f18007T.f48753b.add(aVar);
            w0(this.f18007T.getVideoSurface());
            v0(surfaceView.getHolder());
            return;
        }
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        B0();
        if (holder == null) {
            j0();
            return;
        }
        t0();
        this.f18008U = true;
        this.f18006S = holder;
        holder.addCallback(aVar);
        Surface surface = holder.getSurface();
        if (surface == null || !surface.isValid()) {
            w0(null);
            s0(0, 0);
        } else {
            w0(surface);
            Rect surfaceFrame = holder.getSurfaceFrame();
            s0(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    public final void s0(final int i10, final int i11) {
        p114j1.s sVar = this.f18011X;
        if (i10 == sVar.f41066a && i11 == sVar.f41067b) {
            return;
        }
        this.f18011X = new p114j1.s(i10, i11);
        this.f18033m.e(24, new j1.j.a() { // from class: androidx.media3.exoplayer.w
            @Override // j1.j.a
            public final void invoke(Object obj) {
                ((g1.v.c) obj).Z(i10, i11);
            }
        });
        u0(2, 14, new p114j1.s(i10, i11));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setImageOutput(ImageOutput imageOutput) {
        B0();
        u0(4, 15, imageOutput);
    }

    public final void t0() {
        p308z1.j jVar = this.f18007T;
        a aVar = this.f18046z;
        if (jVar != null) {
            j0 j0VarK0 = k0(this.f17988A);
            p241t7.b.k(!j0VarK0.f18459f);
            j0VarK0.f18456c = 10000;
            p241t7.b.k(!j0VarK0.f18459f);
            j0VarK0.f18457d = null;
            j0VarK0.b();
            this.f18007T.f48753b.remove(aVar);
            this.f18007T = null;
        }
        TextureView textureView = this.f18009V;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != aVar) {
                p114j1.k.f("SurfaceTextureListener already unset or replaced.");
            } else {
                this.f18009V.setSurfaceTextureListener(null);
            }
            this.f18009V = null;
        }
        SurfaceHolder surfaceHolder = this.f18006S;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(aVar);
            this.f18006S = null;
        }
    }

    @Override // p078g1.v
    public final void u(g1.v.c cVar) {
        cVar.getClass();
        this.f18033m.a(cVar);
    }

    public final void u0(int i10, int i11, Object obj) {
        for (m0 m0Var : this.f18025g) {
            if (i10 == -1 || m0Var.E() == i10) {
                j0 j0VarK0 = k0(m0Var);
                p241t7.b.k(!j0VarK0.f18459f);
                j0VarK0.f18456c = i11;
                p241t7.b.k(!j0VarK0.f18459f);
                j0VarK0.f18457d = obj;
                j0VarK0.b();
            }
        }
        for (m0 m0Var2 : this.f18027h) {
            if (m0Var2 != null && (i10 == -1 || m0Var2.E() == i10)) {
                j0 j0VarK1 = k0(m0Var2);
                p241t7.b.k(!j0VarK1.f18459f);
                j0VarK1.f18456c = i11;
                p241t7.b.k(!j0VarK1.f18459f);
                j0VarK1.f18457d = obj;
                j0VarK1.b();
            }
        }
    }

    @Override // p078g1.v
    public final void v(g1.v.c cVar) {
        B0();
        cVar.getClass();
        p114j1.j<g1.v.c> jVar = this.f18033m;
        jVar.f();
        CopyOnWriteArraySet<j1.j.c<g1.v.c>> copyOnWriteArraySet = jVar.f41026d;
        for (j1.j.c<g1.v.c> cVar2 : copyOnWriteArraySet) {
            if (cVar2.f41032a.equals(cVar)) {
                cVar2.f41035d = true;
                if (cVar2.f41034c) {
                    cVar2.f41034c = false;
                    p078g1.m mVarB = cVar2.f41033b.b();
                    jVar.f41025c.f(cVar2.f41032a, mVarB);
                }
                copyOnWriteArraySet.remove(cVar2);
            }
        }
    }

    public final void v0(SurfaceHolder surfaceHolder) {
        this.f18008U = false;
        this.f18006S = surfaceHolder;
        surfaceHolder.addCallback(this.f18046z);
        Surface surface = this.f18006S.getSurface();
        if (surface == null || !surface.isValid()) {
            s0(0, 0);
        } else {
            Rect surfaceFrame = this.f18006S.getSurfaceFrame();
            s0(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    public final void w0(Object obj) {
        boolean z10;
        Object obj2 = this.f18004Q;
        boolean z11 = (obj2 == null || obj2 == obj) ? false : true;
        long j = z11 ? this.f17992E : -9223372036854775807L;
        P p10 = this.f18032l;
        synchronized (p10) {
            if (!p10.f18069F && p10.f18098k.getThread().isAlive()) {
                AtomicBoolean atomicBoolean = new AtomicBoolean();
                p10.f18097i.k(30, new Pair(obj, atomicBoolean)).b();
                if (j != -9223372036854775807L) {
                    p10.w0(new N(0, atomicBoolean), j);
                    z10 = atomicBoolean.get();
                }
            }
            z10 = true;
        }
        if (z11) {
            Object obj3 = this.f18004Q;
            Surface surface = this.f18005R;
            if (obj3 == surface) {
                surface.release();
                this.f18005R = null;
            }
        }
        this.f18004Q = obj;
        if (z10) {
            return;
        }
        ExoPlaybackException exoPlaybackException = new ExoPlaybackException(2, new ExoTimeoutException(3), 1003);
        h0 h0Var = this.f18026g0;
        h0 h0VarC = h0Var.c(h0Var.f18412b);
        h0VarC.f18426q = h0VarC.f18428s;
        h0VarC.f18427r = 0L;
        h0 h0VarF = p0(h0VarC, 1).f(exoPlaybackException);
        this.f17996I++;
        this.f18032l.f18097i.f(6).b();
        z0(h0VarF, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void x0() {
        g1.v.a aVar = this.f18002O;
        int i10 = p114j1.A.f40996a;
        p078g1.v vVar = this.f18023f;
        boolean zF = vVar.f();
        boolean zB = vVar.B();
        boolean zQ = vVar.q();
        boolean zE = vVar.E();
        boolean zD0 = vVar.d0();
        boolean zO = vVar.O();
        boolean zP = vVar.R().p();
        g1.v.a.C0370a c0370a = new g1.v.a.C0370a();
        p078g1.m mVar = this.f18017c.f35455a;
        g1.m.a aVar2 = c0370a.f35456a;
        aVar2.getClass();
        for (int i11 = 0; i11 < mVar.f35273a.size(); i11++) {
            aVar2.a(mVar.a(i11));
        }
        boolean z10 = !zF;
        c0370a.a(4, z10);
        c0370a.a(5, zB && !zF);
        c0370a.a(6, zQ && !zF);
        c0370a.a(7, !zP && (zQ || !zD0 || zB) && !zF);
        c0370a.a(8, zE && !zF);
        c0370a.a(9, !zP && (zE || (zD0 && zO)) && !zF);
        c0370a.a(10, z10);
        c0370a.a(11, zB && !zF);
        c0370a.a(12, zB && !zF);
        g1.v.a aVar3 = new g1.v.a(aVar2.b());
        this.f18002O = aVar3;
        if (aVar3.equals(aVar)) {
            return;
        }
        this.f18033m.c(13, new C(this));
    }

    @Override // p078g1.v
    public final long y() {
        B0();
        return this.f18043w;
    }

    public final void y0(int i10, boolean z10) {
        h0 h0VarA = this.f18026g0;
        int i11 = h0VarA.f18423n;
        int i12 = (i11 != 1 || z10) ? 0 : 1;
        if (h0VarA.f18421l == z10 && i11 == i12 && h0VarA.f18422m == i10) {
            return;
        }
        this.f17996I++;
        if (h0VarA.f18425p) {
            h0VarA = h0VarA.a();
        }
        h0 h0VarE = h0VarA.e(i10, i12, z10);
        this.f18032l.f18097i.c(1, z10 ? 1 : 0, i10 | (i12 << 4)).b();
        z0(h0VarE, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // p078g1.v
    public final void z(p078g1.A a10) {
        B0();
        p259v1.x xVar = this.f18029i;
        xVar.getClass();
        if (!(xVar instanceof p259v1.j) || a10.equals(xVar.a())) {
            return;
        }
        xVar.g(a10);
        this.f18033m.e(19, new S6.i(1, a10));
    }

    public final void z0(final h0 h0Var, final int i10, boolean z10, final int i11, long j, int i12, boolean z11) {
        Pair pair;
        int i13;
        final p078g1.p pVar;
        int i14;
        Object obj;
        p078g1.p pVar2;
        Object obj2;
        int i15;
        long j10;
        long j11;
        long jO0;
        long jO1;
        Object obj3;
        p078g1.p pVar3;
        Object obj4;
        int i16;
        h0 h0Var2 = this.f18026g0;
        this.f18026g0 = h0Var;
        boolean zEquals = h0Var2.f18411a.equals(h0Var.f18411a);
        p078g1.x xVar = h0Var2.f18411a;
        p078g1.x xVar2 = h0Var.f18411a;
        if (xVar2.p() && xVar.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (xVar2.p() != xVar.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else {
            androidx.media3.exoplayer.source.h.b bVar = h0Var2.f18412b;
            Object obj5 = bVar.f18698a;
            g1.x.b bVar2 = this.f18035o;
            int i17 = xVar.g(obj5, bVar2).f35470c;
            g1.x.c cVar = this.f35247a;
            Object obj6 = xVar.m(i17, cVar, 0L).f35477a;
            androidx.media3.exoplayer.source.h.b bVar3 = h0Var.f18412b;
            if (!obj6.equals(xVar2.m(xVar2.g(bVar3.f18698a, bVar2).f35470c, cVar, 0L).f35477a)) {
                if (z10 && i11 == 0) {
                    i13 = 1;
                } else if (z10 && i11 == 1) {
                    i13 = 2;
                } else {
                    if (zEquals) {
                        throw new IllegalStateException();
                    }
                    i13 = 3;
                }
                pair = new Pair(Boolean.TRUE, Integer.valueOf(i13));
            } else if (z10 && i11 == 0 && bVar.f18701d < bVar3.f18701d) {
                pair = new Pair(Boolean.TRUE, 0);
            } else {
                pair = (z10 && i11 == 1 && z11) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
            }
        }
        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        final int iIntValue = ((Integer) pair.second).intValue();
        if (zBooleanValue) {
            pVar = h0Var.f18411a.p() ? null : h0Var.f18411a.m(h0Var.f18411a.g(h0Var.f18412b.f18698a, this.f18035o).f35470c, this.f35247a, 0L).f35479c;
            this.f18024f0 = p078g1.r.f35393B;
        } else {
            pVar = null;
        }
        if (zBooleanValue || !h0Var2.j.equals(h0Var.j)) {
            g1.r.a aVarA = this.f18024f0.a();
            List<p078g1.s> list = h0Var.j;
            for (int i18 = 0; i18 < list.size(); i18++) {
                p078g1.s sVar = list.get(i18);
                int i19 = 0;
                while (true) {
                    g1.s.a[] aVarArr = sVar.f35445a;
                    if (i19 < aVarArr.length) {
                        aVarArr[i19].b(aVarA);
                        i19++;
                    }
                }
            }
            this.f18024f0 = new p078g1.r(aVarA);
        }
        p078g1.r rVarI0 = i0();
        boolean zEquals2 = rVarI0.equals(this.f18003P);
        this.f18003P = rVarI0;
        boolean z12 = h0Var2.f18421l != h0Var.f18421l;
        boolean z13 = h0Var2.f18415e != h0Var.f18415e;
        if (z13 || z12) {
            A0();
        }
        boolean z14 = h0Var2.f18417g != h0Var.f18417g;
        if (!zEquals) {
            this.f18033m.c(0, new j1.j.a() { // from class: androidx.media3.exoplayer.z
                @Override // j1.j.a
                public final void invoke(Object obj7) {
                    p078g1.x xVar3 = h0Var.f18411a;
                    ((g1.v.c) obj7).G(i10);
                }
            });
        }
        if (z10) {
            g1.x.b bVar4 = new g1.x.b();
            if (h0Var2.f18411a.p()) {
                i14 = i12;
                obj = null;
                pVar2 = null;
                obj2 = null;
                i15 = -1;
            } else {
                Object obj7 = h0Var2.f18412b.f18698a;
                h0Var2.f18411a.g(obj7, bVar4);
                int i20 = bVar4.f35470c;
                int iB = h0Var2.f18411a.b(obj7);
                obj = h0Var2.f18411a.m(i20, this.f35247a, 0L).f35477a;
                pVar2 = this.f35247a.f35479c;
                i14 = i20;
                i15 = iB;
                obj2 = obj7;
            }
            if (i11 == 0) {
                if (h0Var2.f18412b.b()) {
                    androidx.media3.exoplayer.source.h.b bVar5 = h0Var2.f18412b;
                    jO0 = bVar4.a(bVar5.f18699b, bVar5.f18700c);
                    jO1 = o0(h0Var2);
                } else {
                    if (h0Var2.f18412b.f18702e != -1) {
                        jO0 = o0(this.f18026g0);
                    } else {
                        j10 = bVar4.f35472e;
                        j11 = bVar4.f35471d;
                        jO0 = j10 + j11;
                    }
                    jO1 = jO0;
                }
            } else if (h0Var2.f18412b.b()) {
                jO0 = h0Var2.f18428s;
                jO1 = o0(h0Var2);
            } else {
                j10 = bVar4.f35472e;
                j11 = h0Var2.f18428s;
                jO0 = j10 + j11;
                jO1 = jO0;
            }
            long jQ = p114j1.A.Q(jO0);
            long jQ2 = p114j1.A.Q(jO1);
            androidx.media3.exoplayer.source.h.b bVar6 = h0Var2.f18412b;
            final g1.v.d dVar = new g1.v.d(obj, i14, pVar2, obj2, i15, jQ, jQ2, bVar6.f18699b, bVar6.f18700c);
            int iK = K();
            if (this.f18026g0.f18411a.p()) {
                obj3 = null;
                pVar3 = null;
                obj4 = null;
                i16 = -1;
            } else {
                h0 h0Var3 = this.f18026g0;
                Object obj8 = h0Var3.f18412b.f18698a;
                h0Var3.f18411a.g(obj8, this.f18035o);
                int iB2 = this.f18026g0.f18411a.b(obj8);
                p078g1.x xVar3 = this.f18026g0.f18411a;
                g1.x.c cVar2 = this.f35247a;
                i16 = iB2;
                obj3 = xVar3.m(iK, cVar2, 0L).f35477a;
                pVar3 = cVar2.f35479c;
                obj4 = obj8;
            }
            long jQ3 = p114j1.A.Q(j);
            long jQ4 = this.f18026g0.f18412b.b() ? p114j1.A.Q(o0(this.f18026g0)) : jQ3;
            androidx.media3.exoplayer.source.h.b bVar7 = this.f18026g0.f18412b;
            final g1.v.d dVar2 = new g1.v.d(obj3, iK, pVar3, obj4, i16, jQ3, jQ4, bVar7.f18699b, bVar7.f18700c);
            this.f18033m.c(11, new j1.j.a() { // from class: androidx.media3.exoplayer.F
                @Override // j1.j.a
                public final void invoke(Object obj9) {
                    g1.v.c cVar3 = (g1.v.c) obj9;
                    cVar3.getClass();
                    cVar3.g(i11, dVar, dVar2);
                }
            });
        } else {
            z13 = z13;
            z14 = z14;
        }
        if (zBooleanValue) {
            this.f18033m.c(1, new j1.j.a() { // from class: androidx.media3.exoplayer.G
                @Override // j1.j.a
                public final void invoke(Object obj9) {
                    ((g1.v.c) obj9).z(pVar, iIntValue);
                }
            });
        }
        if (h0Var2.f18416f != h0Var.f18416f) {
            this.f18033m.c(10, new I4.e(h0Var));
            if (h0Var.f18416f != null) {
                this.f18033m.c(10, new I4.f(3, h0Var));
            }
        }
        p259v1.y yVar = h0Var2.f18419i;
        p259v1.y yVar2 = h0Var.f18419i;
        if (yVar != yVar2) {
            this.f18029i.c(yVar2.f47627e);
            this.f18033m.c(2, new I4.r(h0Var));
        }
        if (!zEquals2) {
            this.f18033m.c(14, new C1401t(this.f18003P));
        }
        if (z14) {
            this.f18033m.c(3, new C7.d(h0Var));
        }
        if (z13 || z12) {
            this.f18033m.c(-1, new C1402u(h0Var));
        }
        if (z13) {
            this.f18033m.c(4, new C1403v(h0Var));
        }
        if (z12 || h0Var2.f18422m != h0Var.f18422m) {
            this.f18033m.c(5, new S6.k(1, h0Var));
        }
        if (h0Var2.f18423n != h0Var.f18423n) {
            this.f18033m.c(6, new Y1.d(2, h0Var));
        }
        if (h0Var2.l() != h0Var.l()) {
            this.f18033m.c(7, new androidx.compose.ui.graphics.colorspace.n(h0Var));
        }
        if (!h0Var2.f18424o.equals(h0Var.f18424o)) {
            this.f18033m.c(12, new E(0, h0Var));
        }
        x0();
        this.f18033m.b();
        if (h0Var2.f18425p != h0Var.f18425p) {
            Iterator<ExoPlayer.a> it = this.f18034n.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    /* JADX INFO: compiled from: ExoPlayerImpl.java */
    public final class a implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, z1.j.b, C1385c.b, ExoPlayer.a {
        public a() {
        }

        @Override // androidx.media3.exoplayer.ExoPlayer.a
        public final void a() {
            K.this.A0();
        }

        @Override // z1.j.b
        public final void b() {
            K.this.w0(null);
        }

        @Override // z1.j.b
        public final void c(Surface surface) {
            K.this.w0(surface);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            K k10 = K.this;
            k10.getClass();
            Surface surface = new Surface(surfaceTexture);
            k10.w0(surface);
            k10.f18005R = surface;
            k10.s0(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            K k10 = K.this;
            k10.w0(null);
            k10.s0(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            K.this.s0(i10, i11);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            K.this.s0(i11, i12);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            K k10 = K.this;
            if (k10.f18008U) {
                k10.w0(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            K k10 = K.this;
            if (k10.f18008U) {
                k10.w0(null);
            }
            k10.s0(0, 0);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }
}
