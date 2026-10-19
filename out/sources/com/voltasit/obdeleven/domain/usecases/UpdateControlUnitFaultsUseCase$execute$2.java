package com.voltasit.obdeleven.domain.usecases;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Task;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: UpdateControlUnitFaultsUseCase.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.UpdateControlUnitFaultsUseCase$execute$2", f = "UpdateControlUnitFaultsUseCase.kt", l = {}, m = "invokeSuspend")
final class UpdateControlUnitFaultsUseCase$execute$2 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super C8.a<? extends List<? extends ControlUnit>>>, Object> {
    final /* synthetic */ List<ControlUnit> $cus;
    final /* synthetic */ Task<Boolean> $task;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UpdateControlUnitFaultsUseCase$execute$2(Task<Boolean> task, List<? extends ControlUnit> list, kotlin.coroutines.c<? super UpdateControlUnitFaultsUseCase$execute$2> cVar) {
        super(2, cVar);
        this.$task = task;
        this.$cus = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new UpdateControlUnitFaultsUseCase$execute$2(this.$task, this.$cus, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super C8.a<? extends List<? extends ControlUnit>>> cVar) {
        return ((UpdateControlUnitFaultsUseCase$execute$2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c0024a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        try {
            this.$task.waitForCompletion(30L, TimeUnit.MINUTES);
            if (this.$task.isCompleted()) {
                c0024a = new C8.a.b(this.$cus);
            } else {
                Exception error = this.$task.getError();
                kotlin.jvm.internal.i.d(error, "getError(...)");
                c0024a = new C8.a.C0024a(error);
            }
            return c0024a;
        } catch (Exception e10) {
            return new C8.a.C0024a(e10);
        }
    }
}
