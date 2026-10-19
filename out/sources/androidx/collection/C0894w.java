package androidx.collection;

import java.util.Map;

/* JADX INFO: renamed from: androidx.collection.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ScatterMap.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0894w<K, V> implements Map.Entry<K, V>, Ja.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K f9221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final V f9222c;

    public C0894w(K k10, V v10) {
        this.f9221b = k10;
        this.f9222c = v10;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.f9221b;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.f9222c;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
