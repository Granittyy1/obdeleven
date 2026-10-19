package E;

import java.util.Iterator;

/* JADX INFO: compiled from: PersistentHashMapContentIterators.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class u<K, V, T> implements Iterator<T>, Ja.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f2963b = t.f2956e.f2960d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2965d;

    public final void a(int i10, int i11, Object[] objArr) {
        this.f2963b = objArr;
        this.f2964c = i10;
        this.f2965d = i11;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2965d < this.f2964c;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
