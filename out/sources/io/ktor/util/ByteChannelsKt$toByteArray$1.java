package io.ktor.util;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: ByteChannels.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "io.ktor.util.ByteChannelsKt", f = "ByteChannels.kt", l = {R.styleable.AppCompatTheme_radioButtonStyle}, m = "toByteArray")
final class ByteChannelsKt$toByteArray$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    public ByteChannelsKt$toByteArray$1() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return c.a(null, this);
    }
}
