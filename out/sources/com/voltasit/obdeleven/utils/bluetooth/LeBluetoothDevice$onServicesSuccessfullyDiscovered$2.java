package com.voltasit.obdeleven.utils.bluetooth;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.InterfaceC2691h;

/* JADX INFO: compiled from: LeBluetoothDevice.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.utils.bluetooth.LeBluetoothDevice$onServicesSuccessfullyDiscovered$2", f = "LeBluetoothDevice.kt", l = {360}, m = "invokeSuspend")
final class LeBluetoothDevice$onServicesSuccessfullyDiscovered$2 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ InterfaceC2691h<C8.a<BluetoothGatt>> $coroutine;
    final /* synthetic */ BluetoothGatt $gatt;
    final /* synthetic */ BluetoothGattCharacteristic $obdElevenCharacteristic;
    int label;
    final /* synthetic */ LeBluetoothDevice this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LeBluetoothDevice$onServicesSuccessfullyDiscovered$2(LeBluetoothDevice leBluetoothDevice, BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, InterfaceC2691h<? super C8.a<BluetoothGatt>> interfaceC2691h, kotlin.coroutines.c<? super LeBluetoothDevice$onServicesSuccessfullyDiscovered$2> cVar) {
        super(2, cVar);
        this.this$0 = leBluetoothDevice;
        this.$gatt = bluetoothGatt;
        this.$obdElevenCharacteristic = bluetoothGattCharacteristic;
        this.$coroutine = interfaceC2691h;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new LeBluetoothDevice$onServicesSuccessfullyDiscovered$2(this.this$0, this.$gatt, this.$obdElevenCharacteristic, this.$coroutine, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((LeBluetoothDevice$onServicesSuccessfullyDiscovered$2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            LeBluetoothDevice leBluetoothDevice = this.this$0;
            BluetoothGatt bluetoothGatt = this.$gatt;
            BluetoothGattCharacteristic bluetoothGattCharacteristic = this.$obdElevenCharacteristic;
            this.label = 1;
            int i11 = LeBluetoothDevice.f34304D;
            if (leBluetoothDevice.l(bluetoothGatt, bluetoothGattCharacteristic, "00002902-0000-1000-8000-00805f9b34fb", this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        LeBluetoothDevice leBluetoothDevice2 = this.this$0;
        leBluetoothDevice2.f34340d = 2;
        o oVar = leBluetoothDevice2.f34316s;
        if (oVar == null) {
            kotlin.jvm.internal.i.m("leDevice");
            throw null;
        }
        oVar.m(true);
        LeBluetoothDevice leBluetoothDevice3 = this.this$0;
        if (leBluetoothDevice3.f34340d != 5) {
            O.e.j("LeBluetoothDevice", "connectedStateUpdateEnabled: " + leBluetoothDevice3.f34320w);
            LeBluetoothDevice leBluetoothDevice4 = this.this$0;
            if (leBluetoothDevice4.f34320w && leBluetoothDevice4.f34323z) {
                o oVar2 = leBluetoothDevice4.f34316s;
                if (oVar2 == null) {
                    kotlin.jvm.internal.i.m("leDevice");
                    throw null;
                }
                leBluetoothDevice4.f34343g.g(2, oVar2, null);
            }
        }
        if (this.$coroutine.c()) {
            this.$coroutine.resumeWith(new C8.a.b(this.$gatt));
        }
        return p293xa.r.f47939a;
    }
}
