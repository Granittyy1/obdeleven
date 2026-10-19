package p195p9;

import B8.D0;
import com.voltasit.obdeleven.presentation.vehicle.VehicleBaseFragment;

/* JADX INFO: compiled from: VehicleFromSupportedFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends VehicleBaseFragment {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f45934t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f45935u = "VehicleFromSupportedFragment";

    @Override // com.voltasit.obdeleven.presentation.vehicle.VehicleBaseFragment
    public final boolean Q() {
        return this.f45934t;
    }

    @Override // com.voltasit.obdeleven.presentation.vehicle.VehicleBaseFragment
    public final void S() {
        O().f1643D.setVisibility(8);
        D0 d0O = O();
        D0 d0O2 = O();
        d0O.f1652v.getChildAt(d0O2.f1652v.indexOfChild(O().f1643D) + 1).setVisibility(8);
        O().f1641B.setVisibility(8);
        D0 d0O3 = O();
        D0 d0O4 = O();
        d0O3.f1652v.getChildAt(d0O4.f1652v.indexOfChild(O().f1641B) + 1).setVisibility(8);
        O().f1651u.setVisibility(8);
        D0 d0O5 = O();
        D0 d0O6 = O();
        d0O5.f1652v.getChildAt(d0O6.f1652v.indexOfChild(O().f1651u) + 1).setVisibility(8);
        O().f1653w.setVisibility(8);
        D0 d0O7 = O();
        D0 d0O8 = O();
        d0O7.f1652v.getChildAt(d0O8.f1652v.indexOfChild(O().f1653w) + 1).setVisibility(8);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return this.f45935u;
    }
}
