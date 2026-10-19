package p173o;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: SafeIterableMap.java */
/* JADX INFO: loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c<K, V> f45034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c<K, V> f45035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakHashMap<f<K, V>, Boolean> f45036d = new WeakHashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f45037e = 0;

    /* JADX INFO: compiled from: SafeIterableMap.java */
    public static class a<K, V> extends e<K, V> {
        @Override // o.b.e
        public final c<K, V> b(c<K, V> cVar) {
            return cVar.f45041e;
        }

        @Override // o.b.e
        public final c<K, V> c(c<K, V> cVar) {
            return cVar.f45040d;
        }
    }

    /* JADX INFO: renamed from: o.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SafeIterableMap.java */
    public static class C0511b<K, V> extends e<K, V> {
        @Override // o.b.e
        public final c<K, V> b(c<K, V> cVar) {
            return cVar.f45040d;
        }

        @Override // o.b.e
        public final c<K, V> c(c<K, V> cVar) {
            return cVar.f45041e;
        }
    }

    /* JADX INFO: compiled from: SafeIterableMap.java */
    public static class c<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final K f45038b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final V f45039c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c<K, V> f45040d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c<K, V> f45041e;

        public c(K k10, V v10) {
            this.f45038b = k10;
            this.f45039c = v10;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f45038b.equals(cVar.f45038b) && this.f45039c.equals(cVar.f45039c);
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f45038b;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f45039c;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            return this.f45038b.hashCode() ^ this.f45039c.hashCode();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public final String toString() {
            return this.f45038b + "=" + this.f45039c;
        }
    }

    /* JADX INFO: compiled from: SafeIterableMap.java */
    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c<K, V> f45042b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f45043c = true;

        public d() {
        }

        @Override // o.b.f
        public final void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f45042b;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f45041e;
                this.f45042b = cVar3;
                this.f45043c = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f45043c) {
                return b.this.f45034b != null;
            }
            c<K, V> cVar = this.f45042b;
            return (cVar == null || cVar.f45040d == null) ? false : true;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (this.f45043c) {
                this.f45043c = false;
                this.f45042b = b.this.f45034b;
            } else {
                c<K, V> cVar = this.f45042b;
                this.f45042b = cVar != null ? cVar.f45040d : null;
            }
            return this.f45042b;
        }
    }

    /* JADX INFO: compiled from: SafeIterableMap.java */
    public static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c<K, V> f45045b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c<K, V> f45046c;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.f45045b = cVar2;
            this.f45046c = cVar;
        }

        @Override // o.b.f
        public final void a(c<K, V> cVar) {
            c<K, V> cVarC = null;
            if (this.f45045b == cVar && cVar == this.f45046c) {
                this.f45046c = null;
                this.f45045b = null;
            }
            c<K, V> cVar2 = this.f45045b;
            if (cVar2 == cVar) {
                this.f45045b = b(cVar2);
            }
            c<K, V> cVar3 = this.f45046c;
            if (cVar3 == cVar) {
                c<K, V> cVar4 = this.f45045b;
                if (cVar3 != cVar4 && cVar4 != null) {
                    cVarC = c(cVar3);
                }
                this.f45046c = cVarC;
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f45046c != null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            c<K, V> cVar = this.f45046c;
            c<K, V> cVar2 = this.f45045b;
            this.f45046c = (cVar == cVar2 || cVar2 == null) ? null : c(cVar);
            return cVar;
        }
    }

    /* JADX INFO: compiled from: SafeIterableMap.java */
    public static abstract class f<K, V> {
        public abstract void a(c<K, V> cVar);
    }

    public c<K, V> d(K k10) {
        c<K, V> cVar = this.f45034b;
        while (cVar != null && !cVar.f45038b.equals(k10)) {
            cVar = cVar.f45040d;
        }
        return cVar;
    }

    public V e(K k10) {
        c<K, V> cVarD = d(k10);
        if (cVarD == null) {
            return null;
        }
        this.f45037e--;
        WeakHashMap<f<K, V>, Boolean> weakHashMap = this.f45036d;
        if (!weakHashMap.isEmpty()) {
            Iterator<f<K, V>> it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(cVarD);
            }
        }
        c<K, V> cVar = cVarD.f45041e;
        if (cVar != null) {
            cVar.f45040d = cVarD.f45040d;
        } else {
            this.f45034b = cVarD.f45040d;
        }
        c<K, V> cVar2 = cVarD.f45040d;
        if (cVar2 != null) {
            cVar2.f45041e = cVar;
        } else {
            this.f45035c = cVar;
        }
        cVarD.f45040d = null;
        cVarD.f45041e = null;
        return cVarD.f45039c;
    }

    public final boolean equals(Object obj) {
        e eVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f45037e != bVar.f45037e) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
        while (true) {
            eVar = (e) it;
            if (!eVar.hasNext()) {
                break;
            }
            e eVar2 = (e) it2;
            if (!eVar2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) eVar.next();
            Object next = eVar2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (eVar.hasNext() || ((e) it2).hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int iHashCode = 0;
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f45034b, this.f45035c);
        this.f45036d.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                sb2.append("]");
                return sb2.toString();
            }
            sb2.append(((Map.Entry) eVar.next()).toString());
            if (eVar.hasNext()) {
                sb2.append(", ");
            }
        }
    }
}
