package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C0909i;
import androidx.compose.animation.core.InterfaceC0906f;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: Ripple.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.material.ripple.StateLayer$handleInteraction$1", f = "Ripple.kt", l = {480}, m = "invokeSuspend")
public final class StateLayer$handleInteraction$1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ InterfaceC0906f<Float> $incomingAnimationSpec;
    final /* synthetic */ float $targetAlpha;
    int label;
    final /* synthetic */ StateLayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateLayer$handleInteraction$1(StateLayer stateLayer, float f10, InterfaceC0906f<Float> interfaceC0906f, kotlin.coroutines.c<? super StateLayer$handleInteraction$1> cVar) {
        super(2, cVar);
        this.this$0 = stateLayer;
        this.$targetAlpha = f10;
        this.$incomingAnimationSpec = interfaceC0906f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new StateLayer$handleInteraction$1(this.this$0, this.$targetAlpha, this.$incomingAnimationSpec, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((StateLayer$handleInteraction$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            Animatable<Float, C0909i> animatable = this.this$0.f11974c;
            Float f10 = new Float(this.$targetAlpha);
            InterfaceC0906f<Float> interfaceC0906f = this.$incomingAnimationSpec;
            this.label = 1;
            if (Animatable.c(animatable, f10, interfaceC0906f, null, this, 12) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return r.f47939a;
    }
}
