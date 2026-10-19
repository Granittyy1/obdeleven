package androidx.collection;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: compiled from: SimpleArrayMap.kt */
/* JADX INFO: loaded from: classes.dex */
public class X<K, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f9137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f9138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9139d;

    public X() {
        this(0);
    }

    public final int a(V v10) {
        int i10 = this.f9139d * 2;
        Object[] objArr = this.f9138c;
        if (v10 == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (v10.equals(objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i10) {
        int i11 = this.f9139d;
        int[] iArr = this.f9137b;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
            kotlin.jvm.internal.i.d(iArrCopyOf, "copyOf(...)");
            this.f9137b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f9138c, i10 * 2);
            kotlin.jvm.internal.i.d(objArrCopyOf, "copyOf(...)");
            this.f9138c = objArrCopyOf;
        }
        if (this.f9139d != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public final int c(int i10, Object obj) {
        int i11 = this.f9139d;
        if (i11 == 0) {
            return -1;
        }
        int iA = p233t.a.a(i11, i10, this.f9137b);
        if (iA < 0 || kotlin.jvm.internal.i.a(obj, this.f9138c[iA << 1])) {
            return iA;
        }
        int i12 = iA + 1;
        while (i12 < i11 && this.f9137b[i12] == i10) {
            if (kotlin.jvm.internal.i.a(obj, this.f9138c[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iA - 1; i13 >= 0 && this.f9137b[i13] == i10; i13--) {
            if (kotlin.jvm.internal.i.a(obj, this.f9138c[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    public void clear() {
        if (this.f9139d > 0) {
            this.f9137b = p233t.a.f46996a;
            this.f9138c = p233t.a.f46998c;
            this.f9139d = 0;
        }
        if (this.f9139d > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(K k10) {
        return e(k10) >= 0;
    }

    public boolean containsValue(V v10) {
        return a(v10) >= 0;
    }

    public final int e(K k10) {
        return k10 == null ? f() : c(k10.hashCode(), k10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof X) {
                int i10 = this.f9139d;
                if (i10 != ((X) obj).f9139d) {
                    return false;
                }
                X x10 = (X) obj;
                for (int i11 = 0; i11 < i10; i11++) {
                    K kH = h(i11);
                    V vM = m(i11);
                    Object obj2 = x10.get(kH);
                    if (vM == null) {
                        if (obj2 != null || !x10.containsKey(kH)) {
                            return false;
                        }
                    } else if (!vM.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f9139d != ((Map) obj).size()) {
                return false;
            }
            int i12 = this.f9139d;
            for (int i13 = 0; i13 < i12; i13++) {
                K kH2 = h(i13);
                V vM2 = m(i13);
                Object obj3 = ((Map) obj).get(kH2);
                if (vM2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(kH2)) {
                        return false;
                    }
                } else if (!vM2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final int f() {
        int i10 = this.f9139d;
        if (i10 == 0) {
            return -1;
        }
        int iA = p233t.a.a(i10, 0, this.f9137b);
        if (iA < 0 || this.f9138c[iA << 1] == null) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.f9137b[i11] == 0) {
            if (this.f9138c[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.f9137b[i12] == 0; i12--) {
            if (this.f9138c[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public V get(K k10) {
        int iE = e(k10);
        if (iE >= 0) {
            return (V) this.f9138c[(iE << 1) + 1];
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V getOrDefault(Object obj, V v10) {
        int iE = e(obj);
        return iE >= 0 ? (V) this.f9138c[(iE << 1) + 1] : v10;
    }

    public final K h(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f9139d) {
            z10 = true;
        }
        if (z10) {
            return (K) this.f9138c[i10 << 1];
        }
        D9.o.q("Expected index to be within 0..size()-1, but was " + i10);
        throw null;
    }

    public int hashCode() {
        int[] iArr = this.f9137b;
        Object[] objArr = this.f9138c;
        int i10 = this.f9139d;
        int i11 = 1;
        int i12 = 0;
        int iHashCode = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return iHashCode;
    }

    public final boolean isEmpty() {
        return this.f9139d <= 0;
    }

    public void j(C0873a map) {
        kotlin.jvm.internal.i.e(map, "map");
        int i10 = map.f9139d;
        b(this.f9139d + i10);
        if (this.f9139d != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                put(map.h(i11), map.m(i11));
            }
        } else if (i10 > 0) {
            Q3.d.m(0, 0, i10, map.f9137b, this.f9137b);
            Q3.d.n(0, 0, i10 << 1, map.f9138c, this.f9138c);
            this.f9139d = i10;
        }
    }

    public V k(int i10) {
        if (!(i10 >= 0 && i10 < this.f9139d)) {
            D9.o.q("Expected index to be within 0..size()-1, but was " + i10);
            throw null;
        }
        Object[] objArr = this.f9138c;
        int i11 = i10 << 1;
        V v10 = (V) objArr[i11 + 1];
        int i12 = this.f9139d;
        if (i12 <= 1) {
            clear();
        } else {
            int i13 = i12 - 1;
            int[] iArr = this.f9137b;
            if (iArr.length <= 8 || i12 >= iArr.length / 3) {
                if (i10 < i13) {
                    int i14 = i10 + 1;
                    Q3.d.m(i10, i14, i12, iArr, iArr);
                    Object[] objArr2 = this.f9138c;
                    Q3.d.n(i11, i14 << 1, i12 << 1, objArr2, objArr2);
                }
                Object[] objArr3 = this.f9138c;
                int i15 = i13 << 1;
                objArr3[i15] = null;
                objArr3[i15 + 1] = null;
            } else {
                int i16 = i12 > 8 ? i12 + (i12 >> 1) : 8;
                int[] iArrCopyOf = Arrays.copyOf(iArr, i16);
                kotlin.jvm.internal.i.d(iArrCopyOf, "copyOf(...)");
                this.f9137b = iArrCopyOf;
                Object[] objArrCopyOf = Arrays.copyOf(this.f9138c, i16 << 1);
                kotlin.jvm.internal.i.d(objArrCopyOf, "copyOf(...)");
                this.f9138c = objArrCopyOf;
                if (i12 != this.f9139d) {
                    throw new ConcurrentModificationException();
                }
                if (i10 > 0) {
                    Q3.d.m(0, 0, i10, iArr, this.f9137b);
                    Q3.d.n(0, 0, i11, objArr, this.f9138c);
                }
                if (i10 < i13) {
                    int i17 = i10 + 1;
                    Q3.d.m(i10, i17, i12, iArr, this.f9137b);
                    Q3.d.n(i11, i17 << 1, i12 << 1, objArr, this.f9138c);
                }
            }
            if (i12 != this.f9139d) {
                throw new ConcurrentModificationException();
            }
            this.f9139d = i13;
        }
        return v10;
    }

    public V l(int i10, V v10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f9139d) {
            z10 = true;
        }
        if (!z10) {
            D9.o.q("Expected index to be within 0..size()-1, but was " + i10);
            throw null;
        }
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f9138c;
        V v11 = (V) objArr[i11];
        objArr[i11] = v10;
        return v11;
    }

    public final V m(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f9139d) {
            z10 = true;
        }
        if (z10) {
            return (V) this.f9138c[(i10 << 1) + 1];
        }
        D9.o.q("Expected index to be within 0..size()-1, but was " + i10);
        throw null;
    }

    public V put(K k10, V v10) {
        int i10 = this.f9139d;
        int iHashCode = k10 != null ? k10.hashCode() : 0;
        int iC = k10 != null ? c(iHashCode, k10) : f();
        if (iC >= 0) {
            int i11 = (iC << 1) + 1;
            Object[] objArr = this.f9138c;
            V v11 = (V) objArr[i11];
            objArr[i11] = v10;
            return v11;
        }
        int i12 = ~iC;
        int[] iArr = this.f9137b;
        if (i10 >= iArr.length) {
            int i13 = 8;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i13 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i13);
            kotlin.jvm.internal.i.d(iArrCopyOf, "copyOf(...)");
            this.f9137b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f9138c, i13 << 1);
            kotlin.jvm.internal.i.d(objArrCopyOf, "copyOf(...)");
            this.f9138c = objArrCopyOf;
            if (i10 != this.f9139d) {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr2 = this.f9137b;
            int i14 = i12 + 1;
            Q3.d.m(i14, i12, i10, iArr2, iArr2);
            Object[] objArr2 = this.f9138c;
            Q3.d.n(i14 << 1, i12 << 1, this.f9139d << 1, objArr2, objArr2);
        }
        int i15 = this.f9139d;
        if (i10 == i15) {
            int[] iArr3 = this.f9137b;
            if (i12 < iArr3.length) {
                iArr3[i12] = iHashCode;
                Object[] objArr3 = this.f9138c;
                int i16 = i12 << 1;
                objArr3[i16] = k10;
                objArr3[i16 + 1] = v10;
                this.f9139d = i15 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final V putIfAbsent(K k10, V v10) {
        V v11 = get(k10);
        return v11 == null ? put(k10, v10) : v11;
    }

    public V remove(K k10) {
        int iE = e(k10);
        if (iE >= 0) {
            return k(iE);
        }
        return null;
    }

    public final V replace(K k10, V v10) {
        int iE = e(k10);
        if (iE >= 0) {
            return l(iE, v10);
        }
        return null;
    }

    public final int size() {
        return this.f9139d;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f9139d * 28);
        sb2.append('{');
        int i10 = this.f9139d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            K kH = h(i11);
            if (kH != sb2) {
                sb2.append(kH);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            V vM = m(i11);
            if (vM != sb2) {
                sb2.append(vM);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        kotlin.jvm.internal.i.d(string, "toString(...)");
        return string;
    }

    public X(int i10) {
        this.f9137b = i10 == 0 ? p233t.a.f46996a : new int[i10];
        this.f9138c = i10 == 0 ? p233t.a.f46998c : new Object[i10 << 1];
    }

    public final boolean remove(K k10, V v10) {
        int iE = e(k10);
        if (iE < 0 || !kotlin.jvm.internal.i.a(v10, m(iE))) {
            return false;
        }
        k(iE);
        return true;
    }

    public final boolean replace(K k10, V v10, V v11) {
        int iE = e(k10);
        if (iE < 0 || !kotlin.jvm.internal.i.a(v10, m(iE))) {
            return false;
        }
        l(iE, v11);
        return true;
    }
}
