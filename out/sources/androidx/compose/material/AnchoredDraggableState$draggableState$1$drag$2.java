package androidx.compose.material;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: AnchoredDraggable.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.material.AnchoredDraggableState$draggableState$1$drag$2", f = "AnchoredDraggable.kt", l = {282}, m = "invokeSuspend")
final class AnchoredDraggableState$draggableState$1$drag$2 extends SuspendLambda implements Ia.q<InterfaceC1025a, InterfaceC1044u<Object>, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ Ia.p<androidx.compose.foundation.gestures.h, kotlin.coroutines.c<? super p293xa.r>, Object> $block;
    int label;
    final /* synthetic */ C1028d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnchoredDraggableState$draggableState$1$drag$2(C1028d c1028d, Ia.p<? super androidx.compose.foundation.gestures.h, ? super kotlin.coroutines.c<? super p293xa.r>, ? extends Object> pVar, kotlin.coroutines.c<? super AnchoredDraggableState$draggableState$1$drag$2> cVar) {
        super(3, cVar);
        this.this$0 = c1028d;
        this.$block = pVar;
    }

    @Override // Ia.q
    public final Object invoke(InterfaceC1025a interfaceC1025a, InterfaceC1044u<Object> interfaceC1044u, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return new AnchoredDraggableState$draggableState$1$drag$2(this.this$0, this.$block, cVar).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            C1028d.a aVar = this.this$0.f11879a;
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
