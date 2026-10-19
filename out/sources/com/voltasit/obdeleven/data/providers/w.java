package com.voltasit.obdeleven.data.providers;

import com.voltasit.obdeleven.domain.providers.PurchaseProvider;
import java.util.ArrayList;
import kotlinx.coroutines.B;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.C2693i;
import p237t3.InterfaceC2790c;

/* JADX INFO: compiled from: PurchaseProviderImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class w implements InterfaceC2790c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f30292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2693i f30293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f30294c;

    public w(u uVar, C2693i c2693i, ArrayList arrayList) {
        this.f30292a = uVar;
        this.f30293b = c2693i;
        this.f30294c = arrayList;
    }

    @Override // p237t3.InterfaceC2790c
    public final void a(com.android.billingclient.api.a billingResult) {
        kotlin.jvm.internal.i.e(billingResult, "billingResult");
        u uVar = this.f30292a;
        uVar.getClass();
        StringBuilder sb2 = new StringBuilder("onBillingSetupFinished(");
        ArrayList arrayList = this.f30294c;
        sb2.append(arrayList);
        sb2.append(")");
        uVar.f30282a.f("GooglePurchaseProviderImpl", sb2.toString());
        int i10 = billingResult.f23552a;
        C2693i c2693i = this.f30293b;
        if (i10 == 3) {
            E8.a.d(c2693i, E8.a.i(PurchaseProvider.PurchaseException.Unavailable.f30593b));
        } else {
            C2680e.c(B.a(uVar.f30287f), null, null, new PurchaseProviderImpl$onGetProductsBillingSetupFinished$1(uVar, arrayList, c2693i, null), 3);
        }
    }

    @Override // p237t3.InterfaceC2790c
    public final void b() {
        this.f30292a.f30282a.f("GooglePurchaseProviderImpl", "onBillingServiceDisconnected");
        E8.a.d(this.f30293b, E8.a.i(PurchaseProvider.PurchaseException.Disconnected.f30588b));
    }
}
