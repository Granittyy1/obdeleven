package com.google.common.collect;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class RegularImmutableMap<K, V> extends ImmutableMap<K, V> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ImmutableMap<Object, Object> f27943h = new RegularImmutableMap(0, null, new Object[0]);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object f27944e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient Object[] f27945f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f27946g;

    public static class EntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final transient ImmutableMap<K, V> f27947e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final transient Object[] f27948f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final transient int f27949g;

        public EntrySet(ImmutableMap immutableMap, Object[] objArr, int i10) {
            this.f27947e = immutableMap;
            this.f27948f = objArr;
            this.f27949g = i10;
        }

        @Override // com.google.common.collect.ImmutableSet
        public final ImmutableList<Map.Entry<K, V>> I() {
            return new ImmutableList<Map.Entry<K, V>>() { // from class: com.google.common.collect.RegularImmutableMap.EntrySet.1
                @Override // java.util.List
                public final Object get(int i10) {
                    A8.p.h(i10, EntrySet.this.f27949g);
                    int i11 = i10 * 2;
                    Object obj = EntrySet.this.f27948f[i11];
                    Objects.requireNonNull(obj);
                    Object obj2 = EntrySet.this.f27948f[i11 + 1];
                    Objects.requireNonNull(obj2);
                    return new AbstractMap.SimpleImmutableEntry(obj, obj2);
                }

                @Override // com.google.common.collect.ImmutableCollection
                public final boolean s() {
                    return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
                    return EntrySet.this.f27949g;
                }

                @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
                public Object writeReplace() {
                    return super.writeReplace();
                }
            };
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f27947e.get(key));
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final int e(int i10, Object[] objArr) {
            return d().e(i10, objArr);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean s() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.f27949g;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* JADX INFO: renamed from: v */
        public final C<Map.Entry<K, V>> iterator() {
            return d().listIterator(0);
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public static final class KeySet<K> extends ImmutableSet<K> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final transient ImmutableMap<K, ?> f27950e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final transient ImmutableList<K> f27951f;

        public KeySet(ImmutableMap<K, ?> immutableMap, ImmutableList<K> immutableList) {
            this.f27950e = immutableMap;
            this.f27951f = immutableList;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return this.f27950e.get(obj) != null;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public final ImmutableList<K> d() {
            return this.f27951f;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final int e(int i10, Object[] objArr) {
            return this.f27951f.e(i10, objArr);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean s() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.f27950e.size();
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* JADX INFO: renamed from: v */
        public final C<K> iterator() {
            return this.f27951f.listIterator(0);
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public static final class KeysOrValuesAsList extends ImmutableList<Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final transient Object[] f27952d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final transient int f27953e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final transient int f27954f;

        public KeysOrValuesAsList(int i10, int i11, Object[] objArr) {
            this.f27952d = objArr;
            this.f27953e = i10;
            this.f27954f = i11;
        }

        @Override // java.util.List
        public final Object get(int i10) {
            A8.p.h(i10, this.f27954f);
            Object obj = this.f27952d[(i10 * 2) + this.f27953e];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean s() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f27954f;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public RegularImmutableMap(int i10, Object obj, Object[] objArr) {
        this.f27944e = obj;
        this.f27945f = objArr;
        this.f27946g = i10;
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet<Map.Entry<K, V>> b() {
        return new EntrySet(this, this.f27945f, this.f27946g);
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet<K> c() {
        return new KeySet(this, new KeysOrValuesAsList(0, this.f27946g, this.f27945f));
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableCollection<V> e() {
        return new KeysOrValuesAsList(1, this.f27946g, this.f27945f);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final V get(Object obj) {
        V v10;
        if (obj == null) {
            v10 = null;
        } else {
            Object[] objArr = this.f27945f;
            if (this.f27946g == 1) {
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                if (obj2.equals(obj)) {
                    v10 = (V) objArr[1];
                    Objects.requireNonNull(v10);
                } else {
                    v10 = null;
                }
            } else {
                Object obj3 = this.f27944e;
                if (obj3 == null) {
                    v10 = null;
                } else if (obj3 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj3;
                    int length = bArr.length - 1;
                    int iK = kotlin.jvm.internal.n.k(obj.hashCode());
                    while (true) {
                        int i10 = iK & length;
                        int i11 = bArr[i10] & 255;
                        if (i11 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i11])) {
                            v10 = (V) objArr[i11 ^ 1];
                        } else {
                            iK = i10 + 1;
                        }
                    }
                    v10 = null;
                } else if (obj3 instanceof short[]) {
                    short[] sArr = (short[]) obj3;
                    int length2 = sArr.length - 1;
                    int iK2 = kotlin.jvm.internal.n.k(obj.hashCode());
                    while (true) {
                        int i12 = iK2 & length2;
                        int i13 = sArr[i12] & 65535;
                        if (i13 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[i13])) {
                            v10 = (V) objArr[i13 ^ 1];
                        } else {
                            iK2 = i12 + 1;
                        }
                    }
                    v10 = null;
                } else {
                    int[] iArr = (int[]) obj3;
                    int length3 = iArr.length - 1;
                    int iK3 = kotlin.jvm.internal.n.k(obj.hashCode());
                    while (true) {
                        int i14 = iK3 & length3;
                        int i15 = iArr[i14];
                        if (i15 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i15])) {
                            v10 = (V) objArr[i15 ^ 1];
                        } else {
                            iK3 = i14 + 1;
                        }
                    }
                    v10 = null;
                }
            }
        }
        if (v10 == null) {
            return null;
        }
        return v10;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f27946g;
    }

    @Override // com.google.common.collect.ImmutableMap
    public Object writeReplace() {
        return super.writeReplace();
    }
}
