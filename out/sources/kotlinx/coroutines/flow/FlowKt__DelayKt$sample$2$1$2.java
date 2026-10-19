package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes2.dex */
@Aa.c(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2", f = "Delay.kt", l = {293}, m = "invokeSuspend")
public final class FlowKt__DelayKt$sample$2$1$2 extends SuspendLambda implements Ia.p<p293xa.r, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ InterfaceC2687d<Object> $downstream;
    final /* synthetic */ Ref$ObjectRef<Object> $lastValue;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2$1$2(kotlin.coroutines.c cVar, Ref$ObjectRef ref$ObjectRef, InterfaceC2687d interfaceC2687d) {
        super(2, cVar);
        this.$lastValue = ref$ObjectRef;
        this.$downstream = interfaceC2687d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new FlowKt__DelayKt$sample$2$1$2(cVar, this.$lastValue, this.$downstream);
    }

    @Override // Ia.p
    public final Object invoke(p293xa.r rVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((FlowKt__DelayKt$sample$2$1$2) create(rVar, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            Ref$ObjectRef<Object> ref$ObjectRef = this.$lastValue;
            Object obj2 = ref$ObjectRef.element;
            if (obj2 == null) {
                return p293xa.r.f47939a;
            }
            ref$ObjectRef.element = null;
            InterfaceC2687d<Object> interfaceC2687d = this.$downstream;
            if (obj2 == kotlinx.coroutines.flow.internal.n.f43403a) {
                obj2 = null;
            }
            this.label = 1;
            if (interfaceC2687d.emit(obj2, this) == coroutineSingletons) {
                return coroutineSingletons;
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
