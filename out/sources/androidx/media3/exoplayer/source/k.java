package androidx.media3.exoplayer.source;

import A1.C;
import A1.C0574i;
import A1.C0578m;
import A1.E;
import A1.F;
import A1.K;
import A1.r;
import A1.y;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.activity.p;
import androidx.media3.common.ParserException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.Q;
import androidx.media3.exoplayer.T;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.r0;
import androidx.media3.exoplayer.source.g;
import androidx.media3.exoplayer.source.k;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.upstream.Loader.c;
import coil.util.t;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import p033c7.a0;
import p078g1.s;
import p114j1.A;
import p235t1.q;
import p235t1.w;

/* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
/* JADX INFO: loaded from: classes.dex */
public final class k implements g, r, Loader.a<b> {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final Map<String, String> f18718Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final p078g1.n f18719R;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public e f18720A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public F f18721B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f18722C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f18723D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f18724E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f18725F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f18726G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f18727H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f18728I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f18729J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public long f18730K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public long f18731L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f18732M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f18733N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f18734O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f18735P;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f18736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p140l1.d f18737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.media3.exoplayer.drm.b f18738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.media3.exoplayer.upstream.b f18739e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i.a f18740f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final androidx.media3.exoplayer.drm.a.C0185a f18741g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l f18742h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p272w1.d f18743i;
    public final long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p078g1.n f18744k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f18745l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Loader f18746m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p235t1.a f18747n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f18748o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p f18749p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p235t1.o f18750q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Handler f18751r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public g.a f18752s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public N1.b f18753t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public q[] f18754u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public d[] f18755v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f18756w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f18757x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f18758y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f18759z;

