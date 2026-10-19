package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.InterfaceC2687d;
import p293xa.r;

/* JADX INFO: compiled from: SendingCollector.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class o<T> implements InterfaceC2687d<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kotlinx.coroutines.channels.n f43406b;

    public o(kotlinx.coroutines.channels.n nVar) {
        this.f43406b = nVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC2687d
    public final Object emit(T t8, kotlin.coroutines.c<? super r> cVar) {
        Object objT = this.f43406b.t(t8, cVar);
        return objT == CoroutineSingletons.f43038b ? objT : r.f47939a;
    }
}
