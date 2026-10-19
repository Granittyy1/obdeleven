package com.voltasit.obdeleven.presentation.vehicle;

import com.voltasit.obdeleven.ui.dialogs.DialogC2146g0;
import kotlin.jvm.internal.i;
import p255u9.E;
import p255u9.F;

/* JADX INFO: compiled from: VehicleBaseFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements DialogC2146g0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VehicleBaseFragment f33430b;

    public d(VehicleBaseFragment vehicleBaseFragment) {
        this.f33430b = vehicleBaseFragment;
    }

    @Override // com.voltasit.obdeleven.ui.dialogs.DialogC2146g0.c
    public final void b() {
        this.f33430b.r().h();
    }

    @Override // com.voltasit.obdeleven.ui.dialogs.DialogC2146g0.c
    public final void c(F model) {
        i.e(model, "model");
        VehicleViewModel vehicleViewModelP = this.f33430b.P();
        vehicleViewModelP.getClass();
        E e10 = vehicleViewModelP.f33423y;
        if (e10 == null) {
            return;
        }
        vehicleViewModelP.f33414p.g(e10, model);
    }
}
