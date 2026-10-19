package com.voltasit.obdeleven.domain.usecases.controlUnit.basicsetting;

import Aa.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: StartBasicSettingUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "com.voltasit.obdeleven.domain.usecases.controlUnit.basicsetting.StartBasicSettingUC", f = "StartBasicSettingUC.kt", l = {142}, m = "buildRootParam")
final class StartBasicSettingUC$buildRootParam$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StartBasicSettingUC this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartBasicSettingUC$buildRootParam$1(StartBasicSettingUC startBasicSettingUC, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = startBasicSettingUC;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return StartBasicSettingUC.a(this.this$0, null, null, null, 0, null, this);
    }
}
