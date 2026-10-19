package androidx.paging;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C2693i;
import kotlinx.coroutines.InterfaceC2691h;
import kotlinx.coroutines.InterfaceC2694i0;

/* JADX INFO: compiled from: SimpleChannelFlow.kt */
/* JADX INFO: loaded from: classes.dex */
public final class D<T> implements C<T>, kotlinx.coroutines.A, kotlinx.coroutines.channels.q<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kotlinx.coroutines.channels.q<T> f19228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.A f19229c;

    /* JADX WARN: Multi-variable type inference failed */
    public D(kotlinx.coroutines.A scope, kotlinx.coroutines.channels.q<? super T> channel) {
        kotlin.jvm.internal.i.e(scope, "scope");
        kotlin.jvm.internal.i.e(channel, "channel");
        this.f19228b = channel;
        this.f19229c = scope;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.paging.C
    public final Object N(PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1.AnonymousClass3 anonymousClass3, ContinuationImpl continuationImpl) {
        SimpleProducerScopeImpl$awaitClose$1 simpleProducerScopeImpl$awaitClose$1;
        Ia.a aVar;
        if (continuationImpl instanceof SimpleProducerScopeImpl$awaitClose$1) {
            simpleProducerScopeImpl$awaitClose$1 = (SimpleProducerScopeImpl$awaitClose$1) continuationImpl;
            int i10 = simpleProducerScopeImpl$awaitClose$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                simpleProducerScopeImpl$awaitClose$1.label = i10 - Integer.MIN_VALUE;
            } else {
                simpleProducerScopeImpl$awaitClose$1 = new SimpleProducerScopeImpl$awaitClose$1(this, continuationImpl);
            }
        } else {
            simpleProducerScopeImpl$awaitClose$1 = new SimpleProducerScopeImpl$awaitClose$1(this, continuationImpl);
        }
        Object obj = simpleProducerScopeImpl$awaitClose$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = simpleProducerScopeImpl$awaitClose$1.label;
        try {
            if (i11 == 0) {
                kotlin.b.b(obj);
                kotlin.coroutines.e.a aVar2 = this.f19229c.getCoroutineContext().get(InterfaceC2694i0.b.f43449b);
                if (aVar2 == null) {
                    throw new IllegalStateException("Internal error, context should have a job.");
                }
                InterfaceC2694i0 interfaceC2694i0 = (InterfaceC2694i0) aVar2;
                simpleProducerScopeImpl$awaitClose$1.L$0 = anonymousClass3;
                simpleProducerScopeImpl$awaitClose$1.L$1 = interfaceC2694i0;
                simpleProducerScopeImpl$awaitClose$1.label = 1;
                final C2693i c2693i = new C2693i(1, A8.p.y(simpleProducerScopeImpl$awaitClose$1));
                c2693i.s();
                interfaceC2694i0.B(new Ia.l<Throwable, p293xa.r>() { // from class: androidx.paging.SimpleProducerScopeImpl$awaitClose$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(Throwable th) {
                        InterfaceC2691h<p293xa.r> interfaceC2691h = c2693i;
                        p293xa.r rVar = p293xa.r.f47939a;
                        interfaceC2691h.resumeWith(rVar);
                        return rVar;
                    }
                });
                if (c2693i.p() == coroutineSingletons) {
                    aVar = anonymousClass3;
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Ia.a aVar3 = (Ia.a) simpleProducerScopeImpl$awaitClose$1.L$0;
                kotlin.b.b(obj);
                aVar = aVar3;
            }
            aVar = anonymousClass3;
            aVar.invoke();
            return p293xa.r.f47939a;
        } catch (Throwable th) {
            anonymousClass3.invoke();
            throw th;
        }
    }

    @Override // kotlinx.coroutines.channels.q
    public final boolean a(Throwable th) {
        return this.f19228b.a(th);
    }

    @Override // kotlinx.coroutines.A
    public final kotlin.coroutines.e getCoroutineContext() {
        return this.f19229c.getCoroutineContext();
    }

    @Override // kotlinx.coroutines.channels.q
    public final Object n(T t8) {
        return this.f19228b.n(t8);
    }

    @Override // kotlinx.coroutines.channels.q
    public final Object t(T t8, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return this.f19228b.t(t8, cVar);
    }
}
