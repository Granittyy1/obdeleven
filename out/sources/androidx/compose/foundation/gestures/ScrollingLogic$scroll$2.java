package androidx.compose.foundation.gestures;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.gestures.ScrollingLogic$scroll$2", f = "Scrollable.kt", l = {834}, m = "invokeSuspend")
final class ScrollingLogic$scroll$2 extends SuspendLambda implements Ia.p<s, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ Ia.p<o, kotlin.coroutines.c<? super p293xa.r>, Object> $block;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$scroll$2(Ia.p pVar, ScrollingLogic scrollingLogic, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.this$0 = scrollingLogic;
        this.$block = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        ScrollingLogic$scroll$2 scrollingLogic$scroll$2 = new ScrollingLogic$scroll$2(this.$block, this.this$0, cVar);
        scrollingLogic$scroll$2.L$0 = obj;
        return scrollingLogic$scroll$2;
    }

    @Override // Ia.p
    public final Object invoke(s sVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((ScrollingLogic$scroll$2) create(sVar, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            s sVar = (s) this.L$0;
            ScrollingLogic scrollingLogic = this.this$0;
            scrollingLogic.j = sVar;
            Ia.p<o, kotlin.coroutines.c<? super p293xa.r>, Object> pVar = this.$block;
            ScrollingLogic.a aVar = scrollingLogic.f9994k;
            this.label = 1;
            if (pVar.invoke(aVar, this) == coroutineSingletons) {
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
