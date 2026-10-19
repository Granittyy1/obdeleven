package com.voltasit.obdeleven.presentation.controlUnit;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.model.OBDIICu;
import com.parse.ParseException;
import com.voltasit.obdeleven.presentation.dialogs.backup.MultiBackupDialog;
import com.voltasit.obdeleven.presentation.signIn.TwoFactorLoginFragment;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import p220r9.J;
import p220r9.P;

/* JADX INFO: renamed from: com.voltasit.obdeleven.presentation.controlUnit.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC2131e implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Fragment f31537c;

    public /* synthetic */ ViewOnClickListenerC2131e(Fragment fragment, int i10) {
        this.f31536b = i10;
        this.f31537c = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f31536b) {
            case 0:
                ControlUnitFragment controlUnitFragment = (ControlUnitFragment) this.f31537c;
                try {
                    ControlUnit controlUnit = controlUnitFragment.f31429o;
                    kotlin.jvm.internal.i.b(controlUnit);
                    OBDIICu oBDIICuG = controlUnit.f29321c.g();
                    p170n9.f fVar = new p170n9.f();
                    fVar.f45004n = oBDIICuG;
                    controlUnitFragment.r().n(fVar, null);
                } catch (ParseException e10) {
                    O.e.m(e10);
                    MainActivity mainActivityQ = controlUnitFragment.q();
                    P.a(mainActivityQ, mainActivityQ.getString(J.h(e10.getCode())));
                    return;
                }
                break;
            case 1:
                MultiBackupDialog this$0 = (MultiBackupDialog) this.f31537c;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                this$0.y();
                break;
            default:
                TwoFactorLoginFragment this$1 = (TwoFactorLoginFragment) this.f31537c;
                kotlin.jvm.internal.i.e(this$1, "this$0");
                this$1.getParentFragmentManager().R();
                break;
        }
    }
}
