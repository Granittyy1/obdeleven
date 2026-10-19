package androidx.paging;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.InterfaceC2686c;
import kotlinx.coroutines.flow.InterfaceC2687d;

/* JADX INFO: compiled from: FlowExt.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.paging.PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1", f = "PageFetcher.kt", l = {105}, m = "invokeSuspend")
public final class PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1 extends SuspendLambda implements Ia.q<InterfaceC2687d<? super PagingData<Object>>, q.a<Object, Object>, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ A $remoteMediatorAccessor$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1(q qVar, A a10, kotlin.coroutines.c cVar) {
        super(3, cVar);
        this.this$0 = qVar;
    }

    @Override // Ia.q
    public final Object invoke(InterfaceC2687d<? super PagingData<Object>> interfaceC2687d, q.a<Object, Object> aVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
        PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1 pageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1 = new PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1(this.this$0, this.$remoteMediatorAccessor$inlined, cVar);
        pageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1.L$0 = interfaceC2687d;
        pageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1.L$1 = aVar;
        return pageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1.invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC2686c interfaceC2686cA;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            InterfaceC2687d interfaceC2687d = (InterfaceC2687d) this.L$0;
            q.a aVar = (q.a) this.L$1;
            q qVar = this.this$0;
            r<Key, Value> rVar = aVar.f19391a;
            A a10 = this.$remoteMediatorAccessor$inlined;
            qVar.getClass();
            if (a10 == null) {
                interfaceC2686cA = rVar.f19408m;
            } else {
                interfaceC2686cA = SimpleChannelFlowKt.a(new CancelableChannelFlowKt$cancelableChannelFlow$1(aVar.f19393c, new PageFetcher$injectRemoteEvents$1(a10, rVar, new p(), null), null));
            }
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new PageFetcher$flow$1$3$downstreamFlow$1(2, null), interfaceC2686cA);
            q qVar2 = this.this$0;
            PagingData pagingData = new PagingData(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, new q.c(qVar2, qVar2.f19389e), new q.b(aVar.f19391a), PagingData.AnonymousClass1.f19292h);
            this.label = 1;
            if (interfaceC2687d.emit(pagingData, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return p293xa.r.f47939a;
    }
}
