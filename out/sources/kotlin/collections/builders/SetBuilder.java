package kotlin.collections.builders;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.f;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: SetBuilder.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class SetBuilder<E> extends f<E> implements Set<E>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SetBuilder f43010b;
    private final MapBuilder<E, ?> backing;

    static {
        MapBuilder mapBuilder = MapBuilder.f43003b;
        f43010b = new SetBuilder(MapBuilder.f43003b);
    }

    public SetBuilder(MapBuilder<E, ?> backing) {
        i.e(backing, "backing");
        this.backing = backing;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.backing.w()) {
            return new SerializedCollection(1, this);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E e10) {
        return this.backing.h(e10) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> elements) {
        i.e(elements, "elements");
        this.backing.l();
        return super.addAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.backing.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.backing.containsKey(obj);
    }

    @Override // kotlin.collections.f
    public final int e() {
        return this.backing.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.backing.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        MapBuilder<E, ?> mapBuilder = this.backing;
        mapBuilder.getClass();
        return new MapBuilder.e(mapBuilder);
    }

    public final SetBuilder k() {
        this.backing.k();
        return this.backing.size() > 0 ? this : f43010b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        MapBuilder<E, ?> mapBuilder = this.backing;
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
        this.backing.l();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<? extends Object> elements) {
        i.e(elements, "elements");
        this.backing.l();
        return super.retainAll(elements);
    }

    public SetBuilder() {
        this(new MapBuilder());
    }
}
