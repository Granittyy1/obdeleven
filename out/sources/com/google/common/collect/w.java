package com.google.common.collect;

import java.util.Comparator;

/* JADX INFO: compiled from: Ordering.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class w<T> implements Comparator<T> {
    public static w b(p259v1.d dVar) {
        return new ComparatorOrdering(dVar);
    }

    public static <C extends Comparable> w<C> c() {
        return NaturalOrdering.f27939b;
    }

    public final <U extends T> w<U> a(Comparator<? super U> comparator) {
        return new CompoundOrdering(this, comparator);
    }

    public final <F> w<F> d(com.google.common.base.c<F, ? extends T> cVar) {
        return new ByFunctionOrdering(cVar, this);
    }

    public <S extends T> w<S> e() {
        return new ReverseOrdering(this);
    }
}
