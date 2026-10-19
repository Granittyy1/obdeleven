package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p114j1.C2479a;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public class C1877p implements InterfaceC1849l, InterfaceC1884q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f25811b = new HashMap();

    @Override // com.google.android.gms.internal.measurement.InterfaceC1884q
    public final String A() {
        return "[object Object]";
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1884q
    public final Iterator<InterfaceC1884q> B() {
        return new C1863n(this.f25811b.keySet().iterator());
    }

    public InterfaceC1884q C(String str, Y1 y10, ArrayList arrayList) {
        return "toString".equals(str) ? new C1897s(toString()) : C2479a.q(this, new C1897s(str), y10, arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1884q
    public final Boolean b() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1849l
    public final InterfaceC1884q e(String str) {
        HashMap map = this.f25811b;
        return map.containsKey(str) ? (InterfaceC1884q) map.get(str) : InterfaceC1884q.f25814f0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1877p) {
            return this.f25811b.equals(((C1877p) obj).f25811b);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1849l
    public final boolean g(String str) {
        return this.f25811b.containsKey(str);
    }

    public final int hashCode() {
        return this.f25811b.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1849l
    public final void k(String str, InterfaceC1884q interfaceC1884q) {
        HashMap map = this.f25811b;
        if (interfaceC1884q == null) {
            map.remove(str);
        } else {
            map.put(str, interfaceC1884q);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        HashMap map = this.f25811b;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb2.append(String.format("%s: %s,", str, map.get(str)));
            }
            sb2.deleteCharAt(sb2.lastIndexOf(","));
        }
        sb2.append("}");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1884q
    public final InterfaceC1884q y() {
        C1877p c1877p = new C1877p();
        for (Map.Entry entry : this.f25811b.entrySet()) {
            boolean z10 = entry.getValue() instanceof InterfaceC1849l;
            HashMap map = c1877p.f25811b;
            if (z10) {
                map.put((String) entry.getKey(), (InterfaceC1884q) entry.getValue());
            } else {
                map.put((String) entry.getKey(), ((InterfaceC1884q) entry.getValue()).y());
            }
        }
        return c1877p;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1884q
    public final Double z() {
        return Double.valueOf(Double.NaN);
    }
}
