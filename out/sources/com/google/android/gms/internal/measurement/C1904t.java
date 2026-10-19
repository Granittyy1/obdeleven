package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1904t implements InterfaceC1884q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<InterfaceC1884q> f25845c;

    public C1904t(String str, ArrayList arrayList) {
        this.f25844b = str;
        ArrayList<InterfaceC1884q> arrayList2 = new ArrayList<>();
        this.f25845c = arrayList2;
        arrayList2.addAll(arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1884q
    public final String A() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1884q
    public final Iterator<InterfaceC1884q> B() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1884q
    public final InterfaceC1884q C(String str, Y1 y10, ArrayList arrayList) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1884q
    public final Boolean b() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1904t)) {
            return false;
        }
        C1904t c1904t = (C1904t) obj;
        String str = this.f25844b;
        if (str == null ? c1904t.f25844b != null : !str.equals(c1904t.f25844b)) {
            return false;
        }
        ArrayList<InterfaceC1884q> arrayList = this.f25845c;
        ArrayList<InterfaceC1884q> arrayList2 = c1904t.f25845c;
        if (arrayList != null) {
            return arrayList.equals(arrayList2);
        }
        return arrayList2 == null;
    }

    public final int hashCode() {
        String str = this.f25844b;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        ArrayList<InterfaceC1884q> arrayList = this.f25845c;
        return iHashCode + (arrayList != null ? arrayList.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1884q
    public final Double z() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1884q
    public final InterfaceC1884q y() {
        return this;
    }
}
