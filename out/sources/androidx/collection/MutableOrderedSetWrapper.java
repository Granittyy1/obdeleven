package androidx.collection;

import com.google.android.gms.internal.measurement.C1787c0;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: OrderedScatterSet.kt */
/* JADX INFO: loaded from: classes.dex */
public final class MutableOrderedSetWrapper<E> extends OrderedSetWrapper<E> implements Ja.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J<E> f9094c;

    /* JADX INFO: renamed from: androidx.collection.MutableOrderedSetWrapper$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: OrderedScatterSet.kt */
    public static final class AnonymousClass1 implements Iterator<E>, Ja.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f9095b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final kotlin.sequences.h f9096c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ MutableOrderedSetWrapper<E> f9097d;

        public AnonymousClass1(MutableOrderedSetWrapper<E> mutableOrderedSetWrapper) {
            this.f9097d = mutableOrderedSetWrapper;
            this.f9096c = C1787c0.n(new MutableOrderedSetWrapper$iterator$1$iterator$1(mutableOrderedSetWrapper, this, null));
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f9096c.hasNext();
        }

        @Override // java.util.Iterator
        public final E next() {
            return (E) this.f9096c.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            int i10 = this.f9095b;
            if (i10 != -1) {
                this.f9097d.f9094c.h(i10);
                this.f9095b = -1;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableOrderedSetWrapper(J<E> parent) {
        super(parent);
        kotlin.jvm.internal.i.e(parent, "parent");
        this.f9094c = parent;
    }

    @Override // androidx.collection.OrderedSetWrapper, java.util.Set, java.util.Collection
    public final boolean add(E e10) {
        return this.f9094c.b(e10);
    }

    @Override // androidx.collection.OrderedSetWrapper, java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends E> elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        J<E> j = this.f9094c;
        j.getClass();
        int i10 = j.f9116g;
        for (Object obj : elements) {
            int iD = j.d((E) obj);
            j.f9111b[iD] = obj;
            long[] jArr = j.f9112c;
            int i11 = j.f9113d;
            jArr[iD] = (((long) i11) & 2147483647L) | 4611686016279904256L;
            if (i11 != Integer.MAX_VALUE) {
                jArr[i11] = ((((long) iD) & 2147483647L) << 31) | (jArr[i11] & (-4611686016279904257L));
            }
            j.f9113d = iD;
            if (j.f9114e == Integer.MAX_VALUE) {
                j.f9114e = iD;
            }
        }
        return i10 != j.f9116g;
    }

    @Override // androidx.collection.OrderedSetWrapper, java.util.Set, java.util.Collection
    public final void clear() {
        this.f9094c.c();
    }

    @Override // androidx.collection.OrderedSetWrapper, java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return new AnonymousClass1(this);
    }

    @Override // androidx.collection.OrderedSetWrapper, java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f9094c.g(obj);
    }

    @Override // androidx.collection.OrderedSetWrapper, java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> elements) {
        int iNumberOfTrailingZeros;
        kotlin.jvm.internal.i.e(elements, "elements");
        J<E> j = this.f9094c;
        j.getClass();
        int i10 = j.f9116g;
        Iterator<T> it = elements.iterator();
        while (true) {
            int i11 = 1;
            int i12 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int iHashCode = (next != null ? next.hashCode() : 0) * (-862048943);
            int i13 = iHashCode ^ (iHashCode << 16);
            int i14 = i13 & 127;
            int i15 = j.f9115f;
            int i16 = (i13 >>> 7) & i15;
            while (true) {
                long[] jArr = j.f9110a;
                int i17 = i16 >> 3;
                int i18 = (i16 & 7) << 3;
                int i19 = i12;
                long j10 = (((-i18) >> 63) & (jArr[i17 + i11] << (64 - i18))) | (jArr[i17] >>> i18);
                long j11 = (((long) i14) * 72340172838076673L) ^ j10;
                for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i16) & i15;
                    if (kotlin.jvm.internal.i.a(j.f9111b[iNumberOfTrailingZeros], next)) {
                        break;
                    }
                }
                if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                    iNumberOfTrailingZeros = -1;
                    break;
                }
                i12 = i19 + 8;
                i16 = (i16 + i12) & i15;
                i11 = 1;
            }
            if (iNumberOfTrailingZeros >= 0) {
                j.h(iNumberOfTrailingZeros);
            }
        }
        return i10 != j.f9116g;
    }

    @Override // androidx.collection.OrderedSetWrapper, java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        return this.f9094c.i(elements);
    }
}
