package com.voltasit.obdeleven.ui.dialogs;

import B8.B1;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.interfaces.DialogCallback;

/* JADX INFO: compiled from: SimpleYesNoDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class M0 extends com.voltasit.obdeleven.presentation.dialogs.e {
    public void B() {
        w(E(), DialogCallback.CallbackType.f31101b, new Bundle());
    }

    public void C() {
        w(E(), DialogCallback.CallbackType.f31102c, new Bundle());
    }

    public abstract String D();

    public abstract String E();

    public String F() {
        String string = getString(R.string.common_cancel);
        kotlin.jvm.internal.i.d(string, "getString(...)");
        return string;
    }

    public String G() {
        return "";
    }

    public String H() {
        String string = getString(R.string.common_ok);
        kotlin.jvm.internal.i.d(string, "getString(...)");
        return string;
    }

    public void I(B1 b10) {
        b10.t(G());
        b10.f1625r.setText(D());
    }

    public final void J(Fragment fragment) {
        kotlin.jvm.internal.i.e(fragment, "fragment");
        this.f32261r = fragment.getFragmentManager();
        setTargetFragment(fragment, 0);
        androidx.fragment.app.y fragmentManager = fragment.getFragmentManager();
        kotlin.jvm.internal.i.b(fragmentManager);
        v(fragmentManager, E());
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g
    public final Dialog r(Bundle bundle) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(requireContext());
        int i10 = B1.f1624u;
        B1 b10 = (B1) M0.e.a(layoutInflaterFrom, R.layout.view_simple_yes_no_dialog, null, false, null);
        kotlin.jvm.internal.i.d(b10, "inflate(...)");
        I(b10);
        AlertDialog alertDialogCreate = new AlertDialog.Builder(new ContextThemeWrapper(requireContext(), R.style.SimpleYesNoDialogStyle)).setView(b10.f4488d).setPositiveButton(H(), new DialogInterface.OnClickListener() { // from class: com.voltasit.obdeleven.ui.dialogs.L0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                M0 this$0 = this.f33820b;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                this$0.C();
            }
        }).setNegativeButton(F(), new com.voltasit.obdeleven.presentation.twofactorauth.backupCode.a(this, 2)).create();
        kotlin.jvm.internal.i.d(alertDialogCreate, "create(...)");
        return alertDialogCreate;
    }
}
