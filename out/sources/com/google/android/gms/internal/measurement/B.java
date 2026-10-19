package com.google.android.gms.internal.measurement;

import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class B extends AbstractC1938y {
    public static boolean c(InterfaceC1884q interfaceC1884q, InterfaceC1884q interfaceC1884q2) {
        InterfaceC1884q c1835j;
        InterfaceC1884q c1835j2;
        while (!interfaceC1884q.getClass().equals(interfaceC1884q2.getClass())) {
            if (((interfaceC1884q instanceof C1932x) || (interfaceC1884q instanceof C1870o)) && ((interfaceC1884q2 instanceof C1932x) || (interfaceC1884q2 instanceof C1870o))) {
                return true;
            }
            boolean z10 = interfaceC1884q instanceof C1835j;
            if (z10 && (interfaceC1884q2 instanceof C1897s)) {
                c1835j2 = new C1835j(interfaceC1884q2.z());
            } else {
                boolean z11 = interfaceC1884q instanceof C1897s;
                if (z11 && (interfaceC1884q2 instanceof C1835j)) {
                    c1835j = new C1835j(interfaceC1884q.z());
                } else if (interfaceC1884q instanceof C1821h) {
                    c1835j = new C1835j(interfaceC1884q.z());
                } else if (interfaceC1884q2 instanceof C1821h) {
                    c1835j2 = new C1835j(interfaceC1884q2.z());
                } else if ((z11 || z10) && (interfaceC1884q2 instanceof InterfaceC1849l)) {
                    c1835j2 = new C1897s(interfaceC1884q2.A());
                } else {
                    if (!(interfaceC1884q instanceof InterfaceC1849l) || (!(interfaceC1884q2 instanceof C1897s) && !(interfaceC1884q2 instanceof C1835j))) {
                        return false;
                    }
                    c1835j = new C1897s(interfaceC1884q.A());
                }
                interfaceC1884q = c1835j;
            }
            interfaceC1884q2 = c1835j2;
        }
        if ((interfaceC1884q instanceof C1932x) || (interfaceC1884q instanceof C1870o)) {
            return true;
        }
        if (interfaceC1884q instanceof C1835j) {
            return (Double.isNaN(interfaceC1884q.z().doubleValue()) || Double.isNaN(interfaceC1884q2.z().doubleValue()) || interfaceC1884q.z().doubleValue() != interfaceC1884q2.z().doubleValue()) ? false : true;
        }
        if (interfaceC1884q instanceof C1897s) {
            return interfaceC1884q.A().equals(interfaceC1884q2.A());
        }
        if (interfaceC1884q instanceof C1821h) {
            return interfaceC1884q.b().equals(interfaceC1884q2.b());
        }
        return interfaceC1884q == interfaceC1884q2;
    }

    public static boolean d(InterfaceC1884q interfaceC1884q, InterfaceC1884q interfaceC1884q2) {
        if (interfaceC1884q instanceof InterfaceC1849l) {
            interfaceC1884q = new C1897s(interfaceC1884q.A());
        }
        if (interfaceC1884q2 instanceof InterfaceC1849l) {
            interfaceC1884q2 = new C1897s(interfaceC1884q2.A());
        }
        if ((interfaceC1884q instanceof C1897s) && (interfaceC1884q2 instanceof C1897s)) {
            return ((C1897s) interfaceC1884q).f25833b.compareTo(((C1897s) interfaceC1884q2).f25833b) < 0;
        }
        double dDoubleValue = interfaceC1884q.z().doubleValue();
        double dDoubleValue2 = interfaceC1884q2.z().doubleValue();
        return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || (dDoubleValue == 0.0d && dDoubleValue2 == -0.0d) || ((dDoubleValue == -0.0d && dDoubleValue2 == 0.0d) || Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
    }

    public static boolean e(InterfaceC1884q interfaceC1884q, InterfaceC1884q interfaceC1884q2) {
        if (interfaceC1884q instanceof InterfaceC1849l) {
            interfaceC1884q = new C1897s(interfaceC1884q.A());
        }
        if (interfaceC1884q2 instanceof InterfaceC1849l) {
            interfaceC1884q2 = new C1897s(interfaceC1884q2.A());
        }
        return (((interfaceC1884q instanceof C1897s) && (interfaceC1884q2 instanceof C1897s)) || !(Double.isNaN(interfaceC1884q.z().doubleValue()) || Double.isNaN(interfaceC1884q2.z().doubleValue()))) && !d(interfaceC1884q2, interfaceC1884q);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0064  */
    /* JADX WARN: Code duplicated, block: B:18:0x0067  */
    @Override // com.google.android.gms.internal.measurement.AbstractC1938y
    public final InterfaceC1884q a(String str, Y1 y10, ArrayList arrayList) {
        boolean zC;
        boolean zH;
        D1.e(2, D1.b(str).name(), arrayList);
        InterfaceC1884q interfaceC1884qC = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(0));
        InterfaceC1884q interfaceC1884qC2 = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(1));
        switch (D.f25417a[D1.b(str).ordinal()]) {
            case 1:
                zC = c(interfaceC1884qC, interfaceC1884qC2);
                return zC ? InterfaceC1884q.f25819k0 : InterfaceC1884q.f25820l0;
            case 2:
                zC = d(interfaceC1884qC2, interfaceC1884qC);
                if (zC) {
                }
            case 3:
                zC = e(interfaceC1884qC2, interfaceC1884qC);
                if (zC) {
                }
            case 4:
                zC = D1.h(interfaceC1884qC, interfaceC1884qC2);
                if (zC) {
                }
            case 5:
                zH = D1.h(interfaceC1884qC, interfaceC1884qC2);
                zC = !zH;
                if (zC) {
                }
            case 6:
                zC = d(interfaceC1884qC, interfaceC1884qC2);
                if (zC) {
                }
            case 7:
                zC = e(interfaceC1884qC, interfaceC1884qC2);
                if (zC) {
                }
            case 8:
                zH = c(interfaceC1884qC, interfaceC1884qC2);
                zC = !zH;
                if (zC) {
                }
            default:
                b(str);
                throw null;
        }
    }
}
