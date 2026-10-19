package com.voltasit.obdeleven.presentation.controlUnit.kwp.coding;

import X8.r;
import android.os.Bundle;
import androidx.lifecycle.D;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.q;
import com.voltasit.obdeleven.presentation.controlunitlist.offline.OfflineControlUnitListFragment;
import com.voltasit.obdeleven.presentation.controlunitlist.online.OnlineControlUnitListFragment;
import com.voltasit.obdeleven.presentation.garage.GarageFragment;
import com.voltasit.obdeleven.presentation.history.vehicle.VehicleHistoryFragment;
import com.voltasit.obdeleven.presentation.vehicle.VehicleBaseFragment;
import com.voltasit.obdeleven.presentation.vehicleInfo.VehicleInfoFragment;
import com.voltasit.obdeleven.ui.dialogs.B;
import com.voltasit.obdeleven.ui.dialogs.C2137c;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import java.util.List;
import p255u9.E;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l implements D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BaseFragment f31744c;

    public /* synthetic */ l(BaseFragment baseFragment, int i10) {
        this.f31743b = i10;
        this.f31744c = baseFragment;
    }

    @Override // androidx.lifecycle.D
    public final void d(Object obj) {
        BaseFragment<?> offlineControlUnitListFragment;
        switch (this.f31743b) {
            case 0:
                m mVar = (m) this.f31744c;
                if (((p121j8.c) mVar.f31753u.f10041c) != null) {
                    new B(mVar.q(), (p121j8.c) mVar.f31753u.f10041c, 0).b().continueWith(new p009a8.c(5, mVar), Task.UI_THREAD_EXECUTOR);
                    return;
                }
                return;
            case 1:
                q qVar = (q) this.f31744c;
                if (qVar.f31856y.a()) {
                    qVar.Y();
                    return;
                } else {
                    C2137c.b(qVar.getActivity(), R.string.common_coding_not_changed, R.string.common_write, R.string.common_cancel).continueWith(new r(3, qVar), Task.UI_THREAD_EXECUTOR);
                    return;
                }
            case 2:
                List list = (List) obj;
                GarageFragment this$0 = (GarageFragment) this.f31744c;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                com.voltasit.obdeleven.presentation.garage.a aVar = this$0.f32303p;
                if (aVar == null) {
                    kotlin.jvm.internal.i.m("garageAdapter");
                    throw null;
                }
                aVar.f19484a.b(list, new com.voltasit.obdeleven.presentation.garage.j(0, this$0));
                if (list.isEmpty()) {
                    com.voltasit.obdeleven.presentation.garage.q qVar2 = this$0.f32300m;
                    if (qVar2 == null) {
                        kotlin.jvm.internal.i.m("loadMoreListener");
                        throw null;
                    }
                    qVar2.f32387c = 0;
                    qVar2.f32388d = 0;
                    qVar2.f32389e = true;
                    return;
                }
                return;
            case 3:
                VehicleHistoryFragment this$1 = (VehicleHistoryFragment) this.f31744c;
                kotlin.jvm.internal.i.e(this$1, "this$0");
                this$1.w();
                return;
            default:
                E e10 = (E) obj;
                VehicleBaseFragment this$2 = (VehicleBaseFragment) this.f31744c;
                kotlin.jvm.internal.i.e(this$2, "this$0");
                if (this$2.q().E()) {
                    VehicleInfoFragment vehicleInfoFragment = new VehicleInfoFragment();
                    vehicleInfoFragment.f33470M = e10;
                    vehicleInfoFragment.f33469L = e10 != null ? e10.getObjectId() : null;
                    this$2.r().n(vehicleInfoFragment, null);
                }
                if (W7.c.e()) {
                    offlineControlUnitListFragment = new OnlineControlUnitListFragment();
                    String objectId = e10.getObjectId();
                    kotlin.jvm.internal.i.d(objectId, "getObjectId(...)");
                    Bundle bundle = new Bundle();
                    bundle.putString("vehicleId", objectId);
                    offlineControlUnitListFragment.setArguments(bundle);
                } else {
                    offlineControlUnitListFragment = new OfflineControlUnitListFragment();
                    String objectId2 = e10.getObjectId();
                    kotlin.jvm.internal.i.d(objectId2, "getObjectId(...)");
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("vehicleId", objectId2);
                    offlineControlUnitListFragment.setArguments(bundle2);
                }
                this$2.r().n(offlineControlUnitListFragment, null);
                return;
        }
    }
}