    /* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
    public class a extends y {
        public a(F f10) {
            super(f10);
        }

        @Override // A1.y, A1.F
        public final long k() {
            return k.this.f18722C;
        }
    }

    /* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
    public final class b implements Loader.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f18762b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final p140l1.k f18763c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final p235t1.a f18764d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final k f18765e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final t f18766f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public volatile boolean f18768h;
        public long j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public K f18771l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f18772m;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final E f18767g = new E();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f18769i = true;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f18761a = p235t1.j.f47023b.getAndIncrement();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public p140l1.e f18770k = c(0);

        public b(Uri uri, p140l1.d dVar, p235t1.a aVar, k kVar, t tVar) {
            this.f18762b = uri;
            this.f18763c = new p140l1.k(dVar);
            this.f18764d = aVar;
            this.f18765e = kVar;
            this.f18766f = tVar;
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.d
        public final void a() throws IOException {
            p140l1.d iVar;
            A1.p pVar;
            int i10;
            int iH = 0;
            while (iH == 0 && !this.f18768h) {
                try {
                    long j = this.f18767g.f414a;
                    p140l1.e eVarC = c(j);
                    this.f18770k = eVarC;
                    long jF = this.f18763c.f(eVarC);
                    if (this.f18768h) {
                        if (iH != 1 && this.f18764d.a() != -1) {
                            this.f18767g.f414a = this.f18764d.a();
                        }
                        p140l1.k kVar = this.f18763c;
                        if (kVar != null) {
                            try {
                                kVar.close();
                                return;
                            } catch (IOException unused) {
                                return;
                            }
                        }
                        return;
                    }
                    if (jF != -1) {
                        jF += j;
                        k kVar2 = k.this;
                        kVar2.f18751r.post(new N5.d(3, kVar2));
                    }
                    long j10 = jF;
                    k.this.f18753t = N1.b.d(this.f18763c.f44203a.g());
                    p140l1.k kVar3 = this.f18763c;
                    N1.b bVar = k.this.f18753t;
                    if (bVar == null || (i10 = bVar.f4631f) == -1) {
                        iVar = kVar3;
                    } else {
                        iVar = new p235t1.i(kVar3, i10, this);
                        k kVar4 = k.this;
                        kVar4.getClass();
                        K kB = kVar4.B(new d(0, true));
                        this.f18771l = kB;
                        kB.d(k.f18719R);
                    }
                    long jA = j;
                    this.f18764d.b(iVar, this.f18762b, this.f18763c.f44203a.g(), j, j10, this.f18765e);
                    if (k.this.f18753t != null && (pVar = this.f18764d.f47001b) != null) {
                        A1.p pVarB = pVar.b();
                        if (pVarB instanceof T1.d) {
                            ((T1.d) pVarB).f5783s = true;
                        }
                    }
                    if (this.f18769i) {
                        p235t1.a aVar = this.f18764d;
                        long j11 = this.j;
                        A1.p pVar2 = aVar.f47001b;
                        pVar2.getClass();
                        pVar2.f(jA, j11);
                        this.f18769i = false;
                    }
                    while (true) {
                        long j12 = jA;
                        while (true) {
                            if (iH != 0 || this.f18768h) {
                                break;
                            }
                            try {
                                t tVar = this.f18766f;
                                synchronized (tVar) {
                                    while (!tVar.f23176a) {
                                        try {
                                            tVar.wait();
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                                p235t1.a aVar2 = this.f18764d;
                                E e10 = this.f18767g;
                                A1.p pVar3 = aVar2.f47001b;
                                pVar3.getClass();
                                C0574i c0574i = aVar2.f47002c;
                                c0574i.getClass();
                                iH = pVar3.h(c0574i, e10);
                                jA = this.f18764d.a();
                                if (jA > k.this.j + j12) {
                                    t tVar2 = this.f18766f;
                                    synchronized (tVar2) {
                                        tVar2.f23176a = false;
                                    }
                                    k kVar5 = k.this;
                                    kVar5.f18751r.post(kVar5.f18750q);
                                }
                            } catch (InterruptedException unused2) {
                                throw new InterruptedIOException();
                            }
                        }
                    }
                    if (iH == 1) {
                        iH = 0;
                    } else if (this.f18764d.a() != -1) {
                        this.f18767g.f414a = this.f18764d.a();
                    }
                    p140l1.k kVar6 = this.f18763c;
                    if (kVar6 != null) {
                        try {
                            kVar6.close();
                        } catch (IOException unused3) {
                        }
                    }
                } catch (Throwable th2) {
                    if (iH != 1 && this.f18764d.a() != -1) {
                        this.f18767g.f414a = this.f18764d.a();
                    }
                    p140l1.k kVar7 = this.f18763c;
                    if (kVar7 != null) {
                        try {
                            kVar7.close();
                        } catch (IOException unused4) {
                        }
                    }
                    throw th2;
                }
            }
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.d
        public final void b() {
            this.f18768h = true;
        }

        public final p140l1.e c(long j) {
            Collections.emptyMap();
            k.this.getClass();
            Map<String, String> map = k.f18718Q;
            Uri uri = this.f18762b;
            p241t7.b.m(uri, "The uri must be set.");
            return new p140l1.e(uri, 1, null, map, j, -1L, 6);
        }
    }

    /* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
    public final class c implements p235t1.r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18774a;

        public c(int i10) {
            this.f18774a = i10;
        }

        @Override // p235t1.r
        public final void a() throws IOException {
            k kVar = k.this;
            q qVar = kVar.f18754u[this.f18774a];
            DrmSession drmSession = qVar.f47063h;
            if (drmSession != null && drmSession.getState() == 1) {
                DrmSession.DrmSessionException drmSessionExceptionF = qVar.f47063h.f();
                drmSessionExceptionF.getClass();
                throw drmSessionExceptionF;
            }
            int iB = kVar.f18739e.b(kVar.f18724E);
            Loader loader = kVar.f18746m;
            IOException iOException = loader.f18812c;
            if (iOException != null) {
                throw iOException;
            }
            Loader.c<? extends Loader.d> cVar = loader.f18811b;
            if (cVar != null) {
                if (iB == Integer.MIN_VALUE) {
                    iB = cVar.f18815b;
                }
                IOException iOException2 = cVar.f18819f;
                if (iOException2 != null && cVar.f18820g > iB) {
                    throw iOException2;
                }
            }
        }

        @Override // p235t1.r
        public final boolean b() {
            k kVar = k.this;
            return !kVar.E() && kVar.f18754u[this.f18774a].k(kVar.f18734O);
        }

        @Override // p235t1.r
        public final int c(long j) {
            int i10;
            k kVar = k.this;
            int i11 = this.f18774a;
            boolean z10 = false;
            if (kVar.E()) {
                return 0;
            }
            kVar.z(i11);
            q qVar = kVar.f18754u[i11];
            boolean z11 = kVar.f18734O;
            synchronized (qVar) {
                int iJ = qVar.j(qVar.f47073s);
                int i12 = qVar.f47073s;
                int i13 = qVar.f47070p;
                if ((i12 != i13) && j >= qVar.f47068n[iJ]) {
                    if (j <= qVar.f47076v || !z11) {
                        i10 = qVar.i(iJ, i13 - i12, j, true);
                        if (i10 == -1) {
                        }
                    } else {
                        i10 = i13 - i12;
                    }
                }
                i10 = 0;
            }
            synchronized (qVar) {
                if (i10 >= 0) {
                    try {
                        if (qVar.f47073s + i10 <= qVar.f47070p) {
                            z10 = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                p241t7.b.e(z10);
                qVar.f47073s += i10;
            }
            if (i10 == 0) {
                kVar.A(i11);
            }
            return i10;
        }

        @Override // p235t1.r
        public final int d(Q q10, DecoderInputBuffer decoderInputBuffer, int i10) {
            int i11;
            k kVar = k.this;
            int i12 = this.f18774a;
            if (kVar.E()) {
                return -3;
            }
            kVar.z(i12);
            q qVar = kVar.f18754u[i12];
            boolean z10 = kVar.f18734O;
            qVar.getClass();
            boolean z11 = (i10 & 2) != 0;
            q.a aVar = qVar.f47057b;
            synchronized (qVar) {
                try {
                    decoderInputBuffer.f17942f = false;
                    int i13 = qVar.f47073s;
                    if (i13 != qVar.f47070p) {
                        p078g1.n nVar = qVar.f47058c.a(qVar.f47071q + i13).f47084a;
                        if (!z11 && nVar == qVar.f47062g) {
                            int iJ = qVar.j(qVar.f47073s);
                            if (qVar.l(iJ)) {
                                decoderInputBuffer.f6597b = qVar.f47067m[iJ];
                                if (qVar.f47073s == qVar.f47070p - 1 && (z10 || qVar.f47077w)) {
                                    decoderInputBuffer.d(536870912);
                                }
                                decoderInputBuffer.f17943g = qVar.f47068n[iJ];
                                aVar.f47081a = qVar.f47066l[iJ];
                                aVar.f47082b = qVar.f47065k[iJ];
                                aVar.f47083c = qVar.f47069o[iJ];
                                i11 = -4;
                            } else {
                                decoderInputBuffer.f17942f = true;
                                i11 = -3;
                            }
                        }
                        qVar.m(nVar, q10);
                        i11 = -5;
                    } else {
                        if (!z10 && !qVar.f47077w) {
                            p078g1.n nVar2 = qVar.f47080z;
                            if (nVar2 == null || (!z11 && nVar2 == qVar.f47062g)) {
                                i11 = -3;
                            }
                            qVar.m(nVar2, q10);
                            i11 = -5;
                        }
                        decoderInputBuffer.f6597b = 4;
                        decoderInputBuffer.f17943g = Long.MIN_VALUE;
                        i11 = -4;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (i11 == -4 && !decoderInputBuffer.g(4)) {
                boolean z12 = (i10 & 1) != 0;
                if ((i10 & 4) == 0) {
                    if (z12) {
                        p235t1.p pVar = qVar.f47056a;
                        p235t1.p.e(pVar.f47047e, decoderInputBuffer, qVar.f47057b, pVar.f47045c);
                    } else {
                        p235t1.p pVar2 = qVar.f47056a;
                        pVar2.f47047e = p235t1.p.e(pVar2.f47047e, decoderInputBuffer, qVar.f47057b, pVar2.f47045c);
                    }
                }
                if (!z12) {
                    qVar.f47073s++;
                }
            }
            if (i11 == -3) {
                kVar.A(i12);
            }
            return i11;
        }
    }

    /* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18776a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f18777b;

        public d(int i10, boolean z10) {
            this.f18776a = i10;
            this.f18777b = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f18776a == dVar.f18776a && this.f18777b == dVar.f18777b;
        }

        public final int hashCode() {
            return (this.f18776a * 31) + (this.f18777b ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: ProgressiveMediaPeriod.java */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w f18778a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean[] f18779b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean[] f18780c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean[] f18781d;

