package com.voltasit.obdeleven.presentation.main;

import Ia.p;
import androidx.lifecycle.Z;
import com.voltasit.obdeleven.domain.usecases.VehicleClearFaultsUseCase;
import java.util.List;
import java.util.Timer;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import p114j1.C2479a;
import p134k8.a2;
import p293xa.r;

/* JADX INFO: compiled from: MainViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.main.MainViewModel$clearFaults$1", f = "MainViewModel.kt", l = {487}, m = "invokeSuspend")
final class MainViewModel$clearFaults$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ a2 $vehicle;
    int label;
    final /* synthetic */ MainViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$clearFaults$1(MainViewModel mainViewModel, a2 a2Var, kotlin.coroutines.c<? super MainViewModel$clearFaults$1> cVar) {
        super(2, cVar);
        this.this$0 = mainViewModel;
        this.$vehicle = a2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new MainViewModel$clearFaults$1(this.this$0, this.$vehicle, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((MainViewModel$clearFaults$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            VehicleClearFaultsUseCase.b bVar = new VehicleClearFaultsUseCase.b(this.this$0.f32584d1, this.$vehicle);
            VehicleClearFaultsUseCase vehicleClearFaultsUseCase = this.this$0.f32612x;
            this.label = 1;
            obj = vehicleClearFaultsUseCase.j0(bVar, this);
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
            this.this$0.i((List) ((C8.a.b) aVar).f2463a, null);
        } else if (aVar instanceof C8.a.C0024a) {
            MainViewModel mainViewModel = this.this$0;
            C2479a c2479a = mainViewModel.f32551N;
            S8.c cVar = mainViewModel.f32549M;
            cVar.f5701a = c2479a;
            cVar.f5702b = new Timer();
            cVar.f5702b.scheduleAtFixedRate(new S8.b(cVar), 0L, 1000L);
            C2680e.c(Z.a(mainViewModel), mainViewModel.f32112a, null, new MainViewModel$onFullScanDone$1(mainViewModel, null), 2);
            mainViewModel.f32537G.d(((C8.a.C0024a) aVar).f2462a, false);
        }
        return r.f47939a;
    }
}
