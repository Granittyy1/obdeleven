package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import java.util.ListIterator;

/* JADX INFO: compiled from: AbstractListIterator.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class a<E> implements ListIterator<E>, Ja.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12962c;

    public a(int i10, int i11) {
        this.f12961b = i10;
        this.f12962c = i11;
    }

    @Override // java.util.ListIterator
    public void add(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f12961b < this.f12962c;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f12961b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f12961b;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f12961b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
