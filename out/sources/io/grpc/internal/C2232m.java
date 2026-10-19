package io.grpc.internal;

import io.grpc.MethodDescriptor;
import io.grpc.Status;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: io.grpc.internal.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ClientCallImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2232m<ReqT, RespT> extends D9.b<ReqT, RespT> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Logger f37576r = Logger.getLogger(C2232m.class.getName());

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final double f37577s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MethodDescriptor<ReqT, RespT> f37578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p111ia.c f37579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f37580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f37581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C2226j f37582e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final D9.i f37583f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile ScheduledFuture<?> f37584g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f37585h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public io.grpc.b f37586i;
    public InterfaceC2236o j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile boolean f37587k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f37588l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f37589m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b f37590n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ScheduledExecutorService f37592p;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C2232m<ReqT, RespT>.c f37591o = new c();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public D9.l f37593q = D9.l.f2895d;

    /* JADX INFO: renamed from: io.grpc.internal.m$a */
    /* JADX INFO: compiled from: ClientCallImpl.java */
    public class a implements ClientStreamListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final D9.b.a<RespT> f37594a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Status f37595b;

        /* JADX INFO: renamed from: io.grpc.internal.m$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ClientCallImpl.java */
        public final class C0395a extends T4.B {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ io.grpc.m f37597d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0395a(io.grpc.m mVar) {
                super(1, C2232m.this.f37583f);
                this.f37597d = mVar;
            }

            @Override // T4.B
            public final void a() {
                a aVar = a.this;
                p111ia.b.c();
                try {
                    p111ia.c cVar = C2232m.this.f37579b;
                    p111ia.b.a();
                    p111ia.b.f36850a.getClass();
                    if (aVar.f37595b == null) {
                        try {
                            aVar.f37594a.b(this.f37597d);
                        } catch (Throwable th) {
                            Status statusH = Status.f36900f.g(th).h("Failed to read headers");
                            aVar.f37595b = statusH;
                            C2232m.this.j.f(statusH);
                        }
                    }
                    p111ia.b.f36850a.getClass();
                } catch (Throwable th2) {
                    try {
                        p111ia.b.f36850a.getClass();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }

        /* JADX INFO: renamed from: io.grpc.internal.m$a$b */
        /* JADX INFO: compiled from: ClientCallImpl.java */
        public final class b extends T4.B {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Q0.a f37599d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Q0.a aVar) {
                super(1, C2232m.this.f37583f);
                this.f37599d = aVar;
            }

            @Override // T4.B
            public final void a() {
                p111ia.b.c();
                try {
                    p111ia.c cVar = C2232m.this.f37579b;
                    p111ia.b.a();
                    p111ia.a aVar = p111ia.b.f36850a;
                    aVar.getClass();
                    c();
                    aVar.getClass();
                } catch (Throwable th) {
                    try {
                        p111ia.b.f36850a.getClass();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }

            /* JADX WARN: Bottom block not found for handler: all -> 0x002e */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
            
                return;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void c() {
                /*
                    r6 = this;
                    io.grpc.internal.m$a r0 = io.grpc.internal.C2232m.a.this
                    io.grpc.Status r1 = r0.f37595b
                    io.grpc.internal.m r2 = io.grpc.internal.C2232m.this
                    io.grpc.internal.Q0$a r3 = r6.f37599d
                    if (r1 == 0) goto L17
                    java.util.logging.Logger r0 = io.grpc.internal.GrpcUtil.f37199a
                Lc:
                    java.io.InputStream r0 = r3.next()
                    if (r0 == 0) goto L16
                    io.grpc.internal.GrpcUtil.b(r0)
                    goto Lc
                L16:
                    return
                L17:
                    java.io.InputStream r1 = r3.next()     // Catch: java.lang.Throwable -> L2e
                    if (r1 == 0) goto L54
                    D9.b$a<RespT> r4 = r0.f37594a     // Catch: java.lang.Throwable -> L30
                    io.grpc.MethodDescriptor<ReqT, RespT> r5 = r2.f37578a     // Catch: java.lang.Throwable -> L30
                    H9.b$a r5 = r5.f36890e     // Catch: java.lang.Throwable -> L30
                    com.google.protobuf.J r5 = r5.a(r1)     // Catch: java.lang.Throwable -> L30
                    r4.c(r5)     // Catch: java.lang.Throwable -> L30
                    r1.close()     // Catch: java.lang.Throwable -> L2e
                    goto L17
                L2e:
                    r1 = move-exception
                    goto L35
                L30:
                    r4 = move-exception
                    io.grpc.internal.GrpcUtil.b(r1)     // Catch: java.lang.Throwable -> L2e
                    throw r4     // Catch: java.lang.Throwable -> L2e
                L35:
                    java.util.logging.Logger r4 = io.grpc.internal.GrpcUtil.f37199a
                L37:
                    java.io.InputStream r4 = r3.next()
                    if (r4 == 0) goto L41
                    io.grpc.internal.GrpcUtil.b(r4)
                    goto L37
                L41:
                    io.grpc.Status r3 = io.grpc.Status.f36900f
                    io.grpc.Status r1 = r3.g(r1)
                    java.lang.String r3 = "Failed to read message."
                    io.grpc.Status r1 = r1.h(r3)
                    r0.f37595b = r1
                    io.grpc.internal.o r0 = r2.j
                    r0.f(r1)
                L54:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.C2232m.a.b.c():void");
            }
        }

        /* JADX INFO: renamed from: io.grpc.internal.m$a$c */
        /* JADX INFO: compiled from: ClientCallImpl.java */
        public final class c extends T4.B {
            public c() {
                super(1, C2232m.this.f37583f);
            }

            @Override // T4.B
            public final void a() {
                a aVar = a.this;
                p111ia.b.c();
                try {
                    p111ia.c cVar = C2232m.this.f37579b;
                    p111ia.b.a();
                    p111ia.b.f36850a.getClass();
                    if (aVar.f37595b == null) {
                        try {
                            aVar.f37594a.d();
                        } catch (Throwable th) {
                            Status statusH = Status.f36900f.g(th).h("Failed to call onReady.");
                            aVar.f37595b = statusH;
                            C2232m.this.j.f(statusH);
                        }
                    }
                    p111ia.b.f36850a.getClass();
                } catch (Throwable th2) {
                    try {
                        p111ia.b.f36850a.getClass();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }

        public a(D9.b.a<RespT> aVar) {
            this.f37594a = aVar;
        }

        @Override // io.grpc.internal.Q0
        public final void a(Q0.a aVar) {
            C2232m c2232m = C2232m.this;
            p111ia.b.c();
            try {
                p111ia.c cVar = c2232m.f37579b;
                p111ia.b.a();
                p111ia.b.b();
                c2232m.f37580c.execute(new b(aVar));
                p111ia.b.f36850a.getClass();
            } catch (Throwable th) {
                try {
                    p111ia.b.f36850a.getClass();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        @Override // io.grpc.internal.ClientStreamListener
        public final void b(io.grpc.m mVar) {
            C2232m c2232m = C2232m.this;
            p111ia.b.c();
            try {
                p111ia.c cVar = c2232m.f37579b;
                p111ia.b.a();
                p111ia.b.b();
                c2232m.f37580c.execute(new C0395a(mVar));
                p111ia.b.f36850a.getClass();
            } catch (Throwable th) {
                try {
                    p111ia.b.f36850a.getClass();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        @Override // io.grpc.internal.Q0
        public final void c() {
            C2232m c2232m = C2232m.this;
            MethodDescriptor.MethodType methodType = c2232m.f37578a.f36886a;
            methodType.getClass();
            if (methodType == MethodDescriptor.MethodType.f36892b || methodType == MethodDescriptor.MethodType.f36893c) {
                return;
            }
            p111ia.b.c();
            try {
                p111ia.b.a();
                p111ia.b.b();
                c2232m.f37580c.execute(new c());
                p111ia.b.f36850a.getClass();
            } catch (Throwable th) {
                try {
                    p111ia.b.f36850a.getClass();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        @Override // io.grpc.internal.ClientStreamListener
        public final void d(Status status, ClientStreamListener.RpcProgress rpcProgress, io.grpc.m mVar) {
            p111ia.b.c();
            try {
                p111ia.c cVar = C2232m.this.f37579b;
                p111ia.b.a();
                e(status, mVar);
                p111ia.b.f36850a.getClass();
            } catch (Throwable th) {
                try {
                    p111ia.b.f36850a.getClass();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public final void e(Status status, io.grpc.m mVar) {
            C2232m c2232m = C2232m.this;
            D9.j jVar = c2232m.f37586i.f36938a;
            c2232m.f37583f.getClass();
            if (jVar == null) {
                jVar = null;
            }
            if (status.f36908a == Status.Code.CANCELLED && jVar != null && jVar.b()) {
                androidx.compose.runtime.snapshots.j jVar2 = new androidx.compose.runtime.snapshots.j();
                c2232m.j.e(jVar2);
                status = Status.f36902h.b("ClientCall was cancelled at or after deadline. " + jVar2);
                mVar = new io.grpc.m();
            }
            p111ia.b.b();
            c2232m.f37580c.execute(new C2234n(this, status, mVar));
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.m$b */
    /* JADX INFO: compiled from: ClientCallImpl.java */
    public interface b {
    }

    /* JADX INFO: renamed from: io.grpc.internal.m$c */
    /* JADX INFO: compiled from: ClientCallImpl.java */
    public final class c {
    }

    /* JADX INFO: renamed from: io.grpc.internal.m$d */
    /* JADX INFO: compiled from: ClientCallImpl.java */
    public class d implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f37602b;

        public d(long j) {
            this.f37602b = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            androidx.compose.runtime.snapshots.j jVar = new androidx.compose.runtime.snapshots.j();
            C2232m c2232m = C2232m.this;
            c2232m.j.e(jVar);
            long j = this.f37602b;
            long jAbs = Math.abs(j);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long nanos = jAbs / timeUnit.toNanos(1L);
            long jAbs2 = Math.abs(j) % timeUnit.toNanos(1L);
            StringBuilder sb2 = new StringBuilder("deadline exceeded after ");
            if (j < 0) {
                sb2.append('-');
            }
            sb2.append(nanos);
            sb2.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
            sb2.append("s. ");
            sb2.append(jVar);
            c2232m.j.f(Status.f36902h.b(sb2.toString()));
        }
    }

    static {
        "gzip".getBytes(Charset.forName("US-ASCII"));
        f37577s = TimeUnit.SECONDS.toNanos(1L) * 1.0d;
    }

    public C2232m(MethodDescriptor methodDescriptor, Executor executor, io.grpc.b bVar, b bVar2, ScheduledExecutorService scheduledExecutorService, C2226j c2226j) {
        D9.g gVar = D9.g.f2880b;
        this.f37578a = methodDescriptor;
        String str = methodDescriptor.f36887b;
        System.identityHashCode(this);
        p111ia.b.f36850a.getClass();
        this.f37579b = p111ia.a.f36848a;
        if (executor == com.google.common.util.concurrent.a.a()) {
            this.f37580c = new I0();
            this.f37581d = true;
        } else {
            this.f37580c = new J0(executor);
            this.f37581d = false;
        }
        this.f37582e = c2226j;
        this.f37583f = D9.i.a();
        MethodDescriptor.MethodType methodType = MethodDescriptor.MethodType.f36892b;
        MethodDescriptor.MethodType methodType2 = methodDescriptor.f36886a;
        this.f37585h = methodType2 == methodType || methodType2 == MethodDescriptor.MethodType.f36893c;
        this.f37586i = bVar;
        this.f37590n = bVar2;
        this.f37592p = scheduledExecutorService;
    }

    @Override // D9.b
    public final void a(String str, Throwable th) {
        p111ia.b.c();
        try {
            p111ia.b.a();
            f(str, th);
            p111ia.b.f36850a.getClass();
        } catch (Throwable th2) {
            try {
                p111ia.b.f36850a.getClass();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // D9.b
    public final void b() {
        p111ia.b.c();
        try {
            p111ia.b.a();
            A8.p.p("Not started", this.j != null);
            A8.p.p("call was cancelled", !this.f37588l);
            A8.p.p("call already half-closed", !this.f37589m);
            this.f37589m = true;
            this.j.i();
            p111ia.b.f36850a.getClass();
        } catch (Throwable th) {
            try {
                p111ia.b.f36850a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // D9.b
    public final void c() {
        p111ia.b.c();
        try {
            p111ia.b.a();
            A8.p.p("Not started", this.j != null);
            this.j.request();
            p111ia.b.f36850a.getClass();
        } catch (Throwable th) {
            try {
                p111ia.b.f36850a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // D9.b
    public final void d(N7.d dVar) {
        p111ia.b.c();
        try {
            p111ia.b.a();
            h(dVar);
            p111ia.b.f36850a.getClass();
        } catch (Throwable th) {
            try {
                p111ia.b.f36850a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // D9.b
    public final void e(D9.b.a<RespT> aVar, io.grpc.m mVar) {
        p111ia.b.c();
        try {
            p111ia.b.a();
            i(aVar, mVar);
            p111ia.b.f36850a.getClass();
        } catch (Throwable th) {
            try {
                p111ia.b.f36850a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void f(String str, Throwable th) {
        if (str == null && th == null) {
            th = new CancellationException("Cancelled without a message or cause");
            f37576r.log(Level.WARNING, "Cancelling without a message or cause is suboptimal", th);
        }
        if (this.f37588l) {
            return;
        }
        this.f37588l = true;
        try {
            if (this.j != null) {
                Status status = Status.f36900f;
                Status statusH = str != null ? status.h(str) : status.h("Call cancelled without message");
                if (th != null) {
                    statusH = statusH.g(th);
                }
                this.j.f(statusH);
            }
        } finally {
            g();
        }
    }

    public final void g() {
        this.f37583f.getClass();
        ScheduledFuture<?> scheduledFuture = this.f37584g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    public final void h(N7.d dVar) {
        A8.p.p("Not started", this.j != null);
        A8.p.p("call was cancelled", !this.f37588l);
        A8.p.p("call was half-closed", !this.f37589m);
        try {
            InterfaceC2236o interfaceC2236o = this.j;
            if (interfaceC2236o instanceof B0) {
                ((B0) interfaceC2236o).x(dVar);
            } else {
                interfaceC2236o.k(this.f37578a.f36889d.b(dVar));
            }
            if (this.f37585h) {
                return;
            }
            this.j.flush();
        } catch (Error e10) {
            this.j.f(Status.f36900f.h("Client sendMessage() failed with Error"));
            throw e10;
        } catch (RuntimeException e11) {
            this.j.f(Status.f36900f.g(e11).h("Failed to stream message"));
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0055  */
    public final void i(D9.b.a<RespT> aVar, io.grpc.m mVar) {
        InterfaceC2236o c2229k0;
        io.grpc.b bVar;
        A8.p.p("Already started", this.j == null);
        A8.p.p("call was cancelled", !this.f37588l);
        this.f37583f.getClass();
        io.grpc.b bVar2 = this.f37586i;
        io.grpc.b.C0388b<C2237o0.a> c0388b = C2237o0.a.f37651g;
        C2237o0.a aVar2 = (C2237o0.a) bVar2.a(c0388b);
        if (aVar2 != null) {
            Long l10 = aVar2.f37652a;
            if (l10 != null) {
                long jLongValue = l10.longValue();
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                if (timeUnit == null) {
                    D9.j.a aVar3 = D9.j.f2887e;
                    throw new NullPointerException("units");
                }
                D9.j jVar = new D9.j(timeUnit.toNanos(jLongValue));
                D9.j jVar2 = this.f37586i.f36938a;
                if (jVar2 != null) {
                    jVar.a(jVar2);
                    if (jVar.f2892c - jVar2.f2892c < 0) {
                        io.grpc.b bVar3 = this.f37586i;
                        bVar3.getClass();
                        io.grpc.b.a aVarB = io.grpc.b.b(bVar3);
                        aVarB.f36945a = jVar;
                        this.f37586i = new io.grpc.b(aVarB);
                    }
                } else {
                    io.grpc.b bVar4 = this.f37586i;
                    bVar4.getClass();
                    io.grpc.b.a aVarB2 = io.grpc.b.b(bVar4);
                    aVarB2.f36945a = jVar;
                    this.f37586i = new io.grpc.b(aVarB2);
                }
            }
            Boolean bool = aVar2.f37653b;
            if (bool != null) {
                if (bool.booleanValue()) {
                    io.grpc.b bVar5 = this.f37586i;
                    bVar5.getClass();
                    io.grpc.b.a aVarB3 = io.grpc.b.b(bVar5);
                    aVarB3.f36949e = Boolean.TRUE;
                    bVar = new io.grpc.b(aVarB3);
                } else {
                    io.grpc.b bVar6 = this.f37586i;
                    bVar6.getClass();
                    io.grpc.b.a aVarB4 = io.grpc.b.b(bVar6);
                    aVarB4.f36949e = Boolean.FALSE;
                    bVar = new io.grpc.b(aVarB4);
                }
                this.f37586i = bVar;
            }
            Integer num = aVar2.f37654c;
            if (num != null) {
                io.grpc.b bVar7 = this.f37586i;
                Integer num2 = bVar7.f36943f;
                if (num2 != null) {
                    int iMin = Math.min(num2.intValue(), num.intValue());
                    A8.p.c(iMin, "invalid maxsize %s", iMin >= 0);
                    io.grpc.b.a aVarB5 = io.grpc.b.b(bVar7);
                    aVarB5.f36950f = Integer.valueOf(iMin);
                    this.f37586i = new io.grpc.b(aVarB5);
                } else {
                    int iIntValue = num.intValue();
                    A8.p.c(iIntValue, "invalid maxsize %s", iIntValue >= 0);
                    io.grpc.b.a aVarB6 = io.grpc.b.b(bVar7);
                    aVarB6.f36950f = num;
                    this.f37586i = new io.grpc.b(aVarB6);
                }
            }
            Integer num3 = aVar2.f37655d;
            if (num3 != null) {
                io.grpc.b bVar8 = this.f37586i;
                Integer num4 = bVar8.f36944g;
                if (num4 != null) {
                    int iMin2 = Math.min(num4.intValue(), num3.intValue());
                    A8.p.c(iMin2, "invalid maxsize %s", iMin2 >= 0);
                    io.grpc.b.a aVarB7 = io.grpc.b.b(bVar8);
                    aVarB7.f36951g = Integer.valueOf(iMin2);
                    this.f37586i = new io.grpc.b(aVarB7);
                } else {
                    int iIntValue2 = num3.intValue();
                    A8.p.c(iIntValue2, "invalid maxsize %s", iIntValue2 >= 0);
                    io.grpc.b.a aVarB8 = io.grpc.b.b(bVar8);
                    aVarB8.f36951g = num3;
                    this.f37586i = new io.grpc.b(aVarB8);
                }
            }
        }
        this.f37586i.getClass();
        D9.e.b bVar9 = D9.e.b.f2879a;
        D9.l lVar = this.f37593q;
        mVar.a(GrpcUtil.f37206h);
        mVar.a(GrpcUtil.f37202d);
        io.grpc.m.f fVar = GrpcUtil.f37203e;
        mVar.a(fVar);
        byte[] bArr = lVar.f2897b;
        if (bArr.length != 0) {
            mVar.e(fVar, bArr);
        }
        mVar.a(GrpcUtil.f37204f);
        mVar.a(GrpcUtil.f37205g);
        D9.j jVar3 = this.f37586i.f36938a;
        this.f37583f.getClass();
        D9.j jVar4 = jVar3 == null ? null : jVar3;
        if (jVar4 == null || !jVar4.b()) {
            this.f37583f.getClass();
            D9.j jVar5 = this.f37586i.f36938a;
            Level level = Level.FINE;
            Logger logger = f37576r;
            if (logger.isLoggable(level) && jVar4 != null && jVar4.equals(null)) {
                TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                long jMax = Math.max(0L, jVar4.c(timeUnit2));
                Locale locale = Locale.US;
                StringBuilder sb2 = new StringBuilder("Call timeout set to '" + jMax + "' ns, due to context deadline.");
                if (jVar5 == null) {
                    sb2.append(" Explicit call timeout was not set.");
                } else {
                    sb2.append(" Explicit call timeout was '" + jVar5.c(timeUnit2) + "' ns.");
                }
                logger.fine(sb2.toString());
            }
            b bVar10 = this.f37590n;
            MethodDescriptor<ReqT, RespT> methodDescriptor = this.f37578a;
            io.grpc.b bVar11 = this.f37586i;
            D9.i iVar = this.f37583f;
            ManagedChannelImpl.d dVar = (ManagedChannelImpl.d) bVar10;
            if (ManagedChannelImpl.this.f37304W) {
                C2237o0.a aVar4 = (C2237o0.a) bVar11.a(c0388b);
                c2229k0 = new C2229k0(dVar, methodDescriptor, mVar, bVar11, aVar4 == null ? null : aVar4.f37656e, aVar4 == null ? null : aVar4.f37657f, iVar);
            } else {
                InterfaceC2238p interfaceC2238pA = dVar.a(new C2250v0(methodDescriptor, mVar, bVar11));
                iVar.getClass();
                D9.i iVarC = D9.i.a.f2886a.c(iVar);
                if (iVarC == null) {
                    iVarC = D9.i.f2885b;
                }
                try {
                    c2229k0 = interfaceC2238pA.b(methodDescriptor, mVar, bVar11, GrpcUtil.c(bVar11, mVar, 0, false));
                    iVar.b(iVarC);
                } catch (Throwable th) {
                    iVar.b(iVarC);
                    throw th;
                }
            }
            this.j = c2229k0;
        } else {
            io.grpc.c[] cVarArrC = GrpcUtil.c(this.f37586i, mVar, 0, false);
            D9.j jVar6 = this.f37586i.f36938a;
            this.f37583f.getClass();
            this.j = new F(Status.f36902h.h(String.format("ClientCall started after %s deadline was exceeded .9%f seconds ago", jVar6 == null ? "Context" : "CallOptions", Double.valueOf(jVar4.c(TimeUnit.NANOSECONDS) / f37577s))), ClientStreamListener.RpcProgress.f37134b, cVarArrC);
        }
        if (this.f37581d) {
            this.j.l();
        }
        this.f37586i.getClass();
        Integer num5 = this.f37586i.f36943f;
        if (num5 != null) {
            this.j.c(num5.intValue());
        }
        Integer num6 = this.f37586i.f36944g;
        if (num6 != null) {
            this.j.d(num6.intValue());
        }
        if (jVar4 != null) {
            this.j.g(jVar4);
        }
        this.j.a(bVar9);
        this.j.h(this.f37593q);
        C2226j c2226j = this.f37582e;
        c2226j.f37560b.a();
        c2226j.f37559a.a();
        this.j.j(new a(aVar));
        D9.i iVar2 = this.f37583f;
        C2232m<ReqT, RespT>.c cVar = this.f37591o;
        iVar2.getClass();
        if (cVar == null) {
            throw new NullPointerException("cancellationListener");
        }
        Logger logger2 = D9.i.f2884a;
        if (jVar4 != null) {
            this.f37583f.getClass();
            if (!jVar4.equals(null) && this.f37592p != null) {
                TimeUnit timeUnit3 = TimeUnit.NANOSECONDS;
                long jC = jVar4.c(timeUnit3);
                this.f37584g = this.f37592p.schedule(new RunnableC2221g0(new d(jC)), jC, timeUnit3);
            }
        }
        if (this.f37587k) {
            g();
        }
    }

    public final String toString() {
        com.google.common.base.d.a aVarB = com.google.common.base.d.b(this);
        aVarB.c(this.f37578a, "method");
        return aVarB.toString();
    }
}
