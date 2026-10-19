package io.grpc.internal;

import io.grpc.ChannelLogger;
import io.grpc.ConnectivityState;
import io.grpc.InternalChannelz$ChannelTrace$Event;
import io.grpc.MethodDescriptor;
import io.grpc.Status;
import io.grpc.internal.A0.b;
import io.grpc.internal.AutoConfiguredLoadBalancerFactory.a;
import io.grpc.internal.G0.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class ManagedChannelImpl extends D9.t implements D9.q<Object> {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final Logger f37275a0 = Logger.getLogger(ManagedChannelImpl.class.getName());

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final Pattern f37276b0 = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final Status f37277c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final Status f37278d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final C2237o0 f37279e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final a f37280f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final c f37281g0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public LinkedHashSet f37282A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Object f37283B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final HashSet f37284C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final C2254z f37285D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final o f37286E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final AtomicBoolean f37287F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f37288G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public volatile boolean f37289H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final CountDownLatch f37290I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.Y f37291J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final C2226j f37292K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final C2230l f37293L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final C2228k f37294M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final D9.p f37295N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final l f37296O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public ResolutionState f37297P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public C2237o0 f37298Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public boolean f37299R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final boolean f37300S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final B0.o f37301T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final long f37302U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final long f37303V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final boolean f37304W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final h f37305X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final d f37306Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final A0 f37307Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D9.r f37308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final io.grpc.p.a f37310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final io.grpc.n.a f37311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AutoConfiguredLoadBalancerFactory f37312e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C2224i f37313f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m f37314g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Executor f37315h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final N0 f37316i;
    public final g j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final g f37317k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final R0.a f37318l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final D9.w f37319m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final D9.l f37320n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final D9.g f37321o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final GrpcUtil.d f37322p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f37323q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C2245t f37324r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final E.a f37325s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final D9.a f37326t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public L f37327u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f37328v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public j f37329w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public volatile io.grpc.i.h f37330x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f37331y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final HashSet f37332z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ResolutionState {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final ResolutionState f37333b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final ResolutionState f37334c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final ResolutionState f37335d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ ResolutionState[] f37336e;

        static {
            ResolutionState resolutionState = new ResolutionState("NO_RESOLUTION", 0);
            f37333b = resolutionState;
            ResolutionState resolutionState2 = new ResolutionState("SUCCESS", 1);
            f37334c = resolutionState2;
            ResolutionState resolutionState3 = new ResolutionState("ERROR", 2);
            f37335d = resolutionState3;
            f37336e = new ResolutionState[]{resolutionState, resolutionState2, resolutionState3};
        }

        public ResolutionState() {
            throw null;
        }

        public static ResolutionState valueOf(String str) {
            return (ResolutionState) Enum.valueOf(ResolutionState.class, str);
        }

        public static ResolutionState[] values() {
            return (ResolutionState[]) f37336e.clone();
        }
    }

    public class a extends io.grpc.f {
        @Override // io.grpc.f
        public final io.grpc.f.a a() {
            throw new IllegalStateException("Resolution is pending");
        }
    }

    public class b implements Thread.UncaughtExceptionHandler {
        public b() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public final void uncaughtException(Thread thread, Throwable th) {
            Logger logger = ManagedChannelImpl.f37275a0;
            Level level = Level.SEVERE;
            StringBuilder sb2 = new StringBuilder("[");
            ManagedChannelImpl managedChannelImpl = ManagedChannelImpl.this;
            sb2.append(managedChannelImpl.f37308a);
            sb2.append("] Uncaught exception in the SynchronizationContext. Panic!");
            logger.log(level, sb2.toString(), th);
            if (managedChannelImpl.f37331y) {
                return;
            }
            managedChannelImpl.f37331y = true;
            A0 a10 = managedChannelImpl.f37307Z;
            a10.f36992f = false;
            ScheduledFuture<?> scheduledFuture = a10.f36993g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                a10.f36993g = null;
            }
            managedChannelImpl.k(false);
            C2225i0 c2225i0 = new C2225i0(th);
            managedChannelImpl.f37330x = c2225i0;
            managedChannelImpl.f37285D.g(c2225i0);
            managedChannelImpl.f37296O.h(null);
            managedChannelImpl.f37294M.a(ChannelLogger.ChannelLogLevel.f36865e, "PANIC! Entering TRANSIENT_FAILURE");
            managedChannelImpl.f37324r.a(ConnectivityState.f36869d);
        }
    }

    public final class d implements C2232m.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile B0.x f37338a;

        public d() {
        }

        public final InterfaceC2238p a(C2250v0 c2250v0) {
            io.grpc.i.h hVar = ManagedChannelImpl.this.f37330x;
            if (ManagedChannelImpl.this.f37287F.get()) {
                return ManagedChannelImpl.this.f37285D;
            }
            if (hVar == null) {
                ManagedChannelImpl.this.f37319m.execute(new RunnableC2227j0(this));
                return ManagedChannelImpl.this.f37285D;
            }
            InterfaceC2238p interfaceC2238pF = GrpcUtil.f(hVar.a(c2250v0), Boolean.TRUE.equals(c2250v0.f37701a.f36942e));
            return interfaceC2238pF != null ? interfaceC2238pF : ManagedChannelImpl.this.f37285D;
        }
    }

    public static final class e<ReqT, RespT> extends D9.n<ReqT, RespT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final io.grpc.f f37340a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l.a f37341b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Executor f37342c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final MethodDescriptor<ReqT, RespT> f37343d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final D9.i f37344e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public io.grpc.b f37345f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public D9.b<ReqT, RespT> f37346g;

        public e(io.grpc.f fVar, l.a aVar, Executor executor, MethodDescriptor methodDescriptor, io.grpc.b bVar) {
            this.f37340a = fVar;
            this.f37341b = aVar;
            this.f37343d = methodDescriptor;
            Executor executor2 = bVar.f36939b;
            executor = executor2 != null ? executor2 : executor;
            this.f37342c = executor;
            io.grpc.b.a aVarB = io.grpc.b.b(bVar);
            aVarB.f36946b = executor;
            this.f37345f = new io.grpc.b(aVarB);
            this.f37344e = D9.i.a();
        }

        @Override // D9.v, D9.b
        public final void a(String str, Throwable th) {
            D9.b<ReqT, RespT> bVar = this.f37346g;
            if (bVar != null) {
                bVar.a(str, th);
            }
        }

        @Override // D9.b
        public final void e(D9.b.a<RespT> aVar, io.grpc.m mVar) {
            io.grpc.b bVar = this.f37345f;
            MethodDescriptor<ReqT, RespT> methodDescriptor = this.f37343d;
            A8.p.j(methodDescriptor, "method");
            A8.p.j(bVar, "callOptions");
            io.grpc.f.a aVarA = this.f37340a.a();
            aVarA.getClass();
            Status status = Status.f36899e;
            if (!status.f()) {
                this.f37342c.execute(new C2231l0(this, aVar, GrpcUtil.h(status)));
                this.f37346g = ManagedChannelImpl.f37281g0;
                return;
            }
            C2237o0 c2237o0 = (C2237o0) aVarA.f36966a;
            c2237o0.getClass();
            C2237o0.a aVar2 = c2237o0.f37646b.get(methodDescriptor.f36887b);
            if (aVar2 == null) {
                aVar2 = c2237o0.f37647c.get(methodDescriptor.f36888c);
            }
            if (aVar2 == null) {
                aVar2 = c2237o0.f37645a;
            }
            if (aVar2 != null) {
                this.f37345f = this.f37345f.c(C2237o0.a.f37651g, aVar2);
            }
            D9.b<ReqT, RespT> bVarF = this.f37341b.f(methodDescriptor, this.f37345f);
            this.f37346g = bVarF;
            bVarF.e(aVar, mVar);
        }

        @Override // D9.v
        public final D9.b<ReqT, RespT> f() {
            return this.f37346g;
        }
    }

    public final class f implements InterfaceC2239p0.a {
        public f() {
        }

        public final void a(boolean z10) {
            ManagedChannelImpl managedChannelImpl = ManagedChannelImpl.this;
            managedChannelImpl.f37305X.G(managedChannelImpl.f37285D, z10);
        }
    }

    public static final class g implements Executor {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final N0 f37348b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Executor f37349c;

        public g(N0 n10) {
            A8.p.j(n10, "executorPool");
            this.f37348b = n10;
        }

        public final synchronized void a() {
            Executor executor = this.f37349c;
            if (executor != null) {
                this.f37348b.a(executor);
                this.f37349c = null;
            }
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            Executor executor;
            synchronized (this) {
                try {
                    if (this.f37349c == null) {
                        Executor executor2 = (Executor) L0.a(this.f37348b.f37425a);
                        Executor executor3 = this.f37349c;
                        if (executor2 == null) {
                            throw new NullPointerException(A8.A.h("%s.getObject()", executor3));
                        }
                        this.f37349c = executor2;
                    }
                    executor = this.f37349c;
                } catch (Throwable th) {
                    throw th;
                }
            }
            executor.execute(runnable);
        }
    }

    public final class h extends E3.b {
        public h() {
            super(4);
        }

        @Override // E3.b
        public final void A() {
            ManagedChannelImpl.this.h();
        }

        @Override // E3.b
        public final void C() {
            ManagedChannelImpl managedChannelImpl = ManagedChannelImpl.this;
            if (managedChannelImpl.f37287F.get()) {
                return;
            }
            managedChannelImpl.j();
        }
    }

    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ManagedChannelImpl managedChannelImpl = ManagedChannelImpl.this;
            if (managedChannelImpl.f37329w == null) {
                return;
            }
            managedChannelImpl.k(true);
            C2254z c2254z = managedChannelImpl.f37285D;
            c2254z.g(null);
            managedChannelImpl.f37294M.a(ChannelLogger.ChannelLogLevel.f36863c, "Entering IDLE state");
            managedChannelImpl.f37324r.a(ConnectivityState.f36870e);
            Object[] objArr = {managedChannelImpl.f37283B, c2254z};
            h hVar = managedChannelImpl.f37305X;
            hVar.getClass();
            for (int i10 = 0; i10 < 2; i10++) {
                if (((Set) hVar.f3048c).contains(objArr[i10])) {
                    managedChannelImpl.h();
                    return;
                }
            }
        }
    }

    public final class j extends io.grpc.i.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public AutoConfiguredLoadBalancerFactory.a f37352a;

        public final class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ManagedChannelImpl managedChannelImpl = ManagedChannelImpl.this;
                managedChannelImpl.f37319m.d();
                if (managedChannelImpl.f37328v) {
                    managedChannelImpl.f37327u.b();
                }
            }
        }

        public final class b implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ io.grpc.i.h f37355b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ConnectivityState f37356c;

            public b(io.grpc.i.h hVar, ConnectivityState connectivityState) {
                this.f37355b = hVar;
                this.f37356c = connectivityState;
            }

            @Override // java.lang.Runnable
            public final void run() {
                j jVar = j.this;
                ManagedChannelImpl managedChannelImpl = ManagedChannelImpl.this;
                if (jVar != managedChannelImpl.f37329w) {
                    return;
                }
                io.grpc.i.h hVar = this.f37355b;
                managedChannelImpl.f37330x = hVar;
                managedChannelImpl.f37285D.g(hVar);
                ConnectivityState connectivityState = ConnectivityState.f36871f;
                ConnectivityState connectivityState2 = this.f37356c;
                if (connectivityState2 != connectivityState) {
                    ManagedChannelImpl.this.f37294M.b(ChannelLogger.ChannelLogLevel.f36863c, "Entering {0} state with picker: {1}", connectivityState2, hVar);
                    ManagedChannelImpl.this.f37324r.a(connectivityState2);
                }
            }
        }

        public j() {
        }

        @Override // io.grpc.i.c
        public final io.grpc.i.g a(io.grpc.i.a aVar) {
            ManagedChannelImpl managedChannelImpl = ManagedChannelImpl.this;
            managedChannelImpl.f37319m.d();
            A8.p.p("Channel is being terminated", !managedChannelImpl.f37288G);
            return managedChannelImpl.new n(aVar);
        }

        @Override // io.grpc.i.c
        public final ChannelLogger b() {
            return ManagedChannelImpl.this.f37294M;
        }

        @Override // io.grpc.i.c
        public final ScheduledExecutorService c() {
            return ManagedChannelImpl.this.f37314g;
        }

        @Override // io.grpc.i.c
        public final D9.w d() {
            return ManagedChannelImpl.this.f37319m;
        }

        @Override // io.grpc.i.c
        public final void e() {
            ManagedChannelImpl managedChannelImpl = ManagedChannelImpl.this;
            managedChannelImpl.f37319m.d();
            managedChannelImpl.f37319m.execute(new a());
        }

        @Override // io.grpc.i.c
        public final void f(ConnectivityState connectivityState, io.grpc.i.h hVar) {
            ManagedChannelImpl managedChannelImpl = ManagedChannelImpl.this;
            managedChannelImpl.f37319m.d();
            A8.p.j(connectivityState, "newState");
            A8.p.j(hVar, "newPicker");
            managedChannelImpl.f37319m.execute(new b(hVar, connectivityState));
        }
    }

    public final class k extends io.grpc.n.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f37358a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final L f37359b;

        public final class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Status f37361b;

            public a(Status status) {
                this.f37361b = status;
            }

            @Override // java.lang.Runnable
            public final void run() {
                k kVar = k.this;
                kVar.getClass();
                Logger logger = ManagedChannelImpl.f37275a0;
                Level level = Level.WARNING;
                ManagedChannelImpl managedChannelImpl = ManagedChannelImpl.this;
                D9.r rVar = managedChannelImpl.f37308a;
                Status status = this.f37361b;
                logger.log(level, "[{0}] Failed to resolve name. status={1}", new Object[]{rVar, status});
                l lVar = managedChannelImpl.f37296O;
                if (lVar.f37365a.get() == ManagedChannelImpl.f37280f0) {
                    lVar.h(null);
                }
                ResolutionState resolutionState = managedChannelImpl.f37297P;
                ResolutionState resolutionState2 = ResolutionState.f37335d;
                if (resolutionState != resolutionState2) {
                    managedChannelImpl.f37294M.b(ChannelLogger.ChannelLogLevel.f36864d, "Failed to resolve name: {0}", status);
                    managedChannelImpl.f37297P = resolutionState2;
                }
                j jVar = managedChannelImpl.f37329w;
                j jVar2 = kVar.f37358a;
                if (jVar2 != jVar) {
                    return;
                }
                jVar2.f37352a.f36999b.c(status);
            }
        }

        public final class b implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ io.grpc.n.f f37363b;

            public b(io.grpc.n.f fVar) {
                this.f37363b = fVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C2237o0 c2237o0;
                Object obj;
                k kVar = k.this;
                ManagedChannelImpl managedChannelImpl = ManagedChannelImpl.this;
                if (managedChannelImpl.f37327u != kVar.f37359b) {
                    return;
                }
                io.grpc.n.f fVar = this.f37363b;
                List<io.grpc.d> list = fVar.f37800a;
                C2228k c2228k = managedChannelImpl.f37294M;
                ChannelLogger.ChannelLogLevel channelLogLevel = ChannelLogger.ChannelLogLevel.f36862b;
                c2228k.b(channelLogLevel, "Resolved address: {0}, config={1}", list, fVar.f37801b);
                ManagedChannelImpl managedChannelImpl2 = ManagedChannelImpl.this;
                ResolutionState resolutionState = managedChannelImpl2.f37297P;
                ResolutionState resolutionState2 = ResolutionState.f37334c;
                ChannelLogger.ChannelLogLevel channelLogLevel2 = ChannelLogger.ChannelLogLevel.f36863c;
                if (resolutionState != resolutionState2) {
                    managedChannelImpl2.f37294M.b(channelLogLevel2, "Address resolved: {0}", list);
                    ManagedChannelImpl.this.f37297P = resolutionState2;
                }
                io.grpc.n.f fVar2 = this.f37363b;
                io.grpc.n.b bVar = fVar2.f37802c;
                G0.b bVar2 = (G0.b) fVar2.f37801b.f36933a.get(G0.f37192d);
                io.grpc.a aVar = this.f37363b.f37801b;
                io.grpc.a.b<io.grpc.f> bVar3 = io.grpc.f.f36965a;
                io.grpc.f fVar3 = (io.grpc.f) aVar.f36933a.get(bVar3);
                C2237o0 c2237o1 = (bVar == null || (obj = bVar.f37799b) == null) ? null : (C2237o0) obj;
                Status status = bVar != null ? bVar.f37798a : null;
                ManagedChannelImpl managedChannelImpl3 = ManagedChannelImpl.this;
                boolean zA = true;
                if (managedChannelImpl3.f37300S) {
                    if (c2237o1 != null) {
                        if (fVar3 != null) {
                            managedChannelImpl3.f37296O.h(fVar3);
                            if (c2237o1.b() != null) {
                                ManagedChannelImpl.this.f37294M.a(channelLogLevel, "Method configs in service config will be discarded due to presence ofconfig-selector");
                            }
                        } else {
                            managedChannelImpl3.f37296O.h(c2237o1.b());
                        }
                    } else if (status == null) {
                        c2237o1 = ManagedChannelImpl.f37279e0;
                        managedChannelImpl3.f37296O.h(null);
                    } else {
                        if (!managedChannelImpl3.f37299R) {
                            managedChannelImpl3.f37294M.a(channelLogLevel2, "Fallback to error due to invalid first service config without default config");
                            k.this.a(bVar.f37798a);
                            if (bVar2 != null) {
                                G0 g10 = G0.this;
                                g10.f37193b.a(g10.new a());
                                return;
                            }
                            return;
                        }
                        c2237o1 = managedChannelImpl3.f37298Q;
                    }
                    if (!c2237o1.equals(ManagedChannelImpl.this.f37298Q)) {
                        ManagedChannelImpl.this.f37294M.b(channelLogLevel2, "Service config changed{0}", c2237o1 == ManagedChannelImpl.f37279e0 ? " to empty" : "");
                        ManagedChannelImpl managedChannelImpl4 = ManagedChannelImpl.this;
                        managedChannelImpl4.f37298Q = c2237o1;
                        managedChannelImpl4.f37306Y.f37338a = c2237o1.f37648d;
                    }
                    try {
                        ManagedChannelImpl.this.f37299R = true;
                    } catch (RuntimeException e10) {
                        ManagedChannelImpl.f37275a0.log(Level.WARNING, "[" + ManagedChannelImpl.this.f37308a + "] Unexpected exception from parsing service config", (Throwable) e10);
                    }
                    c2237o0 = c2237o1;
                } else {
                    if (c2237o1 != null) {
                        managedChannelImpl3.f37294M.a(channelLogLevel2, "Service config from name resolver discarded by channel settings");
                    }
                    ManagedChannelImpl.this.getClass();
                    c2237o0 = ManagedChannelImpl.f37279e0;
                    if (fVar3 != null) {
                        ManagedChannelImpl.this.f37294M.a(channelLogLevel2, "Config selector from name resolver discarded by channel settings");
                    }
                    ManagedChannelImpl.this.f37296O.h(c2237o0.b());
                }
                io.grpc.a aVar2 = this.f37363b.f37801b;
                k kVar2 = k.this;
                if (kVar2.f37358a == ManagedChannelImpl.this.f37329w) {
                    aVar2.getClass();
                    io.grpc.a.C0387a c0387a = new io.grpc.a.C0387a(aVar2);
                    if (c0387a.f36934a.f36933a.containsKey(bVar3)) {
                        IdentityHashMap identityHashMap = new IdentityHashMap(c0387a.f36934a.f36933a);
                        identityHashMap.remove(bVar3);
                        c0387a.f36934a = new io.grpc.a(identityHashMap);
                    }
                    IdentityHashMap<io.grpc.a.b<?>, Object> identityHashMap2 = c0387a.f36935b;
                    if (identityHashMap2 != null) {
                        identityHashMap2.remove(bVar3);
                    }
                    Map<String, ?> map = c2237o0.f37650f;
                    if (map != null) {
                        c0387a.b(io.grpc.i.f36970b, map);
                        c0387a.a();
                    }
                    io.grpc.a aVarA = c0387a.a();
                    AutoConfiguredLoadBalancerFactory.a aVar3 = k.this.f37358a.f37352a;
                    io.grpc.a aVar4 = io.grpc.a.f36932b;
                    Object obj2 = c2237o0.f37649e;
                    A8.p.j(list, "addresses");
                    List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list));
                    A8.p.j(aVarA, "attributes");
                    aVar3.getClass();
                    K0.b bVar4 = (K0.b) obj2;
                    j jVar = aVar3.f36998a;
                    if (bVar4 == null) {
                        try {
                            AutoConfiguredLoadBalancerFactory autoConfiguredLoadBalancerFactory = AutoConfiguredLoadBalancerFactory.this;
                            String str = autoConfiguredLoadBalancerFactory.f36997b;
                            io.grpc.j jVarB = autoConfiguredLoadBalancerFactory.f36996a.b(str);
                            if (jVarB == null) {
                                throw new AutoConfiguredLoadBalancerFactory.PolicyException("Trying to load '" + str + "' because using default policy, but it's unavailable");
                            }
                            bVar4 = new K0.b(jVarB, null);
                        } catch (AutoConfiguredLoadBalancerFactory.PolicyException e11) {
                            jVar.f(ConnectivityState.f36869d, new AutoConfiguredLoadBalancerFactory.c(Status.f36904k.h(e11.getMessage())));
                            aVar3.f36999b.e();
                            aVar3.f37000c = null;
                            aVar3.f36999b = new AutoConfiguredLoadBalancerFactory.d();
                        }
                    }
                    io.grpc.j jVar2 = aVar3.f37000c;
                    io.grpc.j jVar3 = bVar4.f37242a;
                    if (jVar2 == null || !jVar3.b().equals(aVar3.f37000c.b())) {
                        jVar.f(ConnectivityState.f36867b, new AutoConfiguredLoadBalancerFactory.b());
                        aVar3.f36999b.e();
                        aVar3.f37000c = jVar3;
                        io.grpc.i iVar = aVar3.f36999b;
                        aVar3.f36999b = jVar3.a(jVar);
                        ManagedChannelImpl.this.f37294M.b(channelLogLevel2, "Load balancer changed from {0} to {1}", iVar.getClass().getSimpleName(), aVar3.f36999b.getClass().getSimpleName());
                    }
                    Object obj3 = bVar4.f37243b;
                    if (obj3 != null) {
                        ManagedChannelImpl.this.f37294M.b(channelLogLevel, "Load-balancing config: {0}", obj3);
                    }
                    zA = aVar3.f36999b.a(new io.grpc.i.f(listUnmodifiableList, aVarA, obj3));
                    if (bVar2 != null) {
                        G0 g11 = G0.this;
                        if (!zA) {
                            g11.f37193b.a(g11.new a());
                            return;
                        }
                        C2222h c2222h = g11.f37193b;
                        D9.w wVar = c2222h.f37549b;
                        wVar.d();
                        wVar.execute(new N5.d(2, c2222h));
                    }
                }
            }
        }

        public k(j jVar, L l10) {
            this.f37358a = jVar;
            A8.p.j(l10, "resolver");
            this.f37359b = l10;
        }

        @Override // io.grpc.n.e
        public final void a(Status status) {
            A8.p.f("the error status must not be OK", !status.f());
            ManagedChannelImpl.this.f37319m.execute(new a(status));
        }

        @Override // io.grpc.n.d
        public final void b(io.grpc.n.f fVar) {
            ManagedChannelImpl.this.f37319m.execute(new b(fVar));
        }
    }

    public static final class m implements ScheduledExecutorService {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ScheduledExecutorService f37380b;

        public m(ScheduledExecutorService scheduledExecutorService) {
            A8.p.j(scheduledExecutorService, "delegate");
            this.f37380b = scheduledExecutorService;
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
            return this.f37380b.awaitTermination(j, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f37380b.execute(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
            return this.f37380b.invokeAll(collection);
        }

        @Override // java.util.concurrent.ExecutorService
        public final <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
            return (T) this.f37380b.invokeAny(collection);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
            return this.f37380b.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() {
            return this.f37380b.isTerminated();
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public final <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
            return this.f37380b.schedule(callable, j, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public final ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j10, TimeUnit timeUnit) {
            return this.f37380b.scheduleAtFixedRate(runnable, j, j10, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public final ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j10, TimeUnit timeUnit) {
            return this.f37380b.scheduleWithFixedDelay(runnable, j, j10, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
            throw new UnsupportedOperationException("Restricted: shutdown() is not allowed");
        }

        @Override // java.util.concurrent.ExecutorService
        public final List<Runnable> shutdownNow() {
            throw new UnsupportedOperationException("Restricted: shutdownNow() is not allowed");
        }

        @Override // java.util.concurrent.ExecutorService
        public final <T> Future<T> submit(Callable<T> callable) {
            return this.f37380b.submit(callable);
        }

        @Override // java.util.concurrent.ExecutorService
        public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
            return this.f37380b.invokeAll(collection, j, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return (T) this.f37380b.invokeAny(collection, j, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public final ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            return this.f37380b.schedule(runnable, j, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public final Future<?> submit(Runnable runnable) {
            return this.f37380b.submit(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public final <T> Future<T> submit(Runnable runnable, T t8) {
            return this.f37380b.submit(runnable, t8);
        }
    }

    public final class n extends AbstractC2218f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final io.grpc.i.a f37381a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final D9.r f37382b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C2228k f37383c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final C2230l f37384d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public List<io.grpc.d> f37385e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public U f37386f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f37387g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f37388h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public D9.w.c f37389i;

        public final class a extends U.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ io.grpc.i.InterfaceC0390i f37390a;

            public a(io.grpc.i.InterfaceC0390i interfaceC0390i) {
                this.f37390a = interfaceC0390i;
            }
        }

        public final class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                U u10 = n.this.f37386f;
                Status status = ManagedChannelImpl.f37278d0;
                u10.getClass();
                u10.j.execute(new Y(u10, status));
            }
        }

        public n(io.grpc.i.a aVar) {
            List<io.grpc.d> list = aVar.f36972a;
            this.f37385e = list;
            ManagedChannelImpl.this.getClass();
            this.f37381a = aVar;
            D9.r rVar = new D9.r("Subchannel", ManagedChannelImpl.this.f37326t.a(), D9.r.f2907d.incrementAndGet());
            this.f37382b = rVar;
            R0.a aVar2 = ManagedChannelImpl.this.f37318l;
            C2230l c2230l = new C2230l(rVar, aVar2.a(), "Subchannel for " + list);
            this.f37384d = c2230l;
            this.f37383c = new C2228k(c2230l, aVar2);
        }

        @Override // io.grpc.i.g
        public final List<io.grpc.d> b() {
            ManagedChannelImpl.this.f37319m.d();
            A8.p.p("not started", this.f37387g);
            return this.f37385e;
        }

        @Override // io.grpc.i.g
        public final io.grpc.a c() {
            return this.f37381a.f36973b;
        }

        @Override // io.grpc.i.g
        public final ChannelLogger d() {
            return this.f37383c;
        }

        @Override // io.grpc.i.g
        public final Object e() {
            A8.p.p("Subchannel is not started", this.f37387g);
            return this.f37386f;
        }

        @Override // io.grpc.i.g
        public final void f() {
            ManagedChannelImpl.this.f37319m.d();
            A8.p.p("not started", this.f37387g);
            this.f37386f.a();
        }

        @Override // io.grpc.i.g
        public final void g() {
            D9.w.c cVar;
            ManagedChannelImpl managedChannelImpl = ManagedChannelImpl.this;
            managedChannelImpl.f37319m.d();
            if (this.f37386f == null) {
                this.f37388h = true;
                return;
            }
            if (!this.f37388h) {
                this.f37388h = true;
            } else {
                if (!managedChannelImpl.f37288G || (cVar = this.f37389i) == null) {
                    return;
                }
                cVar.a();
                this.f37389i = null;
            }
            if (!managedChannelImpl.f37288G) {
                this.f37389i = managedChannelImpl.f37319m.c(new RunnableC2221g0(new b()), 5L, TimeUnit.SECONDS, managedChannelImpl.f37313f.f37553b.G0());
                return;
            }
            U u10 = this.f37386f;
            Status status = ManagedChannelImpl.f37277c0;
            u10.getClass();
            u10.j.execute(new Y(u10, status));
        }

        @Override // io.grpc.i.g
        public final void h(io.grpc.i.InterfaceC0390i interfaceC0390i) {
            ManagedChannelImpl managedChannelImpl = ManagedChannelImpl.this;
            managedChannelImpl.f37319m.d();
            A8.p.p("already started", !this.f37387g);
            A8.p.p("already shutdown", !this.f37388h);
            A8.p.p("Channel is being terminated", !managedChannelImpl.f37288G);
            this.f37387g = true;
            List<io.grpc.d> list = this.f37381a.f36972a;
            String strA = managedChannelImpl.f37326t.a();
            C2224i c2224i = managedChannelImpl.f37313f;
            ScheduledExecutorService scheduledExecutorServiceG0 = c2224i.f37553b.G0();
            a aVar = new a(interfaceC0390i);
            managedChannelImpl.f37291J.getClass();
            U u10 = new U(list, strA, managedChannelImpl.f37325s, c2224i, scheduledExecutorServiceG0, managedChannelImpl.f37322p, managedChannelImpl.f37319m, aVar, managedChannelImpl.f37295N, new C2226j(), this.f37384d, this.f37382b, this.f37383c);
            managedChannelImpl.f37293L.b(new InternalChannelz$ChannelTrace$Event("Child Subchannel started", InternalChannelz$ChannelTrace$Event.Severity.f36878b, managedChannelImpl.f37318l.a(), u10));
            this.f37386f = u10;
            managedChannelImpl.f37332z.add(u10);
        }

        @Override // io.grpc.i.g
        public final void i(List<io.grpc.d> list) {
            ManagedChannelImpl.this.f37319m.d();
            this.f37385e = list;
            U u10 = this.f37386f;
            u10.getClass();
            A8.p.j(list, "newAddressGroups");
            Iterator<io.grpc.d> it = list.iterator();
            while (it.hasNext()) {
                A8.p.j(it.next(), "newAddressGroups contains null entry");
            }
            A8.p.f("newAddressGroups is empty", !list.isEmpty());
            u10.j.execute(new X(u10, Collections.unmodifiableList(new ArrayList(list))));
        }

        public final String toString() {
            return this.f37382b.toString();
        }
    }

    public final class o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f37393a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public HashSet f37394b = new HashSet();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Status f37395c;

        public o() {
        }
    }

    static {
        Status status = Status.f36905l;
        status.h("Channel shutdownNow invoked");
        f37277c0 = status.h("Channel shutdown invoked");
        f37278d0 = status.h("Subchannel shutdown invoked");
        f37279e0 = new C2237o0(null, new HashMap(), new HashMap(), null, null, null);
        f37280f0 = new a();
        f37281g0 = new c();
    }

    public ManagedChannelImpl(C2233m0 c2233m0, InterfaceC2240q interfaceC2240q, E.a aVar, N0 n10, GrpcUtil.d dVar, ArrayList arrayList) {
        R0.a aVar2 = R0.f37437a;
        D9.w wVar = new D9.w(new b());
        this.f37319m = wVar;
        C2245t c2245t = new C2245t();
        c2245t.f37696a = new ArrayList<>();
        c2245t.f37697b = ConnectivityState.f36870e;
        this.f37324r = c2245t;
        this.f37332z = new HashSet(16, 0.75f);
        this.f37283B = new Object();
        this.f37284C = new HashSet(1, 0.75f);
        this.f37286E = new o();
        this.f37287F = new AtomicBoolean(false);
        this.f37290I = new CountDownLatch(1);
        this.f37297P = ResolutionState.f37333b;
        this.f37298Q = f37279e0;
        this.f37299R = false;
        this.f37301T = new B0.o();
        f fVar = new f();
        this.f37305X = new h();
        this.f37306Y = new d();
        String str = c2233m0.f37614e;
        A8.p.j(str, "target");
        this.f37309b = str;
        D9.r rVar = new D9.r("Channel", str, D9.r.f2907d.incrementAndGet());
        this.f37308a = rVar;
        this.f37318l = aVar2;
        N0 n11 = c2233m0.f37610a;
        A8.p.j(n11, "executorPool");
        this.f37316i = n11;
        Executor executor = (Executor) L0.a(n11.f37425a);
        A8.p.j(executor, "executor");
        this.f37315h = executor;
        N0 n12 = c2233m0.f37611b;
        A8.p.j(n12, "offloadExecutorPool");
        g gVar = new g(n12);
        this.f37317k = gVar;
        C2224i c2224i = new C2224i(interfaceC2240q, gVar);
        this.f37313f = c2224i;
        m mVar = new m(c2224i.f37553b.G0());
        this.f37314g = mVar;
        C2230l c2230l = new C2230l(rVar, aVar2.a(), androidx.compose.foundation.gestures.d.b("Channel for '", str, "'"));
        this.f37293L = c2230l;
        C2228k c2228k = new C2228k(c2230l, aVar2);
        this.f37294M = c2228k;
        w0 w0Var = GrpcUtil.f37210m;
        boolean z10 = c2233m0.f37622n;
        this.f37304W = z10;
        AutoConfiguredLoadBalancerFactory autoConfiguredLoadBalancerFactory = new AutoConfiguredLoadBalancerFactory(c2233m0.f37615f);
        this.f37312e = autoConfiguredLoadBalancerFactory;
        H0 h8 = new H0(z10, c2233m0.j, c2233m0.f37619k, autoConfiguredLoadBalancerFactory);
        Integer numValueOf = Integer.valueOf(c2233m0.f37631w.a());
        w0Var.getClass();
        io.grpc.n.a aVar3 = new io.grpc.n.a(numValueOf, w0Var, wVar, h8, mVar, c2228k, gVar);
        this.f37311d = aVar3;
        io.grpc.p.a aVar4 = c2233m0.f37613d;
        this.f37310c = aVar4;
        this.f37327u = i(str, aVar4, aVar3);
        this.j = new g(n10);
        C2254z c2254z = new C2254z(executor, wVar);
        this.f37285D = c2254z;
        c2254z.d(fVar);
        this.f37325s = aVar;
        boolean z11 = c2233m0.f37624p;
        this.f37300S = z11;
        l lVar = new l(this.f37327u.a());
        this.f37296O = lVar;
        int i10 = D9.d.f2876a;
        Iterator it = arrayList.iterator();
        D9.a bVar = lVar;
        while (it.hasNext()) {
            bVar = new D9.d.b(bVar, (D9.c) it.next());
        }
        this.f37326t = bVar;
        A8.p.j(dVar, "stopwatchSupplier");
        this.f37322p = dVar;
        long j10 = c2233m0.f37618i;
        if (j10 == -1) {
            this.f37323q = j10;
        } else {
            A8.p.d(j10, "invalid idleTimeoutMillis %s", j10 >= C2233m0.f37609z);
            this.f37323q = c2233m0.f37618i;
        }
        this.f37307Z = new A0(new i(), wVar, c2224i.f37553b.G0(), new com.google.common.base.i());
        D9.l lVar2 = c2233m0.f37616g;
        A8.p.j(lVar2, "decompressorRegistry");
        this.f37320n = lVar2;
        D9.g gVar2 = c2233m0.f37617h;
        A8.p.j(gVar2, "compressorRegistry");
        this.f37321o = gVar2;
        this.f37303V = c2233m0.f37620l;
        this.f37302U = c2233m0.f37621m;
        this.f37291J = new com.google.android.gms.internal.measurement.Y(13);
        this.f37292K = new C2226j();
        D9.p pVar = c2233m0.f37623o;
        pVar.getClass();
        this.f37295N = pVar;
        if (z11) {
            return;
        }
        this.f37299R = true;
    }

    public static void g(ManagedChannelImpl managedChannelImpl) {
        if (!managedChannelImpl.f37289H && managedChannelImpl.f37287F.get() && managedChannelImpl.f37332z.isEmpty() && managedChannelImpl.f37284C.isEmpty()) {
            managedChannelImpl.f37294M.a(ChannelLogger.ChannelLogLevel.f36863c, "Terminated");
            managedChannelImpl.f37316i.a(managedChannelImpl.f37315h);
            managedChannelImpl.j.a();
            managedChannelImpl.f37317k.a();
            managedChannelImpl.f37313f.close();
            managedChannelImpl.f37289H = true;
            managedChannelImpl.f37290I.countDown();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        if (r3 != null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static io.grpc.internal.L i(java.lang.String r7, io.grpc.p.a r8, io.grpc.n.a r9) {
        /*
            java.lang.String r0 = "/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 0
            java.net.URI r3 = new java.net.URI     // Catch: java.net.URISyntaxException -> Le
            r3.<init>(r7)     // Catch: java.net.URISyntaxException -> Le
            goto L17
        Le:
            r3 = move-exception
            java.lang.String r3 = r3.getMessage()
            r1.append(r3)
            r3 = r2
        L17:
            if (r3 == 0) goto L20
            io.grpc.n r3 = r8.b(r3, r9)
            if (r3 == 0) goto L20
            goto L49
        L20:
            java.util.regex.Pattern r3 = io.grpc.internal.ManagedChannelImpl.f37276b0
            java.util.regex.Matcher r3 = r3.matcher(r7)
            boolean r3 = r3.matches()
            java.lang.String r4 = ""
            if (r3 != 0) goto L6e
            java.net.URI r3 = new java.net.URI     // Catch: java.net.URISyntaxException -> L67
            java.lang.String r5 = r8.a()     // Catch: java.net.URISyntaxException -> L67
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.net.URISyntaxException -> L67
            r6.<init>(r0)     // Catch: java.net.URISyntaxException -> L67
            r6.append(r7)     // Catch: java.net.URISyntaxException -> L67
            java.lang.String r0 = r6.toString()     // Catch: java.net.URISyntaxException -> L67
            r3.<init>(r5, r4, r0, r2)     // Catch: java.net.URISyntaxException -> L67
            io.grpc.n r3 = r8.b(r3, r9)
            if (r3 == 0) goto L6e
        L49:
            io.grpc.internal.G0 r7 = new io.grpc.internal.G0
            io.grpc.internal.h r8 = new io.grpc.internal.h
            io.grpc.internal.E$a r0 = new io.grpc.internal.E$a
            r0.<init>()
            io.grpc.internal.ManagedChannelImpl$m r1 = r9.f37795e
            if (r1 == 0) goto L5f
            D9.w r9 = r9.f37793c
            r8.<init>(r0, r1, r9)
            r7.<init>(r3, r8, r9)
            return r7
        L5f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "ScheduledExecutorService not set in Builder"
            r7.<init>(r8)
            throw r7
        L67:
            r7 = move-exception
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r7)
            throw r8
        L6e:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            int r9 = r1.length()
            if (r9 <= 0) goto L89
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = " ("
            r9.<init>(r0)
            r9.append(r1)
            java.lang.String r0 = ")"
            r9.append(r0)
            java.lang.String r4 = r9.toString()
        L89:
            java.lang.String r9 = "cannot find a NameResolver for "
            java.lang.String r7 = androidx.compose.foundation.gestures.d.b(r9, r7, r4)
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.ManagedChannelImpl.i(java.lang.String, io.grpc.p$a, io.grpc.n$a):io.grpc.internal.L");
    }

    @Override // D9.a
    public final String a() {
        return this.f37326t.a();
    }

    @Override // D9.q
    public final D9.r e() {
        return this.f37308a;
    }

    @Override // D9.a
    public final <ReqT, RespT> D9.b<ReqT, RespT> f(MethodDescriptor<ReqT, RespT> methodDescriptor, io.grpc.b bVar) {
        return this.f37326t.f(methodDescriptor, bVar);
    }

    public final void h() {
        this.f37319m.d();
        if (this.f37287F.get() || this.f37331y) {
            return;
        }
        if (((Set) this.f37305X.f3048c).isEmpty()) {
            j();
        } else {
            this.f37307Z.f36992f = false;
        }
        if (this.f37329w != null) {
            return;
        }
        this.f37294M.a(ChannelLogger.ChannelLogLevel.f36863c, "Exiting idle mode");
        j jVar = new j();
        AutoConfiguredLoadBalancerFactory autoConfiguredLoadBalancerFactory = this.f37312e;
        autoConfiguredLoadBalancerFactory.getClass();
        jVar.f37352a = autoConfiguredLoadBalancerFactory.new a(jVar);
        this.f37329w = jVar;
        this.f37327u.d(new k(jVar, this.f37327u));
        this.f37328v = true;
    }

    public final void j() {
        long j10 = this.f37323q;
        if (j10 == -1) {
            return;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        A0 a10 = this.f37307Z;
        a10.getClass();
        long nanos = timeUnit.toNanos(j10);
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long jA = a10.f36990d.a(timeUnit2) + nanos;
        a10.f36992f = true;
        if (jA - a10.f36991e < 0 || a10.f36993g == null) {
            ScheduledFuture<?> scheduledFuture = a10.f36993g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            a10.f36993g = a10.f36987a.schedule(a10.new b(), nanos, timeUnit2);
        }
        a10.f36991e = jA;
    }

    public final void k(boolean z10) {
        this.f37319m.d();
        if (z10) {
            A8.p.p("nameResolver is not started", this.f37328v);
            A8.p.p("lbHelper is null", this.f37329w != null);
        }
        L l10 = this.f37327u;
        if (l10 != null) {
            l10.c();
            this.f37328v = false;
            if (z10) {
                this.f37327u = i(this.f37309b, this.f37310c, this.f37311d);
            } else {
                this.f37327u = null;
            }
        }
        j jVar = this.f37329w;
        if (jVar != null) {
            AutoConfiguredLoadBalancerFactory.a aVar = jVar.f37352a;
            aVar.f36999b.e();
            aVar.f36999b = null;
            this.f37329w = null;
        }
        this.f37330x = null;
    }

    public final String toString() {
        com.google.common.base.d.a aVarB = com.google.common.base.d.b(this);
        aVarB.b(this.f37308a.f2910c, "logId");
        aVarB.c(this.f37309b, "target");
        return aVarB.toString();
    }

    public class l extends D9.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f37366b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicReference<io.grpc.f> f37365a = new AtomicReference<>(ManagedChannelImpl.f37280f0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f37367c = new a();

        public class a extends D9.a {
            public a() {
            }

            @Override // D9.a
            public final String a() {
                return l.this.f37366b;
            }

            @Override // D9.a
            public final <RequestT, ResponseT> D9.b<RequestT, ResponseT> f(MethodDescriptor<RequestT, ResponseT> methodDescriptor, io.grpc.b bVar) {
                ManagedChannelImpl managedChannelImpl = ManagedChannelImpl.this;
                Logger logger = ManagedChannelImpl.f37275a0;
                managedChannelImpl.getClass();
                Executor executor = bVar.f36939b;
                Executor executor2 = executor == null ? managedChannelImpl.f37315h : executor;
                ManagedChannelImpl managedChannelImpl2 = ManagedChannelImpl.this;
                C2232m c2232m = new C2232m(methodDescriptor, executor2, bVar, managedChannelImpl2.f37306Y, managedChannelImpl2.f37289H ? null : ManagedChannelImpl.this.f37313f.f37553b.G0(), ManagedChannelImpl.this.f37292K);
                ManagedChannelImpl.this.getClass();
                c2232m.f37593q = ManagedChannelImpl.this.f37320n;
                return c2232m;
            }
        }

        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ManagedChannelImpl.this.h();
            }
        }

        public class d implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f37371b;

            public d(e eVar) {
                this.f37371b = eVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                l lVar = l.this;
                io.grpc.f fVar = lVar.f37365a.get();
                a aVar = ManagedChannelImpl.f37280f0;
                e eVar = this.f37371b;
                if (fVar != aVar) {
                    eVar.j();
                    return;
                }
                ManagedChannelImpl managedChannelImpl = ManagedChannelImpl.this;
                if (managedChannelImpl.f37282A == null) {
                    managedChannelImpl.f37282A = new LinkedHashSet();
                    managedChannelImpl.f37305X.G(managedChannelImpl.f37283B, true);
                }
                managedChannelImpl.f37282A.add(eVar);
            }
        }

        public final class e<ReqT, RespT> extends C2251w<ReqT, RespT> {

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public final D9.i f37373k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public final MethodDescriptor<ReqT, RespT> f37374l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public final io.grpc.b f37375m;

            public class a implements Runnable {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C2249v f37377b;

                public a(C2249v c2249v) {
                    this.f37377b = c2249v;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f37377b.run();
                    e eVar = e.this;
                    ManagedChannelImpl.this.f37319m.execute(new b());
                }
            }

            public final class b implements Runnable {
                public b() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    e eVar = e.this;
                    LinkedHashSet linkedHashSet = ManagedChannelImpl.this.f37282A;
                    if (linkedHashSet != null) {
                        linkedHashSet.remove(eVar);
                        if (ManagedChannelImpl.this.f37282A.isEmpty()) {
                            ManagedChannelImpl managedChannelImpl = ManagedChannelImpl.this;
                            managedChannelImpl.f37305X.G(managedChannelImpl.f37283B, false);
                            ManagedChannelImpl managedChannelImpl2 = ManagedChannelImpl.this;
                            managedChannelImpl2.f37282A = null;
                            if (managedChannelImpl2.f37287F.get()) {
                                o oVar = ManagedChannelImpl.this.f37286E;
                                Status status = ManagedChannelImpl.f37277c0;
                                synchronized (oVar.f37393a) {
                                    try {
                                        if (oVar.f37395c == null) {
                                            oVar.f37395c = status;
                                            boolean zIsEmpty = oVar.f37394b.isEmpty();
                                            if (zIsEmpty) {
                                                ManagedChannelImpl.this.f37285D.c(status);
                                            }
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                        }
                    }
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public e(D9.i iVar, MethodDescriptor<ReqT, RespT> methodDescriptor, io.grpc.b bVar) {
                ManagedChannelImpl managedChannelImpl = ManagedChannelImpl.this;
                Logger logger = ManagedChannelImpl.f37275a0;
                managedChannelImpl.getClass();
                Executor executor = bVar.f36939b;
                super(executor == null ? managedChannelImpl.f37315h : executor, ManagedChannelImpl.this.f37314g, bVar.f36938a);
                this.f37373k = iVar;
                this.f37374l = methodDescriptor;
                this.f37375m = bVar;
            }

            @Override // io.grpc.internal.C2251w
            public final void f() {
                ManagedChannelImpl.this.f37319m.execute(new b());
            }

            public final void j() {
                C2249v c2249v;
                D9.i iVar = this.f37373k;
                iVar.getClass();
                D9.i iVarC = D9.i.a.f2886a.c(iVar);
                if (iVarC == null) {
                    iVarC = D9.i.f2885b;
                }
                try {
                    D9.b<ReqT, RespT> bVarG = l.this.g(this.f37374l, this.f37375m.c(io.grpc.c.f36954c, Boolean.TRUE));
                    this.f37373k.b(iVarC);
                    synchronized (this) {
                        try {
                            D9.b<ReqT, RespT> bVar = this.f37709f;
                            if (bVar != null) {
                                c2249v = null;
                            } else {
                                A8.p.o(bVar, "realCall already set to %s", bVar == null);
                                ScheduledFuture<?> scheduledFuture = this.f37704a;
                                if (scheduledFuture != null) {
                                    scheduledFuture.cancel(false);
                                }
                                this.f37709f = bVarG;
                                c2249v = new C2249v(this, this.f37706c);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (c2249v == null) {
                        ManagedChannelImpl.this.f37319m.execute(new b());
                        return;
                    }
                    ManagedChannelImpl managedChannelImpl = ManagedChannelImpl.this;
                    io.grpc.b bVar2 = this.f37375m;
                    Logger logger = ManagedChannelImpl.f37275a0;
                    managedChannelImpl.getClass();
                    Executor executor = bVar2.f36939b;
                    if (executor == null) {
                        executor = managedChannelImpl.f37315h;
                    }
                    executor.execute(new a(c2249v));
                } catch (Throwable th2) {
                    this.f37373k.b(iVarC);
                    throw th2;
                }
            }
        }

        public l(String str) {
            A8.p.j(str, "authority");
            this.f37366b = str;
        }

        @Override // D9.a
        public final String a() {
            return this.f37366b;
        }

        @Override // D9.a
        public final <ReqT, RespT> D9.b<ReqT, RespT> f(MethodDescriptor<ReqT, RespT> methodDescriptor, io.grpc.b bVar) {
            AtomicReference<io.grpc.f> atomicReference = this.f37365a;
            io.grpc.f fVar = atomicReference.get();
            a aVar = ManagedChannelImpl.f37280f0;
            if (fVar != aVar) {
                return g(methodDescriptor, bVar);
            }
            ManagedChannelImpl managedChannelImpl = ManagedChannelImpl.this;
            managedChannelImpl.f37319m.execute(new b());
            if (atomicReference.get() != aVar) {
                return g(methodDescriptor, bVar);
            }
            if (managedChannelImpl.f37287F.get()) {
                return new c();
            }
            e eVar = new e(D9.i.a(), methodDescriptor, bVar);
            managedChannelImpl.f37319m.execute(new d(eVar));
            return eVar;
        }

        public final <ReqT, RespT> D9.b<ReqT, RespT> g(MethodDescriptor<ReqT, RespT> methodDescriptor, io.grpc.b bVar) {
            io.grpc.f fVar = this.f37365a.get();
            a aVar = this.f37367c;
            if (fVar == null) {
                return aVar.f(methodDescriptor, bVar);
            }
            if (!(fVar instanceof C2237o0.b)) {
                return new e(fVar, aVar, ManagedChannelImpl.this.f37315h, methodDescriptor, bVar);
            }
            C2237o0 c2237o0 = ((C2237o0.b) fVar).f37658b;
            c2237o0.getClass();
            C2237o0.a aVar2 = c2237o0.f37646b.get(methodDescriptor.f36887b);
            if (aVar2 == null) {
                aVar2 = c2237o0.f37647c.get(methodDescriptor.f36888c);
            }
            if (aVar2 == null) {
                aVar2 = c2237o0.f37645a;
            }
            if (aVar2 != null) {
                bVar = bVar.c(C2237o0.a.f37651g, aVar2);
            }
            return aVar.f(methodDescriptor, bVar);
        }

        public final void h(io.grpc.f fVar) {
            LinkedHashSet linkedHashSet;
            AtomicReference<io.grpc.f> atomicReference = this.f37365a;
            io.grpc.f fVar2 = atomicReference.get();
            atomicReference.set(fVar);
            if (fVar2 != ManagedChannelImpl.f37280f0 || (linkedHashSet = ManagedChannelImpl.this.f37282A) == null) {
                return;
            }
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((e) it.next()).j();
            }
        }

        /* JADX INFO: Add missing generic type declarations: [ReqT, RespT] */
        public class c<ReqT, RespT> extends D9.b<ReqT, RespT> {
            @Override // D9.b
            public final void e(D9.b.a<RespT> aVar, io.grpc.m mVar) {
                aVar.a(ManagedChannelImpl.f37277c0, new io.grpc.m());
            }

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
        }
    }

    public class c extends D9.b<Object, Object> {
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
}
