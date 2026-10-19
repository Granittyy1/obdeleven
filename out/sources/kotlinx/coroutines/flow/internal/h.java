package kotlinx.coroutines.flow.internal;

/* JADX INFO: compiled from: SafeCollector.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class h implements kotlin.coroutines.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f43397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.e f43398c;

    public h(kotlin.coroutines.e eVar, Throwable th) {
        this.f43397b = th;
        this.f43398c = eVar;
    }

    @Override // kotlin.coroutines.e
    public final <R> R fold(R r10, Ia.p<? super R, ? super kotlin.coroutines.e.a, ? extends R> pVar) {
        return (R) this.f43398c.fold(r10, pVar);
    }

    @Override // kotlin.coroutines.e
    public final <E extends kotlin.coroutines.e.a> E get(kotlin.coroutines.e.b<E> bVar) {
        return (E) this.f43398c.get(bVar);
    }

    @Override // kotlin.coroutines.e
    public final kotlin.coroutines.e minusKey(kotlin.coroutines.e.b<?> bVar) {
        return this.f43398c.minusKey(bVar);
    }

    @Override // kotlin.coroutines.e
    public final kotlin.coroutines.e plus(kotlin.coroutines.e eVar) {
        return this.f43398c.plus(eVar);
    }
}
