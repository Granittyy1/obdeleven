package com.voltasit.obdeleven.presentation.oca;

import Ia.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: OcaViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.oca.OcaViewModel$checkPopTheHoodAndStartWrite$1", f = "OcaViewModel.kt", l = {239}, m = "invokeSuspend")
final class OcaViewModel$checkPopTheHoodAndStartWrite$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OcaViewModel$checkPopTheHoodAndStartWrite$1(k kVar, kotlin.coroutines.c<? super OcaViewModel$checkPopTheHoodAndStartWrite$1> cVar) {
        super(2, cVar);
        this.this$0 = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new OcaViewModel$checkPopTheHoodAndStartWrite$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((OcaViewModel$checkPopTheHoodAndStartWrite$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            k kVar = this.this$0;
            this.label = 1;
            obj = k.c(kVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            U7.a<r> aVar = this.this$0.f32747e0;
            r rVar = r.f47939a;
            aVar.j(rVar);
            return rVar;
        }
        this.this$0.i(2);
        U7.a<r> aVar2 = this.this$0.f32749g0;
        r rVar2 = r.f47939a;
        aVar2.j(rVar2);
        return rVar2;
    }
}
