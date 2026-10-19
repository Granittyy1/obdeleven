package androidx.navigation.compose;

import androidx.compose.animation.core.SeekableTransitionState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p141l2.C2749t;

/* JADX INFO: compiled from: NavHost.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.navigation.compose.NavHostKt$NavHost$29$1$1$1", f = "NavHost.kt", l = {642, 646}, m = "invokeSuspend")
public final class NavHostKt$NavHost$29$1$1$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ C2749t $backStackEntry;
    final /* synthetic */ SeekableTransitionState<C2749t> $transitionState;
    final /* synthetic */ float $value;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$29$1$1$1(float f10, SeekableTransitionState<C2749t> seekableTransitionState, C2749t c2749t, kotlin.coroutines.c<? super NavHostKt$NavHost$29$1$1$1> cVar) {
        super(2, cVar);
        this.$value = f10;
        this.$transitionState = seekableTransitionState;
        this.$backStackEntry = c2749t;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new NavHostKt$NavHost$29$1$1$1(this.$value, this.$transitionState, this.$backStackEntry, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((NavHostKt$NavHost$29$1$1$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.b.b(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return p293xa.r.f47939a;
        }
        kotlin.b.b(obj);
        float f10 = this.$value;
        if (f10 > 0.0f) {
            SeekableTransitionState<C2749t> seekableTransitionState = this.$transitionState;
            this.label = 1;
            if (seekableTransitionState.n(f10, seekableTransitionState.f9405b.getValue(), this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        if (this.$value == 0.0f) {
            SeekableTransitionState<C2749t> seekableTransitionState2 = this.$transitionState;
            C2749t c2749t = this.$backStackEntry;
            this.label = 2;
            if (seekableTransitionState2.q(c2749t, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return p293xa.r.f47939a;
    }
}
