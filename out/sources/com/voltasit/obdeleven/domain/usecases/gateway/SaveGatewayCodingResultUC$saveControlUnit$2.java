package com.voltasit.obdeleven.domain.usecases.gateway;

import Ia.p;
import com.parse.ParseException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import p109i8.h;
import p293xa.r;

/* JADX INFO: compiled from: SaveGatewayCodingResultUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.gateway.SaveGatewayCodingResultUC$saveControlUnit$2", f = "SaveGatewayCodingResultUC.kt", l = {}, m = "invokeSuspend")
final class SaveGatewayCodingResultUC$saveControlUnit$2 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ h $gateway;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveGatewayCodingResultUC$saveControlUnit$2(h hVar, kotlin.coroutines.c<? super SaveGatewayCodingResultUC$saveControlUnit$2> cVar) {
        super(2, cVar);
        this.$gateway = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new SaveGatewayCodingResultUC$saveControlUnit$2(this.$gateway, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((SaveGatewayCodingResultUC$saveControlUnit$2) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws ParseException {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        this.$gateway.d().save();
        return r.f47939a;
    }
}
