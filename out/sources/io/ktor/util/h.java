package io.ktor.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: DelegatingMutableSet.kt */
/* JADX INFO: loaded from: classes.dex */
public final class h<From, To> implements Set<To>, Ja.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<From> f40538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lambda f40539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Lambda f40540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f40541e;

    /* JADX INFO: compiled from: DelegatingMutableSet.kt */
    public static final class a implements Iterator<To>, Ja.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Iterator<From> f40542b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h<From, To> f40543c;

        public a(h<From, To> hVar) {
            this.f40543c = hVar;
            this.f40542b = hVar.f40538b.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f40542b.hasNext();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [Ia.l, kotlin.jvm.internal.Lambda] */
        @Override // java.util.Iterator
        public final To next() {
            return (To) this.f40543c.f40539c.invoke(this.f40542b.next());
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f40542b.remove();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(Set<From> delegate, Ia.l<? super From, ? extends To> convertTo, Ia.l<? super To, ? extends From> convert) {
        kotlin.jvm.internal.i.e(delegate, "delegate");
        kotlin.jvm.internal.i.e(convertTo, "convertTo");
        kotlin.jvm.internal.i.e(convert, "convert");
        this.f40538b = delegate;
        this.f40539c = (Lambda) convertTo;
        this.f40540d = (Lambda) convert;
        this.f40541e = delegate.size();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.util.Set, java.util.Collection
    public final boolean add(To to) {
        return this.f40538b.add((From) this.f40540d.invoke(to));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends To> elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        return this.f40538b.addAll(e(elements));
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f40538b.clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Ia.l, kotlin.jvm.internal.Lambda] */
    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f40538b.contains(this.f40540d.invoke(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        return this.f40538b.containsAll(e(elements));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Ia.l, kotlin.jvm.internal.Lambda] */
    public final ArrayList e(Collection collection) {
        kotlin.jvm.internal.i.e(collection, "<this>");
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(kotlin.collections.m.y(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f40540d.invoke(it.next()));
        }
        return arrayList;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Set)) {
            return false;
        }
        ArrayList arrayListK = k(this.f40538b);
        return ((Set) obj).containsAll(arrayListK) && arrayListK.containsAll((Collection) obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f40538b.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f40538b.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<To> iterator() {
        return new a(this);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Ia.l, kotlin.jvm.internal.Lambda] */
    public final ArrayList k(Collection collection) {
        kotlin.jvm.internal.i.e(collection, "<this>");
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(kotlin.collections.m.y(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f40539c.invoke(it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Ia.l, kotlin.jvm.internal.Lambda] */
    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f40538b.remove(this.f40540d.invoke(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        return this.f40538b.removeAll(e(elements));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        return this.f40538b.retainAll(e(elements));
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f40541e;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.d.a(this);
    }

    public final String toString() {
        return k(this.f40538b).toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.i.e(array, "array");
        return (T[]) kotlin.jvm.internal.d.b(this, array);
    }
}
