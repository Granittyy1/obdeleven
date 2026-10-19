package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class W5 extends AbstractC1856m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1860m3 f25628d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f25629e;

    public W5(C1860m3 c1860m3) {
        super("require");
        this.f25629e = new HashMap();
        this.f25628d = c1860m3;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1856m
    public final InterfaceC1884q a(Y1 y10, List<InterfaceC1884q> list) {
        InterfaceC1884q interfaceC1884q;
        D1.e(1, "require", list);
        String strA = y10.f25642b.c(y10, list.get(0)).A();
        HashMap map = this.f25629e;
        if (map.containsKey(strA)) {
            return (InterfaceC1884q) map.get(strA);
        }
        HashMap map2 = this.f25628d.f25798a;
        if (map2.containsKey(strA)) {
            try {
                interfaceC1884q = (InterfaceC1884q) ((Callable) map2.get(strA)).call();
            } catch (Exception unused) {
                throw new IllegalStateException(B7.b.c("Failed to create API implementation: ", strA));
            }
        } else {
            interfaceC1884q = InterfaceC1884q.f25814f0;
        }
        if (interfaceC1884q instanceof AbstractC1856m) {
            map.put(strA, (AbstractC1856m) interfaceC1884q);
        }
        return interfaceC1884q;
    }
}
