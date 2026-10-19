package com.obdeleven.service.odx;

import Ia.p;
import com.obdeleven.service.odx.model.SNREF;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: ParamFactory.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.obdeleven.service.odx.ParamFactory$getTableKeyParam$tableResult$1", f = "ParamFactory.kt", l = {}, m = "invokeSuspend")
final class ParamFactory$getTableKeyParam$tableResult$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super e.g>, Object> {
    final /* synthetic */ e $odxWorker;
    final /* synthetic */ SNREF $tableSnref;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParamFactory$getTableKeyParam$tableResult$1(e eVar, SNREF snref, kotlin.coroutines.c<? super ParamFactory$getTableKeyParam$tableResult$1> cVar) {
        super(2, cVar);
        this.$odxWorker = eVar;
        this.$tableSnref = snref;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ParamFactory$getTableKeyParam$tableResult$1(this.$odxWorker, this.$tableSnref, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super e.g> cVar) {
        return ((ParamFactory$getTableKeyParam$tableResult$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        return this.$odxWorker.H(this.$tableSnref);
    }
}