        public e(w wVar, boolean[] zArr) {
            this.f18778a = wVar;
            this.f18779b = zArr;
            int i10 = wVar.f47102a;
            this.f18780c = new boolean[i10];
            this.f18781d = new boolean[i10];
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        f18718Q = Collections.unmodifiableMap(map);
        g1.n.a aVar = new g1.n.a();
        aVar.f35327a = "icy";
        aVar.f35338m = p078g1.t.m("application/x-icy");
        f18719R = new p078g1.n(aVar);
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [t1.o] */
    public k(Uri uri, p140l1.d dVar, p235t1.a aVar, androidx.media3.exoplayer.drm.b bVar, androidx.media3.exoplayer.drm.a.C0185a c0185a, androidx.media3.exoplayer.upstream.b bVar2, i.a aVar2, l lVar, p272w1.d dVar2, int i10, p078g1.n nVar, long j, p284x1.a aVar3) {
        Loader loader;
        this.f18736b = uri;
        this.f18737c = dVar;
        this.f18738d = bVar;
        this.f18741g = c0185a;
        this.f18739e = bVar2;
        this.f18740f = aVar2;
        this.f18742h = lVar;
        this.f18743i = dVar2;
        this.j = i10;
        this.f18744k = nVar;
        if (aVar3 != null) {
            loader = new Loader(aVar3);
        } else {
            String strConcat = "ExoPlayer:Loader:".concat("ProgressiveMediaPeriod");
            int i11 = A.f40996a;
            loader = new Loader(new p284x1.a(Executors.newSingleThreadExecutor(new p114j1.y(strConcat)), new A8.f(12)));
        }
        this.f18746m = loader;
        this.f18747n = aVar;
        this.f18745l = j;
        this.f18748o = new t();
        this.f18749p = new p(3, this);
        this.f18750q = new Runnable() { // from class: t1.o
            @Override // java.lang.Runnable
            public final void run() {
                k kVar = this.f47042b;
                if (kVar.f18735P) {
                    return;
                }
                g.a aVar4 = kVar.f18752s;
                aVar4.getClass();
                aVar4.g(kVar);
            }
        };
        this.f18751r = A.k(null);
        this.f18755v = new d[0];
        this.f18754u = new q[0];
        this.f18731L = -9223372036854775807L;
        this.f18724E = 1;
    }

    public final void A(int i10) {
        u();
        if (this.f18732M) {
            if ((!this.f18758y || this.f18720A.f18779b[i10]) && !this.f18754u[i10].k(false)) {
                this.f18731L = 0L;
                this.f18732M = false;
                this.f18726G = true;
                this.f18730K = 0L;
                this.f18733N = 0;
                for (q qVar : this.f18754u) {
                    qVar.n(false);
                }
                g.a aVar = this.f18752s;
                aVar.getClass();
                aVar.g(this);
            }
        }
    }

    public final K B(d dVar) {
        int length = this.f18754u.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (dVar.equals(this.f18755v[i10])) {
                return this.f18754u[i10];
            }
        }
        if (this.f18756w) {
            p114j1.k.f("Extractor added new track (id=" + dVar.f18776a + ") after finishing tracks.");
            return new C0578m();
        }
        androidx.media3.exoplayer.drm.b bVar = this.f18738d;
        bVar.getClass();
        q qVar = new q(this.f18743i, bVar, this.f18741g);
        qVar.f47061f = this;
        int i11 = length + 1;
        d[] dVarArr = (d[]) Arrays.copyOf(this.f18755v, i11);
        dVarArr[length] = dVar;
        int i12 = A.f40996a;
        this.f18755v = dVarArr;
        q[] qVarArr = (q[]) Arrays.copyOf(this.f18754u, i11);
        qVarArr[length] = qVar;
        this.f18754u = qVarArr;
        return qVar;
    }

