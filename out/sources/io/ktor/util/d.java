package io.ktor.util;

import A8.A;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: CaseInsensitiveMap.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d<Value> implements Map<String, Value>, Ja.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f40532b = new LinkedHashMap();

    @Override // java.util.Map
    public final void clear() {
        this.f40532b.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        String key = (String) obj;
        kotlin.jvm.internal.i.e(key, "key");
        return this.f40532b.containsKey(new e(key));
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.f40532b.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, Value>> entrySet() {
        return new h(this.f40532b.entrySet(), new Ia.l<Map.Entry<e, Object>, Map.Entry<String, Object>>() { // from class: io.ktor.util.CaseInsensitiveMap$entries$1
            @Override // Ia.l
            public final Map.Entry<String, Object> invoke(Map.Entry<e, Object> entry) {
                Map.Entry<e, Object> $receiver = entry;
                kotlin.jvm.internal.i.e($receiver, "$this$$receiver");
                return new i($receiver.getKey().f40535a, $receiver.getValue());
            }
        }, new Ia.l<Map.Entry<String, Object>, Map.Entry<e, Object>>() { // from class: io.ktor.util.CaseInsensitiveMap$entries$2
            @Override // Ia.l
            public final Map.Entry<e, Object> invoke(Map.Entry<String, Object> entry) {
                Map.Entry<String, Object> $receiver = entry;
                kotlin.jvm.internal.i.e($receiver, "$this$$receiver");
                return new i(A.c($receiver.getKey()), $receiver.getValue());
            }
        });
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        return kotlin.jvm.internal.i.a(((d) obj).f40532b, this.f40532b);
    }

    @Override // java.util.Map
    public final Value get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String key = (String) obj;
        kotlin.jvm.internal.i.e(key, "key");
        return (Value) this.f40532b.get(A.c(key));
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f40532b.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f40532b.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return new h(this.f40532b.keySet(), new Ia.l<e, String>() { // from class: io.ktor.util.CaseInsensitiveMap$keys$1
            @Override // Ia.l
            public final String invoke(e eVar) {
                e $receiver = eVar;
                kotlin.jvm.internal.i.e($receiver, "$this$$receiver");
                return $receiver.f40535a;
            }
        }, new Ia.l<String, e>() { // from class: io.ktor.util.CaseInsensitiveMap$keys$2
            @Override // Ia.l
            public final e invoke(String str) {
                String $receiver = str;
                kotlin.jvm.internal.i.e($receiver, "$this$$receiver");
                return A.c($receiver);
            }
        });
    }

    @Override // java.util.Map
    public final Object put(String str, Object value) {
        String key = str;
        kotlin.jvm.internal.i.e(key, "key");
        kotlin.jvm.internal.i.e(value, "value");
        return this.f40532b.put(A.c(key), value);
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends Value> from) {
        kotlin.jvm.internal.i.e(from, "from");
        for (Map.Entry<? extends String, ? extends Value> entry : from.entrySet()) {
            String key = entry.getKey();
            Value value = entry.getValue();
            kotlin.jvm.internal.i.e(key, "key");
            kotlin.jvm.internal.i.e(value, "value");
            this.f40532b.put(A.c(key), value);
        }
    }

    @Override // java.util.Map
    public final Value remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String key = (String) obj;
        kotlin.jvm.internal.i.e(key, "key");
        return (Value) this.f40532b.remove(A.c(key));
    }

    @Override // java.util.Map
    public final int size() {
        return this.f40532b.size();
    }

    @Override // java.util.Map
    public final Collection<Value> values() {
        return this.f40532b.values();
    }
}
