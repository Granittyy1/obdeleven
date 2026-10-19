package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.material3.ClockDialNode$updateNode$1", f = "TimePicker.kt", l = {1503}, m = "invokeSuspend")
final class ClockDialNode$updateNode$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ C1047b $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClockDialNode$updateNode$1(C1047b c1047b, kotlin.coroutines.c<? super ClockDialNode$updateNode$1> cVar) {
        super(2, cVar);
        this.$state = c1047b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ClockDialNode$updateNode$1(this.$state, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((ClockDialNode$updateNode$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objB;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            C1047b c1047b = this.$state;
            this.label = 1;
            l0 l0Var = c1047b.f12419a;
            if ((k0.a(l0Var.g(), 0) && C1047b.k(((Number) c1047b.f12422d.f9340e.getValue()).floatValue()) == C1047b.k(c1047b.f12420b)) || (k0.a(l0Var.g(), 1) && C1047b.k(((Number) c1047b.f12422d.f9340e.getValue()).floatValue()) == C1047b.k(c1047b.f12421c))) {
                objB = p293xa.r.f47939a;
            } else {
                objB = c1047b.f12423e.b(MutatePriority.f9812d, new AnalogTimePickerState$animateToCurrent$2(c1047b, k0.a(l0Var.g(), 0) ? c1047b.j(c1047b.f12420b) : c1047b.j(c1047b.f12421c), null), this);
                if (objB != coroutineSingletons) {
                    objB = p293xa.r.f47939a;
                }
            }
            if (objB == coroutineSingletons) {
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
