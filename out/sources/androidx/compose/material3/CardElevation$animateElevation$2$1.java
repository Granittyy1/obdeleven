package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C0909i;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Card.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.material3.CardElevation$animateElevation$2$1", f = "Card.kt", l = {731, 741}, m = "invokeSuspend")
final class CardElevation$animateElevation$2$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ Animatable<p013b0.f, C0909i> $animatable;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ androidx.compose.foundation.interaction.i $interaction;
    final /* synthetic */ float $target;
    int label;
    final /* synthetic */ C1060l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardElevation$animateElevation$2$1(Animatable<p013b0.f, C0909i> animatable, float f10, boolean z10, C1060l c1060l, androidx.compose.foundation.interaction.i iVar, kotlin.coroutines.c<? super CardElevation$animateElevation$2$1> cVar) {
        super(2, cVar);
        this.$animatable = animatable;
        this.$target = f10;
        this.$enabled = z10;
        this.this$0 = c1060l;
        this.$interaction = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new CardElevation$animateElevation$2$1(this.$animatable, this.$target, this.$enabled, this.this$0, this.$interaction, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((CardElevation$animateElevation$2$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        androidx.compose.foundation.interaction.i bVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            if (!p013b0.f.a(((p013b0.f) this.$animatable.f9340e.getValue()).f20481b, this.$target)) {
                if (this.$enabled) {
                    float f10 = ((p013b0.f) this.$animatable.f9340e.getValue()).f20481b;
                    if (p013b0.f.a(f10, this.this$0.f12593b)) {
                        bVar = new androidx.compose.foundation.interaction.m.b(0L);
                    } else if (p013b0.f.a(f10, this.this$0.f12595d)) {
                        bVar = new androidx.compose.foundation.interaction.g();
                    } else if (p013b0.f.a(f10, this.this$0.f12594c)) {
                        bVar = new androidx.compose.foundation.interaction.d();
                    } else {
                        bVar = p013b0.f.a(f10, this.this$0.f12596e) ? new androidx.compose.foundation.interaction.b() : null;
                    }
                    Animatable<p013b0.f, C0909i> animatable = this.$animatable;
                    float f11 = this.$target;
                    androidx.compose.foundation.interaction.i iVar = this.$interaction;
                    this.label = 2;
                    if (androidx.compose.material3.internal.t.a(animatable, f11, bVar, iVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    Animatable<p013b0.f, C0909i> animatable2 = this.$animatable;
                    p013b0.f fVar = new p013b0.f(this.$target);
                    this.label = 1;
                    if (animatable2.e(fVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
        } else {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return p293xa.r.f47939a;
    }
}
