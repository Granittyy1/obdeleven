package com.google.common.collect;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MultimapBuilder<K0, V0> {

    public static final class ArrayListSupplier<V> implements com.google.common.base.j<List<V>>, Serializable {
        private final int expectedValuesPerKey;

        public ArrayListSupplier() {
            P3.d.e(2, "expectedValuesPerKey");
            this.expectedValuesPerKey = 2;
        }

        @Override // com.google.common.base.j
        public final Object get() {
            return new ArrayList(this.expectedValuesPerKey);
        }
    }

    public static abstract class a<K0, V0> extends MultimapBuilder<K0, V0> {
    }

    public static abstract class b<K0> {
        public final u a() {
            P3.d.e(2, "expectedValuesPerKey");
            return new u(this);
        }

        public abstract <K extends K0, V> Map<K, Collection<V>> b();
    }

    public static t a() {
        NaturalOrdering naturalOrdering = NaturalOrdering.f27939b;
        naturalOrdering.getClass();
        return new t(naturalOrdering);
    }
}
