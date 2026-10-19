package com.voltasit.sharednetwork.dataSources;

import Aa.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: BaseParseKtorClient.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "com.voltasit.sharednetwork.dataSources.BaseParseKtorClient", f = "BaseParseKtorClient.kt", l = {386, R.styleable.AppCompatTheme_windowFixedWidthMajor, 131}, m = "postOld$suspendImpl")
final class BaseParseKtorClient$postOld$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BaseParseKtorClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseParseKtorClient$postOld$1(BaseParseKtorClient baseParseKtorClient, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = baseParseKtorClient;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return BaseParseKtorClient.n(this.this$0, null, null, null, null, this);
    }
}
