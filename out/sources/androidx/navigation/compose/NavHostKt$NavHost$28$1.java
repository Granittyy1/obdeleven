package androidx.navigation.compose;

import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.runtime.N0;
import androidx.compose.runtime.U;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p141l2.C2749t;

/* JADX INFO: compiled from: NavHost.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.navigation.compose.NavHostKt$NavHost$28$1", f = "NavHost.kt", l = {620}, m = "invokeSuspend")
final class NavHostKt$NavHost$28$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ N0<List<C2749t>> $currentBackStack$delegate;
    final /* synthetic */ U $progress$delegate;
    final /* synthetic */ SeekableTransitionState<C2749t> $transitionState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavHostKt$NavHost$28$1(SeekableTransitionState<C2749t> seekableTransitionState, N0<? extends List<C2749t>> n10, U u10, kotlin.coroutines.c<? super NavHostKt$NavHost$28$1> cVar) {
        super(2, cVar);
        this.$transitionState = seekableTransitionState;
        this.$currentBackStack$delegate = n10;
        this.$progress$delegate = u10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new NavHostKt$NavHost$28$1(this.$transitionState, this.$currentBackStack$delegate, this.$progress$delegate, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((NavHostKt$NavHost$28$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            C2749t c2749t = this.$currentBackStack$delegate.getValue().get(this.$currentBackStack$delegate.getValue().size() - 2);
            SeekableTransitionState<C2749t> seekableTransitionState = this.$transitionState;
            float fJ = this.$progress$delegate.j();
            this.label = 1;
            if (seekableTransitionState.n(fJ, c2749t, this) == coroutineSingletons) {
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
