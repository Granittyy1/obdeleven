package com.voltasit.obdeleven.domain.usecases.controlUnit.connect;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: DisconnectFromCuUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.controlUnit.connect.DisconnectFromCuUC$invoke$2", f = "DisconnectFromCuUC.kt", l = {}, m = "invokeSuspend")
final class DisconnectFromCuUC$invoke$2 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ short $cuId;
    int label;
    final /* synthetic */ A this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisconnectFromCuUC$invoke$2(A a10, short s10, kotlin.coroutines.c<? super DisconnectFromCuUC$invoke$2> cVar) {
        super(2, cVar);
        this.this$0 = a10;
        this.$cuId = s10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new DisconnectFromCuUC$invoke$2(this.this$0, this.$cuId, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((DisconnectFromCuUC$invoke$2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws InterruptedException {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        this.this$0.f30674c.c(this.$cuId).a().waitForCompletion();
        return p293xa.r.f47939a;
    }
}
