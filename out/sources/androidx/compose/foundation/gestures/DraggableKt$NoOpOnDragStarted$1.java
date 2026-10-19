package androidx.compose.foundation.gestures;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;

/* JADX INFO: compiled from: Draggable.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.gestures.DraggableKt$NoOpOnDragStarted$1", f = "Draggable.kt", l = {}, m = "invokeSuspend")
public final class DraggableKt$NoOpOnDragStarted$1 extends SuspendLambda implements Ia.q<A, I.d, kotlin.coroutines.c<? super p293xa.r>, Object> {
    int label;

    @Override // Ia.q
    public final Object invoke(A a10, I.d dVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
        long j = dVar.f3754a;
        return new DraggableKt$NoOpOnDragStarted$1(3, cVar).invokeSuspend(p293xa.r.f47939a);
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
