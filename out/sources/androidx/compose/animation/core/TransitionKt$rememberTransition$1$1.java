package androidx.compose.animation.core;

import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C2693i;

/* JADX INFO: compiled from: Transition.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.animation.core.TransitionKt$rememberTransition$1$1", f = "Transition.kt", l = {2147}, m = "invokeSuspend")
final class TransitionKt$rememberTransition$1$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ b0<Object> $transitionState;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransitionKt$rememberTransition$1$1(b0<Object> b0Var, kotlin.coroutines.c<? super TransitionKt$rememberTransition$1$1> cVar) {
        super(2, cVar);
        this.$transitionState = b0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new TransitionKt$rememberTransition$1$1(this.$transitionState, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((TransitionKt$rememberTransition$1$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, xa.g] */
    /* JADX WARN: Type inference failed for: r2v2, types: [S, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlinx.coroutines.sync.a aVar;
        b0<Object> b0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            SeekableTransitionState seekableTransitionState = (SeekableTransitionState) this.$transitionState;
            seekableTransitionState.getClass();
            ((SnapshotStateObserver) TransitionKt.f9464b.getValue()).d(seekableTransitionState, TransitionKt.f9463a, seekableTransitionState.f9410g);
            b0<Object> b0Var2 = this.$transitionState;
            aVar = ((SeekableTransitionState) b0Var2).j;
            this.L$0 = aVar;
            this.L$1 = b0Var2;
            this.label = 1;
            if (aVar.f(null, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            b0Var = b0Var2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b0Var = (b0) this.L$1;
            aVar = (kotlinx.coroutines.sync.a) this.L$0;
            kotlin.b.b(obj);
        }
        try {
            ((SeekableTransitionState) b0Var).f9407d = b0Var.b();
            C2693i c2693i = ((SeekableTransitionState) b0Var).f9412i;
            if (c2693i != null) {
                c2693i.resumeWith(b0Var.b());
            }
            ((SeekableTransitionState) b0Var).f9412i = null;
            p293xa.r rVar = p293xa.r.f47939a;
            return p293xa.r.f47939a;
        } finally {
            aVar.g(null);
        }
    }
}
