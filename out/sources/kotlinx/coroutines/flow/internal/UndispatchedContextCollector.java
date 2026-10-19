package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.InterfaceC2687d;
import kotlinx.coroutines.internal.ThreadContextKt;
import p293xa.r;

/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class UndispatchedContextCollector<T> implements InterfaceC2687d<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kotlin.coroutines.e f43385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f43386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ia.p<T, kotlin.coroutines.c<? super r>, Object> f43387d;

    public UndispatchedContextCollector(InterfaceC2687d<? super T> interfaceC2687d, kotlin.coroutines.e eVar) {
        this.f43385b = eVar;
        this.f43386c = ThreadContextKt.b(eVar);
        this.f43387d = new UndispatchedContextCollector$emitRef$1(interfaceC2687d, null);
    }

    @Override // kotlinx.coroutines.flow.InterfaceC2687d
    public final Object emit(T t8, kotlin.coroutines.c<? super r> cVar) {
        Object objE = O.e.E(this.f43385b, t8, this.f43386c, this.f43387d, cVar);
        return objE == CoroutineSingletons.f43038b ? objE : r.f47939a;
    }
}
