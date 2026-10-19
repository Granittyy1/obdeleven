package kotlinx.coroutines.flow;

import D2.V;
import com.google.android.gms.internal.measurement.Y;
import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC2694i0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2688e {
    public static final r a(v vVar) {
        return new r(vVar, null);
    }

    public static final s b(StateFlowImpl stateFlowImpl) {
        return new s(stateFlowImpl, null);
    }

    public static InterfaceC2686c c(InterfaceC2686c interfaceC2686c, int i10) {
        BufferOverflow bufferOverflow = BufferOverflow.f43243b;
        if (i10 < 0 && i10 != -2 && i10 != -1) {
            throw new IllegalArgumentException(J4.i.b(i10, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ").toString());
        }
        if (i10 == -1) {
            bufferOverflow = BufferOverflow.f43244c;
            i10 = 0;
        }
        return interfaceC2686c instanceof kotlinx.coroutines.flow.internal.k ? ((kotlinx.coroutines.flow.internal.k) interfaceC2686c).b(EmptyCoroutineContext.f43032b, i10, bufferOverflow) : new kotlinx.coroutines.flow.internal.f(i10, EmptyCoroutineContext.f43032b, bufferOverflow, interfaceC2686c);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0085  */
    /* JADX WARN: Code duplicated, block: B:44:0x0089  */
    /* JADX WARN: Code duplicated, block: B:46:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Serializable d(InterfaceC2686c interfaceC2686c, InterfaceC2687d interfaceC2687d, ContinuationImpl continuationImpl) throws Throwable {
        FlowKt__ErrorsKt$catchImpl$1 flowKt__ErrorsKt$catchImpl$1;
        Throwable th;
        Ref$ObjectRef ref$ObjectRef;
        Throwable th2;
        InterfaceC2694i0 interfaceC2694i0;
        CancellationException cancellationExceptionM;
        if (continuationImpl instanceof FlowKt__ErrorsKt$catchImpl$1) {
            flowKt__ErrorsKt$catchImpl$1 = (FlowKt__ErrorsKt$catchImpl$1) continuationImpl;
            int i10 = flowKt__ErrorsKt$catchImpl$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                flowKt__ErrorsKt$catchImpl$1.label = i10 - Integer.MIN_VALUE;
            } else {
                flowKt__ErrorsKt$catchImpl$1 = new FlowKt__ErrorsKt$catchImpl$1(continuationImpl);
            }
        } else {
            flowKt__ErrorsKt$catchImpl$1 = new FlowKt__ErrorsKt$catchImpl$1(continuationImpl);
        }
        Object obj = flowKt__ErrorsKt$catchImpl$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = flowKt__ErrorsKt$catchImpl$1.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ref$ObjectRef = (Ref$ObjectRef) flowKt__ErrorsKt$catchImpl$1.L$0;
            try {
                kotlin.b.b(obj);
                return null;
            } catch (Throwable th3) {
                th = th3;
                th2 = (Throwable) ref$ObjectRef.element;
                if (th2 == null) {
                }
                interfaceC2694i0 = (InterfaceC2694i0) flowKt__ErrorsKt$catchImpl$1.getContext().get(InterfaceC2694i0.b.f43449b);
                if (interfaceC2694i0 == null) {
                }
                if (th2 == null) {
                    return th;
                }
                if (th instanceof CancellationException) {
                    V.e(th2, th);
                    throw th2;
                }
                V.e(th, th2);
                throw th;
            }
        }
        kotlin.b.b(obj);
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        try {
            FlowKt__ErrorsKt$catchImpl$2 flowKt__ErrorsKt$catchImpl$2 = new FlowKt__ErrorsKt$catchImpl$2(interfaceC2687d, ref$ObjectRef2);
            flowKt__ErrorsKt$catchImpl$1.L$0 = ref$ObjectRef2;
            flowKt__ErrorsKt$catchImpl$1.label = 1;
            if (interfaceC2686c.collect(flowKt__ErrorsKt$catchImpl$2, flowKt__ErrorsKt$catchImpl$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return null;
        } catch (Throwable th4) {
            th = th4;
            ref$ObjectRef = ref$ObjectRef2;
            th2 = (Throwable) ref$ObjectRef.element;
            if (th2 == null && th2.equals(th)) {
                throw th;
            }
            interfaceC2694i0 = (InterfaceC2694i0) flowKt__ErrorsKt$catchImpl$1.getContext().get(InterfaceC2694i0.b.f43449b);
            if (interfaceC2694i0 == null && interfaceC2694i0.isCancelled() && (cancellationExceptionM = interfaceC2694i0.M()) != null && cancellationExceptionM.equals(th)) {
                throw th;
            }
            if (th2 == null) {
                return th;
            }
            if (th instanceof CancellationException) {
                V.e(th2, th);
                throw th2;
            }
            V.e(th, th2);
            throw th;
        }
    }

    public static final <T> Object e(InterfaceC2686c<? extends T> interfaceC2686c, Ia.p<? super T, ? super kotlin.coroutines.c<? super p293xa.r>, ? extends Object> pVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
        Object objCollect = c(m(pVar, interfaceC2686c), 0).collect(kotlinx.coroutines.flow.internal.m.f43402b, cVar);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (objCollect != coroutineSingletons) {
            objCollect = p293xa.r.f47939a;
        }
        return objCollect == coroutineSingletons ? objCollect : p293xa.r.f47939a;
    }

    public static final C2684a f(kotlinx.coroutines.channels.p pVar) {
        return new C2684a(pVar, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> InterfaceC2686c<T> g(InterfaceC2686c<? extends T> interfaceC2686c, final long j) {
        if (j >= 0) {
            return j == 0 ? interfaceC2686c : g.a(interfaceC2686c, new Ia.l<Object, Long>() { // from class: kotlinx.coroutines.flow.FlowKt__DelayKt$debounce$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // Ia.l
                public final Long invoke(Object obj) {
                    return Long.valueOf(j);
                }
            });
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> InterfaceC2686c<T> h(InterfaceC2686c<? extends T> interfaceC2686c) {
        Ia.l<Object, Object> lVar = FlowKt__DistinctKt.f43319a;
        if (interfaceC2686c instanceof A) {
            return interfaceC2686c;
        }
        Ia.l<Object, Object> lVar2 = FlowKt__DistinctKt.f43319a;
        Ia.p<Object, Object, Boolean> pVar = FlowKt__DistinctKt.f43320b;
        if (interfaceC2686c instanceof DistinctFlowImpl) {
            DistinctFlowImpl distinctFlowImpl = (DistinctFlowImpl) interfaceC2686c;
            if (distinctFlowImpl.f43310c == lVar2 && distinctFlowImpl.f43311d == pVar) {
                return interfaceC2686c;
            }
        }
        return new DistinctFlowImpl(interfaceC2686c, lVar2, pVar);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0082  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x006e, please report this as an issue */
    /* JADX WARN: Type inference failed for: r3v0, types: [D3.l, T] */
    public static final Object i(InterfaceC2686c interfaceC2686c, Ia.p pVar, ContinuationImpl continuationImpl) {
        FlowKt__ReduceKt$first$3 flowKt__ReduceKt$first$3;
        Ia.p pVar2;
        Ref$ObjectRef ref$ObjectRef;
        AbortFlowException e10;
        FlowKt__ReduceKt$first$$inlined$collectWhile$2 flowKt__ReduceKt$first$$inlined$collectWhile$2;
        if (continuationImpl instanceof FlowKt__ReduceKt$first$3) {
            flowKt__ReduceKt$first$3 = (FlowKt__ReduceKt$first$3) continuationImpl;
            int i10 = flowKt__ReduceKt$first$3.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$first$3.label = i10 - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$first$3 = new FlowKt__ReduceKt$first$3(continuationImpl);
            }
        } else {
            flowKt__ReduceKt$first$3 = new FlowKt__ReduceKt$first$3(continuationImpl);
        }
        Object obj = flowKt__ReduceKt$first$3.result;
        Object obj2 = CoroutineSingletons.f43038b;
        int i11 = flowKt__ReduceKt$first$3.label;
        ?? r10 = kotlinx.coroutines.flow.internal.n.f43403a;
        if (i11 == 0) {
            kotlin.b.b(obj);
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            ref$ObjectRef2.element = r10;
            FlowKt__ReduceKt$first$$inlined$collectWhile$2 flowKt__ReduceKt$first$$inlined$collectWhile$3 = new FlowKt__ReduceKt$first$$inlined$collectWhile$2(pVar, ref$ObjectRef2);
            try {
                flowKt__ReduceKt$first$3.L$0 = pVar;
                flowKt__ReduceKt$first$3.L$1 = ref$ObjectRef2;
                flowKt__ReduceKt$first$3.L$2 = flowKt__ReduceKt$first$$inlined$collectWhile$3;
                flowKt__ReduceKt$first$3.label = 1;
                if (interfaceC2686c.collect(flowKt__ReduceKt$first$$inlined$collectWhile$3, flowKt__ReduceKt$first$3) != obj2) {
                    pVar2 = pVar;
                    ref$ObjectRef = ref$ObjectRef2;
                    obj2 = ref$ObjectRef.element;
                    if (obj2 == r10) {
                        throw new NoSuchElementException("Expected at least one element matching the predicate " + pVar2);
                    }
                }
            } catch (AbortFlowException e11) {
                pVar2 = pVar;
                ref$ObjectRef = ref$ObjectRef2;
                e10 = e11;
                flowKt__ReduceKt$first$$inlined$collectWhile$2 = flowKt__ReduceKt$first$$inlined$collectWhile$3;
                if (e10.f43373b != flowKt__ReduceKt$first$$inlined$collectWhile$2) {
                    throw e10;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowKt__ReduceKt$first$$inlined$collectWhile$2 = (FlowKt__ReduceKt$first$$inlined$collectWhile$2) flowKt__ReduceKt$first$3.L$2;
            ref$ObjectRef = (Ref$ObjectRef) flowKt__ReduceKt$first$3.L$1;
            pVar2 = (Ia.p) flowKt__ReduceKt$first$3.L$0;
            try {
                kotlin.b.b(obj);
            } catch (AbortFlowException e12) {
                e10 = e12;
                if (e10.f43373b != flowKt__ReduceKt$first$$inlined$collectWhile$2) {
                    throw e10;
                }
            }
            obj2 = ref$ObjectRef.element;
            if (obj2 == r10) {
                throw new NoSuchElementException("Expected at least one element matching the predicate " + pVar2);
            }
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0066  */
    /* JADX WARN: Code duplicated, block: B:32:0x006e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r3v0, types: [D3.l, T] */
    public static final Object j(InterfaceC2686c interfaceC2686c, ContinuationImpl continuationImpl) {
        FlowKt__ReduceKt$first$1 flowKt__ReduceKt$first$1;
        Ref$ObjectRef ref$ObjectRef;
        AbortFlowException e10;
        l lVar;
        if (continuationImpl instanceof FlowKt__ReduceKt$first$1) {
            flowKt__ReduceKt$first$1 = (FlowKt__ReduceKt$first$1) continuationImpl;
            int i10 = flowKt__ReduceKt$first$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$first$1.label = i10 - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$first$1 = new FlowKt__ReduceKt$first$1(continuationImpl);
            }
        } else {
            flowKt__ReduceKt$first$1 = new FlowKt__ReduceKt$first$1(continuationImpl);
        }
        Object obj = flowKt__ReduceKt$first$1.result;
        Object obj2 = CoroutineSingletons.f43038b;
        int i11 = flowKt__ReduceKt$first$1.label;
        ?? r10 = kotlinx.coroutines.flow.internal.n.f43403a;
        if (i11 == 0) {
            kotlin.b.b(obj);
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            ref$ObjectRef2.element = r10;
            l lVar2 = new l(ref$ObjectRef2);
            try {
                flowKt__ReduceKt$first$1.L$0 = ref$ObjectRef2;
                flowKt__ReduceKt$first$1.L$1 = lVar2;
                flowKt__ReduceKt$first$1.label = 1;
                if (interfaceC2686c.collect(lVar2, flowKt__ReduceKt$first$1) != obj2) {
                    ref$ObjectRef = ref$ObjectRef2;
                    obj2 = ref$ObjectRef.element;
                    if (obj2 == r10) {
                        throw new NoSuchElementException("Expected at least one element");
                    }
                }
            } catch (AbortFlowException e11) {
                ref$ObjectRef = ref$ObjectRef2;
                e10 = e11;
                lVar = lVar2;
                if (e10.f43373b != lVar) {
                    throw e10;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lVar = (l) flowKt__ReduceKt$first$1.L$1;
            ref$ObjectRef = (Ref$ObjectRef) flowKt__ReduceKt$first$1.L$0;
            try {
                kotlin.b.b(obj);
            } catch (AbortFlowException e12) {
                e10 = e12;
                if (e10.f43373b != lVar) {
                    throw e10;
                }
            }
            obj2 = ref$ObjectRef.element;
            if (obj2 == r10) {
                throw new NoSuchElementException("Expected at least one element");
            }
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0060  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object k(ChannelLimitedFlowMerge channelLimitedFlowMerge, Ia.p pVar, ContinuationImpl continuationImpl) {
        FlowKt__ReduceKt$firstOrNull$3 flowKt__ReduceKt$firstOrNull$3;
        Ref$ObjectRef ref$ObjectRef;
        AbortFlowException e10;
        FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2;
        if (continuationImpl instanceof FlowKt__ReduceKt$firstOrNull$3) {
            flowKt__ReduceKt$firstOrNull$3 = (FlowKt__ReduceKt$firstOrNull$3) continuationImpl;
            int i10 = flowKt__ReduceKt$firstOrNull$3.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$firstOrNull$3.label = i10 - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$firstOrNull$3 = new FlowKt__ReduceKt$firstOrNull$3(continuationImpl);
            }
        } else {
            flowKt__ReduceKt$firstOrNull$3 = new FlowKt__ReduceKt$firstOrNull$3(continuationImpl);
        }
        Object obj = flowKt__ReduceKt$firstOrNull$3.result;
        Object obj2 = CoroutineSingletons.f43038b;
        int i11 = flowKt__ReduceKt$firstOrNull$3.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$3 = new FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2(pVar, ref$ObjectRef2);
            try {
                flowKt__ReduceKt$firstOrNull$3.L$0 = ref$ObjectRef2;
                flowKt__ReduceKt$firstOrNull$3.L$1 = flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$3;
                flowKt__ReduceKt$firstOrNull$3.label = 1;
                if (channelLimitedFlowMerge.collect(flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$3, flowKt__ReduceKt$firstOrNull$3) == obj2) {
                    return obj2;
                }
                ref$ObjectRef = ref$ObjectRef2;
            } catch (AbortFlowException e11) {
                ref$ObjectRef = ref$ObjectRef2;
                e10 = e11;
                flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 = flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$3;
                if (e10.f43373b != flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2) {
                    throw e10;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 = (FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2) flowKt__ReduceKt$firstOrNull$3.L$1;
            ref$ObjectRef = (Ref$ObjectRef) flowKt__ReduceKt$firstOrNull$3.L$0;
            try {
                kotlin.b.b(obj);
            } catch (AbortFlowException e12) {
                e10 = e12;
                if (e10.f43373b != flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2) {
                    throw e10;
                }
            }
        }
        return ref$ObjectRef.element;
    }

    public static final void l(FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, kotlinx.coroutines.A a10) {
        C2680e.c(a10, null, null, new FlowKt__CollectKt$launchIn$1(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, null), 3);
    }

    public static final ChannelFlowTransformLatest m(Ia.p pVar, InterfaceC2686c interfaceC2686c) {
        int i10 = k.f43411a;
        return new ChannelFlowTransformLatest(new FlowKt__MergeKt$mapLatest$1(pVar, null), interfaceC2686c, EmptyCoroutineContext.f43032b, -2, BufferOverflow.f43243b);
    }

    public static final kotlinx.coroutines.flow.internal.j n(p pVar) {
        return new kotlinx.coroutines.flow.internal.j(new FlowKt__DelayKt$sample$2(200L, pVar, null));
    }

    public static final r o(InterfaceC2686c interfaceC2686c, p040d1.a aVar, z zVar, int i10) {
        y yVarA = m.a(interfaceC2686c, i10);
        v vVarA = w.a(i10, yVarA.f43435b, yVarA.f43436c);
        D3.l lVar = w.f43431a;
        return new r(vVarA, C2680e.b(aVar, yVarA.f43437d, zVar.equals(z.a.f43438a) ? CoroutineStart.f43166b : CoroutineStart.f43169e, new FlowKt__ShareKt$launchSharing$1(zVar, yVarA.f43434a, vVarA, lVar, null)));
    }

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
    public static r p(v vVar, p040d1.a aVar) {
        Y y10 = z.a.f43438a;
        y yVarA = m.a(vVar, 0);
        v vVarA = w.a(0, yVarA.f43435b, yVarA.f43436c);
        D3.l lVar = w.f43431a;
        return new r(vVarA, C2680e.b(aVar, yVarA.f43437d, y10.equals(y10) ? CoroutineStart.f43166b : CoroutineStart.f43169e, new FlowKt__ShareKt$launchSharing$1(y10, yVarA.f43434a, vVarA, lVar, null)));
    }

    public static final s q(InterfaceC2686c interfaceC2686c, kotlinx.coroutines.A a10, StartedWhileSubscribed startedWhileSubscribed, Object obj) {
        y yVarA = m.a(interfaceC2686c, 1);
        StateFlowImpl stateFlowImplA = B.a(obj);
        return new s(stateFlowImplA, C2680e.b(a10, yVarA.f43437d, startedWhileSubscribed.equals(z.a.f43438a) ? CoroutineStart.f43166b : CoroutineStart.f43169e, new FlowKt__ShareKt$launchSharing$1(startedWhileSubscribed, yVarA.f43434a, stateFlowImplA, obj, null)));
    }
}
