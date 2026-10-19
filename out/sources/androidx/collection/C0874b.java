package androidx.collection;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: androidx.collection.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ArraySet.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0874b<E> implements Collection<E>, Set<E>, Ja.b, Ja.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f9159b = p233t.a.f46996a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f9160c = p233t.a.f46998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9161d;

    /* JADX INFO: renamed from: androidx.collection.b$a */
    /* JADX INFO: compiled from: ArraySet.jvm.kt */
    public final class a extends AbstractC0878f<E> {
        public a() {
            super(C0874b.this.f9161d);
        }

        @Override // androidx.collection.AbstractC0878f
        public final E a(int i10) {
            return (E) C0874b.this.f9160c[i10];
        }

        @Override // androidx.collection.AbstractC0878f
        public final void b(int i10) {
            C0874b.this.e(i10);
        }
    }

    public C0874b(int i10) {
        if (i10 > 0) {
            F8.a.b(this, i10);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(E e10) {
        int i10;
        int iG;
        int i11 = this.f9161d;
        if (e10 == null) {
            iG = F8.a.g(this, null, 0);
            i10 = 0;
        } else {
            int iHashCode = e10.hashCode();
            i10 = iHashCode;
            iG = F8.a.g(this, e10, iHashCode);
        }
        if (iG >= 0) {
            return false;
        }
        int i12 = ~iG;
        int[] iArr = this.f9159b;
        if (i11 >= iArr.length) {
            int i13 = 8;
            if (i11 >= 8) {
                i13 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i13 = 4;
            }
            Object[] objArr = this.f9160c;
            F8.a.b(this, i13);
            if (i11 != this.f9161d) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f9159b;
            if (iArr2.length != 0) {
                Q3.d.q(0, iArr.length, 6, iArr, iArr2);
                Q3.d.r(0, objArr.length, 6, objArr, this.f9160c);
            }
        }
        if (i12 < i11) {
            int[] iArr3 = this.f9159b;
            int i14 = i12 + 1;
            Q3.d.m(i14, i12, i11, iArr3, iArr3);
            Object[] objArr2 = this.f9160c;
            Q3.d.n(i14, i12, i11, objArr2, objArr2);
        }
        int i15 = this.f9161d;
        if (i11 == i15) {
            int[] iArr4 = this.f9159b;
            if (i12 < iArr4.length) {
                iArr4[i12] = i10;
                this.f9160c[i12] = e10;
                this.f9161d = i15 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        int size = elements.size() + this.f9161d;
        int i10 = this.f9161d;
        int[] iArr = this.f9159b;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f9160c;
            F8.a.b(this, size);
            int i11 = this.f9161d;
            if (i11 > 0) {
                Q3.d.q(0, i11, 6, iArr, this.f9159b);
                Q3.d.r(0, this.f9161d, 6, objArr, this.f9160c);
            }
        }
        if (this.f9161d != i10) {
            throw new ConcurrentModificationException();
        }
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f9161d != 0) {
            this.f9159b = p233t.a.f46996a;
            this.f9160c = p233t.a.f46998c;
            this.f9161d = 0;
        }
        if (this.f9161d != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? F8.a.g(this, null, 0) : F8.a.g(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final E e(int i10) {
        int i11 = this.f9161d;
        Object[] objArr = this.f9160c;
        E e10 = (E) objArr[i10];
        if (i11 <= 1) {
            clear();
        } else {
            int i12 = i11 - 1;
            int[] iArr = this.f9159b;
            if (iArr.length <= 8 || i11 >= iArr.length / 3) {
                if (i10 < i12) {
                    int i13 = i10 + 1;
                    Q3.d.m(i10, i13, i11, iArr, iArr);
                    Object[] objArr2 = this.f9160c;
                    Q3.d.n(i10, i13, i11, objArr2, objArr2);
                }
                this.f9160c[i12] = null;
            } else {
                F8.a.b(this, i11 > 8 ? i11 + (i11 >> 1) : 8);
                if (i10 > 0) {
                    Q3.d.q(0, i10, 6, iArr, this.f9159b);
                    Q3.d.r(0, i10, 6, objArr, this.f9160c);
                }
                if (i10 < i12) {
                    int i14 = i10 + 1;
                    Q3.d.m(i10, i14, i11, iArr, this.f9159b);
                    Q3.d.n(i10, i14, i11, objArr, this.f9160c);
                }
            }
            if (i11 != this.f9161d) {
                throw new ConcurrentModificationException();
            }
            this.f9161d = i12;
        }
        return e10;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Set) && this.f9161d == ((Set) obj).size()) {
            try {
                int i10 = this.f9161d;
                for (int i11 = 0; i11 < i10; i11++) {
                    if (((Set) obj).contains(this.f9160c[i11])) {
                    }
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f9159b;
        int i10 = this.f9161d;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f9161d <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return new a();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iG = obj == null ? F8.a.g(this, null, 0) : F8.a.g(this, obj, obj.hashCode());
        if (iG < 0) {
            return false;
        }
        e(iG);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        boolean z10 = false;
        for (int i10 = this.f9161d - 1; -1 < i10; i10--) {
            if (!kotlin.collections.q.J(elements, this.f9160c[i10])) {
                e(i10);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f9161d;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return Q3.d.u(0, this.f9161d, this.f9160c);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f9161d * 14);
        sb2.append('{');
        int i10 = this.f9161d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object obj = this.f9160c[i11];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        kotlin.jvm.internal.i.d(string, "toString(...)");
        return string;
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.i.e(array, "array");
        int i10 = this.f9161d;
        if (array.length < i10) {
            array = (T[]) ((Object[]) Array.newInstance(array.getClass().getComponentType(), i10));
        } else if (array.length > i10) {
            array[i10] = null;
        }
        Q3.d.n(0, 0, this.f9161d, this.f9160c, array);
        return array;
    }
}
