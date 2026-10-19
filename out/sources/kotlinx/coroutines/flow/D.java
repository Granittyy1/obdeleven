package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.SafeCollector;

/* JADX INFO: compiled from: Share.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class D<T> implements InterfaceC2687d<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2687d<T> f43307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ia.p<InterfaceC2687d<? super T>, kotlin.coroutines.c<? super p293xa.r>, Object> f43308c;

    public D(Ia.p pVar, InterfaceC2687d interfaceC2687d) {
        this.f43307b = interfaceC2687d;
        this.f43308c = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.coroutines.jvm.internal.ContinuationImpl] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    public final Object a(ContinuationImpl continuationImpl) {
        SubscribedFlowCollector$onSubscription$1 subscribedFlowCollector$onSubscription$1;
        SafeCollector safeCollector;
        D<T> d10;
        if (continuationImpl instanceof SubscribedFlowCollector$onSubscription$1) {
            subscribedFlowCollector$onSubscription$1 = (SubscribedFlowCollector$onSubscription$1) continuationImpl;
            int i10 = subscribedFlowCollector$onSubscription$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                subscribedFlowCollector$onSubscription$1.label = i10 - Integer.MIN_VALUE;
            } else {
                subscribedFlowCollector$onSubscription$1 = new SubscribedFlowCollector$onSubscription$1(this, continuationImpl);
            }
        } else {
            subscribedFlowCollector$onSubscription$1 = new SubscribedFlowCollector$onSubscription$1(this, continuationImpl);
        }
        Object obj = subscribedFlowCollector$onSubscription$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        ?? r10 = subscribedFlowCollector$onSubscription$1.label;
        try {
            if (r10 != 0) {
                if (r10 == 1) {
                    safeCollector = (SafeCollector) subscribedFlowCollector$onSubscription$1.L$1;
                    d10 = (D) subscribedFlowCollector$onSubscription$1.L$0;
                    kotlin.b.b(obj);
                } else {
                    if (r10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                }
                return p293xa.r.f47939a;
            }
            kotlin.b.b(obj);
            safeCollector = new SafeCollector(this.f43307b, subscribedFlowCollector$onSubscription$1.getContext());
            Ia.p<InterfaceC2687d<? super T>, kotlin.coroutines.c<? super p293xa.r>, Object> pVar = this.f43308c;
            subscribedFlowCollector$onSubscription$1.L$0 = this;
            subscribedFlowCollector$onSubscription$1.L$1 = safeCollector;
            subscribedFlowCollector$onSubscription$1.label = 1;
            if (pVar.invoke(safeCollector, subscribedFlowCollector$onSubscription$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            d10 = this;
            safeCollector.releaseIntercepted();
            InterfaceC2687d<T> interfaceC2687d = d10.f43307b;
            r10 = interfaceC2687d instanceof D;
            if (r10 == 0) {
                return p293xa.r.f47939a;
            }
            subscribedFlowCollector$onSubscription$1.L$0 = null;
            subscribedFlowCollector$onSubscription$1.L$1 = null;
            subscribedFlowCollector$onSubscription$1.label = 2;
            if (((D) interfaceC2687d).a(subscribedFlowCollector$onSubscription$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return p293xa.r.f47939a;
        } catch (Throwable th) {
            r10.releaseIntercepted();
            throw th;
        }
    }

    @Override // kotlinx.coroutines.flow.InterfaceC2687d
    public final Object emit(T t8, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return this.f43307b.emit(t8, cVar);
    }
}
