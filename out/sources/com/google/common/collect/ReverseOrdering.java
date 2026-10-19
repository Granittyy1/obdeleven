package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
final class ReverseOrdering<T> extends w<T> implements Serializable {
    private static final long serialVersionUID = 0;
    final w<? super T> forwardOrder;

    public ReverseOrdering(w<? super T> wVar) {
        this.forwardOrder = wVar;
    }

    @Override // java.util.Comparator
    public final int compare(T t8, T t10) {
        return this.forwardOrder.compare(t10, t8);
    }

    @Override // com.google.common.collect.w
    public final <S extends T> w<S> e() {
        return this.forwardOrder;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReverseOrdering) {
            return this.forwardOrder.equals(((ReverseOrdering) obj).forwardOrder);
        }
        return false;
    }

    public final int hashCode() {
        return -this.forwardOrder.hashCode();
    }

    public final String toString() {
        return this.forwardOrder + ".reverse()";
    }
}
