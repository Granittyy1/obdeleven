package io.ktor.client;

import Aa.c;
import Ia.q;
import V9.d;
import com.voltasit.obdeleven.domain.usecases.device.u;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.ktor.client.plugins.DefaultResponseValidationKt;
import io.ktor.client.plugins.DefaultTransformKt;
import io.ktor.client.plugins.j;
import io.ktor.client.plugins.k;
import io.ktor.client.plugins.o;
import io.ktor.client.plugins.t;
import io.ktor.client.statement.b;
import io.ktor.client.statement.f;
import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.e;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l;
import kotlinx.coroutines.A;
import kotlinx.coroutines.B;
import kotlinx.coroutines.C2700k0;
import kotlinx.coroutines.InterfaceC2694i0;
import p293xa.r;

/* JADX INFO: compiled from: HttpClient.kt */
/* JADX INFO: loaded from: classes.dex */
public final class HttpClient implements A, Closeable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f40238m = AtomicIntegerFieldUpdater.newUpdater(HttpClient.class, MetricTracker.Action.CLOSED);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io.ktor.client.engine.a f40239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f40240c;
    private volatile /* synthetic */ int closed;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2700k0 f40241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f40242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f40243f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f40244g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final V9.f f40245h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f40246i;
    public final io.ktor.util.f j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final W9.a f40247k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HttpClientConfig<io.ktor.client.engine.d> f40248l;

    /* JADX INFO: renamed from: io.ktor.client.HttpClient$2, reason: invalid class name */
    /* JADX INFO: compiled from: HttpClient.kt */
    @c(c = "io.ktor.client.HttpClient$2", f = "HttpClient.kt", l = {144, 146}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements q<io.ktor.util.pipeline.c<Object, io.ktor.client.request.a>, Object, kotlin.coroutines.c<? super r>, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public AnonymousClass2(kotlin.coroutines.c<? super AnonymousClass2> cVar) {
            super(3, cVar);
        }

        @Override // Ia.q
        public final Object invoke(io.ktor.util.pipeline.c<Object, io.ktor.client.request.a> cVar, Object obj, kotlin.coroutines.c<? super r> cVar2) {
            AnonymousClass2 anonymousClass2 = HttpClient.this.new AnonymousClass2(cVar2);
            anonymousClass2.L$0 = cVar;
            anonymousClass2.L$1 = obj;
            return anonymousClass2.invokeSuspend(r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            io.ktor.util.pipeline.c cVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    obj2 = this.L$1;
                    cVar = (io.ktor.util.pipeline.c) this.L$0;
                    kotlin.b.b(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                }
                return r.f47939a;
            }
            kotlin.b.b(obj);
            io.ktor.util.pipeline.c cVar2 = (io.ktor.util.pipeline.c) this.L$0;
            obj2 = this.L$1;
            if (!(obj2 instanceof io.ktor.client.call.a)) {
                throw new IllegalStateException(("Error: HttpClientCall expected, but found " + obj2 + '(' + l.a(obj2.getClass()) + ").").toString());
            }
            b bVar = HttpClient.this.f40246i;
            r rVar = r.f47939a;
            io.ktor.client.statement.c cVarD = ((io.ktor.client.call.a) obj2).d();
            this.L$0 = cVar2;
            this.L$1 = obj2;
            this.label = 1;
            Object objA = bVar.a(rVar, cVarD, this);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            cVar = cVar2;
            obj = objA;
            io.ktor.client.statement.c response = (io.ktor.client.statement.c) obj;
            io.ktor.client.call.a aVar = (io.ktor.client.call.a) obj2;
            aVar.getClass();
            i.e(response, "response");
            aVar.f40264d = response;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            if (cVar.d(obj2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return r.f47939a;
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.HttpClient$4, reason: invalid class name */
    /* JADX INFO: compiled from: HttpClient.kt */
    @c(c = "io.ktor.client.HttpClient$4", f = "HttpClient.kt", l = {177}, m = "invokeSuspend")
    public static final class AnonymousClass4 extends SuspendLambda implements q<io.ktor.util.pipeline.c<io.ktor.client.statement.d, io.ktor.client.call.a>, io.ktor.client.statement.d, kotlin.coroutines.c<? super r>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass4(kotlin.coroutines.c<? super AnonymousClass4> cVar) {
            super(3, cVar);
        }

        @Override // Ia.q
        public final Object invoke(io.ktor.util.pipeline.c<io.ktor.client.statement.d, io.ktor.client.call.a> cVar, io.ktor.client.statement.d dVar, kotlin.coroutines.c<? super r> cVar2) {
            AnonymousClass4 anonymousClass4 = HttpClient.this.new AnonymousClass4(cVar2);
            anonymousClass4.L$0 = cVar;
            return anonymousClass4.invokeSuspend(r.f47939a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            io.ktor.util.pipeline.c cVar;
            Throwable th;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cVar = (io.ktor.util.pipeline.c) this.L$0;
                try {
                    kotlin.b.b(obj);
                    return r.f47939a;
                } catch (Throwable th2) {
                    th = th2;
                    W9.a aVar = HttpClient.this.f40247k;
                    u uVar = io.ktor.client.utils.b.f40440d;
                    ((io.ktor.client.call.a) cVar.f40561b).d();
                    aVar.a(uVar);
                    throw th;
                }
            }
            kotlin.b.b(obj);
            io.ktor.util.pipeline.c cVar2 = (io.ktor.util.pipeline.c) this.L$0;
            try {
                this.L$0 = cVar2;
                this.label = 1;
                if (cVar2.c(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return r.f47939a;
            } catch (Throwable th3) {
                cVar = cVar2;
                th = th3;
                W9.a aVar2 = HttpClient.this.f40247k;
                u uVar2 = io.ktor.client.utils.b.f40440d;
                ((io.ktor.client.call.a) cVar.f40561b).d();
                aVar2.a(uVar2);
                throw th;
            }
        }
    }

    public HttpClient() {
        throw null;
    }

    public HttpClient(io.ktor.client.engine.a engine, HttpClientConfig httpClientConfig) {
        i.e(engine, "engine");
        this.f40239b = engine;
        this.closed = 0;
        C2700k0 c2700k0 = new C2700k0((InterfaceC2694i0) engine.getCoroutineContext().get(InterfaceC2694i0.b.f43449b));
        this.f40241d = c2700k0;
        this.f40242e = engine.getCoroutineContext().plus(c2700k0);
        this.f40243f = new d(httpClientConfig.f40256g);
        this.f40244g = new f(httpClientConfig.f40256g);
        V9.f fVar = new V9.f(httpClientConfig.f40256g);
        this.f40245h = fVar;
        this.f40246i = new b(httpClientConfig.f40256g);
        this.j = new io.ktor.util.f();
        this.f40247k = new W9.a();
        HttpClientConfig<io.ktor.client.engine.d> httpClientConfig2 = new HttpClientConfig<>();
        this.f40248l = httpClientConfig2;
        if (this.f40240c) {
            c2700k0.B(new Ia.l<Throwable, r>() { // from class: io.ktor.client.HttpClient.1
                {
                    super(1);
                }

                @Override // Ia.l
                public final r invoke(Throwable th) {
                    if (th != null) {
                        B.c(HttpClient.this.f40239b, null);
                    }
                    return r.f47939a;
                }
            });
        }
        engine.J0(this);
        fVar.f(V9.f.j, new AnonymousClass2(null));
        io.ktor.client.plugins.q.a aVar = io.ktor.client.plugins.q.f40383a;
        HttpClientConfig$install$1 httpClientConfig$install$1 = new Ia.l() { // from class: io.ktor.client.HttpClientConfig$install$1
            @Override // Ia.l
            public final Object invoke(Object obj) {
                i.e(obj, "$this$null");
                return r.f47939a;
            }
        };
        httpClientConfig2.b(aVar, httpClientConfig$install$1);
        httpClientConfig2.b(io.ktor.client.plugins.a.f40335a, httpClientConfig$install$1);
        if (httpClientConfig.f40255f) {
            HttpClient$3$1 block = new Ia.l<HttpClient, r>() { // from class: io.ktor.client.HttpClient$3$1
                @Override // Ia.l
                public final r invoke(HttpClient httpClient) {
                    HttpClient install = httpClient;
                    i.e(install, "$this$install");
                    DefaultTransformKt.a(install);
                    return r.f47939a;
                }
            };
            i.e(block, "block");
            httpClientConfig2.f40252c.put("DefaultTransformers", block);
        }
        httpClientConfig2.b(t.f40392b, httpClientConfig$install$1);
        httpClientConfig2.b(io.ktor.client.plugins.f.f40354d, httpClientConfig$install$1);
        if (httpClientConfig.f40254e) {
            httpClientConfig2.b(o.f40378a, httpClientConfig$install$1);
        }
        httpClientConfig2.f40254e = httpClientConfig.f40254e;
        httpClientConfig2.f40255f = httpClientConfig.f40255f;
        httpClientConfig2.f40250a.putAll(httpClientConfig.f40250a);
        httpClientConfig2.f40251b.putAll(httpClientConfig.f40251b);
        httpClientConfig2.f40252c.putAll(httpClientConfig.f40252c);
        if (httpClientConfig.f40255f) {
            httpClientConfig2.b(k.f40369d, httpClientConfig$install$1);
        }
        DefaultResponseValidationKt.a(httpClientConfig2);
        Iterator it = httpClientConfig2.f40250a.values().iterator();
        while (it.hasNext()) {
            ((Ia.l) it.next()).invoke(this);
        }
        Iterator it2 = httpClientConfig2.f40252c.values().iterator();
        while (it2.hasNext()) {
            ((Ia.l) it2.next()).invoke(this);
        }
        this.f40244g.f(f.f40430f, new AnonymousClass4(null));
        this.f40240c = true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(io.ktor.client.request.a aVar, ContinuationImpl continuationImpl) {
        HttpClient$execute$1 httpClient$execute$1;
        if (continuationImpl instanceof HttpClient$execute$1) {
            httpClient$execute$1 = (HttpClient$execute$1) continuationImpl;
            int i10 = httpClient$execute$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                httpClient$execute$1.label = i10 - Integer.MIN_VALUE;
            } else {
                httpClient$execute$1 = new HttpClient$execute$1(this, continuationImpl);
            }
        } else {
            httpClient$execute$1 = new HttpClient$execute$1(this, continuationImpl);
        }
        Object objA = httpClient$execute$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = httpClient$execute$1.label;
        if (i11 == 0) {
            kotlin.b.b(objA);
            this.f40247k.a(io.ktor.client.utils.b.f40437a);
            Object obj = aVar.f40413d;
            httpClient$execute$1.label = 1;
            objA = this.f40243f.a(aVar, obj, httpClient$execute$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(objA);
        }
        i.c(objA, "null cannot be cast to non-null type io.ktor.client.call.HttpClientCall");
        return (io.ktor.client.call.a) objA;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (f40238m.compareAndSet(this, 0, 1)) {
            io.ktor.util.b bVar = (io.ktor.util.b) this.j.c(j.f40368a);
            Iterator<T> it = bVar.a().iterator();
            while (it.hasNext()) {
                io.ktor.util.a aVar = (io.ktor.util.a) it.next();
                i.c(aVar, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>");
                Object objC = bVar.c(aVar);
                if (objC instanceof Closeable) {
                    ((Closeable) objC).close();
                }
            }
            this.f40241d.b();
            if (this.f40240c) {
                this.f40239b.close();
            }
        }
    }

    @Override // kotlinx.coroutines.A
    public final e getCoroutineContext() {
        return this.f40242e;
    }

    public final String toString() {
        return "HttpClient[" + this.f40239b + ']';
    }
}
