package E;

import java.util.Iterator;
import kotlin.collections.AbstractCollection;

/* JADX INFO: compiled from: PersistentHashMapContentViews.kt */
/* JADX INFO: loaded from: classes.dex */
public final class r<K, V> extends AbstractCollection<V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d<K, V> f2955b;

    public r(d<K, V> dVar) {
        this.f2955b = dVar;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f2955b.containsValue(obj);
    }

    @Override // kotlin.collections.AbstractCollection
    public final int e() {
        d<K, V> dVar = this.f2955b;
        dVar.getClass();
        return dVar.f2935c;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        t<K, V> tVar = this.f2955b.f2934b;
        u[] uVarArr = new u[8];
        for (int i10 = 0; i10 < 8; i10++) {
            uVarArr[i10] = new y();
        }
        return new s(tVar, uVarArr);
    }
}
