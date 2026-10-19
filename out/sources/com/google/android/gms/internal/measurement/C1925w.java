package com.google.android.gms.internal.measurement;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1925w extends AbstractC1938y {
    @Override // com.google.android.gms.internal.measurement.AbstractC1938y
    public final InterfaceC1884q a(String str, Y1 y10, ArrayList arrayList) {
        switch (C1944z.f25933a[D1.b(str).ordinal()]) {
            case 1:
                D1.f(zzbv.BITWISE_AND, 2, arrayList);
                return new C1835j(Double.valueOf(D1.i(y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(0)).z().doubleValue()) & D1.i(y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(1)).z().doubleValue())));
            case 2:
                D1.f(zzbv.BITWISE_LEFT_SHIFT, 2, arrayList);
                return new C1835j(Double.valueOf(D1.i(y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(0)).z().doubleValue()) << ((int) (((long) D1.i(y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(1)).z().doubleValue())) & 31))));
            case 3:
                D1.f(zzbv.BITWISE_NOT, 1, arrayList);
                return new C1835j(Double.valueOf(~D1.i(y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(0)).z().doubleValue())));
            case 4:
                D1.f(zzbv.BITWISE_OR, 2, arrayList);
                return new C1835j(Double.valueOf(D1.i(y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(0)).z().doubleValue()) | D1.i(y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(1)).z().doubleValue())));
            case 5:
                D1.f(zzbv.BITWISE_RIGHT_SHIFT, 2, arrayList);
                return new C1835j(Double.valueOf(D1.i(y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(0)).z().doubleValue()) >> ((int) (((long) D1.i(y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(1)).z().doubleValue())) & 31))));
            case 6:
                D1.f(zzbv.BITWISE_UNSIGNED_RIGHT_SHIFT, 2, arrayList);
                return new C1835j(Double.valueOf((((long) D1.i(y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(0)).z().doubleValue())) & 4294967295L) >>> ((int) (((long) D1.i(y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(1)).z().doubleValue())) & 31))));
            case 7:
                D1.f(zzbv.BITWISE_XOR, 2, arrayList);
                return new C1835j(Double.valueOf(D1.i(y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(0)).z().doubleValue()) ^ D1.i(y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(1)).z().doubleValue())));
            default:
                b(str);
                throw null;
        }
    }
}
