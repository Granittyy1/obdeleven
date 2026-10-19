package bo.app;

import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.support.BrazeLogger;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C2680e;

/* JADX INFO: loaded from: classes.dex */
public final class h1 implements b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b2 f21156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k2 f21157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f21158c;

    public static final class a extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a2 f21160c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a2 a2Var) {
            super(0);
            this.f21160c = a2Var;
        }

        public final void a() {
            h1.this.f21156a.a(this.f21160c);
        }

        @Override // Ia.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p293xa.r.f47939a;
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f21161b = new b();

        public b() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Storage provider is closed. Not getting all events.";
        }
    }

    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f21162b = new c();

        public c() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to get all events from storage.";
        }
    }

    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Set f21164c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Set set) {
            super(0);
            this.f21164c = set;
        }

        public final void a() {
            h1.this.f21156a.a(this.f21164c);
        }

        @Override // Ia.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p293xa.r.f47939a;
        }
    }

    public static final class e extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21165b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(0);
            this.f21165b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Storage provider is closed. Failed to " + this.f21165b;
        }
    }

    public static final class f extends SuspendLambda implements Ia.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f21166b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f21167c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Ia.a f21168d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ h1 f21169e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f21170f;

        public static final class a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f21171b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str) {
                super(0);
                this.f21171b = str;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Failed to " + this.f21171b;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Ia.a aVar, h1 h1Var, String str, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f21168d = aVar;
            this.f21169e = h1Var;
            this.f21170f = str;
        }

        @Override // Ia.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c cVar) {
            return ((f) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            f fVar = new f(this.f21168d, this.f21169e, this.f21170f, cVar);
            fVar.f21167c = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (this.f21166b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            kotlinx.coroutines.A a10 = (kotlinx.coroutines.A) this.f21167c;
            try {
                this.f21168d.invoke();
            } catch (Exception e10) {
                BrazeLogger.INSTANCE.brazelog(a10, BrazeLogger.Priority.E, e10, new a(this.f21170f));
                this.f21169e.a(e10);
            }
            return p293xa.r.f47939a;
        }
    }

    public static final class g extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final g f21172b = new g();

        public g() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to log storage exception";
        }
    }

    public h1(b2 storage, k2 eventPublisher) {
        kotlin.jvm.internal.i.e(storage, "storage");
        kotlin.jvm.internal.i.e(eventPublisher, "eventPublisher");
        this.f21156a = storage;
        this.f21157b = eventPublisher;
    }

    @Override // bo.app.b2
    public void close() {
        this.f21158c = true;
    }

    @Override // bo.app.b2
    public Collection a() {
        if (this.f21158c) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, b.f21161b, 2, (Object) null);
            return EmptySet.f42985b;
        }
        try {
            return this.f21156a.a();
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, c.f21162b);
            a(e10);
            return EmptySet.f42985b;
        }
    }

    @Override // bo.app.b2
    public void a(a2 event) {
        kotlin.jvm.internal.i.e(event, "event");
        a("add event " + event, new a(event));
    }

    @Override // bo.app.b2
    public void a(Set events) {
        kotlin.jvm.internal.i.e(events, "events");
        a("delete events " + events, new d(events));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Throwable th) {
        try {
            this.f21157b.a(new c6("A storage exception has occurred!", th), c6.class);
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, g.f21172b);
        }
    }

    private final void a(String str, Ia.a aVar) {
        if (this.f21158c) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new e(str), 2, (Object) null);
        } else {
            C2680e.c(BrazeCoroutineScope.INSTANCE, null, null, new f(aVar, this, str, null), 3);
        }
    }
}
