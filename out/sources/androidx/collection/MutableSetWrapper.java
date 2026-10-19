package androidx.collection;

import com.google.android.gms.internal.measurement.C1787c0;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: ScatterSet.kt */
/* JADX INFO: loaded from: classes.dex */
public final class MutableSetWrapper<E> extends SetWrapper<E> implements Ja.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final L<E> f9098c;

    /* JADX INFO: renamed from: androidx.collection.MutableSetWrapper$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScatterSet.kt */
    public static final class AnonymousClass1 implements Iterator<E>, Ja.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f9099b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final kotlin.sequences.h f9100c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ MutableSetWrapper<E> f9101d;

        public AnonymousClass1(MutableSetWrapper<E> mutableSetWrapper) {
            this.f9101d = mutableSetWrapper;
            this.f9100c = C1787c0.n(new MutableSetWrapper$iterator$1$iterator$1(mutableSetWrapper, this, null));
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f9100c.hasNext();
        }

        @Override // java.util.Iterator
        public final E next() {
            return (E) this.f9100c.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            int i10 = this.f9099b;
            if (i10 != -1) {
                this.f9101d.f9098c.m(i10);
                this.f9099b = -1;
            }
        }
    }

    public MutableSetWrapper(L<E> l10) {
        super(l10);
        this.f9098c = l10;
    }

    @Override // androidx.collection.SetWrapper, java.util.Set, java.util.Collection
    public final boolean add(E e10) {
        return this.f9098c.d(e10);
    }

    @Override // androidx.collection.SetWrapper, java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends E> elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        L<E> l10 = this.f9098c;
        l10.getClass();
        int i10 = l10.f9125d;
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            l10.k((E) it.next());
        }
        return i10 != l10.f9125d;
    }

    @Override // androidx.collection.SetWrapper, java.util.Set, java.util.Collection
    public final void clear() {
        this.f9098c.e();
    }

    @Override // androidx.collection.SetWrapper, java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return new AnonymousClass1(this);
    }

    @Override // androidx.collection.SetWrapper, java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f9098c.l(obj);
    }

    @Override // androidx.collection.SetWrapper, java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        L<E> l10 = this.f9098c;
        l10.getClass();
        int i10 = l10.f9125d;
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            l10.i((E) it.next());
        }
        return i10 != l10.f9125d;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0058 A[LOOP:0: B:5:0x001a->B:17:0x0058, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x005b A[EDGE_INSN: B:24:0x005b->B:18:0x005b BREAK  A[LOOP:0: B:5:0x001a->B:17:0x0058], SYNTHETIC] */
    @Override // androidx.collection.SetWrapper, java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        L<E> l10 = this.f9098c;
        l10.getClass();
        Object[] objArr = l10.f9123b;
        int i10 = l10.f9125d;
        long[] jArr = l10.f9122a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j = jArr[i11];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i11 != length) {
                        break;
                        break;
                    }
                    i11++;
                } else {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j) < 128) {
                            int i14 = (i11 << 3) + i13;
                            if (!kotlin.collections.q.J(elements, objArr[i14])) {
                                l10.m(i14);
                            }
                        }
                        j >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                    if (i11 != length) {
                        break;
                    }
                    i11++;
                }
            }
        }
        return i10 != l10.f9125d;
    }
}
