package androidx.compose.animation.core;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC2694i0;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: InternalMutatorMutex.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.animation.core.MutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", l = {176, R.styleable.AppCompatTheme_windowMinWidthMajor}, m = "invokeSuspend")
final class MutatorMutex$mutate$2 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<Object>, Object> {
    final /* synthetic */ Ia.l<kotlin.coroutines.c<Object>, Object> $block;
    final /* synthetic */ MutatePriority $priority;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ L this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MutatorMutex$mutate$2(MutatePriority mutatePriority, L l10, Ia.l<? super kotlin.coroutines.c<Object>, ? extends Object> lVar, kotlin.coroutines.c<? super MutatorMutex$mutate$2> cVar) {
        super(2, cVar);
        this.$priority = mutatePriority;
        this.this$0 = l10;
        this.$block = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        MutatorMutex$mutate$2 mutatorMutex$mutate$2 = new MutatorMutex$mutate$2(this.$priority, this.this$0, this.$block, cVar);
        mutatorMutex$mutate$2.L$0 = obj;
        return mutatorMutex$mutate$2;
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<Object> cVar) {
        return ((MutatorMutex$mutate$2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.a] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        L l10;
        kotlinx.coroutines.sync.a aVar;
        Ia.l<kotlin.coroutines.c<Object>, Object> lVar;
        L.a aVar2;
        kotlinx.coroutines.sync.a aVar3;
        L.a aVar4;
        L l11;
        Throwable th;
        AtomicReference<L.a> atomicReference;
        AtomicReference<L.a> atomicReference2;
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
                    L.a aVar6 = new L.a(mutatePriority, (InterfaceC2694i0) aVar5);
                    L l12 = this.this$0;
                    loop2: while (true) {
                        AtomicReference<L.a> atomicReference3 = l12.f9383a;
                        L.a aVar7 = atomicReference3.get();
                        if (aVar7 != null && aVar6.f9385a.compareTo(aVar7.f9385a) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        do {
                            if (atomicReference3.compareAndSet(aVar7, aVar6)) {
                                if (aVar7 != null) {
                                    aVar7.f9386b.i(new MutationInterruptedException());
                                }
                                l10 = this.this$0;
                                aVar = l10.f9384b;
                                Ia.l<kotlin.coroutines.c<Object>, Object> lVar2 = this.$block;
                                this.L$0 = aVar6;
                                this.L$1 = aVar;
                                this.L$2 = lVar2;
                                this.L$3 = l10;
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
                        l11 = (L) this.L$2;
                        aVar3 = (kotlinx.coroutines.sync.a) this.L$1;
                        aVar4 = (L.a) this.L$0;
                        try {
                            kotlin.b.b(obj);
                            atomicReference2 = l11.f9383a;
                            while (!atomicReference2.compareAndSet(aVar4, null) && atomicReference2.get() == aVar4) {
                            }
                            aVar3.g(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            atomicReference = l11.f9383a;
                            while (!atomicReference.compareAndSet(aVar4, null)) {
                            }
                            throw th;
                        }
                    }
                    L l13 = (L) this.L$3;
                    lVar = (Ia.l) this.L$2;
                    aVar = (kotlinx.coroutines.sync.a) this.L$1;
                    aVar2 = (L.a) this.L$0;
                    kotlin.b.b(obj);
                    l10 = l13;
                }
                this.L$0 = aVar2;
                this.L$1 = aVar3;
                this.L$2 = l10;
                this.L$3 = null;
                this.label = 2;
                Object objInvoke = lVar.invoke(this);
                if (objInvoke == coroutineSingletons) {
                    return coroutineSingletons;
                }
                l11 = l10;
                obj = objInvoke;
                aVar4 = aVar2;
                atomicReference2 = l11.f9383a;
                while (!atomicReference2.compareAndSet(aVar4, null)) {
                }
                aVar3.g(null);
                return obj;
            } catch (Throwable th3) {
                aVar4 = aVar2;
                l11 = l10;
                th = th3;
                atomicReference = l11.f9383a;
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
