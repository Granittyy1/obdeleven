package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C0909i;
import androidx.compose.animation.core.InterfaceC0906f;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: SnackbarHost.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.material3.SnackbarHostKt$animatedScale$1$1", f = "SnackbarHost.kt", l = {432}, m = "invokeSuspend")
final class SnackbarHostKt$animatedScale$1$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ InterfaceC0906f<Float> $animation;
    final /* synthetic */ Animatable<Float, C0909i> $scale;
    final /* synthetic */ boolean $visible;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$animatedScale$1$1(Animatable<Float, C0909i> animatable, boolean z10, InterfaceC0906f<Float> interfaceC0906f, kotlin.coroutines.c<? super SnackbarHostKt$animatedScale$1$1> cVar) {
        super(2, cVar);
        this.$scale = animatable;
        this.$visible = z10;
        this.$animation = interfaceC0906f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new SnackbarHostKt$animatedScale$1$1(this.$scale, this.$visible, this.$animation, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((SnackbarHostKt$animatedScale$1$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            Animatable<Float, C0909i> animatable = this.$scale;
            Float f10 = new Float(this.$visible ? 1.0f : 0.8f);
            InterfaceC0906f<Float> interfaceC0906f = this.$animation;
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
        return p293xa.r.f47939a;
    }
}
