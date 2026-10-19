package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1821h implements InterfaceC1884q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f25762b;

    public C1821h(Boolean bool) {
        if (bool == null) {
            this.f25762b = false;
        } else {
            this.f25762b = bool.booleanValue();
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1884q
    public final String A() {
        return Boolean.toString(this.f25762b);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1884q
    public final Iterator<InterfaceC1884q> B() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1884q
    public final InterfaceC1884q C(String str, Y1 y10, ArrayList arrayList) {
        boolean zEquals = "toString".equals(str);
        boolean z10 = this.f25762b;
        if (zEquals) {
            return new C1897s(Boolean.toString(z10));
        }
        throw new IllegalArgumentException(C4.b.d(Boolean.toString(z10), ".", str, " is not a function."));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1884q
    public final Boolean b() {
        return Boolean.valueOf(this.f25762b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1821h) && this.f25762b == ((C1821h) obj).f25762b;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f25762b).hashCode();
    }

    public final String toString() {
        return String.valueOf(this.f25762b);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1884q
    public final InterfaceC1884q y() {
        return new C1821h(Boolean.valueOf(this.f25762b));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1884q
    public final Double z() {
        return Double.valueOf(this.f25762b ? 1.0d : 0.0d);
    }
}
