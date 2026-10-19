package X8;

import android.os.Bundle;
import androidx.lifecycle.D;
import com.google.android.gms.internal.measurement.Y;
import com.obdeleven.service.odx.Param;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.controlunitlist.offline.OfflineControlUnitListFragment;
import com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog;
import com.voltasit.obdeleven.presentation.settings.SettingsFragment;
import com.voltasit.obdeleven.ui.dialogs.M;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import p220r9.P;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BaseFragment f7385c;

    public /* synthetic */ f(BaseFragment baseFragment, int i10) {
        this.f7384b = i10;
        this.f7385c = baseFragment;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, xa.g] */
    @Override // androidx.lifecycle.D
    public final void d(Object obj) {
        switch (this.f7384b) {
            case 0:
                s sVar = (s) this.f7385c;
                if (sVar.f7416q != null) {
                    SfdWizardFullScreenDialog sfdWizardFullScreenDialog = new SfdWizardFullScreenDialog();
                    sfdWizardFullScreenDialog.F(sVar.f7416q.n());
                    sfdWizardFullScreenDialog.v(sVar.getChildFragmentManager(), "SfdWizardFullScreenDialog");
                }
                break;
            case 1:
                com.voltasit.obdeleven.presentation.controlUnit.basicsettings.i iVar = (com.voltasit.obdeleven.presentation.controlUnit.basicsettings.i) this.f7385c;
                ((J8.a) iVar.f31519H.getValue()).N();
                m8.g gVar = iVar.f31532z;
                Task taskContinueWithTask = gVar.f44619d.continueWithTask(new m8.c(gVar));
                gVar.f44619d = taskContinueWithTask;
                taskContinueWithTask.continueWith(new com.voltasit.obdeleven.presentation.controlUnit.basicsettings.e(0, iVar), Task.UI_THREAD_EXECUTOR);
                break;
            case 2:
                com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.h hVar = (com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.h) this.f7385c;
                hVar.getClass();
                Param param = new Param(new byte[0], Param.Type.f29469d);
                param.f29459g = String.valueOf(hVar.getText(R.string.common_not_available_offline));
                p135k9.a aVar = hVar.f31926r;
                aVar.f42884b.add(param);
                aVar.notifyDataSetChanged();
                hVar.f31922n.setVisibility(0);
                break;
            case 3:
                OfflineControlUnitListFragment this$0 = (OfflineControlUnitListFragment) this.f7385c;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                Y.k(this$0, R.string.common_check_network, "TryAgainDialog");
                break;
            default:
                SettingsFragment this$1 = (SettingsFragment) this.f7385c;
                kotlin.jvm.internal.i.e(this$1, "this$0");
                if (W7.c.f7066d != null) {
                    M m7 = this$1.f33079l;
                    if (m7 == null || !m7.isVisible()) {
                        Bundle bundleA = Z3.o.a("key_tag", R.string.view_settings_calibrate_voltage, "CalibrateDeviceVoltageDialog", "key_title");
                        bundleA.putInt("key_message", R.string.view_settings_to_calibrate_device_voltage);
                        bundleA.putInt("key_input_type", 8194);
                        bundleA.putBoolean("key_hint_above_text", false);
                        bundleA.putString("key_input_hint_str", "ex. 14.4");
                        bundleA.putInt("key_counter_max", 4);
                        bundleA.putInt("key_positive_text", R.string.common_ok);
                        bundleA.putInt("key_negative_text", R.string.common_cancel);
                        M m10 = new M();
                        m10.setArguments(bundleA);
                        m10.f32261r = this$1.getFragmentManager();
                        m10.setTargetFragment(this$1, 0);
                        this$1.f33079l = m10;
                        m10.A();
                    }
                } else {
                    P.b(this$1.requireActivity(), R.string.view_settings_device_must_be_connected);
                }
                break;
        }
    }
}
