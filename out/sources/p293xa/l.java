package p293xa;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: UIntArray.kt */
/* JADX INFO: loaded from: classes.dex */
@Ha.a
public final class l implements Collection<k>, Ja.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f47927b;

    /* JADX INFO: compiled from: UIntArray.kt */
    public static final class a implements Iterator<k>, Ja.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f47928b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f47929c;

        public a(int[] iArr) {
            this.f47928b = iArr;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f47929c < this.f47928b.length;
        }

        @Override // java.util.Iterator
        public final k next() {
            int i10 = this.f47929c;
            int[] iArr = this.f47928b;
            if (i10 >= iArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f47929c));
            }
            this.f47929c = i10 + 1;
            return new k(iArr[i10]);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(k kVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends k> collection) {
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
        if (!(obj instanceof k)) {
            return false;
        }
        int i10 = ((k) obj).f47926b;
        int[] iArr = this.f47927b;
        int length = iArr.length;
        int i11 = 0;
        while (i11 < length) {
            if (i10 == iArr[i11]) {
                if (i11 >= 0) {
                    return true;
                }
                return false;
            }
            i11++;
        }
        i11 = -1;
        if (i11 >= 0) {
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
            if (obj instanceof k) {
                int i10 = ((k) obj).f47926b;
                int[] iArr = this.f47927b;
                int length = iArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        i11 = -1;
                        break;
                    }
                    if (i10 == iArr[i11]) {
                        break;
                    }
                    i11++;
                }
                if (i11 >= 0) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return i.a(this.f47927b, ((l) obj).f47927b);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f47927b);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f47927b.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<k> iterator() {
        return new a(this.f47927b);
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
        return this.f47927b.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return d.a(this);
    }

    public final String toString() {
        return "UIntArray(storage=" + Arrays.toString(this.f47927b) + ')';
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] array) {
        i.e(array, "array");
        return (T[]) d.b(this, array);
    }
}
