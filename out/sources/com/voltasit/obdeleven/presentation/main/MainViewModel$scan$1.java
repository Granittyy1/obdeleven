package com.voltasit.obdeleven.presentation.main;

import G8.I;
import Ia.p;
import androidx.lifecycle.Z;
import java.util.Timer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import p114j1.C2479a;
import p134k8.a2;
import p293xa.r;

/* JADX INFO: compiled from: MainViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.main.MainViewModel$scan$1", f = "MainViewModel.kt", l = {451}, m = "invokeSuspend")
public final class MainViewModel$scan$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ boolean $isSlowScanApproved;
    final /* synthetic */ a2 $vehicle;
    int label;
    final /* synthetic */ MainViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$scan$1(MainViewModel mainViewModel, a2 a2Var, boolean z10, kotlin.coroutines.c<? super MainViewModel$scan$1> cVar) {
        super(2, cVar);
        this.this$0 = mainViewModel;
        this.$vehicle = a2Var;
        this.$isSlowScanApproved = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new MainViewModel$scan$1(this.this$0, this.$vehicle, this.$isSlowScanApproved, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((MainViewModel$scan$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            MainViewModel mainViewModel = this.this$0;
            com.voltasit.obdeleven.domain.usecases.vehicle.r rVar = mainViewModel.f32610w;
            p<I, kotlin.coroutines.c<? super Boolean>, Object> pVar = mainViewModel.f32584d1;
            a2 a2Var = this.$vehicle;
            boolean z10 = this.$isSlowScanApproved;
            this.label = 1;
            obj = rVar.b(pVar, a2Var, z10, this);
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
            MainViewModel mainViewModel2 = this.this$0;
            com.voltasit.obdeleven.domain.usecases.vehicle.r.b bVar = (com.voltasit.obdeleven.domain.usecases.vehicle.r.b) ((C8.a.b) aVar).f2463a;
            mainViewModel2.i(bVar.f31083a, bVar.f31084b);
        } else {
            if (!(aVar instanceof C8.a.C0024a)) {
                throw new NoWhenBranchMatchedException();
            }
            MainViewModel mainViewModel3 = this.this$0;
            C2479a c2479a = mainViewModel3.f32551N;
            S8.c cVar = mainViewModel3.f32549M;
            cVar.f5701a = c2479a;
            cVar.f5702b = new Timer();
            cVar.f5702b.scheduleAtFixedRate(new S8.b(cVar), 0L, 1000L);
            C2680e.c(Z.a(mainViewModel3), mainViewModel3.f32112a, null, new MainViewModel$onFullScanDone$1(mainViewModel3, null), 2);
            mainViewModel3.f32537G.d(((C8.a.C0024a) aVar).f2462a, false);
        }
        r rVar2 = r.f47939a;
        Na.i iVar = E8.a.f3126a;
        return rVar2;
    }
}
