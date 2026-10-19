package androidx.paging;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: PageFetcherSnapshot.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$1$jumpHint$1", f = "PageFetcherSnapshot.kt", l = {}, m = "invokeSuspend")
public final class PageFetcherSnapshot$startConsumingHints$1$jumpHint$1 extends SuspendLambda implements Ia.p<I, kotlin.coroutines.c<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ r<Object, Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$startConsumingHints$1$jumpHint$1(r<Object, Object> rVar, kotlin.coroutines.c<? super PageFetcherSnapshot$startConsumingHints$1$jumpHint$1> cVar) {
        super(2, cVar);
        this.this$0 = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        PageFetcherSnapshot$startConsumingHints$1$jumpHint$1 pageFetcherSnapshot$startConsumingHints$1$jumpHint$1 = new PageFetcherSnapshot$startConsumingHints$1$jumpHint$1(this.this$0, cVar);
        pageFetcherSnapshot$startConsumingHints$1$jumpHint$1.L$0 = obj;
        return pageFetcherSnapshot$startConsumingHints$1$jumpHint$1;
    }

    @Override // Ia.p
    public final Object invoke(I i10, kotlin.coroutines.c<? super Boolean> cVar) {
        return ((PageFetcherSnapshot$startConsumingHints$1$jumpHint$1) create(i10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        I i10 = (I) this.L$0;
        int i11 = i10.f19246a * (-1);
        int i12 = this.this$0.f19399c.f19436e;
        return Boolean.valueOf(i11 > i12 || i10.f19247b * (-1) > i12);
    }
}
