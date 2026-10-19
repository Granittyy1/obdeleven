package androidx.collection;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: androidx.collection.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: LruCache.kt */
/* JADX INFO: loaded from: classes.dex */
public class C0893v<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p233t.b<K, V> f9216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final O.h f9217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9220f;

    public C0893v(int i10) {
        this.f9215a = i10;
        if (i10 <= 0) {
            D9.o.q("maxSize <= 0");
            throw null;
        }
        this.f9216b = new p233t.b<>();
        this.f9217c = new O.h();
    }

    public V a(K key) {
        kotlin.jvm.internal.i.e(key, "key");
        return null;
    }

    public void b(Object key, Object oldValue, Object obj) {
        kotlin.jvm.internal.i.e(key, "key");
        kotlin.jvm.internal.i.e(oldValue, "oldValue");
    }

    public final V c(K key) {
        V vPut;
        kotlin.jvm.internal.i.e(key, "key");
        synchronized (this.f9217c) {
            p233t.b<K, V> bVar = this.f9216b;
            bVar.getClass();
            V v10 = bVar.f46999a.get(key);
            if (v10 != null) {
                this.f9219e++;
                return v10;
            }
            this.f9220f++;
            V vA = a(key);
            if (vA == null) {
                return null;
            }
            synchronized (this.f9217c) {
                try {
                    p233t.b<K, V> bVar2 = this.f9216b;
                    bVar2.getClass();
                    vPut = bVar2.f46999a.put(key, vA);
                    if (vPut != null) {
                        p233t.b<K, V> bVar3 = this.f9216b;
                        bVar3.getClass();
                        bVar3.f46999a.put(key, vPut);
                    } else {
                        this.f9218d += f(key, vA);
                        p293xa.r rVar = p293xa.r.f47939a;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (vPut != null) {
                b(key, vA, vPut);
                return vPut;
            }
            h(this.f9215a);
            return vA;
        }
    }

    public final V d(K key, V value) {
        V vPut;
        kotlin.jvm.internal.i.e(key, "key");
        kotlin.jvm.internal.i.e(value, "value");
        synchronized (this.f9217c) {
            try {
                this.f9218d += f(key, value);
                p233t.b<K, V> bVar = this.f9216b;
                bVar.getClass();
                vPut = bVar.f46999a.put(key, value);
                if (vPut != null) {
                    this.f9218d -= f(key, vPut);
                }
                p293xa.r rVar = p293xa.r.f47939a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (vPut != null) {
            b(key, vPut, value);
        }
        h(this.f9215a);
        return vPut;
    }

    public final V e(K key) {
        V vRemove;
        kotlin.jvm.internal.i.e(key, "key");
        synchronized (this.f9217c) {
            try {
                p233t.b<K, V> bVar = this.f9216b;
                bVar.getClass();
                vRemove = bVar.f46999a.remove(key);
                if (vRemove != null) {
                    this.f9218d -= f(key, vRemove);
                }
                p293xa.r rVar = p293xa.r.f47939a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (vRemove != null) {
            b(key, vRemove, null);
        }
        return vRemove;
    }

    public final int f(K k10, V v10) {
        int iG = g(k10, v10);
        if (iG >= 0) {
            return iG;
        }
        String message = "Negative size: " + k10 + '=' + v10;
        kotlin.jvm.internal.i.e(message, "message");
        throw new IllegalStateException(message);
    }

    public int g(K key, V value) {
        kotlin.jvm.internal.i.e(key, "key");
        kotlin.jvm.internal.i.e(value, "value");
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(int i10) {
        Object next;
        Object key;
        Object value;
        while (true) {
            synchronized (this.f9217c) {
                try {
                    if (!(this.f9218d >= 0 && (!this.f9216b.f46999a.isEmpty() || this.f9218d == 0))) {
                        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
                    }
                    if (this.f9218d > i10 && !this.f9216b.f46999a.isEmpty()) {
                        Set<Map.Entry<K, V>> setEntrySet = this.f9216b.f46999a.entrySet();
                        kotlin.jvm.internal.i.d(setEntrySet, "<get-entries>(...)");
                        Set<Map.Entry<K, V>> set = setEntrySet;
                        if (set instanceof List) {
                            List list = (List) set;
                            next = list.isEmpty() ? null : list.get(0);
                        } else {
                            Iterator<T> it = set.iterator();
                            if (it.hasNext()) {
                                next = it.next();
                            }
                        }
                        Map.Entry entry = (Map.Entry) next;
                        if (entry == null) {
                            return;
                        }
                        key = entry.getKey();
                        value = entry.getValue();
                        p233t.b<K, V> bVar = this.f9216b;
                        bVar.getClass();
                        kotlin.jvm.internal.i.e(key, "key");
                        bVar.f46999a.remove(key);
                        this.f9218d -= f(key, value);
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
            b(key, value, null);
        }
    }

    public final String toString() {
        String str;
        synchronized (this.f9217c) {
            try {
                int i10 = this.f9219e;
                int i11 = this.f9220f + i10;
                str = "LruCache[maxSize=" + this.f9215a + ",hits=" + this.f9219e + ",misses=" + this.f9220f + ",hitRate=" + (i11 != 0 ? (i10 * 100) / i11 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
