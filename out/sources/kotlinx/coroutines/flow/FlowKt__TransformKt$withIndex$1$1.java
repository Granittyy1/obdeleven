package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$IntRef;

/* JADX INFO: compiled from: Transform.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class FlowKt__TransformKt$withIndex$1$1<T> implements InterfaceC2687d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2687d<kotlin.collections.s<? extends T>> f43351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ref$IntRef f43352c;

    public FlowKt__TransformKt$withIndex$1$1(Ref$IntRef ref$IntRef, InterfaceC2687d interfaceC2687d) {
        this.f43351b = interfaceC2687d;
        this.f43352c = ref$IntRef;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC2687d
    public final Object emit(T t8, kotlin.coroutines.c<? super p293xa.r> cVar) {
        FlowKt__TransformKt$withIndex$1$1$emit$1 flowKt__TransformKt$withIndex$1$1$emit$1;
        if (cVar instanceof FlowKt__TransformKt$withIndex$1$1$emit$1) {
            flowKt__TransformKt$withIndex$1$1$emit$1 = (FlowKt__TransformKt$withIndex$1$1$emit$1) cVar;
            int i10 = flowKt__TransformKt$withIndex$1$1$emit$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                flowKt__TransformKt$withIndex$1$1$emit$1.label = i10 - Integer.MIN_VALUE;
            } else {
                flowKt__TransformKt$withIndex$1$1$emit$1 = new FlowKt__TransformKt$withIndex$1$1$emit$1(this, cVar);
            }
        } else {
            flowKt__TransformKt$withIndex$1$1$emit$1 = new FlowKt__TransformKt$withIndex$1$1$emit$1(this, cVar);
        }
        Object obj = flowKt__TransformKt$withIndex$1$1$emit$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = flowKt__TransformKt$withIndex$1$1$emit$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            Ref$IntRef ref$IntRef = this.f43352c;
            int i12 = ref$IntRef.element;
            ref$IntRef.element = i12 + 1;
            if (i12 < 0) {
                throw new ArithmeticException("Index overflow has happened");
            }
            kotlin.collections.s<? extends T> sVar = new kotlin.collections.s<>(i12, t8);
            flowKt__TransformKt$withIndex$1$1$emit$1.label = 1;
            if (this.f43351b.emit(sVar, flowKt__TransformKt$withIndex$1$1$emit$1) == coroutineSingletons) {
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
