package com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding;

import androidx.lifecycle.D;
import com.voltasit.obdeleven.presentation.dialogs.sfd.SfdAutoUnlockDialog;
import com.voltasit.obdeleven.presentation.history.child.VehicleHistoryChildrenFragment;
import com.voltasit.obdeleven.presentation.settings.SettingsFragment;
import com.voltasit.obdeleven.ui.module.BaseFragment;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BaseFragment f31818c;

    public /* synthetic */ k(BaseFragment baseFragment, int i10) {
        this.f31817b = i10;
        this.f31818c = baseFragment;
    }

    @Override // androidx.lifecycle.D
    public final void d(Object obj) {
        switch (this.f31817b) {
            case 0:
                q qVar = (q) this.f31818c;
                qVar.getClass();
                new SfdAutoUnlockDialog().v(qVar.getChildFragmentManager(), "SfdAutoUnlockDialog");
                break;
            case 1:
                VehicleHistoryChildrenFragment this$0 = (VehicleHistoryChildrenFragment) this.f31818c;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                this$0.F((String) obj);
                break;
            default:
                SettingsFragment this$1 = (SettingsFragment) this.f31818c;
                kotlin.jvm.internal.i.e(this$1, "this$0");
                this$1.q().recreate();
                break;
        }
    }
}
