package kotlinx.coroutines.flow;

import java.util.List;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.z0;

/* JADX INFO: compiled from: Share.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class r<T> implements u<T>, InterfaceC2686c, kotlinx.coroutines.flow.internal.k<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f43417b;

    public r(p pVar, z0 z0Var) {
        this.f43417b = pVar;
    }

    @Override // kotlinx.coroutines.flow.u
    public final List<T> a() {
        return this.f43417b.a();
    }

    @Override // kotlinx.coroutines.flow.internal.k
    public final InterfaceC2686c<T> b(kotlin.coroutines.e eVar, int i10, BufferOverflow bufferOverflow) {
        return w.d(this, eVar, i10, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.InterfaceC2686c
    public final Object collect(InterfaceC2687d<? super T> interfaceC2687d, kotlin.coroutines.c<?> cVar) {
        return this.f43417b.collect(interfaceC2687d, cVar);
    }
}
