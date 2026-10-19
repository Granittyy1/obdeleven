package com.voltasit.obdeleven.presentation.controlunitlist.online;

import Aa.c;
import Ia.p;
import androidx.collection.Y;
import com.obdeleven.service.model.f;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import p134k8.S0;
import p293xa.r;

/* JADX INFO: compiled from: OnlineControlUnitListViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "com.voltasit.obdeleven.presentation.controlunitlist.online.OnlineControlUnitListViewModel$clickCodingDialogOk$1", f = "OnlineControlUnitListViewModel.kt", l = {145}, m = "invokeSuspend")
final class OnlineControlUnitListViewModel$clickCodingDialogOk$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ f $gatewayControlUnit;
    final /* synthetic */ Y<S0> $newStatuses;
    int label;
    final /* synthetic */ OnlineControlUnitListViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnlineControlUnitListViewModel$clickCodingDialogOk$1(OnlineControlUnitListViewModel onlineControlUnitListViewModel, f fVar, Y<S0> y10, kotlin.coroutines.c<? super OnlineControlUnitListViewModel$clickCodingDialogOk$1> cVar) {
        super(2, cVar);
        this.this$0 = onlineControlUnitListViewModel;
        this.$gatewayControlUnit = fVar;
        this.$newStatuses = y10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new OnlineControlUnitListViewModel$clickCodingDialogOk$1(this.this$0, this.$gatewayControlUnit, this.$newStatuses, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((OnlineControlUnitListViewModel$clickCodingDialogOk$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            this.this$0.f32113b.j(new PreloaderState.a(R.string.view_cu_list_coding_gateway_list));
            OnlineControlUnitListViewModel onlineControlUnitListViewModel = this.this$0;
            f fVar = this.$gatewayControlUnit;
            Y<S0> y10 = this.$newStatuses;
            this.label = 1;
            if (OnlineControlUnitListViewModel.h(onlineControlUnitListViewModel, fVar, y10, this) == coroutineSingletons) {
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
