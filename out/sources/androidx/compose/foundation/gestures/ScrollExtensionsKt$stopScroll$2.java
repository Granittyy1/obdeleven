package androidx.compose.foundation.gestures;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: ScrollExtensions.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$stopScroll$2", f = "ScrollExtensions.kt", l = {}, m = "invokeSuspend")
final class ScrollExtensionsKt$stopScroll$2 extends SuspendLambda implements Ia.p<s, kotlin.coroutines.c<? super p293xa.r>, Object> {
    int label;

    public ScrollExtensionsKt$stopScroll$2() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ScrollExtensionsKt$stopScroll$2(2, cVar);
    }

    @Override // Ia.p
    public final Object invoke(s sVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((ScrollExtensionsKt$stopScroll$2) create(sVar, cVar)).invokeSuspend(p293xa.r.f47939a);
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
