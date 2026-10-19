package com.google.common.collect;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class Lists {

    public static class TransformingRandomAccessList<F, T> extends AbstractList<T> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final List<F> fromList;
        final com.google.common.base.c<? super F, ? extends T> function;

        public class a extends B<F, T> {
            public a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // com.google.common.collect.A
            public final T a(F f10) {
                return TransformingRandomAccessList.this.function.apply(f10);
            }
        }

        public TransformingRandomAccessList(List<F> list, com.google.common.base.c<? super F, ? extends T> cVar) {
            list.getClass();
            this.fromList = list;
            this.function = cVar;
        }

        @Override // java.util.AbstractList, java.util.List
        public final T get(int i10) {
            return this.function.apply(this.fromList.get(i10));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return this.fromList.isEmpty();
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public final Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator<T> listIterator(int i10) {
            return new a(this.fromList.listIterator(i10));
        }

        @Override // java.util.AbstractList, java.util.List
        public final T remove(int i10) {
            return this.function.apply(this.fromList.remove(i10));
        }

        @Override // java.util.AbstractList
        public final void removeRange(int i10, int i11) {
            this.fromList.subList(i10, i11).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.fromList.size();
        }
    }

    public static class TransformingSequentialList<F, T> extends AbstractSequentialList<T> implements Serializable {
        private static final long serialVersionUID = 0;
        final List<F> fromList;
        final com.google.common.base.c<? super F, ? extends T> function;

        public class a extends B<F, T> {
            public a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // com.google.common.collect.A
            public final T a(F f10) {
                return TransformingSequentialList.this.function.apply(f10);
            }
        }

        public TransformingSequentialList(List<F> list, com.google.common.base.c<? super F, ? extends T> cVar) {
            list.getClass();
            this.fromList = list;
            this.function = cVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return this.fromList.isEmpty();
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public final ListIterator<T> listIterator(int i10) {
            return new a(this.fromList.listIterator(i10));
        }

        @Override // java.util.AbstractList
        public final void removeRange(int i10, int i11) {
            this.fromList.subList(i10, i11).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.fromList.size();
        }
    }

    public static <E> ArrayList<E> a(Iterator<? extends E> it) {
        ArrayList<E> arrayList = new ArrayList<>();
        it.getClass();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static AbstractList b(List list, com.google.common.base.c cVar) {
        return list instanceof RandomAccess ? new TransformingRandomAccessList(list, cVar) : new TransformingSequentialList(list, cVar);
    }
}