    public final void C(F f10) {
        this.f18721B = this.f18753t == null ? f10 : new F.b(-9223372036854775807L);
        this.f18722C = f10.k();
        boolean z10 = !this.f18729J && f10.k() == -9223372036854775807L;
        this.f18723D = z10;
        this.f18724E = z10 ? 7 : 1;
        if (this.f18757x) {
            this.f18742h.v(this.f18722C, f10, z10);
        } else {
            y();
        }
    }

    public final void D() {
        b bVar = new b(this.f18736b, this.f18737c, this.f18747n, this, this.f18748o);
        if (this.f18757x) {
            p241t7.b.k(x());
            long j = this.f18722C;
            if (j != -9223372036854775807L && this.f18731L > j) {
                this.f18734O = true;
                this.f18731L = -9223372036854775807L;
                return;
            }
            F f10 = this.f18721B;
            f10.getClass();
            long j10 = f10.i(this.f18731L).f415a.f421b;
            long j11 = this.f18731L;
            bVar.f18767g.f414a = j10;
            bVar.j = j11;
            bVar.f18769i = true;
            bVar.f18772m = false;
            for (q qVar : this.f18754u) {
                qVar.f47074t = this.f18731L;
            }
            this.f18731L = -9223372036854775807L;
        }
        this.f18733N = v();
        int iB = this.f18739e.b(this.f18724E);
        Loader loader = this.f18746m;
        loader.getClass();
        Looper looperMyLooper = Looper.myLooper();
        p241t7.b.l(looperMyLooper);
        loader.f18812c = null;
        Loader.c<? extends Loader.d> cVar = loader.new c<>(looperMyLooper, bVar, this, iB, SystemClock.elapsedRealtime());
        p241t7.b.k(loader.f18811b == null);
        loader.f18811b = cVar;
        cVar.b();
    }

    public final boolean E() {
        return this.f18726G || x();
    }

