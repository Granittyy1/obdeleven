package E;

import java.util.Iterator;

/* JADX INFO: compiled from: PersistentHashMapContentViews.kt */
/* JADX INFO: loaded from: classes.dex */
public final class p<K, V> extends kotlin.collections.g<K> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d<K, V> f2954b;

    public p(d<K, V> dVar) {
        this.f2954b = dVar;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f2954b.containsKey(obj);
    }

    @Override // kotlin.collections.AbstractCollection
    public final int e() {
        d<K, V> dVar = this.f2954b;
        dVar.getClass();
        return dVar.f2935c;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<K> iterator() {
        t<K, V> tVar = this.f2954b.f2934b;
        u[] uVarArr = new u[8];
        for (int i10 = 0; i10 < 8; i10++) {
            uVarArr[i10] = new w();
        }
        return new q(tVar, uVarArr);
    }
}
