package androidx.paging;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: PageFetcherSnapshot.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$3", f = "PageFetcherSnapshot.kt", l = {}, m = "invokeSuspend")
final class PageFetcherSnapshot$collectAsGenerationalViewportHints$3 extends SuspendLambda implements Ia.q<C1432h, C1432h, kotlin.coroutines.c<? super C1432h>, Object> {
    final /* synthetic */ LoadType $loadType;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$collectAsGenerationalViewportHints$3(LoadType loadType, kotlin.coroutines.c<? super PageFetcherSnapshot$collectAsGenerationalViewportHints$3> cVar) {
        super(3, cVar);
        this.$loadType = loadType;
    }

    @Override // Ia.q
    public final Object invoke(C1432h c1432h, C1432h c1432h2, kotlin.coroutines.c<? super C1432h> cVar) {
        PageFetcherSnapshot$collectAsGenerationalViewportHints$3 pageFetcherSnapshot$collectAsGenerationalViewportHints$3 = new PageFetcherSnapshot$collectAsGenerationalViewportHints$3(this.$loadType, cVar);
        pageFetcherSnapshot$collectAsGenerationalViewportHints$3.L$0 = c1432h;
        pageFetcherSnapshot$collectAsGenerationalViewportHints$3.L$1 = c1432h2;
        return pageFetcherSnapshot$collectAsGenerationalViewportHints$3.invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean zK;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        C1432h previous = (C1432h) this.L$0;
        C1432h c1432h = (C1432h) this.L$1;
        LoadType loadType = this.$loadType;
        kotlin.jvm.internal.i.e(c1432h, "<this>");
        kotlin.jvm.internal.i.e(previous, "previous");
        kotlin.jvm.internal.i.e(loadType, "loadType");
        int i10 = c1432h.f19353a;
        int i11 = previous.f19353a;
        if (i10 > i11) {
            zK = true;
        } else {
            zK = i10 < i11 ? false : G0.a.k(c1432h.f19354b, previous.f19354b, loadType);
        }
        return zK ? c1432h : previous;
    }
}
