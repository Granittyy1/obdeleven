package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: compiled from: Distinct.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DistinctFlowImpl<T> implements InterfaceC2686c<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2686c<T> f43309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ia.l<T, Object> f43310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ia.p<Object, Object, Boolean> f43311d;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.DistinctFlowImpl$collect$2, reason: invalid class name */
    /* JADX INFO: compiled from: Distinct.kt */
    public static final class AnonymousClass2<T> implements InterfaceC2687d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ DistinctFlowImpl<T> f43312b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef<Object> f43313c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2687d<T> f43314d;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(DistinctFlowImpl<T> distinctFlowImpl, Ref$ObjectRef<Object> ref$ObjectRef, InterfaceC2687d<? super T> interfaceC2687d) {
            this.f43312b = distinctFlowImpl;
            this.f43313c = ref$ObjectRef;
            this.f43314d = interfaceC2687d;
        }

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
            DistinctFlowImpl$collect$2$emit$1 distinctFlowImpl$collect$2$emit$1;
            if (cVar instanceof DistinctFlowImpl$collect$2$emit$1) {
                distinctFlowImpl$collect$2$emit$1 = (DistinctFlowImpl$collect$2$emit$1) cVar;
                int i10 = distinctFlowImpl$collect$2$emit$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    distinctFlowImpl$collect$2$emit$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    distinctFlowImpl$collect$2$emit$1 = new DistinctFlowImpl$collect$2$emit$1(this, cVar);
                }
            } else {
                distinctFlowImpl$collect$2$emit$1 = new DistinctFlowImpl$collect$2$emit$1(this, cVar);
            }
            Object obj = distinctFlowImpl$collect$2$emit$1.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i11 = distinctFlowImpl$collect$2$emit$1.label;
            if (i11 == 0) {
                kotlin.b.b(obj);
                DistinctFlowImpl<T> distinctFlowImpl = this.f43312b;
                T t10 = (T) distinctFlowImpl.f43310c.invoke(t8);
                Ref$ObjectRef<Object> ref$ObjectRef = this.f43313c;
                Object obj2 = ref$ObjectRef.element;
                if (obj2 != kotlinx.coroutines.flow.internal.n.f43403a && distinctFlowImpl.f43311d.invoke(obj2, t10).booleanValue()) {
                    return p293xa.r.f47939a;
                }
                ref$ObjectRef.element = t10;
                distinctFlowImpl$collect$2$emit$1.label = 1;
                if (this.f43314d.emit(t8, distinctFlowImpl$collect$2$emit$1) == coroutineSingletons) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public DistinctFlowImpl(InterfaceC2686c<? extends T> interfaceC2686c, Ia.l<? super T, ? extends Object> lVar, Ia.p<Object, Object, Boolean> pVar) {
        this.f43309b = interfaceC2686c;
        this.f43310c = lVar;
        this.f43311d = pVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC2686c
    public final Object collect(InterfaceC2687d<? super T> interfaceC2687d, kotlin.coroutines.c<? super p293xa.r> cVar) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = (T) kotlinx.coroutines.flow.internal.n.f43403a;
        Object objCollect = this.f43309b.collect(new AnonymousClass2(this, ref$ObjectRef, interfaceC2687d), cVar);
        return objCollect == CoroutineSingletons.f43038b ? objCollect : p293xa.r.f47939a;
    }
}
