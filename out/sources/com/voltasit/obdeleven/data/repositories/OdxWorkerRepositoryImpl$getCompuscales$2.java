package com.voltasit.obdeleven.data.repositories;

import com.obdeleven.service.odx.model.COMPUSCALE;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import p220r9.C2783o;

/* JADX INFO: compiled from: OdxWorkerRepositoryImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.data.repositories.OdxWorkerRepositoryImpl$getCompuscales$2", f = "OdxWorkerRepositoryImpl.kt", l = {}, m = "invokeSuspend")
public final class OdxWorkerRepositoryImpl$getCompuscales$2 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super List<COMPUSCALE>>, Object> {
    final /* synthetic */ com.obdeleven.service.odx.e $odxWorker;
    final /* synthetic */ com.obdeleven.service.odx.e.g $tableresult;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OdxWorkerRepositoryImpl$getCompuscales$2(com.obdeleven.service.odx.e eVar, com.obdeleven.service.odx.e.g gVar, kotlin.coroutines.c<? super OdxWorkerRepositoryImpl$getCompuscales$2> cVar) {
        super(2, cVar);
        this.$odxWorker = eVar;
        this.$tableresult = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new OdxWorkerRepositoryImpl$getCompuscales$2(this.$odxWorker, this.$tableresult, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super List<COMPUSCALE>> cVar) {
        return ((OdxWorkerRepositoryImpl$getCompuscales$2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        return C2783o.c(this.$odxWorker, this.$tableresult);
    }
}
