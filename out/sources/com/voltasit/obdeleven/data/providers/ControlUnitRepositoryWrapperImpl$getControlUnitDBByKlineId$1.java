package com.voltasit.obdeleven.data.providers;

import com.parse.ControlUnitDB;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: ControlUnitRepositoryWrapperImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.data.providers.ControlUnitRepositoryWrapperImpl$getControlUnitDBByKlineId$1", f = "ControlUnitRepositoryWrapperImpl.kt", l = {24}, m = "invokeSuspend")
public final class ControlUnitRepositoryWrapperImpl$getControlUnitDBByKlineId$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super C8.a<? extends ControlUnitDB>>, Object> {
    final /* synthetic */ short $klineId;
    int label;
    final /* synthetic */ ControlUnitRepositoryWrapperImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ControlUnitRepositoryWrapperImpl$getControlUnitDBByKlineId$1(ControlUnitRepositoryWrapperImpl controlUnitRepositoryWrapperImpl, short s10, kotlin.coroutines.c<? super ControlUnitRepositoryWrapperImpl$getControlUnitDBByKlineId$1> cVar) {
        super(2, cVar);
        this.this$0 = controlUnitRepositoryWrapperImpl;
        this.$klineId = s10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ControlUnitRepositoryWrapperImpl$getControlUnitDBByKlineId$1(this.this$0, this.$klineId, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super C8.a<? extends ControlUnitDB>> cVar) {
        return ((ControlUnitRepositoryWrapperImpl$getControlUnitDBByKlineId$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            com.voltasit.obdeleven.domain.usecases.vehicle.g gVar = this.this$0.f30215c;
            short s10 = this.$klineId;
            this.label = 1;
            obj = gVar.a(s10, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return obj;
    }
}
