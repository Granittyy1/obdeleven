package E;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PersistentHashMapContentViews.kt */
/* JADX INFO: loaded from: classes.dex */
public final class n<K, V> extends kotlin.collections.g<Map.Entry<? extends K, ? extends V>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d<K, V> f2953b;

    public n(d<K, V> dVar) {
        this.f2953b = dVar;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map.Entry entry;
        if (!(obj instanceof Map.Entry) || (entry = (Map.Entry) obj) == null) {
            return false;
        }
        Object key = entry.getKey();
        d<K, V> dVar = this.f2953b;
        V v10 = dVar.get((K) key);
        if (v10 != null) {
            return v10.equals(entry.getValue());
        }
        return entry.getValue() == null && dVar.containsKey((K) entry.getKey());
    }

    @Override // kotlin.collections.AbstractCollection
    public final int e() {
        d<K, V> dVar = this.f2953b;
        dVar.getClass();
        return dVar.f2935c;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        t<K, V> tVar = this.f2953b.f2934b;
        u[] uVarArr = new u[8];
        for (int i10 = 0; i10 < 8; i10++) {
            uVarArr[i10] = new v();
        }
        return new o(tVar, uVarArr);
    }
}
