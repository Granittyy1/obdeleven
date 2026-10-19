package com.google.common.base;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class Predicates {

    public static class AndPredicate<T> implements e<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final List<? extends e<? super T>> components;

        public AndPredicate() {
            throw null;
        }

        public AndPredicate(List list) {
            this.components = list;
        }

        @Override // com.google.common.base.e
        public final boolean apply(T t8) {
            for (int i10 = 0; i10 < this.components.size(); i10++) {
                if (!this.components.get(i10).apply(t8)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof AndPredicate) {
                return this.components.equals(((AndPredicate) obj).components);
            }
            return false;
        }

        public final int hashCode() {
            return this.components.hashCode() + 306654252;
        }

        public final String toString() {
            List<? extends e<? super T>> list = this.components;
            StringBuilder sb2 = new StringBuilder("Predicates.and(");
            boolean z10 = true;
            for (T t8 : list) {
                if (!z10) {
                    sb2.append(',');
                }
                sb2.append(t8);
                z10 = false;
            }
            sb2.append(')');
            return sb2.toString();
        }
    }

    public static <T> e<T> a(e<? super T> eVar, e<? super T> eVar2) {
        eVar.getClass();
        return new AndPredicate(Arrays.asList(eVar, eVar2));
    }
}
