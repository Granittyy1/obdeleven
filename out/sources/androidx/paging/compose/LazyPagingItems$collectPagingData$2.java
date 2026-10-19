package androidx.paging.compose;

import Ia.p;
import androidx.paging.PagingData;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p293xa.r;

/* JADX INFO: compiled from: LazyPagingItems.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.paging.compose.LazyPagingItems$collectPagingData$2", f = "LazyPagingItems.kt", l = {179}, m = "invokeSuspend")
final class LazyPagingItems$collectPagingData$2 extends SuspendLambda implements p<PagingData<Object>, kotlin.coroutines.c<? super r>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyPagingItems$collectPagingData$2(b<Object> bVar, kotlin.coroutines.c<? super LazyPagingItems$collectPagingData$2> cVar) {
        super(2, cVar);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        LazyPagingItems$collectPagingData$2 lazyPagingItems$collectPagingData$2 = new LazyPagingItems$collectPagingData$2(this.this$0, cVar);
        lazyPagingItems$collectPagingData$2.L$0 = obj;
        return lazyPagingItems$collectPagingData$2;
    }

    @Override // Ia.p
    public final Object invoke(PagingData<Object> pagingData, kotlin.coroutines.c<? super r> cVar) {
        return ((LazyPagingItems$collectPagingData$2) create(pagingData, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            PagingData pagingData = (PagingData) this.L$0;
            b.a aVar = this.this$0.f19334c;
            this.label = 1;
            if (aVar.b(pagingData, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return r.f47939a;
    }
}
