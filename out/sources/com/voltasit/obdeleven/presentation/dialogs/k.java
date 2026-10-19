package com.voltasit.obdeleven.presentation.dialogs;

import android.content.Context;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: UltimateNeededDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends F5.b {
    public k(Context context) {
        super(context, 0);
        l(context.getResources().getString(R.string.dialog_licensed_title));
        c(context.getResources().getString(R.string.dialog_licensed_ultimate_message));
        j(context.getResources().getString(R.string.common_ok), new com.voltasit.obdeleven.presentation.controlUnit.sfd.lock.b());
    }
}
