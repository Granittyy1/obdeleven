package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ImmutableSet<E> extends ImmutableCollection<E> implements Set<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f27887d = 0;
    private static final long serialVersionUID = 912559;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient ImmutableList<E> f27888c;

    public static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        final Object[] elements;

        public SerializedForm(Object[] objArr) {
            this.elements = objArr;
        }

        public Object readResolve() {
            return ImmutableSet.G(this.elements);
        }
    }

    public static class a<E> extends ImmutableCollection.a<E> {
        public a() {
            super(4);
        }

        @Override // com.google.common.collect.ImmutableCollection.b
        public ImmutableCollection.b a(Object obj) {
            obj.getClass();
            c(obj);
            return this;
        }

        public ImmutableSet<E> h() {
            int i10 = this.f27872b;
            if (i10 == 0) {
                int i11 = ImmutableSet.f27887d;
                return RegularImmutableSet.f27955k;
            }
            if (i10 != 1) {
                ImmutableSet<E> immutableSetB = ImmutableSet.B(i10, this.f27871a);
                this.f27872b = immutableSetB.size();
                this.f27873c = true;
                return immutableSetB;
            }
            Object obj = this.f27871a[0];
            Objects.requireNonNull(obj);
            int i12 = ImmutableSet.f27887d;
            return new SingletonImmutableSet(obj);
        }
    }

    public static int A(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax >= 751619276) {
            A8.p.f("collection too large", iMax < 1073741824);
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static <E> ImmutableSet<E> B(int i10, Object... objArr) {
        if (i10 == 0) {
            return RegularImmutableSet.f27955k;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new SingletonImmutableSet(obj);
        }
        int iA = A(i10);
        Object[] objArr2 = new Object[iA];
        int i11 = iA - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object obj2 = objArr[i14];
            if (obj2 == null) {
                throw new NullPointerException(J4.i.b(i14, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iK = kotlin.jvm.internal.n.k(iHashCode);
            while (true) {
                int i15 = iK & i11;
                Object obj3 = objArr2[i15];
                if (obj3 == null) {
                    objArr[i13] = obj2;
                    objArr2[i15] = obj2;
                    i12 += iHashCode;
                    i13++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iK++;
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new SingletonImmutableSet(obj4);
        }
        if (A(i13) < iA / 2) {
            return B(i13, objArr);
        }
        int length = objArr.length;
        if (i13 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new RegularImmutableSet(i12, i11, i13, objArr, objArr2);
    }

    public static <E> ImmutableSet<E> C(Collection<? extends E> collection) {
        if ((collection instanceof ImmutableSet) && !(collection instanceof SortedSet)) {
            ImmutableSet<E> immutableSet = (ImmutableSet) collection;
            if (!immutableSet.s()) {
                return immutableSet;
            }
        }
        Object[] array = collection.toArray();
        return B(array.length, array);
    }

    public static <E> ImmutableSet<E> G(E[] eArr) {
        int length = eArr.length;
        if (length != 0) {
            return length != 1 ? B(eArr.length, (Object[]) eArr.clone()) : new SingletonImmutableSet(eArr[0]);
        }
        return RegularImmutableSet.f27955k;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public ImmutableList<E> I() {
        Object[] array = toArray();
        ImmutableList.b bVar = ImmutableList.f27874c;
        return ImmutableList.A(array.length, array);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public ImmutableList<E> d() {
        ImmutableList<E> immutableList = this.f27888c;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList<E> immutableListI = I();
        this.f27888c = immutableListI;
        return immutableListI;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ImmutableSet) && (this instanceof RegularImmutableSet)) {
            ImmutableSet immutableSet = (ImmutableSet) obj;
            immutableSet.getClass();
            if ((immutableSet instanceof RegularImmutableSet) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return z.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return z.c(this);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(toArray(ImmutableCollection.f27870b));
    }
}
