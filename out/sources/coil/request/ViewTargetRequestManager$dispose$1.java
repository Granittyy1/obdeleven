package coil.request;

import androidx.lifecycle.InterfaceC1375s;
import androidx.lifecycle.Lifecycle;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;

/* JADX INFO: compiled from: ViewTargetRequestManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "coil.request.ViewTargetRequestManager$dispose$1", f = "ViewTargetRequestManager.kt", l = {}, m = "invokeSuspend")
final class ViewTargetRequestManager$dispose$1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    int label;
    final /* synthetic */ r this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewTargetRequestManager$dispose$1(r rVar, kotlin.coroutines.c<? super ViewTargetRequestManager$dispose$1> cVar) {
        super(2, cVar);
        this.this$0 = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ViewTargetRequestManager$dispose$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((ViewTargetRequestManager$dispose$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        r rVar = this.this$0;
        q qVar = rVar.f23137e;
        if (qVar != null) {
            qVar.f23133f.i(null);
            p004a3.c<?> cVar = qVar.f23131d;
            boolean z10 = cVar instanceof InterfaceC1375s;
            Lifecycle lifecycle = qVar.f23132e;
            if (z10) {
                lifecycle.c((InterfaceC1375s) cVar);
            }
            lifecycle.c(qVar);
        }
        rVar.f23137e = null;
        return p293xa.r.f47939a;
    }
}
