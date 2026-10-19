package androidx.compose.material;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Switch.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.material.SwitchKt$Switch$2$1", f = "Switch.kt", l = {139}, m = "invokeSuspend")
public final class SwitchKt$Switch$2$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ AnchoredDraggableState<Boolean> $anchoredDraggableState;
    final /* synthetic */ boolean $checked;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchKt$Switch$2$1(boolean z10, AnchoredDraggableState<Boolean> anchoredDraggableState, kotlin.coroutines.c<? super SwitchKt$Switch$2$1> cVar) {
        super(2, cVar);
        this.$checked = z10;
        this.$anchoredDraggableState = anchoredDraggableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new SwitchKt$Switch$2$1(this.$checked, this.$anchoredDraggableState, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((SwitchKt$Switch$2$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            if (this.$checked != ((Boolean) this.$anchoredDraggableState.f11674g.getValue()).booleanValue()) {
                AnchoredDraggableState<Boolean> anchoredDraggableState = this.$anchoredDraggableState;
                Boolean boolValueOf = Boolean.valueOf(this.$checked);
                this.label = 1;
                if (C1026b.b(anchoredDraggableState, boolValueOf, anchoredDraggableState.f11677k.j(), this) == coroutineSingletons) {
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
