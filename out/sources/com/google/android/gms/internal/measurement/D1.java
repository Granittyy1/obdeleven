package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class D1 {
    public static double a(double d10) {
        if (Double.isNaN(d10)) {
            return 0.0d;
        }
        if (Double.isInfinite(d10) || d10 == 0.0d || d10 == -0.0d) {
            return d10;
        }
        return Math.floor(Math.abs(d10)) * ((double) (d10 > 0.0d ? 1 : -1));
    }

    public static zzbv b(String str) {
        zzbv zzbvVar;
        if (str == null || str.isEmpty()) {
            zzbvVar = null;
        } else {
            zzbvVar = (zzbv) zzbv.f25943A0.get(Integer.valueOf(Integer.parseInt(str)));
        }
        if (zzbvVar != null) {
            return zzbvVar;
        }
        throw new IllegalArgumentException(B7.b.c("Unsupported commandId ", str));
    }

    public static Object c(InterfaceC1884q interfaceC1884q) {
        if (InterfaceC1884q.f25815g0.equals(interfaceC1884q)) {
            return null;
        }
        if (InterfaceC1884q.f25814f0.equals(interfaceC1884q)) {
            return "";
        }
        if (interfaceC1884q instanceof C1877p) {
            return d((C1877p) interfaceC1884q);
        }
        if (!(interfaceC1884q instanceof C1814g)) {
            return !interfaceC1884q.z().isNaN() ? interfaceC1884q.z() : interfaceC1884q.A();
        }
        ArrayList arrayList = new ArrayList();
        C1814g c1814g = (C1814g) interfaceC1884q;
        c1814g.getClass();
        int i10 = 0;
        while (i10 < c1814g.s()) {
            if (i10 >= c1814g.s()) {
                throw new NoSuchElementException(J4.i.b(i10, "Out of bounds index: "));
            }
            int i11 = i10 + 1;
            Object objC = c(c1814g.d(i10));
            if (objC != null) {
                arrayList.add(objC);
            }
            i10 = i11;
        }
        return arrayList;
    }

    public static HashMap d(C1877p c1877p) {
        HashMap map = new HashMap();
        c1877p.getClass();
        for (String str : new ArrayList(c1877p.f25811b.keySet())) {
            Object objC = c(c1877p.e(str));
            if (objC != null) {
                map.put(str, objC);
            }
        }
        return map;
    }

    public static void e(int i10, String str, List list) {
        if (list.size() == i10) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires " + i10 + " parameters found " + list.size());
    }

    public static void f(zzbv zzbvVar, int i10, ArrayList arrayList) {
        e(i10, zzbvVar.name(), arrayList);
    }

    public static void g(Y1 y10) {
        int i10 = i(y10.c("runtime.counter").z().doubleValue() + 1.0d);
        if (i10 > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        y10.g("runtime.counter", new C1835j(Double.valueOf(i10)));
    }

    public static boolean h(InterfaceC1884q interfaceC1884q, InterfaceC1884q interfaceC1884q2) {
        if (!interfaceC1884q.getClass().equals(interfaceC1884q2.getClass())) {
            return false;
        }
        if ((interfaceC1884q instanceof C1932x) || (interfaceC1884q instanceof C1870o)) {
            return true;
        }
        if (interfaceC1884q instanceof C1835j) {
            if (Double.isNaN(interfaceC1884q.z().doubleValue()) || Double.isNaN(interfaceC1884q2.z().doubleValue())) {
                return false;
            }
            return interfaceC1884q.z().equals(interfaceC1884q2.z());
        }
        if (interfaceC1884q instanceof C1897s) {
            return interfaceC1884q.A().equals(interfaceC1884q2.A());
        }
        if (interfaceC1884q instanceof C1821h) {
            return interfaceC1884q.b().equals(interfaceC1884q2.b());
        }
        return interfaceC1884q == interfaceC1884q2;
    }

    public static int i(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10) || d10 == 0.0d) {
            return 0;
        }
        return (int) ((Math.floor(Math.abs(d10)) * ((double) (d10 > 0.0d ? 1 : -1))) % 4.294967296E9d);
    }

    public static void j(int i10, String str, List list) {
        if (list.size() >= i10) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at least " + i10 + " parameters found " + list.size());
    }

    public static void k(zzbv zzbvVar, int i10, ArrayList arrayList) {
        j(i10, zzbvVar.name(), arrayList);
    }

    public static boolean l(InterfaceC1884q interfaceC1884q) {
        if (interfaceC1884q == null) {
            return false;
        }
        Double dZ = interfaceC1884q.z();
        return !dZ.isNaN() && dZ.doubleValue() >= 0.0d && dZ.equals(Double.valueOf(Math.floor(dZ.doubleValue())));
    }

    public static void m(int i10, String str, ArrayList arrayList) {
        if (arrayList.size() <= i10) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at most " + i10 + " parameters found " + arrayList.size());
    }
}
