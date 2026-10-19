package bo.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import com.braze.Braze;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.support.BrazeLogger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.InterfaceC2694i0;

/* JADX INFO: renamed from: bo.app.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1466f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f20944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k2 f20945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1462d0 f20946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private BroadcastReceiver f20947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ConnectivityManager.NetworkCallback f20948e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private y5 f20949f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f20950g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile boolean f20951h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ConnectivityManager f20952i;
    private t3 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private InterfaceC2694i0 f20953k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f20954l;

    /* JADX INFO: renamed from: bo.app.f0$a */
    public static final class a extends ConnectivityManager.NetworkCallback {
        public a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            kotlin.jvm.internal.i.e(network, "network");
            kotlin.jvm.internal.i.e(networkCapabilities, "networkCapabilities");
            super.onCapabilitiesChanged(network, networkCapabilities);
            C1466f0.this.a(networkCapabilities);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            kotlin.jvm.internal.i.e(network, "network");
            super.onLost(network);
            Network activeNetwork = C1466f0.this.f20952i.getActiveNetwork();
            C1466f0 c1466f0 = C1466f0.this;
            c1466f0.a(c1466f0.f20952i.getNetworkCapabilities(activeNetwork));
        }
    }

    /* JADX INFO: renamed from: bo.app.f0$b */
    public static final class b extends BroadcastReceiver {

        /* JADX INFO: renamed from: bo.app.f0$b$a */
        public static final class a extends SuspendLambda implements Ia.p {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f20957b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f20958c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ C1466f0 f20959d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Intent f20960e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ BroadcastReceiver.PendingResult f20961f;

            /* JADX INFO: renamed from: bo.app.f0$b$a$a, reason: collision with other inner class name */
            public static final class C0214a extends Lambda implements Ia.a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final C0214a f20962b = new C0214a();

                public C0214a() {
                    super(0);
                }

                @Override // Ia.a
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "Retrieving connectivity event data in background";
                }
            }

            /* JADX INFO: renamed from: bo.app.f0$b$a$b, reason: collision with other inner class name */
            public static final class C0215b extends Lambda implements Ia.a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final C0215b f20963b = new C0215b();

                public C0215b() {
                    super(0);
                }

                @Override // Ia.a
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "Failed to process connectivity event.";
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C1466f0 c1466f0, Intent intent, BroadcastReceiver.PendingResult pendingResult, kotlin.coroutines.c cVar) {
                super(2, cVar);
                this.f20959d = c1466f0;
                this.f20960e = intent;
                this.f20961f = pendingResult;
            }

            @Override // Ia.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c cVar) {
                return ((a) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
                a aVar = new a(this.f20959d, this.f20960e, this.f20961f, cVar);
                aVar.f20958c = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                if (this.f20957b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                kotlinx.coroutines.A a10 = (kotlinx.coroutines.A) this.f20958c;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, a10, BrazeLogger.Priority.V, (Throwable) null, C0214a.f20962b, 2, (Object) null);
                try {
                    t3 t3Var = this.f20959d.j;
                    C1466f0 c1466f0 = this.f20959d;
                    c1466f0.j = com.braze.support.a.a(this.f20960e, c1466f0.f20952i);
                    if (t3Var != this.f20959d.j) {
                        this.f20959d.f20945b.a(new u3(t3Var, this.f20959d.j), u3.class);
                    }
                    this.f20959d.c();
                } catch (Exception e10) {
                    BrazeLogger.INSTANCE.brazelog(a10, BrazeLogger.Priority.E, e10, C0215b.f20963b);
                    C1466f0 c1466f1 = this.f20959d;
                    c1466f1.a(c1466f1.f20945b, e10);
                }
                this.f20961f.finish();
                return p293xa.r.f47939a;
            }
        }

        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            kotlin.jvm.internal.i.e(context, "context");
            kotlin.jvm.internal.i.e(intent, "intent");
            C2680e.c(BrazeCoroutineScope.INSTANCE, null, null, new a(C1466f0.this, intent, goAsync(), null), 3);
        }
    }

    /* JADX INFO: renamed from: bo.app.f0$c */
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20964a;

        static {
            int[] iArr = new int[t3.values().length];
            try {
                iArr[t3.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t3.BAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t3.GREAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[t3.GOOD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f20964a = iArr;
        }
    }

    /* JADX INFO: renamed from: bo.app.f0$d */
    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f20965b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ C1466f0 f20966c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j, C1466f0 c1466f0) {
            super(0);
            this.f20965b = j;
            this.f20966c = c1466f0;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Kicking off the Sync Job. initialDelaysMs: " + this.f20965b + ": currentIntervalMs " + this.f20966c.b() + " ms";
        }
    }

    /* JADX INFO: renamed from: bo.app.f0$e */
    public static final class e extends SuspendLambda implements Ia.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f20967b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f20968c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f20969d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f20971f;

        /* JADX INFO: renamed from: bo.app.f0$e$a */
        public static final class a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f20972b = new a();

            public a() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Requesting data flush from automatic sync policy";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f20971f = j;
        }

        @Override // Ia.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c cVar) {
            return ((e) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            e eVar = C1466f0.this.new e(this.f20971f, cVar);
            eVar.f20969d = obj;
            return eVar;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x005b  */
        /* JADX WARN: Code duplicated, block: B:19:0x0067 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0065 -> B:20:0x0068). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f43038b
                int r1 = r12.f20968c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L28
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                long r3 = r12.f20967b
                java.lang.Object r1 = r12.f20969d
                kotlinx.coroutines.A r1 = (kotlinx.coroutines.A) r1
                kotlin.b.b(r13)
                goto L68
            L16:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1e:
                long r3 = r12.f20967b
                java.lang.Object r1 = r12.f20969d
                kotlinx.coroutines.A r1 = (kotlinx.coroutines.A) r1
                kotlin.b.b(r13)
                goto L46
            L28:
                kotlin.b.b(r13)
                java.lang.Object r13 = r12.f20969d
                r1 = r13
                kotlinx.coroutines.A r1 = (kotlinx.coroutines.A) r1
                bo.app.f0 r13 = bo.app.C1466f0.this
                long r4 = r13.b()
                long r6 = r12.f20971f
                r12.f20969d = r1
                r12.f20967b = r4
                r12.f20968c = r3
                java.lang.Object r13 = kotlinx.coroutines.I.b(r6, r12)
                if (r13 != r0) goto L45
                return r0
            L45:
                r3 = r4
            L46:
                com.braze.Braze$Companion r13 = com.braze.Braze.Companion
                bo.app.f0 r5 = bo.app.C1466f0.this
                android.content.Context r5 = bo.app.C1466f0.b(r5)
                com.braze.Braze r13 = r13.getInstance(r5)
                r13.requestImmediateDataFlush()
            L55:
                boolean r13 = kotlinx.coroutines.B.e(r1)
                if (r13 == 0) goto L85
                r12.f20969d = r1
                r12.f20967b = r3
                r12.f20968c = r2
                java.lang.Object r13 = kotlinx.coroutines.I.b(r3, r12)
                if (r13 != r0) goto L68
                return r0
            L68:
                com.braze.support.BrazeLogger r5 = com.braze.support.BrazeLogger.INSTANCE
                com.braze.support.BrazeLogger$Priority r7 = com.braze.support.BrazeLogger.Priority.V
                bo.app.f0$e$a r9 = bo.app.C1466f0.e.a.f20972b
                r10 = 2
                r11 = 0
                r8 = 0
                r6 = r1
                com.braze.support.BrazeLogger.brazelog$default(r5, r6, r7, r8, r9, r10, r11)
                com.braze.Braze$Companion r13 = com.braze.Braze.Companion
                bo.app.f0 r5 = bo.app.C1466f0.this
                android.content.Context r5 = bo.app.C1466f0.b(r5)
                com.braze.Braze r13 = r13.getInstance(r5)
                r13.requestImmediateDataFlush()
                goto L55
            L85:
                xa.r r13 = p293xa.r.f47939a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: bo.app.C1466f0.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: bo.app.f0$f */
    public static final class f extends Lambda implements Ia.a {
        public f() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Data flush interval is " + C1466f0.this.b() + " ms. Not scheduling a proceeding data flush.";
        }
    }

    /* JADX INFO: renamed from: bo.app.f0$g */
    public static final class g extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final g f20974b = new g();

        public g() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to log throwable.";
        }
    }

    /* JADX INFO: renamed from: bo.app.f0$h */
    public static final class h extends Lambda implements Ia.a {
        public h() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "recalculateDispatchState called with session state: " + C1466f0.this.f20949f + " lastNetworkLevel: " + C1466f0.this.j;
        }
    }

    /* JADX INFO: renamed from: bo.app.f0$i */
    public static final class i extends Lambda implements Ia.a {
        public i() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Flush interval was too low (" + C1466f0.this.b() + "), moving to minimum of 1000 ms";
        }
    }

    /* JADX INFO: renamed from: bo.app.f0$j */
    public static final class j extends Lambda implements Ia.a {
        public j() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "currentIntervalMs: " + C1466f0.this.b();
        }
    }

    /* JADX INFO: renamed from: bo.app.f0$k */
    public static final class k extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f20978b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ C1466f0 f20979c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(long j, C1466f0 c1466f0) {
            super(0);
            this.f20978b = j;
            this.f20979c = c1466f0;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Data flush interval has changed from " + this.f20978b + " ms to " + this.f20979c.b() + " ms after connectivity state change to: " + this.f20979c.j + " and session state: " + this.f20979c.f20949f;
        }
    }

    /* JADX INFO: renamed from: bo.app.f0$l */
    public static final class l extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f20980b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(long j) {
            super(0);
            this.f20980b = j;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return p005a4.o.d(this.f20980b, " ms", new StringBuilder("Posting new sync runnable with delay "));
        }
    }

    /* JADX INFO: renamed from: bo.app.f0$m */
    public static final class m extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final m f20981b = new m();

        public m() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "The data sync policy is already running. Ignoring request.";
        }
    }

    /* JADX INFO: renamed from: bo.app.f0$n */
    public static final class n extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final n f20982b = new n();

        public n() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Data sync started";
        }
    }

    /* JADX INFO: renamed from: bo.app.f0$o */
    public static final class o extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final o f20983b = new o();

        public o() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "The data sync policy is not running. Ignoring request.";
        }
    }

    /* JADX INFO: renamed from: bo.app.f0$p */
    public static final class p extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final p f20984b = new p();

        public p() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Data sync stopped";
        }
    }

    /* JADX INFO: renamed from: bo.app.f0$q */
    public static final class q extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final q f20985b = new q();

        public q() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to unregister Connectivity callback";
        }
    }

    public C1466f0(Context context, k2 internalEventPublisher, C1462d0 dataSyncConfigurationProvider) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(internalEventPublisher, "internalEventPublisher");
        kotlin.jvm.internal.i.e(dataSyncConfigurationProvider, "dataSyncConfigurationProvider");
        this.f20944a = context;
        this.f20945b = internalEventPublisher;
        this.f20946c = dataSyncConfigurationProvider;
        this.f20949f = y5.NO_SESSION;
        this.f20950g = -1L;
        Object systemService = context.getSystemService("connectivity");
        kotlin.jvm.internal.i.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f20952i = (ConnectivityManager) systemService;
        this.j = t3.GOOD;
        if (Build.VERSION.SDK_INT >= 30) {
            this.f20948e = new a();
        } else {
            this.f20947d = new b();
        }
        a(internalEventPublisher);
    }

    public final synchronized boolean f() {
        if (!this.f20951h) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, o.f20983b, 3, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, p.f20984b, 3, (Object) null);
        a();
        g();
        this.f20951h = false;
        return true;
    }

    public final void g() {
        try {
            if (Build.VERSION.SDK_INT < 30) {
                this.f20944a.unregisterReceiver(this.f20947d);
                return;
            }
            ConnectivityManager connectivityManager = this.f20952i;
            ConnectivityManager.NetworkCallback networkCallback = this.f20948e;
            if (networkCallback != null) {
                connectivityManager.unregisterNetworkCallback(networkCallback);
            } else {
                kotlin.jvm.internal.i.m("connectivityNetworkCallback");
                throw null;
            }
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, q.f20985b);
        }
    }

    public final void d() {
        if (Build.VERSION.SDK_INT < 30) {
            this.f20944a.registerReceiver(this.f20947d, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            return;
        }
        ConnectivityManager connectivityManager = this.f20952i;
        ConnectivityManager.NetworkCallback networkCallback = this.f20948e;
        if (networkCallback == null) {
            kotlin.jvm.internal.i.m("connectivityNetworkCallback");
            throw null;
        }
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
        a(this.f20952i.getNetworkCapabilities(this.f20952i.getActiveNetwork()));
    }

    public final synchronized boolean e() {
        if (this.f20951h) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, m.f20981b, 3, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, n.f20982b, 3, (Object) null);
        d();
        b(this.f20950g);
        this.f20951h = true;
        return true;
    }

    public final long b() {
        return this.f20950g;
    }

    public final void c() {
        long jA;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, new h(), 2, (Object) null);
        long j10 = this.f20950g;
        if (this.f20949f != y5.NO_SESSION && !this.f20954l) {
            int i10 = c.f20964a[this.j.ordinal()];
            if (i10 == 1) {
                jA = -1;
            } else if (i10 == 2) {
                jA = this.f20946c.a();
            } else if (i10 == 3) {
                jA = this.f20946c.c();
            } else {
                if (i10 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                jA = this.f20946c.b();
            }
            this.f20950g = jA;
            if (jA != -1 && jA < 1000) {
                BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.W, (Throwable) null, new i(), 2, (Object) null);
                this.f20950g = 1000L;
            }
        } else {
            this.f20950g = -1L;
        }
        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, new j(), 2, (Object) null);
        if (j10 != this.f20950g) {
            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new k(j10, this), 3, (Object) null);
            b(this.f20950g);
        }
    }

    private final void b(long j10) {
        a();
        if (this.f20950g >= 1000) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new l(j10), 3, (Object) null);
            this.f20953k = a(j10);
        }
    }

    public final synchronized void a(boolean z10) {
        try {
            this.f20954l = z10;
            c();
            if (z10) {
                f();
            } else {
                e();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final InterfaceC2694i0 a(long j10) {
        if (this.f20950g >= 1000) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new d(j10, this), 2, (Object) null);
            return C2680e.c(BrazeCoroutineScope.INSTANCE, null, null, new e(j10, null), 3);
        }
        Braze.Companion.getInstance(this.f20944a).requestImmediateDataFlush();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new f(), 3, (Object) null);
        return null;
    }

    private final void a() {
        InterfaceC2694i0 interfaceC2694i0 = this.f20953k;
        if (interfaceC2694i0 != null) {
            interfaceC2694i0.i(null);
        }
        this.f20953k = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(k2 k2Var, Throwable th) {
        try {
            k2Var.a(th, Throwable.class);
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, g.f20974b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(NetworkCapabilities networkCapabilities) {
        t3 t3Var = this.j;
        t3 t3VarA = com.braze.support.a.a(networkCapabilities);
        this.j = t3VarA;
        if (t3Var != t3VarA) {
            this.f20945b.a(new u3(t3Var, t3VarA), u3.class);
        }
        c();
    }

    public final void a(k2 eventManager) {
        kotlin.jvm.internal.i.e(eventManager, "eventManager");
        eventManager.c(x5.class, new C(0, this));
        eventManager.c(z5.class, new D(0, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C1466f0 this$0, x5 it) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        kotlin.jvm.internal.i.e(it, "it");
        this$0.f20949f = y5.OPEN_SESSION;
        this$0.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C1466f0 this$0, z5 it) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        kotlin.jvm.internal.i.e(it, "it");
        this$0.f20949f = y5.NO_SESSION;
        this$0.c();
    }
}
