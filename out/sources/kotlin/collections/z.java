package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: ReversedViews.kt */
/* JADX INFO: loaded from: classes.dex */
public final class z<T> extends AbstractC2670b<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<T> f43027b;

    /* JADX INFO: compiled from: ReversedViews.kt */
    public static final class a implements ListIterator<T>, Ja.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ListIterator<T> f43028b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ z<T> f43029c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(z<? extends T> zVar, int i10) {
            this.f43029c = zVar;
            List<T> list = zVar.f43027b;
            if (i10 >= 0 && i10 <= zVar.size()) {
                this.f43028b = list.listIterator(zVar.size() - i10);
                return;
            }
            StringBuilder sbE = A8.f.e(i10, "Position index ", " must be in range [");
            sbE.append(new Na.i(0, zVar.size(), 1));
            sbE.append("].");
            throw new IndexOutOfBoundsException(sbE.toString());
        }

        @Override // java.util.ListIterator
        public final void add(T t8) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f43028b.hasPrevious();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f43028b.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            return this.f43028b.previous();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return l.r(this.f43029c) - this.f43028b.previousIndex();
        }

        @Override // java.util.ListIterator
        public final T previous() {
            return this.f43028b.next();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return l.r(this.f43029c) - this.f43028b.nextIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final void set(T t8) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z(List<? extends T> list) {
        this.f43027b = list;
    }

    @Override // kotlin.collections.AbstractCollection
    public final int e() {
        return this.f43027b.size();
    }

    @Override // java.util.List
    public final T get(int i10) {
        if (i10 >= 0 && i10 <= l.r(this)) {
            return this.f43027b.get(l.r(this) - i10);
        }
        StringBuilder sbE = A8.f.e(i10, "Element index ", " must be in range [");
        sbE.append(new Na.i(0, l.r(this), 1));
        sbE.append("].");
        throw new IndexOutOfBoundsException(sbE.toString());
    }

    @Override // kotlin.collections.AbstractC2670b, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return new a(this, 0);
    }

    @Override // kotlin.collections.AbstractC2670b, java.util.List
    public final ListIterator<T> listIterator() {
        return new a(this, 0);
    }

    @Override // kotlin.collections.AbstractC2670b, java.util.List
    public final ListIterator<T> listIterator(int i10) {
        return new a(this, i10);
    }
}
