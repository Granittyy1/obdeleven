package com.google.common.base;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Equivalence<T> {

    public static final class Equals extends Equivalence<Object> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Equals f27776b = new Equals();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return f27776b;
        }

        @Override // com.google.common.base.Equivalence
        public final boolean a(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        @Override // com.google.common.base.Equivalence
        public final int b(Object obj) {
            return obj.hashCode();
        }
    }

    public static final class Identity extends Equivalence<Object> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Identity f27777b = new Identity();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return f27777b;
        }

        @Override // com.google.common.base.Equivalence
        public final boolean a(Object obj, Object obj2) {
            return false;
        }

        @Override // com.google.common.base.Equivalence
        public final int b(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    public static Equivalence<Object> c() {
        return Equals.f27776b;
    }

    public static Equivalence<Object> e() {
        return Identity.f27777b;
    }

    public abstract boolean a(T t8, T t10);

    public abstract int b(T t8);

    public final boolean d(T t8, T t10) {
        if (t8 == t10) {
            return true;
        }
        if (t8 == null || t10 == null) {
            return false;
        }
        return a(t8, t10);
    }
}
