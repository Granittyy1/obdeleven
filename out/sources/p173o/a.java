package p173o;

import java.util.HashMap;

/* JADX INFO: compiled from: FastSafeIterableMap.java */
/* JADX INFO: loaded from: classes.dex */
public final class a<K, V> extends b<K, V> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap<K, b.c<K, V>> f45033f = new HashMap<>();

    @Override // p173o.b
    public final b.c<K, V> d(K k10) {
        return this.f45033f.get(k10);
    }

    @Override // p173o.b
    public final V e(K k10) {
        V v10 = (V) super.e(k10);
        this.f45033f.remove(k10);
        return v10;
    }
}
