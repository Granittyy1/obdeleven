package com.voltasit.obdeleven.utils.bluetooth;

import android.bluetooth.BluetoothGatt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.I;

/* JADX INFO: compiled from: LeBluetoothDevice.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.utils.bluetooth.LeBluetoothDevice$onBluetoothConnected$1", f = "LeBluetoothDevice.kt", l = {291}, m = "invokeSuspend")
final class LeBluetoothDevice$onBluetoothConnected$1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ BluetoothGatt $gatt;
    int label;
    final /* synthetic */ LeBluetoothDevice this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeBluetoothDevice$onBluetoothConnected$1(LeBluetoothDevice leBluetoothDevice, BluetoothGatt bluetoothGatt, kotlin.coroutines.c<? super LeBluetoothDevice$onBluetoothConnected$1> cVar) {
        super(2, cVar);
        this.this$0 = leBluetoothDevice;
        this.$gatt = bluetoothGatt;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new LeBluetoothDevice$onBluetoothConnected$1(this.this$0, this.$gatt, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((LeBluetoothDevice$onBluetoothConnected$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            this.label = 1;
            if (I.b(1500L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        if (this.this$0.f34305A == null) {
            O.e.D("LeBluetoothDevice", "Skipping service discovery due to disconnected gatt server");
            return p293xa.r.f47939a;
        }
        O.e.j("LeBluetoothDevice", "Service discovery started: " + this.$gatt.discoverServices());
        return p293xa.r.f47939a;
    }
}
