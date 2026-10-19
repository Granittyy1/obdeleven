package com.voltasit.obdeleven.presentation.controlUnit;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: OnlineControlUnitViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.controlUnit.OnlineControlUnitViewModel$updateControlUnitList$1", f = "OnlineControlUnitViewModel.kt", l = {44}, m = "invokeSuspend")
final class OnlineControlUnitViewModel$updateControlUnitList$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ short $controlUnitId;
    int label;
    final /* synthetic */ F this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnlineControlUnitViewModel$updateControlUnitList$1(F f10, short s10, kotlin.coroutines.c<? super OnlineControlUnitViewModel$updateControlUnitList$1> cVar) {
        super(2, cVar);
        this.this$0 = f10;
        this.$controlUnitId = s10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new OnlineControlUnitViewModel$updateControlUnitList$1(this.this$0, this.$controlUnitId, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((OnlineControlUnitViewModel$updateControlUnitList$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            com.voltasit.obdeleven.domain.usecases.controlUnit.d dVar = this.this$0.f31465o;
            short s10 = this.$controlUnitId;
            this.label = 1;
            Object objB = dVar.f30746a.b(s10, this);
            if (objB != coroutineSingletons) {
                objB = p293xa.r.f47939a;
            }
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return p293xa.r.f47939a;
    }
}
