package androidx.paging;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.C2700k0;
import kotlinx.coroutines.C2702l0;
import kotlinx.coroutines.flow.InterfaceC2686c;
import kotlinx.coroutines.flow.InterfaceC2687d;

/* JADX INFO: compiled from: FlowExt.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1", f = "PageFetcher.kt", l = {161}, m = "invokeSuspend")
public final class PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1 extends SuspendLambda implements Ia.p<C<PageEvent<Object>>, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ InterfaceC2686c $otherFlow;
    final /* synthetic */ p $sourceStates$inlined;
    final /* synthetic */ InterfaceC2686c $this_combineWithoutBatching;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: FlowExt.kt */
    @Aa.c(c = "androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$1", f = "PageFetcher.kt", l = {141}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Ia.r<n, PageEvent<Object>, CombineSource, kotlin.coroutines.c<? super p293xa.r>, Object> {
        final /* synthetic */ C<PageEvent<Object>> $$this$simpleChannelFlow;
        final /* synthetic */ p $sourceStates$inlined;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C c10, kotlin.coroutines.c cVar, p pVar) {
            super(4, cVar);
            this.$sourceStates$inlined = pVar;
            this.$$this$simpleChannelFlow = c10;
        }

        @Override // Ia.r
        public final Object invoke(n nVar, PageEvent<Object> pageEvent, CombineSource combineSource, kotlin.coroutines.c<? super p293xa.r> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$simpleChannelFlow, cVar, this.$sourceStates$inlined);
            anonymousClass1.L$0 = nVar;
            anonymousClass1.L$1 = pageEvent;
            anonymousClass1.L$2 = combineSource;
            return anonymousClass1.invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object bVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                Object obj2 = this.L$0;
                Object obj3 = this.L$1;
                CombineSource combineSource = (CombineSource) this.L$2;
                C<PageEvent<Object>> c10 = this.$$this$simpleChannelFlow;
                Object bVar2 = (PageEvent) obj3;
                n nVar = (n) obj2;
                if (combineSource != CombineSource.f19223c) {
                    if (bVar2 instanceof PageEvent.Insert) {
                        PageEvent.Insert insert = (PageEvent.Insert) bVar2;
                        this.$sourceStates$inlined.b(insert.f19264e);
                        LoadType loadType = insert.f19260a;
                        kotlin.jvm.internal.i.e(loadType, "loadType");
                        List<F<T>> pages = insert.f19261b;
                        kotlin.jvm.internal.i.e(pages, "pages");
                        n sourceLoadStates = insert.f19264e;
                        kotlin.jvm.internal.i.e(sourceLoadStates, "sourceLoadStates");
                        bVar = new PageEvent.Insert(loadType, pages, insert.f19262c, insert.f19263d, sourceLoadStates, nVar);
                    } else if (bVar2 instanceof PageEvent.a) {
                        this.$sourceStates$inlined.c(((PageEvent.a) bVar2).f19267a, m.c.f19374c);
                    } else {
                        if (!(bVar2 instanceof PageEvent.b)) {
                            if (bVar2 instanceof PageEvent.StaticList) {
                                throw new IllegalStateException("Paging generated an event to display a static list that\n originated from a paginated source. If you see this\n exception, it is most likely a bug in the library.\n Please file a bug so we can fix it at:\n https://issuetracker.google.com/issues/new?component=413106");
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        PageEvent.b bVar3 = (PageEvent.b) bVar2;
                        this.$sourceStates$inlined.b(bVar3.f19271a);
                        bVar = new PageEvent.b(bVar3.f19271a, nVar);
                    }
                    bVar2 = bVar;
                } else {
                    bVar2 = new PageEvent.b(this.$sourceStates$inlined.d(), nVar);
                }
                this.label = 1;
                if (c10.t(bVar2, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: FlowExt.kt */
    @Aa.c(c = "androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1", f = "FlowExt.kt", l = {147}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
        final /* synthetic */ C<PageEvent<Object>> $$this$simpleChannelFlow;
        final /* synthetic */ InterfaceC2686c $flow;
        final /* synthetic */ AtomicInteger $incompleteFlows;
        final /* synthetic */ int $index;
        final /* synthetic */ H $unbatchedFlowCombiner;
        int label;

        /* JADX INFO: renamed from: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: FlowExt.kt */
        public static final class AnonymousClass1<T> implements InterfaceC2687d {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ H f19275b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f19276c;

            /* JADX INFO: renamed from: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$2$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: FlowExt.kt */
            public static final class C01921 extends ContinuationImpl {
                int label;
                /* synthetic */ Object result;

                public C01921(kotlin.coroutines.c cVar) {
                    super(cVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return AnonymousClass1.this.emit(null, this);
                }
            }

            public AnonymousClass1(H h8, int i10) {
                this.f19275b = h8;
                this.f19276c = i10;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC2687d
            public final Object emit(Object obj, kotlin.coroutines.c<? super p293xa.r> cVar) {
                C01921 c01921;
                if (cVar instanceof C01921) {
                    c01921 = (C01921) cVar;
                    int i10 = c01921.label;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c01921.label = i10 - Integer.MIN_VALUE;
                    } else {
                        c01921 = new C01921(cVar);
                    }
                } else {
                    c01921 = new C01921(cVar);
                }
                Object obj2 = c01921.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                int i11 = c01921.label;
                if (i11 != 0) {
                    if (i11 == 1) {
                        kotlin.b.b(obj2);
                    } else {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.b.b(obj2);
                    }
                    return p293xa.r.f47939a;
                }
                kotlin.b.b(obj2);
                c01921.label = 1;
                if (this.f19275b.a(this.f19276c, obj, c01921) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                c01921.label = 2;
                if (S4.o.r(c01921) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return p293xa.r.f47939a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(InterfaceC2686c interfaceC2686c, AtomicInteger atomicInteger, C c10, H h8, int i10, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.$flow = interfaceC2686c;
            this.$incompleteFlows = atomicInteger;
            this.$unbatchedFlowCombiner = h8;
            this.$index = i10;
            this.$$this$simpleChannelFlow = c10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass2(this.$flow, this.$incompleteFlows, this.$$this$simpleChannelFlow, this.$unbatchedFlowCombiner, this.$index, cVar);
        }

        @Override // Ia.p
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return ((AnonymousClass2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    kotlin.b.b(obj);
                    InterfaceC2686c interfaceC2686c = this.$flow;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$unbatchedFlowCombiner, this.$index);
                    this.label = 1;
                    if (interfaceC2686c.collect(anonymousClass1, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                }
                if (this.$incompleteFlows.decrementAndGet() == 0) {
                    this.$$this$simpleChannelFlow.a(null);
                }
                return p293xa.r.f47939a;
            } catch (Throwable th) {
                if (this.$incompleteFlows.decrementAndGet() == 0) {
                    this.$$this$simpleChannelFlow.a(null);
                }
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1(InterfaceC2686c interfaceC2686c, InterfaceC2686c interfaceC2686c2, kotlin.coroutines.c cVar, p pVar) {
        super(2, cVar);
        this.$this_combineWithoutBatching = interfaceC2686c;
        this.$otherFlow = interfaceC2686c2;
        this.$sourceStates$inlined = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1 pageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1 = new PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1(this.$this_combineWithoutBatching, this.$otherFlow, cVar, this.$sourceStates$inlined);
        pageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1.L$0 = obj;
        return pageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1;
    }

    @Override // Ia.p
    public final Object invoke(C<PageEvent<Object>> c10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1) create(c10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$3] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i10 = 0;
        int i11 = 1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i12 = this.label;
        if (i12 == 0) {
            kotlin.b.b(obj);
            C c10 = (C) this.L$0;
            AtomicInteger atomicInteger = new AtomicInteger(2);
            H h8 = new H(new AnonymousClass1(c10, null, this.$sourceStates$inlined));
            C2700k0 c2700k0A = C2702l0.a();
            InterfaceC2686c[] interfaceC2686cArr = {this.$this_combineWithoutBatching, this.$otherFlow};
            int i13 = 0;
            while (i10 < 2) {
                AtomicInteger atomicInteger2 = atomicInteger;
                C2700k0 c2700k0 = c2700k0A;
                C2680e.c(c10, c2700k0, null, new AnonymousClass2(interfaceC2686cArr[i10], atomicInteger, c10, h8, i13, null), 2);
                i11 = 1;
                i10++;
                c2700k0A = c2700k0;
                i13++;
                interfaceC2686cArr = interfaceC2686cArr;
                atomicInteger = atomicInteger2;
            }
            final C2700k0 c2700k1 = c2700k0A;
            ?? r10 = new Ia.a<p293xa.r>() { // from class: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final p293xa.r invoke() {
                    c2700k1.i(null);
                    return p293xa.r.f47939a;
                }
            };
            this.label = i11;
            if (c10.N(r10, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return p293xa.r.f47939a;
    }
}
