package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2006t implements ListIterator, Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzbt f26256d;

    public C2006t(zzbt zzbtVar, int i10) {
        int size = zzbtVar.size();
        C1989n.b(i10, size);
        this.f26254b = size;
        this.f26255c = i10;
        this.f26256d = zzbtVar;
    }

    public final Object a(int i10) {
        return this.f26256d.get(i10);
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f26255c < this.f26254b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f26255c > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f26255c;
        this.f26255c = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f26255c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f26255c - 1;
        this.f26255c = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f26255c - 1;
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
