package com.voltasit.obdeleven.domain.usecases.controlUnit.connect;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: ConnectToCanObd29BitUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.controlUnit.connect.ConnectToCanObd29BitUC", f = "ConnectToCanObd29BitUC.kt", l = {R.styleable.AppCompatTheme_buttonStyleSmall, R.styleable.AppCompatTheme_colorButtonNormal, R.styleable.AppCompatTheme_colorPrimaryDark, R.styleable.AppCompatTheme_dialogTheme}, m = "connect-_TFR7lA")
final class ConnectToCanObd29BitUC$connect$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    short S$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectToCanObd29BitUC$connect$1(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a((short) 0, 0, this);
    }
}
