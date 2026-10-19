package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: LazyField.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1331v extends C1332w {

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.v$a */
    /* JADX INFO: compiled from: LazyField.java */
    public static class a<K> implements Map.Entry<K, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map.Entry<K, C1331v> f17282b;

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f17282b.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            C1331v value = this.f17282b.getValue();
            if (value == null) {
                return null;
            }
            return value.a(null);
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (!(obj instanceof I)) {
                throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            }
            C1331v value = this.f17282b.getValue();
            I i10 = value.f17284a;
            value.f17285b = null;
            value.f17284a = (I) obj;
            return i10;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.v$b */
    /* JADX INFO: compiled from: LazyField.java */
    public static class b<K> implements Iterator<Map.Entry<K, Object>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Iterator<Map.Entry<K, Object>> f17283b;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f17283b.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            Map.Entry<K, Object> next = this.f17283b.next();
            if (!(next.getValue() instanceof C1331v)) {
                return next;
            }
            a aVar = new a();
            aVar.f17282b = next;
            return aVar;
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f17283b.remove();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.C1332w
    public final boolean equals(Object obj) {
        return a(null).equals(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.C1332w
    public final int hashCode() {
        return a(null).hashCode();
    }

    public final String toString() {
        return a(null).toString();
    }
}
