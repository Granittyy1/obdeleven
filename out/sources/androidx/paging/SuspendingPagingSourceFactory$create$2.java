package androidx.paging;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: SuspendingPagingSourceFactory.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.paging.SuspendingPagingSourceFactory$create$2", f = "SuspendingPagingSourceFactory.kt", l = {}, m = "invokeSuspend")
final class SuspendingPagingSourceFactory$create$2 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super PagingSource<Object, Object>>, Object> {
    int label;
    final /* synthetic */ E<Object, Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspendingPagingSourceFactory$create$2(E<Object, Object> e10, kotlin.coroutines.c<? super SuspendingPagingSourceFactory$create$2> cVar) {
        super(2, cVar);
        this.this$0 = e10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new SuspendingPagingSourceFactory$create$2(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super PagingSource<Object, Object>> cVar) {
        ((SuspendingPagingSourceFactory$create$2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        this.this$0.getClass();
        throw null;
    }
}
