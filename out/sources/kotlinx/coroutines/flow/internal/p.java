package kotlinx.coroutines.flow.internal;

/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class p<T> implements kotlin.coroutines.c<T>, Aa.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kotlin.coroutines.c<T> f43407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kotlin.coroutines.e f43408c;

    /* JADX WARN: Multi-variable type inference failed */
    public p(kotlin.coroutines.c<? super T> cVar, kotlin.coroutines.e eVar) {
        this.f43407b = cVar;
        this.f43408c = eVar;
    }

    @Override // Aa.b
    public final Aa.b getCallerFrame() {
        kotlin.coroutines.c<T> cVar = this.f43407b;
        if (cVar instanceof Aa.b) {
            return (Aa.b) cVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.c
    public final kotlin.coroutines.e getContext() {
        return this.f43408c;
    }

    @Override // kotlin.coroutines.c
    public final void resumeWith(Object obj) {
        this.f43407b.resumeWith(obj);
    }
}
