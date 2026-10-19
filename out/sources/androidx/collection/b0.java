package androidx.collection;

import java.util.Iterator;

/* JADX INFO: compiled from: SparseArray.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements Iterator<Object>, Ja.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y<Object> f9164c;

    public b0(Y<Object> y10) {
        this.f9164c = y10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9163b < this.f9164c.f();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f9163b;
        this.f9163b = i10 + 1;
        return this.f9164c.g(i10);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
