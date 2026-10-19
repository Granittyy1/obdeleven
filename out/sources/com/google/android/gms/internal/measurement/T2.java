package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class T2 extends AbstractC1856m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1793d f25597d;

    public T2(C1793d c1793d) {
        super("internal.eventLogger");
        this.f25597d = c1793d;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1856m
    public final InterfaceC1884q a(Y1 y10, List<InterfaceC1884q> list) {
        D1.e(3, this.f25795b, list);
        String strA = y10.f25642b.c(y10, list.get(0)).A();
        long jA = (long) D1.a(y10.f25642b.c(y10, list.get(1)).z().doubleValue());
        InterfaceC1884q interfaceC1884qC = y10.f25642b.c(y10, list.get(2));
        HashMap mapD = interfaceC1884qC instanceof C1877p ? D1.d((C1877p) interfaceC1884qC) : new HashMap();
        C1793d c1793d = this.f25597d;
        c1793d.getClass();
        HashMap map = new HashMap();
        for (String str : mapD.keySet()) {
            HashMap map2 = c1793d.f25671a.f25683c;
            map.put(str, C1800e.a(map2.containsKey(str) ? map2.get(str) : null, mapD.get(str), str));
        }
        c1793d.f25673c.add(new C1800e(strA, jA, map));
        return InterfaceC1884q.f25814f0;
    }
}
