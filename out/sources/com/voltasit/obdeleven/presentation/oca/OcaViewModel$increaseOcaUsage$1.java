package com.voltasit.obdeleven.presentation.oca;

import Ia.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: OcaViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.oca.OcaViewModel$increaseOcaUsage$1", f = "OcaViewModel.kt", l = {302}, m = "invokeSuspend")
final class OcaViewModel$increaseOcaUsage$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OcaViewModel$increaseOcaUsage$1(k kVar, kotlin.coroutines.c<? super OcaViewModel$increaseOcaUsage$1> cVar) {
        super(2, cVar);
        this.this$0 = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new OcaViewModel$increaseOcaUsage$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((OcaViewModel$increaseOcaUsage$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            I8.a aVar = (I8.a) this.this$0.f32727M.d();
            if (aVar == null) {
                return r.f47939a;
            }
            com.voltasit.obdeleven.domain.usecases.oca.g gVar = this.this$0.f32776y;
            this.label = 1;
            Object objB = gVar.f30879a.b(aVar.f3901a, this);
            if (objB != coroutineSingletons) {
                objB = r.f47939a;
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
        return r.f47939a;
    }
}
