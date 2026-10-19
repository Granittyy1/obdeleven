package com.google.common.collect;

import com.google.common.base.Predicates;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: compiled from: Sets.java */
/* JADX INFO: loaded from: classes3.dex */
public final class z {

    /* JADX INFO: compiled from: Sets.java */
    public static class a<E> extends e<E> implements Set<E> {
        public a() {
            throw null;
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            return z.a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            return z.c(this);
        }
    }

    /* JADX INFO: compiled from: Sets.java */
    public static class b<E> extends a<E> implements SortedSet<E> {
        @Override // java.util.SortedSet
        public final Comparator<? super E> comparator() {
            return ((SortedSet) this.f27969b).comparator();
        }

        @Override // java.util.SortedSet
        public final E first() {
            Iterator<E> it = this.f27969b.iterator();
            it.getClass();
            com.google.common.base.e<? super E> eVar = this.f27970c;
            eVar.getClass();
            while (it.hasNext()) {
                E next = it.next();
                if (eVar.apply(next)) {
                    return next;
                }
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.SortedSet
        public final SortedSet<E> headSet(E e10) {
            return new b(((SortedSet) this.f27969b).headSet(e10), this.f27970c);
        }

        @Override // java.util.SortedSet
        public final E last() {
            SortedSet sortedSetHeadSet = (SortedSet) this.f27969b;
            while (true) {
                E e10 = (Object) sortedSetHeadSet.last();
                if (this.f27970c.apply(e10)) {
                    return e10;
                }
                sortedSetHeadSet = sortedSetHeadSet.headSet(e10);
            }
        }

        @Override // java.util.SortedSet
        public final SortedSet<E> subSet(E e10, E e11) {
            return new b(((SortedSet) this.f27969b).subSet(e10, e11), this.f27970c);
        }

        @Override // java.util.SortedSet
        public final SortedSet<E> tailSet(E e10) {
            return new b(((SortedSet) this.f27969b).tailSet(e10), this.f27970c);
        }
    }

    /* JADX INFO: compiled from: Sets.java */
    public static abstract class c<E> extends AbstractSet<E> {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            collection.getClass();
            if (collection instanceof v) {
                collection = ((v) collection).r();
            }
            boolean zRemove = false;
            if (!(collection instanceof Set) || collection.size() <= size()) {
                Iterator<?> it = collection.iterator();
                while (it.hasNext()) {
                    zRemove |= remove(it.next());
                }
            } else {
                Iterator<E> it2 = iterator();
                collection.getClass();
                while (it2.hasNext()) {
                    if (collection.contains(it2.next())) {
                        it2.remove();
                        zRemove = true;
                    }
                }
            }
            return zRemove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            collection.getClass();
            return super.retainAll(collection);
        }
    }

    /* JADX INFO: compiled from: Sets.java */
    public static abstract class d<E> extends AbstractSet<E> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean add(E e10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }
    }

    public static boolean a(Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static a b(Set set, com.google.common.base.e eVar) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof a)) {
                set.getClass();
                return new a(set, eVar);
            }
            a aVar = (a) set;
            return new a(aVar.f27969b, Predicates.a(aVar.f27970c, eVar));
        }
        Set set2 = (SortedSet) set;
        if (!(set2 instanceof a)) {
            set2.getClass();
            return new b(set2, eVar);
        }
        a aVar2 = (a) set2;
        return new b((SortedSet) aVar2.f27969b, Predicates.a(aVar2.f27970c, eVar));
    }

    public static int c(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    public static y d(ImmutableSet immutableSet, ImmutableSet immutableSet2) {
        A8.p.j(immutableSet, "set1");
        A8.p.j(immutableSet2, "set2");
        return new y(immutableSet, immutableSet2);
    }
}
