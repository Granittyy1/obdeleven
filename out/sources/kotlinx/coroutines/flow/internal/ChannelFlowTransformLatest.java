package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.B;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.InterfaceC2686c;
import kotlinx.coroutines.flow.InterfaceC2687d;
import p293xa.r;

/* JADX INFO: compiled from: Merge.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ChannelFlowTransformLatest<T, R> extends e<T, R> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SuspendLambda f43374f;

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowTransformLatest(Ia.q<? super InterfaceC2687d<? super R>, ? super T, ? super kotlin.coroutines.c<? super r>, ? extends Object> qVar, InterfaceC2686c<? extends T> interfaceC2686c, kotlin.coroutines.e eVar, int i10, BufferOverflow bufferOverflow) {
        super(i10, eVar, bufferOverflow, interfaceC2686c);
        this.f43374f = (SuspendLambda) qVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Ia.q, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlinx.coroutines.flow.internal.d
    public final d<R> i(kotlin.coroutines.e eVar, int i10, BufferOverflow bufferOverflow) {
        return new ChannelFlowTransformLatest(this.f43374f, this.f43396e, eVar, i10, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.e
    public final Object l(InterfaceC2687d<? super R> interfaceC2687d, kotlin.coroutines.c<? super r> cVar) {
        Object objD = B.d(new ChannelFlowTransformLatest$flowCollect$3(this, interfaceC2687d, null), cVar);
        return objD == CoroutineSingletons.f43038b ? objD : r.f47939a;
    }
}
