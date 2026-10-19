package com.google.android.gms.internal.measurement;

import U4.C0804l;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1933x0 extends C1912u0.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f25907f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f25908g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ BinderC1815g0 f25909h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1912u0 f25910i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1933x0(C1912u0 c1912u0, String str, String str2, BinderC1815g0 binderC1815g0) {
        super(true);
        this.f25907f = str;
        this.f25908g = str2;
        this.f25909h = binderC1815g0;
        this.f25910i = c1912u0;
    }

    @Override // com.google.android.gms.internal.measurement.C1912u0.a
    public final void a() throws RemoteException {
        InterfaceC1808f0 interfaceC1808f0 = this.f25910i.f25861h;
        C0804l.h(interfaceC1808f0);
        interfaceC1808f0.getConditionalUserProperties(this.f25907f, this.f25908g, this.f25909h);
    }

    @Override // com.google.android.gms.internal.measurement.C1912u0.a
    public final void b() {
        this.f25909h.f(null);
    }
}
