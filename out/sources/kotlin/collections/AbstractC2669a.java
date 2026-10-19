package kotlin.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: kotlin.collections.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AbstractIterator.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2669a<T> implements Iterator<T>, Ja.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f42986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T f42987c;

    public abstract void a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f42986b;
        if (i10 == 0) {
            this.f42986b = 3;
            a();
            if (this.f42986b != 1) {
                return false;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                return false;
            }
            throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
        }
        return true;
    }

    @Override // java.util.Iterator
    public final T next() {
        int i10 = this.f42986b;
        if (i10 == 1) {
            this.f42986b = 0;
            return this.f42987c;
        }
        if (i10 != 2) {
            this.f42986b = 3;
            a();
            if (this.f42986b == 1) {
                this.f42986b = 0;
                return this.f42987c;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
