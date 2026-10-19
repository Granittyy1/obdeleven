package com.google.common.collect;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class ByFunctionOrdering<F, T> extends w<F> implements Serializable {
    private static final long serialVersionUID = 0;
    final com.google.common.base.c<F, ? extends T> function;
    final w<T> ordering;

    public ByFunctionOrdering(com.google.common.base.c<F, ? extends T> cVar, w<T> wVar) {
        this.function = cVar;
        wVar.getClass();
        this.ordering = wVar;
    }

    @Override // java.util.Comparator
    public final int compare(F f10, F f11) {
        return this.ordering.compare(this.function.apply(f10), this.function.apply(f11));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByFunctionOrdering)) {
            return false;
        }
        ByFunctionOrdering byFunctionOrdering = (ByFunctionOrdering) obj;
        return this.function.equals(byFunctionOrdering.function) && this.ordering.equals(byFunctionOrdering.ordering);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.function, this.ordering});
    }

    public final String toString() {
        return this.ordering + ".onResultOf(" + this.function + ")";
    }
}
