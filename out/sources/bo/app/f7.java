package bo.app;

import android.app.AlarmManager;
import android.content.Context;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.managers.BrazeGeofenceManager;
import com.braze.support.BrazeLogger;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C2680e;

/* JADX INFO: loaded from: classes.dex */
public final class f7 implements d3 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final m5 f21052A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final c2 f21053B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final u6 f21054C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final BrazeGeofenceManager f21055D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final com.braze.managers.a f21056E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final m1 f21057F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final s1 f21058G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final C1486y f21059H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final q2 f21060I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final y0 f21061J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final o0 f21062K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final c5 f21063L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BrazeConfigurationProvider f21064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private h2 f21065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o4 f21066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g2 f21067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f21068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f21069f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f21070g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final l5 f21071h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final z0 f21072i;
    private final r5 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e7 f21073k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public j0 f21074l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final g1 f21075m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final u0 f21076n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final b6 f21077o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final d1 f21078p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final f1 f21079q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final C1466f0 f21080r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final C1480s f21081s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final a6 f21082t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final h1 f21083u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final i1 f21084v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final r4 f21085w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final k5 f21086x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final C1477o f21087y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final q4 f21088z;

    public static final class a extends SuspendLambda implements Ia.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f21089b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f21090c;

        /* JADX INFO: renamed from: bo.app.f7$a$a, reason: collision with other inner class name */
        public static final class C0216a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C0216a f21092b = new C0216a();

            public C0216a() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "User cache was locked, waiting.";
            }
        }

        public static final class b extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f21093b = new b();

            public b() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "User cache notified. Continuing UserDependencyManager shutdown";
            }
        }

        public static final class c extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final c f21094b = new c();

            public c() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Device cache was locked, waiting.";
            }
        }

        public static final class d extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final d f21095b = new d();

            public d() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Device cache notified. Continuing UserDependencyManager shutdown";
            }
        }

        public static final class e extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final e f21096b = new e();

            public e() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Exception while shutting down dispatch manager. Continuing.";
            }
        }

        public static final class f extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final f f21097b = new f();

            public f() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Exception while stopping data sync. Continuing.";
            }
        }

        public a(kotlin.coroutines.c cVar) {
            super(2, cVar);
        }

        @Override // Ia.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c cVar) {
            return ((a) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            a aVar = f7.this.new a(cVar);
            aVar.f21090c = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (this.f21089b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            kotlinx.coroutines.A a10 = (kotlinx.coroutines.A) this.f21090c;
            try {
                if (f7.this.k().b()) {
                    BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                    BrazeLogger.brazelog$default(brazeLogger, a10, BrazeLogger.Priority.I, (Throwable) null, C0216a.f21092b, 2, (Object) null);
                    f7.this.k().c();
                    BrazeLogger.brazelog$default(brazeLogger, a10, (BrazeLogger.Priority) null, (Throwable) null, b.f21093b, 3, (Object) null);
                }
                if (f7.this.l().b()) {
                    BrazeLogger brazeLogger2 = BrazeLogger.INSTANCE;
                    BrazeLogger.brazelog$default(brazeLogger2, a10, BrazeLogger.Priority.I, (Throwable) null, c.f21094b, 2, (Object) null);
                    f7.this.l().c();
                    BrazeLogger.brazelog$default(brazeLogger2, a10, (BrazeLogger.Priority) null, (Throwable) null, d.f21095b, 3, (Object) null);
                }
                f7.this.w().i();
                f7.this.g().b();
            } catch (Exception e10) {
                BrazeLogger.INSTANCE.brazelog(a10, BrazeLogger.Priority.W, e10, e.f21096b);
            }
            try {
                f7.this.m().f();
            } catch (Exception e11) {
                BrazeLogger.INSTANCE.brazelog(a10, BrazeLogger.Priority.W, e11, f.f21097b);
            }
            return p293xa.r.f47939a;
        }
    }

    public f7(Context applicationContext, w3 offlineUserStorageProvider, BrazeConfigurationProvider configurationProvider, k2 externalEventPublisher, h2 deviceIdProvider, n2 registrationDataProvider, o4 pushDeliveryManager, boolean z10, boolean z11, g2 deviceDataProvider, boolean z12) {
        kotlin.jvm.internal.i.e(applicationContext, "applicationContext");
        kotlin.jvm.internal.i.e(offlineUserStorageProvider, "offlineUserStorageProvider");
        kotlin.jvm.internal.i.e(configurationProvider, "configurationProvider");
        kotlin.jvm.internal.i.e(externalEventPublisher, "externalEventPublisher");
        kotlin.jvm.internal.i.e(deviceIdProvider, "deviceIdProvider");
        kotlin.jvm.internal.i.e(registrationDataProvider, "registrationDataProvider");
        kotlin.jvm.internal.i.e(pushDeliveryManager, "pushDeliveryManager");
        kotlin.jvm.internal.i.e(deviceDataProvider, "deviceDataProvider");
        this.f21064a = configurationProvider;
        this.f21065b = deviceIdProvider;
        this.f21066c = pushDeliveryManager;
        this.f21067d = deviceDataProvider;
        this.f21068e = z12;
        String strA = offlineUserStorageProvider.a();
        this.f21069f = strA;
        String string = c().getBrazeApiKey().toString();
        this.f21070g = string;
        l5 l5Var = new l5(applicationContext);
        this.f21071h = l5Var;
        z0 z0Var = new z0(applicationContext);
        this.f21072i = z0Var;
        this.j = new r5(applicationContext, string);
        this.f21075m = new g1(l5Var);
        this.f21076n = new u0(n(), g(), applicationContext, strA, string);
        b6 b6Var = new b6(applicationContext, strA, string);
        this.f21077o = b6Var;
        d1 d1Var = new d1(b6Var, g());
        this.f21078p = d1Var;
        this.f21080r = new C1466f0(applicationContext, g(), new C1462d0(applicationContext));
        g1 g1VarG = g();
        Object systemService = applicationContext.getSystemService("alarm");
        kotlin.jvm.internal.i.c(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        this.f21081s = new C1480s(applicationContext, d1Var, g1VarG, externalEventPublisher, (AlarmManager) systemService, c().getSessionTimeoutSeconds(), c().isSessionStartBasedTimeoutEnabled());
        a6 a6Var = new a6(applicationContext, strA, string);
        this.f21082t = a6Var;
        h1 h1Var = new h1(a6Var, g());
        this.f21083u = h1Var;
        this.f21084v = new i1(h1Var);
        this.f21085w = new r4(applicationContext, string, strA, g(), n());
        this.f21086x = new k5(applicationContext, strA, string);
        this.f21087y = new C1477o(applicationContext, g(), n());
        this.f21088z = new q4(applicationContext, string, strA);
        this.f21052A = new m5(applicationContext, strA, string);
        this.f21053B = new C1476n(applicationContext, strA, string, B(), g(), c(), n(), o(), z11, A(), l5Var, p(), t(), f());
        this.f21054C = new u6(applicationContext, h(), g(), externalEventPublisher, c(), strA, string);
        this.f21055D = new BrazeGeofenceManager(applicationContext, string, h(), c(), n(), g());
        this.f21056E = new com.braze.managers.a(applicationContext, h(), c());
        this.f21057F = new m1(applicationContext, string, strA, g(), externalEventPublisher, n(), h());
        this.f21058G = new s1(applicationContext, strA, h());
        this.f21059H = new C1486y(applicationContext, strA, string, h(), null, 16, null);
        b5 b5Var = new b5(y1.a(), g(), externalEventPublisher, d(), n(), s(), h(), z0Var);
        this.f21060I = b5Var;
        this.f21061J = new y0(g(), h(), false, 4, null);
        this.f21062K = new o0(this);
        this.f21063L = new c5(C(), b5Var, z10, z12);
        if (kotlin.jvm.internal.i.a(strA, "")) {
            a(new e7(applicationContext, registrationDataProvider, l5Var, null, null, 24, null));
            a(new j0(applicationContext, null, null, 6, null));
        } else {
            a(new e7(applicationContext, registrationDataProvider, l5Var, strA, string));
            a(new j0(applicationContext, strA, string));
        }
        m().a(z11);
        this.f21079q = new f1(applicationContext, q(), g(), h(), k(), l(), v(), v().d(), o(), r(), externalEventPublisher, c(), s(), u(), n(), x(), t());
    }

    public C1477o A() {
        return this.f21087y;
    }

    public C1480s B() {
        return this.f21081s;
    }

    public o0 C() {
        return this.f21062K;
    }

    @Override // bo.app.d3
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public g1 g() {
        return this.f21075m;
    }

    public void a(e7 e7Var) {
        kotlin.jvm.internal.i.e(e7Var, "<set-?>");
        this.f21073k = e7Var;
    }

    @Override // bo.app.d3
    public u0 b() {
        return this.f21076n;
    }

    @Override // bo.app.d3
    public BrazeConfigurationProvider c() {
        return this.f21064a;
    }

    @Override // bo.app.d3
    public s1 d() {
        return this.f21058G;
    }

    @Override // bo.app.d3
    public y0 e() {
        return this.f21061J;
    }

    @Override // bo.app.d3
    public q4 f() {
        return this.f21088z;
    }

    @Override // bo.app.d3
    public c2 h() {
        return this.f21053B;
    }

    @Override // bo.app.d3
    public k5 i() {
        return this.f21086x;
    }

    @Override // bo.app.d3
    public h2 j() {
        return this.f21065b;
    }

    @Override // bo.app.d3
    public e7 k() {
        e7 e7Var = this.f21073k;
        if (e7Var != null) {
            return e7Var;
        }
        kotlin.jvm.internal.i.m("userCache");
        throw null;
    }

    @Override // bo.app.d3
    public j0 l() {
        j0 j0Var = this.f21074l;
        if (j0Var != null) {
            return j0Var;
        }
        kotlin.jvm.internal.i.m("deviceCache");
        throw null;
    }

    @Override // bo.app.d3
    public C1466f0 m() {
        return this.f21080r;
    }

    @Override // bo.app.d3
    public r5 n() {
        return this.j;
    }

    @Override // bo.app.d3
    public i1 o() {
        return this.f21084v;
    }

    @Override // bo.app.d3
    public r4 p() {
        return this.f21085w;
    }

    @Override // bo.app.d3
    public com.braze.managers.a q() {
        return this.f21056E;
    }

    @Override // bo.app.d3
    public BrazeGeofenceManager r() {
        return this.f21055D;
    }

    @Override // bo.app.d3
    public C1486y s() {
        return this.f21059H;
    }

    @Override // bo.app.d3
    public o4 t() {
        return this.f21066c;
    }

    @Override // bo.app.d3
    public m5 u() {
        return this.f21052A;
    }

    @Override // bo.app.d3
    public u6 v() {
        return this.f21054C;
    }

    @Override // bo.app.d3
    public c5 w() {
        return this.f21063L;
    }

    @Override // bo.app.d3
    public m1 x() {
        return this.f21057F;
    }

    @Override // bo.app.d3
    public f1 y() {
        return this.f21079q;
    }

    @Override // bo.app.d3
    public g2 z() {
        return this.f21067d;
    }

    public void a(j0 j0Var) {
        kotlin.jvm.internal.i.e(j0Var, "<set-?>");
        this.f21074l = j0Var;
    }

    @Override // bo.app.d3
    public void a() {
        C2680e.c(BrazeCoroutineScope.INSTANCE, null, null, new a(null), 3);
    }
}
