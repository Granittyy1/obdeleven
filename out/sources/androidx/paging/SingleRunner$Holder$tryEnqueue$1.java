package androidx.paging;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: SingleRunner.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.paging.SingleRunner$Holder", f = "SingleRunner.kt", l = {131, R.styleable.AppCompatTheme_textAppearanceLargePopupMenu}, m = "tryEnqueue")
final class SingleRunner$Holder$tryEnqueue$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SingleRunner.a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleRunner$Holder$tryEnqueue$1(SingleRunner.a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(0, null, this);
    }
}
