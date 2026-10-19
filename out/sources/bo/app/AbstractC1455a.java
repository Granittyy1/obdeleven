package bo.app;

import com.braze.support.BrazeLogger;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.sync.SemaphoreImpl;

/* JADX INFO: renamed from: bo.app.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1455a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kotlinx.coroutines.sync.c f20683a;

    /* JADX INFO: renamed from: bo.app.a$a, reason: collision with other inner class name */
    public static final class C0210a extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f20684b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f20685c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0210a(Object obj, boolean z10) {
            super(0);
            this.f20684b = obj;
            this.f20685c = z10;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder("Tried to confirm outboundObject [");
            sb2.append(this.f20684b);
            sb2.append("] with success [");
            return C4.v.f(sb2, this.f20685c, "], but the cache wasn't locked, so not doing anything.");
        }
    }

    /* JADX INFO: renamed from: bo.app.a$b */
    public static final class b extends Lambda implements Ia.a {
        public b() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Notifying confirmAndUnlock listeners for cache: " + AbstractC1455a.this;
        }
    }

    /* JADX INFO: renamed from: bo.app.a$c */
    public static final class c extends Lambda implements Ia.a {
        public c() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Cache locked successfully for export: " + AbstractC1455a.this;
        }
    }

    /* JADX INFO: renamed from: bo.app.a$d */
    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f20688b = new d();

        public d() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Received call to export dirty object, but the cache was already locked.";
        }
    }

    /* JADX INFO: renamed from: bo.app.a$e */
    public static final class e extends SuspendLambda implements Ia.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f20689b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f20690c;

        public e(kotlin.coroutines.c cVar) {
            super(2, cVar);
        }

        @Override // Ia.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c cVar) {
            return ((e) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return AbstractC1455a.this.new e(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlinx.coroutines.sync.c cVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.f20690c;
            if (i10 == 0) {
                kotlin.b.b(obj);
                kotlinx.coroutines.sync.c cVar2 = AbstractC1455a.this.f20683a;
                this.f20689b = cVar2;
                this.f20690c = 1;
                if (cVar2.b(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                cVar = cVar2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cVar = (kotlinx.coroutines.sync.c) this.f20689b;
                kotlin.b.b(obj);
            }
            try {
                p293xa.r rVar = p293xa.r.f47939a;
                return p293xa.r.f47939a;
            } finally {
                cVar.a();
            }
        }
    }

    public AbstractC1455a() {
        int i10 = kotlinx.coroutines.sync.d.f43604a;
        this.f20683a = new SemaphoreImpl(1, 0);
    }

    public abstract void b(Object obj, boolean z10);

    public final boolean b() {
        return this.f20683a.c() == 0;
    }

    public final void c() throws Throwable {
        C2680e.d(EmptyCoroutineContext.f43032b, new e(null));
    }

    public abstract Object d();

    public final synchronized Object a() {
        Object objD;
        try {
            if (this.f20683a.h()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new c(), 3, (Object) null);
                objD = d();
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, d.f20688b, 3, (Object) null);
                objD = null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return objD;
    }

    public final synchronized boolean a(Object obj, boolean z10) {
        if (this.f20683a.c() != 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new C0210a(obj, z10), 2, (Object) null);
            return false;
        }
        b(obj, z10);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new b(), 2, (Object) null);
        this.f20683a.a();
        return true;
    }
}
