package androidx.compose.material3.internal;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: AnchoredDraggable.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.material3.internal.AnchoredDraggableState$draggableState$1$drag$2", f = "AnchoredDraggable.kt", l = {277}, m = "invokeSuspend")
final class AnchoredDraggableState$draggableState$1$drag$2 extends SuspendLambda implements Ia.q<e, q<Object>, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ Ia.p<androidx.compose.foundation.gestures.h, kotlin.coroutines.c<? super p293xa.r>, Object> $block;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableState$draggableState$1$drag$2(h hVar, Ia.p pVar, kotlin.coroutines.c cVar) {
        super(3, cVar);
        this.this$0 = hVar;
        this.$block = pVar;
    }

    @Override // Ia.q
    public final Object invoke(e eVar, q<Object> qVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return new AnchoredDraggableState$draggableState$1$drag$2(this.this$0, this.$block, cVar).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            h.a aVar = this.this$0.f12526a;
            Ia.p<androidx.compose.foundation.gestures.h, kotlin.coroutines.c<? super p293xa.r>, Object> pVar = this.$block;
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
