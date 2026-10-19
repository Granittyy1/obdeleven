package kotlinx.coroutines.flow.internal;

import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C2702l0;
import kotlinx.coroutines.InterfaceC2694i0;
import kotlinx.coroutines.flow.InterfaceC2687d;
import kotlinx.coroutines.internal.u;
import p293xa.r;

/* JADX INFO: compiled from: SafeCollector.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class SafeCollector<T> extends ContinuationImpl implements InterfaceC2687d<T> {
    public final kotlin.coroutines.e collectContext;
    public final int collectContextSize;
    public final InterfaceC2687d<T> collector;
    private kotlin.coroutines.c<? super r> completion_;
    private kotlin.coroutines.e lastEmissionContext;

    /* JADX WARN: Multi-variable type inference failed */
    public SafeCollector(InterfaceC2687d<? super T> interfaceC2687d, kotlin.coroutines.e eVar) {
        super(l.f43400b, EmptyCoroutineContext.f43032b);
        this.collector = interfaceC2687d;
        this.collectContext = eVar;
        this.collectContextSize = ((Number) eVar.fold(0, new Ia.p<Integer, kotlin.coroutines.e.a, Integer>() { // from class: kotlinx.coroutines.flow.internal.SafeCollector$collectContextSize$1
            @Override // Ia.p
            public final Integer invoke(Integer num, kotlin.coroutines.e.a aVar) {
                return Integer.valueOf(num.intValue() + 1);
            }
        })).intValue();
    }

    public final Object a(kotlin.coroutines.c<? super r> cVar, T t8) {
        kotlin.coroutines.e context = cVar.getContext();
        C2702l0.e(context);
        kotlin.coroutines.e eVar = this.lastEmissionContext;
        if (eVar != context) {
            if (eVar instanceof h) {
                throw new IllegalStateException(kotlin.text.i.v("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((h) eVar).f43397b + ", but then emission attempt of value '" + t8 + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.fold(0, new Ia.p<Integer, kotlin.coroutines.e.a, Integer>(this) { // from class: kotlinx.coroutines.flow.internal.SafeCollector_commonKt$checkContext$result$1
                final /* synthetic */ SafeCollector<?> $this_checkContext;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                    this.$this_checkContext = this;
                }

                @Override // Ia.p
                public final Integer invoke(Integer num, kotlin.coroutines.e.a aVar) {
                    int iIntValue = num.intValue();
                    kotlin.coroutines.e.a aVar2 = aVar;
                    kotlin.coroutines.e.b<?> key = aVar2.getKey();
                    kotlin.coroutines.e.a aVar3 = this.$this_checkContext.collectContext.get(key);
                    if (key != InterfaceC2694i0.b.f43449b) {
                        return Integer.valueOf(aVar2 != aVar3 ? Integer.MIN_VALUE : iIntValue + 1);
                    }
                    InterfaceC2694i0 interfaceC2694i0 = (InterfaceC2694i0) aVar3;
                    InterfaceC2694i0 parent = (InterfaceC2694i0) aVar2;
                    while (true) {
                        if (parent != null) {
                            if (parent == interfaceC2694i0 || !(parent instanceof u)) {
                                break;
                            }
                            parent = parent.getParent();
                        } else {
                            parent = null;
                            break;
                        }
                    }
                    if (parent == interfaceC2694i0) {
                        if (interfaceC2694i0 != null) {
                            iIntValue++;
                        }
                        return Integer.valueOf(iIntValue);
                    }
                    throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + parent + ", expected child of " + interfaceC2694i0 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                }
            })).intValue() != this.collectContextSize) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.collectContext + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.lastEmissionContext = context;
        }
        this.completion_ = cVar;
        Ia.q<InterfaceC2687d<Object>, Object, kotlin.coroutines.c<? super r>, Object> qVar = SafeCollectorKt.f43383a;
        InterfaceC2687d<T> interfaceC2687d = this.collector;
        kotlin.jvm.internal.i.c(interfaceC2687d, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        ((SafeCollectorKt$emitFun$1) qVar).getClass();
        Object objEmit = interfaceC2687d.emit(t8, this);
        if (!kotlin.jvm.internal.i.a(objEmit, CoroutineSingletons.f43038b)) {
            this.completion_ = null;
        }
        return objEmit;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC2687d
    public final Object emit(T t8, kotlin.coroutines.c<? super r> cVar) {
        try {
            Object objA = a(cVar, t8);
            return objA == CoroutineSingletons.f43038b ? objA : r.f47939a;
        } catch (Throwable th) {
            this.lastEmissionContext = new h(cVar.getContext(), th);
            throw th;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, Aa.b
    public final Aa.b getCallerFrame() {
        kotlin.coroutines.c<? super r> cVar = this.completion_;
        if (cVar instanceof Aa.b) {
            return (Aa.b) cVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.c
    public final kotlin.coroutines.e getContext() {
        kotlin.coroutines.e eVar = this.lastEmissionContext;
        return eVar == null ? EmptyCoroutineContext.f43032b : eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable thA = Result.a(obj);
        if (thA != null) {
            this.lastEmissionContext = new h(getContext(), thA);
        }
        kotlin.coroutines.c<? super r> cVar = this.completion_;
        if (cVar != null) {
            cVar.resumeWith(obj);
        }
        return CoroutineSingletons.f43038b;
    }
}
