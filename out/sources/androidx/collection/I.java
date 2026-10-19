package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: ObjectList.kt */
/* JADX INFO: loaded from: classes.dex */
public final class I<E> extends ObjectList<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b<E> f9078c;

    /* JADX INFO: compiled from: ObjectList.kt */
    public static final class a<T> implements ListIterator<T>, Ja.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f9079b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f9080c;

        public a(List<T> list, int i10) {
            this.f9079b = list;
            this.f9080c = i10 - 1;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator
        public final void add(T t8) {
            int i10 = this.f9080c + 1;
            this.f9080c = i10;
            this.f9079b.add(i10, t8);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f9080c < this.f9079b.size() - 1;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f9080c >= 0;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            int i10 = this.f9080c + 1;
            this.f9080c = i10;
            return (T) this.f9079b.get(i10);
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f9080c + 1;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator
        public final T previous() {
            int i10 = this.f9080c;
            this.f9080c = i10 - 1;
            return (T) this.f9079b.get(i10);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f9080c;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            this.f9079b.remove(this.f9080c);
            this.f9080c--;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator
        public final void set(T t8) {
            this.f9079b.set(this.f9080c, t8);
        }
    }

    /* JADX INFO: compiled from: ObjectList.kt */
    public static final class b<T> implements List<T>, Ja.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final I<T> f9081b;

        public b(I<T> objectList) {
            kotlin.jvm.internal.i.e(objectList, "objectList");
            this.f9081b = objectList;
        }

        @Override // java.util.List
        public final void add(int i10, T t8) {
            int i11;
            I<T> i12 = this.f9081b;
            if (i10 < 0 || i10 > (i11 = i12.f9109b)) {
                i12.getClass();
                D9.o.r("Index " + i10 + " must be in 0.." + i12.f9109b);
                throw null;
            }
            int i13 = i11 + 1;
            Object[] objArr = i12.f9108a;
            if (objArr.length < i13) {
                i12.m(i13, objArr);
            }
            Object[] objArr2 = i12.f9108a;
            int i14 = i12.f9109b;
            if (i10 != i14) {
                Q3.d.n(i10 + 1, i10, i14, objArr2, objArr2);
            }
            objArr2[i10] = t8;
            i12.f9109b++;
        }

        @Override // java.util.List
        public final boolean addAll(int i10, Collection<? extends T> elements) {
            kotlin.jvm.internal.i.e(elements, "elements");
            I<T> i11 = this.f9081b;
            i11.getClass();
            if (i10 < 0 || i10 > i11.f9109b) {
                StringBuilder sbE = A8.f.e(i10, "Index ", " must be in 0..");
                sbE.append(i11.f9109b);
                D9.o.r(sbE.toString());
                throw null;
            }
            int i12 = 0;
            if (elements.isEmpty()) {
                return false;
            }
            int size = elements.size() + i11.f9109b;
            Object[] objArr = i11.f9108a;
            if (objArr.length < size) {
                i11.m(size, objArr);
            }
            Object[] objArr2 = i11.f9108a;
            if (i10 != i11.f9109b) {
                Q3.d.n(elements.size() + i10, i10, i11.f9109b, objArr2, objArr2);
            }
            for (T t8 : elements) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    kotlin.collections.l.x();
                    throw null;
                }
                objArr2[i12 + i10] = t8;
                i12 = i13;
            }
            i11.f9109b = elements.size() + i11.f9109b;
            return true;
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            this.f9081b.i();
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            return this.f9081b.c(obj) >= 0;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection<? extends Object> elements) {
            kotlin.jvm.internal.i.e(elements, "elements");
            I<T> i10 = this.f9081b;
            i10.getClass();
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (i10.c(it.next()) < 0) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final T get(int i10) {
            Q.a(i10, this);
            return this.f9081b.b(i10);
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            return this.f9081b.c(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.f9081b.d();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<T> iterator() {
            return new a(this, 0);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            int i10;
            I<T> i11 = this.f9081b;
            if (obj == null) {
                Object[] objArr = i11.f9108a;
                i10 = i11.f9109b - 1;
                while (-1 < i10) {
                    if (objArr[i10] != null) {
                        i10--;
                    }
                }
                return -1;
            }
            Object[] objArr2 = i11.f9108a;
            i10 = i11.f9109b - 1;
            while (-1 < i10) {
                if (!obj.equals(objArr2[i10])) {
                    i10--;
                }
            }
            return -1;
            return i10;
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator() {
            return new a(this, 0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            return this.f9081b.j(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<? extends Object> elements) {
            kotlin.jvm.internal.i.e(elements, "elements");
            I<T> i10 = this.f9081b;
            i10.getClass();
            int i11 = i10.f9109b;
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                i10.j(it.next());
            }
            return i11 != i10.f9109b;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<? extends Object> elements) {
            kotlin.jvm.internal.i.e(elements, "elements");
            I<T> i10 = this.f9081b;
            i10.getClass();
            int i11 = i10.f9109b;
            Object[] objArr = i10.f9108a;
            for (int i12 = i11 - 1; -1 < i12; i12--) {
                if (!elements.contains(objArr[i12])) {
                    i10.k(i12);
                }
            }
            return i11 != i10.f9109b;
        }

        @Override // java.util.List
        public final T set(int i10, T t8) {
            Q.a(i10, this);
            I<T> i11 = this.f9081b;
            if (i10 < 0 || i10 >= i11.f9109b) {
                i11.f(i10);
                throw null;
            }
            Object[] objArr = i11.f9108a;
            T t10 = (T) objArr[i10];
            objArr[i10] = t8;
            return t10;
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.f9081b.f9109b;
        }

        @Override // java.util.List
        public final List<T> subList(int i10, int i11) {
            Q.b(i10, i11, this);
            return new c(i10, i11, this);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return kotlin.jvm.internal.d.a(this);
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator(int i10) {
            return new a(this, i10);
        }

        @Override // java.util.List
        public final T remove(int i10) {
            Q.a(i10, this);
            return this.f9081b.k(i10);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] array) {
            kotlin.jvm.internal.i.e(array, "array");
            return (T[]) kotlin.jvm.internal.d.b(this, array);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(T t8) {
            this.f9081b.g(t8);
            return true;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends T> elements) {
            kotlin.jvm.internal.i.e(elements, "elements");
            I<T> i10 = this.f9081b;
            i10.getClass();
            int i11 = i10.f9109b;
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                i10.g(it.next());
            }
            return i11 != i10.f9109b;
        }
    }

    /* JADX INFO: compiled from: ObjectList.kt */
    public static final class c<T> implements List<T>, Ja.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f9082b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f9083c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f9084d;

        public c(int i10, int i11, List list) {
            this.f9082b = list;
            this.f9083c = i10;
            this.f9084d = i11;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean add(T t8) {
            int i10 = this.f9084d;
            this.f9084d = i10 + 1;
            this.f9082b.add(i10, t8);
            return true;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final boolean addAll(int i10, Collection<? extends T> elements) {
            kotlin.jvm.internal.i.e(elements, "elements");
            this.f9082b.addAll(i10 + this.f9083c, elements);
            this.f9084d = elements.size() + this.f9084d;
            return elements.size() > 0;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final void clear() {
            int i10 = this.f9084d - 1;
            int i11 = this.f9083c;
            if (i11 <= i10) {
                while (true) {
                    this.f9082b.remove(i10);
                    if (i10 == i11) {
                        break;
                    } else {
                        i10--;
                    }
                }
            }
            this.f9084d = i11;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            int i10 = this.f9084d;
            for (int i11 = this.f9083c; i11 < i10; i11++) {
                if (kotlin.jvm.internal.i.a(this.f9082b.get(i11), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection<? extends Object> elements) {
            kotlin.jvm.internal.i.e(elements, "elements");
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final T get(int i10) {
            Q.a(i10, this);
            return (T) this.f9082b.get(i10 + this.f9083c);
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final int indexOf(Object obj) {
            int i10 = this.f9084d;
            int i11 = this.f9083c;
            for (int i12 = i11; i12 < i10; i12++) {
                if (kotlin.jvm.internal.i.a(this.f9082b.get(i12), obj)) {
                    return i12 - i11;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.f9084d == this.f9083c;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<T> iterator() {
            return new a(this, 0);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            int i10 = this.f9084d - 1;
            int i11 = this.f9083c;
            if (i11 > i10) {
                return -1;
            }
            while (!kotlin.jvm.internal.i.a(this.f9082b.get(i10), obj)) {
                if (i10 == i11) {
                    return -1;
                }
                i10--;
            }
            return i10 - i11;
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator() {
            return new a(this, 0);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            int i10 = this.f9084d;
            for (int i11 = this.f9083c; i11 < i10; i11++) {
                ?? r10 = this.f9082b;
                if (kotlin.jvm.internal.i.a(r10.get(i11), obj)) {
                    r10.remove(i11);
                    this.f9084d--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<? extends Object> elements) {
            kotlin.jvm.internal.i.e(elements, "elements");
            int i10 = this.f9084d;
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i10 != this.f9084d;
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<? extends Object> elements) {
            kotlin.jvm.internal.i.e(elements, "elements");
            int i10 = this.f9084d;
            int i11 = i10 - 1;
            int i12 = this.f9083c;
            if (i12 <= i11) {
                while (true) {
                    ?? r10 = this.f9082b;
                    if (!elements.contains(r10.get(i11))) {
                        r10.remove(i11);
                        this.f9084d--;
                    }
                    if (i11 == i12) {
                        break;
                    }
                    i11--;
                }
            }
            return i10 != this.f9084d;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final T set(int i10, T t8) {
            Q.a(i10, this);
            return (T) this.f9082b.set(i10 + this.f9083c, t8);
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.f9084d - this.f9083c;
        }

        @Override // java.util.List
        public final List<T> subList(int i10, int i11) {
            Q.b(i10, i11, this);
            return new c(i10, i11, this);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return kotlin.jvm.internal.d.a(this);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final void add(int i10, T t8) {
            this.f9082b.add(i10 + this.f9083c, t8);
            this.f9084d++;
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator(int i10) {
            return new a(this, i10);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] array) {
            kotlin.jvm.internal.i.e(array, "array");
            return (T[]) kotlin.jvm.internal.d.b(this, array);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends T> elements) {
            kotlin.jvm.internal.i.e(elements, "elements");
            this.f9082b.addAll(this.f9084d, elements);
            this.f9084d = elements.size() + this.f9084d;
            return elements.size() > 0;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final T remove(int i10) {
            Q.a(i10, this);
            T t8 = (T) this.f9082b.remove(i10 + this.f9083c);
            this.f9084d--;
            return t8;
        }
    }

    public I() {
        this((Object) null);
    }

    public final void g(Object obj) {
        int i10 = this.f9109b + 1;
        Object[] objArr = this.f9108a;
        if (objArr.length < i10) {
            m(i10, objArr);
        }
        Object[] objArr2 = this.f9108a;
        int i11 = this.f9109b;
        objArr2[i11] = obj;
        this.f9109b = i11 + 1;
    }

    public final void h(List elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        if (elements.isEmpty()) {
            return;
        }
        int i10 = this.f9109b;
        int size = elements.size() + i10;
        Object[] objArr = this.f9108a;
        if (objArr.length < size) {
            m(size, objArr);
        }
        Object[] objArr2 = this.f9108a;
        int size2 = elements.size();
        for (int i11 = 0; i11 < size2; i11++) {
            objArr2[i11 + i10] = elements.get(i11);
        }
        this.f9109b = elements.size() + this.f9109b;
    }

    public final void i() {
        Q3.d.w(this.f9108a, null, 0, this.f9109b);
        this.f9109b = 0;
    }

    public final boolean j(E e10) {
        int iC = c(e10);
        if (iC < 0) {
            return false;
        }
        k(iC);
        return true;
    }

    public final E k(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f9109b)) {
            f(i10);
            throw null;
        }
        Object[] objArr = this.f9108a;
        E e10 = (E) objArr[i10];
        if (i10 != i11 - 1) {
            Q3.d.n(i10, i10 + 1, i11, objArr, objArr);
        }
        int i12 = this.f9109b - 1;
        this.f9109b = i12;
        objArr[i12] = null;
        return e10;
    }

    public final void l(int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 > (i12 = this.f9109b) || i11 < 0 || i11 > i12) {
            StringBuilder sbA = B6.a.a("Start (", ") and end (", ") must be in 0..", i10, i11);
            sbA.append(this.f9109b);
            D9.o.r(sbA.toString());
            throw null;
        }
        if (i11 < i10) {
            D9.o.q("Start (" + i10 + ") is more than end (" + i11 + ')');
            throw null;
        }
        if (i11 != i10) {
            if (i11 < i12) {
                Object[] objArr = this.f9108a;
                Q3.d.n(i10, i11, i12, objArr, objArr);
            }
            int i13 = this.f9109b;
            int i14 = i13 - (i11 - i10);
            Q3.d.w(this.f9108a, null, i14, i13);
            this.f9109b = i14;
        }
    }

    public final void m(int i10, Object[] oldContent) {
        kotlin.jvm.internal.i.e(oldContent, "oldContent");
        int length = oldContent.length;
        Object[] objArr = new Object[Math.max(i10, (length * 3) / 2)];
        Q3.d.n(0, 0, length, oldContent, objArr);
        this.f9108a = objArr;
    }

    public I(int i10) {
        this.f9108a = i10 == 0 ? Q.f9119a : new Object[i10];
    }

    public /* synthetic */ I(Object obj) {
        this(16);
    }
}
