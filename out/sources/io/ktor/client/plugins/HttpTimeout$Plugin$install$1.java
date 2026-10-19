package io.ktor.client.plugins;

import io.ktor.client.HttpClient;
import io.ktor.http.A;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.z0;

/* JADX INFO: compiled from: HttpTimeout.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "io.ktor.client.plugins.HttpTimeout$Plugin$install$1", f = "HttpTimeout.kt", l = {146, 174}, m = "invokeSuspend")
final class HttpTimeout$Plugin$install$1 extends SuspendLambda implements Ia.q<x, io.ktor.client.request.a, kotlin.coroutines.c<? super io.ktor.client.call.a>, Object> {
    final /* synthetic */ u $plugin;
    final /* synthetic */ HttpClient $scope;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpTimeout$Plugin$install$1(u uVar, HttpClient httpClient, kotlin.coroutines.c<? super HttpTimeout$Plugin$install$1> cVar) {
        super(3, cVar);
        this.$plugin = uVar;
        this.$scope = httpClient;
    }

    @Override // Ia.q
    public final Object invoke(x xVar, io.ktor.client.request.a aVar, kotlin.coroutines.c<? super io.ktor.client.call.a> cVar) {
        HttpTimeout$Plugin$install$1 httpTimeout$Plugin$install$1 = new HttpTimeout$Plugin$install$1(this.$plugin, this.$scope, cVar);
        httpTimeout$Plugin$install$1.L$0 = xVar;
        httpTimeout$Plugin$install$1.L$1 = aVar;
        return httpTimeout$Plugin$install$1.invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.b.b(obj);
            }
            if (i10 == 2) {
                kotlin.b.b(obj);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        x xVar = (x) this.L$0;
        io.ktor.client.request.a aVar = (io.ktor.client.request.a) this.L$1;
        A a10 = aVar.f40410a.f40516a;
        kotlin.jvm.internal.i.e(a10, "<this>");
        String str = a10.f40445a;
        if (str.equals("ws") || str.equals("wss")) {
            this.L$0 = null;
            this.label = 1;
            obj = xVar.a(aVar, this);
            return obj == coroutineSingletons ? coroutineSingletons : obj;
        }
        u.b bVar = u.f40400d;
        Map map = (Map) aVar.f40415f.d(io.ktor.client.engine.c.f40284a);
        u.a aVar2 = (u.a) (map != null ? map.get(bVar) : null);
        if (aVar2 == null) {
            u uVar = this.$plugin;
            if (uVar.f40402a != null || uVar.f40403b != null || uVar.f40404c != null) {
                aVar2 = new u.a();
                aVar.c(aVar2);
            }
        }
        if (aVar2 != null) {
            u uVar2 = this.$plugin;
            HttpClient httpClient = this.$scope;
            Long l10 = aVar2.f40406b;
            if (l10 == null) {
                l10 = uVar2.f40403b;
            }
            u.a.a(l10);
            aVar2.f40406b = l10;
            Long l11 = aVar2.f40407c;
            if (l11 == null) {
                l11 = uVar2.f40404c;
            }
            u.a.a(l11);
            aVar2.f40407c = l11;
            Long l12 = aVar2.f40405a;
            if (l12 == null) {
                l12 = uVar2.f40402a;
            }
            u.a.a(l12);
            aVar2.f40405a = l12;
            if (l12 == null) {
                l12 = uVar2.f40402a;
            }
            if (l12 != null && l12.longValue() != Long.MAX_VALUE) {
                final z0 z0VarC = C2680e.c(httpClient, null, null, new HttpTimeout$Plugin$install$1$1$killer$1(l12, aVar, aVar.f40414e, null), 3);
                aVar.f40414e.B(new Ia.l<Throwable, p293xa.r>() { // from class: io.ktor.client.plugins.HttpTimeout$Plugin$install$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(Throwable th) {
                        z0VarC.i(null);
                        return p293xa.r.f47939a;
                    }
                });
            }
        }
        this.L$0 = null;
        this.label = 2;
        obj = xVar.a(aVar, this);
        return obj == coroutineSingletons ? coroutineSingletons : obj;
    }
}
