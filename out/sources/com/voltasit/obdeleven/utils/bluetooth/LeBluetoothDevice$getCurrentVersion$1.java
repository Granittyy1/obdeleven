package com.voltasit.obdeleven.utils.bluetooth;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: LeBluetoothDevice.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.utils.bluetooth.LeBluetoothDevice", f = "LeBluetoothDevice.kt", l = {R.styleable.AppCompatTheme_searchViewStyle, 105, R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle}, m = "getCurrentVersion")
final class LeBluetoothDevice$getCurrentVersion$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LeBluetoothDevice this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeBluetoothDevice$getCurrentVersion$1(LeBluetoothDevice leBluetoothDevice, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = leBluetoothDevice;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.n(this);
    }
}
