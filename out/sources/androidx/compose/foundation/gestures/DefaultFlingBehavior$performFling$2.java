package androidx.compose.foundation.gestures;

import D2.V;
import androidx.compose.animation.core.C0905e;
import androidx.compose.animation.core.C0908h;
import androidx.compose.animation.core.C0909i;
import androidx.compose.animation.core.InterfaceC0918s;
import androidx.compose.animation.core.T;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlinx.coroutines.A;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2", f = "Scrollable.kt", l = {953}, m = "invokeSuspend")
final class DefaultFlingBehavior$performFling$2 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super Float>, Object> {
    final /* synthetic */ float $initialVelocity;
    final /* synthetic */ s $this_performFling;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFlingBehavior$performFling$2(float f10, e eVar, s sVar, kotlin.coroutines.c<? super DefaultFlingBehavior$performFling$2> cVar) {
        super(2, cVar);
        this.$initialVelocity = f10;
        this.this$0 = eVar;
        this.$this_performFling = sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new DefaultFlingBehavior$performFling$2(this.$initialVelocity, this.this$0, this.$this_performFling, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super Float> cVar) {
        return ((DefaultFlingBehavior$performFling$2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        float f10;
        final Ref$FloatRef ref$FloatRef;
        C0908h c0908h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            if (Math.abs(this.$initialVelocity) > 1.0f) {
                ref$FloatRef = new Ref$FloatRef();
                ref$FloatRef.element = this.$initialVelocity;
                final Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                C0908h c0908hD = V.d(0.0f, this.$initialVelocity, 28);
                try {
                    final e eVar = this.this$0;
                    InterfaceC0918s<Float> interfaceC0918s = eVar.f10008a;
                    final s sVar = this.$this_performFling;
                    Ia.l<C0905e<Float, C0909i>, p293xa.r> lVar = new Ia.l<C0905e<Float, C0909i>, p293xa.r>() { // from class: androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // Ia.l
                        public final p293xa.r invoke(C0905e<Float, C0909i> c0905e) {
                            C0905e<Float, C0909i> c0905e2 = c0905e;
                            float fFloatValue = ((Number) c0905e2.f9535e.getValue()).floatValue() - ref$FloatRef2.element;
                            float f11 = sVar.f(fFloatValue);
                            ref$FloatRef2.element = ((Number) c0905e2.f9535e.getValue()).floatValue();
                            ref$FloatRef.element = ((Number) c0905e2.f9531a.b().invoke(c0905e2.f9536f)).floatValue();
                            if (Math.abs(fFloatValue - f11) > 0.5f) {
                                c0905e2.a();
                            }
                            eVar.getClass();
                            return p293xa.r.f47939a;
                        }
                    };
                    this.L$0 = ref$FloatRef;
                    this.L$1 = c0908hD;
                    this.label = 1;
                    if (T.d(c0908hD, interfaceC0918s, false, lVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } catch (CancellationException unused) {
                    c0908h = c0908hD;
                    ref$FloatRef.element = ((Number) c0908h.e()).floatValue();
                }
                f10 = ref$FloatRef.element;
            } else {
                f10 = this.$initialVelocity;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0908h = (C0908h) this.L$1;
            ref$FloatRef = (Ref$FloatRef) this.L$0;
            try {
                kotlin.b.b(obj);
            } catch (CancellationException unused2) {
                ref$FloatRef.element = ((Number) c0908h.e()).floatValue();
            }
            f10 = ref$FloatRef.element;
        }
        return new Float(f10);
    }
}
