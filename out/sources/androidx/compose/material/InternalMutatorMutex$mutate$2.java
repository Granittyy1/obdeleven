package androidx.compose.material;

import androidx.compose.foundation.MutatePriority;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC2694i0;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: InternalMutatorMutex.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.material.InternalMutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", l = {180, R.styleable.AppCompatTheme_textAppearanceListItem}, m = "invokeSuspend")
final class InternalMutatorMutex$mutate$2 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<Object>, Object> {
    final /* synthetic */ Ia.l<kotlin.coroutines.c<Object>, Object> $block;
    final /* synthetic */ MutatePriority $priority;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ E this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InternalMutatorMutex$mutate$2(MutatePriority mutatePriority, E e10, Ia.l<? super kotlin.coroutines.c<Object>, ? extends Object> lVar, kotlin.coroutines.c<? super InternalMutatorMutex$mutate$2> cVar) {
        super(2, cVar);
        this.$priority = mutatePriority;
        this.this$0 = e10;
        this.$block = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        InternalMutatorMutex$mutate$2 internalMutatorMutex$mutate$2 = new InternalMutatorMutex$mutate$2(this.$priority, this.this$0, this.$block, cVar);
        internalMutatorMutex$mutate$2.L$0 = obj;
        return internalMutatorMutex$mutate$2;
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<Object> cVar) {
        return ((InternalMutatorMutex$mutate$2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.a] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        E e10;
        kotlinx.coroutines.sync.a aVar;
        Ia.l<kotlin.coroutines.c<Object>, Object> lVar;
        E.a aVar2;
        kotlinx.coroutines.sync.a aVar3;
        E.a aVar4;
        E e11;
        Throwable th;
        AtomicReference<E.a> atomicReference;
        AtomicReference<E.a> atomicReference2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        ?? r10 = this.label;
        try {
            try {
                if (r10 == 0) {
                    kotlin.b.b(obj);
                    kotlinx.coroutines.A a10 = (kotlinx.coroutines.A) this.L$0;
                    MutatePriority mutatePriority = this.$priority;
                    kotlin.coroutines.e.a aVar5 = a10.getCoroutineContext().get(InterfaceC2694i0.b.f43449b);
                    kotlin.jvm.internal.i.b(aVar5);
                    E.a aVar6 = new E.a(mutatePriority, (InterfaceC2694i0) aVar5);
                    E e12 = this.this$0;
                    loop2: while (true) {
                        AtomicReference<E.a> atomicReference3 = e12.f11739a;
                        E.a aVar7 = atomicReference3.get();
                        if (aVar7 != null && aVar6.f11741a.compareTo(aVar7.f11741a) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        do {
                            if (atomicReference3.compareAndSet(aVar7, aVar6)) {
                                if (aVar7 != null) {
                                    aVar7.f11742b.i(null);
                                }
                                e10 = this.this$0;
                                aVar = e10.f11740b;
                                Ia.l<kotlin.coroutines.c<Object>, Object> lVar2 = this.$block;
                                this.L$0 = aVar6;
                                this.L$1 = aVar;
                                this.L$2 = lVar2;
                                this.L$3 = e10;
                                this.label = 1;
                                if (aVar.f(null, this) != coroutineSingletons) {
                                    lVar = lVar2;
                                    aVar2 = aVar6;
                                    break loop2;
                                }
                                return coroutineSingletons;
                            }
                        } while (atomicReference3.get() == aVar7);
                    }
                } else {
                    if (r10 != 1) {
                        if (r10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        e11 = (E) this.L$2;
                        aVar3 = (kotlinx.coroutines.sync.a) this.L$1;
                        aVar4 = (E.a) this.L$0;
                        try {
                            kotlin.b.b(obj);
                            atomicReference2 = e11.f11739a;
                            while (!atomicReference2.compareAndSet(aVar4, null) && atomicReference2.get() == aVar4) {
                            }
                            aVar3.g(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            atomicReference = e11.f11739a;
                            while (!atomicReference.compareAndSet(aVar4, null)) {
                            }
                            throw th;
                        }
                    }
                    E e13 = (E) this.L$3;
                    lVar = (Ia.l) this.L$2;
                    aVar = (kotlinx.coroutines.sync.a) this.L$1;
                    aVar2 = (E.a) this.L$0;
                    kotlin.b.b(obj);
                    e10 = e13;
                }
                this.L$0 = aVar2;
                this.L$1 = aVar3;
                this.L$2 = e10;
                this.L$3 = null;
                this.label = 2;
                Object objInvoke = lVar.invoke(this);
                if (objInvoke == coroutineSingletons) {
                    return coroutineSingletons;
                }
                e11 = e10;
                obj = objInvoke;
                aVar4 = aVar2;
                atomicReference2 = e11.f11739a;
                while (!atomicReference2.compareAndSet(aVar4, null)) {
                }
                aVar3.g(null);
                return obj;
            } catch (Throwable th3) {
                aVar4 = aVar2;
                e11 = e10;
                th = th3;
                atomicReference = e11.f11739a;
                while (!atomicReference.compareAndSet(aVar4, null) && atomicReference.get() == aVar4) {
                }
                throw th;
            }
            aVar3 = aVar;
        } catch (Throwable th4) {
            r10.g(null);
            throw th4;
        }
    }
}
