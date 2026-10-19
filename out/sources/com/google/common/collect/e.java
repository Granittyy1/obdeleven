package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: compiled from: Collections2.java */
/* JADX INFO: loaded from: classes3.dex */
public class e<E> extends AbstractCollection<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f27969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.common.base.e<? super E> f27970c;

    public e(Set set, com.google.common.base.e eVar) {
        this.f27969b = set;
        this.f27970c = eVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(E e10) {
        A8.p.g(this.f27970c.apply(e10));
        return this.f27969b.add(e10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            A8.p.g(this.f27970c.apply(it.next()));
        }
        return this.f27969b.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        Set set = this.f27969b;
        boolean z10 = set instanceof RandomAccess;
        com.google.common.base.e<? super E> eVar = this.f27970c;
        if (!z10 || !(set instanceof List)) {
            Iterator it = set.iterator();
            eVar.getClass();
            while (it.hasNext()) {
                if (eVar.apply((Object) it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) set;
        eVar.getClass();
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            A1.B b10 = (Object) list.get(i11);
            if (!eVar.apply(b10)) {
                if (i11 > i10) {
                    try {
                        list.set(i10, b10);
                    } catch (IllegalArgumentException unused) {
                        L4.b.j(list, eVar, i10, i11);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        L4.b.j(list, eVar, i10, i11);
                        return;
                    }
                }
                i10++;
            }
        }
        list.subList(i10, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        boolean zContains;
        Set set = this.f27969b;
        set.getClass();
        try {
            zContains = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            zContains = false;
        }
        if (zContains) {
            return this.f27970c.apply(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        Iterator it = this.f27969b.iterator();
        com.google.common.base.e<? super E> eVar = this.f27970c;
        A8.p.j(eVar, "predicate");
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (eVar.apply((Object) it.next())) {
                break;
            }
            i10++;
        }
        return true ^ (i10 != -1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        Iterator<E> it = this.f27969b.iterator();
        it.getClass();
        com.google.common.base.e<? super E> eVar = this.f27970c;
        eVar.getClass();
        return new m(it, eVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        return contains(obj) && this.f27969b.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        Iterator<E> it = this.f27969b.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            E next = it.next();
            if (this.f27970c.apply(next) && collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        Iterator<E> it = this.f27969b.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            E next = it.next();
            if (this.f27970c.apply(next) && !collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        Iterator<E> it = this.f27969b.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (this.f27970c.apply(it.next())) {
                i10++;
            }
        }
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return Lists.a(iterator()).toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) Lists.a(iterator()).toArray(tArr);
    }
}
