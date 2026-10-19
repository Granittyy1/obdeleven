package com.google.android.gms.internal.measurement;

import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class L extends AbstractC1938y {
    @Override // com.google.android.gms.internal.measurement.AbstractC1938y
    public final InterfaceC1884q a(String str, Y1 y10, ArrayList arrayList) {
        switch (N.f25518a[D1.b(str).ordinal()]) {
            case 1:
                D1.f(zzbv.ADD, 2, arrayList);
                InterfaceC1884q interfaceC1884qC = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(0));
                InterfaceC1884q interfaceC1884qC2 = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(1));
                if ((interfaceC1884qC instanceof InterfaceC1849l) || (interfaceC1884qC instanceof C1897s) || (interfaceC1884qC2 instanceof InterfaceC1849l) || (interfaceC1884qC2 instanceof C1897s)) {
                    return new C1897s(androidx.compose.ui.text.font.s.b(interfaceC1884qC.A(), interfaceC1884qC2.A()));
                }
                return new C1835j(Double.valueOf(interfaceC1884qC2.z().doubleValue() + interfaceC1884qC.z().doubleValue()));
            case 2:
                D1.f(zzbv.DIVIDE, 2, arrayList);
                return new C1835j(Double.valueOf(y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(0)).z().doubleValue() / y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(1)).z().doubleValue()));
            case 3:
                D1.f(zzbv.MODULUS, 2, arrayList);
                return new C1835j(Double.valueOf(y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(0)).z().doubleValue() % y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(1)).z().doubleValue()));
            case 4:
                D1.f(zzbv.MULTIPLY, 2, arrayList);
                return new C1835j(Double.valueOf(y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(0)).z().doubleValue() * y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(1)).z().doubleValue()));
            case 5:
                D1.f(zzbv.NEGATE, 1, arrayList);
                return new C1835j(Double.valueOf(y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(0)).z().doubleValue() * (-1.0d)));
            case 6:
            case 7:
                D1.e(2, str, arrayList);
                InterfaceC1884q interfaceC1884qC3 = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(0));
                y10.b((InterfaceC1884q) arrayList.get(1));
                return interfaceC1884qC3;
            case 8:
            case 9:
                D1.e(1, str, arrayList);
                return y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(0));
            case 10:
                D1.f(zzbv.SUBTRACT, 2, arrayList);
                InterfaceC1884q interfaceC1884qC4 = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(0));
                return new C1835j(Double.valueOf(interfaceC1884qC4.z().doubleValue() + (y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(1)).z().doubleValue() * (-1.0d))));
            default:
                b(str);
                throw null;
        }
    }
}
