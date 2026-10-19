package com.google.common.collect;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractMapBasedMultimap<K, V> extends com.google.common.collect.d<K, V> implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient Map<K, Collection<V>> f27819e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient int f27820f;

    public class a extends q.d<K, Collection<V>> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final transient Map<K, Collection<V>> f27821d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Multimaps$CustomListMultimap f27822e;

        /* JADX INFO: renamed from: com.google.common.collect.AbstractMapBasedMultimap$a$a, reason: collision with other inner class name */
        public class C0278a extends q.a<K, Collection<V>> {
            public C0278a() {
            }

            @Override // com.google.common.collect.q.a, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                Set<Map.Entry<K, Collection<V>>> setEntrySet = a.this.f27821d.entrySet();
                setEntrySet.getClass();
                try {
                    return setEntrySet.contains(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return a.this.new b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(Object obj) {
                Collection<V> collectionRemove;
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                Multimaps$CustomListMultimap multimaps$CustomListMultimap = a.this.f27822e;
                Object key = entry.getKey();
                Map<K, Collection<V>> map = multimaps$CustomListMultimap.f27819e;
                map.getClass();
                try {
                    collectionRemove = map.remove(key);
                } catch (ClassCastException | NullPointerException unused) {
                    collectionRemove = null;
                }
                Collection<V> collection = collectionRemove;
                if (collection == null) {
                    return true;
                }
                int size = collection.size();
                collection.clear();
                multimaps$CustomListMultimap.f27820f -= size;
                return true;
            }
        }

        public class b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Iterator<Map.Entry<K, Collection<V>>> f27824b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public Collection<V> f27825c;

            public b() {
                this.f27824b = a.this.f27821d.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.f27824b.hasNext();
            }

            @Override // java.util.Iterator
            public final Object next() {
                Map.Entry<K, Collection<V>> next = this.f27824b.next();
                this.f27825c = next.getValue();
                return a.this.a(next);
            }

            @Override // java.util.Iterator
            public final void remove() {
                A8.p.p("no calls to next() since the last call to remove()", this.f27825c != null);
                this.f27824b.remove();
                a.this.f27822e.f27820f -= this.f27825c.size();
                this.f27825c.clear();
                this.f27825c = null;
            }
        }

        public a(Multimaps$CustomListMultimap multimaps$CustomListMultimap, Map map) {
            this.f27822e = multimaps$CustomListMultimap;
            this.f27821d = map;
        }

        public final Map.Entry<K, Collection<V>> a(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            Collection<V> value = entry.getValue();
            Multimaps$CustomListMultimap multimaps$CustomListMultimap = this.f27822e;
            List list = (List) value;
            return new ImmutableEntry(key, list instanceof RandomAccess ? new f(key, list, null) : new j(key, list, null));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final void clear() {
            Multimaps$CustomListMultimap multimaps$CustomListMultimap = this.f27822e;
            if (this.f27821d == multimaps$CustomListMultimap.f27819e) {
                multimaps$CustomListMultimap.clear();
                return;
            }
            b bVar = new b();
            while (bVar.hasNext()) {
                bVar.next();
                bVar.remove();
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            Map<K, Collection<V>> map = this.f27821d;
            map.getClass();
            try {
                return map.containsKey(obj);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean equals(Object obj) {
            return this == obj || this.f27821d.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            Collection<V> collection;
            Map<K, Collection<V>> map = this.f27821d;
            map.getClass();
            try {
                collection = map.get(obj);
            } catch (ClassCastException | NullPointerException unused) {
                collection = null;
            }
            Collection<V> collection2 = collection;
            if (collection2 == null) {
                return null;
            }
            Multimaps$CustomListMultimap multimaps$CustomListMultimap = this.f27822e;
            List list = (List) collection2;
            return list instanceof RandomAccess ? new f(obj, list, null) : new j(obj, list, null);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int hashCode() {
            return this.f27821d.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            Multimaps$CustomListMultimap multimaps$CustomListMultimap = this.f27822e;
            Set<K> hVar = multimaps$CustomListMultimap.f27965b;
            if (hVar == null) {
                Map<K, Collection<V>> map = multimaps$CustomListMultimap.f27819e;
                if (map instanceof NavigableMap) {
                    hVar = new e(multimaps$CustomListMultimap, (NavigableMap) multimaps$CustomListMultimap.f27819e);
                } else {
                    hVar = map instanceof SortedMap ? new h(multimaps$CustomListMultimap, (SortedMap) multimaps$CustomListMultimap.f27819e) : new c(multimaps$CustomListMultimap, multimaps$CustomListMultimap.f27819e);
                }
                multimaps$CustomListMultimap.f27965b = hVar;
            }
            return hVar;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object remove(Object obj) {
            Collection<V> collectionRemove = this.f27821d.remove(obj);
            if (collectionRemove == null) {
                return null;
            }
            Multimaps$CustomListMultimap multimaps$CustomListMultimap = this.f27822e;
            List<V> list = multimaps$CustomListMultimap.f27938g.get();
            list.addAll(collectionRemove);
            multimaps$CustomListMultimap.f27820f -= collectionRemove.size();
            collectionRemove.clear();
            return list;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return this.f27821d.size();
        }

        @Override // java.util.AbstractMap
        public final String toString() {
            return this.f27821d.toString();
        }
    }

    public abstract class b<T> implements Iterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Iterator<Map.Entry<K, Collection<V>>> f27827b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public K f27828c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Collection<V> f27829d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Iterator<V> f27830e = Iterators.EmptyModifiableIterator.f27889b;

        public b() {
            this.f27827b = AbstractMapBasedMultimap.this.f27819e.entrySet().iterator();
        }

        public abstract T a(K k10, V v10);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f27827b.hasNext() || this.f27830e.hasNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!this.f27830e.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f27827b.next();
                this.f27828c = next.getKey();
                Collection<V> value = next.getValue();
                this.f27829d = value;
                this.f27830e = value.iterator();
            }
            return this.f27830e.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f27830e.remove();
            Collection<V> collection = this.f27829d;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f27827b.remove();
            }
            AbstractMapBasedMultimap.this.f27820f--;
        }
    }

    public class c extends q.b<K, Collection<V>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Multimaps$CustomListMultimap f27832c;

        public class a implements Iterator<K> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Map.Entry<K, Collection<V>> f27833b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Iterator f27834c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ c f27835d;

            public a(c cVar, Iterator it) {
                this.f27834c = it;
                this.f27835d = cVar;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.f27834c.hasNext();
            }

            @Override // java.util.Iterator
            public final K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f27834c.next();
                this.f27833b = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public final void remove() {
                A8.p.p("no calls to next() since the last call to remove()", this.f27833b != null);
                Collection<V> value = this.f27833b.getValue();
                this.f27834c.remove();
                this.f27835d.f27832c.f27820f -= value.size();
                value.clear();
                this.f27833b = null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Multimaps$CustomListMultimap multimaps$CustomListMultimap, Map map) {
            super(map);
            this.f27832c = multimaps$CustomListMultimap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            Iterator<K> it = iterator();
            while (true) {
                a aVar = (a) it;
                if (!aVar.hasNext()) {
                    return;
                }
                aVar.next();
                aVar.remove();
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean containsAll(Collection<?> collection) {
            return this.f27986b.keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            return this == obj || this.f27986b.keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final int hashCode() {
            return this.f27986b.keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new a(this, this.f27986b.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            int size;
            Collection collection = (Collection) this.f27986b.remove(obj);
            if (collection != null) {
                size = collection.size();
                collection.clear();
                this.f27832c.f27820f -= size;
            } else {
                size = 0;
            }
            return size > 0;
        }
    }

    public final class d extends AbstractMapBasedMultimap<K, V>.g implements NavigableMap<K, Collection<V>> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Multimaps$CustomListMultimap f27836h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Multimaps$CustomListMultimap multimaps$CustomListMultimap, NavigableMap navigableMap) {
            super(multimaps$CustomListMultimap, navigableMap);
            this.f27836h = multimaps$CustomListMultimap;
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.g
        public final SortedSet b() {
            return new e(this.f27836h, e());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.g
        /* JADX INFO: renamed from: c */
        public final SortedSet keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> ceilingEntry(K k10) {
            Map.Entry<K, Collection<V>> entryCeilingEntry = e().ceilingEntry(k10);
            if (entryCeilingEntry == null) {
                return null;
            }
            return a(entryCeilingEntry);
        }

        @Override // java.util.NavigableMap
        public final K ceilingKey(K k10) {
            return e().ceilingKey(k10);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet<K> descendingKeySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> descendingMap() {
            return new d(this.f27836h, e().descendingMap());
        }

        public final Map.Entry<K, Collection<V>> f(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<K, Collection<V>> next = it.next();
            List<V> list = this.f27836h.f27938g.get();
            list.addAll(next.getValue());
            it.remove();
            return new ImmutableEntry(next.getKey(), Collections.unmodifiableList(list));
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> entryFirstEntry = e().firstEntry();
            if (entryFirstEntry == null) {
                return null;
            }
            return a(entryFirstEntry);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> floorEntry(K k10) {
            Map.Entry<K, Collection<V>> entryFloorEntry = e().floorEntry(k10);
            if (entryFloorEntry == null) {
                return null;
            }
            return a(entryFloorEntry);
        }

        @Override // java.util.NavigableMap
        public final K floorKey(K k10) {
            return e().floorKey(k10);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.g
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public final NavigableMap<K, Collection<V>> e() {
            return (NavigableMap) ((SortedMap) this.f27821d);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.g, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> higherEntry(K k10) {
            Map.Entry<K, Collection<V>> entryHigherEntry = e().higherEntry(k10);
            if (entryHigherEntry == null) {
                return null;
            }
            return a(entryHigherEntry);
        }

        @Override // java.util.NavigableMap
        public final K higherKey(K k10) {
            return e().higherKey(k10);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.g, com.google.common.collect.AbstractMapBasedMultimap.a, java.util.AbstractMap, java.util.Map
        public final Set keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> entryLastEntry = e().lastEntry();
            if (entryLastEntry == null) {
                return null;
            }
            return a(entryLastEntry);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> lowerEntry(K k10) {
            Map.Entry<K, Collection<V>> entryLowerEntry = e().lowerEntry(k10);
            if (entryLowerEntry == null) {
                return null;
            }
            return a(entryLowerEntry);
        }

        @Override // java.util.NavigableMap
        public final K lowerKey(K k10) {
            return e().lowerKey(k10);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet<K> navigableKeySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> pollFirstEntry() {
            return f(((a.C0278a) entrySet()).iterator());
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> pollLastEntry() {
            return f(((a.C0278a) ((q.d) descendingMap()).entrySet()).iterator());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.g, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.g, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> headMap(K k10, boolean z10) {
            return new d(this.f27836h, e().headMap(k10, z10));
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> subMap(K k10, boolean z10, K k11, boolean z11) {
            return new d(this.f27836h, e().subMap(k10, z10, k11, z11));
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> tailMap(K k10, boolean z10) {
            return new d(this.f27836h, e().tailMap(k10, z10));
        }
    }

    public final class e extends AbstractMapBasedMultimap<K, V>.h implements NavigableSet<K> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Multimaps$CustomListMultimap f27837e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Multimaps$CustomListMultimap multimaps$CustomListMultimap, NavigableMap navigableMap) {
            super(multimaps$CustomListMultimap, navigableMap);
            this.f27837e = multimaps$CustomListMultimap;
        }

        @Override // java.util.NavigableSet
        public final K ceiling(K k10) {
            return d().ceilingKey(k10);
        }

        @Override // java.util.NavigableSet
        public final Iterator<K> descendingIterator() {
            return ((c) descendingSet()).iterator();
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> descendingSet() {
            return new e(this.f27837e, d().descendingMap());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.h
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final NavigableMap<K, Collection<V>> d() {
            return (NavigableMap) ((SortedMap) this.f27986b);
        }

        @Override // java.util.NavigableSet
        public final K floor(K k10) {
            return d().floorKey(k10);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.h, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet headSet(Object obj) {
            return headSet(obj, false);
        }

        @Override // java.util.NavigableSet
        public final K higher(K k10) {
            return d().higherKey(k10);
        }

        @Override // java.util.NavigableSet
        public final K lower(K k10) {
            return d().lowerKey(k10);
        }

        @Override // java.util.NavigableSet
        public final K pollFirst() {
            c.a aVar = (c.a) iterator();
            if (!aVar.hasNext()) {
                return null;
            }
            K k10 = (K) aVar.next();
            aVar.remove();
            return k10;
        }

        @Override // java.util.NavigableSet
        public final K pollLast() {
            Iterator<K> itDescendingIterator = descendingIterator();
            if (!itDescendingIterator.hasNext()) {
                return null;
            }
            K next = itDescendingIterator.next();
            itDescendingIterator.remove();
            return next;
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.h, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.h, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet tailSet(Object obj) {
            return tailSet(obj, true);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> headSet(K k10, boolean z10) {
            return new e(this.f27837e, d().headMap(k10, z10));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> subSet(K k10, boolean z10, K k11, boolean z11) {
            return new e(this.f27837e, d().subMap(k10, z10, k11, z11));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> tailSet(K k10, boolean z10) {
            return new e(this.f27837e, d().tailMap(k10, z10));
        }
    }

    public class f extends AbstractMapBasedMultimap<K, V>.j implements RandomAccess {
    }

    public class g extends AbstractMapBasedMultimap<K, V>.a implements SortedMap<K, Collection<V>> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public SortedSet<K> f27838f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Multimaps$CustomListMultimap f27839g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Multimaps$CustomListMultimap multimaps$CustomListMultimap, SortedMap sortedMap) {
            super(multimaps$CustomListMultimap, sortedMap);
            this.f27839g = multimaps$CustomListMultimap;
        }

        public SortedSet<K> b() {
            return new h(this.f27839g, e());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.a, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f27838f;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> sortedSetB = b();
            this.f27838f = sortedSetB;
            return sortedSetB;
        }

        @Override // java.util.SortedMap
        public final Comparator<? super K> comparator() {
            return e().comparator();
        }

        public SortedMap<K, Collection<V>> e() {
            return (SortedMap) this.f27821d;
        }

        @Override // java.util.SortedMap
        public final K firstKey() {
            return e().firstKey();
        }

        public SortedMap<K, Collection<V>> headMap(K k10) {
            return new g(this.f27839g, e().headMap(k10));
        }

        @Override // java.util.SortedMap
        public final K lastKey() {
            return e().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k10, K k11) {
            return new g(this.f27839g, e().subMap(k10, k11));
        }

        public SortedMap<K, Collection<V>> tailMap(K k10) {
            return new g(this.f27839g, e().tailMap(k10));
        }
    }

    public class h extends AbstractMapBasedMultimap<K, V>.c implements SortedSet<K> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Multimaps$CustomListMultimap f27840d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Multimaps$CustomListMultimap multimaps$CustomListMultimap, SortedMap sortedMap) {
            super(multimaps$CustomListMultimap, sortedMap);
            this.f27840d = multimaps$CustomListMultimap;
        }

        @Override // java.util.SortedSet
        public final Comparator<? super K> comparator() {
            return d().comparator();
        }

        public SortedMap<K, Collection<V>> d() {
            return (SortedMap) this.f27986b;
        }

        @Override // java.util.SortedSet
        public final K first() {
            return d().firstKey();
        }

        public SortedSet<K> headSet(K k10) {
            return new h(this.f27840d, d().headMap(k10));
        }

        @Override // java.util.SortedSet
        public final K last() {
            return d().lastKey();
        }

        public SortedSet<K> subSet(K k10, K k11) {
            return new h(this.f27840d, d().subMap(k10, k11));
        }

        public SortedSet<K> tailSet(K k10) {
            return new h(this.f27840d, d().tailMap(k10));
        }
    }

    @Override // com.google.common.collect.r
    public final void clear() {
        Iterator<Collection<V>> it = this.f27819e.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.f27819e.clear();
        this.f27820f = 0;
    }

    @Override // com.google.common.collect.r
    public final Collection<V> values() {
        Collection<V> collection = this.f27966c;
        if (collection != null) {
            return collection;
        }
        com.google.common.collect.d.a aVar = new com.google.common.collect.d.a();
        this.f27966c = aVar;
        return aVar;
    }

    public class j extends AbstractMapBasedMultimap<K, V>.i implements List<V> {

        public class a extends AbstractMapBasedMultimap<K, V>.i.a implements ListIterator<V> {
            public a() {
                super();
            }

            @Override // java.util.ListIterator
            public final void add(V v10) {
                j jVar = j.this;
                boolean zIsEmpty = jVar.isEmpty();
                b().add(v10);
                AbstractMapBasedMultimap.this.f27820f++;
                if (zIsEmpty) {
                    jVar.d();
                }
            }

            public final ListIterator<V> b() {
                a();
                return (ListIterator) this.f27846b;
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return b().hasPrevious();
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return b().nextIndex();
            }

            @Override // java.util.ListIterator
            public final V previous() {
                return b().previous();
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return b().previousIndex();
            }

            @Override // java.util.ListIterator
            public final void set(V v10) {
                b().set(v10);
            }

            public a(int i10) {
                super(j.this, ((List) j.this.f27842c).listIterator(i10));
            }
        }

        public j(K k10, List<V> list, AbstractMapBasedMultimap<K, V>.i iVar) {
            super(k10, list, iVar);
        }

        @Override // java.util.List
        public final void add(int i10, V v10) {
            e();
            boolean zIsEmpty = this.f27842c.isEmpty();
            ((List) this.f27842c).add(i10, v10);
            AbstractMapBasedMultimap.this.f27820f++;
            if (zIsEmpty) {
                d();
            }
        }

        @Override // java.util.List
        public final boolean addAll(int i10, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = ((List) this.f27842c).addAll(i10, collection);
            if (zAddAll) {
                AbstractMapBasedMultimap.this.f27820f += this.f27842c.size() - size;
                if (size == 0) {
                    d();
                }
            }
            return zAddAll;
        }

        @Override // java.util.List
        public final V get(int i10) {
            e();
            return (V) ((List) this.f27842c).get(i10);
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            e();
            return ((List) this.f27842c).indexOf(obj);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            e();
            return ((List) this.f27842c).lastIndexOf(obj);
        }

        @Override // java.util.List
        public final ListIterator<V> listIterator() {
            e();
            return new a();
        }

        @Override // java.util.List
        public final V remove(int i10) {
            e();
            V v10 = (V) ((List) this.f27842c).remove(i10);
            AbstractMapBasedMultimap.this.f27820f--;
            g();
            return v10;
        }

        @Override // java.util.List
        public final V set(int i10, V v10) {
            e();
            return (V) ((List) this.f27842c).set(i10, v10);
        }

        @Override // java.util.List
        public final List<V> subList(int i10, int i11) {
            e();
            List listSubList = ((List) this.f27842c).subList(i10, i11);
            AbstractMapBasedMultimap<K, V>.i iVar = this.f27843d;
            if (iVar == null) {
                iVar = this;
            }
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            abstractMapBasedMultimap.getClass();
            boolean z10 = listSubList instanceof RandomAccess;
            K k10 = this.f27841b;
            return z10 ? new f(k10, listSubList, iVar) : new j(k10, listSubList, iVar);
        }

        @Override // java.util.List
        public final ListIterator<V> listIterator(int i10) {
            e();
            return new a(i10);
        }
    }

    public class i extends AbstractCollection<V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final K f27841b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Collection<V> f27842c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AbstractMapBasedMultimap<K, V>.i f27843d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Collection<V> f27844e;

        /* JADX WARN: Multi-variable type inference failed */
        public i(Object obj, List list, i iVar) {
            this.f27841b = obj;
            this.f27842c = list;
            this.f27843d = iVar;
            this.f27844e = iVar == null ? null : iVar.f27842c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean add(V v10) {
            e();
            boolean zIsEmpty = this.f27842c.isEmpty();
            boolean zAdd = this.f27842c.add(v10);
            if (zAdd) {
                AbstractMapBasedMultimap.this.f27820f++;
                if (zIsEmpty) {
                    d();
                }
            }
            return zAdd;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = this.f27842c.addAll(collection);
            if (zAddAll) {
                AbstractMapBasedMultimap.this.f27820f += this.f27842c.size() - size;
                if (size == 0) {
                    d();
                }
            }
            return zAddAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f27842c.clear();
            AbstractMapBasedMultimap.this.f27820f -= size;
            g();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            e();
            return this.f27842c.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            e();
            return this.f27842c.containsAll(collection);
        }

        public final void d() {
            AbstractMapBasedMultimap<K, V>.i iVar = this.f27843d;
            if (iVar != null) {
                iVar.d();
            } else {
                AbstractMapBasedMultimap.this.f27819e.put(this.f27841b, this.f27842c);
            }
        }

        public final void e() {
            Collection<V> collection;
            AbstractMapBasedMultimap<K, V>.i iVar = this.f27843d;
            if (iVar != null) {
                iVar.e();
                if (iVar.f27842c != this.f27844e) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.f27842c.isEmpty() || (collection = AbstractMapBasedMultimap.this.f27819e.get(this.f27841b)) == null) {
                    return;
                }
                this.f27842c = collection;
            }
        }

        @Override // java.util.Collection
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            e();
            return this.f27842c.equals(obj);
        }

        public final void g() {
            AbstractMapBasedMultimap<K, V>.i iVar = this.f27843d;
            if (iVar != null) {
                iVar.g();
            } else if (this.f27842c.isEmpty()) {
                AbstractMapBasedMultimap.this.f27819e.remove(this.f27841b);
            }
        }

        @Override // java.util.Collection
        public final int hashCode() {
            e();
            return this.f27842c.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            e();
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(Object obj) {
            e();
            boolean zRemove = this.f27842c.remove(obj);
            if (zRemove) {
                AbstractMapBasedMultimap.this.f27820f--;
                g();
            }
            return zRemove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zRemoveAll = this.f27842c.removeAll(collection);
            if (zRemoveAll) {
                AbstractMapBasedMultimap.this.f27820f += this.f27842c.size() - size;
                g();
            }
            return zRemoveAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            collection.getClass();
            int size = size();
            boolean zRetainAll = this.f27842c.retainAll(collection);
            if (zRetainAll) {
                AbstractMapBasedMultimap.this.f27820f += this.f27842c.size() - size;
                g();
            }
            return zRetainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            e();
            return this.f27842c.size();
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            e();
            return this.f27842c.toString();
        }

        public class a implements Iterator<V> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Iterator<V> f27846b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Collection<V> f27847c;

            public a() {
                Collection<V> collection = i.this.f27842c;
                this.f27847c = collection;
                this.f27846b = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
            }

            public final void a() {
                i iVar = i.this;
                iVar.e();
                if (iVar.f27842c != this.f27847c) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                a();
                return this.f27846b.hasNext();
            }

            @Override // java.util.Iterator
            public final V next() {
                a();
                return this.f27846b.next();
            }

            @Override // java.util.Iterator
            public final void remove() {
                this.f27846b.remove();
                i iVar = i.this;
                AbstractMapBasedMultimap.this.f27820f--;
                iVar.g();
            }

            public a(j jVar, ListIterator listIterator) {
                i.this = jVar;
                this.f27847c = jVar.f27842c;
                this.f27846b = listIterator;
            }
        }
    }
}
