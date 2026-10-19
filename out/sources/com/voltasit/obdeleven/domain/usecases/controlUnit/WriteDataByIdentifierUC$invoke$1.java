package com.voltasit.obdeleven.domain.usecases.controlUnit;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: WriteDataByIdentifierUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.controlUnit.WriteDataByIdentifierUC", f = "WriteDataByIdentifierUC.kt", l = {R.styleable.AppCompatTheme_alertDialogButtonGroupStyle}, m = "invoke-_TFR7lA")
final class WriteDataByIdentifierUC$invoke$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WriteDataByIdentifierUC$invoke$1(h hVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this, (short) 0);
    }
}
