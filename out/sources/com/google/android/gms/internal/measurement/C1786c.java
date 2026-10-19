package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1786c extends AbstractC1856m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f25667d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1786c(String str, int i10) {
        super(str);
        this.f25667d = i10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1856m
    public final InterfaceC1884q a(Y1 y10, List list) {
        switch (this.f25667d) {
            case 0:
                return new C1835j(Double.valueOf(0.0d));
            default:
                return InterfaceC1884q.f25814f0;
        }
    }
}
