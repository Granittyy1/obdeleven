package io.ktor.client.statement;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: HttpStatement.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "io.ktor.client.statement.HttpStatement", f = "HttpStatement.kt", l = {R.styleable.AppCompatTheme_textAppearanceSearchResultTitle}, m = "executeUnsafe")
final class HttpStatement$executeUnsafe$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpStatement$executeUnsafe$1(g gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(this);
    }
}
