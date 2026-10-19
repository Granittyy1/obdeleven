package com.voltasit.obdeleven.data.providers;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: VehicleProviderImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.data.providers.VehicleProviderImpl$isPopTheHoodRequired$2", f = "VehicleProviderImpl.kt", l = {}, m = "invokeSuspend")
final class VehicleProviderImpl$isPopTheHoodRequired$2 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super C8.a<? extends Boolean>>, Object> {
    int label;
    final /* synthetic */ A this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VehicleProviderImpl$isPopTheHoodRequired$2(A a10, kotlin.coroutines.c<? super VehicleProviderImpl$isPopTheHoodRequired$2> cVar) {
        super(2, cVar);
        this.this$0 = a10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new VehicleProviderImpl$isPopTheHoodRequired$2(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super C8.a<? extends Boolean>> cVar) {
        return ((VehicleProviderImpl$isPopTheHoodRequired$2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        try {
            return new C8.a.b(Boolean.valueOf(this.this$0.k().i(null)));
        } catch (Exception e10) {
            return new C8.a.C0024a(e10);
        }
    }
}
