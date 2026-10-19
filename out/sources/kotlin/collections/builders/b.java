package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.f;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: MapBuilder.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class b<E> extends f<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MapBuilder<E, ?> f43012b;

    public b(MapBuilder<E, ?> backing) {
        i.e(backing, "backing");
        this.f43012b = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> elements) {
        i.e(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f43012b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f43012b.containsKey(obj);
    }

    @Override // kotlin.collections.f
    public final int e() {
        return this.f43012b.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f43012b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        MapBuilder<E, ?> mapBuilder = this.f43012b;
        mapBuilder.getClass();
        return new MapBuilder.e(mapBuilder);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        MapBuilder<E, ?> mapBuilder = this.f43012b;
        mapBuilder.l();
        int iR = mapBuilder.r(obj);
        if (iR < 0) {
            return false;
        }
        mapBuilder.z(iR);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<? extends Object> elements) {
        i.e(elements, "elements");
        this.f43012b.l();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<? extends Object> elements) {
        i.e(elements, "elements");
        this.f43012b.l();
        return super.retainAll(elements);
    }
}
