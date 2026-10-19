package com.google.android.gms.internal.measurement;

import U4.C0804l;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class J0 extends C1912u0.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f25481f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f25482g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f25483h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ BinderC1815g0 f25484i;
    public final /* synthetic */ C1912u0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J0(C1912u0 c1912u0, String str, String str2, boolean z10, BinderC1815g0 binderC1815g0) {
        super(true);
        this.f25481f = str;
        this.f25482g = str2;
        this.f25483h = z10;
        this.f25484i = binderC1815g0;
        this.j = c1912u0;
    }

    @Override // com.google.android.gms.internal.measurement.C1912u0.a
    public final void a() throws RemoteException {
        InterfaceC1808f0 interfaceC1808f0 = this.j.f25861h;
        C0804l.h(interfaceC1808f0);
        interfaceC1808f0.getUserProperties(this.f25481f, this.f25482g, this.f25483h, this.f25484i);
    }

    @Override // com.google.android.gms.internal.measurement.C1912u0.a
    public final void b() {
        this.f25484i.f(null);
    }
}
