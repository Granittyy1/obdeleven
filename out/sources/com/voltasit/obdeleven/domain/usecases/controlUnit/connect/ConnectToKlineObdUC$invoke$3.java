package com.voltasit.obdeleven.domain.usecases.controlUnit.connect;

import com.obdeleven.service.protocol.Protocol;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: ConnectToKlineObdUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.controlUnit.connect.ConnectToKlineObdUC$invoke$3", f = "ConnectToKlineObdUC.kt", l = {}, m = "invokeSuspend")
final class ConnectToKlineObdUC$invoke$3 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ Protocol $protocol;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectToKlineObdUC$invoke$3(Protocol protocol, kotlin.coroutines.c<? super ConnectToKlineObdUC$invoke$3> cVar) {
        super(2, cVar);
        this.$protocol = protocol;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ConnectToKlineObdUC$invoke$3(this.$protocol, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((ConnectToKlineObdUC$invoke$3) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws InterruptedException {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        this.$protocol.g("0100").waitForCompletion();
        return p293xa.r.f47939a;
    }
}
