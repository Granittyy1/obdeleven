package com.voltasit.obdeleven.presentation.controlUnit.kwp.coding;

import D9.o;
import android.os.Bundle;
import androidx.lifecycle.D;
import com.obdeleven.service.enums.ApplicationProtocol;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.app.C2099n;
import com.voltasit.obdeleven.presentation.history.vehicle.VehicleHistoryFragment;
import com.voltasit.obdeleven.presentation.vehicle.VehicleBaseFragment;
import com.voltasit.obdeleven.ui.dialogs.C2137c;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import java.util.Locale;
import p255u9.E;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BaseFragment f31734c;

    public /* synthetic */ g(BaseFragment baseFragment, int i10) {
        this.f31733b = i10;
        this.f31734c = baseFragment;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xa.g] */
    @Override // androidx.lifecycle.D
    public final void d(Object obj) {
        switch (this.f31733b) {
            case 0:
                m mVar = (m) this.f31734c;
                ((J8.a) mVar.f31758z.getValue()).b0();
                String string = mVar.f31746n.getText().toString();
                String string2 = mVar.f31749q.getText().toString();
                mVar.f31748p.setError("");
                if (string2.length() != string.length()) {
                    mVar.f31748p.setError(String.format(Locale.US, mVar.getResources().getString(R.string.common_coding_length), Integer.valueOf(string.length())));
                } else if (mVar.f31751s.f29327i == ApplicationProtocol.f29262b && Integer.parseInt(string2) > 32767) {
                    mVar.f31748p.setError(mVar.getString(R.string.common_wrong_coding));
                } else if (!string2.equals(string)) {
                    o.m(mVar.f31749q);
                    mVar.V(string2);
                } else {
                    o.m(mVar.f31749q);
                    C2137c.b(mVar.getActivity(), R.string.common_coding_not_changed, R.string.common_write, R.string.common_cancel).continueWith(new C2099n(mVar, 2, string2), Task.UI_THREAD_EXECUTOR);
                }
                break;
            default:
                VehicleBaseFragment this$0 = (VehicleBaseFragment) this.f31734c;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                VehicleHistoryFragment vehicleHistoryFragment = new VehicleHistoryFragment();
                Bundle bundle = new Bundle();
                bundle.putParcelable("vehicle", (E) obj);
                vehicleHistoryFragment.setArguments(bundle);
                this$0.r().n(vehicleHistoryFragment, null);
                break;
        }
    }
}
