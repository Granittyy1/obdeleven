package com.voltasit.obdeleven.utils.bluetooth;

import com.obdeleven.service.interfaces.IDevice;
import com.voltasit.obdeleven.domain.usecases.device.A;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: BluetoothConnectionHelper.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.utils.bluetooth.BluetoothConnectionHelper$connectDevice$1$1", f = "BluetoothConnectionHelper.kt", l = {170}, m = "invokeSuspend")
final class BluetoothConnectionHelper$connectDevice$1$1 extends SuspendLambda implements Ia.l<kotlin.coroutines.c<? super Boolean>, Object> {
    final /* synthetic */ IDevice $device;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BluetoothConnectionHelper$connectDevice$1$1(IDevice iDevice, kotlin.coroutines.c<? super BluetoothConnectionHelper$connectDevice$1$1> cVar) {
        super(1, cVar);
        this.$device = iDevice;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(kotlin.coroutines.c<?> cVar) {
        return new BluetoothConnectionHelper$connectDevice$1$1(this.$device, cVar);
    }

    @Override // Ia.l
    public final Object invoke(kotlin.coroutines.c<? super Boolean> cVar) {
        return ((BluetoothConnectionHelper$connectDevice$1$1) create(cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            IDevice iDevice = this.$device;
            if (iDevice instanceof o) {
                this.label = 1;
                obj = A.a((o) iDevice, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return Boolean.valueOf(z);
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        boolean z10 = ((Boolean) obj).booleanValue();
        return Boolean.valueOf(z10);
    }
}
