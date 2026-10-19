package androidx.compose.runtime;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Recomposer.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.runtime.Recomposer$join$2", f = "Recomposer.kt", l = {}, m = "invokeSuspend")
public final class Recomposer$join$2 extends SuspendLambda implements Ia.p<Recomposer.State, kotlin.coroutines.c<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;

    public Recomposer$join$2() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        Recomposer$join$2 recomposer$join$2 = new Recomposer$join$2(2, cVar);
        recomposer$join$2.L$0 = obj;
        return recomposer$join$2;
    }

    @Override // Ia.p
    public final Object invoke(Recomposer.State state, kotlin.coroutines.c<? super Boolean> cVar) {
        return ((Recomposer$join$2) create(state, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        return Boolean.valueOf(((Recomposer.State) this.L$0) == Recomposer.State.f12913b);
    }
}
