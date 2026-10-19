package com.voltasit.obdeleven.presentation.controlunitlist.online;

import Aa.c;
import Ia.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: OnlineControlUnitListViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "com.voltasit.obdeleven.presentation.controlunitlist.online.OnlineControlUnitListViewModel$swipeRefresh$1", f = "OnlineControlUnitListViewModel.kt", l = {237}, m = "invokeSuspend")
final class OnlineControlUnitListViewModel$swipeRefresh$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    int label;
    final /* synthetic */ OnlineControlUnitListViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnlineControlUnitListViewModel$swipeRefresh$1(OnlineControlUnitListViewModel onlineControlUnitListViewModel, kotlin.coroutines.c<? super OnlineControlUnitListViewModel$swipeRefresh$1> cVar) {
        super(2, cVar);
        this.this$0 = onlineControlUnitListViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new OnlineControlUnitListViewModel$swipeRefresh$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((OnlineControlUnitListViewModel$swipeRefresh$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            OnlineControlUnitListViewModel onlineControlUnitListViewModel = this.this$0;
            this.label = 1;
            if (onlineControlUnitListViewModel.k(true, false, this) == coroutineSingletons) {
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
