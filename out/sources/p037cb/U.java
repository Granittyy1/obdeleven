package p037cb;

import B6.c;
import Ya.b;
import java.util.Map;
import kotlin.jvm.internal.i;
import p011ab.a;
import p011ab.e;
import p011ab.h;
import p011ab.l;
import p011ab.n;
import p293xa.r;

/* JADX INFO: compiled from: Tuples.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class U<K, V> extends J<K, V, Map.Entry<? extends K, ? extends V>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f22583c;

    /* JADX INFO: compiled from: Tuples.kt */
    public static final class a<K, V> implements Map.Entry<K, V>, Ja.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final K f22584b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final V f22585c;

        public a(K k10, V v10) {
            this.f22584b = k10;
            this.f22585c = v10;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return i.a(this.f22584b, aVar.f22584b) && i.a(this.f22585c, aVar.f22585c);
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f22584b;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f22585c;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k10 = this.f22584b;
            int iHashCode = (k10 == null ? 0 : k10.hashCode()) * 31;
            V v10 = this.f22585c;
            return iHashCode + (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MapEntry(key=");
            sb2.append(this.f22584b);
            sb2.append(", value=");
            return c.e(sb2, this.f22585c, ')');
        }
    }

    public U(final b<K> bVar, final b<V> bVar2) {
        super(bVar, bVar2);
        this.f22583c = l.c("kotlin.collections.Map.Entry", n.c.f8126a, new e[0], new Ia.l() { // from class: cb.T
            @Override // Ia.l
            public final Object invoke(Object obj) {
                a buildSerialDescriptor = (a) obj;
                i.e(buildSerialDescriptor, "$this$buildSerialDescriptor");
                a.b(buildSerialDescriptor, "key", bVar.getDescriptor());
                a.b(buildSerialDescriptor, "value", bVar2.getDescriptor());
                return r.f47939a;
            }
        });
    }

    @Override // p037cb.J
    public final Object a(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        i.e(entry, "<this>");
        return entry.getKey();
    }

    @Override // p037cb.J
    public final Object b(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        i.e(entry, "<this>");
        return entry.getValue();
    }

    @Override // p037cb.J
    public final Object c(Object obj, Object obj2) {
        return new a(obj, obj2);
    }

    @Override // Ya.l, Ya.a
    public final e getDescriptor() {
        return this.f22583c;
    }
}
