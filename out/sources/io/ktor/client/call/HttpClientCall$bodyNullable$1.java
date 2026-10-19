package io.ktor.client.call;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: HttpClientCall.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "io.ktor.client.call.HttpClientCall", f = "HttpClientCall.kt", l = {R.styleable.AppCompatTheme_panelBackground, R.styleable.AppCompatTheme_popupMenuStyle}, m = "bodyNullable")
final class HttpClientCall$bodyNullable$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpClientCall$bodyNullable$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
