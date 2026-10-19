package p195p9;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.appList.AppListFragment;

/* JADX INFO: compiled from: VehicleBaseAppListFragment.java */
/* JADX INFO: loaded from: classes3.dex */
public class a extends AppListFragment {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f45931A;

    @Override // com.voltasit.obdeleven.presentation.appList.AppListFragment, com.voltasit.obdeleven.ui.module.BaseFragment
    public final View B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewB = super.B(layoutInflater, viewGroup, bundle);
        this.f31230o.t(this.f45931A);
        return viewB;
    }

    @Override // com.voltasit.obdeleven.presentation.appList.AppListFragment
    public final boolean S() {
        if (this.f31234s != null) {
            return false;
        }
        E(R.string.common_something_went_wrong);
        r().h();
        return true;
    }
}
