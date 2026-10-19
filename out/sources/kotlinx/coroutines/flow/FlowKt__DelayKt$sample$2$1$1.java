package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.internal.ChildCancelledException;

/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes2.dex */
@Aa.c(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1", f = "Delay.kt", l = {}, m = "invokeSuspend")
public final class FlowKt__DelayKt$sample$2$1$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.channels.h<? extends Object>, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ Ref$ObjectRef<Object> $lastValue;
    final /* synthetic */ kotlinx.coroutines.channels.p<p293xa.r> $ticker;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2$1$1(Ref$ObjectRef<Object> ref$ObjectRef, kotlinx.coroutines.channels.p<p293xa.r> pVar, kotlin.coroutines.c<? super FlowKt__DelayKt$sample$2$1$1> cVar) {
        super(2, cVar);
        this.$lastValue = ref$ObjectRef;
        this.$ticker = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        FlowKt__DelayKt$sample$2$1$1 flowKt__DelayKt$sample$2$1$1 = new FlowKt__DelayKt$sample$2$1$1(this.$lastValue, this.$ticker, cVar);
        flowKt__DelayKt$sample$2$1$1.L$0 = obj;
        return flowKt__DelayKt$sample$2$1$1;
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.channels.h<? extends Object> hVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((FlowKt__DelayKt$sample$2$1$1) create(new kotlinx.coroutines.channels.h(hVar.f43292a), cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [D3.l, T] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        ?? r10 = ((kotlinx.coroutines.channels.h) this.L$0).f43292a;
        Ref$ObjectRef<Object> ref$ObjectRef = this.$lastValue;
        boolean z10 = r10 instanceof kotlinx.coroutines.channels.h.b;
        if (!z10) {
            ref$ObjectRef.element = r10;
        }
        kotlinx.coroutines.channels.p<p293xa.r> pVar = this.$ticker;
        if (z10) {
            Throwable thA = kotlinx.coroutines.channels.h.a(r10);
            if (thA != null) {
                throw thA;
            }
            pVar.i(new ChildCancelledException());
            ref$ObjectRef.element = kotlinx.coroutines.flow.internal.n.f43405c;
        }
        return p293xa.r.f47939a;
    }
}
