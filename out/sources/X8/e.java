package X8;

import android.os.Bundle;
import androidx.lifecycle.D;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.settings.SettingsFragment;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import java.util.List;
import p220r9.P;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BaseFragment f7383c;

    public /* synthetic */ e(BaseFragment baseFragment, int i10) {
        this.f7382b = i10;
        this.f7383c = baseFragment;
    }

    @Override // androidx.lifecycle.D
    public final void d(Object obj) {
        switch (this.f7382b) {
            case 0:
                s sVar = (s) this.f7383c;
                sVar.getClass();
                com.voltasit.obdeleven.presentation.dialogs.i iVar = new com.voltasit.obdeleven.presentation.dialogs.i();
                iVar.w(((Integer) obj).intValue());
                iVar.v(sVar.getChildFragmentManager(), "SfdRateLimitDialog");
                break;
            case 1:
                com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.h hVar = (com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.h) this.f7383c;
                hVar.f31926r.a((List) obj);
                hVar.f31922n.setVisibility(0);
                break;
            default:
                SettingsFragment this$0 = (SettingsFragment) this.f7383c;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                if (W7.c.f7066d != null) {
                    com.voltasit.obdeleven.ui.dialogs.r rVar = this$0.f33088u;
                    if (rVar == null || !rVar.isVisible()) {
                        Bundle bundleA = Z3.o.a("key_tag", R.string.device_change_pin, "ChangeDevicePasswordDialog", "key_title");
                        bundleA.putInt("key_positive_text", R.string.common_ok);
                        bundleA.putInt("key_negative_text", R.string.common_cancel);
                        com.voltasit.obdeleven.ui.dialogs.r rVar2 = new com.voltasit.obdeleven.ui.dialogs.r();
                        rVar2.setArguments(bundleA);
                        rVar2.f32261r = this$0.getFragmentManager();
                        rVar2.setTargetFragment(this$0, 0);
                        this$0.f33088u = rVar2;
                        rVar2.A();
                    }
                } else {
                    P.b(this$0.requireActivity(), R.string.view_settings_device_must_be_connected);
                }
                break;
        }
    }
}
