package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C0907g;
import androidx.compose.animation.core.C0909i;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.material3.AnalogTimePickerState$rotateTo$2", f = "TimePicker.kt", l = {803, 806}, m = "invokeSuspend")
final class AnalogTimePickerState$rotateTo$2 extends SuspendLambda implements Ia.l<kotlin.coroutines.c<? super Object>, Object> {
    final /* synthetic */ float $angle;
    final /* synthetic */ boolean $animate;
    int label;
    final /* synthetic */ C1047b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalogTimePickerState$rotateTo$2(C1047b c1047b, float f10, boolean z10, kotlin.coroutines.c<? super AnalogTimePickerState$rotateTo$2> cVar) {
        super(1, cVar);
        this.this$0 = c1047b;
        this.$angle = f10;
        this.$animate = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(kotlin.coroutines.c<?> cVar) {
        return new AnalogTimePickerState$rotateTo$2(this.this$0, this.$angle, this.$animate, cVar);
    }

    @Override // Ia.l
    public final Object invoke(kotlin.coroutines.c<? super Object> cVar) {
        return ((AnalogTimePickerState$rotateTo$2) create(cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            if (k0.a(this.this$0.f12419a.g(), 0)) {
                C1047b c1047b = this.this$0;
                float f10 = this.$angle;
                c1047b.getClass();
                double d10 = ((double) 0.2617994f) + 1.5707963267948966d;
                double d11 = 0.5235988f;
                c1047b.f12420b = ((((int) ((((double) f10) + d10) / d11)) % 12) % 12) * 0.5235988f;
                C1047b c1047b2 = this.this$0;
                l0 l0Var = c1047b2.f12419a;
                l0Var.d(((((int) ((((double) c1047b2.f12420b) + d10) / d11)) % 12) % 12) + (l0Var.i() ? 12 : 0));
            } else {
                C1047b c1047b3 = this.this$0;
                float f11 = this.$angle;
                c1047b3.getClass();
                double d12 = ((double) 0.05235988f) + 1.5707963267948966d;
                double d13 = 0.10471976f;
                c1047b3.f12421c = (((int) ((((double) f11) + d12) / d13)) % 60) * 0.10471976f;
                C1047b c1047b4 = this.this$0;
                c1047b4.f12419a.e(((int) ((((double) c1047b4.f12421c) + d12) / d13)) % 60);
            }
            if (this.$animate) {
                C1047b c1047b5 = this.this$0;
                float f12 = this.$angle;
                c1047b5.getClass();
                float f13 = f12 + 1.5707964f;
                if (f13 < 0.0f) {
                    f13 += 6.2831855f;
                }
                float fJ = c1047b5.j(f13);
                Animatable<Float, C0909i> animatable = this.this$0.f12422d;
                Float f14 = new Float(fJ);
                androidx.compose.animation.core.P pC = C0907g.c(1.0f, 700.0f, null, 4);
                this.label = 2;
                Object objC = Animatable.c(animatable, f14, pC, null, this, 12);
                return objC == coroutineSingletons ? coroutineSingletons : objC;
            }
            Animatable<Float, C0909i> animatable2 = this.this$0.f12422d;
            float f15 = this.$angle + 1.5707964f;
            if (f15 < 0.0f) {
                f15 += 6.2831855f;
            }
            Float f16 = new Float(f15);
            this.label = 1;
            if (animatable2.e(f16, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                return obj;
            }
            kotlin.b.b(obj);
        }
        return p293xa.r.f47939a;
    }
}
