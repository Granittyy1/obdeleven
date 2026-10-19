package com.obdeleven.service.odx;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: ParamFactory.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.obdeleven.service.odx.ParamFactory", f = "ParamFactory.kt", l = {R.styleable.AppCompatTheme_activityChooserViewStyle}, m = "getTableKeyParam")
final class ParamFactory$getTableKeyParam$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParamFactory$getTableKeyParam$1(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.e(null, null, null, 0, this);
    }
}
