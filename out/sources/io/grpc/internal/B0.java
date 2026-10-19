package io.grpc.internal;

import androidx.core.app.NotificationManagerCompat;
import io.grpc.MethodDescriptor;
import io.grpc.Status;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

/* JADX INFO: compiled from: RetriableStream.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class B0<ReqT> implements InterfaceC2236o {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final io.grpc.m.b f37041A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final io.grpc.m.b f37042B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final Status f37043C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final Random f37044D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MethodDescriptor<ReqT, ?> f37045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f37046b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f37048d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final io.grpc.m f37049e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final F0 f37050f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final O f37051g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f37052h;
    public final o j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f37054k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f37055l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final x f37056m;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public s f37062s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f37063t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ClientStreamListener f37064u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p f37065v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public p f37066w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f37067x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Status f37068y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f37069z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final D9.w f37047c = new D9.w(new a());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f37053i = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final androidx.compose.runtime.snapshots.j f37057n = new androidx.compose.runtime.snapshots.j();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile u f37058o = new u(new ArrayList(8), Collections.emptyList(), null, null, false, false, false, 0);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AtomicBoolean f37059p = new AtomicBoolean();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AtomicInteger f37060q = new AtomicInteger();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AtomicInteger f37061r = new AtomicInteger();

    /* JADX INFO: compiled from: RetriableStream.java */
    public class a implements Thread.UncaughtExceptionHandler {
        @Override // java.lang.Thread.UncaughtExceptionHandler
        public final void uncaughtException(Thread thread, Throwable th) {
            throw Status.e(th).h("Uncaught exception in the SynchronizationContext. Re-thrown.").a();
        }
    }

    /* JADX INFO: compiled from: RetriableStream.java */
    public class b implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ D9.f f37070a;

        public b(D9.f fVar) {
            this.f37070a = fVar;
        }

        @Override // io.grpc.internal.B0.m
        public final void a(w wVar) {
            wVar.f37119a.a(this.f37070a);
        }
    }

    /* JADX INFO: compiled from: RetriableStream.java */
    public class c implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ D9.j f37071a;

        public c(D9.j jVar) {
            this.f37071a = jVar;
        }

        @Override // io.grpc.internal.B0.m
        public final void a(w wVar) {
            wVar.f37119a.g(this.f37071a);
        }
    }

    /* JADX INFO: compiled from: RetriableStream.java */
    public class d implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ D9.l f37072a;

        public d(D9.l lVar) {
            this.f37072a = lVar;
        }

        @Override // io.grpc.internal.B0.m
        public final void a(w wVar) {
            wVar.f37119a.h(this.f37072a);
        }
    }

    /* JADX INFO: compiled from: RetriableStream.java */
    public class e implements m {
        @Override // io.grpc.internal.B0.m
        public final void a(w wVar) {
            wVar.f37119a.flush();
        }
    }

    /* JADX INFO: compiled from: RetriableStream.java */
    public class f implements m {
        @Override // io.grpc.internal.B0.m
        public final void a(w wVar) {
            wVar.f37119a.i();
        }
    }

    /* JADX INFO: compiled from: RetriableStream.java */
    public class g implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f37073a;

        public g(int i10) {
            this.f37073a = i10;
        }

        @Override // io.grpc.internal.B0.m
        public final void a(w wVar) {
            wVar.f37119a.c(this.f37073a);
        }
    }

    /* JADX INFO: compiled from: RetriableStream.java */
    public class h implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f37074a;

        public h(int i10) {
            this.f37074a = i10;
        }

        @Override // io.grpc.internal.B0.m
        public final void a(w wVar) {
            wVar.f37119a.d(this.f37074a);
        }
    }

    /* JADX INFO: compiled from: RetriableStream.java */
    public class i implements m {
        @Override // io.grpc.internal.B0.m
        public final void a(w wVar) {
            wVar.f37119a.l();
        }
    }

    /* JADX INFO: compiled from: RetriableStream.java */
    public class j extends io.grpc.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n f37075a;

        public j(n nVar) {
            this.f37075a = nVar;
        }

        @Override // io.grpc.c.a
        public final io.grpc.c a(io.grpc.c.b bVar, io.grpc.m mVar) {
            return this.f37075a;
        }
    }

    /* JADX INFO: compiled from: RetriableStream.java */
    public class k implements Runnable {
        public k() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            B0 b10 = B0.this;
            if (b10.f37069z) {
                return;
            }
            b10.f37064u.c();
        }
    }

    /* JADX INFO: compiled from: RetriableStream.java */
    public class l implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Status f37077b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ClientStreamListener.RpcProgress f37078c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ io.grpc.m f37079d;

        public l(Status status, ClientStreamListener.RpcProgress rpcProgress, io.grpc.m mVar) {
            this.f37077b = status;
            this.f37078c = rpcProgress;
            this.f37079d = mVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            B0 b10 = B0.this;
            b10.f37069z = true;
            b10.f37064u.d(this.f37077b, this.f37078c, this.f37079d);
        }
    }

    /* JADX INFO: compiled from: RetriableStream.java */
    public interface m {
        void a(w wVar);
    }

    /* JADX INFO: compiled from: RetriableStream.java */
    public class n extends io.grpc.c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final w f37081d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f37082e;

        public n(w wVar) {
            this.f37081d = wVar;
        }

        @Override // C.g
        public final void e0(long j) {
            if (B0.this.f37058o.f37103f != null) {
                return;
            }
            synchronized (B0.this.f37053i) {
                try {
                    if (B0.this.f37058o.f37103f == null) {
                        w wVar = this.f37081d;
                        if (!wVar.f37120b) {
                            long j10 = this.f37082e + j;
                            this.f37082e = j10;
                            B0 b10 = B0.this;
                            long j11 = b10.f37063t;
                            if (j10 <= j11) {
                                return;
                            }
                            if (j10 > b10.f37054k) {
                                wVar.f37121c = true;
                            } else {
                                long jAddAndGet = b10.j.f37084a.addAndGet(j10 - j11);
                                B0 b11 = B0.this;
                                b11.f37063t = this.f37082e;
                                if (jAddAndGet > b11.f37055l) {
                                    this.f37081d.f37121c = true;
                                }
                            }
                            w wVar2 = this.f37081d;
                            C0 c0N = wVar2.f37121c ? B0.this.n(wVar2) : null;
                            if (c0N != null) {
                                c0N.run();
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: compiled from: RetriableStream.java */
    public static final class o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicLong f37084a = new AtomicLong();
    }

    /* JADX INFO: compiled from: RetriableStream.java */
    public static final class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f37085a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ScheduledFuture f37086b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f37087c;

        public p(Object obj) {
            this.f37085a = obj;
        }

        public final void a(ScheduledFuture scheduledFuture) {
            synchronized (this.f37085a) {
                if (!this.f37087c) {
                    this.f37086b = scheduledFuture;
                }
            }
        }
    }

    /* JADX INFO: compiled from: RetriableStream.java */
    public final class q implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p f37088b;

        /* JADX INFO: compiled from: RetriableStream.java */
        public class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f37090b;

            public a(w wVar) {
                this.f37090b = wVar;
            }

            /* JADX WARN: Code duplicated, block: B:20:0x0053 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:4:0x0007, B:25:0x007d, B:7:0x0013, B:9:0x002c, B:11:0x0034, B:16:0x0042, B:20:0x0053, B:24:0x0074, B:23:0x005e), top: B:35:0x0007 }] */
            /* JADX WARN: Code duplicated, block: B:22:0x005d  */
            /* JADX WARN: Code duplicated, block: B:23:0x005e A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:4:0x0007, B:25:0x007d, B:7:0x0013, B:9:0x002c, B:11:0x0034, B:16:0x0042, B:20:0x0053, B:24:0x0074, B:23:0x005e), top: B:35:0x0007 }] */
            @Override // java.lang.Runnable
            public final void run() {
                boolean z10;
                p pVar;
                u uVar;
                synchronized (B0.this.f37053i) {
                    try {
                        q qVar = q.this;
                        z10 = true;
                        pVar = null;
                        if (!qVar.f37088b.f37087c) {
                            B0 b10 = B0.this;
                            b10.f37058o = b10.f37058o.a(this.f37090b);
                            B0 b11 = B0.this;
                            if (b11.s(b11.f37058o)) {
                                x xVar = B0.this.f37056m;
                                if (xVar != null) {
                                    if (xVar.f37126d.get() <= xVar.f37124b) {
                                        z10 = false;
                                    }
                                    if (!z10) {
                                        B0 b12 = B0.this;
                                        uVar = b12.f37058o;
                                        if (uVar.f37105h) {
                                            uVar = new u(uVar.f37099b, uVar.f37100c, uVar.f37101d, uVar.f37103f, uVar.f37104g, uVar.f37098a, true, uVar.f37102e);
                                        }
                                        b12.f37058o = uVar;
                                        B0.this.f37066w = null;
                                    }
                                }
                                B0 b13 = B0.this;
                                pVar = new p(b13.f37053i);
                                b13.f37066w = pVar;
                            } else {
                                B0 b14 = B0.this;
                                uVar = b14.f37058o;
                                if (uVar.f37105h) {
                                    uVar = new u(uVar.f37099b, uVar.f37100c, uVar.f37101d, uVar.f37103f, uVar.f37104g, uVar.f37098a, true, uVar.f37102e);
                                }
                                b14.f37058o = uVar;
                                B0.this.f37066w = null;
                            }
                            z10 = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z10) {
                    w wVar = this.f37090b;
                    wVar.f37119a.j(new v(wVar));
                    this.f37090b.f37119a.f(Status.f36900f.h("Unneeded hedging"));
                } else {
                    if (pVar != null) {
                        B0 b15 = B0.this;
                        pVar.a(b15.f37048d.schedule(new q(pVar), b15.f37051g.f37427b, TimeUnit.NANOSECONDS));
                    }
                    B0.this.q(this.f37090b);
                }
            }
        }

        public q(p pVar) {
            this.f37088b = pVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            B0 b10 = B0.this;
            w wVarO = b10.o(b10.f37058o.f37102e, false);
            if (wVarO == null) {
                return;
            }
            B0.this.f37046b.execute(new a(wVarO));
        }
    }

    /* JADX INFO: compiled from: RetriableStream.java */
    public static final class r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f37092a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f37093b;

        public r(long j, boolean z10) {
            this.f37092a = z10;
            this.f37093b = j;
        }
    }

    /* JADX INFO: compiled from: RetriableStream.java */
    public static final class s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Status f37094a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ClientStreamListener.RpcProgress f37095b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final io.grpc.m f37096c;

        public s(Status status, ClientStreamListener.RpcProgress rpcProgress, io.grpc.m mVar) {
            this.f37094a = status;
            this.f37095b = rpcProgress;
            this.f37096c = mVar;
        }
    }

    /* JADX INFO: compiled from: RetriableStream.java */
    public class t implements m {
        public t() {
        }

        @Override // io.grpc.internal.B0.m
        public final void a(w wVar) {
            wVar.f37119a.j(new v(wVar));
        }
    }

    /* JADX INFO: compiled from: RetriableStream.java */
    public static final class u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f37098a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<m> f37099b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Collection<w> f37100c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Collection<w> f37101d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f37102e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final w f37103f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f37104g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f37105h;

        public u(List<m> list, Collection<w> collection, Collection<w> collection2, w wVar, boolean z10, boolean z11, boolean z12, int i10) {
            this.f37099b = list;
            A8.p.j(collection, "drainedSubstreams");
            this.f37100c = collection;
            this.f37103f = wVar;
            this.f37101d = collection2;
            this.f37104g = z10;
            this.f37098a = z11;
            this.f37105h = z12;
            this.f37102e = i10;
            A8.p.p("passThrough should imply buffer is null", !z11 || list == null);
            A8.p.p("passThrough should imply winningSubstream != null", (z11 && wVar == null) ? false : true);
            A8.p.p("passThrough should imply winningSubstream is drained", !z11 || (collection.size() == 1 && collection.contains(wVar)) || (collection.size() == 0 && wVar.f37120b));
            A8.p.p("cancelled should imply committed", (z10 && wVar == null) ? false : true);
        }

        public final u a(w wVar) {
            Collection collectionUnmodifiableCollection;
            A8.p.p("hedging frozen", !this.f37105h);
            A8.p.p("already committed", this.f37103f == null);
            Collection<w> collection = this.f37101d;
            if (collection == null) {
                collectionUnmodifiableCollection = Collections.singleton(wVar);
            } else {
                ArrayList arrayList = new ArrayList(collection);
                arrayList.add(wVar);
                collectionUnmodifiableCollection = Collections.unmodifiableCollection(arrayList);
            }
            return new u(this.f37099b, this.f37100c, collectionUnmodifiableCollection, this.f37103f, this.f37104g, this.f37098a, this.f37105h, this.f37102e + 1);
        }

        public final u b(w wVar) {
            ArrayList arrayList = new ArrayList(this.f37101d);
            arrayList.remove(wVar);
            return new u(this.f37099b, this.f37100c, Collections.unmodifiableCollection(arrayList), this.f37103f, this.f37104g, this.f37098a, this.f37105h, this.f37102e);
        }

        public final u c(w wVar, w wVar2) {
            ArrayList arrayList = new ArrayList(this.f37101d);
            arrayList.remove(wVar);
            arrayList.add(wVar2);
            return new u(this.f37099b, this.f37100c, Collections.unmodifiableCollection(arrayList), this.f37103f, this.f37104g, this.f37098a, this.f37105h, this.f37102e);
        }

        public final u d(w wVar) {
            wVar.f37120b = true;
            Collection<w> collection = this.f37100c;
            if (!collection.contains(wVar)) {
                return this;
            }
            ArrayList arrayList = new ArrayList(collection);
            arrayList.remove(wVar);
            return new u(this.f37099b, Collections.unmodifiableCollection(arrayList), this.f37101d, this.f37103f, this.f37104g, this.f37098a, this.f37105h, this.f37102e);
        }

        public final u e(w wVar) {
            List<m> list;
            A8.p.p("Already passThrough", !this.f37098a);
            boolean z10 = wVar.f37120b;
            Collection collectionUnmodifiableCollection = this.f37100c;
            if (!z10) {
                if (collectionUnmodifiableCollection.isEmpty()) {
                    collectionUnmodifiableCollection = Collections.singletonList(wVar);
                } else {
                    ArrayList arrayList = new ArrayList(collectionUnmodifiableCollection);
                    arrayList.add(wVar);
                    collectionUnmodifiableCollection = Collections.unmodifiableCollection(arrayList);
                }
            }
            Collection collection = collectionUnmodifiableCollection;
            w wVar2 = this.f37103f;
            boolean z11 = wVar2 != null;
            if (z11) {
                A8.p.p("Another RPC attempt has already committed", wVar2 == wVar);
                list = null;
            } else {
                list = this.f37099b;
            }
            return new u(list, collection, this.f37101d, this.f37103f, this.f37104g, z11, this.f37105h, this.f37102e);
        }
    }

    /* JADX INFO: compiled from: RetriableStream.java */
    public final class v implements ClientStreamListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w f37106a;

        /* JADX INFO: compiled from: RetriableStream.java */
        public class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ io.grpc.m f37108b;

            public a(io.grpc.m mVar) {
                this.f37108b = mVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                B0.this.f37064u.b(this.f37108b);
            }
        }

        /* JADX INFO: compiled from: RetriableStream.java */
        public class b implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f37110b;

            /* JADX INFO: compiled from: RetriableStream.java */
            public class a implements Runnable {
                public a() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    b bVar = b.this;
                    B0 b10 = B0.this;
                    w wVar = bVar.f37110b;
                    io.grpc.m.b bVar2 = B0.f37041A;
                    b10.q(wVar);
                }
            }

            public b(w wVar) {
                this.f37110b = wVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                B0.this.f37046b.execute(new a());
            }
        }

        /* JADX INFO: compiled from: RetriableStream.java */
        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                B0 b10 = B0.this;
                b10.f37069z = true;
                ClientStreamListener clientStreamListener = b10.f37064u;
                s sVar = b10.f37062s;
                clientStreamListener.d(sVar.f37094a, sVar.f37095b, sVar.f37096c);
            }
        }

        /* JADX INFO: compiled from: RetriableStream.java */
        public class d implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f37114b;

            public d(w wVar) {
                this.f37114b = wVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                B0 b10 = B0.this;
                io.grpc.m.b bVar = B0.f37041A;
                b10.q(this.f37114b);
            }
        }

        /* JADX INFO: compiled from: RetriableStream.java */
        public class e implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Q0.a f37116b;

            public e(Q0.a aVar) {
                this.f37116b = aVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                B0.this.f37064u.a(this.f37116b);
            }
        }

        /* JADX INFO: compiled from: RetriableStream.java */
        public class f implements Runnable {
            public f() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                B0 b10 = B0.this;
                if (b10.f37069z) {
                    return;
                }
                b10.f37064u.c();
            }
        }

        public v(w wVar) {
            this.f37106a = wVar;
        }

        @Override // io.grpc.internal.Q0
        public final void a(Q0.a aVar) {
            u uVar = B0.this.f37058o;
            A8.p.p("Headers should be received prior to messages.", uVar.f37103f != null);
            if (uVar.f37103f == this.f37106a) {
                B0.this.f37047c.execute(new e(aVar));
                return;
            }
            Logger logger = GrpcUtil.f37199a;
            while (true) {
                InputStream next = aVar.next();
                if (next == null) {
                    return;
                } else {
                    GrpcUtil.b(next);
                }
            }
        }

        @Override // io.grpc.internal.ClientStreamListener
        public final void b(io.grpc.m mVar) {
            AtomicInteger atomicInteger;
            int i10;
            int i11;
            if (this.f37106a.f37122d > 0) {
                io.grpc.m.b bVar = B0.f37041A;
                mVar.a(bVar);
                mVar.e(bVar, String.valueOf(this.f37106a.f37122d));
            }
            B0 b10 = B0.this;
            w wVar = this.f37106a;
            io.grpc.m.b bVar2 = B0.f37041A;
            C0 c0N = b10.n(wVar);
            if (c0N != null) {
                c0N.run();
            }
            if (B0.this.f37058o.f37103f == this.f37106a) {
                x xVar = B0.this.f37056m;
                if (xVar != null) {
                    do {
                        atomicInteger = xVar.f37126d;
                        i10 = atomicInteger.get();
                        i11 = xVar.f37123a;
                        if (i10 == i11) {
                            break;
                        }
                    } while (!atomicInteger.compareAndSet(i10, Math.min(xVar.f37125c + i10, i11)));
                }
                B0.this.f37047c.execute(new a(mVar));
            }
        }

        @Override // io.grpc.internal.Q0
        public final void c() {
            B0 b10 = B0.this;
            if (b10.b()) {
                b10.f37047c.execute(new f());
            }
        }

        /* JADX WARN: Code duplicated, block: B:116:0x01e6  */
        @Override // io.grpc.internal.ClientStreamListener
        public final void d(Status status, ClientStreamListener.RpcProgress rpcProgress, io.grpc.m mVar) {
            boolean z10;
            r rVar;
            B0 b10;
            p pVar;
            synchronized (B0.this.f37053i) {
                B0 b11 = B0.this;
                b11.f37058o = b11.f37058o.d(this.f37106a);
                ((ArrayList) B0.this.f37057n.f13215b).add(String.valueOf(status.f36908a));
            }
            if (B0.this.f37061r.decrementAndGet() == Integer.MIN_VALUE) {
                B0.this.f37047c.execute(new c());
                return;
            }
            w wVar = this.f37106a;
            if (wVar.f37121c) {
                C0 c0N = B0.this.n(wVar);
                if (c0N != null) {
                    c0N.run();
                }
                if (B0.this.f37058o.f37103f == this.f37106a) {
                    B0.this.w(status, rpcProgress, mVar);
                    return;
                }
                return;
            }
            ClientStreamListener.RpcProgress rpcProgress2 = ClientStreamListener.RpcProgress.f37137e;
            if (rpcProgress == rpcProgress2 && B0.this.f37060q.incrementAndGet() > 1000) {
                C0 c0N2 = B0.this.n(this.f37106a);
                if (c0N2 != null) {
                    c0N2.run();
                }
                if (B0.this.f37058o.f37103f == this.f37106a) {
                    B0.this.w(Status.f36904k.h("Too many transparent retries. Might be a bug in gRPC").g(status.a()), rpcProgress, mVar);
                    return;
                }
                return;
            }
            if (B0.this.f37058o.f37103f == null) {
                if (rpcProgress == rpcProgress2 || (rpcProgress == ClientStreamListener.RpcProgress.f37135c && B0.this.f37059p.compareAndSet(false, true))) {
                    w wVarO = B0.this.o(this.f37106a.f37122d, true);
                    if (wVarO == null) {
                        return;
                    }
                    B0 b12 = B0.this;
                    if (b12.f37052h) {
                        synchronized (b12.f37053i) {
                            B0 b13 = B0.this;
                            b13.f37058o = b13.f37058o.c(this.f37106a, wVarO);
                        }
                    }
                    B0.this.f37046b.execute(new d(wVarO));
                    return;
                }
                if (rpcProgress == ClientStreamListener.RpcProgress.f37136d) {
                    B0 b14 = B0.this;
                    if (b14.f37052h) {
                        b14.r();
                    }
                } else {
                    B0.this.f37059p.set(true);
                    B0 b15 = B0.this;
                    Integer numValueOf = null;
                    if (b15.f37052h) {
                        String str = (String) mVar.c(B0.f37042B);
                        if (str != null) {
                            try {
                                numValueOf = Integer.valueOf(str);
                            } catch (NumberFormatException unused) {
                                numValueOf = -1;
                            }
                        }
                        B0 b16 = B0.this;
                        boolean zContains = b16.f37051g.f37428c.contains(status.f36908a);
                        boolean z11 = (b16.f37056m == null || (!zContains && (numValueOf == null || numValueOf.intValue() >= 0))) ? false : !b16.f37056m.a();
                        if (zContains && !z11 && !status.f() && numValueOf != null && numValueOf.intValue() > 0) {
                            numValueOf = 0;
                        }
                        boolean z12 = zContains && !z11;
                        if (z12) {
                            B0.m(B0.this, numValueOf);
                        }
                        synchronized (B0.this.f37053i) {
                            try {
                                B0 b17 = B0.this;
                                b17.f37058o = b17.f37058o.b(this.f37106a);
                                if (z12) {
                                    B0 b18 = B0.this;
                                    if (!b18.s(b18.f37058o)) {
                                        if (!B0.this.f37058o.f37101d.isEmpty()) {
                                        }
                                    }
                                    return;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } else {
                        F0 f10 = b15.f37050f;
                        long nanos = 0;
                        if (f10 == null) {
                            rVar = new r(0L, false);
                        } else {
                            boolean zContains2 = f10.f37189f.contains(status.f36908a);
                            String str2 = (String) mVar.c(B0.f37042B);
                            if (str2 != null) {
                                try {
                                    numValueOf = Integer.valueOf(str2);
                                } catch (NumberFormatException unused2) {
                                    numValueOf = -1;
                                }
                            }
                            boolean z13 = (b15.f37056m == null || (!zContains2 && (numValueOf == null || numValueOf.intValue() >= 0))) ? false : !b15.f37056m.a();
                            if (b15.f37050f.f37184a <= this.f37106a.f37122d + 1 || z13) {
                                z10 = false;
                            } else if (numValueOf == null) {
                                if (zContains2) {
                                    nanos = (long) (B0.f37044D.nextDouble() * b15.f37067x);
                                    double d10 = b15.f37067x;
                                    F0 f11 = b15.f37050f;
                                    b15.f37067x = Math.min((long) (d10 * f11.f37187d), f11.f37186c);
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                            } else if (numValueOf.intValue() >= 0) {
                                nanos = TimeUnit.MILLISECONDS.toNanos(numValueOf.intValue());
                                b15.f37067x = b15.f37050f.f37185b;
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            rVar = new r(nanos, z10);
                        }
                        if (rVar.f37092a) {
                            w wVarO2 = B0.this.o(this.f37106a.f37122d + 1, false);
                            if (wVarO2 == null) {
                                return;
                            }
                            synchronized (B0.this.f37053i) {
                                b10 = B0.this;
                                pVar = new p(b10.f37053i);
                                b10.f37065v = pVar;
                            }
                            pVar.a(b10.f37048d.schedule(new b(wVarO2), rVar.f37093b, TimeUnit.NANOSECONDS));
                            return;
                        }
                    }
                }
            }
            C0 c0N3 = B0.this.n(this.f37106a);
            if (c0N3 != null) {
                c0N3.run();
            }
            if (B0.this.f37058o.f37103f == this.f37106a) {
                B0.this.w(status, rpcProgress, mVar);
            }
        }
    }

    /* JADX INFO: compiled from: RetriableStream.java */
    public static final class w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public InterfaceC2236o f37119a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f37120b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f37121c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f37122d;

        public w(int i10) {
            this.f37122d = i10;
        }
    }

    /* JADX INFO: compiled from: RetriableStream.java */
    public static final class x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f37123a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f37124b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f37125c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicInteger f37126d;

        public x(float f10, float f11) {
            AtomicInteger atomicInteger = new AtomicInteger();
            this.f37126d = atomicInteger;
            this.f37125c = (int) (f11 * 1000.0f);
            int i10 = (int) (f10 * 1000.0f);
            this.f37123a = i10;
            this.f37124b = i10 / 2;
            atomicInteger.set(i10);
        }

        public final boolean a() {
            AtomicInteger atomicInteger;
            int i10;
            int i11;
            do {
                atomicInteger = this.f37126d;
                i10 = atomicInteger.get();
                if (i10 == 0) {
                    return false;
                }
                i11 = i10 + NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
            } while (!atomicInteger.compareAndSet(i10, Math.max(i11, 0)));
            return i11 > this.f37124b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof x)) {
                return false;
            }
            x xVar = (x) obj;
            return this.f37123a == xVar.f37123a && this.f37125c == xVar.f37125c;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.f37123a), Integer.valueOf(this.f37125c)});
        }
    }

    static {
        io.grpc.m.a aVar = io.grpc.m.f37781d;
        BitSet bitSet = io.grpc.m.d.f37786d;
        f37041A = new io.grpc.m.b("grpc-previous-rpc-attempts", aVar);
        f37042B = new io.grpc.m.b("grpc-retry-pushback-ms", aVar);
        f37043C = Status.f36900f.h("Stream thrown away because RetriableStream committed");
        f37044D = new Random();
    }

    public B0(MethodDescriptor<ReqT, ?> methodDescriptor, io.grpc.m mVar, o oVar, long j10, long j11, Executor executor, ScheduledExecutorService scheduledExecutorService, F0 f10, O o10, x xVar) {
        this.f37045a = methodDescriptor;
        this.j = oVar;
        this.f37054k = j10;
        this.f37055l = j11;
        this.f37046b = executor;
        this.f37048d = scheduledExecutorService;
        this.f37049e = mVar;
        this.f37050f = f10;
        if (f10 != null) {
            this.f37067x = f10.f37185b;
        }
        this.f37051g = o10;
        A8.p.f("Should not provide both retryPolicy and hedgingPolicy", f10 == null || o10 == null);
        this.f37052h = o10 != null;
        this.f37056m = xVar;
    }

    public static void m(B0 b10, Integer num) {
        b10.getClass();
        if (num == null) {
            return;
        }
        if (num.intValue() < 0) {
            b10.r();
            return;
        }
        synchronized (b10.f37053i) {
            try {
                p pVar = b10.f37066w;
                if (pVar != null) {
                    pVar.f37087c = true;
                    ScheduledFuture scheduledFuture = pVar.f37086b;
                    p pVar2 = new p(b10.f37053i);
                    b10.f37066w = pVar2;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    pVar2.a(b10.f37048d.schedule(new q(pVar2), num.intValue(), TimeUnit.MILLISECONDS));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.grpc.internal.P0
    public final void a(D9.f fVar) {
        p(new b(fVar));
    }

    @Override // io.grpc.internal.P0
    public final boolean b() {
        Iterator<w> it = this.f37058o.f37100c.iterator();
        while (it.hasNext()) {
            if (it.next().f37119a.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // io.grpc.internal.InterfaceC2236o
    public final void c(int i10) {
        p(new g(i10));
    }

    @Override // io.grpc.internal.InterfaceC2236o
    public final void d(int i10) {
        p(new h(i10));
    }

    @Override // io.grpc.internal.InterfaceC2236o
    public final void e(androidx.compose.runtime.snapshots.j jVar) {
        u uVar;
        synchronized (this.f37053i) {
            jVar.a(this.f37057n, MetricTracker.Action.CLOSED);
            uVar = this.f37058o;
        }
        if (uVar.f37103f != null) {
            androidx.compose.runtime.snapshots.j jVar2 = new androidx.compose.runtime.snapshots.j();
            uVar.f37103f.f37119a.e(jVar2);
            jVar.a(jVar2, "committed");
            return;
        }
        androidx.compose.runtime.snapshots.j jVar3 = new androidx.compose.runtime.snapshots.j();
        for (w wVar : uVar.f37100c) {
            androidx.compose.runtime.snapshots.j jVar4 = new androidx.compose.runtime.snapshots.j();
            wVar.f37119a.e(jVar4);
            ((ArrayList) jVar3.f13215b).add(String.valueOf(jVar4));
        }
        jVar.a(jVar3, "open");
    }

    @Override // io.grpc.internal.InterfaceC2236o
    public final void f(Status status) {
        w wVar;
        w wVar2 = new w(0);
        wVar2.f37119a = new C2242r0();
        C0 c0N = n(wVar2);
        if (c0N != null) {
            synchronized (this.f37053i) {
                this.f37058o = this.f37058o.e(wVar2);
            }
            c0N.run();
            w(status, ClientStreamListener.RpcProgress.f37134b, new io.grpc.m());
            return;
        }
        synchronized (this.f37053i) {
            try {
                if (this.f37058o.f37100c.contains(this.f37058o.f37103f)) {
                    wVar = this.f37058o.f37103f;
                } else {
                    this.f37068y = status;
                    wVar = null;
                }
                u uVar = this.f37058o;
                this.f37058o = new u(uVar.f37099b, uVar.f37100c, uVar.f37101d, uVar.f37103f, true, uVar.f37098a, uVar.f37105h, uVar.f37102e);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (wVar != null) {
            wVar.f37119a.f(status);
        }
    }

    @Override // io.grpc.internal.P0
    public final void flush() {
        u uVar = this.f37058o;
        if (uVar.f37098a) {
            uVar.f37103f.f37119a.flush();
        } else {
            p(new e());
        }
    }

    @Override // io.grpc.internal.InterfaceC2236o
    public final void g(D9.j jVar) {
        p(new c(jVar));
    }

    @Override // io.grpc.internal.InterfaceC2236o
    public final void h(D9.l lVar) {
        p(new d(lVar));
    }

    @Override // io.grpc.internal.InterfaceC2236o
    public final void i() {
        p(new f());
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    @Override // io.grpc.internal.InterfaceC2236o
    public final void j(ClientStreamListener clientStreamListener) {
        p pVar;
        this.f37064u = clientStreamListener;
        Status statusV = v();
        if (statusV != null) {
            f(statusV);
            return;
        }
        synchronized (this.f37053i) {
            this.f37058o.f37099b.add(new t());
        }
        w wVarO = o(0, false);
        if (wVarO == null) {
            return;
        }
        if (this.f37052h) {
            synchronized (this.f37053i) {
                try {
                    this.f37058o = this.f37058o.a(wVarO);
                    if (s(this.f37058o)) {
                        x xVar = this.f37056m;
                        if (xVar != null) {
                            if (!(xVar.f37126d.get() > xVar.f37124b)) {
                                pVar = null;
                            }
                        }
                        pVar = new p(this.f37053i);
                        this.f37066w = pVar;
                    } else {
                        pVar = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (pVar != null) {
                pVar.a(this.f37048d.schedule(new q(pVar), this.f37051g.f37427b, TimeUnit.NANOSECONDS));
            }
        }
        q(wVarO);
    }

    @Override // io.grpc.internal.P0
    public final void k(InputStream inputStream) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    @Override // io.grpc.internal.P0
    public final void l() {
        p(new i());
    }

    public final C0 n(w wVar) {
        Collection collectionEmptyList;
        boolean z10;
        List<m> list;
        ScheduledFuture scheduledFuture;
        ScheduledFuture scheduledFuture2;
        synchronized (this.f37053i) {
            try {
                if (this.f37058o.f37103f != null) {
                    return null;
                }
                Collection<w> collection = this.f37058o.f37100c;
                u uVar = this.f37058o;
                A8.p.p("Already committed", uVar.f37103f == null);
                if (uVar.f37100c.contains(wVar)) {
                    list = null;
                    collectionEmptyList = Collections.singleton(wVar);
                    z10 = true;
                } else {
                    collectionEmptyList = Collections.emptyList();
                    z10 = false;
                    list = uVar.f37099b;
                }
                this.f37058o = new u(list, collectionEmptyList, uVar.f37101d, wVar, uVar.f37104g, z10, uVar.f37105h, uVar.f37102e);
                this.j.f37084a.addAndGet(-this.f37063t);
                p pVar = this.f37065v;
                if (pVar != null) {
                    pVar.f37087c = true;
                    ScheduledFuture scheduledFuture3 = pVar.f37086b;
                    this.f37065v = null;
                    scheduledFuture = scheduledFuture3;
                } else {
                    scheduledFuture = null;
                }
                p pVar2 = this.f37066w;
                if (pVar2 != null) {
                    pVar2.f37087c = true;
                    scheduledFuture2 = pVar2.f37086b;
                    this.f37066w = null;
                } else {
                    scheduledFuture2 = null;
                }
                return new C0(this, collection, wVar, scheduledFuture, scheduledFuture2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final w o(int i10, boolean z10) {
        AtomicInteger atomicInteger;
        int i11;
        do {
            atomicInteger = this.f37061r;
            i11 = atomicInteger.get();
            if (i11 < 0) {
                return null;
            }
        } while (!atomicInteger.compareAndSet(i11, i11 + 1));
        w wVar = new w(i10);
        j jVar = new j(new n(wVar));
        io.grpc.m mVar = new io.grpc.m();
        mVar.d(this.f37049e);
        if (i10 > 0) {
            mVar.e(f37041A, String.valueOf(i10));
        }
        wVar.f37119a = t(mVar, jVar, i10, z10);
        return wVar;
    }

    public final void p(m mVar) {
        Collection<w> collection;
        synchronized (this.f37053i) {
            try {
                if (!this.f37058o.f37098a) {
                    this.f37058o.f37099b.add(mVar);
                }
                collection = this.f37058o.f37100c;
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator<w> it = collection.iterator();
        while (it.hasNext()) {
            mVar.a(it.next());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0088, code lost:
    
        r0 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0090, code lost:
    
        if (r0.hasNext() == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0092, code lost:
    
        r4 = (io.grpc.internal.B0.m) r0.next();
        r4.a(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009d, code lost:
    
        if ((r4 instanceof io.grpc.internal.B0.t) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009f, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a0, code lost:
    
        r4 = r8.f37058o;
        r5 = r4.f37103f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a4, code lost:
    
        if (r5 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a6, code lost:
    
        if (r5 == r9) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ab, code lost:
    
        if (r4.f37104g == false) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(io.grpc.internal.B0.w r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            r2 = r0
            r3 = r1
        L4:
            java.lang.Object r4 = r8.f37053i
            monitor-enter(r4)
            io.grpc.internal.B0$u r5 = r8.f37058o     // Catch: java.lang.Throwable -> L11
            io.grpc.internal.B0$w r6 = r5.f37103f     // Catch: java.lang.Throwable -> L11
            if (r6 == 0) goto L14
            if (r6 == r9) goto L14
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            goto L36
        L11:
            r9 = move-exception
            goto Lb0
        L14:
            boolean r6 = r5.f37104g     // Catch: java.lang.Throwable -> L11
            if (r6 == 0) goto L1a
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            goto L36
        L1a:
            java.util.List<io.grpc.internal.B0$m> r6 = r5.f37099b     // Catch: java.lang.Throwable -> L11
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L11
            if (r0 != r6) goto L5b
            io.grpc.internal.B0$u r0 = r5.e(r9)     // Catch: java.lang.Throwable -> L11
            r8.f37058o = r0     // Catch: java.lang.Throwable -> L11
            boolean r0 = r8.b()     // Catch: java.lang.Throwable -> L11
            if (r0 != 0) goto L30
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            return
        L30:
            io.grpc.internal.B0$k r1 = new io.grpc.internal.B0$k     // Catch: java.lang.Throwable -> L11
            r1.<init>()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
        L36:
            if (r1 == 0) goto L3e
            D9.w r9 = r8.f37047c
            r9.execute(r1)
            return
        L3e:
            if (r2 != 0) goto L4a
            io.grpc.internal.o r0 = r9.f37119a
            io.grpc.internal.B0$v r1 = new io.grpc.internal.B0$v
            r1.<init>(r9)
            r0.j(r1)
        L4a:
            io.grpc.internal.o r0 = r9.f37119a
            io.grpc.internal.B0$u r1 = r8.f37058o
            io.grpc.internal.B0$w r1 = r1.f37103f
            if (r1 != r9) goto L55
            io.grpc.Status r9 = r8.f37068y
            goto L57
        L55:
            io.grpc.Status r9 = io.grpc.internal.B0.f37043C
        L57:
            r0.f(r9)
            return
        L5b:
            boolean r6 = r9.f37120b     // Catch: java.lang.Throwable -> L11
            if (r6 == 0) goto L61
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            return
        L61:
            int r6 = r0 + 128
            java.util.List<io.grpc.internal.B0$m> r7 = r5.f37099b     // Catch: java.lang.Throwable -> L11
            int r7 = r7.size()     // Catch: java.lang.Throwable -> L11
            int r6 = java.lang.Math.min(r6, r7)     // Catch: java.lang.Throwable -> L11
            if (r3 != 0) goto L7b
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L11
            java.util.List<io.grpc.internal.B0$m> r5 = r5.f37099b     // Catch: java.lang.Throwable -> L11
            java.util.List r0 = r5.subList(r0, r6)     // Catch: java.lang.Throwable -> L11
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L11
            goto L87
        L7b:
            r3.clear()     // Catch: java.lang.Throwable -> L11
            java.util.List<io.grpc.internal.B0$m> r5 = r5.f37099b     // Catch: java.lang.Throwable -> L11
            java.util.List r0 = r5.subList(r0, r6)     // Catch: java.lang.Throwable -> L11
            r3.addAll(r0)     // Catch: java.lang.Throwable -> L11
        L87:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            java.util.Iterator r0 = r3.iterator()
        L8c:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto Lad
            java.lang.Object r4 = r0.next()
            io.grpc.internal.B0$m r4 = (io.grpc.internal.B0.m) r4
            r4.a(r9)
            boolean r4 = r4 instanceof io.grpc.internal.B0.t
            if (r4 == 0) goto La0
            r2 = 1
        La0:
            io.grpc.internal.B0$u r4 = r8.f37058o
            io.grpc.internal.B0$w r5 = r4.f37103f
            if (r5 == 0) goto La9
            if (r5 == r9) goto La9
            goto Lad
        La9:
            boolean r4 = r4.f37104g
            if (r4 == 0) goto L8c
        Lad:
            r0 = r6
            goto L4
        Lb0:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.B0.q(io.grpc.internal.B0$w):void");
    }

    public final void r() {
        ScheduledFuture scheduledFuture;
        synchronized (this.f37053i) {
            try {
                p pVar = this.f37066w;
                scheduledFuture = null;
                if (pVar != null) {
                    pVar.f37087c = true;
                    ScheduledFuture scheduledFuture2 = pVar.f37086b;
                    this.f37066w = null;
                    scheduledFuture = scheduledFuture2;
                }
                u uVar = this.f37058o;
                if (!uVar.f37105h) {
                    uVar = new u(uVar.f37099b, uVar.f37100c, uVar.f37101d, uVar.f37103f, uVar.f37104g, uVar.f37098a, true, uVar.f37102e);
                }
                this.f37058o = uVar;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    @Override // io.grpc.internal.P0
    public final void request() {
        u uVar = this.f37058o;
        if (uVar.f37098a) {
            uVar.f37103f.f37119a.request();
        } else {
            p(new D0());
        }
    }

    public final boolean s(u uVar) {
        if (uVar.f37103f == null) {
            if (uVar.f37102e < this.f37051g.f37426a && !uVar.f37105h) {
                return true;
            }
        }
        return false;
    }

    public abstract InterfaceC2236o t(io.grpc.m mVar, j jVar, int i10, boolean z10);

    public abstract void u();

    public abstract Status v();

    public final void w(Status status, ClientStreamListener.RpcProgress rpcProgress, io.grpc.m mVar) {
        this.f37062s = new s(status, rpcProgress, mVar);
        if (this.f37061r.addAndGet(Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            this.f37047c.execute(new l(status, rpcProgress, mVar));
        }
    }

    public final void x(N7.d dVar) {
        u uVar = this.f37058o;
        if (uVar.f37098a) {
            uVar.f37103f.f37119a.k(this.f37045a.f36889d.b(dVar));
        } else {
            p(new E0(this, dVar));
        }
    }
}
