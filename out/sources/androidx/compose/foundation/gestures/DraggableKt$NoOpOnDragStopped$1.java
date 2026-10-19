package androidx.compose.foundation.gestures;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;

/* JADX INFO: compiled from: Draggable.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.gestures.DraggableKt$NoOpOnDragStopped$1", f = "Draggable.kt", l = {}, m = "invokeSuspend")
public final class DraggableKt$NoOpOnDragStopped$1 extends SuspendLambda implements Ia.q<A, Float, kotlin.coroutines.c<? super p293xa.r>, Object> {
    int label;

    @Override // Ia.q
    public final Object invoke(A a10, Float f10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        f10.floatValue();
        return new DraggableKt$NoOpOnDragStopped$1(3, cVar).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        return p293xa.r.f47939a;
    }
}
