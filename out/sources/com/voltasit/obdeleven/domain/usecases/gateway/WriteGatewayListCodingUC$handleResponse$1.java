package com.voltasit.obdeleven.domain.usecases.gateway;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: WriteGatewayListCodingUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.gateway.WriteGatewayListCodingUC", f = "WriteGatewayListCodingUC.kt", l = {R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle, R.styleable.AppCompatTheme_buttonBarStyle}, m = "handleResponse")
final class WriteGatewayListCodingUC$handleResponse$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WriteGatewayListCodingUC$handleResponse$1(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, this);
    }
}
