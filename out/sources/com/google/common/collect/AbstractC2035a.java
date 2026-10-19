package com.google.common.collect;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.common.collect.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AbstractIndexedListIterator.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2035a<E> extends C<Object> implements ListIterator<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f27963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27964c;

    public AbstractC2035a(int i10, int i11) {
        A8.p.k(i11, i10);
        this.f27963b = i10;
        this.f27964c = i11;
    }

    public abstract E a(int i10);

    @Override // java.util.ListIterator
    @Deprecated
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f27964c < this.f27963b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f27964c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f27964c;
        this.f27964c = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f27964c;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f27964c - 1;
        this.f27964c = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f27964c - 1;
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
