package androidx.compose.material;

import androidx.compose.animation.core.c0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;

/* JADX INFO: compiled from: AnchoredDraggable.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.material.AnchoredDraggableKt$animateTo$2", f = "AnchoredDraggable.kt", l = {693}, m = "invokeSuspend")
final class AnchoredDraggableKt$animateTo$2 extends SuspendLambda implements Ia.r<InterfaceC1025a, InterfaceC1044u<Object>, Object, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ AnchoredDraggableState<Object> $this_animateTo;
    final /* synthetic */ float $velocity;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$animateTo$2(AnchoredDraggableState<Object> anchoredDraggableState, float f10, kotlin.coroutines.c<? super AnchoredDraggableKt$animateTo$2> cVar) {
        super(4, cVar);
        this.$this_animateTo = anchoredDraggableState;
        this.$velocity = f10;
    }

    @Override // Ia.r
    public final Object invoke(InterfaceC1025a interfaceC1025a, InterfaceC1044u<Object> interfaceC1044u, Object obj, kotlin.coroutines.c<? super p293xa.r> cVar) {
        AnchoredDraggableKt$animateTo$2 anchoredDraggableKt$animateTo$2 = new AnchoredDraggableKt$animateTo$2(this.$this_animateTo, this.$velocity, cVar);
        anchoredDraggableKt$animateTo$2.L$0 = interfaceC1025a;
        anchoredDraggableKt$animateTo$2.L$1 = interfaceC1044u;
        anchoredDraggableKt$animateTo$2.L$2 = obj;
        return anchoredDraggableKt$animateTo$2.invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            final InterfaceC1025a interfaceC1025a = (InterfaceC1025a) this.L$0;
            float fD = ((InterfaceC1044u) this.L$1).d(this.L$2);
            if (!Float.isNaN(fD)) {
                final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
                float fJ = Float.isNaN(this.$this_animateTo.j.j()) ? 0.0f : this.$this_animateTo.j.j();
                ref$FloatRef.element = fJ;
                float f10 = this.$velocity;
                c0 c0Var = this.$this_animateTo.f11670c;
                Ia.p<Float, Float, p293xa.r> pVar = new Ia.p<Float, Float, p293xa.r>() { // from class: androidx.compose.material.AnchoredDraggableKt$animateTo$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(Float f11, Float f12) {
                        float fFloatValue = f11.floatValue();
                        interfaceC1025a.a(fFloatValue, f12.floatValue());
                        ref$FloatRef.element = fFloatValue;
                        return p293xa.r.f47939a;
                    }
                };
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (androidx.compose.animation.core.T.a(fJ, fD, f10, c0Var, pVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
