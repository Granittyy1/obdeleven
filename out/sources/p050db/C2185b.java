package p050db;

import Ya.b;
import Ya.k;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.collections.q;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;

/* JADX INFO: renamed from: db.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: JsonElement.kt */
/* JADX INFO: loaded from: classes2.dex */
@k(with = C2186c.class)
public final class C2185b extends h implements List<h>, Ja.a {
    public static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<h> f34645b;

    /* JADX INFO: renamed from: db.b$a */
    /* JADX INFO: compiled from: JsonElement.kt */
    public static final class a {
        public final b<C2185b> serializer() {
            return C2186c.f34646a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2185b(List<? extends h> content) {
        i.e(content, "content");
        this.f34645b = content;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, h hVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection<? extends h> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h element = (h) obj;
        i.e(element, "element");
        return this.f34645b.contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> elements) {
        i.e(elements, "elements");
        return this.f34645b.containsAll(elements);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return i.a(this.f34645b, obj);
    }

    @Override // java.util.List
    public final h get(int i10) {
        return this.f34645b.get(i10);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f34645b.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof h)) {
            return -1;
        }
        h element = (h) obj;
        i.e(element, "element");
        return this.f34645b.indexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f34645b.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<h> iterator() {
        return this.f34645b.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof h)) {
            return -1;
        }
        h element = (h) obj;
        i.e(element, "element");
        return this.f34645b.lastIndexOf(element);
    }

    @Override // java.util.List
    public final ListIterator<h> listIterator() {
        return this.f34645b.listIterator();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ h remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<h> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ h set(int i10, h hVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f34645b.size();
    }

    @Override // java.util.List
    public final void sort(Comparator<? super h> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<h> subList(int i10, int i11) {
        return this.f34645b.subList(i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return d.a(this);
    }

    public final String toString() {
        return q.U(this.f34645b, ",", "[", "]", null, 56);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends h> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator<h> listIterator(int i10) {
        return this.f34645b.listIterator(i10);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] array) {
        i.e(array, "array");
        return (T[]) d.b(this, array);
    }
}
