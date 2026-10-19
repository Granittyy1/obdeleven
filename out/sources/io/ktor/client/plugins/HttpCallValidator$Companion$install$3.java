package io.ktor.client.plugins;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: HttpCallValidator.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "io.ktor.client.plugins.HttpCallValidator$Companion$install$3", f = "HttpCallValidator.kt", l = {151, 152}, m = "invokeSuspend")
final class HttpCallValidator$Companion$install$3 extends SuspendLambda implements Ia.q<x, io.ktor.client.request.a, kotlin.coroutines.c<? super io.ktor.client.call.a>, Object> {
    final /* synthetic */ f $plugin;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpCallValidator$Companion$install$3(f fVar, kotlin.coroutines.c<? super HttpCallValidator$Companion$install$3> cVar) {
        super(3, cVar);
        this.$plugin = fVar;
    }

    @Override // Ia.q
    public final Object invoke(x xVar, io.ktor.client.request.a aVar, kotlin.coroutines.c<? super io.ktor.client.call.a> cVar) {
        HttpCallValidator$Companion$install$3 httpCallValidator$Companion$install$3 = new HttpCallValidator$Companion$install$3(this.$plugin, cVar);
        httpCallValidator$Companion$install$3.L$0 = xVar;
        httpCallValidator$Companion$install$3.L$1 = aVar;
        return httpCallValidator$Companion$install$3.invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            x xVar = (x) this.L$0;
            io.ktor.client.request.a aVar = (io.ktor.client.request.a) this.L$1;
            this.L$0 = null;
            this.label = 1;
            obj = xVar.a(aVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                io.ktor.client.call.a aVar2 = (io.ktor.client.call.a) this.L$0;
                kotlin.b.b(obj);
                return aVar2;
            }
            kotlin.b.b(obj);
        }
        io.ktor.client.call.a aVar3 = (io.ktor.client.call.a) obj;
        f fVar = this.$plugin;
        io.ktor.client.statement.c cVarD = aVar3.d();
        this.L$0 = aVar3;
        this.label = 2;
        return f.b(fVar, cVarD, this) == coroutineSingletons ? coroutineSingletons : aVar3;
    }
}
