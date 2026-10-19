package androidx.compose.foundation.gestures;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: TapGestureDetector.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$NoPressGesture$1", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
public final class TapGestureDetectorKt$NoPressGesture$1 extends SuspendLambda implements Ia.q<p, I.d, kotlin.coroutines.c<? super p293xa.r>, Object> {
    int label;

    @Override // Ia.q
    public final Object invoke(p pVar, I.d dVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
        long j = dVar.f3754a;
        return new TapGestureDetectorKt$NoPressGesture$1(3, cVar).invokeSuspend(p293xa.r.f47939a);
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
