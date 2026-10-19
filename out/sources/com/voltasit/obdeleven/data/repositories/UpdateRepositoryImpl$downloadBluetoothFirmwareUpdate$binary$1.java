package com.voltasit.obdeleven.data.repositories;

import com.parse.ParseFile;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;

/* JADX INFO: compiled from: UpdateRepositoryImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.data.repositories.UpdateRepositoryImpl$downloadBluetoothFirmwareUpdate$binary$1", f = "UpdateRepositoryImpl.kt", l = {}, m = "invokeSuspend")
final class UpdateRepositoryImpl$downloadBluetoothFirmwareUpdate$binary$1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super byte[]>, Object> {
    final /* synthetic */ ParseFile $file;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateRepositoryImpl$downloadBluetoothFirmwareUpdate$binary$1(ParseFile parseFile, kotlin.coroutines.c<? super UpdateRepositoryImpl$downloadBluetoothFirmwareUpdate$binary$1> cVar) {
        super(2, cVar);
        this.$file = parseFile;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new UpdateRepositoryImpl$downloadBluetoothFirmwareUpdate$binary$1(this.$file, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super byte[]> cVar) {
        return ((UpdateRepositoryImpl$downloadBluetoothFirmwareUpdate$binary$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        return this.$file.getData();
    }
}
