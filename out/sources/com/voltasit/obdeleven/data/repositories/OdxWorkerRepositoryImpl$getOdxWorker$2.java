package com.voltasit.obdeleven.data.repositories;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;

/* JADX INFO: compiled from: OdxWorkerRepositoryImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.data.repositories.OdxWorkerRepositoryImpl$getOdxWorker$2", f = "OdxWorkerRepositoryImpl.kt", l = {}, m = "invokeSuspend")
final class OdxWorkerRepositoryImpl$getOdxWorker$2 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super C8.a.b<? extends com.obdeleven.service.odx.e>>, Object> {
    final /* synthetic */ short $klineId;
    final /* synthetic */ String $odxName;
    final /* synthetic */ String $odxVersion;
    final /* synthetic */ String $platform;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OdxWorkerRepositoryImpl$getOdxWorker$2(short s10, String str, String str2, String str3, kotlin.coroutines.c<? super OdxWorkerRepositoryImpl$getOdxWorker$2> cVar) {
        super(2, cVar);
        this.$klineId = s10;
        this.$odxName = str;
        this.$odxVersion = str2;
        this.$platform = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new OdxWorkerRepositoryImpl$getOdxWorker$2(this.$klineId, this.$odxName, this.$odxVersion, this.$platform, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super C8.a.b<? extends com.obdeleven.service.odx.e>> cVar) {
        return ((OdxWorkerRepositoryImpl$getOdxWorker$2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        return new C8.a.b(com.obdeleven.service.odx.e.a(new com.obdeleven.service.odx.c(this.$klineId, this.$odxName, this.$odxVersion, this.$platform, false)));
    }
}
