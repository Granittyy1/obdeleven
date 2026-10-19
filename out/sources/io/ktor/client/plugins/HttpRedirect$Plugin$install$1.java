package io.ktor.client.plugins;

import io.ktor.client.HttpClient;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: HttpRedirect.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "io.ktor.client.plugins.HttpRedirect$Plugin$install$1", f = "HttpRedirect.kt", l = {R.styleable.AppCompatTheme_dividerHorizontal, R.styleable.AppCompatTheme_editTextColor}, m = "invokeSuspend")
final class HttpRedirect$Plugin$install$1 extends SuspendLambda implements Ia.q<x, io.ktor.client.request.a, kotlin.coroutines.c<? super io.ktor.client.call.a>, Object> {
    final /* synthetic */ o $plugin;
    final /* synthetic */ HttpClient $scope;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpRedirect$Plugin$install$1(o oVar, HttpClient httpClient, kotlin.coroutines.c<? super HttpRedirect$Plugin$install$1> cVar) {
        super(3, cVar);
        this.$plugin = oVar;
        this.$scope = httpClient;
    }

    @Override // Ia.q
    public final Object invoke(x xVar, io.ktor.client.request.a aVar, kotlin.coroutines.c<? super io.ktor.client.call.a> cVar) {
        HttpRedirect$Plugin$install$1 httpRedirect$Plugin$install$1 = new HttpRedirect$Plugin$install$1(this.$plugin, this.$scope, cVar);
        httpRedirect$Plugin$install$1.L$0 = xVar;
        httpRedirect$Plugin$install$1.L$1 = aVar;
        return httpRedirect$Plugin$install$1.invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        x xVar;
        io.ktor.client.request.a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                io.ktor.client.request.a aVar2 = (io.ktor.client.request.a) this.L$1;
                x xVar2 = (x) this.L$0;
                kotlin.b.b(obj);
                aVar = aVar2;
                xVar = xVar2;
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
        }
        kotlin.b.b(obj);
        x xVar3 = (x) this.L$0;
        io.ktor.client.request.a aVar3 = (io.ktor.client.request.a) this.L$1;
        this.L$0 = xVar3;
        this.L$1 = aVar3;
        this.label = 1;
        Object objA = xVar3.a(aVar3, this);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        xVar = xVar3;
        aVar = aVar3;
        obj = objA;
        io.ktor.client.call.a aVar4 = (io.ktor.client.call.a) obj;
        this.$plugin.getClass();
        if (!p.f40381a.contains(aVar4.c().getMethod())) {
            return aVar4;
        }
        o.b bVar = o.f40378a;
        this.$plugin.getClass();
        HttpClient httpClient = this.$scope;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        obj = o.b.c(bVar, xVar, aVar, aVar4, httpClient, this);
        return obj == coroutineSingletons ? coroutineSingletons : obj;
    }
}
