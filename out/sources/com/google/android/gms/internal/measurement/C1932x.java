package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1932x implements InterfaceC1884q {
    @Override // com.google.android.gms.internal.measurement.InterfaceC1884q
    public final String A() {
        return "undefined";
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1884q
    public final Iterator<InterfaceC1884q> B() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1884q
    public final InterfaceC1884q C(String str, Y1 y10, ArrayList arrayList) {
        throw new IllegalStateException("Undefined has no function ".concat(str));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1884q
    public final Boolean b() {
        return Boolean.FALSE;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof C1932x;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1884q
    public final InterfaceC1884q y() {
        return InterfaceC1884q.f25814f0;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1884q
    public final Double z() {
        return Double.valueOf(Double.NaN);
    }
}
