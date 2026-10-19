package com.voltasit.obdeleven.utils.bluetooth;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: LeBluetoothDevice.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.utils.bluetooth.LeBluetoothDevice", f = "LeBluetoothDevice.kt", l = {588, 596, 597, 599}, m = "writeUpdateMagicAndGetTarget")
final class LeBluetoothDevice$writeUpdateMagicAndGetTarget$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LeBluetoothDevice this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeBluetoothDevice$writeUpdateMagicAndGetTarget$1(LeBluetoothDevice leBluetoothDevice, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = leBluetoothDevice;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        LeBluetoothDevice leBluetoothDevice = this.this$0;
        int i10 = LeBluetoothDevice.f34304D;
        return leBluetoothDevice.v(this);
    }
}
