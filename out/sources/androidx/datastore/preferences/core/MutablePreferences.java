package androidx.datastore.preferences.core;

import Ia.l;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.q;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: Preferences.kt */
/* JADX INFO: loaded from: classes.dex */
public final class MutablePreferences extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<c.a<?>, Object> f17083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f17084b;

    public MutablePreferences() {
        this(3, false);
    }

    @Override // androidx.datastore.preferences.core.c
    public final Map<c.a<?>, Object> a() {
        Map<c.a<?>, Object> mapUnmodifiableMap = Collections.unmodifiableMap(this.f17083a);
        i.d(mapUnmodifiableMap, "unmodifiableMap(preferencesMap)");
        return mapUnmodifiableMap;
    }

    @Override // androidx.datastore.preferences.core.c
    public final <T> T b(c.a<T> key) {
        i.e(key, "key");
        return (T) this.f17083a.get(key);
    }

    public final void c(c.a<?> key, Object obj) {
        i.e(key, "key");
        AtomicBoolean atomicBoolean = this.f17084b;
        if (atomicBoolean.get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
        Map<c.a<?>, Object> map = this.f17083a;
        if (obj == null) {
            if (atomicBoolean.get()) {
                throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
            }
            map.remove(key);
        } else {
            if (!(obj instanceof Set)) {
                map.put(key, obj);
                return;
            }
            Set setUnmodifiableSet = Collections.unmodifiableSet(q.s0((Iterable) obj));
            i.d(setUnmodifiableSet, "unmodifiableSet(value.toSet())");
            map.put(key, setUnmodifiableSet);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof MutablePreferences)) {
            return false;
        }
        return i.a(this.f17083a, ((MutablePreferences) obj).f17083a);
    }

    public final int hashCode() {
        return this.f17083a.hashCode();
    }

    public final String toString() {
        return q.U(this.f17083a.entrySet(), ",\n", "{\n", "\n}", new l<Map.Entry<c.a<?>, Object>, CharSequence>() { // from class: androidx.datastore.preferences.core.MutablePreferences.toString.1
            @Override // Ia.l
            public final CharSequence invoke(Map.Entry<c.a<?>, Object> entry) {
                Map.Entry<c.a<?>, Object> entry2 = entry;
                i.e(entry2, "entry");
                return "  " + entry2.getKey().f17087a + " = " + entry2.getValue();
            }
        }, 24);
    }

    public /* synthetic */ MutablePreferences(int i10, boolean z10) {
        this(new LinkedHashMap(), (i10 & 2) != 0 ? true : z10);
    }

    public MutablePreferences(Map<c.a<?>, Object> preferencesMap, boolean z10) {
        i.e(preferencesMap, "preferencesMap");
        this.f17083a = preferencesMap;
        this.f17084b = new AtomicBoolean(z10);
    }
}
