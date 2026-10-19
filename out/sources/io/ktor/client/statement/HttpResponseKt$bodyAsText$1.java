package io.ktor.client.statement;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: HttpResponse.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "io.ktor.client.statement.HttpResponseKt", f = "HttpResponse.kt", l = {R.styleable.AppCompatTheme_selectableItemBackground}, m = "bodyAsText")
final class HttpResponseKt$bodyAsText$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public HttpResponseKt$bodyAsText$1() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return e.a(null, null, this);
    }
}
