package com.voltasit.obdeleven.utils.bluetooth;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: LeBluetoothDevice.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.utils.bluetooth.LeBluetoothDevice", f = "LeBluetoothDevice.kt", l = {431, 438, 439, 447, 453, 458, 463, 468, 474, 475}, m = "updateFirmware")
final class LeBluetoothDevice$updateFirmware$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LeBluetoothDevice this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeBluetoothDevice$updateFirmware$1(LeBluetoothDevice leBluetoothDevice, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = leBluetoothDevice;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.q(this);
    }
}
