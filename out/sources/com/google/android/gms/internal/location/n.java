package com.google.android.gms.internal.location;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@21.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class n implements ListIterator, Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzex f25383d;

    public n(zzex zzexVar, int i10) {
        int size = zzexVar.size();
        if (i10 < 0 || i10 > size) {
            throw new IndexOutOfBoundsException(l.c("index", i10, size));
        }
        this.f25381b = size;
        this.f25382c = i10;
        this.f25383d = zzexVar;
    }

    public final Object a(int i10) {
        return this.f25383d.get(i10);
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f25382c < this.f25381b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f25382c > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f25382c;
        this.f25382c = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f25382c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f25382c - 1;
        this.f25382c = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f25382c - 1;
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
