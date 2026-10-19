package com.google.android.play.integrity.internal;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements ListIterator, Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f27748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ap f27750d;

    public h(ap apVar, int i10) {
        int size = apVar.size();
        if (i10 < 0 || i10 > size) {
            throw new IndexOutOfBoundsException(f.c("index", i10, size));
        }
        this.f27748b = size;
        this.f27749c = i10;
        this.f27750d = apVar;
    }

    public final Object a(int i10) {
        return this.f27750d.get(i10);
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f27749c < this.f27748b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f27749c > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f27749c;
        this.f27749c = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f27749c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f27749c - 1;
        this.f27749c = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f27749c - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
