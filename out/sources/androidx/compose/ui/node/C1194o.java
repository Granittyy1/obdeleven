package androidx.compose.ui.node;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* JADX INFO: renamed from: androidx.compose.ui.node.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: HitTestResult.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1194o implements List<androidx.compose.ui.h.c>, Ja.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.collection.I<Object> f14591b = new androidx.collection.I<>(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.collection.D f14592c = new androidx.collection.D(16);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14593d = -1;

    /* JADX INFO: renamed from: androidx.compose.ui.node.o$b */
    /* JADX INFO: compiled from: HitTestResult.kt */
    public final class b implements List<androidx.compose.ui.h.c>, Ja.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f14598b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f14599c;

        public b(int i10, int i11) {
            this.f14598b = i10;
            this.f14599c = i11;
        }

        @Override // java.util.List
        public final /* bridge */ /* synthetic */ void add(int i10, androidx.compose.ui.h.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final boolean addAll(int i10, Collection<? extends androidx.compose.ui.h.c> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ /* synthetic */ void addLast(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            return (obj instanceof androidx.compose.ui.h.c) && indexOf((androidx.compose.ui.h.c) obj) != -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection<? extends Object> collection) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains((androidx.compose.ui.h.c) it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final androidx.compose.ui.h.c get(int i10) {
            Object objB = C1194o.this.f14591b.b(i10 + this.f14598b);
            kotlin.jvm.internal.i.c(objB, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (androidx.compose.ui.h.c) objB;
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            if (!(obj instanceof androidx.compose.ui.h.c)) {
                return -1;
            }
            androidx.compose.ui.h.c cVar = (androidx.compose.ui.h.c) obj;
            int i10 = this.f14598b;
            int i11 = this.f14599c;
            if (i10 > i11) {
                return -1;
            }
            int i12 = i10;
            while (!kotlin.jvm.internal.i.a(C1194o.this.f14591b.b(i12), cVar)) {
                if (i12 == i11) {
                    return -1;
                }
                i12++;
            }
            return i12 - i10;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return size() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<androidx.compose.ui.h.c> iterator() {
            int i10 = this.f14598b;
            return C1194o.this.new a(i10, i10, this.f14599c);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            if (!(obj instanceof androidx.compose.ui.h.c)) {
                return -1;
            }
            androidx.compose.ui.h.c cVar = (androidx.compose.ui.h.c) obj;
            int i10 = this.f14599c;
            int i11 = this.f14598b;
            if (i11 > i10) {
                return -1;
            }
            while (!kotlin.jvm.internal.i.a(C1194o.this.f14591b.b(i10), cVar)) {
                if (i10 == i11) {
                    return -1;
                }
                i10--;
            }
            return i10 - i11;
        }

        @Override // java.util.List
        public final ListIterator<androidx.compose.ui.h.c> listIterator() {
            int i10 = this.f14598b;
            return C1194o.this.new a(i10, i10, this.f14599c);
        }

        @Override // java.util.List
        public final /* bridge */ /* synthetic */ androidx.compose.ui.h.c remove(int i10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ /* synthetic */ Object removeFirst() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ /* synthetic */ Object removeLast() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final void replaceAll(UnaryOperator<androidx.compose.ui.h.c> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final /* bridge */ /* synthetic */ androidx.compose.ui.h.c set(int i10, androidx.compose.ui.h.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.f14599c - this.f14598b;
        }

        @Override // java.util.List
        public final void sort(Comparator<? super androidx.compose.ui.h.c> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final List<androidx.compose.ui.h.c> subList(int i10, int i11) {
            int i12 = this.f14598b;
            return C1194o.this.new b(i10 + i12, i12 + i11);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return kotlin.jvm.internal.d.a(this);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends androidx.compose.ui.h.c> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final ListIterator<androidx.compose.ui.h.c> listIterator(int i10) {
            int i11 = this.f14598b;
            int i12 = this.f14599c;
            return C1194o.this.new a(i10 + i11, i11, i12);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) kotlin.jvm.internal.d.b(this, tArr);
        }
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, androidx.compose.ui.h.c cVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection<? extends androidx.compose.ui.h.c> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f14593d = -1;
        this.f14591b.i();
        this.f14592c.f9198b = 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof androidx.compose.ui.h.c) && indexOf((androidx.compose.ui.h.c) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((androidx.compose.ui.h.c) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final long e() {
        long jI = O3.d.i(Float.POSITIVE_INFINITY, false, false);
        int i10 = this.f14593d + 1;
        int iR = kotlin.collections.l.r(this);
        if (i10 <= iR) {
            while (true) {
                androidx.collection.D d10 = this.f14592c;
                if (i10 < 0) {
                    d10.getClass();
                    break;
                }
                if (i10 >= d10.f9198b) {
                    break;
                }
                long j = d10.f9197a[i10];
                if (C1189j.a(j, jI) < 0) {
                    jI = j;
                }
                if (C1189j.b(jI) < 0.0f && C1189j.d(jI)) {
                    return jI;
                }
                if (i10 != iR) {
                    i10++;
                }
            }
            D9.o.r("Index must be between 0 and size");
            throw null;
        }
        return jI;
    }

    @Override // java.util.List
    public final androidx.compose.ui.h.c get(int i10) {
        Object objB = this.f14591b.b(i10);
        kotlin.jvm.internal.i.c(objB, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (androidx.compose.ui.h.c) objB;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof androidx.compose.ui.h.c)) {
            return -1;
        }
        androidx.compose.ui.h.c cVar = (androidx.compose.ui.h.c) obj;
        int iR = kotlin.collections.l.r(this);
        if (iR < 0) {
            return -1;
        }
        int i10 = 0;
        while (!kotlin.jvm.internal.i.a(this.f14591b.b(i10), cVar)) {
            if (i10 == iR) {
                return -1;
            }
            i10++;
        }
        return i10;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f14591b.d();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<androidx.compose.ui.h.c> iterator() {
        return new a(this, 0, 7);
    }

    public final void k(int i10, int i11) {
        if (i10 >= i11) {
            return;
        }
        this.f14591b.l(i10, i11);
        androidx.collection.D d10 = this.f14592c;
        if (i10 >= 0) {
            int i12 = d10.f9198b;
            if (i10 <= i12 && i11 >= 0 && i11 <= i12) {
                if (i11 < i10) {
                    D9.o.q("The end index must be < start index");
                    throw null;
                }
                if (i11 != i10) {
                    if (i11 < i12) {
                        long[] jArr = d10.f9197a;
                        Q3.d.p(jArr, jArr, i10, i11, i12);
                    }
                    d10.f9198b -= i11 - i10;
                    return;
                }
                return;
            }
        } else {
            d10.getClass();
        }
        D9.o.r("Index must be between 0 and size");
        throw null;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof androidx.compose.ui.h.c)) {
            return -1;
        }
        androidx.compose.ui.h.c cVar = (androidx.compose.ui.h.c) obj;
        for (int iR = kotlin.collections.l.r(this); -1 < iR; iR--) {
            if (kotlin.jvm.internal.i.a(this.f14591b.b(iR), cVar)) {
                return iR;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator<androidx.compose.ui.h.c> listIterator() {
        return new a(this, 0, 7);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ androidx.compose.ui.h.c remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<androidx.compose.ui.h.c> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ androidx.compose.ui.h.c set(int i10, androidx.compose.ui.h.c cVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f14591b.f9109b;
    }

    @Override // java.util.List
    public final void sort(Comparator<? super androidx.compose.ui.h.c> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<androidx.compose.ui.h.c> subList(int i10, int i11) {
        return new b(i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.d.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends androidx.compose.ui.h.c> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator<androidx.compose.ui.h.c> listIterator(int i10) {
        return new a(this, i10, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) kotlin.jvm.internal.d.b(this, tArr);
    }

    /* JADX INFO: renamed from: androidx.compose.ui.node.o$a */
    /* JADX INFO: compiled from: HitTestResult.kt */
    public final class a implements ListIterator<androidx.compose.ui.h.c>, Ja.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14594b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f14595c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f14596d;

        public a(C1194o c1194o, int i10, int i11) {
            this((i11 & 1) != 0 ? 0 : i10, 0, c1194o.f14591b.f9109b);
        }

        @Override // java.util.ListIterator
        public final /* bridge */ /* synthetic */ void add(androidx.compose.ui.h.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f14594b < this.f14596d;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f14594b > this.f14595c;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            androidx.collection.I<Object> i10 = C1194o.this.f14591b;
            int i11 = this.f14594b;
            this.f14594b = i11 + 1;
            Object objB = i10.b(i11);
            kotlin.jvm.internal.i.c(objB, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (androidx.compose.ui.h.c) objB;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f14594b - this.f14595c;
        }

        @Override // java.util.ListIterator
        public final androidx.compose.ui.h.c previous() {
            androidx.collection.I<Object> i10 = C1194o.this.f14591b;
            int i11 = this.f14594b - 1;
            this.f14594b = i11;
            Object objB = i10.b(i11);
            kotlin.jvm.internal.i.c(objB, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (androidx.compose.ui.h.c) objB;
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return (this.f14594b - this.f14595c) - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final /* bridge */ /* synthetic */ void set(androidx.compose.ui.h.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public a(int i10, int i11, int i12) {
            this.f14594b = i10;
            this.f14595c = i11;
            this.f14596d = i12;
        }
    }
}
