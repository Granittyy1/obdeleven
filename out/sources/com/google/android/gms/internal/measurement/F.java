package com.google.android.gms.internal.measurement;

import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class F extends AbstractC1938y {
    @Override // com.google.android.gms.internal.measurement.AbstractC1938y
    public final InterfaceC1884q a(String str, Y1 y10, ArrayList arrayList) {
        int i10 = I.f25471a[D1.b(str).ordinal()];
        if (i10 == 1) {
            D1.f(zzbv.AND, 2, arrayList);
            InterfaceC1884q interfaceC1884qC = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(0));
            if (!interfaceC1884qC.b().booleanValue()) {
                return interfaceC1884qC;
            }
            return y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(1));
        }
        if (i10 == 2) {
            D1.f(zzbv.NOT, 1, arrayList);
            return new C1821h(Boolean.valueOf(!y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(0)).b().booleanValue()));
        }
        if (i10 != 3) {
            b(str);
            throw null;
        }
        D1.f(zzbv.OR, 2, arrayList);
        InterfaceC1884q interfaceC1884qC2 = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(0));
        if (interfaceC1884qC2.b().booleanValue()) {
            return interfaceC1884qC2;
        }
        return y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(1));
    }
}
