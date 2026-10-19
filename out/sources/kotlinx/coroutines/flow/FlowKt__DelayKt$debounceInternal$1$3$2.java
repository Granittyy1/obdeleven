package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes2.dex */
@Aa.c(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", l = {236}, m = "invokeSuspend")
public final class FlowKt__DelayKt$debounceInternal$1$3$2 extends SuspendLambda implements Ia.p<kotlinx.coroutines.channels.h<? extends Object>, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ InterfaceC2687d<Object> $downstream;
    final /* synthetic */ Ref$ObjectRef<Object> $lastValue;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1$3$2(kotlin.coroutines.c cVar, Ref$ObjectRef ref$ObjectRef, InterfaceC2687d interfaceC2687d) {
        super(2, cVar);
        this.$lastValue = ref$ObjectRef;
        this.$downstream = interfaceC2687d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        FlowKt__DelayKt$debounceInternal$1$3$2 flowKt__DelayKt$debounceInternal$1$3$2 = new FlowKt__DelayKt$debounceInternal$1$3$2(cVar, this.$lastValue, this.$downstream);
        flowKt__DelayKt$debounceInternal$1$3$2.L$0 = obj;
        return flowKt__DelayKt$debounceInternal$1$3$2;
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.channels.h<? extends Object> hVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((FlowKt__DelayKt$debounceInternal$1$3$2) create(new kotlinx.coroutines.channels.h(hVar.f43292a), cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6, types: [D3.l, T] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ref$ObjectRef<Object> ref$ObjectRef;
        Ref$ObjectRef<Object> ref$ObjectRef2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            ?? r10 = ((kotlinx.coroutines.channels.h) this.L$0).f43292a;
            ref$ObjectRef = this.$lastValue;
            boolean z10 = r10 instanceof kotlinx.coroutines.channels.h.b;
            if (!z10) {
                ref$ObjectRef.element = r10;
            }
            InterfaceC2687d<Object> interfaceC2687d = this.$downstream;
            if (z10) {
                Throwable thA = kotlinx.coroutines.channels.h.a(r10);
                if (thA != null) {
                    throw thA;
                }
                Object obj2 = ref$ObjectRef.element;
                if (obj2 != null) {
                    if (obj2 == kotlinx.coroutines.flow.internal.n.f43403a) {
                        obj2 = null;
                    }
                    this.L$0 = r10;
                    this.L$1 = ref$ObjectRef;
                    this.label = 1;
                    if (interfaceC2687d.emit(obj2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    ref$ObjectRef2 = ref$ObjectRef;
                }
                ref$ObjectRef.element = kotlinx.coroutines.flow.internal.n.f43405c;
            }
            return p293xa.r.f47939a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ref$ObjectRef2 = (Ref$ObjectRef) this.L$1;
        kotlin.b.b(obj);
        ref$ObjectRef = ref$ObjectRef2;
        ref$ObjectRef.element = kotlinx.coroutines.flow.internal.n.f43405c;
        return p293xa.r.f47939a;
    }
}
