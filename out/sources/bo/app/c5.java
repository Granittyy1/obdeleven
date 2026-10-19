package bo.app;

import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.InterfaceC2694i0;

/* JADX INFO: loaded from: classes.dex */
public final class c5 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f20782n = new b(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f20783o = BrazeLogger.getBrazeLogTag((Class<?>) c5.class);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final long f20784p = TimeUnit.HOURS.toMillis(1);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final long f20785q = TimeUnit.MINUTES.toMillis(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o0 f20786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q2 f20787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f20788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f20789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f20790e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private InterfaceC2694i0 f20791f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ReentrantLock f20792g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private j5 f20793h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f20794i;
    private long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicInteger f20795k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final l6 f20796l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private t3 f20797m;

    public static final class a extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u3 f20798b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u3 u3Var) {
            super(0);
            this.f20798b = u3Var;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Got network change event: " + this.f20798b;
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final long a() {
            return c5.f20784p;
        }

        public final long b() {
            return c5.f20785q;
        }

        private b() {
        }
    }

    public interface c {
        void a(d4 d4Var);

        void a(AbstractC1461d abstractC1461d);
    }

    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20799a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f20800b;

        static {
            int[] iArr = new int[n0.b.values().length];
            try {
                iArr[n0.b.ADD_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f20799a = iArr;
            int[] iArr2 = new int[d2.a.values().length];
            try {
                iArr2[d2.a.FEATURE_FLAG_SYNC.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[d2.a.CONTENT_CARD_SYNC.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[d2.a.V3_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[d2.a.TEMPLATE_REQUEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[d2.a.DUST_CONFIG.ordinal()] = 5;
            } catch (NoSuchFieldError unused6) {
            }
            f20800b = iArr2;
        }
    }

    public static final class e extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f20801b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e5 f20802c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f20803d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z10, e5 e5Var, long j) {
            super(0);
            this.f20801b = z10;
            this.f20802c = e5Var;
            this.f20803d = j;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder("Running on ");
            sb2.append(this.f20801b ? "no-op" : "network");
            sb2.append(" executor for ");
            sb2.append(this.f20802c.b(this.f20803d));
            return sb2.toString();
        }
    }

    public static final class g extends SuspendLambda implements Ia.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f20813b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f20814c;

        public static final class a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f20816b = new a();

            public a() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Caught exception during request sweep";
            }
        }

        public static final class b extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f20817b = new b();

            public b() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "A maximum of 5 invalid api key errors reached. Device data will remain unaffected, but future requests will not be made.";
            }
        }

        public g(kotlin.coroutines.c cVar) {
            super(2, cVar);
        }

        @Override // Ia.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c cVar) {
            return ((g) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            g gVar = c5.this.new g(cVar);
            gVar.f20814c = obj;
            return gVar;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0064  */
        /* JADX WARN: Code duplicated, block: B:23:0x0071  */
        /* JADX WARN: Code duplicated, block: B:25:0x007d A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:26:0x007e  */
        /* JADX WARN: Code duplicated, block: B:29:0x0033 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x007e -> B:12:0x002d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
            java.lang.StackOverflowError
            	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
            	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f43038b
                int r1 = r11.f20813b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L25
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                java.lang.Object r1 = r11.f20814c
                kotlinx.coroutines.A r1 = (kotlinx.coroutines.A) r1
                kotlin.b.b(r12)
                goto L2d
            L14:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1c:
                java.lang.Object r1 = r11.f20814c
                kotlinx.coroutines.A r1 = (kotlinx.coroutines.A) r1
                kotlin.b.b(r12)
            L23:
                r5 = r1
                goto L57
            L25:
                kotlin.b.b(r12)
                java.lang.Object r12 = r11.f20814c
                r1 = r12
                kotlinx.coroutines.A r1 = (kotlinx.coroutines.A) r1
            L2d:
                boolean r12 = kotlinx.coroutines.B.e(r1)
                if (r12 == 0) goto L80
                bo.app.c5 r12 = bo.app.c5.this     // Catch: java.lang.Exception -> L3c
                r4 = 0
                r6 = 0
                bo.app.c5.a(r12, r4, r3, r6)     // Catch: java.lang.Exception -> L3c
                goto L23
            L3c:
                r12 = move-exception
                com.braze.support.BrazeLogger r4 = com.braze.support.BrazeLogger.INSTANCE
                com.braze.support.BrazeLogger$Priority r5 = com.braze.support.BrazeLogger.Priority.E
                bo.app.c5$g$a r6 = bo.app.c5.g.a.f20816b
                r4.brazelog(r1, r5, r12, r6)
                bo.app.c5$b r12 = bo.app.c5.f20782n
                long r4 = r12.b()
                r11.f20814c = r1
                r11.f20813b = r3
                java.lang.Object r12 = kotlinx.coroutines.I.b(r4, r11)
                if (r12 != r0) goto L23
                return r0
            L57:
                bo.app.c5 r12 = bo.app.c5.this
                java.util.concurrent.atomic.AtomicInteger r12 = r12.f()
                int r12 = r12.get()
                r1 = 5
                if (r12 < r1) goto L71
                com.braze.support.BrazeLogger r4 = com.braze.support.BrazeLogger.INSTANCE
                com.braze.support.BrazeLogger$Priority r6 = com.braze.support.BrazeLogger.Priority.I
                bo.app.c5$g$b r8 = bo.app.c5.g.b.f20817b
                r9 = 2
                r10 = 0
                r7 = 0
                com.braze.support.BrazeLogger.brazelog$default(r4, r5, r6, r7, r8, r9, r10)
                goto L80
            L71:
                r11.f20814c = r5
                r11.f20813b = r2
                r6 = 10
                java.lang.Object r12 = kotlinx.coroutines.I.b(r6, r11)
                if (r12 != r0) goto L7e
                return r0
            L7e:
                r1 = r5
                goto L2d
            L80:
                xa.r r12 = p293xa.r.f47939a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: bo.app.c5.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class h extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e5 f20818b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f20819c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f20820d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ c5 f20821e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(e5 e5Var, long j, long j10, c5 c5Var) {
            super(0);
            this.f20818b = e5Var;
            this.f20819c = j;
            this.f20820d = j10;
            this.f20821e = c5Var;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Delaying next request after " + this.f20818b.b(this.f20819c) + " until next token is available in " + this.f20820d + "ms - '" + DateTimeUtils.formatDateFromMillis$default(this.f20819c + this.f20820d, null, null, 3, null) + "'\n" + this.f20821e.f20796l;
        }
    }

    public static final class i extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f20823c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(long j) {
            super(0);
            this.f20823c = j;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return c5.this.f(this.f20823c);
        }
    }

    public static final class j extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f20824b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e5 f20825c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(long j, e5 e5Var) {
            super(0);
            this.f20824b = j;
            this.f20825c = e5Var;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Running at " + this.f20824b + " for request " + this.f20825c.b(this.f20824b);
        }
    }

    public static final class k extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final k f20826b = new k();

        public k() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Skipping request sending due to lacking a rate limiting token.";
        }
    }

    public static final class l extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final l f20827b = new l();

        public l() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Got call to shutdown request framework";
        }
    }

    public static final class m implements c {

        public static final class a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC1461d f20828b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AbstractC1461d abstractC1461d) {
                super(0);
                this.f20828b = abstractC1461d;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Shutdown sync got error response: " + this.f20828b;
            }
        }

        public static final class b extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ d4 f20829b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(d4 d4Var) {
                super(0);
                this.f20829b = d4Var;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Shutdown sync got success response: " + this.f20829b;
            }
        }

        @Override // bo.app.c5.c
        public void a(d4 apiResponse) {
            kotlin.jvm.internal.i.e(apiResponse, "apiResponse");
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new b(apiResponse), 3, (Object) null);
        }

        @Override // bo.app.c5.c
        public void a(AbstractC1461d apiResponse) {
            kotlin.jvm.internal.i.e(apiResponse, "apiResponse");
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new a(apiResponse), 3, (Object) null);
        }
    }

    public static final class n extends Lambda implements Ia.a {
        public n() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder("Kicking off request framework sweeper job ");
            InterfaceC2694i0 interfaceC2694i0G = c5.this.g();
            sb2.append(interfaceC2694i0G != null ? Boolean.valueOf(interfaceC2694i0G.c()) : null);
            return sb2.toString();
        }
    }

    public static final class o extends Lambda implements Ia.l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f20831b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(long j) {
            super(1);
            this.f20831b = j;
        }

        @Override // Ia.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(a1 it) {
            kotlin.jvm.internal.i.e(it, "it");
            return it.d(this.f20831b);
        }
    }

    public c5(o0 dispatchDataProvider, q2 requestExecutor, boolean z10, boolean z11) {
        kotlin.jvm.internal.i.e(dispatchDataProvider, "dispatchDataProvider");
        kotlin.jvm.internal.i.e(requestExecutor, "requestExecutor");
        this.f20786a = dispatchDataProvider;
        this.f20787b = requestExecutor;
        this.f20788c = z10;
        this.f20789d = z11;
        this.f20790e = new LinkedHashMap();
        this.f20792g = new ReentrantLock();
        this.f20794i = -1L;
        this.j = -1L;
        this.f20795k = new AtomicInteger(0);
        this.f20796l = new l6(dispatchDataProvider.i().n(), dispatchDataProvider.i().o());
        this.f20797m = t3.GOOD;
        e().c(n0.class, new A(0, this));
        e().c(u3.class, new B(0, this));
    }

    private final y0 d() {
        return this.f20786a.j().e();
    }

    private final k2 e() {
        return this.f20786a.f();
    }

    private final InterfaceC2694i0 h() {
        return C2680e.c(BrazeCoroutineScope.INSTANCE, null, null, new g(null), 3);
    }

    public final AtomicInteger f() {
        return this.f20795k;
    }

    public final InterfaceC2694i0 g() {
        return this.f20791f;
    }

    public final void i() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f20783o, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) l.f20827b, 6, (Object) null);
        InterfaceC2694i0 interfaceC2694i0 = this.f20791f;
        if (interfaceC2694i0 != null) {
            interfaceC2694i0.i(null);
        }
        C1468g0 c1468g0 = new C1468g0(this.f20786a.i(), this.f20786a.b().getBaseUrlForRequests(), null, 4, null);
        this.f20786a.a((d2) c1468g0);
        long jNowInMilliseconds = DateTimeUtils.nowInMilliseconds();
        a(this, jNowInMilliseconds, c1468g0, new e5(c1468g0, jNowInMilliseconds, jNowInMilliseconds, null, 8, null), new m(), false, 16, null);
    }

    public final void j() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new n(), 3, (Object) null);
        this.f20791f = h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String f(long j10) {
        Map map = this.f20790e;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((a1) ((Map.Entry) it.next()).getValue());
        }
        return kotlin.text.i.w("RequestFramework->\n            |mockAllNetworkRequests=" + this.f20788c + "\n            |lastSdkAuthFailureError=" + this.f20793h + "\n            |lastSdkAuthFailureAt=" + (this.f20794i - j10) + "\n            |sdkAuthFailureBackoffUntil=" + (this.j - j10) + "\n            |invalidApiKeyErrorCounter=" + this.f20795k.get() + "\n            |globalRequestRateLimiter=" + this.f20796l + "\n            |lastNetworkLevel=" + this.f20797m + "\n            |endpointQueues=\n            | \n            |" + kotlin.collections.q.U(arrayList, "\n\n", null, null, new o(j10), 30) + "\n            |  \n            |\n        ");
    }

    public final void d(long j10) {
        this.f20794i = j10;
    }

    public final void e(long j10) {
        this.j = j10;
    }

    public final void c(long j10) {
        ReentrantLock reentrantLock = this.f20792g;
        reentrantLock.lock();
        try {
            if (!a(j10)) {
                Iterator it = this.f20790e.entrySet().iterator();
                while (it.hasNext()) {
                    a(j10, (a1) ((Map.Entry) it.next()).getValue());
                }
            }
            p293xa.r rVar = p293xa.r.f47939a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void a(j5 j5Var) {
        this.f20793h = j5Var;
    }

    public final boolean b(long j10) {
        return !this.f20786a.i().D() || this.f20796l.a(j10) >= 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(c5 this$0, n0 n0Var) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        kotlin.jvm.internal.i.e(n0Var, "<name for destructuring parameter 0>");
        n0.b bVarA = n0Var.a();
        d2 d2VarD = n0Var.d();
        ReentrantLock reentrantLock = this$0.f20792g;
        reentrantLock.lock();
        try {
            if (d.f20799a[bVarA.ordinal()] == 1 && d2VarD != null) {
                this$0.a(d2VarD);
            }
            p293xa.r rVar = p293xa.r.f47939a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final class f implements c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e5 f20805b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a1 f20806c;

        public static final class a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ e5 f20807b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f20808c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ r2 f20809d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e5 e5Var, long j, r2 r2Var) {
                super(0);
                this.f20807b = e5Var;
                this.f20808c = j;
                this.f20809d = r2Var;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Request failure received " + this.f20807b.b(this.f20808c) + " \n" + this.f20809d;
            }
        }

        public static final class b extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ c5 f20810b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(c5 c5Var) {
                super(0);
                this.f20810b = c5Var;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Incremented invalidApiKeyErrorCounter to " + this.f20810b.f().get();
            }
        }

        public static final class c extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ e5 f20811b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f20812c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(e5 e5Var, long j) {
                super(0);
                this.f20811b = e5Var;
                this.f20812c = j;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Request success received for " + this.f20811b.b(this.f20812c);
            }
        }

        public f(e5 e5Var, a1 a1Var) {
            this.f20805b = e5Var;
            this.f20806c = a1Var;
        }

        @Override // bo.app.c5.c
        public void a(d4 apiResponse) {
            kotlin.jvm.internal.i.e(apiResponse, "apiResponse");
            ReentrantLock reentrantLock = c5.this.f20792g;
            e5 e5Var = this.f20805b;
            a1 a1Var = this.f20806c;
            reentrantLock.lock();
            try {
                long jNowInMilliseconds = DateTimeUtils.nowInMilliseconds();
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, c5.f20783o, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) new c(e5Var, jNowInMilliseconds), 6, (Object) null);
                e5Var.a(jNowInMilliseconds, f5.COMPLETE);
                a1Var.a(jNowInMilliseconds, e5Var, apiResponse);
                p293xa.r rVar = p293xa.r.f47939a;
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // bo.app.c5.c
        public void a(AbstractC1461d apiResponse) {
            kotlin.jvm.internal.i.e(apiResponse, "apiResponse");
            ReentrantLock reentrantLock = c5.this.f20792g;
            e5 e5Var = this.f20805b;
            a1 a1Var = this.f20806c;
            c5 c5Var = c5.this;
            reentrantLock.lock();
            try {
                long jNowInMilliseconds = DateTimeUtils.nowInMilliseconds();
                d4 d4Var = apiResponse instanceof d4 ? (d4) apiResponse : null;
                r2 r2VarE = d4Var != null ? d4Var.e() : null;
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.brazelog$default(brazeLogger, c5.f20783o, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) new a(e5Var, jNowInMilliseconds, r2VarE), 6, (Object) null);
                e5Var.a(jNowInMilliseconds, f5.PENDING_RETRY);
                a1Var.a(jNowInMilliseconds, e5Var, apiResponse);
                if (r2VarE instanceof j5) {
                    c5Var.d(jNowInMilliseconds);
                    c5Var.a((j5) r2VarE);
                    c5Var.e(jNowInMilliseconds + c5.f20782n.a());
                }
                if (r2VarE instanceof k3) {
                    c5Var.f().incrementAndGet();
                    BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new b(c5Var), 3, (Object) null);
                }
                p293xa.r rVar = p293xa.r.f47939a;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(c5 this$0, u3 it) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        kotlin.jvm.internal.i.e(it, "it");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f20783o, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) new a(it), 6, (Object) null);
        this$0.f20797m = it.a();
    }

    public static /* synthetic */ void a(c5 c5Var, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = DateTimeUtils.nowInMilliseconds();
        }
        c5Var.c(j10);
    }

    public final void a(long j10, a1 queue) {
        kotlin.jvm.internal.i.e(queue, "queue");
        if (j10 <= queue.b()) {
            return;
        }
        queue.b(j10);
        List listE = queue.e();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listE) {
            e5 e5Var = (e5) obj;
            if (e5Var.c() == f5.PENDING_START || e5Var.c() == f5.PENDING_RETRY) {
                if (j10 >= e5Var.a()) {
                    arrayList.add(obj);
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a(j10, queue, (e5) it.next());
        }
    }

    private final void a(long j10, a1 a1Var, e5 e5Var) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new j(j10, e5Var), 3, (Object) null);
        if (!b(j10)) {
            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, k.f20826b, 3, (Object) null);
            return;
        }
        d2 d2VarA = this.f20786a.a(e5Var.b());
        c cVarA = a(a1Var, e5Var);
        e5Var.a(j10, f5.IN_FLIGHT);
        if (a(this, j10, d2VarA, e5Var, cVarA, false, 16, null)) {
            return;
        }
        a(j10, e5Var);
    }

    public final c a(a1 queue, e5 requestInfo) {
        kotlin.jvm.internal.i.e(queue, "queue");
        kotlin.jvm.internal.i.e(requestInfo, "requestInfo");
        return new f(requestInfo, queue);
    }

    public static /* synthetic */ boolean a(c5 c5Var, long j10, d2 d2Var, e5 e5Var, c cVar, boolean z10, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        return c5Var.a(j10, d2Var, e5Var, cVar, z10);
    }

    private final boolean a(long j10, d2 d2Var, e5 e5Var, c cVar, boolean z10) {
        boolean z11 = d2Var.c() || this.f20788c;
        q2 q2VarD = z11 ? d() : this.f20787b;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new e(z11, e5Var, j10), 3, (Object) null);
        q2VarD.a(e5Var, cVar, z10);
        return z11;
    }

    public final void a(d2 request) {
        a1 l1Var;
        kotlin.jvm.internal.i.e(request, "request");
        d2.a aVarE = request.e();
        if (!this.f20790e.containsKey(aVarE)) {
            int i10 = d.f20800b[aVarE.ordinal()];
            if (i10 == 1) {
                l1Var = new l1(this.f20786a);
            } else if (i10 == 2) {
                l1Var = new C1483v(this.f20786a);
            } else if (i10 == 3) {
                l1Var = new C1464e0(this.f20786a);
            } else if (i10 == 4) {
                l1Var = new g6(this.f20786a);
            } else if (i10 != 5) {
                l1Var = new C1470h0(aVarE, this.f20786a);
            } else {
                l1Var = new r0(this.f20786a);
            }
            this.f20790e.put(aVarE, l1Var);
        } else {
            l1Var = (a1) this.f20790e.get(aVarE);
        }
        if (l1Var == null) {
            return;
        }
        l1Var.a(DateTimeUtils.nowInMilliseconds(), request);
    }

    public final boolean a(long j10) {
        if (this.f20789d && this.f20797m == t3.NONE) {
            return true;
        }
        j5 j5Var = this.f20793h;
        if (j5Var != null && j10 < this.j) {
            if (kotlin.jvm.internal.i.a(this.f20786a.j().i().a(), j5Var.a().h())) {
                return true;
            }
        }
        return !b(j10);
    }

    public final void a(long j10, e5 requestInfo) {
        kotlin.jvm.internal.i.e(requestInfo, "requestInfo");
        this.f20796l.a();
        if (!b(j10)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new h(requestInfo, j10, this.f20796l.b(), this), 3, (Object) null);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new i(j10), 3, (Object) null);
    }
}
