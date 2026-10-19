package com.voltasit.obdeleven.ui.dialogs;

import B8.B1;
import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: SimpleInfoDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class K0 extends com.voltasit.obdeleven.presentation.dialogs.e {
    public abstract String B();

    public abstract String C();

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g
    public final Dialog r(Bundle bundle) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(requireContext());
        int i10 = B1.f1624u;
        B1 b10 = (B1) M0.e.a(layoutInflaterFrom, R.layout.view_simple_yes_no_dialog, null, false, null);
        kotlin.jvm.internal.i.d(b10, "inflate(...)");
        b10.t("");
        b10.f1625r.setText(B());
        AlertDialog.Builder view = new AlertDialog.Builder(new ContextThemeWrapper(requireContext(), R.style.SimpleYesNoDialogStyle)).setView(b10.f4488d);
        String string = getString(R.string.common_ok);
        kotlin.jvm.internal.i.d(string, "getString(...)");
        AlertDialog alertDialogCreate = view.setPositiveButton(string, new J0(0, this)).create();
        kotlin.jvm.internal.i.d(alertDialogCreate, "create(...)");
        return alertDialogCreate;
    }
}
