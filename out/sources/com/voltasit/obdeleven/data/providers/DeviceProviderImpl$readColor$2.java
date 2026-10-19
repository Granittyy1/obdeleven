package com.voltasit.obdeleven.data.providers;

import com.parse.boltsinternal.Task;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: DeviceProviderImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.data.providers.DeviceProviderImpl$readColor$2", f = "DeviceProviderImpl.kt", l = {}, m = "invokeSuspend")
final class DeviceProviderImpl$readColor$2 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ Task<String> $readColorTask;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceProviderImpl$readColor$2(Task<String> task, kotlin.coroutines.c<? super DeviceProviderImpl$readColor$2> cVar) {
        super(2, cVar);
        this.$readColorTask = task;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new DeviceProviderImpl$readColor$2(this.$readColorTask, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((DeviceProviderImpl$readColor$2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws InterruptedException {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        this.$readColorTask.waitForCompletion();
        return p293xa.r.f47939a;
    }
}
