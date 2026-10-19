package androidx.compose.runtime;

/* JADX INFO: renamed from: androidx.compose.runtime.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CompositionLocalMap.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1109s {
    public static final <T> T a(InterfaceC1089h0 interfaceC1089h0, AbstractC1104p<T> abstractC1104p) {
        kotlin.jvm.internal.i.c(abstractC1104p, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        S0<T> s0A = (S0<T>) interfaceC1089h0.get(abstractC1104p);
        if (s0A == null) {
            s0A = abstractC1104p.a();
        }
        return (T) s0A.a(interfaceC1089h0);
    }

    public static final InterfaceC1089h0 b(C1101n0<?>[] c1101n0Arr, InterfaceC1089h0 interfaceC1089h0, InterfaceC1089h0 interfaceC1089h1) {
        androidx.compose.runtime.internal.d.a aVar = new androidx.compose.runtime.internal.d.a(androidx.compose.runtime.internal.d.f13053e);
        for (C1101n0<?> c1101n0 : c1101n0Arr) {
            AbstractC1099m0 abstractC1099m0 = c1101n0.f13098a;
            if (c1101n0.f13103f || !interfaceC1089h0.containsKey(abstractC1099m0)) {
                aVar.put(abstractC1099m0, abstractC1099m0.c(c1101n0, (S0) interfaceC1089h1.get(abstractC1099m0)));
            }
        }
        return aVar.a();
    }
}
