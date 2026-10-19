package io.grpc.internal;

import io.grpc.Status;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* JADX INFO: renamed from: io.grpc.internal.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DelayedClientCall.java */
/* JADX INFO: loaded from: classes3.dex */
public class C2251w<ReqT, RespT> extends D9.b<ReqT, RespT> {
    public static final e j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledFuture<?> f37704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f37705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final D9.i f37706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f37707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public D9.b.a<RespT> f37708e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public D9.b<ReqT, RespT> f37709f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Status f37710g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<Runnable> f37711h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g<RespT> f37712i;

    /* JADX INFO: renamed from: io.grpc.internal.w$a */
    /* JADX INFO: compiled from: DelayedClientCall.java */
    public class a extends T4.B {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ g f37713d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C2251w c2251w, g gVar) {
            super(1, c2251w.f37706c);
            this.f37713d = gVar;
        }

        @Override // T4.B
        public final void a() {
            List<Runnable> list;
            g gVar = this.f37713d;
            gVar.getClass();
            List<Runnable> arrayList = new ArrayList<>();
            while (true) {
                synchronized (gVar) {
                    try {
                        if (gVar.f37724c.isEmpty()) {
                            gVar.f37724c = null;
                            gVar.f37723b = true;
                            return;
                        } else {
                            list = gVar.f37724c;
                            gVar.f37724c = arrayList;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Iterator<Runnable> it = list.iterator();
                while (it.hasNext()) {
                    it.next().run();
                }
                list.clear();
                arrayList = list;
            }
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.w$b */
    /* JADX INFO: compiled from: DelayedClientCall.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ D9.b.a f37714b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ io.grpc.m f37715c;

        public b(D9.b.a aVar, io.grpc.m mVar) {
            this.f37714b = aVar;
            this.f37715c = mVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C2251w.this.f37709f.e(this.f37714b, this.f37715c);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.w$c */
    /* JADX INFO: compiled from: DelayedClientCall.java */
    public class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Status f37717b;

        public c(Status status) {
            this.f37717b = status;
        }

        @Override // java.lang.Runnable
        public final void run() {
            D9.b<ReqT, RespT> bVar = C2251w.this.f37709f;
            Status status = this.f37717b;
            bVar.a(status.f36909b, status.f36910c);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.w$d */
    /* JADX INFO: compiled from: DelayedClientCall.java */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C2251w.this.f37709f.b();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.w$f */
    /* JADX INFO: compiled from: DelayedClientCall.java */
    public final class f extends T4.B {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final D9.b.a<RespT> f37720d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Status f37721e;

        public f(C2251w c2251w, D9.b.a<RespT> aVar, Status status) {
            super(1, c2251w.f37706c);
            this.f37720d = aVar;
            this.f37721e = status;
        }

        @Override // T4.B
        public final void a() {
            this.f37720d.a(this.f37721e, new io.grpc.m());
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.w$g */
    /* JADX INFO: compiled from: DelayedClientCall.java */
    public static final class g<RespT> extends D9.b.a<RespT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final D9.b.a<RespT> f37722a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile boolean f37723b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List<Runnable> f37724c = new ArrayList();

        /* JADX INFO: renamed from: io.grpc.internal.w$g$a */
        /* JADX INFO: compiled from: DelayedClientCall.java */
        public class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ io.grpc.m f37725b;

            public a(io.grpc.m mVar) {
                this.f37725b = mVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                g.this.f37722a.b(this.f37725b);
            }
        }

        /* JADX INFO: renamed from: io.grpc.internal.w$g$b */
        /* JADX INFO: compiled from: DelayedClientCall.java */
        public class b implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Object f37727b;

            public b(Object obj) {
                this.f37727b = obj;
            }

            @Override // java.lang.Runnable
            public final void run() {
                g.this.f37722a.c((RespT) this.f37727b);
            }
        }

        /* JADX INFO: renamed from: io.grpc.internal.w$g$c */
        /* JADX INFO: compiled from: DelayedClientCall.java */
        public class c implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Status f37729b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ io.grpc.m f37730c;

            public c(Status status, io.grpc.m mVar) {
                this.f37729b = status;
                this.f37730c = mVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                g.this.f37722a.a(this.f37729b, this.f37730c);
            }
        }

        /* JADX INFO: renamed from: io.grpc.internal.w$g$d */
        /* JADX INFO: compiled from: DelayedClientCall.java */
        public class d implements Runnable {
            public d() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                g.this.f37722a.d();
            }
        }

        public g(D9.b.a<RespT> aVar) {
            this.f37722a = aVar;
        }

        @Override // D9.b.a
        public final void a(Status status, io.grpc.m mVar) {
            e(new c(status, mVar));
        }

        @Override // D9.b.a
        public final void b(io.grpc.m mVar) {
            if (this.f37723b) {
                this.f37722a.b(mVar);
            } else {
                e(new a(mVar));
            }
        }

        @Override // D9.b.a
        public final void c(RespT respt) {
            if (this.f37723b) {
                this.f37722a.c(respt);
            } else {
                e(new b(respt));
            }
        }

        @Override // D9.b.a
        public final void d() {
            if (this.f37723b) {
                this.f37722a.d();
            } else {
                e(new d());
            }
        }

        public final void e(Runnable runnable) {
            synchronized (this) {
                try {
                    if (this.f37723b) {
                        runnable.run();
                    } else {
                        this.f37724c.add(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    static {
        Logger.getLogger(C2251w.class.getName());
        j = new e();
    }

    public C2251w(Executor executor, ManagedChannelImpl.m mVar, D9.j jVar) {
        ScheduledFuture<?> scheduledFutureSchedule;
        A8.p.j(executor, "callExecutor");
        this.f37705b = executor;
        A8.p.j(mVar, "scheduler");
        D9.i iVarA = D9.i.a();
        this.f37706c = iVarA;
        iVarA.getClass();
        if (jVar == null) {
            scheduledFutureSchedule = null;
        } else {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long jC = jVar.c(timeUnit);
            long jAbs = Math.abs(jC);
            TimeUnit timeUnit2 = TimeUnit.SECONDS;
            long nanos = jAbs / timeUnit2.toNanos(1L);
            long jAbs2 = Math.abs(jC) % timeUnit2.toNanos(1L);
            StringBuilder sb2 = new StringBuilder();
            if (jC < 0) {
                sb2.append("ClientCall started after CallOptions deadline was exceeded. Deadline has been exceeded for ");
            } else {
                sb2.append("Deadline CallOptions will be exceeded in ");
            }
            sb2.append(nanos);
            sb2.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
            sb2.append("s. ");
            scheduledFutureSchedule = mVar.f37380b.schedule(new L2.a(this, 1, sb2), jC, timeUnit);
        }
        this.f37704a = scheduledFutureSchedule;
    }

    @Override // D9.b
    public final void a(String str, Throwable th) {
        Status status = Status.f36900f;
        Status statusH = str != null ? status.h(str) : status.h("Call cancelled without message");
        if (th != null) {
            statusH = statusH.g(th);
        }
        g(statusH, false);
    }

    @Override // D9.b
    public final void b() {
        h(new d());
    }

    @Override // D9.b
    public final void c() {
        if (this.f37707d) {
            this.f37709f.c();
        } else {
            h(new RunnableC2253y(this));
        }
    }

    @Override // D9.b
    public final void d(N7.d dVar) {
        if (this.f37707d) {
            this.f37709f.d(dVar);
        } else {
            h(new RunnableC2252x(this, 0, dVar));
        }
    }

    @Override // D9.b
    public final void e(D9.b.a<RespT> aVar, io.grpc.m mVar) {
        Status status;
        boolean z10;
        A8.p.p("already started", this.f37708e == null);
        synchronized (this) {
            try {
                this.f37708e = aVar;
                status = this.f37710g;
                z10 = this.f37707d;
                if (!z10) {
                    g<RespT> gVar = new g<>(aVar);
                    this.f37712i = gVar;
                    aVar = gVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (status != null) {
            this.f37705b.execute(new f(this, aVar, status));
        } else if (z10) {
            this.f37709f.e(aVar, mVar);
        } else {
            h(new b(aVar, mVar));
        }
    }

    public final void g(Status status, boolean z10) {
        D9.b.a<RespT> aVar;
        synchronized (this) {
            try {
                D9.b<ReqT, RespT> bVar = this.f37709f;
                boolean z11 = true;
                if (bVar == null) {
                    e eVar = j;
                    if (bVar != null) {
                        z11 = false;
                    }
                    A8.p.o(bVar, "realCall already set to %s", z11);
                    ScheduledFuture<?> scheduledFuture = this.f37704a;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f37709f = eVar;
                    aVar = this.f37708e;
                    this.f37710g = status;
                    z11 = false;
                } else if (z10) {
                    return;
                } else {
                    aVar = null;
                }
                if (z11) {
                    h(new c(status));
                } else {
                    if (aVar != null) {
                        this.f37705b.execute(new f(this, aVar, status));
                    }
                    i();
                }
                f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.f37707d) {
                    runnable.run();
                } else {
                    this.f37711h.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r0.hasNext() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        r0.next().run();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List<java.lang.Runnable> r1 = r3.f37711h     // Catch: java.lang.Throwable -> L24
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L26
            r0 = 0
            r3.f37711h = r0     // Catch: java.lang.Throwable -> L24
            r0 = 1
            r3.f37707d = r0     // Catch: java.lang.Throwable -> L24
            io.grpc.internal.w$g<RespT> r0 = r3.f37712i     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L23
            java.util.concurrent.Executor r1 = r3.f37705b
            io.grpc.internal.w$a r2 = new io.grpc.internal.w$a
            r2.<init>(r3, r0)
            r1.execute(r2)
        L23:
            return
        L24:
            r0 = move-exception
            goto L44
        L26:
            java.util.List<java.lang.Runnable> r1 = r3.f37711h     // Catch: java.lang.Throwable -> L24
            r3.f37711h = r0     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            java.util.Iterator r0 = r1.iterator()
        L2f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L2f
        L3f:
            r1.clear()
            r0 = r1
            goto L5
        L44:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.C2251w.i():void");
    }

    public final String toString() {
        com.google.common.base.d.a aVarB = com.google.common.base.d.b(this);
        aVarB.c(this.f37709f, "realCall");
        return aVarB.toString();
    }

    /* JADX INFO: renamed from: io.grpc.internal.w$e */
    /* JADX INFO: compiled from: DelayedClientCall.java */
    public class e extends D9.b<Object, Object> {
        @Override // D9.b
        public final void b() {
        }

        @Override // D9.b
        public final void c() {
        }

        @Override // D9.b
        public final void d(N7.d dVar) {
        }

        @Override // D9.b
        public final void a(String str, Throwable th) {
        }

        @Override // D9.b
        public final void e(D9.b.a<Object> aVar, io.grpc.m mVar) {
        }
    }

    public void f() {
    }
}
