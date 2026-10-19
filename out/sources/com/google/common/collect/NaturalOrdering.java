package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
final class NaturalOrdering extends w<Comparable<?>> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final NaturalOrdering f27939b = new NaturalOrdering();
    private static final long serialVersionUID = 0;

    private NaturalOrdering() {
    }

    private Object readResolve() {
        return f27939b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    @Override // com.google.common.collect.w
    public final <S extends Comparable<?>> w<S> e() {
        return ReverseNaturalOrdering.f27961b;
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
