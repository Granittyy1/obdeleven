package com.google.android.gms.internal.common;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements ListIterator, Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzah f25355d;

    public b(zzah zzahVar, int i10) {
        int size = zzahVar.size();
        if (i10 < 0 || i10 > size) {
            throw new IndexOutOfBoundsException(j.c("index", i10, size));
        }
        this.f25353b = size;
        this.f25354c = i10;
        this.f25355d = zzahVar;
    }

    public final Object a(int i10) {
        return this.f25355d.get(i10);
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f25354c < this.f25353b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f25354c > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f25354c;
        this.f25354c = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f25354c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f25354c - 1;
        this.f25354c = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f25354c - 1;
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
