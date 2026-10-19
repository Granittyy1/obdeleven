package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C0904d;
import androidx.compose.animation.core.C0907g;
import androidx.compose.animation.core.C0909i;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.material3.AnalogTimePickerState$onGestureEnd$2", f = "TimePicker.kt", l = {789}, m = "invokeSuspend")
final class AnalogTimePickerState$onGestureEnd$2 extends SuspendLambda implements Ia.l<kotlin.coroutines.c<? super C0904d<Float, C0909i>>, Object> {
    final /* synthetic */ float $end;
    int label;
    final /* synthetic */ C1047b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalogTimePickerState$onGestureEnd$2(C1047b c1047b, float f10, kotlin.coroutines.c<? super AnalogTimePickerState$onGestureEnd$2> cVar) {
        super(1, cVar);
        this.this$0 = c1047b;
        this.$end = f10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(kotlin.coroutines.c<?> cVar) {
        return new AnalogTimePickerState$onGestureEnd$2(this.this$0, this.$end, cVar);
    }

    @Override // Ia.l
    public final Object invoke(kotlin.coroutines.c<? super C0904d<Float, C0909i>> cVar) {
        return ((AnalogTimePickerState$onGestureEnd$2) create(cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            Animatable<Float, C0909i> animatable = this.this$0.f12422d;
            Float f10 = new Float(this.$end);
            androidx.compose.animation.core.P pC = C0907g.c(0.0f, 0.0f, null, 7);
            this.label = 1;
            obj = Animatable.c(animatable, f10, pC, null, this, 12);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return obj;
    }
}
