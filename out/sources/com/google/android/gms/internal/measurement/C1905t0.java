package com.google.android.gms.internal.measurement;

import U4.C0804l;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import p131k5.C2498d1;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.t0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1905t0 extends C1912u0.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f25846f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Bundle f25847g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1912u0 f25848h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1905t0(C1912u0 c1912u0, Context context, Bundle bundle) {
        super(true);
        this.f25846f = context;
        this.f25847g = bundle;
        this.f25848h = c1912u0;
    }

    @Override // com.google.android.gms.internal.measurement.C1912u0.a
    public final void a() {
        InterfaceC1808f0 interfaceC1808f0AsInterface;
        try {
            this.f25848h.getClass();
            C0804l.h(this.f25846f);
            C1912u0 c1912u0 = this.f25848h;
            Context context = this.f25846f;
            c1912u0.getClass();
            try {
                interfaceC1808f0AsInterface = AbstractBinderC1829i0.asInterface(DynamiteModule.c(context, DynamiteModule.f25335b, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
            } catch (DynamiteModule.LoadingException e10) {
                c1912u0.f(e10, true, false);
                interfaceC1808f0AsInterface = null;
            }
            c1912u0.f25861h = interfaceC1808f0AsInterface;
            if (this.f25848h.f25861h == null) {
                String str = this.f25848h.f25854a;
                return;
            }
            int iA = DynamiteModule.a(this.f25846f, ModuleDescriptor.MODULE_ID);
            int iD = DynamiteModule.d(this.f25846f, ModuleDescriptor.MODULE_ID, false);
            C1898s0 c1898s0 = new C1898s0(87000L, Math.max(iA, iD), iD < iA, null, null, null, this.f25847g, C2498d1.a(this.f25846f));
            InterfaceC1808f0 interfaceC1808f0 = this.f25848h.f25861h;
            C0804l.h(interfaceC1808f0);
            interfaceC1808f0.initialize(new p018b5.b(this.f25846f), c1898s0, this.f25862b);
        } catch (Exception e11) {
            this.f25848h.f(e11, true, false);
        }
    }
}
