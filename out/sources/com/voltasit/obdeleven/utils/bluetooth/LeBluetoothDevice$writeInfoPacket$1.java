package com.voltasit.obdeleven.utils.bluetooth;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: LeBluetoothDevice.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.utils.bluetooth.LeBluetoothDevice", f = "LeBluetoothDevice.kt", l = {619, 620}, m = "writeInfoPacket")
final class LeBluetoothDevice$writeInfoPacket$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LeBluetoothDevice this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeBluetoothDevice$writeInfoPacket$1(LeBluetoothDevice leBluetoothDevice, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = leBluetoothDevice;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        LeBluetoothDevice leBluetoothDevice = this.this$0;
        int i10 = LeBluetoothDevice.f34304D;
        return leBluetoothDevice.s(0, this);
    }
}
