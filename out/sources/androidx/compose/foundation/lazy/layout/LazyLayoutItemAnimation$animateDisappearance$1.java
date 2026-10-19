package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C0909i;
import androidx.compose.animation.core.InterfaceC0923x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: LazyLayoutItemAnimation.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateDisappearance$1", f = "LazyLayoutItemAnimation.kt", l = {204}, m = "invokeSuspend")
final class LazyLayoutItemAnimation$animateDisappearance$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ androidx.compose.ui.graphics.layer.b $layer;
    final /* synthetic */ InterfaceC0923x<Float> $spec;
    int label;
    final /* synthetic */ LazyLayoutItemAnimation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutItemAnimation$animateDisappearance$1(LazyLayoutItemAnimation lazyLayoutItemAnimation, InterfaceC0923x<Float> interfaceC0923x, androidx.compose.ui.graphics.layer.b bVar, kotlin.coroutines.c<? super LazyLayoutItemAnimation$animateDisappearance$1> cVar) {
        super(2, cVar);
        this.this$0 = lazyLayoutItemAnimation;
        this.$spec = interfaceC0923x;
        this.$layer = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new LazyLayoutItemAnimation$animateDisappearance$1(this.this$0, this.$spec, this.$layer, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((LazyLayoutItemAnimation$animateDisappearance$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        try {
            if (i10 == 0) {
                kotlin.b.b(obj);
                Animatable<Float, C0909i> animatable = this.this$0.f10623o;
                Float f10 = new Float(0.0f);
                InterfaceC0923x<Float> interfaceC0923x = this.$spec;
                final androidx.compose.ui.graphics.layer.b bVar = this.$layer;
                final LazyLayoutItemAnimation lazyLayoutItemAnimation = this.this$0;
                Ia.l<Animatable<Float, C0909i>, p293xa.r> lVar = new Ia.l<Animatable<Float, C0909i>, p293xa.r>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateDisappearance$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(Animatable<Float, C0909i> animatable2) {
                        bVar.f(animatable2.d().floatValue());
                        lazyLayoutItemAnimation.f10612c.invoke();
                        return p293xa.r.f47939a;
                    }
                };
                this.label = 1;
                if (Animatable.c(animatable, f10, interfaceC0923x, lVar, this, 4) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            this.this$0.j.setValue(Boolean.TRUE);
            this.this$0.f(false);
            return p293xa.r.f47939a;
        } catch (Throwable th) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation2 = this.this$0;
            int i11 = LazyLayoutItemAnimation.f10609s;
            lazyLayoutItemAnimation2.f(false);
            throw th;
        }
    }
}
