package com.google.android.gms.internal.measurement;

import U4.C0804l;
import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class R0 extends C1912u0.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Bundle f25568f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Activity f25569g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1912u0.b f25570h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R0(C1912u0.b bVar, Bundle bundle, Activity activity) {
        super(true);
        this.f25568f = bundle;
        this.f25569g = activity;
        this.f25570h = bVar;
    }

    @Override // com.google.android.gms.internal.measurement.C1912u0.a
    public final void a() throws RemoteException {
        Bundle bundle;
        if (this.f25568f != null) {
            bundle = new Bundle();
            if (this.f25568f.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f25568f.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        InterfaceC1808f0 interfaceC1808f0 = C1912u0.this.f25861h;
        C0804l.h(interfaceC1808f0);
        interfaceC1808f0.onActivityCreated(new p018b5.b(this.f25569g), bundle, this.f25863c);
    }
}
