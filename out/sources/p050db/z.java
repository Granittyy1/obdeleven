package p050db;

import Ya.b;
import Ya.k;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.collections.q;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: JsonElement.kt */
/* JADX INFO: loaded from: classes2.dex */
@k(with = A.class)
public final class z extends h implements Map<String, h>, Ja.a {
    public static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, h> f34699b;

    /* JADX INFO: compiled from: JsonElement.kt */
    public static final class a {
        public final b<z> serializer() {
            return A.f34634a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z(Map<String, ? extends h> content) {
        i.e(content, "content");
        this.f34699b = content;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ h compute(String str, BiFunction<? super String, ? super h, ? extends h> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ h computeIfAbsent(String str, Function<? super String, ? extends h> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ h computeIfPresent(String str, BiFunction<? super String, ? super h, ? extends h> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        String key = (String) obj;
        i.e(key, "key");
        return this.f34699b.containsKey(key);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h value = (h) obj;
        i.e(value, "value");
        return this.f34699b.containsValue(value);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, h>> entrySet() {
        return this.f34699b.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return i.a(this.f34699b, obj);
    }

    @Override // java.util.Map
    public final h get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String key = (String) obj;
        i.e(key, "key");
        return this.f34699b.get(key);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f34699b.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f34699b.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.f34699b.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ h merge(String str, h hVar, BiFunction<? super h, ? super h, ? extends h> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ h put(String str, h hVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends h> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ h putIfAbsent(String str, h hVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final h remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ h replace(String str, h hVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super h, ? extends h> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f34699b.size();
    }

    public final String toString() {
        return q.U(this.f34699b.entrySet(), ",", "{", "}", new y(0), 24);
    }

    @Override // java.util.Map
    public final Collection<h> values() {
        return this.f34699b.values();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(String str, h hVar, h hVar2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
