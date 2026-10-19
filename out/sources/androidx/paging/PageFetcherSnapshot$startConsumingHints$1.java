package androidx.paging;

import android.os.Build;
import android.util.Log;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C2688e;
import kotlinx.coroutines.flow.InterfaceC2686c;
import kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge;

/* JADX INFO: compiled from: PageFetcherSnapshot.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$1", f = "PageFetcherSnapshot.kt", l = {220}, m = "invokeSuspend")
final class PageFetcherSnapshot$startConsumingHints$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    int label;
    final /* synthetic */ r<Object, Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$startConsumingHints$1(r<Object, Object> rVar, kotlin.coroutines.c<? super PageFetcherSnapshot$startConsumingHints$1> cVar) {
        super(2, cVar);
        this.this$0 = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new PageFetcherSnapshot$startConsumingHints$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((PageFetcherSnapshot$startConsumingHints$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            InterfaceC2686c[] interfaceC2686cArr = {this.this$0.f19404h.a(LoadType.f19254d), this.this$0.f19404h.a(LoadType.f19253c)};
            int i11 = kotlinx.coroutines.flow.k.f43411a;
            ChannelLimitedFlowMerge channelLimitedFlowMerge = new ChannelLimitedFlowMerge(new kotlin.collections.j(interfaceC2686cArr), EmptyCoroutineContext.f43032b, -2, BufferOverflow.f43243b);
            PageFetcherSnapshot$startConsumingHints$1$jumpHint$1 pageFetcherSnapshot$startConsumingHints$1$jumpHint$1 = new PageFetcherSnapshot$startConsumingHints$1$jumpHint$1(this.this$0, null);
            this.label = 1;
            obj = C2688e.k(channelLimitedFlowMerge, pageFetcherSnapshot$startConsumingHints$1$jumpHint$1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        I i12 = (I) obj;
        if (i12 != null) {
            r<Object, Object> rVar = this.this$0;
            if (Build.ID != null && Log.isLoggable("Paging", 3)) {
                String message = "Jump triggered on PagingSource " + rVar.f19398b + " by " + i12;
                kotlin.jvm.internal.i.e(message, "message");
            }
            ((PageFetcher$flow$1.AnonymousClass2.AnonymousClass1) this.this$0.f19403g).invoke();
        }
        return p293xa.r.f47939a;
    }
}
