package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Interruptible.kt */
/* JADX INFO: loaded from: classes2.dex */
@Aa.c(c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", f = "Interruptible.kt", l = {}, m = "invokeSuspend")
final class InterruptibleKt$runInterruptible$2 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<Object>, Object> {
    final /* synthetic */ Ia.a<Object> $block;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterruptibleKt$runInterruptible$2(Ia.a<Object> aVar, kotlin.coroutines.c<? super InterruptibleKt$runInterruptible$2> cVar) {
        super(2, cVar);
        this.$block = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        InterruptibleKt$runInterruptible$2 interruptibleKt$runInterruptible$2 = new InterruptibleKt$runInterruptible$2(this.$block, cVar);
        interruptibleKt$runInterruptible$2.L$0 = obj;
        return interruptibleKt$runInterruptible$2;
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<Object> cVar) {
        return ((InterruptibleKt$runInterruptible$2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        kotlin.coroutines.e coroutineContext = ((A) this.L$0).getCoroutineContext();
        Ia.a<Object> aVar = this.$block;
        try {
            InterfaceC2694i0 interfaceC2694i0F = C2702l0.f(coroutineContext);
            E0 e10 = new E0(interfaceC2694i0F);
            e10.f43177d = interfaceC2694i0F instanceof JobSupport ? ((JobSupport) interfaceC2694i0F).a0(true, true, e10) : interfaceC2694i0F.f0(true, true, new JobKt__JobKt$invokeOnCompletion$1(1, e10, InterfaceC2681e0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0));
            do {
                atomicIntegerFieldUpdater = E0.f43174e;
                i10 = atomicIntegerFieldUpdater.get(e10);
                if (i10 != 0) {
                    if (i10 == 2 || i10 == 3) {
                        break;
                        break;
                    }
                    E0.c(i10);
                    throw null;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(e10, i10, 0));
            try {
                return aVar.invoke();
            } finally {
                e10.b();
            }
        } catch (InterruptedException e11) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e11);
        }
    }
}
