package E;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PersistentHashMapBuilderContentViews.kt */
/* JADX INFO: loaded from: classes.dex */
public final class h<K, V> extends a<Map.Entry<K, V>, K, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f<K, V> f2949b;

    public h(f<K, V> fVar) {
        this.f2949b = fVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f2949b.clear();
    }

    @Override // kotlin.collections.f
    public final int e() {
        f<K, V> fVar = this.f2949b;
        fVar.getClass();
        return fVar.f2944g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new i(this.f2949b);
    }
}
