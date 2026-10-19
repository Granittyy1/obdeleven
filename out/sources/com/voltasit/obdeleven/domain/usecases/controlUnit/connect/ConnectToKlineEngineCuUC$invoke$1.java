package com.voltasit.obdeleven.domain.usecases.controlUnit.connect;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: ConnectToKlineEngineCuUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.controlUnit.connect.ConnectToKlineEngineCuUC", f = "ConnectToKlineEngineCuUC.kt", l = {R.styleable.AppCompatTheme_alertDialogCenterButtons, R.styleable.AppCompatTheme_dialogCornerRadius, R.styleable.AppCompatTheme_listPreferredItemHeightSmall, 85, R.styleable.AppCompatTheme_panelMenuListWidth, R.styleable.AppCompatTheme_popupMenuStyle}, m = "invoke-_TFR7lA")
final class ConnectToKlineEngineCuUC$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    short S$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectToKlineEngineCuUC$invoke$1(l lVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a((short) 0, null, this);
    }
}
