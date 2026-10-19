package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: AbstractMultimap.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d<K, V> implements r<K, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient Set<K> f27965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient Collection<V> f27966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient Map<K, Collection<V>> f27967d;

    /* JADX INFO: compiled from: AbstractMultimap.java */
    public class a extends AbstractCollection<V> {
        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            d.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            Iterator<Collection<V>> it = d.this.b().values().iterator();
            while (it.hasNext()) {
                if (it.next().contains(obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new C2036b();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return ((AbstractMapBasedMultimap) d.this).f27820f;
        }
    }

    public abstract Map<K, Collection<V>> c();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            return b().equals(((r) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        return b().toString();
    }
}
