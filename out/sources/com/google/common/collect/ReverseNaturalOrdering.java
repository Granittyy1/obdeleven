package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
final class ReverseNaturalOrdering extends w<Comparable<?>> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ReverseNaturalOrdering f27961b = new ReverseNaturalOrdering();
    private static final long serialVersionUID = 0;

    private ReverseNaturalOrdering() {
    }

    private Object readResolve() {
        return f27961b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    @Override // com.google.common.collect.w
    public final <S extends Comparable<?>> w<S> e() {
        return NaturalOrdering.f27939b;
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
