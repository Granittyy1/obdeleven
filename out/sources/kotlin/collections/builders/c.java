package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: MapBuilder.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class c<V> extends kotlin.collections.c<V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MapBuilder<?, V> f43013b;

    public c(MapBuilder<?, V> backing) {
        i.e(backing, "backing");
        this.f43013b = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends V> elements) {
        i.e(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f43013b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f43013b.containsValue(obj);
    }

    @Override // kotlin.collections.c
    public final int e() {
        return this.f43013b.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f43013b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        MapBuilder<?, V> mapBuilder = this.f43013b;
        mapBuilder.getClass();
        return new MapBuilder.f(mapBuilder);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        MapBuilder<?, V> mapBuilder = this.f43013b;
        mapBuilder.l();
        int iU = mapBuilder.u(obj);
        if (iU < 0) {
            return false;
        }
        mapBuilder.z(iU);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> elements) {
        i.e(elements, "elements");
        this.f43013b.l();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> elements) {
        i.e(elements, "elements");
        this.f43013b.l();
        return super.retainAll(elements);
    }
}
