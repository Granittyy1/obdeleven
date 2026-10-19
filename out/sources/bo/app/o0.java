package bo.app;

import com.braze.Constants;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.NotificationSubscriptionType;
import com.braze.events.IEventSubscriber;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f21682d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d3 f21683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap f21684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ConcurrentHashMap f21685c;

    public static final class a {

        /* JADX INFO: renamed from: bo.app.o0$a$a, reason: collision with other inner class name */
        public static final class C0229a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ k5 f21686b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0229a(k5 k5Var) {
                super(0);
                this.f21686b = k5Var;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Adding SDK Auth token to request '" + this.f21686b.a() + '\'';
            }
        }

        public static final class b extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f21687b = new b();

            public b() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "SDK Auth is disabled, not adding signature to request";
            }
        }

        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final void a(BrazeConfigurationProvider configurationProvider, k5 sdkAuthenticationCache, d2 brazeRequest, String deviceId) {
            kotlin.jvm.internal.i.e(configurationProvider, "configurationProvider");
            kotlin.jvm.internal.i.e(sdkAuthenticationCache, "sdkAuthenticationCache");
            kotlin.jvm.internal.i.e(brazeRequest, "brazeRequest");
            kotlin.jvm.internal.i.e(deviceId, "deviceId");
            brazeRequest.c(deviceId);
            brazeRequest.e(configurationProvider.getBrazeApiKey().toString());
            brazeRequest.b(Constants.BRAZE_SDK_VERSION);
            brazeRequest.a(Long.valueOf(DateTimeUtils.nowInSeconds()));
            if (!configurationProvider.isSdkAuthenticationEnabled()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, b.f21687b, 2, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new C0229a(sdkAuthenticationCache), 2, (Object) null);
                brazeRequest.d(sdkAuthenticationCache.a());
            }
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21688a;

        static {
            int[] iArr = new int[n0.b.values().length];
            try {
                iArr[n0.b.ADD_PENDING_BRAZE_EVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n0.b.ADD_BRAZE_EVENTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n0.b.FLUSH_PENDING_BRAZE_EVENTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f21688a = iArr;
        }
    }

    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f21689b = new c();

        public c() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Push permissions were granted, setting user push notifications to opt-in";
        }
    }

    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f21690b = new d();

        public d() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Push permissions were granted, but blocking automatic opt-in";
        }
    }

    public static final class e extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a2 f21691b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(a2 a2Var) {
            super(0);
            this.f21691b = a2Var;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Event dispatched: " + this.f21691b.forJsonPut() + " with uid: " + this.f21691b.t();
        }
    }

    public static final class f extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f21692b = new f();

        public f() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Max number of events per dispatch reached: 32 . No more events will be included in this dispatch";
        }
    }

    public static final class g extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final g f21693b = new g();

        public g() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Flushing pending events to dispatcher map";
        }
    }

    public o0(d3 udm) {
        kotlin.jvm.internal.i.e(udm, "udm");
        this.f21683a = udm;
        this.f21684b = new ConcurrentHashMap();
        this.f21685c = new ConcurrentHashMap();
        f().c(n0.class, new IEventSubscriber() { // from class: bo.app.D0
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                o0.a(this.f20652a, (n0) obj);
            }
        });
    }

    private final j0 c() {
        return this.f21683a.l();
    }

    private final g2 d() {
        return this.f21683a.z();
    }

    private final h2 e() {
        return this.f21683a.j();
    }

    private final k5 g() {
        return this.f21683a.i();
    }

    private final m5 h() {
        return this.f21683a.u();
    }

    private final e7 k() {
        return this.f21683a.k();
    }

    public final synchronized C1472j a() {
        LinkedHashSet linkedHashSet;
        try {
            Collection<a2> collectionValues = this.f21684b.values();
            kotlin.jvm.internal.i.d(collectionValues, "brazeEventMap.values");
            linkedHashSet = new LinkedHashSet();
            for (a2 event : collectionValues) {
                kotlin.jvm.internal.i.d(event, "event");
                linkedHashSet.add(event);
                collectionValues.remove(event);
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new e(event), 3, (Object) null);
                if (linkedHashSet.size() >= 32) {
                    BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.I, (Throwable) null, f.f21692b, 2, (Object) null);
                    break;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return new C1472j(linkedHashSet);
    }

    public final k2 f() {
        return this.f21683a.g();
    }

    public final r5 i() {
        return this.f21683a.n();
    }

    public final d3 j() {
        return this.f21683a;
    }

    public final BrazeConfigurationProvider b() {
        return this.f21683a.c();
    }

    public final void b(List events) {
        kotlin.jvm.internal.i.e(events, "events");
        Iterator it = events.iterator();
        while (it.hasNext()) {
            a2 a2Var = (a2) it.next();
            this.f21685c.putIfAbsent(a2Var.t(), a2Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(o0 this$0, n0 n0Var) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        kotlin.jvm.internal.i.e(n0Var, "<name for destructuring parameter 0>");
        n0.b bVarA = n0Var.a();
        List listB = n0Var.b();
        v5 v5VarC = n0Var.c();
        int i10 = b.f21688a[bVarA.ordinal()];
        if (i10 == 1) {
            this$0.b(listB);
        } else if (i10 == 2) {
            this$0.a(listB);
        } else {
            if (i10 != 3) {
                return;
            }
            this$0.a(v5VarC);
        }
    }

    public final void a(v5 v5Var) {
        if (v5Var == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = this.f21685c;
        if (concurrentHashMap.isEmpty()) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, g.f21693b, 3, (Object) null);
        Collection collectionValues = concurrentHashMap.values();
        kotlin.jvm.internal.i.d(collectionValues, "events.values");
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            ((a2) it.next()).a(v5Var);
        }
        this.f21684b.putAll(concurrentHashMap);
        Set setKeySet = concurrentHashMap.keySet();
        kotlin.jvm.internal.i.d(setKeySet, "events.keys");
        Iterator it2 = setKeySet.iterator();
        while (it2.hasNext()) {
            this.f21685c.remove((String) it2.next());
        }
    }

    public final d2 a(d2 brazeRequest) {
        kotlin.jvm.internal.i.e(brazeRequest, "brazeRequest");
        f21682d.a(b(), g(), brazeRequest, e().getDeviceId());
        if (brazeRequest instanceof C1468g0) {
            a((C1468g0) brazeRequest);
        } else if (brazeRequest instanceof p4) {
            brazeRequest.a(d().b());
            ((p4) brazeRequest).a(this.f21683a.t().a());
        } else if (brazeRequest instanceof C1487z) {
            C1486y c1486yS = this.f21683a.s();
            C1487z c1487z = (C1487z) brazeRequest;
            c1487z.a(c1486yS.e());
            c1487z.b(c1486yS.f());
        }
        return brazeRequest;
    }

    public final void a(C1468g0 dataSyncRequest) {
        kotlin.jvm.internal.i.e(dataSyncRequest, "dataSyncRequest");
        dataSyncRequest.g(d().a());
        dataSyncRequest.a(b().getSdkFlavor());
        dataSyncRequest.f(d().c());
        i0 i0VarA = d().a(c());
        dataSyncRequest.a(i0VarA);
        if (i0VarA != null && i0VarA.w()) {
            if (b().getShouldOptInWhenPushAuthorized()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, c.f21689b, 2, (Object) null);
                k().b(NotificationSubscriptionType.OPTED_IN);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, d.f21690b, 2, (Object) null);
            }
        }
        if (i0VarA != null && i0VarA.u()) {
            k().g();
        }
        dataSyncRequest.a((c4) k().a());
        C1472j c1472jA = a();
        dataSyncRequest.a(c1472jA);
        if (c1472jA.a()) {
            dataSyncRequest.a(h().b(b().getSdkMetadata()));
        }
    }

    public final void a(List events) {
        kotlin.jvm.internal.i.e(events, "events");
        Iterator it = events.iterator();
        while (it.hasNext()) {
            a2 a2Var = (a2) it.next();
            this.f21684b.putIfAbsent(a2Var.t(), a2Var);
        }
    }
}
