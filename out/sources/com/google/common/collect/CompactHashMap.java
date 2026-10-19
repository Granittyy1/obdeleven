package com.google.common.collect;

import androidx.compose.material.T;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
class CompactHashMap<K, V> extends AbstractMap<K, V> implements Serializable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f27851k = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient Object f27852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient int[] f27853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient Object[] f27854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient Object[] f27855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient int f27856f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public transient int f27857g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient c f27858h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public transient a f27859i;
    public transient e j;

    public class a extends AbstractSet<Map.Entry<K, V>> {
        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            CompactHashMap compactHashMap = CompactHashMap.this;
            Map<K, V> mapB = compactHashMap.b();
            if (mapB != null) {
                return mapB.entrySet().contains(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iE = compactHashMap.e(entry.getKey());
            return iE != -1 && kotlinx.coroutines.C.j(compactHashMap.m()[iE], entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            CompactHashMap compactHashMap = CompactHashMap.this;
            Map<K, V> mapB = compactHashMap.b();
            return mapB != null ? mapB.entrySet().iterator() : new g(compactHashMap);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            CompactHashMap compactHashMap = CompactHashMap.this;
            Map<K, V> mapB = compactHashMap.b();
            if (mapB != null) {
                return mapB.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (compactHashMap.h()) {
                return false;
            }
            int iC = compactHashMap.c();
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object obj2 = compactHashMap.f27852b;
            Objects.requireNonNull(obj2);
            int iL = T.l(key, value, iC, obj2, compactHashMap.k(), compactHashMap.l(), compactHashMap.m());
            if (iL == -1) {
                return false;
            }
            compactHashMap.f(iL, iC);
            compactHashMap.f27857g--;
            compactHashMap.f27856f += 32;
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return CompactHashMap.this.size();
        }
    }

    public abstract class b<T> implements Iterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f27861b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f27862c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f27863d;

        public b() {
            this.f27861b = CompactHashMap.this.f27856f;
            this.f27862c = CompactHashMap.this.isEmpty() ? -1 : 0;
            this.f27863d = -1;
        }

        public abstract T a(int i10);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f27862c >= 0;
        }

        @Override // java.util.Iterator
        public final T next() {
            CompactHashMap compactHashMap = CompactHashMap.this;
            if (compactHashMap.f27856f != this.f27861b) {
                throw new ConcurrentModificationException();
            }
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i10 = this.f27862c;
            this.f27863d = i10;
            T tA = a(i10);
            int i11 = this.f27862c + 1;
            if (i11 >= compactHashMap.f27857g) {
                i11 = -1;
            }
            this.f27862c = i11;
            return tA;
        }

        @Override // java.util.Iterator
        public final void remove() {
            CompactHashMap compactHashMap = CompactHashMap.this;
            if (compactHashMap.f27856f != this.f27861b) {
                throw new ConcurrentModificationException();
            }
            A8.p.p("no calls to next() since the last call to remove()", this.f27863d >= 0);
            this.f27861b += 32;
            compactHashMap.remove(compactHashMap.l()[this.f27863d]);
            this.f27862c--;
            this.f27863d = -1;
        }
    }

    public class c extends AbstractSet<K> {
        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return CompactHashMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            CompactHashMap compactHashMap = CompactHashMap.this;
            Map<K, V> mapB = compactHashMap.b();
            return mapB != null ? mapB.keySet().iterator() : new f(compactHashMap);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            CompactHashMap compactHashMap = CompactHashMap.this;
            Map<K, V> mapB = compactHashMap.b();
            if (mapB != null) {
                return mapB.keySet().remove(obj);
            }
            return compactHashMap.j(obj) != CompactHashMap.f27851k;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return CompactHashMap.this.size();
        }
    }

    public final class d extends AbstractC2037c<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final K f27866b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f27867c;

        public d(int i10) {
            Object obj = CompactHashMap.f27851k;
            this.f27866b = (K) CompactHashMap.this.l()[i10];
            this.f27867c = i10;
        }

        public final void a() {
            int i10 = this.f27867c;
            K k10 = this.f27866b;
            CompactHashMap compactHashMap = CompactHashMap.this;
            if (i10 != -1 && i10 < compactHashMap.size()) {
                if (kotlinx.coroutines.C.j(k10, compactHashMap.l()[this.f27867c])) {
                    return;
                }
            }
            Object obj = CompactHashMap.f27851k;
            this.f27867c = compactHashMap.e(k10);
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f27866b;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            CompactHashMap compactHashMap = CompactHashMap.this;
            Map<K, V> mapB = compactHashMap.b();
            if (mapB != null) {
                return mapB.get(this.f27866b);
            }
            a();
            int i10 = this.f27867c;
            if (i10 == -1) {
                return null;
            }
            return (V) compactHashMap.m()[i10];
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            CompactHashMap compactHashMap = CompactHashMap.this;
            Map<K, V> mapB = compactHashMap.b();
            K k10 = this.f27866b;
            if (mapB != null) {
                return mapB.put(k10, v10);
            }
            a();
            int i10 = this.f27867c;
            if (i10 == -1) {
                compactHashMap.put(k10, v10);
                return null;
            }
            V v11 = (V) compactHashMap.m()[i10];
            compactHashMap.m()[this.f27867c] = v10;
            return v11;
        }
    }

    public class e extends AbstractCollection<V> {
        public e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            CompactHashMap compactHashMap = CompactHashMap.this;
            Map<K, V> mapB = compactHashMap.b();
            return mapB != null ? mapB.values().iterator() : new h(compactHashMap);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return CompactHashMap.this.size();
        }
    }

    public static CompactHashMap a() {
        CompactHashMap compactHashMap = new CompactHashMap();
        compactHashMap.f27856f = Math.min(Math.max(8, 1), 1073741823);
        return compactHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i10 = objectInputStream.readInt();
        if (i10 < 0) {
            throw new InvalidObjectException(J4.i.b(i10, "Invalid size: "));
        }
        A8.p.f("Expected size must be >= 0", i10 >= 0);
        this.f27856f = Math.min(Math.max(i10, 1), 1073741823);
        for (int i11 = 0; i11 < i10; i11++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Map<K, V> mapB = b();
        Iterator<Map.Entry<K, V>> it = mapB != null ? mapB.entrySet().iterator() : new g(this);
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            objectOutputStream.writeObject(next.getKey());
            objectOutputStream.writeObject(next.getValue());
        }
    }

    public final Map<K, V> b() {
        Object obj = this.f27852b;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final int c() {
        return (1 << (this.f27856f & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (h()) {
            return;
        }
        this.f27856f += 32;
        Map<K, V> mapB = b();
        if (mapB != null) {
            this.f27856f = Math.min(Math.max(size(), 3), 1073741823);
            mapB.clear();
            this.f27852b = null;
            this.f27857g = 0;
            return;
        }
        Arrays.fill(l(), 0, this.f27857g, (Object) null);
        Arrays.fill(m(), 0, this.f27857g, (Object) null);
        Object obj = this.f27852b;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(k(), 0, this.f27857g, 0);
        this.f27857g = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map<K, V> mapB = b();
        if (mapB != null) {
            return mapB.containsKey(obj);
        }
        return e(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map<K, V> mapB = b();
        if (mapB != null) {
            return mapB.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f27857g; i10++) {
            if (kotlinx.coroutines.C.j(obj, m()[i10])) {
                return true;
            }
        }
        return false;
    }

    public final int e(Object obj) {
        if (h()) {
            return -1;
        }
        int iL = kotlin.jvm.internal.n.l(obj);
        int iC = c();
        Object obj2 = this.f27852b;
        Objects.requireNonNull(obj2);
        int iM = T.m(iL & iC, obj2);
        if (iM == 0) {
            return -1;
        }
        int i10 = ~iC;
        int i11 = iL & i10;
        do {
            int i12 = iM - 1;
            int i13 = k()[i12];
            if ((i13 & i10) == i11 && kotlinx.coroutines.C.j(obj, l()[i12])) {
                return i12;
            }
            iM = i13 & iC;
        } while (iM != 0);
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        a aVar = this.f27859i;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a();
        this.f27859i = aVar2;
        return aVar2;
    }

    public final void f(int i10, int i11) {
        Object obj = this.f27852b;
        Objects.requireNonNull(obj);
        int[] iArrK = k();
        Object[] objArrL = l();
        Object[] objArrM = m();
        int size = size();
        int i12 = size - 1;
        if (i10 >= i12) {
            objArrL[i10] = null;
            objArrM[i10] = null;
            iArrK[i10] = 0;
            return;
        }
        Object obj2 = objArrL[i12];
        objArrL[i10] = obj2;
        objArrM[i10] = objArrM[i12];
        objArrL[i12] = null;
        objArrM[i12] = null;
        iArrK[i10] = iArrK[i12];
        iArrK[i12] = 0;
        int iL = kotlin.jvm.internal.n.l(obj2) & i11;
        int iM = T.m(iL, obj);
        if (iM == size) {
            T.n(iL, i10 + 1, obj);
            return;
        }
        while (true) {
            int i13 = iM - 1;
            int i14 = iArrK[i13];
            int i15 = i14 & i11;
            if (i15 == size) {
                iArrK[i13] = T.i(i14, i10 + 1, i11);
                return;
            }
            iM = i15;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Map<K, V> mapB = b();
        if (mapB != null) {
            return mapB.get(obj);
        }
        int iE = e(obj);
        if (iE == -1) {
            return null;
        }
        return (V) m()[iE];
    }

    public final boolean h() {
        return this.f27852b == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object j(Object obj) {
        boolean zH = h();
        Object obj2 = f27851k;
        if (zH) {
            return obj2;
        }
        int iC = c();
        Object obj3 = this.f27852b;
        Objects.requireNonNull(obj3);
        int iL = T.l(obj, null, iC, obj3, k(), l(), null);
        if (iL == -1) {
            return obj2;
        }
        Object obj4 = m()[iL];
        f(iL, iC);
        this.f27857g--;
        this.f27856f += 32;
        return obj4;
    }

    public final int[] k() {
        int[] iArr = this.f27853c;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        c cVar = this.f27858h;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        this.f27858h = cVar2;
        return cVar2;
    }

    public final Object[] l() {
        Object[] objArr = this.f27854d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] m() {
        Object[] objArr = this.f27855e;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int n(int i10, int i11, int i12, int i13) {
        Object objF = T.f(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            T.n(i12 & i14, i13 + 1, objF);
        }
        Object obj = this.f27852b;
        Objects.requireNonNull(obj);
        int[] iArrK = k();
        for (int i15 = 0; i15 <= i10; i15++) {
            int iM = T.m(i15, obj);
            while (iM != 0) {
                int i16 = iM - 1;
                int i17 = iArrK[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int iM2 = T.m(i19, objF);
                T.n(i19, iM, objF);
                iArrK[i16] = T.i(i18, iM2, i14);
                iM = i17 & i10;
            }
        }
        this.f27852b = objF;
        this.f27856f = T.i(this.f27856f, 32 - Integer.numberOfLeadingZeros(i14), 31);
        return i14;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00fe A[LOOP:1: B:38:0x00e7->B:41:0x00fe, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x00e2 A[EDGE_INSN: B:62:0x00e2->B:36:0x00e2 BREAK  A[LOOP:1: B:38:0x00e7->B:41:0x00fe], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00fc -> B:36:0x00e2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K r21, V r22) {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.CompactHashMap.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        Map<K, V> mapB = b();
        if (mapB != null) {
            return mapB.remove(obj);
        }
        V v10 = (V) j(obj);
        if (v10 == f27851k) {
            return null;
        }
        return v10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map<K, V> mapB = b();
        return mapB != null ? mapB.size() : this.f27857g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        e eVar = this.j;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        this.j = eVar2;
        return eVar2;
    }
}
