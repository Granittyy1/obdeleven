package com.voltasit.obdeleven.data.providers;

import com.parse.boltsinternal.Task;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: VehicleProviderImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.data.providers.VehicleProviderImpl$getGatewayControlUnits$2", f = "VehicleProviderImpl.kt", l = {}, m = "invokeSuspend")
final class VehicleProviderImpl$getGatewayControlUnits$2 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ Task<Map<Short, com.obdeleven.service.model.f>> $gatewayControlUnitsTask;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VehicleProviderImpl$getGatewayControlUnits$2(Task<Map<Short, com.obdeleven.service.model.f>> task, kotlin.coroutines.c<? super VehicleProviderImpl$getGatewayControlUnits$2> cVar) {
        super(2, cVar);
        this.$gatewayControlUnitsTask = task;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new VehicleProviderImpl$getGatewayControlUnits$2(this.$gatewayControlUnitsTask, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((VehicleProviderImpl$getGatewayControlUnits$2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws InterruptedException {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        this.$gatewayControlUnitsTask.waitForCompletion();
        return p293xa.r.f47939a;
    }
}
