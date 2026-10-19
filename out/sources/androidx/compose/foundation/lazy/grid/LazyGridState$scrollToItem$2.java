package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.ui.node.LayoutNode;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: LazyGridState.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.lazy.grid.LazyGridState$scrollToItem$2", f = "LazyGridState.kt", l = {}, m = "invokeSuspend")
final class LazyGridState$scrollToItem$2 extends SuspendLambda implements Ia.p<androidx.compose.foundation.gestures.s, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ int $index;
    final /* synthetic */ int $scrollOffset;
    int label;
    final /* synthetic */ LazyGridState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyGridState$scrollToItem$2(LazyGridState lazyGridState, int i10, int i11, kotlin.coroutines.c<? super LazyGridState$scrollToItem$2> cVar) {
        super(2, cVar);
        this.this$0 = lazyGridState;
        this.$index = i10;
        this.$scrollOffset = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new LazyGridState$scrollToItem$2(this.this$0, this.$index, this.$scrollOffset, cVar);
    }

    @Override // Ia.p
    public final Object invoke(androidx.compose.foundation.gestures.s sVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((LazyGridState$scrollToItem$2) create(sVar, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        LazyGridState lazyGridState = this.this$0;
        int i10 = this.$index;
        int i11 = this.$scrollOffset;
        w wVar = lazyGridState.f10420d;
        if (wVar.f10530a.o() != i10 || wVar.f10531b.o() != i11) {
            LazyLayoutItemAnimator<q> lazyLayoutItemAnimator = lazyGridState.f10428m;
            lazyLayoutItemAnimator.e();
            lazyLayoutItemAnimator.f10627b = null;
            lazyLayoutItemAnimator.f10628c = -1;
        }
        wVar.a(i10, i11);
        wVar.f10533d = null;
        LayoutNode layoutNode = lazyGridState.j;
        if (layoutNode != null) {
            layoutNode.j();
        }
        return p293xa.r.f47939a;
    }
}
