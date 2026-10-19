package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class L5 extends AbstractC1856m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p005a4.c f25507d;

    public L5(p005a4.c cVar) {
        super("internal.logger");
        this.f25507d = cVar;
        this.f25796c.put("log", new T5(this, false, true));
        this.f25796c.put("silent", new C1848k5("silent"));
        ((AbstractC1856m) this.f25796c.get("silent")).k("log", new T5(this, true, true));
        this.f25796c.put("unmonitored", new S5("unmonitored"));
        ((AbstractC1856m) this.f25796c.get("unmonitored")).k("log", new T5(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1856m
    public final InterfaceC1884q a(Y1 y10, List<InterfaceC1884q> list) {
        return InterfaceC1884q.f25814f0;
    }
}
