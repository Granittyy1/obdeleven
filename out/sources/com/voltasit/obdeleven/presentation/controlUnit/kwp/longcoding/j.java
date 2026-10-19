package com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding;

import androidx.lifecycle.D;
import com.google.android.gms.internal.measurement.Y;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.history.child.VehicleHistoryChildrenFragment;
import com.voltasit.obdeleven.presentation.settings.SettingsFragment;
import com.voltasit.obdeleven.ui.module.BaseFragment;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BaseFragment f31816c;

    public /* synthetic */ j(BaseFragment baseFragment, int i10) {
        this.f31815b = i10;
        this.f31816c = baseFragment;
    }

    @Override // androidx.lifecycle.D
    public final void d(Object obj) {
        switch (this.f31815b) {
            case 0:
                q qVar = (q) this.f31816c;
                qVar.getClass();
                com.voltasit.obdeleven.presentation.dialogs.i iVar = new com.voltasit.obdeleven.presentation.dialogs.i();
                iVar.w(((Integer) obj).intValue());
                iVar.v(qVar.getChildFragmentManager(), "SfdRateLimitDialog");
                break;
            case 1:
                VehicleHistoryChildrenFragment this$0 = (VehicleHistoryChildrenFragment) this.f31816c;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                Y.k(this$0, R.string.common_check_network, "TryAgainDialog");
                break;
            default:
                SettingsFragment this$1 = (SettingsFragment) this.f31816c;
                kotlin.jvm.internal.i.e(this$1, "this$0");
                this$1.q().A(false).continueWith(new com.voltasit.obdeleven.presentation.settings.b(0, this$1));
                break;
        }
    }
}
