package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.InterfaceC2686c;
import kotlinx.coroutines.flow.InterfaceC2687d;
import p293xa.r;

/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class f<T> extends e<T, T> {
    @Override // kotlinx.coroutines.flow.internal.d
    public final d<T> i(kotlin.coroutines.e eVar, int i10, BufferOverflow bufferOverflow) {
        return new f(i10, eVar, bufferOverflow, this.f43396e);
    }

    @Override // kotlinx.coroutines.flow.internal.d
    public final InterfaceC2686c<T> j() {
        return (InterfaceC2686c<T>) this.f43396e;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlinx.coroutines.flow.internal.e
    public final Object l(InterfaceC2687d<? super T> interfaceC2687d, kotlin.coroutines.c<? super r> cVar) {
        Object objCollect = this.f43396e.collect((InterfaceC2687d<? super S>) interfaceC2687d, cVar);
        return objCollect == CoroutineSingletons.f43038b ? objCollect : r.f47939a;
    }
}
