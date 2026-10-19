package com.google.common.collect;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class Iterators {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class EmptyModifiableIterator implements Iterator<Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final EmptyModifiableIterator f27889b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ EmptyModifiableIterator[] f27890c;

        static {
            EmptyModifiableIterator emptyModifiableIterator = new EmptyModifiableIterator("INSTANCE", 0);
            f27889b = emptyModifiableIterator;
            f27890c = new EmptyModifiableIterator[]{emptyModifiableIterator};
        }

        public EmptyModifiableIterator() {
            throw null;
        }

        public static EmptyModifiableIterator valueOf(String str) {
            return (EmptyModifiableIterator) Enum.valueOf(EmptyModifiableIterator.class, str);
        }

        public static EmptyModifiableIterator[] values() {
            return (EmptyModifiableIterator[]) f27890c.clone();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            A8.p.p("no calls to next() since the last call to remove()", false);
        }
    }

    public static final class a<T> extends C<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f27891b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f27892c;

        public a(T t8) {
            this.f27891b = t8;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.f27892c;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f27892c) {
                throw new NoSuchElementException();
            }
            this.f27892c = true;
            return this.f27891b;
        }
    }

    public static Object a(Iterator it, String str) {
        return it.hasNext() ? it.next() : str;
    }
}
