package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p114j1.C2479a;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1856m implements InterfaceC1849l, InterfaceC1884q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f25796c = new HashMap();

    public AbstractC1856m(String str) {
        this.f25795b = str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1884q
    public final String A() {
        return this.f25795b;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1884q
    public final Iterator<InterfaceC1884q> B() {
        return new C1863n(this.f25796c.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1884q
    public final InterfaceC1884q C(String str, Y1 y10, ArrayList arrayList) {
        return "toString".equals(str) ? new C1897s(this.f25795b) : C2479a.q(this, new C1897s(str), y10, arrayList);
    }

    public abstract InterfaceC1884q a(Y1 y10, List<InterfaceC1884q> list);

    @Override // com.google.android.gms.internal.measurement.InterfaceC1884q
    public final Boolean b() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1849l
    public final InterfaceC1884q e(String str) {
        HashMap map = this.f25796c;
        return map.containsKey(str) ? (InterfaceC1884q) map.get(str) : InterfaceC1884q.f25814f0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC1856m)) {
            return false;
        }
        AbstractC1856m abstractC1856m = (AbstractC1856m) obj;
        String str = this.f25795b;
        if (str != null) {
            return str.equals(abstractC1856m.f25795b);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1849l
    public final boolean g(String str) {
        return this.f25796c.containsKey(str);
    }

    public final int hashCode() {
        String str = this.f25795b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1849l
    public final void k(String str, InterfaceC1884q interfaceC1884q) {
        HashMap map = this.f25796c;
        if (interfaceC1884q == null) {
            map.remove(str);
        } else {
            map.put(str, interfaceC1884q);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1884q
    public final Double z() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1884q
    public InterfaceC1884q y() {
        return this;
    }
}
