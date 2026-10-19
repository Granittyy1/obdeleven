package io.ktor.client.plugins;

import io.ktor.http.y;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.I;
import kotlinx.coroutines.InterfaceC2694i0;

/* JADX INFO: compiled from: HttpTimeout.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "io.ktor.client.plugins.HttpTimeout$Plugin$install$1$1$killer$1", f = "HttpTimeout.kt", l = {164}, m = "invokeSuspend")
public final class HttpTimeout$Plugin$install$1$1$killer$1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ InterfaceC2694i0 $executionContext;
    final /* synthetic */ io.ktor.client.request.a $request;
    final /* synthetic */ Long $requestTimeout;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpTimeout$Plugin$install$1$1$killer$1(Long l10, io.ktor.client.request.a aVar, InterfaceC2694i0 interfaceC2694i0, kotlin.coroutines.c<? super HttpTimeout$Plugin$install$1$1$killer$1> cVar) {
        super(2, cVar);
        this.$requestTimeout = l10;
        this.$request = aVar;
        this.$executionContext = interfaceC2694i0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new HttpTimeout$Plugin$install$1$1$killer$1(this.$requestTimeout, this.$request, this.$executionContext, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((HttpTimeout$Plugin$install$1$1$killer$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            long jLongValue = this.$requestTimeout.longValue();
            this.label = 1;
            if (I.b(jLongValue, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        io.ktor.client.request.a request = this.$request;
        kotlin.jvm.internal.i.e(request, "request");
        io.ktor.http.x xVar = request.f40410a;
        xVar.a();
        StringBuilder sb2 = new StringBuilder(256);
        y.a(xVar, sb2);
        String string = sb2.toString();
        kotlin.jvm.internal.i.d(string, "appendTo(StringBuilder(256)).toString()");
        u.b bVar = u.f40400d;
        Map map = (Map) request.f40415f.d(io.ktor.client.engine.c.f40284a);
        u.a aVar = (u.a) (map != null ? map.get(bVar) : null);
        Object obj2 = aVar != null ? aVar.f40405a : null;
        StringBuilder sbA = C7.g.a("Request timeout has expired [url=", string, ", request_timeout=");
        if (obj2 == null) {
            obj2 = "unknown";
        }
        sbA.append(obj2);
        sbA.append(" ms]");
        HttpRequestTimeoutException httpRequestTimeoutException = new HttpRequestTimeoutException(sbA.toString());
        v.f40408a.b("Request timeout: " + this.$request.f40410a);
        InterfaceC2694i0 interfaceC2694i0 = this.$executionContext;
        String message = httpRequestTimeoutException.getMessage();
        kotlin.jvm.internal.i.b(message);
        interfaceC2694i0.i(kotlin.jvm.internal.h.b(message, httpRequestTimeoutException));
        return p293xa.r.f47939a;
    }
}
