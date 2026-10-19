package com.voltasit.sharednetwork.dataSources;

import Aa.c;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: BaseParseKtorClient.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "com.voltasit.sharednetwork.dataSources.BaseParseKtorClient", f = "BaseParseKtorClient.kt", l = {386, 291, CarouselScreenFragment.CAROUSEL_ANIMATION_DELAY_MS}, m = "put$suspendImpl")
final class BaseParseKtorClient$put$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BaseParseKtorClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseParseKtorClient$put$1(BaseParseKtorClient baseParseKtorClient, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = baseParseKtorClient;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return BaseParseKtorClient.o(this.this$0, null, null, null, this);
    }
}