    @Override // androidx.media3.exoplayer.source.m
    public final boolean a(T t8) {
        if (this.f18734O) {
            return false;
        }
        Loader loader = this.f18746m;
        if (loader.f18812c != null || this.f18732M) {
            return false;
        }
        if ((this.f18757x || this.f18744k != null) && this.f18728I == 0) {
            return false;
        }
        boolean zD = this.f18748o.d();
        if (loader.a()) {
            return zD;
        }
        D();
        return true;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.a
    public final Loader.b b(Loader.d dVar, long j, long j10, IOException iOException, int i10) {
        Loader.b bVar;
        F f10;
        b bVar2 = (b) dVar;
        p140l1.k kVar = bVar2.f18763c;
        Uri uri = kVar.f44205c;
        p235t1.j jVar = new p235t1.j(kVar.f44206d);
        A.Q(bVar2.j);
        A.Q(this.f18722C);
        long jA = this.f18739e.a(new androidx.media3.exoplayer.upstream.b.a(iOException, i10));
        if (jA == -9223372036854775807L) {
            bVar = Loader.f18809e;
        } else {
            int iV = v();
            int i11 = iV > this.f18733N ? 1 : 0;
            if (this.f18729J || !((f10 = this.f18721B) == null || f10.k() == -9223372036854775807L)) {
                this.f18733N = iV;
            } else if (!this.f18757x || E()) {
                this.f18726G = this.f18757x;
                this.f18730K = 0L;
                this.f18733N = 0;
                for (q qVar : this.f18754u) {
                    qVar.n(false);
                }
                bVar2.f18767g.f414a = 0L;
                bVar2.j = 0L;
                bVar2.f18769i = true;
                bVar2.f18772m = false;
            } else {
                this.f18732M = true;
                bVar = Loader.f18808d;
            }
            bVar = new Loader.b(i11, jA);
        }
        int i12 = bVar.f18813a;
        boolean z10 = i12 == 0 || i12 == 1;
        long j11 = bVar2.j;
        long j12 = this.f18722C;
        i.a aVar = this.f18740f;
        aVar.a(new p235t1.m(aVar, jVar, new p235t1.k(1, -1, null, A.Q(j11), A.Q(j12)), iOException, !z10));
        return bVar;
    }

    @Override // androidx.media3.exoplayer.source.m
    public final long c() {
        return q();
    }

    @Override // androidx.media3.exoplayer.source.g
    public final void d() throws IOException {
        int iB = this.f18739e.b(this.f18724E);
        Loader loader = this.f18746m;
        IOException iOException = loader.f18812c;
        if (iOException != null) {
            throw iOException;
        }
        Loader.c<? extends Loader.d> cVar = loader.f18811b;
        if (cVar != null) {
            if (iB == Integer.MIN_VALUE) {
                iB = cVar.f18815b;
            }
            IOException iOException2 = cVar.f18819f;
            if (iOException2 != null && cVar.f18820g > iB) {
                throw iOException2;
            }
        }
        if (this.f18734O && !this.f18757x) {
            throw ParserException.a(null, "Loading finished before preparation is complete.");
        }
    }

    @Override // androidx.media3.exoplayer.source.g
    public final long e(long j, r0 r0Var) {
        u();
        if (!this.f18721B.d()) {
            return 0L;
        }
        F.a aVarI = this.f18721B.i(j);
        long j10 = aVarI.f415a.f420a;
        long j11 = aVarI.f416b.f420a;
        long j12 = r0Var.f18601a;
        long j13 = r0Var.f18602b;
        if (j12 == 0 && j13 == 0) {
            return j;
        }
        int i10 = A.f40996a;
        long j14 = j - j12;
        if (((j12 ^ j) & (j ^ j14)) < 0) {
            j14 = Long.MIN_VALUE;
        }
        long j15 = j + j13;
        if (((j13 ^ j15) & (j ^ j15)) < 0) {
            j15 = Long.MAX_VALUE;
        }
        boolean z10 = false;
        boolean z11 = j14 <= j10 && j10 <= j15;
        if (j14 <= j11 && j11 <= j15) {
            z10 = true;
        }
        if (z11 && z10) {
            if (Math.abs(j10 - j) <= Math.abs(j11 - j)) {
                return j10;
            }
        } else {
            if (z11) {
                return j10;
            }
            if (!z10) {
                return j14;
            }
        }
        return j11;
    }

    @Override // androidx.media3.exoplayer.source.g
    public final long f(long j) {
        boolean zO;
        u();
        boolean[] zArr = this.f18720A.f18779b;
        if (!this.f18721B.d()) {
            j = 0;
        }
        this.f18726G = false;
        boolean z10 = true;
        boolean z11 = this.f18730K == j;
        this.f18730K = j;
        if (x()) {
            this.f18731L = j;
            return j;
        }
        if (this.f18724E != 7 && (this.f18734O || this.f18746m.a())) {
            int length = this.f18754u.length;
            for (int i10 = 0; i10 < length; i10++) {
                q qVar = this.f18754u[i10];
                int i11 = qVar.f47071q;
                if (qVar.f47073s + i11 != 0 || !z11) {
                    if (this.f18759z) {
                        synchronized (qVar) {
                            synchronized (qVar) {
                                qVar.f47073s = 0;
                                p235t1.p pVar = qVar.f47056a;
                                pVar.f47047e = pVar.f47046d;
                            }
                        }
                        int i12 = qVar.f47071q;
                        if (i11 < i12 || i11 > qVar.f47070p + i12) {
                            zO = false;
                        } else {
                            qVar.f47074t = Long.MIN_VALUE;
                            qVar.f47073s = i11 - i12;
                            zO = true;
                        }
                    } else {
                        zO = qVar.o(j, false);
                    }
                    if (!zO && (zArr[i10] || !this.f18758y)) {
                        z10 = false;
                        break;
                    }
                }
            }
            if (z10) {
                return j;
            }
        }
        this.f18732M = false;
        this.f18731L = j;
        this.f18734O = false;
        this.f18727H = false;
        if (this.f18746m.a()) {
            for (q qVar2 : this.f18754u) {
                qVar2.h();
            }
            Loader.c<? extends Loader.d> cVar = this.f18746m.f18811b;
            p241t7.b.l(cVar);
            cVar.a(false);
        } else {
            this.f18746m.f18812c = null;
            for (q qVar3 : this.f18754u) {
                qVar3.n(false);
            }
        }
        return j;
    }

    @Override // A1.r
    public final void g(F f10) {
        this.f18751r.post(new E6.c(this, 5, f10));
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.a
    public final void h(Loader.d dVar, long j, long j10, int i10) {
        p235t1.j jVar;
        b bVar = (b) dVar;
        p140l1.k kVar = bVar.f18763c;
        if (i10 == 0) {
            p140l1.e eVar = bVar.f18770k;
            long j11 = bVar.f18761a;
            Uri uri = eVar.f44168a;
            jVar = new p235t1.j(Collections.emptyMap());
        } else {
            Uri uri2 = kVar.f44205c;
            jVar = new p235t1.j(kVar.f44206d);
        }
        long j12 = bVar.j;
        long j13 = this.f18722C;
        i.a aVar = this.f18740f;
        aVar.a(new p235t1.l(aVar, jVar, new p235t1.k(1, -1, null, A.Q(j12), A.Q(j13)), i10));
    }

    @Override // androidx.media3.exoplayer.source.m
    public final boolean i() {
        boolean z10;
        if (this.f18746m.a()) {
            t tVar = this.f18748o;
            synchronized (tVar) {
                z10 = tVar.f23176a;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    @Override // A1.r
    public final void j() {
        this.f18756w = true;
        this.f18751r.post(this.f18749p);
    }

    @Override // androidx.media3.exoplayer.source.g
    public final long k() {
        if (this.f18727H) {
            this.f18727H = false;
            return this.f18730K;
        }
        if (!this.f18726G) {
            return -9223372036854775807L;
        }
        if (!this.f18734O && v() <= this.f18733N) {
            return -9223372036854775807L;
        }
        this.f18726G = false;
        return this.f18730K;
    }

    @Override // androidx.media3.exoplayer.source.g
    public final long l(p259v1.t[] tVarArr, boolean[] zArr, p235t1.r[] rVarArr, boolean[] zArr2, long j) {
        p259v1.t tVar;
        u();
        e eVar = this.f18720A;
        w wVar = eVar.f18778a;
        boolean[] zArr3 = eVar.f18780c;
        int i10 = this.f18728I;
        for (int i11 = 0; i11 < tVarArr.length; i11++) {
            p235t1.r rVar = rVarArr[i11];
            if (rVar != null && (tVarArr[i11] == null || !zArr[i11])) {
                int i12 = ((c) rVar).f18774a;
                p241t7.b.k(zArr3[i12]);
                this.f18728I--;
                zArr3[i12] = false;
                rVarArr[i11] = null;
            }
        }
        boolean z10 = !this.f18725F ? j == 0 || this.f18759z : i10 != 0;
        for (int i13 = 0; i13 < tVarArr.length; i13++) {
            if (rVarArr[i13] == null && (tVar = tVarArr[i13]) != null) {
                p241t7.b.k(tVar.length() == 1);
                p241t7.b.k(tVar.e(0) == 0);
                int iIndexOf = wVar.f47103b.indexOf(tVar.a());
                if (iIndexOf < 0) {
                    iIndexOf = -1;
                }
                p241t7.b.k(!zArr3[iIndexOf]);
                this.f18728I++;
                zArr3[iIndexOf] = true;
                this.f18727H = tVar.h().f35308t | this.f18727H;
                rVarArr[i13] = new c(iIndexOf);
                zArr2[i13] = true;
                if (!z10) {
                    q qVar = this.f18754u[iIndexOf];
                    z10 = (qVar.f47071q + qVar.f47073s == 0 || qVar.o(j, true)) ? false : true;
                }
            }
        }
        if (this.f18728I == 0) {
            this.f18732M = false;
            this.f18726G = false;
            this.f18727H = false;
            Loader loader = this.f18746m;
            if (loader.a()) {
                for (q qVar2 : this.f18754u) {
                    qVar2.h();
                }
                Loader.c<? extends Loader.d> cVar = loader.f18811b;
                p241t7.b.l(cVar);
                cVar.a(false);
            } else {
                this.f18734O = false;
                for (q qVar3 : this.f18754u) {
                    qVar3.n(false);
                }
            }
        } else if (z10) {
            j = f(j);
            for (int i14 = 0; i14 < rVarArr.length; i14++) {
                if (rVarArr[i14] != null) {
                    zArr2[i14] = true;
                }
            }
        }
        this.f18725F = true;
        return j;
    }

    @Override // androidx.media3.exoplayer.source.g
    public final void m(g.a aVar, long j) {
        this.f18752s = aVar;
        p078g1.n nVar = this.f18744k;
        if (nVar == null) {
            this.f18748o.d();
            D();
        } else {
            p(0, 3).d(nVar);
            C(new C(-9223372036854775807L, new long[]{0}, new long[]{0}));
            j();
            this.f18731L = j;
        }
    }

    @Override // androidx.media3.exoplayer.source.g
    public final w n() {
        u();
        return this.f18720A.f18778a;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.a
    public final void o(Loader.d dVar, long j, long j10) {
        b bVar = (b) dVar;
        if (this.f18722C == -9223372036854775807L && this.f18721B != null) {
            long jW = w(true);
            long j11 = jW == Long.MIN_VALUE ? 0L : jW + 10000;
            this.f18722C = j11;
            this.f18742h.v(j11, this.f18721B, this.f18723D);
        }
        p140l1.k kVar = bVar.f18763c;
        Uri uri = kVar.f44205c;
        p235t1.j jVar = new p235t1.j(kVar.f44206d);
        this.f18739e.getClass();
        long j12 = bVar.j;
        long j13 = this.f18722C;
        i.a aVar = this.f18740f;
        aVar.a(new com.braze.ui.inappmessage.a(aVar, jVar, new p235t1.k(1, -1, null, A.Q(j12), A.Q(j13))));
        this.f18734O = true;
        g.a aVar2 = this.f18752s;
        aVar2.getClass();
        aVar2.g(this);
    }

    @Override // A1.r
    public final K p(int i10, int i11) {
        return B(new d(i10, false));
    }

    @Override // androidx.media3.exoplayer.source.m
    public final long q() {
        long jW;
        boolean z10;
        long j;
        u();
        if (this.f18734O || this.f18728I == 0) {
            return Long.MIN_VALUE;
        }
        if (x()) {
            return this.f18731L;
        }
        if (this.f18758y) {
            int length = this.f18754u.length;
            jW = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                e eVar = this.f18720A;
                if (eVar.f18779b[i10] && eVar.f18780c[i10]) {
                    q qVar = this.f18754u[i10];
                    synchronized (qVar) {
                        z10 = qVar.f47077w;
                    }
                    if (z10) {
                        continue;
                    } else {
                        q qVar2 = this.f18754u[i10];
                        synchronized (qVar2) {
                            j = qVar2.f47076v;
                        }
                        jW = Math.min(jW, j);
                    }
                }
            }
        } else {
            jW = Long.MAX_VALUE;
        }
        if (jW == Long.MAX_VALUE) {
            jW = w(false);
        }
        return jW == Long.MIN_VALUE ? this.f18730K : jW;
    }

    @Override // androidx.media3.exoplayer.source.g
    public final void r(long j, boolean z10) {
        long jG;
        int i10;
        if (this.f18759z) {
            return;
        }
        u();
        if (x()) {
            return;
        }
        boolean[] zArr = this.f18720A.f18780c;
        int length = this.f18754u.length;
        for (int i11 = 0; i11 < length; i11++) {
            q qVar = this.f18754u[i11];
            boolean z11 = zArr[i11];
            p235t1.p pVar = qVar.f47056a;
            synchronized (qVar) {
                try {
                    int i12 = qVar.f47070p;
                    jG = -1;
                    if (i12 != 0) {
                        long[] jArr = qVar.f47068n;
                        int i13 = qVar.f47072r;
                        if (j >= jArr[i13]) {
                            int i14 = qVar.i(i13, (!z11 || (i10 = qVar.f47073s) == i12) ? i12 : i10 + 1, j, z10);
                            if (i14 != -1) {
                                jG = qVar.g(i14);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            pVar.a(jG);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.a
    public final void t(Loader.d dVar, long j, long j10, boolean z10) {
        b bVar = (b) dVar;
        p140l1.k kVar = bVar.f18763c;
        Uri uri = kVar.f44205c;
        p235t1.j jVar = new p235t1.j(kVar.f44206d);
        this.f18739e.getClass();
        long j11 = bVar.j;
        long j12 = this.f18722C;
        i.a aVar = this.f18740f;
        aVar.a(new p235t1.n(aVar, jVar, new p235t1.k(1, -1, null, A.Q(j11), A.Q(j12))));
        if (z10) {
            return;
        }
        for (q qVar : this.f18754u) {
            qVar.n(false);
        }
        if (this.f18728I > 0) {
            g.a aVar2 = this.f18752s;
            aVar2.getClass();
            aVar2.g(this);
        }
    }

    public final void u() {
        p241t7.b.k(this.f18757x);
        this.f18720A.getClass();
        this.f18721B.getClass();
    }

    public final int v() {
        int i10 = 0;
        for (q qVar : this.f18754u) {
            i10 += qVar.f47071q + qVar.f47070p;
        }
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x001a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    public final long w(boolean z10) {
        q qVar;
        long jMax = Long.MIN_VALUE;
        for (int i10 = 0; i10 < this.f18754u.length; i10++) {
            if (z10) {
                qVar = this.f18754u[i10];
                synchronized (qVar) {
                    jMax = Math.max(jMax, qVar.f47076v);
                }
            } else {
                e eVar = this.f18720A;
                eVar.getClass();
                if (eVar.f18780c[i10]) {
                    qVar = this.f18754u[i10];
                    synchronized (qVar) {
                    }
                    jMax = Math.max(jMax, qVar.f47076v);
                } else {
                    continue;
                }
            }
        }
        return jMax;
    }

    public final boolean x() {
        return this.f18731L != -9223372036854775807L;
    }

    public final void y() {
        long j;
        p078g1.n nVar;
        int i10;
        p078g1.n nVar2;
        if (this.f18735P || this.f18757x || !this.f18756w || this.f18721B == null) {
            return;
        }
        for (q qVar : this.f18754u) {
            synchronized (qVar) {
                nVar2 = qVar.f47079y ? null : qVar.f47080z;
            }
            if (nVar2 == null) {
                return;
            }
        }
        t tVar = this.f18748o;
        synchronized (tVar) {
            tVar.f23176a = false;
        }
        int length = this.f18754u.length;
        p078g1.y[] yVarArr = new p078g1.y[length];
        boolean[] zArr = new boolean[length];
        int i11 = 0;
        while (true) {
            j = this.f18745l;
            if (i11 >= length) {
                break;
            }
            q qVar2 = this.f18754u[i11];
            synchronized (qVar2) {
                nVar = qVar2.f47079y ? null : qVar2.f47080z;
            }
            nVar.getClass();
            String str = nVar.f35302n;
            boolean zI = p078g1.t.i(str);
            boolean z10 = zI || p078g1.t.l(str);
            zArr[i11] = z10;
            this.f18758y |= z10;
            this.f18759z = j != -9223372036854775807L && length == 1 && p078g1.t.j(str);
            N1.b bVar = this.f18753t;
            if (bVar != null) {
                if (zI || this.f18755v[i11].f18777b) {
                    s sVar = nVar.f35300l;
                    s sVar2 = sVar == null ? new s(bVar) : sVar.a(bVar);
                    g1.n.a aVarA = nVar.a();
                    aVarA.f35336k = sVar2;
                    nVar = new p078g1.n(aVarA);
                }
                if (zI && nVar.f35297h == -1 && nVar.f35298i == -1 && (i10 = bVar.f4626a) != -1) {
                    g1.n.a aVarA2 = nVar.a();
                    aVarA2.f35334h = i10;
                    nVar = new p078g1.n(aVarA2);
                }
            }
            int iD = this.f18738d.d(nVar);
            g1.n.a aVarA3 = nVar.a();
            aVarA3.f35326L = iD;
            p078g1.n nVar3 = new p078g1.n(aVarA3);
            yVarArr[i11] = new p078g1.y(Integer.toString(i11), nVar3);
            this.f18727H = nVar3.f35308t | this.f18727H;
            i11++;
        }
        this.f18720A = new e(new w(yVarArr), zArr);
        if (this.f18759z && this.f18722C == -9223372036854775807L) {
            this.f18722C = j;
            this.f18721B = new a(this.f18721B);
        }
        this.f18742h.v(this.f18722C, this.f18721B, this.f18723D);
        this.f18757x = true;
        g.a aVar = this.f18752s;
        aVar.getClass();
        aVar.b(this);
    }

    public final void z(int i10) {
        u();
        e eVar = this.f18720A;
        boolean[] zArr = eVar.f18781d;
        if (zArr[i10]) {
            return;
        }
        p078g1.n nVar = eVar.f18778a.a(i10).f35494d[0];
        int iH = p078g1.t.h(nVar.f35302n);
        long j = this.f18730K;
        i.a aVar = this.f18740f;
        aVar.a(new a0(aVar, new p235t1.k(1, iH, nVar, A.Q(j), -9223372036854775807L)));
        zArr[i10] = true;
    }

    @Override // androidx.media3.exoplayer.source.m
    public final void s(long j) {
    }
}
