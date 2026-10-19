package com.google.common.collect;

import com.braze.support.BrazeLogger;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ImmutableCollection<E> extends AbstractCollection<E> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object[] f27870b = new Object[0];
    private static final long serialVersionUID = 912559;

    public static abstract class a<E> extends b<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object[] f27871a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f27872b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f27873c;

        public a(int i10) {
            P3.d.e(i10, "initialCapacity");
            this.f27871a = new Object[i10];
            this.f27872b = 0;
        }

        public final void c(Object obj) {
            obj.getClass();
            g(1);
            Object[] objArr = this.f27871a;
            int i10 = this.f27872b;
            this.f27872b = i10 + 1;
            objArr[i10] = obj;
        }

        public final void d(Object... objArr) {
            int length = objArr.length;
            p019b6.d.b(length, objArr);
            g(length);
            System.arraycopy(objArr, 0, this.f27871a, this.f27872b, length);
            this.f27872b += length;
        }

        public void e(Object obj) {
            c(obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final a f(List list) {
            if (list instanceof Collection) {
                List list2 = list;
                g(list2.size());
                if (list2 instanceof ImmutableCollection) {
                    this.f27872b = ((ImmutableCollection) list2).e(this.f27872b, this.f27871a);
                    return this;
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }

        public final void g(int i10) {
            Object[] objArr = this.f27871a;
            int iB = b.b(objArr.length, this.f27872b + i10);
            if (iB > objArr.length || this.f27873c) {
                this.f27871a = Arrays.copyOf(this.f27871a, iB);
                this.f27873c = false;
            }
        }
    }

    public static abstract class b<E> {
        public static int b(int i10, int i11) {
            if (i11 < 0) {
                throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
            }
            if (i11 <= i10) {
                return i10;
            }
            int iHighestOneBit = i10 + (i10 >> 1) + 1;
            if (iHighestOneBit < i11) {
                iHighestOneBit = Integer.highestOneBit(i11 - 1) << 1;
            }
            return iHighestOneBit < 0 ? BrazeLogger.SUPPRESS : iHighestOneBit;
        }

        public abstract b<E> a(E e10);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(Object obj);

    public ImmutableList<E> d() {
        if (isEmpty()) {
            ImmutableList.b bVar = ImmutableList.f27874c;
            return (ImmutableList<E>) RegularImmutableList.f27940f;
        }
        Object[] array = toArray(f27870b);
        ImmutableList.b bVar2 = ImmutableList.f27874c;
        return ImmutableList.A(array.length, array);
    }

    public int e(int i10, Object[] objArr) {
        C<E> it = iterator();
        while (it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return i10;
    }

    public Object[] g() {
        return null;
    }

    public int k() {
        throw new UnsupportedOperationException();
    }

    public int q() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public abstract boolean s();

    @Override // java.util.Collection, java.lang.Iterable
    public final Spliterator<E> spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f27870b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public abstract C<E> iterator();

    public Object writeReplace() {
        return new ImmutableList.SerializedForm(toArray(f27870b));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        int size = size();
        if (tArr.length < size) {
            Object[] objArrG = g();
            if (objArrG != null) {
                return (T[]) Arrays.copyOfRange(objArrG, q(), k(), tArr.getClass());
            }
            if (tArr.length != 0) {
                tArr = (T[]) Arrays.copyOf(tArr, 0);
            }
            tArr = (T[]) Arrays.copyOf(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        e(0, tArr);
        return tArr;
    }
}
