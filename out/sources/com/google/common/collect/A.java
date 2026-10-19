package com.google.common.collect;

import java.util.Iterator;

/* JADX INFO: compiled from: TransformedIterator.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class A<F, T> implements Iterator<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator<? extends F> f27811b;

    public A(Iterator<? extends F> it) {
        it.getClass();
        this.f27811b = it;
    }

    public abstract T a(F f10);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f27811b.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return a(this.f27811b.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f27811b.remove();
    }
}
