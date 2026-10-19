package androidx.compose.runtime.collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.collections.l;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: MutableVector.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c<T> implements RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T[] f12943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f12944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12945d = 0;

    /* JADX INFO: compiled from: MutableVector.kt */
    public static final class a<T> implements List<T>, Ja.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c<T> f12946b;

        public a(c<T> cVar) {
            this.f12946b = cVar;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(T t8) {
            this.f12946b.b(t8);
            return true;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends T> collection) {
            c<T> cVar = this.f12946b;
            return cVar.g(cVar.f12945d, collection);
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            this.f12946b.j();
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            return this.f12946b.k(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection<? extends Object> collection) {
            c<T> cVar = this.f12946b;
            cVar.getClass();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!cVar.k(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final T get(int i10) {
            d.a(i10, this);
            return this.f12946b.f12943b[i10];
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            return this.f12946b.l(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.f12946b.f12945d == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<T> iterator() {
            return new C0152c(this, 0);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            c<T> cVar = this.f12946b;
            T[] tArr = cVar.f12943b;
            for (int i10 = cVar.f12945d - 1; i10 >= 0; i10--) {
                if (i.a(obj, tArr[i10])) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator() {
            return new C0152c(this, 0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            return this.f12946b.m(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<? extends Object> collection) {
            c<T> cVar = this.f12946b;
            cVar.getClass();
            if (collection.isEmpty()) {
                return false;
            }
            int i10 = cVar.f12945d;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                cVar.m(it.next());
            }
            return i10 != cVar.f12945d;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<? extends Object> collection) {
            c<T> cVar = this.f12946b;
            int i10 = cVar.f12945d;
            for (int i11 = i10 - 1; -1 < i11; i11--) {
                if (!collection.contains(cVar.f12943b[i11])) {
                    cVar.p(i11);
                }
            }
            return i10 != cVar.f12945d;
        }

        @Override // java.util.List
        public final T set(int i10, T t8) {
            d.a(i10, this);
            T[] tArr = this.f12946b.f12943b;
            T t10 = tArr[i10];
            tArr[i10] = t8;
            return t10;
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.f12946b.f12945d;
        }

        @Override // java.util.List
        public final List<T> subList(int i10, int i11) {
            d.b(i10, i11, this);
            return new b(i10, i11, this);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return kotlin.jvm.internal.d.a(this);
        }

        @Override // java.util.List
        public final void add(int i10, T t8) {
            this.f12946b.a(i10, t8);
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator(int i10) {
            return new C0152c(this, i10);
        }

        @Override // java.util.List
        public final T remove(int i10) {
            d.a(i10, this);
            return this.f12946b.p(i10);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) kotlin.jvm.internal.d.b(this, tArr);
        }

        @Override // java.util.List
        public final boolean addAll(int i10, Collection<? extends T> collection) {
            return this.f12946b.g(i10, collection);
        }
    }

    /* JADX INFO: compiled from: MutableVector.kt */
    public static final class b<T> implements List<T>, Ja.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f12947b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f12948c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f12949d;

        public b(int i10, int i11, List list) {
            this.f12947b = list;
            this.f12948c = i10;
            this.f12949d = i11;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean add(T t8) {
            int i10 = this.f12949d;
            this.f12949d = i10 + 1;
            this.f12947b.add(i10, t8);
            return true;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final boolean addAll(int i10, Collection<? extends T> collection) {
            this.f12947b.addAll(i10 + this.f12948c, collection);
            int size = collection.size();
            this.f12949d += size;
            return size > 0;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final void clear() {
            int i10 = this.f12949d - 1;
            int i11 = this.f12948c;
            if (i11 <= i10) {
                while (true) {
                    this.f12947b.remove(i10);
                    if (i10 == i11) {
                        break;
                    } else {
                        i10--;
                    }
                }
            }
            this.f12949d = i11;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            int i10 = this.f12949d;
            for (int i11 = this.f12948c; i11 < i10; i11++) {
                if (i.a(this.f12947b.get(i11), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection<? extends Object> collection) {
            Iterator<T> it = collection.iterator();
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
            d.a(i10, this);
            return (T) this.f12947b.get(i10 + this.f12948c);
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final int indexOf(Object obj) {
            int i10 = this.f12949d;
            int i11 = this.f12948c;
            for (int i12 = i11; i12 < i10; i12++) {
                if (i.a(this.f12947b.get(i12), obj)) {
                    return i12 - i11;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.f12949d == this.f12948c;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<T> iterator() {
            return new C0152c(this, 0);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            int i10 = this.f12949d - 1;
            int i11 = this.f12948c;
            if (i11 > i10) {
                return -1;
            }
            while (!i.a(this.f12947b.get(i10), obj)) {
                if (i10 == i11) {
                    return -1;
                }
                i10--;
            }
            return i10 - i11;
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator() {
            return new C0152c(this, 0);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            int i10 = this.f12949d;
            for (int i11 = this.f12948c; i11 < i10; i11++) {
                ?? r10 = this.f12947b;
                if (i.a(r10.get(i11), obj)) {
                    r10.remove(i11);
                    this.f12949d--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<? extends Object> collection) {
            int i10 = this.f12949d;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i10 != this.f12949d;
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<? extends Object> collection) {
            int i10 = this.f12949d;
            int i11 = i10 - 1;
            int i12 = this.f12948c;
            if (i12 <= i11) {
                while (true) {
                    ?? r10 = this.f12947b;
                    if (!collection.contains(r10.get(i11))) {
                        r10.remove(i11);
                        this.f12949d--;
                    }
                    if (i11 == i12) {
                        break;
                    }
                    i11--;
                }
            }
            return i10 != this.f12949d;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final T set(int i10, T t8) {
            d.a(i10, this);
            return (T) this.f12947b.set(i10 + this.f12948c, t8);
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.f12949d - this.f12948c;
        }

        @Override // java.util.List
        public final List<T> subList(int i10, int i11) {
            d.b(i10, i11, this);
            return new b(i10, i11, this);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return kotlin.jvm.internal.d.a(this);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final void add(int i10, T t8) {
            this.f12947b.add(i10 + this.f12948c, t8);
            this.f12949d++;
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator(int i10) {
            return new C0152c(this, i10);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) kotlin.jvm.internal.d.b(this, tArr);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends T> collection) {
            this.f12947b.addAll(this.f12949d, collection);
            int size = collection.size();
            this.f12949d += size;
            return size > 0;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final T remove(int i10) {
            d.a(i10, this);
            T t8 = (T) this.f12947b.remove(i10 + this.f12948c);
            this.f12949d--;
            return t8;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.collection.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MutableVector.kt */
    public static final class C0152c<T> implements ListIterator<T>, Ja.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f12950b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f12951c;

        public C0152c(List<T> list, int i10) {
            this.f12950b = list;
            this.f12951c = i10;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator
        public final void add(T t8) {
            this.f12950b.add(this.f12951c, t8);
            this.f12951c++;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f12951c < this.f12950b.size();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f12951c > 0;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            int i10 = this.f12951c;
            this.f12951c = i10 + 1;
            return (T) this.f12950b.get(i10);
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f12951c;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator
        public final T previous() {
            int i10 = this.f12951c - 1;
            this.f12951c = i10;
            return (T) this.f12950b.get(i10);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f12951c - 1;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            int i10 = this.f12951c - 1;
            this.f12951c = i10;
            this.f12950b.remove(i10);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator
        public final void set(T t8) {
            this.f12950b.set(this.f12951c, t8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(Object[] objArr) {
        this.f12943b = objArr;
    }

    public final void a(int i10, T t8) {
        int i11 = this.f12945d + 1;
        if (this.f12943b.length < i11) {
            r(i11);
        }
        T[] tArr = this.f12943b;
        int i12 = this.f12945d;
        if (i10 != i12) {
            System.arraycopy(tArr, i10, tArr, i10 + 1, i12 - i10);
        }
        tArr[i10] = t8;
        this.f12945d++;
    }

    public final void b(Object obj) {
        int i10 = this.f12945d + 1;
        if (this.f12943b.length < i10) {
            r(i10);
        }
        Object[] objArr = (T[]) this.f12943b;
        int i11 = this.f12945d;
        objArr[i11] = obj;
        this.f12945d = i11 + 1;
    }

    public final void d(int i10, c cVar) {
        int i11 = cVar.f12945d;
        if (i11 == 0) {
            return;
        }
        int i12 = this.f12945d + i11;
        if (this.f12943b.length < i12) {
            r(i12);
        }
        T[] tArr = this.f12943b;
        int i13 = this.f12945d;
        if (i10 != i13) {
            System.arraycopy(tArr, i10, tArr, i10 + i11, i13 - i10);
        }
        System.arraycopy(cVar.f12943b, 0, tArr, i10, i11);
        this.f12945d += i11;
    }

    public final void e(int i10, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i11 = this.f12945d + size;
        if (this.f12943b.length < i11) {
            r(i11);
        }
        Object[] objArr = (T[]) this.f12943b;
        int i12 = this.f12945d;
        if (i10 != i12) {
            System.arraycopy(objArr, i10, objArr, i10 + size, i12 - i10);
        }
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            objArr[i10 + i13] = list.get(i13);
        }
        this.f12945d += size;
    }

    public final boolean g(int i10, Collection<? extends T> collection) {
        int i11 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i12 = this.f12945d + size;
        if (this.f12943b.length < i12) {
            r(i12);
        }
        T[] tArr = this.f12943b;
        int i13 = this.f12945d;
        if (i10 != i13) {
            System.arraycopy(tArr, i10, tArr, i10 + size, i13 - i10);
        }
        for (T t8 : collection) {
            int i14 = i11 + 1;
            if (i11 < 0) {
                l.x();
                throw null;
            }
            tArr[i11 + i10] = t8;
            i11 = i14;
        }
        this.f12945d += size;
        return true;
    }

    public final List<T> i() {
        a aVar = this.f12944c;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(this);
        this.f12944c = aVar2;
        return aVar2;
    }

    public final void j() {
        T[] tArr = this.f12943b;
        int i10 = this.f12945d;
        for (int i11 = 0; i11 < i10; i11++) {
            tArr[i11] = null;
        }
        this.f12945d = 0;
    }

    public final boolean k(T t8) {
        int i10 = this.f12945d - 1;
        if (i10 >= 0) {
            for (int i11 = 0; !i.a(this.f12943b[i11], t8); i11++) {
                if (i11 != i10) {
                }
            }
            return true;
        }
        return false;
    }

    public final int l(T t8) {
        T[] tArr = this.f12943b;
        int i10 = this.f12945d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i.a(t8, tArr[i11])) {
                return i11;
            }
        }
        return -1;
    }

    public final boolean m(T t8) {
        int iL = l(t8);
        if (iL < 0) {
            return false;
        }
        p(iL);
        return true;
    }

    public final T p(int i10) {
        T[] tArr = this.f12943b;
        T t8 = tArr[i10];
        int i11 = this.f12945d;
        if (i10 != i11 - 1) {
            int i12 = i10 + 1;
            System.arraycopy(tArr, i12, tArr, i10, i11 - i12);
        }
        int i13 = this.f12945d - 1;
        this.f12945d = i13;
        tArr[i13] = null;
        return t8;
    }

    public final void q(int i10, int i11) {
        if (i11 > i10) {
            int i12 = this.f12945d;
            if (i11 < i12) {
                T[] tArr = this.f12943b;
                System.arraycopy(tArr, i11, tArr, i10, i12 - i11);
            }
            int i13 = this.f12945d;
            int i14 = i13 - (i11 - i10);
            int i15 = i13 - 1;
            if (i14 <= i15) {
                int i16 = i14;
                while (true) {
                    this.f12943b[i16] = null;
                    if (i16 == i15) {
                        break;
                    } else {
                        i16++;
                    }
                }
            }
            this.f12945d = i14;
        }
    }

    public final void r(int i10) {
        T[] tArr = this.f12943b;
        int length = tArr.length;
        T[] tArr2 = (T[]) new Object[Math.max(i10, length * 2)];
        System.arraycopy(tArr, 0, tArr2, 0, length);
        this.f12943b = tArr2;
    }

    public final void s(Comparator<T> comparator) {
        Arrays.sort(this.f12943b, 0, this.f12945d, comparator);
    }
}
