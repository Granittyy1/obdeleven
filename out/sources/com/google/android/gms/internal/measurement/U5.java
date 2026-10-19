package com.google.android.gms.internal.measurement;

import com.braze.Constants;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class U5 extends AbstractC1856m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1779b f25607d;

    @Override // com.google.android.gms.internal.measurement.AbstractC1856m
    public final InterfaceC1884q a(Y1 y10, List<InterfaceC1884q> list) {
        TreeMap<Integer, r> treeMap;
        D1.e(3, this.f25795b, list);
        y10.f25642b.c(y10, list.get(0)).A();
        InterfaceC1884q interfaceC1884qC = y10.f25642b.c(y10, list.get(1));
        if (!(interfaceC1884qC instanceof r)) {
            throw new IllegalArgumentException("Invalid callback type");
        }
        InterfaceC1884q interfaceC1884qC2 = y10.f25642b.c(y10, list.get(2));
        if (!(interfaceC1884qC2 instanceof C1877p)) {
            throw new IllegalArgumentException("Invalid callback params");
        }
        C1877p c1877p = (C1877p) interfaceC1884qC2;
        if (!c1877p.f25811b.containsKey("type")) {
            throw new IllegalArgumentException("Undefined rule type");
        }
        String strA = c1877p.e("type").A();
        int i10 = c1877p.f25811b.containsKey("priority") ? D1.i(c1877p.e("priority").z().doubleValue()) : Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS;
        r rVar = (r) interfaceC1884qC;
        C1779b c1779b = this.f25607d;
        c1779b.getClass();
        if ("create".equals(strA)) {
            treeMap = c1779b.f25660b;
        } else {
            if (!"edit".equals(strA)) {
                throw new IllegalStateException(B7.b.c("Unknown callback type: ", strA));
            }
            treeMap = c1779b.f25659a;
        }
        if (treeMap.containsKey(Integer.valueOf(i10))) {
            i10 = treeMap.lastKey().intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i10), rVar);
        return InterfaceC1884q.f25814f0;
    }
}
