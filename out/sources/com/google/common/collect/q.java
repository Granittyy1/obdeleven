package com.google.common.collect;

import com.braze.support.BrazeLogger;
import com.google.common.collect.AbstractMapBasedMultimap.a.C0278a;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: Maps.java */
/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: compiled from: Maps.java */
    public static abstract class a<K, V> extends z.c<Map.Entry<K, V>> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            AbstractMapBasedMultimap.a.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public abstract boolean contains(Object obj);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return AbstractMapBasedMultimap.a.this.isEmpty();
        }

        @Override // com.google.common.collect.z.c, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection<?> collection) {
            try {
                collection.getClass();
                return super.removeAll(collection);
            } catch (UnsupportedOperationException unused) {
                Iterator<?> it = collection.iterator();
                boolean zRemove = false;
                while (it.hasNext()) {
                    zRemove |= remove(it.next());
                }
                return zRemove;
            }
        }

        @Override // com.google.common.collect.z.c, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection<?> collection) {
            int iCeil;
            try {
                collection.getClass();
                return super.retainAll(collection);
            } catch (UnsupportedOperationException unused) {
                int size = collection.size();
                if (size < 3) {
                    P3.d.e(size, "expectedSize");
                    iCeil = size + 1;
                } else {
                    iCeil = size < 1073741824 ? (int) Math.ceil(((double) size) / 0.75d) : BrazeLogger.SUPPRESS;
                }
                HashSet hashSet = new HashSet(iCeil);
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        hashSet.add(((Map.Entry) obj).getKey());
                    }
                }
                return AbstractMapBasedMultimap.a.this.keySet().retainAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return AbstractMapBasedMultimap.a.this.f27821d.size();
        }
    }

    /* JADX INFO: compiled from: Maps.java */
    public static class b<K, V> extends z.c<K> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<K, V> f27986b;

        public b(Map<K, V> map) {
            map.getClass();
            this.f27986b = map;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return this.f27986b.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return this.f27986b.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.f27986b.size();
        }
    }

    /* JADX INFO: compiled from: Maps.java */
    public static class c<K, V> extends AbstractCollection<V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f27987b;

        public c(d dVar) {
            this.f27987b = dVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            ((AbstractMapBasedMultimap.a) this.f27987b).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return this.f27987b.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return this.f27987b.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new p(this.f27987b.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                d dVar = this.f27987b;
                for (Map.Entry<K, V> entry : dVar.entrySet()) {
                    if (kotlinx.coroutines.C.j(obj, entry.getValue())) {
                        ((AbstractMapBasedMultimap.a) dVar).remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            try {
                collection.getClass();
                return super.removeAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                d dVar = this.f27987b;
                for (Map.Entry<K, V> entry : dVar.entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSet.add(entry.getKey());
                    }
                }
                return dVar.keySet().removeAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            try {
                collection.getClass();
                return super.retainAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                d dVar = this.f27987b;
                for (Map.Entry<K, V> entry : dVar.entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSet.add(entry.getKey());
                    }
                }
                return dVar.keySet().retainAll(hashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return ((AbstractMapBasedMultimap.a) this.f27987b).f27821d.size();
        }
    }

    /* JADX INFO: compiled from: Maps.java */
    public static abstract class d<K, V> extends AbstractMap<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public transient AbstractMapBasedMultimap.a.C0278a f27988b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public transient c f27989c;

        @Override // java.util.AbstractMap, java.util.Map
        public final Set<Map.Entry<K, V>> entrySet() {
            AbstractMapBasedMultimap.a.C0278a c0278a = this.f27988b;
            if (c0278a != null) {
                return c0278a;
            }
            AbstractMapBasedMultimap.a.C0278a c0278a2 = ((AbstractMapBasedMultimap.a) this).new C0278a();
            this.f27988b = c0278a2;
            return c0278a2;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Collection<V> values() {
            c cVar = this.f27989c;
            if (cVar != null) {
                return cVar;
            }
            c cVar2 = new c(this);
            this.f27989c = cVar2;
            return cVar2;
        }
    }

    public static boolean a(Object obj, Map map) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }
}
