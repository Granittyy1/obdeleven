package com.voltasit.obdeleven.domain.usecases;

import com.parse.boltsinternal.Task;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: BluetoothRequestUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.BluetoothRequestUC$request$2", f = "BluetoothRequestUC.kt", l = {}, m = "invokeSuspend")
final class BluetoothRequestUC$request$2 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ Task<String> $protocolTask;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BluetoothRequestUC$request$2(Task<String> task, kotlin.coroutines.c<? super BluetoothRequestUC$request$2> cVar) {
        super(2, cVar);
        this.$protocolTask = task;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new BluetoothRequestUC$request$2(this.$protocolTask, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((BluetoothRequestUC$request$2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws InterruptedException {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        this.$protocolTask.waitForCompletion();
        return p293xa.r.f47939a;
    }
}
