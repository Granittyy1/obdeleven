package com.voltasit.obdeleven.domain.usecases.device;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: UpdateBluetoothUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.device.UpdateBluetoothUC", f = "UpdateBluetoothUC.kt", l = {R.styleable.AppCompatTheme_alertDialogButtonGroupStyle, R.styleable.AppCompatTheme_borderlessButtonStyle, R.styleable.AppCompatTheme_buttonBarButtonStyle}, m = "updateBluetooth")
final class UpdateBluetoothUC$updateBluetooth$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ x this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateBluetoothUC$updateBluetooth$1(x xVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = xVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, this);
    }
}
