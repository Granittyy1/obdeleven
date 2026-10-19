package com.voltasit.obdeleven.data.repositories;

import com.parse.ParseObject;
import com.parse.boltsinternal.Task;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;

/* JADX INFO: compiled from: ControlUnitRepositoryImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.data.repositories.ControlUnitRepositoryImpl$getControlUnitsForGateway$2", f = "ControlUnitRepositoryImpl.kt", l = {}, m = "invokeSuspend")
final class ControlUnitRepositoryImpl$getControlUnitsForGateway$2 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ Task<Map<String, ParseObject>> $task;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ControlUnitRepositoryImpl$getControlUnitsForGateway$2(Task<Map<String, ParseObject>> task, e eVar, kotlin.coroutines.c<? super ControlUnitRepositoryImpl$getControlUnitsForGateway$2> cVar) {
        super(2, cVar);
        this.$task = task;
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ControlUnitRepositoryImpl$getControlUnitsForGateway$2(this.$task, this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((ControlUnitRepositoryImpl$getControlUnitsForGateway$2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        try {
            this.$task.waitForCompletion();
        } catch (InterruptedException e10) {
            this.this$0.f30342e.d(e10, false);
        }
        return p293xa.r.f47939a;
    }
}
