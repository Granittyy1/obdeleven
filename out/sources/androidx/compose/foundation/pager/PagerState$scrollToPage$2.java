package androidx.compose.foundation.pager;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: PagerState.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.pager.PagerState$scrollToPage$2", f = "PagerState.kt", l = {507}, m = "invokeSuspend")
final class PagerState$scrollToPage$2 extends SuspendLambda implements Ia.p<androidx.compose.foundation.gestures.s, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ int $page;
    final /* synthetic */ float $pageOffsetFraction;
    int label;
    final /* synthetic */ PagerState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerState$scrollToPage$2(PagerState pagerState, float f10, int i10, kotlin.coroutines.c<? super PagerState$scrollToPage$2> cVar) {
        super(2, cVar);
        this.this$0 = pagerState;
        this.$pageOffsetFraction = f10;
        this.$page = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new PagerState$scrollToPage$2(this.this$0, this.$pageOffsetFraction, this.$page, cVar);
    }

    @Override // Ia.p
    public final Object invoke(androidx.compose.foundation.gestures.s sVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((PagerState$scrollToPage$2) create(sVar, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            PagerState pagerState = this.this$0;
            this.label = 1;
            Object objA = pagerState.f10950w.a(this);
            if (objA != coroutineSingletons) {
                objA = p293xa.r.f47939a;
            }
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        float f10 = this.$pageOffsetFraction;
        double d10 = f10;
        if (-0.5d > d10 || d10 > 0.5d) {
            p245u.c.a("pageOffsetFraction " + f10 + " is not within the range -0.5 to 0.5");
        }
        this.this$0.u(this.$pageOffsetFraction, this.this$0.i(this.$page), true);
        return p293xa.r.f47939a;
    }
}
