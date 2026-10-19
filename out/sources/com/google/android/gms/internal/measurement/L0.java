package com.google.android.gms.internal.measurement;

import U4.C0804l;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class L0 extends C1912u0.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Exception f25502f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1912u0 f25503g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L0(C1912u0 c1912u0, Exception exc) {
        super(false);
        this.f25502f = exc;
        this.f25503g = c1912u0;
    }

    @Override // com.google.android.gms.internal.measurement.C1912u0.a
    public final void a() throws RemoteException {
        InterfaceC1808f0 interfaceC1808f0 = this.f25503g.f25861h;
        C0804l.h(interfaceC1808f0);
        interfaceC1808f0.logHealthData(5, "Error with data collection. Data lost.", new p018b5.b(this.f25502f), new p018b5.b(null), new p018b5.b(null));
    }
}
