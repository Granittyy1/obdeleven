package androidx.compose.ui.input.pointer;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: SuspendingPointerInputFilter.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$onPointerEvent$1", f = "SuspendingPointerInputFilter.kt", l = {717, 719}, m = "invokeSuspend")
public final class SuspendingPointerInputModifierNodeImpl$onPointerEvent$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    int label;
    final /* synthetic */ SuspendingPointerInputModifierNodeImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspendingPointerInputModifierNodeImpl$onPointerEvent$1(SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl, kotlin.coroutines.c<? super SuspendingPointerInputModifierNodeImpl$onPointerEvent$1> cVar) {
        super(2, cVar);
        this.this$0 = suspendingPointerInputModifierNodeImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new SuspendingPointerInputModifierNodeImpl$onPointerEvent$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((SuspendingPointerInputModifierNodeImpl$onPointerEvent$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Ia.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = this.this$0;
            ?? r10 = suspendingPointerInputModifierNodeImpl.f14055s;
            if (r10 != 0) {
                this.label = 1;
                if (r10.invoke(suspendingPointerInputModifierNodeImpl, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                PointerInputEventHandler pointerInputEventHandler = suspendingPointerInputModifierNodeImpl.f14056t;
                this.label = 2;
                if (pointerInputEventHandler.invoke(suspendingPointerInputModifierNodeImpl, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return p293xa.r.f47939a;
    }
}
