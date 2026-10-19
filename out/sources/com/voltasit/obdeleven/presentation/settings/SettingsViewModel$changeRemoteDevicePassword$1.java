package com.voltasit.obdeleven.presentation.settings;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: SettingsViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.settings.SettingsViewModel", f = "SettingsViewModel.kt", l = {579}, m = "changeRemoteDevicePassword")
final class SettingsViewModel$changeRemoteDevicePassword$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SettingsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsViewModel$changeRemoteDevicePassword$1(SettingsViewModel settingsViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = settingsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return SettingsViewModel.b(this.this$0, null, this);
    }
}
