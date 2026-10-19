package kotlin.collections;

import java.util.Iterator;

/* JADX INFO: compiled from: Iterators.kt */
/* JADX INFO: loaded from: classes.dex */
public final class u<T> implements Iterator<s<? extends T>>, Ja.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator<T> f43025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f43026c;

    /* JADX WARN: Multi-variable type inference failed */
    public u(Iterator<? extends T> iterator) {
        kotlin.jvm.internal.i.e(iterator, "iterator");
        this.f43025b = iterator;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f43025b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f43026c;
        this.f43026c = i10 + 1;
        if (i10 >= 0) {
            return new s(i10, this.f43025b.next());
        }
        l.x();
        throw null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
