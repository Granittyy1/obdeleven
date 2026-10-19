package bo.app;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.braze.Braze;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.SessionStateChangedEvent;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.IntentUtils;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.C2702l0;
import kotlinx.coroutines.InterfaceC2694i0;

/* JADX INFO: renamed from: bo.app.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1480s {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f21862l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f21863m = BrazeLogger.getBrazeLogTag((Class<?>) C1480s.class);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f21864n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f21865o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f21866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u2 f21867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k2 f21868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k2 f21869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AlarmManager f21870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f21871f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f21872g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ReentrantLock f21873h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f21874i;
    private InterfaceC2694i0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private q3 f21875k;

    /* JADX INFO: renamed from: bo.app.s$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final long a() {
            return C1480s.f21865o;
        }

        private a() {
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0029 A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Code duplicated, block: B:9:0x0027 A[RETURN, SYNTHETIC] */
        public final boolean a(double d10, double d11, int i10, boolean z10) {
            long jNowInMilliseconds = DateTimeUtils.nowInMilliseconds();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long millis = timeUnit.toMillis(i10);
            if (!z10) {
                if (timeUnit.toMillis((long) d11) + millis <= jNowInMilliseconds) {
                    return true;
                }
                return false;
            }
            if (a() + timeUnit.toMillis((long) d10) + millis <= jNowInMilliseconds) {
                return true;
            }
            return false;
        }

        public final long a(q3 mutableSession, int i10, boolean z10) {
            kotlin.jvm.internal.i.e(mutableSession, "mutableSession");
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long millis = timeUnit.toMillis(i10);
            if (!z10) {
                return millis;
            }
            return Math.max(a(), (timeUnit.toMillis((long) mutableSession.x()) + millis) - DateTimeUtils.nowInMilliseconds());
        }
    }

    /* JADX INFO: renamed from: bo.app.s$b */
    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f21876b = new b();

        public b() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Cancelling session seal alarm";
        }
    }

    /* JADX INFO: renamed from: bo.app.s$c */
    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f21877b = new c();

        public c() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to cancel session seal alarm";
        }
    }

    /* JADX INFO: renamed from: bo.app.s$d */
    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f21878b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j) {
            super(0);
            this.f21878b = j;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return p005a4.o.d(this.f21878b, " ms", new StringBuilder("Creating a session seal alarm with a delay of "));
        }
    }

    /* JADX INFO: renamed from: bo.app.s$e */
    public static final class e extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f21879b = new e();

        public e() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to create session seal alarm";
        }
    }

    /* JADX INFO: renamed from: bo.app.s$f */
    public static final class f extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q3 f21880b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(q3 q3Var) {
            super(0);
            this.f21880b = q3Var;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Clearing completely dispatched sealed session " + this.f21880b.s();
        }
    }

    /* JADX INFO: renamed from: bo.app.s$g */
    public static final class g extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q3 f21881b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(q3 q3Var) {
            super(0);
            this.f21881b = q3Var;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "New session created with ID: " + this.f21881b.s();
        }
    }

    /* JADX INFO: renamed from: bo.app.s$h */
    public static final class h extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final h f21882b = new h();

        public h() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Getting the stored open session";
        }
    }

    /* JADX INFO: renamed from: bo.app.s$i */
    public static final class i extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q3 f21883b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(q3 q3Var) {
            super(0);
            this.f21883b = q3Var;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Checking if this session needs to be sealed: " + this.f21883b.s();
        }
    }

    /* JADX INFO: renamed from: bo.app.s$j */
    public static final class j extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q3 f21884b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(q3 q3Var) {
            super(0);
            this.f21884b = q3Var;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Session [" + this.f21884b.s() + "] being sealed because its end time is over the grace period. Session: " + this.f21884b;
        }
    }

    /* JADX INFO: renamed from: bo.app.s$k */
    public static final class k extends BroadcastReceiver {

        /* JADX INFO: renamed from: bo.app.s$k$a */
        public static final class a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f21886b = new a();

            public a() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Session seal logic executing in broadcast";
            }
        }

        /* JADX INFO: renamed from: bo.app.s$k$b */
        public static final class b extends SuspendLambda implements Ia.p {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f21887b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f21888c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ C1480s f21889d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ BroadcastReceiver.PendingResult f21890e;

            /* JADX INFO: renamed from: bo.app.s$k$b$a */
            public static final class a extends Lambda implements Ia.a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final a f21891b = new a();

                public a() {
                    super(0);
                }

                @Override // Ia.a
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "Failed to log throwable during seal session.";
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C1480s c1480s, BroadcastReceiver.PendingResult pendingResult, kotlin.coroutines.c cVar) {
                super(2, cVar);
                this.f21889d = c1480s;
                this.f21890e = pendingResult;
            }

            @Override // Ia.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c cVar) {
                return ((b) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
                b bVar = new b(this.f21889d, this.f21890e, cVar);
                bVar.f21888c = obj;
                return bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                if (this.f21887b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                kotlinx.coroutines.A a10 = (kotlinx.coroutines.A) this.f21888c;
                ReentrantLock reentrantLock = this.f21889d.f21873h;
                C1480s c1480s = this.f21889d;
                reentrantLock.lock();
                try {
                    try {
                        c1480s.k();
                    } catch (Exception e10) {
                        try {
                            c1480s.f21868c.a(e10, Throwable.class);
                        } catch (Exception e11) {
                            BrazeLogger.INSTANCE.brazelog(a10, BrazeLogger.Priority.E, e11, a.f21891b);
                        }
                    }
                    p293xa.r rVar = p293xa.r.f47939a;
                    reentrantLock.unlock();
                    this.f21890e.finish();
                    return p293xa.r.f47939a;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
        }

        public k() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            kotlin.jvm.internal.i.e(context, "context");
            kotlin.jvm.internal.i.e(intent, "intent");
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, a.f21886b, 2, (Object) null);
            C2680e.c(BrazeCoroutineScope.INSTANCE, null, null, new b(C1480s.this, goAsync(), null), 3);
        }
    }

    /* JADX INFO: renamed from: bo.app.s$l */
    public static final class l extends SuspendLambda implements Ia.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f21892b;

        /* JADX INFO: renamed from: bo.app.s$l$a */
        public static final class a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f21894b = new a();

            public a() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Requesting data flush on internal session close flush timer.";
            }
        }

        public l(kotlin.coroutines.c cVar) {
            super(2, cVar);
        }

        @Override // Ia.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c cVar) {
            return ((l) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return C1480s.this.new l(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.f21892b;
            if (i10 == 0) {
                kotlin.b.b(obj);
                long j = C1480s.f21864n;
                this.f21892b = 1;
                if (kotlinx.coroutines.I.b(j, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, C1480s.f21863m, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) a.f21894b, 6, (Object) null);
            Braze.Companion.getInstance(C1480s.this.f21866a).requestImmediateDataFlush();
            return p293xa.r.f47939a;
        }
    }

    /* JADX INFO: renamed from: bo.app.s$m */
    public static final class m extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q3 f21895b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(q3 q3Var) {
            super(0);
            this.f21895b = q3Var;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Closed session with id " + this.f21895b.s();
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f21864n = timeUnit.toMillis(10L);
        f21865o = timeUnit.toMillis(10L);
    }

    public C1480s(Context applicationContext, u2 sessionStorageManager, k2 internalEventPublisher, k2 externalEventPublisher, AlarmManager alarmManager, int i10, boolean z10) {
        kotlin.jvm.internal.i.e(applicationContext, "applicationContext");
        kotlin.jvm.internal.i.e(sessionStorageManager, "sessionStorageManager");
        kotlin.jvm.internal.i.e(internalEventPublisher, "internalEventPublisher");
        kotlin.jvm.internal.i.e(externalEventPublisher, "externalEventPublisher");
        kotlin.jvm.internal.i.e(alarmManager, "alarmManager");
        this.f21866a = applicationContext;
        this.f21867b = sessionStorageManager;
        this.f21868c = internalEventPublisher;
        this.f21869d = externalEventPublisher;
        this.f21870e = alarmManager;
        this.f21871f = i10;
        this.f21872g = z10;
        this.f21873h = new ReentrantLock();
        this.j = C2702l0.a();
        k kVar = new k();
        String str = applicationContext.getPackageName() + ".intent.BRAZE_SESSION_SHOULD_SEAL";
        this.f21874i = str;
        if (Build.VERSION.SDK_INT >= 33) {
            applicationContext.registerReceiver(kVar, new IntentFilter(str), 4);
        } else {
            applicationContext.registerReceiver(kVar, new IntentFilter(str));
        }
    }

    private final void f() {
        q3 q3Var = this.f21875k;
        if (q3Var != null) {
            long jA = f21862l.a(q3Var, this.f21871f, this.f21872g);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new d(jA), 3, (Object) null);
            try {
                Intent intent = new Intent(this.f21874i);
                intent.putExtra("session_id", q3Var.toString());
                this.f21870e.set(1, DateTimeUtils.nowInMilliseconds() + jA, PendingIntent.getBroadcast(this.f21866a, 0, intent, IntentUtils.getImmutablePendingIntentFlags() | 1073741824));
            } catch (Exception e10) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, e.f21879b);
            }
        }
    }

    private final boolean g() {
        ReentrantLock reentrantLock = this.f21873h;
        reentrantLock.lock();
        try {
            k();
            q3 q3Var = this.f21875k;
            boolean z10 = true;
            if (q3Var == null || q3Var.y()) {
                i();
                if (q3Var != null && q3Var.y()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new f(q3Var), 3, (Object) null);
                    this.f21867b.a(q3Var.s().toString());
                }
            } else if (q3Var.w() != null) {
                q3Var.a((Double) null);
            } else {
                z10 = false;
            }
            return z10;
        } finally {
            reentrantLock.unlock();
        }
    }

    private final void i() {
        q3 q3Var = new q3(null, 0.0d, null, false, 15, null);
        this.f21875k = q3Var;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new g(q3Var), 2, (Object) null);
        this.f21868c.a(new u5(q3Var), u5.class);
        this.f21869d.a(new SessionStateChangedEvent(q3Var.s().toString(), SessionStateChangedEvent.ChangeType.SESSION_STARTED), SessionStateChangedEvent.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        ReentrantLock reentrantLock = this.f21873h;
        reentrantLock.lock();
        try {
            if (this.f21875k == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, h.f21882b, 3, (Object) null);
                t5 t5VarA = this.f21867b.a();
                this.f21875k = t5VarA != null ? t5VarA.z() : null;
            }
            q3 q3Var = this.f21875k;
            if (q3Var != null) {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new i(q3Var), 3, (Object) null);
                Double dW = q3Var.w();
                if (dW != null && !q3Var.y() && f21862l.a(q3Var.x(), dW.doubleValue(), this.f21871f, this.f21872g)) {
                    BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.I, (Throwable) null, new j(q3Var), 2, (Object) null);
                    l();
                    u2 u2Var = this.f21867b;
                    q3 q3Var2 = this.f21875k;
                    u2Var.a(String.valueOf(q3Var2 != null ? q3Var2.s() : null));
                    this.f21875k = null;
                }
                p293xa.r rVar = p293xa.r.f47939a;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void e() {
        this.j.i(null);
    }

    public final v5 h() {
        ReentrantLock reentrantLock = this.f21873h;
        reentrantLock.lock();
        try {
            k();
            q3 q3Var = this.f21875k;
            return q3Var != null ? q3Var.s() : null;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0013  */
    public final boolean j() {
        boolean z10;
        ReentrantLock reentrantLock = this.f21873h;
        reentrantLock.lock();
        try {
            q3 q3Var = this.f21875k;
            if (q3Var != null) {
                z10 = q3Var.y();
            }
            return z10;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void l() {
        q3 q3Var = this.f21875k;
        if (q3Var != null) {
            ReentrantLock reentrantLock = this.f21873h;
            reentrantLock.lock();
            try {
                q3Var.A();
                this.f21867b.a(q3Var);
                this.f21868c.a(new w5(q3Var), w5.class);
                this.f21869d.a(new SessionStateChangedEvent(q3Var.s().toString(), SessionStateChangedEvent.ChangeType.SESSION_ENDED), SessionStateChangedEvent.class);
                p293xa.r rVar = p293xa.r.f47939a;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final void m() {
        q3 q3Var;
        ReentrantLock reentrantLock = this.f21873h;
        reentrantLock.lock();
        try {
            if (g() && (q3Var = this.f21875k) != null) {
                this.f21867b.a(q3Var);
            }
            e();
            d();
            this.f21868c.a(x5.f22178b, x5.class);
            p293xa.r rVar = p293xa.r.f47939a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void n() {
        this.j.i(null);
        this.j = C2680e.c(BrazeCoroutineScope.INSTANCE, null, null, new l(null), 3);
    }

    public final void o() {
        ReentrantLock reentrantLock = this.f21873h;
        reentrantLock.lock();
        try {
            g();
            q3 q3Var = this.f21875k;
            if (q3Var != null) {
                q3Var.a(Double.valueOf(DateTimeUtils.nowInSecondsPrecise()));
                this.f21867b.a(q3Var);
                n();
                f();
                this.f21868c.a(z5.f22263b, z5.class);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new m(q3Var), 3, (Object) null);
                p293xa.r rVar = p293xa.r.f47939a;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    private final void d() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, b.f21876b, 3, (Object) null);
        try {
            Intent intent = new Intent(this.f21874i);
            intent.putExtra("session_id", String.valueOf(this.f21875k));
            this.f21870e.cancel(PendingIntent.getBroadcast(this.f21866a, 0, intent, IntentUtils.getImmutablePendingIntentFlags() | 1073741824));
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, c.f21877b);
        }
    }
}
