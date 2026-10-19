package io.ktor.utils.io.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: SequentialCopyTo.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "io.ktor.utils.io.internal.SequentialCopyToKt", f = "SequentialCopyTo.kt", l = {26, R.styleable.AppCompatTheme_actionModeWebSearchDrawable, R.styleable.AppCompatTheme_autoCompleteTextViewStyle}, m = "copyToSequentialImpl")
final class SequentialCopyToKt$copyToSequentialImpl$1 extends ContinuationImpl {
    long J$0;
    long J$1;
    long J$2;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public SequentialCopyToKt$copyToSequentialImpl$1() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return h.a(null, null, 0L, this);
    }
}
