package com.voltasit.obdeleven.utils.bluetooth;

import com.obdeleven.service.interfaces.IDevice;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: BluetoothConnectionHelper.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.utils.bluetooth.BluetoothConnectionHelper$setupAndCheckIfFwUpdateIsRequired$1$1", f = "BluetoothConnectionHelper.kt", l = {393}, m = "invokeSuspend")
final class BluetoothConnectionHelper$setupAndCheckIfFwUpdateIsRequired$1$1 extends SuspendLambda implements Ia.l<kotlin.coroutines.c<? super Integer>, Object> {
    final /* synthetic */ IDevice $device;
    int label;
    final /* synthetic */ BluetoothConnectionHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BluetoothConnectionHelper$setupAndCheckIfFwUpdateIsRequired$1$1(BluetoothConnectionHelper bluetoothConnectionHelper, IDevice iDevice, kotlin.coroutines.c<? super BluetoothConnectionHelper$setupAndCheckIfFwUpdateIsRequired$1$1> cVar) {
        super(1, cVar);
        this.this$0 = bluetoothConnectionHelper;
        this.$device = iDevice;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(kotlin.coroutines.c<?> cVar) {
        return new BluetoothConnectionHelper$setupAndCheckIfFwUpdateIsRequired$1$1(this.this$0, this.$device, cVar);
    }

    @Override // Ia.l
    public final Object invoke(kotlin.coroutines.c<? super Integer> cVar) {
        return ((BluetoothConnectionHelper$setupAndCheckIfFwUpdateIsRequired$1$1) create(cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            com.voltasit.obdeleven.domain.usecases.device.m mVar = this.this$0.f34302i;
            IDevice iDevice = this.$device;
            this.label = 1;
            obj = mVar.a(iDevice, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return obj;
    }
}
