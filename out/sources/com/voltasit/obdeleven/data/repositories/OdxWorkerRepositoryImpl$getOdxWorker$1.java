package com.voltasit.obdeleven.data.repositories;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: OdxWorkerRepositoryImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.data.repositories.OdxWorkerRepositoryImpl", f = "OdxWorkerRepositoryImpl.kt", l = {21, 25, R.styleable.AppCompatTheme_activityChooserViewStyle}, m = "getOdxWorker-_TFR7lA")
final class OdxWorkerRepositoryImpl$getOdxWorker$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    short S$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OdxWorkerRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OdxWorkerRepositoryImpl$getOdxWorker$1(OdxWorkerRepositoryImpl odxWorkerRepositoryImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = odxWorkerRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, this, (short) 0);
    }
}
