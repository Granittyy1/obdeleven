package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import com.braze.Constants;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import me.zhanghai.android.materialprogressbar.R;
import p078g1.C2198d;

/* JADX INFO: compiled from: ExoPlayerImplInternal.java */
/* JADX INFO: loaded from: classes.dex */
public final class P implements Handler.Callback, androidx.media3.exoplayer.source.g.a, j0.a {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final long f18063r0 = p114j1.A.Q(10000);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final boolean f18064A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C1388f f18065B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public r0 f18066C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public h0 f18067D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public e f18068E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f18069F;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f18071H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f18072I;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f18074K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f18075L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f18076M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f18077N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f18078O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f18079P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f18080Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public g f18081R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public long f18082S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public long f18083T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public int f18084U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f18085V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public ExoPlaybackException f18086W;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public ExoPlayer.c f18088Y;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p0[] f18090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0[] f18091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean[] f18092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p259v1.x f18093e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p259v1.y f18094f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final S f18095g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p272w1.c f18096h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p114j1.g f18097i;
    public final i0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Looper f18098k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g1.x.c f18099l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g1.x.b f18100m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f18101n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f18102o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C1394l f18103p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f18104p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList<d> f18105q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p114j1.t f18107r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final X8.m f18108s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Y f18109t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final g0 f18110u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C1392j f18111v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f18112w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p162n1.u f18113x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final p162n1.a f18114y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final p114j1.g f18115z;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public long f18089Z = -9223372036854775807L;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f18070G = false;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public float f18106q0 = 1.0f;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public long f18087X = -9223372036854775807L;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public long f18073J = -9223372036854775807L;

    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    public class a implements m0.a {
        public a() {
        }

        @Override // androidx.media3.exoplayer.m0.a
        public final void a() {
            P.this.f18078O = true;
        }

        @Override // androidx.media3.exoplayer.m0.a
        public final void b() {
            P p10 = P.this;
            p10.getClass();
            if (p10.f18079P) {
                p10.f18097i.i(2);
            }
        }
    }

    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f18117a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p235t1.s f18118b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f18119c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f18120d;

        public b() {
            throw null;
        }

