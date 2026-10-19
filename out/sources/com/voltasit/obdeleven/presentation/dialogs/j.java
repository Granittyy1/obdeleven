package com.voltasit.obdeleven.presentation.dialogs;

import android.content.Context;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: SubscriptionNeededDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends F5.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context) {
        super(context, 0);
        kotlin.jvm.internal.i.e(context, "context");
        l(context.getResources().getString(R.string.dialog_licensed_title));
        c(context.getResources().getString(R.string.dialog_licensed_message));
        j(context.getResources().getString(R.string.common_ok), new com.voltasit.obdeleven.presentation.controlUnit.sfd.lock.b());
    }
}
