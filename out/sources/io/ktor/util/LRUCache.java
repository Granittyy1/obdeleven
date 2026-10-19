package io.ktor.util;

import java.util.LinkedHashMap;
import java.util.Map;
import p293xa.r;

/* JADX INFO: compiled from: Cache.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private final Ia.l<V, r> close;
    private final int maxSize;
    private final Ia.l<K, V> supplier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LRUCache(Ia.l<? super K, ? extends V> lVar, Ia.l<? super V, r> close, int i10) {
        super(10, 0.75f, true);
        kotlin.jvm.internal.i.e(close, "close");
        this.supplier = lVar;
        this.close = close;
        this.maxSize = i10;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        if (this.maxSize == 0) {
            return this.supplier.invoke(obj);
        }
        synchronized (this) {
            V v10 = (V) super.get(obj);
            if (v10 != null) {
                return v10;
            }
            V vInvoke = this.supplier.invoke(obj);
            put(obj, vInvoke);
            return vInvoke;
        }
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<? extends K, ? extends V> eldest) {
        kotlin.jvm.internal.i.e(eldest, "eldest");
        boolean z10 = super.size() > this.maxSize;
        if (z10) {
            this.close.invoke(eldest.getValue());
        }
        return z10;
    }
}
