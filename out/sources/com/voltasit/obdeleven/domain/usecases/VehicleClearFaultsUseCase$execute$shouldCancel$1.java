package com.voltasit.obdeleven.domain.usecases;

import G8.I;
import com.obdeleven.service.model.ControlUnit;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: VehicleClearFaultsUseCase.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.VehicleClearFaultsUseCase$execute$shouldCancel$1", f = "VehicleClearFaultsUseCase.kt", l = {R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle}, m = "invokeSuspend")
final class VehicleClearFaultsUseCase$execute$shouldCancel$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super Boolean>, Object> {
    final /* synthetic */ List<ControlUnit> $faultyCus;
    final /* synthetic */ VehicleClearFaultsUseCase.b $params;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VehicleClearFaultsUseCase$execute$shouldCancel$1(VehicleClearFaultsUseCase.b bVar, List<? extends ControlUnit> list, kotlin.coroutines.c<? super VehicleClearFaultsUseCase$execute$shouldCancel$1> cVar) {
        super(2, cVar);
        this.$params = bVar;
        this.$faultyCus = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new VehicleClearFaultsUseCase$execute$shouldCancel$1(this.$params, this.$faultyCus, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super Boolean> cVar) {
        return ((VehicleClearFaultsUseCase$execute$shouldCancel$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            Ia.p<I, kotlin.coroutines.c<? super Boolean>, Object> pVar = this.$params.f30629a;
            I.a aVar = new I.a(this.$faultyCus);
            this.label = 1;
            obj = pVar.invoke(aVar, this);
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
