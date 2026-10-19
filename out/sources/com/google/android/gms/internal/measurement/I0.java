package com.google.android.gms.internal.measurement;

import U4.C0804l;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class I0 extends C1912u0.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ BinderC1815g0 f25472f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1912u0 f25473g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I0(C1912u0 c1912u0, BinderC1815g0 binderC1815g0) {
        super(true);
        this.f25472f = binderC1815g0;
        this.f25473g = c1912u0;
    }

    @Override // com.google.android.gms.internal.measurement.C1912u0.a
    public final void a() throws RemoteException {
        InterfaceC1808f0 interfaceC1808f0 = this.f25473g.f25861h;
        C0804l.h(interfaceC1808f0);
        interfaceC1808f0.generateEventId(this.f25472f);
    }

    @Override // com.google.android.gms.internal.measurement.C1912u0.a
    public final void b() {
        this.f25472f.f(null);
    }
}
