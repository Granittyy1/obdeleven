package com.voltasit.obdeleven.ui.dialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import com.voltasit.obdeleven.R;

/* JADX INFO: renamed from: com.voltasit.obdeleven.ui.dialogs.t0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: PermissionDialog.java */
/* JADX INFO: loaded from: classes3.dex */
public class C2171t0 extends com.voltasit.obdeleven.presentation.dialogs.e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Bundle f34025s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f34026t;

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f34026t == null) {
            return;
        }
        bundle.putString("key_description", this.f34025s.getString("key_description"));
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g
    public final Dialog r(Bundle bundle) {
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f34025s = bundle;
        if (bundle == null) {
            return new AlertDialog.Builder(getActivity()).create();
        }
        if (bundle.containsKey("key_description")) {
            this.f34026t = this.f34025s.getString("key_description");
        }
        return new AlertDialog.Builder(getActivity()).setTitle(R.string.dialog_permission_permission_required).setMessage(this.f34026t).setNegativeButton(R.string.common_cancel, new com.voltasit.obdeleven.presentation.dialogs.sfd.c(this, 1)).setPositiveButton(R.string.common_settings, new com.voltasit.obdeleven.presentation.controlUnit.eeprom.b(this, 1)).create();
    }
}
