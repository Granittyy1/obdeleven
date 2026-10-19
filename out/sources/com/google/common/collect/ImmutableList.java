package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ImmutableList<E> extends ImmutableCollection<E> implements List<E>, RandomAccess {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f27874c = new b(0, RegularImmutableList.f27940f);
    private static final long serialVersionUID = -889275714;

    public static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        final Object[] elements;

        public SerializedForm(Object[] objArr) {
            this.elements = objArr;
        }

        public Object readResolve() {
            return ImmutableList.I(this.elements);
        }
    }

    public class SubList extends ImmutableList<E> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final transient int f27875d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final transient int f27876e;

        public SubList(int i10, int i11) {
            this.f27875d = i10;
            this.f27876e = i11;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
        public final ImmutableList<E> subList(int i10, int i11) {
            A8.p.m(i10, i11, this.f27876e);
            ImmutableList immutableList = ImmutableList.this;
            int i12 = this.f27875d;
            return immutableList.subList(i10 + i12, i11 + i12);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final Object[] g() {
            return ImmutableList.this.g();
        }

        @Override // java.util.List
        public final E get(int i10) {
            A8.p.h(i10, this.f27876e);
            return ImmutableList.this.get(i10 + this.f27875d);
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return listIterator(0);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final int k() {
            return ImmutableList.this.q() + this.f27875d + this.f27876e;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final int q() {
            return ImmutableList.this.q() + this.f27875d;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean s() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f27876e;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return listIterator(i10);
        }
    }

    public static final class a<E> extends ImmutableCollection.a<E> {
        public a() {
            super(4);
        }

        @Override // com.google.common.collect.ImmutableCollection.b
        public final ImmutableCollection.b a(Object obj) {
            c(obj);
            return this;
        }

        public final ImmutableList<E> h() {
            this.f27873c = true;
            return ImmutableList.A(this.f27872b, this.f27871a);
        }
    }

    public static class b<E> extends AbstractC2035a<E> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ImmutableList<E> f27877d;

        public b(int i10, ImmutableList immutableList) {
            super(immutableList.size(), i10);
            this.f27877d = immutableList;
        }

        @Override // com.google.common.collect.AbstractC2035a
        public final E a(int i10) {
            return this.f27877d.get(i10);
        }
    }

    public static ImmutableList A(int i10, Object[] objArr) {
        return i10 == 0 ? RegularImmutableList.f27940f : new RegularImmutableList(i10, objArr);
    }

    public static <E> a<E> B() {
        return new a<>();
    }

    public static <E> a<E> C(int i10) {
        P3.d.e(i10, "expectedSize");
        return new a<>(i10);
    }

    public static <E> ImmutableList<E> G(Collection<? extends E> collection) {
        if (!(collection instanceof ImmutableCollection)) {
            Object[] array = collection.toArray();
            p019b6.d.b(array.length, array);
            return A(array.length, array);
        }
        ImmutableList<E> immutableListD = ((ImmutableCollection) collection).d();
        if (!immutableListD.s()) {
            return immutableListD;
        }
        Object[] array2 = immutableListD.toArray(ImmutableCollection.f27870b);
        return A(array2.length, array2);
    }

    public static <E> ImmutableList<E> I(E[] eArr) {
        if (eArr.length == 0) {
            return (ImmutableList<E>) RegularImmutableList.f27940f;
        }
        Object[] objArr = (Object[]) eArr.clone();
        p019b6.d.b(objArr.length, objArr);
        return A(objArr.length, objArr);
    }

    public static <E> ImmutableList<E> K() {
        return (ImmutableList<E>) RegularImmutableList.f27940f;
    }

    public static ImmutableList L(Long l10, Long l11, Long l12, Long l13, Long l14) {
        Object[] objArr = {l10, l11, l12, l13, l14};
        p019b6.d.b(5, objArr);
        return A(5, objArr);
    }

    public static <E> ImmutableList<E> M(E e10) {
        Object[] objArr = {e10};
        p019b6.d.b(1, objArr);
        return A(1, objArr);
    }

    public static <E> ImmutableList<E> N(E e10, E e11) {
        Object[] objArr = {e10, e11};
        p019b6.d.b(2, objArr);
        return A(2, objArr);
    }

    public static ImmutableList O(w wVar, List list) {
        wVar.getClass();
        List list2 = list;
        Object[] array = (list2 instanceof Collection ? list2 : Lists.a(list2.iterator())).toArray();
        p019b6.d.b(array.length, array);
        Arrays.sort(array, wVar);
        return A(array.length, array);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public final b listIterator(int i10) {
        A8.p.k(i10, size());
        return isEmpty() ? f27874c : new b(i10, this);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: P */
    public ImmutableList<E> subList(int i10, int i11) {
        A8.p.m(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        return i12 == 0 ? (ImmutableList<E>) RegularImmutableList.f27940f : new SubList(i10, i12);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int e(int i10, Object[] objArr) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i10 = 0; i10 < size; i10++) {
                        if (kotlinx.coroutines.C.j(get(i10), list.get(i10))) {
                        }
                    }
                    return true;
                }
                Iterator<E> it = iterator();
                Iterator<E> it2 = list.iterator();
                while (it.hasNext()) {
                    if (it2.hasNext() && kotlinx.coroutines.C.j(it.next(), it2.next())) {
                    }
                }
                return !it2.hasNext();
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~(get(i11).hashCode() + (i10 * 31)));
        }
        return i10;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: v */
    public final C<E> iterator() {
        return listIterator(0);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(toArray(ImmutableCollection.f27870b));
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // com.google.common.collect.ImmutableCollection
    @Deprecated
    public final ImmutableList<E> d() {
        return this;
    }
}
