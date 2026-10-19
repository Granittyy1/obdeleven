package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class V5 extends AbstractC1856m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p131k5.W0 f25620d;

    public V5(p131k5.W0 w3) {
        super("internal.appMetadata");
        this.f25620d = w3;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1856m
    public final InterfaceC1884q a(Y1 y10, List<InterfaceC1884q> list) {
        try {
            return A2.b(this.f25620d.call());
        } catch (Exception unused) {
            return InterfaceC1884q.f25814f0;
        }
    }
}
