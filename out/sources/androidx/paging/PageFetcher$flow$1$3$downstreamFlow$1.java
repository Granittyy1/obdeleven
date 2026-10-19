package androidx.paging;

import android.os.Build;
import android.util.Log;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: PageFetcher.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.paging.PageFetcher$flow$1$3$downstreamFlow$1", f = "PageFetcher.kt", l = {}, m = "invokeSuspend")
public final class PageFetcher$flow$1$3$downstreamFlow$1 extends SuspendLambda implements Ia.p<PageEvent<Object>, kotlin.coroutines.c<? super p293xa.r>, Object> {
    /* synthetic */ Object L$0;
    int label;

    public PageFetcher$flow$1$3$downstreamFlow$1() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        PageFetcher$flow$1$3$downstreamFlow$1 pageFetcher$flow$1$3$downstreamFlow$1 = new PageFetcher$flow$1$3$downstreamFlow$1(2, cVar);
        pageFetcher$flow$1$3$downstreamFlow$1.L$0 = obj;
        return pageFetcher$flow$1$3$downstreamFlow$1;
    }

    @Override // Ia.p
    public final Object invoke(PageEvent<Object> pageEvent, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((PageFetcher$flow$1$3$downstreamFlow$1) create(pageEvent, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        PageEvent pageEvent = (PageEvent) this.L$0;
        if (Build.ID != null && Log.isLoggable("Paging", 2)) {
            String message = "Sent " + pageEvent;
            kotlin.jvm.internal.i.e(message, "message");
        }
        return p293xa.r.f47939a;
    }
}
