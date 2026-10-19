package androidx.paging;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.InterfaceC2686c;
import kotlinx.coroutines.flow.InterfaceC2687d;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: FlowExt.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.paging.FlowExtKt$simpleRunningReduce$1", f = "FlowExt.kt", l = {R.styleable.AppCompatTheme_editTextBackground}, m = "invokeSuspend")
final class FlowExtKt$simpleRunningReduce$1 extends SuspendLambda implements Ia.p<InterfaceC2687d<Object>, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ Ia.q<Object, Object, kotlin.coroutines.c<Object>, Object> $operation;
    final /* synthetic */ InterfaceC2686c<Object> $this_simpleRunningReduce;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.paging.FlowExtKt$simpleRunningReduce$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: FlowExt.kt */
    public static final class AnonymousClass1<T> implements InterfaceC2687d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef<Object> f19235b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Ia.q<T, T, kotlin.coroutines.c<? super T>, Object> f19236c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2687d<T> f19237d;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Ref$ObjectRef<Object> ref$ObjectRef, Ia.q<? super T, ? super T, ? super kotlin.coroutines.c<? super T>, ? extends Object> qVar, InterfaceC2687d<? super T> interfaceC2687d) {
            this.f19235b = ref$ObjectRef;
            this.f19236c = qVar;
            this.f19237d = interfaceC2687d;
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0076 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlinx.coroutines.flow.InterfaceC2687d
        public final Object emit(T t8, kotlin.coroutines.c<? super p293xa.r> cVar) {
            FlowExtKt$simpleRunningReduce$1$1$emit$1 flowExtKt$simpleRunningReduce$1$1$emit$1;
            Ref$ObjectRef<Object> ref$ObjectRef;
            AnonymousClass1<T> anonymousClass1;
            Ref$ObjectRef<Object> ref$ObjectRef2;
            InterfaceC2687d<T> interfaceC2687d;
            T t10;
            if (cVar instanceof FlowExtKt$simpleRunningReduce$1$1$emit$1) {
                flowExtKt$simpleRunningReduce$1$1$emit$1 = (FlowExtKt$simpleRunningReduce$1$1$emit$1) cVar;
                int i10 = flowExtKt$simpleRunningReduce$1$1$emit$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    flowExtKt$simpleRunningReduce$1$1$emit$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    flowExtKt$simpleRunningReduce$1$1$emit$1 = new FlowExtKt$simpleRunningReduce$1$1$emit$1(this, cVar);
                }
            } else {
                flowExtKt$simpleRunningReduce$1$1$emit$1 = new FlowExtKt$simpleRunningReduce$1$1$emit$1(this, cVar);
            }
            Object obj = flowExtKt$simpleRunningReduce$1$1$emit$1.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i11 = flowExtKt$simpleRunningReduce$1$1$emit$1.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ref$ObjectRef2 = (Ref$ObjectRef) flowExtKt$simpleRunningReduce$1$1$emit$1.L$1;
                    anonymousClass1 = (AnonymousClass1) flowExtKt$simpleRunningReduce$1$1$emit$1.L$0;
                    kotlin.b.b(obj);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                }
                return p293xa.r.f47939a;
            }
            kotlin.b.b(obj);
            ref$ObjectRef = this.f19235b;
            Object obj2 = ref$ObjectRef.element;
            if (obj2 == FlowExtKt.f19234a) {
                anonymousClass1 = this;
            } else {
                flowExtKt$simpleRunningReduce$1$1$emit$1.L$0 = this;
                flowExtKt$simpleRunningReduce$1$1$emit$1.L$1 = ref$ObjectRef;
                flowExtKt$simpleRunningReduce$1$1$emit$1.label = 1;
                Object objInvoke = this.f19236c.invoke((T) obj2, t8, flowExtKt$simpleRunningReduce$1$1$emit$1);
                if (objInvoke == coroutineSingletons) {
                    return coroutineSingletons;
                }
                anonymousClass1 = this;
                obj = objInvoke;
                ref$ObjectRef2 = ref$ObjectRef;
            }
            ref$ObjectRef.element = t8;
            interfaceC2687d = anonymousClass1.f19237d;
            t10 = anonymousClass1.f19235b.element;
            flowExtKt$simpleRunningReduce$1$1$emit$1.L$0 = null;
            flowExtKt$simpleRunningReduce$1$1$emit$1.L$1 = null;
            flowExtKt$simpleRunningReduce$1$1$emit$1.label = 2;
            if (interfaceC2687d.emit(t10, flowExtKt$simpleRunningReduce$1$1$emit$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return p293xa.r.f47939a;
            Object obj3 = obj;
            ref$ObjectRef = ref$ObjectRef2;
            t8 = (T) obj3;
            ref$ObjectRef.element = t8;
            interfaceC2687d = anonymousClass1.f19237d;
            t10 = anonymousClass1.f19235b.element;
            flowExtKt$simpleRunningReduce$1$1$emit$1.L$0 = null;
            flowExtKt$simpleRunningReduce$1$1$emit$1.L$1 = null;
            flowExtKt$simpleRunningReduce$1$1$emit$1.label = 2;
            if (interfaceC2687d.emit(t10, flowExtKt$simpleRunningReduce$1$1$emit$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return p293xa.r.f47939a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowExtKt$simpleRunningReduce$1(InterfaceC2686c<Object> interfaceC2686c, Ia.q<Object, Object, ? super kotlin.coroutines.c<Object>, ? extends Object> qVar, kotlin.coroutines.c<? super FlowExtKt$simpleRunningReduce$1> cVar) {
        super(2, cVar);
        this.$this_simpleRunningReduce = interfaceC2686c;
        this.$operation = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        FlowExtKt$simpleRunningReduce$1 flowExtKt$simpleRunningReduce$1 = new FlowExtKt$simpleRunningReduce$1(this.$this_simpleRunningReduce, this.$operation, cVar);
        flowExtKt$simpleRunningReduce$1.L$0 = obj;
        return flowExtKt$simpleRunningReduce$1;
    }

    @Override // Ia.p
    public final Object invoke(InterfaceC2687d<Object> interfaceC2687d, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((FlowExtKt$simpleRunningReduce$1) create(interfaceC2687d, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            InterfaceC2687d interfaceC2687d = (InterfaceC2687d) this.L$0;
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.element = FlowExtKt.f19234a;
            InterfaceC2686c<Object> interfaceC2686c = this.$this_simpleRunningReduce;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(ref$ObjectRef, this.$operation, interfaceC2687d);
            this.label = 1;
            if (interfaceC2686c.collect(anonymousClass1, this) == coroutineSingletons) {
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
