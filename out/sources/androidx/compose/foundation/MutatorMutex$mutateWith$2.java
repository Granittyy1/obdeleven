package androidx.compose.foundation;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC2694i0;
import kotlinx.coroutines.sync.MutexImpl;

/* JADX INFO: compiled from: MutatorMutex.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.MutatorMutex$mutateWith$2", f = "MutatorMutex.kt", l = {210, 165}, m = "invokeSuspend")
final class MutatorMutex$mutateWith$2 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<Object>, Object> {
    final /* synthetic */ Ia.p<Object, kotlin.coroutines.c<Object>, Object> $block;
    final /* synthetic */ MutatePriority $priority;
    final /* synthetic */ Object $receiver;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ B this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MutatorMutex$mutateWith$2(MutatePriority mutatePriority, B b10, Ia.p<Object, ? super kotlin.coroutines.c<Object>, ? extends Object> pVar, Object obj, kotlin.coroutines.c<? super MutatorMutex$mutateWith$2> cVar) {
        super(2, cVar);
        this.$priority = mutatePriority;
        this.this$0 = b10;
        this.$block = pVar;
        this.$receiver = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        MutatorMutex$mutateWith$2 mutatorMutex$mutateWith$2 = new MutatorMutex$mutateWith$2(this.$priority, this.this$0, this.$block, this.$receiver, cVar);
        mutatorMutex$mutateWith$2.L$0 = obj;
        return mutatorMutex$mutateWith$2;
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<Object> cVar) {
        return ((MutatorMutex$mutateWith$2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.a] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        B b10;
        Object obj2;
        B.a aVar;
        kotlinx.coroutines.sync.a aVar2;
        Ia.p<Object, kotlin.coroutines.c<Object>, Object> pVar;
        B.a aVar3;
        B b11;
        Throwable th;
        AtomicReference<B.a> atomicReference;
        AtomicReference<B.a> atomicReference2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        ?? r10 = this.label;
        try {
            try {
                if (r10 == 0) {
                    kotlin.b.b(obj);
                    kotlinx.coroutines.A a10 = (kotlinx.coroutines.A) this.L$0;
                    MutatePriority mutatePriority = this.$priority;
                    kotlin.coroutines.e.a aVar4 = a10.getCoroutineContext().get(InterfaceC2694i0.b.f43449b);
                    kotlin.jvm.internal.i.b(aVar4);
                    B.a aVar5 = new B.a(mutatePriority, (InterfaceC2694i0) aVar4);
                    B.a(this.this$0, aVar5);
                    b10 = this.this$0;
                    MutexImpl mutexImpl = b10.f9707b;
                    Ia.p<Object, kotlin.coroutines.c<Object>, Object> pVar2 = this.$block;
                    Object obj3 = this.$receiver;
                    this.L$0 = aVar5;
                    this.L$1 = mutexImpl;
                    this.L$2 = pVar2;
                    this.L$3 = obj3;
                    this.L$4 = b10;
                    this.label = 1;
                    if (mutexImpl.f(null, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj2 = obj3;
                    aVar = aVar5;
                    aVar2 = mutexImpl;
                    pVar = pVar2;
                } else {
                    if (r10 != 1) {
                        if (r10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        b11 = (B) this.L$2;
                        aVar2 = (kotlinx.coroutines.sync.a) this.L$1;
                        aVar3 = (B.a) this.L$0;
                        try {
                            kotlin.b.b(obj);
                            atomicReference2 = b11.f9706a;
                            while (!atomicReference2.compareAndSet(aVar3, null) && atomicReference2.get() == aVar3) {
                            }
                            aVar2.g(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            atomicReference = b11.f9706a;
                            while (!atomicReference.compareAndSet(aVar3, null)) {
                            }
                            throw th;
                        }
                    }
                    B b12 = (B) this.L$4;
                    obj2 = this.L$3;
                    pVar = (Ia.p) this.L$2;
                    kotlinx.coroutines.sync.a aVar6 = (kotlinx.coroutines.sync.a) this.L$1;
                    aVar = (B.a) this.L$0;
                    kotlin.b.b(obj);
                    b10 = b12;
                    aVar2 = aVar6;
                }
                this.L$0 = aVar;
                this.L$1 = aVar2;
                this.L$2 = b10;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 2;
                Object objInvoke = pVar.invoke(obj2, this);
                if (objInvoke == coroutineSingletons) {
                    return coroutineSingletons;
                }
                b11 = b10;
                obj = objInvoke;
                aVar3 = aVar;
                atomicReference2 = b11.f9706a;
                while (!atomicReference2.compareAndSet(aVar3, null)) {
                }
                aVar2.g(null);
                return obj;
            } catch (Throwable th3) {
                aVar3 = aVar;
                b11 = b10;
                th = th3;
                atomicReference = b11.f9706a;
                while (!atomicReference.compareAndSet(aVar3, null) && atomicReference.get() == aVar3) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            r10.g(null);
            throw th4;
        }
    }
}
