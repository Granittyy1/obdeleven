package androidx.paging;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Pager.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.paging.Pager$flow$2", f = "Pager.kt", l = {}, m = "invokeSuspend")
final class Pager$flow$2 extends SuspendLambda implements Ia.l<kotlin.coroutines.c<? super PagingSource<Object, Object>>, Object> {
    final /* synthetic */ Ia.a<PagingSource<Object, Object>> $pagingSourceFactory;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Pager$flow$2(Ia.a<? extends PagingSource<Object, Object>> aVar, kotlin.coroutines.c<? super Pager$flow$2> cVar) {
        super(1, cVar);
        this.$pagingSourceFactory = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(kotlin.coroutines.c<?> cVar) {
        return new Pager$flow$2(this.$pagingSourceFactory, cVar);
    }

    @Override // Ia.l
    public final Object invoke(kotlin.coroutines.c<? super PagingSource<Object, Object>> cVar) {
        return ((Pager$flow$2) create(cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        return this.$pagingSourceFactory.invoke();
    }
}
