package kotlin.collections.builders;

import A8.f;
import I.e;
import com.google.android.gms.internal.measurement.M1;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.collections.AbstractC2670b;
import kotlin.collections.d;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ListBuilder.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ListBuilder<E> extends d<E> implements List<E>, RandomAccess, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ListBuilder f42994b;
    private E[] backing;
    private boolean isReadOnly;
    private int length;

    /* JADX INFO: compiled from: ListBuilder.kt */
    public static final class BuilderSubList<E> extends d<E> implements List<E>, RandomAccess, Serializable {
        private E[] backing;
        private int length;
        private final int offset;
        private final BuilderSubList<E> parent;
        private final ListBuilder<E> root;

        /* JADX INFO: compiled from: ListBuilder.kt */
        public static final class a<E> implements ListIterator<E>, Ja.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final BuilderSubList<E> f42995b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f42996c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f42997d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f42998e;

            public a(BuilderSubList<E> list, int i10) {
                i.e(list, "list");
                this.f42995b = list;
                this.f42996c = i10;
                this.f42997d = -1;
                this.f42998e = ((AbstractList) list).modCount;
            }

            public final void a() {
                if (((AbstractList) ((BuilderSubList) this.f42995b).root).modCount != this.f42998e) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.ListIterator
            public final void add(E e10) {
                a();
                int i10 = this.f42996c;
                this.f42996c = i10 + 1;
                BuilderSubList<E> builderSubList = this.f42995b;
                builderSubList.add(i10, e10);
                this.f42997d = -1;
                this.f42998e = ((AbstractList) builderSubList).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final boolean hasNext() {
                return this.f42996c < ((BuilderSubList) this.f42995b).length;
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return this.f42996c > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final E next() {
                a();
                int i10 = this.f42996c;
                BuilderSubList<E> builderSubList = this.f42995b;
                if (i10 >= ((BuilderSubList) builderSubList).length) {
                    throw new NoSuchElementException();
                }
                int i11 = this.f42996c;
                this.f42996c = i11 + 1;
                this.f42997d = i11;
                return (E) ((BuilderSubList) builderSubList).backing[((BuilderSubList) builderSubList).offset + this.f42997d];
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return this.f42996c;
            }

            @Override // java.util.ListIterator
            public final E previous() {
                a();
                int i10 = this.f42996c;
                if (i10 <= 0) {
                    throw new NoSuchElementException();
                }
                int i11 = i10 - 1;
                this.f42996c = i11;
                this.f42997d = i11;
                BuilderSubList<E> builderSubList = this.f42995b;
                return (E) ((BuilderSubList) builderSubList).backing[((BuilderSubList) builderSubList).offset + this.f42997d];
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return this.f42996c - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final void remove() {
                a();
                int i10 = this.f42997d;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                BuilderSubList<E> builderSubList = this.f42995b;
                builderSubList.k(i10);
                this.f42996c = this.f42997d;
                this.f42997d = -1;
                this.f42998e = ((AbstractList) builderSubList).modCount;
            }

            @Override // java.util.ListIterator
            public final void set(E e10) {
                a();
                int i10 = this.f42997d;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                this.f42995b.set(i10, e10);
            }
        }

        public BuilderSubList(E[] backing, int i10, int i11, BuilderSubList<E> builderSubList, ListBuilder<E> root) {
            i.e(backing, "backing");
            i.e(root, "root");
            this.backing = backing;
            this.offset = i10;
            this.length = i11;
            this.parent = builderSubList;
            this.root = root;
            ((AbstractList) this).modCount = ((AbstractList) root).modCount;
        }

        private final Object writeReplace() throws NotSerializableException {
            if (((ListBuilder) this.root).isReadOnly) {
                return new SerializedCollection(0, this);
            }
            throw new NotSerializableException("The list cannot be serialized while it is being built.");
        }

        public final void G(int i10, Collection<? extends E> collection, int i11) {
            ((AbstractList) this).modCount++;
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                builderSubList.G(i10, collection, i11);
            } else {
                ListBuilder<E> listBuilder = this.root;
                ListBuilder listBuilder2 = ListBuilder.f42994b;
                listBuilder.C(i10, collection, i11);
            }
            this.backing = (E[]) ((ListBuilder) this.root).backing;
            this.length += i11;
        }

        public final void I(int i10, E e10) {
            ((AbstractList) this).modCount++;
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                builderSubList.I(i10, e10);
            } else {
                ListBuilder<E> listBuilder = this.root;
                ListBuilder listBuilder2 = ListBuilder.f42994b;
                listBuilder.G(i10, e10);
            }
            this.backing = (E[]) ((ListBuilder) this.root).backing;
            this.length++;
        }

        public final void J() {
            if (((AbstractList) this.root).modCount != ((AbstractList) this).modCount) {
                throw new ConcurrentModificationException();
            }
        }

        public final void K() {
            if (((ListBuilder) this.root).isReadOnly) {
                throw new UnsupportedOperationException();
            }
        }

        public final E L(int i10) {
            E eL;
            ((AbstractList) this).modCount++;
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                eL = builderSubList.L(i10);
            } else {
                ListBuilder<E> listBuilder = this.root;
                ListBuilder listBuilder2 = ListBuilder.f42994b;
                eL = listBuilder.L(i10);
            }
            this.length--;
            return eL;
        }

        public final void M(int i10, int i11) {
            if (i11 > 0) {
                ((AbstractList) this).modCount++;
            }
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                builderSubList.M(i10, i11);
            } else {
                ListBuilder<E> listBuilder = this.root;
                ListBuilder listBuilder2 = ListBuilder.f42994b;
                listBuilder.M(i10, i11);
            }
            this.length -= i11;
        }

        public final int N(int i10, int i11, Collection<? extends E> collection, boolean z10) {
            int iN;
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                iN = builderSubList.N(i10, i11, collection, z10);
            } else {
                ListBuilder<E> listBuilder = this.root;
                ListBuilder listBuilder2 = ListBuilder.f42994b;
                iN = listBuilder.N(i10, i11, collection, z10);
            }
            if (iN > 0) {
                ((AbstractList) this).modCount++;
            }
            this.length -= iN;
            return iN;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean add(E e10) {
            K();
            J();
            I(this.offset + this.length, e10);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean addAll(Collection<? extends E> elements) {
            i.e(elements, "elements");
            K();
            J();
            int size = elements.size();
            G(this.offset + this.length, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final void clear() {
            K();
            J();
            M(this.offset, this.length);
        }

        @Override // kotlin.collections.d
        public final int e() {
            J();
            return this.length;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(Object obj) {
            J();
            if (obj != this) {
                if (obj instanceof List) {
                    if (e.d(this.backing, this.offset, this.length, (List) obj)) {
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public final E get(int i10) {
            J();
            int i11 = this.length;
            if (i10 < 0 || i10 >= i11) {
                throw new IndexOutOfBoundsException(f.d(i10, i11, "index: ", ", size: "));
            }
            return this.backing[this.offset + i10];
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            J();
            E[] eArr = this.backing;
            int i10 = this.offset;
            int i11 = this.length;
            int iHashCode = 1;
            for (int i12 = 0; i12 < i11; i12++) {
                E e10 = eArr[i10 + i12];
                iHashCode = (iHashCode * 31) + (e10 != null ? e10.hashCode() : 0);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            J();
            for (int i10 = 0; i10 < this.length; i10++) {
                if (i.a(this.backing[this.offset + i10], obj)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            J();
            return this.length == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public final Iterator<E> iterator() {
            return listIterator(0);
        }

        @Override // kotlin.collections.d
        public final E k(int i10) {
            K();
            J();
            int i11 = this.length;
            if (i10 < 0 || i10 >= i11) {
                throw new IndexOutOfBoundsException(f.d(i10, i11, "index: ", ", size: "));
            }
            return L(this.offset + i10);
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            J();
            for (int i10 = this.length - 1; i10 >= 0; i10--) {
                if (i.a(this.backing[this.offset + i10], obj)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator<E> listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean remove(Object obj) {
            K();
            J();
            int iIndexOf = indexOf(obj);
            if (iIndexOf >= 0) {
                k(iIndexOf);
            }
            return iIndexOf >= 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean removeAll(Collection<? extends Object> elements) {
            i.e(elements, "elements");
            K();
            J();
            return N(this.offset, this.length, elements, false) > 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean retainAll(Collection<? extends Object> elements) {
            i.e(elements, "elements");
            K();
            J();
            return N(this.offset, this.length, elements, true) > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public final E set(int i10, E e10) {
            K();
            J();
            int i11 = this.length;
            if (i10 < 0 || i10 >= i11) {
                throw new IndexOutOfBoundsException(f.d(i10, i11, "index: ", ", size: "));
            }
            E[] eArr = this.backing;
            int i12 = this.offset;
            E e11 = eArr[i12 + i10];
            eArr[i12 + i10] = e10;
            return e11;
        }

        @Override // java.util.AbstractList, java.util.List
        public final List<E> subList(int i10, int i11) {
            AbstractC2670b.a.b(i10, i11, this.length);
            return new BuilderSubList(this.backing, this.offset + i10, i11 - i10, this, this.root);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final <T> T[] toArray(T[] array) {
            i.e(array, "array");
            J();
            int length = array.length;
            int i10 = this.length;
            if (length < i10) {
                E[] eArr = this.backing;
                int i11 = this.offset;
                T[] tArr = (T[]) Arrays.copyOfRange(eArr, i11, i10 + i11, array.getClass());
                i.d(tArr, "copyOfRange(...)");
                return tArr;
            }
            E[] eArr2 = this.backing;
            int i12 = this.offset;
            Q3.d.n(0, i12, i10 + i12, eArr2, array);
            M1.l(this.length, array);
            return array;
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            J();
            return e.e(this.backing, this.offset, this.length, this);
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator<E> listIterator(int i10) {
            J();
            int i11 = this.length;
            if (i10 < 0 || i10 > i11) {
                throw new IndexOutOfBoundsException(f.d(i10, i11, "index: ", ", size: "));
            }
            return new a(this, i10);
        }

        @Override // java.util.AbstractList, java.util.List
        public final void add(int i10, E e10) {
            K();
            J();
            int i11 = this.length;
            if (i10 >= 0 && i10 <= i11) {
                I(this.offset + i10, e10);
                return;
            }
            throw new IndexOutOfBoundsException(f.d(i10, i11, "index: ", ", size: "));
        }

        @Override // java.util.AbstractList, java.util.List
        public final boolean addAll(int i10, Collection<? extends E> elements) {
            i.e(elements, "elements");
            K();
            J();
            int i11 = this.length;
            if (i10 >= 0 && i10 <= i11) {
                int size = elements.size();
                G(this.offset + i10, elements, size);
                return size > 0;
            }
            throw new IndexOutOfBoundsException(f.d(i10, i11, "index: ", ", size: "));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final Object[] toArray() {
            J();
            E[] eArr = this.backing;
            int i10 = this.offset;
            return Q3.d.u(i10, this.length + i10, eArr);
        }
    }

    /* JADX INFO: compiled from: ListBuilder.kt */
    public static final class a<E> implements ListIterator<E>, Ja.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ListBuilder<E> f42999b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f43000c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f43001d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f43002e;

        public a(ListBuilder<E> list, int i10) {
            i.e(list, "list");
            this.f42999b = list;
            this.f43000c = i10;
            this.f43001d = -1;
            this.f43002e = ((AbstractList) list).modCount;
        }

        public final void a() {
            if (((AbstractList) this.f42999b).modCount != this.f43002e) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public final void add(E e10) {
            a();
            int i10 = this.f43000c;
            this.f43000c = i10 + 1;
            ListBuilder<E> listBuilder = this.f42999b;
            listBuilder.add(i10, e10);
            this.f43001d = -1;
            this.f43002e = ((AbstractList) listBuilder).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f43000c < ((ListBuilder) this.f42999b).length;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f43000c > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final E next() {
            a();
            int i10 = this.f43000c;
            ListBuilder<E> listBuilder = this.f42999b;
            if (i10 >= ((ListBuilder) listBuilder).length) {
                throw new NoSuchElementException();
            }
            int i11 = this.f43000c;
            this.f43000c = i11 + 1;
            this.f43001d = i11;
            return (E) ((ListBuilder) listBuilder).backing[this.f43001d];
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f43000c;
        }

        @Override // java.util.ListIterator
        public final E previous() {
            a();
            int i10 = this.f43000c;
            if (i10 <= 0) {
                throw new NoSuchElementException();
            }
            int i11 = i10 - 1;
            this.f43000c = i11;
            this.f43001d = i11;
            return (E) ((ListBuilder) this.f42999b).backing[this.f43001d];
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f43000c - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            a();
            int i10 = this.f43001d;
            if (i10 == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }
            ListBuilder<E> listBuilder = this.f42999b;
            listBuilder.k(i10);
            this.f43000c = this.f43001d;
            this.f43001d = -1;
            this.f43002e = ((AbstractList) listBuilder).modCount;
        }

        @Override // java.util.ListIterator
        public final void set(E e10) {
            a();
            int i10 = this.f43001d;
            if (i10 == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
            this.f42999b.set(i10, e10);
        }
    }

    static {
        ListBuilder listBuilder = new ListBuilder(0);
        listBuilder.isReadOnly = true;
        f42994b = listBuilder;
    }

    public ListBuilder(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.backing = (E[]) new Object[i10];
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.isReadOnly) {
            return new SerializedCollection(0, this);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    public final void C(int i10, Collection<? extends E> collection, int i11) {
        ((AbstractList) this).modCount++;
        K(i10, i11);
        Iterator<? extends E> it = collection.iterator();
        for (int i12 = 0; i12 < i11; i12++) {
            this.backing[i10 + i12] = it.next();
        }
    }

    public final void G(int i10, E e10) {
        ((AbstractList) this).modCount++;
        K(i10, 1);
        this.backing[i10] = e10;
    }

    public final ListBuilder I() {
        J();
        this.isReadOnly = true;
        return this.length > 0 ? this : f42994b;
    }

    public final void J() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    public final void K(int i10, int i11) {
        int i12 = this.length + i11;
        if (i12 < 0) {
            throw new OutOfMemoryError();
        }
        E[] eArr = this.backing;
        if (i12 > eArr.length) {
            int length = eArr.length;
            int i13 = length + (length >> 1);
            if (i13 - i12 < 0) {
                i13 = i12;
            }
            if (i13 - 2147483639 > 0) {
                i13 = i12 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            E[] eArr2 = (E[]) Arrays.copyOf(eArr, i13);
            i.d(eArr2, "copyOf(...)");
            this.backing = eArr2;
        }
        E[] eArr3 = this.backing;
        Q3.d.n(i10 + i11, i10, this.length, eArr3, eArr3);
        this.length += i11;
    }

    public final E L(int i10) {
        ((AbstractList) this).modCount++;
        E[] eArr = this.backing;
        E e10 = eArr[i10];
        Q3.d.n(i10, i10 + 1, this.length, eArr, eArr);
        E[] eArr2 = this.backing;
        int i11 = this.length - 1;
        i.e(eArr2, "<this>");
        eArr2[i11] = null;
        this.length--;
        return e10;
    }

    public final void M(int i10, int i11) {
        if (i11 > 0) {
            ((AbstractList) this).modCount++;
        }
        E[] eArr = this.backing;
        Q3.d.n(i10, i10 + i11, this.length, eArr, eArr);
        E[] eArr2 = this.backing;
        int i12 = this.length;
        e.k(i12 - i11, i12, eArr2);
        this.length -= i11;
    }

    public final int N(int i10, int i11, Collection<? extends E> collection, boolean z10) {
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = i10 + i12;
            if (collection.contains(this.backing[i14]) == z10) {
                E[] eArr = this.backing;
                i12++;
                eArr[i13 + i10] = eArr[i14];
                i13++;
            } else {
                i12++;
            }
        }
        int i15 = i11 - i13;
        E[] eArr2 = this.backing;
        Q3.d.n(i10 + i13, i11 + i10, this.length, eArr2, eArr2);
        E[] eArr3 = this.backing;
        int i16 = this.length;
        e.k(i16 - i15, i16, eArr3);
        if (i15 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.length -= i15;
        return i15;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e10) {
        J();
        G(this.length, e10);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> elements) {
        i.e(elements, "elements");
        J();
        int size = elements.size();
        C(this.length, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        J();
        M(0, this.length);
    }

    @Override // kotlin.collections.d
    public final int e() {
        return this.length;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof List)) {
                return false;
            }
            if (!e.d(this.backing, 0, this.length, (List) obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i10) {
        int i11 = this.length;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(f.d(i10, i11, "index: ", ", size: "));
        }
        return this.backing[i10];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        E[] eArr = this.backing;
        int i10 = this.length;
        int iHashCode = 1;
        for (int i11 = 0; i11 < i10; i11++) {
            E e10 = eArr[i11];
            iHashCode = (iHashCode * 31) + (e10 != null ? e10.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i10 = 0; i10 < this.length; i10++) {
            if (i.a(this.backing[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.length == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.d
    public final E k(int i10) {
        J();
        int i11 = this.length;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(f.d(i10, i11, "index: ", ", size: "));
        }
        return L(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i10 = this.length - 1; i10 >= 0; i10--) {
            if (i.a(this.backing[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        J();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            k(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<? extends Object> elements) {
        i.e(elements, "elements");
        J();
        return N(0, this.length, elements, false) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<? extends Object> elements) {
        i.e(elements, "elements");
        J();
        return N(0, this.length, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i10, E e10) {
        J();
        int i11 = this.length;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(f.d(i10, i11, "index: ", ", size: "));
        }
        E[] eArr = this.backing;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        return e11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List<E> subList(int i10, int i11) {
        AbstractC2670b.a.b(i10, i11, this.length);
        return new BuilderSubList(this.backing, i10, i11 - i10, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] array) {
        i.e(array, "array");
        int length = array.length;
        int i10 = this.length;
        if (length < i10) {
            T[] tArr = (T[]) Arrays.copyOfRange(this.backing, 0, i10, array.getClass());
            i.d(tArr, "copyOfRange(...)");
            return tArr;
        }
        Q3.d.n(0, 0, i10, this.backing, array);
        M1.l(this.length, array);
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return e.e(this.backing, 0, this.length, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator(int i10) {
        int i11 = this.length;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(f.d(i10, i11, "index: ", ", size: "));
        }
        return new a(this, i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, E e10) {
        J();
        int i11 = this.length;
        if (i10 >= 0 && i10 <= i11) {
            G(i10, e10);
            return;
        }
        throw new IndexOutOfBoundsException(f.d(i10, i11, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection<? extends E> elements) {
        i.e(elements, "elements");
        J();
        int i11 = this.length;
        if (i10 >= 0 && i10 <= i11) {
            int size = elements.size();
            C(i10, elements, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(f.d(i10, i11, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return Q3.d.u(0, this.length, this.backing);
    }
}
