package com.voltasit.obdeleven.data.repositories;

import com.parse.ParseQuery;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import p255u9.C2804g;

/* JADX INFO: compiled from: UpdateRepositoryImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.data.repositories.UpdateRepositoryImpl$downloadBluetoothFirmwareUpdate$result$1", f = "UpdateRepositoryImpl.kt", l = {}, m = "invokeSuspend")
final class UpdateRepositoryImpl$downloadBluetoothFirmwareUpdate$result$1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super w9.d.a<C2804g>>, Object> {
    final /* synthetic */ ParseQuery<C2804g> $query;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateRepositoryImpl$downloadBluetoothFirmwareUpdate$result$1(ParseQuery<C2804g> parseQuery, kotlin.coroutines.c<? super UpdateRepositoryImpl$downloadBluetoothFirmwareUpdate$result$1> cVar) {
        super(2, cVar);
        this.$query = parseQuery;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new UpdateRepositoryImpl$downloadBluetoothFirmwareUpdate$result$1(this.$query, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super w9.d.a<C2804g>> cVar) {
        return ((UpdateRepositoryImpl$downloadBluetoothFirmwareUpdate$result$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
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
