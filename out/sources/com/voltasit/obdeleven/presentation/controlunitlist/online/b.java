package com.voltasit.obdeleven.presentation.controlunitlist.online;

import androidx.collection.Y;
import androidx.lifecycle.Z;
import com.obdeleven.service.model.f;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.C2680e;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OnlineControlUnitListViewModel f32111a;

    public final void a(f gatewayControlUnit, Y newStatuses) {
        OnlineControlUnitListViewModel onlineControlUnitListViewModel = this.f32111a;
        onlineControlUnitListViewModel.getClass();
        i.e(gatewayControlUnit, "gatewayControlUnit");
        i.e(newStatuses, "newStatuses");
        onlineControlUnitListViewModel.f32093b0 = gatewayControlUnit;
        onlineControlUnitListViewModel.f32094c0 = newStatuses;
        C2680e.c(Z.a(onlineControlUnitListViewModel), onlineControlUnitListViewModel.f32112a, null, new OnlineControlUnitListViewModel$clickCodingDialogOk$1(onlineControlUnitListViewModel, gatewayControlUnit, newStatuses, null), 2);
    }
}
