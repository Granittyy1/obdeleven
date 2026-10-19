package androidx.compose.foundation;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C2680e;

/* JADX INFO: compiled from: Clickable.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.AbstractClickableNode$onPointerEvent$1", f = "Clickable.kt", l = {}, m = "invokeSuspend")
public final class AbstractClickableNode$onPointerEvent$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    int label;
    final /* synthetic */ AbstractClickableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$onPointerEvent$1(AbstractClickableNode abstractClickableNode, kotlin.coroutines.c<? super AbstractClickableNode$onPointerEvent$1> cVar) {
        super(2, cVar);
        this.this$0 = abstractClickableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new AbstractClickableNode$onPointerEvent$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((AbstractClickableNode$onPointerEvent$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        AbstractClickableNode abstractClickableNode = this.this$0;
        if (abstractClickableNode.f9680B == null) {
            androidx.compose.foundation.interaction.g gVar = new androidx.compose.foundation.interaction.g();
            androidx.compose.foundation.interaction.k kVar = abstractClickableNode.f9686r;
            if (kVar != null) {
                C2680e.c(abstractClickableNode.E1(), null, null, new AbstractClickableNode$emitHoverEnter$1$1(kVar, gVar, null), 3);
            }
            abstractClickableNode.f9680B = gVar;
        }
        return p293xa.r.f47939a;
    }
}
