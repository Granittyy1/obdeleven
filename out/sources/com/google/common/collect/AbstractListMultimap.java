package com.google.common.collect;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractListMultimap<K, V> extends AbstractMapBasedMultimap<K, V> implements n<K, V> {
    private static final long serialVersionUID = 6588350623831699109L;

    @Override // com.google.common.collect.r
    public final boolean a(Double d10, Integer num) {
        Collection<V> collection = this.f27819e.get(d10);
        if (collection != null) {
            if (!collection.add(num)) {
                return false;
            }
            this.f27820f++;
            return true;
        }
        List<V> list = ((Multimaps$CustomListMultimap) this).f27938g.get();
        if (!list.add(num)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f27820f++;
        this.f27819e.put(d10, list);
        return true;
    }

    @Override // com.google.common.collect.r
    public final Map<K, Collection<V>> b() {
        Map<K, Collection<V>> map = this.f27967d;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> mapC = c();
        this.f27967d = mapC;
        return mapC;
    }
}
