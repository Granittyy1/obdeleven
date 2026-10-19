package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.presentation.controlUnit.ControlUnitFragment;
import com.voltasit.obdeleven.presentation.controlUnit.ControlUnitViewModel;
import com.voltasit.obdeleven.presentation.controlUnit.ProCuScreen;
import com.voltasit.obdeleven.presentation.signIn.TwoFactorLoginFragment;
import com.voltasit.obdeleven.ui.dialogs.I0;
import com.voltasit.obdeleven.ui.dialogs.user.ForceChangePasswordDialog;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Fragment f27074c;

    public /* synthetic */ p(Fragment fragment, int i10) {
        this.f27073b = i10;
        this.f27074c = fragment;
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, xa.g] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f27073b) {
            case 0:
                q qVar = (q) this.f27074c;
                qVar.f27092R.setEnabled(qVar.w().J());
                qVar.f27090P.toggle();
                qVar.f27079E = qVar.f27079E == 1 ? 0 : 1;
                qVar.A(qVar.f27090P);
                qVar.z();
                break;
            case 1:
                ((ControlUnitViewModel) ((ControlUnitFragment) this.f27074c).f31425B.getValue()).d(ProCuScreen.f31485h);
                break;
            case 2:
                com.voltasit.obdeleven.presentation.main.b bVar = (com.voltasit.obdeleven.presentation.main.b) this.f27074c;
                bVar.getClass();
                bVar.w("BatteryVoltageDialog", DialogCallback.CallbackType.f31102c, new Bundle());
                break;
            case 3:
                TwoFactorLoginFragment this$0 = (TwoFactorLoginFragment) this.f27074c;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                com.voltasit.obdeleven.presentation.signIn.l lVarO = this$0.o();
                lVarO.f33269v.j(lVarO.f33262o);
                break;
            case 4:
                I0 i10 = (I0) this.f27074c;
                i10.y();
                i10.w(i10.f33793s.isEmpty() ? "SimpleDialog" : i10.f33793s, DialogCallback.CallbackType.f31102c, new Bundle());
                break;
            default:
                ForceChangePasswordDialog this$1 = (ForceChangePasswordDialog) this.f27074c;
                kotlin.jvm.internal.i.e(this$1, "this$0");
                this$1.y();
                break;
        }
    }
}
