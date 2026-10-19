package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C0909i;
import androidx.compose.animation.core.InterfaceC0923x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: LazyLayoutItemAnimation.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$2", f = "LazyLayoutItemAnimation.kt", l = {183, 185}, m = "invokeSuspend")
public final class LazyLayoutItemAnimation$animateAppearance$2 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ androidx.compose.ui.graphics.layer.b $layer;
    final /* synthetic */ boolean $shouldResetValue;
    final /* synthetic */ InterfaceC0923x<Float> $spec;
    int label;
    final /* synthetic */ LazyLayoutItemAnimation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutItemAnimation$animateAppearance$2(boolean z10, LazyLayoutItemAnimation lazyLayoutItemAnimation, InterfaceC0923x<Float> interfaceC0923x, androidx.compose.ui.graphics.layer.b bVar, kotlin.coroutines.c<? super LazyLayoutItemAnimation$animateAppearance$2> cVar) {
        super(2, cVar);
        this.$shouldResetValue = z10;
        this.this$0 = lazyLayoutItemAnimation;
        this.$spec = interfaceC0923x;
        this.$layer = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new LazyLayoutItemAnimation$animateAppearance$2(this.$shouldResetValue, this.this$0, this.$spec, this.$layer, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((LazyLayoutItemAnimation$animateAppearance$2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    kotlin.b.b(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                }
                LazyLayoutItemAnimation lazyLayoutItemAnimation = this.this$0;
                int i11 = LazyLayoutItemAnimation.f10609s;
                lazyLayoutItemAnimation.e(false);
                return p293xa.r.f47939a;
            }
            kotlin.b.b(obj);
            if (this.$shouldResetValue) {
                Animatable<Float, C0909i> animatable = this.this$0.f10623o;
                Float f10 = new Float(0.0f);
                this.label = 1;
                if (animatable.e(f10, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            Animatable<Float, C0909i> animatable2 = this.this$0.f10623o;
            Float f11 = new Float(1.0f);
            InterfaceC0923x<Float> interfaceC0923x = this.$spec;
            final androidx.compose.ui.graphics.layer.b bVar = this.$layer;
            final LazyLayoutItemAnimation lazyLayoutItemAnimation2 = this.this$0;
            Ia.l<Animatable<Float, C0909i>, p293xa.r> lVar = new Ia.l<Animatable<Float, C0909i>, p293xa.r>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // Ia.l
                public final p293xa.r invoke(Animatable<Float, C0909i> animatable3) {
                    bVar.f(animatable3.d().floatValue());
                    lazyLayoutItemAnimation2.f10612c.invoke();
                    return p293xa.r.f47939a;
                }
            };
            this.label = 2;
            if (Animatable.c(animatable2, f11, interfaceC0923x, lVar, this, 4) == coroutineSingletons) {
                return coroutineSingletons;
            }
            LazyLayoutItemAnimation lazyLayoutItemAnimation3 = this.this$0;
            int i12 = LazyLayoutItemAnimation.f10609s;
            lazyLayoutItemAnimation3.e(false);
            return p293xa.r.f47939a;
        } catch (Throwable th) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation4 = this.this$0;
            int i13 = LazyLayoutItemAnimation.f10609s;
            lazyLayoutItemAnimation4.e(false);
            throw th;
        }
    }
}
