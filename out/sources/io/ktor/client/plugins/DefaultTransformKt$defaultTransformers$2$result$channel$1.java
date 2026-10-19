package io.ktor.client.plugins;

import io.ktor.utils.io.ByteReadChannel;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.B;

/* JADX INFO: compiled from: DefaultTransform.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$2$result$channel$1", f = "DefaultTransform.kt", l = {100}, m = "invokeSuspend")
public final class DefaultTransformKt$defaultTransformers$2$result$channel$1 extends SuspendLambda implements Ia.p<io.ktor.utils.io.j, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ Object $body;
    final /* synthetic */ io.ktor.client.statement.c $response;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultTransformKt$defaultTransformers$2$result$channel$1(Object obj, io.ktor.client.statement.c cVar, kotlin.coroutines.c<? super DefaultTransformKt$defaultTransformers$2$result$channel$1> cVar2) {
        super(2, cVar2);
        this.$body = obj;
        this.$response = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        DefaultTransformKt$defaultTransformers$2$result$channel$1 defaultTransformKt$defaultTransformers$2$result$channel$1 = new DefaultTransformKt$defaultTransformers$2$result$channel$1(this.$body, this.$response, cVar);
        defaultTransformKt$defaultTransformers$2$result$channel$1.L$0 = obj;
        return defaultTransformKt$defaultTransformers$2$result$channel$1;
    }

    @Override // Ia.p
    public final Object invoke(io.ktor.utils.io.j jVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((DefaultTransformKt$defaultTransformers$2$result$channel$1) create(jVar, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        try {
            if (i10 != 0) {
                try {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                } catch (Throwable th) {
                    io.ktor.client.statement.e.b(this.$response);
                    throw th;
                }
            } else {
                kotlin.b.b(obj);
                io.ktor.utils.io.j jVar = (io.ktor.utils.io.j) this.L$0;
                ByteReadChannel byteReadChannel = (ByteReadChannel) this.$body;
                io.ktor.utils.io.a aVarR = jVar.R();
                this.label = 1;
                if (io.ktor.utils.io.c.a(byteReadChannel, aVarR, Long.MAX_VALUE, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            io.ktor.client.statement.e.b(this.$response);
            return p293xa.r.f47939a;
        } catch (CancellationException e10) {
            B.c(this.$response, e10);
            throw e10;
        } catch (Throwable th2) {
            B.c(this.$response, kotlin.jvm.internal.h.b("Receive failed", th2));
            throw th2;
        }
    }
}
