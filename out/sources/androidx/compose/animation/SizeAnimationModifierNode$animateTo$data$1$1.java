package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationEndReason;
import androidx.compose.animation.core.C0904d;
import androidx.compose.animation.core.C0910j;
import androidx.compose.animation.core.InterfaceC0906f;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: AnimationModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.animation.SizeAnimationModifierNode$animateTo$data$1$1", f = "AnimationModifier.kt", l = {230}, m = "invokeSuspend")
final class SizeAnimationModifierNode$animateTo$data$1$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ long $targetSize;
    final /* synthetic */ SizeAnimationModifierNode.a $this_apply;
    int label;
    final /* synthetic */ SizeAnimationModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SizeAnimationModifierNode$animateTo$data$1$1(SizeAnimationModifierNode.a aVar, long j, SizeAnimationModifierNode sizeAnimationModifierNode, kotlin.coroutines.c<? super SizeAnimationModifierNode$animateTo$data$1$1> cVar) {
        super(2, cVar);
        this.$this_apply = aVar;
        this.$targetSize = j;
        this.this$0 = sizeAnimationModifierNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new SizeAnimationModifierNode$animateTo$data$1$1(this.$this_apply, this.$targetSize, this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((SizeAnimationModifierNode$animateTo$data$1$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ia.p<? super p013b0.l, ? super p013b0.l, p293xa.r> pVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            Animatable<p013b0.l, C0910j> animatable = this.$this_apply.f9326a;
            p013b0.l lVar = new p013b0.l(this.$targetSize);
            InterfaceC0906f<p013b0.l> interfaceC0906f = this.this$0.f9319p;
            this.label = 1;
            obj = Animatable.c(animatable, lVar, interfaceC0906f, null, this, 12);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        C0904d c0904d = (C0904d) obj;
        if (c0904d.f9530b == AnimationEndReason.f9347c && (pVar = this.this$0.f9321r) != null) {
            pVar.invoke(new p013b0.l(this.$this_apply.f9327b), c0904d.f9529a.f9544c.getValue());
        }
        return p293xa.r.f47939a;
    }
}
