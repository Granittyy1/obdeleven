package com.voltasit.obdeleven.ui.dialogs.autocodeprogress;

import Aa.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: AutocodeProgressViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "com.voltasit.obdeleven.ui.dialogs.autocodeprogress.AutocodeProgressViewModel", f = "AutocodeProgressViewModel.kt", l = {161}, m = "unlockSfd")
final class AutocodeProgressViewModel$unlockSfd$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutocodeProgressViewModel$unlockSfd$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.f(null, (short) 0, null, this);
    }
}
