package io.grpc.internal;

import io.grpc.ChannelLogger;
import io.grpc.ConnectivityState;
import io.grpc.HttpConnectProxiedSocketAddress;
import io.grpc.MethodDescriptor;
import io.grpc.Status;
import java.net.SocketAddress;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: compiled from: InternalSubchannel.java */
/* JADX INFO: loaded from: classes3.dex */
public final class U implements D9.q<Object>, T0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D9.r f37448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final E.a f37450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ManagedChannelImpl.n.a f37451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C2224i f37452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f37453f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final D9.p f37454g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C2226j f37455h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ChannelLogger f37456i;
    public final D9.w j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final d f37457k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile List<io.grpc.d> f37458l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public E f37459m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final com.google.common.base.i f37460n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public D9.w.c f37461o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public D9.w.c f37462p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public InterfaceC2239p0 f37463q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public b f37466t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public volatile InterfaceC2243s f37467u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Status f37469w;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f37464r = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a f37465s = new a();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile D9.h f37468v = D9.h.a(ConnectivityState.f36870e);

    /* JADX INFO: compiled from: InternalSubchannel.java */
    public class a extends E3.b {
        public a() {
            super(4);
        }

        @Override // E3.b
        public final void A() {
            U u10 = U.this;
            ManagedChannelImpl.this.f37305X.G(u10, true);
        }

        @Override // E3.b
        public final void C() {
            U u10 = U.this;
            ManagedChannelImpl.this.f37305X.G(u10, false);
        }
    }

    /* JADX INFO: compiled from: InternalSubchannel.java */
    public static final class b extends J {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC2243s f37471a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C2226j f37472b;

        /* JADX INFO: compiled from: InternalSubchannel.java */
        public class a extends H {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2236o f37473a;

            /* JADX INFO: renamed from: io.grpc.internal.U$b$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: InternalSubchannel.java */
            public class C0391a extends I {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ ClientStreamListener f37475a;

                public C0391a(ClientStreamListener clientStreamListener) {
                    this.f37475a = clientStreamListener;
                }

                @Override // io.grpc.internal.ClientStreamListener
                public final void d(Status status, ClientStreamListener.RpcProgress rpcProgress, io.grpc.m mVar) {
                    C2226j c2226j = b.this.f37472b;
                    if (status.f()) {
                        c2226j.f37561c.a();
                    } else {
                        c2226j.f37562d.a();
                    }
                    this.f37475a.d(status, rpcProgress, mVar);
                }
            }

            public a(InterfaceC2236o interfaceC2236o) {
                this.f37473a = interfaceC2236o;
            }

            @Override // io.grpc.internal.InterfaceC2236o
            public final void j(ClientStreamListener clientStreamListener) {
                C2226j c2226j = b.this.f37472b;
                c2226j.f37560b.a();
                c2226j.f37559a.a();
                this.f37473a.j(new C0391a(clientStreamListener));
            }
        }

        public b(InterfaceC2243s interfaceC2243s, C2226j c2226j) {
            this.f37471a = interfaceC2243s;
            this.f37472b = c2226j;
        }

        @Override // io.grpc.internal.J
        public final InterfaceC2243s a() {
            return this.f37471a;
        }

        @Override // io.grpc.internal.InterfaceC2238p
        public final InterfaceC2236o b(MethodDescriptor<?, ?> methodDescriptor, io.grpc.m mVar, io.grpc.b bVar, io.grpc.c[] cVarArr) {
            return new a(a().b(methodDescriptor, mVar, bVar, cVarArr));
        }
    }

    /* JADX INFO: compiled from: InternalSubchannel.java */
    public static abstract class c {
    }

    /* JADX INFO: compiled from: InternalSubchannel.java */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<io.grpc.d> f37477a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f37478b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f37479c;

        public final void a() {
            this.f37478b = 0;
            this.f37479c = 0;
        }
    }

    /* JADX INFO: compiled from: InternalSubchannel.java */
    public class e implements InterfaceC2239p0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f37480a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f37481b = false;

        /* JADX INFO: compiled from: InternalSubchannel.java */
        public class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Status f37483b;

            public a(Status status) {
                this.f37483b = status;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (U.this.f37468v.f2882a == ConnectivityState.f36871f) {
                    return;
                }
                InterfaceC2243s interfaceC2243s = U.this.f37467u;
                e eVar = e.this;
                b bVar = eVar.f37480a;
                if (interfaceC2243s == bVar) {
                    U.this.f37467u = null;
                    U.this.f37457k.a();
                    U.f(U.this, ConnectivityState.f36870e);
                    return;
                }
                U u10 = U.this;
                if (u10.f37466t == bVar) {
                    A8.p.o(U.this.f37468v.f2882a, "Expected state is CONNECTING, actual state is %s", u10.f37468v.f2882a == ConnectivityState.f36867b);
                    d dVar = U.this.f37457k;
                    io.grpc.d dVar2 = dVar.f37477a.get(dVar.f37478b);
                    int i10 = dVar.f37479c + 1;
                    dVar.f37479c = i10;
                    if (i10 >= dVar2.f36959a.size()) {
                        dVar.f37478b++;
                        dVar.f37479c = 0;
                    }
                    d dVar3 = U.this.f37457k;
                    if (dVar3.f37478b < dVar3.f37477a.size()) {
                        U.g(U.this);
                        return;
                    }
                    U u11 = U.this;
                    u11.f37466t = null;
                    u11.f37457k.a();
                    U u12 = U.this;
                    Status status = this.f37483b;
                    u12.j.d();
                    A8.p.f("The error status must not be OK", !status.f());
                    u12.h(new D9.h(ConnectivityState.f36869d, status));
                    if (u12.f37459m == null) {
                        u12.f37459m = u12.f37450c.a();
                    }
                    long jA = u12.f37459m.a();
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    long jA2 = jA - u12.f37460n.a(timeUnit);
                    u12.f37456i.b(ChannelLogger.ChannelLogLevel.f36863c, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", U.i(status), Long.valueOf(jA2));
                    A8.p.p("previous reconnectTask is not done", u12.f37461o == null);
                    u12.f37461o = u12.j.c(new V(u12), jA2, timeUnit, u12.f37453f);
                }
            }
        }

        /* JADX INFO: compiled from: InternalSubchannel.java */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                e eVar = e.this;
                U.this.f37464r.remove(eVar.f37480a);
                if (U.this.f37468v.f2882a == ConnectivityState.f36871f && U.this.f37464r.isEmpty()) {
                    U u10 = U.this;
                    u10.getClass();
                    u10.j.execute(new Z(u10));
                }
            }
        }

        public e(b bVar) {
            this.f37480a = bVar;
        }

        public final void a(boolean z10) {
            b bVar = this.f37480a;
            U u10 = U.this;
            u10.getClass();
            u10.j.execute(new RunnableC2209a0(u10, bVar, z10));
        }

        public final void b(Status status) {
            U u10 = U.this;
            u10.f37456i.b(ChannelLogger.ChannelLogLevel.f36863c, "{0} SHUTDOWN with {1}", this.f37480a.e(), U.i(status));
            this.f37481b = true;
            u10.j.execute(new a(status));
        }

        public final void c() {
            A8.p.p("transportShutdown() must be called before transportTerminated().", this.f37481b);
            U u10 = U.this;
            ChannelLogger channelLogger = u10.f37456i;
            ChannelLogger.ChannelLogLevel channelLogLevel = ChannelLogger.ChannelLogLevel.f36863c;
            b bVar = this.f37480a;
            channelLogger.b(channelLogLevel, "{0} Terminated", bVar.e());
            RunnableC2209a0 runnableC2209a0 = new RunnableC2209a0(u10, bVar, false);
            D9.w wVar = u10.j;
            wVar.execute(runnableC2209a0);
            wVar.execute(new b());
        }
    }

    /* JADX INFO: compiled from: InternalSubchannel.java */
    public static final class f extends ChannelLogger {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public D9.r f37486a;

        @Override // io.grpc.ChannelLogger
        public final void a(ChannelLogger.ChannelLogLevel channelLogLevel, String str) {
            D9.r rVar = this.f37486a;
            Level levelD = C2228k.d(channelLogLevel);
            if (C2230l.f37570d.isLoggable(levelD)) {
                C2230l.a(rVar, levelD, str);
            }
        }

        @Override // io.grpc.ChannelLogger
        public final void b(ChannelLogger.ChannelLogLevel channelLogLevel, String str, Object... objArr) {
            D9.r rVar = this.f37486a;
            Level levelD = C2228k.d(channelLogLevel);
            if (C2230l.f37570d.isLoggable(levelD)) {
                C2230l.a(rVar, levelD, MessageFormat.format(str, objArr));
            }
        }
    }

    public U(List list, String str, E.a aVar, C2224i c2224i, ScheduledExecutorService scheduledExecutorService, GrpcUtil.d dVar, D9.w wVar, ManagedChannelImpl.n.a aVar2, D9.p pVar, C2226j c2226j, C2230l c2230l, D9.r rVar, ChannelLogger channelLogger) {
        A8.p.j(list, "addressGroups");
        A8.p.f("addressGroups is empty", !list.isEmpty());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A8.p.j(it.next(), "addressGroups contains null entry");
        }
        List<io.grpc.d> listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.f37458l = listUnmodifiableList;
        d dVar2 = new d();
        dVar2.f37477a = listUnmodifiableList;
        this.f37457k = dVar2;
        this.f37449b = str;
        this.f37450c = aVar;
        this.f37452e = c2224i;
        this.f37453f = scheduledExecutorService;
        dVar.getClass();
        this.f37460n = new com.google.common.base.i();
        this.j = wVar;
        this.f37451d = aVar2;
        this.f37454g = pVar;
        this.f37455h = c2226j;
        A8.p.j(c2230l, "channelTracer");
        A8.p.j(rVar, "logId");
        this.f37448a = rVar;
        A8.p.j(channelLogger, "channelLogger");
        this.f37456i = channelLogger;
    }

    public static void f(U u10, ConnectivityState connectivityState) {
        u10.j.d();
        u10.h(D9.h.a(connectivityState));
    }

    public static void g(U u10) {
        SocketAddress socketAddressC;
        HttpConnectProxiedSocketAddress httpConnectProxiedSocketAddress;
        D9.w wVar = u10.j;
        wVar.d();
        A8.p.p("Should have no reconnectTask scheduled", u10.f37461o == null);
        d dVar = u10.f37457k;
        if (dVar.f37478b == 0 && dVar.f37479c == 0) {
            com.google.common.base.i iVar = u10.f37460n;
            iVar.f27807a = false;
            iVar.b();
        }
        SocketAddress socketAddress = dVar.f37477a.get(dVar.f37478b).f36959a.get(dVar.f37479c);
        if (socketAddress instanceof HttpConnectProxiedSocketAddress) {
            httpConnectProxiedSocketAddress = (HttpConnectProxiedSocketAddress) socketAddress;
            socketAddressC = httpConnectProxiedSocketAddress.c();
        } else {
            socketAddressC = socketAddress;
            httpConnectProxiedSocketAddress = null;
        }
        io.grpc.a aVar = dVar.f37477a.get(dVar.f37478b).f36960b;
        String str = (String) aVar.f36933a.get(io.grpc.d.f36958d);
        InterfaceC2240q.a aVar2 = new InterfaceC2240q.a();
        if (str == null) {
            str = u10.f37449b;
        }
        A8.p.j(str, "authority");
        aVar2.f37659a = str;
        aVar2.f37660b = aVar;
        aVar2.f37661c = httpConnectProxiedSocketAddress;
        f fVar = new f();
        fVar.f37486a = u10.f37448a;
        b bVar = new b(u10.f37452e.Y(socketAddressC, aVar2, fVar), u10.f37455h);
        fVar.f37486a = bVar.e();
        u10.f37466t = bVar;
        u10.f37464r.add(bVar);
        Runnable runnableD = bVar.d(u10.new e(bVar));
        if (runnableD != null) {
            wVar.b(runnableD);
        }
        u10.f37456i.b(ChannelLogger.ChannelLogLevel.f36863c, "Started transport {0}", fVar.f37486a);
    }

    public static String i(Status status) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(status.f36908a);
        String str = status.f36909b;
        if (str != null) {
            B6.c.f(sb2, "(", str, ")");
        }
        Throwable th = status.f36910c;
        if (th != null) {
            sb2.append("[");
            sb2.append(th);
            sb2.append("]");
        }
        return sb2.toString();
    }

    @Override // io.grpc.internal.T0
    public final InterfaceC2239p0 a() {
        InterfaceC2243s interfaceC2243s = this.f37467u;
        if (interfaceC2243s != null) {
            return interfaceC2243s;
        }
        this.j.execute(new W(this));
        return null;
    }

    @Override // D9.q
    public final D9.r e() {
        return this.f37448a;
    }

    public final void h(D9.h hVar) {
        this.j.d();
        if (this.f37468v.f2882a != hVar.f2882a) {
            A8.p.p("Cannot transition out of SHUTDOWN to " + hVar, this.f37468v.f2882a != ConnectivityState.f36871f);
            this.f37468v = hVar;
            this.f37451d.f37390a.a(hVar);
        }
    }

    public final String toString() {
        com.google.common.base.d.a aVarB = com.google.common.base.d.b(this);
        aVarB.b(this.f37448a.f2910c, "logId");
        aVarB.c(this.f37458l, "addressGroups");
        return aVarB.toString();
    }
}
