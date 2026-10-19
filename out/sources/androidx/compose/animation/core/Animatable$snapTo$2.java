package androidx.compose.animation.core;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Animatable.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.animation.core.Animatable$snapTo$2", f = "Animatable.kt", l = {}, m = "invokeSuspend")
public final class Animatable$snapTo$2 extends SuspendLambda implements Ia.l<kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ T $targetValue;
    int label;
    final /* synthetic */ Animatable<T, V> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Animatable$snapTo$2(Animatable<T, V> animatable, T t8, kotlin.coroutines.c<? super Animatable$snapTo$2> cVar) {
        super(1, cVar);
        this.this$0 = animatable;
        this.$targetValue = t8;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(kotlin.coroutines.c<?> cVar) {
        return new Animatable$snapTo$2(this.this$0, this.$targetValue, cVar);
    }

    @Override // Ia.l
    public final Object invoke(kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((Animatable$snapTo$2) create(cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        Animatable.b(this.this$0);
        Object objA = Animatable.a(this.this$0, this.$targetValue);
        this.this$0.f9338c.f9544c.setValue(objA);
        this.this$0.f9340e.setValue(objA);
        return p293xa.r.f47939a;
    }
}
