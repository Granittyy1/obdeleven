package androidx.paging;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.InterfaceC2686c;
import kotlinx.coroutines.flow.InterfaceC2687d;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: FlowExt.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.paging.FlowExtKt$simpleScan$1", f = "FlowExt.kt", l = {R.styleable.AppCompatTheme_colorControlHighlight, R.styleable.AppCompatTheme_colorControlNormal}, m = "invokeSuspend")
final class FlowExtKt$simpleScan$1 extends SuspendLambda implements Ia.p<InterfaceC2687d<Object>, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ Object $initial;
    final /* synthetic */ Ia.q<Object, Object, kotlin.coroutines.c<Object>, Object> $operation;
    final /* synthetic */ InterfaceC2686c<Object> $this_simpleScan;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: renamed from: androidx.paging.FlowExtKt$simpleScan$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: FlowExt.kt */
    public static final class AnonymousClass1<T> implements InterfaceC2687d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef<Object> f19238b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Ia.q<Object, T, kotlin.coroutines.c<Object>, Object> f19239c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2687d<Object> f19240d;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Ref$ObjectRef<Object> ref$ObjectRef, Ia.q<Object, ? super T, ? super kotlin.coroutines.c<Object>, ? extends Object> qVar, InterfaceC2687d<Object> interfaceC2687d) {
            this.f19238b = ref$ObjectRef;
            this.f19239c = qVar;
            this.f19240d = interfaceC2687d;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC2687d
        public final Object emit(T t8, kotlin.coroutines.c<? super p293xa.r> cVar) {
            FlowExtKt$simpleScan$1$1$emit$1 flowExtKt$simpleScan$1$1$emit$1;
            AnonymousClass1<T> anonymousClass1;
            Ref$ObjectRef<Object> ref$ObjectRef;
            if (cVar instanceof FlowExtKt$simpleScan$1$1$emit$1) {
                flowExtKt$simpleScan$1$1$emit$1 = (FlowExtKt$simpleScan$1$1$emit$1) cVar;
                int i10 = flowExtKt$simpleScan$1$1$emit$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    flowExtKt$simpleScan$1$1$emit$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    flowExtKt$simpleScan$1$1$emit$1 = new FlowExtKt$simpleScan$1$1$emit$1(this, cVar);
                }
            } else {
                flowExtKt$simpleScan$1$1$emit$1 = new FlowExtKt$simpleScan$1$1$emit$1(this, cVar);
            }
            T t10 = (T) flowExtKt$simpleScan$1$1$emit$1.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i11 = flowExtKt$simpleScan$1$1$emit$1.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ref$ObjectRef = (Ref$ObjectRef) flowExtKt$simpleScan$1$1$emit$1.L$1;
                    anonymousClass1 = (AnonymousClass1) flowExtKt$simpleScan$1$1$emit$1.L$0;
                    kotlin.b.b(t10);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(t10);
                }
                return p293xa.r.f47939a;
            }
            kotlin.b.b(t10);
            Ref$ObjectRef<Object> ref$ObjectRef2 = this.f19238b;
            Object obj = ref$ObjectRef2.element;
            flowExtKt$simpleScan$1$1$emit$1.L$0 = this;
            flowExtKt$simpleScan$1$1$emit$1.L$1 = ref$ObjectRef2;
            flowExtKt$simpleScan$1$1$emit$1.label = 1;
            Object objInvoke = this.f19239c.invoke(obj, t8, flowExtKt$simpleScan$1$1$emit$1);
            if (objInvoke == coroutineSingletons) {
                return coroutineSingletons;
            }
            anonymousClass1 = this;
            t10 = (T) objInvoke;
            ref$ObjectRef = ref$ObjectRef2;
            ref$ObjectRef.element = t10;
            InterfaceC2687d<Object> interfaceC2687d = anonymousClass1.f19240d;
            Object obj2 = anonymousClass1.f19238b.element;
            flowExtKt$simpleScan$1$1$emit$1.L$0 = null;
            flowExtKt$simpleScan$1$1$emit$1.L$1 = null;
            flowExtKt$simpleScan$1$1$emit$1.label = 2;
            if (interfaceC2687d.emit(obj2, flowExtKt$simpleScan$1$1$emit$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return p293xa.r.f47939a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowExtKt$simpleScan$1(Object obj, InterfaceC2686c<Object> interfaceC2686c, Ia.q<Object, Object, ? super kotlin.coroutines.c<Object>, ? extends Object> qVar, kotlin.coroutines.c<? super FlowExtKt$simpleScan$1> cVar) {
        super(2, cVar);
        this.$initial = obj;
        this.$this_simpleScan = interfaceC2686c;
        this.$operation = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        FlowExtKt$simpleScan$1 flowExtKt$simpleScan$1 = new FlowExtKt$simpleScan$1(this.$initial, this.$this_simpleScan, this.$operation, cVar);
        flowExtKt$simpleScan$1.L$0 = obj;
        return flowExtKt$simpleScan$1;
    }

    @Override // Ia.p
    public final Object invoke(InterfaceC2687d<Object> interfaceC2687d, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((FlowExtKt$simpleScan$1) create(interfaceC2687d, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [T, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref$ObjectRef ref$ObjectRef;
        InterfaceC2687d interfaceC2687d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                ref$ObjectRef = (Ref$ObjectRef) this.L$1;
                interfaceC2687d = (InterfaceC2687d) this.L$0;
                kotlin.b.b(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return p293xa.r.f47939a;
        }
        kotlin.b.b(obj);
        InterfaceC2687d interfaceC2687d2 = (InterfaceC2687d) this.L$0;
        ref$ObjectRef = new Ref$ObjectRef();
        ?? r10 = this.$initial;
        ref$ObjectRef.element = r10;
        this.L$0 = interfaceC2687d2;
        this.L$1 = ref$ObjectRef;
        this.label = 1;
        if (interfaceC2687d2.emit(r10, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        interfaceC2687d = interfaceC2687d2;
        InterfaceC2686c<Object> interfaceC2686c = this.$this_simpleScan;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(ref$ObjectRef, this.$operation, interfaceC2687d);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        if (interfaceC2686c.collect(anonymousClass1, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return p293xa.r.f47939a;
    }
}
