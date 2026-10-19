package io.grpc.internal;

import io.grpc.Status;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: DelayedStream.java */
/* JADX INFO: loaded from: classes3.dex */
public class B implements InterfaceC2236o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f37003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ClientStreamListener f37004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC2236o f37005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Status f37006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<Runnable> f37007e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public k f37008f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f37009g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f37010h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f37011i;

    /* JADX INFO: compiled from: DelayedStream.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            B.this.f37005c.l();
        }
    }

    /* JADX INFO: compiled from: DelayedStream.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ D9.f f37013b;

        public b(D9.f fVar) {
            this.f37013b = fVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            B.this.f37005c.a(this.f37013b);
        }
    }

    /* JADX INFO: compiled from: DelayedStream.java */
    public class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ D9.l f37015b;

        public c(D9.l lVar) {
            this.f37015b = lVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            B.this.f37005c.h(this.f37015b);
        }
    }

    /* JADX INFO: compiled from: DelayedStream.java */
    public class d implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f37017b;

        public d(int i10) {
            this.f37017b = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            B.this.f37005c.c(this.f37017b);
        }
    }

    /* JADX INFO: compiled from: DelayedStream.java */
    public class e implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f37019b;

        public e(int i10) {
            this.f37019b = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            B.this.f37005c.d(this.f37019b);
        }
    }

    /* JADX INFO: compiled from: DelayedStream.java */
    public class f implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ D9.j f37021b;

        public f(D9.j jVar) {
            this.f37021b = jVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            B.this.f37005c.g(this.f37021b);
        }
    }

    /* JADX INFO: compiled from: DelayedStream.java */
    public class g implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InputStream f37023b;

        public g(InputStream inputStream) {
            this.f37023b = inputStream;
        }

        @Override // java.lang.Runnable
        public final void run() {
            B.this.f37005c.k(this.f37023b);
        }
    }

    /* JADX INFO: compiled from: DelayedStream.java */
    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            B.this.f37005c.flush();
        }
    }

    /* JADX INFO: compiled from: DelayedStream.java */
    public class i implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Status f37026b;

        public i(Status status) {
            this.f37026b = status;
        }

        @Override // java.lang.Runnable
        public final void run() {
            B.this.f37005c.f(this.f37026b);
        }
    }

    /* JADX INFO: compiled from: DelayedStream.java */
    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            B.this.f37005c.i();
        }
    }

    /* JADX INFO: compiled from: DelayedStream.java */
    public static class k implements ClientStreamListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ClientStreamListener f37029a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile boolean f37030b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List<Runnable> f37031c = new ArrayList();

        /* JADX INFO: compiled from: DelayedStream.java */
        public class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Q0.a f37032b;

            public a(Q0.a aVar) {
                this.f37032b = aVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                k.this.f37029a.a(this.f37032b);
            }
        }

        /* JADX INFO: compiled from: DelayedStream.java */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                k.this.f37029a.c();
            }
        }

        /* JADX INFO: compiled from: DelayedStream.java */
        public class c implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ io.grpc.m f37035b;

            public c(io.grpc.m mVar) {
                this.f37035b = mVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                k.this.f37029a.b(this.f37035b);
            }
        }

        /* JADX INFO: compiled from: DelayedStream.java */
        public class d implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Status f37037b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ClientStreamListener.RpcProgress f37038c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ io.grpc.m f37039d;

            public d(Status status, ClientStreamListener.RpcProgress rpcProgress, io.grpc.m mVar) {
                this.f37037b = status;
                this.f37038c = rpcProgress;
                this.f37039d = mVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                k.this.f37029a.d(this.f37037b, this.f37038c, this.f37039d);
            }
        }

        public k(ClientStreamListener clientStreamListener) {
            this.f37029a = clientStreamListener;
        }

        @Override // io.grpc.internal.Q0
        public final void a(Q0.a aVar) {
            if (this.f37030b) {
                this.f37029a.a(aVar);
            } else {
                e(new a(aVar));
            }
        }

        @Override // io.grpc.internal.ClientStreamListener
        public final void b(io.grpc.m mVar) {
            e(new c(mVar));
        }

        @Override // io.grpc.internal.Q0
        public final void c() {
            if (this.f37030b) {
                this.f37029a.c();
            } else {
                e(new b());
            }
        }

        @Override // io.grpc.internal.ClientStreamListener
        public final void d(Status status, ClientStreamListener.RpcProgress rpcProgress, io.grpc.m mVar) {
            e(new d(status, rpcProgress, mVar));
        }

        public final void e(Runnable runnable) {
            synchronized (this) {
                try {
                    if (this.f37030b) {
                        runnable.run();
                    } else {
                        this.f37031c.add(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // io.grpc.internal.P0
    public final void a(D9.f fVar) {
        A8.p.p("May only be called before start", this.f37004b == null);
        this.f37011i.add(new b(fVar));
    }

    @Override // io.grpc.internal.P0
    public final boolean b() {
        if (this.f37003a) {
            return this.f37005c.b();
        }
        return false;
    }

    @Override // io.grpc.internal.InterfaceC2236o
    public final void c(int i10) {
        A8.p.p("May only be called before start", this.f37004b == null);
        this.f37011i.add(new d(i10));
    }

    @Override // io.grpc.internal.InterfaceC2236o
    public final void d(int i10) {
        A8.p.p("May only be called before start", this.f37004b == null);
        this.f37011i.add(new e(i10));
    }

    @Override // io.grpc.internal.InterfaceC2236o
    public void e(androidx.compose.runtime.snapshots.j jVar) {
        synchronized (this) {
            try {
                if (this.f37004b == null) {
                    return;
                }
                if (this.f37005c != null) {
                    jVar.a(Long.valueOf(this.f37010h - this.f37009g), "buffered_nanos");
                    this.f37005c.e(jVar);
                } else {
                    jVar.a(Long.valueOf(System.nanoTime() - this.f37009g), "buffered_nanos");
                    ((ArrayList) jVar.f13215b).add("waiting_for_connection");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.grpc.internal.InterfaceC2236o
    public void f(Status status) {
        boolean z10 = false;
        boolean z11 = true;
        A8.p.p("May only be called after start", this.f37004b != null);
        A8.p.j(status, "reason");
        synchronized (this) {
            try {
                InterfaceC2236o interfaceC2236o = this.f37005c;
                if (interfaceC2236o == null) {
                    C2242r0 c2242r0 = C2242r0.f37685a;
                    if (interfaceC2236o != null) {
                        z11 = false;
                    }
                    A8.p.o(interfaceC2236o, "realStream already set to %s", z11);
                    this.f37005c = c2242r0;
                    this.f37010h = System.nanoTime();
                    this.f37006d = status;
                } else {
                    z10 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            m(new i(status));
            return;
        }
        n();
        p(status);
        this.f37004b.d(status, ClientStreamListener.RpcProgress.f37134b, new io.grpc.m());
    }

    @Override // io.grpc.internal.P0
    public final void flush() {
        A8.p.p("May only be called after start", this.f37004b != null);
        if (this.f37003a) {
            this.f37005c.flush();
        } else {
            m(new h());
        }
    }

    @Override // io.grpc.internal.InterfaceC2236o
    public final void g(D9.j jVar) {
        A8.p.p("May only be called before start", this.f37004b == null);
        this.f37011i.add(new f(jVar));
    }

    @Override // io.grpc.internal.InterfaceC2236o
    public final void h(D9.l lVar) {
        A8.p.p("May only be called before start", this.f37004b == null);
        A8.p.j(lVar, "decompressorRegistry");
        this.f37011i.add(new c(lVar));
    }

    @Override // io.grpc.internal.InterfaceC2236o
    public final void i() {
        A8.p.p("May only be called after start", this.f37004b != null);
        m(new j());
    }

    @Override // io.grpc.internal.InterfaceC2236o
    public final void j(ClientStreamListener clientStreamListener) {
        Status status;
        boolean z10;
        A8.p.j(clientStreamListener, "listener");
        A8.p.p("already started", this.f37004b == null);
        synchronized (this) {
            try {
                status = this.f37006d;
                z10 = this.f37003a;
                if (!z10) {
                    k kVar = new k(clientStreamListener);
                    this.f37008f = kVar;
                    clientStreamListener = kVar;
                }
                this.f37004b = clientStreamListener;
                this.f37009g = System.nanoTime();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (status != null) {
            clientStreamListener.d(status, ClientStreamListener.RpcProgress.f37134b, new io.grpc.m());
        } else if (z10) {
            o(clientStreamListener);
        }
    }

    @Override // io.grpc.internal.P0
    public final void k(InputStream inputStream) {
        A8.p.p("May only be called after start", this.f37004b != null);
        A8.p.j(inputStream, "message");
        if (this.f37003a) {
            this.f37005c.k(inputStream);
        } else {
            m(new g(inputStream));
        }
    }

    @Override // io.grpc.internal.P0
    public final void l() {
        A8.p.p("May only be called before start", this.f37004b == null);
        this.f37011i.add(new a());
    }

    public final void m(Runnable runnable) {
        A8.p.p("May only be called after start", this.f37004b != null);
        synchronized (this) {
            try {
                if (this.f37003a) {
                    runnable.run();
                } else {
                    this.f37007e.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002f A[Catch: all -> 0x002d, TryCatch #1 {all -> 0x002d, blocks: (B:11:0x001f, B:13:0x0027, B:14:0x002b, B:18:0x002f, B:19:0x0033), top: B:41:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:23:0x003e A[LOOP:3: B:21:0x0038->B:23:0x003e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x004f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x001f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0027 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0057, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005f, code lost:
    
        if (r0.hasNext() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0061, code lost:
    
        r0.next().run();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n() {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r6)
            java.util.List<java.lang.Runnable> r1 = r6.f37007e     // Catch: java.lang.Throwable -> L50
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L50
            if (r1 == 0) goto L52
            r0 = 0
            r6.f37007e = r0     // Catch: java.lang.Throwable -> L50
            r1 = 1
            r6.f37003a = r1     // Catch: java.lang.Throwable -> L50
            io.grpc.internal.B$k r2 = r6.f37008f     // Catch: java.lang.Throwable -> L50
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L50
            if (r2 == 0) goto L4f
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L1e:
            monitor-enter(r2)
            java.util.List<java.lang.Runnable> r4 = r2.f37031c     // Catch: java.lang.Throwable -> L2d
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L2d
            if (r4 == 0) goto L2f
            r2.f37031c = r0     // Catch: java.lang.Throwable -> L2d
            r2.f37030b = r1     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r0 = move-exception
            goto L4d
        L2f:
            java.util.List<java.lang.Runnable> r4 = r2.f37031c     // Catch: java.lang.Throwable -> L2d
            r2.f37031c = r3     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
            java.util.Iterator r3 = r4.iterator()
        L38:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L48
            java.lang.Object r5 = r3.next()
            java.lang.Runnable r5 = (java.lang.Runnable) r5
            r5.run()
            goto L38
        L48:
            r4.clear()
            r3 = r4
            goto L1e
        L4d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
            throw r0
        L4f:
            return
        L50:
            r0 = move-exception
            goto L70
        L52:
            java.util.List<java.lang.Runnable> r1 = r6.f37007e     // Catch: java.lang.Throwable -> L50
            r6.f37007e = r0     // Catch: java.lang.Throwable -> L50
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L50
            java.util.Iterator r0 = r1.iterator()
        L5b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L6b
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L5b
        L6b:
            r1.clear()
            r0 = r1
            goto L5
        L70:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L50
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.B.n():void");
    }

    public final void o(ClientStreamListener clientStreamListener) {
        Iterator it = this.f37011i.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f37011i = null;
        this.f37005c.j(clientStreamListener);
    }

    public void p(Status status) {
        throw null;
    }

    @Override // io.grpc.internal.P0
    public final void request() {
        A8.p.p("May only be called after start", this.f37004b != null);
        if (this.f37003a) {
            this.f37005c.request();
        } else {
            m(new A(this));
        }
    }
}
