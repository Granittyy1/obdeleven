package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;
import p131k5.C2488b1;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class J4 extends AbstractC1856m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2488b1 f25489d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J4(C2488b1 c2488b1) {
        super("getValue");
        this.f25489d = c2488b1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1856m
    public final InterfaceC1884q a(Y1 y10, List<InterfaceC1884q> list) {
        D1.e(2, "getValue", list);
        InterfaceC1884q interfaceC1884qC = y10.f25642b.c(y10, list.get(0));
        InterfaceC1884q interfaceC1884qC2 = y10.f25642b.c(y10, list.get(1));
        String strA = interfaceC1884qC.A();
        C2488b1 c2488b1 = this.f25489d;
        Map map = (Map) c2488b1.f42092b.f26561d.get(c2488b1.f42091a);
        String str = (map == null || !map.containsKey(strA)) ? null : (String) map.get(strA);
        return str != null ? new C1897s(str) : interfaceC1884qC2;
    }
}
