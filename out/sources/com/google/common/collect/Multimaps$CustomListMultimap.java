package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes3.dex */
class Multimaps$CustomListMultimap<K, V> extends AbstractListMultimap<K, V> {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public transient com.google.common.base.j<? extends List<V>> f27938g;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        Objects.requireNonNull(object);
        this.f27938g = (com.google.common.base.j) object;
        Object object2 = objectInputStream.readObject();
        Objects.requireNonNull(object2);
        Map<K, Collection<V>> map = (Map) object2;
        this.f27819e = map;
        this.f27820f = 0;
        for (Collection<V> collection : map.values()) {
            A8.p.g(!collection.isEmpty());
            this.f27820f = collection.size() + this.f27820f;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f27938g);
        objectOutputStream.writeObject(this.f27819e);
    }

    @Override // com.google.common.collect.d
    public final Map<K, Collection<V>> c() {
        Map<K, Collection<V>> map = this.f27819e;
        if (map instanceof NavigableMap) {
            return new AbstractMapBasedMultimap.d(this, (NavigableMap) this.f27819e);
        }
        return map instanceof SortedMap ? new AbstractMapBasedMultimap.g(this, (SortedMap) this.f27819e) : new AbstractMapBasedMultimap.a(this, this.f27819e);
    }
}
