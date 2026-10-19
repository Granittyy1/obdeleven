package com.google.android.gms.internal.measurement;

import U4.C0804l;
import android.app.Activity;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class P0 extends C1912u0.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Activity f25549f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1912u0.b f25550g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P0(C1912u0.b bVar, Activity activity) {
        super(true);
        this.f25549f = activity;
        this.f25550g = bVar;
    }

    @Override // com.google.android.gms.internal.measurement.C1912u0.a
    public final void a() throws RemoteException {
        InterfaceC1808f0 interfaceC1808f0 = C1912u0.this.f25861h;
        C0804l.h(interfaceC1808f0);
        interfaceC1808f0.onActivityStarted(new p018b5.b(this.f25549f), this.f25863c);
    }
}
