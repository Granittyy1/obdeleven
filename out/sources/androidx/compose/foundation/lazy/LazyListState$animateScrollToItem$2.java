package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.L;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: LazyListState.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.lazy.LazyListState$animateScrollToItem$2", f = "LazyListState.kt", l = {481}, m = "invokeSuspend")
final class LazyListState$animateScrollToItem$2 extends SuspendLambda implements Ia.p<androidx.compose.foundation.gestures.s, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ int $index;
    final /* synthetic */ int $scrollOffset;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LazyListState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListState$animateScrollToItem$2(LazyListState lazyListState, int i10, int i11, kotlin.coroutines.c<? super LazyListState$animateScrollToItem$2> cVar) {
        super(2, cVar);
        this.this$0 = lazyListState;
        this.$index = i10;
        this.$scrollOffset = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        LazyListState$animateScrollToItem$2 lazyListState$animateScrollToItem$2 = new LazyListState$animateScrollToItem$2(this.this$0, this.$index, this.$scrollOffset, cVar);
        lazyListState$animateScrollToItem$2.L$0 = obj;
        return lazyListState$animateScrollToItem$2;
    }

    @Override // Ia.p
    public final Object invoke(androidx.compose.foundation.gestures.s sVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((LazyListState$animateScrollToItem$2) create(sVar, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            androidx.compose.foundation.gestures.s sVar = (androidx.compose.foundation.gestures.s) this.L$0;
            LazyListState lazyListState = this.this$0;
            r rVar = new r(sVar, lazyListState);
            int i11 = this.$index;
            int i12 = this.$scrollOffset;
            p013b0.c cVar = ((l) lazyListState.f10355e.getValue()).f10560i;
            this.label = 1;
            if (L.b(rVar, i11, i12, 100, cVar, this) == coroutineSingletons) {
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
