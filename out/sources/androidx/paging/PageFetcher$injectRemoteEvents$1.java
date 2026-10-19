package androidx.paging;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC2686c;
import kotlinx.coroutines.flow.InterfaceC2687d;

/* JADX INFO: compiled from: PageFetcher.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.paging.PageFetcher$injectRemoteEvents$1", f = "PageFetcher.kt", l = {203}, m = "invokeSuspend")
final class PageFetcher$injectRemoteEvents$1 extends SuspendLambda implements Ia.p<C<PageEvent<Object>>, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ A<Object, Object> $accessor;
    final /* synthetic */ p $sourceStates;
    final /* synthetic */ r<Object, Object> $this_injectRemoteEvents;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: compiled from: PageFetcher.kt */
    public static final class a<T> implements InterfaceC2687d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C<PageEvent<Object>> f19274b;

        public a(C<PageEvent<Object>> c10) {
            this.f19274b = c10;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC2687d
        public final Object emit(Object obj, kotlin.coroutines.c cVar) {
            Object objT = this.f19274b.t((PageEvent) obj, cVar);
            return objT == CoroutineSingletons.f43038b ? objT : p293xa.r.f47939a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcher$injectRemoteEvents$1(A<Object, Object> a10, r<Object, Object> rVar, p pVar, kotlin.coroutines.c<? super PageFetcher$injectRemoteEvents$1> cVar) {
        super(2, cVar);
        this.$this_injectRemoteEvents = rVar;
        this.$sourceStates = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        PageFetcher$injectRemoteEvents$1 pageFetcher$injectRemoteEvents$1 = new PageFetcher$injectRemoteEvents$1(this.$accessor, this.$this_injectRemoteEvents, this.$sourceStates, cVar);
        pageFetcher$injectRemoteEvents$1.L$0 = obj;
        return pageFetcher$injectRemoteEvents$1;
    }

    @Override // Ia.p
    public final Object invoke(C<PageEvent<Object>> c10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((PageFetcher$injectRemoteEvents$1) create(c10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            C c10 = (C) this.L$0;
            InterfaceC2686c interfaceC2686cA = SimpleChannelFlowKt.a(new PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1(this.$accessor.getState(), this.$this_injectRemoteEvents.f19408m, null, this.$sourceStates));
            a aVar = new a(c10);
            this.label = 1;
            if (interfaceC2686cA.collect(aVar, this) == coroutineSingletons) {
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
