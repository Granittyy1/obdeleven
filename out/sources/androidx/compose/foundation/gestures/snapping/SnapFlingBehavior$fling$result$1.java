package androidx.compose.foundation.gestures.snapping;

import D2.V;
import Ia.l;
import Ia.p;
import androidx.compose.animation.core.C0908h;
import androidx.compose.animation.core.C0909i;
import androidx.compose.animation.core.InterfaceC0906f;
import androidx.compose.animation.core.InterfaceC0918s;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.e0;
import androidx.compose.foundation.gestures.s;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: SnapFlingBehavior.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1", f = "SnapFlingBehavior.kt", l = {135, 151}, m = "invokeSuspend")
final class SnapFlingBehavior$fling$result$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super a<Float, C0909i>>, Object> {
    final /* synthetic */ float $initialVelocity;
    final /* synthetic */ l<Float, r> $onRemainingScrollOffsetUpdate;
    final /* synthetic */ s $this_fling;
    Object L$0;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SnapFlingBehavior$fling$result$1(h hVar, float f10, l<? super Float, r> lVar, s sVar, kotlin.coroutines.c<? super SnapFlingBehavior$fling$result$1> cVar) {
        super(2, cVar);
        this.this$0 = hVar;
        this.$initialVelocity = f10;
        this.$onRemainingScrollOffsetUpdate = lVar;
        this.$this_fling = sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new SnapFlingBehavior$fling$result$1(this.this$0, this.$initialVelocity, this.$onRemainingScrollOffsetUpdate, this.$this_fling, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super a<Float, C0909i>> cVar) {
        return ((SnapFlingBehavior$fling$result$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final Ref$FloatRef ref$FloatRef;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                ref$FloatRef = (Ref$FloatRef) this.L$0;
                kotlin.b.b(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
        }
        kotlin.b.b(obj);
        InterfaceC0918s<Float> interfaceC0918s = this.this$0.f10046b;
        float f10 = this.$initialVelocity;
        e0 e0Var = VectorConvertersKt.f9477a;
        float fC = this.this$0.f10045a.c(this.$initialVelocity, ((C0909i) interfaceC0918s.b().b(new C0909i(0.0f), new C0909i(f10))).f9552a);
        if (Float.isNaN(fC)) {
            p245u.c.c("calculateApproachOffset returned NaN. Please use a valid value.");
        }
        ref$FloatRef = new Ref$FloatRef();
        float fSignum = Math.signum(this.$initialVelocity) * Math.abs(fC);
        ref$FloatRef.element = fSignum;
        this.$onRemainingScrollOffsetUpdate.invoke(new Float(fSignum));
        h hVar = this.this$0;
        s sVar = this.$this_fling;
        float f11 = ref$FloatRef.element;
        float f12 = this.$initialVelocity;
        final l<Float, r> lVar = this.$onRemainingScrollOffsetUpdate;
        l<Float, r> lVar2 = new l<Float, r>() { // from class: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1$animationState$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Float f13) {
                float fFloatValue = f13.floatValue();
                Ref$FloatRef ref$FloatRef2 = ref$FloatRef;
                float f14 = ref$FloatRef2.element - fFloatValue;
                ref$FloatRef2.element = f14;
                lVar.invoke(Float.valueOf(f14));
                return r.f47939a;
            }
        };
        this.L$0 = ref$FloatRef;
        this.label = 1;
        obj = h.c(hVar, sVar, f11, f12, lVar2, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        C0908h c0908h = (C0908h) obj;
        float fD = this.this$0.f10045a.d(((Number) c0908h.e()).floatValue());
        if (Float.isNaN(fD)) {
            p245u.c.c("calculateSnapOffset returned NaN. Please use a valid value.");
        }
        ref$FloatRef.element = fD;
        s sVar2 = this.$this_fling;
        C0908h c0908hH = V.h(c0908h, 0.0f, 0.0f, 30);
        InterfaceC0906f<Float> interfaceC0906f = this.this$0.f10047c;
        final l<Float, r> lVar3 = this.$onRemainingScrollOffsetUpdate;
        l<Float, r> lVar4 = new l<Float, r>() { // from class: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Float f13) {
                float fFloatValue = f13.floatValue();
                Ref$FloatRef ref$FloatRef2 = ref$FloatRef;
                float f14 = ref$FloatRef2.element - fFloatValue;
                ref$FloatRef2.element = f14;
                lVar3.invoke(Float.valueOf(f14));
                return r.f47939a;
            }
        };
        this.L$0 = null;
        this.label = 2;
        obj = i.c(sVar2, fD, fD, c0908hH, interfaceC0906f, lVar4, this);
        return obj == coroutineSingletons ? coroutineSingletons : obj;
    }
}
