package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: LazyField.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2080w extends C2081x {

    /* JADX INFO: renamed from: com.google.protobuf.w$a */
    /* JADX INFO: compiled from: LazyField.java */
    public static class a<K> implements Map.Entry<K, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map.Entry<K, C2080w> f29202b;

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f29202b.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            C2080w value = this.f29202b.getValue();
            if (value == null) {
                return null;
            }
            return value.a(null);
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (!(obj instanceof J)) {
                throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            }
            C2080w value = this.f29202b.getValue();
            J j = value.f29204a;
            value.f29205b = null;
            value.f29204a = (J) obj;
            return j;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.w$b */
    /* JADX INFO: compiled from: LazyField.java */
    public static class b<K> implements Iterator<Map.Entry<K, Object>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Iterator<Map.Entry<K, Object>> f29203b;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f29203b.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            Map.Entry<K, Object> next = this.f29203b.next();
            if (!(next.getValue() instanceof C2080w)) {
                return next;
            }
            a aVar = new a();
            aVar.f29202b = next;
            return aVar;
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f29203b.remove();
        }
    }

    @Override // com.google.protobuf.C2081x
    public final boolean equals(Object obj) {
        return a(null).equals(obj);
    }

    @Override // com.google.protobuf.C2081x
    public final int hashCode() {
        return a(null).hashCode();
    }

    public final String toString() {
        return a(null).toString();
    }
}
