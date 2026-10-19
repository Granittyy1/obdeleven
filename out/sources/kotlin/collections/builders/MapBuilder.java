package kotlin.collections.builders;

import com.braze.support.BrazeLogger;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: MapBuilder.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class MapBuilder<K, V> implements Map<K, V>, Serializable, Ja.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final MapBuilder f43003b;
    private kotlin.collections.builders.a<K, V> entriesView;
    private int[] hashArray;
    private int hashShift;
    private boolean isReadOnly;
    private K[] keysArray;
    private kotlin.collections.builders.b<K> keysView;
    private int length;
    private int maxProbeDistance;
    private int modCount;
    private int[] presenceArray;
    private int size;
    private V[] valuesArray;
    private kotlin.collections.builders.c<V> valuesView;

    /* JADX INFO: compiled from: MapBuilder.kt */
    public static final class a {
    }

    /* JADX INFO: compiled from: MapBuilder.kt */
    public static final class b<K, V> extends d<K, V> implements Iterator<Map.Entry<K, V>>, Ja.a {
        @Override // java.util.Iterator
        public final Object next() {
            a();
            int i10 = this.f43007c;
            MapBuilder<K, V> mapBuilder = this.f43006b;
            if (i10 >= ((MapBuilder) mapBuilder).length) {
                throw new NoSuchElementException();
            }
            int i11 = this.f43007c;
            this.f43007c = i11 + 1;
            this.f43008d = i11;
            c cVar = new c(mapBuilder, i11);
            b();
            return cVar;
        }
    }

    /* JADX INFO: compiled from: MapBuilder.kt */
    public static final class c<K, V> implements Map.Entry<K, V>, Ja.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MapBuilder<K, V> f43004b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f43005c;

        public c(MapBuilder<K, V> map, int i10) {
            i.e(map, "map");
            this.f43004b = map;
            this.f43005c = i10;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (i.a(entry.getKey(), getKey()) && i.a(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return (K) ((MapBuilder) this.f43004b).keysArray[this.f43005c];
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            Object[] objArr = ((MapBuilder) this.f43004b).valuesArray;
            i.b(objArr);
            return (V) objArr[this.f43005c];
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K key = getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            V value = getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            MapBuilder<K, V> mapBuilder = this.f43004b;
            mapBuilder.l();
            V[] vArrJ = mapBuilder.j();
            int i10 = this.f43005c;
            V v11 = vArrJ[i10];
            vArrJ[i10] = v10;
            return v11;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getKey());
            sb2.append('=');
            sb2.append(getValue());
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: MapBuilder.kt */
    public static class d<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MapBuilder<K, V> f43006b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f43007c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f43008d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f43009e;

        public d(MapBuilder<K, V> map) {
            i.e(map, "map");
            this.f43006b = map;
            this.f43008d = -1;
            this.f43009e = ((MapBuilder) map).modCount;
            b();
        }

        public final void a() {
            if (((MapBuilder) this.f43006b).modCount != this.f43009e) {
                throw new ConcurrentModificationException();
            }
        }

        public final void b() {
            while (true) {
                int i10 = this.f43007c;
                MapBuilder<K, V> mapBuilder = this.f43006b;
                if (i10 >= ((MapBuilder) mapBuilder).length) {
                    return;
                }
                int[] iArr = ((MapBuilder) mapBuilder).presenceArray;
                int i11 = this.f43007c;
                if (iArr[i11] >= 0) {
                    return;
                } else {
                    this.f43007c = i11 + 1;
                }
            }
        }

        public final boolean hasNext() {
            return this.f43007c < ((MapBuilder) this.f43006b).length;
        }

        public final void remove() {
            a();
            if (this.f43008d == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.");
            }
            MapBuilder<K, V> mapBuilder = this.f43006b;
            mapBuilder.l();
            mapBuilder.z(this.f43008d);
            this.f43008d = -1;
            this.f43009e = ((MapBuilder) mapBuilder).modCount;
        }
    }

    /* JADX INFO: compiled from: MapBuilder.kt */
    public static final class e<K, V> extends d<K, V> implements Iterator<K>, Ja.a {
        @Override // java.util.Iterator
        public final K next() {
            a();
            int i10 = this.f43007c;
            MapBuilder<K, V> mapBuilder = this.f43006b;
            if (i10 >= ((MapBuilder) mapBuilder).length) {
                throw new NoSuchElementException();
            }
            int i11 = this.f43007c;
            this.f43007c = i11 + 1;
            this.f43008d = i11;
            K k10 = (K) ((MapBuilder) mapBuilder).keysArray[this.f43008d];
            b();
            return k10;
        }
    }

    /* JADX INFO: compiled from: MapBuilder.kt */
    public static final class f<K, V> extends d<K, V> implements Iterator<V>, Ja.a {
        @Override // java.util.Iterator
        public final V next() {
            a();
            int i10 = this.f43007c;
            MapBuilder<K, V> mapBuilder = this.f43006b;
            if (i10 >= ((MapBuilder) mapBuilder).length) {
                throw new NoSuchElementException();
            }
            int i11 = this.f43007c;
            this.f43007c = i11 + 1;
            this.f43008d = i11;
            Object[] objArr = ((MapBuilder) mapBuilder).valuesArray;
            i.b(objArr);
            V v10 = (V) objArr[this.f43008d];
            b();
            return v10;
        }
    }

    static {
        MapBuilder mapBuilder = new MapBuilder(0);
        mapBuilder.isReadOnly = true;
        f43003b = mapBuilder;
    }

    public MapBuilder() {
        this(8);
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.isReadOnly) {
            return new SerializedMap(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    @Override // java.util.Map
    public final void clear() {
        l();
        int i10 = this.length - 1;
        if (i10 >= 0) {
            int i11 = 0;
            while (true) {
                int[] iArr = this.presenceArray;
                int i12 = iArr[i11];
                if (i12 >= 0) {
                    this.hashArray[i12] = 0;
                    iArr[i11] = -1;
                }
                if (i11 == i10) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        I.e.k(0, this.length, this.keysArray);
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            I.e.k(0, this.length, vArr);
        }
        this.size = 0;
        this.length = 0;
        this.modCount++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return r(obj) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return u(obj) >= 0;
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        kotlin.collections.builders.a<K, V> aVar = this.entriesView;
        if (aVar != null) {
            return aVar;
        }
        kotlin.collections.builders.a<K, V> aVar2 = new kotlin.collections.builders.a<>(this);
        this.entriesView = aVar2;
        return aVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.size != map.size() || !n(map.entrySet())) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final V get(Object obj) {
        int iR = r(obj);
        if (iR < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        i.b(vArr);
        return vArr[iR];
    }

    public final int h(K k10) {
        l();
        while (true) {
            int iV = v(k10);
            int i10 = this.maxProbeDistance * 2;
            int length = this.hashArray.length / 2;
            if (i10 > length) {
                i10 = length;
            }
            int i11 = 0;
            while (true) {
                int[] iArr = this.hashArray;
                int i12 = iArr[iV];
                if (i12 <= 0) {
                    int i13 = this.length;
                    K[] kArr = this.keysArray;
                    if (i13 >= kArr.length) {
                        q(1);
                        break;
                    }
                    int i14 = i13 + 1;
                    this.length = i14;
                    kArr[i13] = k10;
                    this.presenceArray[i13] = iV;
                    iArr[iV] = i14;
                    this.size++;
                    this.modCount++;
                    if (i11 > this.maxProbeDistance) {
                        this.maxProbeDistance = i11;
                    }
                    return i13;
                }
                if (i.a(this.keysArray[i12 - 1], k10)) {
                    return -i12;
                }
                i11++;
                if (i11 > i10) {
                    x(this.hashArray.length * 2);
                    break;
                }
                iV = iV == 0 ? this.hashArray.length - 1 : iV - 1;
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        b bVar = new b(this);
        int i10 = 0;
        while (bVar.hasNext()) {
            int i11 = bVar.f43007c;
            MapBuilder<K, V> mapBuilder = bVar.f43006b;
            if (i11 >= mapBuilder.length) {
                throw new NoSuchElementException();
            }
            int i12 = bVar.f43007c;
            bVar.f43007c = i12 + 1;
            bVar.f43008d = i12;
            Object obj = mapBuilder.keysArray[bVar.f43008d];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = mapBuilder.valuesArray;
            i.b(objArr);
            Object obj2 = objArr[bVar.f43008d];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            bVar.b();
            i10 += iHashCode ^ iHashCode2;
        }
        return i10;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.size == 0;
    }

    public final V[] j() {
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            return vArr;
        }
        int length = this.keysArray.length;
        if (length < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        V[] vArr2 = (V[]) new Object[length];
        this.valuesArray = vArr2;
        return vArr2;
    }

    public final MapBuilder k() {
        l();
        this.isReadOnly = true;
        if (this.size > 0) {
            return this;
        }
        MapBuilder mapBuilder = f43003b;
        i.c(mapBuilder, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return mapBuilder;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        kotlin.collections.builders.b<K> bVar = this.keysView;
        if (bVar != null) {
            return bVar;
        }
        kotlin.collections.builders.b<K> bVar2 = new kotlin.collections.builders.b<>(this);
        this.keysView = bVar2;
        return bVar2;
    }

    public final void l() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    public final void m(boolean z10) {
        int i10;
        V[] vArr = this.valuesArray;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = this.length;
            if (i11 >= i10) {
                break;
            }
            int[] iArr = this.presenceArray;
            int i13 = iArr[i11];
            if (i13 >= 0) {
                K[] kArr = this.keysArray;
                kArr[i12] = kArr[i11];
                if (vArr != null) {
                    vArr[i12] = vArr[i11];
                }
                if (z10) {
                    iArr[i12] = i13;
                    this.hashArray[i13] = i12 + 1;
                }
                i12++;
            }
            i11++;
        }
        I.e.k(i12, i10, this.keysArray);
        if (vArr != null) {
            I.e.k(i12, this.length, vArr);
        }
        this.length = i12;
    }

    public final boolean n(Collection<?> m7) {
        i.e(m7, "m");
        for (Object obj : m7) {
            if (obj != null) {
                try {
                    if (!o((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean o(Map.Entry<? extends K, ? extends V> entry) {
        i.e(entry, "entry");
        int iR = r(entry.getKey());
        if (iR < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        i.b(vArr);
        return i.a(vArr[iR], entry.getValue());
    }

    @Override // java.util.Map
    public final V put(K k10, V v10) {
        l();
        int iH = h(k10);
        V[] vArrJ = j();
        if (iH >= 0) {
            vArrJ[iH] = v10;
            return null;
        }
        int i10 = (-iH) - 1;
        V v11 = vArrJ[i10];
        vArrJ[i10] = v10;
        return v11;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> from) {
        i.e(from, "from");
        l();
        Set<Map.Entry<? extends K, ? extends V>> setEntrySet = from.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        q(setEntrySet.size());
        for (Map.Entry<? extends K, ? extends V> entry : setEntrySet) {
            int iH = h(entry.getKey());
            V[] vArrJ = j();
            if (iH >= 0) {
                vArrJ[iH] = entry.getValue();
            } else {
                int i10 = (-iH) - 1;
                if (!i.a(entry.getValue(), vArrJ[i10])) {
                    vArrJ[i10] = entry.getValue();
                }
            }
        }
    }

    public final void q(int i10) {
        V[] vArr;
        K[] kArr = this.keysArray;
        int length = kArr.length;
        int i11 = this.length;
        int i12 = length - i11;
        int i13 = i11 - this.size;
        if (i12 < i10 && i12 + i13 >= i10 && i13 >= kArr.length / 4) {
            m(true);
            return;
        }
        int i14 = i11 + i10;
        if (i14 < 0) {
            throw new OutOfMemoryError();
        }
        if (i14 > kArr.length) {
            int length2 = kArr.length;
            int i15 = length2 + (length2 >> 1);
            if (i15 - i14 < 0) {
                i15 = i14;
            }
            if (i15 - 2147483639 > 0) {
                i15 = i14 > 2147483639 ? BrazeLogger.SUPPRESS : 2147483639;
            }
            K[] kArr2 = (K[]) Arrays.copyOf(kArr, i15);
            i.d(kArr2, "copyOf(...)");
            this.keysArray = kArr2;
            V[] vArr2 = this.valuesArray;
            if (vArr2 != null) {
                vArr = (V[]) Arrays.copyOf(vArr2, i15);
                i.d(vArr, "copyOf(...)");
            } else {
                vArr = null;
            }
            this.valuesArray = vArr;
            int[] iArrCopyOf = Arrays.copyOf(this.presenceArray, i15);
            i.d(iArrCopyOf, "copyOf(...)");
            this.presenceArray = iArrCopyOf;
            int iHighestOneBit = Integer.highestOneBit((i15 >= 1 ? i15 : 1) * 3);
            if (iHighestOneBit > this.hashArray.length) {
                x(iHighestOneBit);
            }
        }
    }

    public final int r(K k10) {
        int iV = v(k10);
        int i10 = this.maxProbeDistance;
        while (true) {
            int i11 = this.hashArray[iV];
            if (i11 == 0) {
                return -1;
            }
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (i.a(this.keysArray[i12], k10)) {
                    return i12;
                }
            }
            i10--;
            if (i10 < 0) {
                return -1;
            }
            iV = iV == 0 ? this.hashArray.length - 1 : iV - 1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final V remove(Object obj) {
        l();
        int iR = r(obj);
        if (iR < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        i.b(vArr);
        V v10 = vArr[iR];
        z(iR);
        return v10;
    }

    @Override // java.util.Map
    public final int size() {
        return this.size;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder((this.size * 3) + 2);
        sb2.append("{");
        b bVar = new b(this);
        int i10 = 0;
        while (bVar.hasNext()) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            int i11 = bVar.f43007c;
            MapBuilder<K, V> mapBuilder = bVar.f43006b;
            if (i11 >= mapBuilder.length) {
                throw new NoSuchElementException();
            }
            int i12 = bVar.f43007c;
            bVar.f43007c = i12 + 1;
            bVar.f43008d = i12;
            Object obj = mapBuilder.keysArray[bVar.f43008d];
            if (obj == mapBuilder) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj);
            }
            sb2.append('=');
            Object[] objArr = mapBuilder.valuesArray;
            i.b(objArr);
            Object obj2 = objArr[bVar.f43008d];
            if (obj2 == mapBuilder) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj2);
            }
            bVar.b();
            i10++;
        }
        sb2.append("}");
        String string = sb2.toString();
        i.d(string, "toString(...)");
        return string;
    }

    public final int u(V v10) {
        int i10 = this.length;
        while (true) {
            i10--;
            if (i10 < 0) {
                return -1;
            }
            if (this.presenceArray[i10] >= 0) {
                V[] vArr = this.valuesArray;
                i.b(vArr);
                if (i.a(vArr[i10], v10)) {
                    return i10;
                }
            }
        }
    }

    public final int v(K k10) {
        return ((k10 != null ? k10.hashCode() : 0) * (-1640531527)) >>> this.hashShift;
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        kotlin.collections.builders.c<V> cVar = this.valuesView;
        if (cVar != null) {
            return cVar;
        }
        kotlin.collections.builders.c<V> cVar2 = new kotlin.collections.builders.c<>(this);
        this.valuesView = cVar2;
        return cVar2;
    }

    public final boolean w() {
        return this.isReadOnly;
    }

    public final void x(int i10) {
        int[] iArr;
        this.modCount++;
        int i11 = 0;
        if (this.length > this.size) {
            m(false);
        }
        this.hashArray = new int[i10];
        this.hashShift = Integer.numberOfLeadingZeros(i10) + 1;
        while (i11 < this.length) {
            int i12 = i11 + 1;
            int iV = v(this.keysArray[i11]);
            int i13 = this.maxProbeDistance;
            while (true) {
                iArr = this.hashArray;
                if (iArr[iV] == 0) {
                    break;
                }
                i13--;
                if (i13 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                iV = iV == 0 ? iArr.length - 1 : iV - 1;
            }
            iArr[iV] = i12;
            this.presenceArray[i11] = iV;
            i11 = i12;
        }
    }

    public final boolean y(Map.Entry<? extends K, ? extends V> entry) {
        i.e(entry, "entry");
        l();
        int iR = r(entry.getKey());
        if (iR < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        i.b(vArr);
        if (!i.a(vArr[iR], entry.getValue())) {
            return false;
        }
        z(iR);
        return true;
    }

    public final void z(int i10) {
        K[] kArr = this.keysArray;
        i.e(kArr, "<this>");
        kArr[i10] = null;
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            vArr[i10] = null;
        }
        int length = this.presenceArray[i10];
        int i11 = this.maxProbeDistance * 2;
        int length2 = this.hashArray.length / 2;
        if (i11 > length2) {
            i11 = length2;
        }
        int i12 = i11;
        int i13 = 0;
        int i14 = length;
        do {
            length = length == 0 ? this.hashArray.length - 1 : length - 1;
            i13++;
            if (i13 > this.maxProbeDistance) {
                this.hashArray[i14] = 0;
            } else {
                int[] iArr = this.hashArray;
                int i15 = iArr[length];
                if (i15 == 0) {
                    iArr[i14] = 0;
                } else {
                    if (i15 < 0) {
                        iArr[i14] = -1;
                    } else {
                        int i16 = i15 - 1;
                        int iV = v(this.keysArray[i16]) - length;
                        int[] iArr2 = this.hashArray;
                        if ((iV & (iArr2.length - 1)) >= i13) {
                            iArr2[i14] = i15;
                            this.presenceArray[i16] = i14;
                        }
                        i12--;
                    }
                    i14 = length;
                    i13 = 0;
                    i12--;
                }
            }
            this.presenceArray[i10] = -1;
            this.size--;
            this.modCount++;
        } while (i12 >= 0);
        this.hashArray[i14] = -1;
        this.presenceArray[i10] = -1;
        this.size--;
        this.modCount++;
    }

    public MapBuilder(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        K[] kArr = (K[]) new Object[i10];
        int[] iArr = new int[i10];
        int iHighestOneBit = Integer.highestOneBit((i10 < 1 ? 1 : i10) * 3);
        this.keysArray = kArr;
        this.valuesArray = null;
        this.presenceArray = iArr;
        this.hashArray = new int[iHighestOneBit];
        this.maxProbeDistance = 2;
        this.length = 0;
        this.hashShift = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }
}
