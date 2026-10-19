package com.voltasit.obdeleven.presentation.garage;

import K8.x;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;

/* JADX INFO: compiled from: GarageViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.garage.GarageViewModel$searchVehicle$1", f = "GarageViewModel.kt", l = {238, 245}, m = "invokeSuspend")
final class GarageViewModel$searchVehicle$1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ String $vin;
    int label;
    final /* synthetic */ GarageViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GarageViewModel$searchVehicle$1(GarageViewModel garageViewModel, String str, kotlin.coroutines.c<? super GarageViewModel$searchVehicle$1> cVar) {
        super(2, cVar);
        this.this$0 = garageViewModel;
        this.$vin = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new GarageViewModel$searchVehicle$1(this.this$0, this.$vin, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((GarageViewModel$searchVehicle$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.b.b(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return p293xa.r.f47939a;
        }
        kotlin.b.b(obj);
        this.this$0.f32113b.j(PreloaderState.c.f32642a);
        x xVar = this.this$0.f32344u;
        String str = this.$vin;
        this.label = 1;
        obj = xVar.k(str, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        C8.a aVar = (C8.a) obj;
        if (aVar instanceof C8.a.b) {
            this.this$0.f32113b.j(PreloaderState.d.f32643a);
            List list = (List) ((C8.a.b) aVar).f2463a;
            if (list.size() <= 1) {
                GarageViewModel.b(this.this$0, list);
            } else {
                GarageViewModel garageViewModel = this.this$0;
                String str2 = this.$vin;
                this.label = 2;
                if (GarageViewModel.e(garageViewModel, list, str2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else if (aVar instanceof C8.a.C0024a) {
            this.this$0.f32113b.j(PreloaderState.d.f32643a);
            B7.b.h(R.string.common_check_network_try_again, this.this$0.f32327T);
        }
        return p293xa.r.f47939a;
    }
}
