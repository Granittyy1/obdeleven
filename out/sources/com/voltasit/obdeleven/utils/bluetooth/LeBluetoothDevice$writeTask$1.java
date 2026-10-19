package com.voltasit.obdeleven.utils.bluetooth;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import com.parse.boltsinternal.TaskCompletionSource;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;

/* JADX INFO: compiled from: LeBluetoothDevice.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.utils.bluetooth.LeBluetoothDevice$writeTask$1", f = "LeBluetoothDevice.kt", l = {836}, m = "invokeSuspend")
final class LeBluetoothDevice$writeTask$1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ BluetoothGattCharacteristic $characteristic;
    final /* synthetic */ BluetoothGatt $gattServerRef;
    final /* synthetic */ byte[] $out;
    final /* synthetic */ TaskCompletionSource<Void> $taskCompletionSource;
    int label;
    final /* synthetic */ LeBluetoothDevice this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeBluetoothDevice$writeTask$1(LeBluetoothDevice leBluetoothDevice, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, BluetoothGatt bluetoothGatt, TaskCompletionSource<Void> taskCompletionSource, kotlin.coroutines.c<? super LeBluetoothDevice$writeTask$1> cVar) {
        super(2, cVar);
        this.this$0 = leBluetoothDevice;
        this.$characteristic = bluetoothGattCharacteristic;
        this.$out = bArr;
        this.$gattServerRef = bluetoothGatt;
        this.$taskCompletionSource = taskCompletionSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new LeBluetoothDevice$writeTask$1(this.this$0, this.$characteristic, this.$out, this.$gattServerRef, this.$taskCompletionSource, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((LeBluetoothDevice$writeTask$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            LeBluetoothDevice leBluetoothDevice = this.this$0;
            BluetoothGattCharacteristic bluetoothGattCharacteristic = this.$characteristic;
            byte[] bArr = this.$out;
            BluetoothGatt bluetoothGatt = this.$gattServerRef;
            this.label = 1;
            int i11 = LeBluetoothDevice.f34304D;
            if (leBluetoothDevice.r(bluetoothGattCharacteristic, bArr, bluetoothGatt, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        this.$taskCompletionSource.setResult(null);
        return p293xa.r.f47939a;
    }
}
