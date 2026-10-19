package com.voltasit.obdeleven.data.providers;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Task;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: VehicleProviderImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.data.providers.VehicleProviderImpl$getExistingControlUnits$2", f = "VehicleProviderImpl.kt", l = {}, m = "invokeSuspend")
final class VehicleProviderImpl$getExistingControlUnits$2 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super C8.a<? extends List<ControlUnit>>>, Object> {
    final /* synthetic */ Task<List<ControlUnit>> $task;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VehicleProviderImpl$getExistingControlUnits$2(Task<List<ControlUnit>> task, kotlin.coroutines.c<? super VehicleProviderImpl$getExistingControlUnits$2> cVar) {
        super(2, cVar);
        this.$task = task;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new VehicleProviderImpl$getExistingControlUnits$2(this.$task, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super C8.a<? extends List<ControlUnit>>> cVar) {
        return ((VehicleProviderImpl$getExistingControlUnits$2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        try {
            this.$task.waitForCompletion(5L, TimeUnit.MINUTES);
            if (this.$task.isFaulted()) {
                Exception error = this.$task.getError();
                kotlin.jvm.internal.i.d(error, "getError(...)");
                bVar = new C8.a.C0024a(error);
            } else {
                bVar = new C8.a.b(this.$task.getResult());
            }
            return bVar;
        } catch (Exception e10) {
            return new C8.a.C0024a(e10);
        }
    }
}
