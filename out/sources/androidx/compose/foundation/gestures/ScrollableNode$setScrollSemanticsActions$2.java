package androidx.compose.foundation.gestures;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$2", f = "Scrollable.kt", l = {522}, m = "invokeSuspend")
final class ScrollableNode$setScrollSemanticsActions$2 extends SuspendLambda implements Ia.p<I.d, kotlin.coroutines.c<? super I.d>, Object> {
    /* synthetic */ long J$0;
    int label;
    final /* synthetic */ ScrollableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableNode$setScrollSemanticsActions$2(ScrollableNode scrollableNode, kotlin.coroutines.c<? super ScrollableNode$setScrollSemanticsActions$2> cVar) {
        super(2, cVar);
        this.this$0 = scrollableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        ScrollableNode$setScrollSemanticsActions$2 scrollableNode$setScrollSemanticsActions$2 = new ScrollableNode$setScrollSemanticsActions$2(this.this$0, cVar);
        scrollableNode$setScrollSemanticsActions$2.J$0 = ((I.d) obj).f3754a;
        return scrollableNode$setScrollSemanticsActions$2;
    }

    @Override // Ia.p
    public final Object invoke(I.d dVar, kotlin.coroutines.c<? super I.d> cVar) {
        long j = dVar.f3754a;
        ScrollableNode$setScrollSemanticsActions$2 scrollableNode$setScrollSemanticsActions$2 = new ScrollableNode$setScrollSemanticsActions$2(this.this$0, cVar);
        scrollableNode$setScrollSemanticsActions$2.J$0 = j;
        return scrollableNode$setScrollSemanticsActions$2.invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            long j = this.J$0;
            ScrollingLogic scrollingLogic = this.this$0.f9978E;
            this.label = 1;
            obj = ScrollableKt.a(scrollingLogic, j, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return obj;
    }
}
