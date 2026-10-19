package com.voltasit.obdeleven.presentation.controlUnit.kwp.coding;

import androidx.lifecycle.D;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.appList.AppListFragment;
import com.voltasit.obdeleven.presentation.vehicle.VehicleBaseFragment;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import p255u9.E;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BaseFragment f31736c;

    public /* synthetic */ h(BaseFragment baseFragment, int i10) {
        this.f31735b = i10;
        this.f31736c = baseFragment;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, xa.g] */
    @Override // androidx.lifecycle.D
    public final void d(Object obj) {
        switch (this.f31735b) {
            case 0:
                a aVar = (a) ((m) this.f31736c).f31757y.getValue();
                aVar.f32119h.j(Integer.valueOf(R.string.common_press_and_hold));
                break;
            default:
                E e10 = (E) obj;
                VehicleBaseFragment this$0 = (VehicleBaseFragment) this.f31736c;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                AppListFragment appListFragment = new AppListFragment();
                kotlin.jvm.internal.i.b(e10);
                boolean zQ = this$0.Q();
                appListFragment.f31234s = e10;
                appListFragment.f31235t = zQ;
                this$0.r().n(appListFragment, null);
                break;
        }
    }
}
