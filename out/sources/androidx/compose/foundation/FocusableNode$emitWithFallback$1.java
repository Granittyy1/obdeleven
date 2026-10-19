package androidx.compose.foundation;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.P;

/* JADX INFO: compiled from: Focusable.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.FocusableNode$emitWithFallback$1", f = "Focusable.kt", l = {314}, m = "invokeSuspend")
public final class FocusableNode$emitWithFallback$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ P $handler;
    final /* synthetic */ androidx.compose.foundation.interaction.i $interaction;
    final /* synthetic */ androidx.compose.foundation.interaction.k $this_emitWithFallback;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusableNode$emitWithFallback$1(androidx.compose.foundation.interaction.k kVar, androidx.compose.foundation.interaction.i iVar, P p10, kotlin.coroutines.c<? super FocusableNode$emitWithFallback$1> cVar) {
        super(2, cVar);
        this.$this_emitWithFallback = kVar;
        this.$interaction = iVar;
        this.$handler = p10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new FocusableNode$emitWithFallback$1(this.$this_emitWithFallback, this.$interaction, this.$handler, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((FocusableNode$emitWithFallback$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            androidx.compose.foundation.interaction.k kVar = this.$this_emitWithFallback;
            androidx.compose.foundation.interaction.i iVar = this.$interaction;
            this.label = 1;
            if (kVar.c(iVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        P p10 = this.$handler;
        if (p10 != null) {
            p10.dispose();
        }
        return p293xa.r.f47939a;
    }
}
