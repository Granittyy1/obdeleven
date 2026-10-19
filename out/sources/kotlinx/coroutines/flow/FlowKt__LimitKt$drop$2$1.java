package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$IntRef;

/* JADX INFO: compiled from: Limit.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class FlowKt__LimitKt$drop$2$1<T> implements InterfaceC2687d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref$IntRef f43331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f43332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2687d<T> f43333d;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$drop$2$1(Ref$IntRef ref$IntRef, int i10, InterfaceC2687d<? super T> interfaceC2687d) {
        this.f43331b = ref$IntRef;
        this.f43332c = i10;
        this.f43333d = interfaceC2687d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC2687d
    public final Object emit(T t8, kotlin.coroutines.c<? super p293xa.r> cVar) {
        FlowKt__LimitKt$drop$2$1$emit$1 flowKt__LimitKt$drop$2$1$emit$1;
        if (cVar instanceof FlowKt__LimitKt$drop$2$1$emit$1) {
            flowKt__LimitKt$drop$2$1$emit$1 = (FlowKt__LimitKt$drop$2$1$emit$1) cVar;
            int i10 = flowKt__LimitKt$drop$2$1$emit$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$drop$2$1$emit$1.label = i10 - Integer.MIN_VALUE;
            } else {
                flowKt__LimitKt$drop$2$1$emit$1 = new FlowKt__LimitKt$drop$2$1$emit$1(this, cVar);
            }
        } else {
            flowKt__LimitKt$drop$2$1$emit$1 = new FlowKt__LimitKt$drop$2$1$emit$1(this, cVar);
        }
        Object obj = flowKt__LimitKt$drop$2$1$emit$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = flowKt__LimitKt$drop$2$1$emit$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            Ref$IntRef ref$IntRef = this.f43331b;
            int i12 = ref$IntRef.element;
            if (i12 < this.f43332c) {
                ref$IntRef.element = i12 + 1;
                return p293xa.r.f47939a;
            }
            flowKt__LimitKt$drop$2$1$emit$1.label = 1;
            if (this.f43333d.emit(t8, flowKt__LimitKt$drop$2$1$emit$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return p293xa.r.f47939a;
    }
}
