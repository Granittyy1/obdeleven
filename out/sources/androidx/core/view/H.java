package androidx.core.view;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: ViewGroup.kt */
/* JADX INFO: loaded from: classes.dex */
public final class H<T> implements Iterator<T>, Ja.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ia.l<T, Iterator<T>> f16850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f16851c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator<? extends T> f16852d;

    public H(V v10, Ia.l lVar) {
        this.f16850b = lVar;
        this.f16852d = v10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16852d.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        T next = this.f16852d.next();
        Iterator<? extends T> it = (Iterator) ((ViewGroupKt$descendants$1$1) this.f16850b).invoke(next);
        ArrayList arrayList = this.f16851c;
        if (it == null || !it.hasNext()) {
            while (!this.f16852d.hasNext() && !arrayList.isEmpty()) {
                this.f16852d = (Iterator) kotlin.collections.q.V(arrayList);
                kotlin.collections.p.E(arrayList);
            }
        } else {
            arrayList.add(this.f16852d);
            this.f16852d = it;
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
