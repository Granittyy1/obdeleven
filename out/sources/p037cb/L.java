package p037cb;

import Ya.b;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.i;
import p011ab.e;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class L<K, V> extends W<K, V, Map<K, ? extends V>, LinkedHashMap<K, V>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final K f22564c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(b<K> kSerializer, b<V> vSerializer) {
        super(kSerializer, vSerializer);
        i.e(kSerializer, "kSerializer");
        i.e(vSerializer, "vSerializer");
        e keyDesc = kSerializer.getDescriptor();
        e valueDesc = vSerializer.getDescriptor();
        i.e(keyDesc, "keyDesc");
        i.e(valueDesc, "valueDesc");
        this.f22564c = new K(keyDesc, valueDesc);
    }

    @Override // p037cb.AbstractC1513a
    public final Object a() {
        return new LinkedHashMap();
    }

    @Override // p037cb.AbstractC1513a
    public final int b(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        i.e(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    @Override // p037cb.AbstractC1513a
    public final Iterator c(Object obj) {
        Map map = (Map) obj;
        i.e(map, "<this>");
        return map.entrySet().iterator();
    }

    @Override // p037cb.AbstractC1513a
    public final int d(Object obj) {
        Map map = (Map) obj;
        i.e(map, "<this>");
        return map.size();
    }

    @Override // p037cb.AbstractC1513a
    public final Object g(Object obj) {
        i.e(null, "<this>");
        return new LinkedHashMap((Map) null);
    }

    @Override // Ya.l, Ya.a
    public final e getDescriptor() {
        return this.f22564c;
    }

    @Override // p037cb.AbstractC1513a
    public final Object h(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        i.e(linkedHashMap, "<this>");
        return linkedHashMap;
    }
}
