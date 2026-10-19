package com.voltasit.obdeleven.utils.bluetooth;

import android.bluetooth.BluetoothGattCharacteristic;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.channels.BufferedChannel;

/* JADX INFO: compiled from: LeBluetoothDevice.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.utils.bluetooth.LeBluetoothDevice$onCharacteristicChanged$1", f = "LeBluetoothDevice.kt", l = {223}, m = "invokeSuspend")
final class LeBluetoothDevice$onCharacteristicChanged$1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ BluetoothGattCharacteristic $characteristic;
    int label;
    final /* synthetic */ LeBluetoothDevice this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeBluetoothDevice$onCharacteristicChanged$1(LeBluetoothDevice leBluetoothDevice, BluetoothGattCharacteristic bluetoothGattCharacteristic, kotlin.coroutines.c<? super LeBluetoothDevice$onCharacteristicChanged$1> cVar) {
        super(2, cVar);
        this.this$0 = leBluetoothDevice;
        this.$characteristic = bluetoothGattCharacteristic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new LeBluetoothDevice$onCharacteristicChanged$1(this.this$0, this.$characteristic, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((LeBluetoothDevice$onCharacteristicChanged$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            BufferedChannel bufferedChannel = this.this$0.f34310m;
            byte[] value = this.$characteristic.getValue();
            kotlin.jvm.internal.i.d(value, "getValue(...)");
            this.label = 1;
            if (bufferedChannel.t(value, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return p293xa.r.f47939a;
    }
}
