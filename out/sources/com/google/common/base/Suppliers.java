package com.google.common.base;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import kotlinx.coroutines.C;

/* JADX INFO: loaded from: classes3.dex */
public final class Suppliers {

    public static class MemoizingSupplier<T> implements j<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public transient Object f27778b = new Object();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile transient boolean f27779c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public transient T f27780d;
        final j<T> delegate;

        public MemoizingSupplier(j<T> jVar) {
            this.delegate = jVar;
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.f27778b = new Object();
        }

        @Override // com.google.common.base.j
        public final T get() {
            if (!this.f27779c) {
                synchronized (this.f27778b) {
                    try {
                        if (!this.f27779c) {
                            T t8 = this.delegate.get();
                            this.f27780d = t8;
                            this.f27779c = true;
                            return t8;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return this.f27780d;
        }

        public final String toString() {
            Object obj;
            StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
            if (this.f27779c) {
                obj = "<supplier that returned " + this.f27780d + ">";
            } else {
                obj = this.delegate;
            }
            sb2.append(obj);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public static class SupplierOfInstance<T> implements j<T>, Serializable {
        private static final long serialVersionUID = 0;
        final T instance;

        public SupplierOfInstance(T t8) {
            this.instance = t8;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof SupplierOfInstance) {
                return C.j(this.instance, ((SupplierOfInstance) obj).instance);
            }
            return false;
        }

        @Override // com.google.common.base.j
        public final T get() {
            return this.instance;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.instance});
        }

        public final String toString() {
            return "Suppliers.ofInstance(" + this.instance + ")";
        }
    }

    public static class a<T> implements j<T> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final k f27781e = new k();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f27782b = new Object();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile j<T> f27783c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public T f27784d;

        public a(j<T> jVar) {
            this.f27783c = jVar;
        }

        @Override // com.google.common.base.j
        public final T get() {
            j<T> jVar = this.f27783c;
            k kVar = f27781e;
            if (jVar != kVar) {
                synchronized (this.f27782b) {
                    try {
                        if (this.f27783c != kVar) {
                            T t8 = this.f27783c.get();
                            this.f27784d = t8;
                            this.f27783c = kVar;
                            return t8;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return this.f27784d;
        }

        public final String toString() {
            Object obj = this.f27783c;
            StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
            if (obj == f27781e) {
                obj = "<supplier that returned " + this.f27784d + ">";
            }
            sb2.append(obj);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public static <T> j<T> a(j<T> jVar) {
        if ((jVar instanceof a) || (jVar instanceof MemoizingSupplier)) {
            return jVar;
        }
        return jVar instanceof Serializable ? new MemoizingSupplier(jVar) : new a(jVar);
    }

    public static <T> j<T> b(T t8) {
        return new SupplierOfInstance(t8);
    }
}
