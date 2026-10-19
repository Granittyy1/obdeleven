package com.voltasit.obdeleven.domain.usecases;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: BluetoothRequestUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.BluetoothRequestUC", f = "BluetoothRequestUC.kt", l = {R.styleable.AppCompatTheme_alertDialogButtonGroupStyle, R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle, R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle, 44}, m = "request")
final class BluetoothRequestUC$request$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C2112a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BluetoothRequestUC$request$1(C2112a c2112a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = c2112a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(null, null, 0, this);
    }
}
