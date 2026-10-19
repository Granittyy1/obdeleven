package io.ktor.client.plugins;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: HttpCallValidator.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "io.ktor.client.plugins.HttpCallValidator$Companion$install$1", f = "HttpCallValidator.kt", l = {130, 133}, m = "invokeSuspend")
final class HttpCallValidator$Companion$install$1 extends SuspendLambda implements Ia.q<io.ktor.util.pipeline.c<Object, io.ktor.client.request.a>, Object, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ f $plugin;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpCallValidator$Companion$install$1(f fVar, kotlin.coroutines.c<? super HttpCallValidator$Companion$install$1> cVar) {
        super(3, cVar);
        this.$plugin = fVar;
    }

    @Override // Ia.q
    public final Object invoke(io.ktor.util.pipeline.c<Object, io.ktor.client.request.a> cVar, Object obj, kotlin.coroutines.c<? super p293xa.r> cVar2) {
        HttpCallValidator$Companion$install$1 httpCallValidator$Companion$install$1 = new HttpCallValidator$Companion$install$1(this.$plugin, cVar2);
        httpCallValidator$Companion$install$1.L$0 = cVar;
        httpCallValidator$Companion$install$1.L$1 = obj;
        return httpCallValidator$Companion$install$1.invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [io.ktor.util.pipeline.c] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        ?? r10 = this.label;
        try {
            if (r10 == 0) {
                kotlin.b.b(obj);
                io.ktor.util.pipeline.c cVar = (io.ktor.util.pipeline.c) this.L$0;
                Object obj2 = this.L$1;
                io.ktor.util.f fVar = ((io.ktor.client.request.a) cVar.f40561b).f40415f;
                io.ktor.util.a<Boolean> aVar = h.f40367b;
                final f fVar2 = this.$plugin;
                fVar.e(aVar, new Ia.a<Boolean>() { // from class: io.ktor.client.plugins.HttpCallValidator$Companion$install$1.1
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final Boolean invoke() {
                        return Boolean.valueOf(fVar2.f40358c);
                    }
                });
                this.L$0 = cVar;
                this.label = 1;
                Object objD = cVar.d(obj2, this);
                r10 = cVar;
                if (objD == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (r10 != 1) {
                    if (r10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th = (Throwable) this.L$0;
                    kotlin.b.b(obj);
                    throw th;
                }
                io.ktor.util.pipeline.c cVar2 = (io.ktor.util.pipeline.c) this.L$0;
                kotlin.b.b(obj);
                r10 = cVar2;
            }
            return p293xa.r.f47939a;
        } catch (Throwable th2) {
            Throwable thI = com.voltasit.obdeleven.domain.usecases.device.v.i(th2);
            f fVar3 = this.$plugin;
            io.ktor.client.request.a aVar2 = (io.ktor.client.request.a) r10.f40561b;
            cc.b bVar = h.f40366a;
            g gVar = new g(aVar2);
            this.L$0 = thI;
            this.label = 2;
            if (f.a(fVar3, thI, gVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            throw thI;
        }
    }
}
