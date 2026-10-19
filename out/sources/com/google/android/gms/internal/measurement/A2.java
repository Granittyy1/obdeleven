package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class A2 {
    public static InterfaceC1884q a(zzgb$zzd zzgb_zzd) {
        if (zzgb_zzd == null) {
            return InterfaceC1884q.f25814f0;
        }
        int i10 = C1893r2.f25829a[zzgb_zzd.w().ordinal()];
        if (i10 == 1) {
            return zzgb_zzd.D() ? new C1897s(zzgb_zzd.y()) : InterfaceC1884q.f25821m0;
        }
        if (i10 == 2) {
            return zzgb_zzd.C() ? new C1835j(Double.valueOf(zzgb_zzd.v())) : new C1835j(null);
        }
        if (i10 == 3) {
            return zzgb_zzd.B() ? new C1821h(Boolean.valueOf(zzgb_zzd.A())) : new C1821h(null);
        }
        if (i10 != 4) {
            if (i10 != 5) {
                throw new IllegalStateException("Invalid entity: ".concat(String.valueOf(zzgb_zzd)));
            }
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
        List<zzgb$zzd> listZ = zzgb_zzd.z();
        ArrayList arrayList = new ArrayList();
        Iterator<zzgb$zzd> it = listZ.iterator();
        while (it.hasNext()) {
            arrayList.add(a(it.next()));
        }
        return new C1904t(zzgb_zzd.x(), arrayList);
    }

    public static InterfaceC1884q b(Object obj) {
        if (obj == null) {
            return InterfaceC1884q.f25815g0;
        }
        if (obj instanceof String) {
            return new C1897s((String) obj);
        }
        if (obj instanceof Double) {
            return new C1835j((Double) obj);
        }
        if (obj instanceof Long) {
            return new C1835j(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C1835j(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new C1821h((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            C1814g c1814g = new C1814g();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c1814g.q(b(it.next()));
            }
            return c1814g;
        }
        C1877p c1877p = new C1877p();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            InterfaceC1884q interfaceC1884qB = b(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                c1877p.k((String) string, interfaceC1884qB);
            }
        }
        return c1877p;
    }
}
