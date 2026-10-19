package com.voltasit.obdeleven.domain.usecases.controlUnit.adaptation;

import Aa.c;
import Ia.p;
import com.obdeleven.service.model.UDSResult;
import com.obdeleven.service.odx.e;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: GetOfflineUdsAdaptationUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "com.voltasit.obdeleven.domain.usecases.controlUnit.adaptation.GetOfflineUdsAdaptationUC$invoke$udsResult$1", f = "GetOfflineUdsAdaptationUC.kt", l = {}, m = "invokeSuspend")
final class GetOfflineUdsAdaptationUC$invoke$udsResult$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super UDSResult>, Object> {
    final /* synthetic */ int $channel;
    final /* synthetic */ e $odxWorker;
    final /* synthetic */ e.g $tableResult;
    final /* synthetic */ String $value;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetOfflineUdsAdaptationUC$invoke$udsResult$1(int i10, String str, e.g gVar, e eVar, a aVar, kotlin.coroutines.c<? super GetOfflineUdsAdaptationUC$invoke$udsResult$1> cVar) {
        super(2, cVar);
        this.$channel = i10;
        this.$value = str;
        this.$tableResult = gVar;
        this.$odxWorker = eVar;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new GetOfflineUdsAdaptationUC$invoke$udsResult$1(this.$channel, this.$value, this.$tableResult, this.$odxWorker, this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super UDSResult> cVar) {
        return ((GetOfflineUdsAdaptationUC$invoke$udsResult$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        b.b(obj);
        try {
            int i10 = this.$channel;
            String strSubstring = this.$value.substring(6);
            i.d(strSubstring, "substring(...)");
            return UDSResult.b(i10, strSubstring, this.$tableResult, this.$odxWorker);
        } catch (Throwable th) {
            this.this$0.f30653a.d(th, false);
            return null;
        }
    }
}
