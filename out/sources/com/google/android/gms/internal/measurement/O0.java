package com.google.android.gms.internal.measurement;

import U4.C0804l;
import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class O0 extends C1912u0.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f25539f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f25540g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Bundle f25541h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f25542i;
    public final /* synthetic */ C1912u0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0(C1912u0 c1912u0, String str, String str2, Bundle bundle, boolean z10) {
        super(true);
        this.f25539f = str;
        this.f25540g = str2;
        this.f25541h = bundle;
        this.f25542i = z10;
        this.j = c1912u0;
    }

    @Override // com.google.android.gms.internal.measurement.C1912u0.a
    public final void a() throws RemoteException {
        long j = this.f25862b;
        InterfaceC1808f0 interfaceC1808f0 = this.j.f25861h;
        C0804l.h(interfaceC1808f0);
        interfaceC1808f0.logEvent(this.f25539f, this.f25540g, this.f25541h, this.f25542i, true, j);
    }
}
