package com.voltasit.obdeleven.presentation.vehicleInfo;

import G8.H;
import Ia.p;
import K8.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: VehicleInfoViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.vehicleInfo.VehicleInfoViewModel$setVehicleChanges$1", f = "VehicleInfoViewModel.kt", l = {20}, m = "invokeSuspend")
public final class VehicleInfoViewModel$setVehicleChanges$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ H $vehicle;
    int label;
    final /* synthetic */ VehicleInfoViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VehicleInfoViewModel$setVehicleChanges$1(VehicleInfoViewModel vehicleInfoViewModel, H h8, kotlin.coroutines.c<? super VehicleInfoViewModel$setVehicleChanges$1> cVar) {
        super(2, cVar);
        this.this$0 = vehicleInfoViewModel;
        this.$vehicle = h8;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new VehicleInfoViewModel$setVehicleChanges$1(this.this$0, this.$vehicle, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((VehicleInfoViewModel$setVehicleChanges$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            x xVar = this.this$0.f33492o;
            H h8 = this.$vehicle;
            this.label = 1;
            if (xVar.f(h8, this) == coroutineSingletons) {
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
