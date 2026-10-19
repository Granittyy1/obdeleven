package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.InterfaceC2686c;
import kotlinx.coroutines.flow.InterfaceC2687d;
import kotlinx.coroutines.internal.ThreadContextKt;
import p293xa.r;

/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e<S, T> extends d<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC2686c<S> f43396e;

    public e(int i10, kotlin.coroutines.e eVar, BufferOverflow bufferOverflow, InterfaceC2686c interfaceC2686c) {
        super(eVar, i10, bufferOverflow);
        this.f43396e = interfaceC2686c;
    }

    @Override // kotlinx.coroutines.flow.internal.d, kotlinx.coroutines.flow.InterfaceC2686c
    public final Object collect(InterfaceC2687d<? super T> interfaceC2687d, kotlin.coroutines.c<? super r> cVar) {
        if (this.f43394c == -3) {
            kotlin.coroutines.e context = cVar.getContext();
            kotlin.coroutines.e eVarB = CoroutineContextKt.b(context, this.f43393b);
            if (kotlin.jvm.internal.i.a(eVarB, context)) {
                Object objL = l(interfaceC2687d, cVar);
                return objL == CoroutineSingletons.f43038b ? objL : r.f47939a;
            }
            kotlin.coroutines.d.a aVar = kotlin.coroutines.d.a.f43035b;
            if (kotlin.jvm.internal.i.a(eVarB.get(aVar), context.get(aVar))) {
                kotlin.coroutines.e context2 = cVar.getContext();
                if (!(interfaceC2687d instanceof o ? true : interfaceC2687d instanceof m)) {
                    interfaceC2687d = new UndispatchedContextCollector(interfaceC2687d, context2);
                }
                Object objE = O.e.E(eVarB, interfaceC2687d, ThreadContextKt.b(eVarB), new ChannelFlowOperator$collectWithContextUndispatched$2(this, null), cVar);
                return objE == CoroutineSingletons.f43038b ? objE : r.f47939a;
            }
        }
        Object objCollect = super.collect(interfaceC2687d, cVar);
        return objCollect == CoroutineSingletons.f43038b ? objCollect : r.f47939a;
    }

    @Override // kotlinx.coroutines.flow.internal.d
    public final Object g(kotlinx.coroutines.channels.n<? super T> nVar, kotlin.coroutines.c<? super r> cVar) {
        Object objL = l(new o(nVar), cVar);
        return objL == CoroutineSingletons.f43038b ? objL : r.f47939a;
    }

    public abstract Object l(InterfaceC2687d<? super T> interfaceC2687d, kotlin.coroutines.c<? super r> cVar);

    @Override // kotlinx.coroutines.flow.internal.d
    public final String toString() {
        return this.f43396e + " -> " + super.toString();
    }
}
