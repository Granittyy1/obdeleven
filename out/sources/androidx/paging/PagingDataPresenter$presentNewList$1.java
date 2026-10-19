package androidx.paging;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: PagingDataPresenter.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.paging.PagingDataPresenter", f = "PagingDataPresenter.kt", l = {478}, m = "presentNewList")
final class PagingDataPresenter$presentNewList$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PagingDataPresenter<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagingDataPresenter$presentNewList$1(PagingDataPresenter pagingDataPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = pagingDataPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return PagingDataPresenter.a(this.this$0, null, 0, 0, false, null, null, null, this);
    }
}
