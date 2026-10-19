package E;

import java.util.Iterator;

/* JADX INFO: compiled from: PersistentHashMapBuilderContentViews.kt */
/* JADX INFO: loaded from: classes.dex */
public final class l<K, V> extends kotlin.collections.c<V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f<K, V> f2952b;

    public l(f<K, V> fVar) {
        this.f2952b = fVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f2952b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f2952b.containsValue(obj);
    }

    @Override // kotlin.collections.c
    public final int e() {
        f<K, V> fVar = this.f2952b;
        fVar.getClass();
        return fVar.f2944g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        u[] uVarArr = new u[8];
        for (int i10 = 0; i10 < 8; i10++) {
            uVarArr[i10] = new y();
        }
        return new m(this.f2952b, uVarArr);
    }
}
