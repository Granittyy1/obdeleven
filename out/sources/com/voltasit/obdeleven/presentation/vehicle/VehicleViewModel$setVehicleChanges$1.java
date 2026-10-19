package com.voltasit.obdeleven.presentation.vehicle;

import G8.H;
import Ia.p;
import K8.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.A;
import p255u9.E;
import p293xa.r;

/* JADX INFO: compiled from: VehicleViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.vehicle.VehicleViewModel$setVehicleChanges$1", f = "VehicleViewModel.kt", l = {286}, m = "invokeSuspend")
final class VehicleViewModel$setVehicleChanges$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    int label;
    final /* synthetic */ VehicleViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VehicleViewModel$setVehicleChanges$1(VehicleViewModel vehicleViewModel, kotlin.coroutines.c<? super VehicleViewModel$setVehicleChanges$1> cVar) {
        super(2, cVar);
        this.this$0 = vehicleViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new VehicleViewModel$setVehicleChanges$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((VehicleViewModel$setVehicleChanges$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            A8.A a10 = this.this$0.f33414p.a();
            E e10 = this.this$0.f33423y;
            i.b(e10);
            a10.getClass();
            H hI = A8.A.i(e10);
            x xVar = this.this$0.f33414p;
            this.label = 1;
            if (xVar.f(hI, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return r.f47939a;
    }
}