        public b(ArrayList arrayList, p235t1.s sVar, int i10, long j) {
            this.f18117a = arrayList;
            this.f18118b = sVar;
            this.f18119c = i10;
            this.f18120d = j;
        }
    }

    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    public static class c {
    }

    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    public static final class d implements Comparable<d> {
        @Override // java.lang.Comparable
        public final int compareTo(d dVar) {
            dVar.getClass();
            return 0;
        }
    }

    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f18121a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public h0 f18122b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f18123c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f18124d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f18125e;

        public e(h0 h0Var) {
            this.f18122b = h0Var;
        }

        public final void a(int i10) {
            this.f18121a |= i10 > 0;
            this.f18123c += i10;
        }
    }

    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.media3.exoplayer.source.h.b f18126a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f18127b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f18128c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f18129d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f18130e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f18131f;

        public f(androidx.media3.exoplayer.source.h.b bVar, long j, long j10, boolean z10, boolean z11, boolean z12) {
            this.f18126a = bVar;
            this.f18127b = j;
            this.f18128c = j10;
            this.f18129d = z10;
            this.f18130e = z11;
            this.f18131f = z12;
        }
    }

    /* JADX INFO: compiled from: ExoPlayerImplInternal.java */
    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p078g1.x f18132a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f18133b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f18134c;

        public g(p078g1.x xVar, int i10, long j) {
            this.f18132a = xVar;
            this.f18133b = i10;
            this.f18134c = j;
        }
    }

    public P(Context context, m0[] m0VarArr, m0[] m0VarArr2, p259v1.x xVar, p259v1.y yVar, S s10, p272w1.c cVar, int i10, boolean z10, p162n1.a aVar, r0 r0Var, C1392j c1392j, long j, Looper looper, p114j1.t tVar, X8.m mVar, p162n1.u uVar, ExoPlayer.c cVar2) {
        Looper looper2;
        this.f18108s = mVar;
        this.f18093e = xVar;
        this.f18094f = yVar;
        this.f18095g = s10;
        this.f18096h = cVar;
        this.f18075L = i10;
        this.f18076M = z10;
        this.f18066C = r0Var;
        this.f18111v = c1392j;
        this.f18112w = j;
        boolean z11 = false;
        this.f18107r = tVar;
        this.f18113x = uVar;
        this.f18088Y = cVar2;
        this.f18114y = aVar;
        this.f18101n = s10.f();
        this.f18102o = s10.b();
        g1.x.a aVar2 = p078g1.x.f35467a;
        h0 h0VarJ = h0.j(yVar);
        this.f18067D = h0VarJ;
        this.f18068E = new e(h0VarJ);
        this.f18091c = new n0[m0VarArr.length];
        this.f18092d = new boolean[m0VarArr.length];
        n0.a aVarB = xVar.b();
        this.f18090b = new p0[m0VarArr.length];
        boolean z12 = false;
        for (int i11 = 0; i11 < m0VarArr.length; i11++) {
            m0VarArr[i11].o(i11, uVar, tVar);
            this.f18091c[i11] = m0VarArr[i11].q();
            if (aVarB != null) {
                AbstractC1389g abstractC1389g = (AbstractC1389g) this.f18091c[i11];
                synchronized (abstractC1389g.f18362b) {
                    abstractC1389g.f18377r = aVarB;
                }
            }
            m0 m0Var = m0VarArr2[i11];
            if (m0Var != null) {
                m0Var.o(m0VarArr.length + i11, uVar, tVar);
                z12 = true;
            }
            this.f18090b[i11] = new p0(m0VarArr[i11], m0VarArr2[i11], i11);
        }
        this.f18064A = z12;
        this.f18103p = new C1394l(this, tVar);
        this.f18105q = new ArrayList<>();
        this.f18099l = new g1.x.c();
        this.f18100m = new g1.x.b();
        xVar.f47621a = this;
        xVar.f47622b = cVar;
        this.f18085V = true;
        p114j1.u uVarA = tVar.a(looper, null);
        this.f18115z = uVarA;
        this.f18109t = new Y(aVar, uVarA, new C1401t(this), cVar2);
        this.f18110u = new g0(this, aVar, uVarA, uVar);
        i0 i0Var = new i0();
        this.j = i0Var;
        synchronized (i0Var.f18435a) {
            try {
                if (i0Var.f18436b == null) {
                    if (i0Var.f18438d == 0 && i0Var.f18437c == null) {
                        z11 = true;
                    }
                    p241t7.b.k(z11);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    i0Var.f18437c = handlerThread;
                    handlerThread.start();
                    i0Var.f18436b = i0Var.f18437c.getLooper();
                }
                i0Var.f18438d++;
                looper2 = i0Var.f18436b;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f18098k = looper2;
        this.f18097i = tVar.a(looper2, this);
        this.f18065B = new C1388f(context, looper2, this);
    }

    public static Pair<Object, Long> P(p078g1.x xVar, g gVar, boolean z10, int i10, boolean z11, g1.x.c cVar, g1.x.b bVar) {
        int iQ;
        p078g1.x xVar2 = gVar.f18132a;
        if (xVar.p()) {
            return null;
        }
        p078g1.x xVar3 = xVar2.p() ? xVar : xVar2;
        try {
            Pair<Object, Long> pairI = xVar3.i(cVar, bVar, gVar.f18133b, gVar.f18134c);
            if (xVar.equals(xVar3)) {
                return pairI;
            }
            if (xVar.b(pairI.first) != -1) {
                return (xVar3.g(pairI.first, bVar).f35473f && xVar3.m(bVar.f35470c, cVar, 0L).f35488m == xVar3.b(pairI.first)) ? xVar.i(cVar, bVar, xVar.g(pairI.first, bVar).f35470c, gVar.f18134c) : pairI;
            }
            if (z10 && (iQ = Q(cVar, bVar, i10, z11, pairI.first, xVar3, xVar)) != -1) {
                return xVar.i(cVar, bVar, iQ, -9223372036854775807L);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    public static int Q(g1.x.c cVar, g1.x.b bVar, int i10, boolean z10, Object obj, p078g1.x xVar, p078g1.x xVar2) {
        Object obj2 = xVar.m(xVar.g(obj, bVar).f35470c, cVar, 0L).f35477a;
        for (int i11 = 0; i11 < xVar2.o(); i11++) {
            if (xVar2.m(i11, cVar, 0L).f35477a.equals(obj2)) {
                return i11;
            }
        }
        int iB = xVar.b(obj);
        int iH = xVar.h();
        int iD = iB;
        int iB2 = -1;
        for (int i12 = 0; i12 < iH && iB2 == -1; i12++) {
            iD = xVar.d(iD, bVar, cVar, i10, z10);
            if (iD == -1) {
                break;
            }
            iB2 = xVar2.b(xVar.l(iD));
        }
        if (iB2 == -1) {
            return -1;
        }
        return xVar2.f(iB2, bVar, false).f35470c;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.media3.exoplayer.source.g, androidx.media3.exoplayer.source.m, java.lang.Object] */
    public static boolean x(V v10) {
        if (v10 == null) {
            return false;
        }
        try {
            ?? r10 = v10.f18148a;
            if (v10.f18152e) {
                for (p235t1.r rVar : v10.f18150c) {
                    if (rVar != null) {
                        rVar.a();
                    }
                }
            } else {
                r10.d();
            }
            return (!v10.f18152e ? 0L : r10.c()) != Long.MIN_VALUE;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.media3.exoplayer.source.g, androidx.media3.exoplayer.source.m, java.lang.Object] */
    public final void A() {
        Y y10 = this.f18109t;
        y10.k();
        V v10 = y10.f18188n;
        if (v10 != null) {
            if (!v10.f18151d || v10.f18152e) {
                ?? r10 = v10.f18148a;
                if (r10.i()) {
                    return;
                }
                p078g1.x xVar = this.f18067D.f18411a;
                if (v10.f18152e) {
                    r10.q();
                }
                if (this.f18095g.e()) {
                    if (!v10.f18151d) {
                        W w3 = v10.f18154g;
                        v10.f18151d = true;
                        r10.m(this, w3.f18164b);
                        return;
                    }
                    T.a aVar = new T.a();
                    aVar.f18145a = this.f18082S - v10.f18162p;
                    float f10 = this.f18103p.g().f35452a;
                    p241t7.b.e(f10 > 0.0f || f10 == -3.4028235E38f);
                    aVar.f18146b = f10;
                    long j = this.f18073J;
                    p241t7.b.e(j >= 0 || j == -9223372036854775807L);
                    aVar.f18147c = j;
                    T t8 = new T(aVar);
                    p241t7.b.k(v10.f18159m == null);
                    r10.a(t8);
                }
            }
        }
    }

    public final void B() {
        e eVar = this.f18068E;
        h0 h0Var = this.f18067D;
        boolean z10 = eVar.f18121a | (eVar.f18122b != h0Var);
        eVar.f18121a = z10;
        eVar.f18122b = h0Var;
        if (z10) {
            K k10 = (K) this.f18108s.f7400c;
            k10.getClass();
            k10.j.e(new A(k10, 0, eVar));
            this.f18068E = new e(this.f18067D);
        }
    }

    public final void C(int i10) throws ExoPlaybackException, IOException {
        p0 p0Var = this.f18090b[i10];
        try {
            V v10 = this.f18109t.j;
            v10.getClass();
            m0 m0VarC = p0Var.c(v10);
            m0VarC.getClass();
            m0VarC.z();
        } catch (IOException | RuntimeException e10) {
            int iE = p0Var.f18593a.E();
            if (iE != 3 && iE != 5) {
                throw e10;
            }
            p259v1.y yVar = this.f18109t.j.f18161o;
            p114j1.k.d("ExoPlayerImplInternal", "Disabling track due to error: " + p078g1.n.d(yVar.f47625c[i10].h()), e10);
            p259v1.y yVar2 = new p259v1.y((o0[]) yVar.f47624b.clone(), (p259v1.t[]) yVar.f47625c.clone(), yVar.f47626d, yVar.f47627e);
            yVar2.f47624b[i10] = null;
            yVar2.f47625c[i10] = null;
            f(i10);
            V v11 = this.f18109t.j;
            v11.a(yVar2, this.f18067D.f18428s, false, new boolean[v11.j.length]);
        }
    }

    public final void D(final int i10, final boolean z10) {
        boolean[] zArr = this.f18092d;
        if (zArr[i10] != z10) {
            zArr[i10] = z10;
            this.f18115z.e(new Runnable() { // from class: androidx.media3.exoplayer.M
                @Override // java.lang.Runnable
                public final void run() {
                    P p10 = this.f18055b;
                    p0[] p0VarArr = p10.f18090b;
                    int i11 = i10;
                    p10.f18114y.y(i11, p0VarArr[i11].f18593a.E(), z10);
                }
            });
        }
    }

    public final void E() throws Throwable {
        t(this.f18110u.b(), true);
    }

    public final void F(c cVar) throws Throwable {
        this.f18068E.a(1);
        cVar.getClass();
        g0 g0Var = this.f18110u;
        g0Var.getClass();
        p241t7.b.e(g0Var.f18379b.size() >= 0);
        g0Var.j = null;
        t(g0Var.b(), false);
    }

    public final void G() throws ExoPlaybackException {
        this.f18068E.a(1);
        int i10 = 0;
        L(false, false, false, true);
        this.f18095g.g(this.f18113x);
        h0(this.f18067D.f18411a.p() ? 4 : 2);
        h0 h0Var = this.f18067D;
        boolean z10 = h0Var.f18421l;
        s0(this.f18065B.d(h0Var.f18415e, z10), h0Var.f18423n, h0Var.f18422m, z10);
        p272w1.f fVarE = this.f18096h.e();
        g0 g0Var = this.f18110u;
        p241t7.b.k(!g0Var.f18387k);
        g0Var.f18388l = fVarE;
        while (true) {
            ArrayList arrayList = g0Var.f18379b;
            if (i10 >= arrayList.size()) {
                g0Var.f18387k = true;
                this.f18097i.i(2);
                return;
            } else {
                g0.c cVar = (g0.c) arrayList.get(i10);
                g0Var.e(cVar);
                g0Var.f18384g.add(cVar);
                i10++;
            }
        }
    }

    public final void H() {
        try {
            L(true, false, true, false);
            I();
            this.f18095g.c(this.f18113x);
            C1388f c1388f = this.f18065B;
            c1388f.f18350c = null;
            c1388f.a();
            c1388f.c(0);
            this.f18093e.d();
            h0(1);
            this.j.a();
            synchronized (this) {
                this.f18069F = true;
                notifyAll();
            }
        } catch (Throwable th) {
            this.j.a();
            synchronized (this) {
                this.f18069F = true;
                notifyAll();
                throw th;
            }
        }
    }

    public final void I() {
        for (int i10 = 0; i10 < this.f18090b.length; i10++) {
            AbstractC1389g abstractC1389g = (AbstractC1389g) this.f18091c[i10];
            synchronized (abstractC1389g.f18362b) {
                abstractC1389g.f18377r = null;
            }
            p0 p0Var = this.f18090b[i10];
            p0Var.f18593a.a();
            p0Var.f18597e = false;
            m0 m0Var = p0Var.f18595c;
            if (m0Var != null) {
                m0Var.a();
                p0Var.f18598f = false;
            }
        }
    }

    public final void J(int i10, int i11, p235t1.s sVar) throws Throwable {
        this.f18068E.a(1);
        g0 g0Var = this.f18110u;
        g0Var.getClass();
        p241t7.b.e(i10 >= 0 && i10 <= i11 && i11 <= g0Var.f18379b.size());
        g0Var.j = sVar;
        g0Var.g(i10, i11);
        t(g0Var.b(), false);
    }

    public final void K() throws ExoPlaybackException {
        boolean z10;
        float f10 = this.f18103p.g().f35452a;
        Y y10 = this.f18109t;
        V v10 = y10.j;
        V v11 = y10.f18185k;
        p259v1.y yVar = null;
        V v12 = v10;
        boolean z11 = true;
        while (v12 != null && v12.f18152e) {
            h0 h0Var = this.f18067D;
            p259v1.y yVarJ = v12.j(f10, h0Var.f18411a, h0Var.f18421l);
            p259v1.y yVar2 = v12 == this.f18109t.j ? yVarJ : yVar;
            p259v1.y yVar3 = v12.f18161o;
            if (yVar3 != null) {
                int length = yVar3.f47625c.length;
                p259v1.t[] tVarArr = yVarJ.f47625c;
                if (length == tVarArr.length) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= tVarArr.length) {
                            if (v12 == v11) {
                                z11 = false;
                            }
                            v12 = v12.f18159m;
                            yVar = yVar2;
                        } else if (yVarJ.a(yVar3, i10)) {
                            i10++;
                        }
                    }
                }
            }
            if (z11) {
                Y y11 = this.f18109t;
                V v13 = y11.j;
                boolean z12 = (y11.o(v13) & 1) != 0;
                boolean[] zArr = new boolean[this.f18090b.length];
                yVar2.getClass();
                long jA = v13.a(yVar2, this.f18067D.f18428s, z12, zArr);
                h0 h0Var2 = this.f18067D;
                boolean z13 = (h0Var2.f18415e == 4 || jA == h0Var2.f18428s) ? false : true;
                h0 h0Var3 = this.f18067D;
                this.f18067D = w(h0Var3.f18412b, jA, h0Var3.f18413c, h0Var3.f18414d, z13, 5);
                if (z13) {
                    N(jA);
                }
                e();
                boolean[] zArr2 = new boolean[this.f18090b.length];
                int i11 = 0;
                while (true) {
                    p0[] p0VarArr = this.f18090b;
                    if (i11 >= p0VarArr.length) {
                        break;
                    }
                    int iB = p0VarArr[i11].b();
                    zArr2[i11] = this.f18090b[i11].f();
                    p0 p0Var = this.f18090b[i11];
                    p235t1.r rVar = v13.f18150c[i11];
                    C1394l c1394l = this.f18103p;
                    long j = this.f18082S;
                    boolean z14 = zArr[i11];
                    m0 m0Var = p0Var.f18593a;
                    if (p0.g(m0Var)) {
                        if (rVar != m0Var.y()) {
                            p0Var.a(m0Var, c1394l);
                        } else if (z14) {
                            m0Var.B(j);
                        }
                    }
                    m0 m0Var2 = p0Var.f18595c;
                    if (m0Var2 != null && p0.g(m0Var2)) {
                        if (rVar != m0Var2.y()) {
                            p0Var.a(m0Var2, c1394l);
                        } else if (z14) {
                            m0Var2.B(j);
                        }
                    }
                    if (iB - this.f18090b[i11].b() > 0) {
                        D(i11, false);
                    }
                    this.f18080Q -= iB - this.f18090b[i11].b();
                    i11++;
                }
                j(zArr2, this.f18082S);
                z10 = true;
                v13.f18155h = true;
            } else {
                this.f18109t.o(v12);
                if (v12.f18152e) {
                    long jMax = Math.max(v12.f18154g.f18164b, this.f18082S - v12.f18162p);
                    if (this.f18064A && c() && this.f18109t.f18186l == v12) {
                        e();
                    }
                    v12.a(yVarJ, jMax, false, new boolean[v12.j.length]);
                }
                z10 = true;
            }
            s(z10);
            if (this.f18067D.f18415e != 4) {
                z();
                t0();
                this.f18097i.i(2);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0090  */
    /* JADX WARN: Code duplicated, block: B:58:0x012b  */
    /* JADX WARN: Code duplicated, block: B:60:0x0130  */
    /* JADX WARN: Code duplicated, block: B:62:0x0135  */
    /* JADX WARN: Code duplicated, block: B:64:0x013a  */
    /* JADX WARN: Code duplicated, block: B:66:0x013f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0144  */
    /* JADX WARN: Code duplicated, block: B:70:0x014b  */
    /* JADX WARN: Code duplicated, block: B:73:0x0175  */
    /* JADX WARN: Code duplicated, block: B:75:0x017f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0199  */
    public final void L(boolean z10, boolean z11, boolean z12, boolean z13) {
        long j;
        boolean z14;
        long j10;
        long j11;
        p078g1.x l0Var;
        androidx.media3.exoplayer.source.h.b bVar;
        h0 h0Var;
        p235t1.w wVar;
        p259v1.y yVar;
        List listK;
        Y y10;
        this.f18097i.j(2);
        this.f18086W = null;
        v0(false, true);
        C1394l c1394l = this.f18103p;
        c1394l.f18477g = false;
        s0 s0Var = c1394l.f18472b;
        if (s0Var.f18605c) {
            s0Var.a(s0Var.r());
            s0Var.f18605c = false;
        }
        this.f18082S = 1000000000000L;
        for (int i10 = 0; i10 < this.f18090b.length; i10++) {
            try {
                f(i10);
            } catch (ExoPlaybackException | RuntimeException e10) {
                p114j1.k.d("ExoPlayerImplInternal", "Disable failed.", e10);
            }
        }
        this.f18089Z = -9223372036854775807L;
        if (z10) {
            for (p0 p0Var : this.f18090b) {
                try {
                    p0Var.k();
                } catch (RuntimeException e11) {
                    p114j1.k.d("ExoPlayerImplInternal", "Reset failed.", e11);
                }
            }
        }
        this.f18080Q = 0;
        h0 h0Var2 = this.f18067D;
        androidx.media3.exoplayer.source.h.b bVar2 = h0Var2.f18412b;
        long j12 = h0Var2.f18428s;
        if (this.f18067D.f18412b.b()) {
            j = this.f18067D.f18413c;
        } else {
            h0 h0Var3 = this.f18067D;
            g1.x.b bVar3 = this.f18100m;
            androidx.media3.exoplayer.source.h.b bVar4 = h0Var3.f18412b;
            p078g1.x xVar = h0Var3.f18411a;
            if (xVar.p() || xVar.g(bVar4.f18698a, bVar3).f35473f) {
                j = this.f18067D.f18413c;
            } else {
                j = this.f18067D.f18428s;
            }
        }
        if (z11) {
            this.f18081R = null;
            Pair<androidx.media3.exoplayer.source.h.b, Long> pairM = m(this.f18067D.f18411a);
            bVar2 = (androidx.media3.exoplayer.source.h.b) pairM.first;
            long jLongValue = ((Long) pairM.second).longValue();
            z14 = bVar2.equals(this.f18067D.f18412b) ? false : true;
            j10 = jLongValue;
            j11 = -9223372036854775807L;
        } else {
            z14 = false;
            j10 = j12;
            j11 = j;
        }
        this.f18109t.b();
        this.f18074K = false;
        p078g1.x xVar2 = this.f18067D.f18411a;
        if (z12 && (xVar2 instanceof l0)) {
            l0 l0Var2 = (l0) xVar2;
            p235t1.s sVar = this.f18110u.j;
            p078g1.x[] xVarArr = l0Var2.f18482i;
            p078g1.x[] xVarArr2 = new p078g1.x[xVarArr.length];
            for (int i11 = 0; i11 < xVarArr.length; i11++) {
                xVarArr2[i11] = new k0(xVarArr[i11]);
            }
            l0Var = new l0(xVarArr2, l0Var2.j, sVar);
            if (bVar2.f18699b != -1) {
                l0Var.g(bVar2.f18698a, this.f18100m);
                int i12 = this.f18100m.f35470c;
                g1.x.c cVar = this.f18099l;
                l0Var.m(i12, cVar, 0L);
                if (cVar.a()) {
                    bVar = new androidx.media3.exoplayer.source.h.b(bVar2.f18698a, bVar2.f18701d);
                }
            }
            h0Var = this.f18067D;
            int i13 = h0Var.f18415e;
            ExoPlaybackException exoPlaybackException = z13 ? null : h0Var.f18416f;
            if (z14) {
                wVar = p235t1.w.f47101d;
            } else {
                wVar = h0Var.f18418h;
            }
            p235t1.w wVar2 = wVar;
            if (z14) {
                yVar = this.f18094f;
            } else {
                yVar = h0Var.f18419i;
            }
            p259v1.y yVar2 = yVar;
            if (z14) {
                listK = ImmutableList.K();
            } else {
                listK = h0Var.j;
            }
            List list = listK;
            h0 h0Var4 = this.f18067D;
            this.f18067D = new h0(l0Var, bVar, j11, j10, i13, exoPlaybackException, false, wVar2, yVar2, list, bVar, h0Var4.f18421l, h0Var4.f18422m, h0Var4.f18423n, h0Var4.f18424o, j10, 0L, j10, 0L, false);
            if (z12) {
                y10 = this.f18109t;
                if (!y10.f18192r.isEmpty()) {
                    y10.n(new ArrayList());
                }
                g0 g0Var = this.f18110u;
                HashMap<g0.c, g0.b> map = g0Var.f18383f;
                for (g0.b bVar5 : map.values()) {
                    try {
                        bVar5.f18391a.e(bVar5.f18392b);
                    } catch (RuntimeException e12) {
                        p114j1.k.d("MediaSourceList", "Failed to release child source.", e12);
                    }
                    androidx.media3.exoplayer.source.h hVar = bVar5.f18391a;
                    g0.a aVar = bVar5.f18393c;
                    hVar.d(aVar);
                    bVar5.f18391a.n(aVar);
                }
                map.clear();
                g0Var.f18384g.clear();
                g0Var.f18387k = false;
            }
        }
        l0Var = xVar2;
        bVar = bVar2;
        h0Var = this.f18067D;
        int i14 = h0Var.f18415e;
        ExoPlaybackException exoPlaybackException2 = z13 ? null : h0Var.f18416f;
        if (z14) {
            wVar = p235t1.w.f47101d;
        } else {
            wVar = h0Var.f18418h;
        }
        p235t1.w wVar3 = wVar;
        if (z14) {
            yVar = this.f18094f;
        } else {
            yVar = h0Var.f18419i;
        }
        p259v1.y yVar3 = yVar;
        if (z14) {
            listK = ImmutableList.K();
        } else {
            listK = h0Var.j;
        }
        List list2 = listK;
        h0 h0Var5 = this.f18067D;
        this.f18067D = new h0(l0Var, bVar, j11, j10, i14, exoPlaybackException2, false, wVar3, yVar3, list2, bVar, h0Var5.f18421l, h0Var5.f18422m, h0Var5.f18423n, h0Var5.f18424o, j10, 0L, j10, 0L, false);
        if (z12) {
            y10 = this.f18109t;
            if (!y10.f18192r.isEmpty()) {
                y10.n(new ArrayList());
            }
            g0 g0Var2 = this.f18110u;
            HashMap<g0.c, g0.b> map2 = g0Var2.f18383f;
            while (r5.hasNext()) {
                bVar5.f18391a.e(bVar5.f18392b);
                androidx.media3.exoplayer.source.h hVar2 = bVar5.f18391a;
                g0.a aVar2 = bVar5.f18393c;
                hVar2.d(aVar2);
                bVar5.f18391a.n(aVar2);
            }
            map2.clear();
            g0Var2.f18384g.clear();
            g0Var2.f18387k = false;
        }
    }

    public final void M() {
        V v10 = this.f18109t.j;
        this.f18071H = v10 != null && v10.f18154g.f18171i && this.f18070G;
    }

    public final void N(long j) throws ExoPlaybackException {
        V v10 = this.f18109t.j;
        long j10 = j + (v10 == null ? 1000000000000L : v10.f18162p);
        this.f18082S = j10;
        this.f18103p.f18472b.a(j10);
        for (p0 p0Var : this.f18090b) {
            long j11 = this.f18082S;
            m0 m0VarC = p0Var.c(v10);
            if (m0VarC != null) {
                m0VarC.B(j11);
            }
        }
        for (V v11 = r0.j; v11 != null; v11 = v11.f18159m) {
            for (p259v1.t tVar : v11.f18161o.f47625c) {
                if (tVar != null) {
                    tVar.j();
                }
            }
        }
    }

    public final void O(p078g1.x xVar, p078g1.x xVar2) {
        if (xVar.p() && xVar2.p()) {
            return;
        }
        ArrayList<d> arrayList = this.f18105q;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            arrayList.get(size).getClass();
            throw null;
        }
    }

    public final void R(long j) {
        this.f18097i.h(j + ((this.f18067D.f18415e != 3 || k0()) ? f18063r0 : 1000L));
    }

    public final void S(boolean z10) throws ExoPlaybackException {
        androidx.media3.exoplayer.source.h.b bVar = this.f18109t.j.f18154g.f18163a;
        long jU = U(bVar, this.f18067D.f18428s, true, false);
        if (jU != this.f18067D.f18428s) {
            h0 h0Var = this.f18067D;
            this.f18067D = w(bVar, jU, h0Var.f18413c, h0Var.f18414d, z10, 5);
        }
    }

    /* JADX WARN: Type inference failed for: r1v19, types: [androidx.media3.exoplayer.source.g, java.lang.Object] */
    public final void T(g gVar) throws Throwable {
        long j;
        long j10;
        boolean z10;
        androidx.media3.exoplayer.source.h.b bVar;
        long j11;
        long j12;
        long j13;
        h0 h0Var;
        int i10;
        this.f18068E.a(1);
        Pair<Object, Long> pairP = P(this.f18067D.f18411a, gVar, true, this.f18075L, this.f18076M, this.f18099l, this.f18100m);
        if (pairP == null) {
            Pair<androidx.media3.exoplayer.source.h.b, Long> pairM = m(this.f18067D.f18411a);
            bVar = (androidx.media3.exoplayer.source.h.b) pairM.first;
            long jLongValue = ((Long) pairM.second).longValue();
            z10 = !this.f18067D.f18411a.p();
            j = jLongValue;
            j10 = -9223372036854775807L;
        } else {
            Object obj = pairP.first;
            long jLongValue2 = ((Long) pairP.second).longValue();
            long j14 = gVar.f18134c == -9223372036854775807L ? -9223372036854775807L : jLongValue2;
            androidx.media3.exoplayer.source.h.b bVarQ = this.f18109t.q(this.f18067D.f18411a, obj, jLongValue2);
            if (bVarQ.b()) {
                this.f18067D.f18411a.g(bVarQ.f18698a, this.f18100m);
                if (this.f18100m.e(bVarQ.f18699b) == bVarQ.f18700c) {
                    this.f18100m.f35474g.getClass();
                }
                j = 0;
                j10 = j14;
                bVar = bVarQ;
                z10 = true;
            } else {
                j = jLongValue2;
                j10 = j14;
                z10 = gVar.f18134c == -9223372036854775807L;
                bVar = bVarQ;
            }
        }
        try {
            if (!this.f18067D.f18411a.p()) {
                if (pairP == null) {
                    if (this.f18067D.f18415e != 1) {
                        h0(4);
                    }
                    L(false, true, false, true);
                } else {
                    if (bVar.equals(this.f18067D.f18412b)) {
                        V v10 = this.f18109t.j;
                        long jE = (v10 == null || !v10.f18152e || j == 0) ? j : v10.f18148a.e(j, this.f18066C);
                        if (p114j1.A.Q(jE) == p114j1.A.Q(this.f18067D.f18428s) && ((i10 = (h0Var = this.f18067D).f18415e) == 2 || i10 == 3)) {
                            long j15 = h0Var.f18428s;
                            this.f18067D = w(bVar, j15, j10, j15, z10, 2);
                            return;
                        }
                        j12 = jE;
                    } else {
                        j12 = j;
                    }
                    boolean z11 = this.f18067D.f18415e == 4;
                    Y y10 = this.f18109t;
                    long jU = U(bVar, j12, y10.j != y10.f18185k, z11);
                    z10 |= j != jU;
                    try {
                        h0 h0Var2 = this.f18067D;
                        p078g1.x xVar = h0Var2.f18411a;
                        u0(xVar, bVar, xVar, h0Var2.f18412b, j10, true);
                        j13 = jU;
                    } catch (Throwable th) {
                        th = th;
                        j11 = jU;
                        this.f18067D = w(bVar, j11, j10, j11, z10, 2);
                        throw th;
                    }
                }
                this.f18067D = w(bVar, j13, j10, j13, z10, 2);
            }
            this.f18081R = gVar;
            j13 = j;
            this.f18067D = w(bVar, j13, j10, j13, z10, 2);
        } catch (Throwable th2) {
            th = th2;
            j11 = j;
        }
    }

    /* JADX WARN: Type inference failed for: r10v10, types: [androidx.media3.exoplayer.source.g, java.lang.Object] */
    public final long U(androidx.media3.exoplayer.source.h.b bVar, long j, boolean z10, boolean z11) throws ExoPlaybackException {
        p0[] p0VarArr;
        o0();
        v0(false, true);
        if (z11 || this.f18067D.f18415e == 3) {
            h0(2);
        }
        Y y10 = this.f18109t;
        V v10 = y10.j;
        V v11 = v10;
        while (v11 != null && !bVar.equals(v11.f18154g.f18163a)) {
            v11 = v11.f18159m;
        }
        if (z10 || v10 != v11 || (v11 != null && v11.f18162p + j < 0)) {
            int i10 = 0;
            while (true) {
                p0VarArr = this.f18090b;
                if (i10 >= p0VarArr.length) {
                    break;
                }
                f(i10);
                i10++;
            }
            this.f18089Z = -9223372036854775807L;
            if (v11 != null) {
                while (y10.j != v11) {
                    y10.a();
                }
                y10.o(v11);
                v11.f18162p = 1000000000000L;
                j(new boolean[p0VarArr.length], y10.f18185k.e());
                v11.f18155h = true;
            }
        }
        e();
        if (v11 != null) {
            y10.o(v11);
            if (!v11.f18152e) {
                v11.f18154g = v11.f18154g.b(j);
            } else if (v11.f18153f) {
                ?? r10 = v11.f18148a;
                j = r10.f(j);
                r10.r(j - this.f18101n, this.f18102o);
            }
            N(j);
            z();
        } else {
            y10.b();
            N(j);
        }
        s(false);
        this.f18097i.i(2);
        return j;
    }

    public final void V(j0 j0Var) throws ExoPlaybackException {
        j0Var.getClass();
        Looper looper = j0Var.f18458e;
        Looper looper2 = this.f18098k;
        p114j1.g gVar = this.f18097i;
        if (looper != looper2) {
            gVar.k(15, j0Var).b();
            return;
        }
        synchronized (j0Var) {
        }
        try {
            j0Var.f18454a.x(j0Var.f18456c, j0Var.f18457d);
            j0Var.a(true);
            int i10 = this.f18067D.f18415e;
            if (i10 == 3 || i10 == 2) {
                gVar.i(2);
            }
        } catch (Throwable th) {
            j0Var.a(true);
            throw th;
        }
    }

    public final void W(j0 j0Var) {
        Looper looper = j0Var.f18458e;
        if (looper.getThread().isAlive()) {
            this.f18107r.a(looper, null).e(new O(this, 0, j0Var));
        } else {
            p114j1.k.f("Trying to send message on a dead thread.");
            j0Var.a(false);
        }
    }

    public final void X(C2198d c2198d, boolean z10) throws ExoPlaybackException {
        this.f18093e.f(c2198d);
        if (!z10) {
            c2198d = null;
        }
        C1388f c1388f = this.f18065B;
        if (!Objects.equals(c1388f.f18351d, c2198d)) {
            c1388f.f18351d = c2198d;
            int i10 = c2198d == null ? 0 : 1;
            c1388f.f18353f = i10;
            p241t7.b.d("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", i10 == 1 || i10 == 0);
        }
        h0 h0Var = this.f18067D;
        boolean z11 = h0Var.f18421l;
        s0(c1388f.d(h0Var.f18415e, z11), h0Var.f18423n, h0Var.f18422m, z11);
    }

    public final void Y(boolean z10, AtomicBoolean atomicBoolean) {
        if (this.f18077N != z10) {
            this.f18077N = z10;
            if (!z10) {
                for (p0 p0Var : this.f18090b) {
                    p0Var.k();
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void Z(b bVar) throws Throwable {
        this.f18068E.a(1);
        int i10 = bVar.f18119c;
        ArrayList arrayList = bVar.f18117a;
        p235t1.s sVar = bVar.f18118b;
        if (i10 != -1) {
            this.f18081R = new g(new l0(arrayList, sVar), bVar.f18119c, bVar.f18120d);
        }
        g0 g0Var = this.f18110u;
        ArrayList arrayList2 = g0Var.f18379b;
        g0Var.g(0, arrayList2.size());
        t(g0Var.a(arrayList2.size(), arrayList, sVar), false);
    }

    public final void a(b bVar, int i10) throws Throwable {
        this.f18068E.a(1);
        g0 g0Var = this.f18110u;
        if (i10 == -1) {
            i10 = g0Var.f18379b.size();
        }
        t(g0Var.a(i10, bVar.f18117a, bVar.f18118b), false);
    }

    public final void a0(boolean z10) throws ExoPlaybackException {
        this.f18070G = z10;
        M();
        if (this.f18071H) {
            Y y10 = this.f18109t;
            if (y10.f18185k != y10.j) {
                S(true);
                s(false);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.g.a
    public final void b(androidx.media3.exoplayer.source.g gVar) {
        this.f18097i.k(8, gVar).b();
    }

    public final void b0(p078g1.u uVar) throws ExoPlaybackException {
        this.f18097i.j(16);
        C1394l c1394l = this.f18103p;
        c1394l.e(uVar);
        p078g1.u uVarG = c1394l.g();
        v(uVarG, uVarG.f35452a, true, true);
    }

    public final boolean c() {
        if (!this.f18064A) {
            return false;
        }
        for (p0 p0Var : this.f18090b) {
            if (p0Var.e()) {
                return true;
            }
        }
        return false;
    }

    public final void c0(ExoPlayer.c cVar) {
        this.f18088Y = cVar;
        p078g1.x xVar = this.f18067D.f18411a;
        Y y10 = this.f18109t;
        y10.f18184i = cVar;
        y10.f18184i.getClass();
        if (y10.f18192r.isEmpty()) {
            return;
        }
        y10.n(new ArrayList());
    }

    public final void d() throws ExoPlaybackException {
        K();
        S(true);
    }

    public final void d0(int i10) throws ExoPlaybackException {
        this.f18075L = i10;
        p078g1.x xVar = this.f18067D.f18411a;
        Y y10 = this.f18109t;
        y10.f18182g = i10;
        int iS = y10.s(xVar);
        if ((iS & 1) != 0) {
            S(true);
        } else if ((iS & 2) != 0) {
            e();
        }
        s(false);
    }

    public final void e() {
        m0 m0Var;
        if (this.f18064A && c()) {
            for (p0 p0Var : this.f18090b) {
                int iB = p0Var.b();
                if (p0Var.e()) {
                    int i10 = p0Var.f18596d;
                    boolean z10 = i10 == 4 || i10 == 2;
                    int i11 = i10 != 4 ? 0 : 1;
                    if (z10) {
                        m0Var = p0Var.f18593a;
                    } else {
                        m0Var = p0Var.f18595c;
                        m0Var.getClass();
                    }
                    p0Var.a(m0Var, this.f18103p);
                    p0Var.i(z10);
                    p0Var.f18596d = i11;
                }
                this.f18080Q -= iB - p0Var.b();
            }
            this.f18089Z = -9223372036854775807L;
        }
    }

    public final void e0(r0 r0Var) {
        this.f18066C = r0Var;
    }

    public final void f(int i10) throws ExoPlaybackException {
        p0[] p0VarArr = this.f18090b;
        int iB = p0VarArr[i10].b();
        p0 p0Var = p0VarArr[i10];
        m0 m0Var = p0Var.f18593a;
        C1394l c1394l = this.f18103p;
        p0Var.a(m0Var, c1394l);
        m0 m0Var2 = p0Var.f18595c;
        if (m0Var2 != null) {
            boolean z10 = (m0Var2.getState() != 0) && p0Var.f18596d != 3;
            p0Var.a(m0Var2, c1394l);
            p0Var.i(false);
            if (z10) {
                m0Var2.getClass();
                m0Var2.x(17, p0Var.f18593a);
            }
        }
        p0Var.f18596d = 0;
        D(i10, false);
        this.f18080Q -= iB;
    }

    public final void f0(boolean z10) throws ExoPlaybackException {
        this.f18076M = z10;
        p078g1.x xVar = this.f18067D.f18411a;
        Y y10 = this.f18109t;
        y10.f18183h = z10;
        int iS = y10.s(xVar);
        if ((iS & 1) != 0) {
            S(true);
        } else if ((iS & 2) != 0) {
            e();
        }
        s(false);
    }

    @Override // androidx.media3.exoplayer.source.m.a
    public final void g(androidx.media3.exoplayer.source.m mVar) {
        this.f18097i.k(9, (androidx.media3.exoplayer.source.g) mVar).b();
    }

    public final void g0(p235t1.s sVar) throws Throwable {
        this.f18068E.a(1);
        g0 g0Var = this.f18110u;
        int size = g0Var.f18379b.size();
        if (sVar.getLength() != size) {
            sVar = sVar.g().e(size);
        }
        g0Var.j = sVar;
        t(g0Var.b(), false);
    }

    /* JADX WARN: Code duplicated, block: B:152:0x02ce A[PHI: r6
      0x02ce: PHI (r6v41 long) = (r6v40 long), (r6v42 long) binds: [B:151:0x02cc, B:147:0x02bc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:157:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:159:0x02db  */
    /* JADX WARN: Code duplicated, block: B:162:0x02df  */
    /* JADX WARN: Code duplicated, block: B:165:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:172:0x030d  */
    /* JADX WARN: Code duplicated, block: B:174:0x0315  */
    /* JADX WARN: Code duplicated, block: B:183:0x032e  */
    /* JADX WARN: Code duplicated, block: B:185:0x0334  */
    /* JADX WARN: Code duplicated, block: B:186:0x0336  */
    /* JADX WARN: Code duplicated, block: B:194:0x034a A[EDGE_INSN: B:194:0x034a->B:247:0x0416 BREAK  A[LOOP:10: B:122:0x0234->B:128:0x0249]] */
    /* JADX WARN: Code duplicated, block: B:236:0x03de  */
    /* JADX WARN: Code duplicated, block: B:286:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:317:0x0512  */
    /* JADX WARN: Code duplicated, block: B:409:0x0663  */
    /* JADX WARN: Code duplicated, block: B:449:0x06eb  */
    /* JADX WARN: Code duplicated, block: B:450:0x06ee  */
    /* JADX WARN: Code duplicated, block: B:452:0x06f5  */
    /* JADX WARN: Code duplicated, block: B:454:0x06f9  */
    /* JADX WARN: Code duplicated, block: B:455:0x06ff A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:456:0x0701  */
    /* JADX WARN: Code duplicated, block: B:457:0x0704  */
    /* JADX WARN: Code duplicated, block: B:459:0x0708  */
    /* JADX WARN: Code duplicated, block: B:460:0x070b  */
    /* JADX WARN: Code duplicated, block: B:462:0x071b  */
    /* JADX WARN: Code duplicated, block: B:463:0x0722  */
    /* JADX WARN: Code duplicated, block: B:466:0x072c  */
    /* JADX WARN: Code duplicated, block: B:469:0x0734  */
    /* JADX WARN: Code duplicated, block: B:472:0x073f  */
    /* JADX WARN: Code duplicated, block: B:475:0x0745  */
    /* JADX WARN: Code duplicated, block: B:477:0x0748 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:481:0x078a  */
    /* JADX WARN: Code duplicated, block: B:483:0x0797  */
    /* JADX WARN: Code duplicated, block: B:485:0x07a6  */
    /* JADX WARN: Code duplicated, block: B:487:0x07b7  */
    /* JADX WARN: Code duplicated, block: B:489:0x07bf  */
    /* JADX WARN: Code duplicated, block: B:497:0x07dc  */
    /* JADX WARN: Code duplicated, block: B:499:0x07e2  */
    /* JADX WARN: Code duplicated, block: B:501:0x07ea  */
    /* JADX WARN: Code duplicated, block: B:503:0x07ee  */
    /* JADX WARN: Code duplicated, block: B:509:0x0800  */
    /* JADX WARN: Code duplicated, block: B:511:0x080b  */
    /* JADX WARN: Code duplicated, block: B:518:0x081d  */
    /* JADX WARN: Code duplicated, block: B:521:0x0823  */
    /* JADX WARN: Code duplicated, block: B:523:0x082b  */
    /* JADX WARN: Code duplicated, block: B:524:0x082d  */
    /* JADX WARN: Code duplicated, block: B:526:0x0830  */
    /* JADX WARN: Code duplicated, block: B:530:0x083c  */
    /* JADX WARN: Code duplicated, block: B:537:0x0857  */
    /* JADX WARN: Code duplicated, block: B:539:0x085a  */
    /* JADX WARN: Code duplicated, block: B:540:0x085d  */
    /* JADX WARN: Code duplicated, block: B:542:0x0863  */
    /* JADX WARN: Code duplicated, block: B:543:0x086f  */
    /* JADX WARN: Code duplicated, block: B:547:0x0887  */
    /* JADX WARN: Code duplicated, block: B:550:0x0890  */
    /* JADX WARN: Code duplicated, block: B:553:0x0895  */
    /* JADX WARN: Code duplicated, block: B:557:0x089c  */
    /* JADX WARN: Code duplicated, block: B:560:0x08a3  */
    /* JADX WARN: Code duplicated, block: B:563:0x08ff  */
    /* JADX WARN: Code duplicated, block: B:576:0x0919  */
    /* JADX WARN: Code duplicated, block: B:610:0x0836 A[EDGE_INSN: B:610:0x0836->B:528:0x0836 BREAK  A[LOOP:7: B:519:0x081e->B:527:0x0833], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:612:0x0833 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:616:0x07f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:624:0x0308 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:627:0x0341 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:172:0x030d, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:499:0x07e2, please report this as an issue */
    /* JADX WARN: Type inference failed for: r0v120, types: [androidx.media3.exoplayer.source.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.media3.exoplayer.source.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v37, types: [androidx.media3.exoplayer.source.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v76, types: [androidx.media3.exoplayer.source.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v50, types: [androidx.media3.exoplayer.source.g, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void h() throws ExoPlaybackException, IOException {
        int i10;
        boolean z10;
        boolean z11;
        long j;
        boolean z12;
        h0 h0Var;
        boolean z13;
        V v10;
        C1392j c1392j;
        long j10;
        long j11;
        int i11;
        V v11;
        long j12;
        V v12;
        boolean z14;
        boolean z15;
        boolean zA;
        s0 s0Var;
        boolean z16;
        boolean z17;
        h0 h0Var2;
        int i12;
        int i13;
        p0[] p0VarArr;
        h0 h0Var3;
        boolean z18;
        V v13;
        int i14;
        long j13;
        boolean z19;
        long jE;
        int i15;
        m0 m0Var;
        m0 m0Var2;
        boolean z20;
        int i16;
        int i17;
        p259v1.t[] tVarArr;
        Y y10;
        V v14;
        V v15;
        boolean z21;
        p0[] p0VarArr2;
        boolean z22;
        Y y11;
        V v16;
        V v17;
        int i18;
        this.f18107r.getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        this.f18097i.j(2);
        if (this.f18067D.f18411a.p() || !this.f18110u.f18387k) {
            i10 = 4;
        } else {
            this.f18109t.m(this.f18082S);
            Y y12 = this.f18109t;
            V v18 = y12.f18187m;
            if (v18 == null || (!v18.f18154g.j && v18.g() && y12.f18187m.f18154g.f18167e != -9223372036854775807L && y12.f18189o < 100)) {
                Y y13 = this.f18109t;
                long j14 = this.f18082S;
                h0 h0Var4 = this.f18067D;
                V v19 = y13.f18187m;
                W wD = v19 == null ? y13.d(h0Var4.f18411a, h0Var4.f18412b, h0Var4.f18413c, h0Var4.f18428s) : y13.c(h0Var4.f18411a, v19, j14);
                if (wD != null) {
                    Y y14 = this.f18109t;
                    V v20 = y14.f18187m;
                    long j15 = v20 == null ? 1000000000000L : (v20.f18162p + v20.f18154g.f18167e) - wD.f18164b;
                    int i19 = 0;
                    while (true) {
                        if (i19 >= y14.f18192r.size()) {
                            v13 = null;
                            break;
                        }
                        W w3 = ((V) y14.f18192r.get(i19)).f18154g;
                        long j16 = w3.f18167e;
                        if ((j16 == -9223372036854775807L || j16 == wD.f18167e) && w3.f18164b == wD.f18164b && w3.f18163a.equals(wD.f18163a)) {
                            v13 = (V) y14.f18192r.remove(i19);
                            break;
                        }
                        i19++;
                    }
                    if (v13 == null) {
                        P p10 = (P) y14.f18180e.f18804b;
                        p272w1.d dVarH = p10.f18095g.h();
                        p10.f18088Y.getClass();
                        v13 = new V(p10.f18091c, j15, p10.f18093e, dVarH, p10.f18110u, wD, p10.f18094f);
                    } else {
                        v13.f18154g = wD;
                        v13.f18162p = j15;
                    }
                    V v21 = y14.f18187m;
                    if (v21 == null) {
                        y14.j = v13;
                        y14.f18185k = v13;
                        y14.f18186l = v13;
                    } else if (v13 != v21.f18159m) {
                        v21.b();
                        v21.f18159m = v13;
                        v21.c();
                    }
                    y14.f18190p = null;
                    y14.f18187m = v13;
                    y14.f18189o++;
                    y14.l();
                    if (!v13.f18151d) {
                        long j17 = wD.f18164b;
                        v13.f18151d = true;
                        v13.f18148a.m(this, j17);
                    } else if (v13.f18152e) {
                        this.f18097i.k(8, v13.f18148a).b();
                    }
                    if (this.f18109t.j == v13) {
                        N(wD.f18164b);
                    }
                    s(false);
                }
            }
            if (this.f18074K) {
                this.f18074K = x(this.f18109t.f18187m);
                p0();
            } else {
                z();
            }
            if (!this.f18071H && this.f18064A && !this.f18104p0 && !c() && (v16 = (y11 = this.f18109t).f18186l) != null && v16 == y11.f18185k && (v17 = v16.f18159m) != null && v17.f18152e) {
                y11.f18186l = v17;
                y11.l();
                p241t7.b.l(y11.f18186l);
                V v22 = y11.f18186l;
                if (v22 != null) {
                    p259v1.y yVar = v22.f18161o;
                    int i20 = 0;
                    while (true) {
                        p0[] p0VarArr3 = this.f18090b;
                        if (i20 >= p0VarArr3.length) {
                            break;
                        }
                        if (yVar.b(i20)) {
                            p0 p0Var = p0VarArr3[i20];
                            if (p0Var.f18595c != null && !p0Var.e()) {
                                p0 p0Var2 = p0VarArr3[i20];
                                p241t7.b.k(!p0Var2.e());
                                if (p0.g(p0Var2.f18593a)) {
                                    i18 = 3;
                                } else {
                                    m0 m0Var3 = p0Var2.f18595c;
                                    i18 = (m0Var3 == null || m0Var3.getState() == 0) ? 2 : 4;
                                }
                                p0Var2.f18596d = i18;
                                i(v22, i20, false, v22.e());
                            }
                        }
                        i20++;
                    }
                    if (c()) {
                        this.f18089Z = v22.f18148a.k();
                        if (!v22.g()) {
                            y11.o(v22);
                            s(false);
                            z();
                        }
                    }
                }
            }
            Y y15 = this.f18109t;
            V v23 = y15.f18185k;
            if (v23 != null) {
                V v24 = v23.f18159m;
                p0[] p0VarArr4 = this.f18090b;
                if (v24 == null || this.f18071H) {
                    if (v23.f18154g.j || this.f18071H) {
                        for (p0 p0Var3 : p0VarArr4) {
                            if (p0Var3.c(v23) != null) {
                                m0 m0VarC = p0Var3.c(v23);
                                m0VarC.getClass();
                                if (m0VarC.h()) {
                                    long j18 = v23.f18154g.f18167e;
                                    long j19 = (j18 == -9223372036854775807L || j18 == Long.MIN_VALUE) ? -9223372036854775807L : j18 + v23.f18162p;
                                    m0 m0VarC2 = p0Var3.c(v23);
                                    m0VarC2.getClass();
                                    p0.l(m0VarC2, j19);
                                }
                            }
                        }
                    }
                } else if (v23.f18152e) {
                    int i21 = 0;
                    while (true) {
                        if (i21 < p0VarArr4.length) {
                            p0 p0Var4 = p0VarArr4[i21];
                            if (p0Var4.d(v23, p0Var4.f18593a) && p0Var4.d(v23, p0Var4.f18595c)) {
                                i21++;
                            }
                        } else if (!c() || y15.f18186l != y15.f18185k) {
                            V v25 = v23.f18159m;
                            if (v25.f18152e || this.f18082S >= v25.e()) {
                                p259v1.y yVar2 = v23.f18161o;
                                V v26 = y15.f18186l;
                                V v27 = y15.f18185k;
                                if (v26 == v27) {
                                    p241t7.b.l(v27);
                                    y15.f18186l = v27.f18159m;
                                }
                                V v28 = y15.f18185k;
                                p241t7.b.l(v28);
                                y15.f18185k = v28.f18159m;
                                y15.l();
                                V v29 = y15.f18185k;
                                p241t7.b.l(v29);
                                p259v1.y yVar3 = v29.f18161o;
                                p078g1.x xVar = this.f18067D.f18411a;
                                u0(xVar, v29.f18154g.f18163a, xVar, v23.f18154g.f18163a, -9223372036854775807L, false);
                                if (v29.f18152e) {
                                    boolean z23 = this.f18064A;
                                    if (z23) {
                                        j13 = -9223372036854775807L;
                                        if (this.f18089Z != -9223372036854775807L) {
                                            this.f18089Z = j13;
                                            if (z23 || this.f18104p0) {
                                                z19 = false;
                                            } else {
                                                z19 = true;
                                            }
                                            if (z19) {
                                                for (i17 = 0; i17 < p0VarArr4.length; i17++) {
                                                    if (!yVar3.b(i17)) {
                                                        tVarArr = yVar3.f47625c;
                                                        if (!p078g1.t.a(tVarArr[i17].h().f35302n, tVarArr[i17].h().f35299k) && !p0VarArr4[i17].e()) {
                                                            z19 = false;
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            if (!z19) {
                                                jE = v29.e();
                                                for (p0 p0Var5 : p0VarArr4) {
                                                    m0Var = p0Var5.f18593a;
                                                    if (p0.g(m0Var) && (i16 = p0Var5.f18596d) != 4 && i16 != 2) {
                                                        p0.l(m0Var, jE);
                                                    }
                                                    m0Var2 = p0Var5.f18595c;
                                                    if (m0Var2 == null) {
                                                        if (m0Var2.getState() != 0) {
                                                            z20 = true;
                                                        } else {
                                                            z20 = false;
                                                        }
                                                        if (!z20 && p0Var5.f18596d != 3) {
                                                            p0.l(m0Var2, jE);
                                                        }
                                                    }
                                                }
                                                if (v29.g()) {
                                                    y15.o(v29);
                                                    s(false);
                                                    z();
                                                    break;
                                                }
                                                break;
                                            }
                                        }
                                    } else {
                                        j13 = -9223372036854775807L;
                                    }
                                    if (v29.f18148a.k() != j13) {
                                        this.f18089Z = j13;
                                        if (z23) {
                                            z19 = false;
                                        } else {
                                            z19 = false;
                                        }
                                        if (z19) {
                                            while (i17 < p0VarArr4.length) {
                                                if (!yVar3.b(i17)) {
                                                    tVarArr = yVar3.f47625c;
                                                    if (!p078g1.t.a(tVarArr[i17].h().f35302n, tVarArr[i17].h().f35299k)) {
                                                        continue;
                                                    }
                                                }
                                            }
                                        }
                                        if (!z19) {
                                            jE = v29.e();
                                            while (i15 < r2) {
                                                m0Var = p0Var5.f18593a;
                                                if (p0.g(m0Var)) {
                                                    p0.l(m0Var, jE);
                                                }
                                                m0Var2 = p0Var5.f18595c;
                                                if (m0Var2 == null) {
                                                    if (m0Var2.getState() != 0) {
                                                        z20 = true;
                                                    } else {
                                                        z20 = false;
                                                    }
                                                    if (!z20) {
                                                    }
                                                }
                                            }
                                            if (v29.g()) {
                                                break;
                                            }
                                            y15.o(v29);
                                            s(false);
                                            z();
                                            break;
                                        }
                                    }
                                }
                                int length = p0VarArr4.length;
                                int i22 = 0;
                                while (i22 < length) {
                                    p0 p0Var6 = p0VarArr4[i22];
                                    long jE2 = v29.e();
                                    int i23 = p0Var6.f18594b;
                                    boolean zB = yVar2.b(i23);
                                    boolean zB2 = yVar3.b(i23);
                                    m0 m0Var4 = p0Var6.f18593a;
                                    m0 m0Var5 = p0Var6.f18595c;
                                    if (m0Var5 != null) {
                                        int i24 = p0Var6.f18596d;
                                        i14 = length;
                                        if (i24 == 3 || (i24 == 0 && p0.g(m0Var4))) {
                                        }
                                        if (!zB && !m0Var5.C()) {
                                            boolean z24 = m0Var4.E() == -2;
                                            o0 o0Var = yVar2.f47624b[i23];
                                            o0 o0Var2 = yVar3.f47624b[i23];
                                            if (!zB2 || !Objects.equals(o0Var2, o0Var) || z24 || p0Var6.e()) {
                                                p0.l(m0Var5, jE2);
                                            }
                                        }
                                        i22++;
                                        length = i14;
                                    } else {
                                        i14 = length;
                                    }
                                    m0Var5 = m0Var4;
                                    if (!zB) {
                                    }
                                    i22++;
                                    length = i14;
                                }
                                break;
                            }
                        }
                    }
                }
                break;
                break;
            }
            break;
            Y y16 = this.f18109t;
            V v30 = y16.f18185k;
            if (v30 != null && y16.j != v30 && !v30.f18155h) {
                p259v1.y yVar4 = v30.f18161o;
                int i25 = 0;
                boolean z25 = true;
                while (true) {
                    p0VarArr2 = this.f18090b;
                    if (i25 >= p0VarArr2.length) {
                        break;
                    }
                    int iB = p0VarArr2[i25].b();
                    p0 p0Var7 = p0VarArr2[i25];
                    m0 m0Var6 = p0Var7.f18593a;
                    C1394l c1394l = this.f18103p;
                    int iJ = p0Var7.j(m0Var6, v30, yVar4, c1394l);
                    int iJ2 = p0Var7.j(p0Var7.f18595c, v30, yVar4, c1394l);
                    if (iJ == 1) {
                        iJ = iJ2;
                    }
                    if ((iJ & 2) != 0 && (z22 = this.f18079P) && z22) {
                        this.f18079P = false;
                        if (this.f18067D.f18425p) {
                            this.f18097i.i(2);
                        }
                    }
                    this.f18080Q -= iB - p0VarArr2[i25].b();
                    z25 &= (iJ & 1) != 0;
                    i25++;
                }
                if (z25) {
                    for (int i26 = 0; i26 < p0VarArr2.length; i26++) {
                        if (yVar4.b(i26)) {
                            if (!(p0VarArr2[i26].c(v30) != null)) {
                                i(v30, i26, false, v30.e());
                            }
                        }
                    }
                }
                if (z25) {
                    y16.f18185k.f18155h = true;
                }
            }
            boolean z26 = false;
            while (k0() && !this.f18071H && (v14 = (y10 = this.f18109t).j) != null && (v15 = v14.f18159m) != null && this.f18082S >= v15.e() && v15.f18155h) {
                if (z26) {
                    B();
                }
                this.f18104p0 = false;
                V vA = y10.a();
                vA.getClass();
                if (this.f18067D.f18412b.f18698a.equals(vA.f18154g.f18163a.f18698a)) {
                    androidx.media3.exoplayer.source.h.b bVar = this.f18067D.f18412b;
                    if (bVar.f18699b == -1) {
                        androidx.media3.exoplayer.source.h.b bVar2 = vA.f18154g.f18163a;
                        if (bVar2.f18699b != -1 || bVar.f18702e == bVar2.f18702e) {
                            z21 = false;
                        } else {
                            z21 = true;
                        }
                    } else {
                        z21 = false;
                    }
                } else {
                    z21 = false;
                }
                W w10 = vA.f18154g;
                androidx.media3.exoplayer.source.h.b bVar3 = w10.f18163a;
                long j20 = w10.f18164b;
                this.f18067D = w(bVar3, j20, w10.f18165c, j20, !z21, 0);
                M();
                t0();
                boolean zC = c();
                p0[] p0VarArr5 = this.f18090b;
                if (zC && vA == y10.f18186l) {
                    for (p0 p0Var8 : p0VarArr5) {
                        int i27 = p0Var8.f18596d;
                        if (i27 == 3 || i27 == 4) {
                            boolean z27 = i27 == 4;
                            m0 m0Var7 = p0Var8.f18593a;
                            m0 m0Var8 = p0Var8.f18595c;
                            if (z27) {
                                m0Var8.getClass();
                                m0Var8.x(17, m0Var7);
                            } else {
                                m0Var8.getClass();
                                m0Var7.x(17, m0Var8);
                            }
                            p0Var8.f18596d = p0Var8.f18596d == 4 ? 0 : 1;
                        } else if (i27 == 2) {
                            p0Var8.f18596d = 0;
                        }
                    }
                }
                if (this.f18067D.f18415e == 3) {
                    m0();
                }
                p259v1.y yVar5 = y10.j.f18161o;
                for (int i28 = 0; i28 < p0VarArr5.length; i28++) {
                    if (yVar5.b(i28)) {
                        p0 p0Var9 = p0VarArr5[i28];
                        m0 m0Var9 = p0Var9.f18593a;
                        if (p0.g(m0Var9)) {
                            m0Var9.k();
                        } else {
                            m0 m0Var10 = p0Var9.f18595c;
                            if (m0Var10 != null) {
                                if (m0Var10.getState() != 0) {
                                    m0Var10.k();
                                }
                            }
                        }
                    }
                }
                z26 = true;
            }
            i10 = 4;
            this.f18088Y.getClass();
        }
        int i29 = this.f18067D.f18415e;
        if (i29 == 1 || i29 == i10) {
            return;
        }
        V v31 = this.f18109t.j;
        if (v31 == null) {
            R(jUptimeMillis);
            return;
        }
        Trace.beginSection("doSomeWork");
        t0();
        if (v31.f18152e) {
            this.f18107r.getClass();
            this.f18083T = p114j1.A.F(SystemClock.elapsedRealtime());
            v31.f18148a.r(this.f18067D.f18428s - this.f18101n, this.f18102o);
            z10 = true;
            int i30 = 0;
            z11 = true;
            while (true) {
                p0[] p0VarArr6 = this.f18090b;
                if (i30 >= p0VarArr6.length) {
                    break;
                }
                p0 p0Var10 = p0VarArr6[i30];
                if (p0Var10.b() == 0) {
                    D(i30, false);
                } else {
                    long j21 = this.f18082S;
                    long j22 = this.f18083T;
                    m0 m0Var11 = p0Var10.f18593a;
                    if (p0.g(m0Var11)) {
                        m0Var11.v(j21, j22);
                    }
                    m0 m0Var12 = p0Var10.f18595c;
                    if (m0Var12 != null) {
                        if (m0Var12.getState() != 0) {
                            m0Var12.v(j21, j22);
                        }
                    }
                    if (z11) {
                        m0 m0Var13 = p0Var10.f18593a;
                        boolean zD = p0.g(m0Var13) ? m0Var13.d() : true;
                        m0 m0Var14 = p0Var10.f18595c;
                        if (m0Var14 != null) {
                            if (m0Var14.getState() != 0) {
                                zD &= m0Var14.d();
                            }
                        }
                        if (zD) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    } else {
                        z11 = false;
                    }
                    m0 m0VarC3 = p0Var10.c(v31);
                    boolean z28 = m0VarC3 == null || m0VarC3.h() || m0VarC3.b() || m0VarC3.d();
                    D(i30, z28);
                    z10 = z10 && z28;
                    if (!z28) {
                        C(i30);
                    }
                }
                i30++;
            }
        } else {
            v31.f18148a.d();
            z10 = true;
            z11 = true;
        }
        long j23 = v31.f18154g.f18167e;
        if (z11 && v31.f18152e) {
            j = -9223372036854775807L;
            z12 = j23 == -9223372036854775807L || j23 <= this.f18067D.f18428s;
            if (z12 && this.f18071H) {
                this.f18071H = false;
                int i31 = this.f18067D.f18423n;
                this.f18068E.a(0);
                s0(this.f18065B.d(this.f18067D.f18415e, false), i31, 5, false);
            }
            if (z12 || !v31.f18154g.j) {
                h0Var = this.f18067D;
                if (h0Var.f18415e != 2) {
                    z13 = true;
                    if (this.f18067D.f18415e == 3 && (this.f18080Q != 0 ? !z10 : !y())) {
                        v0(k0(), false);
                        h0(2);
                        if (this.f18072I) {
                            for (v10 = this.f18109t.j; v10 != null; v10 = v10.f18159m) {
                                for (p259v1.t tVar : v10.f18161o.f47625c) {
                                    if (tVar != null) {
                                        tVar.k();
                                    }
                                }
                            }
                            c1392j = this.f18111v;
                            j10 = c1392j.f18448i;
                            if (j10 != j) {
                                long j24 = j10 + c1392j.f18441b;
                                c1392j.f18448i = j24;
                                j11 = c1392j.f18447h;
                                if (j11 != j && j24 > j11) {
                                    c1392j.f18448i = j11;
                                }
                                c1392j.f18451m = j;
                            }
                        }
                        o0();
                    }
                } else {
                    if (this.f18080Q == 0) {
                        zA = y();
                    } else if (!z10) {
                        zA = false;
                    } else if (h0Var.f18417g) {
                        Y y17 = this.f18109t;
                        v11 = y17.j;
                        if (l0(h0Var.f18411a, v11.f18154g.f18163a)) {
                            j12 = this.f18111v.f18448i;
                        } else {
                            j12 = j;
                        }
                        v12 = y17.f18187m;
                        if (v12.g() || !v12.f18154g.j) {
                            z14 = false;
                        } else {
                            z14 = true;
                        }
                        if (v12.f18154g.f18163a.b() || v12.f18152e) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        if (!z14 || z15) {
                            zA = true;
                        } else {
                            long jN = n(v12.d());
                            p078g1.x xVar2 = this.f18067D.f18411a;
                            androidx.media3.exoplayer.source.h.b bVar4 = v11.f18154g.f18163a;
                            long j25 = this.f18082S - v11.f18162p;
                            float f10 = this.f18103p.g().f35452a;
                            boolean z29 = this.f18067D.f18421l;
                            zA = this.f18095g.a(new S.a(this.f18113x, xVar2, bVar4, j25, jN, f10, this.f18072I, j12));
                        }
                    } else {
                        zA = true;
                    }
                    if (zA) {
                        h0(3);
                        this.f18086W = null;
                        if (k0()) {
                            v0(false, false);
                            C1394l c1394l2 = this.f18103p;
                            z13 = true;
                            c1394l2.f18477g = true;
                            s0Var = c1394l2.f18472b;
                            if (!s0Var.f18605c) {
                                s0Var.f18604b.getClass();
                                s0Var.f18607e = SystemClock.elapsedRealtime();
                                s0Var.f18605c = true;
                            }
                            m0();
                        }
                    } else {
                        z13 = true;
                        if (this.f18067D.f18415e == 3) {
                            v0(k0(), false);
                            h0(2);
                            if (this.f18072I) {
                                while (v10 != null) {
                                    while (i11 < r6) {
                                        if (tVar != null) {
                                            tVar.k();
                                        }
                                    }
                                }
                                c1392j = this.f18111v;
                                j10 = c1392j.f18448i;
                                if (j10 != j) {
                                    long j26 = j10 + c1392j.f18441b;
                                    c1392j.f18448i = j26;
                                    j11 = c1392j.f18447h;
                                    if (j11 != j) {
                                        c1392j.f18448i = j11;
                                    }
                                    c1392j.f18451m = j;
                                }
                            }
                            o0();
                        }
                    }
                }
                if (this.f18067D.f18415e == 2) {
                    i13 = 0;
                    while (true) {
                        p0VarArr = this.f18090b;
                        if (i13 >= p0VarArr.length) {
                            break;
                        }
                        if (p0VarArr[i13].c(v31) != null) {
                            z18 = z13;
                        } else {
                            z18 = false;
                        }
                        if (z18) {
                            C(i13);
                        }
                        i13++;
                    }
                    h0Var3 = this.f18067D;
                    if (h0Var3.f18417g && h0Var3.f18427r < 500000 && x(this.f18109t.f18187m) && k0()) {
                        z16 = z13;
                    } else {
                        z16 = false;
                    }
                } else {
                    z16 = false;
                }
                if (!z16) {
                    this.f18087X = j;
                } else if (this.f18087X == j) {
                    this.f18107r.getClass();
                    this.f18087X = SystemClock.elapsedRealtime();
                } else {
                    this.f18107r.getClass();
                    if (SystemClock.elapsedRealtime() - this.f18087X >= 4000) {
                        throw new IllegalStateException("Playback stuck buffering and not loading");
                    }
                }
                if (k0() || this.f18067D.f18415e != 3) {
                    z17 = false;
                } else {
                    z17 = z13;
                }
                if (this.f18079P || !this.f18078O || !z17) {
                    z13 = false;
                }
                h0Var2 = this.f18067D;
                if (h0Var2.f18425p != z13) {
                    this.f18067D = new h0(h0Var2.f18411a, h0Var2.f18412b, h0Var2.f18413c, h0Var2.f18414d, h0Var2.f18415e, h0Var2.f18416f, h0Var2.f18417g, h0Var2.f18418h, h0Var2.f18419i, h0Var2.j, h0Var2.f18420k, h0Var2.f18421l, h0Var2.f18422m, h0Var2.f18423n, h0Var2.f18424o, h0Var2.f18426q, h0Var2.f18427r, h0Var2.f18428s, h0Var2.f18429t, z13);
                }
                this.f18078O = false;
                if (!z13 && (i12 = this.f18067D.f18415e) != i10 && (z17 || i12 == 2 || (i12 == 3 && this.f18080Q != 0))) {
                    R(jUptimeMillis);
                }
                Trace.endSection();
            }
            h0(i10);
            o0();
            z13 = true;
            if (this.f18067D.f18415e == 2) {
                i13 = 0;
                while (true) {
                    p0VarArr = this.f18090b;
                    if (i13 >= p0VarArr.length) {
                        break;
                        break;
                    }
                    if (p0VarArr[i13].c(v31) != null) {
                        z18 = z13;
                    } else {
                        z18 = false;
                    }
                    if (z18) {
                        C(i13);
                    }
                    i13++;
                }
                h0Var3 = this.f18067D;
                if (h0Var3.f18417g) {
                    z16 = false;
                } else {
                    z16 = false;
                }
            } else {
                z16 = false;
            }
            if (!z16) {
                this.f18087X = j;
            } else if (this.f18087X == j) {
                this.f18107r.getClass();
                this.f18087X = SystemClock.elapsedRealtime();
            } else {
                this.f18107r.getClass();
                if (SystemClock.elapsedRealtime() - this.f18087X >= 4000) {
                    throw new IllegalStateException("Playback stuck buffering and not loading");
                }
            }
            if (k0()) {
                z17 = false;
            } else {
                z17 = false;
            }
            if (this.f18079P) {
                z13 = false;
            } else {
                z13 = false;
            }
            h0Var2 = this.f18067D;
            if (h0Var2.f18425p != z13) {
                this.f18067D = new h0(h0Var2.f18411a, h0Var2.f18412b, h0Var2.f18413c, h0Var2.f18414d, h0Var2.f18415e, h0Var2.f18416f, h0Var2.f18417g, h0Var2.f18418h, h0Var2.f18419i, h0Var2.j, h0Var2.f18420k, h0Var2.f18421l, h0Var2.f18422m, h0Var2.f18423n, h0Var2.f18424o, h0Var2.f18426q, h0Var2.f18427r, h0Var2.f18428s, h0Var2.f18429t, z13);
            }
            this.f18078O = false;
            if (!z13) {
                R(jUptimeMillis);
            }
            Trace.endSection();
        }
        j = -9223372036854775807L;
        if (z12) {
            this.f18071H = false;
            int i32 = this.f18067D.f18423n;
            this.f18068E.a(0);
            s0(this.f18065B.d(this.f18067D.f18415e, false), i32, 5, false);
        }
        if (z12) {
            h0Var = this.f18067D;
            if (h0Var.f18415e != 2) {
                z13 = true;
                if (this.f18067D.f18415e == 3) {
                    v0(k0(), false);
                    h0(2);
                    if (this.f18072I) {
                        while (v10 != null) {
                            while (i11 < r6) {
                                if (tVar != null) {
                                    tVar.k();
                                }
                            }
                        }
                        c1392j = this.f18111v;
                        j10 = c1392j.f18448i;
                        if (j10 != j) {
                            long j27 = j10 + c1392j.f18441b;
                            c1392j.f18448i = j27;
                            j11 = c1392j.f18447h;
                            if (j11 != j) {
                                c1392j.f18448i = j11;
                            }
                            c1392j.f18451m = j;
                        }
                    }
                    o0();
                }
            } else {
                if (this.f18080Q == 0) {
                    zA = y();
                } else if (!z10) {
                    zA = false;
                } else if (h0Var.f18417g) {
                    zA = true;
                } else {
                    Y y18 = this.f18109t;
                    v11 = y18.j;
                    if (l0(h0Var.f18411a, v11.f18154g.f18163a)) {
                        j12 = this.f18111v.f18448i;
                    } else {
                        j12 = j;
                    }
                    v12 = y18.f18187m;
                    if (v12.g()) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    if (v12.f18154g.f18163a.b()) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    if (z14) {
                        zA = true;
                    } else {
                        zA = true;
                    }
                }
                if (zA) {
                    h0(3);
                    this.f18086W = null;
                    if (k0()) {
                        v0(false, false);
                        C1394l c1394l3 = this.f18103p;
                        z13 = true;
                        c1394l3.f18477g = true;
                        s0Var = c1394l3.f18472b;
                        if (!s0Var.f18605c) {
                            s0Var.f18604b.getClass();
                            s0Var.f18607e = SystemClock.elapsedRealtime();
                            s0Var.f18605c = true;
                        }
                        m0();
                    } else {
                        z13 = true;
                    }
                } else {
                    z13 = true;
                    if (this.f18067D.f18415e == 3) {
                        v0(k0(), false);
                        h0(2);
                        if (this.f18072I) {
                            while (v10 != null) {
                                while (i11 < r6) {
                                    if (tVar != null) {
                                        tVar.k();
                                    }
                                }
                            }
                            c1392j = this.f18111v;
                            j10 = c1392j.f18448i;
                            if (j10 != j) {
                                long j28 = j10 + c1392j.f18441b;
                                c1392j.f18448i = j28;
                                j11 = c1392j.f18447h;
                                if (j11 != j) {
                                    c1392j.f18448i = j11;
                                }
                                c1392j.f18451m = j;
                            }
                        }
                        o0();
                    }
                }
            }
        } else {
            h0Var = this.f18067D;
            if (h0Var.f18415e != 2) {
                z13 = true;
                if (this.f18067D.f18415e == 3) {
                    v0(k0(), false);
                    h0(2);
                    if (this.f18072I) {
                        while (v10 != null) {
                            while (i11 < r6) {
                                if (tVar != null) {
                                    tVar.k();
                                }
                            }
                        }
                        c1392j = this.f18111v;
                        j10 = c1392j.f18448i;
                        if (j10 != j) {
                            long j29 = j10 + c1392j.f18441b;
                            c1392j.f18448i = j29;
                            j11 = c1392j.f18447h;
                            if (j11 != j) {
                                c1392j.f18448i = j11;
                            }
                            c1392j.f18451m = j;
                        }
                    }
                    o0();
                }
            } else {
                if (this.f18080Q == 0) {
                    zA = y();
                } else if (!z10) {
                    zA = false;
                } else if (h0Var.f18417g) {
                    zA = true;
                } else {
                    Y y19 = this.f18109t;
                    v11 = y19.j;
                    if (l0(h0Var.f18411a, v11.f18154g.f18163a)) {
                        j12 = this.f18111v.f18448i;
                    } else {
                        j12 = j;
                    }
                    v12 = y19.f18187m;
                    if (v12.g()) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    if (v12.f18154g.f18163a.b()) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    if (z14) {
                        zA = true;
                    } else {
                        zA = true;
                    }
                }
                if (zA) {
                    h0(3);
                    this.f18086W = null;
                    if (k0()) {
                        v0(false, false);
                        C1394l c1394l4 = this.f18103p;
                        z13 = true;
                        c1394l4.f18477g = true;
                        s0Var = c1394l4.f18472b;
                        if (!s0Var.f18605c) {
                            s0Var.f18604b.getClass();
                            s0Var.f18607e = SystemClock.elapsedRealtime();
                            s0Var.f18605c = true;
                        }
                        m0();
                    } else {
                        z13 = true;
                    }
                } else {
                    z13 = true;
                    if (this.f18067D.f18415e == 3) {
                        v0(k0(), false);
                        h0(2);
                        if (this.f18072I) {
                            while (v10 != null) {
                                while (i11 < r6) {
                                    if (tVar != null) {
                                        tVar.k();
                                    }
                                }
                            }
                            c1392j = this.f18111v;
                            j10 = c1392j.f18448i;
                            if (j10 != j) {
                                long j210 = j10 + c1392j.f18441b;
                                c1392j.f18448i = j210;
                                j11 = c1392j.f18447h;
                                if (j11 != j) {
                                    c1392j.f18448i = j11;
                                }
                                c1392j.f18451m = j;
                            }
                        }
                        o0();
                    }
                }
            }
        }
        if (this.f18067D.f18415e == 2) {
            i13 = 0;
            while (true) {
                p0VarArr = this.f18090b;
                if (i13 >= p0VarArr.length) {
                    break;
                    break;
                }
                if (p0VarArr[i13].c(v31) != null) {
                    z18 = z13;
                } else {
                    z18 = false;
                }
                if (z18) {
                    C(i13);
                }
                i13++;
            }
            h0Var3 = this.f18067D;
            if (h0Var3.f18417g) {
                z16 = false;
            } else {
                z16 = false;
            }
        } else {
            z16 = false;
        }
        if (!z16) {
            this.f18087X = j;
        } else if (this.f18087X == j) {
            this.f18107r.getClass();
            this.f18087X = SystemClock.elapsedRealtime();
        } else {
            this.f18107r.getClass();
            if (SystemClock.elapsedRealtime() - this.f18087X >= 4000) {
                throw new IllegalStateException("Playback stuck buffering and not loading");
            }
        }
        if (k0()) {
            z17 = false;
        } else {
            z17 = false;
        }
        if (this.f18079P) {
            z13 = false;
        } else {
            z13 = false;
        }
        h0Var2 = this.f18067D;
        if (h0Var2.f18425p != z13) {
            this.f18067D = new h0(h0Var2.f18411a, h0Var2.f18412b, h0Var2.f18413c, h0Var2.f18414d, h0Var2.f18415e, h0Var2.f18416f, h0Var2.f18417g, h0Var2.f18418h, h0Var2.f18419i, h0Var2.j, h0Var2.f18420k, h0Var2.f18421l, h0Var2.f18422m, h0Var2.f18423n, h0Var2.f18424o, h0Var2.f18426q, h0Var2.f18427r, h0Var2.f18428s, h0Var2.f18429t, z13);
        }
        this.f18078O = false;
        if (!z13) {
            R(jUptimeMillis);
        }
        Trace.endSection();
    }

    public final void h0(int i10) {
        h0 h0Var = this.f18067D;
        if (h0Var.f18415e != i10) {
            if (i10 != 2) {
                this.f18087X = -9223372036854775807L;
            }
            this.f18067D = h0Var.h(i10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:135:0x025f  */
    /* JADX WARN: Code duplicated, block: B:137:0x0263  */
    /* JADX WARN: Code duplicated, block: B:144:0x027c A[LOOP:1: B:142:0x0276->B:144:0x027c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:152:0x0280 A[EDGE_INSN: B:152:0x0280->B:145:0x0280 BREAK  A[LOOP:1: B:142:0x0276->B:144:0x027c], SYNTHETIC] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        ExoPlaybackException exoPlaybackException;
        ExoPlaybackException exoPlaybackException2;
        V v10;
        int i10;
        V v11;
        V v12;
        int i11;
        int i12 = Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS;
        try {
            switch (message.what) {
                case 1:
                    boolean z10 = message.arg1 != 0;
                    int i13 = message.arg2;
                    this.f18068E.a(1);
                    s0(this.f18065B.d(this.f18067D.f18415e, z10), i13 >> 4, i13 & 15, z10);
                    break;
                case 2:
                    h();
                    break;
                case 3:
                    T((g) message.obj);
                    break;
                case 4:
                    b0((p078g1.u) message.obj);
                    break;
                case 5:
                    e0((r0) message.obj);
                    break;
                case 6:
                    n0(false, true);
                    break;
                case 7:
                    H();
                    return true;
                case 8:
                    u((androidx.media3.exoplayer.source.g) message.obj);
                    break;
                case 9:
                    q((androidx.media3.exoplayer.source.g) message.obj);
                    break;
                case 10:
                    K();
                    break;
                case 11:
                    d0(message.arg1);
                    break;
                case 12:
                    f0(message.arg1 != 0);
                    break;
                case 13:
                    Y(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    V((j0) message.obj);
                    break;
                case 15:
                    W((j0) message.obj);
                    break;
                case 16:
                    p078g1.u uVar = (p078g1.u) message.obj;
                    v(uVar, uVar.f35452a, true, false);
                    break;
                case 17:
                    Z((b) message.obj);
                    break;
                case 18:
                    a((b) message.obj, message.arg1);
                    break;
                case 19:
                    F((c) message.obj);
                    break;
                case 20:
                    J(message.arg1, message.arg2, (p235t1.s) message.obj);
                    break;
                case 21:
                    g0((p235t1.s) message.obj);
                    break;
                case 22:
                    E();
                    break;
                case 23:
                    a0(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    d();
                    break;
                case 26:
                    K();
                    S(true);
                    break;
                case 27:
                    r0(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    c0((ExoPlayer.c) message.obj);
                    break;
                case 29:
                    G();
                    break;
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                    Pair pair = (Pair) message.obj;
                    i0(pair.first, (AtomicBoolean) pair.second);
                    break;
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                    X((C2198d) message.obj, message.arg1 != 0);
                    break;
                case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                    j0(((Float) message.obj).floatValue());
                    break;
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                    o(message.arg1);
                    break;
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                    p();
                    break;
            }
        } catch (ParserException e10) {
            int i14 = e10.dataType;
            if (i14 == 1) {
                i11 = e10.contentIsMalformed ? 3001 : 3003;
            } else {
                if (i14 == 4) {
                    i11 = e10.contentIsMalformed ? 3002 : 3004;
                }
                r(e10, i12);
            }
            i12 = i11;
            r(e10, i12);
        } catch (DataSourceException e11) {
            r(e11, e11.reason);
        } catch (ExoPlaybackException e12) {
            ExoPlaybackException exoPlaybackExceptionA = e12;
            int i15 = exoPlaybackExceptionA.type;
            p0[] p0VarArr = this.f18090b;
            Y y10 = this.f18109t;
            if (i15 == 1 && (v11 = y10.f18185k) != null) {
                int i16 = exoPlaybackExceptionA.rendererIndex;
                exoPlaybackExceptionA = exoPlaybackExceptionA.a((!p0VarArr[i16 % p0VarArr.length].h(i16) || (v12 = v11.f18159m) == null) ? v11.f18154g.f18163a : v12.f18154g.f18163a);
            }
            boolean z11 = exoPlaybackExceptionA.isRecoverable;
            p114j1.g gVar = this.f18097i;
            if (z11 && (this.f18086W == null || (i10 = exoPlaybackExceptionA.errorCode) == 5004 || i10 == 5003)) {
                p114j1.k.g("Recoverable renderer error", exoPlaybackExceptionA);
                ExoPlaybackException exoPlaybackException3 = this.f18086W;
                if (exoPlaybackException3 != null) {
                    exoPlaybackException3.addSuppressed(exoPlaybackExceptionA);
                    exoPlaybackExceptionA = this.f18086W;
                } else {
                    this.f18086W = exoPlaybackExceptionA;
                }
                gVar.a(gVar.k(25, exoPlaybackExceptionA));
            } else if (exoPlaybackExceptionA.type == 1) {
                int i17 = exoPlaybackExceptionA.rendererIndex;
                if (p0VarArr[i17 % p0VarArr.length].h(i17)) {
                    this.f18104p0 = true;
                    e();
                    V vG = y10.g();
                    V v13 = y10.j;
                    if (v13 != vG) {
                        while (v13 != null) {
                            V v14 = v13.f18159m;
                            if (v14 == vG) {
                                break;
                            }
                            v13 = v14;
                        }
                    }
                    y10.o(v13);
                    if (this.f18067D.f18415e != 4) {
                        z();
                        gVar.i(2);
                    }
                } else {
                    exoPlaybackException = this.f18086W;
                    if (exoPlaybackException != null) {
                        exoPlaybackException.addSuppressed(exoPlaybackExceptionA);
                        exoPlaybackExceptionA = this.f18086W;
                    }
                    exoPlaybackException2 = exoPlaybackExceptionA;
                    p114j1.k.d("ExoPlayerImplInternal", "Playback error", exoPlaybackException2);
                    if (exoPlaybackException2.type == 1 && y10.j != y10.f18185k) {
                        while (true) {
                            v10 = y10.j;
                            if (v10 != y10.f18185k) {
                                break;
                            }
                            y10.a();
                        }
                        p241t7.b.h(v10);
                        B();
                        W w3 = v10.f18154g;
                        androidx.media3.exoplayer.source.h.b bVar = w3.f18163a;
                        long j = w3.f18164b;
                        this.f18067D = w(bVar, j, w3.f18165c, j, true, 0);
                    }
                    n0(true, false);
                    this.f18067D = this.f18067D.f(exoPlaybackException2);
                }
            } else {
                exoPlaybackException = this.f18086W;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(exoPlaybackExceptionA);
                    exoPlaybackExceptionA = this.f18086W;
                }
                exoPlaybackException2 = exoPlaybackExceptionA;
                p114j1.k.d("ExoPlayerImplInternal", "Playback error", exoPlaybackException2);
                if (exoPlaybackException2.type == 1) {
                    while (true) {
                        v10 = y10.j;
                        if (v10 != y10.f18185k) {
                            break;
                            break;
                        }
                        y10.a();
                    }
                    p241t7.b.h(v10);
                    B();
                    W w10 = v10.f18154g;
                    androidx.media3.exoplayer.source.h.b bVar2 = w10.f18163a;
                    long j10 = w10.f18164b;
                    this.f18067D = w(bVar2, j10, w10.f18165c, j10, true, 0);
                }
                n0(true, false);
                this.f18067D = this.f18067D.f(exoPlaybackException2);
            }
        } catch (DrmSession.DrmSessionException e13) {
            r(e13, e13.errorCode);
        } catch (BehindLiveWindowException e14) {
            r(e14, 1002);
        } catch (IOException e15) {
            r(e15, 2000);
        } catch (RuntimeException e16) {
            if ((e16 instanceof IllegalStateException) || (e16 instanceof IllegalArgumentException)) {
                i12 = 1004;
            }
            ExoPlaybackException exoPlaybackException4 = new ExoPlaybackException(2, e16, i12);
            p114j1.k.d("ExoPlayerImplInternal", "Playback error", exoPlaybackException4);
            n0(true, false);
            this.f18067D = this.f18067D.f(exoPlaybackException4);
        }
        B();
        return true;
    }

    public final void i(V v10, int i10, boolean z10, long j) throws ExoPlaybackException {
        p0 p0Var = this.f18090b[i10];
        if (p0Var.f()) {
            return;
        }
        boolean z11 = v10 == this.f18109t.j;
        p259v1.y yVar = v10.f18161o;
        o0 o0Var = yVar.f47624b[i10];
        p259v1.t tVar = yVar.f47625c[i10];
        boolean z12 = k0() && this.f18067D.f18415e == 3;
        boolean z13 = !z10 && z12;
        this.f18080Q++;
        p235t1.r rVar = v10.f18150c[i10];
        long j10 = v10.f18162p;
        W w3 = v10.f18154g;
        int length = tVar != null ? tVar.length() : 0;
        p078g1.n[] nVarArr = new p078g1.n[length];
        for (int i11 = 0; i11 < length; i11++) {
            tVar.getClass();
            nVarArr[i11] = tVar.c(i11);
        }
        int i12 = p0Var.f18596d;
        androidx.media3.exoplayer.source.h.b bVar = w3.f18163a;
        C1394l c1394l = this.f18103p;
        if (i12 == 0 || i12 == 2 || i12 == 4) {
            p0Var.f18597e = true;
            p0Var.f18593a.w(o0Var, nVarArr, rVar, z13, z11, j, j10, bVar);
            c1394l.a(p0Var.f18593a);
        } else {
            p0Var.f18598f = true;
            m0 m0Var = p0Var.f18595c;
            m0Var.getClass();
            m0Var.w(o0Var, nVarArr, rVar, z13, z11, j, j10, bVar);
            c1394l.a(m0Var);
        }
        a aVar = new a();
        m0 m0VarC = p0Var.c(v10);
        m0VarC.getClass();
        m0VarC.x(11, aVar);
        if (z12 && z11) {
            p0Var.m();
        }
    }

    public final void i0(Object obj, AtomicBoolean atomicBoolean) throws ExoPlaybackException {
        for (p0 p0Var : this.f18090b) {
            m0 m0Var = p0Var.f18593a;
            if (m0Var.E() == 2) {
                int i10 = p0Var.f18596d;
                if (i10 == 4 || i10 == 1) {
                    m0 m0Var2 = p0Var.f18595c;
                    m0Var2.getClass();
                    m0Var2.x(1, obj);
                } else {
                    m0Var.x(1, obj);
                }
            }
        }
        int i11 = this.f18067D.f18415e;
        if (i11 == 3 || i11 == 2) {
            this.f18097i.i(2);
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void j(boolean[] zArr, long j) throws ExoPlaybackException {
        p0[] p0VarArr;
        V v10 = this.f18109t.f18185k;
        p259v1.y yVar = v10.f18161o;
        int i10 = 0;
        while (true) {
            p0VarArr = this.f18090b;
            if (i10 >= p0VarArr.length) {
                break;
            }
            if (!yVar.b(i10)) {
                p0VarArr[i10].k();
            }
            i10++;
        }
        for (int i11 = 0; i11 < p0VarArr.length; i11++) {
            if (yVar.b(i11) && p0VarArr[i11].c(v10) == null) {
                i(v10, i11, zArr[i11], j);
            }
        }
    }

    public final void j0(float f10) throws ExoPlaybackException {
        this.f18106q0 = f10;
        float f11 = f10 * this.f18065B.f18354g;
        for (p0 p0Var : this.f18090b) {
            m0 m0Var = p0Var.f18593a;
            if (m0Var.E() == 1) {
                m0Var.x(2, Float.valueOf(f11));
                m0 m0Var2 = p0Var.f18595c;
                if (m0Var2 != null) {
                    m0Var2.x(2, Float.valueOf(f11));
                }
            }
        }
    }

    public final long k(p078g1.x xVar, Object obj, long j) {
        g1.x.b bVar = this.f18100m;
        int i10 = xVar.g(obj, bVar).f35470c;
        g1.x.c cVar = this.f18099l;
        xVar.n(i10, cVar);
        if (cVar.f35481e == -9223372036854775807L || !cVar.a() || !cVar.f35484h) {
            return -9223372036854775807L;
        }
        long j10 = cVar.f35482f;
        return p114j1.A.F((j10 == -9223372036854775807L ? System.currentTimeMillis() : j10 + SystemClock.elapsedRealtime()) - cVar.f35481e) - (j + bVar.f35472e);
    }

    public final boolean k0() {
        h0 h0Var = this.f18067D;
        return h0Var.f18421l && h0Var.f18423n == 0;
    }

    public final long l(V v10) {
        if (v10 == null) {
            return 0L;
        }
        long jMax = v10.f18162p;
        if (!v10.f18152e) {
            return jMax;
        }
        int i10 = 0;
        while (true) {
            p0[] p0VarArr = this.f18090b;
            if (i10 >= p0VarArr.length) {
                return jMax;
            }
            if (p0VarArr[i10].c(v10) != null) {
                m0 m0VarC = p0VarArr[i10].c(v10);
                Objects.requireNonNull(m0VarC);
                long jA = m0VarC.A();
                if (jA == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jMax = Math.max(jA, jMax);
            }
            i10++;
        }
    }

    public final boolean l0(p078g1.x xVar, androidx.media3.exoplayer.source.h.b bVar) {
        if (bVar.b() || xVar.p()) {
            return false;
        }
        int i10 = xVar.g(bVar.f18698a, this.f18100m).f35470c;
        g1.x.c cVar = this.f18099l;
        xVar.n(i10, cVar);
        return cVar.a() && cVar.f35484h && cVar.f35481e != -9223372036854775807L;
    }

    public final Pair<androidx.media3.exoplayer.source.h.b, Long> m(p078g1.x xVar) {
        long j = 0;
        if (xVar.p()) {
            return Pair.create(h0.f18410u, 0L);
        }
        Pair<Object, Long> pairI = xVar.i(this.f18099l, this.f18100m, xVar.a(this.f18076M), -9223372036854775807L);
        androidx.media3.exoplayer.source.h.b bVarQ = this.f18109t.q(xVar, pairI.first, 0L);
        long jLongValue = ((Long) pairI.second).longValue();
        if (bVarQ.b()) {
            Object obj = bVarQ.f18698a;
            g1.x.b bVar = this.f18100m;
            xVar.g(obj, bVar);
            if (bVarQ.f18700c == bVar.e(bVarQ.f18699b)) {
                bVar.f35474g.getClass();
            }
        } else {
            j = jLongValue;
        }
        return Pair.create(bVarQ, Long.valueOf(j));
    }

    public final void m0() throws ExoPlaybackException {
        V v10 = this.f18109t.j;
        if (v10 == null) {
            return;
        }
        p259v1.y yVar = v10.f18161o;
        int i10 = 0;
        while (true) {
            p0[] p0VarArr = this.f18090b;
            if (i10 >= p0VarArr.length) {
                return;
            }
            if (yVar.b(i10)) {
                p0VarArr[i10].m();
            }
            i10++;
        }
    }

    public final long n(long j) {
        V v10 = this.f18109t.f18187m;
        if (v10 == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.f18082S - v10.f18162p));
    }

    public final void n0(boolean z10, boolean z11) {
        L(z10 || !this.f18077N, false, true, false);
        this.f18068E.a(z11 ? 1 : 0);
        this.f18095g.i(this.f18113x);
        this.f18065B.d(1, this.f18067D.f18421l);
        h0(1);
    }

    public final void o(int i10) throws ExoPlaybackException {
        h0 h0Var = this.f18067D;
        s0(i10, h0Var.f18423n, h0Var.f18422m, h0Var.f18421l);
    }

    public final void o0() throws ExoPlaybackException {
        C1394l c1394l = this.f18103p;
        c1394l.f18477g = false;
        s0 s0Var = c1394l.f18472b;
        if (s0Var.f18605c) {
            s0Var.a(s0Var.r());
            s0Var.f18605c = false;
        }
        for (p0 p0Var : this.f18090b) {
            m0 m0Var = p0Var.f18593a;
            if (p0.g(m0Var) && m0Var.getState() == 2) {
                m0Var.stop();
            }
            m0 m0Var2 = p0Var.f18595c;
            if (m0Var2 != null && m0Var2.getState() != 0 && m0Var2.getState() == 2) {
                m0Var2.stop();
            }
        }
    }

    public final void p() throws ExoPlaybackException {
        j0(this.f18106q0);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.media3.exoplayer.source.m, java.lang.Object] */
    public final void p0() {
        V v10 = this.f18109t.f18187m;
        boolean z10 = this.f18074K || (v10 != null && v10.f18148a.i());
        h0 h0Var = this.f18067D;
        if (z10 != h0Var.f18417g) {
            this.f18067D = h0Var.b(z10);
        }
    }

    public final void q(androidx.media3.exoplayer.source.g gVar) {
        Y y10 = this.f18109t;
        V v10 = y10.f18187m;
        if (v10 != null && v10.f18148a == gVar) {
            y10.m(this.f18082S);
            z();
            return;
        }
        V v11 = y10.f18188n;
        if (v11 == null || v11.f18148a != gVar) {
            return;
        }
        A();
    }

    public final void q0(androidx.media3.exoplayer.source.h.b bVar, p235t1.w wVar, p259v1.y yVar) {
        long j;
        long j10;
        Y y10 = this.f18109t;
        V v10 = y10.f18187m;
        v10.getClass();
        if (v10 == y10.j) {
            j = this.f18082S;
            j10 = v10.f18162p;
        } else {
            j = this.f18082S - v10.f18162p;
            j10 = v10.f18154g.f18164b;
        }
        long j11 = j - j10;
        long jN = n(v10.d());
        long j12 = l0(this.f18067D.f18411a, v10.f18154g.f18163a) ? this.f18111v.f18448i : -9223372036854775807L;
        p078g1.x xVar = this.f18067D.f18411a;
        float f10 = this.f18103p.g().f35452a;
        boolean z10 = this.f18067D.f18421l;
        this.f18095g.j(new S.a(this.f18113x, xVar, bVar, j11, jN, f10, this.f18072I, j12), yVar.f47625c);
    }

    public final void r(IOException iOException, int i10) {
        ExoPlaybackException exoPlaybackException = new ExoPlaybackException(0, iOException, i10);
        V v10 = this.f18109t.j;
        if (v10 != null) {
            exoPlaybackException = exoPlaybackException.a(v10.f18154g.f18163a);
        }
        p114j1.k.d("ExoPlayerImplInternal", "Playback error", exoPlaybackException);
        n0(false, false);
        this.f18067D = this.f18067D.f(exoPlaybackException);
    }

    public final void r0(int i10, int i11, List<p078g1.p> list) throws Throwable {
        this.f18068E.a(1);
        g0 g0Var = this.f18110u;
        g0Var.getClass();
        ArrayList arrayList = g0Var.f18379b;
        p241t7.b.e(i10 >= 0 && i10 <= i11 && i11 <= arrayList.size());
        p241t7.b.e(list.size() == i11 - i10);
        for (int i12 = i10; i12 < i11; i12++) {
            ((g0.c) arrayList.get(i12)).f18394a.l(list.get(i12 - i10));
        }
        t(g0Var.b(), false);
    }

    public final void s(boolean z10) {
        V v10 = this.f18109t.f18187m;
        androidx.media3.exoplayer.source.h.b bVar = v10 == null ? this.f18067D.f18412b : v10.f18154g.f18163a;
        boolean zEquals = this.f18067D.f18420k.equals(bVar);
        if (!zEquals) {
            this.f18067D = this.f18067D.c(bVar);
        }
        h0 h0Var = this.f18067D;
        h0Var.f18426q = v10 == null ? h0Var.f18428s : v10.d();
        h0 h0Var2 = this.f18067D;
        h0Var2.f18427r = n(h0Var2.f18426q);
        if ((!zEquals || z10) && v10 != null && v10.f18152e) {
            q0(v10.f18154g.f18163a, v10.f18160n, v10.f18161o);
        }
    }

    public final void s0(int i10, int i11, int i12, boolean z10) throws ExoPlaybackException {
        boolean z11 = z10 && i10 != -1;
        if (i10 == -1) {
            i12 = 2;
        } else if (i12 == 2) {
            i12 = 1;
        }
        if (i10 == 0) {
            i11 = 1;
        } else if (i11 == 1) {
            i11 = 0;
        }
        h0 h0Var = this.f18067D;
        if (h0Var.f18421l == z11 && h0Var.f18423n == i11 && h0Var.f18422m == i12) {
            return;
        }
        this.f18067D = h0Var.e(i12, i11, z11);
        v0(false, false);
        Y y10 = this.f18109t;
        for (V v10 = y10.j; v10 != null; v10 = v10.f18159m) {
            for (p259v1.t tVar : v10.f18161o.f47625c) {
                if (tVar != null) {
                    tVar.b(z11);
                }
            }
        }
        if (!k0()) {
            o0();
            t0();
            y10.m(this.f18082S);
            return;
        }
        int i13 = this.f18067D.f18415e;
        p114j1.g gVar = this.f18097i;
        if (i13 != 3) {
            if (i13 == 2) {
                gVar.i(2);
                return;
            }
            return;
        }
        C1394l c1394l = this.f18103p;
        c1394l.f18477g = true;
        s0 s0Var = c1394l.f18472b;
        if (!s0Var.f18605c) {
            s0Var.f18604b.getClass();
            s0Var.f18607e = SystemClock.elapsedRealtime();
            s0Var.f18605c = true;
        }
        m0();
        gVar.i(2);
    }

    /* JADX WARN: Code duplicated, block: B:208:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:209:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:212:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:214:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:216:0x03df A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:222:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:225:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:229:0x0428  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v57, types: [androidx.media3.exoplayer.P$f] */
    /* JADX WARN: Type inference failed for: r1v81 */
    /* JADX WARN: Type inference failed for: r1v85, types: [androidx.media3.exoplayer.P$f] */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v10 */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r23v5 */
    /* JADX WARN: Type inference failed for: r23v6 */
    /* JADX WARN: Type inference failed for: r23v7 */
    /* JADX WARN: Type inference failed for: r23v8 */
    /* JADX WARN: Type inference failed for: r23v9 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v3, types: [androidx.media3.exoplayer.P$f] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final void t(p078g1.x xVar, boolean z10) throws Throwable {
        androidx.media3.exoplayer.source.h.b bVar;
        int i10;
        int i11;
        long jL;
        int iA;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        long j;
        long j10;
        ?? fVar;
        int i12;
        int iA2;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        ?? r10;
        ?? r11;
        long j11;
        boolean z20;
        ?? r23;
        ?? r24;
        boolean z21;
        long jU;
        int i13;
        int i14;
        V v10;
        ?? r25;
        g gVar;
        ?? r26;
        h0 h0Var = this.f18067D;
        g gVar2 = this.f18081R;
        Y y10 = this.f18109t;
        int i15 = this.f18075L;
        boolean z22 = this.f18076M;
        g1.x.c cVar = this.f18099l;
        g1.x.b bVar2 = this.f18100m;
        if (xVar.p()) {
            z19 = false;
            fVar = new f(h0.f18410u, 0L, -9223372036854775807L, false, true, false);
            jL = 0;
            i11 = -1;
            i10 = 4;
        } else {
            androidx.media3.exoplayer.source.h.b bVar3 = h0Var.f18412b;
            Object obj = bVar3.f18698a;
            p078g1.x xVar2 = h0Var.f18411a;
            boolean z23 = xVar2.p() || xVar2.g(bVar3.f18698a, bVar2).f35473f;
            long jLongValue = (h0Var.f18412b.b() || z23) ? h0Var.f18413c : h0Var.f18428s;
            if (gVar2 != null) {
                i10 = 4;
                Pair<Object, Long> pairP = P(xVar, gVar2, true, i15, z22, cVar, bVar2);
                if (pairP == null) {
                    iA2 = xVar.a(z22);
                    jLongValue = jLongValue;
                    z17 = false;
                    z18 = true;
                    z16 = false;
                } else {
                    if (gVar2.f18134c == -9223372036854775807L) {
                        iA2 = xVar.g(pairP.first, bVar2).f35470c;
                        jLongValue = jLongValue;
                        z15 = false;
                    } else {
                        obj = pairP.first;
                        jLongValue = ((Long) pairP.second).longValue();
                        iA2 = -1;
                        z15 = true;
                    }
                    z16 = h0Var.f18415e == 4;
                    z17 = z15;
                    z18 = false;
                }
                z13 = z17;
                z12 = z18;
                z11 = z16;
                bVar = bVar3;
                i11 = -1;
                jL = 0;
                iA = iA2;
            } else {
                bVar = bVar3;
                i10 = 4;
                if (h0Var.f18411a.p()) {
                    iA = xVar.a(z22);
                    i11 = -1;
                } else {
                    i11 = -1;
                    if (xVar.b(obj) == -1) {
                        int iQ = Q(cVar, bVar2, i15, z22, obj, h0Var.f18411a, xVar);
                        if (iQ == -1) {
                            iQ = xVar.a(z22);
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        iA = iQ;
                        z12 = z14;
                        jLongValue = jLongValue;
                        bVar = bVar;
                        jL = 0;
                        z11 = false;
                        z13 = false;
                    } else if (jLongValue == -9223372036854775807L) {
                        iA = xVar.g(obj, bVar2).f35470c;
                    } else if (z23) {
                        bVar = bVar;
                        h0Var.f18411a.g(bVar.f18698a, bVar2);
                        jL = 0;
                        if (h0Var.f18411a.m(bVar2.f35470c, cVar, 0L).f35488m == h0Var.f18411a.b(bVar.f18698a)) {
                            Pair<Object, Long> pairI = xVar.i(cVar, bVar2, xVar.g(obj, bVar2).f35470c, jLongValue + bVar2.f35472e);
                            obj = pairI.first;
                            jLongValue = ((Long) pairI.second).longValue();
                        } else {
                            jLongValue = jLongValue;
                        }
                        iA = -1;
                        z11 = false;
                        z12 = false;
                        z13 = true;
                    } else {
                        bVar = bVar;
                        jL = 0;
                        iA = -1;
                        jLongValue = jLongValue;
                        z11 = false;
                        z12 = false;
                        z13 = false;
                    }
                }
                jL = 0;
                z11 = false;
                z12 = false;
                z13 = false;
            }
            if (iA != i11) {
                Pair<Object, Long> pairI2 = xVar.i(cVar, bVar2, iA, -9223372036854775807L);
                obj = pairI2.first;
                jLongValue = ((Long) pairI2.second).longValue();
                j = -9223372036854775807L;
            } else {
                j = jLongValue;
            }
            androidx.media3.exoplayer.source.h.b bVarQ = y10.q(xVar, obj, jLongValue);
            int i16 = bVarQ.f18702e;
            boolean z24 = bVar.f18698a.equals(obj) && !bVar.b() && !bVarQ.b() && (i16 == i11 || ((i12 = bVar.f18702e) != i11 && i16 >= i12));
            g1.x.b bVarG = xVar.g(obj, bVar2);
            if (!z23 && jLongValue == j && bVar.f18698a.equals(bVarQ.f18698a)) {
                if (bVar.b()) {
                    bVarG.g(bVar.f18699b);
                }
                if (bVarQ.b()) {
                    bVarG.g(bVarQ.f18699b);
                }
            }
            if (z24) {
                bVarQ = bVar;
            }
            if (!bVarQ.b()) {
                j10 = jLongValue;
            } else if (bVarQ.equals(bVar)) {
                j10 = h0Var.f18428s;
            } else {
                xVar.g(bVarQ.f18698a, bVar2);
                if (bVarQ.f18700c == bVar2.e(bVarQ.f18699b)) {
                    bVar2.f35474g.getClass();
                }
                j10 = jL;
            }
            fVar = new f(bVarQ, j10, j, z11, z12, z13);
        }
        androidx.media3.exoplayer.source.h.b bVar4 = fVar.f18126a;
        long j12 = fVar.f18128c;
        boolean z25 = fVar.f18129d;
        long j13 = fVar.f18127b;
        int i17 = i10;
        boolean z26 = (this.f18067D.f18412b.equals(bVar4) && j13 == this.f18067D.f18428s) ? false : true;
        try {
            if (fVar.f18130e) {
                try {
                    z20 = true;
                    if (this.f18067D.f18415e != 1) {
                        try {
                            h0(i17);
                        } catch (Throwable th) {
                            th = th;
                            z19 = z20;
                            r10 = i11;
                            r11 = fVar;
                            h0 h0Var2 = this.f18067D;
                            p078g1.x xVar3 = h0Var2.f18411a;
                            androidx.media3.exoplayer.source.h.b bVar5 = h0Var2.f18412b;
                            if (r11.f18131f) {
                                j11 = j13;
                            } else {
                                j11 = -9223372036854775807L;
                            }
                            u0(xVar, bVar4, xVar3, bVar5, j11, false);
                            if (z26 || j12 != this.f18067D.f18413c) {
                                h0 h0Var3 = this.f18067D;
                                Object obj2 = h0Var3.f18412b.f18698a;
                                p078g1.x xVar4 = h0Var3.f18411a;
                                if (z26 || !z10 || xVar4.p() || xVar4.g(obj2, this.f18100m).f35473f) {
                                    z19 = false;
                                }
                                this.f18067D = w(bVar4, j13, j12, this.f18067D.f18414d, z19, xVar.b(obj2) == r10 ? 4 : 3);
                            }
                            M();
                            O(xVar, this.f18067D.f18411a);
                            this.f18067D = this.f18067D.i(xVar);
                            if (!xVar.p()) {
                                this.f18081R = null;
                            }
                            s(false);
                            this.f18097i.i(2);
                            throw th;
                        }
                    }
                    L(false, false, false, true);
                } catch (Throwable th2) {
                    th = th2;
                    z20 = true;
                    z19 = z20;
                    r10 = i11;
                    r11 = fVar;
                    h0 h0Var4 = this.f18067D;
                    p078g1.x xVar5 = h0Var4.f18411a;
                    androidx.media3.exoplayer.source.h.b bVar6 = h0Var4.f18412b;
                    if (r11.f18131f) {
                        j11 = j13;
                    } else {
                        j11 = -9223372036854775807L;
                    }
                    u0(xVar, bVar4, xVar5, bVar6, j11, false);
                    if (z26) {
                        h0 h0Var5 = this.f18067D;
                        Object obj3 = h0Var5.f18412b.f18698a;
                        p078g1.x xVar6 = h0Var5.f18411a;
                        if (z26) {
                            z19 = false;
                        } else {
                            z19 = false;
                        }
                        this.f18067D = w(bVar4, j13, j12, this.f18067D.f18414d, z19, xVar.b(obj3) == r10 ? 4 : 3);
                    } else {
                        h0 h0Var6 = this.f18067D;
                        Object obj4 = h0Var6.f18412b.f18698a;
                        p078g1.x xVar7 = h0Var6.f18411a;
                        if (z26) {
                            z19 = false;
                        } else {
                            z19 = false;
                        }
                        this.f18067D = w(bVar4, j13, j12, this.f18067D.f18414d, z19, xVar.b(obj4) == r10 ? 4 : 3);
                    }
                    M();
                    O(xVar, this.f18067D.f18411a);
                    this.f18067D = this.f18067D.i(xVar);
                    if (!xVar.p()) {
                        this.f18081R = null;
                    }
                    s(false);
                    this.f18097i.i(2);
                    throw th;
                }
            } else {
                z20 = true;
            }
            for (p0 p0Var : this.f18090b) {
                p0Var.f18593a.F(xVar);
                m0 m0Var = p0Var.f18595c;
                if (m0Var != null) {
                    m0Var.F(xVar);
                }
            }
            try {
                if (z26) {
                    jU = j13;
                    r26 = fVar;
                    i14 = 2;
                    z21 = true;
                    i13 = i11;
                    if (!xVar.p()) {
                        for (V v11 = this.f18109t.j; v11 != null; v11 = v11.f18159m) {
                            if (v11.f18154g.f18163a.equals(bVar4)) {
                                r25 = r26;
                                v11.f18154g = this.f18109t.h(xVar, v11.f18154g);
                                v11.k();
                            } else {
                                r25 = r26;
                            }
                        }
                        r25 = r26;
                        Y y11 = this.f18109t;
                        jU = U(bVar4, jU, y11.j != y11.f18185k, z25);
                        r25 = r26;
                    }
                } else {
                    try {
                        V v12 = this.f18109t.f18185k;
                        long jL2 = v12 == null ? jL : l(v12);
                        if (c() && (v10 = this.f18109t.f18186l) != null) {
                            jL = l(v10);
                        }
                        r24 = fVar;
                        try {
                            z21 = true;
                            jU = j13;
                            i13 = -1;
                            i14 = 2;
                            int iT = this.f18109t.t(xVar, this.f18082S, jL2, jL);
                            if ((iT & 1) != 0) {
                                S(false);
                                r25 = r24;
                            } else if ((iT & 2) != 0) {
                                r25 = r24;
                                e();
                                r25 = r24;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            fVar = -1;
                            z19 = true;
                            r23 = r24;
                            r11 = r23;
                            r10 = fVar;
                            h0 h0Var7 = this.f18067D;
                            p078g1.x xVar8 = h0Var7.f18411a;
                            androidx.media3.exoplayer.source.h.b bVar7 = h0Var7.f18412b;
                            if (r11.f18131f) {
                                j11 = j13;
                            } else {
                                j11 = -9223372036854775807L;
                            }
                            u0(xVar, bVar4, xVar8, bVar7, j11, false);
                            if (z26) {
                                h0 h0Var8 = this.f18067D;
                                Object obj5 = h0Var8.f18412b.f18698a;
                                p078g1.x xVar9 = h0Var8.f18411a;
                                if (z26) {
                                    z19 = false;
                                } else {
                                    z19 = false;
                                }
                                this.f18067D = w(bVar4, j13, j12, this.f18067D.f18414d, z19, xVar.b(obj5) == r10 ? 4 : 3);
                            } else {
                                h0 h0Var9 = this.f18067D;
                                Object obj6 = h0Var9.f18412b.f18698a;
                                p078g1.x xVar10 = h0Var9.f18411a;
                                if (z26) {
                                    z19 = false;
                                } else {
                                    z19 = false;
                                }
                                this.f18067D = w(bVar4, j13, j12, this.f18067D.f18414d, z19, xVar.b(obj6) == r10 ? 4 : 3);
                            }
                            M();
                            O(xVar, this.f18067D.f18411a);
                            this.f18067D = this.f18067D.i(xVar);
                            if (!xVar.p()) {
                                this.f18081R = null;
                            }
                            s(false);
                            this.f18097i.i(2);
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        r23 = fVar;
                        z19 = true;
                        fVar = i11;
                    }
                }
                r25 = r24;
                r25 = r26;
                h0 h0Var10 = this.f18067D;
                u0(xVar, bVar4, h0Var10.f18411a, h0Var10.f18412b, r25.f18131f ? jU : -9223372036854775807L, false);
                if (z26 || j12 != this.f18067D.f18413c) {
                    h0 h0Var11 = this.f18067D;
                    Object obj7 = h0Var11.f18412b.f18698a;
                    p078g1.x xVar11 = h0Var11.f18411a;
                    if (!z26 || !z10 || xVar11.p() || xVar11.g(obj7, this.f18100m).f35473f) {
                        z21 = false;
                    }
                    gVar = null;
                    this.f18067D = w(bVar4, jU, j12, this.f18067D.f18414d, z21, xVar.b(obj7) == i13 ? 4 : 3);
                } else {
                    gVar = null;
                }
                M();
                O(xVar, this.f18067D.f18411a);
                this.f18067D = this.f18067D.i(xVar);
                if (!xVar.p()) {
                    this.f18081R = gVar;
                }
                s(false);
                this.f18097i.i(i14);
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
            z19 = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00df  */
    /* JADX WARN: Type inference failed for: r1v23, types: [androidx.media3.exoplayer.source.g, java.lang.Object] */
    public final void t0() throws ExoPlaybackException {
        p078g1.u uVarG;
        V v10 = this.f18109t.j;
        if (v10 == null) {
            return;
        }
        long jK = v10.f18152e ? v10.f18148a.k() : -9223372036854775807L;
        if (jK != -9223372036854775807L) {
            if (!v10.g()) {
                this.f18109t.o(v10);
                s(false);
                z();
            }
            N(jK);
            if (jK != this.f18067D.f18428s) {
                h0 h0Var = this.f18067D;
                this.f18067D = w(h0Var.f18412b, jK, h0Var.f18413c, jK, true, 5);
            }
        } else {
            C1394l c1394l = this.f18103p;
            boolean z10 = v10 != this.f18109t.f18185k;
            m0 m0Var = c1394l.f18474d;
            s0 s0Var = c1394l.f18472b;
            if (m0Var == null || m0Var.d() || ((z10 && c1394l.f18474d.getState() != 2) || (!c1394l.f18474d.b() && (z10 || c1394l.f18474d.h())))) {
                c1394l.f18476f = true;
                if (c1394l.f18477g && !s0Var.f18605c) {
                    s0Var.f18604b.getClass();
                    s0Var.f18607e = SystemClock.elapsedRealtime();
                    s0Var.f18605c = true;
                }
            } else {
                U u10 = c1394l.f18475e;
                u10.getClass();
                long jR = u10.r();
                if (!c1394l.f18476f) {
                    s0Var.a(jR);
                    uVarG = u10.g();
                    if (!uVarG.equals(s0Var.f18608f)) {
                        s0Var.e(uVarG);
                        c1394l.f18473c.f18097i.k(16, uVarG).b();
                    }
                } else if (jR >= s0Var.r()) {
                    c1394l.f18476f = false;
                    if (c1394l.f18477g && !s0Var.f18605c) {
                        s0Var.f18604b.getClass();
                        s0Var.f18607e = SystemClock.elapsedRealtime();
                        s0Var.f18605c = true;
                    }
                    s0Var.a(jR);
                    uVarG = u10.g();
                    if (!uVarG.equals(s0Var.f18608f)) {
                        s0Var.e(uVarG);
                        c1394l.f18473c.f18097i.k(16, uVarG).b();
                    }
                } else if (s0Var.f18605c) {
                    s0Var.a(s0Var.r());
                    s0Var.f18605c = false;
                }
            }
            long jR2 = c1394l.r();
            this.f18082S = jR2;
            long j = jR2 - v10.f18162p;
            long j10 = this.f18067D.f18428s;
            if (!this.f18105q.isEmpty() && !this.f18067D.f18412b.b()) {
                if (this.f18085V) {
                    j10--;
                    this.f18085V = false;
                }
                h0 h0Var2 = this.f18067D;
                int iB = h0Var2.f18411a.b(h0Var2.f18412b.f18698a);
                int iMin = Math.min(this.f18084U, this.f18105q.size());
                d dVar = iMin > 0 ? this.f18105q.get(iMin - 1) : null;
                while (dVar != null && (iB < 0 || (iB == 0 && 0 > j10))) {
                    int i10 = iMin - 1;
                    dVar = i10 > 0 ? this.f18105q.get(iMin - 2) : null;
                    iMin = i10;
                }
                if (iMin < this.f18105q.size()) {
                    this.f18105q.get(iMin);
                }
                this.f18084U = iMin;
            }
            if (this.f18103p.t()) {
                boolean z11 = !this.f18068E.f18124d;
                h0 h0Var3 = this.f18067D;
                this.f18067D = w(h0Var3.f18412b, j, h0Var3.f18413c, j, z11, 6);
            } else {
                h0 h0Var4 = this.f18067D;
                h0Var4.f18428s = j;
                h0Var4.f18429t = SystemClock.elapsedRealtime();
            }
        }
        this.f18067D.f18426q = this.f18109t.f18187m.d();
        h0 h0Var5 = this.f18067D;
        h0Var5.f18427r = n(h0Var5.f18426q);
        h0 h0Var6 = this.f18067D;
        if (h0Var6.f18421l && h0Var6.f18415e == 3 && l0(h0Var6.f18411a, h0Var6.f18412b)) {
            h0 h0Var7 = this.f18067D;
            float f10 = 1.0f;
            if (h0Var7.f18424o.f35452a == 1.0f) {
                C1392j c1392j = this.f18111v;
                long jK2 = k(h0Var7.f18411a, h0Var7.f18412b.f18698a, h0Var7.f18428s);
                long j11 = this.f18067D.f18427r;
                if (c1392j.f18443d != -9223372036854775807L) {
                    long j12 = jK2 - j11;
                    long j13 = c1392j.f18452n;
                    if (j13 == -9223372036854775807L) {
                        c1392j.f18452n = j12;
                        c1392j.f18453o = 0L;
                    } else {
                        float f11 = c1392j.f18442c;
                        float f12 = 1.0f - f11;
                        long jMax = Math.max(j12, (long) ((j12 * f12) + (j13 * f11)));
                        c1392j.f18452n = jMax;
                        c1392j.f18453o = (long) ((f12 * Math.abs(j12 - jMax)) + (f11 * c1392j.f18453o));
                    }
                    if (c1392j.f18451m == -9223372036854775807L || SystemClock.elapsedRealtime() - c1392j.f18451m >= 1000) {
                        c1392j.f18451m = SystemClock.elapsedRealtime();
                        long j14 = (c1392j.f18453o * 3) + c1392j.f18452n;
                        if (c1392j.f18448i > j14) {
                            float F10 = p114j1.A.F(1000L);
                            long[] jArr = {j14, c1392j.f18445f, c1392j.f18448i - (((long) ((c1392j.f18450l - 1.0f) * F10)) + ((long) ((c1392j.j - 1.0f) * F10)))};
                            long j15 = jArr[0];
                            for (int i11 = 1; i11 < 3; i11++) {
                                long j16 = jArr[i11];
                                if (j16 > j15) {
                                    j15 = j16;
                                }
                            }
                            c1392j.f18448i = j15;
                        } else {
                            long jH = p114j1.A.h(jK2 - ((long) (Math.max(0.0f, c1392j.f18450l - 1.0f) / 1.0E-7f)), c1392j.f18448i, j14);
                            c1392j.f18448i = jH;
                            long j17 = c1392j.f18447h;
                            if (j17 != -9223372036854775807L && jH > j17) {
                                c1392j.f18448i = j17;
                            }
                        }
                        long j18 = jK2 - c1392j.f18448i;
                        if (Math.abs(j18) < c1392j.f18440a) {
                            c1392j.f18450l = 1.0f;
                        } else {
                            c1392j.f18450l = p114j1.A.f((1.0E-7f * j18) + 1.0f, c1392j.f18449k, c1392j.j);
                        }
                        f10 = c1392j.f18450l;
                    } else {
                        f10 = c1392j.f18450l;
                    }
                }
                if (this.f18103p.g().f35452a != f10) {
                    p078g1.u uVar = new p078g1.u(f10, this.f18067D.f18424o.f35453b);
                    this.f18097i.j(16);
                    this.f18103p.e(uVar);
                    v(this.f18067D.f18424o, this.f18103p.g().f35452a, false, false);
                }
            }
        }
    }

    public final void u(androidx.media3.exoplayer.source.g gVar) throws ExoPlaybackException {
        V v10;
        Y y10 = this.f18109t;
        V v11 = y10.f18187m;
        int i10 = 0;
        boolean z10 = v11 != null && v11.f18148a == gVar;
        C1394l c1394l = this.f18103p;
        if (z10) {
            v11.getClass();
            if (!v11.f18152e) {
                float f10 = c1394l.g().f35452a;
                h0 h0Var = this.f18067D;
                v11.f(f10, h0Var.f18411a, h0Var.f18421l);
            }
            q0(v11.f18154g.f18163a, v11.f18160n, v11.f18161o);
            if (v11 == y10.j) {
                N(v11.f18154g.f18164b);
                j(new boolean[this.f18090b.length], y10.f18185k.e());
                v11.f18155h = true;
                h0 h0Var2 = this.f18067D;
                androidx.media3.exoplayer.source.h.b bVar = h0Var2.f18412b;
                W w3 = v11.f18154g;
                long j = h0Var2.f18413c;
                long j10 = w3.f18164b;
                this.f18067D = w(bVar, j10, j, j10, false, 5);
            }
            z();
            return;
        }
        while (true) {
            if (i10 >= y10.f18192r.size()) {
                v10 = null;
                break;
            }
            v10 = (V) y10.f18192r.get(i10);
            if (v10.f18148a == gVar) {
                break;
            } else {
                i10++;
            }
        }
        if (v10 != null) {
            p241t7.b.k(!v10.f18152e);
            float f11 = c1394l.g().f35452a;
            h0 h0Var3 = this.f18067D;
            v10.f(f11, h0Var3.f18411a, h0Var3.f18421l);
            V v12 = y10.f18188n;
            if (v12 == null || v12.f18148a != gVar) {
                return;
            }
            A();
        }
    }

    public final void u0(p078g1.x xVar, androidx.media3.exoplayer.source.h.b bVar, p078g1.x xVar2, androidx.media3.exoplayer.source.h.b bVar2, long j, boolean z10) throws ExoPlaybackException {
        if (!l0(xVar, bVar)) {
            p078g1.u uVar = bVar.b() ? p078g1.u.f35451d : this.f18067D.f18424o;
            C1394l c1394l = this.f18103p;
            if (c1394l.g().equals(uVar)) {
                return;
            }
            this.f18097i.j(16);
            c1394l.e(uVar);
            v(this.f18067D.f18424o, uVar.f35452a, false, false);
            return;
        }
        Object obj = bVar.f18698a;
        g1.x.b bVar3 = this.f18100m;
        int i10 = xVar.g(obj, bVar3).f35470c;
        g1.x.c cVar = this.f18099l;
        xVar.n(i10, cVar);
        g1.p.e eVar = cVar.f35485i;
        C1392j c1392j = this.f18111v;
        c1392j.getClass();
        c1392j.f18443d = p114j1.A.F(eVar.f35374a);
        c1392j.f18446g = p114j1.A.F(eVar.f35375b);
        c1392j.f18447h = p114j1.A.F(eVar.f35376c);
        float f10 = eVar.f35377d;
        if (f10 == -3.4028235E38f) {
            f10 = 0.97f;
        }
        c1392j.f18449k = f10;
        float f11 = eVar.f35378e;
        if (f11 == -3.4028235E38f) {
            f11 = 1.03f;
        }
        c1392j.j = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            c1392j.f18443d = -9223372036854775807L;
        }
        c1392j.a();
        if (j != -9223372036854775807L) {
            c1392j.f18444e = k(xVar, obj, j);
            c1392j.a();
            return;
        }
        if (!Objects.equals(!xVar2.p() ? xVar2.m(xVar2.g(bVar2.f18698a, bVar3).f35470c, cVar, 0L).f35477a : null, cVar.f35477a) || z10) {
            c1392j.f18444e = -9223372036854775807L;
            c1392j.a();
        }
    }

    public final void v(p078g1.u uVar, float f10, boolean z10, boolean z11) throws ExoPlaybackException {
        int i10;
        if (z10) {
            if (z11) {
                this.f18068E.a(1);
            }
            this.f18067D = this.f18067D.g(uVar);
        }
        float f11 = uVar.f35452a;
        V v10 = this.f18109t.j;
        while (true) {
            i10 = 0;
            if (v10 == null) {
                break;
            }
            p259v1.t[] tVarArr = v10.f18161o.f47625c;
            int length = tVarArr.length;
            while (i10 < length) {
                p259v1.t tVar = tVarArr[i10];
                if (tVar != null) {
                    tVar.i(f11);
                }
                i10++;
            }
            v10 = v10.f18159m;
        }
        p0[] p0VarArr = this.f18090b;
        int length2 = p0VarArr.length;
        while (i10 < length2) {
            p0 p0Var = p0VarArr[i10];
            m0 m0Var = p0Var.f18593a;
            float f12 = uVar.f35452a;
            m0Var.s(f10, f12);
            m0 m0Var2 = p0Var.f18595c;
            if (m0Var2 != null) {
                m0Var2.s(f10, f12);
            }
            i10++;
        }
    }

    public final void v0(boolean z10, boolean z11) {
        long jElapsedRealtime;
        this.f18072I = z10;
        if (!z10 || z11) {
            jElapsedRealtime = -9223372036854775807L;
        } else {
            this.f18107r.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.f18073J = jElapsedRealtime;
    }

    public final h0 w(androidx.media3.exoplayer.source.h.b bVar, long j, long j10, long j11, boolean z10, int i10) {
        p235t1.w wVar;
        p259v1.y yVar;
        List<p078g1.s> listK;
        boolean z11;
        this.f18085V = (!this.f18085V && j == this.f18067D.f18428s && bVar.equals(this.f18067D.f18412b)) ? false : true;
        M();
        h0 h0Var = this.f18067D;
        p235t1.w wVar2 = h0Var.f18418h;
        p259v1.y yVar2 = h0Var.f18419i;
        List<p078g1.s> list = h0Var.j;
        if (this.f18110u.f18387k) {
            V v10 = this.f18109t.j;
            p235t1.w wVar3 = v10 == null ? p235t1.w.f47101d : v10.f18160n;
            p259v1.y yVar3 = v10 == null ? this.f18094f : v10.f18161o;
            p259v1.t[] tVarArr = yVar3.f47625c;
            ImmutableList.a aVar = new ImmutableList.a();
            boolean z12 = false;
            for (p259v1.t tVar : tVarArr) {
                if (tVar != null) {
                    p078g1.s sVar = tVar.c(0).f35300l;
                    if (sVar == null) {
                        aVar.c(new p078g1.s(new g1.s.a[0]));
                    } else {
                        aVar.c(sVar);
                        z12 = true;
                    }
                }
            }
            ImmutableList immutableListH = z12 ? aVar.h() : ImmutableList.K();
            if (v10 != null) {
                W w3 = v10.f18154g;
                if (w3.f18165c != j10) {
                    v10.f18154g = w3.a(j10);
                }
            }
            V v11 = this.f18109t.j;
            if (v11 != null) {
                p259v1.y yVar4 = v11.f18161o;
                int i11 = 0;
                boolean z13 = false;
                while (true) {
                    p0[] p0VarArr = this.f18090b;
                    if (i11 >= p0VarArr.length) {
                        z11 = true;
                        break;
                    }
                    if (yVar4.b(i11)) {
                        if (p0VarArr[i11].f18593a.E() != 1) {
                            z11 = false;
                            break;
                        }
                        if (yVar4.f47624b[i11].f18590a != 0) {
                            z13 = true;
                        }
                    }
                    i11++;
                }
                boolean z14 = z13 && z11;
                if (z14 != this.f18079P) {
                    this.f18079P = z14;
                    if (!z14 && this.f18067D.f18425p) {
                        this.f18097i.i(2);
                    }
                }
            }
            listK = immutableListH;
            wVar = wVar3;
            yVar = yVar3;
        } else if (bVar.equals(h0Var.f18412b)) {
            wVar = wVar2;
            yVar = yVar2;
            listK = list;
        } else {
            wVar = p235t1.w.f47101d;
            yVar = this.f18094f;
            listK = ImmutableList.K();
        }
        if (z10) {
            e eVar = this.f18068E;
            if (!eVar.f18124d || eVar.f18125e == 5) {
                eVar.f18121a = true;
                eVar.f18124d = true;
                eVar.f18125e = i10;
            } else {
                p241t7.b.e(i10 == 5);
            }
        }
        h0 h0Var2 = this.f18067D;
        return h0Var2.d(bVar, j, j10, j11, n(h0Var2.f18426q), wVar, yVar, listK);
    }

    public final synchronized void w0(com.google.common.base.j<Boolean> jVar, long j) {
        this.f18107r.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        boolean z10 = false;
        while (!jVar.get().booleanValue() && j > 0) {
            try {
                this.f18107r.getClass();
                wait(j);
            } catch (InterruptedException unused) {
                z10 = true;
            }
            this.f18107r.getClass();
            j = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public final boolean y() {
        V v10 = this.f18109t.j;
        long j = v10.f18154g.f18167e;
        return v10.f18152e && (j == -9223372036854775807L || this.f18067D.f18428s < j || !k0());
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [androidx.media3.exoplayer.source.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17, types: [androidx.media3.exoplayer.source.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.media3.exoplayer.source.m, java.lang.Object] */
    public final void z() {
        long j;
        long j10;
        boolean zD;
        if (x(this.f18109t.f18187m)) {
            V v10 = this.f18109t.f18187m;
            long jN = n(!v10.f18152e ? 0L : v10.f18148a.c());
            if (v10 == this.f18109t.j) {
                j = this.f18082S;
                j10 = v10.f18162p;
            } else {
                j = this.f18082S - v10.f18162p;
                j10 = v10.f18154g.f18164b;
            }
            long j11 = j - j10;
            long j12 = l0(this.f18067D.f18411a, v10.f18154g.f18163a) ? this.f18111v.f18448i : -9223372036854775807L;
            p162n1.u uVar = this.f18113x;
            p078g1.x xVar = this.f18067D.f18411a;
            androidx.media3.exoplayer.source.h.b bVar = v10.f18154g.f18163a;
            float f10 = this.f18103p.g().f35452a;
            boolean z10 = this.f18067D.f18421l;
            S.a aVar = new S.a(uVar, xVar, bVar, j11, jN, f10, this.f18072I, j12);
            zD = this.f18095g.d(aVar);
            V v11 = this.f18109t.j;
            if (!zD && v11.f18152e && jN < 500000 && (this.f18101n > 0 || this.f18102o)) {
                v11.f18148a.r(this.f18067D.f18428s, false);
                zD = this.f18095g.d(aVar);
            }
        } else {
            zD = false;
        }
        this.f18074K = zD;
        if (zD) {
            V v12 = this.f18109t.f18187m;
            v12.getClass();
            T.a aVar2 = new T.a();
            aVar2.f18145a = this.f18082S - v12.f18162p;
            float f11 = this.f18103p.g().f35452a;
            p241t7.b.e(f11 > 0.0f || f11 == -3.4028235E38f);
            aVar2.f18146b = f11;
            long j13 = this.f18073J;
            p241t7.b.e(j13 >= 0 || j13 == -9223372036854775807L);
            aVar2.f18147c = j13;
            T t8 = new T(aVar2);
            p241t7.b.k(v12.f18159m == null);
            v12.f18148a.a(t8);
        }
        p0();
    }
}
