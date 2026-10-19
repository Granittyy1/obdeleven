package com.google.android.gms.internal.measurement;

import U4.C0804l;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class A0 extends C1912u0.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f25395f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1912u0 f25396g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A0(C1912u0 c1912u0, String str) {
        super(true);
        this.f25395f = str;
        this.f25396g = c1912u0;
    }

    @Override // com.google.android.gms.internal.measurement.C1912u0.a
    public final void a() throws RemoteException {
        InterfaceC1808f0 interfaceC1808f0 = this.f25396g.f25861h;
        C0804l.h(interfaceC1808f0);
        interfaceC1808f0.setUserId(this.f25395f, this.f25862b);
    }
}
