package androidx.paging;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.InterfaceC2687d;

/* JADX INFO: renamed from: androidx.paging.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: FlowExt.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1427c<T> implements InterfaceC2687d<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kotlinx.coroutines.channels.q<T> f19330b;

    /* JADX WARN: Multi-variable type inference failed */
    public C1427c(kotlinx.coroutines.channels.q<? super T> channel) {
        kotlin.jvm.internal.i.e(channel, "channel");
        this.f19330b = channel;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC2687d
    public final Object emit(T t8, kotlin.coroutines.c<? super p293xa.r> cVar) {
        Object objT = this.f19330b.t(t8, cVar);
        return objT == CoroutineSingletons.f43038b ? objT : p293xa.r.f47939a;
    }
}
