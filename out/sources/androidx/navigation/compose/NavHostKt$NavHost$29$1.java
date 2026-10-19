package androidx.navigation.compose;

import androidx.compose.animation.core.C0907g;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.animation.core.T;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.c0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C2680e;
import p141l2.C2749t;

/* JADX INFO: compiled from: NavHost.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.navigation.compose.NavHostKt$NavHost$29$1", f = "NavHost.kt", l = {627, 634}, m = "invokeSuspend")
final class NavHostKt$NavHost$29$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ C2749t $backStackEntry;
    final /* synthetic */ Transition<C2749t> $transition;
    final /* synthetic */ SeekableTransitionState<C2749t> $transitionState;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$29$1(SeekableTransitionState<C2749t> seekableTransitionState, C2749t c2749t, Transition<C2749t> transition, kotlin.coroutines.c<? super NavHostKt$NavHost$29$1> cVar) {
        super(2, cVar);
        this.$transitionState = seekableTransitionState;
        this.$backStackEntry = c2749t;
        this.$transition = transition;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        NavHostKt$NavHost$29$1 navHostKt$NavHost$29$1 = new NavHostKt$NavHost$29$1(this.$transitionState, this.$backStackEntry, this.$transition, cVar);
        navHostKt$NavHost$29$1.L$0 = obj;
        return navHostKt$NavHost$29$1;
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((NavHostKt$NavHost$29$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            final kotlinx.coroutines.A a10 = (kotlinx.coroutines.A) this.L$0;
            if (kotlin.jvm.internal.i.a(this.$transitionState.f9406c.getValue(), this.$backStackEntry)) {
                long jLongValue = ((Number) this.$transition.f9439l.getValue()).longValue() / ((long) 1000000);
                float fJ = this.$transitionState.f9411h.j();
                c0 c0VarD = C0907g.d((int) (this.$transitionState.f9411h.j() * jLongValue), 0, null, 6);
                final SeekableTransitionState<C2749t> seekableTransitionState = this.$transitionState;
                final C2749t c2749t = this.$backStackEntry;
                Ia.p pVar = new Ia.p() { // from class: androidx.navigation.compose.M
                    @Override // Ia.p
                    public final Object invoke(Object obj2, Object obj3) {
                        float fFloatValue = ((Float) obj2).floatValue();
                        ((Float) obj3).getClass();
                        C2680e.c(a10, null, null, new NavHostKt$NavHost$29$1$1$1(fFloatValue, seekableTransitionState, c2749t, null), 3);
                        return p293xa.r.f47939a;
                    }
                };
                this.label = 2;
                if (T.c(fJ, 0.0f, c0VarD, pVar, this, 4) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                SeekableTransitionState<C2749t> seekableTransitionState2 = this.$transitionState;
                C2749t c2749t2 = this.$backStackEntry;
                this.label = 1;
                if (SeekableTransitionState.l(seekableTransitionState2, c2749t2, this) == coroutineSingletons) {
                    return coroutineSingletons;
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
