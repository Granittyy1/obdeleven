package com.voltasit.obdeleven.presentation.garage;

import androidx.lifecycle.Z;
import com.voltasit.obdeleven.ui.dialogs.DialogC2146g0;
import java.util.List;
import kotlin.Pair;
import kotlinx.coroutines.C2680e;
import p255u9.F;

/* JADX INFO: compiled from: GarageFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class n implements DialogC2146g0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GarageFragment f32379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Pair<String, List<p315z8.c>> f32380c;

    /* JADX WARN: Multi-variable type inference failed */
    public n(GarageFragment garageFragment, Pair<String, ? extends List<? extends p315z8.c>> pair) {
        this.f32379b = garageFragment;
        this.f32380c = pair;
    }

    @Override // com.voltasit.obdeleven.ui.dialogs.DialogC2146g0.c
    public final void c(F model) {
        kotlin.jvm.internal.i.e(model, "model");
        GarageViewModel garageViewModelO = this.f32379b.O();
        String vin = this.f32380c.c();
        String objectId = model.getObjectId();
        kotlin.jvm.internal.i.d(objectId, "getObjectId(...)");
        garageViewModelO.getClass();
        kotlin.jvm.internal.i.e(vin, "vin");
        C2680e.c(Z.a(garageViewModelO), garageViewModelO.f32112a, null, new GarageViewModel$submitVehicle$1(garageViewModelO, vin, objectId, null), 2);
    }

    @Override // com.voltasit.obdeleven.ui.dialogs.DialogC2146g0.c
    public final void b() {
    }
}
