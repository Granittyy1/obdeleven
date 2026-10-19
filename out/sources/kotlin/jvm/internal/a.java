package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: ArrayIterator.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class a<T> implements Iterator<T>, Ja.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T[] f43054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f43055c;

    public a(T[] array) {
        i.e(array, "array");
        this.f43054b = array;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f43055c < this.f43054b.length;
    }

    @Override // java.util.Iterator
    public final T next() {
        try {
            T[] tArr = this.f43054b;
            int i10 = this.f43055c;
            this.f43055c = i10 + 1;
            return tArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f43055c--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
