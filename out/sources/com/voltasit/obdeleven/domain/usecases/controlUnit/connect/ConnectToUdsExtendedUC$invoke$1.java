package com.voltasit.obdeleven.domain.usecases.controlUnit.connect;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: ConnectToUdsExtendedUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.controlUnit.connect.ConnectToUdsExtendedUC", f = "ConnectToUdsExtendedUC.kt", l = {R.styleable.AppCompatTheme_alertDialogStyle, R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle, R.styleable.AppCompatTheme_buttonStyleSmall}, m = "invoke")
final class ConnectToUdsExtendedUC$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ x this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectToUdsExtendedUC$invoke$1(x xVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = xVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, this);
    }
}
