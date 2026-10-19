package F;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PersistentOrderedSetIterator.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c<E> implements Iterator<E>, Ja.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f3178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<E, a> f3179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3180d;

    public c(Object obj, Map<E, a> map) {
        this.f3178b = obj;
        this.f3179c = map;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3180d < this.f3179c.size();
    }

    @Override // java.util.Iterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        E e10 = (E) this.f3178b;
        this.f3180d++;
        a aVar = this.f3179c.get(e10);
        if (aVar != null) {
            this.f3178b = aVar.f3173b;
            return e10;
        }
        throw new ConcurrentModificationException("Hash code of an element (" + e10 + ") has changed after it was added to the persistent set.");
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
