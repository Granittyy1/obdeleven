package com.voltasit.obdeleven.data.providers;

import com.parse.boltsinternal.Task;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p134k8.T0;

/* JADX INFO: compiled from: GatewayProviderImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.data.providers.GatewayProviderImpl$autoCode$2", f = "GatewayProviderImpl.kt", l = {}, m = "invokeSuspend")
final class GatewayProviderImpl$autoCode$2 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ Q8.a $autoCodeItem;
    final /* synthetic */ Ref$ObjectRef<T0> $autoCodeResult;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GatewayProviderImpl$autoCode$2(Ref$ObjectRef<T0> ref$ObjectRef, Q8.a aVar, kotlin.coroutines.c<? super GatewayProviderImpl$autoCode$2> cVar) {
        super(2, cVar);
        this.$autoCodeResult = ref$ObjectRef;
        this.$autoCodeItem = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new GatewayProviderImpl$autoCode$2(this.$autoCodeResult, this.$autoCodeItem, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((GatewayProviderImpl$autoCode$2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, k8.T0] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        Ref$ObjectRef<T0> ref$ObjectRef = this.$autoCodeResult;
        p109i8.h hVar = this.$autoCodeItem.f5126b;
        ?? W10 = hVar.w();
        try {
            Task.delay(hVar.j()).waitForCompletion();
        } catch (InterruptedException e10) {
            O.e.m(e10);
            Thread.currentThread().interrupt();
        }
        ref$ObjectRef.element = W10;
        return p293xa.r.f47939a;
    }
}
