package io.ktor.client.call;

import io.intercom.android.sdk.metrics.MetricTracker;
import io.ktor.client.HttpClient;
import io.ktor.client.statement.f;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l;
import kotlinx.coroutines.A;
import kotlinx.coroutines.B;

/* JADX INFO: compiled from: HttpClientCall.kt */
/* JADX INFO: loaded from: classes.dex */
public class a implements A {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HttpClient f40262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public V9.b f40263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public io.ktor.client.statement.c f40264d;
    private volatile /* synthetic */ int received;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final io.ktor.util.a<Object> f40261f = new io.ktor.util.a<>("CustomResponse");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f40260e = AtomicIntegerFieldUpdater.newUpdater(a.class, MetricTracker.Action.RECEIVED);

    public a(HttpClient client) {
        i.e(client, "client");
        this.f40262b = client;
        this.received = 0;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(p023ba.a aVar, ContinuationImpl continuationImpl) {
        HttpClientCall$bodyNullable$1 httpClientCall$bodyNullable$1;
        a aVar2;
        a aVar3;
        Object obj;
        if (continuationImpl instanceof HttpClientCall$bodyNullable$1) {
            httpClientCall$bodyNullable$1 = (HttpClientCall$bodyNullable$1) continuationImpl;
            int i10 = httpClientCall$bodyNullable$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                httpClientCall$bodyNullable$1.label = i10 - Integer.MIN_VALUE;
            } else {
                httpClientCall$bodyNullable$1 = new HttpClientCall$bodyNullable$1(this, continuationImpl);
            }
        } else {
            httpClientCall$bodyNullable$1 = new HttpClientCall$bodyNullable$1(this, continuationImpl);
        }
        Object objD = httpClientCall$bodyNullable$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = httpClientCall$bodyNullable$1.label;
        if (i11 == 0) {
            kotlin.b.b(objD);
            try {
                if (p241t7.b.r(aVar.f20638a).isInstance(d())) {
                    io.ktor.client.statement.c cVarD = d();
                    io.ktor.client.statement.e.b(d());
                    return cVarD;
                }
                if (!b() && !f40260e.compareAndSet(this, 0, 1)) {
                    throw new DoubleReceiveException(this);
                }
                objD = c().getAttributes().d(f40261f);
                if (objD == null) {
                    httpClientCall$bodyNullable$1.L$0 = this;
                    httpClientCall$bodyNullable$1.L$1 = aVar;
                    httpClientCall$bodyNullable$1.label = 1;
                    objD = e();
                    if (objD == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                aVar3 = this;
            } catch (Throwable th) {
                th = th;
                aVar2 = this;
                B.c(aVar2.d(), h.b("Receive failed", th));
                throw th;
            }
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (p023ba.a) httpClientCall$bodyNullable$1.L$1;
                aVar2 = (a) httpClientCall$bodyNullable$1.L$0;
                try {
                    kotlin.b.b(objD);
                    obj = ((io.ktor.client.statement.d) objD).f40429b;
                    if (!i.a(obj, X9.a.f7430a)) {
                        obj = null;
                    }
                    if (obj != null && !p241t7.b.r(aVar.f20638a).isInstance(obj)) {
                        throw new NoTransformationFoundException(aVar2.d(), l.a(obj.getClass()), aVar.f20638a);
                    }
                    io.ktor.client.statement.e.b(aVar2.d());
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        B.c(aVar2.d(), h.b("Receive failed", th));
                        throw th;
                    } catch (Throwable th3) {
                        io.ktor.client.statement.e.b(aVar2.d());
                        throw th3;
                    }
                }
            }
            aVar = (p023ba.a) httpClientCall$bodyNullable$1.L$1;
            aVar3 = (a) httpClientCall$bodyNullable$1.L$0;
            try {
                kotlin.b.b(objD);
            } catch (Throwable th4) {
                th = th4;
                aVar2 = aVar3;
                B.c(aVar2.d(), h.b("Receive failed", th));
                throw th;
            }
        }
        io.ktor.client.statement.d dVar = new io.ktor.client.statement.d(aVar, objD);
        f fVar = aVar3.f40262b.f40244g;
        httpClientCall$bodyNullable$1.L$0 = aVar3;
        httpClientCall$bodyNullable$1.L$1 = aVar;
        httpClientCall$bodyNullable$1.label = 2;
        objD = fVar.a(aVar3, dVar, httpClientCall$bodyNullable$1);
        if (objD == coroutineSingletons) {
            return coroutineSingletons;
        }
        aVar2 = aVar3;
        obj = ((io.ktor.client.statement.d) objD).f40429b;
        if (!i.a(obj, X9.a.f7430a)) {
            obj = null;
        }
        if (obj != null) {
            throw new NoTransformationFoundException(aVar2.d(), l.a(obj.getClass()), aVar.f20638a);
        }
        io.ktor.client.statement.e.b(aVar2.d());
        return obj;
    }

    public boolean b() {
        return false;
    }

    public final V9.b c() {
        V9.b bVar = this.f40263c;
        if (bVar != null) {
            return bVar;
        }
        i.m("request");
        throw null;
    }

    public final io.ktor.client.statement.c d() {
        io.ktor.client.statement.c cVar = this.f40264d;
        if (cVar != null) {
            return cVar;
        }
        i.m("response");
        throw null;
    }

    public Object e() {
        return d().c();
    }

    @Override // kotlinx.coroutines.A
    public final kotlin.coroutines.e getCoroutineContext() {
        return d().getCoroutineContext();
    }

    public final String toString() {
        return "HttpClientCall[" + c().k() + ", " + d().f() + ']';
    }
}
