package com.voltasit.obdeleven.presentation.controlUnit.eeprom;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: EepromViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.controlUnit.eeprom.EepromViewModel", f = "EepromViewModel.kt", l = {R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle}, m = "isPopTheHoodRequired")
final class EepromViewModel$isPopTheHoodRequired$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EepromViewModel$isPopTheHoodRequired$1(h hVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return h.b(this.this$0, this);
    }
}
