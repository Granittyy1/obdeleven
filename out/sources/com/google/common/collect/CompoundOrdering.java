package com.google.common.collect;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
final class CompoundOrdering<T> extends w<T> implements Serializable {
    private static final long serialVersionUID = 0;
    final Comparator<? super T>[] comparators;

    /* JADX WARN: Multi-variable type inference failed */
    public CompoundOrdering(w wVar, Comparator comparator) {
        w[] wVarArr = (Comparator<? super T>[]) new Comparator[2];
        wVarArr[0] = wVar;
        wVarArr[1] = comparator;
        this.comparators = wVarArr;
    }

    @Override // java.util.Comparator
    public final int compare(T t8, T t10) {
        int i10 = 0;
        while (true) {
            Comparator<? super T>[] comparatorArr = this.comparators;
            if (i10 >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i10].compare(t8, t10);
            if (iCompare != 0) {
                return iCompare;
            }
            i10++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CompoundOrdering) {
            return Arrays.equals(this.comparators, ((CompoundOrdering) obj).comparators);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.comparators);
    }

    public final String toString() {
        return Q8.d.a(new StringBuilder("Ordering.compound("), Arrays.toString(this.comparators), ")");
    }
}
