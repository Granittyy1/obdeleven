package io.intercom.android.sdk.ui.component;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C0907g;
import androidx.compose.animation.core.C0909i;
import androidx.compose.animation.core.c0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: PulsatingBox.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "io.intercom.android.sdk.ui.component.PulsatingBoxKt$PulsatingBox$1", f = "PulsatingBox.kt", l = {R.styleable.AppCompatTheme_alertDialogCenterButtons}, m = "invokeSuspend")
public final class PulsatingBoxKt$PulsatingBox$1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ Animatable<Float, C0909i> $animatedScale;
    final /* synthetic */ float $pulseSize;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PulsatingBoxKt$PulsatingBox$1(Animatable<Float, C0909i> animatable, float f10, kotlin.coroutines.c<? super PulsatingBoxKt$PulsatingBox$1> cVar) {
        super(2, cVar);
        this.$animatedScale = animatable;
        this.$pulseSize = f10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new PulsatingBoxKt$PulsatingBox$1(this.$animatedScale, this.$pulseSize, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            Animatable<Float, C0909i> animatable = this.$animatedScale;
            Float f10 = new Float(this.$pulseSize);
            c0 c0VarD = C0907g.d(100, 0, null, 6);
            this.label = 1;
            if (Animatable.c(animatable, f10, c0VarD, null, this, 12) == coroutineSingletons) {
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

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((PulsatingBoxKt$PulsatingBox$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }
}
