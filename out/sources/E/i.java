package E;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PersistentHashMapBuilderContentIterators.kt */
/* JADX INFO: loaded from: classes.dex */
public final class i<K, V> implements Iterator<Map.Entry<K, V>>, Ja.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g<K, V, Map.Entry<K, V>> f2950b;

    public i(f<K, V> fVar) {
        u[] uVarArr = new u[8];
        for (int i10 = 0; i10 < 8; i10++) {
            uVarArr[i10] = new x(this);
        }
        this.f2950b = new g<>(fVar, uVarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2950b.f2938d;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f2950b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f2950b.remove();
    }
}
