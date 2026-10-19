package com.voltasit.obdeleven.presentation.controlunitlist.online;

import Aa.c;
import Ia.p;
import K8.o;
import com.voltasit.obdeleven.presentation.models.FragmentResult;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: OnlineControlUnitListViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "com.voltasit.obdeleven.presentation.controlunitlist.online.OnlineControlUnitListViewModel$onAutocodeDialogResult$1", f = "OnlineControlUnitListViewModel.kt", l = {206}, m = "invokeSuspend")
final class OnlineControlUnitListViewModel$onAutocodeDialogResult$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ FragmentResult $fragmentResult;
    int label;
    final /* synthetic */ OnlineControlUnitListViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnlineControlUnitListViewModel$onAutocodeDialogResult$1(FragmentResult fragmentResult, OnlineControlUnitListViewModel onlineControlUnitListViewModel, kotlin.coroutines.c<? super OnlineControlUnitListViewModel$onAutocodeDialogResult$1> cVar) {
        super(2, cVar);
        this.$fragmentResult = fragmentResult;
        this.this$0 = onlineControlUnitListViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new OnlineControlUnitListViewModel$onAutocodeDialogResult$1(this.$fragmentResult, this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((OnlineControlUnitListViewModel$onAutocodeDialogResult$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0055  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            if (this.$fragmentResult != FragmentResult.OnPositive) {
                this.this$0.f32090Y = true;
                return r.f47939a;
            }
            OnlineControlUnitListViewModel onlineControlUnitListViewModel = this.this$0;
            this.label = 1;
            obj = OnlineControlUnitListViewModel.g(onlineControlUnitListViewModel, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            o oVar = this.this$0.f32071F.f4469a;
            if (oVar.c0() && oVar.C()) {
                this.this$0.n();
            } else {
                this.this$0.f32077L.j(SfdUnlockDialogOrigin.f32108c);
            }
        } else {
            this.this$0.n();
        }
        return r.f47939a;
    }
}
