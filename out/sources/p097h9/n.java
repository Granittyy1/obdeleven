package p097h9;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.dialogs.C2137c;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import com.voltasit.obdeleven.utils.UserTrackingUtils;
import java.util.ArrayList;
import java.util.List;
import p010a9.a;
import p134k8.a2;
import p170n9.i;
import p220r9.B;
import p220r9.z;
import p255u9.E;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseFragment f36222b;

    public /* synthetic */ n(BaseFragment baseFragment, int i10) {
        this.f36221a = i10;
        this.f36222b = baseFragment;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem it) {
        BaseFragment baseFragment = this.f36222b;
        switch (this.f36221a) {
            case 0:
                r rVar = (r) baseFragment;
                C2137c.b(rVar.getContext(), R.string.view_manual_editor_confirm_delete, R.string.common_yes, R.string.common_no).continueWith(new a(4, rVar), Task.UI_THREAD_EXECUTOR);
                break;
            default:
                i this$0 = (i) baseFragment;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                kotlin.jvm.internal.i.e(it, "it");
                ArrayList arrayList = this$0.f45016s;
                if (!arrayList.isEmpty()) {
                    a2 a2Var = ((ControlUnit) arrayList.get(0)).f29321c;
                    kotlin.jvm.internal.i.d(a2Var, "getVehicle(...)");
                    String strH = B.h(this$0.getActivity(), a2Var, arrayList);
                    List<String> list = com.voltasit.obdeleven.a.f29638c;
                    Context contextRequireContext = this$0.requireContext();
                    kotlin.jvm.internal.i.d(contextRequireContext, "requireContext(...)");
                    String strG = com.voltasit.obdeleven.a.C0320a.a(contextRequireContext).g();
                    z zVar = new z(this$0.requireContext());
                    zVar.c(R.string.share_dtcs);
                    E e10 = a2Var.f42726c;
                    zVar.f46515h = e10.k();
                    zVar.f46513f = e10.d();
                    zVar.f46514g = e10.e();
                    zVar.b(strH);
                    zVar.f46510c = strG;
                    Intent intentA = zVar.a();
                    UserTrackingUtils.c(UserTrackingUtils.Key.f34243D, 1);
                    this$0.startActivity(intentA);
                } else {
                    this$0.f34087g.b("ControlUnitFaultsFragment", "Control unit is null when sharing log");
                }
                break;
        }
        return true;
    }
}
