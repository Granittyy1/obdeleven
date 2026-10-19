package io.ktor.client.plugins;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: HttpCallValidator.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "io.ktor.client.plugins.HttpCallValidator$Companion$install$2", f = "HttpCallValidator.kt", l = {142, 145}, m = "invokeSuspend")
final class HttpCallValidator$Companion$install$2 extends SuspendLambda implements Ia.q<io.ktor.util.pipeline.c<io.ktor.client.statement.d, io.ktor.client.call.a>, io.ktor.client.statement.d, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ f $plugin;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpCallValidator$Companion$install$2(f fVar, kotlin.coroutines.c<? super HttpCallValidator$Companion$install$2> cVar) {
        super(3, cVar);
        this.$plugin = fVar;
    }

    @Override // Ia.q
    public final Object invoke(io.ktor.util.pipeline.c<io.ktor.client.statement.d, io.ktor.client.call.a> cVar, io.ktor.client.statement.d dVar, kotlin.coroutines.c<? super p293xa.r> cVar2) {
        HttpCallValidator$Companion$install$2 httpCallValidator$Companion$install$2 = new HttpCallValidator$Companion$install$2(this.$plugin, cVar2);
        httpCallValidator$Companion$install$2.L$0 = cVar;
        httpCallValidator$Companion$install$2.L$1 = dVar;
        return httpCallValidator$Companion$install$2.invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [io.ktor.util.pipeline.c] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        ?? r10 = this.label;
        try {
            if (r10 == 0) {
                kotlin.b.b(obj);
                io.ktor.util.pipeline.c cVar = (io.ktor.util.pipeline.c) this.L$0;
                io.ktor.client.statement.d dVar = (io.ktor.client.statement.d) this.L$1;
                this.L$0 = cVar;
                this.label = 1;
                Object objD = cVar.d(dVar, this);
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
            f fVar = this.$plugin;
            V9.b bVarC = ((io.ktor.client.call.a) r10.f40561b).c();
            this.L$0 = thI;
            this.label = 2;
            if (f.a(fVar, thI, bVarC, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            throw thI;
        }
    }
}
