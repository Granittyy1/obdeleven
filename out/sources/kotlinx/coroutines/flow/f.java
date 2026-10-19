package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements InterfaceC2686c<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f43370b;

    public f(Object obj) {
        this.f43370b = obj;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC2686c
    public final Object collect(InterfaceC2687d<? super Object> interfaceC2687d, kotlin.coroutines.c<? super p293xa.r> cVar) {
        Object objEmit = interfaceC2687d.emit(this.f43370b, cVar);
        return objEmit == CoroutineSingletons.f43038b ? objEmit : p293xa.r.f47939a;
    }
}
