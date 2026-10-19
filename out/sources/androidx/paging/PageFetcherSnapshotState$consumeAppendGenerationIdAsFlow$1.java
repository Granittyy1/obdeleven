package androidx.paging;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC2687d;

/* JADX INFO: compiled from: PageFetcherSnapshotState.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.paging.PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1", f = "PageFetcherSnapshotState.kt", l = {}, m = "invokeSuspend")
final class PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1 extends SuspendLambda implements Ia.p<InterfaceC2687d<? super Integer>, kotlin.coroutines.c<? super p293xa.r>, Object> {
    int label;
    final /* synthetic */ t<Object, Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1(t<Object, Object> tVar, kotlin.coroutines.c<? super PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1> cVar) {
        super(2, cVar);
        this.this$0 = tVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(InterfaceC2687d<? super Integer> interfaceC2687d, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1) create(interfaceC2687d, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        t<Object, Object> tVar = this.this$0;
        tVar.j.n(new Integer(tVar.f19419h));
        return p293xa.r.f47939a;
    }
}
