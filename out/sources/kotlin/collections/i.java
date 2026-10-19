package kotlin.collections;

import com.google.android.gms.internal.measurement.M1;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: ArrayDeque.kt */
/* JADX INFO: loaded from: classes.dex */
public final class i<E> extends d<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object[] f43016e = new Object[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f43017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f43018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f43019d;

    public i(int i10) {
        Object[] objArr;
        if (i10 == 0) {
            objArr = f43016e;
        } else {
            if (i10 <= 0) {
                throw new IllegalArgumentException(J4.i.b(i10, "Illegal Capacity: "));
            }
            objArr = new Object[i10];
        }
        this.f43018c = objArr;
    }

    public final E A() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.f43018c[this.f43017b];
    }

    public final int B(int i10) {
        if (i10 == k.S(this.f43018c)) {
            return 0;
        }
        return i10 + 1;
    }

    public final E C() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.f43018c[J(l.r(this) + this.f43017b)];
    }

    public final int G(int i10) {
        return i10 < 0 ? i10 + this.f43018c.length : i10;
    }

    public final void I(int i10, int i11) {
        if (i10 < i11) {
            Q3.d.w(this.f43018c, null, i10, i11);
            return;
        }
        Object[] objArr = this.f43018c;
        Arrays.fill(objArr, i10, objArr.length, (Object) null);
        Q3.d.w(this.f43018c, null, 0, i11);
    }

    public final int J(int i10) {
        Object[] objArr = this.f43018c;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    public final void K() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, E e10) {
        int i11 = this.f43019d;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(A8.f.d(i10, i11, "index: ", ", size: "));
        }
        if (i10 == i11) {
            addLast(e10);
            return;
        }
        if (i10 == 0) {
            addFirst(e10);
            return;
        }
        K();
        v(this.f43019d + 1);
        int iJ = J(this.f43017b + i10);
        int i12 = this.f43019d;
        if (i10 < ((i12 + 1) >> 1)) {
            int iS = iJ == 0 ? k.S(this.f43018c) : iJ - 1;
            int i13 = this.f43017b;
            int iS2 = i13 == 0 ? k.S(this.f43018c) : i13 - 1;
            int i14 = this.f43017b;
            if (iS >= i14) {
                Object[] objArr = this.f43018c;
                objArr[iS2] = objArr[i14];
                Q3.d.n(i14, i14 + 1, iS + 1, objArr, objArr);
            } else {
                Object[] objArr2 = this.f43018c;
                Q3.d.n(i14 - 1, i14, objArr2.length, objArr2, objArr2);
                Object[] objArr3 = this.f43018c;
                objArr3[objArr3.length - 1] = objArr3[0];
                Q3.d.n(0, 1, iS + 1, objArr3, objArr3);
            }
            this.f43018c[iS] = e10;
            this.f43017b = iS2;
        } else {
            int iJ2 = J(i12 + this.f43017b);
            if (iJ < iJ2) {
                Object[] objArr4 = this.f43018c;
                Q3.d.n(iJ + 1, iJ, iJ2, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.f43018c;
                Q3.d.n(1, 0, iJ2, objArr5, objArr5);
                Object[] objArr6 = this.f43018c;
                objArr6[0] = objArr6[objArr6.length - 1];
                Q3.d.n(iJ + 1, iJ, objArr6.length - 1, objArr6, objArr6);
            }
            this.f43018c[iJ] = e10;
        }
        this.f43019d++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection<? extends E> elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        int i11 = this.f43019d;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(A8.f.d(i10, i11, "index: ", ", size: "));
        }
        if (elements.isEmpty()) {
            return false;
        }
        if (i10 == this.f43019d) {
            return addAll(elements);
        }
        K();
        v(elements.size() + this.f43019d);
        int iJ = J(this.f43019d + this.f43017b);
        int iJ2 = J(this.f43017b + i10);
        int size = elements.size();
        if (i10 < ((this.f43019d + 1) >> 1)) {
            int i12 = this.f43017b;
            int length = i12 - size;
            if (iJ2 < i12) {
                Object[] objArr = this.f43018c;
                Q3.d.n(length, i12, objArr.length, objArr, objArr);
                if (size >= iJ2) {
                    Object[] objArr2 = this.f43018c;
                    Q3.d.n(objArr2.length - size, 0, iJ2, objArr2, objArr2);
                } else {
                    Object[] objArr3 = this.f43018c;
                    Q3.d.n(objArr3.length - size, 0, size, objArr3, objArr3);
                    Object[] objArr4 = this.f43018c;
                    Q3.d.n(0, size, iJ2, objArr4, objArr4);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f43018c;
                Q3.d.n(length, i12, iJ2, objArr5, objArr5);
            } else {
                Object[] objArr6 = this.f43018c;
                length += objArr6.length;
                int i13 = iJ2 - i12;
                int length2 = objArr6.length - length;
                if (length2 >= i13) {
                    Q3.d.n(length, i12, iJ2, objArr6, objArr6);
                } else {
                    Q3.d.n(length, i12, i12 + length2, objArr6, objArr6);
                    Object[] objArr7 = this.f43018c;
                    Q3.d.n(0, this.f43017b + length2, iJ2, objArr7, objArr7);
                }
            }
            this.f43017b = length;
            q(G(iJ2 - size), elements);
        } else {
            int i14 = iJ2 + size;
            if (iJ2 < iJ) {
                int i15 = size + iJ;
                Object[] objArr8 = this.f43018c;
                if (i15 <= objArr8.length) {
                    Q3.d.n(i14, iJ2, iJ, objArr8, objArr8);
                } else if (i14 >= objArr8.length) {
                    Q3.d.n(i14 - objArr8.length, iJ2, iJ, objArr8, objArr8);
                } else {
                    int length3 = iJ - (i15 - objArr8.length);
                    Q3.d.n(0, length3, iJ, objArr8, objArr8);
                    Object[] objArr9 = this.f43018c;
                    Q3.d.n(i14, iJ2, length3, objArr9, objArr9);
                }
            } else {
                Object[] objArr10 = this.f43018c;
                Q3.d.n(size, 0, iJ, objArr10, objArr10);
                Object[] objArr11 = this.f43018c;
                if (i14 >= objArr11.length) {
                    Q3.d.n(i14 - objArr11.length, iJ2, objArr11.length, objArr11, objArr11);
                } else {
                    Q3.d.n(0, objArr11.length - size, objArr11.length, objArr11, objArr11);
                    Object[] objArr12 = this.f43018c;
                    Q3.d.n(i14, iJ2, objArr12.length - size, objArr12, objArr12);
                }
            }
            q(iJ2, elements);
        }
        return true;
    }

    public final void addFirst(E e10) {
        K();
        v(this.f43019d + 1);
        int i10 = this.f43017b;
        int iS = i10 == 0 ? k.S(this.f43018c) : i10 - 1;
        this.f43017b = iS;
        this.f43018c[iS] = e10;
        this.f43019d++;
    }

    public final void addLast(E e10) {
        K();
        v(e() + 1);
        this.f43018c[J(e() + this.f43017b)] = e10;
        this.f43019d = e() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            K();
            I(this.f43017b, J(e() + this.f43017b));
        }
        this.f43017b = 0;
        this.f43019d = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // kotlin.collections.d
    public final int e() {
        return this.f43019d;
    }

    public final E first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.f43018c[this.f43017b];
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i10) {
        int iE = e();
        if (i10 < 0 || i10 >= iE) {
            throw new IndexOutOfBoundsException(A8.f.d(i10, iE, "index: ", ", size: "));
        }
        return (E) this.f43018c[J(this.f43017b + i10)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i10;
        int iJ = J(e() + this.f43017b);
        int length = this.f43017b;
        if (length < iJ) {
            while (length < iJ) {
                if (kotlin.jvm.internal.i.a(obj, this.f43018c[length])) {
                    i10 = this.f43017b;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iJ) {
            return -1;
        }
        int length2 = this.f43018c.length;
        while (length < length2) {
            if (kotlin.jvm.internal.i.a(obj, this.f43018c[length])) {
                i10 = this.f43017b;
            } else {
                length++;
            }
        }
        for (int i11 = 0; i11 < iJ; i11++) {
            if (kotlin.jvm.internal.i.a(obj, this.f43018c[i11])) {
                length = i11 + this.f43018c.length;
                i10 = this.f43017b;
            }
        }
        return -1;
        return length - i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return e() == 0;
    }

    @Override // kotlin.collections.d
    public final E k(int i10) {
        int i11 = this.f43019d;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(A8.f.d(i10, i11, "index: ", ", size: "));
        }
        if (i10 == l.r(this)) {
            return removeLast();
        }
        if (i10 == 0) {
            return removeFirst();
        }
        K();
        int iJ = J(this.f43017b + i10);
        Object[] objArr = this.f43018c;
        E e10 = (E) objArr[iJ];
        if (i10 < (this.f43019d >> 1)) {
            int i12 = this.f43017b;
            if (iJ >= i12) {
                Q3.d.n(i12 + 1, i12, iJ, objArr, objArr);
            } else {
                Q3.d.n(1, 0, iJ, objArr, objArr);
                Object[] objArr2 = this.f43018c;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i13 = this.f43017b;
                Q3.d.n(i13 + 1, i13, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f43018c;
            int i14 = this.f43017b;
            objArr3[i14] = null;
            this.f43017b = B(i14);
        } else {
            int iJ2 = J(l.r(this) + this.f43017b);
            if (iJ <= iJ2) {
                Object[] objArr4 = this.f43018c;
                Q3.d.n(iJ, iJ + 1, iJ2 + 1, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.f43018c;
                Q3.d.n(iJ, iJ + 1, objArr5.length, objArr5, objArr5);
                Object[] objArr6 = this.f43018c;
                objArr6[objArr6.length - 1] = objArr6[0];
                Q3.d.n(0, 1, iJ2 + 1, objArr6, objArr6);
            }
            this.f43018c[iJ2] = null;
        }
        this.f43019d--;
        return e10;
    }

    public final E last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.f43018c[J(l.r(this) + this.f43017b)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int iS;
        int i10;
        int iJ = J(e() + this.f43017b);
        int i11 = this.f43017b;
        if (i11 < iJ) {
            iS = iJ - 1;
            if (i11 <= iS) {
                while (!kotlin.jvm.internal.i.a(obj, this.f43018c[iS])) {
                    if (iS != i11) {
                        iS--;
                    }
                }
                i10 = this.f43017b;
                return iS - i10;
            }
            return -1;
        }
        if (i11 > iJ) {
            for (int i12 = iJ - 1; -1 < i12; i12--) {
                if (kotlin.jvm.internal.i.a(obj, this.f43018c[i12])) {
                    iS = i12 + this.f43018c.length;
                    i10 = this.f43017b;
                    return iS - i10;
                }
            }
            iS = k.S(this.f43018c);
            int i13 = this.f43017b;
            if (i13 <= iS) {
                while (!kotlin.jvm.internal.i.a(obj, this.f43018c[iS])) {
                    if (iS != i13) {
                        iS--;
                    }
                }
                i10 = this.f43017b;
                return iS - i10;
            }
        }
        return -1;
    }

    public final void q(int i10, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f43018c.length;
        while (i10 < length && it.hasNext()) {
            this.f43018c[i10] = it.next();
            i10++;
        }
        int i11 = this.f43017b;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f43018c[i12] = it.next();
        }
        this.f43019d = collection.size() + e();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        k(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<? extends Object> elements) {
        int iJ;
        kotlin.jvm.internal.i.e(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f43018c.length != 0) {
            int iJ2 = J(this.f43019d + this.f43017b);
            int i10 = this.f43017b;
            if (i10 < iJ2) {
                iJ = i10;
                while (i10 < iJ2) {
                    Object obj = this.f43018c[i10];
                    if (elements.contains(obj)) {
                        z10 = true;
                    } else {
                        this.f43018c[iJ] = obj;
                        iJ++;
                    }
                    i10++;
                }
                Q3.d.w(this.f43018c, null, iJ, iJ2);
            } else {
                int length = this.f43018c.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f43018c;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        z11 = true;
                    } else {
                        this.f43018c[i11] = obj2;
                        i11++;
                    }
                    i10++;
                }
                iJ = J(i11);
                for (int i12 = 0; i12 < iJ2; i12++) {
                    Object[] objArr2 = this.f43018c;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        z11 = true;
                    } else {
                        this.f43018c[iJ] = obj3;
                        iJ = B(iJ);
                    }
                }
                z10 = z11;
            }
            if (z10) {
                K();
                this.f43019d = G(iJ - this.f43017b);
            }
        }
        return z10;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        K();
        Object[] objArr = this.f43018c;
        int i10 = this.f43017b;
        E e10 = (E) objArr[i10];
        objArr[i10] = null;
        this.f43017b = B(i10);
        this.f43019d = e() - 1;
        return e10;
    }

    public final E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        K();
        int iJ = J(l.r(this) + this.f43017b);
        Object[] objArr = this.f43018c;
        E e10 = (E) objArr[iJ];
        objArr[iJ] = null;
        this.f43019d = e() - 1;
        return e10;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        AbstractC2670b.a.b(i10, i11, this.f43019d);
        int i12 = i11 - i10;
        if (i12 == 0) {
            return;
        }
        if (i12 == this.f43019d) {
            clear();
            return;
        }
        if (i12 == 1) {
            k(i10);
            return;
        }
        K();
        if (i10 < this.f43019d - i11) {
            int iJ = J((i10 - 1) + this.f43017b);
            int iJ2 = J((i11 - 1) + this.f43017b);
            while (i10 > 0) {
                int i13 = iJ + 1;
                int iMin = Math.min(i10, Math.min(i13, iJ2 + 1));
                Object[] objArr = this.f43018c;
                int i14 = iJ2 - iMin;
                int i15 = iJ - iMin;
                Q3.d.n(i14 + 1, i15 + 1, i13, objArr, objArr);
                iJ = G(i15);
                iJ2 = G(i14);
                i10 -= iMin;
            }
            int iJ3 = J(this.f43017b + i12);
            I(this.f43017b, iJ3);
            this.f43017b = iJ3;
        } else {
            int iJ4 = J(this.f43017b + i11);
            int iJ5 = J(this.f43017b + i10);
            int i16 = this.f43019d;
            while (true) {
                i16 -= i11;
                if (i16 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f43018c;
                i11 = Math.min(i16, Math.min(objArr2.length - iJ4, objArr2.length - iJ5));
                Object[] objArr3 = this.f43018c;
                int i17 = iJ4 + i11;
                Q3.d.n(iJ5, iJ4, i17, objArr3, objArr3);
                iJ4 = J(i17);
                iJ5 = J(iJ5 + i11);
            }
            int iJ6 = J(this.f43019d + this.f43017b);
            I(G(iJ6 - i12), iJ6);
        }
        this.f43019d -= i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<? extends Object> elements) {
        int iJ;
        kotlin.jvm.internal.i.e(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f43018c.length != 0) {
            int iJ2 = J(this.f43019d + this.f43017b);
            int i10 = this.f43017b;
            if (i10 < iJ2) {
                iJ = i10;
                while (i10 < iJ2) {
                    Object obj = this.f43018c[i10];
                    if (elements.contains(obj)) {
                        this.f43018c[iJ] = obj;
                        iJ++;
                    } else {
                        z10 = true;
                    }
                    i10++;
                }
                Q3.d.w(this.f43018c, null, iJ, iJ2);
            } else {
                int length = this.f43018c.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f43018c;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        this.f43018c[i11] = obj2;
                        i11++;
                    } else {
                        z11 = true;
                    }
                    i10++;
                }
                iJ = J(i11);
                for (int i12 = 0; i12 < iJ2; i12++) {
                    Object[] objArr2 = this.f43018c;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        this.f43018c[iJ] = obj3;
                        iJ = B(iJ);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                K();
                this.f43019d = G(iJ - this.f43017b);
            }
        }
        return z10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i10, E e10) {
        int iE = e();
        if (i10 < 0 || i10 >= iE) {
            throw new IndexOutOfBoundsException(A8.f.d(i10, iE, "index: ", ", size: "));
        }
        int iJ = J(this.f43017b + i10);
        Object[] objArr = this.f43018c;
        E e11 = (E) objArr[iJ];
        objArr[iJ] = e10;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[e()]);
    }

    public final void v(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f43018c;
        if (i10 <= objArr.length) {
            return;
        }
        if (objArr == f43016e) {
            if (i10 < 10) {
                i10 = 10;
            }
            this.f43018c = new Object[i10];
            return;
        }
        int length = objArr.length;
        int i11 = length + (length >> 1);
        if (i11 - i10 < 0) {
            i11 = i10;
        }
        if (i11 - 2147483639 > 0) {
            i11 = i10 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i11];
        Q3.d.n(0, this.f43017b, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.f43018c;
        int length2 = objArr3.length;
        int i12 = this.f43017b;
        Q3.d.n(length2 - i12, 0, i12, objArr3, objArr2);
        this.f43017b = 0;
        this.f43018c = objArr2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.i.e(array, "array");
        int length = array.length;
        int i10 = this.f43019d;
        if (length < i10) {
            Object objNewInstance = Array.newInstance(array.getClass().getComponentType(), i10);
            kotlin.jvm.internal.i.c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (T[]) ((Object[]) objNewInstance);
        }
        int iJ = J(this.f43019d + this.f43017b);
        int i11 = this.f43017b;
        if (i11 < iJ) {
            Q3.d.r(i11, iJ, 2, this.f43018c, array);
        } else if (!isEmpty()) {
            Object[] objArr = this.f43018c;
            Q3.d.n(0, this.f43017b, objArr.length, objArr, array);
            Object[] objArr2 = this.f43018c;
            Q3.d.n(objArr2.length - this.f43017b, 0, iJ, objArr2, array);
        }
        M1.l(this.f43019d, array);
        return array;
    }

    public i() {
        this.f43018c = f43016e;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e10) {
        addLast(e10);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        K();
        v(elements.size() + e());
        q(J(e() + this.f43017b), elements);
        return true;
    }
}
