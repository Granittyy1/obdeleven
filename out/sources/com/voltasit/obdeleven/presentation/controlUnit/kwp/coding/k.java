package com.voltasit.obdeleven.presentation.controlUnit.kwp.coding;

import androidx.lifecycle.D;
import com.voltasit.obdeleven.models.HistoryTypeFilter;
import com.voltasit.obdeleven.presentation.garage.GarageFragment;
import com.voltasit.obdeleven.presentation.garage.s;
import com.voltasit.obdeleven.presentation.history.vehicle.VehicleHistoryFragment;
import com.voltasit.obdeleven.presentation.vehicle.VehicleBaseFragment;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import com.voltasit.parse.model.HistoryDB;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.q;
import p255u9.E;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BaseFragment f31742c;

    public /* synthetic */ k(BaseFragment baseFragment, int i10) {
        this.f31741b = i10;
        this.f31742c = baseFragment;
    }

    @Override // androidx.lifecycle.D
    public final void d(Object obj) {
        switch (this.f31741b) {
            case 0:
                new com.voltasit.obdeleven.presentation.dialogs.j(((m) this.f31742c).requireContext()).show();
                return;
            case 1:
                Boolean bool = (Boolean) obj;
                GarageFragment this$0 = (GarageFragment) this.f31742c;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                s sVar = this$0.f32301n;
                if (sVar == null) {
                    kotlin.jvm.internal.i.m("preloaderAdapter");
                    throw null;
                }
                kotlin.jvm.internal.i.b(bool);
                sVar.a(bool.booleanValue());
                return;
            case 2:
                List list = (List) obj;
                VehicleHistoryFragment this$1 = (VehicleHistoryFragment) this.f31742c;
                kotlin.jvm.internal.i.e(this$1, "this$0");
                kotlin.jvm.internal.i.b(list);
                ArrayList arrayListP0 = q.p0(list);
                Iterator it = arrayListP0.iterator();
                while (it.hasNext()) {
                    HistoryDB historyDB = (HistoryDB) it.next();
                    historyDB.setVehicle(this$1.f32476m);
                    if ((historyDB.c() != null && historyDB.c().getControlUnitBase() == null) || VehicleHistoryFragment.Q(historyDB) || (HistoryTypeFilter.b(historyDB.getString("type")) == HistoryTypeFilter.f31138i && !historyDB.d().optBoolean(MetricTracker.Action.COMPLETED))) {
                        String objectId = historyDB.getObjectId();
                        O.e.D("VehicleHistoryFragment", "History item remove because controlUnitBase or texttable is null or full scan is incompleted");
                        O.e.D("VehicleHistoryFragment", "History item remove because controlUnitBase or texttable is null or full scan is incompleted item: " + objectId);
                        it.remove();
                    }
                }
                this$1.S(arrayListP0);
                return;
            default:
                E e10 = (E) obj;
                VehicleBaseFragment this$2 = (VehicleBaseFragment) this.f31742c;
                kotlin.jvm.internal.i.e(this$2, "this$0");
                p073f9.g gVar = new p073f9.g();
                gVar.f35047s = e10;
                gVar.f35046r = e10.getObjectId();
                this$2.r().n(gVar, null);
                return;
        }
    }
}
