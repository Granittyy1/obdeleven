package kotlinx.coroutines.flow.internal;

import java.util.Iterator;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.InterfaceC2686c;
import p293xa.r;

/* JADX INFO: compiled from: Merge.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ChannelLimitedFlowMerge<T> extends d<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f43379e;

    public ChannelLimitedFlowMerge(Iterable<? extends InterfaceC2686c<? extends T>> iterable, kotlin.coroutines.e eVar, int i10, BufferOverflow bufferOverflow) {
        super(eVar, i10, bufferOverflow);
        this.f43379e = iterable;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Iterable, java.lang.Object] */
    @Override // kotlinx.coroutines.flow.internal.d
    public final Object g(kotlinx.coroutines.channels.n<? super T> nVar, kotlin.coroutines.c<? super r> cVar) {
        o oVar = new o(nVar);
        Iterator it = this.f43379e.iterator();
        while (it.hasNext()) {
            C2680e.c(nVar, null, null, new ChannelLimitedFlowMerge$collectTo$2$1((InterfaceC2686c) it.next(), oVar, null), 3);
        }
        return r.f47939a;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Iterable, java.lang.Object] */
    @Override // kotlinx.coroutines.flow.internal.d
    public final d<T> i(kotlin.coroutines.e eVar, int i10, BufferOverflow bufferOverflow) {
        return new ChannelLimitedFlowMerge(this.f43379e, eVar, i10, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.d
    public final kotlinx.coroutines.channels.p<T> k(A a10) {
        Ia.p channelFlow$collectToFun$1 = new ChannelFlow$collectToFun$1(this, null);
        BufferOverflow bufferOverflow = BufferOverflow.f43243b;
        CoroutineStart coroutineStart = CoroutineStart.f43166b;
        kotlinx.coroutines.channels.m mVar = new kotlinx.coroutines.channels.m(CoroutineContextKt.c(a10, this.f43393b), kotlinx.coroutines.channels.g.a(this.f43394c, 4, bufferOverflow), true, true);
        mVar.v0(coroutineStart, mVar, channelFlow$collectToFun$1);
        return mVar;
    }
}
