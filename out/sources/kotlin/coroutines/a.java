package kotlin.coroutines;

import Ia.p;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: CoroutineContextImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements e.a {
    private final e.b<?> key;

    public a(e.b<?> key) {
        i.e(key, "key");
        this.key = key;
    }

    @Override // kotlin.coroutines.e
    public <R> R fold(R r10, p<? super R, ? super e.a, ? extends R> pVar) {
        return (R) e.a.C0479a.a(this, r10, pVar);
    }

    @Override // kotlin.coroutines.e
    public <E extends e.a> E get(e.b<E> bVar) {
        return (E) e.a.C0479a.b(this, bVar);
    }

    @Override // kotlin.coroutines.e.a
    public e.b<?> getKey() {
        return this.key;
    }

    @Override // kotlin.coroutines.e
    public e minusKey(e.b<?> bVar) {
        return e.a.C0479a.c(this, bVar);
    }

    @Override // kotlin.coroutines.e
    public e plus(e eVar) {
        return e.a.C0479a.d(this, eVar);
    }
}
