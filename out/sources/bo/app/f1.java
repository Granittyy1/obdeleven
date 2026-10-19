package bo.app;

import android.content.Context;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.events.FeatureFlagsUpdatedEvent;
import com.braze.events.IEventSubscriber;
import com.braze.events.InAppMessageEvent;
import com.braze.managers.BrazeGeofenceManager;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.google.android.gms.internal.measurement.M1;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f20986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m2 f20987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k2 f20988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c2 f20989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e7 f20990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final j0 f20991f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final y2 f20992g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final b3 f20993h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final i1 f20994i;
    private final BrazeGeofenceManager j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final k2 f20995k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final BrazeConfigurationProvider f20996l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final C1486y f20997m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final m5 f20998n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private r5 f20999o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final m1 f21000p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final o4 f21001q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AtomicBoolean f21002r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final AtomicBoolean f21003s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private q6 f21004t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final AtomicBoolean f21005u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final AtomicBoolean f21006v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final AtomicBoolean f21007w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final AtomicBoolean f21008x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final AtomicBoolean f21009y;

    public static final class a extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f21010b = new a();

        public a() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to request a content card refresh.";
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f21011b = new b();

        public b() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to log error.";
        }
    }

    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f21012b = new c();

        public c() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Requesting Content Card refresh on session created event due to configuration.";
        }
    }

    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f21013b = new d();

        public d() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Content Cards already initialized. Not retrieving.";
        }
    }

    public static final class e extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f21014b = new e();

        public e() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Starting DUST subscription due to configuration.";
        }
    }

    public static final class f extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f21015b = new f();

        public f() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "DUST initial subscription already started. Not starting again.";
        }
    }

    public static final class g extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final g f21016b = new g();

        public g() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Requesting Feature Flags refresh on session created event due to configuration.";
        }
    }

    public static final class h extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final h f21017b = new h();

        public h() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Feature Flags already initialized. Not retrieving.";
        }
    }

    public static final class i extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final i f21018b = new i();

        public i() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Requesting Push Max request on session created event due to configuration.";
        }
    }

    public static final class j extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final j f21019b = new j();

        public j() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Push Max already requested for this session. Not requesting again.";
        }
    }

    public static final class k extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c3 f21020b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(c3 c3Var) {
            super(0);
            this.f21020b = c3Var;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Could not publish in-app message with trigger action id: " + this.f21020b.getId();
        }
    }

    public static final class l extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final l f21021b = new l();

        public l() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Performing push delivery event flush";
        }
    }

    public static final class m extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final m f21022b = new m();

        public m() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Requesting feed refresh in next sync";
        }
    }

    public static final class n extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final n f21023b = new n();

        public n() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Requesting trigger refresh in next sync";
        }
    }

    public static final class o extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final o f21024b = new o();

        public o() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Session created event for new session received.";
        }
    }

    public static final class p extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final p f21025b = new p();

        public p() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Requesting Braze Geofence refresh on session created event due to configuration.";
        }
    }

    public static final class q extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final q f21026b = new q();

        public q() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Not automatically requesting Braze Geofence refresh on session created event due to configuration.";
        }
    }

    public static final class r extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final r f21027b = new r();

        public r() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Session start event for new session received.";
        }
    }

    public static final class s extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final s f21028b = new s();

        public s() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Not automatically requesting Content Card refresh on session created event due to server configuration.";
        }
    }

    public static final class t extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final t f21029b = new t();

        public t() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Not automatically requesting Feature Flags refresh on session created event due to server configuration.";
        }
    }

    public static final class u extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final u f21030b = new u();

        public u() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Not automatically requesting Push Max on session created event due to server configuration.";
        }
    }

    public static final class v extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final v f21031b = new v();

        public v() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Not automatically starting DUST subscription on session created event due to server configuration.";
        }
    }

    public static final class w extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final w f21032b = new w();

        public w() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to log the storage exception.";
        }
    }

    public static final class x extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k2 f21033b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(k2 k2Var) {
            super(0);
            this.f21033b = k2Var;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Subscribing to events with " + this.f21033b;
        }
    }

    public static final class y extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final y f21034b = new y();

        public y() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Requesting trigger update due to trigger-eligible push click event";
        }
    }

    public f1(Context applicationContext, m2 locationManager, k2 internalEventPublisher, c2 brazeManager, e7 userCache, j0 deviceCache, y2 triggerManager, b3 triggerReEligibilityManager, i1 eventStorageManager, BrazeGeofenceManager geofenceManager, k2 externalEventPublisher, BrazeConfigurationProvider configurationProvider, C1486y contentCardsStorageProvider, m5 sdkMetadataCache, r5 serverConfigStorageProvider, m1 featureFlagsManager, o4 pushDeliveryManager) {
        kotlin.jvm.internal.i.e(applicationContext, "applicationContext");
        kotlin.jvm.internal.i.e(locationManager, "locationManager");
        kotlin.jvm.internal.i.e(internalEventPublisher, "internalEventPublisher");
        kotlin.jvm.internal.i.e(brazeManager, "brazeManager");
        kotlin.jvm.internal.i.e(userCache, "userCache");
        kotlin.jvm.internal.i.e(deviceCache, "deviceCache");
        kotlin.jvm.internal.i.e(triggerManager, "triggerManager");
        kotlin.jvm.internal.i.e(triggerReEligibilityManager, "triggerReEligibilityManager");
        kotlin.jvm.internal.i.e(eventStorageManager, "eventStorageManager");
        kotlin.jvm.internal.i.e(geofenceManager, "geofenceManager");
        kotlin.jvm.internal.i.e(externalEventPublisher, "externalEventPublisher");
        kotlin.jvm.internal.i.e(configurationProvider, "configurationProvider");
        kotlin.jvm.internal.i.e(contentCardsStorageProvider, "contentCardsStorageProvider");
        kotlin.jvm.internal.i.e(sdkMetadataCache, "sdkMetadataCache");
        kotlin.jvm.internal.i.e(serverConfigStorageProvider, "serverConfigStorageProvider");
        kotlin.jvm.internal.i.e(featureFlagsManager, "featureFlagsManager");
        kotlin.jvm.internal.i.e(pushDeliveryManager, "pushDeliveryManager");
        this.f20986a = applicationContext;
        this.f20987b = locationManager;
        this.f20988c = internalEventPublisher;
        this.f20989d = brazeManager;
        this.f20990e = userCache;
        this.f20991f = deviceCache;
        this.f20992g = triggerManager;
        this.f20993h = triggerReEligibilityManager;
        this.f20994i = eventStorageManager;
        this.j = geofenceManager;
        this.f20995k = externalEventPublisher;
        this.f20996l = configurationProvider;
        this.f20997m = contentCardsStorageProvider;
        this.f20998n = sdkMetadataCache;
        this.f20999o = serverConfigStorageProvider;
        this.f21000p = featureFlagsManager;
        this.f21001q = pushDeliveryManager;
        this.f21002r = new AtomicBoolean(false);
        this.f21003s = new AtomicBoolean(false);
        this.f21005u = new AtomicBoolean(false);
        this.f21006v = new AtomicBoolean(false);
        this.f21007w = new AtomicBoolean(false);
        this.f21008x = new AtomicBoolean(false);
        this.f21009y = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(f1 this$0, q0 q0Var) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        kotlin.jvm.internal.i.e(q0Var, "<name for destructuring parameter 0>");
        d2 d2VarA = q0Var.a();
        i0 i0VarB = d2VarA.b();
        if (i0VarB != null) {
            this$0.f20991f.a((Object) i0VarB, true);
        }
        if (d2VarA instanceof C1468g0) {
            C1468g0 c1468g0 = (C1468g0) d2VarA;
            c4 c4VarN = c1468g0.n();
            if (c4VarN != null) {
                this$0.f20990e.a((Object) c4VarN, true);
            }
            C1472j c1472jL = c1468g0.l();
            if (c1472jL != null) {
                this$0.f20994i.a(c1472jL.b());
            }
            if (c1468g0.m().z()) {
                this$0.f20989d.b(false);
            }
            EnumSet enumSetO = c1468g0.o();
            if (enumSetO != null) {
                this$0.f20998n.a(enumSetO);
            }
            if (c1468g0.m().x()) {
                this$0.f20999o.G();
            }
        }
        if (d2VarA instanceof p4) {
            this$0.f21001q.a(((p4) d2VarA).l());
        }
    }

    private final void s() {
        if (!this.f21007w.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, h.f21017b, 3, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, g.f21016b, 3, (Object) null);
            this.f21000p.a();
        }
    }

    private final void t() {
        if (!this.f21008x.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, j.f21019b, 3, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, i.f21018b, 3, (Object) null);
            this.f20989d.h();
        }
    }

    private final void u() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, l.f21021b, 3, (Object) null);
        c2.a(this.f20989d, 0L, 1, (Object) null);
    }

    public final void v() {
        q6 q6Var;
        if (!this.f21003s.compareAndSet(true, false) || (q6Var = this.f21004t) == null) {
            return;
        }
        this.f20992g.a(new l4(q6Var.a(), q6Var.b()));
        this.f21004t = null;
    }

    public final void w() {
        if (this.f21002r.compareAndSet(true, false)) {
            this.f20992g.a(new y3());
        }
    }

    public final void x() {
        b4.a aVar = new b4.a(null, null, null, null, 15, null);
        if (this.f20989d.c()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, m.f21022b, 3, (Object) null);
            aVar.d();
            this.f20989d.a(false);
        }
        if (this.f20989d.b()) {
            this.f21002r.set(true);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, n.f21023b, 3, (Object) null);
            aVar.e();
            this.f20989d.b(false);
        }
        Boolean boolC = aVar.c();
        Boolean bool = Boolean.TRUE;
        if (kotlin.jvm.internal.i.a(boolC, bool) || kotlin.jvm.internal.i.a(aVar.b(), bool)) {
            this.f20989d.a(aVar);
        }
    }

    private final IEventSubscriber g() {
        return new IEventSubscriber() { // from class: bo.app.N
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                f1.a(this.f20669a, (p3) obj);
            }
        };
    }

    private final IEventSubscriber l() {
        return new IEventSubscriber() { // from class: bo.app.F
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                f1.a(this.f20657a, (c6) obj);
            }
        };
    }

    private final IEventSubscriber n() {
        return new IEventSubscriber() { // from class: bo.app.P
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                f1.a(this.f20672a, (s6) obj);
            }
        };
    }

    private final IEventSubscriber o() {
        return new IEventSubscriber() { // from class: bo.app.M
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                f1.a(this.f20668a, (z6) obj);
            }
        };
    }

    private final void q() {
        if (!this.f21006v.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, d.f21013b, 3, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, c.f21012b, 3, (Object) null);
            c2.a(this.f20989d, this.f20997m.e(), this.f20997m.f(), 0, false, 12, null);
        }
    }

    private final void r() {
        if (!this.f21009y.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, f.f21015b, 3, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, e.f21014b, 3, (Object) null);
            this.f20989d.d();
        }
    }

    public final IEventSubscriber b() {
        return new IEventSubscriber() { // from class: bo.app.J
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                f1.a(this.f20665a, (p0) obj);
            }
        };
    }

    public final IEventSubscriber c() {
        return new IEventSubscriber() { // from class: bo.app.I
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                f1.a(this.f20664a, (q0) obj);
            }
        };
    }

    public final IEventSubscriber d() {
        return new IEventSubscriber() { // from class: bo.app.L
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                f1.a(this.f20667a, (n1) obj);
            }
        };
    }

    public final IEventSubscriber e() {
        return new IEventSubscriber() { // from class: bo.app.U
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                f1.a(this.f20676a, (w1) obj);
            }
        };
    }

    public final IEventSubscriber f() {
        return new E(0, this);
    }

    public final IEventSubscriber h() {
        return new IEventSubscriber() { // from class: bo.app.S
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                f1.a(this.f20674a, (q5) obj);
            }
        };
    }

    public final IEventSubscriber i() {
        return new IEventSubscriber() { // from class: bo.app.V
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                f1.a(this.f20677a, (u5) obj);
            }
        };
    }

    public final IEventSubscriber j() {
        return new IEventSubscriber() { // from class: bo.app.K
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                f1.a(this.f20666a, (w5) obj);
            }
        };
    }

    public final IEventSubscriber k() {
        return new IEventSubscriber() { // from class: bo.app.G
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                f1.a(this.f20660a, (x5) obj);
            }
        };
    }

    public final IEventSubscriber m() {
        return new IEventSubscriber() { // from class: bo.app.T
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                f1.a(this.f20675a, (q6) obj);
            }
        };
    }

    public final IEventSubscriber p() {
        return new IEventSubscriber() { // from class: bo.app.H
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                f1.a(this.f20662a, (b7) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(f1 this$0, p0 p0Var) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        kotlin.jvm.internal.i.e(p0Var, "<name for destructuring parameter 0>");
        d2 d2VarA = p0Var.a();
        i0 i0VarB = d2VarA.b();
        if (i0VarB != null) {
            this$0.f20991f.a((Object) i0VarB, false);
        }
        if (d2VarA instanceof C1468g0) {
            C1468g0 c1468g0 = (C1468g0) d2VarA;
            if (c1468g0.m().z()) {
                this$0.w();
                this$0.v();
                this$0.f20989d.b(true);
            }
            c4 c4VarN = c1468g0.n();
            if (c4VarN != null) {
                this$0.f20990e.a((Object) c4VarN, false);
                if (c4VarN.v().has("push_token")) {
                    this$0.f20990e.g();
                    this$0.f20991f.e();
                }
            }
            C1472j c1472jL = c1468g0.l();
            if (c1472jL != null) {
                Iterator it = c1472jL.b().iterator();
                while (it.hasNext()) {
                    this$0.f20988c.a(n0.f21651e.a(M1.k((a2) it.next())), n0.class);
                }
            }
            if (c1468g0.m().x()) {
                this$0.f20999o.G();
            }
        }
        if (d2VarA instanceof p4) {
            this$0.f21001q.b(((p4) d2VarA).l());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(f1 this$0, u5 it) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        kotlin.jvm.internal.i.e(it, "it");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this$0, (BrazeLogger.Priority) null, (Throwable) null, o.f21024b, 3, (Object) null);
        this$0.f20987b.a();
        a2 a2VarA = C1471i.f21202h.a(it.a().s());
        if (a2VarA != null) {
            a2VarA.a(it.a().s());
        }
        if (a2VarA != null) {
            this$0.f20989d.a(a2VarA);
        }
        this$0.f20989d.b(true);
        this$0.f20989d.a(true);
        this$0.f20990e.g();
        this$0.f20991f.e();
        this$0.u();
        if (this$0.f20996l.isAutomaticGeofenceRequestsEnabled()) {
            BrazeLogger.brazelog$default(brazeLogger, this$0, (BrazeLogger.Priority) null, (Throwable) null, p.f21025b, 3, (Object) null);
            BrazeInternal.requestGeofenceRefresh(this$0.f20986a, false);
        } else {
            BrazeLogger.brazelog$default(brazeLogger, this$0, (BrazeLogger.Priority) null, (Throwable) null, q.f21026b, 3, (Object) null);
        }
        this$0.f21000p.i();
        this$0.x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(f1 this$0, x5 it) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        kotlin.jvm.internal.i.e(it, "it");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this$0, (BrazeLogger.Priority) null, (Throwable) null, r.f21027b, 3, (Object) null);
        this$0.f21005u.set(true);
        if (this$0.f20999o.x()) {
            this$0.q();
        } else {
            BrazeLogger.brazelog$default(brazeLogger, this$0, (BrazeLogger.Priority) null, (Throwable) null, s.f21028b, 3, (Object) null);
        }
        if (this$0.f20999o.A()) {
            this$0.s();
        } else {
            BrazeLogger.brazelog$default(brazeLogger, this$0, (BrazeLogger.Priority) null, (Throwable) null, t.f21029b, 3, (Object) null);
        }
        if (this$0.f20999o.E()) {
            this$0.t();
        } else {
            BrazeLogger.brazelog$default(brazeLogger, this$0, (BrazeLogger.Priority) null, (Throwable) null, u.f21030b, 3, (Object) null);
        }
        if (this$0.f20999o.y()) {
            this$0.r();
        } else {
            BrazeLogger.brazelog$default(brazeLogger, this$0, (BrazeLogger.Priority) null, (Throwable) null, v.f21031b, 3, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(f1 this$0, p3 it) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        kotlin.jvm.internal.i.e(it, "it");
        this$0.f20989d.b(true);
        this$0.x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(f1 this$0, w5 message) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        kotlin.jvm.internal.i.e(message, "message");
        this$0.a(message);
        Braze.Companion.getInstance(this$0.f20986a).requestImmediateDataFlush();
        this$0.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(f1 this$0, q5 q5Var) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        kotlin.jvm.internal.i.e(q5Var, "<name for destructuring parameter 0>");
        p5 p5VarA = q5Var.a();
        this$0.j.configureFromServerConfig(p5VarA);
        if (this$0.f21005u.get()) {
            if (p5VarA.z()) {
                this$0.q();
            }
            if (p5VarA.l()) {
                this$0.s();
            }
            if (p5VarA.w()) {
                this$0.t();
            }
            if (p5VarA.A()) {
                this$0.r();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(f1 this$0, w1 w1Var) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        kotlin.jvm.internal.i.e(w1Var, "<name for destructuring parameter 0>");
        this$0.j.registerGeofences(w1Var.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(f1 this$0, n1 n1Var) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        kotlin.jvm.internal.i.e(n1Var, "<name for destructuring parameter 0>");
        this$0.f20995k.a(this$0.f21000p.a(n1Var.a()), FeatureFlagsUpdatedEvent.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(f1 this$0, q6 message) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        kotlin.jvm.internal.i.e(message, "message");
        this$0.f21003s.set(true);
        this$0.f21004t = message;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this$0, BrazeLogger.Priority.I, (Throwable) null, y.f21034b, 2, (Object) null);
        this$0.f20989d.a(new b4.a(null, null, null, null, 15, null).e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(f1 this$0, b7 b7Var) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        kotlin.jvm.internal.i.e(b7Var, "<name for destructuring parameter 0>");
        this$0.f20992g.a(b7Var.a());
        this$0.w();
        this$0.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(f1 this$0, s6 s6Var) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        kotlin.jvm.internal.i.e(s6Var, "<name for destructuring parameter 0>");
        this$0.f20992g.a(s6Var.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(f1 this$0, g3 g3Var) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        kotlin.jvm.internal.i.e(g3Var, "<name for destructuring parameter 0>");
        x2 x2VarA = g3Var.a();
        c3 c3VarB = g3Var.b();
        IInAppMessage iInAppMessageC = g3Var.c();
        String strD = g3Var.d();
        synchronized (this$0.f20993h) {
            try {
                if (this$0.f20993h.b(c3VarB)) {
                    this$0.f20995k.a(new InAppMessageEvent(x2VarA, c3VarB, iInAppMessageC, strD), InAppMessageEvent.class);
                    this$0.f20993h.a(c3VarB, DateTimeUtils.nowInSeconds());
                    this$0.f20992g.a(DateTimeUtils.nowInSeconds());
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this$0, (BrazeLogger.Priority) null, (Throwable) null, new k(c3VarB), 3, (Object) null);
                }
                p293xa.r rVar = p293xa.r.f47939a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(f1 this$0, z6 z6Var) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        kotlin.jvm.internal.i.e(z6Var, "<name for destructuring parameter 0>");
        this$0.f20992g.a(z6Var.a(), z6Var.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(f1 this$0, c6 storageException) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        kotlin.jvm.internal.i.e(storageException, "storageException");
        try {
            this$0.f20989d.b(storageException);
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this$0, BrazeLogger.Priority.E, e10, w.f21032b);
        }
    }

    private final IEventSubscriber a() {
        return new IEventSubscriber() { // from class: bo.app.Q
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                f1.a(this.f20673a, (C1482u) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(f1 this$0, C1482u it) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        kotlin.jvm.internal.i.e(it, "it");
        try {
            c2.a(this$0.f20989d, this$0.f20997m.e(), this$0.f20997m.f(), 0, false, 4, null);
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this$0, BrazeLogger.Priority.E, e10, a.f21010b);
        }
    }

    public final void a(k2 eventMessenger) {
        kotlin.jvm.internal.i.e(eventMessenger, "eventMessenger");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new x(eventMessenger), 3, (Object) null);
        eventMessenger.c(p0.class, b());
        eventMessenger.c(q0.class, c());
        eventMessenger.c(u5.class, i());
        eventMessenger.c(x5.class, k());
        eventMessenger.c(w5.class, j());
        eventMessenger.c(q6.class, m());
        eventMessenger.c(q5.class, h());
        eventMessenger.c(Throwable.class, a((Semaphore) null));
        eventMessenger.c(c6.class, l());
        eventMessenger.c(b7.class, p());
        eventMessenger.c(p3.class, g());
        eventMessenger.c(w1.class, e());
        eventMessenger.c(n1.class, d());
        eventMessenger.c(s6.class, n());
        eventMessenger.c(g3.class, f());
        eventMessenger.c(z6.class, o());
        eventMessenger.c(C1482u.class, a());
    }

    public final IEventSubscriber a(final Semaphore semaphore) {
        return new IEventSubscriber() { // from class: bo.app.O
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                f1.a(this.f20670a, semaphore, (Throwable) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(f1 this$0, Semaphore semaphore, Throwable th) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        if (th != null) {
            try {
                this$0.f20989d.a(th);
            } catch (Exception e10) {
                BrazeLogger.INSTANCE.brazelog(this$0, BrazeLogger.Priority.E, e10, b.f21011b);
                if (semaphore == null) {
                    return;
                }
            } finally {
                if (semaphore != null) {
                    semaphore.release();
                }
            }
        }
    }

    private final void a(w5 w5Var) {
        t5 t5VarA = w5Var.a();
        a2 a2VarA = C1471i.f21202h.a(t5VarA.v());
        if (a2VarA != null) {
            a2VarA.a(t5VarA.s());
            this.f20989d.a(a2VarA);
        }
    }
}
