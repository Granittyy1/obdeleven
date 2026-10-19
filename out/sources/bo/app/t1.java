package bo.app;

import android.content.Context;
import com.braze.support.BrazeLogger;
import com.braze.support.ReflectionUtils;
import com.google.firebase.messaging.FirebaseMessaging;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class t1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f21932e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f21933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n2 f21934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f21935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f21936d;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f21937b = new b();

        public b() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Firebase Cloud Messaging requires the Google Play Store to be installed.";
        }
    }

    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p191p5.g f21938b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(p191p5.g gVar) {
            super(0);
            this.f21938b = gVar;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Fetching registration token failed using FirebaseMessaging instance with default Firebase installation with exception " + this.f21938b.j();
        }
    }

    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21939b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.f21939b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Automatically obtained Firebase Cloud Messaging token: " + this.f21939b;
        }
    }

    public static final class e extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f21940b = new e();

        public e() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to register for Firebase Cloud Messaging";
        }
    }

    public static final class f extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21941b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(0);
            this.f21941b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Registering for Firebase Cloud Messaging token using sender id: " + this.f21941b;
        }
    }

    public static final class g extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final g f21942b = new g();

        public g() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Firebase Cloud Messaging 'getInstance' method could not obtained. Not registering for Firebase Cloud Messaging.";
        }
    }

    public static final class h extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final h f21943b = new h();

        public h() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Could not call 'getInstance' method. Not registering for Firebase Cloud Messaging.";
        }
    }

    public static final class i extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final i f21944b = new i();

        public i() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Firebase Cloud Messaging 'InstanceId' object could not be invoked. Not registering for Firebase Cloud Messaging.";
        }
    }

    public static final class j extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final j f21945b = new j();

        public j() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Firebase Cloud Messaging 'FirebaseInstanceId.getInstance().getToken()' method could not obtained. Not registering for Firebase Cloud Messaging.";
        }
    }

    public static final class k extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final k f21946b = new k();

        public k() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Could not invoke 'getToken()' Not registering for Firebase Cloud Messaging.";
        }
    }

    public static final class l extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f21947b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Object obj) {
            super(0);
            this.f21947b = obj;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Automatically obtained Firebase Cloud Messaging token: " + this.f21947b;
        }
    }

    public static final class m extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final m f21948b = new m();

        public m() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to get push token via instance id";
        }
    }

    public t1(Context context, n2 registrationDataProvider) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(registrationDataProvider, "registrationDataProvider");
        this.f21933a = context;
        this.f21934b = registrationDataProvider;
        this.f21935c = ReflectionUtils.doesMethodExist("com.google.firebase.iid.FirebaseInstanceId", "getToken", String.class, String.class);
        this.f21936d = ReflectionUtils.doesMethodExist("com.google.firebase.messaging.FirebaseMessaging", "getToken", new Class[0]);
    }

    public final void a(String firebaseSenderId) {
        kotlin.jvm.internal.i.e(firebaseSenderId, "firebaseSenderId");
        try {
            if (this.f21936d) {
                FirebaseMessaging.getInstance().getToken().c(new F0(0, this));
            } else if (this.f21935c) {
                b(firebaseSenderId);
            }
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, e.f21940b);
        }
    }

    private final void b(String str) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, new f(str), 2, (Object) null);
        try {
            Method methodQuietly = ReflectionUtils.getMethodQuietly("com.google.firebase.iid.FirebaseInstanceId", "getInstance", (Class<?>[]) new Class[0]);
            if (methodQuietly == null) {
                BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, g.f21942b, 3, (Object) null);
                return;
            }
            Pair<Boolean, Object> pairInvokeMethodQuietly = ReflectionUtils.invokeMethodQuietly(null, methodQuietly, new Object[0]);
            if (!pairInvokeMethodQuietly.c().booleanValue()) {
                BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, h.f21943b, 3, (Object) null);
                return;
            }
            Object objD = pairInvokeMethodQuietly.d();
            if (objD == null) {
                BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, i.f21944b, 3, (Object) null);
                return;
            }
            Method methodQuietly2 = ReflectionUtils.getMethodQuietly(objD.getClass(), "getToken", (Class<?>[]) new Class[]{String.class, String.class});
            if (methodQuietly2 == null) {
                BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, j.f21945b, 3, (Object) null);
                return;
            }
            Pair<Boolean, Object> pairInvokeMethodQuietly2 = ReflectionUtils.invokeMethodQuietly(objD, methodQuietly2, str, FirebaseMessaging.INSTANCE_ID_SCOPE);
            if (!pairInvokeMethodQuietly2.c().booleanValue()) {
                BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, k.f21946b, 3, (Object) null);
                return;
            }
            Object objD2 = pairInvokeMethodQuietly2.d();
            if (objD2 instanceof String) {
                BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, new l(objD2), 2, (Object) null);
                this.f21934b.a((String) objD2);
            }
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, m.f21948b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(t1 this$0, p191p5.g task) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        kotlin.jvm.internal.i.e(task, "task");
        if (!task.o()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this$0, BrazeLogger.Priority.W, (Throwable) null, new c(task), 2, (Object) null);
            return;
        }
        String str = (String) task.k();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this$0, BrazeLogger.Priority.V, (Throwable) null, new d(str), 2, (Object) null);
        this$0.f21934b.a(str);
    }

    public final boolean a() {
        if (com.braze.support.f.b(this.f21933a)) {
            return this.f21935c || this.f21936d;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, b.f21937b, 2, (Object) null);
        return false;
    }
}
