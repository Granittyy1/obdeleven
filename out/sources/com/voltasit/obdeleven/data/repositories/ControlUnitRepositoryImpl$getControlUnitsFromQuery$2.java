package com.voltasit.obdeleven.data.repositories;

import com.parse.ControlUnitDB;
import com.parse.ParseQuery;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;

/* JADX INFO: compiled from: ControlUnitRepositoryImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.data.repositories.ControlUnitRepositoryImpl$getControlUnitsFromQuery$2", f = "ControlUnitRepositoryImpl.kt", l = {}, m = "invokeSuspend")
final class ControlUnitRepositoryImpl$getControlUnitsFromQuery$2 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super w9.d.a<ControlUnitDB>>, Object> {
    final /* synthetic */ ParseQuery<ControlUnitDB> $query;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ControlUnitRepositoryImpl$getControlUnitsFromQuery$2(ParseQuery<ControlUnitDB> parseQuery, kotlin.coroutines.c<? super ControlUnitRepositoryImpl$getControlUnitsFromQuery$2> cVar) {
        super(2, cVar);
        this.$query = parseQuery;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ControlUnitRepositoryImpl$getControlUnitsFromQuery$2(this.$query, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super w9.d.a<ControlUnitDB>> cVar) {
        return ((ControlUnitRepositoryImpl$getControlUnitsFromQuery$2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        return p279w9.d.d(this.$query, null);
    }
}
