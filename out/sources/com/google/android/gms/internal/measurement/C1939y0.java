package com.google.android.gms.internal.measurement;

import U4.C0804l;
import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.y0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1939y0 extends C1912u0.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f25920f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f25921g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Bundle f25922h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1912u0 f25923i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1939y0(C1912u0 c1912u0, String str, String str2, Bundle bundle) {
        super(true);
        this.f25920f = str;
        this.f25921g = str2;
        this.f25922h = bundle;
        this.f25923i = c1912u0;
    }

    @Override // com.google.android.gms.internal.measurement.C1912u0.a
    public final void a() throws RemoteException {
        InterfaceC1808f0 interfaceC1808f0 = this.f25923i.f25861h;
        C0804l.h(interfaceC1808f0);
        interfaceC1808f0.clearConditionalUserProperty(this.f25920f, this.f25921g, this.f25922h);
    }
}
