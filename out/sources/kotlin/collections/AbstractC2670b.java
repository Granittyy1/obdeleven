package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: renamed from: kotlin.collections.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AbstractList.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2670b<E> extends AbstractCollection<E> implements List<E> {

    /* JADX INFO: renamed from: kotlin.collections.b$a */
    /* JADX INFO: compiled from: AbstractList.kt */
    public static final class a {
        public static void a(int i10, int i11, int i12) {
            if (i10 < 0 || i11 > i12) {
                StringBuilder sbA = B6.a.a("startIndex: ", ", endIndex: ", ", size: ", i10, i11);
                sbA.append(i12);
                throw new IndexOutOfBoundsException(sbA.toString());
            }
            if (i10 > i11) {
                throw new IllegalArgumentException(A8.f.d(i10, i11, "startIndex: ", " > endIndex: "));
            }
        }

        public static void b(int i10, int i11, int i12) {
            if (i10 < 0 || i11 > i12) {
                StringBuilder sbA = B6.a.a("fromIndex: ", ", toIndex: ", ", size: ", i10, i11);
                sbA.append(i12);
                throw new IndexOutOfBoundsException(sbA.toString());
            }
            if (i10 > i11) {
                throw new IllegalArgumentException(A8.f.d(i10, i11, "fromIndex: ", " > toIndex: "));
            }
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbstractList.kt */
    public class C0478b implements Iterator<E>, Ja.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f42988b;

        public C0478b() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f42988b < AbstractC2670b.this.e();
        }

        @Override // java.util.Iterator
        public final E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i10 = this.f42988b;
            this.f42988b = i10 + 1;
            return AbstractC2670b.this.get(i10);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.b$c */
    /* JADX INFO: compiled from: AbstractList.kt */
    public class c extends AbstractC2670b<E>.C0478b implements ListIterator<E> {
        public c(int i10) {
            super();
            int iE = AbstractC2670b.this.e();
            if (i10 < 0 || i10 > iE) {
                throw new IndexOutOfBoundsException(A8.f.d(i10, iE, "index: ", ", size: "));
            }
            this.f42988b = i10;
        }

        @Override // java.util.ListIterator
        public final void add(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f42988b > 0;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f42988b;
        }

        @Override // java.util.ListIterator
        public final E previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            int i10 = this.f42988b - 1;
            this.f42988b = i10;
            return AbstractC2670b.this.get(i10);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f42988b - 1;
        }

        @Override // java.util.ListIterator
        public final void set(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.b$d */
    /* JADX INFO: compiled from: AbstractList.kt */
    public static final class d<E> extends AbstractC2670b<E> implements RandomAccess {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AbstractC2670b<E> f42991b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f42992c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f42993d;

        /* JADX WARN: Multi-variable type inference failed */
        public d(AbstractC2670b<? extends E> list, int i10, int i11) {
            kotlin.jvm.internal.i.e(list, "list");
            this.f42991b = list;
            this.f42992c = i10;
            a.b(i10, i11, list.e());
            this.f42993d = i11 - i10;
        }

        @Override // kotlin.collections.AbstractCollection
        public final int e() {
            return this.f42993d;
        }

        @Override // java.util.List
        public final E get(int i10) {
            int i11 = this.f42993d;
            if (i10 < 0 || i10 >= i11) {
                throw new IndexOutOfBoundsException(A8.f.d(i10, i11, "index: ", ", size: "));
            }
            return this.f42991b.get(this.f42992c + i10);
        }
    }

    @Override // java.util.List
    public final void add(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection other = (Collection) obj;
        kotlin.jvm.internal.i.e(other, "other");
        if (size() == other.size()) {
            Iterator<E> it = other.iterator();
            Iterator<E> it2 = iterator();
            while (it2.hasNext()) {
                if (!kotlin.jvm.internal.i.a(it2.next(), it.next())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        Iterator<E> it = iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            E next = it.next();
            iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
        }
        return iHashCode;
    }

    public int indexOf(E e10) {
        Iterator<E> it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (kotlin.jvm.internal.i.a(it.next(), e10)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new C0478b();
    }

    public int lastIndexOf(E e10) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (kotlin.jvm.internal.i.a(listIterator.previous(), e10)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator<E> listIterator() {
        return new c(0);
    }

    @Override // java.util.List
    public final E remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final E set(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<E> subList(int i10, int i11) {
        return new d(this, i10, i11);
    }

    public ListIterator<E> listIterator(int i10) {
        return new c(i10);
    }
}
