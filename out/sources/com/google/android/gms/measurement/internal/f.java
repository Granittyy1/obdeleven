package com.google.android.gms.measurement.internal;

import U4.C0804l;
import p131k5.C2523i1;
import p131k5.F1;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService.a f26587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f26588c;

    public f(AppMeasurementDynamiteService appMeasurementDynamiteService, AppMeasurementDynamiteService.a aVar) {
        this.f26587b = aVar;
        this.f26588c = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e eVar = this.f26588c.f26535c.f42226p;
        C2523i1.f(eVar);
        AppMeasurementDynamiteService.a aVar = this.f26587b;
        eVar.p();
        eVar.t();
        F1 f10 = eVar.f26572d;
        if (aVar != f10) {
            C0804l.j("EventInterceptor already set.", f10 == null);
        }
        eVar.f26572d = aVar;
    }
}
