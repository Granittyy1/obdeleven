package E;

import kotlin.collections.AbstractMap;

/* JADX INFO: compiled from: PersistentHashMap.kt */
/* JADX INFO: loaded from: classes.dex */
public class d<K, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f2933d = new d(t.f2956e, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t<K, V> f2934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2935c;

    public d(t<K, V> tVar, int i10) {
        this.f2934b = tVar;
        this.f2935c = i10;
    }

    public final d b(Object obj, F.a aVar) {
        t.a aVarU = this.f2934b.u(obj != null ? obj.hashCode() : 0, 0, obj, aVar);
        return aVarU == null ? this : new d(aVarU.f2961a, this.f2935c + aVarU.f2962b);
    }

    @Override // java.util.Map
    public boolean containsKey(K k10) {
        return this.f2934b.d(k10 != null ? k10.hashCode() : 0, 0, k10);
    }

    @Override // java.util.Map
    public V get(K k10) {
        return (V) this.f2934b.g(k10 != null ? k10.hashCode() : 0, 0, k10);
    }
}
