package E;

import java.util.Map;

/* JADX INFO: compiled from: PersistentHashMapBuilderContentIterators.kt */
/* JADX INFO: loaded from: classes.dex */
public final class x<K, V> extends u<K, V, Map.Entry<K, V>> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i<K, V> f2966e;

    public x(i<K, V> iVar) {
        this.f2966e = iVar;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f2965d;
        this.f2965d = i10 + 2;
        Object[] objArr = this.f2963b;
        return new c(this.f2966e, objArr[i10], objArr[i10 + 1]);
    }
}
