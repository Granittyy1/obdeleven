package com.voltasit.obdeleven.presentation.garage;

import K8.x;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;

/* JADX INFO: compiled from: GarageViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.garage.GarageViewModel$submitVehicle$1", f = "GarageViewModel.kt", l = {317}, m = "invokeSuspend")
final class GarageViewModel$submitVehicle$1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ String $objectId;
    final /* synthetic */ String $vin;
    int label;
    final /* synthetic */ GarageViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GarageViewModel$submitVehicle$1(GarageViewModel garageViewModel, String str, String str2, kotlin.coroutines.c<? super GarageViewModel$submitVehicle$1> cVar) {
        super(2, cVar);
        this.this$0 = garageViewModel;
        this.$vin = str;
        this.$objectId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new GarageViewModel$submitVehicle$1(this.this$0, this.$vin, this.$objectId, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((GarageViewModel$submitVehicle$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            x xVar = this.this$0.f32344u;
            String str = this.$vin;
            String str2 = this.$objectId;
            this.label = 1;
            obj = xVar.c(str, str2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        C8.a aVar = (C8.a) obj;
        if (aVar instanceof C8.a.b) {
            GarageViewModel.b(this.this$0, (List) ((C8.a.b) aVar).f2463a);
        }
        return p293xa.r.f47939a;
    }
}
