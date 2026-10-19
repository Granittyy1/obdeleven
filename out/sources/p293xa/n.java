package p293xa;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.k;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ULongArray.kt */
/* JADX INFO: loaded from: classes.dex */
@Ha.a
public final class n implements Collection<m>, Ja.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f47931b;

    /* JADX INFO: compiled from: ULongArray.kt */
    public static final class a implements Iterator<m>, Ja.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long[] f47932b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f47933c;

        public a(long[] jArr) {
            this.f47932b = jArr;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f47933c < this.f47932b.length;
        }

        @Override // java.util.Iterator
        public final m next() {
            int i10 = this.f47933c;
            long[] jArr = this.f47932b;
            if (i10 >= jArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f47933c));
            }
            this.f47933c = i10 + 1;
            return new m(jArr[i10]);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(m mVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends m> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        return k.N(this.f47931b, ((m) obj).f47930b);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<? extends Object> elements) {
        i.e(elements, "elements");
        Collection<? extends Object> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (obj instanceof m) {
                if (k.N(this.f47931b, ((m) obj).f47930b)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return i.a(this.f47931b, ((n) obj).f47931b);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f47931b);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f47931b.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<m> iterator() {
        return new a(this.f47931b);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f47931b.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return d.a(this);
    }

    public final String toString() {
        return "ULongArray(storage=" + Arrays.toString(this.f47931b) + ')';
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] array) {
        i.e(array, "array");
        return (T[]) d.b(this, array);
    }
}
