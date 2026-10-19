package com.voltasit.obdeleven.ui.dialogs;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.internal.MDButton;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class U implements DialogInterface.OnShowListener {
    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialog) {
        kotlin.jvm.internal.i.e(dialog, "dialog");
        MaterialDialog materialDialog = (MaterialDialog) dialog;
        final MDButton mDButtonC = materialDialog.c(DialogAction.f23184b);
        mDButtonC.setEnabled(false);
        View viewFindViewById = materialDialog.f34552b.findViewById(R.id.content);
        kotlin.jvm.internal.i.c(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(R.string.dialog_developer_by_signing_this_agreement_you);
        View viewFindViewById2 = materialDialog.f34552b.findViewById(R.id.checkbox);
        kotlin.jvm.internal.i.c(viewFindViewById2, "null cannot be cast to non-null type android.widget.CheckBox");
        CheckBox checkBox = (CheckBox) viewFindViewById2;
        checkBox.setText(R.string.dialog_developer_accept_agreement);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.voltasit.obdeleven.ui.dialogs.V
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                mDButtonC.setEnabled(z10);
            }
        });
    }
}
