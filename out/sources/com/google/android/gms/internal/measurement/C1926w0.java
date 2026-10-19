package com.google.android.gms.internal.measurement;

import U4.C0804l;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.w0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1926w0 extends C1912u0.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f25900f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f25901g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f25902h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f25903i;
    public final /* synthetic */ C1912u0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1926w0(C1912u0 c1912u0, String str, String str2, String str3, boolean z10) {
        super(true);
        this.f25900f = str;
        this.f25901g = str2;
        this.f25902h = str3;
        this.f25903i = z10;
        this.j = c1912u0;
    }

    @Override // com.google.android.gms.internal.measurement.C1912u0.a
    public final void a() throws RemoteException {
        InterfaceC1808f0 interfaceC1808f0 = this.j.f25861h;
        C0804l.h(interfaceC1808f0);
        interfaceC1808f0.setUserProperty(this.f25900f, this.f25901g, new p018b5.b(this.f25902h), this.f25903i, this.f25862b);
    }
}
