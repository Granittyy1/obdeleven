package com.google.android.gms.internal.measurement;

import U4.C0804l;
import android.app.Activity;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1945z0 extends C1912u0.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Activity f25934f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f25935g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f25936h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1912u0 f25937i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1945z0(C1912u0 c1912u0, Activity activity, String str, String str2) {
        super(true);
        this.f25934f = activity;
        this.f25935g = str;
        this.f25936h = str2;
        this.f25937i = c1912u0;
    }

    @Override // com.google.android.gms.internal.measurement.C1912u0.a
    public final void a() throws RemoteException {
        InterfaceC1808f0 interfaceC1808f0 = this.f25937i.f25861h;
        C0804l.h(interfaceC1808f0);
        interfaceC1808f0.setCurrentScreen(new p018b5.b(this.f25934f), this.f25935g, this.f25936h, this.f25862b);
    }
}
