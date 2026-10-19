package p293xa;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: UByteArray.kt */
/* JADX INFO: loaded from: classes.dex */
@Ha.a
public final class j implements Collection<i>, Ja.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f47923b;

    /* JADX INFO: compiled from: UByteArray.kt */
    public static final class a implements Iterator<i>, Ja.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f47924b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f47925c;

        public a(byte[] bArr) {
            this.f47924b = bArr;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f47925c < this.f47924b.length;
        }

        @Override // java.util.Iterator
        public final i next() {
            int i10 = this.f47925c;
            byte[] bArr = this.f47924b;
            if (i10 >= bArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f47925c));
            }
            this.f47925c = i10 + 1;
            return new i(bArr[i10]);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(i iVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends i> collection) {
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
        if (!(obj instanceof i)) {
            return false;
        }
        byte b10 = ((i) obj).f47922b;
        byte[] bArr = this.f47923b;
        int length = bArr.length;
        int i10 = 0;
        while (i10 < length) {
            if (b10 == bArr[i10]) {
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
            if (obj instanceof i) {
                byte b10 = ((i) obj).f47922b;
                byte[] bArr = this.f47923b;
                int length = bArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        i10 = -1;
                        break;
                    }
                    if (b10 == bArr[i10]) {
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
        if (obj instanceof j) {
            return i.a(this.f47923b, ((j) obj).f47923b);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f47923b);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f47923b.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<i> iterator() {
        return new a(this.f47923b);
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
        return this.f47923b.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return d.a(this);
    }

    public final String toString() {
        return "UByteArray(storage=" + Arrays.toString(this.f47923b) + ')';
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] array) {
        i.e(array, "array");
        return (T[]) d.b(this, array);
    }
}
