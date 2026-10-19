package com.voltasit.obdeleven.domain.usecases.controlUnit.connect;

import com.obdeleven.service.protocol.Protocol;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: ConnectToKlineEngineCuUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.controlUnit.connect.ConnectToKlineEngineCuUC$invoke$4", f = "ConnectToKlineEngineCuUC.kt", l = {}, m = "invokeSuspend")
final class ConnectToKlineEngineCuUC$invoke$4 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ Protocol $protocol;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectToKlineEngineCuUC$invoke$4(Protocol protocol, kotlin.coroutines.c<? super ConnectToKlineEngineCuUC$invoke$4> cVar) {
        super(2, cVar);
        this.$protocol = protocol;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ConnectToKlineEngineCuUC$invoke$4(this.$protocol, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((ConnectToKlineEngineCuUC$invoke$4) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws InterruptedException {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        this.$protocol.g("1089").waitForCompletion();
        return p293xa.r.f47939a;
    }
}
