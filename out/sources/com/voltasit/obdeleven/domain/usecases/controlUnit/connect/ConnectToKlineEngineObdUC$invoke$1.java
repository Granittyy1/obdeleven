package com.voltasit.obdeleven.domain.usecases.controlUnit.connect;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: ConnectToKlineEngineObdUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.controlUnit.connect.ConnectToKlineEngineObdUC", f = "ConnectToKlineEngineObdUC.kt", l = {R.styleable.AppCompatTheme_colorSwitchThumbNormal, R.styleable.AppCompatTheme_listPreferredItemPaddingEnd, R.styleable.AppCompatTheme_listPreferredItemPaddingLeft}, m = "invoke-vckuEUM")
final class ConnectToKlineEngineObdUC$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    short S$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectToKlineEngineObdUC$invoke$1(o oVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a((short) 0, this);
    }
}
