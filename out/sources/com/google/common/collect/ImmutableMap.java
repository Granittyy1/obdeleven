package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ImmutableMap<K, V> implements Map<K, V>, Serializable {
    private static final long serialVersionUID = 912559;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient ImmutableSet<Map.Entry<K, V>> f27878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient ImmutableSet<K> f27879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient ImmutableCollection<V> f27880d;

    public static class SerializedForm<K, V> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Object keys;
        private final Object values;

        public SerializedForm(ImmutableMap<K, V> immutableMap) {
            Object[] objArr = new Object[immutableMap.size()];
            Object[] objArr2 = new Object[immutableMap.size()];
            C<Map.Entry<K, V>> it = immutableMap.entrySet().iterator();
            int i10 = 0;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                objArr[i10] = next.getKey();
                objArr2[i10] = next.getValue();
                i10++;
            }
            this.keys = objArr;
            this.values = objArr2;
        }

        public final Object readResolve() {
            Object obj = this.keys;
            if (obj instanceof ImmutableSet) {
                ImmutableSet immutableSet = (ImmutableSet) obj;
                ImmutableCollection immutableCollection = (ImmutableCollection) this.values;
                a aVar = new a(immutableSet.size());
                Iterator it = immutableSet.iterator();
                C it2 = immutableCollection.iterator();
                while (it.hasNext()) {
                    aVar.b(it.next(), it2.next());
                }
                return aVar.a();
            }
            Object[] objArr = (Object[]) obj;
            Object[] objArr2 = (Object[]) this.values;
            a aVar2 = new a(objArr.length);
            for (int i10 = 0; i10 < objArr.length; i10++) {
                aVar2.b(objArr[i10], objArr2[i10]);
            }
            return aVar2.a();
        }
    }

    public static class a<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object[] f27881a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f27882b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public C0279a f27883c;

        /* JADX INFO: renamed from: com.google.common.collect.ImmutableMap$a$a, reason: collision with other inner class name */
        public static final class C0279a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Object f27884a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f27885b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Object f27886c;

            public C0279a(Object obj, Object obj2, Object obj3) {
                this.f27884a = obj;
                this.f27885b = obj2;
                this.f27886c = obj3;
            }

            public final IllegalArgumentException a() {
                StringBuilder sb2 = new StringBuilder("Multiple entries with same key: ");
                Object obj = this.f27884a;
                sb2.append(obj);
                sb2.append("=");
                sb2.append(this.f27885b);
                sb2.append(" and ");
                sb2.append(obj);
                sb2.append("=");
                sb2.append(this.f27886c);
                return new IllegalArgumentException(sb2.toString());
            }
        }

        public a(int i10) {
            this.f27881a = new Object[i10 * 2];
        }

        /* JADX WARN: Code duplicated, block: B:73:0x018a  */
        public final ImmutableMap<K, V> a() {
            Object[] objArr;
            char c10;
            boolean z10;
            Object obj;
            RegularImmutableMap regularImmutableMap;
            char c11 = 2;
            C0279a c0279a = this.f27883c;
            if (c0279a != null) {
                throw c0279a.a();
            }
            int iIntValue = this.f27882b;
            Object[] objArrCopyOf = this.f27881a;
            if (iIntValue == 0) {
                regularImmutableMap = (RegularImmutableMap) RegularImmutableMap.f27943h;
            } else {
                ImmutableMap<Object, Object> immutableMap = RegularImmutableMap.f27943h;
                C0279a c0279a2 = null;
                Object obj2 = null;
                C0279a c0279a3 = null;
                C0279a c0279a4 = null;
                if (iIntValue == 1) {
                    Objects.requireNonNull(objArrCopyOf[0]);
                    Objects.requireNonNull(objArrCopyOf[1]);
                    regularImmutableMap = new RegularImmutableMap(1, null, objArrCopyOf);
                } else {
                    A8.p.k(iIntValue, objArrCopyOf.length >> 1);
                    int iA = ImmutableSet.A(iIntValue);
                    if (iIntValue == 1) {
                        Objects.requireNonNull(objArrCopyOf[0]);
                        Objects.requireNonNull(objArrCopyOf[1]);
                    } else {
                        int i10 = iA - 1;
                        int i11 = -1;
                        if (iA <= 128) {
                            byte[] bArr = new byte[iA];
                            Arrays.fill(bArr, (byte) -1);
                            int i12 = 0;
                            for (int i13 = 0; i13 < iIntValue; i13++) {
                                int i14 = i13 * 2;
                                int i15 = i12 * 2;
                                Object obj3 = objArrCopyOf[i14];
                                Objects.requireNonNull(obj3);
                                Object obj4 = objArrCopyOf[i14 ^ 1];
                                Objects.requireNonNull(obj4);
                                int iK = kotlin.jvm.internal.n.k(obj3.hashCode());
                                while (true) {
                                    int i16 = iK & i10;
                                    int i17 = bArr[i16] & 255;
                                    if (i17 == 255) {
                                        bArr[i16] = (byte) i15;
                                        if (i12 < i13) {
                                            objArrCopyOf[i15] = obj3;
                                            objArrCopyOf[i15 ^ 1] = obj4;
                                        }
                                        i12++;
                                        break;
                                    }
                                    if (obj3.equals(objArrCopyOf[i17 == true ? 1 : 0])) {
                                        int i18 = ~i17;
                                        Object obj5 = objArrCopyOf[i18 == true ? 1 : 0];
                                        Objects.requireNonNull(obj5);
                                        c0279a3 = new C0279a(obj3, obj4, obj5);
                                        objArrCopyOf[i18 == true ? 1 : 0] = obj4;
                                        break;
                                    }
                                    iK = i16 + 1;
                                }
                            }
                            if (i12 == iIntValue) {
                                obj2 = bArr;
                                c10 = 2;
                            } else {
                                c10 = 2;
                                objArr = new Object[]{bArr, Integer.valueOf(i12), c0279a3};
                                obj2 = objArr;
                            }
                        } else if (iA <= 32768) {
                            short[] sArr = new short[iA];
                            Arrays.fill(sArr, (short) -1);
                            int i19 = 0;
                            for (int i20 = 0; i20 < iIntValue; i20++) {
                                int i21 = i20 * 2;
                                int i22 = i19 * 2;
                                Object obj6 = objArrCopyOf[i21];
                                Objects.requireNonNull(obj6);
                                Object obj7 = objArrCopyOf[i21 ^ 1];
                                Objects.requireNonNull(obj7);
                                int iK2 = kotlin.jvm.internal.n.k(obj6.hashCode());
                                while (true) {
                                    int i23 = iK2 & i10;
                                    int i24 = sArr[i23] & 65535;
                                    if (i24 == 65535) {
                                        sArr[i23] = (short) i22;
                                        if (i19 < i20) {
                                            objArrCopyOf[i22] = obj6;
                                            objArrCopyOf[i22 ^ 1] = obj7;
                                        }
                                        i19++;
                                        break;
                                    }
                                    if (obj6.equals(objArrCopyOf[i24 == true ? 1 : 0])) {
                                        int i25 = ~i24;
                                        Object obj8 = objArrCopyOf[i25 == true ? 1 : 0];
                                        Objects.requireNonNull(obj8);
                                        c0279a4 = new C0279a(obj6, obj7, obj8);
                                        objArrCopyOf[i25 == true ? 1 : 0] = obj7;
                                        break;
                                    }
                                    iK2 = i23 + 1;
                                }
                            }
                            if (i19 == iIntValue) {
                                obj2 = sArr;
                                c11 = 2;
                            } else {
                                c11 = 2;
                                obj2 = new Object[]{sArr, Integer.valueOf(i19), c0279a4};
                            }
                        } else {
                            int[] iArr = new int[iA];
                            Arrays.fill(iArr, -1);
                            int i26 = 0;
                            int i27 = 0;
                            while (i27 < iIntValue) {
                                int i28 = i27 * 2;
                                int i29 = i26 * 2;
                                Object obj9 = objArrCopyOf[i28];
                                Objects.requireNonNull(obj9);
                                Object obj10 = objArrCopyOf[i28 ^ 1];
                                Objects.requireNonNull(obj10);
                                int iK3 = kotlin.jvm.internal.n.k(obj9.hashCode());
                                while (true) {
                                    int i30 = iK3 & i10;
                                    int i31 = iArr[i30];
                                    if (i31 == i11) {
                                        iArr[i30] = i29;
                                        if (i26 < i27) {
                                            objArrCopyOf[i29] = obj9;
                                            objArrCopyOf[i29 ^ 1] = obj10;
                                        }
                                        i26++;
                                        break;
                                    }
                                    if (obj9.equals(objArrCopyOf[i31])) {
                                        int i32 = i31 ^ 1;
                                        Object obj11 = objArrCopyOf[i32];
                                        Objects.requireNonNull(obj11);
                                        c0279a2 = new C0279a(obj9, obj10, obj11);
                                        objArrCopyOf[i32] = obj10;
                                        break;
                                    }
                                    iK3 = i30 + 1;
                                    i11 = -1;
                                }
                                i27++;
                                i11 = -1;
                            }
                            if (i26 == iIntValue) {
                                obj2 = iArr;
                                c10 = 2;
                            } else {
                                c10 = 2;
                                objArr = new Object[]{iArr, Integer.valueOf(i26), c0279a2};
                                obj2 = objArr;
                            }
                        }
                        z10 = obj2 instanceof Object[];
                        obj = obj2;
                        if (z10) {
                            Object[] objArr2 = (Object[]) obj2;
                            this.f27883c = (C0279a) objArr2[c10];
                            Object obj12 = objArr2[0];
                            iIntValue = ((Integer) objArr2[1]).intValue();
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue * 2);
                            obj = obj12;
                        }
                        regularImmutableMap = new RegularImmutableMap(iIntValue, obj, objArrCopyOf);
                    }
                    c10 = c11;
                    z10 = obj2 instanceof Object[];
                    obj = obj2;
                    if (z10) {
                        Object[] objArr3 = (Object[]) obj2;
                        this.f27883c = (C0279a) objArr3[c10];
                        Object obj13 = objArr3[0];
                        iIntValue = ((Integer) objArr3[1]).intValue();
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue * 2);
                        obj = obj13;
                    }
                    regularImmutableMap = new RegularImmutableMap(iIntValue, obj, objArrCopyOf);
                }
            }
            C0279a c0279a5 = this.f27883c;
            if (c0279a5 == null) {
                return regularImmutableMap;
            }
            throw c0279a5.a();
        }

        public final void b(Object obj, Object obj2) {
            int i10 = (this.f27882b + 1) * 2;
            Object[] objArr = this.f27881a;
            if (i10 > objArr.length) {
                this.f27881a = Arrays.copyOf(objArr, ImmutableCollection.b.b(objArr.length, i10));
            }
            if (obj == null) {
                throw new NullPointerException(coil.intercept.a.a(obj2, "null key in entry: null="));
            }
            if (obj2 == null) {
                throw new NullPointerException("null value in entry: " + obj + "=null");
            }
            Object[] objArr2 = this.f27881a;
            int i11 = this.f27882b;
            int i12 = i11 * 2;
            objArr2[i12] = obj;
            objArr2[i12 + 1] = obj2;
            this.f27882b = i11 + 1;
        }
    }

    public static ImmutableMap a(HashMap map) {
        Set<Map.Entry<K, V>> setEntrySet = map.entrySet();
        boolean z10 = setEntrySet instanceof Collection;
        a aVar = new a(z10 ? setEntrySet.size() : 4);
        if (z10) {
            int size = setEntrySet.size() * 2;
            Object[] objArr = aVar.f27881a;
            if (size > objArr.length) {
                aVar.f27881a = Arrays.copyOf(objArr, ImmutableCollection.b.b(objArr.length, size));
            }
        }
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            aVar.b(entry.getKey(), entry.getValue());
        }
        return aVar.a();
    }

    public static <K, V> ImmutableMap<K, V> h() {
        return (ImmutableMap<K, V>) RegularImmutableMap.f27943h;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public abstract ImmutableSet<Map.Entry<K, V>> b();

    public abstract ImmutableSet<K> c();

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        ImmutableCollection<V> immutableCollectionE = this.f27880d;
        if (immutableCollectionE == null) {
            immutableCollectionE = e();
            this.f27880d = immutableCollectionE;
        }
        return immutableCollectionE.contains(obj);
    }

    public abstract ImmutableCollection<V> e();

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return q.a(obj, this);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final ImmutableSet<Map.Entry<K, V>> entrySet() {
        ImmutableSet<Map.Entry<K, V>> immutableSet = this.f27878b;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<Map.Entry<K, V>> immutableSetB = b();
        this.f27878b = immutableSetB;
        return immutableSetB;
    }

    @Override // java.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v10) {
        V v11 = get(obj);
        return v11 != null ? v11 : v10;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return z.c(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        ImmutableSet<K> immutableSet = this.f27879c;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<K> immutableSetC = c();
        this.f27879c = immutableSetC;
        return immutableSetC;
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        P3.d.e(size, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb2.append('{');
        boolean z10 = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z10 = false;
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        ImmutableCollection<V> immutableCollection = this.f27880d;
        if (immutableCollection != null) {
            return immutableCollection;
        }
        ImmutableCollection<V> immutableCollectionE = e();
        this.f27880d = immutableCollectionE;
        return immutableCollectionE;
    }

    public Object writeReplace() {
        return new SerializedForm(this);
    }
}
