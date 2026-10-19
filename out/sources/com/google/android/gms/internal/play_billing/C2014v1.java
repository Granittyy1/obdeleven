package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.v1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public class C2014v1 extends AbstractMap {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f26279h = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f26280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26281c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f26283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile C2011u1 f26284f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map f26282d = Collections.emptyMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Map f26285g = Collections.emptyMap();

    public void a() {
        if (this.f26283e) {
            return;
        }
        this.f26282d = this.f26282d.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f26282d);
        this.f26285g = this.f26285g.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f26285g);
        this.f26283e = true;
    }

    public final int b() {
        return this.f26281c;
    }

    public final Set c() {
        return this.f26282d.isEmpty() ? Collections.emptySet() : this.f26282d.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        l();
        if (this.f26281c != 0) {
            this.f26280b = null;
            this.f26281c = 0;
        }
        if (this.f26282d.isEmpty()) {
            return;
        }
        this.f26282d.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return h(comparable) >= 0 || this.f26282d.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        l();
        int iH = h(comparable);
        if (iH >= 0) {
            return ((C2002r1) this.f26280b[iH]).setValue(obj);
        }
        l();
        if (this.f26280b == null) {
            this.f26280b = new Object[16];
        }
        int i10 = -(iH + 1);
        if (i10 >= 16) {
            return k().put(comparable, obj);
        }
        if (this.f26281c == 16) {
            C2002r1 c2002r1 = (C2002r1) this.f26280b[15];
            this.f26281c = 15;
            k().put(c2002r1.f26246b, c2002r1.f26247c);
        }
        Object[] objArr = this.f26280b;
        int length = objArr.length;
        System.arraycopy(objArr, i10, objArr, i10 + 1, 15 - i10);
        this.f26280b[i10] = new C2002r1(this, comparable, obj);
        this.f26281c++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f26284f == null) {
            this.f26284f = new C2011u1(this);
        }
        return this.f26284f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2014v1)) {
            return super.equals(obj);
        }
        C2014v1 c2014v1 = (C2014v1) obj;
        int size = size();
        if (size != c2014v1.size()) {
            return false;
        }
        int i10 = this.f26281c;
        if (i10 != c2014v1.f26281c) {
            return entrySet().equals(c2014v1.entrySet());
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (!f(i11).equals(c2014v1.f(i11))) {
                return false;
            }
        }
        if (i10 != size) {
            return this.f26282d.equals(c2014v1.f26282d);
        }
        return true;
    }

    public final C2002r1 f(int i10) {
        if (i10 < this.f26281c) {
            return (C2002r1) this.f26280b[i10];
        }
        throw new ArrayIndexOutOfBoundsException(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iH = h(comparable);
        return iH >= 0 ? ((C2002r1) this.f26280b[iH]).f26247c : this.f26282d.get(comparable);
    }

    public final int h(Comparable comparable) {
        int i10 = this.f26281c;
        int i11 = i10 - 1;
        int i12 = 0;
        if (i11 >= 0) {
            int iCompareTo = comparable.compareTo(((C2002r1) this.f26280b[i11]).f26246b);
            if (iCompareTo > 0) {
                return -(i10 + 1);
            }
            if (iCompareTo == 0) {
                return i11;
            }
        }
        while (i12 <= i11) {
            int i13 = (i12 + i11) / 2;
            int iCompareTo2 = comparable.compareTo(((C2002r1) this.f26280b[i13]).f26246b);
            if (iCompareTo2 < 0) {
                i11 = i13 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i13;
                }
                i12 = i13 + 1;
            }
        }
        return -(i12 + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i10 = this.f26281c;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += this.f26280b[i11].hashCode();
        }
        return this.f26282d.size() > 0 ? this.f26282d.hashCode() + iHashCode : iHashCode;
    }

    public final Object j(int i10) {
        l();
        Object[] objArr = this.f26280b;
        Object obj = ((C2002r1) objArr[i10]).f26247c;
        System.arraycopy(objArr, i10 + 1, objArr, i10, (this.f26281c - i10) - 1);
        this.f26281c--;
        if (!this.f26282d.isEmpty()) {
            Iterator it = k().entrySet().iterator();
            Object[] objArr2 = this.f26280b;
            int i11 = this.f26281c;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i11] = new C2002r1(this, (Comparable) entry.getKey(), entry.getValue());
            this.f26281c++;
            it.remove();
        }
        return obj;
    }

    public final SortedMap k() {
        l();
        if (this.f26282d.isEmpty() && !(this.f26282d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f26282d = treeMap;
            this.f26285g = treeMap.descendingMap();
        }
        return (SortedMap) this.f26282d;
    }

    public final void l() {
        if (this.f26283e) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        l();
        Comparable comparable = (Comparable) obj;
        int iH = h(comparable);
        if (iH >= 0) {
            return j(iH);
        }
        if (this.f26282d.isEmpty()) {
            return null;
        }
        return this.f26282d.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f26282d.size() + this.f26281c;
    }
}
