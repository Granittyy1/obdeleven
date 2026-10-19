package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.IEventSubscriber;
import com.braze.support.BrazeLogger;
import com.braze.support.StringUtils;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.InterfaceC2694i0;

/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f21971f = new f(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f21972g = TimeUnit.SECONDS.toMillis(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r5 f21973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k2 f21974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SharedPreferences f21975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w0 f21976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InterfaceC2694i0 f21977e;

    public static final class a extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f21978b = new a();

        public a() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Cancelling ending of DUST subscription on delay and resuming stream";
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f21979b = new b();

        public b() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Ending DUST subscription on delay";
        }
    }

    public static final class c extends SuspendLambda implements Ia.l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f21980b;

        public static final class a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f21982b = new a();

            public a() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Ending subscription on a delay";
            }
        }

        public c(kotlin.coroutines.c cVar) {
            super(1, cVar);
        }

        @Override // Ia.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlin.coroutines.c cVar) {
            return ((c) create(cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(kotlin.coroutines.c cVar) {
            return u0.this.new c(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (this.f21980b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, u0.this, (BrazeLogger.Priority) null, (Throwable) null, a.f21982b, 3, (Object) null);
            u0.this.a();
            return p293xa.r.f47939a;
        }
    }

    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u3 f21983b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(u3 u3Var) {
            super(0);
            this.f21983b = u3Var;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Got network change event: " + this.f21983b;
        }
    }

    public static final class e extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f21984b = new e();

        public e() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Received MITE value. Starting/resuming a new subscription";
        }
    }

    public static final class f {
        public /* synthetic */ f(kotlin.jvm.internal.e eVar) {
            this();
        }

        private f() {
        }
    }

    public /* synthetic */ class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21985a;

        static {
            int[] iArr = new int[i2.b.values().length];
            try {
                iArr[i2.b.CONTENT_CARD_REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f21985a = iArr;
        }
    }

    public static final class h extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final h f21986b = new h();

        public h() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Ending DUST subscription";
        }
    }

    public static final class i extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i2 f21987b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(i2 i2Var) {
            super(0);
            this.f21987b = i2Var;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Ingesting DUST message\n" + this.f21987b;
        }
    }

    public static final class j extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i2.b f21988b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(i2.b bVar) {
            super(0);
            this.f21988b = bVar;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Lacked logic to ingest message! Type: " + this.f21988b;
        }
    }

    public static final class k extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21989b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str) {
            super(0);
            this.f21989b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "setting mite value to " + this.f21989b;
        }
    }

    public static final class l extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21990b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ u0 f21991c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, u0 u0Var) {
            super(0);
            this.f21990b = str;
            this.f21991c = u0Var;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Cannot start a dust subscription with mite " + this.f21990b + " and enabled " + this.f21991c.c().y();
        }
    }

    public static final class m extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f21992b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f21993c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f21994d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(boolean z10, String str, String str2) {
            super(0);
            this.f21992b = z10;
            this.f21993c = str;
            this.f21994d = str2;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Starting (resume = " + this.f21992b + ") DUST subscription for mite: " + this.f21993c + " to url: " + this.f21994d;
        }
    }

    public /* synthetic */ class n extends FunctionReferenceImpl implements Ia.l {
        public n(Object obj) {
            super(1, obj, u0.class, "ingestDustMessages", "ingestDustMessages(Lcom/braze/models/dust/IDustMessage;)V", 0);
        }

        public final void a(i2 p10) {
            kotlin.jvm.internal.i.e(p10, "p0");
            ((u0) this.receiver).a(p10);
        }

        @Override // Ia.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((i2) obj);
            return p293xa.r.f47939a;
        }
    }

    public u0(r5 serverConfigStorageProvider, k2 internalPublisher, Context context, String str, String str2) {
        kotlin.jvm.internal.i.e(serverConfigStorageProvider, "serverConfigStorageProvider");
        kotlin.jvm.internal.i.e(internalPublisher, "internalPublisher");
        kotlin.jvm.internal.i.e(context, "context");
        this.f21973a = serverConfigStorageProvider;
        this.f21974b = internalPublisher;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.braze.managers.dust.metadata" + StringUtils.getCacheFileSuffix(context, str, str2), 0);
        kotlin.jvm.internal.i.d(sharedPreferences, "context.getSharedPrefere…xt.MODE_PRIVATE\n        )");
        this.f21975c = sharedPreferences;
        this.f21976d = new w0();
        internalPublisher.c(x5.class, new IEventSubscriber() { // from class: bo.app.G0
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                u0.a(this.f20661a, (x5) obj);
            }
        });
        internalPublisher.c(z5.class, new A(1, this));
        internalPublisher.c(u3.class, new B(1, this));
        internalPublisher.c(v0.class, new C(1, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(u0 this$0, x5 it) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        kotlin.jvm.internal.i.e(it, "it");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this$0, (BrazeLogger.Priority) null, (Throwable) null, a.f21978b, 3, (Object) null);
        InterfaceC2694i0 interfaceC2694i0 = this$0.f21977e;
        if (interfaceC2694i0 != null) {
            interfaceC2694i0.i(null);
        }
        this$0.a(true);
    }

    private final String b() {
        return this.f21975c.getString("mite", null);
    }

    public final r5 c() {
        return this.f21973a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(u0 this$0, z5 it) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        kotlin.jvm.internal.i.e(it, "it");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this$0, (BrazeLogger.Priority) null, (Throwable) null, b.f21979b, 3, (Object) null);
        this$0.f21977e = BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Long.valueOf(f21972g), null, this$0.new c(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(u0 this$0, u3 it) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        kotlin.jvm.internal.i.e(it, "it");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this$0, (BrazeLogger.Priority) null, (Throwable) null, new d(it), 3, (Object) null);
        t3 t3VarA = it.a();
        t3 t3Var = t3.NONE;
        if (t3VarA == t3Var) {
            this$0.a();
        } else if (it.b() == t3Var) {
            this$0.a(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(u0 this$0, v0 it) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        kotlin.jvm.internal.i.e(it, "it");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this$0, (BrazeLogger.Priority) null, (Throwable) null, e.f21984b, 3, (Object) null);
        String strB = this$0.b();
        this$0.a(it.a());
        this$0.a(kotlin.jvm.internal.i.a(strB, it.a()));
    }

    private final void a(String str) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new k(str), 3, (Object) null);
        this.f21975c.edit().putString("mite", str).apply();
    }

    private final void a(boolean z10) {
        String strB = b();
        if (strB != null && this.f21973a.y()) {
            String strConcat = "https://dust.k8s.test-001.d-usw-2.braze.com/sse?mite=".concat(strB);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new m(z10, strB, strConcat), 3, (Object) null);
            this.f21976d.a(strConcat, new n(this), z10);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new l(strB, this), 3, (Object) null);
    }

    public final void a() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, h.f21986b, 3, (Object) null);
        this.f21976d.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(i2 i2Var) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new i(i2Var), 3, (Object) null);
        i2.b bVarA = i2Var.a();
        if (g.f21985a[bVarA.ordinal()] == 1) {
            this.f21974b.a(new C1482u(), C1482u.class);
        } else {
            BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.W, (Throwable) null, new j(bVarA), 2, (Object) null);
        }
    }
}
