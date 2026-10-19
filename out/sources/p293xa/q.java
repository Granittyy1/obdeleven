package p293xa;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: UShortArray.kt */
/* JADX INFO: loaded from: classes.dex */
@Ha.a
public final class q implements Collection<p>, Ja.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final short[] f47936b;

    /* JADX INFO: compiled from: UShortArray.kt */
    public static final class a implements Iterator<p>, Ja.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final short[] f47937b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f47938c;

        public a(short[] sArr) {
            this.f47937b = sArr;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f47938c < this.f47937b.length;
        }

        @Override // java.util.Iterator
        public final p next() {
            int i10 = this.f47938c;
            short[] sArr = this.f47937b;
            if (i10 >= sArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f47938c));
            }
            this.f47938c = i10 + 1;
            return new p(sArr[i10]);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(p pVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends p> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001b A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        short s10 = ((p) obj).f47935b;
        short[] sArr = this.f47936b;
        int length = sArr.length;
        int i10 = 0;
        while (i10 < length) {
            if (s10 == sArr[i10]) {
                if (i10 >= 0) {
                    return true;
                }
                return false;
            }
            i10++;
        }
        i10 = -1;
        if (i10 >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<? extends Object> elements) {
        i.e(elements, "elements");
        Collection<? extends Object> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (obj instanceof p) {
                short s10 = ((p) obj).f47935b;
                short[] sArr = this.f47936b;
                int length = sArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        i10 = -1;
                        break;
                    }
                    if (s10 == sArr[i10]) {
                        break;
                    }
                    i10++;
                }
                if (i10 >= 0) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            return i.a(this.f47936b, ((q) obj).f47936b);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f47936b);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f47936b.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<p> iterator() {
        return new a(this.f47936b);
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
        return this.f47936b.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return d.a(this);
    }

    public final String toString() {
        return "UShortArray(storage=" + Arrays.toString(this.f47936b) + ')';
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] array) {
        i.e(array, "array");
        return (T[]) d.b(this, array);
    }
}
