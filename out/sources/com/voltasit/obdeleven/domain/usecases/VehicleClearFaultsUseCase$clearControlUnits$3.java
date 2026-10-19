package com.voltasit.obdeleven.domain.usecases;

import G8.I;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: VehicleClearFaultsUseCase.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.VehicleClearFaultsUseCase$clearControlUnits$3", f = "VehicleClearFaultsUseCase.kt", l = {136}, m = "invokeSuspend")
final class VehicleClearFaultsUseCase$clearControlUnits$3 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super Boolean>, Object> {
    final /* synthetic */ p109i8.e $cu;
    final /* synthetic */ List<p109i8.e> $cus;
    final /* synthetic */ VehicleClearFaultsUseCase.b $params;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VehicleClearFaultsUseCase$clearControlUnits$3(VehicleClearFaultsUseCase.b bVar, List<? extends p109i8.e> list, p109i8.e eVar, kotlin.coroutines.c<? super VehicleClearFaultsUseCase$clearControlUnits$3> cVar) {
        super(2, cVar);
        this.$params = bVar;
        this.$cus = list;
        this.$cu = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new VehicleClearFaultsUseCase$clearControlUnits$3(this.$params, this.$cus, this.$cu, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super Boolean> cVar) {
        return ((VehicleClearFaultsUseCase$clearControlUnits$3) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            Ia.p<I, kotlin.coroutines.c<? super Boolean>, Object> pVar = this.$params.f30629a;
            I.b bVar = new I.b(this.$cus, this.$cu);
            this.label = 1;
            obj = pVar.invoke(bVar, this);
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
