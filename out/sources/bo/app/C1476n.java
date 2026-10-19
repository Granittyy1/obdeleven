package bo.app;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.braze.BrazeFlushPushDeliveryReceiver;
import com.braze.Constants;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.IEventSubscriber;
import com.braze.models.IBrazeLocation;
import com.braze.support.BrazeLogger;
import com.braze.support.IntentUtils;
import com.braze.support.JsonUtils;
import com.google.android.gms.internal.measurement.M1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.C2702l0;
import kotlinx.coroutines.InterfaceC2694i0;
import org.json.JSONObject;

/* JADX INFO: renamed from: bo.app.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1476n implements c2 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final a f21591x = new a(null);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String[] f21592y = {"android.os.deadsystemexception"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f21593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1480s f21595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k2 f21596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final BrazeConfigurationProvider f21597e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final r5 f21598f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final i1 f21599g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f21600h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C1477o f21601i;
    private final l5 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final r4 f21602k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final o4 f21603l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final q4 f21604m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AtomicInteger f21605n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final AtomicInteger f21606o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ReentrantLock f21607p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private InterfaceC2694i0 f21608q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final e1 f21609r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final l6 f21610s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private volatile String f21611t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final AtomicBoolean f21612u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final AtomicBoolean f21613v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Class f21614w;

    /* JADX INFO: renamed from: bo.app.n$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean a(boolean z10, a2 a2Var) {
            if (!z10) {
                return false;
            }
            if (a2Var.a() == j1.PUSH_ACTION_BUTTON_CLICKED) {
                return !((j4) a2Var).x();
            }
            return a2Var.a() == j1.PUSH_CLICKED || a2Var.a() == j1.PUSH_STORY_PAGE_CLICK;
        }
    }

    /* JADX INFO: renamed from: bo.app.n$a0 */
    public static final class a0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a0 f21615b = new a0();

        public a0() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Posting geofence report for geofence event.";
        }
    }

    /* JADX INFO: renamed from: bo.app.n$b */
    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f21616b = new b();

        public b() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "SDK is disabled. Not adding request to dispatch.";
        }
    }

    /* JADX INFO: renamed from: bo.app.n$b0 */
    public static final class b0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b0 f21617b = new b0();

        public b0() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Posting feature flags refresh request.";
        }
    }

    /* JADX INFO: renamed from: bo.app.n$c */
    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f21618b = new c();

        public c() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "SDK is disabled. Not closing session.";
        }
    }

    /* JADX INFO: renamed from: bo.app.n$c0 */
    public static final class c0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c0 f21619b = new c0();

        public c0() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Disallowing Content Cards sync due to Content Cards not being enabled.";
        }
    }

    /* JADX INFO: renamed from: bo.app.n$d */
    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f21620b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Activity activity) {
            super(0);
            this.f21620b = activity;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Closed session with activity: " + this.f21620b.getLocalClassName();
        }
    }

    /* JADX INFO: renamed from: bo.app.n$d0 */
    public static final class d0 extends Lambda implements Ia.a {
        public d0() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Content card sync proceeding: " + C1476n.this.f21610s;
        }
    }

    /* JADX INFO: renamed from: bo.app.n$e */
    public static final class e extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f21622b = new e();

        public e() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "SDK is disabled. Not force closing session.";
        }
    }

    /* JADX INFO: renamed from: bo.app.n$e0 */
    public static final class e0 extends Lambda implements Ia.a {
        public e0() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Content card sync being throttled: " + C1476n.this.f21610s;
        }
    }

    /* JADX INFO: renamed from: bo.app.n$f */
    public static final class f extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Throwable f21624b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Throwable th) {
            super(0);
            this.f21624b = th;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Not logging duplicate error: " + this.f21624b;
        }
    }

    /* JADX INFO: renamed from: bo.app.n$f0 */
    public static final class f0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f0 f21625b = new f0();

        public f0() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Requesting DUST mite";
        }
    }

    /* JADX INFO: renamed from: bo.app.n$g */
    public static final class g extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final g f21626b = new g();

        public g() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to log error.";
        }
    }

    /* JADX INFO: renamed from: bo.app.n$g0 */
    public static final class g0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final g0 f21627b = new g0();

        public g0() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Posting geofence request for location.";
        }
    }

    /* JADX INFO: renamed from: bo.app.n$h */
    public static final class h extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a2 f21628b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(a2 a2Var) {
            super(0);
            this.f21628b = a2Var;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "SDK is disabled. Not logging event: " + this.f21628b;
        }
    }

    /* JADX INFO: renamed from: bo.app.n$h0 */
    public static final class h0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final h0 f21629b = new h0();

        public h0() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Sending Push Max data";
        }
    }

    /* JADX INFO: renamed from: bo.app.n$i */
    public static final class i extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a2 f21630b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(a2 a2Var) {
            super(0);
            this.f21630b = a2Var;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Not processing event after validation failed: " + this.f21630b;
        }
    }

    /* JADX INFO: renamed from: bo.app.n$i0 */
    public static final class i0 extends Lambda implements Ia.a {
        public i0() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Updated shouldRequestFeedInNextRequest to: " + C1476n.this.f21613v;
        }
    }

    /* JADX INFO: renamed from: bo.app.n$j */
    public static final class j extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a2 f21632b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(a2 a2Var) {
            super(0);
            this.f21632b = a2Var;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Not adding user id to event: " + JsonUtils.getPrettyPrintedString((JSONObject) this.f21632b.forJsonPut());
        }
    }

    /* JADX INFO: renamed from: bo.app.n$j0 */
    public static final class j0 extends Lambda implements Ia.a {
        public j0() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Updated shouldRequestTriggersInNextRequest to: " + C1476n.this.f21612u;
        }
    }

    /* JADX INFO: renamed from: bo.app.n$k */
    public static final class k extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a2 f21634b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(a2 a2Var) {
            super(0);
            this.f21634b = a2Var;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Attempting to log event: " + JsonUtils.getPrettyPrintedString((JSONObject) this.f21634b.forJsonPut());
        }
    }

    /* JADX INFO: renamed from: bo.app.n$l */
    public static final class l extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final l f21635b = new l();

        public l() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Publishing an internal push body clicked event for any awaiting triggers.";
        }
    }

    /* JADX INFO: renamed from: bo.app.n$m */
    public static final class m extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final m f21636b = new m();

        public m() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Adding push click to dispatcher pending list";
        }
    }

    /* JADX INFO: renamed from: bo.app.n$n, reason: collision with other inner class name */
    public static final class C0227n extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0227n f21637b = new C0227n();

        public C0227n() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Session in background, data syncing event on delay";
        }
    }

    /* JADX INFO: renamed from: bo.app.n$o */
    public static final class o extends SuspendLambda implements Ia.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f21638b;

        public o(kotlin.coroutines.c cVar) {
            super(2, cVar);
        }

        @Override // Ia.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c cVar) {
            return ((o) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return C1476n.this.new o(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.f21638b;
            if (i10 == 0) {
                kotlin.b.b(obj);
                this.f21638b = 1;
                if (kotlinx.coroutines.I.b(1000L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            C1476n.this.e();
            return p293xa.r.f47939a;
        }
    }

    /* JADX INFO: renamed from: bo.app.n$p */
    public static final class p extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a2 f21640b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(a2 a2Var) {
            super(0);
            this.f21640b = a2Var;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Not adding session id to event: " + JsonUtils.getPrettyPrintedString((JSONObject) this.f21640b.forJsonPut());
        }
    }

    /* JADX INFO: renamed from: bo.app.n$q */
    public static final class q extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21641b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(String str) {
            super(0);
            this.f21641b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Logging push delivery event for campaign id: " + this.f21641b;
        }
    }

    /* JADX INFO: renamed from: bo.app.n$r */
    public static final class r extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final r f21642b = new r();

        public r() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Logging push max campaign";
        }
    }

    /* JADX INFO: renamed from: bo.app.n$s */
    public static final class s extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final s f21643b = new s();

        public s() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "SDK is disabled. Not opening session.";
        }
    }

    /* JADX INFO: renamed from: bo.app.n$t */
    public static final class t extends Lambda implements Ia.a {
        public t() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Completed the openSession call. Starting or continuing session " + C1476n.this.f21595c.h();
        }
    }

    /* JADX INFO: renamed from: bo.app.n$u */
    public static final class u extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final u f21645b = new u();

        public u() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "SDK is disabled. Not opening session.";
        }
    }

    /* JADX INFO: renamed from: bo.app.n$v */
    public static final class v extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f21646b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(Activity activity) {
            super(0);
            this.f21646b = activity;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Opened session with activity: " + this.f21646b.getLocalClassName();
        }
    }

    /* JADX INFO: renamed from: bo.app.n$w */
    public static final class w extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final w f21647b = new w();

        public w() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to get local class name for activity when opening session";
        }
    }

    /* JADX INFO: renamed from: bo.app.n$x */
    public static final class x extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final x f21648b = new x();

        public x() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Flushing Push Delivery Events now";
        }
    }

    /* JADX INFO: renamed from: bo.app.n$y */
    public static final class y extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final y f21649b = new y();

        public y() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Attempted to flush Push Delivery events, but no events are available";
        }
    }

    /* JADX INFO: renamed from: bo.app.n$z */
    public static final class z extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f21650b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(long j) {
            super(0);
            this.f21650b = j;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return p005a4.o.d(this.f21650b, " ms", new StringBuilder("Scheduling Push Delivery Events Flush in "));
        }
    }

    public C1476n(Context context, String str, String apiKey, C1480s sessionManager, k2 internalEventPublisher, BrazeConfigurationProvider configurationProvider, r5 serverConfigStorageProvider, i1 eventStorageManager, boolean z10, C1477o messagingSessionManager, l5 sdkEnablementProvider, r4 pushMaxManager, o4 pushDeliveryManager, q4 pushIdentifierStorageProvider) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(apiKey, "apiKey");
        kotlin.jvm.internal.i.e(sessionManager, "sessionManager");
        kotlin.jvm.internal.i.e(internalEventPublisher, "internalEventPublisher");
        kotlin.jvm.internal.i.e(configurationProvider, "configurationProvider");
        kotlin.jvm.internal.i.e(serverConfigStorageProvider, "serverConfigStorageProvider");
        kotlin.jvm.internal.i.e(eventStorageManager, "eventStorageManager");
        kotlin.jvm.internal.i.e(messagingSessionManager, "messagingSessionManager");
        kotlin.jvm.internal.i.e(sdkEnablementProvider, "sdkEnablementProvider");
        kotlin.jvm.internal.i.e(pushMaxManager, "pushMaxManager");
        kotlin.jvm.internal.i.e(pushDeliveryManager, "pushDeliveryManager");
        kotlin.jvm.internal.i.e(pushIdentifierStorageProvider, "pushIdentifierStorageProvider");
        this.f21593a = context;
        this.f21594b = str;
        this.f21595c = sessionManager;
        this.f21596d = internalEventPublisher;
        this.f21597e = configurationProvider;
        this.f21598f = serverConfigStorageProvider;
        this.f21599g = eventStorageManager;
        this.f21600h = z10;
        this.f21601i = messagingSessionManager;
        this.j = sdkEnablementProvider;
        this.f21602k = pushMaxManager;
        this.f21603l = pushDeliveryManager;
        this.f21604m = pushIdentifierStorageProvider;
        this.f21605n = new AtomicInteger(0);
        this.f21606o = new AtomicInteger(0);
        this.f21607p = new ReentrantLock();
        this.f21608q = C2702l0.a();
        this.f21609r = new e1(context, a(), apiKey);
        this.f21610s = new l6(serverConfigStorageProvider.h(), serverConfigStorageProvider.i());
        this.f21611t = "";
        this.f21612u = new AtomicBoolean(false);
        this.f21613v = new AtomicBoolean(false);
        internalEventPublisher.c(i5.class, new IEventSubscriber() { // from class: bo.app.C0
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                C1476n.a(this.f20649a, (i5) obj);
            }
        });
    }

    @Override // bo.app.c2
    public void closeSession(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
        if (this.j.a()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, c.f21618b, 2, (Object) null);
        } else if (this.f21614w == null || activity.getClass().equals(this.f21614w)) {
            this.f21601i.c();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new d(activity), 2, (Object) null);
            this.f21595c.o();
        }
    }

    @Override // bo.app.c2
    public void e() {
        a(new b4.a(null, null, null, null, 15, null));
    }

    @Override // bo.app.c2
    public void f() {
        if (this.j.a()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, s.f21643b, 2, (Object) null);
        } else {
            this.f21595c.m();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new t(), 2, (Object) null);
        }
    }

    @Override // bo.app.c2
    public void g() {
        if (this.j.a()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, e.f21622b, 2, (Object) null);
        } else {
            this.f21614w = null;
            this.f21595c.l();
        }
    }

    @Override // bo.app.c2
    public void h() {
        if (this.f21598f.E()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, h0.f21629b, 3, (Object) null);
            r5 r5Var = this.f21598f;
            String baseUrlForRequests = this.f21597e.getBaseUrlForRequests();
            String strA = a();
            List listA = this.f21602k.a();
            ArrayList arrayList = new ArrayList(kotlin.collections.m.y(listA, 10));
            Iterator it = listA.iterator();
            while (it.hasNext()) {
                arrayList.add(((r4.a) it.next()).a());
            }
            a(new t4(r5Var, baseUrlForRequests, strA, arrayList, this.f21602k.b(), this.f21604m.a(this.f21598f.u())));
        }
    }

    public v5 i() {
        return this.f21595c.h();
    }

    @Override // bo.app.c2
    public void openSession(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
        if (this.j.a()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, u.f21645b, 2, (Object) null);
            return;
        }
        f();
        this.f21614w = activity.getClass();
        this.f21601i.b();
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new v(activity), 2, (Object) null);
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, w.f21647b);
        }
    }

    @Override // bo.app.c2
    public void refreshFeatureFlags() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, b0.f21617b, 3, (Object) null);
        a(new q1(this.f21598f, this.f21597e.getBaseUrlForRequests(), a()));
    }

    @Override // bo.app.c2
    public String a() {
        return this.f21594b;
    }

    @Override // bo.app.c2
    public void c(boolean z10) {
        this.f21600h = z10;
    }

    @Override // bo.app.c2
    public void d() {
        if (this.f21598f.y()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, f0.f21625b, 2, (Object) null);
            a(new s0(this.f21598f, this.f21597e.getBaseUrlForRequests(), a()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C1476n this$0, i5 it) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        kotlin.jvm.internal.i.e(it, "it");
        throw null;
    }

    @Override // bo.app.c2
    public boolean b() {
        return this.f21612u.get();
    }

    @Override // bo.app.c2
    public boolean c() {
        return this.f21613v.get();
    }

    private final boolean c(Throwable th) {
        ReentrantLock reentrantLock = this.f21607p;
        reentrantLock.lock();
        try {
            this.f21605n.getAndIncrement();
            if (kotlin.jvm.internal.i.a(this.f21611t, th.getMessage()) && this.f21606o.get() > 3 && this.f21605n.get() < 100) {
                return true;
            }
            if (kotlin.jvm.internal.i.a(this.f21611t, th.getMessage())) {
                this.f21606o.getAndIncrement();
            } else {
                this.f21606o.set(0);
            }
            if (this.f21605n.get() >= 100) {
                this.f21605n.set(0);
            }
            this.f21611t = th.getMessage();
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // bo.app.c2
    public void a(boolean z10) {
        this.f21613v.set(z10);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new i0(), 2, (Object) null);
    }

    @Override // bo.app.c2
    public void b(boolean z10) {
        this.f21612u.set(z10);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new j0(), 2, (Object) null);
    }

    @Override // bo.app.c2
    public boolean a(a2 event) {
        kotlin.jvm.internal.i.e(event, "event");
        boolean z10 = false;
        if (this.j.a()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new h(event), 2, (Object) null);
            return false;
        }
        if (!this.f21609r.a(event)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new i(event), 2, (Object) null);
            return false;
        }
        if (!this.f21595c.j() && this.f21595c.h() != null) {
            event.a(this.f21595c.h());
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new p(event), 3, (Object) null);
            z10 = true;
        }
        String strA = a();
        if (strA != null && strA.length() != 0) {
            event.a(a());
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new j(event), 3, (Object) null);
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, new k(event), 2, (Object) null);
        if (event.a() == j1.PUSH_CLICKED) {
            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, l.f21635b, 3, (Object) null);
            a((m4) event);
        }
        if (!event.m()) {
            this.f21599g.a(event);
        }
        if (f21591x.a(z10, event)) {
            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, m.f21636b, 3, (Object) null);
            this.f21596d.a(n0.f21651e.b(M1.k(event)), n0.class);
        } else {
            this.f21596d.a(n0.f21651e.a(M1.k(event)), n0.class);
        }
        if (event.a() == j1.SESSION_START) {
            this.f21596d.a(n0.f21651e.a(event.s()), n0.class);
        }
        if (z10) {
            BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, C0227n.f21637b, 2, (Object) null);
            this.f21608q.i(null);
            this.f21608q = C2680e.c(BrazeCoroutineScope.INSTANCE, null, null, new o(null), 3);
        }
        return true;
    }

    @Override // bo.app.c2
    public void b(Throwable throwable) {
        kotlin.jvm.internal.i.e(throwable, "throwable");
        a(throwable, false);
    }

    @Override // bo.app.c2
    public void b(a2 geofenceEvent) {
        kotlin.jvm.internal.i.e(geofenceEvent, "geofenceEvent");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, a0.f21615b, 3, (Object) null);
        a(new v1(this.f21598f, this.f21597e.getBaseUrlForRequests(), geofenceEvent));
    }

    @Override // bo.app.c2
    public void b(String campaignId) {
        kotlin.jvm.internal.i.e(campaignId, "campaignId");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, r.f21642b, 3, (Object) null);
        this.f21602k.a(campaignId);
    }

    @Override // bo.app.c2
    public void a(Throwable throwable) {
        kotlin.jvm.internal.i.e(throwable, "throwable");
        a(throwable, true);
    }

    @Override // bo.app.c2
    public void a(b4.a respondWithBuilder) {
        kotlin.jvm.internal.i.e(respondWithBuilder, "respondWithBuilder");
        Pair pairC = this.f21598f.c();
        if (pairC != null) {
            respondWithBuilder.a(new a4(((Number) pairC.c()).longValue(), ((Boolean) pairC.d()).booleanValue()));
        }
        if (this.f21612u.get()) {
            respondWithBuilder.e();
        }
        respondWithBuilder.a(a());
        a(new C1468g0(this.f21598f, this.f21597e.getBaseUrlForRequests(), respondWithBuilder.a()));
        this.f21612u.set(false);
    }

    @Override // bo.app.c2
    public void a(IBrazeLocation location) {
        kotlin.jvm.internal.i.e(location, "location");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, g0.f21627b, 3, (Object) null);
        a(new u1(this.f21598f, this.f21597e.getBaseUrlForRequests(), location));
    }

    public void a(d2 request) {
        kotlin.jvm.internal.i.e(request, "request");
        if (this.j.a()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, b.f21616b, 2, (Object) null);
        } else {
            request.a(a());
            this.f21596d.a(n0.f21651e.a(request), n0.class);
        }
    }

    @Override // bo.app.c2
    public void a(i6 templatedTriggeredAction, x2 triggerEvent) {
        kotlin.jvm.internal.i.e(templatedTriggeredAction, "templatedTriggeredAction");
        kotlin.jvm.internal.i.e(triggerEvent, "triggerEvent");
        a(new h6(this.f21598f, this.f21597e.getBaseUrlForRequests(), templatedTriggeredAction, triggerEvent, a()));
    }

    @Override // bo.app.c2
    public void a(x2 triggerEvent) {
        kotlin.jvm.internal.i.e(triggerEvent, "triggerEvent");
        this.f21596d.a(new s6(triggerEvent), s6.class);
    }

    @Override // bo.app.c2
    public void a(long j10, long j11, int i10, boolean z10) {
        if (!this.f21598f.x()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, c0.f21619b, 2, (Object) null);
            return;
        }
        if ((z10 && this.f21598f.w()) ? this.f21610s.a() : true) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new d0(), 2, (Object) null);
            a(new C1487z(this.f21598f, this.f21597e.getBaseUrlForRequests(), j10, j11, a(), i10));
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new e0(), 2, (Object) null);
        }
    }

    public final void a(Throwable throwable, boolean z10) {
        kotlin.jvm.internal.i.e(throwable, "throwable");
        try {
            if (c(throwable)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new f(throwable), 2, (Object) null);
                return;
            }
            String string = throwable.toString();
            for (String str : f21592y) {
                Locale US = Locale.US;
                kotlin.jvm.internal.i.d(US, "US");
                String lowerCase = string.toLowerCase(US);
                kotlin.jvm.internal.i.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (kotlin.text.n.J(lowerCase, str, false)) {
                    return;
                }
            }
            a2 a2VarA = C1471i.f21202h.a(throwable, i(), z10);
            if (a2VarA != null) {
                a(a2VarA);
            }
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, g.f21626b);
        }
    }

    public final void a(m4 notificationTrackingBrazeEvent) {
        kotlin.jvm.internal.i.e(notificationTrackingBrazeEvent, "notificationTrackingBrazeEvent");
        String campaignId = notificationTrackingBrazeEvent.q().optString(Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY, "");
        k2 k2Var = this.f21596d;
        kotlin.jvm.internal.i.d(campaignId, "campaignId");
        k2Var.a(new q6(campaignId, notificationTrackingBrazeEvent), q6.class);
    }

    @Override // bo.app.c2
    public void a(long j10) {
        Object systemService = this.f21593a.getSystemService("alarm");
        kotlin.jvm.internal.i.c(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        AlarmManager alarmManager = (AlarmManager) systemService;
        Intent intent = new Intent(this.f21593a, (Class<?>) BrazeFlushPushDeliveryReceiver.class);
        intent.setAction(BrazeFlushPushDeliveryReceiver.FLUSH_BRAZE_PUSH_DELIVERIES_ACTION);
        PendingIntent broadcast = PendingIntent.getBroadcast(this.f21593a, 0, intent, IntentUtils.getImmutablePendingIntentFlags() | 134217728);
        if (j10 <= 0) {
            alarmManager.cancel(broadcast);
            List listA = this.f21603l.a();
            if (!listA.isEmpty()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, x.f21648b, 3, (Object) null);
                a(new p4(this.f21598f, this.f21597e.getBaseUrlForRequests(), a(), listA));
                return;
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, y.f21649b, 3, (Object) null);
                return;
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new z(j10), 3, (Object) null);
        alarmManager.set(2, SystemClock.elapsedRealtime() + j10, broadcast);
    }

    @Override // bo.app.c2
    public void a(String campaignId) {
        kotlin.jvm.internal.i.e(campaignId, "campaignId");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new q(campaignId), 3, (Object) null);
        this.f21603l.a(campaignId);
    }
}
