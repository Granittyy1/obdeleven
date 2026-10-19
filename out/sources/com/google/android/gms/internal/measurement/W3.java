package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class W3 extends C1877p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1793d f25625c;

    public W3(C1793d c1793d) {
        this.f25625c = c1793d;
    }

    @Override // com.google.android.gms.internal.measurement.C1877p, com.google.android.gms.internal.measurement.InterfaceC1884q
    public final InterfaceC1884q C(String str, Y1 y10, ArrayList arrayList) {
        C1793d c1793d = this.f25625c;
        switch (str) {
            case "getEventName":
                D1.e(0, "getEventName", arrayList);
                return new C1897s(c1793d.f25672b.f25681a);
            case "getTimestamp":
                D1.e(0, "getTimestamp", arrayList);
                return new C1835j(Double.valueOf(c1793d.f25672b.f25682b));
            case "getParamValue":
                D1.e(1, "getParamValue", arrayList);
                String strA = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(0)).A();
                HashMap map = c1793d.f25672b.f25683c;
                return A2.b(map.containsKey(strA) ? map.get(strA) : null);
            case "getParams":
                D1.e(0, "getParams", arrayList);
                HashMap map2 = c1793d.f25672b.f25683c;
                C1877p c1877p = new C1877p();
                for (String str2 : map2.keySet()) {
                    c1877p.k(str2, A2.b(map2.get(str2)));
                }
                return c1877p;
            case "setParamValue":
                D1.e(2, "setParamValue", arrayList);
                String strA2 = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(0)).A();
                InterfaceC1884q interfaceC1884qC = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(1));
                C1800e c1800e = c1793d.f25672b;
                Object objC = D1.c(interfaceC1884qC);
                HashMap map3 = c1800e.f25683c;
                if (objC == null) {
                    map3.remove(strA2);
                } else {
                    map3.put(strA2, C1800e.a(map3.get(strA2), objC, strA2));
                }
                return interfaceC1884qC;
            case "setEventName":
                D1.e(1, "setEventName", arrayList);
                InterfaceC1884q interfaceC1884qC2 = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(0));
                if (InterfaceC1884q.f25814f0.equals(interfaceC1884qC2) || InterfaceC1884q.f25815g0.equals(interfaceC1884qC2)) {
                    throw new IllegalArgumentException("Illegal event name");
                }
                c1793d.f25672b.f25681a = interfaceC1884qC2.A();
                return new C1897s(interfaceC1884qC2.A());
            default:
                return super.C(str, y10, arrayList);
        }
    }
}
