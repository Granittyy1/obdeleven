package androidx.compose.foundation.gestures;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.InterfaceC2694i0;

/* JADX INFO: compiled from: TapGestureDetector.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$launchAwaitingReset$1", f = "TapGestureDetector.kt", l = {502, 504}, m = "invokeSuspend")
final class TapGestureDetectorKt$launchAwaitingReset$1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> $block;
    final /* synthetic */ InterfaceC2694i0 $resetJob;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TapGestureDetectorKt$launchAwaitingReset$1(InterfaceC2694i0 interfaceC2694i0, Ia.p<? super A, ? super kotlin.coroutines.c<? super p293xa.r>, ? extends Object> pVar, kotlin.coroutines.c<? super TapGestureDetectorKt$launchAwaitingReset$1> cVar) {
        super(2, cVar);
        this.$resetJob = interfaceC2694i0;
        this.$block = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        TapGestureDetectorKt$launchAwaitingReset$1 tapGestureDetectorKt$launchAwaitingReset$1 = new TapGestureDetectorKt$launchAwaitingReset$1(this.$resetJob, this.$block, cVar);
        tapGestureDetectorKt$launchAwaitingReset$1.L$0 = obj;
        return tapGestureDetectorKt$launchAwaitingReset$1;
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((TapGestureDetectorKt$launchAwaitingReset$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        A a10;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                a10 = (A) this.L$0;
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
        a10 = (A) this.L$0;
        InterfaceC2694i0 interfaceC2694i0 = this.$resetJob;
        this.L$0 = a10;
        this.label = 1;
        if (interfaceC2694i0.C(this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> pVar = this.$block;
        this.L$0 = null;
        this.label = 2;
        if (pVar.invoke(a10, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return p293xa.r.f47939a;
    }
}
