package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.NoMatchingTriggerEvent;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.JsonUtils;
import com.braze.support.StringUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class u6 implements y2 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f22009p = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final long f22010q = TimeUnit.SECONDS.toMillis(30);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f22011r = BrazeLogger.getBrazeLogTag((Class<?>) u6.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f22012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c2 f22013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k2 f22014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private k2 f22015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f22016e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final SharedPreferences f22017f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final v2 f22018g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final b3 f22019h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicInteger f22020i;
    private final Queue j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Map f22021k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f22022l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private volatile long f22023m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ReentrantLock f22024n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ReentrantLock f22025o;

    public static final class a {

        /* JADX INFO: renamed from: bo.app.u6$a$a, reason: collision with other inner class name */
        public static final class C0231a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C0231a f22026b = new C0231a();

            public C0231a() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Ignoring minimum time interval between triggered actions because the trigger event is a test.";
            }
        }

        public static final class b extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f22027b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(int i10) {
                super(0);
                this.f22027b = i10;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Using override minimum display interval: " + this.f22027b;
            }
        }

        public static final class c extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f22028b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f22029c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(long j, long j10) {
                super(0);
                this.f22028b = j;
                this.f22029c = j10;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Minimum time interval requirement met for matched trigger. Action display time: " + this.f22028b + " . Next viable display time: " + this.f22029c;
            }
        }

        public static final class d extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f22030b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f22031c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ long f22032d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(long j, long j10, long j11) {
                super(0);
                this.f22030b = j;
                this.f22031c = j10;
                this.f22032d = j11;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Minimum time interval requirement and triggered action override time interval requirement of " + this.f22030b + " not met for matched trigger. Returning null. Next viable display time: " + this.f22031c + ". Action display time: " + this.f22032d;
            }
        }

        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final boolean a(x2 triggerEvent, c3 action, long j, long j10) {
            long j11;
            kotlin.jvm.internal.i.e(triggerEvent, "triggerEvent");
            kotlin.jvm.internal.i.e(action, "action");
            if (triggerEvent instanceof k6) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, u6.f22011r, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) C0231a.f22026b, 6, (Object) null);
                return true;
            }
            long jNowInSeconds = DateTimeUtils.nowInSeconds() + ((long) action.n().o());
            int iR = action.n().r();
            if (iR != -1) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, u6.f22011r, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) new b(iR), 6, (Object) null);
                j11 = j + ((long) iR);
            } else {
                j11 = j + j10;
            }
            long j12 = j11;
            if (jNowInSeconds >= j12) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, u6.f22011r, BrazeLogger.Priority.I, (Throwable) null, (Ia.a) new c(jNowInSeconds, j12), 4, (Object) null);
                return true;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, u6.f22011r, BrazeLogger.Priority.I, (Throwable) null, (Ia.a) new d(j10, j12, jNowInSeconds), 4, (Object) null);
            return false;
        }

        private a() {
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f22033b = new b();

        public b() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "In flight trigger requests is empty. Executing any pending trigger events.";
        }
    }

    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ x2 f22034b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(x2 x2Var) {
            super(0);
            this.f22034b = x2Var;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "New incoming <" + this.f22034b.d() + ">. Searching for matching triggers.";
        }
    }

    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ x2 f22035b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(x2 x2Var) {
            super(0);
            this.f22035b = x2Var;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "No action found for " + this.f22035b.d() + " event, publishing NoMatchingTriggerEvent";
        }
    }

    public static final class e extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c3 f22036b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(c3 c3Var) {
            super(0);
            this.f22036b = c3Var;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Found potential triggered action for incoming trigger event. Action id " + this.f22036b.getId() + '.';
        }
    }

    public static final class f extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ x2 f22037b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(x2 x2Var) {
            super(0);
            this.f22037b = x2Var;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to match triggered action for incoming <" + this.f22037b.d() + ">.";
        }
    }

    public static final class g extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ x2 f22038b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ref$ObjectRef f22039c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(x2 x2Var, Ref$ObjectRef ref$ObjectRef) {
            super(0);
            this.f22038b = x2Var;
            this.f22039c = ref$ObjectRef;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder("\n     Found best triggered action for incoming trigger event ");
            sb2.append(this.f22038b.a() != null ? JsonUtils.getPrettyPrintedString((JSONObject) this.f22038b.a().forJsonPut()) : "");
            sb2.append(".\n     Matched Action id: ");
            sb2.append(((c3) this.f22039c.element).getId());
            sb2.append(".\n                ");
            return kotlin.text.i.v(sb2.toString());
        }
    }

    public static final class h extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f22040b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(long j) {
            super(0);
            this.f22040b = j;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "TriggerManager lastDisplayTimeSeconds updated to " + this.f22040b;
        }
    }

    public static final class i extends SuspendLambda implements Ia.l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f22041b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c3 f22042c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ u6 f22043d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ x2 f22044e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f22045f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f22046g;

        public static final class a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f22047b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(long j) {
                super(0);
                this.f22047b = j;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return p005a4.o.d(this.f22047b, " ms.", new StringBuilder("Performing triggered action after a delay of "));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(c3 c3Var, u6 u6Var, x2 x2Var, long j, long j10, kotlin.coroutines.c cVar) {
            super(1, cVar);
            this.f22042c = c3Var;
            this.f22043d = u6Var;
            this.f22044e = x2Var;
            this.f22045f = j;
            this.f22046g = j10;
        }

        @Override // Ia.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlin.coroutines.c cVar) {
            return ((i) create(cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(kotlin.coroutines.c cVar) {
            return new i(this.f22042c, this.f22043d, this.f22044e, this.f22045f, this.f22046g, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (this.f22041b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, u6.f22011r, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) new a(this.f22046g), 6, (Object) null);
            this.f22042c.a(this.f22043d.f22012a, this.f22043d.f22014c, this.f22044e, this.f22045f);
            return p293xa.r.f47939a;
        }
    }

    public static final class j extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c3 f22048b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(c3 c3Var) {
            super(0);
            this.f22048b = c3Var;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Trigger manager received reenqueue with action with id: <" + this.f22048b.getId() + ">.";
        }
    }

    public static final class k extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f22049b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(List list) {
            super(0);
            this.f22049b = list;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Registering " + this.f22049b.size() + " new triggered actions.";
        }
    }

    public static final class l extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c3 f22050b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(c3 c3Var) {
            super(0);
            this.f22050b = c3Var;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Registering triggered action id " + this.f22050b.getId() + ' ';
        }
    }

    public static final class m extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final m f22051b = new m();

        public m() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Test triggered actions found, triggering test event.";
        }
    }

    public static final class n extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final n f22052b = new n();

        public n() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "No test triggered actions found.";
        }
    }

    public static final class o extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f22053b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str) {
            super(0);
            this.f22053b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Q8.d.a(new StringBuilder("Received null or blank serialized triggered action string for action id "), this.f22053b, " from shared preferences. Not parsing.");
        }
    }

    public static final class p extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c3 f22054b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(c3 c3Var) {
            super(0);
            this.f22054b = c3Var;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Retrieving templated triggered action id " + this.f22054b.getId() + " from local storage.";
        }
    }

    public static final class q extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final q f22055b = new q();

        public q() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Encountered unexpected exception while parsing stored triggered actions.";
        }
    }

    public static final class r extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c3 f22056b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(c3 c3Var) {
            super(0);
            this.f22056b = c3Var;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Trigger manager received failed triggered action with id: <" + this.f22056b.getId() + ">. Will attempt to perform fallback triggered actions, if present.";
        }
    }

    public static final class s extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final s f22057b = new s();

        public s() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Triggered action has no trigger metadata and cannot fallback. Doing nothing.";
        }
    }

    public static final class t extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final t f22058b = new t();

        public t() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Triggered action has no fallback action to perform. Doing nothing.";
        }
    }

    public static final class u extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c3 f22059b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(c3 c3Var) {
            super(0);
            this.f22059b = c3Var;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Fallback trigger has expired. Trigger id: " + this.f22059b.getId();
        }
    }

    public static final class v extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c3 f22060b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f22061c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(c3 c3Var, long j) {
            super(0);
            this.f22060b = c3Var;
            this.f22061c = j;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder("Performing fallback triggered action with id: <");
            sb2.append(this.f22060b.getId());
            sb2.append("> with a delay: ");
            return p005a4.o.d(this.f22061c, " ms", sb2);
        }
    }

    public static final class w extends SuspendLambda implements Ia.l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f22062b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c3 f22063c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ u6 f22064d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ x2 f22065e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f22066f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(c3 c3Var, u6 u6Var, x2 x2Var, long j, kotlin.coroutines.c cVar) {
            super(1, cVar);
            this.f22063c = c3Var;
            this.f22064d = u6Var;
            this.f22065e = x2Var;
            this.f22066f = j;
        }

        @Override // Ia.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlin.coroutines.c cVar) {
            return ((w) create(cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(kotlin.coroutines.c cVar) {
            return new w(this.f22063c, this.f22064d, this.f22065e, this.f22066f, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (this.f22062b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            this.f22063c.a(this.f22064d.f22012a, this.f22064d.f22014c, this.f22065e, this.f22066f);
            return p293xa.r.f47939a;
        }
    }

    public static final class x extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final x f22067b = new x();

        public x() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Subscribing to trigger dispatch events.";
        }
    }

    public u6(Context context, c2 brazeManager, k2 internalEventPublisher, k2 externalEventPublisher, BrazeConfigurationProvider configurationProvider, String str, String apiKey) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(brazeManager, "brazeManager");
        kotlin.jvm.internal.i.e(internalEventPublisher, "internalEventPublisher");
        kotlin.jvm.internal.i.e(externalEventPublisher, "externalEventPublisher");
        kotlin.jvm.internal.i.e(configurationProvider, "configurationProvider");
        kotlin.jvm.internal.i.e(apiKey, "apiKey");
        this.f22024n = new ReentrantLock();
        this.f22025o = new ReentrantLock();
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.i.d(applicationContext, "context.applicationContext");
        this.f22012a = applicationContext;
        this.f22013b = brazeManager;
        this.f22014c = internalEventPublisher;
        this.f22015d = externalEventPublisher;
        this.f22016e = configurationProvider.getTriggerActionMinimumTimeIntervalInSeconds();
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.appboy.storage.triggers.actions" + StringUtils.getCacheFileSuffix(context, str, apiKey), 0);
        kotlin.jvm.internal.i.d(sharedPreferences, "context.getSharedPrefere…xt.MODE_PRIVATE\n        )");
        this.f22017f = sharedPreferences;
        this.f22018g = new m6(context, apiKey);
        this.f22019h = new x6(context, str, apiKey);
        this.f22021k = e();
        this.f22020i = new AtomicInteger(0);
        this.j = new ArrayDeque();
        f();
    }

    private final void f() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f22011r, BrazeLogger.Priority.V, (Throwable) null, (Ia.a) x.f22067b, 4, (Object) null);
        this.f22014c.c(p6.class, new D(1, this));
        this.f22014c.c(o6.class, new E(1, this));
    }

    public b3 d() {
        return this.f22019h;
    }

    public final Map e() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, ?> all = this.f22017f.getAll();
        if (all != null && !all.isEmpty()) {
            try {
                for (String str : kotlin.collections.q.s0(all.keySet())) {
                    String string = this.f22017f.getString(str, null);
                    if (string == null || kotlin.text.n.S(string)) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f22011r, BrazeLogger.Priority.W, (Throwable) null, (Ia.a) new o(str), 4, (Object) null);
                    } else {
                        c3 c3VarB = w6.f22152a.b(new JSONObject(string), this.f22013b);
                        if (c3VarB != null) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f22011r, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) new p(c3VarB), 6, (Object) null);
                            linkedHashMap.put(c3VarB.getId(), c3VarB);
                        }
                    }
                }
            } catch (Exception e10) {
                BrazeLogger.INSTANCE.brazelog(f22011r, BrazeLogger.Priority.E, (Throwable) e10, (Ia.a<String>) q.f22055b);
            }
        }
        return linkedHashMap;
    }

    public long c() {
        return this.f22023m;
    }

    public final void d(c3 action) {
        kotlin.jvm.internal.i.e(action, "action");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f22011r, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) new j(action), 6, (Object) null);
        a(this.f22022l);
        this.f22022l = 0L;
        d().c(action);
    }

    @Override // bo.app.y2
    public void a(long j10) {
        this.f22022l = this.f22023m;
        this.f22023m = j10;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new h(j10), 3, (Object) null);
    }

    public final void b(x2 triggerEvent) {
        kotlin.jvm.internal.i.e(triggerEvent, "triggerEvent");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, f22011r, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) new c(triggerEvent), 6, (Object) null);
        c3 c3VarC = c(triggerEvent);
        if (c3VarC != null) {
            b(triggerEvent, c3VarC);
            return;
        }
        String strD = triggerEvent.d();
        if (strD != null) {
            int iHashCode = strD.hashCode();
            if (iHashCode != 3417674) {
                if (iHashCode != 717572172) {
                    if (iHashCode != 1743324417 || !strD.equals("purchase")) {
                        return;
                    }
                } else if (!strD.equals("custom_event")) {
                    return;
                }
            } else if (!strD.equals("open")) {
                return;
            }
            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new d(triggerEvent), 3, (Object) null);
            k2 k2Var = this.f22015d;
            String strD2 = triggerEvent.d();
            kotlin.jvm.internal.i.d(strD2, "triggerEvent.triggerEventType");
            k2Var.a(new NoMatchingTriggerEvent(strD2), NoMatchingTriggerEvent.class);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, bo.app.c3, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final c3 c(x2 event) {
        kotlin.jvm.internal.i.e(event, "event");
        ReentrantLock reentrantLock = this.f22024n;
        reentrantLock.lock();
        try {
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ArrayList arrayList = new ArrayList();
            int i10 = Integer.MIN_VALUE;
            for (?? r10 : this.f22021k.values()) {
                if (r10.b(event) && d().b(r10) && f22009p.a(event, r10, c(), this.f22016e)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f22011r, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) new e(r10), 6, (Object) null);
                    int iJ = r10.n().j();
                    if (iJ > i10) {
                        ref$ObjectRef.element = r10;
                        i10 = iJ;
                    }
                    arrayList.add(r10);
                }
            }
            Object obj = ref$ObjectRef.element;
            if (obj == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f22011r, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) new f(event), 6, (Object) null);
                reentrantLock.unlock();
                return null;
            }
            arrayList.remove(obj);
            ((c3) ref$ObjectRef.element).a(new v6(arrayList));
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f22011r, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) new g(event, ref$ObjectRef), 6, (Object) null);
            c3 c3Var = (c3) ref$ObjectRef.element;
            reentrantLock.unlock();
            return c3Var;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // bo.app.a3
    public void a(List triggeredActions) {
        kotlin.jvm.internal.i.e(triggeredActions, "triggeredActions");
        k6 k6Var = new k6();
        ReentrantLock reentrantLock = this.f22024n;
        reentrantLock.lock();
        try {
            this.f22021k.clear();
            SharedPreferences.Editor editorClear = this.f22017f.edit().clear();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f22011r, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) new k(triggeredActions), 6, (Object) null);
            Iterator it = triggeredActions.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                c3 c3Var = (c3) it.next();
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f22011r, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) new l(c3Var), 6, (Object) null);
                this.f22021k.put(c3Var.getId(), c3Var);
                editorClear.putString(c3Var.getId(), String.valueOf(c3Var.forJsonPut()));
                if (c3Var.b(k6Var)) {
                    z10 = true;
                }
            }
            editorClear.apply();
            p293xa.r rVar = p293xa.r.f47939a;
            reentrantLock.unlock();
            d().a(triggeredActions);
            this.f22018g.a(triggeredActions);
            if (z10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f22011r, BrazeLogger.Priority.I, (Throwable) null, (Ia.a) m.f22051b, 4, (Object) null);
                a(k6Var);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f22011r, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) n.f22052b, 6, (Object) null);
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void b() {
        ReentrantLock reentrantLock = this.f22025o;
        reentrantLock.lock();
        try {
            if (this.f22020i.get() > 0) {
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f22011r, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) b.f22033b, 6, (Object) null);
            while (!this.j.isEmpty()) {
                x2 x2Var = (x2) this.j.poll();
                if (x2Var != null) {
                    b(x2Var);
                }
            }
            p293xa.r rVar = p293xa.r.f47939a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(x2 event, c3 action) {
        kotlin.jvm.internal.i.e(event, "event");
        kotlin.jvm.internal.i.e(action, "action");
        action.a(this.f22018g.a(action));
        s2 s2VarN = action.n();
        long jE = s2VarN.k() != -1 ? event.e() + ((long) s2VarN.k()) : -1L;
        long millis = TimeUnit.SECONDS.toMillis(s2VarN.o());
        BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Long.valueOf(millis), null, new i(action, this, event, jE, millis, null), 2, null);
    }

    @Override // bo.app.y2
    public void a(x2 triggerEvent) {
        kotlin.jvm.internal.i.e(triggerEvent, "triggerEvent");
        ReentrantLock reentrantLock = this.f22025o;
        reentrantLock.lock();
        try {
            this.j.add(triggerEvent);
            if (this.f22020i.get() == 0) {
                b();
            }
            p293xa.r rVar = p293xa.r.f47939a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // bo.app.y2
    public void a(x2 triggerEvent, c3 failedAction) {
        kotlin.jvm.internal.i.e(triggerEvent, "triggerEvent");
        kotlin.jvm.internal.i.e(failedAction, "failedAction");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        String str = f22011r;
        BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) new r(failedAction), 6, (Object) null);
        v6 v6VarC = failedAction.c();
        if (v6VarC == null) {
            BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) s.f22057b, 6, (Object) null);
            return;
        }
        c3 c3VarA = v6VarC.a();
        if (c3VarA == null) {
            BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) t.f22058b, 6, (Object) null);
            return;
        }
        c3VarA.a(v6VarC);
        c3VarA.a(this.f22018g.a(c3VarA));
        long jE = triggerEvent.e();
        s2 s2VarN = c3VarA.n();
        long jK = s2VarN.k();
        long millis = TimeUnit.SECONDS.toMillis(s2VarN.o());
        long j10 = jK != -1 ? jK + jE : jE + millis + f22010q;
        if (j10 < DateTimeUtils.nowInMilliseconds()) {
            BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) new u(c3VarA), 6, (Object) null);
            a(triggerEvent, c3VarA);
        } else {
            long jMax = Math.max(0L, (millis + jE) - DateTimeUtils.nowInMilliseconds());
            BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) new v(c3VarA, jMax), 6, (Object) null);
            BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Long.valueOf(jMax), null, new w(c3VarA, this, triggerEvent, j10, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(u6 this$0, p6 it) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        kotlin.jvm.internal.i.e(it, "it");
        this$0.f22020i.incrementAndGet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(u6 this$0, o6 it) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        kotlin.jvm.internal.i.e(it, "it");
        this$0.f22020i.decrementAndGet();
        this$0.b();
    }
}
