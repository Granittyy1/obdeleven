package com.google.android.gms.internal.measurement;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public class F3<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f25442h = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25443b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f25446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile O3 f25447f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<N3> f25444c = Collections.emptyList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map<K, V> f25445d = Collections.emptyMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Map<K, V> f25448g = Collections.emptyMap();

    public F3(int i10) {
        this.f25443b = i10;
    }

    public final int a() {
        return this.f25444c.size();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:17:0x003d  */
    /* JADX WARN: Code duplicated, block: B:21:0x003b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[SYNTHETIC] */
    public final int b(K k10) {
        int i10;
        int i11;
        int i12;
        int iCompareTo;
        int size = this.f25444c.size();
        int i13 = size - 1;
        if (i13 < 0) {
            i10 = 0;
            while (i10 <= i13) {
                i12 = (i10 + i13) / 2;
                iCompareTo = k10.compareTo(this.f25444c.get(i12).f25533b);
                if (iCompareTo < 0) {
                    i13 = i12 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i12;
                    }
                    i10 = i12 + 1;
                }
            }
            i11 = i10 + 1;
        } else {
            int iCompareTo2 = k10.compareTo(this.f25444c.get(i13).f25533b);
            if (iCompareTo2 > 0) {
                i11 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i13;
                }
                i10 = 0;
                while (i10 <= i13) {
                    i12 = (i10 + i13) / 2;
                    iCompareTo = k10.compareTo(this.f25444c.get(i12).f25533b);
                    if (iCompareTo < 0) {
                        i13 = i12 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i12;
                        }
                        i10 = i12 + 1;
                    }
                }
                i11 = i10 + 1;
            }
        }
        return -i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final V put(K k10, V v10) {
        l();
        int iB = b(k10);
        if (iB >= 0) {
            return (V) this.f25444c.get(iB).setValue(v10);
        }
        l();
        boolean zIsEmpty = this.f25444c.isEmpty();
        int i10 = this.f25443b;
        if (zIsEmpty && !(this.f25444c instanceof ArrayList)) {
            this.f25444c = new ArrayList(i10);
        }
        int i11 = -(iB + 1);
        if (i11 >= i10) {
            return k().put(k10, v10);
        }
        if (this.f25444c.size() == i10) {
            N3 n3Remove = this.f25444c.remove(i10 - 1);
            k().put(n3Remove.f25533b, n3Remove.f25534c);
        }
        this.f25444c.add(i11, new N3(this, k10, v10));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        l();
        if (!this.f25444c.isEmpty()) {
            this.f25444c.clear();
        }
        if (this.f25445d.isEmpty()) {
            return;
        }
        this.f25445d.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return b(comparable) >= 0 || this.f25445d.containsKey(comparable);
    }

    public final Iterable<Map.Entry<K, V>> e() {
        return this.f25445d.isEmpty() ? J3.f25488b : this.f25445d.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f25447f == null) {
            this.f25447f = new O3(this);
        }
        return this.f25447f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F3)) {
            return super.equals(obj);
        }
        F3 f10 = (F3) obj;
        int size = size();
        if (size != f10.size()) {
            return false;
        }
        int size2 = this.f25444c.size();
        if (size2 != f10.f25444c.size()) {
            return entrySet().equals(f10.entrySet());
        }
        for (int i10 = 0; i10 < size2; i10++) {
            if (!f(i10).equals(f10.f(i10))) {
                return false;
            }
        }
        if (size2 != size) {
            return this.f25445d.equals(f10.f25445d);
        }
        return true;
    }

    public final Map.Entry<K, V> f(int i10) {
        return this.f25444c.get(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iB = b(comparable);
        return iB >= 0 ? (V) this.f25444c.get(iB).f25534c : this.f25445d.get(comparable);
    }

    public final V h(int i10) {
        l();
        V v10 = (V) this.f25444c.remove(i10).f25534c;
        if (!this.f25445d.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = k().entrySet().iterator();
            List<N3> list = this.f25444c;
            Map.Entry<K, V> next = it.next();
            list.add(new N3(this, next.getKey(), next.getValue()));
            it.remove();
        }
        return v10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f25444c.size();
        int iHashCode = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iHashCode += this.f25444c.get(i10).hashCode();
        }
        return this.f25445d.size() > 0 ? iHashCode + this.f25445d.hashCode() : iHashCode;
    }

    public void j() {
        if (this.f25446e) {
            return;
        }
        this.f25445d = this.f25445d.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f25445d);
        this.f25448g = this.f25448g.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f25448g);
        this.f25446e = true;
    }

    public final SortedMap<K, V> k() {
        l();
        if (this.f25445d.isEmpty() && !(this.f25445d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f25445d = treeMap;
            this.f25448g = treeMap.descendingMap();
        }
        return (SortedMap) this.f25445d;
    }

    public final void l() {
        if (this.f25446e) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        l();
        Comparable comparable = (Comparable) obj;
        int iB = b(comparable);
        if (iB >= 0) {
            return h(iB);
        }
        if (this.f25445d.isEmpty()) {
            return null;
        }
        return this.f25445d.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f25445d.size() + this.f25444c.size();
    }
}
