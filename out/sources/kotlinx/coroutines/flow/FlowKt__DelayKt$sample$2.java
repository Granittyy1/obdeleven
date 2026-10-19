package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes2.dex */
@Aa.c(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", f = "Delay.kt", l = {415}, m = "invokeSuspend")
final class FlowKt__DelayKt$sample$2 extends SuspendLambda implements Ia.q<kotlinx.coroutines.A, InterfaceC2687d<Object>, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ long $periodMillis;
    final /* synthetic */ InterfaceC2686c<Object> $this_sample;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2(long j, InterfaceC2686c<Object> interfaceC2686c, kotlin.coroutines.c<? super FlowKt__DelayKt$sample$2> cVar) {
        super(3, cVar);
        this.$periodMillis = j;
        this.$this_sample = interfaceC2686c;
    }

    @Override // Ia.q
    public final Object invoke(kotlinx.coroutines.A a10, InterfaceC2687d<Object> interfaceC2687d, kotlin.coroutines.c<? super p293xa.r> cVar) {
        FlowKt__DelayKt$sample$2 flowKt__DelayKt$sample$2 = new FlowKt__DelayKt$sample$2(this.$periodMillis, this.$this_sample, cVar);
        flowKt__DelayKt$sample$2.L$0 = a10;
        flowKt__DelayKt$sample$2.L$1 = interfaceC2687d;
        return flowKt__DelayKt$sample$2.invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC2687d interfaceC2687d;
        kotlinx.coroutines.channels.p pVarB;
        kotlinx.coroutines.channels.p pVar;
        Ref$ObjectRef ref$ObjectRef;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            kotlinx.coroutines.A a10 = (kotlinx.coroutines.A) this.L$0;
            InterfaceC2687d interfaceC2687d2 = (InterfaceC2687d) this.L$1;
            kotlinx.coroutines.channels.m mVarB = kotlinx.coroutines.channels.l.b(a10, -1, new FlowKt__DelayKt$sample$2$values$1(this.$this_sample, null), 1);
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            interfaceC2687d = interfaceC2687d2;
            pVarB = kotlinx.coroutines.channels.l.b(a10, 0, new FlowKt__DelayKt$fixedPeriodTicker$1(this.$periodMillis, null), 1);
            pVar = mVarB;
            ref$ObjectRef = ref$ObjectRef2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pVarB = (kotlinx.coroutines.channels.p) this.L$3;
            ref$ObjectRef = (Ref$ObjectRef) this.L$2;
            pVar = (kotlinx.coroutines.channels.p) this.L$1;
            interfaceC2687d = (InterfaceC2687d) this.L$0;
            kotlin.b.b(obj);
        }
        while (ref$ObjectRef.element != kotlinx.coroutines.flow.internal.n.f43405c) {
            kotlinx.coroutines.selects.d dVar = new kotlinx.coroutines.selects.d(getContext());
            dVar.i(pVar.f(), new FlowKt__DelayKt$sample$2$1$1(ref$ObjectRef, pVarB, null));
            dVar.i(pVarB.e(), new FlowKt__DelayKt$sample$2$1$2(null, ref$ObjectRef, interfaceC2687d));
            this.L$0 = interfaceC2687d;
            this.L$1 = pVar;
            this.L$2 = ref$ObjectRef;
            this.L$3 = pVarB;
            this.label = 1;
            if ((kotlinx.coroutines.selects.d.f43575g.get(dVar) instanceof kotlinx.coroutines.selects.d.a ? dVar.f(this) : dVar.g(this)) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return p293xa.r.f47939a;
    }
}
