package com.voltasit.obdeleven.domain.usecases.controlUnit;

import Ia.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: UpdateControlUnitOdxVersionUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.controlUnit.UpdateControlUnitOdxVersionUC$invoke$2", f = "UpdateControlUnitOdxVersionUC.kt", l = {}, m = "invokeSuspend")
public final class UpdateControlUnitOdxVersionUC$invoke$2 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ p109i8.e $controlUnit;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateControlUnitOdxVersionUC$invoke$2(p109i8.e eVar, kotlin.coroutines.c<? super UpdateControlUnitOdxVersionUC$invoke$2> cVar) {
        super(2, cVar);
        this.$controlUnit = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new UpdateControlUnitOdxVersionUC$invoke$2(this.$controlUnit, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((UpdateControlUnitOdxVersionUC$invoke$2) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        this.$controlUnit.f();
        return r.f47939a;
    }
}
