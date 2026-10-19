package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: Sets.java */
/* JADX INFO: loaded from: classes3.dex */
public final class y extends z.d<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ImmutableSet f27994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ImmutableSet f27995c;

    public y(ImmutableSet immutableSet, ImmutableSet immutableSet2) {
        this.f27994b = immutableSet;
        this.f27995c = immutableSet2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f27994b.contains(obj) && this.f27995c.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        return this.f27994b.containsAll(collection) && this.f27995c.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.f27995c, this.f27994b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new x(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator<E> it = this.f27994b.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (this.f27995c.contains(it.next())) {
                i10++;
            }
        }
        return i10;
    }
}
