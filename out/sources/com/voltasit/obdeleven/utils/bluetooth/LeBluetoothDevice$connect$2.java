package com.voltasit.obdeleven.utils.bluetooth;

import android.bluetooth.BluetoothDevice;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;

/* JADX INFO: compiled from: LeBluetoothDevice.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.utils.bluetooth.LeBluetoothDevice$connect$2", f = "LeBluetoothDevice.kt", l = {789}, m = "invokeSuspend")
final class LeBluetoothDevice$connect$2 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ BluetoothDevice $bluetoothDevice;
    int label;
    final /* synthetic */ LeBluetoothDevice this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeBluetoothDevice$connect$2(LeBluetoothDevice leBluetoothDevice, BluetoothDevice bluetoothDevice, kotlin.coroutines.c<? super LeBluetoothDevice$connect$2> cVar) {
        super(2, cVar);
        this.this$0 = leBluetoothDevice;
        this.$bluetoothDevice = bluetoothDevice;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new LeBluetoothDevice$connect$2(this.this$0, this.$bluetoothDevice, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((LeBluetoothDevice$connect$2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            LeBluetoothDevice leBluetoothDevice = this.this$0;
            BluetoothDevice bluetoothDevice = this.$bluetoothDevice;
            this.label = 1;
            int i11 = LeBluetoothDevice.f34304D;
            obj = leBluetoothDevice.j(bluetoothDevice, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        C8.a aVar = (C8.a) obj;
        if (aVar instanceof C8.a.C0024a) {
            O.e.D("LeBluetoothDevice", "Unable to connect to bluetooth");
            LeBluetoothDevice leBluetoothDevice2 = this.this$0;
            Throwable th = ((C8.a.C0024a) aVar).f2462a;
            int i12 = LeBluetoothDevice.f34304D;
            leBluetoothDevice2.f(th, true);
        }
        return p293xa.r.f47939a;
    }
}
