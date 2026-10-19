package androidx.compose.foundation.gestures;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.InterfaceC2694i0;
import kotlinx.coroutines.z0;

/* JADX INFO: compiled from: MouseWheelScrollable.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$busyReceive$2", f = "MouseWheelScrollable.kt", l = {170}, m = "invokeSuspend")
final class MouseWheelScrollingLogic$busyReceive$2 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super m.a>, Object> {
    final /* synthetic */ kotlinx.coroutines.channels.d<m.a> $this_busyReceive;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MouseWheelScrollingLogic$busyReceive$2(kotlinx.coroutines.channels.d<m.a> dVar, kotlin.coroutines.c<? super MouseWheelScrollingLogic$busyReceive$2> cVar) {
        super(2, cVar);
        this.$this_busyReceive = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        MouseWheelScrollingLogic$busyReceive$2 mouseWheelScrollingLogic$busyReceive$2 = new MouseWheelScrollingLogic$busyReceive$2(this.$this_busyReceive, cVar);
        mouseWheelScrollingLogic$busyReceive$2.L$0 = obj;
        return mouseWheelScrollingLogic$busyReceive$2;
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super m.a> cVar) {
        return ((MouseWheelScrollingLogic$busyReceive$2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC2694i0 interfaceC2694i0;
        Throwable th;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            z0 z0VarC = C2680e.c((A) this.L$0, null, null, new MouseWheelScrollingLogic$busyReceive$2$job$1(2, null), 3);
            try {
                kotlinx.coroutines.channels.d<m.a> dVar = this.$this_busyReceive;
                this.L$0 = z0VarC;
                this.label = 1;
                Object objD = dVar.d(this);
                if (objD == coroutineSingletons) {
                    return coroutineSingletons;
                }
                interfaceC2694i0 = z0VarC;
                obj = objD;
            } catch (Throwable th2) {
                interfaceC2694i0 = z0VarC;
                th = th2;
                interfaceC2694i0.i(null);
                throw th;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC2694i0 = (InterfaceC2694i0) this.L$0;
            try {
                kotlin.b.b(obj);
            } catch (Throwable th3) {
                th = th3;
                interfaceC2694i0.i(null);
                throw th;
            }
        }
        m.a aVar = (m.a) obj;
        interfaceC2694i0.i(null);
        return aVar;
    }
}
