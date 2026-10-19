package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 implements InterfaceC2686c<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2686c f43347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f43348c;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: Emitters.kt */
    public static final class AnonymousClass2<T> implements InterfaceC2687d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2687d f43349b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SuspendLambda f43350c;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: Emitters.kt */
        @Aa.c(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {219, 220}, m = "emit")
        public static final class AnonymousClass1 extends ContinuationImpl {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;

            public AnonymousClass1(kotlin.coroutines.c cVar) {
                super(cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return AnonymousClass2.this.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Ia.p pVar, InterfaceC2687d interfaceC2687d) {
            this.f43349b = interfaceC2687d;
            this.f43350c = (SuspendLambda) pVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v1, types: [Ia.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
        @Override // kotlinx.coroutines.flow.InterfaceC2687d
        public final Object emit(T t8, kotlin.coroutines.c<? super p293xa.r> cVar) {
            AnonymousClass1 anonymousClass1;
            Object obj;
            InterfaceC2687d interfaceC2687d;
            if (cVar instanceof AnonymousClass1) {
                anonymousClass1 = (AnonymousClass1) cVar;
                int i10 = anonymousClass1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    anonymousClass1.label = i10 - Integer.MIN_VALUE;
                } else {
                    anonymousClass1 = new AnonymousClass1(cVar);
                }
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
            Object obj2 = anonymousClass1.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i11 = anonymousClass1.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    InterfaceC2687d interfaceC2687d2 = (InterfaceC2687d) anonymousClass1.L$1;
                    obj = anonymousClass1.L$0;
                    kotlin.b.b(obj2);
                    interfaceC2687d = interfaceC2687d2;
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj2);
                }
                return p293xa.r.f47939a;
            }
            kotlin.b.b(obj2);
            anonymousClass1.L$0 = t8;
            InterfaceC2687d interfaceC2687d3 = this.f43349b;
            anonymousClass1.L$1 = interfaceC2687d3;
            anonymousClass1.label = 1;
            if (this.f43350c.invoke(t8, anonymousClass1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = t8;
            interfaceC2687d = interfaceC2687d3;
            anonymousClass1.L$0 = null;
            anonymousClass1.L$1 = null;
            anonymousClass1.label = 2;
            if (interfaceC2687d.emit(obj, anonymousClass1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return p293xa.r.f47939a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(Ia.p pVar, InterfaceC2686c interfaceC2686c) {
        this.f43347b = interfaceC2686c;
        this.f43348c = (SuspendLambda) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Ia.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlinx.coroutines.flow.InterfaceC2686c
    public final Object collect(InterfaceC2687d<? super Object> interfaceC2687d, kotlin.coroutines.c cVar) {
        Object objCollect = this.f43347b.collect(new AnonymousClass2(this.f43348c, interfaceC2687d), cVar);
        return objCollect == CoroutineSingletons.f43038b ? objCollect : p293xa.r.f47939a;
    }
}
