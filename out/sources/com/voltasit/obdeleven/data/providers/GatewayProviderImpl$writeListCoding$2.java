package com.voltasit.obdeleven.data.providers;

import com.parse.boltsinternal.Task;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p134k8.T0;

/* JADX INFO: compiled from: GatewayProviderImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.data.providers.GatewayProviderImpl$writeListCoding$2", f = "GatewayProviderImpl.kt", l = {}, m = "invokeSuspend")
final class GatewayProviderImpl$writeListCoding$2 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ Task<T0> $writeGatewayCoding;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GatewayProviderImpl$writeListCoding$2(Task<T0> task, kotlin.coroutines.c<? super GatewayProviderImpl$writeListCoding$2> cVar) {
        super(2, cVar);
        this.$writeGatewayCoding = task;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new GatewayProviderImpl$writeListCoding$2(this.$writeGatewayCoding, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((GatewayProviderImpl$writeListCoding$2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws InterruptedException {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        this.$writeGatewayCoding.waitForCompletion();
        return p293xa.r.f47939a;
    }
}
