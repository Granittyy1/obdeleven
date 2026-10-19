package com.voltasit.obdeleven.presentation.controlUnit.kwp.livedata;

import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import androidx.lifecycle.D;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.dialogs.j;
import com.voltasit.obdeleven.presentation.garage.GarageFragment;
import com.voltasit.obdeleven.presentation.history.vehicle.VehicleHistoryFragment;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BaseFragment f31762c;

    public /* synthetic */ b(BaseFragment baseFragment, int i10) {
        this.f31761b = i10;
        this.f31762c = baseFragment;
    }

    @Override // androidx.lifecycle.D
    public final void d(Object obj) {
        switch (this.f31761b) {
            case 0:
                new j(((f) this.f31762c).requireContext()).show();
                break;
            case 1:
                GarageFragment this$0 = (GarageFragment) this.f31762c;
                i.e(this$0, "this$0");
                MenuItem menuItem = this$0.f32305r;
                if (menuItem != null) {
                    menuItem.collapseActionView();
                    View actionView = menuItem.getActionView();
                    i.c(actionView, "null cannot be cast to non-null type androidx.appcompat.widget.SearchView");
                    SearchView searchView = (SearchView) actionView;
                    searchView.t("");
                    searchView.e();
                    searchView.setImeOptions(301989891);
                    searchView.setIconifiedByDefault(true);
                    searchView.setQueryHint(this$0.getString(R.string.common_search));
                }
                break;
            default:
                String str = (String) obj;
                VehicleHistoryFragment this$1 = (VehicleHistoryFragment) this.f31762c;
                i.e(this$1, "this$0");
                i.b(str);
                this$1.T(str, true);
                break;
        }
    }
}
