package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1779b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TreeMap<Integer, r> f25659a = new TreeMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TreeMap<Integer, r> f25660b = new TreeMap<>();

    public final void a(Y1 y10, C1793d c1793d) {
        W3 w3 = new W3(c1793d);
        TreeMap<Integer, r> treeMap = this.f25659a;
        for (Integer num : treeMap.keySet()) {
            C1800e c1800e = (C1800e) c1793d.f25672b.clone();
            InterfaceC1884q interfaceC1884qA = treeMap.get(num).a(y10, Collections.singletonList(w3));
            int i10 = interfaceC1884qA instanceof C1835j ? D1.i(((C1835j) interfaceC1884qA).f25775b.doubleValue()) : -1;
            if (i10 == 2 || i10 == -1) {
                c1793d.f25672b = c1800e;
            }
        }
        TreeMap<Integer, r> treeMap2 = this.f25660b;
        Iterator<Integer> it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            InterfaceC1884q interfaceC1884qA2 = treeMap2.get(it.next()).a(y10, Collections.singletonList(w3));
            if (interfaceC1884qA2 instanceof C1835j) {
                D1.i(((C1835j) interfaceC1884qA2).f25775b.doubleValue());
            }
        }
    }
}
