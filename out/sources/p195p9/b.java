package p195p9;

import K8.o;
import android.view.animation.AnimationUtils;
import androidx.lifecycle.C;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.vehicle.VehicleBaseFragment;
import com.voltasit.obdeleven.presentation.vehicle.VehicleViewModel;
import p255u9.C2802e;
import p255u9.E;

/* JADX INFO: compiled from: VehicleConnectedFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends VehicleBaseFragment {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f45932t = "VehicleConnectedFragment";

    @Override // com.voltasit.obdeleven.presentation.vehicle.VehicleBaseFragment
    public final boolean Q() {
        return false;
    }

    @Override // com.voltasit.obdeleven.presentation.vehicle.VehicleBaseFragment
    public final void S() {
        C2802e c2802eC;
        O().f1649s.setVisibility(0);
        O().f1652v.getChildAt(O().f1652v.indexOfChild(O().f1649s) + 1).setVisibility(0);
        O().f1655y.n();
        O().f1655y.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.scale_in));
        VehicleViewModel vehicleViewModelP = P();
        o oVar = vehicleViewModelP.f33417s;
        if (oVar.H()) {
            boolean zS = oVar.s();
            vehicleViewModelP.f33379C.j(Boolean.valueOf(zS));
            if (zS) {
                E e10 = vehicleViewModelP.f33423y;
                if ((e10 != null ? e10.c() : null) != null) {
                    C<String> c10 = vehicleViewModelP.f33421w;
                    E e11 = vehicleViewModelP.f33423y;
                    c10.j((e11 == null || (c2802eC = e11.c()) == null) ? "" : c2802eC.a());
                }
            }
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return this.f45932t;
    }
}
