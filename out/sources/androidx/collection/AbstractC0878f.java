package androidx.collection;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: androidx.collection.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: IndexBasedArrayIterator.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0878f<T> implements Iterator<T>, Ja.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9176d;

    public AbstractC0878f(int i10) {
        this.f9174b = i10;
    }

    public abstract T a(int i10);

    public abstract void b(int i10);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9175c < this.f9174b;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T tA = a(this.f9175c);
        this.f9175c++;
        this.f9176d = true;
        return tA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f9176d) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i10 = this.f9175c - 1;
        this.f9175c = i10;
        b(i10);
        this.f9174b--;
        this.f9176d = false;
    }
}
